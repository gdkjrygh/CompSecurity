// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads.doubleclick;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.ads.a;
import com.google.android.gms.ads.d;
import com.google.android.gms.ads.internal.client.ab;

// Referenced classes of package com.google.android.gms.ads.doubleclick:
//            a, b

public final class PublisherAdView extends ViewGroup
{

    private final ab a;

    public PublisherAdView(Context context)
    {
        super(context);
        a = new ab(this);
    }

    public PublisherAdView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        a = new ab(this, attributeset, true);
    }

    public PublisherAdView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        a = new ab(this, attributeset, true);
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
            d d1 = a.b();
            if (d1 != null)
            {
                Context context = getContext();
                l = d1.b(context);
                k = d1.a(context);
            } else
            {
                l = 0;
            }
        }
        l = Math.max(l, getSuggestedMinimumWidth());
        k = Math.max(k, getSuggestedMinimumHeight());
        setMeasuredDimension(View.resolveSize(l, i), View.resolveSize(k, j));
    }

    public final void setAdListener(a a1)
    {
        a.a(a1);
    }

    public final transient void setAdSizes(d ad[])
    {
        if (ad == null || ad.length <= 0)
        {
            throw new IllegalArgumentException("The supported ad sizes must contain at least one valid ad size.");
        } else
        {
            a.b(ad);
            return;
        }
    }

    public final void setAdUnitId(String s)
    {
        a.a(s);
    }

    public final void setAppEventListener(com.google.android.gms.ads.doubleclick.a a1)
    {
        a.a(a1);
    }

    public final void setManualImpressionsEnabled(boolean flag)
    {
        a.a(flag);
    }

    public final void setOnCustomRenderedAdLoadedListener(b b)
    {
        a.a(b);
    }
}
