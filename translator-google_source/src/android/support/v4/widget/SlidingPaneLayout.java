// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.widget;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.support.v4.view.at;
import android.support.v4.view.bt;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import java.util.ArrayList;

// Referenced classes of package android.support.v4.widget:
//            bt, bs, br, bk, 
//            bm, cf, bn, bl, 
//            bq, bo

public class SlidingPaneLayout extends ViewGroup
{

    static final bq a;
    private int b;
    private int c;
    private Drawable d;
    private Drawable e;
    private final int f;
    private boolean g;
    private View h;
    private float i;
    private float j;
    private int k;
    private boolean l;
    private int m;
    private float n;
    private float o;
    private bo p;
    private final cf q;
    private boolean r;
    private boolean s;
    private final Rect t;
    private final ArrayList u;

    public SlidingPaneLayout(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, (byte)0);
    }

    private SlidingPaneLayout(Context context, AttributeSet attributeset, byte byte0)
    {
        super(context, attributeset, 0);
        b = 0xcccccccc;
        s = true;
        t = new Rect();
        u = new ArrayList();
        float f1 = context.getResources().getDisplayMetrics().density;
        f = (int)(32F * f1 + 0.5F);
        ViewConfiguration.get(context);
        setWillNotDraw(false);
        bt.a(this, new bk(this));
        bt.c(this, 1);
        q = cf.a(this, 0.5F, new bm(this));
        q.h = f1 * 400F;
    }

    static void a(SlidingPaneLayout slidingpanelayout, int i1)
    {
        if (slidingpanelayout.h == null)
        {
            slidingpanelayout.i = 0.0F;
        } else
        {
            boolean flag = slidingpanelayout.c();
            bn bn1 = (bn)slidingpanelayout.h.getLayoutParams();
            int k1 = slidingpanelayout.h.getWidth();
            int j1 = i1;
            if (flag)
            {
                j1 = slidingpanelayout.getWidth() - i1 - k1;
            }
            if (flag)
            {
                i1 = slidingpanelayout.getPaddingRight();
            } else
            {
                i1 = slidingpanelayout.getPaddingLeft();
            }
            if (flag)
            {
                k1 = bn1.rightMargin;
            } else
            {
                k1 = bn1.leftMargin;
            }
            slidingpanelayout.i = (float)(j1 - (k1 + i1)) / (float)slidingpanelayout.k;
            if (slidingpanelayout.m != 0)
            {
                slidingpanelayout.b(slidingpanelayout.i);
            }
            if (bn1.c)
            {
                slidingpanelayout.a(slidingpanelayout.h, slidingpanelayout.i, slidingpanelayout.b);
                return;
            }
        }
    }

    static void a(SlidingPaneLayout slidingpanelayout, View view)
    {
        slidingpanelayout.c(view);
    }

    private void a(View view, float f1, int i1)
    {
        bn bn1 = (bn)view.getLayoutParams();
        if (f1 > 0.0F && i1 != 0)
        {
            int j1 = (int)((float)((0xff000000 & i1) >>> 24) * f1);
            if (bn1.d == null)
            {
                bn1.d = new Paint();
            }
            bn1.d.setColorFilter(new PorterDuffColorFilter(j1 << 24 | 0xffffff & i1, android.graphics.PorterDuff.Mode.SRC_OVER));
            if (bt.d(view) != 2)
            {
                bt.a(view, 2, bn1.d);
            }
            c(view);
        } else
        if (bt.d(view) != 0)
        {
            if (bn1.d != null)
            {
                bn1.d.setColorFilter(null);
            }
            view = new bl(this, view);
            u.add(view);
            bt.a(this, view);
            return;
        }
    }

    private boolean a(float f1)
    {
        if (!g)
        {
            return false;
        }
        boolean flag = c();
        bn bn1 = (bn)h.getLayoutParams();
        int i1;
        if (flag)
        {
            i1 = getPaddingRight();
            int j1 = bn1.rightMargin;
            int k1 = h.getWidth();
            i1 = (int)((float)getWidth() - ((float)(j1 + i1) + (float)k * f1 + (float)k1));
        } else
        {
            i1 = getPaddingLeft();
            i1 = (int)((float)(bn1.leftMargin + i1) + (float)k * f1);
        }
        if (q.a(h, i1, h.getTop()))
        {
            a();
            bt.b(this);
            return true;
        } else
        {
            return false;
        }
    }

    static boolean a(SlidingPaneLayout slidingpanelayout)
    {
        return slidingpanelayout.l;
    }

    static boolean a(SlidingPaneLayout slidingpanelayout, boolean flag)
    {
        slidingpanelayout.r = flag;
        return flag;
    }

    static cf b(SlidingPaneLayout slidingpanelayout)
    {
        return slidingpanelayout.q;
    }

    private void b(float f1)
    {
        int i1;
        boolean flag = c();
        Object obj = (bn)h.getLayoutParams();
        if (!((bn) (obj)).c)
        {
            break MISSING_BLOCK_LABEL_174;
        }
        int j1;
        int k1;
        int l1;
        int i2;
        if (flag)
        {
            i1 = ((bn) (obj)).rightMargin;
        } else
        {
            i1 = ((bn) (obj)).leftMargin;
        }
        if (i1 > 0)
        {
            break MISSING_BLOCK_LABEL_174;
        }
        i1 = 1;
_L1:
        i2 = getChildCount();
        j1 = 0;
        while (j1 < i2) 
        {
            obj = getChildAt(j1);
            if (obj != h)
            {
                k1 = (int)((1.0F - j) * (float)m);
                j = f1;
                l1 = k1 - (int)((1.0F - f1) * (float)m);
                k1 = l1;
                if (flag)
                {
                    k1 = -l1;
                }
                ((View) (obj)).offsetLeftAndRight(k1);
                if (i1 != 0)
                {
                    float f2;
                    if (flag)
                    {
                        f2 = j - 1.0F;
                    } else
                    {
                        f2 = 1.0F - j;
                    }
                    a(((View) (obj)), f2, c);
                }
            }
            j1++;
        }
        break MISSING_BLOCK_LABEL_190;
        i1 = 0;
          goto _L1
    }

    private boolean b()
    {
        boolean flag = false;
        if (s || a(0.0F))
        {
            r = false;
            flag = true;
        }
        return flag;
    }

    static float c(SlidingPaneLayout slidingpanelayout)
    {
        return slidingpanelayout.i;
    }

    private void c(View view)
    {
        a.a(this, view);
    }

    private boolean c()
    {
        return bt.e(this) == 1;
    }

    static View d(SlidingPaneLayout slidingpanelayout)
    {
        return slidingpanelayout.h;
    }

    static boolean e(SlidingPaneLayout slidingpanelayout)
    {
        return slidingpanelayout.c();
    }

    static int f(SlidingPaneLayout slidingpanelayout)
    {
        return slidingpanelayout.k;
    }

    static ArrayList g(SlidingPaneLayout slidingpanelayout)
    {
        return slidingpanelayout.u;
    }

    final void a()
    {
        int j1 = getChildCount();
        for (int i1 = 0; i1 < j1; i1++)
        {
            View view = getChildAt(i1);
            if (view.getVisibility() == 4)
            {
                view.setVisibility(0);
            }
        }

    }

    final void a(View view)
    {
        int i1;
        int j1;
        int k1;
        int l1;
        int i2;
        int j2;
        boolean flag = c();
        View view1;
        int k2;
        int i3;
        int j3;
        int k3;
        int l3;
        int i4;
        int j4;
        int k4;
        if (flag)
        {
            i1 = getWidth() - getPaddingRight();
        } else
        {
            i1 = getPaddingLeft();
        }
        if (flag)
        {
            j1 = getPaddingLeft();
        } else
        {
            j1 = getWidth() - getPaddingRight();
        }
        i3 = getPaddingTop();
        j3 = getHeight();
        k3 = getPaddingBottom();
        if (view == null) goto _L2; else goto _L1
_L1:
        if (!bt.g(view)) goto _L4; else goto _L3
_L3:
        k1 = 1;
_L6:
        if (k1 != 0)
        {
            j2 = view.getLeft();
            i2 = view.getRight();
            l1 = view.getTop();
            k1 = view.getBottom();
            break MISSING_BLOCK_LABEL_93;
        }
          goto _L2
_L4:
        if (android.os.Build.VERSION.SDK_INT < 18)
        {
            Drawable drawable = view.getBackground();
            if (drawable != null)
            {
                if (drawable.getOpacity() == -1)
                {
                    k1 = 1;
                } else
                {
                    k1 = 0;
                }
                continue; /* Loop/switch isn't completed */
            }
        }
        k1 = 0;
        continue; /* Loop/switch isn't completed */
_L2:
        k1 = 0;
        l1 = 0;
        i2 = 0;
        j2 = 0;
        l3 = getChildCount();
        k2 = 0;
        do
        {
            if (k2 >= l3)
            {
                break;
            }
            view1 = getChildAt(k2);
            if (view1 == view)
            {
                break;
            }
            int l2;
            if (flag)
            {
                l2 = j1;
            } else
            {
                l2 = i1;
            }
            i4 = Math.max(l2, view1.getLeft());
            j4 = Math.max(i3, view1.getTop());
            if (flag)
            {
                l2 = i1;
            } else
            {
                l2 = j1;
            }
            l2 = Math.min(l2, view1.getRight());
            k4 = Math.min(j3 - k3, view1.getBottom());
            if (i4 >= j2 && j4 >= l1 && l2 <= i2 && k4 <= k1)
            {
                l2 = 4;
            } else
            {
                l2 = 0;
            }
            view1.setVisibility(l2);
            k2++;
        } while (true);
        return;
        if (true) goto _L6; else goto _L5
_L5:
    }

    final boolean b(View view)
    {
        if (view == null)
        {
            return false;
        }
        view = (bn)view.getLayoutParams();
        return g && ((bn) (view)).c && i > 0.0F;
    }

    protected boolean checkLayoutParams(android.view.ViewGroup.LayoutParams layoutparams)
    {
        return (layoutparams instanceof bn) && super.checkLayoutParams(layoutparams);
    }

    public void computeScroll()
    {
label0:
        {
            if (q.c())
            {
                if (g)
                {
                    break label0;
                }
                q.b();
            }
            return;
        }
        bt.b(this);
    }

    public void draw(Canvas canvas)
    {
        super.draw(canvas);
        Drawable drawable;
        View view;
        if (c())
        {
            drawable = e;
        } else
        {
            drawable = d;
        }
        if (getChildCount() > 1)
        {
            view = getChildAt(1);
        } else
        {
            view = null;
        }
        if (view == null || drawable == null)
        {
            return;
        }
        int k1 = view.getTop();
        int l1 = view.getBottom();
        int i2 = drawable.getIntrinsicWidth();
        int i1;
        int j1;
        if (c())
        {
            j1 = view.getRight();
            i1 = j1 + i2;
        } else
        {
            i1 = view.getLeft();
            j1 = i1 - i2;
        }
        drawable.setBounds(j1, k1, i1, l1);
        drawable.draw(canvas);
    }

    protected boolean drawChild(Canvas canvas, View view, long l1)
    {
        boolean flag;
        bn bn1 = (bn)view.getLayoutParams();
        int i1 = canvas.save(2);
        if (g && !bn1.b && h != null)
        {
            canvas.getClipBounds(t);
            android.graphics.Bitmap bitmap;
            if (c())
            {
                t.left = Math.max(t.left, h.getRight());
            } else
            {
                t.right = Math.min(t.right, h.getLeft());
            }
            canvas.clipRect(t);
        }
        if (android.os.Build.VERSION.SDK_INT >= 11) goto _L2; else goto _L1
_L1:
        if (!bn1.c || i <= 0.0F) goto _L4; else goto _L3
_L3:
        if (!view.isDrawingCacheEnabled())
        {
            view.setDrawingCacheEnabled(true);
        }
        bitmap = view.getDrawingCache();
        if (bitmap == null) goto _L6; else goto _L5
_L5:
        canvas.drawBitmap(bitmap, view.getLeft(), view.getTop(), bn1.d);
        flag = false;
_L7:
        canvas.restoreToCount(i1);
        return flag;
_L6:
        (new StringBuilder("drawChild: child view ")).append(view).append(" returned null drawing cache");
_L2:
        flag = super.drawChild(canvas, view, l1);
        if (true) goto _L7; else goto _L4
_L4:
        if (view.isDrawingCacheEnabled())
        {
            view.setDrawingCacheEnabled(false);
        }
          goto _L2
    }

    protected android.view.ViewGroup.LayoutParams generateDefaultLayoutParams()
    {
        return new bn();
    }

    public android.view.ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeset)
    {
        return new bn(getContext(), attributeset);
    }

    protected android.view.ViewGroup.LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams layoutparams)
    {
        if (layoutparams instanceof android.view.ViewGroup.MarginLayoutParams)
        {
            return new bn((android.view.ViewGroup.MarginLayoutParams)layoutparams);
        } else
        {
            return new bn(layoutparams);
        }
    }

    public int getCoveredFadeColor()
    {
        return c;
    }

    public int getParallaxDistance()
    {
        return m;
    }

    public int getSliderFadeColor()
    {
        return b;
    }

    protected void onAttachedToWindow()
    {
        super.onAttachedToWindow();
        s = true;
    }

    protected void onDetachedFromWindow()
    {
        super.onDetachedFromWindow();
        s = true;
        int j1 = u.size();
        for (int i1 = 0; i1 < j1; i1++)
        {
            ((bl)u.get(i1)).run();
        }

        u.clear();
    }

    public boolean onInterceptTouchEvent(MotionEvent motionevent)
    {
        int i1;
        boolean flag;
        boolean flag1;
        flag1 = false;
        i1 = at.a(motionevent);
        if (!g && i1 == 0 && getChildCount() > 1)
        {
            View view = getChildAt(1);
            if (view != null)
            {
                if (!cf.b(view, (int)motionevent.getX(), (int)motionevent.getY()))
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                r = flag;
            }
        }
        if (g && (!l || i1 == 0)) goto _L2; else goto _L1
_L1:
        q.a();
        flag = super.onInterceptTouchEvent(motionevent);
_L7:
        return flag;
_L2:
        if (i1 == 3 || i1 == 1)
        {
            q.a();
            return false;
        }
        i1;
        JVM INSTR tableswitch 0 2: default 160
    //                   0 185
    //                   1 160
    //                   2 241;
           goto _L3 _L4 _L3 _L5
_L3:
        i1 = 0;
_L9:
        if (q.a(motionevent))
        {
            break; /* Loop/switch isn't completed */
        }
        flag = flag1;
        if (!i1) goto _L7; else goto _L6
_L6:
        return true;
_L4:
        float f1;
        float f3;
        l = false;
        f1 = motionevent.getX();
        f3 = motionevent.getY();
        n = f1;
        o = f3;
        if (!cf.b(h, (int)f1, (int)f3) || !b(h)) goto _L3; else goto _L8
_L8:
        i1 = 1;
          goto _L9
_L5:
        float f4 = motionevent.getX();
        float f2 = motionevent.getY();
        f4 = Math.abs(f4 - n);
        f2 = Math.abs(f2 - o);
        if (f4 > (float)q.b && f2 > f4)
        {
            q.a();
            l = true;
            return false;
        }
          goto _L3
    }

    protected void onLayout(boolean flag, int i1, int j1, int k1, int l1)
    {
        boolean flag2 = c();
        int i3;
        int j3;
        int k3;
        if (flag2)
        {
            q.j = 2;
        } else
        {
            q.j = 1;
        }
        i3 = k1 - i1;
        if (flag2)
        {
            i1 = getPaddingRight();
        } else
        {
            i1 = getPaddingLeft();
        }
        if (flag2)
        {
            k1 = getPaddingLeft();
        } else
        {
            k1 = getPaddingRight();
        }
        k3 = getPaddingTop();
        j3 = getChildCount();
        if (s)
        {
            float f1;
            View view;
            int i2;
            boolean flag1;
            int i4;
            if (g && r)
            {
                f1 = 1.0F;
            } else
            {
                f1 = 0.0F;
            }
            i = f1;
        }
        l1 = 0;
        j1 = i1;
        while (l1 < j3) 
        {
            view = getChildAt(l1);
            if (view.getVisibility() != 8)
            {
                bn bn1 = (bn)view.getLayoutParams();
                int l3 = view.getMeasuredWidth();
                flag1 = false;
                int j2;
                int l2;
                if (bn1.b)
                {
                    i2 = bn1.leftMargin;
                    i4 = bn1.rightMargin;
                    i4 = Math.min(i1, i3 - k1 - f) - j1 - (i2 + i4);
                    k = i4;
                    if (flag2)
                    {
                        j2 = bn1.rightMargin;
                    } else
                    {
                        j2 = bn1.leftMargin;
                    }
                    if (j1 + j2 + i4 + l3 / 2 > i3 - k1)
                    {
                        flag = true;
                    } else
                    {
                        flag = false;
                    }
                    bn1.c = flag;
                    i4 = (int)((float)i4 * i);
                    j1 += j2 + i4;
                    i = (float)i4 / (float)k;
                    j2 = ((flag1) ? 1 : 0);
                } else
                {
                    if (g && m != 0)
                    {
                        j1 = (int)((1.0F - i) * (float)m);
                    } else
                    {
                        j1 = 0;
                    }
                    j2 = j1;
                    j1 = i1;
                }
                if (flag2)
                {
                    l2 = (i3 - j1) + j2;
                    j2 = l2 - l3;
                } else
                {
                    j2 = j1 - j2;
                    l2 = j2 + l3;
                }
                view.layout(j2, k3, l2, view.getMeasuredHeight() + k3);
                j2 = view.getWidth() + i1;
                i1 = j1;
                j1 = j2;
            } else
            {
                int k2 = j1;
                j1 = i1;
                i1 = k2;
            }
            j2 = l1 + 1;
            l1 = i1;
            i1 = j1;
            j1 = l1;
            l1 = j2;
        }
        if (s)
        {
            if (g)
            {
                if (m != 0)
                {
                    b(i);
                }
                if (((bn)h.getLayoutParams()).c)
                {
                    a(h, i, b);
                }
            } else
            {
                i1 = 0;
                while (i1 < j3) 
                {
                    a(getChildAt(i1), 0.0F, b);
                    i1++;
                }
            }
            a(h);
        }
        s = false;
    }

    protected void onMeasure(int i1, int j1)
    {
        int k1;
        int l1;
        int i2;
        i2 = android.view.View.MeasureSpec.getMode(i1);
        k1 = android.view.View.MeasureSpec.getSize(i1);
        l1 = android.view.View.MeasureSpec.getMode(j1);
        i1 = android.view.View.MeasureSpec.getSize(j1);
        if (i2 == 0x40000000) goto _L2; else goto _L1
_L1:
        if (!isInEditMode()) goto _L4; else goto _L3
_L3:
        if (i2 == 0x80000000 || i2 != 0) goto _L6; else goto _L5
_L5:
        k1 = l1;
        l1 = 300;
_L21:
        k1;
        JVM INSTR lookupswitch 2: default 88
    //                   -2147483648: 270
    //                   1073741824: 252;
           goto _L7 _L8 _L9
_L7:
        i1 = 0;
        i2 = -1;
_L15:
        float f1;
        int j4;
        int l4;
        int i5;
        boolean flag;
        flag = false;
        l4 = l1 - getPaddingLeft() - getPaddingRight();
        i5 = getChildCount();
        h = null;
        j4 = 0;
        j1 = l4;
        f1 = 0.0F;
_L14:
        if (j4 >= i5) goto _L11; else goto _L10
_L10:
        View view;
        bn bn1;
        view = getChildAt(j4);
        bn1 = (bn)view.getLayoutParams();
        if (view.getVisibility() != 8) goto _L13; else goto _L12
_L12:
        bn1.c = false;
        int j2 = j1;
        j1 = i1;
        i1 = j2;
_L19:
        j4++;
        int k2 = j1;
        j1 = i1;
        i1 = k2;
          goto _L14
_L4:
        throw new IllegalStateException("Width must have an exact value or MATCH_PARENT");
_L2:
        if (l1 == 0)
        {
            if (isInEditMode())
            {
                if (l1 == 0)
                {
                    j1 = 0x80000000;
                    l1 = k1;
                    i1 = 300;
                    k1 = j1;
                    continue; /* Loop/switch isn't completed */
                }
            } else
            {
                throw new IllegalStateException("Height must not be UNSPECIFIED");
            }
        }
          goto _L6
_L9:
        i1 = i1 - getPaddingTop() - getPaddingBottom();
        i2 = i1;
          goto _L15
_L8:
        i2 = getPaddingTop();
        int l2 = getPaddingBottom();
        j1 = 0;
        i2 = i1 - i2 - l2;
        i1 = j1;
          goto _L15
_L13:
        float f2 = f1;
        if (bn1.a <= 0.0F) goto _L17; else goto _L16
_L16:
        f2 = f1 + bn1.a;
        if (bn1.width == 0) goto _L18; else goto _L17
_L17:
        int i3 = bn1.leftMargin + bn1.rightMargin;
        int l3;
        int j5;
        boolean flag1;
        if (bn1.width == -2)
        {
            i3 = android.view.View.MeasureSpec.makeMeasureSpec(l4 - i3, 0x80000000);
        } else
        if (bn1.width == -1)
        {
            i3 = android.view.View.MeasureSpec.makeMeasureSpec(l4 - i3, 0x40000000);
        } else
        {
            i3 = android.view.View.MeasureSpec.makeMeasureSpec(bn1.width, 0x40000000);
        }
        if (bn1.height == -2)
        {
            l3 = android.view.View.MeasureSpec.makeMeasureSpec(i2, 0x80000000);
        } else
        if (bn1.height == -1)
        {
            l3 = android.view.View.MeasureSpec.makeMeasureSpec(i2, 0x40000000);
        } else
        {
            l3 = android.view.View.MeasureSpec.makeMeasureSpec(bn1.height, 0x40000000);
        }
        view.measure(i3, l3);
        l3 = view.getMeasuredWidth();
        j5 = view.getMeasuredHeight();
        i3 = i1;
        if (k1 == 0x80000000)
        {
            i3 = i1;
            if (j5 > i1)
            {
                i3 = Math.min(j5, i2);
            }
        }
        i1 = j1 - l3;
        if (i1 < 0)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        bn1.b = flag1;
        if (bn1.b)
        {
            h = view;
        }
        f1 = f2;
        flag = flag1 | flag;
        j1 = i3;
          goto _L19
_L11:
        if (flag || f1 > 0.0F)
        {
            int k4 = l4 - f;
            int j3 = 0;
            while (j3 < i5) 
            {
                View view1 = getChildAt(j3);
                if (view1.getVisibility() == 8)
                {
                    continue;
                }
                bn bn2 = (bn)view1.getLayoutParams();
                if (view1.getVisibility() != 8)
                {
                    int i4;
                    if (bn2.width == 0 && bn2.a > 0.0F)
                    {
                        k1 = 1;
                    } else
                    {
                        k1 = 0;
                    }
                    if (k1 != 0)
                    {
                        i4 = 0;
                    } else
                    {
                        i4 = view1.getMeasuredWidth();
                    }
                    if (flag && view1 != h)
                    {
                        if (bn2.width < 0 && (i4 > k4 || bn2.a > 0.0F))
                        {
                            if (k1 != 0)
                            {
                                if (bn2.height == -2)
                                {
                                    k1 = android.view.View.MeasureSpec.makeMeasureSpec(i2, 0x80000000);
                                } else
                                if (bn2.height == -1)
                                {
                                    k1 = android.view.View.MeasureSpec.makeMeasureSpec(i2, 0x40000000);
                                } else
                                {
                                    k1 = android.view.View.MeasureSpec.makeMeasureSpec(bn2.height, 0x40000000);
                                }
                            } else
                            {
                                k1 = android.view.View.MeasureSpec.makeMeasureSpec(view1.getMeasuredHeight(), 0x40000000);
                            }
                            view1.measure(android.view.View.MeasureSpec.makeMeasureSpec(k4, 0x40000000), k1);
                        }
                    } else
                    if (bn2.a > 0.0F)
                    {
                        if (bn2.width == 0)
                        {
                            if (bn2.height == -2)
                            {
                                k1 = android.view.View.MeasureSpec.makeMeasureSpec(i2, 0x80000000);
                            } else
                            if (bn2.height == -1)
                            {
                                k1 = android.view.View.MeasureSpec.makeMeasureSpec(i2, 0x40000000);
                            } else
                            {
                                k1 = android.view.View.MeasureSpec.makeMeasureSpec(bn2.height, 0x40000000);
                            }
                        } else
                        {
                            k1 = android.view.View.MeasureSpec.makeMeasureSpec(view1.getMeasuredHeight(), 0x40000000);
                        }
                        if (flag)
                        {
                            int k5 = bn2.leftMargin;
                            k5 = l4 - (bn2.rightMargin + k5);
                            int i6 = android.view.View.MeasureSpec.makeMeasureSpec(k5, 0x40000000);
                            if (i4 != k5)
                            {
                                view1.measure(i6, k1);
                            }
                        } else
                        {
                            int l5 = Math.max(0, j1);
                            view1.measure(android.view.View.MeasureSpec.makeMeasureSpec((int)((bn2.a * (float)l5) / f1) + i4, 0x40000000), k1);
                        }
                    }
                }
                j3++;
            }
        }
        setMeasuredDimension(l1, getPaddingTop() + i1 + getPaddingBottom());
        g = flag;
        if (q.a != 0 && !flag)
        {
            q.b();
        }
        return;
_L18:
        int k3 = i1;
        f1 = f2;
        i1 = j1;
        j1 = k3;
          goto _L19
_L6:
        j1 = l1;
        l1 = k1;
        k1 = j1;
        if (true) goto _L21; else goto _L20
_L20:
    }

    protected void onRestoreInstanceState(Parcelable parcelable)
    {
        parcelable = (SavedState)parcelable;
        super.onRestoreInstanceState(parcelable.getSuperState());
        if (((SavedState) (parcelable)).a)
        {
            if (s || a(1.0F))
            {
                r = true;
            }
        } else
        {
            b();
        }
        r = ((SavedState) (parcelable)).a;
    }

    protected Parcelable onSaveInstanceState()
    {
        SavedState savedstate = new SavedState(super.onSaveInstanceState());
        boolean flag;
        if (g)
        {
            if (!g || i == 1.0F)
            {
                flag = true;
            } else
            {
                flag = false;
            }
        } else
        {
            flag = r;
        }
        savedstate.a = flag;
        return savedstate;
    }

    protected void onSizeChanged(int i1, int j1, int k1, int l1)
    {
        super.onSizeChanged(i1, j1, k1, l1);
        if (i1 != k1)
        {
            s = true;
        }
    }

    public boolean onTouchEvent(MotionEvent motionevent)
    {
        if (!g)
        {
            return super.onTouchEvent(motionevent);
        }
        q.b(motionevent);
        motionevent.getAction() & 0xff;
        JVM INSTR tableswitch 0 1: default 52
    //                   0 54
    //                   1 77;
           goto _L1 _L2 _L3
_L1:
        return true;
_L2:
        float f1 = motionevent.getX();
        float f3 = motionevent.getY();
        n = f1;
        o = f3;
        continue; /* Loop/switch isn't completed */
_L3:
        if (b(h))
        {
            float f2 = motionevent.getX();
            float f4 = motionevent.getY();
            float f5 = f2 - n;
            float f6 = f4 - o;
            int i1 = q.b;
            if (f5 * f5 + f6 * f6 < (float)(i1 * i1) && cf.b(h, (int)f2, (int)f4))
            {
                b();
            }
        }
        if (true) goto _L1; else goto _L4
_L4:
    }

    public void requestChildFocus(View view, View view1)
    {
        super.requestChildFocus(view, view1);
        if (!isInTouchMode() && !g)
        {
            boolean flag;
            if (view == h)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            r = flag;
        }
    }

    public void setCoveredFadeColor(int i1)
    {
        c = i1;
    }

    public void setPanelSlideListener(bo bo)
    {
        p = bo;
    }

    public void setParallaxDistance(int i1)
    {
        m = i1;
        requestLayout();
    }

    public void setShadowDrawable(Drawable drawable)
    {
        setShadowDrawableLeft(drawable);
    }

    public void setShadowDrawableLeft(Drawable drawable)
    {
        d = drawable;
    }

    public void setShadowDrawableRight(Drawable drawable)
    {
        e = drawable;
    }

    public void setShadowResource(int i1)
    {
        setShadowDrawable(getResources().getDrawable(i1));
    }

    public void setShadowResourceLeft(int i1)
    {
        setShadowDrawableLeft(getResources().getDrawable(i1));
    }

    public void setShadowResourceRight(int i1)
    {
        setShadowDrawableRight(getResources().getDrawable(i1));
    }

    public void setSliderFadeColor(int i1)
    {
        b = i1;
    }

    static 
    {
        int i1 = android.os.Build.VERSION.SDK_INT;
        if (i1 >= 17)
        {
            a = new android.support.v4.widget.bt();
        } else
        if (i1 >= 16)
        {
            a = new bs();
        } else
        {
            a = new br();
        }
    }

    private class SavedState extends android.view.View.BaseSavedState
    {

        public static final android.os.Parcelable.Creator CREATOR = new bp();
        boolean a;

        public void writeToParcel(Parcel parcel, int i1)
        {
            super.writeToParcel(parcel, i1);
            if (a)
            {
                i1 = 1;
            } else
            {
                i1 = 0;
            }
            parcel.writeInt(i1);
        }


        SavedState(Parcel parcel)
        {
            super(parcel);
            boolean flag;
            if (parcel.readInt() != 0)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            a = flag;
        }

        SavedState(Parcelable parcelable)
        {
            super(parcelable);
        }
    }

}
