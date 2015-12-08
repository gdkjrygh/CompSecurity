// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.ads.internal.client.zza;
import com.google.android.gms.ads.internal.client.zzz;
import com.google.android.gms.ads.purchase.InAppPurchaseListener;
import com.google.android.gms.ads.purchase.PlayStorePurchaseListener;

// Referenced classes of package com.google.android.gms.ads:
//            AdRequest, AdSize, AdListener

public final class AdView extends ViewGroup
{

    private final zzz a;

    public AdView(Context context)
    {
        super(context);
        a = new zzz(this);
    }

    public AdView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        a = new zzz(this, attributeset, false);
    }

    public AdView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        a = new zzz(this, attributeset, false);
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

    public final String getAdUnitId()
    {
        return a.getAdUnitId();
    }

    public final InAppPurchaseListener getInAppPurchaseListener()
    {
        return a.getInAppPurchaseListener();
    }

    public final String getMediationAdapterClassName()
    {
        return a.getMediationAdapterClassName();
    }

    public final boolean isLoading()
    {
        return a.isLoading();
    }

    public final void loadAd(AdRequest adrequest)
    {
        a.zza(adrequest.zzaF());
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

    public final void resume()
    {
        a.resume();
    }

    public final void setAdListener(AdListener adlistener)
    {
        a.setAdListener(adlistener);
        if (adlistener != null && (adlistener instanceof zza))
        {
            a.zza((zza)adlistener);
        } else
        if (adlistener == null)
        {
            a.zza(null);
            return;
        }
    }

    public final void setAdSize(AdSize adsize)
    {
        a.setAdSizes(new AdSize[] {
            adsize
        });
    }

    public final void setAdUnitId(String s)
    {
        a.setAdUnitId(s);
    }

    public final void setInAppPurchaseListener(InAppPurchaseListener inapppurchaselistener)
    {
        a.setInAppPurchaseListener(inapppurchaselistener);
    }

    public final void setPlayStorePurchaseParams(PlayStorePurchaseListener playstorepurchaselistener, String s)
    {
        a.setPlayStorePurchaseParams(playstorepurchaselistener, s);
    }
}
