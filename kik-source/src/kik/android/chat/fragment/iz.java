// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.chat.fragment;

import a.a;
import com.kik.cache.ad;
import javax.inject.Provider;
import kik.a.e.l;
import kik.a.e.r;
import kik.a.e.v;
import kik.a.e.w;
import kik.a.f.k;
import kik.android.chat.b.d;

// Referenced classes of package kik.android.chat.fragment:
//            KikCodeFragment

public final class iz
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

    private iz(a a1, Provider provider, Provider provider1, Provider provider2, Provider provider3, Provider provider4, Provider provider5, 
            Provider provider6, Provider provider7, Provider provider8)
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
        } else
        {
            k = provider8;
            return;
        }
    }

    public static a a(a a1, Provider provider, Provider provider1, Provider provider2, Provider provider3, Provider provider4, Provider provider5, Provider provider6, 
            Provider provider7, Provider provider8)
    {
        return new iz(a1, provider, provider1, provider2, provider3, provider4, provider5, provider6, provider7, provider8);
    }

    public final void a(Object obj)
    {
        obj = (KikCodeFragment)obj;
        if (obj == null)
        {
            throw new NullPointerException("Cannot inject members into a null reference");
        } else
        {
            b.a(obj);
            obj.a = (ad)c.get();
            obj.b = (k)d.get();
            obj.c = (v)e.get();
            obj.d = (r)f.get();
            obj.e = (w)g.get();
            obj.f = (com.kik.android.a)h.get();
            obj.g = (d)i.get();
            obj.h = (kik.android.scan.d)j.get();
            obj.i = (l)k.get();
            return;
        }
    }

    static 
    {
        boolean flag;
        if (!kik/android/chat/fragment/iz.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        a = flag;
    }
}
