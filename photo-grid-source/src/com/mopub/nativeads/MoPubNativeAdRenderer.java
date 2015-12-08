// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mopub.nativeads;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.util.WeakHashMap;

// Referenced classes of package com.mopub.nativeads:
//            MoPubAdRenderer, ViewBinder, ap, NativeResponse

public class MoPubNativeAdRenderer
    implements MoPubAdRenderer
{

    final WeakHashMap a = new WeakHashMap();
    private final ViewBinder b;

    public MoPubNativeAdRenderer(ViewBinder viewbinder)
    {
        b = viewbinder;
    }

    public View createAdView(Context context, ViewGroup viewgroup)
    {
        return LayoutInflater.from(context).inflate(b.a, viewgroup, false);
    }

    public void renderAdView(View view, NativeResponse nativeresponse)
    {
        ap ap2 = (ap)a.get(view);
        ap ap1 = ap2;
        if (ap2 == null)
        {
            ap1 = ap.a(view, b);
            a.put(view, ap1);
        }
        ap1.a(nativeresponse);
        ap.a(view, nativeresponse, b);
        view.setVisibility(0);
    }

    public volatile void renderAdView(View view, Object obj)
    {
        renderAdView(view, (NativeResponse)obj);
    }
}
