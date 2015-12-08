// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package io.card.payment;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Point;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import com.paypal.android.sdk.gt;
import com.paypal.android.sdk.gu;
import java.lang.ref.WeakReference;

// Referenced classes of package io.card.payment:
//            t, k, u, e, 
//            CreditCard, CardIOActivity

class r extends View
{

    private static final String a = io/card/payment/r.getSimpleName();
    private static final android.graphics.drawable.GradientDrawable.Orientation b[];
    private final WeakReference c;
    private e d;
    private Bitmap e;
    private Rect f;
    private CreditCard g;
    private int h;
    private int i;
    private boolean j;
    private String k;
    private GradientDrawable l;
    private final Paint m = new Paint(1);
    private final Paint n = new Paint(1);
    private Path o;
    private Rect p;
    private final t q;
    private final k r;
    private Rect s;
    private Rect t;
    private final boolean u;
    private int v;
    private float w;

    public r(CardIOActivity cardioactivity, AttributeSet attributeset, boolean flag)
    {
        super(cardioactivity, null);
        j = false;
        w = 1.0F;
        u = flag;
        c = new WeakReference(cardioactivity);
        v = 1;
        w = getResources().getDisplayMetrics().density / 1.5F;
        q = new t(70F * w, 50F * w);
        r = new k(cardioactivity);
        n.clearShadowLayer();
        n.setStyle(android.graphics.Paint.Style.FILL);
        n.setColor(0xbb000000);
        k = gt.a(gu.l);
    }

    private Rect a(int i1, int j1, int k1, int l1)
    {
        int i2 = (int)(8F * w);
        Rect rect = new Rect();
        rect.left = Math.min(i1, k1) - i2;
        rect.right = Math.max(i1, k1) + i2;
        rect.top = Math.min(j1, l1) - i2;
        rect.bottom = i2 + Math.max(j1, l1);
        return rect;
    }

    public final Bitmap a()
    {
        return e;
    }

    public final void a(int i1)
    {
        i = i1;
    }

    public final void a(Bitmap bitmap)
    {
        if (e != null)
        {
            e.recycle();
        }
        e = bitmap;
        if (e != null)
        {
            Object obj = new RectF(2.0F, 2.0F, e.getWidth() - 2, e.getHeight() - 2);
            float f1 = (float)e.getHeight() * 0.06666667F;
            bitmap = Bitmap.createBitmap(e.getWidth(), e.getHeight(), android.graphics.Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(bitmap);
            canvas.drawColor(0);
            Paint paint = new Paint(1);
            paint.setColor(0xff000000);
            paint.setStyle(android.graphics.Paint.Style.FILL);
            canvas.drawRoundRect(((RectF) (obj)), f1, f1, paint);
            obj = new Paint();
            ((Paint) (obj)).setFilterBitmap(false);
            canvas = new Canvas(e);
            ((Paint) (obj)).setXfermode(new PorterDuffXfermode(android.graphics.PorterDuff.Mode.DST_IN));
            canvas.drawBitmap(bitmap, 0.0F, 0.0F, ((Paint) (obj)));
            ((Paint) (obj)).setXfermode(null);
            bitmap.recycle();
        }
    }

    public final void a(Rect rect)
    {
        p = rect;
    }

    public final void a(Rect rect, int i1)
    {
        (new StringBuilder("setGuideAndRotation: ")).append(rect).append(", ").append(i1);
        h = i1;
        f = rect;
        invalidate();
        if (h % 180 != 0)
        {
            rect = new Point((int)(w * 40F), (int)(w * 60F));
            v = -1;
        } else
        {
            rect = new Point((int)(w * 60F), (int)(w * 40F));
            v = 1;
        }
        if (p != null)
        {
            (new StringBuilder()).append(p).append(", ").append(rect).append(", ").append(p).append(", ").append(rect);
            s = io.card.payment.u.a(new Point(p.left + ((Point) (rect)).x, p.top + ((Point) (rect)).y), (int)(70F * w), (int)(w * 50F));
            i1 = p.right;
            int j1 = ((Point) (rect)).x;
            int k1 = p.top;
            t = io.card.payment.u.a(new Point(i1 - j1, ((Point) (rect)).y + k1), (int)(100F * w), (int)(w * 50F));
            l = new GradientDrawable(b[(h / 90) % 4], new int[] {
                -1, 0xff000000
            });
            l.setGradientType(0);
            l.setBounds(f);
            l.setAlpha(50);
            o = new Path();
            o.addRect(new RectF(p), android.graphics.Path.Direction.CW);
            o.addRect(new RectF(f), android.graphics.Path.Direction.CCW);
        }
    }

    public final void a(CreditCard creditcard)
    {
        g = creditcard;
    }

    public final void a(e e1)
    {
        if (d != null)
        {
            e e2 = d;
            boolean flag;
            if (e1.b == e2.b && e1.c == e2.c && e1.d == e2.d && e1.e == e2.e)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            if (!flag)
            {
                invalidate();
            }
        }
        d = e1;
    }

    public final void a(String s1)
    {
        k = s1;
    }

    public final void a(boolean flag)
    {
        j = flag;
    }

    public final Bitmap b()
    {
        if (e != null && !e.isRecycled())
        {
            return Bitmap.createBitmap(e, 0, 0, e.getWidth(), e.getHeight());
        } else
        {
            return null;
        }
    }

    public final void b(boolean flag)
    {
        q.a(flag);
        invalidate();
    }

    public final void c()
    {
        int i1 = 0;
        if (e != null)
        {
            if (g.g)
            {
                Matrix matrix = new Matrix();
                matrix.setRotate(180F, e.getWidth() / 2, e.getHeight() / 2);
                e = Bitmap.createBitmap(e, 0, 0, e.getWidth(), e.getHeight(), matrix, false);
            }
            Canvas canvas = new Canvas(e);
            Paint paint = new Paint();
            io.card.payment.u.a(paint);
            paint.setTextSize(28F * w);
            int j1 = g.a.length();
            float f1 = (float)e.getWidth() / 428F;
            int k1 = (int)((float)g.h * f1 - 6F);
            while (i1 < j1) 
            {
                int l1 = (int)((float)g.i[i1] * f1);
                canvas.drawText((new StringBuilder()).append(g.a.charAt(i1)).toString(), l1, k1, paint);
                i1++;
            }
        }
    }

    public final void c(boolean flag)
    {
        r.a(flag);
    }

    public void onDraw(Canvas canvas)
    {
        if (f != null && p != null)
        {
            canvas.save();
            l.draw(canvas);
            int i1;
            if (h == 0 || h == 180)
            {
                i1 = (f.bottom - f.top) / 4;
            } else
            {
                i1 = (f.right - f.left) / 4;
            }
            if (d != null && d.b() == 4)
            {
                canvas.drawPath(o, n);
            }
            m.clearShadowLayer();
            m.setStyle(android.graphics.Paint.Style.FILL);
            m.setColor(i);
            canvas.drawRect(a(f.left, f.top, f.left + i1, f.top), m);
            canvas.drawRect(a(f.left, f.top, f.left, f.top + i1), m);
            canvas.drawRect(a(f.right, f.top, f.right - i1, f.top), m);
            canvas.drawRect(a(f.right, f.top, f.right, f.top + i1), m);
            canvas.drawRect(a(f.left, f.bottom, f.left + i1, f.bottom), m);
            canvas.drawRect(a(f.left, f.bottom, f.left, f.bottom - i1), m);
            canvas.drawRect(a(f.right, f.bottom, f.right - i1, f.bottom), m);
            canvas.drawRect(a(f.right, f.bottom, f.right, f.bottom - i1), m);
            if (d != null)
            {
                if (d.b)
                {
                    canvas.drawRect(a(f.left, f.top, f.right, f.top), m);
                }
                if (d.c)
                {
                    canvas.drawRect(a(f.left, f.bottom, f.right, f.bottom), m);
                }
                if (d.d)
                {
                    canvas.drawRect(a(f.left, f.top, f.left, f.bottom), m);
                }
                if (d.e)
                {
                    canvas.drawRect(a(f.right, f.top, f.right, f.bottom), m);
                }
                if (d.b() < 3)
                {
                    float f2 = 34F * w;
                    float f1 = 26F * w;
                    io.card.payment.u.a(m);
                    m.setTextAlign(android.graphics.Paint.Align.CENTER);
                    m.setTextSize(f1);
                    canvas.translate(f.left + f.width() / 2, f.top + f.height() / 2);
                    canvas.rotate(v * h);
                    if (k != null && k != "")
                    {
                        String as[] = k.split("\n");
                        f1 = -(((float)(as.length - 1) * f2 - f1) / 2.0F) - 3F;
                        for (i1 = 0; i1 < as.length; i1++)
                        {
                            canvas.drawText(as[i1], 0.0F, f1, m);
                            f1 += f2;
                        }

                    }
                }
            }
            canvas.restore();
            if (!j)
            {
                canvas.save();
                canvas.translate(t.exactCenterX(), t.exactCenterY());
                canvas.rotate(v * h);
                r.a(canvas, 100F * w, 50F * w);
                canvas.restore();
            }
            if (u)
            {
                canvas.save();
                canvas.translate(s.exactCenterX(), s.exactCenterY());
                canvas.rotate(v * h);
                q.a(canvas);
                canvas.restore();
                return;
            }
        }
    }

    public boolean onTouchEvent(MotionEvent motionevent)
    {
label0:
        {
            if ((motionevent.getAction() & 0xff) != 0)
            {
                break label0;
            }
            motionevent = new Point((int)motionevent.getX(), (int)motionevent.getY());
            Rect rect = io.card.payment.u.a(motionevent, 20, 20);
            (new StringBuilder("onTouchEvent: ")).append(motionevent);
            if (u && s != null && Rect.intersects(s, rect))
            {
                ((CardIOActivity)c.get()).b();
                break label0;
            }
            try
            {
                if (t == null || !Rect.intersects(t, rect))
                {
                    ((CardIOActivity)c.get()).c();
                }
            }
            // Misplaced declaration of an exception variable
            catch (MotionEvent motionevent) { }
        }
        return false;
    }

    static 
    {
        b = (new android.graphics.drawable.GradientDrawable.Orientation[] {
            android.graphics.drawable.GradientDrawable.Orientation.TOP_BOTTOM, android.graphics.drawable.GradientDrawable.Orientation.LEFT_RIGHT, android.graphics.drawable.GradientDrawable.Orientation.BOTTOM_TOP, android.graphics.drawable.GradientDrawable.Orientation.RIGHT_LEFT
        });
    }
}
