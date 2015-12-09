// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.ads;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.RelativeLayout;
import com.facebook.ads.internal.a;
import com.facebook.ads.internal.b;
import com.facebook.ads.internal.c;
import com.facebook.ads.internal.h;
import com.facebook.ads.internal.util.g;

// Referenced classes of package com.facebook.ads:
//            Ad, AdSize, AdListener, ImpressionListener

public class AdView extends RelativeLayout
    implements Ad
{

    private static final c a;
    private final DisplayMetrics b;
    private final AdSize c;
    private final String d;
    private h e;
    private volatile boolean f;
    private AdListener g;
    private ImpressionListener h;
    private View i;
    private boolean j;

    public AdView(Context context, String s, AdSize adsize)
    {
        super(context);
        j = false;
        if (adsize == null || adsize == AdSize.INTERSTITIAL)
        {
            throw new IllegalArgumentException("adSize");
        } else
        {
            b = getContext().getResources().getDisplayMetrics();
            c = adsize;
            d = s;
            s = com.facebook.ads.internal.util.g.a(adsize);
            e = new h(context, d, s, adsize, a, 1, false);
            e.a(new a() {

                final AdView a;

                public void a()
                {
                    if (com.facebook.ads.AdView.b(a) != null)
                    {
                        com.facebook.ads.AdView.b(a).c();
                    }
                }

                public void a(View view)
                {
                    if (view == null)
                    {
                        throw new IllegalStateException("Cannot present null view");
                    }
                    com.facebook.ads.AdView.a(a, true);
                    com.facebook.ads.AdView.a(a, view);
                    a.removeAllViews();
                    a.addView(com.facebook.ads.AdView.c(a));
                    if (com.facebook.ads.AdView.c(a) instanceof com.facebook.ads.internal.view.a)
                    {
                        com.facebook.ads.internal.util.g.a(AdView.d(a), com.facebook.ads.AdView.c(a), AdView.e(a));
                    }
                    if (com.facebook.ads.AdView.a(a) != null)
                    {
                        com.facebook.ads.AdView.a(a).onAdLoaded(a);
                    }
                }

                public void a(b b1)
                {
                    if (com.facebook.ads.AdView.a(a) != null)
                    {
                        com.facebook.ads.AdView.a(a).onError(a, b1.b());
                    }
                }

                public void b()
                {
                    if (com.facebook.ads.AdView.a(a) != null)
                    {
                        com.facebook.ads.AdView.a(a).onAdClicked(a);
                    }
                }

                public void c()
                {
                    if (AdView.f(a) != null)
                    {
                        AdView.f(a).onLoggingImpression(a);
                    }
                    if ((com.facebook.ads.AdView.a(a) instanceof ImpressionListener) && com.facebook.ads.AdView.a(a) != AdView.f(a))
                    {
                        ((ImpressionListener)com.facebook.ads.AdView.a(a)).onLoggingImpression(a);
                    }
                }

            
            {
                a = AdView.this;
                super();
            }
            });
            return;
        }
    }

    static View a(AdView adview, View view)
    {
        adview.i = view;
        return view;
    }

    static AdListener a(AdView adview)
    {
        return adview.g;
    }

    static boolean a(AdView adview, boolean flag)
    {
        adview.j = flag;
        return flag;
    }

    static h b(AdView adview)
    {
        return adview.e;
    }

    static View c(AdView adview)
    {
        return adview.i;
    }

    static DisplayMetrics d(AdView adview)
    {
        return adview.b;
    }

    static AdSize e(AdView adview)
    {
        return adview.c;
    }

    static ImpressionListener f(AdView adview)
    {
        return adview.h;
    }

    public void destroy()
    {
        if (e != null)
        {
            e.d();
            e = null;
        }
        removeAllViews();
        i = null;
    }

    public void disableAutoRefresh()
    {
        if (e != null)
        {
            e.h();
        }
    }

    public void loadAd()
    {
        if (!f)
        {
            e.b();
            f = true;
        } else
        if (e != null)
        {
            e.g();
            return;
        }
    }

    protected void onConfigurationChanged(Configuration configuration)
    {
        super.onConfigurationChanged(configuration);
        if (i != null)
        {
            com.facebook.ads.internal.util.g.a(b, i, c);
        }
    }

    protected void onWindowVisibilityChanged(int k)
    {
        super.onWindowVisibilityChanged(k);
        if (e != null)
        {
            if (k == 0)
            {
                e.f();
                return;
            }
            if (k == 8)
            {
                e.e();
                return;
            }
        }
    }

    public void setAdListener(AdListener adlistener)
    {
        g = adlistener;
    }

    public void setImpressionListener(ImpressionListener impressionlistener)
    {
        h = impressionlistener;
    }

    static 
    {
        a = c.a;
    }
}
