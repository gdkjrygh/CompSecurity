// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mopub.mobileads;

import android.content.Context;
import android.os.Handler;
import com.mopub.common.AdReport;
import com.mopub.common.Preconditions;
import com.mopub.common.logging.MoPubLog;
import com.mopub.mobileads.factories.CustomEventInterstitialFactory;
import java.util.Map;
import java.util.TreeMap;

// Referenced classes of package com.mopub.mobileads:
//            MoPubInterstitial, p, MoPubErrorCode, CustomEventInterstitial, 
//            q

public class CustomEventInterstitialAdapter
    implements CustomEventInterstitial.CustomEventInterstitialListener
{

    public static final int DEFAULT_INTERSTITIAL_TIMEOUT_DELAY = 30000;
    private final MoPubInterstitial a;
    private boolean b;
    private q c;
    private CustomEventInterstitial d;
    private Context e;
    private Map f;
    private Map g;
    private final Handler h = new Handler();
    private final Runnable i = new p(this);

    public CustomEventInterstitialAdapter(MoPubInterstitial mopubinterstitial, String s, Map map, long l, AdReport adreport)
    {
        Preconditions.checkNotNull(map);
        a = mopubinterstitial;
        e = a.getActivity();
        MoPubLog.d((new StringBuilder("Attempting to invoke custom event: ")).append(s).toString());
        try
        {
            d = CustomEventInterstitialFactory.create(s);
        }
        // Misplaced declaration of an exception variable
        catch (MoPubInterstitial mopubinterstitial)
        {
            MoPubLog.d((new StringBuilder("Couldn't locate or instantiate custom event: ")).append(s).append(".").toString());
            a.onCustomEventInterstitialFailed(MoPubErrorCode.ADAPTER_NOT_FOUND);
            return;
        }
        g = new TreeMap(map);
        f = a.getLocalExtras();
        if (a.getLocation() != null)
        {
            f.put("location", a.getLocation());
        }
        f.put("broadcastIdentifier", Long.valueOf(l));
        f.put("mopub-intent-ad-report", adreport);
    }

    private void d()
    {
        h.removeCallbacks(i);
    }

    private int e()
    {
        if (a == null || a.a() == null || a.a().intValue() < 0)
        {
            return 30000;
        } else
        {
            return a.a().intValue() * 1000;
        }
    }

    final void a()
    {
        if (b || d == null)
        {
            return;
        }
        if (e() > 0)
        {
            h.postDelayed(i, e());
        }
        d.loadInterstitial(e, this, f, g);
    }

    final void a(q q1)
    {
        c = q1;
    }

    final void b()
    {
        if (b || d == null)
        {
            return;
        } else
        {
            d.showInterstitial();
            return;
        }
    }

    final void c()
    {
        if (d != null)
        {
            d.onInvalidate();
        }
        d = null;
        e = null;
        g = null;
        f = null;
        c = null;
        b = true;
    }

    public void onInterstitialClicked()
    {
        while (b || c == null) 
        {
            return;
        }
        c.onCustomEventInterstitialClicked();
    }

    public void onInterstitialDismissed()
    {
        while (b || c == null) 
        {
            return;
        }
        c.onCustomEventInterstitialDismissed();
    }

    public void onInterstitialFailed(MoPubErrorCode mopuberrorcode)
    {
        while (b || c == null) 
        {
            return;
        }
        MoPubErrorCode mopuberrorcode1 = mopuberrorcode;
        if (mopuberrorcode == null)
        {
            mopuberrorcode1 = MoPubErrorCode.UNSPECIFIED;
        }
        d();
        c.onCustomEventInterstitialFailed(mopuberrorcode1);
    }

    public void onInterstitialLoaded()
    {
        if (!b)
        {
            d();
            if (c != null)
            {
                c.onCustomEventInterstitialLoaded();
                return;
            }
        }
    }

    public void onInterstitialShown()
    {
        while (b || c == null) 
        {
            return;
        }
        c.onCustomEventInterstitialShown();
    }

    public void onLeaveApplication()
    {
        onInterstitialClicked();
    }
}
