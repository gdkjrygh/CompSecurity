// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.os.AsyncTask;
import android.util.AttributeSet;
import android.view.View;
import java.util.ArrayList;

public final class isr extends View
    implements ipq, nxe, oiz
{

    private static njn m;
    private static nbj n;
    private static final Paint o = new Paint(2);
    private final Rect A;
    private final Paint B;
    private final Paint C;
    private final Path D;
    private boolean E;
    int a;
    int b;
    float c;
    isf d;
    njr e;
    int f;
    int g;
    boolean h;
    Paint i;
    Paint j;
    float k;
    isu l;
    private njt p;
    private AsyncTask q;
    private Bitmap r;
    private boolean s;
    private boolean t;
    private Rect u;
    private Rect v;
    private Rect w;
    private final Matrix x;
    private final Matrix y;
    private final Rect z;

    public isr(Context context)
    {
        this(context, null);
    }

    private isr(Context context, AttributeSet attributeset)
    {
        this(context, null, 0);
    }

    private isr(Context context, AttributeSet attributeset, int i1)
    {
        super(context, attributeset, 0);
        b = 0;
        c = 0.0F;
        f = 5;
        u = new Rect();
        v = new Rect();
        h = false;
        i = new Paint(1);
        w = new Rect();
        j = new Paint(1);
        E = false;
        k = 1.0F;
        if (m == null)
        {
            m = (njn)olm.a(context, njn);
            n = (nbj)olm.a(context, nbj);
        }
        i.setStyle(android.graphics.Paint.Style.STROKE);
        x = new Matrix();
        y = new Matrix();
        z = new Rect();
        A = new Rect();
        B = new Paint();
        C = new Paint();
        D = new Path();
    }

    static AsyncTask a(isr isr1)
    {
        return isr1.q;
    }

    private void a(Bitmap bitmap)
    {
        if (!e() || s)
        {
            return;
        }
        s = true;
        q = new ist(getContext(), this, a, b, d, c);
        if (android.os.Build.VERSION.SDK_INT >= 11)
        {
            q.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Bitmap[] {
                bitmap
            });
            return;
        } else
        {
            q.execute(new Bitmap[] {
                bitmap
            });
            return;
        }
    }

    static void a(Bitmap bitmap, Rect rect, Rect rect1)
    {
        b(bitmap, rect, rect1);
    }

    private void a(Canvas canvas)
    {
        if (r != null)
        {
            canvas.drawBitmap(r, u, v, o);
        } else
        {
            a(canvas, v, j);
        }
        if (h)
        {
            a(canvas, w, i);
        }
    }

    private void a(Canvas canvas, Matrix matrix, Rect rect, Paint paint)
    {
        canvas.save();
        canvas.concat(matrix);
        canvas.clipRect(rect, android.graphics.Region.Op.REPLACE);
        a(canvas);
        if (paint.getColor() != 0)
        {
            canvas.drawPath(D, paint);
        }
        canvas.restore();
    }

    private void a(Canvas canvas, Rect rect, Paint paint)
    {
        if (a == 1)
        {
            canvas.drawCircle(rect.centerX(), rect.centerY(), (float)Math.min(rect.width(), rect.height()) / 2.0F, paint);
            return;
        } else
        {
            canvas.drawRect(rect, paint);
            return;
        }
    }

    static void a(isr isr1, Bitmap bitmap)
    {
        isr1.r = bitmap;
        isr1.t = true;
        b(isr1.r, isr1.v, isr1.u);
        isr1.invalidate();
        isr1.f();
        isr1.postDelayed(new iss(isr1), 0L);
    }

    private static void b(Bitmap bitmap, Rect rect, Rect rect1)
    {
        int i1 = bitmap.getWidth();
        int j1 = bitmap.getHeight();
        int k1 = rect.width();
        int j2 = rect.height();
        float f1 = (float)i1 / (float)j1;
        float f2 = (float)k1 / (float)j2;
        if (f1 > f2)
        {
            int l1 = (i1 - (int)(f2 * (float)j1)) / 2;
            rect1.set(l1, 0, i1 - l1, j1);
            return;
        } else
        {
            int i2 = (int)((float)i1 / f2);
            j1 = Math.max((int)((float)j1 * 0.4F) - i2 / 2, 0);
            rect1.set(0, j1, i1, i2 + j1);
            return;
        }
    }

    static nbj d()
    {
        return n;
    }

    private boolean e()
    {
        return a != 0 || b != 0 || d != null || c > 0.0F;
    }

    private void f()
    {
        if (l != null)
        {
            l.a();
        }
    }

    public final void a(nxb nxb1)
    {
        if (nxb1.i == 1)
        {
            s = false;
            if (!e())
            {
                r = ((njt)nxb1).i();
                f();
                b(r, v, u);
                invalidate();
            } else
            if (getMeasuredHeight() > 0 && getMeasuredWidth() > 0)
            {
                a(((njt)nxb1).i());
                return;
            }
        }
    }

    public final void aw_()
    {
        E = false;
    }

    public final void ax_()
    {
        c();
        if (t)
        {
            n.a(r);
            t = false;
        }
        r = null;
        E = false;
        setMeasuredDimension(0, 0);
        b = 0;
        c = 0.0F;
        l = null;
    }

    public final void b()
    {
        if (p != null)
        {
            return;
        } else
        {
            p = m.a(e, f, getWidth(), getHeight(), null, g, this);
            return;
        }
    }

    public final void c()
    {
        if (p == null) goto _L2; else goto _L1
_L1:
        njt njt1;
        njt1 = p;
        b.u();
        njt1.r();
        if (((nxb) (njt1)).n != this || ((nxb) (njt1)).o != null && (((nxb) (njt1)).o == null || !((nxb) (njt1)).o.equals(null))) goto _L4; else goto _L3
_L3:
        njt1.n = null;
        njt1.o = null;
        ((nxb) (njt1)).f.b(njt1);
_L6:
        p = null;
_L2:
        if (q != null)
        {
            q.cancel(true);
            q = null;
        }
        return;
_L4:
        int i1;
        int j1;
        if (((nxb) (njt1)).p == null)
        {
            continue; /* Loop/switch isn't completed */
        }
        j1 = ((nxb) (njt1)).p.size();
        i1 = 0;
_L7:
label0:
        {
            if (i1 < j1)
            {
                if (!((nxc)((nxb) (njt1)).p.get(i1)).a(this, null))
                {
                    break label0;
                }
                ((nxb) (njt1)).p.remove(i1);
            }
            if (((nxb) (njt1)).p.isEmpty())
            {
                ((nxb) (njt1)).f.b(njt1);
            }
        }
        if (true) goto _L6; else goto _L5
_L5:
        i1++;
          goto _L7
        if (true) goto _L6; else goto _L8
_L8:
    }

    protected final void onAttachedToWindow()
    {
        super.onAttachedToWindow();
        b();
    }

    protected final void onDetachedFromWindow()
    {
        super.onDetachedFromWindow();
        c();
    }

    protected final void onDraw(Canvas canvas)
    {
        if (E)
        {
            a(canvas, x, A, C);
            a(canvas, y, z, B);
            return;
        } else
        {
            a(canvas);
            return;
        }
    }

    protected final void onMeasure(int i1, int j1)
    {
        super.onMeasure(i1, j1);
        v.set(0, 0, getMeasuredWidth(), getMeasuredHeight());
        if (h)
        {
            i1 = (int)i.getStrokeWidth() / 2;
            w.set(v.left + i1, v.top + i1, v.right - i1, v.bottom - i1);
        }
        if (r == null && p != null && e() && ((nxb) (p)).i == 1)
        {
            a(p.i());
        }
        if (r != null)
        {
            b(r, v, u);
        }
        D.reset();
        D.addCircle(v.centerX(), v.centerY(), (float)Math.min(v.width(), v.height()) / 2.0F, android.graphics.Path.Direction.CW);
    }

    public final void setVerticalFold(float f1)
    {
        k = f1;
        float f2 = f1;
        if (f1 == 0.0F)
        {
            f2 = 0.01F;
        }
        E = true;
        float f3;
        float f4;
        float f5;
        float af[];
        float af1[];
        int i1;
        int j1;
        int k1;
        if (f2 > 1.0F)
        {
            B.setColor(Color.argb((int)((f2 - 1.0F) * 255F * 0.8F), 0, 0, 0));
            C.setColor(0);
        } else
        {
            B.setColor(0);
            C.setColor(Color.argb((int)((1.0F - f2) * 255F * 0.8F), 0, 0, 0));
        }
        i1 = getMeasuredWidth();
        j1 = getMeasuredHeight();
        k1 = (int)((float)j1 * 0.25F);
        f3 = (float)i1 / 2.0F;
        f4 = -((float)k1 * (1.0F - f2));
        f5 = (float)j1 + (float)k1 * (1.0F - f2);
        if (f2 < 1.0F)
        {
            f1 = (1.0F - f2) * f3;
        } else
        {
            f1 = (f2 - 1.0F) * f3;
        }
        af = new float[8];
        af[0] = 0.0F;
        af[1] = j1;
        af[2] = 0.0F;
        af[3] = 0.0F;
        af[4] = f3;
        af[5] = j1;
        af[6] = f3;
        af[7] = 0.0F;
        af1 = new float[8];
        af1[0] = f1;
        af1[1] = f5;
        af1[2] = f1;
        af1[3] = f4;
        af1[4] = f3;
        af1[5] = j1;
        af1[6] = f3;
        af1[7] = 0.0F;
        x.setPolyToPoly(af, 0, af1, 0, 4);
        A.set(0, 0, (int)f3, j1);
        if (f2 < 1.0F)
        {
            f1 = (1.0F + f2) * f3;
        } else
        {
            f1 = (3F - f2) * f3;
        }
        af[0] = f3;
        af[1] = j1;
        af[2] = f3;
        af[3] = 0.0F;
        af[4] = i1;
        af[5] = j1;
        af[6] = i1;
        af[7] = 0.0F;
        af1[0] = f3;
        af1[1] = j1;
        af1[2] = f3;
        af1[3] = 0.0F;
        af1[4] = f1;
        af1[5] = f5;
        af1[6] = f1;
        af1[7] = f4;
        y.setPolyToPoly(af, 0, af1, 0, 4);
        z.set((int)f3, 0, i1, j1);
        invalidate(0, -k1, i1, j1 + k1);
    }

}
