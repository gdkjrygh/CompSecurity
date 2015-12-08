// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.admarvel.android.util;

import android.util.Log;

public class Logging
{

    private static final String LOGTAG = "admarvel";

    public Logging()
    {
    }

    public static void log(String s)
    {
        if (Log.isLoggable("admarvel", 2))
        {
            Log.d("admarvel", s);
        }
    }
}
