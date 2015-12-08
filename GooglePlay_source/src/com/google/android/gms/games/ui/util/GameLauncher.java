// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.ui.util;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.Toast;
import com.google.android.gms.common.util.ClientLibraryUtils;
import com.google.android.gms.common.util.GmsVersion;
import com.google.android.gms.games.internal.GamesLog;
import com.google.android.gms.games.service.PlayGamesServiceBroker;

public final class GameLauncher
{

    public static void showUnavailableToast(Context context, String s)
    {
        Toast.makeText(context, context.getResources().getString(0x7f1000a0, new Object[] {
            s
        }), 1).show();
    }

    public static boolean tryAcquisition(Context context, String s)
    {
        if (s == null)
        {
            return false;
        }
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.addFlags(0x10000000);
        intent.setData(Uri.parse((new StringBuilder("market://details?id=")).append(s).toString()));
        try
        {
            context.startActivity(intent);
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            return false;
        }
        return true;
    }

    public static boolean tryLaunchPackage(Context context, String s, Bundle bundle)
    {
        boolean flag;
        int i;
        if (TextUtils.isEmpty(s))
        {
            GamesLog.e("GameLauncher", "GameLauncher.tryLaunchPackage(): empty packageName");
            return false;
        }
        Intent intent = context.getPackageManager().getLaunchIntentForPackage(s);
        if (intent == null)
        {
            GamesLog.e("GameLauncher", "GameLauncher.tryLaunch(): couldn't get launch intent!");
            GamesLog.e("GameLauncher", (new StringBuilder("- packageName = ")).append(s).toString());
            return false;
        }
        intent.addFlags(0x10000000);
        intent.addFlags(0x4000000);
        try
        {
            context.startActivity(intent);
            i = ClientLibraryUtils.getClientVersion(context, s);
            if (!GmsVersion.isAtLeastFenacho(i))
            {
                bundle.remove("invitation");
            }
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            return false;
        }
          goto _L1
_L4:
        if (flag) goto _L3; else goto _L2
_L2:
        bundle.remove("turn_based_match");
          goto _L3
_L5:
        if (flag)
        {
            break MISSING_BLOCK_LABEL_127;
        }
        bundle.remove("requests");
        PlayGamesServiceBroker.setConnectionHint(s, bundle);
        return true;
_L7:
        flag = false;
          goto _L4
_L9:
        flag = false;
          goto _L5
_L1:
        if (i < 0x3e8fa0) goto _L7; else goto _L6
_L6:
        flag = true;
          goto _L4
_L3:
        if (i < 0x419ce0) goto _L9; else goto _L8
_L8:
        flag = true;
          goto _L5
    }
}
