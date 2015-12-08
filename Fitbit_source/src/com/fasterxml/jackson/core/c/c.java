// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.core.c;


public abstract class c
{

    protected final String a;
    protected final int b;

    protected c(String s, int i)
    {
        a = s;
        b = i;
    }

    public String a()
    {
        return a;
    }

    public abstract boolean a(int i);

    public abstract boolean a(int i, int j);

    public abstract boolean a(int ai[], int i);

    public boolean equals(Object obj)
    {
        return obj == this;
    }

    public final int hashCode()
    {
        return b;
    }

    public String toString()
    {
        return a;
    }
}
