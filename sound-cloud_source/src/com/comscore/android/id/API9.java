// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.comscore.android.id;

import android.os.Build;

public class API9
{

    public API9()
    {
    }

    public static String getAndroidSerial()
    {
        if (Integer.valueOf(android.os.Build.VERSION.SDK_INT).intValue() >= 9)
        {
            return Build.SERIAL;
        } else
        {
            return null;
        }
    }
}
