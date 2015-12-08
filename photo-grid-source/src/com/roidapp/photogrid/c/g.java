// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid.c;

import android.util.Log;

public final class g
{

    private static boolean a = false;

    public static void a()
    {
        a = false;
    }

    public static void a(String s, String s1)
    {
        if (a)
        {
            Log.i(s, s1);
        }
    }

    public static void b(String s, String s1)
    {
        if (a)
        {
            Log.e(s, s1);
        }
    }

}
