// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;

// Referenced classes of package com.soundcloud.android.view:
//            OptimisedImageView

public class AspectRatioImageView extends OptimisedImageView
{

    private static final float DEFAULT_ASPECT_RATIO = 1F;
    private static final boolean DEFAULT_ASPECT_RATIO_ENABLED = false;
    private static final int DEFAULT_DOMINANT_MEASUREMENT = 0;
    public static final int MEASUREMENT_HEIGHT = 1;
    public static final int MEASUREMENT_WIDTH = 0;
    private float aspectRatio;
    private boolean aspectRatioEnabled;
    private int dominantMeasurement;

    public AspectRatioImageView(Context context)
    {
        this(context, null);
    }

    public AspectRatioImageView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        context = context.obtainStyledAttributes(attributeset, com.soundcloud.android.R.styleable.AspectRatioImageView);
        aspectRatio = context.getFloat(0, 1.0F);
        aspectRatioEnabled = context.getBoolean(1, false);
        dominantMeasurement = context.getInt(2, 0);
        context.recycle();
    }

    public float getAspectRatio()
    {
        return aspectRatio;
    }

    public boolean getAspectRatioEnabled()
    {
        return aspectRatioEnabled;
    }

    public int getDominantMeasurement()
    {
        return dominantMeasurement;
    }

    protected void onMeasure(int i, int j)
    {
        super.onMeasure(i, j);
        if (!aspectRatioEnabled)
        {
            return;
        }
        dominantMeasurement;
        JVM INSTR tableswitch 0 1: default 40
    //                   0 67
    //                   1 88;
           goto _L1 _L2 _L3
_L1:
        throw new IllegalStateException((new StringBuilder("Unknown measurement with ID ")).append(dominantMeasurement).toString());
_L2:
        j = getMeasuredWidth();
        i = (int)((float)j * aspectRatio);
_L5:
        setMeasuredDimension(j, i);
        return;
_L3:
        i = getMeasuredHeight();
        j = (int)((float)i * aspectRatio);
        if (true) goto _L5; else goto _L4
_L4:
    }

    public void setAspectRatio(float f)
    {
        aspectRatio = f;
        if (aspectRatioEnabled)
        {
            requestLayout();
        }
    }

    public void setAspectRatioEnabled(boolean flag)
    {
        aspectRatioEnabled = flag;
        requestLayout();
    }

    public void setDominantMeasurement(int i)
    {
        if (i != 1 && i != 0)
        {
            throw new IllegalArgumentException("Invalid measurement type.");
        } else
        {
            dominantMeasurement = i;
            requestLayout();
            return;
        }
    }
}
