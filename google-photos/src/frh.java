// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.RectF;

public final class frh
    implements frd
{

    private static final PointF a = new PointF(0.0F, 0.0F);
    private final int b;
    private final int c;
    private final jp d = new jp(500);
    private final int e;
    private final int f;
    private final noz g;
    private final RectF h = new RectF();
    private final RectF i = new RectF();
    private final Matrix j = new Matrix();
    private final fri k = new fri();

    frh(Context context, flk flk1)
    {
        c = flk1.a();
        b = flk1.a();
        f = flk1.b();
        e = flk1.b();
        g = noz.a(context, 2, "MiniOffsetCalc", new String[0]);
    }

    private void a(int l, int i1, int j1, int k1, RectF rectf)
    {
        float f1 = 0.0F;
        float f2;
        float f3;
        if (l * k1 > j1 * i1)
        {
            f3 = (float)k1 / (float)i1;
            f2 = ((float)j1 - (float)l * f3) * 0.5F;
        } else
        {
            f3 = (float)j1 / (float)l;
            f1 = k1;
            float f4 = i1;
            f2 = 0.0F;
            f1 = (f1 - f4 * f3) * 0.5F;
        }
        j.setScale(f3, f3);
        j.mapRect(rectf);
        rectf.set(Math.round(rectf.left), Math.round(rectf.top), Math.round(rectf.right), Math.round(rectf.bottom));
        rectf.offset((int)(f2 + 0.5F), (int)(f1 + 0.5F));
    }

    public final PointF a(int l, int i1, int j1, int k1)
    {
        if ((l > c || i1 > b) && (l <= f || i1 <= e)) goto _L2; else goto _L1
_L1:
        Object obj = a;
_L4:
        if (g.a())
        {
            noy.a("aspect", l, i1);
            noy.a("target", j1, k1);
            noy.a("mini thumb", c, b);
            noy.a("x offset", Float.valueOf(((PointF) (obj)).x));
            noy.a("y offset", Float.valueOf(((PointF) (obj)).y));
        }
        return ((PointF) (obj));
_L2:
        k.a(l, i1, j1, k1);
        PointF pointf = (PointF)d.a(k);
        obj = pointf;
        if (pointf == null)
        {
            h.set(0.0F, 0.0F, l, i1);
            a(l, i1, j1, k1, h);
            i.set(0.0F, 0.0F, l, i1);
            obj = i;
            int j2 = c;
            int k2 = b;
            int l1 = (int)((RectF) (obj)).width();
            int i2 = (int)((RectF) (obj)).height();
            float f1;
            fri fri1;
            boolean flag;
            if (((RectF) (obj)).width() == (float)l1)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            p.a(flag);
            if (((RectF) (obj)).height() == (float)i2)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            p.a(flag);
            f1 = avk.b.a(l1, i2, j2, k2);
            j2 = (int)((float)l1 * f1 + 0.5F);
            k2 = (int)((float)i2 * f1 + 0.5F);
            l1 = Math.max(1, Integer.highestOneBit(Math.min(l1 / j2, i2 / k2)));
            f1 *= l1;
            j.setScale(1.0F / (float)l1, 1.0F / (float)l1);
            j.postScale(f1, f1);
            j.mapRect(((RectF) (obj)));
            ((RectF) (obj)).set((float)Math.ceil(((RectF) (obj)).left), (float)Math.ceil(((RectF) (obj)).top), (float)Math.ceil(((RectF) (obj)).right), (float)Math.ceil(((RectF) (obj)).bottom));
            a((int)i.width(), (int)i.height(), c, b, i);
            a(c, b, j1, k1, i);
            obj = new PointF(i.centerX() - h.centerX(), i.centerY() - h.centerY());
            fri1 = new fri(l, i1, j1, k1);
            d.a(fri1, obj);
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

}
