// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.broker;

import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import com.android.volley.VolleyError;
import com.google.android.gms.auth.GoogleAuthException;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.internal.ClientContext;
import com.google.android.gms.common.people.data.AudienceMember;
import com.google.android.gms.common.people.data.AudienceMemberConversions;
import com.google.android.gms.common.server.BaseApiaryServer;
import com.google.android.gms.common.server.error.ErrorUtils;
import com.google.android.gms.common.server.response.FastContentValuesJsonResponse;
import com.google.android.gms.common.util.Base64Utils;
import com.google.android.gms.games.internal.GamesLog;
import com.google.android.gms.games.server.api.Acl;
import com.google.android.gms.games.server.api.AclUpdateRequest;
import com.google.android.gms.games.server.api.AclsApiInternal;
import com.google.protobuf.micro.InvalidProtocolBufferMicroException;
import com.google.protobuf.micro.MessageMicro;
import java.util.Formatter;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.google.android.gms.games.broker:
//            Lockable, Agents

public final class AclAgent extends Lockable
{

    private static final Lockable.LockableLock LOCK = new Lockable.LockableLock();
    private final AclsApiInternal mAclsApi;

    public AclAgent(Lockable lockable, BaseApiaryServer baseapiaryserver)
    {
        super("AclAgent", LOCK, lockable);
        mAclsApi = new AclsApiInternal(baseapiaryserver);
    }

    private static boolean hasPublicSystemGroup(List list)
    {
        for (list = list.iterator(); list.hasNext();)
        {
            if (((AudienceMember)list.next()).isPublicSystemGroup())
            {
                return true;
            }
        }

        return false;
    }

    private static boolean isGameplayAclPublic(String s)
        throws InvalidProtocolBufferMicroException
    {
        s = Base64Utils.decodeUrlSafe(s);
        s = (com.google.android.gms.common.people.proto.AclProto.SharingRoster)(new com.google.android.gms.common.people.proto.AclProto.SharingRoster()).mergeFrom$e0bd1db(s, s.length);
        for (int i = 0; i < s.getSharingTargetIdCount(); i++)
        {
            com.google.android.gms.common.people.proto.AclProto.SharingTargetId sharingtargetid = s.getSharingTargetId(i);
            if (sharingtargetid.hasGroupType && sharingtargetid.groupType_ == 1)
            {
                return true;
            }
        }

        return false;
    }

    public static void markGameplayAclUnset(Context context, ClientContext clientcontext, String s)
    {
        updateGameplayAclStatus(context, clientcontext, s, 0);
    }

    private static void updateGameplayAclStatus(Context context, ClientContext clientcontext, String s, int i)
    {
        long l = Agents.forceResolveExternalGameId(context, clientcontext, s);
        if (l == -1L)
        {
            GamesLog.e("AclAgent", "Error resolving external game Id.");
            return;
        } else
        {
            clientcontext = com.google.android.gms.games.provider.GamesContractInternal.Games.getUriForId(com.google.android.gms.games.provider.GamesContractInternal.Games.getContentUri(clientcontext), l);
            s = new ContentValues();
            s.put("gameplay_acl_status", Integer.valueOf(i));
            context.getContentResolver().update(clientcontext, s, null, null);
            return;
        }
    }

    public final DataHolder fetchGameplayAcl(Context context, ClientContext clientcontext, String s)
        throws GoogleAuthException
    {
        byte byte0;
        Object obj;
        String s1;
        StringBuilder stringbuilder;
        try
        {
            obj = mAclsApi;
            s1 = Agents.getLocaleString(context);
            stringbuilder = new StringBuilder();
            (new Formatter(stringbuilder)).format("applications/%1$s/acls/gameplay", new Object[] {
                AclsApiInternal.enc(s)
            });
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            GamesLog.w("AclAgent", "Failed to retrieve Gameplay ACL from the network");
            if (GamesLog.canLog$134632())
            {
                ErrorUtils.parseAndLogErrorResponse(context, "AclAgent");
            }
            return DataHolder.empty(4);
        }
        if (s1 == null)
        {
            break MISSING_BLOCK_LABEL_64;
        }
        AclsApiInternal.append(stringbuilder, "language", AclsApiInternal.enc(s1));
        s1 = stringbuilder.toString();
        obj = (Acl)((AclsApiInternal) (obj)).mServer.getResponseBlocking(clientcontext, 0, s1, null, com/google/android/gms/games/server/api/Acl);
        if (hasPublicSystemGroup(AudienceMemberConversions.toAudienceMembersFromRenderedSharingRosters(Base64Utils.decodeUrlSafe(((FastContentValuesJsonResponse) (obj)).mValues.getAsString("pacl")))))
        {
            byte0 = 3;
        } else
        {
            byte0 = 2;
        }
        GamesLog.d("AclAgent", (new StringBuilder("Setting gameplay ACL status to ")).append(byte0).toString());
        updateGameplayAclStatus(context, clientcontext, s, byte0);
_L1:
        return DataHolder.builder(com.google.android.gms.games.provider.GamesContractInternal.Acls.ALL_COLUMNS).withRow(((FastContentValuesJsonResponse) (obj)).mValues).build(0);
        context;
        GamesLog.e("AclAgent", "Error parsing Gameplay ACL RenderedSharingRoster protobuf.");
          goto _L1
    }

    public final DataHolder fetchNotifyAcl(Context context, ClientContext clientcontext)
        throws GoogleAuthException
    {
        AclsApiInternal aclsapiinternal;
        StringBuilder stringbuilder;
        try
        {
            aclsapiinternal = mAclsApi;
            context = Agents.getLocaleString(context);
            stringbuilder = new StringBuilder("players/me/acls/notify");
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            GamesLog.w("AclAgent", "Failed to retrieve Notify ACL from the network");
            if (GamesLog.canLog$134632())
            {
                ErrorUtils.parseAndLogErrorResponse(context, "AclAgent");
            }
            return DataHolder.empty(4);
        }
        if (context == null)
        {
            break MISSING_BLOCK_LABEL_37;
        }
        AclsApiInternal.append(stringbuilder, "language", AclsApiInternal.enc(context));
        context = stringbuilder.toString();
        context = (Acl)aclsapiinternal.mServer.getResponseBlocking(clientcontext, 0, context, null, com/google/android/gms/games/server/api/Acl);
        return DataHolder.builder(com.google.android.gms.games.provider.GamesContractInternal.Acls.ALL_COLUMNS).withRow(((FastContentValuesJsonResponse) (context)).mValues).build(0);
    }

    public final int updateGameplayAcl(Context context, ClientContext clientcontext, String s, String s1)
        throws GoogleAuthException
    {
        byte byte0 = 2;
        AclsApiInternal aclsapiinternal = mAclsApi;
        AclUpdateRequest aclupdaterequest = new AclUpdateRequest(s);
        Object obj = new StringBuilder();
        (new Formatter(((Appendable) (obj)))).format("applications/%1$s/acls/gameplay", new Object[] {
            AclsApiInternal.enc(s1)
        });
        obj = ((StringBuilder) (obj)).toString();
        aclsapiinternal.mServer.performNoResponseRequestBlocking(clientcontext, 2, ((String) (obj)), aclupdaterequest);
        if (isGameplayAclPublic(s))
        {
            byte0 = 3;
        }
        updateGameplayAclStatus(context, clientcontext, s1, byte0);
        return 0;
        context;
        try
        {
            GamesLog.e("AclAgent", "Error parsing Gameplay ACL SharingRoster protobuf.");
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            GamesLog.w("AclAgent", "Failed to send Gameplay ACL data over the network");
            if (GamesLog.canLog$134632())
            {
                ErrorUtils.parseAndLogErrorResponse(context, "AclAgent");
            }
            return 6;
        }
        return 0;
    }

    public final int updateNotifyAcl(ClientContext clientcontext, String s)
        throws GoogleAuthException
    {
        try
        {
            AclsApiInternal aclsapiinternal = mAclsApi;
            s = new AclUpdateRequest(s);
            aclsapiinternal.mServer.performNoResponseRequestBlocking(clientcontext, 2, "players/me/acls/notify", s);
        }
        // Misplaced declaration of an exception variable
        catch (ClientContext clientcontext)
        {
            GamesLog.w("AclAgent", "Failed to send Notify ACL data over the network");
            if (GamesLog.canLog$134632())
            {
                ErrorUtils.parseAndLogErrorResponse(clientcontext, "AclAgent");
            }
            return 6;
        }
        return 0;
    }

}
