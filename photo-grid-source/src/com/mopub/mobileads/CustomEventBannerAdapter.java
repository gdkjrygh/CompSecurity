// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mopub.mobileads;

import android.content.Context;
import android.os.Handler;
import android.view.View;
import com.mopub.common.AdReport;
import com.mopub.common.Preconditions;
import com.mopub.common.logging.MoPubLog;
import com.mopub.mobileads.factories.CustomEventBannerFactory;
import java.util.Map;
import java.util.TreeMap;

// Referenced classes of package com.mopub.mobileads:
//            MoPubView, o, MoPubErrorCode, CustomEventBanner, 
//            HtmlBannerWebView

public class CustomEventBannerAdapter
    implements CustomEventBanner.CustomEventBannerListener
{

    public static final int DEFAULT_BANNER_TIMEOUT_DELAY = 10000;
    private boolean a;
    private MoPubView b;
    private Context c;
    private CustomEventBanner d;
    private Map e;
    private Map f;
    private final Handler g = new Handler();
    private final Runnable h = new o(this);
    private boolean i;

    public CustomEventBannerAdapter(MoPubView mopubview, String s, Map map, long l, AdReport adreport)
    {
        Preconditions.checkNotNull(map);
        b = mopubview;
        c = mopubview.getContext();
        MoPubLog.d((new StringBuilder("Attempting to invoke custom event: ")).append(s).toString());
        try
        {
            d = CustomEventBannerFactory.create(s);
        }
        // Misplaced declaration of an exception variable
        catch (MoPubView mopubview)
        {
            MoPubLog.d((new StringBuilder("Couldn't locate or instantiate custom event: ")).append(s).append(".").toString());
            b.b(MoPubErrorCode.ADAPTER_NOT_FOUND);
            return;
        }
        f = new TreeMap(map);
        e = b.getLocalExtras();
        if (b.getLocation() != null)
        {
            e.put("location", b.getLocation());
        }
        e.put("broadcastIdentifier", Long.valueOf(l));
        e.put("mopub-intent-ad-report", adreport);
        e.put("com_mopub_ad_width", Integer.valueOf(b.getAdWidth()));
        e.put("com_mopub_ad_height", Integer.valueOf(b.getAdHeight()));
    }

    private void c()
    {
        g.removeCallbacks(h);
    }

    private int d()
    {
        if (b == null || b.b() == null || b.b().intValue() < 0)
        {
            return 10000;
        } else
        {
            return b.b().intValue() * 1000;
        }
    }

    final void a()
    {
        if (a || d == null)
        {
            return;
        }
        if (d() > 0)
        {
            g.postDelayed(h, d());
        }
        d.a(c, this, e, f);
    }

    final void b()
    {
        if (d != null)
        {
            d.a();
        }
        c = null;
        d = null;
        e = null;
        f = null;
        a = true;
    }

    public void onBannerClicked()
    {
        while (a || b == null) 
        {
            return;
        }
        b.c();
    }

    public void onBannerCollapsed()
    {
        if (a)
        {
            return;
        } else
        {
            b.setAutorefreshEnabled(i);
            b.f();
            return;
        }
    }

    public void onBannerExpanded()
    {
        if (a)
        {
            return;
        } else
        {
            i = b.getAutorefreshEnabled();
            b.setAutorefreshEnabled(false);
            b.e();
            return;
        }
    }

    public void onBannerFailed(MoPubErrorCode mopuberrorcode)
    {
        while (a || b == null) 
        {
            return;
        }
        MoPubErrorCode mopuberrorcode1 = mopuberrorcode;
        if (mopuberrorcode == null)
        {
            mopuberrorcode1 = MoPubErrorCode.UNSPECIFIED;
        }
        c();
        b.b(mopuberrorcode1);
    }

    public void onBannerLoaded(View view)
    {
        if (!a)
        {
            c();
            if (b != null)
            {
                b.g();
                b.setAdContentView(view);
                if (!(view instanceof HtmlBannerWebView))
                {
                    b.d();
                    return;
                }
            }
        }
    }

    public void onLeaveApplication()
    {
        onBannerClicked();
    }
}
