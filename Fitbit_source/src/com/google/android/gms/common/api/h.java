// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.api;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.support.v4.app.FragmentActivity;
import android.view.View;
import com.google.android.gms.common.b;
import com.google.android.gms.internal.am;
import com.google.android.gms.internal.jg;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;

// Referenced classes of package com.google.android.gms.common.api:
//            q, Scope, i, g, 
//            p, a

public interface h
{
    public static final class a
    {

        private String a;
        private final Set b;
        private int c;
        private View d;
        private String e;
        private final Context f;
        private final Map g;
        private FragmentActivity h;
        private int i;
        private c j;
        private Looper k;
        private final Set l;
        private final Set m;

        private h d()
        {
            g g1 = com.google.android.gms.common.api.g.a(h);
            h h1 = g1.a(i);
            Object obj = h1;
            if (h1 == null)
            {
                obj = new p(f.getApplicationContext(), k, b(), g, l, m, i);
            }
            g1.a(i, ((h) (obj)), j);
            return ((h) (obj));
        }

        public a a()
        {
            return a("<<default account>>");
        }

        public a a(int i1)
        {
            c = i1;
            return this;
        }

        public a a(Handler handler)
        {
            am.a(handler, "Handler must not be null");
            k = handler.getLooper();
            return this;
        }

        public a a(FragmentActivity fragmentactivity, int i1, c c1)
        {
            boolean flag;
            if (i1 >= 0)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            am.b(flag, "clientId must be non-negative");
            i = i1;
            h = (FragmentActivity)am.a(fragmentactivity, "Null activity is not permitted.");
            j = c1;
            return this;
        }

        public a a(View view)
        {
            d = view;
            return this;
        }

        public a a(Scope scope)
        {
            b.add(scope.a());
            return this;
        }

        public a a(com.google.android.gms.common.api.a a1)
        {
            g.put(a1, null);
            a1 = a1.b();
            int j1 = a1.size();
            for (int i1 = 0; i1 < j1; i1++)
            {
                b.add(((Scope)a1.get(i1)).a());
            }

            return this;
        }

        public a a(com.google.android.gms.common.api.a a1, a.a.a a2)
        {
            am.a(a2, "Null options are not permitted for this Api");
            g.put(a1, a2);
            a1 = a1.b();
            int j1 = a1.size();
            for (int i1 = 0; i1 < j1; i1++)
            {
                b.add(((Scope)a1.get(i1)).a());
            }

            return this;
        }

        public a a(b b1)
        {
            l.add(b1);
            return this;
        }

        public a a(c c1)
        {
            m.add(c1);
            return this;
        }

        public a a(String s)
        {
            a = s;
            return this;
        }

        public jg b()
        {
            return new jg(a, b, c, d, e);
        }

        public h c()
        {
            boolean flag;
            if (!g.isEmpty())
            {
                flag = true;
            } else
            {
                flag = false;
            }
            am.b(flag, "must call addApi() to add at least one API");
            if (i >= 0)
            {
                return d();
            } else
            {
                return new p(f, k, b(), g, l, m, -1);
            }
        }

        public a(Context context)
        {
            b = new HashSet();
            g = new HashMap();
            i = -1;
            l = new HashSet();
            m = new HashSet();
            f = context;
            k = context.getMainLooper();
            e = context.getPackageName();
        }

        public a(Context context, b b1, c c1)
        {
            this(context);
            am.a(b1, "Must provide a connected listener");
            l.add(b1);
            am.a(c1, "Must provide a connection failed listener");
            m.add(c1);
        }
    }

    public static interface b
    {

        public static final int c = 1;
        public static final int d = 2;

        public abstract void a(int i);

        public abstract void a(Bundle bundle);
    }

    public static interface c
        extends com.google.android.gms.common.d.b
    {

        public abstract void a(com.google.android.gms.common.b b1);
    }


    public abstract Looper a();

    public abstract a.b a(a.d d1);

    public abstract b.c a(b.c c1);

    public abstract q a(Object obj);

    public abstract com.google.android.gms.common.b a(long l, TimeUnit timeunit);

    public abstract void a(FragmentActivity fragmentactivity);

    public abstract void a(b b1);

    public abstract void a(c c1);

    public abstract boolean a(Scope scope);

    public abstract b.c b(b.c c1);

    public abstract void b();

    public abstract boolean b(b b1);

    public abstract boolean b(c c1);

    public abstract com.google.android.gms.common.b c();

    public abstract void c(b b1);

    public abstract void c(c c1);

    public abstract void d();

    public abstract void e();

    public abstract i f();

    public abstract boolean g();

    public abstract boolean h();
}
