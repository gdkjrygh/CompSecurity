// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.inject;

import com.facebook.debug.d.e;
import com.google.common.a.kl;
import com.google.inject.a;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import javax.inject.Singleton;

// Referenced classes of package com.facebook.inject:
//            au, ax, ay, s, 
//            f, t, az, ad

public class ba
    implements au, ax, ay
{

    private final boolean a;
    private t b;
    private List c;

    ba(boolean flag)
    {
        a = flag;
    }

    private void b()
    {
        e e1 = e.a("SingletonScope.initializeEagerSingletons");
        Iterator iterator = c.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            s s1 = (s)iterator.next();
            if (s1.b == f.EAGER)
            {
                e e2 = e.a((new StringBuilder()).append("Key: ").append(s1.a).toString());
                b.a(s1.a);
                e2.a();
            }
        } while (true);
        e1.a();
    }

    public javax.inject.a a(a a1, javax.inject.a a2)
    {
        return new az(a2);
    }

    void a()
    {
        java.util.HashSet hashset = kl.a();
        Iterator iterator = c.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            s s1 = (s)iterator.next();
            if (s1.b == f.LESS_EAGER_ON_UI_THREAD)
            {
                hashset.add(s1.a);
            }
        } while (true);
        (new ad(b)).a(hashset);
    }

    public void a(t t1)
    {
        b = t1;
    }

    public void a(List list)
    {
        c = list;
        if (a)
        {
            b();
        }
    }

    public Class annotationType()
    {
        return javax/inject/Singleton;
    }
}
