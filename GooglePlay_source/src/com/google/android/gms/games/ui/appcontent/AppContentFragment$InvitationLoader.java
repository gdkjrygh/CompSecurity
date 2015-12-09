// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.ui.appcontent;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.games.Games;
import com.google.android.gms.games.internal.GamesLog;
import com.google.android.gms.games.multiplayer.Invitation;
import com.google.android.gms.games.multiplayer.InvitationBuffer;
import com.google.android.gms.games.multiplayer.Invitations;
import java.util.HashMap;

// Referenced classes of package com.google.android.gms.games.ui.appcontent:
//            AppContentFragment

private static final class onLoad extends onLoad
{

    private static final HashMap sInvitationMap = new HashMap();
    private final allback mCallback;
    private final String mInvitationId;

    protected final PendingResult onLoad(GoogleApiClient googleapiclient)
    {
        if (sInvitationMap.containsKey(mInvitationId))
        {
            mCallback.onInvitationLoaded((Invitation)sInvitationMap.get(mInvitationId));
            finish();
        } else
        if (googleapiclient != null)
        {
            return Games.Invitations.loadInvitationFirstParty(googleapiclient, mInvitationId);
        }
        return null;
    }

    public final volatile void onResult(Result result)
    {
        result = (com.google.android.gms.games.multiplayer.r)result;
        if (mFragment.canUseResult(result) && result.tInvitations().getCount() > 0)
        {
            Invitation invitation = (Invitation)((Invitation)result.tInvitations().get(0)).freeze();
            sInvitationMap.put(mInvitationId, invitation);
            mCallback.onInvitationLoaded(invitation);
        } else
        {
            GamesLog.e("AppContentFrag", (new StringBuilder("Failed to load invitation: ")).append(mInvitationId).toString());
        }
        result.lease();
        finish();
    }


    public allback(AppContentFragment appcontentfragment, String s, allback allback)
    {
        super(appcontentfragment);
        mInvitationId = s;
        mCallback = allback;
        onLoad(null);
    }
}
