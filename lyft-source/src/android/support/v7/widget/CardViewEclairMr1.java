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

    final RectF a = new RectF();

    CardViewEclairMr1()
    {
    }

    private RoundRectDrawableWithShadow i(CardViewDelegate cardviewdelegate)
    {
        return (RoundRectDrawableWithShadow)cardviewdelegate.getBackground();
    }

    public float a(CardViewDelegate cardviewdelegate)
    {
        return i(cardviewdelegate).c();
    }

    RoundRectDrawableWithShadow a(Context context, int j, float f1, float f2, float f3)
    {
        return new RoundRectDrawableWithShadow(context.getResources(), j, f1, f2, f3);
    }

    public void a()
    {
        RoundRectDrawableWithShadow.c = new RoundRectDrawableWithShadow.RoundRectHelper() {

            final CardViewEclairMr1 a;

            public void a(Canvas canvas, RectF rectf, float f1, Paint paint)
            {
                float f3 = 2.0F * f1;
                float f4 = rectf.width() - f3 - 1.0F;
                float f5 = rectf.height();
                float f2 = f1;
                if (f1 >= 1.0F)
                {
                    f2 = f1 + 0.5F;
                    a.a.set(-f2, -f2, f2, f2);
                    int j = canvas.save();
                    canvas.translate(rectf.left + f2, rectf.top + f2);
                    canvas.drawArc(a.a, 180F, 90F, true, paint);
                    canvas.translate(f4, 0.0F);
                    canvas.rotate(90F);
                    canvas.drawArc(a.a, 180F, 90F, true, paint);
                    canvas.translate(f5 - f3 - 1.0F, 0.0F);
                    canvas.rotate(90F);
                    canvas.drawArc(a.a, 180F, 90F, true, paint);
                    canvas.translate(f4, 0.0F);
                    canvas.rotate(90F);
                    canvas.drawArc(a.a, 180F, 90F, true, paint);
                    canvas.restoreToCount(j);
                    canvas.drawRect((rectf.left + f2) - 1.0F, rectf.top, (rectf.right - f2) + 1.0F, rectf.top + f2, paint);
                    canvas.drawRect((rectf.left + f2) - 1.0F, (rectf.bottom - f2) + 1.0F, (rectf.right - f2) + 1.0F, rectf.bottom, paint);
                }
                f1 = rectf.left;
                f3 = rectf.top;
                canvas.drawRect(f1, Math.max(0.0F, f2 - 1.0F) + f3, rectf.right, (rectf.bottom - f2) + 1.0F, paint);
            }

            
            {
                a = CardViewEclairMr1.this;
                super();
            }
        };
    }

    public void a(CardViewDelegate cardviewdelegate, float f1)
    {
        i(cardviewdelegate).a(f1);
        f(cardviewdelegate);
    }

    public void a(CardViewDelegate cardviewdelegate, int j)
    {
        i(cardviewdelegate).a(j);
    }

    public void a(CardViewDelegate cardviewdelegate, Context context, int j, float f1, float f2, float f3)
    {
        context = a(context, j, f1, f2, f3);
        context.a(cardviewdelegate.getPreventCornerOverlap());
        cardviewdelegate.setBackgroundDrawable(context);
        f(cardviewdelegate);
    }

    public float b(CardViewDelegate cardviewdelegate)
    {
        return i(cardviewdelegate).d();
    }

    public void b(CardViewDelegate cardviewdelegate, float f1)
    {
        i(cardviewdelegate).c(f1);
        f(cardviewdelegate);
    }

    public float c(CardViewDelegate cardviewdelegate)
    {
        return i(cardviewdelegate).e();
    }

    public void c(CardViewDelegate cardviewdelegate, float f1)
    {
        i(cardviewdelegate).b(f1);
    }

    public float d(CardViewDelegate cardviewdelegate)
    {
        return i(cardviewdelegate).a();
    }

    public float e(CardViewDelegate cardviewdelegate)
    {
        return i(cardviewdelegate).b();
    }

    public void f(CardViewDelegate cardviewdelegate)
    {
        Rect rect = new Rect();
        i(cardviewdelegate).a(rect);
        ((View)cardviewdelegate).setMinimumHeight((int)Math.ceil(c(cardviewdelegate)));
        ((View)cardviewdelegate).setMinimumWidth((int)Math.ceil(b(cardviewdelegate)));
        cardviewdelegate.a(rect.left, rect.top, rect.right, rect.bottom);
    }

    public void g(CardViewDelegate cardviewdelegate)
    {
    }

    public void h(CardViewDelegate cardviewdelegate)
    {
        i(cardviewdelegate).a(cardviewdelegate.getPreventCornerOverlap());
        f(cardviewdelegate);
    }
}
