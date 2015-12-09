// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.View;

public final class dte
    implements dtc
{

    public dte()
    {
    }

    public final void a(int i, int j, int k, int l, dtd dtd1)
    {
        int i1;
        int j1;
        int k1;
        int l1;
        k1 = android.view.View.MeasureSpec.getMode(i);
        l1 = android.view.View.MeasureSpec.getMode(j);
        j1 = android.view.View.MeasureSpec.getSize(i);
        i1 = android.view.View.MeasureSpec.getSize(j);
        if (k1 == 0 || l1 != 0) goto _L2; else goto _L1
_L1:
        j = j1;
        i = j1;
_L4:
        dtd1.a(j, i);
        return;
_L2:
        if (l1 != 0 && k1 == 0)
        {
            i = i1;
            j = i1;
            continue; /* Loop/switch isn't completed */
        }
        if (k1 == 0x80000000 && l1 == 0x80000000)
        {
            i = Math.min(j1, i1);
            j = i;
            continue; /* Loop/switch isn't completed */
        }
        if (k1 == 0x80000000 && l1 == 0x40000000)
        {
            if (j1 > i1)
            {
                i = i1;
                j = i1;
                continue; /* Loop/switch isn't completed */
            }
        } else
        if (l1 == 0x80000000 && k1 == 0x40000000)
        {
            if (i1 > j1)
            {
                j = j1;
                i = j1;
                continue; /* Loop/switch isn't completed */
            }
        } else
        if (l1 == 0)
        {
            i = Math.min(View.getDefaultSize(k, i), View.getDefaultSize(l, j));
            j = i;
            continue; /* Loop/switch isn't completed */
        }
        j = j1;
        i = i1;
        if (true) goto _L4; else goto _L3
_L3:
    }
}
