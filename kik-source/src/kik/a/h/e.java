// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.a.h;

import kik.a.d.d;
import kik.a.d.o;
import kik.a.e.v;

public final class e
{

    private static e a;
    private v b;

    private e()
    {
    }

    public static e a()
    {
        if (a == null)
        {
            a = new e();
        }
        return a;
    }

    public final void a(v v1)
    {
        b = v1;
    }

    public final boolean a(d d1)
    {
        return b.t(d1.b());
    }

    public final byte[] a(o o1)
    {
        if (o1 instanceof d)
        {
            if (o1.c() != null)
            {
                return o1.c();
            }
            if (((d)o1).b() != null)
            {
                return b.x(((d)o1).b());
            } else
            {
                return null;
            }
        } else
        {
            return o1.c();
        }
    }
}
