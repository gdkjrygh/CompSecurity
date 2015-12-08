// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.gsa.a.a;

import android.content.Context;
import com.google.android.apps.gsa.a.a;
import com.google.android.apps.gsa.a.c;
import com.google.android.apps.gsa.a.d;
import com.google.android.apps.gsa.b.a.a.o;
import com.google.android.apps.gsa.shared.io.b;
import com.google.android.apps.gsa.shared.io.k;
import com.google.android.apps.gsa.shared.util.h;
import com.google.android.apps.gsa.shared.util.j;
import com.google.common.base.Suppliers;
import com.google.common.base.p;
import com.google.common.base.s;
import com.google.g.a.a.t;
import java.lang.reflect.Proxy;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

public final class e
{

    private final c a;
    private final com.google.android.apps.gsa.shared.util.b b = new h();
    private final com.google.android.apps.gsa.shared.io.h c;
    private final s d;
    private a e;

    public e(Context context, c c1, s s1, Executor executor)
    {
        boolean flag1 = true;
        super();
        Class aclass[] = c1.getClass().getInterfaces();
        Class class1 = aclass[0];
        boolean flag;
        if (aclass.length == 1)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        p.a(flag, "Delegate must implement a single interface");
        p.a(executor);
        executor = new j(executor, c1, class1);
        p.a(executor);
        p.a(class1);
        p.a(c1);
        a = (c)Proxy.newProxyInstance(class1.getClassLoader(), new Class[] {
            class1
        }, executor);
        if (context == context.getApplicationContext())
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        p.a(flag);
        c1 = Suppliers.a(Boolean.TRUE);
        c = new o(context, Executors.newCachedThreadPool(), new k(b), c1, new b());
        d = s1;
    }

    public final void a()
    {
        if (e != null)
        {
            e.b();
            e = null;
        }
    }

    public final void a(com.google.android.apps.gsa.speech.c.a.b b1)
    {
        b1 = Suppliers.a(b1);
        if (e == null)
        {
            e = new a(b, a, c, (t)d.get(), b1, new d());
            e.a();
        }
    }
}
