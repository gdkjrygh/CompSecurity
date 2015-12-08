// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.ads.internal.client.a;
import com.google.android.gms.ads.internal.client.ab;
import com.google.android.gms.ads.purchase.b;

// Referenced classes of package com.google.android.gms.ads:
//            c, d, a

public final class AdView extends ViewGroup
{

    private final ab a;

    public AdView(Context context)
    {
        super(context);
        a = new ab(this);
    }

    public AdView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        a = new ab(this, attributeset, false);
    }

    public AdView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        a = new ab(this, attributeset, false);
    }

    public final void a()
    {
        a.a();
    }

    public final void a(c c1)
    {
        a.a(c1.a());
    }

    public final void b()
    {
        a.c();
    }

    public final void c()
    {
        a.d();
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

    public final void setAdSize(d d1)
    {
        a.a(new d[] {
            d1
        });
    }

    public final void setAdUnitId(String s)
    {
        a.a(s);
    }

    public final void setInAppPurchaseListener(com.google.android.gms.ads.purchase.a a1)
    {
        a.a(a1);
    }

    public final void setPlayStorePurchaseParams(b b1, String s)
    {
        a.a(b1, s);
    }
}
