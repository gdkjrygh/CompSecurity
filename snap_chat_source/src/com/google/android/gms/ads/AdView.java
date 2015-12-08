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
import com.google.android.gms.internal.zzat;
import com.google.android.gms.internal.zzbp;

// Referenced classes of package com.google.android.gms.ads:
//            AdRequest, AdSize, AdListener

public final class AdView extends ViewGroup
{

    private final zzbp zzll;

    public AdView(Context context)
    {
        super(context);
        zzll = new zzbp(this);
    }

    public AdView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        zzll = new zzbp(this, attributeset, false);
    }

    public AdView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        zzll = new zzbp(this, attributeset, false);
    }

    public final void destroy()
    {
        zzll.destroy();
    }

    public final AdSize getAdSize()
    {
        return zzll.getAdSize();
    }

    public final void loadAd(AdRequest adrequest)
    {
        zzll.zza(adrequest.zzY());
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

    public final void pause()
    {
        zzll.pause();
    }

    public final void resume()
    {
        zzll.resume();
    }

    public final void setAdListener(AdListener adlistener)
    {
        zzll.setAdListener(adlistener);
        if (adlistener != null && (adlistener instanceof zzat))
        {
            zzll.zza((zzat)adlistener);
        } else
        if (adlistener == null)
        {
            zzll.zza(null);
            return;
        }
    }

    public final void setAdSize(AdSize adsize)
    {
        zzll.setAdSizes(new AdSize[] {
            adsize
        });
    }

    public final void setAdUnitId(String s)
    {
        zzll.setAdUnitId(s);
    }

    public final void setInAppPurchaseListener(InAppPurchaseListener inapppurchaselistener)
    {
        zzll.setInAppPurchaseListener(inapppurchaselistener);
    }

    public final void setPlayStorePurchaseParams(PlayStorePurchaseListener playstorepurchaselistener, String s)
    {
        zzll.setPlayStorePurchaseParams(playstorepurchaselistener, s);
    }
}
