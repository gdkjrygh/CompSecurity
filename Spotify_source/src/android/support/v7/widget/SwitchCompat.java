// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.widget;

import abx;
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
import android.widget.CompoundButton;
import dm;
import java.util.List;
import jo;
import km;
import sr;
import tn;
import vq;
import wc;
import we;

public class SwitchCompat extends CompoundButton
{

    private static final int E[] = {
        0x10100a0
    };
    private Layout A;
    private TransformationMethod B;
    private abx C;
    private final Rect D;
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
        this(context, attributeset, 0x7f010141);
    }

    public SwitchCompat(Context context, AttributeSet attributeset, int i1)
    {
        Object obj;
        super(context, attributeset, i1);
        n = VelocityTracker.obtain();
        D = new Rect();
        x = new TextPaint(1);
        obj = getResources();
        x.density = ((Resources) (obj)).getDisplayMetrics().density;
        obj = wc.a(context, attributeset, sr.bv, i1);
        a = ((wc) (obj)).a(sr.by);
        if (a != null)
        {
            a.setCallback(this);
        }
        b = ((wc) (obj)).a(sr.bF);
        if (b != null)
        {
            b.setCallback(this);
        }
        g = ((wc) (obj)).c(sr.bx);
        h = ((wc) (obj)).c(sr.bw);
        i = ((wc) (obj)).a(sr.bz, true);
        c = ((wc) (obj)).c(sr.bE, 0);
        d = ((wc) (obj)).c(sr.bB, 0);
        e = ((wc) (obj)).c(sr.bC, 0);
        f = ((wc) (obj)).a(sr.bA, false);
        i1 = ((wc) (obj)).e(sr.bD, 0);
        if (i1 == 0) goto _L2; else goto _L1
_L1:
        int j1;
        TypedArray typedarray = context.obtainStyledAttributes(i1, sr.bG);
        attributeset = typedarray.getColorStateList(sr.bH);
        if (attributeset != null)
        {
            y = attributeset;
        } else
        {
            y = getTextColors();
        }
        i1 = typedarray.getDimensionPixelSize(sr.bI, 0);
        if (i1 != 0 && (float)i1 != x.getTextSize())
        {
            x.setTextSize(i1);
            requestLayout();
        }
        i1 = typedarray.getInt(sr.bK, -1);
        j1 = typedarray.getInt(sr.bJ, -1);
        i1;
        JVM INSTR tableswitch 1 3: default 344
    //                   1 514
    //                   2 521
    //                   3 528;
           goto _L3 _L4 _L5 _L6
_L6:
        break MISSING_BLOCK_LABEL_528;
_L3:
        attributeset = null;
_L7:
        if (j1 > 0)
        {
            float f1;
            boolean flag;
            if (attributeset == null)
            {
                attributeset = Typeface.defaultFromStyle(j1);
            } else
            {
                attributeset = Typeface.create(attributeset, j1);
            }
            a(attributeset);
            if (attributeset != null)
            {
                i1 = attributeset.getStyle();
            } else
            {
                i1 = 0;
            }
            i1 = j1 & ~i1;
            attributeset = x;
            if ((i1 & 1) != 0)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            attributeset.setFakeBoldText(flag);
            attributeset = x;
            if ((i1 & 2) != 0)
            {
                f1 = -0.25F;
            } else
            {
                f1 = 0.0F;
            }
            attributeset.setTextSkewX(f1);
        } else
        {
            x.setFakeBoldText(false);
            x.setTextSkewX(0.0F);
            a(attributeset);
        }
        if (typedarray.getBoolean(sr.bL, false))
        {
            B = new tn(getContext());
        } else
        {
            B = null;
        }
        typedarray.recycle();
_L2:
        ((wc) (obj)).a();
        ((wc) (obj)).a.recycle();
        context = ViewConfiguration.get(context);
        k = context.getScaledTouchSlop();
        o = context.getScaledMinimumFlingVelocity();
        refreshDrawableState();
        setChecked(isChecked());
        return;
_L4:
        attributeset = Typeface.SANS_SERIF;
          goto _L7
_L5:
        attributeset = Typeface.SERIF;
          goto _L7
        attributeset = Typeface.MONOSPACE;
          goto _L7
    }

    static abx a(SwitchCompat switchcompat)
    {
        return switchcompat.C;
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

    private void a()
    {
        if (C != null)
        {
            clearAnimation();
            C = null;
        }
    }

    private void a(float f1)
    {
        p = f1;
        invalidate();
    }

    private void a(Typeface typeface)
    {
        if (x.getTypeface() != typeface)
        {
            x.setTypeface(typeface);
            requestLayout();
            invalidate();
        }
    }

    public static void a(SwitchCompat switchcompat, float f1)
    {
        switchcompat.a(f1);
    }

    static abx b(SwitchCompat switchcompat)
    {
        switchcompat.C = null;
        return null;
    }

    private boolean b()
    {
        return p > 0.5F;
    }

    private int c()
    {
        float f1;
        if (we.a(this))
        {
            f1 = 1.0F - p;
        } else
        {
            f1 = p;
        }
        return (int)(f1 * (float)d() + 0.5F);
    }

    private int d()
    {
        if (b != null)
        {
            Rect rect1 = D;
            b.getPadding(rect1);
            Rect rect;
            if (a != null)
            {
                rect = vq.a(a);
            } else
            {
                rect = vq.a;
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
        int j1 = t;
        int i2 = u;
        int k2 = v;
        int j2 = w;
        int l2 = j1 + c();
        Object obj;
        int i1;
        if (a != null)
        {
            obj = vq.a(a);
        } else
        {
            obj = vq.a;
        }
        if (b != null)
        {
            b.getPadding(rect);
            int i3 = rect.left;
            int k1;
            int l1;
            if (obj != null)
            {
                i1 = j1;
                if (((Rect) (obj)).left > rect.left)
                {
                    i1 = j1 + (((Rect) (obj)).left - rect.left);
                }
                if (((Rect) (obj)).top > rect.top)
                {
                    j1 = (((Rect) (obj)).top - rect.top) + i2;
                } else
                {
                    j1 = i2;
                }
                l1 = k2;
                if (((Rect) (obj)).right > rect.right)
                {
                    l1 = k2 - (((Rect) (obj)).right - rect.right);
                }
                if (((Rect) (obj)).bottom > rect.bottom)
                {
                    k1 = j2 - (((Rect) (obj)).bottom - rect.bottom);
                } else
                {
                    k1 = j2;
                }
            } else
            {
                k1 = j2;
                l1 = i2;
                i1 = j1;
                j1 = l1;
                l1 = k2;
            }
            b.setBounds(i1, j1, l1, k1);
            i1 = i3 + l2;
        } else
        {
            i1 = l2;
        }
        if (a != null)
        {
            a.getPadding(rect);
            j1 = i1 - rect.left;
            i1 = i1 + s + rect.right;
            a.setBounds(j1, i2, i1, j2);
            obj = getBackground();
            if (obj != null)
            {
                dm.a(((Drawable) (obj)), j1, i2, i1, j2);
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
            dm.a(a, f1, f2);
        }
        if (b != null)
        {
            dm.a(b, f1, f2);
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
        if (!we.a(this))
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
        if (we.a(this))
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
            a();
        }
    }

    protected int[] onCreateDrawableState(int i1)
    {
        int ai[] = super.onCreateDrawableState(i1 + 1);
        if (isChecked())
        {
            mergeDrawableStates(ai, E);
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
                Rect rect = vq.a(((Drawable) (obj1)));
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
        if (b())
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
                j1 = ((Rect) (obj1)).left;
                j1 = ((Rect) (obj1)).right + j1;
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
        boolean flag1 = false;
        super.onLayout(flag, i1, j1, k1, l1);
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
            rect1 = vq.a(a);
            j1 = Math.max(0, rect1.left - rect.left);
            i1 = Math.max(0, rect1.right - rect.right);
        } else
        {
            j1 = 0;
            i1 = ((flag1) ? 1 : 0);
        }
        if (we.a(this))
        {
            k1 = getPaddingLeft() + j1;
            l1 = (q + k1) - j1 - i1;
        } else
        {
            l1 = getWidth() - getPaddingRight() - i1;
            k1 = i1 + (j1 + (l1 - q));
        }
        getGravity() & 0x70;
        JVM INSTR lookupswitch 2: default 148
    //                   16: 220
    //                   80: 254;
           goto _L1 _L2 _L3
_L1:
        j1 = getPaddingTop();
        i1 = r + j1;
_L5:
        t = k1;
        u = j1;
        w = i1;
        v = l1;
        return;
_L2:
        j1 = ((getPaddingTop() + getHeight()) - getPaddingBottom()) / 2 - r / 2;
        i1 = r + j1;
        continue; /* Loop/switch isn't completed */
_L3:
        i1 = getHeight() - getPaddingBottom();
        j1 = i1 - r;
        if (true) goto _L5; else goto _L4
_L4:
    }

    public void onMeasure(int i1, int j1)
    {
        int j2 = 0;
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
        int k2;
        int l2;
        if (a != null)
        {
            a.getPadding(rect);
            l1 = a.getIntrinsicWidth() - rect.left - rect.right;
            k1 = a.getIntrinsicHeight();
        } else
        {
            k1 = 0;
            l1 = 0;
        }
        if (i)
        {
            i2 = Math.max(z.getWidth(), A.getWidth()) + (c << 1);
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
            l1 = j2;
        }
        l2 = rect.left;
        k2 = rect.right;
        j2 = l2;
        i2 = k2;
        if (a != null)
        {
            rect = vq.a(a);
            j2 = Math.max(l2, rect.left);
            i2 = Math.max(k2, rect.right);
        }
        i2 = Math.max(d, j2 + s * 2 + i2);
        k1 = Math.max(l1, k1);
        q = i2;
        r = k1;
        super.onMeasure(i1, j1);
        if (getMeasuredHeight() < k1)
        {
            setMeasuredDimension(km.k(this), k1);
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
        f8 = 1.0F;
        flag1 = false;
        flag2 = true;
        n.addMovement(motionevent);
        jo.a(motionevent);
        JVM INSTR tableswitch 0 3: default 52
    //                   0 62
    //                   1 488
    //                   2 268
    //                   3 488;
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
                i1 = c();
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
        float f7;
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
            int j1 = d();
            f3 = f9 - l;
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
            if (we.a(this))
            {
                f7 = -f3;
            }
            f7 += p;
            break;
        }
        if (f7 >= 0.0F)
        {
            break; /* Loop/switch isn't completed */
        }
        f3 = 0.0F;
_L7:
        if (f3 != p)
        {
            l = f9;
            a(f3);
            return true;
        }
        if (true) goto _L6; else goto _L5
_L5:
        f3 = f8;
        if (f7 <= 1.0F)
        {
            f3 = f7;
        }
          goto _L7
          goto _L6
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
                    if (we.a(this))
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
                    flag3 = b();
                }
            } else
            {
                flag3 = flag4;
            }
            if (flag3 != flag4)
            {
                playSoundEffect(0);
            }
            setChecked(flag3);
            motionevent1 = MotionEvent.obtain(motionevent);
            motionevent1.setAction(3);
            super.onTouchEvent(motionevent1);
            motionevent1.recycle();
            super.onTouchEvent(motionevent);
            return true;
        }
        j = 0;
        n.clear();
        if (true) goto _L1; else goto _L8
_L8:
    }

    public void setChecked(boolean flag)
    {
        float f1 = 1.0F;
        super.setChecked(flag);
        flag = isChecked();
        if (getWindowToken() != null && km.B(this) && isShown())
        {
            if (C != null)
            {
                a();
            }
            float f2 = p;
            if (!flag)
            {
                f1 = 0.0F;
            }
            C = new abx(this, f2, f1, (byte)0);
            C.setDuration(250L);
            C.setAnimationListener(new android.view.animation.Animation.AnimationListener(flag) {

                private boolean a;
                private SwitchCompat b;

                public final void onAnimationEnd(Animation animation)
                {
                    if (SwitchCompat.a(b) == animation)
                    {
                        animation = b;
                        float f3;
                        if (a)
                        {
                            f3 = 1.0F;
                        } else
                        {
                            f3 = 0.0F;
                        }
                        SwitchCompat.a(animation, f3);
                        SwitchCompat.b(b);
                    }
                }

                public final void onAnimationRepeat(Animation animation)
                {
                }

                public final void onAnimationStart(Animation animation)
                {
                }

            
            {
                b = SwitchCompat.this;
                a = flag;
                super();
            }
            });
            startAnimation(C);
            return;
        }
        a();
        if (!flag)
        {
            f1 = 0.0F;
        }
        a(f1);
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
