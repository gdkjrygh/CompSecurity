// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pandora.android.util;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.widget.CompoundButton;
import java.util.List;

// Referenced classes of package com.pandora.android.util:
//            s

public class Switch extends CompoundButton
{

    private static final int A[] = {
        0x7f0100d8
    };
    private Drawable a;
    private Drawable b;
    private int c;
    private int d;
    private int e;
    private CharSequence f;
    private CharSequence g;
    private int h;
    private int i;
    private float j;
    private float k;
    private VelocityTracker l;
    private int m;
    private float n;
    private int o;
    private int p;
    private int q;
    private int r;
    private int s;
    private int t;
    private int u;
    private TextPaint v;
    private ColorStateList w;
    private Layout x;
    private Layout y;
    private final Rect z;

    public Switch(Context context)
    {
        this(context, null);
    }

    public Switch(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0x7f0100d7);
    }

    public Switch(Context context, AttributeSet attributeset, int i1)
    {
        super(context, attributeset, i1);
        l = VelocityTracker.obtain();
        z = new Rect();
        v = new TextPaint(1);
        Resources resources = getResources();
        v.density = resources.getDisplayMetrics().density;
        attributeset = context.obtainStyledAttributes(attributeset, com.pandora.android.R.styleable.PSwitch, i1, 0);
        a = attributeset.getDrawable(0);
        b = attributeset.getDrawable(1);
        f = attributeset.getText(2);
        g = attributeset.getText(3);
        c = attributeset.getDimensionPixelSize(4, 0);
        d = attributeset.getDimensionPixelSize(6, 0);
        e = attributeset.getDimensionPixelSize(7, 0);
        i1 = attributeset.getResourceId(5, 0);
        if (i1 != 0)
        {
            a(context, i1);
        }
        attributeset.recycle();
        context = ViewConfiguration.get(context);
        i = context.getScaledTouchSlop();
        m = context.getScaledMinimumFlingVelocity();
        refreshDrawableState();
        setChecked(isChecked());
    }

    private Layout a(CharSequence charsequence)
    {
        return new StaticLayout(charsequence, v, (int)Math.ceil(Layout.getDesiredWidth(charsequence, v)), android.text.Layout.Alignment.ALIGN_NORMAL, 1.0F, 0.0F, true);
    }

    private void a(int i1, int j1)
    {
        Typeface typeface = null;
        i1;
        JVM INSTR tableswitch 1 3: default 28
    //                   1 35
    //                   2 42
    //                   3 49;
           goto _L1 _L2 _L3 _L4
_L1:
        a(typeface, j1);
        return;
_L2:
        typeface = Typeface.SANS_SERIF;
        continue; /* Loop/switch isn't completed */
_L3:
        typeface = Typeface.SERIF;
        continue; /* Loop/switch isn't completed */
_L4:
        typeface = Typeface.MONOSPACE;
        if (true) goto _L1; else goto _L5
_L5:
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
        a.getPadding(z);
        int i1 = s;
        int j1 = i;
        int k1 = (r + (int)(n + 0.5F)) - i;
        int l1 = q;
        int i2 = z.left;
        int j2 = z.right;
        int k2 = i;
        int l2 = u;
        int i3 = i;
        return f1 > (float)k1 && f1 < (float)(l1 + k1 + i2 + j2 + k2) && f2 > (float)(i1 - j1) && f2 < (float)(l2 + i3);
    }

    private void b(MotionEvent motionevent)
    {
        boolean flag1 = true;
        h = 0;
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
            l.computeCurrentVelocity(1000);
            float f1 = l.getXVelocity();
            if (Math.abs(f1) > (float)m)
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

    private boolean getTargetCheckedState()
    {
        return n >= (float)(getThumbScrollRange() / 2);
    }

    private int getThumbScrollRange()
    {
        if (b == null)
        {
            return 0;
        } else
        {
            b.getPadding(z);
            return o - q - z.left - z.right;
        }
    }

    public void a(Context context, int i1)
    {
        context = context.obtainStyledAttributes(i1, com.pandora.android.R.styleable.TextAppearance_PSwitch);
        ColorStateList colorstatelist = context.getColorStateList(0);
        if (colorstatelist != null)
        {
            w = colorstatelist;
        } else
        {
            w = getTextColors();
        }
        i1 = context.getDimensionPixelSize(1, 0);
        if (i1 != 0 && (float)i1 != v.getTextSize())
        {
            v.setTextSize(i1);
            requestLayout();
        }
        a(context.getInt(6, -1), context.getInt(5, -1));
        context.recycle();
    }

    public void a(Typeface typeface, int i1)
    {
        boolean flag = false;
        if (i1 > 0)
        {
            float f1;
            int j1;
            if (typeface == null)
            {
                typeface = Typeface.defaultFromStyle(i1);
            } else
            {
                typeface = Typeface.create(typeface, i1);
            }
            setSwitchTypeface(typeface);
            if (typeface != null)
            {
                j1 = typeface.getStyle();
            } else
            {
                j1 = 0;
            }
            i1 = ~j1 & i1;
            typeface = v;
            if ((i1 & 1) != 0)
            {
                flag = true;
            }
            typeface.setFakeBoldText(flag);
            typeface = v;
            if ((i1 & 2) != 0)
            {
                f1 = -0.25F;
            } else
            {
                f1 = 0.0F;
            }
            typeface.setTextSkewX(f1);
            return;
        } else
        {
            v.setFakeBoldText(false);
            v.setTextSkewX(0.0F);
            setSwitchTypeface(typeface);
            return;
        }
    }

    public boolean dispatchTouchEvent(MotionEvent motionevent)
    {
        if (isEnabled()) goto _L2; else goto _L1
_L1:
        return true;
_L2:
        int i1;
        i1 = motionevent.getAction();
        l.addMovement(motionevent);
        i1 & 0xff;
        JVM INSTR tableswitch 0 3: default 60
    //                   0 62
    //                   1 265
    //                   2 105
    //                   3 298;
           goto _L3 _L4 _L5 _L6 _L7
_L5:
        break; /* Loop/switch isn't completed */
_L3:
        return true;
_L4:
        float f1 = motionevent.getX();
        float f4 = motionevent.getY();
        if (isEnabled() && a(f1, f4))
        {
            h = 1;
            j = f1;
            k = f4;
            return true;
        }
          goto _L1
_L6:
        float f3;
        float f6;
        switch (h)
        {
        default:
            return true;

        case 0: // '\0'
            break;

        case 1: // '\001'
            float f2 = motionevent.getX();
            float f5 = motionevent.getY();
            if (Math.abs(f2 - j) > (float)i || Math.abs(f5 - k) > (float)i)
            {
                h = 2;
                getParent().requestDisallowInterceptTouchEvent(true);
                j = f2;
                k = f5;
                return true;
            }
            break;

        case 2: // '\002'
            f3 = motionevent.getX();
            f6 = Math.max(0.0F, Math.min((f3 - j) + n, getThumbScrollRange()));
            continue; /* Loop/switch isn't completed */
        }
        if (true) goto _L1; else goto _L8
        if (f6 == n) goto _L1; else goto _L9
_L9:
        n = f6;
        j = f3;
        invalidate();
        return true;
_L8:
        if (h == 2)
        {
            b(motionevent);
            return true;
        } else
        {
            h = 0;
            l.clear();
            toggle();
            return true;
        }
_L7:
        if (h == 2)
        {
            b(motionevent);
            return true;
        } else
        {
            h = 0;
            l.clear();
            return true;
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
        int j1 = super.getCompoundPaddingRight() + o;
        int i1 = j1;
        if (!TextUtils.isEmpty(getText()))
        {
            i1 = j1 + e;
        }
        return i1;
    }

    public CharSequence getTextOff()
    {
        return g;
    }

    public CharSequence getTextOn()
    {
        return f;
    }

    public void jumpDrawablesToCurrentState()
    {
        super.jumpDrawablesToCurrentState();
        a.jumpToCurrentState();
        b.jumpToCurrentState();
    }

    protected int[] onCreateDrawableState(int i1)
    {
        int ai[] = super.onCreateDrawableState(i1 + 1);
        if (isChecked())
        {
            mergeDrawableStates(ai, A);
        }
        return ai;
    }

    protected void onDraw(Canvas canvas)
    {
        super.onDraw(canvas);
        int j1 = r;
        int i1 = s;
        int j2 = t;
        int l1 = u;
        b.setBounds(j1, i1, j2, l1);
        b.draw(canvas);
        canvas.save();
        b.getPadding(z);
        int k2 = j1 + z.left;
        int k1 = z.top + i1;
        int l2 = z.right;
        j1 = l1 - z.bottom;
        canvas.clipRect(k2, i1, j2 - l2, l1);
        a.getPadding(z);
        l2 = (int)(n + 0.5F);
        j2 = (k2 - z.left) + l2;
        int i3 = q;
        k2 = z.right + (k2 + l2 + i3);
        a.setBounds(j2, i1, k2, l1);
        a.draw(canvas);
        if (w != null)
        {
            v.setColor(w.getColorForState(getDrawableState(), w.getDefaultColor()));
        }
        v.drawableState = getDrawableState();
        Layout layout;
        if (getTargetCheckedState())
        {
            layout = x;
        } else
        {
            layout = y;
        }
        i1 = j1;
        if (!isInEditMode())
        {
            int i2 = Math.round(com.pandora.android.util.s.t().density * 1.0F);
            i1 = j1;
            if ((k1 + j1) - i2 > 0)
            {
                i1 = j1 - i2;
            }
        }
        canvas.translate((j2 + k2) / 2 - layout.getWidth() / 2, (i1 + k1) / 2 - layout.getHeight() / 2);
        layout.draw(canvas);
        canvas.restore();
    }

    protected void onLayout(boolean flag, int i1, int j1, int k1, int l1)
    {
        super.onLayout(flag, i1, j1, k1, l1);
        float f1;
        if (isChecked())
        {
            f1 = getThumbScrollRange();
        } else
        {
            f1 = 0.0F;
        }
        n = f1;
        k1 = getWidth() - getPaddingRight();
        l1 = o;
        getGravity() & 0x70;
        JVM INSTR lookupswitch 2: default 80
    //                   16: 124
    //                   80: 158;
           goto _L1 _L2 _L3
_L1:
        j1 = getPaddingTop();
        i1 = p + j1;
_L5:
        r = k1 - l1;
        s = j1;
        u = i1;
        t = k1;
        return;
_L2:
        j1 = ((getPaddingTop() + getHeight()) - getPaddingBottom()) / 2 - p / 2;
        i1 = p + j1;
        continue; /* Loop/switch isn't completed */
_L3:
        i1 = getHeight() - getPaddingBottom();
        j1 = i1 - p;
        if (true) goto _L5; else goto _L4
_L4:
    }

    public void onMeasure(int i1, int j1)
    {
        int k1;
        int l1;
        int i2;
        int j2;
        int l2;
        int i3;
        k1 = android.view.View.MeasureSpec.getMode(i1);
        l1 = android.view.View.MeasureSpec.getMode(j1);
        i2 = android.view.View.MeasureSpec.getSize(i1);
        j2 = android.view.View.MeasureSpec.getSize(j1);
        if (x == null)
        {
            x = a(f);
        }
        if (y == null)
        {
            y = a(g);
        }
        b.getPadding(z);
        int k2 = Math.max(x.getWidth(), y.getWidth());
        l2 = Math.max(d, k2 * 2 + c * 4 + z.left + z.right);
        i3 = b.getIntrinsicHeight();
        q = k2 + c * 2;
        k1;
        JVM INSTR lookupswitch 2: default 176
    //                   -2147483648: 242
    //                   0: 176;
           goto _L1 _L2 _L1
_L1:
        l1;
        JVM INSTR lookupswitch 2: default 204
    //                   -2147483648: 253
    //                   0: 204;
           goto _L3 _L4 _L3
_L3:
        o = l2;
        p = i3;
        super.onMeasure(i1, j1);
        if (getMeasuredHeight() < i3)
        {
            setMeasuredDimension(getMeasuredWidth(), i3);
        }
        return;
_L2:
        Math.min(i2, l2);
          goto _L1
_L4:
        Math.min(j2, i3);
          goto _L3
    }

    public void onPopulateAccessibilityEvent(AccessibilityEvent accessibilityevent)
    {
        super.onPopulateAccessibilityEvent(accessibilityevent);
        if (isChecked())
        {
            CharSequence charsequence = x.getText();
            Object obj = charsequence;
            if (TextUtils.isEmpty(charsequence))
            {
                obj = getContext().getString(0x7f08026d);
            }
            accessibilityevent.getText().add(obj);
            return;
        }
        CharSequence charsequence1 = y.getText();
        Object obj1 = charsequence1;
        if (TextUtils.isEmpty(charsequence1))
        {
            obj1 = getContext().getString(0x7f08026c);
        }
        accessibilityevent.getText().add(obj1);
    }

    public void setChecked(boolean flag)
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
        n = f1;
        invalidate();
    }

    public void setSwitchTypeface(Typeface typeface)
    {
        if (v.getTypeface() != typeface)
        {
            v.setTypeface(typeface);
            requestLayout();
            invalidate();
        }
    }

    public void setTextOff(CharSequence charsequence)
    {
        g = charsequence;
        requestLayout();
    }

    public void setTextOn(CharSequence charsequence)
    {
        f = charsequence;
        requestLayout();
    }

    protected boolean verifyDrawable(Drawable drawable)
    {
        return super.verifyDrawable(drawable) || drawable == a || drawable == b;
    }

}
