// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Property;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import java.util.concurrent.Executor;

public class dbq extends View
    implements mmm
{

    private static final Property D = new dbr(java/lang/Float, "posterAlpha");
    private static final String l = dbq.getSimpleName();
    private int A;
    private boolean B;
    private boolean C;
    public crx a;
    public mml b;
    public del c;
    public int d;
    public String e;
    public int f;
    public csb g;
    public csb h;
    public int i;
    boolean j;
    Drawable k;
    private final ObjectAnimator m;
    private final Paint n;
    private final Paint o;
    private final TextPaint p;
    private final int q;
    private final int r;
    private final int s;
    private final int t;
    private dbs u;
    private Drawable v;
    private float w;
    private float x;
    private Matrix y;
    private Matrix z;

    public dbq(Context context)
    {
        this(context, null);
    }

    public dbq(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public dbq(Context context, AttributeSet attributeset, int i1)
    {
        super(context, attributeset, i1);
        n = new Paint(1);
        o = new Paint();
        e = "";
        f = 0;
        w = 1.0F;
        x = -1F;
        y = new Matrix();
        z = new Matrix();
        A = 0;
        B = false;
        j = false;
        C = false;
        if (b.f())
        {
            b = (mml)olm.a(context, mml);
        }
        attributeset = context.obtainStyledAttributes(attributeset, bhx.j, i1, 0);
        A = attributeset.getInt(bhx.k, 0);
        b.a(A, "anchorEdge", 0, 4, "must be valid edge");
        attributeset.recycle();
        context = context.getResources();
        attributeset = new TextPaint();
        attributeset.setAntiAlias(true);
        attributeset.setColor(context.getColor(b.dt));
        attributeset.setTextSize(context.getDimension(b.dO));
        attributeset.setTypeface(Typeface.DEFAULT_BOLD);
        i1 = context.getDimensionPixelSize(b.dw);
        int j1 = context.getDimensionPixelSize(b.du);
        int k1 = context.getDimensionPixelSize(b.dv);
        int l1 = context.getColor(b.cp);
        attributeset.setShadowLayer(i1, j1, k1, l1);
        p = attributeset;
        q = context.getColor(b.dm);
        r = context.getDimensionPixelSize(b.dG);
        s = context.getDimensionPixelSize(b.dG);
        attributeset = BitmapFactory.decodeResource(context, b.ff);
        i1 = context.getDimensionPixelSize(b.dx);
        Object obj = new RadialGradient(i1, i1, i1, context.getColor(b.cq), 0, android.graphics.Shader.TileMode.CLAMP);
        Paint paint = new Paint();
        paint.setShader(((android.graphics.Shader) (obj)));
        j1 = i1 * 2;
        obj = Bitmap.createBitmap(j1, j1, android.graphics.Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(((Bitmap) (obj)));
        canvas.drawCircle(i1, i1, i1, paint);
        canvas.drawBitmap(attributeset, (j1 - attributeset.getWidth()) / 2, (j1 - attributeset.getHeight()) / 2, null);
        v = new BitmapDrawable(context, ((Bitmap) (obj)));
        t = ((mmr)olm.a(getContext(), mmr)).d();
        m = czx.a();
        m.setTarget(this);
        m.setProperty(D);
        m.setFloatValues(new float[] {
            0.0F, 1.0F
        });
        m.setDuration(1000L);
        n.setTextSize(context.getDimension(b.dy));
        n.setFilterBitmap(true);
        o.setStyle(android.graphics.Paint.Style.STROKE);
        o.setColor(-1);
        i = 255;
    }

    static float a(dbq dbq1, float f1)
    {
        dbq1.w = f1;
        return f1;
    }

    static crx a(dbq dbq1)
    {
        return dbq1.a;
    }

    static dbs a(dbq dbq1, dbs dbs1)
    {
        dbq1.u = null;
        return null;
    }

    private void a(csb csb1)
    {
        if (g != null)
        {
            g.b();
        }
        g = csb1;
    }

    static dbs b(dbq dbq1)
    {
        return dbq1.u;
    }

    private void b(csb csb1)
    {
        if (h != null)
        {
            h.b();
        }
        h = csb1;
    }

    static float c(dbq dbq1)
    {
        return dbq1.w;
    }

    private void d()
    {
        a(((csb) (null)));
        b(((csb) (null)));
        y.reset();
        z.reset();
        e = "";
        f = 0;
        invalidate();
        a(false);
        b(false);
        c(false);
        m.end();
        w = 1.0F;
        if (u != null)
        {
            u.cancel(true);
            u = null;
        }
    }

    private int e()
    {
        return getWidth() - getPaddingLeft() - getPaddingRight();
    }

    private int f()
    {
        return getHeight() - getPaddingBottom() - getPaddingTop();
    }

    public final jz a()
    {
        boolean flag = true;
        Resources resources = getResources();
        jz jz1 = new jz();
        if (c.d.d)
        {
            jz1.put(Integer.valueOf(b.fC), resources.getString(c.V));
            del del1 = c;
            int i1 = d;
            das das1 = del1.a;
            if (1 != del1.a.a(i1))
            {
                flag = false;
            }
            if (flag)
            {
                jz1.put(Integer.valueOf(b.fD), resources.getString(c.W));
            }
            return jz1;
        } else
        {
            jz1.put(Integer.valueOf(b.fE), resources.getString(c.X));
            return jz1;
        }
    }

    public void a(Bitmap bitmap, Matrix matrix)
    {
        int i1;
        int j1;
        int k1;
        int l1;
label0:
        {
            int i2 = bitmap.getWidth();
            i1 = bitmap.getHeight();
            k1 = e();
            l1 = f();
            if (l1 <= 0 || k1 <= 0)
            {
                return;
            }
            if (i1 > 0)
            {
                j1 = i2;
                if (i2 > 0)
                {
                    break label0;
                }
            }
            i1 = l1;
            j1 = k1;
        }
        float f1 = Math.max((float)k1 / (float)j1, (float)l1 / (float)i1);
        j1 = (int)((float)j1 * f1);
        i1 = (int)((float)i1 * f1);
        matrix.reset();
        matrix.postScale(f1, f1);
        if (A == 2)
        {
            matrix.postTranslate((int)((float)(k1 - j1) * 0.5F + 0.5F), 0.0F);
            return;
        }
        if (A == 4)
        {
            matrix.postTranslate((int)((float)(k1 - j1) * 0.5F + 0.5F), l1 - i1);
            return;
        }
        if (A == 1)
        {
            matrix.postTranslate(0.0F, (int)((float)(l1 - i1) * 0.5F + 0.5F));
            return;
        }
        if (A == 3)
        {
            matrix.postTranslate(k1 - j1, (int)((float)(l1 - i1) * 0.5F + 0.5F));
            return;
        } else
        {
            matrix.postTranslate((int)((float)(k1 - j1) * 0.5F + 0.5F), (int)((float)(l1 - i1) * 0.5F + 0.5F));
            return;
        }
    }

    public final void a(csb csb1, boolean flag)
    {
        a(csb1);
        if (g != null)
        {
            if (flag)
            {
                m.start();
            }
            a(g.d(), y);
            invalidate();
        }
    }

    public final void a(boolean flag)
    {
        if (j)
        {
            j = false;
            invalidate();
        }
    }

    public final boolean a(int i1)
    {
        if (i1 == b.fE)
        {
            del del1 = c;
            i1 = d;
            del1.f = del1.a.a(i1);
            dem dem1 = del1.e;
            CharSequence charsequence = del1.b;
            if (android.os.Build.VERSION.SDK_INT >= 16)
            {
                if (android.os.Build.VERSION.SDK_INT < 19)
                {
                    dem1.a.announceForAccessibility(charsequence);
                } else
                {
                    dem1.a.setContentDescription("");
                    dem1.a.setContentDescription(charsequence);
                }
            }
            del1.d.d = true;
            return true;
        }
        if (i1 == b.fD)
        {
            del del2 = c;
            den den1 = del2.c;
            i1 = del2.f;
            das das1 = del2.a;
            den1.a(i1, 1);
            del2.d.d = false;
            return true;
        }
        if (i1 == b.fC)
        {
            del del3 = c;
            i1 = d;
            int j1 = del3.a.a(i1);
            i1 = j1;
            if (del3.f > j1)
            {
                i1 = j1 + 1;
            }
            del3.c.a(del3.f, i1);
            del3.d.d = false;
            return true;
        } else
        {
            return false;
        }
    }

    public final boolean a(Executor executor, coa coa1, int i1, int j1)
    {
        c.a(a, "mPosterStore", "call setPosterStore before setDisplayableFrame");
        b.a(executor, "executor", null);
        b.a(coa1, "displayableFrame", null);
        b.a(i1, "targetWidth", null);
        b.a(j1, "targetHeight", null);
        float f1;
        Object obj;
        int k1;
        boolean flag;
        if (i1 == 0 || j1 == 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        b.a(flag, "one of target width/height must be unspecified");
        d();
        obj = coa1.a.b();
        if (((coi) (obj)).a != -1)
        {
            k1 = ((coi) (obj)).a;
        } else
        {
            k1 = 0;
        }
        f1 = csc.a(k1, ((coi) (obj)).c, ((coi) (obj)).d);
        if (f1 != x)
        {
            x = f1;
            requestLayout();
        }
        obj = a.a(coa1, i1, j1);
        if (obj != null)
        {
            a(((csb) (obj)), false);
            return true;
        }
        obj = (csb)a.a.a(coa1);
        if (obj != null)
        {
            b(((csb) (obj)));
            a(h.d(), z);
            invalidate();
        }
        if (coa1.b)
        {
            u = new dbs(this, t, coa1, i1, j1);
            u.executeOnExecutor(executor, new Void[0]);
        }
        return false;
    }

    public final String b()
    {
        return Integer.toString(d);
    }

    public final void b(boolean flag)
    {
        if (C != flag)
        {
            C = flag;
            invalidate();
        }
    }

    public final void c()
    {
        if (g != null)
        {
            a(g.d(), y);
        }
        if (h != null)
        {
            a(h.d(), z);
        }
        invalidate();
    }

    public final void c(boolean flag)
    {
        if (B != flag)
        {
            B = flag;
            invalidate();
        }
    }

    public void finalize()
    {
        if (g != null || h != null)
        {
            Log.e(l, "ViewPosterView finalized before clear(). Poster bitmaps will be leaked!");
        }
        super.finalize();
    }

    public void onDetachedFromWindow()
    {
        d();
        if (b.f() && b != null)
        {
            b.a(this);
        }
        super.onDetachedFromWindow();
    }

    protected void onDraw(Canvas canvas)
    {
        if (j)
        {
            int i1 = getResources().getDimensionPixelSize(b.dD);
            int k1 = getPaddingLeft();
            int i2 = getPaddingTop();
            int l2 = e();
            int k3 = f();
            k.setBounds(k1, i2, l2, k3);
            k.draw(canvas);
            canvas.clipRect(k1 + i1, i2 + i1, l2 - i1, k3 - i1);
            break MISSING_BLOCK_LABEL_91;
        } else
        {
            if (C)
            {
                j1 = getResources().getDimensionPixelSize(b.dC);
                l1 = getPaddingLeft();
                int j2 = getPaddingTop();
                int i3 = e();
                int l3 = f();
                o.setStrokeWidth(j1);
                canvas.drawRect(l1, j2, i3, l3, o);
                canvas.clipRect(l1 + j1, j2 + j1, i3 - j1, l3 - j1);
            }
            continue;
        }
        do
        {
            canvas.save();
            int j1 = getScrollX();
            int l1 = getScrollY();
            canvas.clipRect(getPaddingLeft() + j1, getPaddingTop() + l1, (j1 + getWidth()) - getPaddingRight(), (l1 + getHeight()) - getPaddingBottom());
            canvas.translate(getPaddingLeft(), getPaddingTop());
            if (B)
            {
                n.setColor(q);
                canvas.drawRect(0.0F, 0.0F, e(), f(), n);
            } else
            {
                if (w < 1.0F || g == null)
                {
                    if (h != null)
                    {
                        n.setColor(-1);
                        canvas.drawBitmap(h.d(), z, n);
                    } else
                    {
                        n.setColor(q);
                        canvas.drawRect(0.0F, 0.0F, e(), f(), n);
                    }
                }
                if (g != null)
                {
                    n.setColor(-1);
                    n.setAlpha((int)(w * 255F));
                    canvas.drawBitmap(g.d(), y, n);
                }
            }
            canvas.restore();
            switch (f)
            {
            case 0: // '\0'
            case 2: // '\002'
            default:
                return;

            case 1: // '\001'
                j1 = v.getIntrinsicWidth();
                break;
            }
            l1 = v.getIntrinsicHeight();
            int k2 = getWidth() - j1 - getPaddingRight() - r;
            int j3 = getPaddingTop() + l1 + r;
            v.setAlpha(i);
            v.setBounds(k2, j3 - l1, j1 + k2, j3);
            v.draw(canvas);
            Rect rect = new Rect();
            p.getTextBounds(e, 0, e.length(), rect);
            float f1 = (p.descent() - p.ascent()) / 2.0F;
            float f2 = p.descent();
            float f3 = p.measureText(e);
            float f4 = getWidth() - v.getMinimumWidth() - s;
            float f5 = v.getMinimumHeight() / 2;
            float f6 = r;
            canvas.drawText(e, f4 - f3, (f1 - f2) + f5 + f6, p);
            return;
        } while (true);
    }

    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilitynodeinfo)
    {
        super.onInitializeAccessibilityNodeInfo(accessibilitynodeinfo);
        if (!b.f())
        {
            jz jz1 = a();
            for (int i1 = 0; i1 < jz1.size(); i1++)
            {
                accessibilitynodeinfo.addAction(new android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction(((Integer)jz1.b(i1)).intValue(), (CharSequence)jz1.c(i1)));
            }

        }
    }

    protected void onLayout(boolean flag, int i1, int j1, int k1, int l1)
    {
        super.onLayout(flag, i1, j1, k1, l1);
        c();
    }

    protected void onMeasure(int i1, int j1)
    {
        int k2 = android.view.View.MeasureSpec.getMode(j1);
        int j2 = android.view.View.MeasureSpec.getMode(i1);
        if (x <= 0.0F || k2 == 0x40000000 && j2 == 0x40000000)
        {
            super.onMeasure(i1, j1);
            return;
        }
        int l1 = android.view.View.MeasureSpec.getSize(j1);
        int k1 = android.view.View.MeasureSpec.getSize(i1);
        int i2 = getPaddingLeft() + getPaddingRight();
        int l2 = getPaddingTop() + getPaddingBottom();
        if (k2 != 0x40000000)
        {
            l1 = getMinimumHeight();
            l1 = Math.max((int)((float)(k1 - i2) / x) + l2, l1);
        } else
        {
            k1 = getMinimumWidth();
            k1 = Math.max((int)((float)(l1 - l2) * x) + i2, k1);
        }
        i2 = l1;
        if (k2 == 0x80000000)
        {
            i2 = Math.min(l1, android.view.View.MeasureSpec.getSize(j1));
        }
        j1 = k1;
        if (j2 == 0x80000000)
        {
            j1 = Math.min(k1, android.view.View.MeasureSpec.getSize(i1));
        }
        setMeasuredDimension(j1, i2);
    }

    public boolean performAccessibilityAction(int i1, Bundle bundle)
    {
        return a(i1) || super.performAccessibilityAction(i1, bundle);
    }

}
