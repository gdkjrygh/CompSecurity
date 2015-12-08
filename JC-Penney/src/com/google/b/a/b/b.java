// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.b.a.b;

import com.google.b.s;

final class b
{

    private final int a;
    private final int b;

    b(int i, int j)
    {
        a = i;
        b = j;
    }

    s a()
    {
        return new s(b(), c());
    }

    int b()
    {
        return a;
    }

    int c()
    {
        return b;
    }

    public String toString()
    {
        return (new StringBuilder()).append("<").append(a).append(' ').append(b).append('>').toString();
    }
}
