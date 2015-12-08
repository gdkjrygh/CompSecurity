// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.support.v4.graphics.drawable.a;
import android.support.v4.view.m;
import android.support.v4.view.x;
import android.support.v7.internal.widget.h;
import android.support.v7.internal.widget.o;
import android.support.v7.internal.widget.p;
import android.support.v7.internal.widget.r;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.method.TransformationMethod;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.Animation;
import android.view.animation.Transformation;
import android.widget.CompoundButton;
import java.util.List;

public class SwitchCompat extends CompoundButton
{
    private final class a extends Animation
    {

        final float a;
        final float b;
        final float c;
        final SwitchCompat d;

        protected final void applyTransformation(float f1, Transformation transformation)
        {
            android.support.v7.widget.SwitchCompat.a(d, a + c * f1);
        }

        private a(float f1, float f2)
        {
            d = SwitchCompat.this;
            super();
            a = f1;
            b = f2;
            c = f2 - f1;
        }

        a(float f1, float f2, byte byte0)
        {
            this(f1, f2);
        }
    }


    private static final int F[] = {
        0x10100a0
    };
    private Layout A;
    private TransformationMethod B;
    private a C;
    private final Rect D;
    private final o E;
    private Drawable a;
    private Drawable b;
    private int c;
    private int d;
    private int e;
    private boolean f;
    private CharSequence g;
    private CharSequence h;
    private boolean i;
    private int j;
    private int k;
    private float l;
    private float m;
    private VelocityTracker n;
    private int o;
    private float p;
    private int q;
    private int r;
    private int s;
    private int t;
    private int u;
    private int v;
    private int w;
    private TextPaint x;
    private ColorStateList y;
    private Layout z;

    public SwitchCompat(Context context)
    {
        this(context, null);
    }

    public SwitchCompat(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, android.support.v7.appcompat.a.a.switchStyle);
    }

    public SwitchCompat(Context context, AttributeSet attributeset, int i1)
    {
        super(context, attributeset, i1);
        n = VelocityTracker.obtain();
        D = new Rect();
        x = new TextPaint(1);
        Resources resources = getResources();
        x.density = resources.getDisplayMetrics().density;
        attributeset = android.support.v7.internal.widget.p.a(context, attributeset, android.support.v7.appcompat.a.k.SwitchCompat, i1);
        a = attributeset.a(android.support.v7.appcompat.a.k.SwitchCompat_android_thumb);
        if (a != null)
        {
            a.setCallback(this);
        }
        b = attributeset.a(android.support.v7.appcompat.a.k.SwitchCompat_track);
        if (b != null)
        {
            b.setCallback(this);
        }
        g = attributeset.c(android.support.v7.appcompat.a.k.SwitchCompat_android_textOn);
        h = attributeset.c(android.support.v7.appcompat.a.k.SwitchCompat_android_textOff);
        i = attributeset.a(android.support.v7.appcompat.a.k.SwitchCompat_showText, true);
        c = attributeset.d(android.support.v7.appcompat.a.k.SwitchCompat_thumbTextPadding, 0);
        d = attributeset.d(android.support.v7.appcompat.a.k.SwitchCompat_switchMinWidth, 0);
        e = attributeset.d(android.support.v7.appcompat.a.k.SwitchCompat_switchPadding, 0);
        f = attributeset.a(android.support.v7.appcompat.a.k.SwitchCompat_splitTrack, false);
        i1 = attributeset.f(android.support.v7.appcompat.a.k.SwitchCompat_switchTextAppearance, 0);
        if (i1 != 0)
        {
            setSwitchTextAppearance(context, i1);
        }
        E = attributeset.c();
        attributeset.b();
        context = ViewConfiguration.get(context);
        k = context.getScaledTouchSlop();
        o = context.getScaledMinimumFlingVelocity();
        refreshDrawableState();
        setChecked(isChecked());
    }

    private Layout a(CharSequence charsequence)
    {
        if (B != null)
        {
            charsequence = B.getTransformation(charsequence, this);
        }
        TextPaint textpaint = x;
        int i1;
        if (charsequence != null)
        {
            i1 = (int)Math.ceil(Layout.getDesiredWidth(charsequence, x));
        } else
        {
            i1 = 0;
        }
        return new StaticLayout(charsequence, textpaint, i1, android.text.Layout.Alignment.ALIGN_NORMAL, 1.0F, 0.0F, true);
    }

    private void a(float f1)
    {
        p = f1;
        invalidate();
    }

    static void a(SwitchCompat switchcompat, float f1)
    {
        switchcompat.a(f1);
    }

    private boolean a()
    {
        return p > 0.5F;
    }

    private int b()
    {
        float f1;
        if (android.support.v7.internal.widget.r.a(this))
        {
            f1 = 1.0F - p;
        } else
        {
            f1 = p;
        }
        return (int)((float)c() * f1 + 0.5F);
    }

    private int c()
    {
        if (b != null)
        {
            Rect rect1 = D;
            b.getPadding(rect1);
            Rect rect;
            if (a != null)
            {
                rect = android.support.v7.internal.widget.h.a(a);
            } else
            {
                rect = h.a;
            }
            return q - s - rect1.left - rect1.right - rect.left - rect.right;
        } else
        {
            return 0;
        }
    }

    public void draw(Canvas canvas)
    {
        Rect rect = D;
        int j4 = t;
        int j3 = u;
        int l3 = v;
        int k3 = w;
        int j1 = j4 + b();
        Object obj;
        int i1;
        if (a != null)
        {
            obj = android.support.v7.internal.widget.h.a(a);
        } else
        {
            obj = h.a;
        }
        i1 = j1;
        if (b != null)
        {
            b.getPadding(rect);
            int i4 = j1 + rect.left;
            i1 = j4;
            int l1 = j3;
            j1 = l3;
            int i2 = k3;
            int i3 = i2;
            int j2 = i1;
            int k2 = j1;
            int l2 = l1;
            if (obj != null)
            {
                i3 = i2;
                j2 = i1;
                k2 = j1;
                l2 = l1;
                if (!((Rect) (obj)).isEmpty())
                {
                    if (((Rect) (obj)).left > rect.left)
                    {
                        i1 = j4 + (((Rect) (obj)).left - rect.left);
                    }
                    if (((Rect) (obj)).top > rect.top)
                    {
                        l1 = j3 + (((Rect) (obj)).top - rect.top);
                    }
                    if (((Rect) (obj)).right > rect.right)
                    {
                        j1 = l3 - (((Rect) (obj)).right - rect.right);
                    }
                    i3 = i2;
                    j2 = i1;
                    k2 = j1;
                    l2 = l1;
                    if (((Rect) (obj)).bottom > rect.bottom)
                    {
                        i3 = k3 - (((Rect) (obj)).bottom - rect.bottom);
                        l2 = l1;
                        k2 = j1;
                        j2 = i1;
                    }
                }
            }
            b.setBounds(j2, l2, k2, i3);
            i1 = i4;
        }
        if (a != null)
        {
            a.getPadding(rect);
            int k1 = i1 - rect.left;
            i1 = s + i1 + rect.right;
            a.setBounds(k1, j3, i1, k3);
            obj = getBackground();
            if (obj != null)
            {
                android.support.v4.graphics.drawable.a.a(((Drawable) (obj)), k1, j3, i1, k3);
            }
        }
        super.draw(canvas);
    }

    public void drawableHotspotChanged(float f1, float f2)
    {
        if (android.os.Build.VERSION.SDK_INT >= 21)
        {
            super.drawableHotspotChanged(f1, f2);
        }
        if (a != null)
        {
            android.support.v4.graphics.drawable.a.a(a, f1, f2);
        }
        if (b != null)
        {
            android.support.v4.graphics.drawable.a.a(b, f1, f2);
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

    public int getCompoundPaddingLeft()
    {
        int i1;
        if (!android.support.v7.internal.widget.r.a(this))
        {
            i1 = super.getCompoundPaddingLeft();
        } else
        {
            int j1 = super.getCompoundPaddingLeft() + q;
            i1 = j1;
            if (!TextUtils.isEmpty(getText()))
            {
                return j1 + e;
            }
        }
        return i1;
    }

    public int getCompoundPaddingRight()
    {
        int i1;
        if (android.support.v7.internal.widget.r.a(this))
        {
            i1 = super.getCompoundPaddingRight();
        } else
        {
            int j1 = super.getCompoundPaddingRight() + q;
            i1 = j1;
            if (!TextUtils.isEmpty(getText()))
            {
                return j1 + e;
            }
        }
        return i1;
    }

    public void jumpDrawablesToCurrentState()
    {
        if (android.os.Build.VERSION.SDK_INT >= 11)
        {
            super.jumpDrawablesToCurrentState();
            if (a != null)
            {
                a.jumpToCurrentState();
            }
            if (b != null)
            {
                b.jumpToCurrentState();
            }
            if (C != null && !C.hasEnded())
            {
                clearAnimation();
                a(C.b);
                C = null;
            }
        }
    }

    protected int[] onCreateDrawableState(int i1)
    {
        int ai[] = super.onCreateDrawableState(i1 + 1);
        if (isChecked())
        {
            mergeDrawableStates(ai, F);
        }
        return ai;
    }

    protected void onDraw(Canvas canvas)
    {
        super.onDraw(canvas);
        Object obj = D;
        int ai[] = b;
        Object obj1;
        int k1;
        int l1;
        int i2;
        int j2;
        int k2;
        if (ai != null)
        {
            ai.getPadding(((Rect) (obj)));
        } else
        {
            ((Rect) (obj)).setEmpty();
        }
        l1 = u;
        i2 = w;
        j2 = ((Rect) (obj)).top;
        k2 = ((Rect) (obj)).bottom;
        obj1 = a;
        if (ai != null)
        {
            if (f && obj1 != null)
            {
                Rect rect = android.support.v7.internal.widget.h.a(((Drawable) (obj1)));
                ((Drawable) (obj1)).copyBounds(((Rect) (obj)));
                obj.left = ((Rect) (obj)).left + rect.left;
                obj.right = ((Rect) (obj)).right - rect.right;
                int i1 = canvas.save();
                canvas.clipRect(((Rect) (obj)), android.graphics.Region.Op.DIFFERENCE);
                ai.draw(canvas);
                canvas.restoreToCount(i1);
            } else
            {
                ai.draw(canvas);
            }
        }
        k1 = canvas.save();
        if (obj1 != null)
        {
            ((Drawable) (obj1)).draw(canvas);
        }
        if (a())
        {
            obj = z;
        } else
        {
            obj = A;
        }
        if (obj != null)
        {
            ai = getDrawableState();
            if (y != null)
            {
                x.setColor(y.getColorForState(ai, 0));
            }
            x.drawableState = ai;
            int j1;
            int l2;
            if (obj1 != null)
            {
                obj1 = ((Drawable) (obj1)).getBounds();
                j1 = ((Rect) (obj1)).left + ((Rect) (obj1)).right;
            } else
            {
                j1 = getWidth();
            }
            j1 /= 2;
            l2 = ((Layout) (obj)).getWidth() / 2;
            l1 = (l1 + j2 + (i2 - k2)) / 2;
            i2 = ((Layout) (obj)).getHeight() / 2;
            canvas.translate(j1 - l2, l1 - i2);
            ((Layout) (obj)).draw(canvas);
        }
        canvas.restoreToCount(k1);
    }

    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityevent)
    {
        super.onInitializeAccessibilityEvent(accessibilityevent);
        accessibilityevent.setClassName("android.widget.Switch");
    }

    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilitynodeinfo)
    {
        CharSequence charsequence;
        CharSequence charsequence1;
label0:
        {
            if (android.os.Build.VERSION.SDK_INT >= 14)
            {
                super.onInitializeAccessibilityNodeInfo(accessibilitynodeinfo);
                accessibilitynodeinfo.setClassName("android.widget.Switch");
                if (isChecked())
                {
                    charsequence = g;
                } else
                {
                    charsequence = h;
                }
                if (!TextUtils.isEmpty(charsequence))
                {
                    charsequence1 = accessibilitynodeinfo.getText();
                    if (!TextUtils.isEmpty(charsequence1))
                    {
                        break label0;
                    }
                    accessibilitynodeinfo.setText(charsequence);
                }
            }
            return;
        }
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append(charsequence1).append(' ').append(charsequence);
        accessibilitynodeinfo.setText(stringbuilder);
    }

    protected void onLayout(boolean flag, int i1, int j1, int k1, int l1)
    {
        super.onLayout(flag, i1, j1, k1, l1);
        i1 = 0;
        j1 = 0;
        if (a != null)
        {
            Rect rect = D;
            Rect rect1;
            if (b != null)
            {
                b.getPadding(rect);
            } else
            {
                rect.setEmpty();
            }
            rect1 = android.support.v7.internal.widget.h.a(a);
            i1 = Math.max(0, rect1.left - rect.left);
            j1 = Math.max(0, rect1.right - rect.right);
        }
        if (android.support.v7.internal.widget.r.a(this))
        {
            k1 = getPaddingLeft() + i1;
            l1 = (q + k1) - i1 - j1;
        } else
        {
            l1 = getWidth() - getPaddingRight() - j1;
            k1 = (l1 - q) + i1 + j1;
        }
        getGravity() & 0x70;
        JVM INSTR lookupswitch 2: default 148
    //                   16: 220
    //                   80: 254;
           goto _L1 _L2 _L3
_L1:
        j1 = getPaddingTop();
        i1 = j1 + r;
_L5:
        t = k1;
        u = j1;
        w = i1;
        v = l1;
        return;
_L2:
        j1 = ((getPaddingTop() + getHeight()) - getPaddingBottom()) / 2 - r / 2;
        i1 = j1 + r;
        continue; /* Loop/switch isn't completed */
_L3:
        i1 = getHeight() - getPaddingBottom();
        j1 = i1 - r;
        if (true) goto _L5; else goto _L4
_L4:
    }

    public void onMeasure(int i1, int j1)
    {
        if (i)
        {
            if (z == null)
            {
                z = a(g);
            }
            if (A == null)
            {
                A = a(h);
            }
        }
        Rect rect = D;
        int k1;
        int l1;
        int i2;
        int j2;
        int k2;
        int l2;
        if (a != null)
        {
            a.getPadding(rect);
            l1 = a.getIntrinsicWidth() - rect.left - rect.right;
            k1 = a.getIntrinsicHeight();
        } else
        {
            l1 = 0;
            k1 = 0;
        }
        if (i)
        {
            i2 = Math.max(z.getWidth(), A.getWidth()) + c * 2;
        } else
        {
            i2 = 0;
        }
        s = Math.max(i2, l1);
        if (b != null)
        {
            b.getPadding(rect);
            l1 = b.getIntrinsicHeight();
        } else
        {
            rect.setEmpty();
            l1 = 0;
        }
        l2 = rect.left;
        k2 = rect.right;
        j2 = l2;
        i2 = k2;
        if (a != null)
        {
            rect = android.support.v7.internal.widget.h.a(a);
            j2 = Math.max(l2, rect.left);
            i2 = Math.max(k2, rect.right);
        }
        i2 = Math.max(d, s * 2 + j2 + i2);
        k1 = Math.max(l1, k1);
        q = i2;
        r = k1;
        super.onMeasure(i1, j1);
        if (getMeasuredHeight() < k1)
        {
            setMeasuredDimension(android.support.v4.view.x.k(this), k1);
        }
    }

    public void onPopulateAccessibilityEvent(AccessibilityEvent accessibilityevent)
    {
        super.onPopulateAccessibilityEvent(accessibilityevent);
        CharSequence charsequence;
        if (isChecked())
        {
            charsequence = g;
        } else
        {
            charsequence = h;
        }
        if (charsequence != null)
        {
            accessibilityevent.getText().add(charsequence);
        }
    }

    public boolean onTouchEvent(MotionEvent motionevent)
    {
        float f8;
        boolean flag1;
        boolean flag2;
        f8 = 0.0F;
        flag1 = false;
        flag2 = true;
        n.addMovement(motionevent);
        android.support.v4.view.m.a(motionevent);
        JVM INSTR tableswitch 0 3: default 52
    //                   0 62
    //                   1 489
    //                   2 268
    //                   3 489;
           goto _L1 _L2 _L3 _L4 _L3
_L1:
        flag2 = super.onTouchEvent(motionevent);
_L6:
        return flag2;
_L2:
        float f1 = motionevent.getX();
        float f5 = motionevent.getY();
        if (isEnabled())
        {
            int i1 = ((flag1) ? 1 : 0);
            if (a != null)
            {
                i1 = b();
                a.getPadding(D);
                int k1 = u;
                int l1 = k;
                int i2 = (i1 + t) - k;
                int j2 = s;
                int k2 = D.left;
                int l2 = D.right;
                int i3 = k;
                int j3 = w;
                int k3 = k;
                i1 = ((flag1) ? 1 : 0);
                if (f1 > (float)i2)
                {
                    i1 = ((flag1) ? 1 : 0);
                    if (f1 < (float)(j2 + i2 + k2 + l2 + i3))
                    {
                        i1 = ((flag1) ? 1 : 0);
                        if (f5 > (float)(k1 - l1))
                        {
                            i1 = ((flag1) ? 1 : 0);
                            if (f5 < (float)(j3 + k3))
                            {
                                i1 = 1;
                            }
                        }
                    }
                }
            }
            if (i1 != 0)
            {
                j = 1;
                l = f1;
                m = f5;
            }
        }
        continue; /* Loop/switch isn't completed */
_L4:
        float f3;
        switch (j)
        {
        case 0: // '\0'
        default:
            continue; /* Loop/switch isn't completed */

        case 1: // '\001'
            float f2 = motionevent.getX();
            float f6 = motionevent.getY();
            if (Math.abs(f2 - l) > (float)k || Math.abs(f6 - m) > (float)k)
            {
                j = 2;
                getParent().requestDisallowInterceptTouchEvent(true);
                l = f2;
                m = f6;
                return true;
            }
            continue; /* Loop/switch isn't completed */

        case 2: // '\002'
            float f9 = motionevent.getX();
            int j1 = c();
            f3 = f9 - l;
            float f7;
            if (j1 != 0)
            {
                f3 /= j1;
            } else
            if (f3 > 0.0F)
            {
                f3 = 1.0F;
            } else
            {
                f3 = -1F;
            }
            f7 = f3;
            if (android.support.v7.internal.widget.r.a(this))
            {
                f7 = -f3;
            }
            f3 = p + f7;
            break;
        }
        if (f3 < 0.0F)
        {
            f3 = f8;
        } else
        if (f3 > 1.0F)
        {
            f3 = 1.0F;
        }
        if (f3 == p) goto _L6; else goto _L5
_L5:
        l = f9;
        a(f3);
        return true;
_L3:
        if (j == 2)
        {
            j = 0;
            boolean flag;
            boolean flag3;
            boolean flag4;
            if (motionevent.getAction() == 1 && isEnabled())
            {
                flag = true;
            } else
            {
                flag = false;
            }
            flag4 = isChecked();
            if (flag)
            {
                n.computeCurrentVelocity(1000);
                float f4 = n.getXVelocity();
                MotionEvent motionevent1;
                if (Math.abs(f4) > (float)o)
                {
                    if (android.support.v7.internal.widget.r.a(this))
                    {
                        if (f4 < 0.0F)
                        {
                            flag3 = true;
                        } else
                        {
                            flag3 = false;
                        }
                    } else
                    if (f4 > 0.0F)
                    {
                        flag3 = true;
                    } else
                    {
                        flag3 = false;
                    }
                } else
                {
                    flag3 = a();
                }
            } else
            {
                flag3 = flag4;
            }
            if (flag3 != flag4)
            {
                playSoundEffect(0);
                setChecked(flag3);
            }
            motionevent1 = MotionEvent.obtain(motionevent);
            motionevent1.setAction(3);
            super.onTouchEvent(motionevent1);
            motionevent1.recycle();
            super.onTouchEvent(motionevent);
            return true;
        }
        j = 0;
        n.clear();
        if (true) goto _L1; else goto _L7
_L7:
    }

    public void setChecked(boolean flag)
    {
        float f1 = 1.0F;
        super.setChecked(flag);
        flag = isChecked();
        if (getWindowToken() != null && android.support.v4.view.x.E(this))
        {
            float f2 = p;
            if (!flag)
            {
                f1 = 0.0F;
            }
            C = new a(f2, f1, (byte)0);
            C.setDuration(250L);
            startAnimation(C);
            return;
        }
        if (C != null)
        {
            clearAnimation();
            C = null;
        }
        if (!flag)
        {
            f1 = 0.0F;
        }
        a(f1);
    }

    public void setShowText(boolean flag)
    {
        if (i != flag)
        {
            i = flag;
            requestLayout();
        }
    }

    public void setSplitTrack(boolean flag)
    {
        f = flag;
        invalidate();
    }

    public void setSwitchMinWidth(int i1)
    {
        d = i1;
        requestLayout();
    }

    public void setSwitchPadding(int i1)
    {
        e = i1;
        requestLayout();
    }

    public void setSwitchTextAppearance(Context context, int i1)
    {
        TypedArray typedarray = context.obtainStyledAttributes(i1, android.support.v7.appcompat.a.k.TextAppearance);
        context = typedarray.getColorStateList(android.support.v7.appcompat.a.k.TextAppearance_android_textColor);
        int j1;
        if (context != null)
        {
            y = context;
        } else
        {
            y = getTextColors();
        }
        i1 = typedarray.getDimensionPixelSize(android.support.v7.appcompat.a.k.TextAppearance_android_textSize, 0);
        if (i1 != 0 && (float)i1 != x.getTextSize())
        {
            x.setTextSize(i1);
            requestLayout();
        }
        i1 = typedarray.getInt(android.support.v7.appcompat.a.k.TextAppearance_android_typeface, -1);
        j1 = typedarray.getInt(android.support.v7.appcompat.a.k.TextAppearance_android_textStyle, -1);
        i1;
        JVM INSTR tableswitch 1 3: default 112
    //                   1 163
    //                   2 170
    //                   3 177;
           goto _L1 _L2 _L3 _L4
_L4:
        break MISSING_BLOCK_LABEL_177;
_L1:
        context = null;
_L5:
        setSwitchTypeface(context, j1);
        if (typedarray.getBoolean(android.support.v7.appcompat.a.k.TextAppearance_textAllCaps, false))
        {
            B = new android.support.v7.internal.text.a(getContext());
        } else
        {
            B = null;
        }
        typedarray.recycle();
        return;
_L2:
        context = Typeface.SANS_SERIF;
          goto _L5
_L3:
        context = Typeface.SERIF;
          goto _L5
        context = Typeface.MONOSPACE;
          goto _L5
    }

    public void setSwitchTypeface(Typeface typeface)
    {
        if (x.getTypeface() != typeface)
        {
            x.setTypeface(typeface);
            requestLayout();
            invalidate();
        }
    }

    public void setSwitchTypeface(Typeface typeface, int i1)
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
            i1 &= ~j1;
            typeface = x;
            if ((i1 & 1) != 0)
            {
                flag = true;
            }
            typeface.setFakeBoldText(flag);
            typeface = x;
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
            x.setFakeBoldText(false);
            x.setTextSkewX(0.0F);
            setSwitchTypeface(typeface);
            return;
        }
    }

    public void setTextOff(CharSequence charsequence)
    {
        h = charsequence;
        requestLayout();
    }

    public void setTextOn(CharSequence charsequence)
    {
        g = charsequence;
        requestLayout();
    }

    public void setThumbDrawable(Drawable drawable)
    {
        a = drawable;
        requestLayout();
    }

    public void setThumbResource(int i1)
    {
        setThumbDrawable(E.a(i1));
    }

    public void setThumbTextPadding(int i1)
    {
        c = i1;
        requestLayout();
    }

    public void setTrackDrawable(Drawable drawable)
    {
        b = drawable;
        requestLayout();
    }

    public void setTrackResource(int i1)
    {
        setTrackDrawable(E.a(i1));
    }

    public void toggle()
    {
        boolean flag;
        if (!isChecked())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        setChecked(flag);
    }

    protected boolean verifyDrawable(Drawable drawable)
    {
        return super.verifyDrawable(drawable) || drawable == a || drawable == b;
    }

}
