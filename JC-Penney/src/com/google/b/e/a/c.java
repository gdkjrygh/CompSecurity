// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.b.e.a;

import com.google.b.s;

public final class c
{

    private final int a;
    private final int b[];
    private final s c[];

    public c(int i, int ai[], int j, int k, int l)
    {
        a = i;
        b = ai;
        c = (new s[] {
            new s(j, l), new s(k, l)
        });
    }

    public int a()
    {
        return a;
    }

    public int[] b()
    {
        return b;
    }

    public s[] c()
    {
        return c;
    }

    public boolean equals(Object obj)
    {
        if (obj instanceof c)
        {
            if (a == ((c) (obj = (c)obj)).a)
            {
                return true;
            }
        }
        return false;
    }

    public int hashCode()
    {
        return a;
    }
}
