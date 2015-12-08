// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.jingle;

import android.net.ConnectivityManager;
import android.os.Messenger;

public final class OsUtil
{

    private static final boolean sIsAtLeastKLP;
    private static final boolean sIsAtLeastL;

    public static boolean isAtLeastL()
    {
        return sIsAtLeastL;
    }

    static 
    {
        boolean flag;
        boolean flag1;
        java.lang.reflect.Method method;
        if (android.os.Build.VERSION.SDK_INT >= 19)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        sIsAtLeastKLP = flag;
        flag1 = false;
        flag = flag1;
        if (!sIsAtLeastKLP)
        {
            break MISSING_BLOCK_LABEL_47;
        }
        method = android/net/ConnectivityManager.getDeclaredMethod("registerNetworkFactory", new Class[] {
            android/os/Messenger
        });
        if (method != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
_L2:
        sIsAtLeastL = flag;
        return;
        NoSuchMethodException nosuchmethodexception;
        nosuchmethodexception;
        flag = flag1;
        if (true) goto _L2; else goto _L1
_L1:
    }
}
