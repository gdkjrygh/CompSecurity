// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.os.RemoteException;
import android.view.View;
import com.google.android.gms.ads.internal.client.AdRequestParcel;
import com.google.android.gms.ads.internal.client.AdSizeParcel;
import com.google.android.gms.ads.internal.request.AdResponseParcel;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;

public final class bkj extends bke
{

    private boolean h;

    public bkj(Context context, AdSizeParcel adsizeparcel, String s1, cex cex, VersionInfoParcel versioninfoparcel, bkf bkf)
    {
        super(context, adsizeparcel, s1, cex, versioninfoparcel, bkf);
    }

    private boolean b(cit cit1, cit cit2)
    {
        if (!cit2.k)
        {
            break MISSING_BLOCK_LABEL_194;
        }
        View view;
        try
        {
            cit2 = cit2.m.a();
        }
        // Misplaced declaration of an exception variable
        catch (cit cit1)
        {
            bka.c("Could not get View from mediation adapter.", cit1);
            return false;
        }
        if (cit2 != null)
        {
            break MISSING_BLOCK_LABEL_28;
        }
        bka.e("View in mediation adapter is null.");
        return false;
        cit2 = (View)bye.a(cit2);
        view = c.f.getNextView();
        if (view != null)
        {
            if (view instanceof ckw)
            {
                ((ckw)view).destroy();
            }
            c.f.removeView(view);
        }
        try
        {
            a(cit2);
        }
        // Misplaced declaration of an exception variable
        catch (cit cit1)
        {
            bka.c("Could not add mediation view to view hierarchy.", cit1);
            return false;
        }
_L1:
        if (c.f.getChildCount() > 1)
        {
            c.f.showNext();
        }
        if (cit1 != null)
        {
            cit1 = c.f.getNextView();
            if (cit1 instanceof ckw)
            {
                ((ckw)cit1).a(c.c, c.i, a);
            } else
            if (cit1 != null)
            {
                c.f.removeView(cit1);
            }
            c.b();
        }
        c.f.setVisibility(0);
        return true;
        if (cit2.q != null && cit2.b != null)
        {
            cit2.b.a(cit2.q);
            c.f.removeAllViews();
            c.f.setMinimumWidth(cit2.q.g);
            c.f.setMinimumHeight(cit2.q.d);
            a(cit2.b.b());
        }
          goto _L1
    }

    protected final ckw a(ciu ciu1, bkg bkg)
    {
        if (c.i.j)
        {
            bkw bkw1 = c;
            Object obj;
            if (ciu1.b.B)
            {
                obj = c.i;
            } else
            {
                obj = ciu1.b.m;
                if (obj != null)
                {
                    obj = ((String) (obj)).split("[xX]");
                    obj[0] = obj[0].trim();
                    obj[1] = obj[1].trim();
                    obj = new ber(Integer.parseInt(obj[0]), Integer.parseInt(obj[1]));
                } else
                {
                    obj = c.i.b();
                }
                obj = new AdSizeParcel(c.c, ((ber) (obj)));
            }
            bkw1.i = ((AdSizeParcel) (obj));
        }
        return super.a(ciu1, bkg);
    }

    public final void a(boolean flag)
    {
        btl.b("setManualImpressionsEnabled must be called from the main thread.");
        h = flag;
    }

    public final boolean a(cit cit1, cit cit2)
    {
        if (!super.a(cit1, cit2))
        {
            return false;
        }
        if (c.c() && !b(cit1, cit2))
        {
            a(0);
            return false;
        }
        a(cit2, false);
        if (!c.c()) goto _L2; else goto _L1
_L1:
        if (cit2.b != null)
        {
            if (cit2.j != null)
            {
                e.a(c.i, cit2);
            }
            if (cit2.a())
            {
                e.a(c.i, cit2).a(cit2.b);
            } else
            {
                cit2.b.k().e = new ckz(cit2) {

                    private cit a;
                    private bkj b;

                    public final void a()
                    {
                        b.e.a(b.c.i, a).a(a.b);
                    }

            
            {
                b = bkj.this;
                a = cit1;
                super();
            }
                };
            }
        }
_L4:
        return true;
_L2:
        if (c.B != null && cit2.j != null)
        {
            e.a(c.i, cit2, c.B);
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public final boolean a(AdRequestParcel adrequestparcel)
    {
        if (adrequestparcel.h != h)
        {
            int i = adrequestparcel.a;
            long l = adrequestparcel.b;
            android.os.Bundle bundle = adrequestparcel.c;
            int j = adrequestparcel.d;
            java.util.List list = adrequestparcel.e;
            boolean flag1 = adrequestparcel.f;
            int k = adrequestparcel.g;
            boolean flag;
            if (adrequestparcel.h || h)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            adrequestparcel = new AdRequestParcel(i, l, bundle, j, list, flag1, k, flag, adrequestparcel.i, adrequestparcel.j, adrequestparcel.k, adrequestparcel.l, adrequestparcel.m, adrequestparcel.n, adrequestparcel.o, adrequestparcel.p, adrequestparcel.q);
        }
        return super.a(adrequestparcel);
    }

    public final void g()
    {
        throw new IllegalStateException("Interstitial is NOT supported by BannerAdManager.");
    }

    protected final boolean s()
    {
        boolean flag = true;
        bkv.e();
        if (!cjj.a(c.c.getPackageManager(), c.c.getPackageName(), "android.permission.INTERNET"))
        {
            bfq.a();
            bjz.a(c.f, c.i, "Missing internet permission in AndroidManifest.xml.", "Missing internet permission in AndroidManifest.xml. You must have the following declaration: <uses-permission android:name=\"android.permission.INTERNET\" />");
            flag = false;
        }
        bkv.e();
        if (!cjj.a(c.c))
        {
            bfq.a();
            bjz.a(c.f, c.i, "Missing AdActivity with android:configChanges in AndroidManifest.xml.", "Missing AdActivity with android:configChanges in AndroidManifest.xml. You must have the following declaration within the <application> element: <activity android:name=\"com.google.android.gms.ads.AdActivity\" android:configChanges=\"keyboard|keyboardHidden|orientation|screenLayout|uiMode|screenSize|smallestScreenSize\" />");
            flag = false;
        }
        if (!flag && c.f != null)
        {
            c.f.setVisibility(0);
        }
        return flag;
    }
}
