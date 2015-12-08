// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.ui.imageview;

import android.content.Context;
import android.graphics.Matrix;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;

// Referenced classes of package com.pinterest.ui.imageview:
//            NonRoundWebImageView

public class CroppingImageView extends NonRoundWebImageView
{

    public CroppingImageView(Context context)
    {
        this(context, null);
    }

    public CroppingImageView(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public CroppingImageView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        setScaleType(android.widget.ImageView.ScaleType.MATRIX);
    }

    protected boolean setFrame(int i, int j, int k, int l)
    {
        Object obj = getDrawable();
        if (obj == null)
        {
            return super.setFrame(i, j, k, l);
        }
        float f1 = ((Drawable) (obj)).getIntrinsicWidth();
        float f2 = ((Drawable) (obj)).getIntrinsicHeight();
        float f3 = k - i;
        float f4 = l - j;
        float f = 1.0F;
        if (f3 > f1 || f4 > f2)
        {
            f = Math.max(f3 / f1, f4 / f2);
        }
        obj = getImageMatrix();
        ((Matrix) (obj)).setScale(f, f, 0.0F, 0.0F);
        ((Matrix) (obj)).postTranslate((f3 - f1 * f) / 2.0F, f4 - f2 * f);
        setImageMatrix(((Matrix) (obj)));
        return super.setFrame(i, j, k, l);
    }
}
