// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.emoji;


public class c
{

    private final int a;
    private final int b;
    private final int c;

    public c(int i, int j)
    {
        a = i;
        b = j;
        c = 0;
    }

    public c(int i, int j, int k)
    {
        a = i;
        b = j;
        c = k;
    }

    public int a()
    {
        return a;
    }

    public int b()
    {
        return b;
    }

    public int c()
    {
        return c;
    }

    public String toString()
    {
        StringBuilder stringbuilder = new StringBuilder(11);
        stringbuilder.append(Integer.toHexString(b()));
        if (c() != 0)
        {
            stringbuilder.append('_');
            stringbuilder.append(Integer.toHexString(c()));
        }
        return stringbuilder.toString();
    }
}
