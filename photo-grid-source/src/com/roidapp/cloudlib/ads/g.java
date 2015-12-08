// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.cloudlib.ads;

import com.cmcm.a.a.a;
import com.cmcm.a.a.d;
import java.lang.ref.WeakReference;

public abstract class g
    implements d
{

    private WeakReference a;

    public g(Object obj)
    {
        a = new WeakReference(obj);
    }

    public final void a()
    {
        Object obj = a.get();
        if (obj != null)
        {
            a(obj);
        }
    }

    public final void a(int i)
    {
        Object obj = a.get();
        if (obj != null)
        {
            b(obj);
        }
    }

    public final void a(a a1)
    {
        Object obj = a.get();
        if (obj != null)
        {
            a(obj, a1);
        }
    }

    public abstract void a(Object obj);

    public abstract void a(Object obj, a a1);

    public abstract void b(Object obj);

    protected final boolean f()
    {
        return a.get() != null;
    }
}
