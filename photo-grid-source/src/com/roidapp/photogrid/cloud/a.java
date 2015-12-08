// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid.cloud;

import android.app.Activity;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import android.widget.LinearLayout;
import com.cm.kinfoc.s;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.AdView;
import com.mopub.mobileads.MoPubView;
import com.roidapp.baselib.c.aj;
import com.roidapp.baselib.c.n;
import com.roidapp.cloudlib.ads.f;
import com.roidapp.cloudlib.ads.l;
import com.roidapp.photogrid.b.e;
import com.roidapp.photogrid.release.ParentActivity;
import com.roidapp.photogrid.release.lp;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

// Referenced classes of package com.roidapp.photogrid.cloud:
//            c, d, b

public final class a
    implements l
{

    private Activity a;
    private LinearLayout b;
    private AdView c;
    private MoPubView d;
    private Queue e;
    private String f;
    private com.roidapp.cloudlib.ads.e g;

    public a()
    {
    }

    public static void a(Activity activity, int i, int j)
    {
        if ((activity instanceof ParentActivity) && !activity.isFinishing())
        {
            activity = ((ParentActivity)activity).c();
            if (activity != null)
            {
                activity = String.format("page_name=%s&action_type=%s&ads_type=%s", new Object[] {
                    (new StringBuilder()).append(activity).append("_View").toString(), Integer.valueOf(i), Integer.valueOf(j)
                });
                com.roidapp.photogrid.b.e.a();
                s.a().a("grid_banner_ads", activity);
            }
        }
    }

    static void a(a a1)
    {
        a1.e();
    }

    static Activity b(a a1)
    {
        return a1.a;
    }

    static com.roidapp.cloudlib.ads.e c(a a1)
    {
        return a1.g;
    }

    static LinearLayout d(a a1)
    {
        return a1.b;
    }

    static com.roidapp.cloudlib.ads.e e(a a1)
    {
        a1.g = null;
        return null;
    }

    private void e()
    {
_L9:
        if (a != null && !a.isFinishing() && b != null) goto _L2; else goto _L1
_L1:
        return;
_L2:
        boolean flag;
        if (e == null)
        {
            e = com.roidapp.cloudlib.a.a.a(aj.a()).e("ad", "sort_banner");
            if (e == null)
            {
                e = new LinkedList(Arrays.asList(new Integer[] {
                    Integer.valueOf(5), Integer.valueOf(6), Integer.valueOf(3)
                }));
            }
        }
        Integer integer;
        if (e != null)
        {
            integer = (Integer)e.poll();
        } else
        {
            integer = null;
        }
        if (integer == null) goto _L1; else goto _L3
_L3:
        integer.intValue();
        JVM INSTR tableswitch 3 6: default 156
    //                   3 338
    //                   4 156
    //                   5 266
    //                   6 168;
           goto _L4 _L5 _L4 _L6 _L7
_L5:
        break MISSING_BLOCK_LABEL_338;
_L7:
        break; /* Loop/switch isn't completed */
_L4:
        flag = false;
_L10:
        if (flag)
        {
            return;
        }
        if (true) goto _L9; else goto _L8
_L8:
        if (n.d() && d == null)
        {
            d = new MoPubView(a);
            d.setAdUnitId("51dade5b672d44b2a947e031083cec8f");
            d.setBannerAdListener(new c(this));
            b.addView(d, -1, (int)(a.getResources().getDisplayMetrics().density * 50F));
            d.loadAd();
            flag = true;
        } else
        {
            flag = false;
        }
          goto _L10
_L6:
        if (com.roidapp.photogrid.common.a.a().b)
        {
            flag = false;
        } else
        {
            if (g == null)
            {
                g = new com.roidapp.cloudlib.ads.e(this, new d(this, (byte)0));
            }
            com.cmcm.adsdk.f f1 = com.roidapp.cloudlib.ads.f.a().a(a, 40005);
            f1.a(g);
            f1.a();
            flag = true;
        }
          goto _L10
        flag = f();
          goto _L10
    }

    static MoPubView f(a a1)
    {
        return a1.d;
    }

    private boolean f()
    {
        if (!com.roidapp.photogrid.common.a.a().a && f != null) goto _L2; else goto _L1
_L1:
        return false;
_L2:
        if (c != null) goto _L1; else goto _L3
_L3:
        c = new AdView(a);
        c.setAdSize(AdSize.SMART_BANNER);
        c.setAdUnitId(f);
        c.setAdListener(new b(this));
        new lp();
        lp.a(a, c, b);
        return true;
        Object obj;
        obj;
        ((Error) (obj)).printStackTrace();
        return false;
        obj;
        ((Exception) (obj)).printStackTrace();
        return false;
    }

    static MoPubView g(a a1)
    {
        a1.d = null;
        return null;
    }

    public final void a()
    {
        if (g != null)
        {
            g.b();
        }
    }

    public final void a(Activity activity, LinearLayout linearlayout, String s1)
    {
        a = activity;
        b = linearlayout;
        f = s1;
        e();
    }

    public final void b()
    {
        if (g != null)
        {
            g.c();
        }
    }

    public final void c()
    {
        if (b != null)
        {
            b.removeAllViews();
            b = null;
        }
        if (c != null)
        {
            c.setAdListener(null);
            c.destroy();
            c = null;
        }
        if (d != null)
        {
            d.destroy();
            d = null;
        }
        if (g != null)
        {
            g.e();
        }
        g = null;
        a = null;
    }

    public final void d()
    {
        if (b != null)
        {
            b.removeAllViews();
        }
    }
}
