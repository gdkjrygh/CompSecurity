// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.br;


public class b
{

    private final String a;
    final boolean b;

    public b()
    {
        this(null);
    }

    public b(String s)
    {
        this(s, false);
    }

    public b(String s, boolean flag)
    {
        a = s;
        b = flag;
    }

    public static boolean a(b b1, b b2)
    {
        if (b1 == null)
        {
            return b2 == null;
        } else
        {
            return b1.equals(b2);
        }
    }

    public String toString()
    {
        if (a == null)
        {
            return super.toString();
        } else
        {
            String s = a;
            return (new StringBuilder(String.valueOf(s).length() + 15)).append("[LabelSource: ").append(s).append("]").toString();
        }
    }
}
