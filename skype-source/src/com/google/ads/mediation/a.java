// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.ads.mediation;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.b;
import com.google.android.gms.ads.b.c;
import com.google.android.gms.ads.b.e;
import com.google.android.gms.ads.b.f;
import com.google.android.gms.ads.b.h;
import com.google.android.gms.ads.b.i;
import com.google.android.gms.ads.b.j;
import com.google.android.gms.ads.b.k;
import com.google.android.gms.ads.b.l;
import com.google.android.gms.ads.d;
import com.google.android.gms.ads.formats.NativeAdView;
import com.google.android.gms.ads.internal.client.n;
import java.util.Iterator;
import java.util.Set;

public abstract class com.google.ads.mediation.a
    implements com.google.android.gms.ads.b.c, com.google.android.gms.ads.b.e, k
{
    static final class a extends h
    {

        private final com.google.android.gms.ads.formats.c d;

        public final void a(View view)
        {
            if (view instanceof NativeAdView)
            {
                ((NativeAdView)view).setNativeAd(d);
            }
        }

        public a(com.google.android.gms.ads.formats.c c1)
        {
            d = c1;
            a(c1.b().toString());
            a(c1.c());
            b(c1.d().toString());
            a(c1.e());
            c(c1.f().toString());
            a(c1.g().doubleValue());
            d(c1.h().toString());
            e(c1.i().toString());
            a();
            b();
        }
    }

    static final class b extends i
    {

        private final com.google.android.gms.ads.formats.d d;

        public final void a(View view)
        {
            if (view instanceof NativeAdView)
            {
                ((NativeAdView)view).setNativeAd(d);
            }
        }

        public b(com.google.android.gms.ads.formats.d d1)
        {
            d = d1;
            a(d1.b().toString());
            a(d1.c());
            b(d1.d().toString());
            a(d1.e());
            c(d1.f().toString());
            d(d1.g().toString());
            a();
            b();
        }
    }

    static final class c extends com.google.android.gms.ads.a
        implements com.google.android.gms.ads.internal.client.a
    {

        final com.google.ads.mediation.a a;
        final com.google.android.gms.ads.b.d b;

        public final void a()
        {
            b.a();
        }

        public final void a(int i)
        {
            b.a(i);
        }

        public final void b()
        {
            b.b();
        }

        public final void c()
        {
            b.c();
        }

        public final void d()
        {
            b.d();
        }

        public final void e()
        {
            b.e();
        }

        public c(com.google.ads.mediation.a a1, com.google.android.gms.ads.b.d d1)
        {
            a = a1;
            b = d1;
        }
    }

    static final class d extends com.google.android.gms.ads.a
        implements com.google.android.gms.ads.internal.client.a
    {

        final com.google.ads.mediation.a a;
        final f b;

        public final void a()
        {
            b.f();
        }

        public final void a(int i)
        {
            b.b(i);
        }

        public final void b()
        {
            b.g();
        }

        public final void c()
        {
            b.h();
        }

        public final void d()
        {
            b.i();
        }

        public final void e()
        {
            b.j();
        }

        public d(com.google.ads.mediation.a a1, f f1)
        {
            a = a1;
            b = f1;
        }
    }

    static final class e extends com.google.android.gms.ads.a
        implements com.google.android.gms.ads.formats.c.a, com.google.android.gms.ads.formats.d.a, com.google.android.gms.ads.internal.client.a
    {

        final com.google.ads.mediation.a a;
        final l b;

        public final void a()
        {
        }

        public final void a(int i)
        {
            b.c(i);
        }

        public final void a(com.google.android.gms.ads.formats.c c1)
        {
            b.a(new a(c1));
        }

        public final void a(com.google.android.gms.ads.formats.d d1)
        {
            b.a(new b(d1));
        }

        public final void b()
        {
            b.k();
        }

        public final void c()
        {
            b.l();
        }

        public final void d()
        {
            b.m();
        }

        public final void e()
        {
            b.n();
        }

        public e(com.google.ads.mediation.a a1, l l1)
        {
            a = a1;
            b = l1;
        }
    }


    protected AdView a;
    protected com.google.android.gms.ads.e b;
    private com.google.android.gms.ads.b c;

    public com.google.ads.mediation.a()
    {
    }

    private com.google.android.gms.ads.c a(Context context, com.google.android.gms.ads.b.a a1, Bundle bundle, Bundle bundle1)
    {
        com.google.android.gms.ads.c.a a2 = new com.google.android.gms.ads.c.a();
        Object obj = a1.a();
        if (obj != null)
        {
            a2.a(((java.util.Date) (obj)));
        }
        int i = a1.b();
        if (i != 0)
        {
            a2.a(i);
        }
        obj = a1.c();
        if (obj != null)
        {
            for (obj = ((Set) (obj)).iterator(); ((Iterator) (obj)).hasNext(); a2.a((String)((Iterator) (obj)).next())) { }
        }
        obj = a1.d();
        if (obj != null)
        {
            a2.a(((android.location.Location) (obj)));
        }
        if (a1.f())
        {
            n.a();
            a2.b(com.google.android.gms.ads.internal.util.client.a.a(context));
        }
        if (a1.e() != -1)
        {
            boolean flag;
            if (a1.e() == 1)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            a2.a(flag);
        }
        a2.a(com/google/ads/mediation/a/a, a(bundle, bundle1));
        return a2.a();
    }

    protected abstract Bundle a(Bundle bundle, Bundle bundle1);

    public final void a()
    {
        if (a != null)
        {
            a.a();
            a = null;
        }
        if (b != null)
        {
            b = null;
        }
        if (c != null)
        {
            c = null;
        }
    }

    public final void a(Context context, com.google.android.gms.ads.b.d d1, Bundle bundle, com.google.android.gms.ads.d d2, com.google.android.gms.ads.b.a a1, Bundle bundle1)
    {
        a = new AdView(context);
        a.setAdSize(new com.google.android.gms.ads.d(d2.b(), d2.a()));
        a.setAdUnitId(bundle.getString("pubid"));
        a.setAdListener(new c(this, d1));
        a.a(a(context, a1, bundle1, bundle));
    }

    public final void a(Context context, f f, Bundle bundle, com.google.android.gms.ads.b.a a1, Bundle bundle1)
    {
        b = new com.google.android.gms.ads.e(context);
        b.a(bundle.getString("pubid"));
        b.a(new d(this, f));
        b.a(a(context, a1, bundle1, bundle));
    }

    public final void a(Context context, l l, Bundle bundle, j j1, Bundle bundle1)
    {
        l = new e(this, l);
        com.google.android.gms.ads.b.a a1 = (new com.google.android.gms.ads.b.a(context, bundle.getString("pubid"))).a(l);
        com.google.android.gms.ads.formats.b b1 = j1.g();
        if (b1 != null)
        {
            a1.a(b1);
        }
        if (j1.h())
        {
            a1.a(l);
        }
        if (j1.i())
        {
            a1.a(l);
        }
        c = a1.a();
        c.a(a(context, ((com.google.android.gms.ads.b.a) (j1)), bundle1, bundle));
    }

    public final void b()
    {
        if (a != null)
        {
            a.b();
        }
    }

    public final void c()
    {
        if (a != null)
        {
            a.c();
        }
    }

    public final View d()
    {
        return a;
    }

    public final void e()
    {
        b.a();
    }
}
