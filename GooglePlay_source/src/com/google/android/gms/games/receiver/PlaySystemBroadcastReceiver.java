// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.receiver;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.SystemClock;
import com.google.android.chimera.BroadcastReceiver;
import com.google.android.gms.common.config.GservicesValue;
import com.google.android.gms.common.server.UserAgent;
import com.google.android.gms.common.util.VersionUtils;
import com.google.android.gms.games.GamesSharedPrefs;
import com.google.android.gms.games.config.G;
import com.google.android.gms.games.internal.GamesLog;
import com.google.android.gms.games.service.GamesSyncAdapter;
import com.google.android.gms.games.service.PlayGamesAsyncService;

public final class PlaySystemBroadcastReceiver extends BroadcastReceiver
{

    private static final Object PEOPLE_CHANGED_LOCK = new Object();
    private static long sLastHandledPeopleChange = 0L;

    public PlaySystemBroadcastReceiver()
    {
    }

    public final void onReceive(Context context, Intent intent)
    {
        Object obj = intent.getAction();
        if (!"android.intent.action.LOCALE_CHANGED".equals(obj)) goto _L2; else goto _L1
_L1:
        PlayGamesAsyncService.clearData(context, false);
        UserAgent.clear();
_L4:
        return;
_L2:
        long l;
        if ("android.accounts.LOGIN_ACCOUNTS_CHANGED".equals(obj))
        {
            PlayGamesAsyncService.handleAccountsChanged(context);
            return;
        }
        if ("android.provider.Telephony.SECRET_CODE".equals(obj))
        {
            GamesSyncAdapter.requestTickleSync$faab20d();
            return;
        }
        if (!"com.google.android.gms.people.BROADCAST_CIRCLES_CHANGED".equals(obj))
        {
            break MISSING_BLOCK_LABEL_156;
        }
        l = SystemClock.elapsedRealtime();
        synchronized (PEOPLE_CHANGED_LOCK)
        {
            if (l - sLastHandledPeopleChange > ((Long)G.peopleChangedBroadcastThresholdMillis.get()).longValue())
            {
                break MISSING_BLOCK_LABEL_122;
            }
            GamesLog.w("PlaySystemBroadcastReceiver", (new StringBuilder("Squelched handlePeopleChanged at ")).append(l).toString());
        }
        return;
        context;
        intent;
        JVM INSTR monitorexit ;
        throw context;
        GamesLog.w("PlaySystemBroadcastReceiver", (new StringBuilder("Processed handlePeopleChanged at ")).append(l).toString());
        sLastHandledPeopleChange = l;
        intent;
        JVM INSTR monitorexit ;
        PlayGamesAsyncService.handlePeopleChanged(context);
        return;
        if (!"android.intent.action.PACKAGE_ADDED".equals(obj))
        {
            break; /* Loop/switch isn't completed */
        }
        intent = intent.getData();
        if (intent != null)
        {
            PlayGamesAsyncService.handlePackageInstalled(context, intent.getSchemeSpecificPart());
            return;
        }
        if (true) goto _L4; else goto _L3
_L3:
        if (!"android.intent.action.PACKAGE_REMOVED".equals(obj))
        {
            continue; /* Loop/switch isn't completed */
        }
        obj = intent.getData();
        boolean flag = intent.getBooleanExtra("android.intent.extra.REPLACING", false);
        if (obj != null && !flag)
        {
            PlayGamesAsyncService.handlePackageUninstalled(context, ((Uri) (obj)).getSchemeSpecificPart());
            return;
        }
        continue; /* Loop/switch isn't completed */
        if (!"com.google.android.gms.GMS_UPDATED".equals(obj)) goto _L4; else goto _L5
_L5:
        int i = VersionUtils.getVersionCode();
        if (i > GamesSharedPrefs.getPersistedVersionCode(context))
        {
            GamesSharedPrefs.persistVersionCode(context, i);
            PlayGamesAsyncService.initializeGames(context);
            return;
        }
        if (true) goto _L4; else goto _L6
_L6:
    }

}
