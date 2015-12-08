// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cleanmaster.sdk.cmloginsdkjar;


final class a
{

    private final int a;
    private final int b;

    private a(int i, int j)
    {
        a = i;
        b = j;
    }

    a(int i, int j, byte byte0)
    {
        this(i, j);
    }

    final boolean a(int i)
    {
        return a <= i && i <= b;
    }
}
