// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.chat.activity;

import a.a;
import javax.inject.Provider;
import kik.a.ab;
import kik.a.e.v;

// Referenced classes of package kik.android.chat.activity:
//            IntroActivity

public final class j
    implements a
{

    static final boolean a;
    private final a b;
    private final Provider c;
    private final Provider d;

    private j(a a1, Provider provider, Provider provider1)
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
        return new j(a1, provider, provider1);
    }

    public final void a(Object obj)
    {
        obj = (IntroActivity)obj;
        if (obj == null)
        {
            throw new NullPointerException("Cannot inject members into a null reference");
        } else
        {
            b.a(obj);
            obj.a = (ab)c.get();
            obj.b = (v)d.get();
            return;
        }
    }

    static 
    {
        boolean flag;
        if (!kik/android/chat/activity/j.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        a = flag;
    }
}
