// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public final class isw extends ViewGroup
    implements oiz
{

    public pfp a;
    public irq b;
    public isx c;
    Paint d;
    Paint e;
    Drawable f;
    boolean g;
    boolean h;
    int i;
    isc j;
    Paint k;
    SparseIntArray l;
    private Rect m;
    private Rect n;
    private Rect o;
    private RectF p;
    private Path q;

    public isw(Context context)
    {
        this(context, null);
    }

    private isw(Context context, AttributeSet attributeset)
    {
        this(context, null, 0);
    }

    private isw(Context context, AttributeSet attributeset, int i1)
    {
        super(context, attributeset, 0);
        m = new Rect();
        n = new Rect();
        o = new Rect();
        d = new Paint(1);
        e = new Paint(1);
        i = 0;
        p = new RectF();
        k = new Paint(1);
        l = new SparseIntArray();
        setWillNotDraw(false);
        setClipToPadding(false);
        setClipChildren(false);
    }

    public static void a(View view, int i1, int j1)
    {
        isb isb1;
        int k1;
        int l1;
        int i2;
        int j2;
        int k2;
        int l2;
        int i3;
        isb1 = isb.a(view);
        j2 = view.getPaddingTop();
        k2 = view.getPaddingLeft();
        i3 = view.getPaddingRight();
        l2 = view.getPaddingBottom();
        float f1;
        float f2;
        float f3;
        isb isb2;
        int j3;
        if (isb1.a.b != null && isb1.a.b.a != null && isb1.a.b.a.a != null)
        {
            k1 = 1;
        } else
        {
            k1 = 0;
        }
        if (k1 != 0)
        {
            k1 = isb1.b();
        } else
        {
            k1 = isb1.l();
        }
        if (isb1.a.b != null && isb1.a.b.a != null && isb1.a.b.a.b != null)
        {
            l1 = 1;
        } else
        {
            l1 = 0;
        }
        if (l1 != 0)
        {
            l1 = isb1.c();
        } else
        {
            l1 = isb1.k();
        }
        if (isb1.a.b != null && isb1.a.b.e != null)
        {
            i2 = 1;
        } else
        {
            i2 = 0;
        }
        if (i2 == 0) goto _L2; else goto _L1
_L1:
        view = (ViewGroup)view;
        if (isb1.a.b != null)
        {
            i2 = b.a(isb1.a.b.e);
        } else
        {
            i2 = 0;
        }
        view = view.getChildAt(i2);
        i2 = view.getPaddingTop();
        i3 = view.getPaddingLeft();
        j3 = view.getPaddingRight();
        l2 = view.getPaddingBottom();
        isb2 = isb.a(view);
        f1 = k1;
        f2 = isb2.c;
        f3 = isb1.h();
        k1 = (int)(f1 - ((float)(view.getMeasuredWidth() - i3 - j3) * f3 + f2));
        f1 = l1;
        f2 = isb2.b;
        f3 = isb1.i();
        l1 = (int)(f1 - (f2 + (float)(view.getMeasuredHeight() - i2 - l2) * f3));
_L13:
        isb1.a((k1 - k2) + i1, (l1 - j2) + j1);
        return;
_L2:
        i2 = (int)((float)k1 - isb1.h() * (float)(view.getMeasuredWidth() - k2 - i3));
        l1 = (int)((float)l1 - isb1.i() * (float)(view.getMeasuredHeight() - j2 - l2));
        l2 = isb1.n();
        k1 = l1;
        if (!isb1.f()) goto _L4; else goto _L3
_L3:
        k1 = l1;
        if (!Gravity.isVertical(l2)) goto _L4; else goto _L5
_L5:
        i3 = isb1.g();
        k1 = l1;
        if (i3 <= view.getMeasuredHeight()) goto _L4; else goto _L6
_L6:
        l2 & 0x70;
        JVM INSTR tableswitch 80 80: default 516
    //                   80 579;
           goto _L7 _L8
_L7:
        k1 = l1;
_L4:
        if (!isb1.d() || !Gravity.isHorizontal(l2)) goto _L10; else goto _L9
_L9:
        l1 = isb1.e();
        l2 & 7;
        JVM INSTR tableswitch 1 1: default 568
    //                   1 594;
           goto _L10 _L11
_L10:
        l1 = k1;
        k1 = i2;
        continue; /* Loop/switch isn't completed */
_L8:
        k1 = l1 + (i3 - view.getMeasuredHeight());
          goto _L4
_L11:
        i2 = (l1 - view.getMeasuredWidth()) / 2 + i2;
        l1 = k1;
        k1 = i2;
        if (true) goto _L13; else goto _L12
_L12:
    }

    private boolean c()
    {
        return android.os.Build.VERSION.SDK_INT <= 10 || !isHardwareAccelerated() || android.os.Build.VERSION.SDK_INT >= 18;
    }

    public final void ax_()
    {
        f = null;
        j = null;
        k.reset();
        q = null;
        i = 0;
        h = false;
        for (int i1 = getChildCount() - 1; i1 >= 0; i1--)
        {
            View view = getChildAt(i1);
            pfp pfp1 = a.d[l.get(i1)];
            c.a(view, irq.a(pfp1));
        }

        removeAllViews();
        l.clear();
    }

    public final boolean b()
    {
        int k1 = getChildCount();
        int i1;
        boolean flag1;
        if (getBackground() != null)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        i1 = 0;
        while (i1 < k1) 
        {
            View view = getChildAt(i1);
            Object obj;
            boolean flag;
            int j1;
            if ((view instanceof isw) && !((isw)view).b())
            {
                flag = true;
            } else
            {
                flag = false;
            }
            obj = view.getTag(s.bZ);
            if ((obj == null || !((Boolean)obj).booleanValue()) && !flag)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            if (flag)
            {
                j1 = 0;
            } else
            {
                j1 = 4;
            }
            view.setVisibility(j1);
            if (flag)
            {
                flag1 = true;
            }
            i1++;
        }
        return flag1;
    }

    protected final void dispatchDraw(Canvas canvas)
    {
        if (q != null)
        {
            canvas.save(2);
            if (c())
            {
                canvas.clipPath(q, android.graphics.Region.Op.INTERSECT);
            } else
            {
                canvas.clipRect(p, android.graphics.Region.Op.INTERSECT);
            }
        }
        super.dispatchDraw(canvas);
        if (h)
        {
            canvas.drawCircle(o.centerX(), o.centerY(), (float)Math.min(o.width(), o.height()) / 2.0F, e);
        }
        if (q != null)
        {
            canvas.restore();
        }
        if (j != null)
        {
            int i1;
            if (c())
            {
                i1 = j.c;
            } else
            {
                i1 = 0;
            }
            canvas.drawRoundRect(p, i1, i1, k);
        }
    }

    protected final void onDraw(Canvas canvas)
    {
label0:
        {
            if (f != null)
            {
                f.setBounds(m);
                f.draw(canvas);
            }
            if (g)
            {
                if (i != 1)
                {
                    break label0;
                }
                canvas.drawCircle(n.centerX(), n.centerY(), (float)Math.min(n.width(), n.height()) / 2.0F, d);
            }
            return;
        }
        canvas.drawRect(n, d);
    }

    protected final void onLayout(boolean flag, int i1, int j1, int k1, int l1)
    {
        j1 = getChildCount();
        for (i1 = 0; i1 < j1; i1++)
        {
            View view = getChildAt(i1);
            isb isb1 = isb.a(view);
            k1 = isb1.c;
            l1 = isb1.b;
            view.layout(k1, l1, view.getMeasuredWidth() + k1, view.getMeasuredHeight() + l1);
        }

        b();
    }

    protected final void onMeasure(int i1, int j1)
    {
        isg isg1;
        Object obj;
        isb isb2;
        int k1;
        int l1;
        int k2;
        boolean flag;
        int i3;
        int j3;
        int k3;
        int l3;
        int i4;
        int k4;
        int l4;
        int i5;
        int j5;
        int k5;
        int l5;
        int i6;
        int k6;
        int l6;
        int i7;
        obj = isb.a(this);
        isg isg2;
        int j4;
        int j6;
        int j7;
        boolean flag1;
        boolean flag2;
        if (((isb) (obj)).a.b != null && ((isb) (obj)).a.b.n != 0x80000000)
        {
            k1 = ((isb) (obj)).a.b.n;
        } else
        {
            k1 = 0;
        }
        if (k1 == 1)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        isg1 = ((isb) (obj)).A();
        if (((isb) (obj)).x())
        {
            k1 = ((isb) (obj)).y().a;
        } else
        {
            k1 = 0;
        }
        j3 = k1 + isg1.c;
        k5 = k1 + isg1.b;
        i5 = k1 + isg1.d;
        j5 = k1 + isg1.e;
        l5 = android.view.View.MeasureSpec.getSize(i1);
        if (flag)
        {
            i3 = 0;
        } else
        {
            i3 = android.view.View.MeasureSpec.getSize(j1);
        }
        i6 = l5 - (k5 + i5);
        if (flag)
        {
            i1 = 0;
        } else
        {
            i1 = i3 - (j3 + j5);
        }
        k1 = 0;
        j6 = getChildCount();
        j4 = 0;
        l1 = j3;
        j1 = i1;
        i1 = j5;
        i4 = i5;
        l3 = k5;
        k3 = j3;
_L7:
        if (j4 >= j6)
        {
            break MISSING_BLOCK_LABEL_956;
        }
        obj = getChildAt(j4);
        isb2 = isb.a(((View) (obj)));
        l4 = isb2.l();
        if (isb2.a.b != null && isb2.a.b.f != null)
        {
            k2 = isb2.a(b.a(isb2.a.b.f.c, 0.0F));
        } else
        {
            k2 = 0;
        }
        k6 = isb2.k();
        l6 = isb2.m();
        isg2 = isb2.A();
        if (isb2.x())
        {
            k4 = isb2.y().a;
        } else
        {
            k4 = 0;
        }
        flag1 = b.a((Boolean)((View) (obj)).getTag(s.bP), false);
        flag2 = isb2.d();
        if (flag2)
        {
            k2 = isb2.e();
        } else
        {
            k2 = i6 - (l4 + k2);
        }
        i7 = isg2.b;
        j7 = isg2.d;
        if (flag2 || flag1)
        {
            l4 = 0x40000000;
        } else
        {
            l4 = 0x80000000;
        }
        i7 = android.view.View.MeasureSpec.makeMeasureSpec(k4 * 2 + (k2 + i7 + j7), l4);
        flag2 = isb2.f();
        if (flag2)
        {
            l4 = isb2.g();
        } else
        {
            l4 = j1 - (k6 + l6);
        }
        k6 = isg2.c;
        l6 = isg2.e;
        if (flag2 || flag1)
        {
            k2 = 0x40000000;
        } else
        if (flag)
        {
            k2 = 0;
        } else
        {
            k2 = 0x80000000;
        }
        ((View) (obj)).measure(i7, android.view.View.MeasureSpec.makeMeasureSpec(k4 * 2 + (l4 + k6 + l6), k2));
        k6 = ((View) (obj)).getMeasuredWidth();
        k4 = ((View) (obj)).getMeasuredHeight();
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_897;
        }
        i7 = ((View) (obj)).getMeasuredWidth();
        k2 = ((View) (obj)).getMeasuredHeight();
        l4 = ((View) (obj)).getPaddingTop();
        j1 = ((View) (obj)).getPaddingLeft();
        j7 = ((View) (obj)).getPaddingRight();
        l6 = ((View) (obj)).getPaddingBottom();
        i7 -= j7 + j1;
        l1 = (isb2.k() + l1) - l4;
        j1 = (isb2.l() + k5) - j1;
        if (!(obj instanceof TextView) || i7 >= i6) goto _L2; else goto _L1
_L1:
        ((TextView)obj).getGravity();
        JVM INSTR lookupswitch 3: default 612
    //                   3: 870
    //                   5: 886
    //                   17: 873;
           goto _L2 _L2 _L3 _L4
_L2:
        isb2.a(j1, l1);
        j1 = Math.round(l1 + l4 + (k2 - (l4 + l6)) + isb2.m());
        l4 = isb2.b;
        k2 = isb2.c;
        k4 = Math.max(k1, l4 + k4);
        k1 = j1 - j3;
        l1 = i1;
        i1 = k4;
_L5:
        k3 = Math.max(k3, Math.abs(Math.min(0, l4)));
        l3 = Math.max(l3, Math.abs(Math.min(0, k2)));
        i4 = Math.max(i4, Math.max(0, (k2 + k6) - l5));
        k4 = j4 + 1;
        k2 = l1;
        j4 = k1;
        k1 = i1;
        l1 = j1;
        j1 = j4;
        i1 = k2;
        j4 = k4;
        continue; /* Loop/switch isn't completed */
_L4:
        j1 = (i6 - i7) / 2 + j1;
          goto _L2
_L3:
        j1 = (i6 - i7) + j1;
          goto _L2
        a(((View) (obj)), k5, j3);
        l4 = isb2.b;
        k2 = isb2.c;
        i1 = Math.max(i1, Math.max(0, (l4 + k4) - i3));
        k4 = l1;
        l1 = i1;
        i1 = k1;
        k1 = j1;
        j1 = k4;
          goto _L5
        int i2 = i1;
        if (flag)
        {
            i2 = Math.max(i1, Math.max(0, k1 - j1));
        }
        k1 = Math.max(0, k3 - j3);
        int l2 = Math.max(0, l3 - k5);
        j3 = Math.max(0, i4 - i5);
        i1 = Math.max(0, i2 - j5);
        if (flag)
        {
            i1 = j1 + k3 + i2;
        } else
        {
            i1 = i3 + k1 + i1;
        }
        setMeasuredDimension(l5 + l2 + j3, i1);
        setPadding(l3, k3, i4, i2);
        if (k1 > 0 || l2 > 0)
        {
            i1 = 0;
            for (int j2 = getChildCount(); i1 < j2; i1++)
            {
                isb isb1 = isb.a(getChildAt(i1));
                isb1.a(isb1.c + l2, isb1.b + k1);
            }

        }
        if (g)
        {
            m.set(l2, k1, l2 + l5, k1 + i3);
            n.set(l3, k3, l3 + i6, k3 + j1);
            if (h)
            {
                i1 = (int)e.getStrokeWidth() / 2;
                o.set(n.left + i1, n.top + i1, n.right - i1, n.bottom - i1);
            }
        }
        if (j != null)
        {
            i1 = j.a / 2;
            RectF rectf = p;
            float f2 = isg1.b + l2 + i1;
            float f3 = isg1.c + k1 + i1;
            float f4 = (l2 + l5) - isg1.d - i1;
            float f1;
            if (flag)
            {
                f1 = i1 + (k3 + j1);
            } else
            {
                f1 = (k1 + i3) - isg1.e - i1;
            }
            rectf.set(f2, f3, f4, f1);
            if (q == null)
            {
                q = new Path();
            } else
            {
                q.reset();
            }
            q.addRoundRect(p, j.c, j.c, android.graphics.Path.Direction.CW);
        }
        return;
        if (true) goto _L7; else goto _L6
_L6:
    }
}
