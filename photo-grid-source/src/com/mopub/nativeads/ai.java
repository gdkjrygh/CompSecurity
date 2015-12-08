// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mopub.nativeads;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.mopub.common.logging.MoPubLog;
import java.util.WeakHashMap;

// Referenced classes of package com.mopub.nativeads:
//            h, NativeResponse, aj, MoPubNativeAdRenderer, 
//            ViewBinder

final class ai
{

    static final WeakHashMap a = new WeakHashMap();
    private static final WeakHashMap b = new WeakHashMap();

    static View a(View view, ViewGroup viewgroup, Context context, NativeResponse nativeresponse, ViewBinder viewbinder)
    {
label0:
        {
label1:
            {
                com.mopub.common.Preconditions.NoThrow.checkNotNull(viewbinder, "ViewBinder is null.");
                if (view != null)
                {
                    a(context).a(view);
                    NativeResponse nativeresponse1 = (NativeResponse)b.get(view);
                    if (nativeresponse1 != null)
                    {
                        nativeresponse1.clear(view);
                    }
                }
                if (nativeresponse != null && !nativeresponse.isDestroyed() && viewbinder != null)
                {
                    break label0;
                }
                MoPubLog.d("nativeResponse or viewBinder null or invalid. Returning empty view");
                if (view != null)
                {
                    viewgroup = view;
                    if (aj.EMPTY.equals(view.getTag()))
                    {
                        break label1;
                    }
                }
                viewgroup = new View(context);
                viewgroup.setTag(aj.EMPTY);
                viewgroup.setVisibility(8);
            }
            return viewgroup;
        }
        MoPubNativeAdRenderer mopubnativeadrenderer;
label2:
        {
            mopubnativeadrenderer = new MoPubNativeAdRenderer(viewbinder);
            if (view != null)
            {
                viewbinder = view;
                if (aj.AD.equals(view.getTag()))
                {
                    break label2;
                }
            }
            viewbinder = mopubnativeadrenderer.createAdView(context, viewgroup);
            viewbinder.setTag(aj.AD);
        }
        b.put(viewbinder, nativeresponse);
        if (!nativeresponse.isOverridingImpressionTracker())
        {
            a(context).a(viewbinder, nativeresponse);
        }
        nativeresponse.prepare(viewbinder);
        mopubnativeadrenderer.renderAdView(viewbinder, nativeresponse);
        return viewbinder;
    }

    private static h a(Context context)
    {
        h h2 = (h)a.get(context);
        h h1 = h2;
        if (h2 == null)
        {
            h1 = new h(context);
            a.put(context, h1);
        }
        return h1;
    }

}
