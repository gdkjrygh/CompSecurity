// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.c.a.a;


final class g extends c.a
{

    final char q;
    final char r;

    g(String s, char c1, char c2)
    {
        q = c1;
        r = c2;
        super(s);
    }

    public final boolean c(char c1)
    {
        return c1 == q || c1 == r;
    }
}
