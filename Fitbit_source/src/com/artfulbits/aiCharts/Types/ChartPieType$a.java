// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.artfulbits.aiCharts.Types;

import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import com.artfulbits.aiCharts.Base.j;

// Referenced classes of package com.artfulbits.aiCharts.Types:
//            ChartPieType

static final class c
{

    public final String a;
    public final int b;
    public final int c;

    public (j j1)
    {
        Rect rect = new Rect();
        int i = j1.k().intValue();
        a = j1.f();
        j1.m().getTextBounds(a, 0, a.length(), rect);
        int l = rect.width() + i * 2;
        int i1 = i * 2 + rect.height();
        j1 = j1.j();
        int k = l;
        i = i1;
        if (j1 != null)
        {
            j1.getPadding(rect);
            k = rect.left;
            int l1 = rect.right;
            i = rect.top;
            int k1 = rect.bottom;
            k = Math.max(l + (k + l1), j1.getMinimumWidth());
            i = Math.max(i1 + (k1 + i), j1.getMinimumHeight());
        }
        b = k;
        c = i;
    }
}
