// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads.internal;

import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import android.view.View;
import com.google.android.gms.a.a;
import com.google.android.gms.a.b;
import com.google.android.gms.ads.internal.client.AdRequestParcel;
import com.google.android.gms.ads.internal.client.AdSizeParcel;
import com.google.android.gms.ads.internal.client.zzk;
import com.google.android.gms.ads.internal.client.zzm;
import com.google.android.gms.ads.internal.client.zzt;
import com.google.android.gms.ads.internal.client.zzu;
import com.google.android.gms.ads.internal.overlay.zzn;
import com.google.android.gms.ads.internal.request.AdResponseParcel;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.client.zzb;
import com.google.android.gms.common.internal.z;
import com.google.android.gms.internal.ai;
import com.google.android.gms.internal.au;
import com.google.android.gms.internal.ay;
import com.google.android.gms.internal.ba;
import com.google.android.gms.internal.bc;
import com.google.android.gms.internal.bd;
import com.google.android.gms.internal.bh;
import com.google.android.gms.internal.ce;
import com.google.android.gms.internal.eo;
import com.google.android.gms.internal.es;
import com.google.android.gms.internal.gl;
import com.google.android.gms.internal.gm;
import com.google.android.gms.internal.gn;
import com.google.android.gms.internal.gp;
import com.google.android.gms.internal.gq;
import com.google.android.gms.internal.gw;
import com.google.android.gms.internal.gx;
import com.google.android.gms.internal.hs;
import com.google.android.gms.internal.ht;
import com.google.android.gms.internal.y;
import com.google.android.gms.internal.zzbk;
import java.util.HashSet;

// Referenced classes of package com.google.android.gms.ads.internal:
//            zzp, zzq, zzo, zzd

public abstract class zza extends com.google.android.gms.ads.internal.client.zzr.zza
    implements com.google.android.gms.ads.internal.client.zza, zzn, com.google.android.gms.ads.internal.request.zza, ce, com.google.android.gms.internal.fb.a, gp
{

    private bd zzon;
    private bc zzoo;
    private bc zzop;
    boolean zzoq;
    protected final zzo zzor;
    protected final zzq zzos;
    protected transient AdRequestParcel zzot;
    protected final y zzou = zzp.zzbA().j();
    protected final zzd zzov;

    zza(zzq zzq1, zzo zzo1, zzd zzd)
    {
        zzoq = false;
        zzos = zzq1;
        if (zzo1 == null)
        {
            zzo1 = new zzo(this);
        }
        zzor = zzo1;
        zzov = zzd;
        zzp.zzbx().b(zzos.context);
        zzp.zzbA().a(zzos.context, zzos.zzqb);
    }

    private boolean zzaR()
    {
        com.google.android.gms.ads.internal.util.client.zzb.zzaD("Ad leaving application.");
        if (zzos.zzqk == null)
        {
            return false;
        }
        try
        {
            zzos.zzqk.onAdLeftApplication();
        }
        catch (RemoteException remoteexception)
        {
            com.google.android.gms.ads.internal.util.client.zzb.zzd("Could not call AdListener.onAdLeftApplication().", remoteexception);
            return false;
        }
        return true;
    }

    public void destroy()
    {
        z.b("destroy must be called on the main UI thread.");
        zzor.cancel();
        zzou.c(zzos.zzqg);
        zzos.destroy();
    }

    public boolean isLoading()
    {
        return zzoq;
    }

    public boolean isReady()
    {
        z.b("isLoaded must be called on the main UI thread.");
        return zzos.zzqd == null && zzos.zzqe == null && zzos.zzqg != null;
    }

    public void onAdClicked()
    {
        if (zzos.zzqg == null)
        {
            com.google.android.gms.ads.internal.util.client.zzb.zzaE("Ad state was null when trying to ping click URLs.");
        } else
        {
            com.google.android.gms.ads.internal.util.client.zzb.zzaC("Pinging click URLs.");
            zzos.zzqi.b();
            if (zzos.zzqg.c != null)
            {
                zzp.zzbx().a(zzos.context, zzos.zzqb.zzIz, zzp.zzbx().a(zzos.context, zzos.zzqg.c, zzos.zzqg.x));
            }
            if (zzos.zzqj != null)
            {
                try
                {
                    zzos.zzqj.onAdClicked();
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
        if (zzos.zzql == null)
        {
            break MISSING_BLOCK_LABEL_24;
        }
        zzos.zzql.onAppEvent(s, s1);
        return;
        s;
        com.google.android.gms.ads.internal.util.client.zzb.zzd("Could not call the AppEventListener.", s);
        return;
    }

    public void pause()
    {
        z.b("pause must be called on the main UI thread.");
    }

    protected void recordImpression()
    {
        zzc(zzos.zzqg);
    }

    public void resume()
    {
        z.b("resume must be called on the main UI thread.");
    }

    public void setManualImpressionsEnabled(boolean flag)
    {
        throw new UnsupportedOperationException("Attempt to call setManualImpressionsEnabled for an unsupported ad type.");
    }

    public void stopLoading()
    {
        z.b("stopLoading must be called on the main UI thread.");
        zzoq = false;
        zzos.zzf(true);
    }

    Bundle zza(zzbk zzbk1)
    {
        if (zzbk1 != null)
        {
            if (zzbk1.f())
            {
                zzbk1.d();
            }
            ai ai1 = zzbk1.c();
            if (ai1 != null)
            {
                zzbk1 = ai1.b();
                com.google.android.gms.ads.internal.util.client.zzb.zzaC((new StringBuilder()).append("In AdManger: loadAd, ").append(ai1.toString()).toString());
            } else
            {
                zzbk1 = null;
            }
            if (zzbk1 != null)
            {
                Bundle bundle = new Bundle(1);
                bundle.putString("fingerprint", zzbk1);
                bundle.putInt("v", 1);
                return bundle;
            }
        }
        return null;
    }

    public void zza(AdSizeParcel adsizeparcel)
    {
        z.b("setAdSize must be called on the main UI thread.");
        zzos.zzqf = adsizeparcel;
        if (zzos.zzqg != null && zzos.zzqg.b != null && zzos.zzqz == 0)
        {
            zzos.zzqg.b.a(adsizeparcel);
        }
        if (zzos.zzqc == null)
        {
            return;
        }
        if (zzos.zzqc.getChildCount() > 1)
        {
            zzos.zzqc.removeView(zzos.zzqc.getNextView());
        }
        zzos.zzqc.setMinimumWidth(adsizeparcel.widthPixels);
        zzos.zzqc.setMinimumHeight(adsizeparcel.heightPixels);
        zzos.zzqc.requestLayout();
    }

    public void zza(zzm zzm1)
    {
        z.b("setAdListener must be called on the main UI thread.");
        zzos.zzqj = zzm1;
    }

    public void zza(com.google.android.gms.ads.internal.client.zzn zzn1)
    {
        z.b("setAdListener must be called on the main UI thread.");
        zzos.zzqk = zzn1;
    }

    public void zza(zzt zzt1)
    {
        z.b("setAppEventListener must be called on the main UI thread.");
        zzos.zzql = zzt1;
    }

    public void zza(zzu zzu)
    {
        z.b("setCorrelationIdProvider must be called on the main UI thread");
        zzos.zzqm = zzu;
    }

    public void zza(bh bh)
    {
        throw new IllegalStateException("setOnCustomRenderedAdLoadedListener is not supported for current ad type");
    }

    public void zza(eo eo)
    {
        throw new IllegalStateException("setInAppPurchaseListener is not supported for current ad type");
    }

    public void zza(es es, String s)
    {
        throw new IllegalStateException("setPlayStorePurchaseParams is not supported for current ad type");
    }

    public void zza(com.google.android.gms.internal.gl.a a)
    {
        if (a.b.zzEb != -1L && !TextUtils.isEmpty(a.b.zzEl))
        {
            long l = zzo(a.b.zzEl);
            if (l != -1L)
            {
                bc bc1 = zzon.a(l + a.b.zzEb);
                zzon.a(bc1, new String[] {
                    "stc"
                });
            }
        }
        zzon.a(a.b.zzEl);
        zzon.a(zzoo, new String[] {
            "arf"
        });
        zzop = zzon.a();
        zzos.zzqd = null;
        zzos.zzqh = a;
        zza(a, zzon);
    }

    protected abstract void zza(com.google.android.gms.internal.gl.a a, bd bd1);

    public void zza(HashSet hashset)
    {
        zzos.zza(hashset);
    }

    public boolean zza(AdRequestParcel adrequestparcel)
    {
        z.b("loadAd must be called on the main UI thread.");
        if (zzos.zzqd != null || zzos.zzqe != null)
        {
            if (zzot != null)
            {
                com.google.android.gms.ads.internal.util.client.zzb.zzaE("Aborting last ad request since another ad request is already in progress. The current request object will still be cached for future refreshes.");
            }
            zzot = adrequestparcel;
            return false;
        }
        com.google.android.gms.ads.internal.util.client.zzb.zzaD("Starting ad request.");
        zzoq = true;
        zzaL();
        zzoo = zzon.a();
        if (!adrequestparcel.zzst)
        {
            com.google.android.gms.ads.internal.util.client.zzb.zzaD((new StringBuilder()).append("Use AdRequest.Builder.addTestDevice(\"").append(zzk.zzcE().zzQ(zzos.context)).append("\") to get test ads on this device.").toString());
        }
        return zza(adrequestparcel, zzon);
    }

    protected abstract boolean zza(AdRequestParcel adrequestparcel, bd bd1);

    boolean zza(gl gl1)
    {
        return false;
    }

    protected abstract boolean zza(gl gl1, gl gl2);

    void zzaL()
    {
        zzon = new bd(((Boolean)ay.G.c()).booleanValue(), "load_ad", zzos.zzqf.zzsG);
        zzoo = new bc(-1L, null, null);
        zzop = new bc(-1L, null, null);
    }

    public a zzaM()
    {
        z.b("getAdFrame must be called on the main UI thread.");
        return b.a(zzos.zzqc);
    }

    public AdSizeParcel zzaN()
    {
        z.b("getAdSize must be called on the main UI thread.");
        return zzos.zzqf;
    }

    public void zzaO()
    {
        zzaR();
    }

    public void zzaP()
    {
        z.b("recordManualImpression must be called on the main UI thread.");
        if (zzos.zzqg == null)
        {
            com.google.android.gms.ads.internal.util.client.zzb.zzaE("Ad state was null when trying to ping manual tracking URLs.");
        } else
        {
            com.google.android.gms.ads.internal.util.client.zzb.zzaC("Pinging manual tracking URLs.");
            if (zzos.zzqg.f != null)
            {
                zzp.zzbx().a(zzos.context, zzos.zzqb.zzIz, zzp.zzbx().a(zzos.context, zzos.zzqg.f, zzos.zzqg.x));
                return;
            }
        }
    }

    protected boolean zzaQ()
    {
        com.google.android.gms.ads.internal.util.client.zzb.v("Ad closing.");
        if (zzos.zzqk == null)
        {
            return false;
        }
        try
        {
            zzos.zzqk.onAdClosed();
        }
        catch (RemoteException remoteexception)
        {
            com.google.android.gms.ads.internal.util.client.zzb.zzd("Could not call AdListener.onAdClosed().", remoteexception);
            return false;
        }
        return true;
    }

    protected boolean zzaS()
    {
        com.google.android.gms.ads.internal.util.client.zzb.zzaD("Ad opening.");
        if (zzos.zzqk == null)
        {
            return false;
        }
        try
        {
            zzos.zzqk.onAdOpened();
        }
        catch (RemoteException remoteexception)
        {
            com.google.android.gms.ads.internal.util.client.zzb.zzd("Could not call AdListener.onAdOpened().", remoteexception);
            return false;
        }
        return true;
    }

    protected boolean zzaT()
    {
        com.google.android.gms.ads.internal.util.client.zzb.zzaD("Ad finished loading.");
        zzoq = false;
        if (zzos.zzqk == null)
        {
            return false;
        }
        try
        {
            zzos.zzqk.onAdLoaded();
        }
        catch (RemoteException remoteexception)
        {
            com.google.android.gms.ads.internal.util.client.zzb.zzd("Could not call AdListener.onAdLoaded().", remoteexception);
            return false;
        }
        return true;
    }

    protected void zzb(View view)
    {
        zzos.zzqc.addView(view, zzp.zzbz().d());
    }

    public void zzb(gl gl1)
    {
        zzon.a(zzop, new String[] {
            "awr"
        });
        zzos.zzqe = null;
        if (gl1.d != -2 && gl1.d != 3)
        {
            zzp.zzbA().a(zzos.zzbL());
        }
        if (gl1.d == -1)
        {
            zzoq = false;
        } else
        {
            if (zza(gl1))
            {
                com.google.android.gms.ads.internal.util.client.zzb.zzaC("Ad refresh scheduled.");
            }
            if (gl1.d != -2)
            {
                zze(gl1.d);
                return;
            }
            if (zzos.zzqx == null)
            {
                zzos.zzqx = new gq(zzos.zzpZ);
            }
            zzou.b(zzos.zzqg);
            if (zza(zzos.zzqg, gl1))
            {
                zzos.zzqg = gl1;
                zzos.zzbS();
                bd bd1 = zzon;
                if (zzos.zzqg.a())
                {
                    gl1 = "1";
                } else
                {
                    gl1 = "0";
                }
                bd1.a("is_mraid", gl1);
                bd1 = zzon;
                if (zzos.zzqg.k)
                {
                    gl1 = "1";
                } else
                {
                    gl1 = "0";
                }
                bd1.a("is_mediation", gl1);
                if (zzos.zzqg.b != null && zzos.zzqg.b.i() != null)
                {
                    bd bd2 = zzon;
                    if (zzos.zzqg.b.i().c())
                    {
                        gl1 = "1";
                    } else
                    {
                        gl1 = "0";
                    }
                    bd2.a("is_video", gl1);
                }
                zzon.a(zzoo, new String[] {
                    "ttc"
                });
                if (zzp.zzbA().e() != null)
                {
                    zzp.zzbA().e().a(zzon);
                }
                if (zzos.zzbP())
                {
                    zzaT();
                    return;
                }
            }
        }
    }

    protected boolean zzb(AdRequestParcel adrequestparcel)
    {
        adrequestparcel = zzos.zzqc.getParent();
        return (adrequestparcel instanceof View) && ((View)adrequestparcel).isShown() && zzp.zzbx().a();
    }

    public void zzc(AdRequestParcel adrequestparcel)
    {
        if (zzb(adrequestparcel))
        {
            zza(adrequestparcel);
            return;
        } else
        {
            com.google.android.gms.ads.internal.util.client.zzb.zzaD("Ad is not visible. Not refreshing ad.");
            zzor.zzf(adrequestparcel);
            return;
        }
    }

    protected void zzc(gl gl1)
    {
        if (gl1 == null)
        {
            com.google.android.gms.ads.internal.util.client.zzb.zzaE("Ad state was null when trying to ping impression URLs.");
        } else
        {
            com.google.android.gms.ads.internal.util.client.zzb.zzaC("Pinging Impression URLs.");
            zzos.zzqi.a();
            if (gl1.e != null)
            {
                zzp.zzbx().a(zzos.context, zzos.zzqb.zzIz, zzp.zzbx().a(zzos.context, gl1.e, gl1.x));
                return;
            }
        }
    }

    protected boolean zze(int i)
    {
        com.google.android.gms.ads.internal.util.client.zzb.zzaE((new StringBuilder()).append("Failed to load ad: ").append(i).toString());
        zzoq = false;
        if (zzos.zzqk == null)
        {
            return false;
        }
        try
        {
            zzos.zzqk.onAdFailedToLoad(i);
        }
        catch (RemoteException remoteexception)
        {
            com.google.android.gms.ads.internal.util.client.zzb.zzd("Could not call AdListener.onAdFailedToLoad().", remoteexception);
            return false;
        }
        return true;
    }

    long zzo(String s)
    {
        int i;
        int k;
        k = s.indexOf("ufe");
        int j = s.indexOf(',', k);
        i = j;
        if (j == -1)
        {
            i = s.length();
        }
        long l = Long.parseLong(s.substring(k + 4, i));
        return l;
        s;
        com.google.android.gms.ads.internal.util.client.zzb.zzaE("Invalid index for Url fetch time in CSI latency info.");
_L2:
        return -1L;
        s;
        com.google.android.gms.ads.internal.util.client.zzb.zzaE("Cannot find valid format of Url fetch time in CSI latency info.");
        if (true) goto _L2; else goto _L1
_L1:
    }
}
