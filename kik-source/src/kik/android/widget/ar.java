// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.widget;

import a.a;
import com.kik.cache.ad;
import com.kik.l.ab;
import javax.inject.Provider;
import kik.a.e.v;

// Referenced classes of package kik.android.widget:
//            GalleryWidget

public final class ar
    implements a
{

    static final boolean a;
    private final a b;
    private final Provider c;
    private final Provider d;
    private final Provider e;
    private final Provider f;

    private ar(a a1, Provider provider, Provider provider1, Provider provider2, Provider provider3)
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
        } else
        {
            f = provider3;
            return;
        }
    }

    public static a a(a a1, Provider provider, Provider provider1, Provider provider2, Provider provider3)
    {
        return new ar(a1, provider, provider1, provider2, provider3);
    }

    public final void a(Object obj)
    {
        obj = (GalleryWidget)obj;
        if (obj == null)
        {
            throw new NullPointerException("Cannot inject members into a null reference");
        } else
        {
            b.a(obj);
            obj.c = (com.kik.android.a)c.get();
            obj.d = (v)d.get();
            obj.e = (ab)e.get();
            obj.f = (ad)f.get();
            return;
        }
    }

    static 
    {
        boolean flag;
        if (!kik/android/widget/ar.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        a = flag;
    }
}
