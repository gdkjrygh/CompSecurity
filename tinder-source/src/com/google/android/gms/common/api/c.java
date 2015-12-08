// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.api;

import android.accounts.Account;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.support.v4.app.i;
import android.support.v4.app.m;
import android.util.SparseArray;
import android.view.View;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.g;
import com.google.android.gms.common.internal.u;
import com.google.android.gms.internal.dl;
import com.google.android.gms.internal.dp;
import com.google.android.gms.internal.dq;
import com.google.android.gms.internal.dw;
import com.google.android.gms.internal.eq;
import com.google.android.gms.internal.et;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.google.android.gms.common.api:
//            a

public abstract class com.google.android.gms.common.api.c
{
    public static final class a
    {

        i a;
        private Account b;
        private final Set c = new HashSet();
        private int d;
        private View e;
        private String f;
        private String g;
        private final Map h = new dw();
        private final Context i;
        private final Map j = new dw();
        private int k;
        private c l;
        private Looper m;
        private com.google.android.gms.common.b n;
        private a.a o;
        private final ArrayList p = new ArrayList();
        private final ArrayList q = new ArrayList();
        private et r;

        public final a a(com.google.android.gms.common.api.a a1)
        {
            u.a(a1, "Api must not be null");
            j.put(a1, null);
            Set set = c;
            a1.a();
            set.addAll(Collections.emptyList());
            return this;
        }

        public final a a(b b1)
        {
            u.a(b1, "Listener must not be null");
            p.add(b1);
            return this;
        }

        public final a a(c c1)
        {
            u.a(c1, "Listener must not be null");
            q.add(c1);
            return this;
        }

        public final g a()
        {
            et et1;
            if (j.containsKey(eq.g))
            {
                Account account;
                Set set;
                Map map;
                View view;
                String s;
                String s1;
                int i1;
                boolean flag;
                if (r == null)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                u.a(flag, "SignIn.API can't be used in conjunction with requestServerAuthCode.");
                r = (et)j.get(eq.g);
            }
            account = b;
            set = c;
            map = h;
            i1 = d;
            view = e;
            s = f;
            s1 = g;
            if (r != null)
            {
                et1 = r;
            } else
            {
                et1 = et.a;
            }
            return new g(account, set, map, i1, view, s, s1, et1);
        }

        final void a(dq dq1, com.google.android.gms.common.api.c c1)
        {
            int i1 = k;
            Object obj = l;
            u.a(c1, "GoogleApiClient instance cannot be null");
            boolean flag;
            if (dq1.c.indexOfKey(i1) < 0)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            u.a(flag, (new StringBuilder("Already managing a GoogleApiClient with id ")).append(i1).toString());
            obj = new com.google.android.gms.internal.dq.a(dq1, i1, c1, ((c) (obj)));
            dq1.c.put(i1, obj);
            if (dq1.a && !dq1.b)
            {
                c1.b();
            }
        }

        public final transient a b(com.google.android.gms.common.api.a a1)
        {
            u.a(a1, "Api must not be null");
            j.put(a1, null);
            a1.a();
            HashSet hashset = new HashSet(Collections.emptyList());
            h.put(a1, new com.google.android.gms.common.internal.g.a(hashset));
            return this;
        }

        public final com.google.android.gms.common.api.c b()
        {
            boolean flag;
            if (!j.isEmpty())
            {
                flag = true;
            } else
            {
                flag = false;
            }
            u.b(flag, "must call addApi() to add at least one API");
            if (k >= 0)
            {
                dl dl1 = new dl(i.getApplicationContext(), m, a(), n, o, j, p, q, k);
                dq dq1 = dq.a(a);
                if (dq1 == null)
                {
                    (new Handler(i.getMainLooper())).post(new Runnable(this, dl1) {

                        final com.google.android.gms.common.api.c a;
                        final a b;

                        public final void run()
                        {
                            if (b.a.isFinishing() || b.a.getSupportFragmentManager().g())
                            {
                                return;
                            } else
                            {
                                b.a(dq.b(b.a), a);
                                return;
                            }
                        }

            
            {
                b = a1;
                a = c1;
                super();
            }
                    });
                    return dl1;
                } else
                {
                    a(dq1, dl1);
                    return dl1;
                }
            } else
            {
                return new dl(i, m, a(), n, o, j, p, q, -1);
            }
        }

        public a(Context context)
        {
            k = -1;
            n = com.google.android.gms.common.b.a();
            o = eq.c;
            i = context;
            m = context.getMainLooper();
            f = context.getPackageName();
            g = context.getClass().getName();
        }
    }

    public static interface b
    {

        public abstract void a(int i);

        public abstract void a(Bundle bundle);
    }

    public static interface c
    {

        public abstract void a(ConnectionResult connectionresult);
    }

    public static interface d
    {

        public abstract a a();

        public abstract boolean b();
    }

    public static final class d.a
    {

        public boolean a;
        public Set b;
    }

    public static interface e
    {

        public abstract void a(ConnectionResult connectionresult);

        public abstract void b(ConnectionResult connectionresult);
    }


    public com.google.android.gms.common.api.c()
    {
    }

    public Looper a()
    {
        throw new UnsupportedOperationException();
    }

    public a.b a(a.c c1)
    {
        throw new UnsupportedOperationException();
    }

    public com.google.android.gms.internal.dg.a a(com.google.android.gms.internal.dg.a a1)
    {
        throw new UnsupportedOperationException();
    }

    public dp a(Object obj)
    {
        throw new UnsupportedOperationException();
    }

    public abstract void a(c c1);

    public abstract void a(String s, PrintWriter printwriter);

    public abstract boolean a(com.google.android.gms.common.api.a a1);

    public com.google.android.gms.internal.dg.a b(com.google.android.gms.internal.dg.a a1)
    {
        throw new UnsupportedOperationException();
    }

    public abstract void b();

    public abstract void b(c c1);

    public abstract void c();

    public abstract boolean d();

    public abstract boolean e();
}
