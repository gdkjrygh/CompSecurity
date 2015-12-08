// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.bl;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

// Referenced classes of package com.google.android.m4b.maps.bl:
//            e, h, i

public final class m extends e
{

    public m(i.b b1)
    {
        super(b1);
    }

    public final e.a a(long l, LinkedList linkedlist, List list)
    {
        if (linkedlist.size() < 3)
        {
            return e.a.b;
        }
        h h1 = (h)linkedlist.getLast();
        float f1 = h1.f();
        ListIterator listiterator = linkedlist.listIterator(linkedlist.size());
        linkedlist = h1;
        do
        {
            if (!listiterator.hasPrevious())
            {
                break;
            }
            h h2 = (h)listiterator.previous();
            if (h2.b() != h1.b())
            {
                break;
            }
            if (Math.abs(a(f1, h2.f())) > 0.1745329F)
            {
                return e.a.a;
            }
            linkedlist = h2;
        } while (true);
        float f2;
        float f3;
        float f4;
        float f5;
        if (list.isEmpty())
        {
            f1 = 0.1F;
        } else
        {
            f1 = 0.2F;
        }
        f2 = linkedlist.g();
        f3 = h1.g();
        f4 = h1.c();
        f5 = h1.d();
        if (Math.abs(f2 - f3) / ((f5 + f4) * 0.5F) < f1)
        {
            return e.a.b;
        } else
        {
            return e.a.c;
        }
    }

    public final boolean b()
    {
        return true;
    }

    protected final boolean b(i i)
    {
        return a.b(i, false);
    }

    protected final void d(i i)
    {
        a.c(i, false);
    }

    protected final boolean f(i i)
    {
        return a.a(i, false);
    }
}
