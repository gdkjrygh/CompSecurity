// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.ct;

import java.util.Arrays;

// Referenced classes of package com.google.android.m4b.maps.ct:
//            x, z, m, e

public static final class <init>
{

    private int a;
    private int b[];
    private Object c[];
    private boolean d;

    final void a()
    {
        if (d)
        {
            throw new IllegalStateException("Do not reuse UnknownFieldSetLite Builders.");
        } else
        {
            return;
        }
    }

    final void a(int i, Object obj)
    {
        if (a == b.length)
        {
            int j;
            if (a < 4)
            {
                j = 8;
            } else
            {
                j = a >> 1;
            }
            j += a;
            b = Arrays.copyOf(b, j);
            c = Arrays.copyOf(c, j);
        }
        b[a] = i;
        c[a] = obj;
        a = a + 1;
    }

    public final boolean a(int i, e e1)
    {
        a();
        int j = z.b(i);
        switch (z.a(i))
        {
        default:
            throw m.f();

        case 0: // '\0'
            a(i, Long.valueOf(e1.f()));
            return true;

        case 5: // '\005'
            a(i, Integer.valueOf(e1.g()));
            return true;

        case 1: // '\001'
            a(i, Long.valueOf(e1.h()));
            return true;

        case 2: // '\002'
            a(i, e1.d());
            return true;

        case 3: // '\003'
            a a1 = x.b();
            int k;
            do
            {
                k = e1.a();
            } while (k != 0 && a1.a(k, e1));
            e1.a(z.a(j, 4));
            a(i, a1.b());
            return true;

        case 4: // '\004'
            return false;
        }
    }

    public final x b()
    {
        if (d)
        {
            throw new IllegalStateException("Do not reuse UnknownFieldSetLite Builders.");
        }
        d = true;
        if (a == 0)
        {
            return x.f();
        } else
        {
            return new x(a, b, c, (byte)0);
        }
    }

    private ()
    {
        a = 0;
        b = x.d();
        c = x.e();
    }

    c(byte byte0)
    {
        this();
    }
}
