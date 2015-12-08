// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.photos.videoplayer.slomo.ui;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import b;
import c;
import java.util.List;
import jgr;
import jgs;
import jgt;
import jgv;

public final class RangeSeekBar extends View
{

    public jgs a;
    public int b;
    public int c;
    public int d;
    private final Paint e;
    private final Paint f;
    private final Drawable g;
    private final Drawable h;
    private final int i;
    private final int j;
    private final int k;
    private final int l;
    private final int m;
    private final Context n;
    private AccessibilityManager o;
    private jgr p;
    private int q;
    private int r;
    private int s;
    private int t;
    private int u;
    private float v;
    private boolean w;
    private jgv x;

    public RangeSeekBar(Context context)
    {
        this(context, null);
    }

    public RangeSeekBar(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public RangeSeekBar(Context context, AttributeSet attributeset, int i1)
    {
        super(context, attributeset, i1);
        e = new Paint();
        f = new Paint();
        setFocusable(true);
        m = ViewConfiguration.get(context).getScaledTouchSlop();
        attributeset = getResources();
        n = context;
        o = (AccessibilityManager)context.getSystemService("accessibility");
        i = (int)attributeset.getDimension(b.CF);
        k = (int)attributeset.getDimension(b.CC);
        l = (int)attributeset.getDimension(b.CD);
        g = attributeset.getDrawable(b.CG);
        h = attributeset.getDrawable(b.CG);
        j = (int)attributeset.getDimension(b.CE);
        b = 100;
        c = 0;
        d = b;
        e.setColor(getResources().getColor(c.fE));
        e.setStyle(android.graphics.Paint.Style.FILL);
        f.setStyle(android.graphics.Paint.Style.FILL);
        f.setAntiAlias(true);
        i1 = j << 1;
        context = new Rect();
        context.set(0, 0, i1, i1);
        g.setBounds(context);
        h.setBounds(context);
        s = i / 2;
        t = s;
        q = i;
        r = Math.max(s, j) + s + t;
        if (s > j)
        {
            i1 = 0;
        } else
        {
            i1 = j - s;
        }
        u = i1;
    }

    private int a()
    {
        return getWidth() - getPaddingLeft() - getPaddingRight() - (q << 1);
    }

    private int a(int i1)
    {
        return b(i1) + c();
    }

    private int a(jgv jgv1)
    {
        Resources resources = getResources();
        int i1;
        if (w && x == jgv1)
        {
            i1 = c.fF;
        } else
        {
            i1 = c.fG;
        }
        return resources.getColor(i1);
    }

    private void a(Canvas canvas, Drawable drawable, int i1, int j1)
    {
        int k1 = s - j;
        canvas.save();
        canvas.translate(i1 + k1, k1 + j1);
        drawable.draw(canvas);
        canvas.restore();
    }

    private void a(Drawable drawable)
    {
        if (drawable != null && drawable.isStateful())
        {
            drawable.setState(getDrawableState());
        }
    }

    private void a(MotionEvent motionevent)
    {
        int i1;
        float f1 = motionevent.getX();
        i1 = c();
        if (f1 < (float)i1)
        {
            f1 = 0.0F;
        } else
        if (f1 > (float)(getWidth() - getPaddingRight() - q))
        {
            f1 = 1.0F;
        } else
        {
            f1 = (f1 - (float)i1) / (float)a();
        }
        i1 = (int)(f1 * (float)b);
        if (!jgv.a.equals(x)) goto _L2; else goto _L1
_L1:
        c = i1;
        if (c > d)
        {
            d = c;
        }
_L4:
        a(true);
        return;
_L2:
        if (jgv.b.equals(x))
        {
            d = i1;
            if (d < c)
            {
                c = d;
            }
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public static void a(RangeSeekBar rangeseekbar)
    {
        AccessibilityEvent accessibilityevent;
        char c1;
        if (android.os.Build.VERSION.SDK_INT < 16)
        {
            c1 = '\b';
        } else
        {
            c1 = '\u4000';
        }
        accessibilityevent = AccessibilityEvent.obtain(c1);
        accessibilityevent.getText().add(rangeseekbar.d());
        accessibilityevent.setClassName(com/google/android/apps/photos/videoplayer/slomo/ui/RangeSeekBar.getName());
        accessibilityevent.setSource(rangeseekbar);
        rangeseekbar.o.sendAccessibilityEvent(accessibilityevent);
    }

    private void a(boolean flag)
    {
        invalidate();
        if (o.isEnabled() && isEnabled())
        {
            if (p == null)
            {
                p = new jgr(this);
            } else
            {
                removeCallbacks(p);
            }
            postDelayed(p, 200L);
        }
        if (a != null)
        {
            a.a(this, c, d, flag);
        }
    }

    private boolean a(int i1, float f1)
    {
        return Math.abs(f1 - (float)a(i1)) < (float)Math.max(j, i);
    }

    private int b(int i1)
    {
        float f2 = a();
        float f1;
        if (b > 0)
        {
            f1 = (float)i1 / (float)b;
        } else
        {
            f1 = 0.0F;
        }
        return (int)(f1 * f2);
    }

    private void b()
    {
        if (getParent() != null)
        {
            getParent().requestDisallowInterceptTouchEvent(true);
        }
    }

    private int c()
    {
        return getPaddingLeft() + q;
    }

    private CharSequence d()
    {
        return n.getString(b.CH, new Object[] {
            Integer.valueOf(c), Integer.valueOf(d)
        });
    }

    public final void a(int i1, int j1)
    {
        if (i1 <= 0)
        {
            i1 = 0;
        }
        if (j1 >= b)
        {
            j1 = b;
        }
        if (c == i1 && d == j1)
        {
            return;
        } else
        {
            c = i1;
            d = j1;
            a(false);
            return;
        }
    }

    protected final void drawableStateChanged()
    {
        super.drawableStateChanged();
        if (x == jgv.a)
        {
            a(g);
        } else
        if (x == jgv.b)
        {
            a(h);
            return;
        }
    }

    protected final void onDraw(Canvas canvas)
    {
        super.onDraw(canvas);
        int i1 = b(c);
        int j1 = b(d);
        int l1 = k;
        int i2 = l;
        int k1 = a();
        l1 = k1 / ((l1 << 1) + i2);
        float f4 = (float)k1 / (float)(l1 + (3 - l1 % 3));
        float f5 = f4 * 3F;
        canvas.save();
        canvas.translate(c(), r);
        float f3 = a();
        float f1;
        for (f1 = 0.0F; f1 <= (float)i1; f1 += f4)
        {
            canvas.drawCircle(f1, 0.0F, k, e);
        }

        f1 = (float)Math.ceil(f1 / f5) * f5;
        float f2;
        do
        {
            f2 = f3;
            if (f1 >= (float)j1)
            {
                break;
            }
            canvas.drawCircle(f1, 0.0F, k, e);
            f1 += f5;
        } while (true);
        for (; f2 >= (float)j1; f2 -= f4)
        {
            canvas.drawCircle(f2, 0.0F, k, e);
        }

        canvas.restore();
        i1 = a(c) - i;
        a(canvas, g, i1, u);
        canvas.save();
        canvas.translate(i1, u);
        Path path = new Path();
        path.setFillType(android.graphics.Path.FillType.EVEN_ODD);
        path.moveTo(0.0F, 0.0F);
        path.lineTo(i, 0.0F);
        path.lineTo(i, i);
        path.lineTo(0.0F, 0.0F);
        path.close();
        f.setColor(a(jgv.a));
        canvas.drawPath(path, f);
        canvas.restore();
        i1 = a(d);
        a(canvas, h, i1, u);
        canvas.save();
        canvas.translate(i1, u);
        path = new Path();
        path.setFillType(android.graphics.Path.FillType.EVEN_ODD);
        path.moveTo(0.0F, 0.0F);
        path.lineTo(0.0F, i);
        path.lineTo(i, 0.0F);
        path.lineTo(0.0F, 0.0F);
        path.close();
        f.setColor(a(jgv.b));
        canvas.drawPath(path, f);
        canvas.restore();
    }

    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityevent)
    {
        super.onInitializeAccessibilityEvent(accessibilityevent);
        accessibilityevent.setClassName(com/google/android/apps/photos/videoplayer/slomo/ui/RangeSeekBar.getName());
    }

    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilitynodeinfo)
    {
        super.onInitializeAccessibilityNodeInfo(accessibilitynodeinfo);
        accessibilitynodeinfo.setClassName(com/google/android/apps/photos/videoplayer/slomo/ui/RangeSeekBar.getName());
    }

    protected final void onMeasure(int i1, int j1)
    {
        int k1 = Math.max(i << 1, j << 1);
        int l1 = Math.max(s, j);
        int i2 = Math.max((k << 1) + s + t, j);
        int j2 = getPaddingLeft();
        int k2 = getPaddingRight();
        int l2 = getPaddingTop();
        int i3 = getPaddingBottom();
        setMeasuredDimension(resolveSizeAndState(k1 + (j2 + k2), i1, 0), resolveSizeAndState(l1 + i2 + (l2 + i3), j1, 0));
    }

    public final void onPopulateAccessibilityEvent(AccessibilityEvent accessibilityevent)
    {
        super.onPopulateAccessibilityEvent(accessibilityevent);
        accessibilityevent.getText().add(d());
    }

    public final void onRestoreInstanceState(Parcelable parcelable)
    {
        parcelable = (jgt)parcelable;
        super.onRestoreInstanceState(parcelable.getSuperState());
        a(((jgt) (parcelable)).a, ((jgt) (parcelable)).b);
        a(false);
    }

    public final Parcelable onSaveInstanceState()
    {
        jgt jgt1 = new jgt(super.onSaveInstanceState());
        jgt1.a = c;
        jgt1.b = d;
        return jgt1;
    }

    public final boolean onTouchEvent(MotionEvent motionevent)
    {
        if (!isEnabled())
        {
            return false;
        }
        motionevent.getAction();
        JVM INSTR tableswitch 0 3: default 44
    //                   0 63
    //                   1 262
    //                   2 204
    //                   3 292;
           goto _L1 _L2 _L3 _L4 _L5
_L1:
        if (a != null)
        {
            a.a(motionevent);
        }
        return true;
_L2:
        v = motionevent.getX();
        float f1 = v;
        boolean flag = a(c, f1);
        boolean flag1 = a(d, f1);
        jgv jgv1;
        if (flag && flag1)
        {
            if (c > b / 2)
            {
                jgv1 = jgv.a;
            } else
            {
                jgv1 = jgv.b;
            }
        } else
        if (flag)
        {
            jgv1 = jgv.a;
        } else
        if (flag1)
        {
            jgv1 = jgv.b;
        } else
        {
            jgv1 = null;
        }
        x = jgv1;
        if (x == null)
        {
            super.onTouchEvent(motionevent);
        } else
        {
            setPressed(true);
            w = true;
            a(motionevent);
            b();
        }
        continue; /* Loop/switch isn't completed */
_L4:
        if (w)
        {
            a(motionevent);
        } else
        if (Math.abs(motionevent.getX() - v) > (float)m)
        {
            setPressed(true);
            w = true;
            a(motionevent);
            b();
        }
        continue; /* Loop/switch isn't completed */
_L3:
        if (w)
        {
            a(motionevent);
            w = false;
            setPressed(false);
            performClick();
        }
        continue; /* Loop/switch isn't completed */
_L5:
        if (w)
        {
            w = false;
            setPressed(false);
        }
        if (true) goto _L1; else goto _L6
_L6:
    }

    public final boolean performClick()
    {
        super.performClick();
        return true;
    }
}
