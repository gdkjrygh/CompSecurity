// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.widget;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;

// Referenced classes of package android.support.v7.widget:
//            RoundRectDrawableWithShadow

final class RoundRectDrawable extends Drawable
{

    private final RectF mBoundsF = new RectF();
    private final Rect mBoundsI = new Rect();
    boolean mInsetForPadding;
    boolean mInsetForRadius;
    float mPadding;
    final Paint mPaint = new Paint(5);
    float mRadius;

    public RoundRectDrawable(int i, float f)
    {
        mInsetForPadding = false;
        mInsetForRadius = true;
        mRadius = f;
        mPaint.setColor(i);
    }

    public final void draw(Canvas canvas)
    {
        canvas.drawRoundRect(mBoundsF, mRadius, mRadius, mPaint);
    }

    public final int getOpacity()
    {
        return -3;
    }

    public final void getOutline(Outline outline)
    {
        outline.setRoundRect(mBoundsI, mRadius);
    }

    protected final void onBoundsChange(Rect rect)
    {
        super.onBoundsChange(rect);
        updateBounds(rect);
    }

    public final void setAlpha(int i)
    {
    }

    public final void setColorFilter(ColorFilter colorfilter)
    {
    }

    final void updateBounds(Rect rect)
    {
        Rect rect1 = rect;
        if (rect == null)
        {
            rect1 = getBounds();
        }
        mBoundsF.set(rect1.left, rect1.top, rect1.right, rect1.bottom);
        mBoundsI.set(rect1);
        if (mInsetForPadding)
        {
            float f = RoundRectDrawableWithShadow.calculateVerticalPadding(mPadding, mRadius, mInsetForRadius);
            float f1 = RoundRectDrawableWithShadow.calculateHorizontalPadding(mPadding, mRadius, mInsetForRadius);
            mBoundsI.inset((int)Math.ceil(f1), (int)Math.ceil(f));
            mBoundsF.set(mBoundsI);
        }
    }
}
