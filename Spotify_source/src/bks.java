// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.os.Handler;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.AdRequestParcel;
import com.google.android.gms.ads.internal.client.AdSizeParcel;
import com.google.android.gms.ads.internal.formats.NativeAdOptionsParcel;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import java.util.List;

public final class bks extends bkd
{

    public bks(Context context, AdSizeParcel adsizeparcel, String s, cex cex, VersionInfoParcel versioninfoparcel)
    {
        super(context, adsizeparcel, s, cex, versioninfoparcel, null);
    }

    private void a(bhc bhc1)
    {
        cjj.a.post(new Runnable(bhc1) {

            private bhc a;
            private bks b;

            public final void run()
            {
                try
                {
                    b.c.s.a(a);
                    return;
                }
                catch (RemoteException remoteexception)
                {
                    bka.c("Could not call OnAppInstallAdLoadedListener.onAppInstallAdLoaded().", remoteexception);
                }
            }

            
            {
                b = bks.this;
                a = bhc1;
                super();
            }
        });
    }

    private void a(bhd bhd1)
    {
        cjj.a.post(new Runnable(bhd1) {

            private bhd a;
            private bks b;

            public final void run()
            {
                try
                {
                    b.c.t.a(a);
                    return;
                }
                catch (RemoteException remoteexception)
                {
                    bka.c("Could not call OnContentAdLoadedListener.onContentAdLoaded().", remoteexception);
                }
            }

            
            {
                b = bks.this;
                a = bhd1;
                super();
            }
        });
    }

    public final cct a(String s)
    {
        btl.b("getOnCustomClickListener must be called on the main UI thread.");
        return (cct)c.u.get(s);
    }

    public final void a(cbp cbp)
    {
        throw new IllegalStateException("CustomRendering is NOT supported by NativeAdManager.");
    }

    public final void a(ccn ccn)
    {
        btl.b("setOnAppInstallAdLoadedListener must be called on the main UI thread.");
        c.s = ccn;
    }

    public final void a(ccq ccq)
    {
        btl.b("setOnContentAdLoadedListener must be called on the main UI thread.");
        c.t = ccq;
    }

    public final void a(cgv cgv)
    {
        throw new IllegalStateException("In App Purchase is NOT supported by NativeAdManager.");
    }

    public final void a(ciu ciu1, cbk cbk)
    {
        if (ciu1.d != null)
        {
            c.i = ciu1.d;
        }
        if (ciu1.e != -2)
        {
            cjj.a.post(new Runnable(ciu1) {

                private ciu a;
                private bks b;

                public final void run()
                {
                    b.b(new cit(a));
                }

            
            {
                b = bks.this;
                a = ciu1;
                super();
            }
            });
            return;
        } else
        {
            c.C = 0;
            bkw bkw1 = c;
            bkv.d();
            bkw1.h = chp.a(c.c, this, ciu1, c.d, null, g, this, cbk);
            bka.a((new StringBuilder("AdRenderer: ")).append(c.h.getClass().getName()).toString());
            return;
        }
    }

    public final void a(cnm cnm1)
    {
        btl.b("setOnCustomTemplateAdLoadedListeners must be called on the main UI thread.");
        c.v = cnm1;
    }

    public final void a(NativeAdOptionsParcel nativeadoptionsparcel)
    {
        btl.b("setNativeAdOptions must be called on the main UI thread.");
        c.w = nativeadoptionsparcel;
    }

    public final void a(List list)
    {
        btl.b("setNativeTemplates must be called on the main UI thread.");
        c.y = list;
    }

    protected final boolean a(cit cit1, cit cit2)
    {
        Object obj;
        String s;
        s = null;
        obj = null;
        a(((List) (null)));
        if (!c.c())
        {
            throw new IllegalStateException("Native ad DOES NOT have custom rendering mode.");
        }
        if (!cit2.k) goto _L2; else goto _L1
_L1:
        Object obj2;
        Object obj3;
        obj2 = cit2.m.h();
        obj3 = cit2.m.i();
        if (obj2 == null) goto _L4; else goto _L3
_L3:
        List list;
        String s2;
        try
        {
            s = ((cfj) (obj2)).a();
            obj3 = ((cfj) (obj2)).b();
            String s1 = ((cfj) (obj2)).c();
            if (((cfj) (obj2)).d() != null)
            {
                obj = ((cfj) (obj2)).d();
            }
            obj = new bhc(s, ((List) (obj3)), s1, ((cbs) (obj)), ((cfj) (obj2)).e(), ((cfj) (obj2)).f(), ((cfj) (obj2)).g(), ((cfj) (obj2)).h(), null, ((cfj) (obj2)).l());
            ((bhc) (obj)).a(new bhf(c.c, this, c.d, ((cfj) (obj2))));
            a(((bhc) (obj)));
        }
        catch (RemoteException remoteexception)
        {
            bka.c("Failed to get native ad mapper", remoteexception);
        }
_L6:
        return super.a(cit1, cit2);
_L4:
        if (obj3 == null)
        {
            break MISSING_BLOCK_LABEL_337;
        }
        obj2 = ((cfm) (obj3)).a();
        list = ((cfm) (obj3)).b();
        s2 = ((cfm) (obj3)).c();
        obj = s;
        if (((cfm) (obj3)).d() != null)
        {
            obj = ((cfm) (obj3)).d();
        }
        obj = new bhd(((String) (obj2)), list, s2, ((cbs) (obj)), ((cfm) (obj3)).e(), ((cfm) (obj3)).f(), null, ((cfm) (obj3)).j());
        ((bhd) (obj)).a(new bhf(c.c, this, c.d, ((cfm) (obj3))));
        a(((bhd) (obj)));
        continue; /* Loop/switch isn't completed */
        bka.e("No matching mapper for retrieved native ad template.");
        a(0);
        return false;
_L2:
        Object obj1 = cit2.u;
        if ((obj1 instanceof bhd) && c.t != null)
        {
            a((bhd)cit2.u);
        } else
        if ((obj1 instanceof bhc) && c.s != null)
        {
            a((bhc)cit2.u);
        } else
        if ((obj1 instanceof bhe) && c.v != null && c.v.get(((bhe)obj1).k()) != null)
        {
            obj1 = ((bhe)obj1).k();
            cjj.a.post(new Runnable(((String) (obj1)), cit2) {

                private String a;
                private cit b;
                private bks c;

                public final void run()
                {
                    try
                    {
                        ((ccw)c.c.v.get(a)).a((bhe)b.u);
                        return;
                    }
                    catch (RemoteException remoteexception1)
                    {
                        bka.c("Could not call onCustomTemplateAdLoadedListener.onCustomTemplateAdLoaded().", remoteexception1);
                    }
                }

            
            {
                c = bks.this;
                a = s;
                b = cit1;
                super();
            }
            });
        } else
        {
            bka.e("No matching listener for retrieved native ad template.");
            a(0);
            return false;
        }
        if (true) goto _L6; else goto _L5
_L5:
    }

    protected final boolean a(AdRequestParcel adrequestparcel, cit cit1, boolean flag)
    {
        return b.d;
    }

    public final void b(cnm cnm1)
    {
        btl.b("setOnCustomClickListener must be called on the main UI thread.");
        c.u = cnm1;
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

    public final void r()
    {
        a(c.j, false);
    }

    public final cnm y()
    {
        btl.b("getOnCustomTemplateAdLoadedListeners must be called on the main UI thread.");
        return c.v;
    }
}
