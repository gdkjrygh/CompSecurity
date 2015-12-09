// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.receiver;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.chimera.BroadcastReceiver;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.AndroidUtils;
import com.google.android.gms.games.Game;
import com.google.android.gms.games.internal.GamesLog;
import com.google.android.gms.games.service.PlayGamesAsyncService;
import com.google.android.gms.games.ui.util.GameLauncher;

public final class PlayInternalIntentReceiver extends BroadcastReceiver
{

    public PlayInternalIntentReceiver()
    {
    }

    private static void clearNotifications(Context context, Intent intent, String s)
    {
        intent = intent.getStringExtra("com.google.android.gms.games.ACCOUNT_KEY");
        if (intent != null)
        {
            PlayGamesAsyncService.clearNotifications$182ca992(context, intent, s, 0);
        }
    }

    public final void onReceive(Context context, Intent intent)
    {
        Object obj;
        boolean flag;
        flag = false;
        obj = intent.getAction();
        if (!"com.google.android.gms.games.ACKNOWLEDGE_NOTIFICATIONS".equals(obj)) goto _L2; else goto _L1
_L1:
        intent = intent.getStringExtra("com.google.android.gms.games.ACCOUNT_KEY");
        Preconditions.checkNotNull(intent);
        PlayGamesAsyncService.acknowledgeNotifications(context, intent);
_L4:
        return;
_L2:
        if (!"com.google.android.gms.games.LAUNCH_GAME".equals(obj))
        {
            continue; /* Loop/switch isn't completed */
        }
        obj = intent.getData();
        if (obj == null)
        {
            obj = null;
        } else
        {
            obj = ((Uri) (obj)).getSchemeSpecificPart();
        }
        if (obj == null)
        {
            continue; /* Loop/switch isn't completed */
        }
        intent.setExtrasClassLoader(context.getClassLoader());
        if (!intent.hasExtra("com.google.android.gms.games.GAME"))
        {
            break; /* Loop/switch isn't completed */
        }
        obj = (Game)com.google.android.gms.common.internal.DowngradeableSafeParcel.DowngradeableSafeParcelHelper.getParcelable(intent, "com.google.android.gms.games.GAME", AndroidUtils.getRemoteContext(context, ((String) (obj))), null);
        if (obj != null)
        {
            clearNotifications(context, intent, ((Game) (obj)).getApplicationId());
            intent = intent.getExtras();
            intent.remove("com.google.android.gms.games.GAME");
            Preconditions.checkNotNull(context);
            Preconditions.checkNotNull(obj);
            if (obj == null)
            {
                GamesLog.e("GameLauncher", "GameLauncher.tryLaunch(): null game");
            } else
            {
                flag = GameLauncher.tryLaunchPackage(context, ((Game) (obj)).getInstancePackageName(), intent);
            }
            if (!flag && !GameLauncher.tryAcquisition(context, ((Game) (obj)).getInstancePackageName()))
            {
                GameLauncher.showUnavailableToast(context, ((Game) (obj)).getDisplayName());
                return;
            }
        }
        if (true) goto _L4; else goto _L3
_L3:
        String s;
        obj = intent.getStringExtra("com.google.android.gms.games.GAME_PACKAGE_NAME");
        s = intent.getStringExtra("com.google.android.gms.games.GAME_ID");
        if (TextUtils.isEmpty(((CharSequence) (obj))) || TextUtils.isEmpty(s)) goto _L4; else goto _L5
_L5:
        clearNotifications(context, intent, s);
        intent = intent.getExtras();
        intent.remove("com.google.android.gms.games.GAME_PACKAGE_NAME");
        intent.remove("com.google.android.gms.games.GAME_ID");
        Preconditions.checkNotNull(context);
        boolean flag1;
        if (!TextUtils.isEmpty(((CharSequence) (obj))))
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        Preconditions.checkState(flag1);
        if (GameLauncher.tryLaunchPackage(context, ((String) (obj)), intent) || GameLauncher.tryAcquisition(context, ((String) (obj)))) goto _L4; else goto _L6
_L6:
        GameLauncher.showUnavailableToast(context, ((String) (obj)));
        return;
        if (!"com.google.android.gms.games.CLEAR_DATA".equals(obj)) goto _L4; else goto _L7
_L7:
        PlayGamesAsyncService.clearData(context, intent.getBooleanExtra("com.google.android.gms.games.CLEAR_TRANSIENT_DATA", false));
        return;
    }
}
