// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads;

import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.ads.internal.client.a;
import com.google.android.gms.ads.internal.client.s;
import com.google.android.gms.ads.internal.util.client.b;
import com.google.android.gms.internal.by;

// Referenced classes of package com.google.android.gms.ads:
//            c, a

public final class d extends ViewGroup
{

    private final s a;

    public final com.google.android.gms.ads.a getAdListener()
    {
        return a.a;
    }

    public final c getAdSize()
    {
        return a.a();
    }

    public final String getAdUnitId()
    {
        return a.d;
    }

    public final com.google.android.gms.ads.purchase.a getInAppPurchaseListener()
    {
        return a.f;
    }

    public final String getMediationAdapterClassName()
    {
        return a.b();
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
            c c1 = getAdSize();
            if (c1 != null)
            {
                android.content.Context context = getContext();
                l = c1.b(context);
                k = c1.a(context);
            } else
            {
                l = 0;
            }
        }
        l = Math.max(l, getSuggestedMinimumWidth());
        k = Math.max(k, getSuggestedMinimumHeight());
        setMeasuredDimension(View.resolveSize(l, i), View.resolveSize(k, j));
    }

    public final void setAdListener(com.google.android.gms.ads.a a1)
    {
        a.a(a1);
        if (a1 != null && (a1 instanceof a))
        {
            a.a((a)a1);
        } else
        if (a1 == null)
        {
            a.a(null);
            return;
        }
    }

    public final void setAdSize(c c1)
    {
        a.a(new c[] {
            c1
        });
    }

    public final void setAdUnitId(String s1)
    {
        a.a(s1);
    }

    public final void setInAppPurchaseListener(com.google.android.gms.ads.purchase.a a1)
    {
        s s1;
        s1 = a;
        if (s1.g != null)
        {
            throw new IllegalStateException("Play store purchase parameter has already been set.");
        }
        s1.f = a1;
        if (s1.b == null || a1 == null)
        {
            break MISSING_BLOCK_LABEL_47;
        }
        new by(a1);
        return;
        a1;
        b.c("Failed to set the InAppPurchaseListener.", a1);
        return;
    }
}
