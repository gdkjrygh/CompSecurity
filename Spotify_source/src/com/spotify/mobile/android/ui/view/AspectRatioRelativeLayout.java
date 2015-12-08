// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.ui.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.RelativeLayout;
import com.spotify.mobile.android.util.logging.Logger;
import gmr;

public class AspectRatioRelativeLayout extends RelativeLayout
{

    private float a;
    private boolean b;
    private boolean c;
    private boolean d;
    private int e;
    private int f;

    public AspectRatioRelativeLayout(Context context)
    {
        super(context);
        a = 1.0F;
    }

    public AspectRatioRelativeLayout(Context context, AttributeSet attributeset)
    {
        int i;
        int j;
        super(context, attributeset);
        a = 1.0F;
        context = context.obtainStyledAttributes(attributeset, gmr.a);
        j = context.getIndexCount();
        i = 0;
_L9:
        int k;
        if (i >= j)
        {
            break MISSING_BLOCK_LABEL_189;
        }
        k = context.getIndex(i);
        k;
        JVM INSTR tableswitch 0 5: default 80
    //                   0 87
    //                   1 104
    //                   2 121
    //                   3 138
    //                   4 155
    //                   5 172;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7
_L7:
        break MISSING_BLOCK_LABEL_172;
_L1:
        break; /* Loop/switch isn't completed */
_L2:
        break; /* Loop/switch isn't completed */
_L10:
        i++;
        if (true) goto _L9; else goto _L8
_L8:
        a = context.getFloat(k, a);
          goto _L10
_L3:
        b = context.getBoolean(k, b);
          goto _L10
_L4:
        c = context.getBoolean(k, c);
          goto _L10
_L5:
        d = context.getBoolean(k, d);
          goto _L10
_L6:
        e = context.getDimensionPixelSize(k, e);
          goto _L10
        f = context.getDimensionPixelSize(k, f);
          goto _L10
        context.recycle();
        return;
    }

    protected void onMeasure(int i, int j)
    {
        int k;
        int l;
        k = getDefaultSize(getSuggestedMinimumWidth(), i);
        l = getDefaultSize(getSuggestedMinimumHeight(), j);
        if (k == 0 && l == 0)
        {
            Logger.b("With both width and height set to zero, it is impossible to calculate and enforce aspect ratio.", new Object[0]);
            super.onMeasure(i, j);
            return;
        }
        if (k != 0) goto _L2; else goto _L1
_L1:
        j = Math.round((float)l * a) + e;
        i = l;
_L4:
        super.onMeasure(android.view.View.MeasureSpec.makeMeasureSpec(j, 0x40000000), android.view.View.MeasureSpec.makeMeasureSpec(i, 0x40000000));
        return;
_L2:
        if (l == 0)
        {
            i = Math.round((float)k / a) + f;
            j = k;
            continue; /* Loop/switch isn't completed */
        }
        if (a > (float)k / (float)l)
        {
            if (d && android.view.View.MeasureSpec.getMode(j) == 0x40000000)
            {
                i = l;
                j = k;
                if (c)
                {
                    continue; /* Loop/switch isn't completed */
                }
            }
            i = Math.round((float)(k - e) / a);
            j = k;
            continue; /* Loop/switch isn't completed */
        }
        if (d && android.view.View.MeasureSpec.getMode(i) == 0x40000000)
        {
            i = l;
            j = k;
            if (b)
            {
                continue; /* Loop/switch isn't completed */
            }
        }
        j = Math.round((float)(l - f) * a);
        i = l;
        if (true) goto _L4; else goto _L3
_L3:
    }
}
