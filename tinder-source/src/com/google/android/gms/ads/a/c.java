// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads.a;

import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.ads.a;
import com.google.android.gms.ads.internal.client.i;
import com.google.android.gms.ads.internal.client.s;
import com.google.android.gms.ads.internal.util.client.b;
import com.google.android.gms.internal.ah;

// Referenced classes of package com.google.android.gms.ads.a:
//            a, b

public final class c extends ViewGroup
{

    private final s a;

    public final a getAdListener()
    {
        return a.a;
    }

    public final com.google.android.gms.ads.c getAdSize()
    {
        return a.a();
    }

    public final com.google.android.gms.ads.c[] getAdSizes()
    {
        return a.c;
    }

    public final String getAdUnitId()
    {
        return a.d;
    }

    public final com.google.android.gms.ads.a.a getAppEventListener()
    {
        return a.e;
    }

    public final String getMediationAdapterClassName()
    {
        return a.b();
    }

    public final com.google.android.gms.ads.a.b getOnCustomRenderedAdLoadedListener()
    {
        return a.h;
    }

    protected final void onLayout(boolean flag, int j, int k, int l, int i1)
    {
        View view = getChildAt(0);
        if (view != null && view.getVisibility() != 8)
        {
            int j1 = view.getMeasuredWidth();
            int k1 = view.getMeasuredHeight();
            j = (l - j - j1) / 2;
            k = (i1 - k - k1) / 2;
            view.layout(j, k, j1 + j, k1 + k);
        }
    }

    protected final void onMeasure(int j, int k)
    {
        int l = 0;
        View view = getChildAt(0);
        int i1;
        if (view != null && view.getVisibility() != 8)
        {
            measureChild(view, j, k);
            i1 = view.getMeasuredWidth();
            l = view.getMeasuredHeight();
        } else
        {
            com.google.android.gms.ads.c c1 = getAdSize();
            if (c1 != null)
            {
                android.content.Context context = getContext();
                i1 = c1.b(context);
                l = c1.a(context);
            } else
            {
                i1 = 0;
            }
        }
        i1 = Math.max(i1, getSuggestedMinimumWidth());
        l = Math.max(l, getSuggestedMinimumHeight());
        setMeasuredDimension(View.resolveSize(i1, j), View.resolveSize(l, k));
    }

    public final void setAdListener(a a1)
    {
        a.a(a1);
    }

    public final transient void setAdSizes(com.google.android.gms.ads.c ac[])
    {
        if (ac == null || ac.length <= 0)
        {
            throw new IllegalArgumentException("The supported ad sizes must contain at least one valid ad size.");
        } else
        {
            a.b(ac);
            return;
        }
    }

    public final void setAdUnitId(String s1)
    {
        a.a(s1);
    }

    public final void setAppEventListener(com.google.android.gms.ads.a.a a1)
    {
        s s1 = a;
        s1.e = a1;
        if (s1.b == null || a1 == null)
        {
            break MISSING_BLOCK_LABEL_30;
        }
        new i(a1);
        return;
        a1;
        b.c("Failed to set the AppEventListener.", a1);
        return;
    }

    public final void setManualImpressionsEnabled(boolean flag)
    {
        a.i = flag;
    }

    public final void setOnCustomRenderedAdLoadedListener(com.google.android.gms.ads.a.b b1)
    {
        s s1;
        s1 = a;
        s1.h = b1;
        if (s1.b == null || b1 == null)
        {
            break MISSING_BLOCK_LABEL_30;
        }
        new ah(b1);
        return;
        b1;
        b.c("Failed to set the onCustomRenderedAdLoadedListener.", b1);
        return;
    }
}
