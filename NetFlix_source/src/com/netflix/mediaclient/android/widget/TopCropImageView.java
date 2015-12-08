// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.android.widget;

import android.content.Context;
import android.graphics.Matrix;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import com.netflix.mediaclient.Log;

// Referenced classes of package com.netflix.mediaclient.android.widget:
//            AdvancedImageView

public class TopCropImageView extends AdvancedImageView
{

    private static final String TAG = "TopCropImageView";

    public TopCropImageView(Context context)
    {
        super(context);
        init();
    }

    public TopCropImageView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        init();
    }

    public TopCropImageView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        init();
    }

    private void init()
    {
        setScaleType(android.widget.ImageView.ScaleType.MATRIX);
    }

    protected void onLayout(boolean flag, int i, int j, int k, int l)
    {
        super.onLayout(flag, i, j, k, l);
        recomputeImgMatrix();
    }

    public void recomputeImgMatrix()
    {
        Matrix matrix = new Matrix(getImageMatrix());
        int k = getWidth() - getPaddingLeft() - getPaddingRight();
        int l = getHeight() - getPaddingTop() - getPaddingBottom();
        float f;
        int i;
        int j;
        if (getDrawable() == null)
        {
            i = 0;
        } else
        {
            i = getDrawable().getIntrinsicWidth();
        }
        if (getDrawable() == null)
        {
            j = 0;
        } else
        {
            j = getDrawable().getIntrinsicHeight();
        }
        if (i * l > j * k)
        {
            f = (float)l / (float)j;
        } else
        {
            f = (float)k / (float)i;
        }
        if (Log.isLoggable("TopCropImageView", 2))
        {
            Log.v("TopCropImageView", (new StringBuilder()).append("Matrix scale: ").append(f).append(", drawable height: ").append(j).append(", drawable width: ").append(i).append(", view height: ").append(l).append(", view width: ").append(k).toString());
        }
        matrix.setScale(f, f);
        setImageMatrix(matrix);
    }

    protected boolean setFrame(int i, int j, int k, int l)
    {
        recomputeImgMatrix();
        return super.setFrame(i, j, k, l);
    }
}
