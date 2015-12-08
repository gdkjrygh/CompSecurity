// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.flurry.sdk;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class iz
{

    private static final String a = com/flurry/sdk/iz.getSimpleName();
    private boolean b;
    private long c;
    private final List d = new ArrayList();

    public iz()
    {
    }

    static long a(iz iz1, long l)
    {
        iz1.c = l;
        return l;
    }

    static List a(iz iz1)
    {
        return iz1.d;
    }

    static boolean a(iz iz1, boolean flag)
    {
        iz1.b = flag;
        return flag;
    }

    public boolean a()
    {
        return b;
    }

    public long b()
    {
        return c;
    }

    public List c()
    {
        return Collections.unmodifiableList(d);
    }

}
