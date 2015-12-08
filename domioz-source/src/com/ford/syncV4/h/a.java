// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ford.syncV4.h;

import com.ford.syncV4.h.a.c;

public final class a
{

    private static int a[];

    public static int a(c c1)
    {
        return a[c1.ordinal()];
    }

    public static void a(c c1, int i)
    {
        a[c1.ordinal()] = i;
    }

    static 
    {
        a = new int[c.values().length];
        int j = com.ford.syncV4.h.a.a.a;
        for (int i = 0; i < a.length; i++)
        {
            a[i] = j;
        }

    }
}
