// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads.internal;

import android.content.Context;
import android.os.Handler;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.AdRequestParcel;
import com.google.android.gms.ads.internal.client.AdSizeParcel;
import com.google.android.gms.ads.internal.formats.NativeAdOptionsParcel;
import com.google.android.gms.ads.internal.formats.d;
import com.google.android.gms.ads.internal.formats.e;
import com.google.android.gms.ads.internal.formats.f;
import com.google.android.gms.ads.internal.formats.g;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.client.b;
import com.google.android.gms.common.internal.y;
import com.google.android.gms.internal.be;
import com.google.android.gms.internal.bi;
import com.google.android.gms.internal.bt;
import com.google.android.gms.internal.bu;
import com.google.android.gms.internal.bv;
import com.google.android.gms.internal.bw;
import com.google.android.gms.internal.dh;
import com.google.android.gms.internal.di;
import com.google.android.gms.internal.dk;
import com.google.android.gms.internal.dl;
import com.google.android.gms.internal.en;
import com.google.android.gms.internal.fc;
import com.google.android.gms.internal.gb;
import com.google.android.gms.internal.gm;
import com.google.android.gms.internal.ij;
import java.util.List;

// Referenced classes of package com.google.android.gms.ads.internal:
//            b, zzq, p, o

public final class n extends com.google.android.gms.ads.internal.b
{

    public n(Context context, AdSizeParcel adsizeparcel, String s, dh dh, VersionInfoParcel versioninfoparcel)
    {
        super(context, adsizeparcel, s, dh, versioninfoparcel, null);
    }

    private void a(d d1)
    {
        gm.a.post(new Runnable(d1) {

            final d a;
            final n b;

            public final void run()
            {
                try
                {
                    b.c.s.a(a);
                    return;
                }
                catch (RemoteException remoteexception)
                {
                    com.google.android.gms.ads.internal.util.client.b.b("Could not call OnAppInstallAdLoadedListener.onAppInstallAdLoaded().", remoteexception);
                }
            }

            
            {
                b = n.this;
                a = d1;
                super();
            }
        });
    }

    private void a(e e1)
    {
        gm.a.post(new Runnable(e1) {

            final e a;
            final n b;

            public final void run()
            {
                try
                {
                    b.c.t.a(a);
                    return;
                }
                catch (RemoteException remoteexception)
                {
                    com.google.android.gms.ads.internal.util.client.b.b("Could not call OnContentAdLoadedListener.onContentAdLoaded().", remoteexception);
                }
            }

            
            {
                b = n.this;
                a = e1;
                super();
            }
        });
    }

    public final bv a(String s)
    {
        y.b("getOnCustomClickListener must be called on the main UI thread.");
        return (bv)c.u.get(s);
    }

    public final void a(NativeAdOptionsParcel nativeadoptionsparcel)
    {
        y.b("setNativeAdOptions must be called on the main UI thread.");
        c.w = nativeadoptionsparcel;
    }

    public final void a(bi bi)
    {
        throw new IllegalStateException("CustomRendering is NOT supported by NativeAdManager.");
    }

    public final void a(bt bt)
    {
        y.b("setOnAppInstallAdLoadedListener must be called on the main UI thread.");
        c.s = bt;
    }

    public final void a(bu bu)
    {
        y.b("setOnContentAdLoadedListener must be called on the main UI thread.");
        c.t = bu;
    }

    public final void a(en en)
    {
        throw new IllegalStateException("In App Purchase is NOT supported by NativeAdManager.");
    }

    public final void a(com.google.android.gms.internal.gb.a a1, be be)
    {
        if (a1.d != null)
        {
            c.i = a1.d;
        }
        if (a1.e != -2)
        {
            gm.a.post(new Runnable(a1) {

                final com.google.android.gms.internal.gb.a a;
                final n b;

                public final void run()
                {
                    b.b(new gb(a));
                }

            
            {
                b = n.this;
                a = a1;
                super();
            }
            });
            return;
        } else
        {
            c.C = 0;
            zzq zzq1 = c;
            com.google.android.gms.ads.internal.p.d();
            zzq1.h = fc.a(c.c, this, a1, c.d, null, g, this, be);
            (new StringBuilder("AdRenderer: ")).append(c.h.getClass().getName());
            com.google.android.gms.ads.internal.util.client.b.a(3);
            return;
        }
    }

    public final void a(ij ij1)
    {
        y.b("setOnCustomTemplateAdLoadedListeners must be called on the main UI thread.");
        c.v = ij1;
    }

    public final void a(List list)
    {
        y.b("setNativeTemplates must be called on the main UI thread.");
        c.y = list;
    }

    protected final boolean a(AdRequestParcel adrequestparcel, gb gb1, boolean flag)
    {
        return b.d();
    }

    protected final boolean a(gb gb1, gb gb2)
    {
        Object obj;
        String s;
        s = null;
        obj = null;
        a(((List) (null)));
        if (!c.d())
        {
            throw new IllegalStateException("Native ad DOES NOT have custom rendering mode.");
        }
        if (!gb2.k) goto _L2; else goto _L1
_L1:
        Object obj2;
        Object obj3;
        obj2 = gb2.m.h();
        obj3 = gb2.m.i();
        if (obj2 == null) goto _L4; else goto _L3
_L3:
        List list;
        String s2;
        try
        {
            s = ((dk) (obj2)).a();
            obj3 = ((dk) (obj2)).b();
            String s1 = ((dk) (obj2)).c();
            if (((dk) (obj2)).d() != null)
            {
                obj = ((dk) (obj2)).d();
            }
            obj = new d(s, ((List) (obj3)), s1, ((com.google.android.gms.internal.bk) (obj)), ((dk) (obj2)).e(), ((dk) (obj2)).f(), ((dk) (obj2)).g(), ((dk) (obj2)).h(), null, ((dk) (obj2)).l());
            ((d) (obj)).a(new g(c.c, this, c.d, ((dk) (obj2))));
            a(((d) (obj)));
        }
        catch (RemoteException remoteexception)
        {
            com.google.android.gms.ads.internal.util.client.b.b("Failed to get native ad mapper", remoteexception);
        }
_L6:
        return super.a(gb1, gb2);
_L4:
        if (obj3 == null)
        {
            break MISSING_BLOCK_LABEL_337;
        }
        obj2 = ((dl) (obj3)).a();
        list = ((dl) (obj3)).b();
        s2 = ((dl) (obj3)).c();
        obj = s;
        if (((dl) (obj3)).d() != null)
        {
            obj = ((dl) (obj3)).d();
        }
        obj = new e(((String) (obj2)), list, s2, ((com.google.android.gms.internal.bk) (obj)), ((dl) (obj3)).e(), ((dl) (obj3)).f(), null, ((dl) (obj3)).j());
        ((e) (obj)).a(new g(c.c, this, c.d, ((dl) (obj3))));
        a(((e) (obj)));
        continue; /* Loop/switch isn't completed */
        com.google.android.gms.ads.internal.util.client.b.c("No matching mapper for retrieved native ad template.");
        a(0);
        return false;
_L2:
        Object obj1 = gb2.w;
        if ((obj1 instanceof e) && c.t != null)
        {
            a((e)gb2.w);
        } else
        if ((obj1 instanceof d) && c.s != null)
        {
            a((d)gb2.w);
        } else
        if ((obj1 instanceof f) && c.v != null && c.v.get(((f)obj1).k()) != null)
        {
            obj1 = ((f)obj1).k();
            gm.a.post(new Runnable(((String) (obj1)), gb2) {

                final String a;
                final gb b;
                final n c;

                public final void run()
                {
                    try
                    {
                        ((bw)c.c.v.get(a)).a((f)b.w);
                        return;
                    }
                    catch (RemoteException remoteexception1)
                    {
                        com.google.android.gms.ads.internal.util.client.b.b("Could not call onCustomTemplateAdLoadedListener.onCustomTemplateAdLoaded().", remoteexception1);
                    }
                }

            
            {
                c = n.this;
                a = s;
                b = gb1;
                super();
            }
            });
        } else
        {
            com.google.android.gms.ads.internal.util.client.b.c("No matching listener for retrieved native ad template.");
            a(0);
            return false;
        }
        if (true) goto _L6; else goto _L5
_L5:
    }

    public final void b(ij ij1)
    {
        y.b("setOnCustomClickListener must be called on the main UI thread.");
        c.u = ij1;
    }

    public final void d()
    {
        throw new IllegalStateException("Native Ad DOES NOT support pause().");
    }

    public final void f()
    {
        throw new IllegalStateException("Native Ad DOES NOT support resume().");
    }

    public final void g()
    {
        throw new IllegalStateException("Interstitial is NOT supported by NativeAdManager.");
    }

    public final void q()
    {
        a(c.j, false);
    }

    public final ij x()
    {
        y.b("getOnCustomTemplateAdLoadedListeners must be called on the main UI thread.");
        return c.v;
    }
}
