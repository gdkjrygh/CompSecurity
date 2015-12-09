// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.android.sdk.common.core;

import com.google.a.a.ae;
import com.google.a.a.t;
import com.google.a.a.w;
import com.google.a.b.ar;
import com.google.a.b.be;
import com.google.a.b.bi;
import com.google.a.b.bl;
import com.google.a.b.cn;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;

public class Seq
    implements Iterable
{

    private Iterable iterable;

    public Seq(Iterable iterable1)
    {
        iterable = iterable1;
    }

    public boolean all(ae ae)
    {
        return bl.c(iterable.iterator(), ae);
    }

    public boolean any(ae ae)
    {
        return bl.b(iterable.iterator(), ae);
    }

    public int indexOf(ae ae)
    {
        return bl.d(iterable.iterator(), ae);
    }

    public boolean isEmpty()
    {
        Iterable iterable1 = iterable;
        if (iterable1 instanceof Collection)
        {
            return ((Collection)iterable1).isEmpty();
        }
        return !iterable1.iterator().hasNext();
    }

    public Iterator iterator()
    {
        return iterable.iterator();
    }

    public String join(String s)
    {
        return w.a(s).a(iterable);
    }

    public Seq select(ae ae)
    {
        return new Seq(bi.a(iterable, ae));
    }

    public int size()
    {
        Iterable iterable1 = iterable;
        if (iterable1 instanceof Collection)
        {
            return ((Collection)iterable1).size();
        } else
        {
            return bl.b(iterable1.iterator());
        }
    }

    public Seq sort()
    {
        return new Seq(cn.b().c(iterable));
    }

    public Seq sort(Comparator comparator)
    {
        return new Seq(cn.a(comparator).c(iterable));
    }

    public ar toImmutableList()
    {
        if (iterable instanceof ar)
        {
            return (ar)iterable;
        } else
        {
            return ar.a(iterable);
        }
    }

    public be toImmutableSet()
    {
        if (iterable instanceof be)
        {
            return (be)iterable;
        } else
        {
            return be.a(iterable);
        }
    }

    public Seq transform(t t)
    {
        return new Seq(bi.a(iterable, t));
    }
}
