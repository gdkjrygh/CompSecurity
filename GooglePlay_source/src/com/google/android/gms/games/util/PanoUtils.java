// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.util;

import android.app.UiModeManager;
import android.content.Context;
import android.content.pm.PackageManager;
import android.test.IsolatedContext;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.games.internal.GamesLog;

public final class PanoUtils
{

    public static boolean isPano(Context context)
    {
        if (PlatformVersion.checkVersion(21)) goto _L2; else goto _L1
_L1:
        return false;
_L2:
        PackageManager packagemanager = null;
        PackageManager packagemanager1 = context.getPackageManager();
        packagemanager = packagemanager1;
_L4:
        if (packagemanager == null)
        {
            GamesLog.w("PanoUtils", "isPano: getPackageManager() failed");
            return false;
        }
        break; /* Loop/switch isn't completed */
        UnsupportedOperationException unsupportedoperationexception;
        unsupportedoperationexception;
        if (!(context instanceof IsolatedContext))
        {
            throw unsupportedoperationexception;
        }
        if (true) goto _L4; else goto _L3
_L3:
        boolean flag1 = packagemanager.hasSystemFeature("android.software.leanback");
        context = (UiModeManager)context.getSystemService("uimode");
        if (context == null)
        {
            GamesLog.w("PanoUtils", "isPano: getSystemService(UI_MODE_SERVICE) failed");
            return false;
        }
        boolean flag;
        if (context.getCurrentModeType() == 4)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag1 && flag)
        {
            return true;
        }
        if (true) goto _L1; else goto _L5
_L5:
    }
}
