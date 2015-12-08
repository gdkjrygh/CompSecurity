// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.chat.activity;

import a.a;
import javax.inject.Provider;
import kik.a.e.l;
import kik.a.e.r;
import kik.a.e.v;

// Referenced classes of package kik.android.chat.activity:
//            KikApiLandingActivity

public final class ab
    implements a
{

    static final boolean a;
    private final a b;
    private final Provider c;
    private final Provider d;
    private final Provider e;
    private final Provider f;

    private ab(a a1, Provider provider, Provider provider1, Provider provider2, Provider provider3)
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
        return new ab(a1, provider, provider1, provider2, provider3);
    }

    public final void a(Object obj)
    {
        obj = (KikApiLandingActivity)obj;
        if (obj == null)
        {
            throw new NullPointerException("Cannot inject members into a null reference");
        } else
        {
            b.a(obj);
            obj.a = (com.kik.android.a)c.get();
            obj.e = (l)d.get();
            obj.f = (r)e.get();
            obj.g = (v)f.get();
            return;
        }
    }

    static 
    {
        boolean flag;
        if (!kik/android/chat/activity/ab.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        a = flag;
    }
}
