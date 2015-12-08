// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.c.b;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class aq
{

    private static volatile boolean a = false;
    private static final aq c = new aq((byte)0);
    private final Map b;

    aq()
    {
        b = new HashMap();
    }

    private aq(byte byte0)
    {
        b = Collections.emptyMap();
    }

    aq(aq aq1)
    {
        if (aq1 == c)
        {
            b = Collections.emptyMap();
            return;
        } else
        {
            b = Collections.unmodifiableMap(aq1.b);
            return;
        }
    }

    public static boolean c()
    {
        return a;
    }

    public static aq d()
    {
        return c;
    }

}
