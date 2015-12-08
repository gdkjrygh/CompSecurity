// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.chat.fragment;

import a.a;
import javax.inject.Provider;
import kik.a.ab;

// Referenced classes of package kik.android.chat.fragment:
//            SimpleFragmentWrapperActivity

public final class rk
    implements a
{

    static final boolean a;
    private final a b;
    private final Provider c;

    private rk(a a1, Provider provider)
    {
        if (!a && a1 == null)
        {
            throw new AssertionError();
        }
        b = a1;
        if (!a && provider == null)
        {
            throw new AssertionError();
        } else
        {
            c = provider;
            return;
        }
    }

    public static a a(a a1, Provider provider)
    {
        return new rk(a1, provider);
    }

    public final void a(Object obj)
    {
        obj = (SimpleFragmentWrapperActivity)obj;
        if (obj == null)
        {
            throw new NullPointerException("Cannot inject members into a null reference");
        } else
        {
            b.a(obj);
            obj.a = (ab)c.get();
            return;
        }
    }

    static 
    {
        boolean flag;
        if (!kik/android/chat/fragment/rk.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        a = flag;
    }
}
