// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads.internal;

import android.os.RemoteException;
import android.text.TextUtils;
import android.view.View;
import com.google.android.gms.ads.internal.client.AdRequestParcel;
import com.google.android.gms.ads.internal.client.AdSizeParcel;
import com.google.android.gms.ads.internal.client.ThinAdSizeParcel;
import com.google.android.gms.ads.internal.client.zzf;
import com.google.android.gms.ads.internal.client.zzl;
import com.google.android.gms.ads.internal.client.zzo;
import com.google.android.gms.ads.internal.client.zzu;
import com.google.android.gms.ads.internal.client.zzv;
import com.google.android.gms.ads.internal.overlay.zzn;
import com.google.android.gms.ads.internal.request.AdResponseParcel;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.client.zzb;
import com.google.android.gms.b.a;
import com.google.android.gms.b.d;
import com.google.android.gms.common.GooglePlayServicesUtil;
import com.google.android.gms.common.internal.bl;
import com.google.android.gms.internal.as;
import com.google.android.gms.internal.cx;
import com.google.android.gms.internal.cy;
import com.google.android.gms.internal.dc;
import com.google.android.gms.internal.dk;
import com.google.android.gms.internal.dm;
import com.google.android.gms.internal.ds;
import com.google.android.gms.internal.fl;
import com.google.android.gms.internal.li;
import com.google.android.gms.internal.lu;
import com.google.android.gms.internal.mo;
import com.google.android.gms.internal.pa;
import com.google.android.gms.internal.pb;
import com.google.android.gms.internal.pc;
import com.google.android.gms.internal.pe;
import com.google.android.gms.internal.pg;
import com.google.android.gms.internal.ph;
import com.google.android.gms.internal.qa;
import com.google.android.gms.internal.qd;
import com.google.android.gms.internal.ry;
import com.google.android.gms.internal.zzja;
import java.util.HashSet;

// Referenced classes of package com.google.android.gms.ads.internal:
//            zzo, zzp, zzq, zzd

public abstract class zza extends com.google.android.gms.ads.internal.client.zzs.zza
    implements com.google.android.gms.ads.internal.client.zza, zzn, com.google.android.gms.ads.internal.request.zza, fl, mo, pg
{

    protected dm a;
    protected dk b;
    protected dk c;
    boolean d;
    protected final com.google.android.gms.ads.internal.zzo e = new com.google.android.gms.ads.internal.zzo(this);
    protected final zzq f;
    protected transient AdRequestParcel g;
    protected final as h = zzp.zzby().i();
    protected final zzd i;

    zza(zzq zzq1, zzd zzd1)
    {
        d = false;
        f = zzq1;
        i = zzd1;
        zzp.zzbv().b(f.context);
        zzp.zzby().a(f.context, f.zzqj);
    }

    private static long a(String s)
    {
        int j;
        int l;
        l = s.indexOf("ufe");
        int k = s.indexOf(',', l);
        j = k;
        if (k == -1)
        {
            j = s.length();
        }
        long l1 = Long.parseLong(s.substring(l + 4, j));
        return l1;
        s;
        com.google.android.gms.ads.internal.util.client.zzb.zzaH("Invalid index for Url fetch time in CSI latency info.");
_L2:
        return -1L;
        s;
        com.google.android.gms.ads.internal.util.client.zzb.zzaH("Cannot find valid format of Url fetch time in CSI latency info.");
        if (true) goto _L2; else goto _L1
_L1:
    }

    private boolean d()
    {
        com.google.android.gms.ads.internal.util.client.zzb.zzaG("Ad leaving application.");
        if (f.e == null)
        {
            return false;
        }
        try
        {
            f.e.onAdLeftApplication();
        }
        catch (RemoteException remoteexception)
        {
            com.google.android.gms.ads.internal.util.client.zzb.zzd("Could not call AdListener.onAdLeftApplication().", remoteexception);
            return false;
        }
        return true;
    }

    protected final void a(View view)
    {
        f.c.addView(view, zzp.zzbx().d());
    }

    protected boolean a()
    {
        com.google.android.gms.ads.internal.util.client.zzb.v("Ad closing.");
        if (f.e == null)
        {
            return false;
        }
        try
        {
            f.e.onAdClosed();
        }
        catch (RemoteException remoteexception)
        {
            com.google.android.gms.ads.internal.util.client.zzb.zzd("Could not call AdListener.onAdClosed().", remoteexception);
            return false;
        }
        return true;
    }

    protected boolean a(int j)
    {
        com.google.android.gms.ads.internal.util.client.zzb.zzaH((new StringBuilder("Failed to load ad: ")).append(j).toString());
        d = false;
        if (f.e == null)
        {
            return false;
        }
        try
        {
            f.e.onAdFailedToLoad(j);
        }
        catch (RemoteException remoteexception)
        {
            com.google.android.gms.ads.internal.util.client.zzb.zzd("Could not call AdListener.onAdFailedToLoad().", remoteexception);
            return false;
        }
        return true;
    }

    protected boolean a(AdRequestParcel adrequestparcel)
    {
        adrequestparcel = f.c.getParent();
        return (adrequestparcel instanceof View) && ((View)adrequestparcel).isShown() && zzp.zzbv().a();
    }

    boolean a(pa pa1)
    {
        return false;
    }

    protected final void b(pa pa1)
    {
        if (pa1 == null)
        {
            com.google.android.gms.ads.internal.util.client.zzb.zzaH("Ad state was null when trying to ping impression URLs.");
        } else
        {
            com.google.android.gms.ads.internal.util.client.zzb.zzaF("Pinging Impression URLs.");
            f.zzqq.a();
            if (pa1.e != null)
            {
                zzp.zzbv();
                qa.a(f.context, f.zzqj.zzJu, pa1.e);
                return;
            }
        }
    }

    protected final boolean b()
    {
        com.google.android.gms.ads.internal.util.client.zzb.zzaG("Ad opening.");
        if (f.e == null)
        {
            return false;
        }
        try
        {
            f.e.onAdOpened();
        }
        catch (RemoteException remoteexception)
        {
            com.google.android.gms.ads.internal.util.client.zzb.zzd("Could not call AdListener.onAdOpened().", remoteexception);
            return false;
        }
        return true;
    }

    protected boolean c()
    {
        com.google.android.gms.ads.internal.util.client.zzb.zzaG("Ad finished loading.");
        d = false;
        if (f.e == null)
        {
            return false;
        }
        try
        {
            f.e.onAdLoaded();
        }
        catch (RemoteException remoteexception)
        {
            com.google.android.gms.ads.internal.util.client.zzb.zzd("Could not call AdListener.onAdLoaded().", remoteexception);
            return false;
        }
        return true;
    }

    public void destroy()
    {
        bl.b("destroy must be called on the main UI thread.");
        e.cancel();
        h.b(f.zzqo);
        f.destroy();
    }

    public boolean isLoading()
    {
        return d;
    }

    public boolean isReady()
    {
        bl.b("isLoaded must be called on the main UI thread.");
        return f.zzql == null && f.zzqm == null && f.zzqo != null;
    }

    public void onAdClicked()
    {
        if (f.zzqo == null)
        {
            com.google.android.gms.ads.internal.util.client.zzb.zzaH("Ad state was null when trying to ping click URLs.");
        } else
        {
            com.google.android.gms.ads.internal.util.client.zzb.zzaF("Pinging click URLs.");
            f.zzqq.b();
            if (f.zzqo.c != null)
            {
                zzp.zzbv();
                qa.a(f.context, f.zzqj.zzJu, f.zzqo.c);
            }
            if (f.d != null)
            {
                try
                {
                    f.d.onAdClicked();
                    return;
                }
                catch (RemoteException remoteexception)
                {
                    com.google.android.gms.ads.internal.util.client.zzb.zzd("Could not notify onAdClicked event.", remoteexception);
                }
                return;
            }
        }
    }

    public void onAppEvent(String s, String s1)
    {
        if (f.f == null)
        {
            break MISSING_BLOCK_LABEL_24;
        }
        f.f.onAppEvent(s, s1);
        return;
        s;
        com.google.android.gms.ads.internal.util.client.zzb.zzd("Could not call the AppEventListener.", s);
        return;
    }

    public void pause()
    {
        bl.b("pause must be called on the main UI thread.");
    }

    protected void recordImpression()
    {
        b(f.zzqo);
    }

    public void resume()
    {
        bl.b("resume must be called on the main UI thread.");
    }

    public void setManualImpressionsEnabled(boolean flag)
    {
        throw new UnsupportedOperationException("Attempt to call setManualImpressionsEnabled for an unsupported ad type.");
    }

    public void stopLoading()
    {
        bl.b("stopLoading must be called on the main UI thread.");
        d = false;
        f.zzf(true);
    }

    public void zza(AdSizeParcel adsizeparcel)
    {
        bl.b("setAdSize must be called on the main UI thread.");
        f.zzqn = adsizeparcel;
        if (f.zzqo != null && f.zzqo.b != null && f.zzqH == 0)
        {
            f.zzqo.b.a(adsizeparcel);
        }
        if (f.c == null)
        {
            return;
        }
        if (f.c.getChildCount() > 1)
        {
            f.c.removeView(f.c.getNextView());
        }
        f.c.setMinimumWidth(adsizeparcel.widthPixels);
        f.c.setMinimumHeight(adsizeparcel.heightPixels);
        f.c.requestLayout();
    }

    public void zza(com.google.android.gms.ads.internal.client.zzn zzn1)
    {
        bl.b("setAdListener must be called on the main UI thread.");
        f.d = zzn1;
    }

    public void zza(zzo zzo1)
    {
        bl.b("setAdListener must be called on the main UI thread.");
        f.e = zzo1;
    }

    public void zza(zzu zzu1)
    {
        bl.b("setAppEventListener must be called on the main UI thread.");
        f.f = zzu1;
    }

    public void zza(zzv zzv)
    {
        bl.b("setCorrelationIdProvider must be called on the main UI thread");
        f.g = zzv;
    }

    public void zza(ds ds)
    {
        throw new IllegalStateException("setOnCustomRenderedAdLoadedListener is not supported for current ad type");
    }

    public void zza(li li)
    {
        throw new IllegalStateException("setInAppPurchaseListener is not supported for current ad type");
    }

    public void zza(lu lu, String s)
    {
        throw new IllegalStateException("setPlayStorePurchaseParams is not supported for current ad type");
    }

    public void zza(pb pb1)
    {
        if (pb1.b.zzEO != -1L && !TextUtils.isEmpty(pb1.b.zzEY))
        {
            long l = a(pb1.b.zzEY);
            if (l != -1L)
            {
                dk dk1 = a.a(l + pb1.b.zzEO);
                a.a(dk1, new String[] {
                    "stc"
                });
            }
        }
        a.a(pb1.b.zzEY);
        a.a(b, new String[] {
            "arf"
        });
        c = a.a();
        a.a("gqi", pb1.b.zzEZ);
        f.zzql = null;
        f.zzqp = pb1;
        zza(pb1, a);
    }

    protected abstract void zza(pb pb1, dm dm1);

    public void zza(HashSet hashset)
    {
        f.zza(hashset);
    }

    protected abstract boolean zza(AdRequestParcel adrequestparcel, dm dm1);

    protected abstract boolean zza(pa pa1, pa pa2);

    public a zzaM()
    {
        bl.b("getAdFrame must be called on the main UI thread.");
        return com.google.android.gms.b.d.a(f.c);
    }

    public AdSizeParcel zzaN()
    {
        bl.b("getAdSize must be called on the main UI thread.");
        if (f.zzqn == null)
        {
            return null;
        } else
        {
            return new ThinAdSizeParcel(f.zzqn);
        }
    }

    public void zzaO()
    {
        d();
    }

    public void zzaP()
    {
        bl.b("recordManualImpression must be called on the main UI thread.");
        if (f.zzqo == null)
        {
            com.google.android.gms.ads.internal.util.client.zzb.zzaH("Ad state was null when trying to ping manual tracking URLs.");
        } else
        {
            com.google.android.gms.ads.internal.util.client.zzb.zzaF("Pinging manual tracking URLs.");
            if (f.zzqo.f != null)
            {
                zzp.zzbv();
                qa.a(f.context, f.zzqj.zzJu, f.zzqo.f);
                return;
            }
        }
    }

    public void zzb(pa pa1)
    {
        a.a(c, new String[] {
            "awr"
        });
        f.zzqm = null;
        if (pa1.d != -2 && pa1.d != 3)
        {
            zzp.zzby().a(f.zzbJ());
        }
        if (pa1.d == -1)
        {
            d = false;
        } else
        {
            if (a(pa1))
            {
                com.google.android.gms.ads.internal.util.client.zzb.zzaF("Ad refresh scheduled.");
            }
            if (pa1.d != -2)
            {
                a(pa1.d);
                return;
            }
            if (f.zzqF == null)
            {
                f.zzqF = new ph(f.zzqh);
            }
            h.a(f.zzqo);
            if (zza(f.zzqo, pa1))
            {
                f.zzqo = pa1;
                f.zzbS();
                dm dm1 = a;
                if (f.zzqo.a())
                {
                    pa1 = "1";
                } else
                {
                    pa1 = "0";
                }
                dm1.a("is_mraid", pa1);
                dm1 = a;
                if (f.zzqo.k)
                {
                    pa1 = "1";
                } else
                {
                    pa1 = "0";
                }
                dm1.a("is_mediation", pa1);
                if (f.zzqo.b != null && f.zzqo.b.k() != null)
                {
                    dm dm2 = a;
                    if (f.zzqo.b.k().zzhr())
                    {
                        pa1 = "1";
                    } else
                    {
                        pa1 = "0";
                    }
                    dm2.a("is_video", pa1);
                }
                a.a(b, new String[] {
                    "ttc"
                });
                if (zzp.zzby().d() != null)
                {
                    zzp.zzby().d().a(a);
                }
                if (f.zzbN())
                {
                    c();
                    return;
                }
            }
        }
    }

    public boolean zzb(AdRequestParcel adrequestparcel)
    {
        bl.b("loadAd must be called on the main UI thread.");
        AdRequestParcel adrequestparcel1 = adrequestparcel;
        if (GooglePlayServicesUtil.zzag(f.context))
        {
            adrequestparcel1 = adrequestparcel;
            if (adrequestparcel.zzsJ != null)
            {
                adrequestparcel1 = (new zzf(adrequestparcel)).zza(null).zzcA();
            }
        }
        if (d)
        {
            if (g != null)
            {
                com.google.android.gms.ads.internal.util.client.zzb.zzaH("Aborting last ad request since another ad request is already in progress. The current request object will still be cached for future refreshes.");
            }
            g = adrequestparcel1;
            return false;
        }
        com.google.android.gms.ads.internal.util.client.zzb.zzaG("Starting ad request.");
        d = true;
        adrequestparcel = cy.G;
        a = new dm(((Boolean)zzp.zzbE().a(adrequestparcel)).booleanValue(), "load_ad", f.zzqn.zzte);
        b = new dk(-1L, null, null);
        c = new dk(-1L, null, null);
        b = a.a();
        if (!adrequestparcel1.zzsE)
        {
            com.google.android.gms.ads.internal.util.client.zzb.zzaG((new StringBuilder("Use AdRequest.Builder.addTestDevice(\"")).append(zzl.zzcF().zzQ(f.context)).append("\") to get test ads on this device.").toString());
        }
        return zza(adrequestparcel1, a);
    }

    public void zzd(AdRequestParcel adrequestparcel)
    {
        if (a(adrequestparcel))
        {
            zzb(adrequestparcel);
            return;
        } else
        {
            com.google.android.gms.ads.internal.util.client.zzb.zzaG("Ad is not visible. Not refreshing ad.");
            e.zzg(adrequestparcel);
            return;
        }
    }
}
