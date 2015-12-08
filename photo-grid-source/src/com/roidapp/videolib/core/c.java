// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.videolib.core;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.PaintFlagsDrawFilter;
import android.graphics.Rect;
import android.text.SpannableStringBuilder;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.StyleSpan;
import com.roidapp.baselib.f.b;
import com.roidapp.imagelib.filter.filterinfo.IFilterInfo;
import com.roidapp.videolib.b.u;
import com.roidapp.videolib.core.a.a;
import com.roidapp.videolib.gl.f;
import java.nio.ByteBuffer;

// Referenced classes of package com.roidapp.videolib.core:
//            e, b, i

final class c
    implements f
{

    final com.roidapp.videolib.core.b a;

    c(com.roidapp.videolib.core.b b1)
    {
        a = b1;
        super();
    }

    public final int a(int l)
    {
        return com.roidapp.videolib.core.e.a(l);
    }

    public final int a(ByteBuffer abytebuffer[], long l)
    {
        if (com.roidapp.videolib.core.b.c(a) != null)
        {
            return com.roidapp.videolib.core.b.c(a).a(abytebuffer, l);
        } else
        {
            return -1;
        }
    }

    public final long a()
    {
        if (com.roidapp.videolib.core.b.c(a) != null)
        {
            return com.roidapp.videolib.core.b.c(a).c;
        } else
        {
            return 0L;
        }
    }

    public final com.roidapp.videolib.gl.a b(int l)
    {
        if (com.roidapp.videolib.core.b.b(a) == null)
        {
            com.roidapp.videolib.core.b.a(a, new i(a, d()));
        }
        if (com.roidapp.videolib.core.b.b(a) != null)
        {
            return com.roidapp.videolib.core.b.b(a).a(l);
        } else
        {
            return null;
        }
    }

    public final int[] b()
    {
        if (com.roidapp.videolib.core.b.c(a) != null)
        {
            com.roidapp.videolib.core.b.c(a);
            return com.roidapp.videolib.core.e.a();
        } else
        {
            return null;
        }
    }

    public final int c()
    {
        return (int)((float)a.i.g() / 1000F);
    }

    public final int d()
    {
        if (!com.roidapp.videolib.core.b.a(a))
        {
            return a.i.c().length;
        } else
        {
            return com.roidapp.videolib.core.e.c(g());
        }
    }

    public final Bitmap e()
    {
        if (!com.roidapp.videolib.core.b.a(a) && !TextUtils.isEmpty(a.i.o))
        {
            if (com.roidapp.videolib.core.b.e(a) == null)
            {
                int l = a.i.d();
                Object obj1 = a.i.o;
                Object obj;
                try
                {
                    com.roidapp.baselib.a.a.a();
                    obj = com.roidapp.baselib.a.a.a(l, l, android.graphics.Bitmap.Config.ARGB_8888);
                }
                // Misplaced declaration of an exception variable
                catch (Object obj)
                {
                    System.gc();
                    l = a.i.d() / 2;
                    try
                    {
                        com.roidapp.baselib.a.a.a();
                        obj = com.roidapp.baselib.a.a.a(l, l, android.graphics.Bitmap.Config.ARGB_8888);
                    }
                    // Misplaced declaration of an exception variable
                    catch (Object obj)
                    {
                        System.gc();
                        obj = null;
                    }
                }
                if (obj == null)
                {
                    com.roidapp.videolib.core.b.b(a, null);
                    return null;
                }
                Canvas canvas = new Canvas(((Bitmap) (obj)));
                canvas.drawColor(0);
                canvas.setDrawFilter(new PaintFlagsDrawFilter(0, 3));
                TextPaint textpaint = new TextPaint();
                textpaint.setTextSize(com.roidapp.videolib.core.b.a(20F, com.roidapp.videolib.core.b.f(a)));
                textpaint.setAntiAlias(true);
                textpaint.setColor(-1);
                textpaint.setStrokeWidth(com.roidapp.videolib.core.b.a(1.0F, com.roidapp.videolib.core.b.f(a)));
                textpaint.setShadowLayer(com.roidapp.videolib.core.b.a(5F, com.roidapp.videolib.core.b.f(a)) / 2, 0.0F, 0.0F, Color.parseColor("#7b000000"));
                Object obj2 = new TextPaint();
                ((TextPaint) (obj2)).setTextSize(com.roidapp.videolib.core.b.a(15F, com.roidapp.videolib.core.b.f(a)));
                ((TextPaint) (obj2)).setAntiAlias(true);
                ((TextPaint) (obj2)).setColor(-1);
                ((TextPaint) (obj2)).setStrokeWidth(com.roidapp.videolib.core.b.a(1.0F, com.roidapp.videolib.core.b.f(a)));
                ((TextPaint) (obj2)).setShadowLayer(com.roidapp.videolib.core.b.a(5F, com.roidapp.videolib.core.b.f(a)) / 2, 0.0F, 0.0F, Color.parseColor("#7b000000"));
                Object obj3 = new Rect();
                textpaint.getTextBounds("\u3002.", 0, 2, ((Rect) (obj3)));
                int i1 = ((Rect) (obj3)).width();
                ((TextPaint) (obj2)).getTextBounds("\u3002.", 0, 2, ((Rect) (obj3)));
                int l1 = ((Rect) (obj3)).width();
                obj3 = new SpannableStringBuilder("PhotoGrid");
                ((SpannableStringBuilder) (obj3)).setSpan(new StyleSpan(0), 0, 5, 17);
                ((SpannableStringBuilder) (obj3)).setSpan(new StyleSpan(1), 5, ((SpannableStringBuilder) (obj3)).length(), 17);
                int k1 = (int)com.roidapp.videolib.core.b.a(((TextPaint) (obj2)), ((SpannableStringBuilder) (obj3)).toString()) + l1;
                int i2 = Math.round((float)l * 0.0594F);
                obj3 = new StaticLayout(((CharSequence) (obj3)), ((TextPaint) (obj2)), k1, android.text.Layout.Alignment.ALIGN_NORMAL, 1.0F, 1.0F, true);
                obj2 = new SpannableStringBuilder(((CharSequence) (obj1)));
                if (((String) (obj1)).contains("Directed by ") && ((String) (obj1)).length() > 12)
                {
                    ((SpannableStringBuilder) (obj2)).setSpan(new StyleSpan(0), 0, 12, 17);
                    ((SpannableStringBuilder) (obj2)).setSpan(new StyleSpan(1), 12, ((String) (obj1)).length(), 17);
                }
                i1 = (int)com.roidapp.videolib.core.b.a(textpaint, ((String) (obj1))) + i1;
                obj1 = new StaticLayout(((CharSequence) (obj2)), textpaint, i1, android.text.Layout.Alignment.ALIGN_NORMAL, 1.0F, 1.0F, true);
                int j1 = (int)Math.floor((float)l * 0.0734F) * ((StaticLayout) (obj1)).getLineCount();
                float f1 = ((float)l * 0.0734F * (float)((StaticLayout) (obj1)).getLineCount()) / (float)((StaticLayout) (obj1)).getHeight();
                int j2 = Math.round(((float)l * 0.025F) / f1);
                int k2 = Math.round(((float)l * 0.03125F) / f1);
                if ((float)i1 * f1 > (float)l)
                {
                    i1 = (int)Math.floor((float)l / f1) - j2;
                    obj1 = new StaticLayout(((CharSequence) (obj2)), textpaint, i1, android.text.Layout.Alignment.ALIGN_NORMAL, 1.0F, 1.0F, true);
                    j1 = Math.round((float)l * 0.0734F) * ((StaticLayout) (obj1)).getLineCount();
                } else
                if (i1 < k1)
                {
                    i1 = k1;
                }
                j1 = j1 + i2 + Math.round((float)k2 * f1) * 2;
                try
                {
                    com.roidapp.baselib.a.a.a();
                    obj2 = com.roidapp.baselib.a.a.a(i1, (int)((float)j1 / f1), android.graphics.Bitmap.Config.ARGB_8888);
                }
                // Misplaced declaration of an exception variable
                catch (Object obj2)
                {
                    obj2 = null;
                }
                if (obj2 == null)
                {
                    com.roidapp.videolib.core.b.b(a, null);
                    return null;
                }
                Canvas canvas1 = new Canvas(((Bitmap) (obj2)));
                canvas1.drawColor(0);
                canvas1.setDrawFilter(new PaintFlagsDrawFilter(0, 3));
                ((StaticLayout) (obj1)).draw(canvas1);
                canvas1.save();
                canvas1.translate(0.0F, ((StaticLayout) (obj1)).getHeight() + k2);
                canvas1.drawLine(0.0F, 0.0F, i1 - j2, 0.0F, textpaint);
                canvas1.translate((i1 - k1) + l1 / 2, k2);
                ((StaticLayout) (obj3)).draw(canvas1);
                canvas1.restore();
                float f2 = ((float)l - (float)(i1 - j2) * f1) / 2.0F;
                float f3 = (l - j1) / 2;
                obj1 = new Matrix();
                ((Matrix) (obj1)).postScale(f1, f1);
                ((Matrix) (obj1)).postTranslate(f2, f3);
                canvas.drawBitmap(((Bitmap) (obj2)), ((Matrix) (obj1)), null);
                com.roidapp.videolib.core.b.b(a, ((Bitmap) (obj)));
            }
            return com.roidapp.videolib.core.b.e(a);
        } else
        {
            return null;
        }
    }

    public final Bitmap f()
    {
        if (com.roidapp.videolib.core.b.d(a) == null)
        {
            Object obj = a;
            com.roidapp.baselib.a.a.a();
            com.roidapp.videolib.core.b.a(((com.roidapp.videolib.core.b) (obj)), com.roidapp.baselib.a.a.a(a.i.d(), a.i.e(), android.graphics.Bitmap.Config.ARGB_8888));
            obj = new Canvas(com.roidapp.videolib.core.b.d(a));
            ((Canvas) (obj)).setDrawFilter(new PaintFlagsDrawFilter(0, 3));
            com.roidapp.baselib.f.b.a().a(((Canvas) (obj)));
        }
        return com.roidapp.videolib.core.b.d(a);
    }

    public final u g()
    {
        return a.i.l();
    }

    public final u[] h()
    {
        return a.i.k();
    }

    public final boolean i()
    {
        if (com.roidapp.videolib.core.b.c(a) != null)
        {
            return com.roidapp.videolib.core.b.c(a).d();
        } else
        {
            return true;
        }
    }

    public final IFilterInfo j()
    {
        return a.i.n();
    }

    public final int k()
    {
        return a.i.m();
    }
}
