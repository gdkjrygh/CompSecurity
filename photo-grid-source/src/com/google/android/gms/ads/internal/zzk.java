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
import com.google.android.gms.common.internal.bl;
import com.google.android.gms.internal.as;
import com.google.android.gms.internal.cx;
import com.google.android.gms.internal.cy;
import com.google.android.gms.internal.dm;
import com.google.android.gms.internal.gj;
import com.google.android.gms.internal.ip;
import com.google.android.gms.internal.is;
import com.google.android.gms.internal.pa;
import com.google.android.gms.internal.pb;
import com.google.android.gms.internal.qa;
import com.google.android.gms.internal.qd;
import com.google.android.gms.internal.ry;
import com.google.android.gms.internal.sf;
import com.google.android.gms.internal.zzja;

// Referenced classes of package com.google.android.gms.ads.internal:
//            zzc, zzp, zzq, i, 
//            zzo, j, InterstitialAdParameterParcel, zzd, 
//            zze

public class zzk extends zzc
    implements gj
{

    protected transient boolean l;
    private boolean m;
    private float n;
    private String o;

    public zzk(Context context, AdSizeParcel adsizeparcel, String s, ip ip, VersionInfoParcel versioninfoparcel, zzd zzd1)
    {
        super(context, adsizeparcel, s, ip, versioninfoparcel, zzd1);
        l = false;
        o = (new StringBuilder("background")).append(hashCode()).append(".png").toString();
    }

    private void a(Bundle bundle)
    {
        zzp.zzbv();
        qa.b(f.context, f.zzqj.zzJu, "gmob-apps", bundle, false);
    }

    static boolean a(zzk zzk1)
    {
        return zzk1.m;
    }

    static float b(zzk zzk1)
    {
        return zzk1.n;
    }

    private void f()
    {
        (new i(this, o)).zzgz();
        if (f.zzbN())
        {
            f.zzbK();
            f.zzqo = null;
            f.t = false;
            l = false;
        }
    }

    protected final ry a(pb pb1, com.google.android.gms.ads.internal.zze zze1)
    {
        zzp.zzbw();
        ry ry1 = sf.a(f.context, f.zzqn, false, false, f.b, f.zzqj, a, i);
        zzja zzja1 = ry1.k();
        com.google.android.gms.internal.cq cq = cy.S;
        zzja1.zzb(this, null, this, this, ((Boolean)zzp.zzbE().a(cq)).booleanValue(), this, this, zze1, null);
        ry1.b(pb1.a.zzEC);
        return ry1;
    }

    protected final boolean a()
    {
        f();
        return super.a();
    }

    protected final boolean a(AdRequestParcel adrequestparcel, pa pa1, boolean flag)
    {
        if (f.zzbN() && pa1.b != null)
        {
            zzp.zzbx();
            qd.a(pa1.b.a());
        }
        return e.zzbp();
    }

    protected final boolean c()
    {
        if (super.c())
        {
            l = true;
            return true;
        } else
        {
            return false;
        }
    }

    protected final boolean e()
    {
        if (!(f.context instanceof Activity))
        {
            return false;
        }
        Window window = ((Activity)f.context).getWindow();
        if (window == null || window.getDecorView() == null)
        {
            return false;
        }
        Rect rect = new Rect();
        Rect rect1 = new Rect();
        window.getDecorView().getGlobalVisibleRect(rect, null);
        window.getDecorView().getWindowVisibleDisplayFrame(rect1);
        return rect.bottom != 0 && rect1.bottom != 0 && rect.top == rect1.top;
    }

    public void showInterstitial()
    {
        bl.b("showInterstitial must be called on the main UI thread.");
        if (f.zzqo == null)
        {
            zzb.zzaH("The interstitial has not loaded.");
        } else
        {
            com.google.android.gms.internal.cq cq = cy.ae;
            if (((Boolean)zzp.zzbE().a(cq)).booleanValue())
            {
                Object obj;
                if (f.context.getApplicationContext() != null)
                {
                    obj = f.context.getApplicationContext().getPackageName();
                } else
                {
                    obj = f.context.getPackageName();
                }
                if (!l)
                {
                    zzb.zzaH("It is not recommended to show an interstitial before onAdLoaded completes.");
                    Bundle bundle = new Bundle();
                    bundle.putString("appid", ((String) (obj)));
                    bundle.putString("action", "show_interstitial_before_load_finish");
                    a(bundle);
                }
                zzp.zzbv();
                if (!qa.f(f.context))
                {
                    zzb.zzaH("It is not recommended to show an interstitial when app is not in foreground.");
                    Bundle bundle1 = new Bundle();
                    bundle1.putString("appid", ((String) (obj)));
                    bundle1.putString("action", "show_interstitial_app_not_in_foreground");
                    a(bundle1);
                }
            }
            if (!f.zzbO())
            {
                if (f.zzqo.k)
                {
                    try
                    {
                        f.zzqo.m.b();
                        return;
                    }
                    // Misplaced declaration of an exception variable
                    catch (Object obj)
                    {
                        zzb.zzd("Could not show interstitial.", ((Throwable) (obj)));
                    }
                    f();
                    return;
                }
                if (f.zzqo.b == null)
                {
                    zzb.zzaH("The interstitial failed to load.");
                    return;
                }
                if (f.zzqo.b.o())
                {
                    zzb.zzaH("The interstitial is already showing.");
                    return;
                }
                f.zzqo.b.a(true);
                if (f.zzqo.j != null)
                {
                    h.a(f.zzqn, f.zzqo);
                }
                Object obj1;
                com.google.android.gms.internal.cq cq1;
                if (f.t)
                {
                    zzp.zzbv();
                    obj1 = qa.g(f.context);
                } else
                {
                    obj1 = null;
                }
                cq1 = cy.ap;
                if (((Boolean)zzp.zzbE().a(cq1)).booleanValue() && obj1 != null)
                {
                    (new j(this, ((android.graphics.Bitmap) (obj1)), o)).zzgz();
                    return;
                }
                obj1 = new InterstitialAdParameterParcel(f.t, e(), null, false, 0.0F);
                int i1 = f.zzqo.b.p();
                int k = i1;
                if (i1 == -1)
                {
                    k = f.zzqo.g;
                }
                obj1 = new AdOverlayInfoParcel(this, this, this, f.zzqo.b, k, f.zzqj, f.zzqo.v, ((InterstitialAdParameterParcel) (obj1)));
                zzp.zzbt().zza(f.context, ((AdOverlayInfoParcel) (obj1)));
                return;
            }
        }
    }

    public void zza(boolean flag, float f1)
    {
        m = flag;
        n = f1;
    }

    public boolean zza(AdRequestParcel adrequestparcel, dm dm)
    {
        if (f.zzqo != null)
        {
            zzb.zzaH("An interstitial is already loading. Aborting.");
            return false;
        } else
        {
            return super.zza(adrequestparcel, dm);
        }
    }

    public boolean zza(pa pa1, pa pa2)
    {
        if (!super.zza(pa1, pa2))
        {
            return false;
        }
        if (!f.zzbN() && f.r != null && pa2.j != null)
        {
            h.a(f.zzqn, pa2, f.r);
        }
        return true;
    }

    public void zzaW()
    {
        recordImpression();
        super.zzaW();
    }

    public void zzd(boolean flag)
    {
        f.t = flag;
    }
}
