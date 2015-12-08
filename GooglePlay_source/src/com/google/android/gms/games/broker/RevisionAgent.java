// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.broker;

import android.content.Context;
import android.content.SharedPreferences;
import com.android.common.SharedPreferencesCompat;
import com.android.volley.VolleyError;
import com.google.android.gms.auth.GoogleAuthException;
import com.google.android.gms.common.config.GservicesValue;
import com.google.android.gms.common.internal.Asserts;
import com.google.android.gms.common.internal.ClientContext;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.server.BaseApiaryServer;
import com.google.android.gms.common.server.response.FastMapJsonResponse;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.DefaultClock;
import com.google.android.gms.games.GamesSharedPrefs;
import com.google.android.gms.games.config.G;
import com.google.android.gms.games.internal.GamesLog;
import com.google.android.gms.games.server.api.FirstPartyRevisionCheckResponse;
import com.google.android.gms.games.server.api.RevisionsApiInternal;
import com.google.android.gms.games.server.error.GamesException;
import java.util.HashMap;

// Referenced classes of package com.google.android.gms.games.broker:
//            Lockable, Agents

final class RevisionAgent extends Lockable
{

    private static final Lockable.LockableLock LOCK = new Lockable.LockableLock();
    private final RevisionsApiInternal mRevisionsApiInternal;

    public RevisionAgent(Lockable lockable, BaseApiaryServer baseapiaryserver)
    {
        super("RevisionAgent", LOCK, lockable);
        mRevisionsApiInternal = new RevisionsApiInternal(baseapiaryserver);
    }

    private FirstPartyRevisionCheckResponse checkRevisionHelper(ClientContext clientcontext)
        throws GoogleAuthException
    {
        try
        {
            RevisionsApiInternal revisionsapiinternal = mRevisionsApiInternal;
            String s = Agents.getCurrentRevision();
            StringBuilder stringbuilder = new StringBuilder("revisions/check");
            RevisionsApiInternal.append(stringbuilder, "clientRevision", RevisionsApiInternal.enc(s));
            s = stringbuilder.toString();
            clientcontext = (FirstPartyRevisionCheckResponse)revisionsapiinternal.mServer.getResponseBlocking(clientcontext, 0, s, null, com/google/android/gms/games/server/api/FirstPartyRevisionCheckResponse);
        }
        // Misplaced declaration of an exception variable
        catch (ClientContext clientcontext)
        {
            return null;
        }
        return clientcontext;
    }

    public static void clearRevisionCheck(Context context)
    {
        context = GamesSharedPrefs.getSharedPrefs(context).edit();
        context.remove("lastPassedRevisionCheckMs");
        context.remove("serverApiVersion3p");
        context.remove("serverApiVersion1p");
        SharedPreferencesCompat.apply(context);
    }

    public final boolean checkRevision(Context context, ClientContext clientcontext)
        throws GoogleAuthException
    {
        SharedPreferences sharedpreferences;
        long l;
        long l1;
        Asserts.checkState(clientcontext.isCurrentContext(), "Must use 1P context for revision check");
        sharedpreferences = GamesSharedPrefs.getSharedPrefs(context);
        l = sharedpreferences.getLong("lastPassedRevisionCheckMs", -1L);
        l1 = DefaultClock.getInstance().currentTimeMillis();
        if (l == -1L || l1 - l > ((Long)G.revisionCheckIntervalMs.get()).longValue()) goto _L2; else goto _L1
_L1:
        boolean flag1 = true;
_L6:
        return flag1;
_L2:
        FirstPartyRevisionCheckResponse firstpartyrevisioncheckresponse = checkRevisionHelper(clientcontext);
        context = firstpartyrevisioncheckresponse;
_L4:
        if (context == null)
        {
            return true;
        }
        break; /* Loop/switch isn't completed */
        GamesException gamesexception;
        gamesexception;
        if (gamesexception.mInternalStatusCode != 1003)
        {
            throw gamesexception;
        }
        GamesLog.w("RevisionAgent", "Cannot use restricted APIs, resetting");
        clearRevisionCheck(context);
        context = checkRevisionHelper(clientcontext);
        if (true) goto _L4; else goto _L3
_L3:
        String s = (String)((FastMapJsonResponse) (context)).mValues.get("revisionStatus");
        clientcontext = (String)((FastMapJsonResponse) (context)).mValues.get("apiVersion");
        context = (String)((FastMapJsonResponse) (context)).mValues.get("firstPartyApiVersion");
        boolean flag;
        if (!Objects.equal(s, "INVALID"))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        flag1 = flag;
        if (flag)
        {
            android.content.SharedPreferences.Editor editor = sharedpreferences.edit();
            editor.putLong("lastPassedRevisionCheckMs", l1);
            editor.putString("serverApiVersion3p", clientcontext);
            editor.putString("serverApiVersion1p", context);
            SharedPreferencesCompat.apply(editor);
            return flag;
        }
        if (true) goto _L6; else goto _L5
_L5:
    }

}
