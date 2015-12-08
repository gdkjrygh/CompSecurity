// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.view;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.DisplayMetrics;

// Referenced classes of package com.soundcloud.android.view:
//            OptimisedImageView

public class CardFullImageView extends OptimisedImageView
{

    private static final float FOCAL_POINT = 0.4F;
    private static final int RATIO = 2;
    private final Paint paint = new Paint();

    public CardFullImageView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        paint.setColor(getResources().getColor(0x7f0e001b));
        paint.setStyle(android.graphics.Paint.Style.STROKE);
        paint.setStrokeWidth(context.getResources().getDisplayMetrics().density);
    }

    protected void onDraw(Canvas canvas)
    {
        super.onDraw(canvas);
        canvas.drawRect(0.0F, 0.0F, canvas.getWidth(), canvas.getHeight(), paint);
    }

    protected void onMeasure(int i, int j)
    {
        Object obj = getDrawable();
        int k;
        int l;
        if (obj == null)
        {
            try
            {
                setMeasuredDimension(0, 0);
                return;
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                super.onMeasure(i, j);
            }
            break MISSING_BLOCK_LABEL_51;
        }
        k = android.view.View.MeasureSpec.getSize(i);
        l = android.view.View.MeasureSpec.getSize(j);
        if (l != 0)
        {
            break MISSING_BLOCK_LABEL_52;
        }
        setMeasuredDimension(k, k / 2);
        return;
        return;
        if (k != 0)
        {
            break MISSING_BLOCK_LABEL_74;
        }
        k = ((Drawable) (obj)).getIntrinsicWidth();
        setMeasuredDimension(k, k / 2);
        return;
        setMeasuredDimension(k, l);
        return;
    }

    protected boolean setFrame(int i, int j, int k, int l)
    {
        Drawable drawable = getDrawable();
        if (drawable != null)
        {
            Matrix matrix = getImageMatrix();
            float f = (float)(k - i) / (float)drawable.getIntrinsicWidth();
            int i1 = (int)((float)(-drawable.getIntrinsicHeight()) * 0.4F);
            matrix.setTranslate(0.0F, i1);
            matrix.postScale(f, f, 0.0F, 0.0F);
            matrix.postTranslate(0.0F, Math.min((float)((l - j) / 2) + 0.4F, (float)(-i1) * f));
            setImageMatrix(matrix);
        }
        return super.setFrame(i, j, k, l);
    }
}
