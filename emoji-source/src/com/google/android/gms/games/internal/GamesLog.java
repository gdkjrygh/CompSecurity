// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.internal;

import com.google.android.gms.internal.hf;

public final class GamesLog
{

    private static final hf OV = new hf("Games");

    private GamesLog()
    {
    }

    public static void a(String s, String s1, Throwable throwable)
    {
        OV.a(s, s1, throwable);
    }

    public static void b(String s, String s1, Throwable throwable)
    {
        OV.b(s, s1, throwable);
    }

    public static void i(String s, String s1)
    {
        OV.i(s, s1);
    }

    public static void j(String s, String s1)
    {
        OV.j(s, s1);
    }

    public static void k(String s, String s1)
    {
        OV.k(s, s1);
    }

}
