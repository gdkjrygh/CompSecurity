// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.graphics.drawable;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.support.v4.graphics.drawable.a;
import java.lang.annotation.Annotation;

public class DrawerArrowDrawable extends Drawable
{
    public static interface ArrowDirection
        extends Annotation
    {
    }


    private static final float b = (float)Math.toRadians(45D);
    private final Paint a = new Paint();
    private float c;
    private float d;
    private float e;
    private float f;
    private boolean g;
    private final Path h = new Path();
    private final int i;
    private boolean j;
    private float k;
    private float l;
    private int m;

    public DrawerArrowDrawable(Context context)
    {
        j = false;
        m = 2;
        a.setStyle(android.graphics.Paint.Style.STROKE);
        a.setStrokeJoin(android.graphics.Paint.Join.MITER);
        a.setStrokeCap(android.graphics.Paint.Cap.BUTT);
        a.setAntiAlias(true);
        context = context.getTheme().obtainStyledAttributes(null, android.support.v7.appcompat.a.k.DrawerArrowToggle, android.support.v7.appcompat.a.a.drawerArrowStyle, android.support.v7.appcompat.a.j.Base_Widget_AppCompat_DrawerArrowToggle);
        int i1 = context.getColor(android.support.v7.appcompat.a.k.DrawerArrowToggle_color, 0);
        if (i1 != a.getColor())
        {
            a.setColor(i1);
            invalidateSelf();
        }
        float f1 = context.getDimension(android.support.v7.appcompat.a.k.DrawerArrowToggle_thickness, 0.0F);
        if (a.getStrokeWidth() != f1)
        {
            a.setStrokeWidth(f1);
            l = (float)((double)(f1 / 2.0F) * Math.cos(b));
            invalidateSelf();
        }
        boolean flag = context.getBoolean(android.support.v7.appcompat.a.k.DrawerArrowToggle_spinBars, true);
        if (g != flag)
        {
            g = flag;
            invalidateSelf();
        }
        f1 = Math.round(context.getDimension(android.support.v7.appcompat.a.k.DrawerArrowToggle_gapBetweenBars, 0.0F));
        if (f1 != f)
        {
            f = f1;
            invalidateSelf();
        }
        i = context.getDimensionPixelSize(android.support.v7.appcompat.a.k.DrawerArrowToggle_drawableSize, 0);
        d = Math.round(context.getDimension(android.support.v7.appcompat.a.k.DrawerArrowToggle_barLength, 0.0F));
        c = Math.round(context.getDimension(android.support.v7.appcompat.a.k.DrawerArrowToggle_arrowHeadLength, 0.0F));
        e = context.getDimension(android.support.v7.appcompat.a.k.DrawerArrowToggle_arrowShaftLength, 0.0F);
        context.recycle();
    }

    public final void a(boolean flag)
    {
        if (j != flag)
        {
            j = flag;
            invalidateSelf();
        }
    }

    public final void b(float f1)
    {
        if (k != f1)
        {
            k = f1;
            invalidateSelf();
        }
    }

    public void draw(Canvas canvas)
    {
label0:
        {
label1:
            {
label2:
                {
                    float f1;
                    float f2;
                    int i1;
                    {
                        Rect rect = getBounds();
                        float f3;
                        float f4;
                        float f5;
                        float f6;
                        float f7;
                        float f8;
                        float f9;
                        switch (m)
                        {
                        case 2: // '\002'
                        default:
                            if (android.support.v4.graphics.drawable.a.e(this) == 1)
                            {
                                i1 = 1;
                            } else
                            {
                                i1 = 0;
                            }
                            break;

                        case 0: // '\0'
                            break label2;

                        case 1: // '\001'
                            break label1;

                        case 3: // '\003'
                            break label0;
                        }
                    }
                    f1 = (float)Math.sqrt(c * c * 2.0F);
                    f2 = d;
                    f6 = f2 + k * (f1 - f2);
                    f1 = d;
                    f3 = f1 + (e - f1) * k;
                    f4 = Math.round(0.0F + (l - 0.0F) * k);
                    f7 = 0.0F + (b - 0.0F) * k;
                    if (i1 != 0)
                    {
                        f1 = 0.0F;
                    } else
                    {
                        f1 = -180F;
                    }
                    if (i1 != 0)
                    {
                        f2 = 180F;
                    } else
                    {
                        f2 = 0.0F;
                    }
                    f5 = k;
                    f8 = Math.round((double)f6 * Math.cos(f7));
                    f6 = Math.round((double)f6 * Math.sin(f7));
                    h.rewind();
                    f7 = f + a.getStrokeWidth();
                    f7 += (-l - f7) * k;
                    f9 = -f3 / 2.0F;
                    h.moveTo(f9 + f4, 0.0F);
                    h.rLineTo(f3 - 2.0F * f4, 0.0F);
                    h.moveTo(f9, f7);
                    h.rLineTo(f8, f6);
                    h.moveTo(f9, -f7);
                    h.rLineTo(f8, -f6);
                    h.close();
                    canvas.save();
                    f3 = a.getStrokeWidth();
                    f3 = (float)((double)(float)(((int)((float)rect.height() - 3F * f3 - f * 2.0F) / 4) * 2) + ((double)f3 * 1.5D + (double)f));
                    canvas.translate(rect.centerX(), f3);
                    if (g)
                    {
                        if ((j ^ i1) != 0)
                        {
                            i1 = -1;
                        } else
                        {
                            i1 = 1;
                        }
                        canvas.rotate((float)i1 * (f1 + (f2 - f1) * f5));
                    } else
                    if (i1 != 0)
                    {
                        canvas.rotate(180F);
                    }
                    canvas.drawPath(h, a);
                    canvas.restore();
                    return;
                }
                i1 = 0;
                break MISSING_BLOCK_LABEL_51;
            }
            i1 = 1;
            break MISSING_BLOCK_LABEL_51;
        }
        if (android.support.v4.graphics.drawable.a.e(this) == 0)
        {
            i1 = 1;
        } else
        {
            i1 = 0;
        }
        break MISSING_BLOCK_LABEL_51;
    }

    public int getIntrinsicHeight()
    {
        return i;
    }

    public int getIntrinsicWidth()
    {
        return i;
    }

    public int getOpacity()
    {
        return -3;
    }

    public void setAlpha(int i1)
    {
        if (i1 != a.getAlpha())
        {
            a.setAlpha(i1);
            invalidateSelf();
        }
    }

    public void setColorFilter(ColorFilter colorfilter)
    {
        a.setColorFilter(colorfilter);
        invalidateSelf();
    }

}
