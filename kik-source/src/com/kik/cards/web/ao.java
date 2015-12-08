// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kik.cards.web;

import a.a;
import com.kik.android.c.f;
import com.kik.cache.ad;
import com.kik.l.ab;
import javax.inject.Provider;
import kik.a.e.d;
import kik.a.e.q;
import kik.a.e.r;
import kik.a.e.u;
import kik.a.e.v;
import kik.a.e.w;
import kik.a.f.k;
import kik.a.i.h;
import kik.a.j.m;
import kik.android.util.ar;

// Referenced classes of package com.kik.cards.web:
//            CardsWebViewFragment

public final class ao
    implements a
{

    static final boolean a;
    private final a b;
    private final Provider c;
    private final Provider d;
    private final Provider e;
    private final Provider f;
    private final Provider g;
    private final Provider h;
    private final Provider i;
    private final Provider j;
    private final Provider k;
    private final Provider l;
    private final Provider m;
    private final Provider n;
    private final Provider o;
    private final Provider p;
    private final Provider q;

    private ao(a a1, Provider provider, Provider provider1, Provider provider2, Provider provider3, Provider provider4, Provider provider5, 
            Provider provider6, Provider provider7, Provider provider8, Provider provider9, Provider provider10, Provider provider11, Provider provider12, 
            Provider provider13, Provider provider14)
    {
        if (!a && a1 == null)
        {
            throw new AssertionError();
        }
        b = a1;
        if (!a && provider == null)
        {
            throw new AssertionError();
        }
        c = provider;
        if (!a && provider1 == null)
        {
            throw new AssertionError();
        }
        d = provider1;
        if (!a && provider2 == null)
        {
            throw new AssertionError();
        }
        e = provider2;
        if (!a && provider3 == null)
        {
            throw new AssertionError();
        }
        f = provider3;
        if (!a && provider4 == null)
        {
            throw new AssertionError();
        }
        g = provider4;
        if (!a && provider5 == null)
        {
            throw new AssertionError();
        }
        h = provider5;
        if (!a && provider6 == null)
        {
            throw new AssertionError();
        }
        i = provider6;
        if (!a && provider7 == null)
        {
            throw new AssertionError();
        }
        j = provider7;
        if (!a && provider8 == null)
        {
            throw new AssertionError();
        }
        k = provider8;
        if (!a && provider9 == null)
        {
            throw new AssertionError();
        }
        l = provider9;
        if (!a && provider10 == null)
        {
            throw new AssertionError();
        }
        m = provider10;
        if (!a && provider11 == null)
        {
            throw new AssertionError();
        }
        n = provider11;
        if (!a && provider12 == null)
        {
            throw new AssertionError();
        }
        o = provider12;
        if (!a && provider13 == null)
        {
            throw new AssertionError();
        }
        p = provider13;
        if (!a && provider14 == null)
        {
            throw new AssertionError();
        } else
        {
            q = provider14;
            return;
        }
    }

    public static a a(a a1, Provider provider, Provider provider1, Provider provider2, Provider provider3, Provider provider4, Provider provider5, Provider provider6, 
            Provider provider7, Provider provider8, Provider provider9, Provider provider10, Provider provider11, Provider provider12, Provider provider13, 
            Provider provider14)
    {
        return new ao(a1, provider, provider1, provider2, provider3, provider4, provider5, provider6, provider7, provider8, provider9, provider10, provider11, provider12, provider13, provider14);
    }

    public final void a(Object obj)
    {
        obj = (CardsWebViewFragment)obj;
        if (obj == null)
        {
            throw new NullPointerException("Cannot inject members into a null reference");
        } else
        {
            b.a(obj);
            obj.c = (com.kik.android.a)c.get();
            obj.d = (m)d.get();
            obj.e = (u)e.get();
            obj.f = (f)f.get();
            obj.g = (r)g.get();
            obj.h = (d)h.get();
            obj.i = (h)i.get();
            obj.j = (kik.a.e.m)j.get();
            obj.k = (v)k.get();
            obj.l = (ab)l.get();
            obj.m = (w)m.get();
            obj.n = (k)n.get();
            obj.o = (q)o.get();
            obj.p = (ad)p.get();
            obj.q = (ar)q.get();
            return;
        }
    }

    static 
    {
        boolean flag;
        if (!com/kik/cards/web/ao.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        a = flag;
    }
}
