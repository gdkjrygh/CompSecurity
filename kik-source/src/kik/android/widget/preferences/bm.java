// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.widget.preferences;

import a.a;
import com.kik.cache.ad;
import javax.inject.Provider;
import kik.a.e.w;

// Referenced classes of package kik.android.widget.preferences:
//            ShareProfilePreference

public final class bm
    implements a
{

    static final boolean a;
    private final a b;
    private final Provider c;
    private final Provider d;
    private final Provider e;

    private bm(a a1, Provider provider, Provider provider1, Provider provider2)
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
        } else
        {
            e = provider2;
            return;
        }
    }

    public static a a(a a1, Provider provider, Provider provider1, Provider provider2)
    {
        return new bm(a1, provider, provider1, provider2);
    }

    public final void a(Object obj)
    {
        obj = (ShareProfilePreference)obj;
        if (obj == null)
        {
            throw new NullPointerException("Cannot inject members into a null reference");
        } else
        {
            b.a(obj);
            obj.b = (com.kik.android.a)c.get();
            obj.c = (w)d.get();
            obj.d = (ad)e.get();
            return;
        }
    }

    static 
    {
        boolean flag;
        if (!kik/android/widget/preferences/bm.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        a = flag;
    }
}
