// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.widget.preferences;

import a.a;
import javax.inject.Provider;
import kik.a.e.v;

// Referenced classes of package kik.android.widget.preferences:
//            AutoplayVideoPreference

public final class b
    implements a
{

    static final boolean a;
    private final a b;
    private final Provider c;
    private final Provider d;

    private b(a a1, Provider provider, Provider provider1)
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
        } else
        {
            d = provider1;
            return;
        }
    }

    public static a a(a a1, Provider provider, Provider provider1)
    {
        return new b(a1, provider, provider1);
    }

    public final void a(Object obj)
    {
        obj = (AutoplayVideoPreference)obj;
        if (obj == null)
        {
            throw new NullPointerException("Cannot inject members into a null reference");
        } else
        {
            b.a(obj);
            obj.a = (com.kik.android.a)c.get();
            obj.b = (v)d.get();
            return;
        }
    }

    static 
    {
        boolean flag;
        if (!kik/android/widget/preferences/b.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        a = flag;
    }
}
