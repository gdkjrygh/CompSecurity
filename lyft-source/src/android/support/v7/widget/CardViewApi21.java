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

    public float a(CardViewDelegate cardviewdelegate)
    {
        return ((RoundRectDrawable)(RoundRectDrawable)cardviewdelegate.getBackground()).a();
    }

    public void a()
    {
    }

    public void a(CardViewDelegate cardviewdelegate, float f1)
    {
        ((RoundRectDrawable)(RoundRectDrawable)cardviewdelegate.getBackground()).a(f1);
    }

    public void a(CardViewDelegate cardviewdelegate, int i)
    {
        ((RoundRectDrawable)(RoundRectDrawable)cardviewdelegate.getBackground()).a(i);
    }

    public void a(CardViewDelegate cardviewdelegate, Context context, int i, float f1, float f2, float f3)
    {
        cardviewdelegate.setBackgroundDrawable(new RoundRectDrawable(i, f1));
        context = (View)cardviewdelegate;
        context.setClipToOutline(true);
        context.setElevation(f2);
        b(cardviewdelegate, f3);
    }

    public float b(CardViewDelegate cardviewdelegate)
    {
        return d(cardviewdelegate) * 2.0F;
    }

    public void b(CardViewDelegate cardviewdelegate, float f1)
    {
        ((RoundRectDrawable)(RoundRectDrawable)cardviewdelegate.getBackground()).a(f1, cardviewdelegate.getUseCompatPadding(), cardviewdelegate.getPreventCornerOverlap());
        f(cardviewdelegate);
    }

    public float c(CardViewDelegate cardviewdelegate)
    {
        return d(cardviewdelegate) * 2.0F;
    }

    public void c(CardViewDelegate cardviewdelegate, float f1)
    {
        ((View)cardviewdelegate).setElevation(f1);
    }

    public float d(CardViewDelegate cardviewdelegate)
    {
        return ((RoundRectDrawable)(RoundRectDrawable)cardviewdelegate.getBackground()).b();
    }

    public float e(CardViewDelegate cardviewdelegate)
    {
        return ((View)cardviewdelegate).getElevation();
    }

    public void f(CardViewDelegate cardviewdelegate)
    {
        if (!cardviewdelegate.getUseCompatPadding())
        {
            cardviewdelegate.a(0, 0, 0, 0);
            return;
        } else
        {
            float f1 = a(cardviewdelegate);
            float f2 = d(cardviewdelegate);
            int i = (int)Math.ceil(RoundRectDrawableWithShadow.b(f1, f2, cardviewdelegate.getPreventCornerOverlap()));
            int j = (int)Math.ceil(RoundRectDrawableWithShadow.a(f1, f2, cardviewdelegate.getPreventCornerOverlap()));
            cardviewdelegate.a(i, j, i, j);
            return;
        }
    }

    public void g(CardViewDelegate cardviewdelegate)
    {
        b(cardviewdelegate, a(cardviewdelegate));
    }

    public void h(CardViewDelegate cardviewdelegate)
    {
        b(cardviewdelegate, a(cardviewdelegate));
    }
}
