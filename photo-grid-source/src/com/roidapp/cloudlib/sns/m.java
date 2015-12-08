// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.cloudlib.sns;

import android.util.Log;

final class m
{

    private static final boolean a = false;

    public static void a(String s)
    {
        if (a)
        {
            Log.w("SnsLogger", s);
        }
    }

    public static void b(String s)
    {
        if (a)
        {
            Log.i("SnsLogger", s);
        }
    }

    public static void c(String s)
    {
        if (a)
        {
            Log.e("SnsLogger", s);
        }
    }

}
