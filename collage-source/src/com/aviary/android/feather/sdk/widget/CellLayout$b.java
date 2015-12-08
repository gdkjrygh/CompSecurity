// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.aviary.android.feather.sdk.widget;

import android.content.Context;
import android.util.AttributeSet;

// Referenced classes of package com.aviary.android.feather.sdk.widget:
//            CellLayout

public static class b extends android.view.ginLayoutParams
{

    public int a;
    public int b;
    public int c;
    public int d;
    int e;
    int f;
    boolean g;

    public void a(int i, int j, int k, int l, int i1, int j1)
    {
        int k1 = c;
        int l1 = d;
        int i2 = a;
        int j2 = b;
        width = ((k1 - 1) * k + k1 * i) - leftMargin - rightMargin;
        height = (l1 * j + (l1 - 1) * l) - topMargin - bottomMargin;
        e = (i + k) * i2 + i1 + leftMargin;
        f = (j + l) * j2 + j1 + topMargin;
    }

    public (int i, int j, int k, int l)
    {
        super(-1, -1);
        a = i;
        b = j;
        c = k;
        d = l;
    }

    public d(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        c = 1;
        d = 1;
        a = -1;
        b = -1;
    }

    public b(android.view.outParams outparams)
    {
        super(outparams);
        c = 1;
        d = 1;
        a = -1;
        b = -1;
    }
}
