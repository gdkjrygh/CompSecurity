// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.arist.c;

import android.util.Log;

public final class i
{

    private static long a = 0L;

    public static void a()
    {
        a = System.currentTimeMillis();
    }

    public static void a(Object obj)
    {
        long l = System.currentTimeMillis();
        Log.i(obj.getClass().getSimpleName(), (new StringBuilder("\uFFFD\uFFFD\u02B1\u03AA: ")).append(l - a).toString());
        a = l;
    }

}
