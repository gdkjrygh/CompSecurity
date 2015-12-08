// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.controls;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import me.lyft.android.logging.L;

public class FixedRatioFrameLayout extends FrameLayout
{

    private static final float DEFAULT_ASPECT_RATIO = 0.6306075F;
    private double aspectRatio;

    public FixedRatioFrameLayout(Context context)
    {
        super(context);
    }

    public FixedRatioFrameLayout(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        init(attributeset);
    }

    public FixedRatioFrameLayout(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        init(attributeset);
    }

    private void init(AttributeSet attributeset)
    {
        attributeset = getContext().obtainStyledAttributes(attributeset, me.lyft.android.R.styleable.FixedRatioFrameLayout);
        if (attributeset == null) goto _L2; else goto _L1
_L1:
        int i;
        int j;
        j = attributeset.getIndexCount();
        i = 0;
_L7:
        if (i >= j) goto _L2; else goto _L3
_L3:
        attributeset.getIndex(i);
        JVM INSTR tableswitch 0 0: default 52
    //                   0 59;
           goto _L4 _L5
_L4:
        i++;
        continue; /* Loop/switch isn't completed */
_L5:
        aspectRatio = attributeset.getFloat(0, 0.6306075F);
        if (true) goto _L4; else goto _L2
_L2:
        attributeset.recycle();
        return;
        if (true) goto _L7; else goto _L6
_L6:
    }

    public double getAspectRatio()
    {
        return aspectRatio;
    }

    protected void onMeasure(int i, int j)
    {
        super.onMeasure(i, j);
        i = android.view.View.MeasureSpec.getSize(i);
        j = android.view.View.MeasureSpec.getSize(j);
        L.d((new StringBuilder()).append("original:").append(i).append("X").append(j).toString(), new Object[0]);
        j = (int)((double)i * aspectRatio);
        L.d((new StringBuilder()).append("final:").append(i).append("X").append(j).toString(), new Object[0]);
        super.onMeasure(android.view.View.MeasureSpec.makeMeasureSpec(i, 0x40000000), android.view.View.MeasureSpec.makeMeasureSpec(j, 0x40000000));
    }

    public void setAspectRatio(double d)
    {
        aspectRatio = d;
    }
}
