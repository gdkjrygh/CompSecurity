// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive.utils;

import java.util.Locale;

public final class Log
{

    private static int filterLevel = 5;

    public static transient int dfmt(String s, String s1, Object aobj[])
    {
        boolean flag;
        if (3 >= filterLevel)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag)
        {
            return android.util.Log.d(s, String.format(Locale.US, s1, aobj));
        } else
        {
            return -1;
        }
    }

}
