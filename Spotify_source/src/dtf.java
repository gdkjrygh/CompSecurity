// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.View;

public final class dtf
    implements dtc
{

    private final int a;

    public dtf(int i)
    {
        boolean flag = true;
        super();
        ctz.a(true, "ColSpan must be positive");
        if (i <= 0)
        {
            flag = false;
        }
        ctz.a(flag, "Padding must be positive");
        a = i;
    }

    public final void a(int i, int j, int k, int l, dtd dtd1)
    {
        int i2 = android.view.View.MeasureSpec.getMode(i);
        int j2 = android.view.View.MeasureSpec.getMode(j);
        int i1 = android.view.View.MeasureSpec.getSize(i);
        int j1 = android.view.View.MeasureSpec.getSize(j);
        int l1 = (i1 - a) / 2;
        int k1 = (j1 << 1) + a;
        if (i2 != 0 && j2 == 0)
        {
            i = i1;
            j = l1;
        } else
        if (j2 != 0 && i2 == 0)
        {
            j = j1;
            i = k1;
        } else
        if (i2 == 0x80000000 && j2 == 0x80000000)
        {
            if (l1 > j1)
            {
                j = j1;
                i = k1;
            } else
            {
                i = i1;
                j = l1;
            }
        } else
        if (i2 == 0x80000000 && j2 == 0x40000000)
        {
            j = j1;
            i = k1;
        } else
        if (j2 == 0x80000000 && i2 == 0x40000000)
        {
            i = i1;
            j = l1;
        } else
        if (j2 == 0)
        {
            i = Math.min(View.getDefaultSize(k, i), View.getDefaultSize(l, j));
            j = (i - a) / 2;
        } else
        {
            j = j1;
            i = i1;
        }
        dtd1.a(i, j);
    }
}
