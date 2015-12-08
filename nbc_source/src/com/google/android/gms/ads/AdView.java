// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.ads.internal.client.zza;
import com.google.android.gms.ads.internal.client.zzy;
import com.google.android.gms.ads.purchase.InAppPurchaseListener;

// Referenced classes of package com.google.android.gms.ads:
//            AdRequest, AdSize, AdListener

public final class AdView extends ViewGroup
{

    private final zzy zznP = new zzy(this);

    public AdView(Context context)
    {
        super(context);
    }

    public void destroy()
    {
        zznP.destroy();
    }

    public AdListener getAdListener()
    {
        return zznP.getAdListener();
    }

    public AdSize getAdSize()
    {
        return zznP.getAdSize();
    }

    public String getAdUnitId()
    {
        return zznP.getAdUnitId();
    }

    public InAppPurchaseListener getInAppPurchaseListener()
    {
        return zznP.getInAppPurchaseListener();
    }

    public String getMediationAdapterClassName()
    {
        return zznP.getMediationAdapterClassName();
    }

    public void loadAd(AdRequest adrequest)
    {
        zznP.zza(adrequest.zzaF());
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

    public void pause()
    {
        zznP.pause();
    }

    public void resume()
    {
        zznP.resume();
    }

    public void setAdListener(AdListener adlistener)
    {
        zznP.setAdListener(adlistener);
        if (adlistener != null && (adlistener instanceof zza))
        {
            zznP.zza((zza)adlistener);
        } else
        if (adlistener == null)
        {
            zznP.zza(null);
            return;
        }
    }

    public void setAdSize(AdSize adsize)
    {
        zznP.setAdSizes(new AdSize[] {
            adsize
        });
    }

    public void setAdUnitId(String s)
    {
        zznP.setAdUnitId(s);
    }

    public void setInAppPurchaseListener(InAppPurchaseListener inapppurchaselistener)
    {
        zznP.setInAppPurchaseListener(inapppurchaselistener);
    }
}
