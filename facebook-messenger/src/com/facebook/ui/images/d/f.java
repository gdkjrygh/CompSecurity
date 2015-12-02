// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.ui.images.d;

import android.graphics.Rect;
import android.graphics.RectF;
import com.google.common.base.Joiner;

public class f
{

    private final RectF a;
    private final float b;

    public f(RectF rectf, float f1)
    {
        a = rectf;
        b = f1;
    }

    public String a()
    {
        return Joiner.on(":").join(a, Float.valueOf(b), new Object[0]);
    }

    public void a(Rect rect, Rect rect1)
    {
        int i;
        int j;
        int k;
        int l;
        int i1;
        int j1;
        int k1;
        int l1;
        int i2;
        int j2;
        i2 = rect.width();
        j2 = rect.height();
        j = rect.left;
        i = rect.top;
        i1 = (int)((float)i2 * a.left + (float)j);
        float f1 = i2;
        float f2 = a.right;
        j1 = (int)((float)j + f1 * f2);
        k1 = (int)((float)j2 * a.top + (float)i);
        l1 = (int)((float)j2 * a.bottom + (float)i);
        k = l1;
        i = k1;
        j = j1;
        l = i1;
        if (b == 0.0F) goto _L2; else goto _L1
_L1:
        j = j1 - i1;
        k = l1 - k1;
        if ((float)j / (float)k <= b) goto _L4; else goto _L3
_L3:
        i = (int)((float)j / b);
        j = (i - k) / 2;
        k1 = Math.max(0, k1 - j);
        l1 = Math.min(j2, l1 + j);
        i2 = i - (l1 - k1);
        k = l1;
        i = k1;
        j = j1;
        l = i1;
        if (i2 > 0)
        {
            i = Math.max(0, k1 - i2);
            k = Math.min(j2, l1 + i2);
            l = i1;
            j = j1;
        }
_L2:
        rect1.set(l, i, j, k);
        return;
_L4:
        i = (int)((float)k * b);
        j = (i - j) / 2;
        i1 = Math.max(0, i1 - j);
        j1 = Math.min(i2, j1 + j);
        int k2 = i - (j1 - i1);
        k = l1;
        i = k1;
        j = j1;
        l = i1;
        if (k2 > 0)
        {
            l = Math.max(0, i1 - k2);
            j = Math.min(i2, j1 + k2);
            k = l1;
            i = k1;
        }
        if (true) goto _L2; else goto _L5
_L5:
    }
}
