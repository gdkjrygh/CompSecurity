// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.ads.purchase.InAppPurchaseListener;
import com.google.android.gms.ads.purchase.PlayStorePurchaseListener;
import com.google.android.gms.internal.au;

// Referenced classes of package com.google.android.gms.ads:
//            AdRequest, AdSize, AdListener

public final class AdView extends ViewGroup
{

    private final au kx;

    public AdView(Context context)
    {
        super(context);
        kx = new au(this);
    }

    public AdView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        kx = new au(this, attributeset, false);
    }

    public AdView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        kx = new au(this, attributeset, false);
    }

    public void destroy()
    {
        kx.destroy();
    }

    public AdListener getAdListener()
    {
        return kx.getAdListener();
    }

    public AdSize getAdSize()
    {
        return kx.getAdSize();
    }

    public String getAdUnitId()
    {
        return kx.getAdUnitId();
    }

    public InAppPurchaseListener getInAppPurchaseListener()
    {
        return kx.getInAppPurchaseListener();
    }

    public void loadAd(AdRequest adrequest)
    {
        kx.a(adrequest.T());
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
        kx.pause();
    }

    public void resume()
    {
        kx.resume();
    }

    public void setAdListener(AdListener adlistener)
    {
        kx.setAdListener(adlistener);
    }

    public void setAdSize(AdSize adsize)
    {
        kx.setAdSizes(new AdSize[] {
            adsize
        });
    }

    public void setAdUnitId(String s)
    {
        kx.setAdUnitId(s);
    }

    public void setInAppPurchaseListener(InAppPurchaseListener inapppurchaselistener)
    {
        kx.setInAppPurchaseListener(inapppurchaselistener);
    }

    public void setPlayStorePurchaseParams(PlayStorePurchaseListener playstorepurchaselistener, String s)
    {
        kx.setPlayStorePurchaseParams(playstorepurchaselistener, s);
    }
}
