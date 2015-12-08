// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads.doubleclick;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.internal.av;

// Referenced classes of package com.google.android.gms.ads.doubleclick:
//            PublisherAdRequest, AppEventListener

public final class PublisherAdView extends ViewGroup
{

    private final av kv;

    public PublisherAdView(Context context)
    {
        super(context);
        kv = new av(this);
    }

    public PublisherAdView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        kv = new av(this, attributeset, true);
    }

    public PublisherAdView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        kv = new av(this, attributeset, true);
    }

    public void destroy()
    {
        kv.destroy();
    }

    public AdListener getAdListener()
    {
        return kv.getAdListener();
    }

    public AdSize getAdSize()
    {
        return kv.getAdSize();
    }

    public AdSize[] getAdSizes()
    {
        return kv.getAdSizes();
    }

    public String getAdUnitId()
    {
        return kv.getAdUnitId();
    }

    public AppEventListener getAppEventListener()
    {
        return kv.getAppEventListener();
    }

    public void loadAd(PublisherAdRequest publisheradrequest)
    {
        kv.a(publisheradrequest.O());
    }

    protected void onLayout(boolean flag, int i, int j, int k, int l)
    {
        View view = getChildAt(0);
        if (view != null && view.getVisibility() != 8)
        {
            int i1 = view.getMeasuredWidth();
            int j1 = view.getMeasuredHeight();
            i = (k - i - i1) / 2;
            j = (l - j - j1) / 2;
            view.layout(i, j, i1 + i, j1 + j);
        }
    }

    protected void onMeasure(int i, int j)
    {
        int k = 0;
        View view = getChildAt(0);
        AdSize adsize = getAdSize();
        int l;
        if (view != null && view.getVisibility() != 8)
        {
            measureChild(view, i, j);
            l = view.getMeasuredWidth();
            k = view.getMeasuredHeight();
        } else
        if (adsize != null)
        {
            Context context = getContext();
            l = adsize.getWidthInPixels(context);
            k = adsize.getHeightInPixels(context);
        } else
        {
            l = 0;
        }
        l = Math.max(l, getSuggestedMinimumWidth());
        k = Math.max(k, getSuggestedMinimumHeight());
        setMeasuredDimension(View.resolveSize(l, i), View.resolveSize(k, j));
    }

    public void pause()
    {
        kv.pause();
    }

    public void recordManualImpression()
    {
        kv.recordManualImpression();
    }

    public void resume()
    {
        kv.resume();
    }

    public void setAdListener(AdListener adlistener)
    {
        kv.setAdListener(adlistener);
    }

    public transient void setAdSizes(AdSize aadsize[])
    {
        if (aadsize == null || aadsize.length < 1)
        {
            throw new IllegalArgumentException("The supported ad sizes must contain at least one valid ad size.");
        } else
        {
            kv.a(aadsize);
            return;
        }
    }

    public void setAdUnitId(String s)
    {
        kv.setAdUnitId(s);
    }

    public void setAppEventListener(AppEventListener appeventlistener)
    {
        kv.setAppEventListener(appeventlistener);
    }
}
