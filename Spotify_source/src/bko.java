// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.RemoteException;
import android.view.View;
import android.view.Window;
import com.google.android.gms.ads.internal.InterstitialAdParameterParcel;
import com.google.android.gms.ads.internal.client.AdRequestParcel;
import com.google.android.gms.ads.internal.client.AdSizeParcel;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.request.AdRequestInfoParcel;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;

public final class bko extends bke
    implements cdq
{

    private transient boolean h;
    private boolean i;
    private float j;
    private String k;

    public bko(Context context, AdSizeParcel adsizeparcel, String s, cex cex, VersionInfoParcel versioninfoparcel, bkf bkf)
    {
        super(context, adsizeparcel, s, cex, versioninfoparcel, bkf);
        h = false;
        k = (new StringBuilder("background")).append(hashCode()).append(".png").toString();
    }

    private void C()
    {
        (new bkp(this, k)).e();
        if (c.c())
        {
            c.a();
            c.j = null;
            c.E = false;
            h = false;
        }
    }

    private void a(Bundle bundle)
    {
        bkv.e();
        cjj.b(c.c, c.e.b, "gmob-apps", bundle, false);
    }

    static boolean a(bko bko1)
    {
        return bko1.i;
    }

    static float b(bko bko1)
    {
        return bko1.j;
    }

    protected final boolean B()
    {
        if (!(c.c instanceof Activity))
        {
            return false;
        }
        Window window = ((Activity)c.c).getWindow();
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

    protected final ckw a(ciu ciu1, bkg bkg)
    {
        bkv.f();
        ckw ckw1 = clc.a(c.c, c.i, false, false, c.d, c.e, a, f);
        ckx ckx1 = ckw1.k();
        cax cax = cbb.F;
        ckx1.a(this, null, this, this, ((Boolean)bkv.n().a(cax)).booleanValue(), this, this, bkg, null);
        ckw1.b(ciu1.a.w);
        return ckw1;
    }

    public final void a(boolean flag, float f)
    {
        i = flag;
        j = f;
    }

    public final boolean a(cit cit1, cit cit2)
    {
        if (!super.a(cit1, cit2))
        {
            return false;
        }
        if (!c.c() && c.B != null && cit2.j != null)
        {
            e.a(c.i, cit2, c.B);
        }
        return true;
    }

    public final boolean a(AdRequestParcel adrequestparcel, cbk cbk)
    {
        if (c.j != null)
        {
            bka.e("An interstitial is already loading. Aborting.");
            return false;
        } else
        {
            return super.a(adrequestparcel, cbk);
        }
    }

    protected final boolean a(AdRequestParcel adrequestparcel, cit cit1, boolean flag)
    {
        if (c.c() && cit1.b != null)
        {
            bkv.g();
            cjl.a(cit1.b.a());
        }
        return b.d;
    }

    public final void b(boolean flag)
    {
        c.E = flag;
    }

    public final void g()
    {
        btl.b("showInterstitial must be called on the main UI thread.");
        if (c.j == null)
        {
            bka.e("The interstitial has not loaded.");
        } else
        {
            cax cax = cbb.N;
            boolean flag;
            if (((Boolean)bkv.n().a(cax)).booleanValue())
            {
                Object obj;
                if (c.c.getApplicationContext() != null)
                {
                    obj = c.c.getApplicationContext().getPackageName();
                } else
                {
                    obj = c.c.getPackageName();
                }
                if (!h)
                {
                    bka.e("It is not recommended to show an interstitial before onAdLoaded completes.");
                    Bundle bundle = new Bundle();
                    bundle.putString("appid", ((String) (obj)));
                    bundle.putString("action", "show_interstitial_before_load_finish");
                    a(bundle);
                }
                bkv.e();
                if (!cjj.e(c.c))
                {
                    bka.e("It is not recommended to show an interstitial when app is not in foreground.");
                    Bundle bundle1 = new Bundle();
                    bundle1.putString("appid", ((String) (obj)));
                    bundle1.putString("action", "show_interstitial_app_not_in_foreground");
                    a(bundle1);
                }
            }
            if (c.C == 1)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            if (!flag)
            {
                if (c.j.k)
                {
                    try
                    {
                        c.j.m.b();
                        return;
                    }
                    // Misplaced declaration of an exception variable
                    catch (Object obj)
                    {
                        bka.c("Could not show interstitial.", ((Throwable) (obj)));
                    }
                    C();
                    return;
                }
                if (c.j.b == null)
                {
                    bka.e("The interstitial failed to load.");
                    return;
                }
                if (c.j.b.o())
                {
                    bka.e("The interstitial is already showing.");
                    return;
                }
                c.j.b.a(true);
                if (c.j.j != null)
                {
                    e.a(c.i, c.j);
                }
                Object obj1;
                cax cax1;
                if (c.E)
                {
                    bkv.e();
                    obj1 = cjj.f(c.c);
                } else
                {
                    obj1 = null;
                }
                cax1 = cbb.U;
                if (((Boolean)bkv.n().a(cax1)).booleanValue() && obj1 != null)
                {
                    (new bkq(this, ((android.graphics.Bitmap) (obj1)), k)).e();
                    return;
                }
                obj1 = new InterstitialAdParameterParcel(c.E, B(), null, false, 0.0F);
                int i1 = c.j.b.p();
                int l = i1;
                if (i1 == -1)
                {
                    l = c.j.g;
                }
                obj1 = new AdOverlayInfoParcel(this, this, this, c.j.b, l, c.e, c.j.t, ((InterstitialAdParameterParcel) (obj1)));
                bkv.c();
                bhq.a(c.c, ((AdOverlayInfoParcel) (obj1)), true);
                return;
            }
        }
    }

    public final void j_()
    {
        r();
        super.j_();
    }

    protected final boolean n()
    {
        C();
        return super.n();
    }

    protected final boolean q()
    {
        if (super.q())
        {
            h = true;
            return true;
        } else
        {
            return false;
        }
    }
}
