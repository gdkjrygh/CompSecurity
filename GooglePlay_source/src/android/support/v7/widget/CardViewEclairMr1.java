// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;

// Referenced classes of package android.support.v7.widget:
//            CardViewImpl, CardViewDelegate, RoundRectDrawableWithShadow

class CardViewEclairMr1
    implements CardViewImpl
{

    final RectF sCornerRect = new RectF();

    CardViewEclairMr1()
    {
    }

    private static RoundRectDrawableWithShadow getShadowBackground(CardViewDelegate cardviewdelegate)
    {
        return (RoundRectDrawableWithShadow)cardviewdelegate.getBackground();
    }

    public final float getMaxElevation(CardViewDelegate cardviewdelegate)
    {
        return getShadowBackground(cardviewdelegate).mRawMaxShadowSize;
    }

    public final float getMinHeight(CardViewDelegate cardviewdelegate)
    {
        cardviewdelegate = getShadowBackground(cardviewdelegate);
        float f = Math.max(((RoundRectDrawableWithShadow) (cardviewdelegate)).mRawMaxShadowSize, ((RoundRectDrawableWithShadow) (cardviewdelegate)).mCornerRadius + (float)((RoundRectDrawableWithShadow) (cardviewdelegate)).mInsetShadow + (((RoundRectDrawableWithShadow) (cardviewdelegate)).mRawMaxShadowSize * 1.5F) / 2.0F);
        float f1 = ((RoundRectDrawableWithShadow) (cardviewdelegate)).mRawMaxShadowSize;
        return ((float)((RoundRectDrawableWithShadow) (cardviewdelegate)).mInsetShadow + f1 * 1.5F) * 2.0F + f * 2.0F;
    }

    public final float getMinWidth(CardViewDelegate cardviewdelegate)
    {
        cardviewdelegate = getShadowBackground(cardviewdelegate);
        float f = Math.max(((RoundRectDrawableWithShadow) (cardviewdelegate)).mRawMaxShadowSize, ((RoundRectDrawableWithShadow) (cardviewdelegate)).mCornerRadius + (float)((RoundRectDrawableWithShadow) (cardviewdelegate)).mInsetShadow + ((RoundRectDrawableWithShadow) (cardviewdelegate)).mRawMaxShadowSize / 2.0F);
        float f1 = ((RoundRectDrawableWithShadow) (cardviewdelegate)).mRawMaxShadowSize;
        return ((float)((RoundRectDrawableWithShadow) (cardviewdelegate)).mInsetShadow + f1) * 2.0F + f * 2.0F;
    }

    public final float getRadius(CardViewDelegate cardviewdelegate)
    {
        return getShadowBackground(cardviewdelegate).mCornerRadius;
    }

    public void initStatic()
    {
        RoundRectDrawableWithShadow.sRoundRectHelper = new RoundRectDrawableWithShadow.RoundRectHelper() {

            final CardViewEclairMr1 this$0;

            public final void drawRoundRect(Canvas canvas, RectF rectf, float f, Paint paint)
            {
                float f2 = f * 2.0F;
                float f3 = rectf.width() - f2 - 1.0F;
                float f4 = rectf.height();
                float f1 = f;
                if (f >= 1.0F)
                {
                    f1 = f + 0.5F;
                    sCornerRect.set(-f1, -f1, f1, f1);
                    int i = canvas.save();
                    canvas.translate(rectf.left + f1, rectf.top + f1);
                    canvas.drawArc(sCornerRect, 180F, 90F, true, paint);
                    canvas.translate(f3, 0.0F);
                    canvas.rotate(90F);
                    canvas.drawArc(sCornerRect, 180F, 90F, true, paint);
                    canvas.translate(f4 - f2 - 1.0F, 0.0F);
                    canvas.rotate(90F);
                    canvas.drawArc(sCornerRect, 180F, 90F, true, paint);
                    canvas.translate(f3, 0.0F);
                    canvas.rotate(90F);
                    canvas.drawArc(sCornerRect, 180F, 90F, true, paint);
                    canvas.restoreToCount(i);
                    canvas.drawRect((rectf.left + f1) - 1.0F, rectf.top, 1.0F + (rectf.right - f1), rectf.top + f1, paint);
                    canvas.drawRect((rectf.left + f1) - 1.0F, 1.0F + (rectf.bottom - f1), 1.0F + (rectf.right - f1), rectf.bottom, paint);
                }
                f = rectf.left;
                f2 = rectf.top;
                canvas.drawRect(f, Math.max(0.0F, f1 - 1.0F) + f2, rectf.right, 1.0F + (rectf.bottom - f1), paint);
            }

            
            {
                this$0 = CardViewEclairMr1.this;
                super();
            }
        };
    }

    public final void initialize(CardViewDelegate cardviewdelegate, Context context, int i, float f, float f1, float f2)
    {
        context = new RoundRectDrawableWithShadow(context.getResources(), i, f, f1, f2);
        context.mAddPaddingForCorners = cardviewdelegate.getPreventCornerOverlap();
        context.invalidateSelf();
        cardviewdelegate.setBackgroundDrawable(context);
        context = new Rect();
        getShadowBackground(cardviewdelegate).getPadding(context);
        ((View)cardviewdelegate).setMinimumHeight((int)Math.ceil(getMinHeight(cardviewdelegate)));
        ((View)cardviewdelegate).setMinimumWidth((int)Math.ceil(getMinWidth(cardviewdelegate)));
        cardviewdelegate.setShadowPadding(((Rect) (context)).left, ((Rect) (context)).top, ((Rect) (context)).right, ((Rect) (context)).bottom);
    }

    public final void setBackgroundColor(CardViewDelegate cardviewdelegate, int i)
    {
        cardviewdelegate = getShadowBackground(cardviewdelegate);
        ((RoundRectDrawableWithShadow) (cardviewdelegate)).mPaint.setColor(i);
        cardviewdelegate.invalidateSelf();
    }
}
