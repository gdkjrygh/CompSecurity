// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.ag;

import p.s.k;

public class a
{

    private final k a;
    private final k b;

    public a(k k1, k k2)
    {
        if (k1 != null && k2 != null)
        {
            throw new IllegalArgumentException("Can only contain either a bitmap resource or a gif resource, not both");
        }
        if (k1 == null && k2 == null)
        {
            throw new IllegalArgumentException("Must contain either a bitmap resource or a gif resource");
        } else
        {
            b = k1;
            a = k2;
            return;
        }
    }

    public int a()
    {
        if (b != null)
        {
            return b.c();
        } else
        {
            return a.c();
        }
    }

    public k b()
    {
        return b;
    }

    public k c()
    {
        return a;
    }
}
