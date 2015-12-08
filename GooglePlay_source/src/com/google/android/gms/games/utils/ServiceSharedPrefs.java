// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.utils;

import android.content.Context;
import com.google.android.gms.common.util.AndroidUtils;
import com.google.android.gms.games.util.BaseSharedPrefs;

public final class ServiceSharedPrefs extends BaseSharedPrefs
{

    private static volatile ServiceSharedPrefs sSingleton;

    private ServiceSharedPrefs()
    {
        super("play.games.sharedPrefs");
    }

    public static void clearScreenCaptureOverlayPos(Context context, String s)
    {
        s = String.format("screenCaptureOverlayPos.%s", new Object[] {
            s
        });
        getInstance().setString(context, s, null);
    }

    private static ServiceSharedPrefs getInstance()
    {
        if (sSingleton != null) goto _L2; else goto _L1
_L1:
        com/google/android/gms/games/utils/ServiceSharedPrefs;
        JVM INSTR monitorenter ;
        if (sSingleton == null)
        {
            sSingleton = new ServiceSharedPrefs();
        }
        com/google/android/gms/games/utils/ServiceSharedPrefs;
        JVM INSTR monitorexit ;
_L2:
        return sSingleton;
        Exception exception;
        exception;
        com/google/android/gms/games/utils/ServiceSharedPrefs;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public static String getScreenCaptureOverlayPos(Context context, String s)
    {
        s = String.format("screenCaptureOverlayPos.%s", new Object[] {
            s
        });
        return getInstance().getString(context, s);
    }

    public static void setScreenCaptureOverlayPos(Context context, String s, int i, int j)
    {
        s = String.format("screenCaptureOverlayPos.%s", new Object[] {
            s
        });
        getInstance().setString(context, s, (new StringBuilder()).append(i).append(",").append(j).toString());
    }

    public final void assertProcess(Context context)
    {
        AndroidUtils.assertMainGmsProcess();
    }
}
