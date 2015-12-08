// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.util;

import org.c.b;
import org.c.c;

public final class s
{

    private static final b a = org.c.c.a("BootInfo");
    private static long b;
    private static long c;

    public static void a()
    {
        b = System.currentTimeMillis();
    }

    public static void b()
    {
        c = System.currentTimeMillis();
        (new StringBuilder("Boot finished, total time: ")).append(c - b);
    }

}
