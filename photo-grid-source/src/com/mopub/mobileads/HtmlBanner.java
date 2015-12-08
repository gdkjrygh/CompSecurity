// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mopub.mobileads;

import android.content.Context;
import com.mopub.common.AdReport;
import com.mopub.common.logging.MoPubLog;
import com.mopub.mobileads.factories.HtmlBannerWebViewFactory;
import java.util.Map;

// Referenced classes of package com.mopub.mobileads:
//            CustomEventBanner, HtmlBannerWebView, AdViewController, MoPubErrorCode

public class HtmlBanner extends CustomEventBanner
{

    private HtmlBannerWebView a;

    public HtmlBanner()
    {
    }

    protected final void a()
    {
        if (a != null)
        {
            a.destroy();
        }
    }

    protected final void a(Context context, CustomEventBanner.CustomEventBannerListener customeventbannerlistener, Map map, Map map1)
    {
        if (map1.containsKey("Html-Response-Body"))
        {
            String s = (String)map1.get("Html-Response-Body");
            String s1 = (String)map1.get("Redirect-Url");
            String s2 = (String)map1.get("Clickthrough-Url");
            map1 = Boolean.valueOf((String)map1.get("Scrollable"));
            try
            {
                map = (AdReport)map.get("mopub-intent-ad-report");
            }
            // Misplaced declaration of an exception variable
            catch (Context context)
            {
                MoPubLog.e("LocalExtras contained an incorrect type.");
                customeventbannerlistener.onBannerFailed(MoPubErrorCode.INTERNAL_ERROR);
                return;
            }
            a = HtmlBannerWebViewFactory.create(context, map, customeventbannerlistener, map1.booleanValue(), s1, s2);
            AdViewController.setShouldHonorServerDimensions(a);
            a.a(s);
            return;
        } else
        {
            customeventbannerlistener.onBannerFailed(MoPubErrorCode.NETWORK_INVALID_STATE);
            return;
        }
    }
}
