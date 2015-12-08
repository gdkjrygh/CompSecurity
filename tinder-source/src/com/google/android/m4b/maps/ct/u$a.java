// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.ct;

import java.util.Arrays;
import java.util.Stack;

// Referenced classes of package com.google.android.m4b.maps.ct:
//            u, d

static final class <init>
{

    final Stack a;

    private static int a(int i)
    {
        int j = Arrays.binarySearch(u.h(), i);
        i = j;
        if (j < 0)
        {
            i = -(j + 1) - 1;
        }
        return i;
    }

    final void a(d d1)
    {
        do
        {
            if (d1.f())
            {
                int i = a(d1.b());
                int k = u.h()[i + 1];
                if (a.isEmpty() || ((d)a.peek()).b() >= k)
                {
                    a.push(d1);
                    return;
                }
                i = u.h()[i];
                Object obj;
                for (obj = (d)a.pop(); !a.isEmpty() && ((d)a.peek()).b() < i; obj = new u((d)a.pop(), ((d) (obj)), (byte)0)) { }
                d1 = new u(((d) (obj)), d1, (byte)0);
                do
                {
                    if (a.isEmpty())
                    {
                        break;
                    }
                    int j = a(d1.b());
                    j = u.h()[j + 1];
                    if (((d)a.peek()).b() >= j)
                    {
                        break;
                    }
                    d1 = new u((d)a.pop(), d1, (byte)0);
                } while (true);
                a.push(d1);
                return;
            }
            if (d1 instanceof u)
            {
                d1 = (u)d1;
                a(u.a(d1));
                d1 = u.b(d1);
            } else
            {
                d1 = String.valueOf(d1.getClass());
                throw new IllegalArgumentException((new StringBuilder(String.valueOf(d1).length() + 49)).append("Has a new type of ByteString been created? Found ").append(d1).toString());
            }
        } while (true);
    }

    private ()
    {
        a = new Stack();
    }

    a(byte byte0)
    {
        this();
    }
}
