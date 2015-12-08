// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.core;


public abstract class c
{

    protected static final int a = 0;
    protected static final int b = 1;
    protected static final int c = 2;
    protected int d;
    protected int e;

    protected c()
    {
    }

    public abstract c a();

    public final boolean b()
    {
        return d == 1;
    }

    public final boolean c()
    {
        return d == 0;
    }

    public final boolean d()
    {
        return d == 2;
    }

    public final String e()
    {
        switch (d)
        {
        default:
            return "?";

        case 0: // '\0'
            return "ROOT";

        case 1: // '\001'
            return "ARRAY";

        case 2: // '\002'
            return "OBJECT";
        }
    }

    public final int f()
    {
        return e + 1;
    }

    public final int g()
    {
        if (e < 0)
        {
            return 0;
        } else
        {
            return e;
        }
    }

    public abstract String h();
}
