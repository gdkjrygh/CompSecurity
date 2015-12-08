// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;

final class acj
    implements afs
{

    private aci a;

    acj(aci aci1)
    {
        a = aci1;
        super();
    }

    public final void a(Canvas canvas, RectF rectf, float f, Paint paint)
    {
        float f2 = 2.0F * f;
        float f3 = rectf.width() - f2 - 1.0F;
        float f4 = rectf.height();
        float f1 = f;
        if (f >= 1.0F)
        {
            f1 = f + 0.5F;
            a.a.set(-f1, -f1, f1, f1);
            int i = canvas.save();
            canvas.translate(rectf.left + f1, rectf.top + f1);
            canvas.drawArc(a.a, 180F, 90F, true, paint);
            canvas.translate(f3, 0.0F);
            canvas.rotate(90F);
            canvas.drawArc(a.a, 180F, 90F, true, paint);
            canvas.translate(f4 - f2 - 1.0F, 0.0F);
            canvas.rotate(90F);
            canvas.drawArc(a.a, 180F, 90F, true, paint);
            canvas.translate(f3, 0.0F);
            canvas.rotate(90F);
            canvas.drawArc(a.a, 180F, 90F, true, paint);
            canvas.restoreToCount(i);
            canvas.drawRect((rectf.left + f1) - 1.0F, rectf.top, (rectf.right - f1) + 1.0F, rectf.top + f1, paint);
            canvas.drawRect((rectf.left + f1) - 1.0F, (rectf.bottom - f1) + 1.0F, (rectf.right - f1) + 1.0F, rectf.bottom, paint);
        }
        f = rectf.left;
        f2 = rectf.top;
        canvas.drawRect(f, Math.max(0.0F, f1 - 1.0F) + f2, rectf.right, (rectf.bottom - f1) + 1.0F, paint);
    }
}
