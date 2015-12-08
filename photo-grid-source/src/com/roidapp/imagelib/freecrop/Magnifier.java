// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.imagelib.freecrop;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.View;
import com.roidapp.imagelib.d;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

// Referenced classes of package com.roidapp.imagelib.freecrop:
//            l, c

public class Magnifier extends View
{

    private int a;
    private int b;
    private int c;
    private int d;
    private float e;
    private RectF f;
    private RectF g;
    private Path h;
    private Bitmap i;
    private Rect j;
    private int k;
    private int l;
    private Rect m;
    private l n;
    private Paint o;
    private Paint p;
    private Paint q;
    private c r;
    private Path s;
    private Matrix t;
    private boolean u;
    private int v;
    private int w;
    private int x;

    public Magnifier(Context context)
    {
        super(context);
        if (android.os.Build.VERSION.SDK_INT >= 11)
        {
            try
            {
                getClass().getMethod("setLayerType", new Class[] {
                    Integer.TYPE, android/graphics/Paint
                }).invoke(this, new Object[] {
                    Integer.valueOf(1), null
                });
            }
            catch (NoSuchMethodException nosuchmethodexception) { }
            catch (IllegalArgumentException illegalargumentexception) { }
            catch (IllegalAccessException illegalaccessexception) { }
            catch (InvocationTargetException invocationtargetexception) { }
            catch (UnsupportedOperationException unsupportedoperationexception)
            {
                unsupportedoperationexception.printStackTrace();
            }
        }
        context = context.getResources().getDisplayMetrics();
        a = ((DisplayMetrics) (context)).widthPixels;
        b = ((DisplayMetrics) (context)).heightPixels;
        b();
    }

    public Magnifier(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        if (android.os.Build.VERSION.SDK_INT >= 11)
        {
            try
            {
                getClass().getMethod("setLayerType", new Class[] {
                    Integer.TYPE, android/graphics/Paint
                }).invoke(this, new Object[] {
                    Integer.valueOf(1), null
                });
            }
            // Misplaced declaration of an exception variable
            catch (AttributeSet attributeset) { }
            // Misplaced declaration of an exception variable
            catch (AttributeSet attributeset) { }
            // Misplaced declaration of an exception variable
            catch (AttributeSet attributeset) { }
            // Misplaced declaration of an exception variable
            catch (AttributeSet attributeset) { }
            // Misplaced declaration of an exception variable
            catch (AttributeSet attributeset)
            {
                attributeset.printStackTrace();
            }
        }
        context = context.getResources().getDisplayMetrics();
        a = ((DisplayMetrics) (context)).widthPixels;
        b = ((DisplayMetrics) (context)).heightPixels;
        b();
    }

    private void b()
    {
        c = Math.round((float)a * 0.15F);
        f = new RectF(0.0F, 0.0F, c * 2, c * 2);
        g = new RectF(0.0F, 0.0F, (float)(c * 2) + 5F, (float)(c * 2) + 5F);
        h = new Path();
        h.addRect(f, android.graphics.Path.Direction.CW);
        j = new Rect();
        o = new Paint();
        int i1 = getResources().getColor(d.a);
        o.setColor(i1);
        o.setStrokeWidth(4F);
        o.setStyle(android.graphics.Paint.Style.STROKE);
        o.setAntiAlias(true);
        p = new Paint();
        p.setARGB(125, 50, 50, 50);
        p.setAntiAlias(true);
        q = new Paint();
        q.setARGB(255, 255, 255, 255);
        q.setAntiAlias(true);
        q.setStyle(android.graphics.Paint.Style.STROKE);
        q.setStrokeWidth(5F);
        s = new Path();
        t = new Matrix();
        d = (int)((float)(c * 2) * 2.0F);
        v = c * 2;
        w = c * 2;
        setBackgroundColor(0xff000000);
    }

    public final int a()
    {
        return c * 2 + 5;
    }

    public final void a(PointF pointf)
    {
        j.left = (int)(pointf.x - (float)c);
        j.right = (int)(pointf.x + (float)c);
        j.top = (int)(pointf.y - (float)c);
        j.bottom = (int)(pointf.y + (float)c);
    }

    public final void a(c c1)
    {
        r = c1;
    }

    public final void a(l l1)
    {
        n = l1;
        if (n != null)
        {
            t.setScale(1.0F / n.n(), 1.0F / n.n());
            i = n.e();
            k = i.getWidth();
            l = i.getHeight();
            x = Math.min(k, l);
            if ((float)x / (float)(c * 2) < 2.0F)
            {
                e = (float)d / (float)x;
            } else
            {
                e = 1.0F;
            }
            m = new Rect(0, 0, Math.round((float)k * e), Math.round((float)l * e));
        }
    }

    public final void a(boolean flag)
    {
        u = flag;
    }

    protected void onDraw(Canvas canvas)
    {
        super.onDraw(canvas);
        if (i != null && !i.isRecycled())
        {
            canvas.save();
            canvas.scale(e, e, (float)v / 2.0F, (float)w / 2.0F);
            canvas.drawBitmap(i, -j.left, -j.top, null);
            canvas.restore();
        }
        if (r != null && r.i() != 0)
        {
            canvas.save();
            canvas.scale(e, e, (float)v / 2.0F, (float)w / 2.0F);
            canvas.translate(-j.left, -j.top);
            float af[] = r.e();
            r.transform(t, s);
            if (u)
            {
                canvas.save();
                canvas.clipPath(s, android.graphics.Region.Op.DIFFERENCE);
                p.setStrokeWidth(4F / e);
                p.setAntiAlias(true);
                canvas.drawRect(m, p);
                canvas.restore();
            }
            o.setColor(0xffff0000);
            o.setStrokeWidth(4F / e);
            canvas.drawCircle(af[0], af[1], 4F / e, o);
            int i1 = getResources().getColor(d.a);
            o.setColor(i1);
            canvas.drawPath(s, o);
            canvas.restore();
        }
        canvas.drawRect(g, q);
    }
}
