// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ford.syncV4.util;

import java.util.Enumeration;
import java.util.Vector;

public abstract class b
{

    private byte a;
    private String b;

    protected b(byte byte0, String s)
    {
        a = byte0;
        b = s;
    }

    public static b a(Vector vector, byte byte0)
    {
        for (vector = vector.elements(); vector.hasMoreElements();)
        {
            b b1 = (b)vector.nextElement();
            if (b1.a == byte0)
            {
                return b1;
            }
        }

        return null;
    }

    public final byte a()
    {
        return a;
    }

    public final boolean a(b b1)
    {
        return b == b1.b;
    }

    public final String b()
    {
        return b;
    }

    public final byte c()
    {
        return a;
    }
}
