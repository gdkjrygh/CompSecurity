// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.common.a;

import java.util.Random;

public class b
{

    private Random a;

    public b()
    {
        a = new Random();
    }

    public long a()
    {
        return (System.currentTimeMillis() << 22 | (long)(a.nextInt() & 0x3fffff)) & 0x7fffffffffffffffL;
    }
}
