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
import com.google.android.gms.ads.internal.formats.zzd;
import com.google.android.gms.ads.internal.formats.zze;
import com.google.android.gms.ads.internal.formats.zzf;
import com.google.android.gms.ads.internal.formats.zzg;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.client.zzb;
import com.google.android.gms.common.internal.z;
import com.google.android.gms.internal.bd;
import com.google.android.gms.internal.bh;
import com.google.android.gms.internal.bt;
import com.google.android.gms.internal.bu;
import com.google.android.gms.internal.bv;
import com.google.android.gms.internal.bw;
import com.google.android.gms.internal.di;
import com.google.android.gms.internal.dj;
import com.google.android.gms.internal.dl;
import com.google.android.gms.internal.dm;
import com.google.android.gms.internal.eo;
import com.google.android.gms.internal.fb;
import com.google.android.gms.internal.gl;
import com.google.android.gms.internal.gw;
import com.google.android.gms.internal.iu;
import java.util.List;

// Referenced classes of package com.google.android.gms.ads.internal:
//            zzb, zzq, zzp, zzo

public class zzn extends com.google.android.gms.ads.internal.zzb
{

    public zzn(Context context, AdSizeParcel adsizeparcel, String s, di di, VersionInfoParcel versioninfoparcel)
    {
        super(context, adsizeparcel, s, di, versioninfoparcel, null);
    }

    private static zzd zza(dl dl1)
        throws RemoteException
    {
        String s = dl1.a();
        List list = dl1.b();
        String s1 = dl1.c();
        com.google.android.gms.internal.bj bj;
        if (dl1.d() != null)
        {
            bj = dl1.d();
        } else
        {
            bj = null;
        }
        return new zzd(s, list, s1, bj, dl1.e(), dl1.f(), dl1.g(), dl1.h(), null, dl1.l());
    }

    private static zze zza(dm dm1)
        throws RemoteException
    {
        String s = dm1.a();
        List list = dm1.b();
        String s1 = dm1.c();
        com.google.android.gms.internal.bj bj;
        if (dm1.d() != null)
        {
            bj = dm1.d();
        } else
        {
            bj = null;
        }
        return new zze(s, list, s1, bj, dm1.e(), dm1.f(), null, dm1.j());
    }

    private void zza(zzd zzd1)
    {
        gw.a.post(new Runnable(zzd1) {

            final zzn zzpt;
            final zzd zzpu;

            public void run()
            {
                try
                {
                    zzpt.zzos.zzqp.a(zzpu);
                    return;
                }
                catch (RemoteException remoteexception)
                {
                    com.google.android.gms.ads.internal.util.client.zzb.zzd("Could not call OnAppInstallAdLoadedListener.onAppInstallAdLoaded().", remoteexception);
                }
            }

            
            {
                zzpt = zzn.this;
                zzpu = zzd1;
                super();
            }
        });
    }

    private void zza(zze zze1)
    {
        gw.a.post(new Runnable(zze1) {

            final zzn zzpt;
            final zze zzpv;

            public void run()
            {
                try
                {
                    zzpt.zzos.zzqq.a(zzpv);
                    return;
                }
                catch (RemoteException remoteexception)
                {
                    com.google.android.gms.ads.internal.util.client.zzb.zzd("Could not call OnContentAdLoadedListener.onContentAdLoaded().", remoteexception);
                }
            }

            
            {
                zzpt = zzn.this;
                zzpv = zze1;
                super();
            }
        });
    }

    private void zza(gl gl1, String s)
    {
        gw.a.post(new Runnable(s, gl1) {

            final zzn zzpt;
            final String zzpw;
            final gl zzpx;

            public void run()
            {
                try
                {
                    ((bw)zzpt.zzos.zzqs.get(zzpw)).a((zzf)zzpx.w);
                    return;
                }
                catch (RemoteException remoteexception)
                {
                    com.google.android.gms.ads.internal.util.client.zzb.zzd("Could not call onCustomTemplateAdLoadedListener.onCustomTemplateAdLoaded().", remoteexception);
                }
            }

            
            {
                zzpt = zzn.this;
                zzpw = s;
                zzpx = gl1;
                super();
            }
        });
    }

    public void pause()
    {
        throw new IllegalStateException("Native Ad DOES NOT support pause().");
    }

    public void recordImpression()
    {
        zza(zzos.zzqg, false);
    }

    public void resume()
    {
        throw new IllegalStateException("Native Ad DOES NOT support resume().");
    }

    public void showInterstitial()
    {
        throw new IllegalStateException("Interstitial is NOT supported by NativeAdManager.");
    }

    public void zza(bh bh)
    {
        throw new IllegalStateException("CustomRendering is NOT supported by NativeAdManager.");
    }

    public void zza(eo eo)
    {
        throw new IllegalStateException("In App Purchase is NOT supported by NativeAdManager.");
    }

    public void zza(com.google.android.gms.internal.gl.a a, bd bd)
    {
        if (a.d != null)
        {
            zzos.zzqf = a.d;
        }
        if (a.e != -2)
        {
            gw.a.post(new Runnable(a) {

                final com.google.android.gms.internal.gl.a zzoA;
                final zzn zzpt;

                public void run()
                {
                    zzpt.zzb(new gl(zzoA, null, null, null, null, null, null));
                }

            
            {
                zzpt = zzn.this;
                zzoA = a;
                super();
            }
            });
            return;
        } else
        {
            zzos.zzqz = 0;
            zzos.zzqe = zzp.zzbw().a(zzos.context, this, a, zzos.zzqa, null, zzow, this, bd);
            com.google.android.gms.ads.internal.util.client.zzb.zzaC((new StringBuilder()).append("AdRenderer: ").append(zzos.zzqe.getClass().getName()).toString());
            return;
        }
    }

    public void zza(iu iu1)
    {
        z.b("setOnCustomTemplateAdLoadedListeners must be called on the main UI thread.");
        zzos.zzqs = iu1;
    }

    public void zza(List list)
    {
        z.b("setNativeTemplates must be called on the main UI thread.");
        zzos.zzqv = list;
    }

    protected boolean zza(AdRequestParcel adrequestparcel, gl gl1, boolean flag)
    {
        return zzor.zzbr();
    }

    protected boolean zza(gl gl1, gl gl2)
    {
        zza(((List) (null)));
        if (!zzos.zzbP())
        {
            throw new IllegalStateException("Native ad DOES NOT have custom rendering mode.");
        }
        if (!gl2.k) goto _L2; else goto _L1
_L1:
        dl dl1;
        Object obj;
        dl1 = gl2.m.h();
        obj = gl2.m.i();
        if (dl1 == null) goto _L4; else goto _L3
_L3:
        try
        {
            obj = zza(dl1);
            ((zzd) (obj)).zza(new zzg(zzos.context, this, zzos.zzqa, dl1));
            zza(((zzd) (obj)));
        }
        catch (RemoteException remoteexception)
        {
            com.google.android.gms.ads.internal.util.client.zzb.zzd("Failed to get native ad mapper", remoteexception);
        }
_L6:
        return super.zza(gl1, gl2);
_L4:
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_162;
        }
        zze zze1 = zza(((dm) (obj)));
        zze1.zza(new zzg(zzos.context, this, zzos.zzqa, ((dm) (obj))));
        zza(zze1);
        continue; /* Loop/switch isn't completed */
        com.google.android.gms.ads.internal.util.client.zzb.zzaE("No matching mapper for retrieved native ad template.");
        zze(0);
        return false;
_L2:
        com.google.android.gms.ads.internal.formats.zzh.zza zza1 = gl2.w;
        if ((zza1 instanceof zze) && zzos.zzqq != null)
        {
            zza((zze)gl2.w);
        } else
        if ((zza1 instanceof zzd) && zzos.zzqp != null)
        {
            zza((zzd)gl2.w);
        } else
        if ((zza1 instanceof zzf) && zzos.zzqs != null && zzos.zzqs.get(((zzf)zza1).getCustomTemplateId()) != null)
        {
            zza(gl2, ((zzf)zza1).getCustomTemplateId());
        } else
        {
            com.google.android.gms.ads.internal.util.client.zzb.zzaE("No matching listener for retrieved native ad template.");
            zze(0);
            return false;
        }
        if (true) goto _L6; else goto _L5
_L5:
    }

    public void zzb(NativeAdOptionsParcel nativeadoptionsparcel)
    {
        z.b("setNativeAdOptions must be called on the main UI thread.");
        zzos.zzqt = nativeadoptionsparcel;
    }

    public void zzb(bt bt)
    {
        z.b("setOnAppInstallAdLoadedListener must be called on the main UI thread.");
        zzos.zzqp = bt;
    }

    public void zzb(bu bu)
    {
        z.b("setOnContentAdLoadedListener must be called on the main UI thread.");
        zzos.zzqq = bu;
    }

    public void zzb(iu iu1)
    {
        z.b("setOnCustomClickListener must be called on the main UI thread.");
        zzos.zzqr = iu1;
    }

    public iu zzbq()
    {
        z.b("getOnCustomTemplateAdLoadedListeners must be called on the main UI thread.");
        return zzos.zzqs;
    }

    public bv zzr(String s)
    {
        z.b("getOnCustomClickListener must be called on the main UI thread.");
        return (bv)zzos.zzqr.get(s);
    }
}
