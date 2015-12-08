// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.scan.fragment;

import a.a;
import javax.inject.Provider;
import kik.a.e.i;
import kik.a.e.l;
import kik.a.e.r;
import kik.android.chat.b.d;

// Referenced classes of package kik.android.scan.fragment:
//            ScanFragment

public final class w
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

    private w(a a1, Provider provider, Provider provider1, Provider provider2, Provider provider3, Provider provider4, Provider provider5)
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
        } else
        {
            h = provider5;
            return;
        }
    }

    public static a a(a a1, Provider provider, Provider provider1, Provider provider2, Provider provider3, Provider provider4, Provider provider5)
    {
        return new w(a1, provider, provider1, provider2, provider3, provider4, provider5);
    }

    public final void a(Object obj)
    {
        obj = (ScanFragment)obj;
        if (obj == null)
        {
            throw new NullPointerException("Cannot inject members into a null reference");
        } else
        {
            b.a(obj);
            obj.a = (com.kik.android.a)c.get();
            obj.b = (d)d.get();
            obj.c = (r)e.get();
            obj.d = (kik.android.scan.d)f.get();
            obj.e = (l)g.get();
            obj.f = (i)h.get();
            return;
        }
    }

    static 
    {
        boolean flag;
        if (!kik/android/scan/fragment/w.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        a = flag;
    }
}
