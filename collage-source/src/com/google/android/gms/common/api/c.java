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
import android.support.v4.app.FragmentManager;
import android.view.View;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.i;
import com.google.android.gms.common.internal.z;
import com.google.android.gms.internal.iq;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.google.android.gms.common.api:
//            zzp, n, zzq, a

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
        private final Map g = new iq();
        private final Context h;
        private final Map i = new iq();
        private FragmentActivity j;
        private int k;
        private int l;
        private c m;
        private Looper n;
        private com.google.android.gms.common.b o;
        private a.b p;
        private final ArrayList q = new ArrayList();
        private final ArrayList r = new ArrayList();
        private com.google.android.gms.signin.e.a s;

        static FragmentActivity a(a a1)
        {
            return a1.j;
        }

        static void a(a a1, zzp zzp1, com.google.android.gms.common.api.c c1)
        {
            a1.a(zzp1, c1);
        }

        private void a(zzp zzp1, com.google.android.gms.common.api.c c1)
        {
            zzp1.a(k, c1, m);
        }

        private com.google.android.gms.common.api.c c()
        {
            n n1 = new n(h.getApplicationContext(), n, a(), o, p, i, q, r, k, -1);
            zzp zzp1 = zzp.a(j);
            if (zzp1 == null)
            {
                (new Handler(h.getMainLooper())).post(new GoogleApiClient.Builder._cls1(this, n1));
                return n1;
            } else
            {
                a(zzp1, n1);
                return n1;
            }
        }

        private com.google.android.gms.common.api.c d()
        {
            zzq zzq1 = zzq.a(j);
            com.google.android.gms.common.api.c c1 = zzq1.a(l);
            Object obj = c1;
            if (c1 == null)
            {
                obj = new n(h.getApplicationContext(), n, a(), o, p, i, q, r, -1, l);
            }
            zzq1.a(l, ((com.google.android.gms.common.api.c) (obj)), m);
            return ((com.google.android.gms.common.api.c) (obj));
        }

        public a a(com.google.android.gms.common.api.a a1)
        {
            i.put(a1, null);
            b.addAll(a1.a().a(null));
            return this;
        }

        public a a(b b1)
        {
            q.add(b1);
            return this;
        }

        public a a(c c1)
        {
            r.add(c1);
            return this;
        }

        public i a()
        {
            return new i(a, b, g, c, d, e, f, s.a());
        }

        public com.google.android.gms.common.api.c b()
        {
            boolean flag;
            if (!i.isEmpty())
            {
                flag = true;
            } else
            {
                flag = false;
            }
            z.b(flag, "must call addApi() to add at least one API");
            if (k >= 0)
            {
                return c();
            }
            if (l >= 0)
            {
                return d();
            } else
            {
                return new n(h, n, a(), o, p, i, q, r, -1, -1);
            }
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

        public abstract a a(String s, Set set);

        public abstract boolean a(String s, String s1);
    }

    public static class d.a
    {

        private boolean a;
        private Set b;

        public boolean a()
        {
            return a;
        }

        public Set b()
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

    public abstract void a(String s, FileDescriptor filedescriptor, PrintWriter printwriter, String as[]);

    public abstract void b();

    public abstract void b(b b1);

    public abstract void b(c c1);

    public abstract void c();

    public abstract boolean d();

    public abstract boolean e();

    // Unreferenced inner class com/google/android/gms/common/api/GoogleApiClient$Builder$1

/* anonymous class */
    class GoogleApiClient.Builder._cls1
        implements Runnable
    {

        final com.google.android.gms.common.api.c a;
        final a b;

        public void run()
        {
            if (a.a(b).isFinishing() || a.a(b).getSupportFragmentManager().isDestroyed())
            {
                return;
            } else
            {
                a.a(b, zzp.b(a.a(b)), a);
                return;
            }
        }

            
            {
                b = a1;
                a = c1;
                super();
            }
    }

}
