// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.tools.dextr.runtime.detour;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

class ChainedWeakReference extends WeakReference
{

    ChainedWeakReference a;
    ChainedWeakReference b;
    ChainedWeakReference c;
    ChainedWeakReference d;

    public ChainedWeakReference(Object obj)
    {
        super(obj);
        d = this;
        c = this;
        b = this;
        a = this;
    }

    public ChainedWeakReference(Object obj, ReferenceQueue referencequeue)
    {
        super(obj, referencequeue);
        d = this;
        c = this;
        b = this;
        a = this;
    }

    static ChainedWeakReference a()
    {
        return new ChainedWeakReference(null);
    }

    static ChainedWeakReference a(ChainedWeakReference chainedweakreference, Object obj)
    {
        ChainedWeakReference chainedweakreference1;
        for (chainedweakreference1 = chainedweakreference.d; chainedweakreference1 != chainedweakreference && chainedweakreference1.get() != obj; chainedweakreference1 = chainedweakreference1.d) { }
        return chainedweakreference1;
    }

    final void a(ChainedWeakReference chainedweakreference)
    {
        b.a = chainedweakreference;
        chainedweakreference.b = b;
        chainedweakreference.a = this;
        b = chainedweakreference;
    }

    final void b()
    {
        if (a != null && b != null)
        {
            a.b = b;
            b.a = a;
            b = this;
            a = this;
        }
        if (c != null && d != null)
        {
            c.d = d;
            d.c = c;
            d = this;
            c = this;
        }
    }

    final void b(ChainedWeakReference chainedweakreference)
    {
        d.c = chainedweakreference;
        chainedweakreference.d = d;
        chainedweakreference.c = this;
        d = chainedweakreference;
    }
}
