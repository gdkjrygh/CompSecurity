// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.api;

import android.accounts.Account;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.l;
import android.view.View;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.i;
import com.google.android.gms.common.internal.y;
import com.google.android.gms.internal.if;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.google.android.gms.common.api:
//            u, a, o, v

public interface com.google.android.gms.common.api.c
{
    public static final class a
    {

        private Account a;
        private final Set b = new HashSet();
        private int c;
        private View d;
        private String e;
        private String f;
        private final Map g = new if();
        private final Context h;
        private final Map i = new if();
        private FragmentActivity j;
        private int k;
        private int l;
        private c m;
        private Looper n;
        private com.google.android.gms.common.b o;
        private a.a p;
        private final ArrayList q = new ArrayList();
        private final ArrayList r = new ArrayList();
        private com.google.android.gms.signin.e.a s;

        static FragmentActivity a(a a1)
        {
            return a1.j;
        }

        static void a(a a1, u u1, com.google.android.gms.common.api.c c1)
        {
            a1.a(u1, c1);
        }

        private void a(u u1, com.google.android.gms.common.api.c c1)
        {
            u1.a(k, c1, m);
        }

        public final a a(com.google.android.gms.common.api.a a1)
        {
            i.put(a1, null);
            b.addAll(a1.a().a());
            return this;
        }

        public final a a(b b1)
        {
            q.add(b1);
            return this;
        }

        public final a a(c c1)
        {
            r.add(c1);
            return this;
        }

        public final i a()
        {
            return new i(a, b, g, c, d, e, f, s.a());
        }

        public final transient a b(com.google.android.gms.common.api.a a1)
        {
            i.put(a1, null);
            HashSet hashset = new HashSet(a1.a().a());
            g.put(a1, new com.google.android.gms.common.internal.i.a(hashset));
            return this;
        }

        public final com.google.android.gms.common.api.c b()
        {
            boolean flag;
            if (!i.isEmpty())
            {
                flag = true;
            } else
            {
                flag = false;
            }
            y.b(flag, "must call addApi() to add at least one API");
            if (k >= 0)
            {
                o o1 = new o(h.getApplicationContext(), n, a(), o, p, i, q, r, k, -1);
                u u1 = u.a(j);
                if (u1 == null)
                {
                    (new Handler(h.getMainLooper())).post(new Runnable(this, o1) {

                        final com.google.android.gms.common.api.c a;
                        final a b;

                        public final void run()
                        {
                            if (a.a(b).isFinishing() || a.a(b).getSupportFragmentManager().g())
                            {
                                return;
                            } else
                            {
                                a.a(b, u.b(a.a(b)), a);
                                return;
                            }
                        }

            
            {
                b = a1;
                a = c1;
                super();
            }
                    });
                } else
                {
                    a(u1, o1);
                }
                return o1;
            }
            if (l < 0) goto _L2; else goto _L1
_L1:
            v v1;
            int i1;
            v1 = v.a(j);
            i1 = l;
            if (v1.getActivity() == null) goto _L4; else goto _L3
_L3:
            Object obj = v1.b(i1);
            if (obj == null) goto _L4; else goto _L5
_L5:
            obj = ((v.a) (obj)).j;
_L6:
            Object obj1 = obj;
            if (obj == null)
            {
                obj1 = new o(h.getApplicationContext(), n, a(), o, p, i, q, r, -1, l);
            }
            v1.a(l, ((com.google.android.gms.common.api.c) (obj1)), m);
            return ((com.google.android.gms.common.api.c) (obj1));
_L4:
            obj = null;
            if (true) goto _L6; else goto _L2
_L2:
            return new o(h, n, a(), o, p, i, q, r, -1, -1);
        }

        public a(Context context)
        {
            k = -1;
            l = -1;
            o = com.google.android.gms.common.b.a();
            p = com.google.android.gms.signin.b.c;
            s = new com.google.android.gms.signin.e.a();
            h = context;
            n = context.getMainLooper();
            e = context.getPackageName();
            f = context.getClass().getName();
        }
    }

    public static interface b
    {

        public abstract void onConnected(Bundle bundle);

        public abstract void onConnectionSuspended(int i);
    }

    public static interface c
    {

        public abstract void onConnectionFailed(ConnectionResult connectionresult);
    }

    public static interface d
    {

        public abstract a a();

        public abstract boolean b();
    }

    public static final class d.a
    {

        private boolean a;
        private Set b;

        public final boolean a()
        {
            return a;
        }

        public final Set b()
        {
            return b;
        }
    }

    public static interface e
    {

        public abstract void a(ConnectionResult connectionresult);

        public abstract void b(ConnectionResult connectionresult);
    }


    public abstract Looper a();

    public abstract k.a a(k.a a1);

    public abstract void a(b b1);

    public abstract void a(c c1);

    public abstract void a(String s, PrintWriter printwriter);

    public abstract k.a b(k.a a1);

    public abstract void b();

    public abstract void b(b b1);

    public abstract void b(c c1);

    public abstract void c();

    public abstract boolean d();

    public abstract boolean e();
}
