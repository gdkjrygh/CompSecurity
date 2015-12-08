// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.internal;

import com.google.android.gms.internal.hg;

public final class GamesLog
{

    private static final hg OS = new hg("Games");

    private GamesLog()
    {
    }

    public static void a(String s, String s1, Throwable throwable)
    {
        OS.a(s, s1, throwable);
    }

    public static void b(String s, String s1, Throwable throwable)
    {
        OS.b(s, s1, throwable);
    }

    public static void i(String s, String s1)
    {
        OS.i(s, s1);
    }

    public static void j(String s, String s1)
    {
        OS.j(s, s1);
    }

    public static void k(String s, String s1)
    {
        OS.k(s, s1);
    }

}
