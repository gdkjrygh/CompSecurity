// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads.internal;

import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.RemoteException;
import android.view.View;
import android.view.Window;
import com.google.android.gms.ads.internal.client.AdRequestParcel;
import com.google.android.gms.ads.internal.client.AdSizeParcel;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.overlay.zze;
import com.google.android.gms.ads.internal.request.AdRequestInfoParcel;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.client.zzb;
import com.google.android.gms.common.internal.z;
import com.google.android.gms.internal.au;
import com.google.android.gms.internal.ay;
import com.google.android.gms.internal.bd;
import com.google.android.gms.internal.cl;
import com.google.android.gms.internal.di;
import com.google.android.gms.internal.dj;
import com.google.android.gms.internal.gl;
import com.google.android.gms.internal.gw;
import com.google.android.gms.internal.gx;
import com.google.android.gms.internal.hs;
import com.google.android.gms.internal.ht;
import com.google.android.gms.internal.hu;
import com.google.android.gms.internal.y;

// Referenced classes of package com.google.android.gms.ads.internal:
//            zzc, zzp, zzq, InterstitialAdParameterParcel, 
//            zzo, zzd, zze

public class zzk extends zzc
    implements cl
{

    protected transient boolean zzpj;

    public zzk(Context context, AdSizeParcel adsizeparcel, String s, di di, VersionInfoParcel versioninfoparcel, zzd zzd1)
    {
        super(context, adsizeparcel, s, di, versioninfoparcel, zzd1);
        zzpj = false;
    }

    private void zzb(Bundle bundle)
    {
        zzp.zzbx().b(zzos.context, zzos.zzqb.zzIz, "gmob-apps", bundle, false);
    }

    private void zzbm()
    {
        if (zzos.zzbP())
        {
            zzos.zzbM();
            zzos.zzqg = null;
            zzos.zzpk = false;
            zzpj = false;
        }
    }

    public void showInterstitial()
    {
        z.b("showInterstitial must be called on the main UI thread.");
        if (zzos.zzqg == null)
        {
            com.google.android.gms.ads.internal.util.client.zzb.zzaE("The interstitial has not loaded.");
        } else
        {
            if (((Boolean)ay.ae.c()).booleanValue())
            {
                Object obj;
                if (zzos.context.getApplicationContext() != null)
                {
                    obj = zzos.context.getApplicationContext().getPackageName();
                } else
                {
                    obj = zzos.context.getPackageName();
                }
                if (!zzpj)
                {
                    com.google.android.gms.ads.internal.util.client.zzb.zzaE("It is not recommended to show an interstitial before onAdLoaded completes.");
                    Bundle bundle = new Bundle();
                    bundle.putString("appid", ((String) (obj)));
                    bundle.putString("action", "show_interstitial_before_load_finish");
                    zzb(bundle);
                }
                if (!zzp.zzbx().g(zzos.context))
                {
                    com.google.android.gms.ads.internal.util.client.zzb.zzaE("It is not recommended to show an interstitial when app is not in foreground.");
                    Bundle bundle1 = new Bundle();
                    bundle1.putString("appid", ((String) (obj)));
                    bundle1.putString("action", "show_interstitial_app_not_in_foreground");
                    zzb(bundle1);
                }
            }
            if (!zzos.zzbQ())
            {
                if (zzos.zzqg.k)
                {
                    try
                    {
                        zzos.zzqg.m.b();
                        return;
                    }
                    // Misplaced declaration of an exception variable
                    catch (Object obj)
                    {
                        com.google.android.gms.ads.internal.util.client.zzb.zzd("Could not show interstitial.", ((Throwable) (obj)));
                    }
                    zzbm();
                    return;
                }
                if (zzos.zzqg.b == null)
                {
                    com.google.android.gms.ads.internal.util.client.zzb.zzaE("The interstitial failed to load.");
                    return;
                }
                if (zzos.zzqg.b.m())
                {
                    com.google.android.gms.ads.internal.util.client.zzb.zzaE("The interstitial is already showing.");
                    return;
                }
                zzos.zzqg.b.a(true);
                if (zzos.zzqg.j != null)
                {
                    zzou.a(zzos.zzqf, zzos.zzqg);
                }
                Object obj1 = new InterstitialAdParameterParcel(zzos.zzpk, zzbl());
                int j = zzos.zzqg.b.getRequestedOrientation();
                int i = j;
                if (j == -1)
                {
                    i = zzos.zzqg.g;
                }
                obj1 = new AdOverlayInfoParcel(this, this, this, zzos.zzqg.b, i, zzos.zzqb, zzos.zzqg.v, ((InterstitialAdParameterParcel) (obj1)));
                zzp.zzbv().zza(zzos.context, ((AdOverlayInfoParcel) (obj1)));
                return;
            }
        }
    }

    protected hs zza(com.google.android.gms.internal.gl.a a, com.google.android.gms.ads.internal.zze zze1)
    {
        hs hs1 = zzp.zzby().a(zzos.context, zzos.zzqf, false, false, zzos.zzqa, zzos.zzqb, zzov);
        hs1.i().a(this, null, this, this, ((Boolean)ay.S.c()).booleanValue(), this, this, zze1, null);
        hs1.b(a.a.zzDQ);
        return hs1;
    }

    public boolean zza(AdRequestParcel adrequestparcel, bd bd)
    {
        if (zzos.zzqg != null)
        {
            com.google.android.gms.ads.internal.util.client.zzb.zzaE("An interstitial is already loading. Aborting.");
            return false;
        } else
        {
            return super.zza(adrequestparcel, bd);
        }
    }

    protected boolean zza(AdRequestParcel adrequestparcel, gl gl1, boolean flag)
    {
        if (zzos.zzbP() && gl1.b != null)
        {
            zzp.zzbz().a(gl1.b.getWebView());
        }
        return zzor.zzbr();
    }

    public boolean zza(gl gl1, gl gl2)
    {
        if (!super.zza(gl1, gl2))
        {
            return false;
        }
        if (!zzos.zzbP() && zzos.zzqy != null && gl2.j != null)
        {
            zzou.a(zzos.zzqf, gl2, zzos.zzqy);
        }
        return true;
    }

    protected boolean zzaT()
    {
        if (super.zzaT())
        {
            zzpj = true;
            return true;
        } else
        {
            return false;
        }
    }

    public void zzaV()
    {
        zzbm();
        super.zzaV();
    }

    public void zzaW()
    {
        recordImpression();
        super.zzaW();
    }

    protected boolean zzbl()
    {
        Window window;
        if (zzos.context instanceof Activity)
        {
            if ((window = ((Activity)zzos.context).getWindow()) != null && window.getDecorView() != null)
            {
                Rect rect = new Rect();
                Rect rect1 = new Rect();
                window.getDecorView().getGlobalVisibleRect(rect, null);
                window.getDecorView().getWindowVisibleDisplayFrame(rect1);
                boolean flag;
                if (rect.bottom != 0 && rect1.bottom != 0 && rect.top == rect1.top)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                return flag;
            }
        }
        return false;
    }

    public void zzd(boolean flag)
    {
        zzos.zzpk = flag;
    }
}
