// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid.release;

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
import android.view.ViewGroup;
import com.roidapp.baselib.a.a;
import com.roidapp.imagelib.filter.filterinfo.IFilterInfo;
import com.roidapp.videolib.b.u;
import com.roidapp.videolib.core.e;
import com.roidapp.videolib.core.i;
import com.roidapp.videolib.gl.f;
import java.nio.ByteBuffer;

// Referenced classes of package com.roidapp.photogrid.release:
//            ng, ih, rf, an

final class nh
    implements f
{

    final ng a;

    nh(ng ng1)
    {
        a = ng1;
        super();
    }

    public final int a(int l)
    {
        return com.roidapp.videolib.core.e.a(l);
    }

    public final int a(ByteBuffer abytebuffer[], long l)
    {
        Object obj = com.roidapp.photogrid.release.ng.a(a);
        obj;
        JVM INSTR monitorenter ;
        int i1;
        if (ng.b(a) == null)
        {
            break MISSING_BLOCK_LABEL_42;
        }
        i1 = ng.b(a).a(abytebuffer, l);
        return i1;
        obj;
        JVM INSTR monitorexit ;
        return -1;
        abytebuffer;
        obj;
        JVM INSTR monitorexit ;
        throw abytebuffer;
    }

    public final long a()
    {
        Object obj = com.roidapp.photogrid.release.ng.a(a);
        obj;
        JVM INSTR monitorenter ;
        long l;
        if (ng.b(a) == null)
        {
            break MISSING_BLOCK_LABEL_35;
        }
        l = ng.b(a).c();
        return l;
        obj;
        JVM INSTR monitorexit ;
        return 0L;
        Exception exception;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public final com.roidapp.videolib.gl.a b(int l)
    {
        com.roidapp.photogrid.release.ng.a(a, ih.C().V());
        com.roidapp.videolib.gl.a a1;
        synchronized (com.roidapp.photogrid.release.ng.f(a))
        {
            if (ng.g(a) == null)
            {
                com.roidapp.photogrid.release.ng.a(a, new i(a, d()));
                ng.g(a).a();
            }
            a1 = ng.g(a).a(l);
        }
        return a1;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public final int[] b()
    {
        Object obj = com.roidapp.photogrid.release.ng.a(a);
        obj;
        JVM INSTR monitorenter ;
        int ai[];
        if (ng.b(a) == null)
        {
            break MISSING_BLOCK_LABEL_28;
        }
        ai = com.roidapp.videolib.core.e.a();
        return ai;
        obj;
        JVM INSTR monitorexit ;
        return null;
        Exception exception;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public final int c()
    {
        if (ng.c(a))
        {
            return 15000;
        } else
        {
            return ng.d(a);
        }
    }

    public final int d()
    {
        if (ng.c(a))
        {
            return com.roidapp.videolib.core.e.c(a.Z);
        } else
        {
            return com.roidapp.photogrid.release.ng.e(a);
        }
    }

    public final Bitmap e()
    {
        if (!ng.c(a) && !TextUtils.isEmpty(a.X))
        {
            if (ng.h(a) || com.roidapp.photogrid.release.ng.i(a) == null)
            {
                ng.j(a);
                if (com.roidapp.photogrid.release.ng.i(a) != null)
                {
                    com.roidapp.photogrid.release.ng.i(a).recycle();
                    com.roidapp.photogrid.release.ng.a(a, null);
                }
                int l = ng.k(a);
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
                    l = ng.k(a) / 2;
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
                    com.roidapp.photogrid.release.ng.a(a, null);
                    return null;
                }
                Canvas canvas = new Canvas(((Bitmap) (obj)));
                canvas.drawColor(0);
                canvas.setDrawFilter(new PaintFlagsDrawFilter(0, 3));
                TextPaint textpaint = new TextPaint();
                textpaint.setTextSize(com.roidapp.photogrid.release.ng.a(20F, ng.l(a)));
                textpaint.setAntiAlias(true);
                textpaint.setColor(-1);
                textpaint.setStrokeWidth(com.roidapp.photogrid.release.ng.a(1.0F, ng.l(a)));
                textpaint.setShadowLayer(com.roidapp.photogrid.release.ng.a(5F, ng.l(a)) / 2, 0.0F, 0.0F, Color.parseColor("#7b000000"));
                Object obj1 = new TextPaint();
                ((TextPaint) (obj1)).setTextSize(com.roidapp.photogrid.release.ng.a(15F, ng.l(a)));
                ((TextPaint) (obj1)).setAntiAlias(true);
                ((TextPaint) (obj1)).setColor(-1);
                ((TextPaint) (obj1)).setStrokeWidth(com.roidapp.photogrid.release.ng.a(1.0F, ng.l(a)));
                ((TextPaint) (obj1)).setShadowLayer(com.roidapp.photogrid.release.ng.a(5F, ng.l(a)) / 2, 0.0F, 0.0F, Color.parseColor("#7b000000"));
                Object obj2 = new Rect();
                textpaint.getTextBounds("\u3002.", 0, 2, ((Rect) (obj2)));
                int i1 = ((Rect) (obj2)).width();
                ((TextPaint) (obj1)).getTextBounds("\u3002.", 0, 2, ((Rect) (obj2)));
                int l1 = ((Rect) (obj2)).width();
                obj2 = new SpannableStringBuilder("PhotoGrid");
                ((SpannableStringBuilder) (obj2)).setSpan(new StyleSpan(0), 0, 5, 17);
                ((SpannableStringBuilder) (obj2)).setSpan(new StyleSpan(1), 5, ((SpannableStringBuilder) (obj2)).length(), 17);
                int k1 = (int)com.roidapp.photogrid.release.ng.a(((TextPaint) (obj1)), ((SpannableStringBuilder) (obj2)).toString()) + l1;
                int i2 = Math.round((float)l * 0.0594F);
                StaticLayout staticlayout = new StaticLayout(((CharSequence) (obj2)), ((TextPaint) (obj1)), k1, android.text.Layout.Alignment.ALIGN_NORMAL, 1.0F, 1.0F, true);
                obj2 = new SpannableStringBuilder(a.X);
                if (a.X.contains("Directed by ") && a.X.length() > 12)
                {
                    ((SpannableStringBuilder) (obj2)).setSpan(new StyleSpan(0), 0, 12, 17);
                    ((SpannableStringBuilder) (obj2)).setSpan(new StyleSpan(1), 12, a.X.length(), 17);
                }
                i1 = (int)com.roidapp.photogrid.release.ng.a(textpaint, a.X) + i1;
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
                    com.roidapp.photogrid.release.ng.a(a, null);
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
                staticlayout.draw(canvas1);
                canvas1.restore();
                float f2 = ((float)l - (float)(i1 - j2) * f1) / 2.0F;
                float f3 = (l - j1) / 2;
                obj1 = new Matrix();
                ((Matrix) (obj1)).postScale(f1, f1);
                ((Matrix) (obj1)).postTranslate(f2, f3);
                canvas.drawBitmap(((Bitmap) (obj2)), ((Matrix) (obj1)), null);
                com.roidapp.photogrid.release.ng.a(a, ((Bitmap) (obj)));
            }
            return com.roidapp.photogrid.release.ng.i(a);
        } else
        {
            return null;
        }
    }

    public final Bitmap f()
    {
        com.roidapp.photogrid.release.ng.a(a, a.j.getLayoutParams().width);
        ng.b(a, a.j.getLayoutParams().height);
        try
        {
            if (ng.m(a))
            {
                if (ng.n(a) != null && !ng.n(a).isRecycled())
                {
                    ng.n(a).recycle();
                }
                ng.b(a, null);
                ng.o(a);
            }
            if (ng.n(a) == null)
            {
                Object obj = a;
                com.roidapp.photogrid.release.rf.a();
                ng.b(((ng) (obj)), com.roidapp.photogrid.release.rf.a(ng.p(a), ng.q(a), android.graphics.Bitmap.Config.ARGB_8888));
                obj = new Canvas(ng.n(a));
                ((Canvas) (obj)).setDrawFilter(new PaintFlagsDrawFilter(0, 3));
                if (a.q != null)
                {
                    a.q.a(((Canvas) (obj)));
                } else
                {
                    ((Canvas) (obj)).drawColor(-1);
                }
            }
            return ng.n(a);
        }
        catch (OutOfMemoryError outofmemoryerror)
        {
            return null;
        }
    }

    public final u g()
    {
        return a.Z;
    }

    public final u[] h()
    {
        if (ng.c(a))
        {
            return null;
        }
        if (a.Y == null || a.Y != null && a.Y.length != d() - 1)
        {
            a.Y = new u[d() - 1];
            int l = 0;
            while (l < a.Y.length) 
            {
                if (a.Z != u.d)
                {
                    a.Y[l] = a.Z;
                } else
                {
                    a.Y[l] = u.values()[(int)((double)u.e.ordinal() + Math.random() * (double)(u.j.ordinal() - u.e.ordinal()) + 0.5D)];
                }
                l++;
            }
            ih.C().a(a.Y);
        }
        return a.Y;
    }

    public final boolean i()
    {
        Object obj = com.roidapp.photogrid.release.ng.a(a);
        obj;
        JVM INSTR monitorenter ;
        boolean flag;
        if (ng.b(a) == null)
        {
            break MISSING_BLOCK_LABEL_35;
        }
        flag = ng.b(a).d();
        return flag;
        obj;
        JVM INSTR monitorexit ;
        return true;
        Exception exception;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public final IFilterInfo j()
    {
        return a.aa;
    }

    public final int k()
    {
        return a.ab;
    }
}
