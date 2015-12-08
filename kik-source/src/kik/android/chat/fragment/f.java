// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.chat.fragment;

import a.a;
import com.kik.cache.ad;
import javax.inject.Provider;
import kik.a.e.l;

// Referenced classes of package kik.android.chat.fragment:
//            BaseChatInfoFragment

public final class f
    implements a
{

    static final boolean a;
    private final a b;
    private final Provider c;
    private final Provider d;
    private final Provider e;

    private f(a a1, Provider provider, Provider provider1, Provider provider2)
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
        return new f(a1, provider, provider1, provider2);
    }

    public final void a(Object obj)
    {
        obj = (BaseChatInfoFragment)obj;
        if (obj == null)
        {
            throw new NullPointerException("Cannot inject members into a null reference");
        } else
        {
            b.a(obj);
            obj.n = (l)c.get();
            obj.o = (com.kik.android.a)d.get();
            obj.p = (ad)e.get();
            return;
        }
    }

    static 
    {
        boolean flag;
        if (!kik/android/chat/fragment/f.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        a = flag;
    }
}
