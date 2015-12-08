// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads.b;

import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.ads.c;
import com.google.android.gms.ads.internal.client.s;

public final class a extends ViewGroup
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
}
