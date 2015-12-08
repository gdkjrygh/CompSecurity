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
import com.google.android.gms.ads.internal.client.zzz;

// Referenced classes of package com.google.android.gms.ads.doubleclick:
//            PublisherAdRequest, AppEventListener, OnCustomRenderedAdLoadedListener

public final class PublisherAdView extends ViewGroup
{

    private final zzz a;

    public PublisherAdView(Context context)
    {
        super(context);
        a = new zzz(this);
    }

    public PublisherAdView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        a = new zzz(this, attributeset, true);
    }

    public PublisherAdView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        a = new zzz(this, attributeset, true);
    }

    public final void destroy()
    {
        a.destroy();
    }

    public final AdListener getAdListener()
    {
        return a.getAdListener();
    }

    public final AdSize getAdSize()
    {
        return a.getAdSize();
    }

    public final AdSize[] getAdSizes()
    {
        return a.getAdSizes();
    }

    public final String getAdUnitId()
    {
        return a.getAdUnitId();
    }

    public final AppEventListener getAppEventListener()
    {
        return a.getAppEventListener();
    }

    public final String getMediationAdapterClassName()
    {
        return a.getMediationAdapterClassName();
    }

    public final OnCustomRenderedAdLoadedListener getOnCustomRenderedAdLoadedListener()
    {
        return a.getOnCustomRenderedAdLoadedListener();
    }

    public final void loadAd(PublisherAdRequest publisheradrequest)
    {
        a.zza(publisheradrequest.zzaF());
    }

    protected final void onLayout(boolean flag, int i, int j, int k, int l)
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

    protected final void onMeasure(int i, int j)
    {
        int k = 0;
        View view = getChildAt(0);
        int l;
        if (view != null && view.getVisibility() != 8)
        {
            measureChild(view, i, j);
            l = view.getMeasuredWidth();
            k = view.getMeasuredHeight();
        } else
        {
            AdSize adsize = getAdSize();
            if (adsize != null)
            {
                Context context = getContext();
                l = adsize.getWidthInPixels(context);
                k = adsize.getHeightInPixels(context);
            } else
            {
                l = 0;
            }
        }
        l = Math.max(l, getSuggestedMinimumWidth());
        k = Math.max(k, getSuggestedMinimumHeight());
        setMeasuredDimension(View.resolveSize(l, i), View.resolveSize(k, j));
    }

    public final void pause()
    {
        a.pause();
    }

    public final void recordManualImpression()
    {
        a.recordManualImpression();
    }

    public final void resume()
    {
        a.resume();
    }

    public final void setAdListener(AdListener adlistener)
    {
        a.setAdListener(adlistener);
    }

    public final transient void setAdSizes(AdSize aadsize[])
    {
        if (aadsize == null || aadsize.length <= 0)
        {
            throw new IllegalArgumentException("The supported ad sizes must contain at least one valid ad size.");
        } else
        {
            a.zza(aadsize);
            return;
        }
    }

    public final void setAdUnitId(String s)
    {
        a.setAdUnitId(s);
    }

    public final void setAppEventListener(AppEventListener appeventlistener)
    {
        a.setAppEventListener(appeventlistener);
    }

    public final void setManualImpressionsEnabled(boolean flag)
    {
        a.setManualImpressionsEnabled(flag);
    }

    public final void setOnCustomRenderedAdLoadedListener(OnCustomRenderedAdLoadedListener oncustomrenderedadloadedlistener)
    {
        a.setOnCustomRenderedAdLoadedListener(oncustomrenderedadloadedlistener);
    }
}
