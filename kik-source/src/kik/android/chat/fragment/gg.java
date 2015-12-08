// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.chat.fragment;

import a.a;
import com.kik.cache.ad;
import com.kik.l.ab;
import javax.inject.Provider;
import kik.a.c.c;
import kik.a.e.f;
import kik.a.e.i;
import kik.a.e.l;
import kik.a.e.n;
import kik.a.e.r;
import kik.a.e.t;
import kik.a.e.v;
import kik.a.e.w;
import kik.a.f.k;
import kik.android.chat.b.d;
import kik.android.util.ar;
import kik.android.util.bj;
import kik.android.util.ck;

// Referenced classes of package kik.android.chat.fragment:
//            KikChatFragment

public final class gg
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
    private final Provider r;
    private final Provider s;
    private final Provider t;
    private final Provider u;
    private final Provider v;
    private final Provider w;

    private gg(a a1, Provider provider, Provider provider1, Provider provider2, Provider provider3, Provider provider4, Provider provider5, 
            Provider provider6, Provider provider7, Provider provider8, Provider provider9, Provider provider10, Provider provider11, Provider provider12, 
            Provider provider13, Provider provider14, Provider provider15, Provider provider16, Provider provider17, Provider provider18, Provider provider19, 
            Provider provider20)
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
        }
        q = provider14;
        if (!a && provider15 == null)
        {
            throw new AssertionError();
        }
        r = provider15;
        if (!a && provider16 == null)
        {
            throw new AssertionError();
        }
        s = provider16;
        if (!a && provider17 == null)
        {
            throw new AssertionError();
        }
        t = provider17;
        if (!a && provider18 == null)
        {
            throw new AssertionError();
        }
        u = provider18;
        if (!a && provider19 == null)
        {
            throw new AssertionError();
        }
        v = provider19;
        if (!a && provider20 == null)
        {
            throw new AssertionError();
        } else
        {
            w = provider20;
            return;
        }
    }

    public static a a(a a1, Provider provider, Provider provider1, Provider provider2, Provider provider3, Provider provider4, Provider provider5, Provider provider6, 
            Provider provider7, Provider provider8, Provider provider9, Provider provider10, Provider provider11, Provider provider12, Provider provider13, 
            Provider provider14, Provider provider15, Provider provider16, Provider provider17, Provider provider18, Provider provider19, Provider provider20)
    {
        return new gg(a1, provider, provider1, provider2, provider3, provider4, provider5, provider6, provider7, provider8, provider9, provider10, provider11, provider12, provider13, provider14, provider15, provider16, provider17, provider18, provider19, provider20);
    }

    public final void a(Object obj)
    {
        obj = (KikChatFragment)obj;
        if (obj == null)
        {
            throw new NullPointerException("Cannot inject members into a null reference");
        } else
        {
            b.a(obj);
            obj.a = (ad)c.get();
            obj.b = (ad)d.get();
            obj.c = (ad)e.get();
            obj.d = (v)f.get();
            obj.e = (l)g.get();
            obj.f = (ck)h.get();
            obj.g = (com.kik.android.a)i.get();
            obj.h = (n)j.get();
            obj.i = (k)k.get();
            obj.j = (r)l.get();
            obj.k = (i)m.get();
            obj.l = (f)n.get();
            obj.m = (w)o.get();
            obj.n = (ab)p.get();
            obj.o = (ar)q.get();
            obj.p = (t)r.get();
            obj.q = (com.kik.android.c.f)s.get();
            obj.r = (d)t.get();
            obj.s = (kik.android.chat.a.a)u.get();
            obj.t = (bj)v.get();
            obj.x = (c)w.get();
            return;
        }
    }

    static 
    {
        boolean flag;
        if (!kik/android/chat/fragment/gg.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        a = flag;
    }
}
