// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.widget;

import android.content.Context;
import android.view.View;

// Referenced classes of package android.support.v7.widget:
//            CardViewImpl, CardViewDelegate, RoundRectDrawable, RoundRectDrawableWithShadow

class CardViewApi21
    implements CardViewImpl
{

    CardViewApi21()
    {
    }

    public float getElevation(CardViewDelegate cardviewdelegate)
    {
        return ((View)cardviewdelegate).getElevation();
    }

    public float getMaxElevation(CardViewDelegate cardviewdelegate)
    {
        return ((RoundRectDrawable)(RoundRectDrawable)cardviewdelegate.getBackground()).getPadding();
    }

    public float getMinHeight(CardViewDelegate cardviewdelegate)
    {
        return getRadius(cardviewdelegate) * 2.0F;
    }

    public float getMinWidth(CardViewDelegate cardviewdelegate)
    {
        return getRadius(cardviewdelegate) * 2.0F;
    }

    public float getRadius(CardViewDelegate cardviewdelegate)
    {
        return ((RoundRectDrawable)(RoundRectDrawable)cardviewdelegate.getBackground()).getRadius();
    }

    public void initStatic()
    {
    }

    public void initialize(CardViewDelegate cardviewdelegate, Context context, int i, float f, float f1, float f2)
    {
        cardviewdelegate.setBackgroundDrawable(new RoundRectDrawable(i, f));
        context = (View)cardviewdelegate;
        context.setClipToOutline(true);
        context.setElevation(f1);
        setMaxElevation(cardviewdelegate, f2);
    }

    public void onCompatPaddingChanged(CardViewDelegate cardviewdelegate)
    {
        setMaxElevation(cardviewdelegate, getMaxElevation(cardviewdelegate));
    }

    public void onPreventCornerOverlapChanged(CardViewDelegate cardviewdelegate)
    {
        setMaxElevation(cardviewdelegate, getMaxElevation(cardviewdelegate));
    }

    public void setBackgroundColor(CardViewDelegate cardviewdelegate, int i)
    {
        ((RoundRectDrawable)(RoundRectDrawable)cardviewdelegate.getBackground()).setColor(i);
    }

    public void setElevation(CardViewDelegate cardviewdelegate, float f)
    {
        ((View)cardviewdelegate).setElevation(f);
    }

    public void setMaxElevation(CardViewDelegate cardviewdelegate, float f)
    {
        ((RoundRectDrawable)(RoundRectDrawable)cardviewdelegate.getBackground()).setPadding(f, cardviewdelegate.getUseCompatPadding(), cardviewdelegate.getPreventCornerOverlap());
        updatePadding(cardviewdelegate);
    }

    public void setRadius(CardViewDelegate cardviewdelegate, float f)
    {
        ((RoundRectDrawable)(RoundRectDrawable)cardviewdelegate.getBackground()).setRadius(f);
    }

    public void updatePadding(CardViewDelegate cardviewdelegate)
    {
        if (!cardviewdelegate.getUseCompatPadding())
        {
            cardviewdelegate.setShadowPadding(0, 0, 0, 0);
            return;
        } else
        {
            float f = getMaxElevation(cardviewdelegate);
            float f1 = getRadius(cardviewdelegate);
            int i = (int)Math.ceil(RoundRectDrawableWithShadow.calculateHorizontalPadding(f, f1, cardviewdelegate.getPreventCornerOverlap()));
            int j = (int)Math.ceil(RoundRectDrawableWithShadow.calculateVerticalPadding(f, f1, cardviewdelegate.getPreventCornerOverlap()));
            cardviewdelegate.setShadowPadding(i, j, i, j);
            return;
        }
    }
}
