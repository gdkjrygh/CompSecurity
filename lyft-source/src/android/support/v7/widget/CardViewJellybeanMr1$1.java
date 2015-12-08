// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.widget;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;

// Referenced classes of package android.support.v7.widget:
//            CardViewJellybeanMr1

class a
    implements adow.RoundRectHelper
{

    final CardViewJellybeanMr1 a;

    public void a(Canvas canvas, RectF rectf, float f, Paint paint)
    {
        canvas.drawRoundRect(rectf, f, f, paint);
    }

    adow.RoundRectHelper(CardViewJellybeanMr1 cardviewjellybeanmr1)
    {
        a = cardviewjellybeanmr1;
        super();
    }
}
