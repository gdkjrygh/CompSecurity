// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kik.view.adapters;

import a.a;
import com.kik.l.ab;
import javax.inject.Provider;
import kik.a.e.i;
import kik.a.e.r;
import kik.a.e.t;
import kik.a.e.v;

// Referenced classes of package com.kik.view.adapters:
//            ar

public final class at
    implements a
{

    static final boolean a;
    private final Provider b;
    private final Provider c;
    private final Provider d;
    private final Provider e;
    private final Provider f;

    private at(Provider provider, Provider provider1, Provider provider2, Provider provider3, Provider provider4)
    {
        if (!a && provider == null)
        {
            throw new AssertionError();
        }
        b = provider;
        if (!a && provider1 == null)
        {
            throw new AssertionError();
        }
        c = provider1;
        if (!a && provider2 == null)
        {
            throw new AssertionError();
        }
        d = provider2;
        if (!a && provider3 == null)
        {
            throw new AssertionError();
        }
        e = provider3;
        if (!a && provider4 == null)
        {
            throw new AssertionError();
        } else
        {
            f = provider4;
            return;
        }
    }

    public static a a(Provider provider, Provider provider1, Provider provider2, Provider provider3, Provider provider4)
    {
        return new at(provider, provider1, provider2, provider3, provider4);
    }

    public final void a(Object obj)
    {
        obj = (ar)obj;
        if (obj == null)
        {
            throw new NullPointerException("Cannot inject members into a null reference");
        } else
        {
            obj.f = (r)b.get();
            obj.g = (v)c.get();
            obj.h = (ab)d.get();
            obj.i = (i)e.get();
            obj.j = (t)f.get();
            return;
        }
    }

    static 
    {
        boolean flag;
        if (!com/kik/view/adapters/at.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        a = flag;
    }
}
