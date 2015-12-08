// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.bl;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

// Referenced classes of package com.google.android.m4b.maps.bl:
//            e, h, i

public final class k extends e
{

    public k(i.b b1)
    {
        super(b1);
    }

    public final e.a a(long l, LinkedList linkedlist, List list)
    {
        for (Iterator iterator = list.iterator(); iterator.hasNext();)
        {
            if (((e)iterator.next()).b())
            {
                return e.a.a;
            }
        }

        if (linkedlist.size() < 3)
        {
            return e.a.b;
        }
        Object obj = null;
        Iterator iterator1 = linkedlist.iterator();
        h h1;
        do
        {
            h1 = obj;
            if (!iterator1.hasNext())
            {
                break;
            }
            h1 = (h)iterator1.next();
        } while (h1.b() <= 1);
        linkedlist = (h)linkedlist.getLast();
        if (h1 == null)
        {
            return e.a.a;
        }
        if (linkedlist.b() <= 1)
        {
            return e.a.a;
        }
        float f1;
        float f2;
        if (list.isEmpty())
        {
            f1 = 0.08726646F;
        } else
        {
            f1 = 0.1745329F;
        }
        f2 = Math.abs(a(h1.f(), linkedlist.f()));
        if (f2 < f1)
        {
            return e.a.a;
        }
        f1 = (linkedlist.c() + linkedlist.d()) * 0.5F;
        float f3 = linkedlist.g() / f1;
        if (f3 < 0.75F)
        {
            return e.a.a;
        }
        f1 = Math.abs(f3 - h1.g() / f1);
        if (f1 != 0.0F)
        {
            f1 = f2 / f1;
            if (f1 < 0.5F)
            {
                return e.a.a;
            }
            if (f1 < 0.9F)
            {
                return e.a.b;
            }
        }
        return e.a.c;
    }

    protected final boolean b(i i)
    {
        return a.e(i);
    }

    protected final void d(i i)
    {
        a.f(i);
    }

    protected final boolean f(i i)
    {
        return a.d(i);
    }
}
