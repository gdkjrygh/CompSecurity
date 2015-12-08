// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads.internal;

import android.content.Context;
import android.os.RemoteException;
import android.view.View;
import com.google.android.gms.ads.internal.client.AdRequestParcel;
import com.google.android.gms.ads.internal.client.AdSizeParcel;
import com.google.android.gms.ads.internal.client.n;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.client.a;
import com.google.android.gms.ads.internal.util.client.b;
import com.google.android.gms.b.d;
import com.google.android.gms.common.internal.y;
import com.google.android.gms.internal.dh;
import com.google.android.gms.internal.di;
import com.google.android.gms.internal.gb;
import com.google.android.gms.internal.gm;
import com.google.android.gms.internal.hi;
import com.google.android.gms.internal.hj;
import com.google.android.gms.internal.x;

// Referenced classes of package com.google.android.gms.ads.internal:
//            c, zzq, p

public final class f extends c
{

    private boolean i;

    public f(Context context, AdSizeParcel adsizeparcel, String s, dh dh, VersionInfoParcel versioninfoparcel)
    {
        super(context, adsizeparcel, s, dh, versioninfoparcel, null);
    }

    private boolean b(gb gb1, gb gb2)
    {
        if (!gb2.k)
        {
            break MISSING_BLOCK_LABEL_190;
        }
        View view;
        try
        {
            gb2 = gb2.m.a();
        }
        // Misplaced declaration of an exception variable
        catch (gb gb1)
        {
            com.google.android.gms.ads.internal.util.client.b.b("Could not get View from mediation adapter.", gb1);
            return false;
        }
        if (gb2 != null)
        {
            break MISSING_BLOCK_LABEL_28;
        }
        com.google.android.gms.ads.internal.util.client.b.c("View in mediation adapter is null.");
        return false;
        gb2 = (View)d.a(gb2);
        view = c.f.getNextView();
        if (view != null)
        {
            if (view instanceof hi)
            {
                ((hi)view).destroy();
            }
            c.f.removeView(view);
        }
        try
        {
            a(gb2);
        }
        // Misplaced declaration of an exception variable
        catch (gb gb1)
        {
            com.google.android.gms.ads.internal.util.client.b.b("Could not add mediation view to view hierarchy.", gb1);
            return false;
        }
_L1:
        if (c.f.getChildCount() > 1)
        {
            c.f.showNext();
        }
        if (gb1 != null)
        {
            gb1 = c.f.getNextView();
            if (gb1 instanceof hi)
            {
                ((hi)gb1).a(c.c, c.i);
            } else
            if (gb1 != null)
            {
                c.f.removeView(gb1);
            }
            c.c();
        }
        c.f.setVisibility(0);
        return true;
        if (gb2.r != null && gb2.b != null)
        {
            gb2.b.a(gb2.r);
            c.f.removeAllViews();
            c.f.setMinimumWidth(gb2.r.g);
            c.f.setMinimumHeight(gb2.r.d);
            a(gb2.b.a());
        }
          goto _L1
    }

    public final void a(boolean flag)
    {
        y.b("setManualImpressionsEnabled must be called from the main thread.");
        i = flag;
    }

    public final boolean a(AdRequestParcel adrequestparcel)
    {
        if (adrequestparcel.h != i)
        {
            int j = adrequestparcel.a;
            long l1 = adrequestparcel.b;
            android.os.Bundle bundle = adrequestparcel.c;
            int k = adrequestparcel.d;
            java.util.List list = adrequestparcel.e;
            boolean flag1 = adrequestparcel.f;
            int l = adrequestparcel.g;
            boolean flag;
            if (adrequestparcel.h || i)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            adrequestparcel = new AdRequestParcel(j, l1, bundle, k, list, flag1, l, flag, adrequestparcel.i, adrequestparcel.j, adrequestparcel.k, adrequestparcel.l, adrequestparcel.m, adrequestparcel.n, adrequestparcel.o, adrequestparcel.p, adrequestparcel.q);
        }
        return super.a(adrequestparcel);
    }

    public final boolean a(gb gb1, gb gb2)
    {
        if (!super.a(gb1, gb2))
        {
            return false;
        }
        if (c.d() && !b(gb1, gb2))
        {
            a(0);
            return false;
        }
        a(gb2, false);
        if (!c.d()) goto _L2; else goto _L1
_L1:
        if (gb2.b != null)
        {
            if (gb2.j != null)
            {
                e.a(c.i, gb2);
            }
            if (gb2.a())
            {
                e.a(c.i, gb2).a(gb2.b);
            } else
            {
                gb2.b.j().a(new com.google.android.gms.internal.hj.b(gb2) {

                    final gb a;
                    final f b;

                    public final void a()
                    {
                        b.e.a(b.c.i, a).a(a.b);
                    }

            
            {
                b = f.this;
                a = gb1;
                super();
            }
                });
            }
        }
_L4:
        return true;
_L2:
        if (c.B != null && gb2.j != null)
        {
            e.a(c.i, gb2, c.B);
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public final void g()
    {
        throw new IllegalStateException("Interstitial is NOT supported by BannerAdManager.");
    }

    protected final boolean r()
    {
        boolean flag = true;
        p.e();
        if (!gm.a(c.c.getPackageManager(), c.c.getPackageName(), "android.permission.INTERNET"))
        {
            n.a();
            com.google.android.gms.ads.internal.util.client.a.a(c.f, c.i, "Missing internet permission in AndroidManifest.xml.", "Missing internet permission in AndroidManifest.xml. You must have the following declaration: <uses-permission android:name=\"android.permission.INTERNET\" />");
            flag = false;
        }
        p.e();
        if (!gm.a(c.c))
        {
            n.a();
            com.google.android.gms.ads.internal.util.client.a.a(c.f, c.i, "Missing AdActivity with android:configChanges in AndroidManifest.xml.", "Missing AdActivity with android:configChanges in AndroidManifest.xml. You must have the following declaration within the <application> element: <activity android:name=\"com.google.android.gms.ads.AdActivity\" android:configChanges=\"keyboard|keyboardHidden|orientation|screenLayout|uiMode|screenSize|smallestScreenSize\" />");
            flag = false;
        }
        if (!flag && c.f != null)
        {
            c.f.setVisibility(0);
        }
        return flag;
    }
}
