// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.translate.b;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.util.DisplayMetrics;
import com.google.android.apps.translate.k;
import com.google.android.libraries.translate.e.o;
import java.util.Arrays;

public final class c extends Drawable
{

    private static final int a[] = {
        0xffe02d32, 0xffc4282e, 0xffb33d2e
    };
    private static final int b[] = {
        0xffe8e8e8, 0xffdedede, 0xffbababa
    };
    private static final int c[] = {
        0xfff93238, 0xffdf2d34, 0xffd14836
    };
    private static final int d[] = {
        -1, 0xfff5f5f5, 0xffd14836
    };
    private static final int e[] = {
        0xfff5f5f5, 0xffeaeaea, 0xffd9d9d9
    };
    private final Path f = new Path();
    private final Path g = new Path();
    private final Paint h = new Paint();
    private final Paint i;
    private final float j;
    private final float k;
    private final boolean l;
    private int m[];

    public c(Context context, boolean flag)
    {
        m = null;
        context = context.getResources();
        j = context.getDimension(k.voice_lang_button_center_spacing) - context.getDimension(k.voice_lang_button_padding);
        k = context.getDisplayMetrics().density;
        h.setStyle(android.graphics.Paint.Style.FILL);
        h.setAntiAlias(true);
        h.setColor(0xfff0f0f0);
        h.setStrokeWidth(0.0F);
        i = new Paint(h);
        i.setColor(0xfff0f0f0);
        boolean flag1 = flag;
        if (o.d())
        {
            if (!flag)
            {
                flag1 = true;
            } else
            {
                flag1 = false;
            }
        }
        l = flag1;
    }

    private void a(float f1, float f2)
    {
        if (m == null)
        {
            i.setShader(null);
            h.setColor(0xfff0f0f0);
            return;
        } else
        {
            i.setShader(new LinearGradient(0.0F, f1, 0.0F, f2, m[0], m[1], android.graphics.Shader.TileMode.CLAMP));
            h.setColor(m[2]);
            return;
        }
    }

    private static void a(Path path, float f1, float f2, float f3, float f4, float f5)
    {
        path.reset();
        path.moveTo(f2, f3);
        float f6 = (float)((Math.asin((f3 - f1) / (f5 * 2.0F)) * 180D) / 3.1415926535897931D);
        float f7 = (f3 + f1) / 2.0F;
        if (f6 < 0.0F)
        {
            f3 = -f6;
        } else
        {
            f3 = f6;
            f6 = 180F - f6;
        }
        path.arcTo(new RectF(f4 - f5, f7 - f5, f4 + f5, f7 + f5), f6, f3 * 2.0F);
        path.lineTo(f2, f1);
        path.close();
    }

    public final void draw(Canvas canvas)
    {
        canvas.drawPath(f, h);
        canvas.drawPath(g, i);
    }

    public final int getOpacity()
    {
        return -3;
    }

    public final boolean isStateful()
    {
        return true;
    }

    protected final void onBoundsChange(Rect rect)
    {
        if (l)
        {
            a(f, rect.top, rect.left, rect.bottom, rect.right, j);
            a(g, (float)rect.top + k, (float)rect.left + k, (float)rect.bottom - k, rect.right, j + k);
        } else
        {
            a(f, rect.bottom, rect.right, rect.top, rect.left, j);
            a(g, (float)rect.bottom - k, (float)rect.right - k, (float)rect.top + k, rect.left, j + k);
        }
        a(rect.top, rect.bottom);
    }

    protected final boolean onStateChange(int ai[])
    {
        Object obj = null;
        int ai1[] = Arrays.copyOf(ai, ai.length);
        Arrays.sort(ai1);
        if (Arrays.binarySearch(ai1, 0x10100a7) >= 0)
        {
            if (Arrays.binarySearch(ai1, 0x10100a0) >= 0)
            {
                ai = a;
            } else
            {
                ai = b;
            }
        } else
        if (Arrays.binarySearch(ai1, 0x10100a0) >= 0)
        {
            ai = c;
        } else
        if (Arrays.binarySearch(ai1, 0x10100a1) >= 0)
        {
            ai = d;
        } else
        {
            ai = obj;
            if (Arrays.binarySearch(ai1, 0x101009e) >= 0)
            {
                ai = e;
            }
        }
        if (ai != m)
        {
            m = ai;
            ai = getBounds();
            a(((Rect) (ai)).top, ((Rect) (ai)).bottom);
            invalidateSelf();
            return true;
        } else
        {
            return false;
        }
    }

    public final void setAlpha(int i1)
    {
    }

    public final void setColorFilter(ColorFilter colorfilter)
    {
    }

}
