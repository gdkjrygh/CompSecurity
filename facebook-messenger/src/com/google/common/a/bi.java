// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.a;

import java.io.Serializable;

final class bi
    implements Serializable
{

    private int a;

    bi()
    {
        this(0);
    }

    bi(int i)
    {
        a = i;
    }

    public int a()
    {
        return a;
    }

    public int a(int i)
    {
        int j = a;
        a = j + i;
        return j;
    }

    public int b(int i)
    {
        i = a + i;
        a = i;
        return i;
    }

    public void c(int i)
    {
        a = i;
    }

    public int d(int i)
    {
        int j = a;
        a = i;
        return j;
    }

    public boolean equals(Object obj)
    {
        return (obj instanceof bi) && ((bi)obj).a == a;
    }

    public int hashCode()
    {
        return a;
    }

    public String toString()
    {
        return Integer.toString(a);
    }
}
