// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mopub.mobileads;

import com.mopub.common.CreativeOrientation;
import java.util.Map;

// Referenced classes of package com.mopub.mobileads:
//            ResponseBodyInterstitial, MoPubActivity

public class HtmlInterstitial extends ResponseBodyInterstitial
{

    private String d;
    private boolean e;
    private String f;
    private String g;
    private CreativeOrientation h;

    public HtmlInterstitial()
    {
    }

    protected final void a(CustomEventInterstitial.CustomEventInterstitialListener customeventinterstitiallistener)
    {
        MoPubActivity.a(a, b, customeventinterstitiallistener, d);
    }

    protected final void a(Map map)
    {
        d = (String)map.get("Html-Response-Body");
        e = Boolean.valueOf((String)map.get("Scrollable")).booleanValue();
        f = (String)map.get("Redirect-Url");
        g = (String)map.get("Clickthrough-Url");
        h = CreativeOrientation.fromHeader((String)map.get("com_mopub_orientation"));
    }

    public void showInterstitial()
    {
        MoPubActivity.start(a, d, b, e, f, g, h, c);
    }
}
