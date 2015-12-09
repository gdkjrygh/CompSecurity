// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.widget;

import android.content.Context;
import android.graphics.Paint;
import android.view.View;

// Referenced classes of package android.support.v7.widget:
//            CardViewImpl, CardViewDelegate, RoundRectDrawable, RoundRectDrawableWithShadow

final class CardViewApi21
    implements CardViewImpl
{

    CardViewApi21()
    {
    }

    public final float getMaxElevation(CardViewDelegate cardviewdelegate)
    {
        return ((RoundRectDrawable)cardviewdelegate.getBackground()).mPadding;
    }

    public final float getMinHeight(CardViewDelegate cardviewdelegate)
    {
        return getRadius(cardviewdelegate) * 2.0F;
    }

    public final float getMinWidth(CardViewDelegate cardviewdelegate)
    {
        return getRadius(cardviewdelegate) * 2.0F;
    }

    public final float getRadius(CardViewDelegate cardviewdelegate)
    {
        return ((RoundRectDrawable)cardviewdelegate.getBackground()).mRadius;
    }

    public final void initStatic()
    {
    }

    public final void initialize(CardViewDelegate cardviewdelegate, Context context, int i, float f, float f1, float f2)
    {
        cardviewdelegate.setBackgroundDrawable(new RoundRectDrawable(i, f));
        context = (View)cardviewdelegate;
        context.setClipToOutline(true);
        context.setElevation(f1);
        context = (RoundRectDrawable)cardviewdelegate.getBackground();
        boolean flag = cardviewdelegate.getUseCompatPadding();
        boolean flag1 = cardviewdelegate.getPreventCornerOverlap();
        if (f2 != ((RoundRectDrawable) (context)).mPadding || ((RoundRectDrawable) (context)).mInsetForPadding != flag || ((RoundRectDrawable) (context)).mInsetForRadius != flag1)
        {
            context.mPadding = f2;
            context.mInsetForPadding = flag;
            context.mInsetForRadius = flag1;
            context.updateBounds(null);
            context.invalidateSelf();
        }
        if (!cardviewdelegate.getUseCompatPadding())
        {
            cardviewdelegate.setShadowPadding(0, 0, 0, 0);
            return;
        } else
        {
            f = getMaxElevation(cardviewdelegate);
            f1 = getRadius(cardviewdelegate);
            i = (int)Math.ceil(RoundRectDrawableWithShadow.calculateHorizontalPadding(f, f1, cardviewdelegate.getPreventCornerOverlap()));
            int j = (int)Math.ceil(RoundRectDrawableWithShadow.calculateVerticalPadding(f, f1, cardviewdelegate.getPreventCornerOverlap()));
            cardviewdelegate.setShadowPadding(i, j, i, j);
            return;
        }
    }

    public final void setBackgroundColor(CardViewDelegate cardviewdelegate, int i)
    {
        cardviewdelegate = (RoundRectDrawable)cardviewdelegate.getBackground();
        ((RoundRectDrawable) (cardviewdelegate)).mPaint.setColor(i);
        cardviewdelegate.invalidateSelf();
    }
}
