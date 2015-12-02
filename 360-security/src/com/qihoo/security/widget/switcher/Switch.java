// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.widget.switcher;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewParent;
import android.widget.CompoundButton;

public class Switch extends CompoundButton
{

    private static final int w[] = {
        0x10100a0
    };
    private Drawable a;
    private Drawable b;
    private final int c;
    private final int d;
    private int e;
    private final int f;
    private float g;
    private float h;
    private final VelocityTracker i;
    private final int j;
    private float k;
    private int l;
    private int m;
    private int n;
    private int o;
    private int p;
    private int q;
    private int r;
    private int s;
    private final Rect t;
    private Handler u;
    private boolean v;
    private boolean x;

    public Switch(Context context)
    {
        this(context, null);
    }

    public Switch(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0x7f010105);
    }

    public Switch(Context context, AttributeSet attributeset, int i1)
    {
        super(context, attributeset, i1);
        i = VelocityTracker.obtain();
        t = new Rect();
        v = false;
        x = true;
        attributeset = context.obtainStyledAttributes(attributeset, com.qihoo.security.lite.a.a.Switch, i1, 0);
        a = attributeset.getDrawable(0);
        b = attributeset.getDrawable(1);
        c = attributeset.getDimensionPixelSize(2, 48);
        d = attributeset.getDimensionPixelSize(3, 16);
        n = attributeset.getDimensionPixelSize(4, 28);
        o = attributeset.getDimensionPixelSize(5, 4);
        attributeset.recycle();
        if (a == null)
        {
            a = context.getResources().getDrawable(0x7f020129);
        }
        if (b == null)
        {
            b = context.getResources().getDrawable(0x7f0200a6);
        }
        context = ViewConfiguration.get(context);
        f = context.getScaledTouchSlop();
        j = context.getScaledMinimumFlingVelocity();
        refreshDrawableState();
        setChecked(isChecked());
        u = new Handler(new android.os.Handler.Callback() {

            final Switch a;

            public boolean handleMessage(Message message)
            {
                switch (message.what)
                {
                default:
                    return false;

                case 1: // '\001'
                    Switch.a(a, Switch.a(a));
                    Switch.b(a);
                    a.invalidate();
                    return true;

                case 0: // '\0'
                    Switch.b(a, Switch.a(a));
                    Switch.b(a);
                    a.invalidate();
                    return true;
                }
            }

            
            {
                a = Switch.this;
                super();
            }
        });
    }

    static float a(Switch switch1, float f1)
    {
        f1 = switch1.k - f1;
        switch1.k = f1;
        return f1;
    }

    static int a(Switch switch1)
    {
        return switch1.o;
    }

    private void a()
    {
        if (k < 0.0F)
        {
            k = 0.0F;
        } else
        if (k > (float)getThumbScrollRange())
        {
            k = getThumbScrollRange();
            return;
        }
    }

    private void a(MotionEvent motionevent)
    {
        motionevent = MotionEvent.obtain(motionevent);
        motionevent.setAction(3);
        super.onTouchEvent(motionevent);
        motionevent.recycle();
    }

    private void a(boolean flag)
    {
        setChecked(flag);
    }

    private boolean a(float f1, float f2)
    {
        a.getPadding(t);
        int i1 = q;
        int j1 = f;
        int k1 = (p + (int)(k + 0.5F)) - f;
        int l1 = n;
        int i2 = t.left;
        int j2 = t.right;
        int k2 = f;
        int l2 = s;
        int i3 = f;
        return f1 > (float)k1 && f1 < (float)(l1 + k1 + i2 + j2 + k2) && f2 > (float)(i1 - j1) && f2 < (float)(l2 + i3);
    }

    static float b(Switch switch1, float f1)
    {
        f1 = switch1.k + f1;
        switch1.k = f1;
        return f1;
    }

    private void b(MotionEvent motionevent)
    {
        boolean flag1 = true;
        e = 0;
        boolean flag;
        if (motionevent.getAction() == 1 && isEnabled())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        a(motionevent);
        if (flag)
        {
            i.computeCurrentVelocity(1000);
            float f1 = i.getXVelocity();
            if (Math.abs(f1) > (float)j)
            {
                if (f1 <= 0.0F)
                {
                    flag1 = false;
                }
            } else
            {
                flag1 = getTargetCheckedState();
            }
            a(flag1);
            return;
        } else
        {
            a(isChecked());
            return;
        }
    }

    static void b(Switch switch1)
    {
        switch1.a();
    }

    private boolean getTargetCheckedState()
    {
        return k >= (float)(getThumbScrollRange() / 2);
    }

    private int getThumbScrollRange()
    {
        if (b == null)
        {
            return 0;
        } else
        {
            b.getPadding(t);
            return l - n - t.left - t.right;
        }
    }

    protected void drawableStateChanged()
    {
        super.drawableStateChanged();
        int ai[] = getDrawableState();
        if (a != null)
        {
            a.setState(ai);
        }
        if (b != null)
        {
            b.setState(ai);
        }
        invalidate();
    }

    public int getCompoundPaddingRight()
    {
        int j1 = super.getCompoundPaddingRight() + l;
        int i1 = j1;
        if (!TextUtils.isEmpty(getText()))
        {
            i1 = j1 + d;
        }
        return i1;
    }

    protected void onAttachedToWindow()
    {
        super.onAttachedToWindow();
        v = true;
    }

    protected int[] onCreateDrawableState(int i1)
    {
        int ai[] = super.onCreateDrawableState(i1 + 1);
        if (isChecked())
        {
            View.mergeDrawableStates(ai, w);
        }
        return ai;
    }

    protected void onDetachedFromWindow()
    {
        super.onDetachedFromWindow();
        v = false;
    }

    protected void onDraw(Canvas canvas)
    {
label0:
        {
            super.onDraw(canvas);
            int k1 = p;
            int i1 = q;
            int l1 = r;
            int j1 = s;
            b.setBounds(k1, i1, l1, j1);
            b.draw(canvas);
            canvas.save();
            b.getPadding(t);
            k1 += t.left;
            canvas.clipRect(k1, i1, l1 - t.right, j1);
            a.getPadding(t);
            l1 = (int)(k + 0.5F);
            int i2 = t.left;
            int j2 = n;
            int k2 = t.right;
            a.setBounds((k1 - i2) + l1, i1, k1 + l1 + j2 + k2, j1);
            a.draw(canvas);
            canvas.restore();
            if (e == 0 && k != 0.0F && k != (float)getThumbScrollRange())
            {
                if (!isChecked())
                {
                    break label0;
                }
                u.sendEmptyMessageDelayed(0, 12L);
            }
            return;
        }
        u.sendEmptyMessageDelayed(1, 12L);
    }

    protected void onLayout(boolean flag, int i1, int j1, int k1, int l1)
    {
        boolean flag1 = false;
        super.onLayout(flag, i1, j1, k1, l1);
        float f1;
        if (isChecked())
        {
            f1 = getThumbScrollRange();
        } else
        {
            f1 = 0.0F;
        }
        k = f1;
        k1 = getWidth() - getPaddingRight();
        l1 = l;
        getGravity() & 0x70;
        JVM INSTR lookupswitch 3: default 92
    //                   16: 144
    //                   48: 129
    //                   80: 178;
           goto _L1 _L2 _L3 _L4
_L1:
        i1 = 0;
        j1 = ((flag1) ? 1 : 0);
_L6:
        p = k1 - l1;
        q = j1;
        s = i1;
        r = k1;
        return;
_L3:
        j1 = getPaddingTop();
        i1 = m + j1;
        continue; /* Loop/switch isn't completed */
_L2:
        j1 = ((getPaddingTop() + getHeight()) - getPaddingBottom()) / 2 - m / 2;
        i1 = m + j1;
        continue; /* Loop/switch isn't completed */
_L4:
        i1 = getHeight() - getPaddingBottom();
        j1 = i1 - m;
        if (true) goto _L6; else goto _L5
_L5:
    }

    public void onMeasure(int i1, int j1)
    {
        int k1;
label0:
        {
            b.getPadding(t);
            Math.max(c, n * 2 + t.left + t.right);
            k1 = a.getIntrinsicHeight();
            l = c;
            m = k1;
            super.onMeasure(i1, j1);
            if (getMeasuredHeight() < k1)
            {
                if (android.os.Build.VERSION.SDK_INT >= 11)
                {
                    break label0;
                }
                setMeasuredDimension(getMeasuredWidth(), k1);
            }
            return;
        }
        setMeasuredDimension(getMeasuredWidthAndState(), k1);
    }

    public boolean onTouchEvent(MotionEvent motionevent)
    {
        boolean flag = true;
        i.addMovement(motionevent);
        int i1;
        if (android.os.Build.VERSION.SDK_INT < 8)
        {
            i1 = motionevent.getAction();
        } else
        {
            i1 = motionevent.getActionMasked();
        }
        i1;
        JVM INSTR tableswitch 0 3: default 56
    //                   0 75
    //                   1 286
    //                   2 119
    //                   3 286;
           goto _L1 _L2 _L3 _L4 _L3
_L1:
        flag = super.onTouchEvent(motionevent);
_L6:
        return flag;
_L2:
        float f1 = motionevent.getX();
        float f4 = motionevent.getY();
        if (isEnabled() && a(f1, f4))
        {
            e = 1;
            g = f1;
            h = f4;
        }
        continue; /* Loop/switch isn't completed */
_L4:
        float f3;
        float f6;
        if (!x)
        {
            continue; /* Loop/switch isn't completed */
        }
        switch (e)
        {
        case 0: // '\0'
        default:
            continue; /* Loop/switch isn't completed */

        case 1: // '\001'
            float f2 = motionevent.getX();
            float f5 = motionevent.getY();
            if (Math.abs(f2 - g) > (float)f || Math.abs(f5 - h) > (float)f)
            {
                e = 2;
                getParent().requestDisallowInterceptTouchEvent(true);
                g = f2;
                h = f5;
                return true;
            }
            continue; /* Loop/switch isn't completed */

        case 2: // '\002'
            f3 = motionevent.getX();
            f6 = Math.max(0.0F, Math.min((f3 - g) + k, getThumbScrollRange()));
            break;
        }
        if (f6 == k) goto _L6; else goto _L5
_L5:
        k = f6;
        g = f3;
        invalidate();
        return true;
_L3:
        if (e == 2)
        {
            b(motionevent);
            return true;
        }
        e = 0;
        i.clear();
        if (true) goto _L1; else goto _L7
_L7:
    }

    public void setChecked(boolean flag)
    {
label0:
        {
            super.setChecked(flag);
            if (v && u != null)
            {
                if (!isChecked())
                {
                    break label0;
                }
                u.sendEmptyMessageDelayed(0, 12L);
            }
            return;
        }
        u.sendEmptyMessageDelayed(1, 12L);
    }

    public void setCheckedWithoutAnim(boolean flag)
    {
        super.setChecked(flag);
        float f1;
        if (flag)
        {
            f1 = getThumbScrollRange();
        } else
        {
            f1 = 0.0F;
        }
        k = f1;
        invalidate();
    }

    public void setScrollable(boolean flag)
    {
        x = flag;
    }

    protected boolean verifyDrawable(Drawable drawable)
    {
        return super.verifyDrawable(drawable) || drawable == a || drawable == b;
    }

}
