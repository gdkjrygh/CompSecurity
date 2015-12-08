// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package eu.janmuller.android.simplecropimage;

import android.content.res.Resources;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;

final class HighlightView
{
    static final class ModifyMode extends Enum
    {

        public static final ModifyMode a;
        public static final ModifyMode b;
        public static final ModifyMode c;
        private static final ModifyMode d[];

        public static ModifyMode valueOf(String s)
        {
            return (ModifyMode)Enum.valueOf(eu/janmuller/android/simplecropimage/HighlightView$ModifyMode, s);
        }

        public static ModifyMode[] values()
        {
            return (ModifyMode[])d.clone();
        }

        static 
        {
            a = new ModifyMode("None", 0);
            b = new ModifyMode("Move", 1);
            c = new ModifyMode("Grow", 2);
            d = (new ModifyMode[] {
                a, b, c
            });
        }

        private ModifyMode(String s, int i1)
        {
            super(s, i1);
        }
    }


    final Paint a = new Paint();
    final Paint b = new Paint();
    final Paint c = new Paint();
    View d;
    boolean e;
    boolean f;
    Rect g;
    RectF h;
    Matrix i;
    ModifyMode j;
    RectF k;
    boolean l;
    float m;
    boolean n;
    Drawable o;
    Drawable p;
    Drawable q;

    public HighlightView(View view)
    {
        j = ModifyMode.a;
        l = false;
        n = false;
        d = view;
    }

    public final int a(float f1, float f2)
    {
        Rect rect;
        int i1;
        boolean flag;
        int k1;
        int l1;
        i1 = 0;
        flag = true;
        rect = a();
        if (!n)
        {
            break MISSING_BLOCK_LABEL_126;
        }
        f1 -= rect.centerX();
        f2 -= rect.centerY();
        k1 = (int)Math.sqrt(f1 * f1 + f2 * f2);
        l1 = g.width() / 2;
        if ((float)Math.abs(k1 - l1) > 20F) goto _L2; else goto _L1
_L1:
        if (Math.abs(f2) <= Math.abs(f1)) goto _L4; else goto _L3
_L3:
        if (f2 >= 0.0F) goto _L6; else goto _L5
_L5:
        i1 = 8;
_L8:
        return i1;
_L6:
        return 16;
_L4:
        return f1 >= 0.0F ? 4 : 2;
_L2:
        i1 = ((flag) ? 1 : 0);
        if (k1 >= l1) goto _L8; else goto _L7
_L7:
        return 32;
        int j1;
        byte byte0;
        boolean flag1;
        if (f2 >= (float)rect.top - 20F && f2 < (float)rect.bottom + 20F)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        byte0 = i1;
        if (f1 >= (float)rect.left - 20F)
        {
            byte0 = i1;
            if (f1 < (float)rect.right + 20F)
            {
                byte0 = 1;
            }
        }
        if (Math.abs((float)rect.left - f1) < 20F && flag1)
        {
            j1 = 3;
        } else
        {
            j1 = 1;
        }
        i1 = j1;
        if (Math.abs((float)rect.right - f1) < 20F)
        {
            i1 = j1;
            if (flag1)
            {
                i1 = j1 | 4;
            }
        }
        j1 = i1;
        if (Math.abs((float)rect.top - f2) < 20F)
        {
            j1 = i1;
            if (byte0 != 0)
            {
                j1 = i1 | 8;
            }
        }
        if (Math.abs((float)rect.bottom - f2) < 20F && byte0 != 0)
        {
            i1 = j1 | 0x10;
        } else
        {
            i1 = j1;
        }
        if (i1 == 1 && rect.contains((int)f1, (int)f2))
        {
            return 32;
        } else
        {
            return i1;
        }
    }

    final Rect a()
    {
        RectF rectf = new RectF(h.left, h.top, h.right, h.bottom);
        i.mapRect(rectf);
        return new Rect(Math.round(rectf.left), Math.round(rectf.top), Math.round(rectf.right), Math.round(rectf.bottom));
    }

    public final void a(Matrix matrix, Rect rect, RectF rectf, boolean flag)
    {
        i = new Matrix(matrix);
        h = rectf;
        k = new RectF(rect);
        l = flag;
        n = false;
        m = h.width() / h.height();
        g = a();
        a.setARGB(125, 50, 50, 50);
        b.setARGB(125, 50, 50, 50);
        c.setStrokeWidth(4F);
        c.setStyle(android.graphics.Paint.Style.STROKE);
        c.setAntiAlias(true);
        j = ModifyMode.a;
        matrix = d.getResources();
        o = matrix.getDrawable(c.a.camera_crop_width);
        p = matrix.getDrawable(c.a.camera_crop_height);
        q = matrix.getDrawable(c.a.indicator_autocrop);
    }

    public final void a(ModifyMode modifymode)
    {
        if (modifymode != j)
        {
            j = modifymode;
            d.invalidate();
        }
    }

    public final void b()
    {
        g = a();
    }
}
