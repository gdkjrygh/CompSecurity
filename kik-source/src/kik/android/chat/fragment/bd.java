// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.chat.fragment;

import a.a;
import javax.inject.Provider;
import kik.a.e.r;

// Referenced classes of package kik.android.chat.fragment:
//            KikAddContactFragment

public final class bd
    implements a
{

    static final boolean a;
    private final a b;
    private final Provider c;
    private final Provider d;

    private bd(a a1, Provider provider, Provider provider1)
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
        return new bd(a1, provider, provider1);
    }

    public final void a(Object obj)
    {
        obj = (KikAddContactFragment)obj;
        if (obj == null)
        {
            throw new NullPointerException("Cannot inject members into a null reference");
        } else
        {
            b.a(obj);
            obj.a = (com.kik.android.a)c.get();
            obj.b = (r)d.get();
            return;
        }
    }

    static 
    {
        boolean flag;
        if (!kik/android/chat/fragment/bd.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        a = flag;
    }
}
