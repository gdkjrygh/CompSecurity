// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.ads.purchase.InAppPurchaseListener;
import com.google.android.gms.internal.at;

// Referenced classes of package com.google.android.gms.ads:
//            AdRequest, AdSize, AdListener

public final class AdView extends ViewGroup
{

    private final at ku;

    public AdView(Context context)
    {
        super(context);
        ku = new at(this);
    }

    public AdView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        ku = new at(this, attributeset, false);
    }

    public AdView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        ku = new at(this, attributeset, false);
    }

    public void destroy()
    {
        ku.destroy();
    }

    public AdListener getAdListener()
    {
        return ku.getAdListener();
    }

    public AdSize getAdSize()
    {
        return ku.getAdSize();
    }

    public String getAdUnitId()
    {
        return ku.getAdUnitId();
    }

    public InAppPurchaseListener getInAppPurchaseListener()
    {
        return ku.getInAppPurchaseListener();
    }

    public void loadAd(AdRequest adrequest)
    {
        ku.a(adrequest.O());
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
        ku.pause();
    }

    public void resume()
    {
        ku.resume();
    }

    public void setAdListener(AdListener adlistener)
    {
        ku.setAdListener(adlistener);
    }

    public void setAdSize(AdSize adsize)
    {
        ku.setAdSizes(new AdSize[] {
            adsize
        });
    }

    public void setAdUnitId(String s)
    {
        ku.setAdUnitId(s);
    }

    public void setInAppPurchaseListener(InAppPurchaseListener inapppurchaselistener)
    {
        ku.setInAppPurchaseListener(inapppurchaselistener);
    }
}
