// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Typeface;
import android.view.View;
import android.widget.LinearLayout;

final class cbf extends cbi
{

    private static final Typeface c = Typeface.create("sans-serif", 1);
    private final Matrix d = new Matrix();
    private final long e;
    private final float f[];

    cbf(cay cay, int i, long l, long l1, long l2, float af[])
    {
        cbj cbj1 = new cbj();
        cbj1.d = cay;
        cbj1.e = -1;
        cbj1.f = 85;
        cbj1.g = 65.11096F;
        cbj1.k = c;
        cbj1.j = 21;
        cbj1.h = 86.45882F;
        cbj1.a = true;
        cbj1.c = 1;
        cbj1.b = 2;
        cbj1.u = l1;
        cbj1.v = l2;
        cbj1.m = true;
        cbj1.n = 0.05F;
        cbj1.p = 0.04098361F;
        cbj1.q = i;
        super(cbj1);
        e = l;
        f = af;
    }

    private View a(Context context, String s, int i, int j, int k, int l, float f1)
    {
        context = new ccw(context);
        int i1 = (int)((21F * f1) / 784F);
        context.setPadding(i1, i1, i1, i1);
        context.setVisibility(0);
        context.setGravity(j);
        context.setText(s);
        context.setTextColor(i);
        context.setAllCaps(true);
        context.setTypeface(c);
        context.a(0.0F);
        context.setLineSpacing(0.0F, 1.327869F);
        a(((ccw) (context)), k, l, f1);
        context.setLayoutParams(new android.widget.LinearLayout.LayoutParams(k, -1));
        return context;
    }

    protected final Bitmap a(Context context, Bitmap bitmap, cba cba1, int i, int j)
    {
        Bitmap bitmap1;
label0:
        {
            if (bitmap != null)
            {
                bitmap1 = bitmap;
                if (bitmap.isMutable())
                {
                    break label0;
                }
            }
            bitmap1 = Bitmap.createBitmap(i, j, android.graphics.Bitmap.Config.ARGB_8888);
        }
        bitmap = new Canvas(bitmap1);
        bitmap.drawColor(0, android.graphics.PorterDuff.Mode.CLEAR);
        LinearLayout linearlayout = new LinearLayout(context);
        linearlayout.setOrientation(0);
        float f1 = ddl.a(i, j);
        linearlayout.addView(a(context, cba1.p, -1, 85, (int)((float)i * 0.75F), j, f1));
        linearlayout.addView(a(context, cba1.q, 0xff000000, 83, (int)((float)i * 0.25F), j, f1));
        linearlayout.measure(android.view.View.MeasureSpec.makeMeasureSpec(bitmap.getWidth(), 0x40000000), android.view.View.MeasureSpec.makeMeasureSpec(bitmap.getHeight(), 0x40000000));
        linearlayout.layout(0, 0, bitmap.getWidth(), bitmap.getHeight());
        linearlayout.draw(bitmap);
        return bitmap1;
    }

    public final Matrix o(cba cba1)
    {
        d.reset();
        if (cba1.f == 0)
        {
            Matrix matrix = d;
            long l = cba1.e / 4L;
            long l1 = l - e / 2L;
            float f1;
            if (cba1.d < l1)
            {
                f1 = -1F;
            } else
            {
                long l3 = e / 2L;
                if (cba1.d < l3 + l)
                {
                    f1 = -1F + 0.75F * b.a((float)(cba1.d - l1) / (float)e, f);
                } else
                {
                    long l2 = (l << 1) - e / 2L;
                    if (cba1.d < l2)
                    {
                        f1 = -0.25F;
                    } else
                    {
                        long l4 = e / 2L;
                        if (cba1.d < (l << 1) + l4)
                        {
                            f1 = -0.25F + 0.25F * b.a((float)(cba1.d - l2) / (float)e, f);
                        } else
                        {
                            l = (l << 2) - cba1.o;
                            if (cba1.d < l)
                            {
                                f1 = 0.0F;
                            } else
                            {
                                f1 = b.a((float)(cba1.d - l) / (float)e, f);
                            }
                        }
                    }
                }
            }
            matrix.postTranslate(f1, 0.0F);
        }
        return d;
    }

}
