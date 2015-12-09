// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.bn;

import java.util.Enumeration;
import java.util.Vector;

public abstract class c
{

    private byte a;
    private String b;

    protected c(byte byte0, String s)
    {
        a = byte0;
        b = s;
    }

    public static c a(Vector vector, byte byte0)
    {
        for (vector = vector.elements(); vector.hasMoreElements();)
        {
            c c1 = (c)vector.nextElement();
            if (c1.a() == byte0)
            {
                return c1;
            }
        }

        return null;
    }

    public byte a()
    {
        return a;
    }

    public boolean a(c c1)
    {
        return b == c1.b();
    }

    public String b()
    {
        return b;
    }

    public boolean b(c c1)
    {
        return a(c1);
    }

    public byte c()
    {
        return a;
    }
}
