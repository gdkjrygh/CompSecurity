// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.chat.fragment;

import a.a;
import javax.inject.Provider;
import kik.a.e.f;

// Referenced classes of package kik.android.chat.fragment:
//            KikIqFragmentBase

public final class mc
    implements a
{

    static final boolean a;
    private final a b;
    private final Provider c;

    private mc(a a1, Provider provider)
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
        return new mc(a1, provider);
    }

    public final void a(Object obj)
    {
        obj = (KikIqFragmentBase)obj;
        if (obj == null)
        {
            throw new NullPointerException("Cannot inject members into a null reference");
        } else
        {
            b.a(obj);
            obj.S = (f)c.get();
            return;
        }
    }

    static 
    {
        boolean flag;
        if (!kik/android/chat/fragment/mc.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        a = flag;
    }
}
