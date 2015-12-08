// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.play.cardview;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Rect;
import android.graphics.RectF;

// Referenced classes of package com.google.android.play.cardview:
//            CardViewBackgroundDrawable

final class RoundRectDrawable extends CardViewBackgroundDrawable
{

    private final RectF mBoundsF = new RectF();
    private final Rect mBoundsI = new Rect();

    RoundRectDrawable(ColorStateList colorstatelist, float f, float f1)
    {
        super(colorstatelist, f, f1);
    }

    public final void draw(Canvas canvas)
    {
        canvas.drawRoundRect(mBoundsF, mCornerRadius, mCornerRadius, mPaint);
    }

    public final void getOutline(Outline outline)
    {
        outline.setRoundRect(mBoundsI, mCornerRadius);
    }

    protected final void onBoundsChange(Rect rect)
    {
        super.onBoundsChange(rect);
        mBoundsI.set(rect);
        mBoundsI.inset((int)Math.ceil(mInset), (int)Math.ceil(mInset));
        mBoundsF.set(mBoundsI);
    }

    public final void setAlpha(int i)
    {
    }

    public final void setColorFilter(ColorFilter colorfilter)
    {
    }
}
