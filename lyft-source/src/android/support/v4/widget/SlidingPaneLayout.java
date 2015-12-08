// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.widget;

import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.support.v4.view.MotionEventCompat;
import android.support.v4.view.ViewCompat;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;

// Referenced classes of package android.support.v4.widget:
//            ViewDragHelper

public class SlidingPaneLayout extends ViewGroup
{

    static final SlidingPanelLayoutImpl a;
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
    private PanelSlideListener p;
    private final ViewDragHelper q;
    private boolean r;
    private boolean s;
    private final Rect t;
    private final ArrayList u;

    static ArrayList a(SlidingPaneLayout slidingpanelayout)
    {
        return slidingpanelayout.u;
    }

    private void a(float f1)
    {
        Object obj;
        int i1;
        boolean flag;
        flag = f();
        obj = (LayoutParams)h.getLayoutParams();
        if (((LayoutParams) (obj)).c)
        {
label0:
            {
                int j1;
                int i2;
                if (flag)
                {
                    i1 = ((LayoutParams) (obj)).rightMargin;
                } else
                {
                    i1 = ((LayoutParams) (obj)).leftMargin;
                }
                if (i1 <= 0)
                {
                    i1 = 1;
                    break label0;
                }
            }
        }
        i1 = 0;
        continue;
        while (true) 
        {
            i2 = getChildCount();
            j1 = 0;
            while (j1 < i2) 
            {
                obj = getChildAt(j1);
                if (obj != h)
                {
                    int k1 = (int)((1.0F - j) * (float)m);
                    j = f1;
                    int l1 = k1 - (int)((1.0F - f1) * (float)m);
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
            return;
        }
    }

    static void a(SlidingPaneLayout slidingpanelayout, View view)
    {
        slidingpanelayout.d(view);
    }

    private void a(View view, float f1, int i1)
    {
        LayoutParams layoutparams = (LayoutParams)view.getLayoutParams();
        if (f1 > 0.0F && i1 != 0)
        {
            int j1 = (int)((float)((0xff000000 & i1) >>> 24) * f1);
            if (layoutparams.d == null)
            {
                layoutparams.d = new Paint();
            }
            layoutparams.d.setColorFilter(new PorterDuffColorFilter(j1 << 24 | 0xffffff & i1, android.graphics.PorterDuff.Mode.SRC_OVER));
            if (ViewCompat.g(view) != 2)
            {
                ViewCompat.a(view, 2, layoutparams.d);
            }
            d(view);
        } else
        if (ViewCompat.g(view) != 0)
        {
            if (layoutparams.d != null)
            {
                layoutparams.d.setColorFilter(null);
            }
            view = new DisableLayerRunnable(view);
            u.add(view);
            ViewCompat.a(this, view);
            return;
        }
    }

    private boolean a(View view, int i1)
    {
        boolean flag = false;
        if (s || a(0.0F, i1))
        {
            r = false;
            flag = true;
        }
        return flag;
    }

    private boolean b(View view, int i1)
    {
        if (s || a(1.0F, i1))
        {
            r = true;
            return true;
        } else
        {
            return false;
        }
    }

    private static boolean c(View view)
    {
        if (!ViewCompat.j(view))
        {
            if (android.os.Build.VERSION.SDK_INT >= 18)
            {
                return false;
            }
            view = view.getBackground();
            if (view != null)
            {
                if (view.getOpacity() != -1)
                {
                    return false;
                }
            } else
            {
                return false;
            }
        }
        return true;
    }

    private void d(View view)
    {
        a.a(this, view);
    }

    private boolean f()
    {
        return ViewCompat.h(this) == 1;
    }

    void a()
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

    void a(View view)
    {
        boolean flag = f();
        int i1;
        int j1;
        int k1;
        int l1;
        int i2;
        int j2;
        int k2;
        int i3;
        int j3;
        int k3;
        int l3;
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
        if (view != null && c(view))
        {
            j2 = view.getLeft();
            i2 = view.getRight();
            l1 = view.getTop();
            k1 = view.getBottom();
        } else
        {
            k1 = 0;
            l1 = 0;
            i2 = 0;
            j2 = 0;
        }
        l3 = getChildCount();
        k2 = 0;
        do
        {
            View view1;
label0:
            {
                if (k2 < l3)
                {
                    view1 = getChildAt(k2);
                    if (view1 != view)
                    {
                        break label0;
                    }
                }
                return;
            }
            int l2;
            int i4;
            int j4;
            int k4;
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
    }

    boolean a(float f1, int i1)
    {
        if (!g)
        {
            return false;
        }
        boolean flag = f();
        LayoutParams layoutparams = (LayoutParams)h.getLayoutParams();
        if (flag)
        {
            i1 = getPaddingRight();
            int j1 = layoutparams.rightMargin;
            int k1 = h.getWidth();
            i1 = (int)((float)getWidth() - ((float)(j1 + i1) + (float)k * f1 + (float)k1));
        } else
        {
            i1 = getPaddingLeft();
            i1 = (int)((float)(layoutparams.leftMargin + i1) + (float)k * f1);
        }
        if (q.a(h, i1, h.getTop()))
        {
            a();
            ViewCompat.d(this);
            return true;
        } else
        {
            return false;
        }
    }

    public boolean b()
    {
        return b(h, 0);
    }

    boolean b(View view)
    {
        if (view == null)
        {
            return false;
        }
        view = (LayoutParams)view.getLayoutParams();
        boolean flag;
        if (g && ((LayoutParams) (view)).c && i > 0.0F)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        return flag;
    }

    public boolean c()
    {
        return a(h, 0);
    }

    protected boolean checkLayoutParams(android.view.ViewGroup.LayoutParams layoutparams)
    {
        return (layoutparams instanceof LayoutParams) && super.checkLayoutParams(layoutparams);
    }

    public void computeScroll()
    {
label0:
        {
            if (q.a(true))
            {
                if (g)
                {
                    break label0;
                }
                q.f();
            }
            return;
        }
        ViewCompat.d(this);
    }

    public boolean d()
    {
        return !g || i == 1.0F;
    }

    public void draw(Canvas canvas)
    {
        super.draw(canvas);
        Drawable drawable;
        View view;
        if (f())
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
        if (f())
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
        LayoutParams layoutparams = (LayoutParams)view.getLayoutParams();
        int i1 = canvas.save(2);
        boolean flag;
        if (g && !layoutparams.b && h != null)
        {
            canvas.getClipBounds(t);
            if (f())
            {
                t.left = Math.max(t.left, h.getRight());
            } else
            {
                t.right = Math.min(t.right, h.getLeft());
            }
            canvas.clipRect(t);
        }
        if (android.os.Build.VERSION.SDK_INT >= 11)
        {
            flag = super.drawChild(canvas, view, l1);
        } else
        if (layoutparams.c && i > 0.0F)
        {
            if (!view.isDrawingCacheEnabled())
            {
                view.setDrawingCacheEnabled(true);
            }
            android.graphics.Bitmap bitmap = view.getDrawingCache();
            if (bitmap != null)
            {
                canvas.drawBitmap(bitmap, view.getLeft(), view.getTop(), layoutparams.d);
                flag = false;
            } else
            {
                Log.e("SlidingPaneLayout", (new StringBuilder()).append("drawChild: child view ").append(view).append(" returned null drawing cache").toString());
                flag = super.drawChild(canvas, view, l1);
            }
        } else
        {
            if (view.isDrawingCacheEnabled())
            {
                view.setDrawingCacheEnabled(false);
            }
            flag = super.drawChild(canvas, view, l1);
        }
        canvas.restoreToCount(i1);
        return flag;
    }

    public boolean e()
    {
        return g;
    }

    protected android.view.ViewGroup.LayoutParams generateDefaultLayoutParams()
    {
        return new LayoutParams();
    }

    public android.view.ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeset)
    {
        return new LayoutParams(getContext(), attributeset);
    }

    protected android.view.ViewGroup.LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams layoutparams)
    {
        if (layoutparams instanceof android.view.ViewGroup.MarginLayoutParams)
        {
            return new LayoutParams((android.view.ViewGroup.MarginLayoutParams)layoutparams);
        } else
        {
            return new LayoutParams(layoutparams);
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
            ((DisableLayerRunnable)u.get(i1)).run();
        }

        u.clear();
    }

    public boolean onInterceptTouchEvent(MotionEvent motionevent)
    {
        int i1;
        boolean flag;
        boolean flag1;
        flag1 = false;
        i1 = MotionEventCompat.a(motionevent);
        if (!g && i1 == 0 && getChildCount() > 1)
        {
            View view = getChildAt(1);
            if (view != null)
            {
                if (!q.b(view, (int)motionevent.getX(), (int)motionevent.getY()))
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
        q.e();
        flag = super.onInterceptTouchEvent(motionevent);
_L7:
        return flag;
_L2:
        if (i1 == 3 || i1 == 1)
        {
            q.e();
            return false;
        }
        i1;
        JVM INSTR tableswitch 0 2: default 164
    //                   0 189
    //                   1 164
    //                   2 249;
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
        if (!q.b(h, (int)f1, (int)f3) || !b(h)) goto _L3; else goto _L8
_L8:
        i1 = 1;
          goto _L9
_L5:
        float f4 = motionevent.getX();
        float f2 = motionevent.getY();
        f4 = Math.abs(f4 - n);
        f2 = Math.abs(f2 - o);
        if (f4 > (float)q.d() && f2 > f4)
        {
            q.e();
            l = true;
            return false;
        }
          goto _L3
    }

    protected void onLayout(boolean flag, int i1, int j1, int k1, int l1)
    {
        boolean flag1 = f();
        int k2;
        int l2;
        int i3;
        if (flag1)
        {
            q.a(2);
        } else
        {
            q.a(1);
        }
        k2 = k1 - i1;
        if (flag1)
        {
            i1 = getPaddingRight();
        } else
        {
            i1 = getPaddingLeft();
        }
        if (flag1)
        {
            l1 = getPaddingLeft();
        } else
        {
            l1 = getPaddingRight();
        }
        i3 = getPaddingTop();
        l2 = getChildCount();
        if (s)
        {
            float f1;
            int i2;
            if (g && r)
            {
                f1 = 1.0F;
            } else
            {
                f1 = 0.0F;
            }
            i = f1;
        }
        i2 = 0;
        j1 = i1;
        while (i2 < l2) 
        {
            View view = getChildAt(i2);
            if (view.getVisibility() == 8)
            {
                k1 = i1;
                i1 = j1;
                j1 = k1;
            } else
            {
                LayoutParams layoutparams = (LayoutParams)view.getLayoutParams();
                int j3 = view.getMeasuredWidth();
                int j2;
                if (layoutparams.b)
                {
                    k1 = layoutparams.leftMargin;
                    j2 = layoutparams.rightMargin;
                    j2 = Math.min(i1, k2 - l1 - f) - j1 - (k1 + j2);
                    k = j2;
                    if (flag1)
                    {
                        k1 = layoutparams.rightMargin;
                    } else
                    {
                        k1 = layoutparams.leftMargin;
                    }
                    if (j1 + k1 + j2 + j3 / 2 > k2 - l1)
                    {
                        flag = true;
                    } else
                    {
                        flag = false;
                    }
                    layoutparams.c = flag;
                    j2 = (int)((float)j2 * i);
                    j1 += k1 + j2;
                    i = (float)j2 / (float)k;
                    k1 = 0;
                } else
                if (g && m != 0)
                {
                    k1 = (int)((1.0F - i) * (float)m);
                    j1 = i1;
                } else
                {
                    k1 = 0;
                    j1 = i1;
                }
                if (flag1)
                {
                    j2 = (k2 - j1) + k1;
                    k1 = j2 - j3;
                } else
                {
                    k1 = j1 - k1;
                    j2 = k1 + j3;
                }
                view.layout(k1, i3, j2, view.getMeasuredHeight() + i3);
                k1 = view.getWidth() + i1;
                i1 = j1;
                j1 = k1;
            }
            i2++;
            k1 = i1;
            i1 = j1;
            j1 = k1;
        }
        if (s)
        {
            if (g)
            {
                if (m != 0)
                {
                    a(i);
                }
                if (((LayoutParams)h.getLayoutParams()).c)
                {
                    a(h, i, b);
                }
            } else
            {
                i1 = 0;
                while (i1 < l2) 
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
        if (i2 != 0x80000000) goto _L6; else goto _L5
_L5:
        j1 = k1;
        k1 = l1;
_L16:
        k1;
        JVM INSTR lookupswitch 2: default 80
    //                   -2147483648: 299
    //                   1073741824: 281;
           goto _L7 _L8 _L9
_L7:
        i1 = 0;
        i2 = -1;
_L13:
        float f1;
        int i4;
        int k4;
        int l4;
        boolean flag;
        flag = false;
        k4 = j1 - getPaddingLeft() - getPaddingRight();
        l4 = getChildCount();
        if (l4 > 2)
        {
            Log.e("SlidingPaneLayout", "onMeasure: More than two child views are not supported.");
        }
        h = null;
        i4 = 0;
        l1 = k4;
        f1 = 0.0F;
_L11:
        float f2;
        View view;
        LayoutParams layoutparams;
        if (i4 >= l4)
        {
            break; /* Loop/switch isn't completed */
        }
        view = getChildAt(i4);
        layoutparams = (LayoutParams)view.getLayoutParams();
        int k2;
        if (view.getVisibility() == 8)
        {
            layoutparams.c = false;
            int j2 = l1;
            l1 = i1;
            i1 = j2;
        } else
        {
label0:
            {
                f2 = f1;
                if (layoutparams.a <= 0.0F)
                {
                    break label0;
                }
                f1 += layoutparams.a;
                f2 = f1;
                if (layoutparams.width != 0)
                {
                    break label0;
                }
                int l2 = i1;
                i1 = l1;
                l1 = l2;
            }
        }
_L14:
        i4++;
        k2 = l1;
        l1 = i1;
        i1 = k2;
        if (true) goto _L11; else goto _L10
_L6:
        if (i2 == 0)
        {
            k1 = l1;
            j1 = 300;
            continue; /* Loop/switch isn't completed */
        }
          goto _L12
_L4:
        throw new IllegalStateException("Width must have an exact value or MATCH_PARENT");
_L2:
        if (l1 == 0)
        {
            if (isInEditMode())
            {
                if (l1 == 0)
                {
                    l1 = 0x80000000;
                    j1 = k1;
                    i1 = 300;
                    k1 = l1;
                    continue; /* Loop/switch isn't completed */
                }
            } else
            {
                throw new IllegalStateException("Height must not be UNSPECIFIED");
            }
        }
          goto _L12
_L9:
        i1 = i1 - getPaddingTop() - getPaddingBottom();
        i2 = i1;
          goto _L13
_L8:
        i2 = getPaddingTop();
        k2 = getPaddingBottom();
        l1 = 0;
        i2 = i1 - i2 - k2;
        i1 = l1;
          goto _L13
        int i3 = layoutparams.leftMargin + layoutparams.rightMargin;
        int k3;
        int i5;
        boolean flag1;
        if (layoutparams.width == -2)
        {
            i3 = android.view.View.MeasureSpec.makeMeasureSpec(k4 - i3, 0x80000000);
        } else
        if (layoutparams.width == -1)
        {
            i3 = android.view.View.MeasureSpec.makeMeasureSpec(k4 - i3, 0x40000000);
        } else
        {
            i3 = android.view.View.MeasureSpec.makeMeasureSpec(layoutparams.width, 0x40000000);
        }
        if (layoutparams.height == -2)
        {
            k3 = android.view.View.MeasureSpec.makeMeasureSpec(i2, 0x80000000);
        } else
        if (layoutparams.height == -1)
        {
            k3 = android.view.View.MeasureSpec.makeMeasureSpec(i2, 0x40000000);
        } else
        {
            k3 = android.view.View.MeasureSpec.makeMeasureSpec(layoutparams.height, 0x40000000);
        }
        view.measure(i3, k3);
        k3 = view.getMeasuredWidth();
        i5 = view.getMeasuredHeight();
        i3 = i1;
        if (k1 == 0x80000000)
        {
            i3 = i1;
            if (i5 > i1)
            {
                i3 = Math.min(i5, i2);
            }
        }
        i1 = l1 - k3;
        if (i1 < 0)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        layoutparams.b = flag1;
        if (layoutparams.b)
        {
            h = view;
        }
        l1 = i3;
        flag = flag1 | flag;
        f1 = f2;
          goto _L14
_L10:
        if (flag || f1 > 0.0F)
        {
            int j4 = k4 - f;
            int j3 = 0;
            while (j3 < l4) 
            {
                View view1 = getChildAt(j3);
                if (view1.getVisibility() != 8)
                {
                    LayoutParams layoutparams1 = (LayoutParams)view1.getLayoutParams();
                    if (view1.getVisibility() != 8)
                    {
                        int l3;
                        if (layoutparams1.width == 0 && layoutparams1.a > 0.0F)
                        {
                            k1 = 1;
                        } else
                        {
                            k1 = 0;
                        }
                        if (k1 != 0)
                        {
                            l3 = 0;
                        } else
                        {
                            l3 = view1.getMeasuredWidth();
                        }
                        if (flag && view1 != h)
                        {
                            if (layoutparams1.width < 0 && (l3 > j4 || layoutparams1.a > 0.0F))
                            {
                                if (k1 != 0)
                                {
                                    if (layoutparams1.height == -2)
                                    {
                                        k1 = android.view.View.MeasureSpec.makeMeasureSpec(i2, 0x80000000);
                                    } else
                                    if (layoutparams1.height == -1)
                                    {
                                        k1 = android.view.View.MeasureSpec.makeMeasureSpec(i2, 0x40000000);
                                    } else
                                    {
                                        k1 = android.view.View.MeasureSpec.makeMeasureSpec(layoutparams1.height, 0x40000000);
                                    }
                                } else
                                {
                                    k1 = android.view.View.MeasureSpec.makeMeasureSpec(view1.getMeasuredHeight(), 0x40000000);
                                }
                                view1.measure(android.view.View.MeasureSpec.makeMeasureSpec(j4, 0x40000000), k1);
                            }
                        } else
                        if (layoutparams1.a > 0.0F)
                        {
                            if (layoutparams1.width == 0)
                            {
                                if (layoutparams1.height == -2)
                                {
                                    k1 = android.view.View.MeasureSpec.makeMeasureSpec(i2, 0x80000000);
                                } else
                                if (layoutparams1.height == -1)
                                {
                                    k1 = android.view.View.MeasureSpec.makeMeasureSpec(i2, 0x40000000);
                                } else
                                {
                                    k1 = android.view.View.MeasureSpec.makeMeasureSpec(layoutparams1.height, 0x40000000);
                                }
                            } else
                            {
                                k1 = android.view.View.MeasureSpec.makeMeasureSpec(view1.getMeasuredHeight(), 0x40000000);
                            }
                            if (flag)
                            {
                                int j5 = layoutparams1.leftMargin;
                                j5 = k4 - (layoutparams1.rightMargin + j5);
                                int l5 = android.view.View.MeasureSpec.makeMeasureSpec(j5, 0x40000000);
                                if (l3 != j5)
                                {
                                    view1.measure(l5, k1);
                                }
                            } else
                            {
                                int k5 = Math.max(0, l1);
                                view1.measure(android.view.View.MeasureSpec.makeMeasureSpec((int)((layoutparams1.a * (float)k5) / f1) + l3, 0x40000000), k1);
                            }
                        }
                    }
                }
                j3++;
            }
        }
        setMeasuredDimension(j1, getPaddingTop() + i1 + getPaddingBottom());
        g = flag;
        if (q.a() != 0 && !flag)
        {
            q.f();
        }
        return;
_L12:
        j1 = k1;
        k1 = l1;
        if (true) goto _L16; else goto _L15
_L15:
    }

    protected void onRestoreInstanceState(Parcelable parcelable)
    {
        parcelable = (SavedState)parcelable;
        super.onRestoreInstanceState(parcelable.getSuperState());
        if (((SavedState) (parcelable)).a)
        {
            b();
        } else
        {
            c();
        }
        r = ((SavedState) (parcelable)).a;
    }

    protected Parcelable onSaveInstanceState()
    {
        SavedState savedstate = new SavedState(super.onSaveInstanceState());
        boolean flag;
        if (e())
        {
            flag = d();
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
        boolean flag;
        if (!g)
        {
            flag = super.onTouchEvent(motionevent);
        } else
        {
            q.b(motionevent);
            int i1 = motionevent.getAction();
            boolean flag1 = true;
            switch (i1 & 0xff)
            {
            default:
                return true;

            case 0: // '\0'
                float f1 = motionevent.getX();
                float f3 = motionevent.getY();
                n = f1;
                o = f3;
                return true;

            case 1: // '\001'
                flag = flag1;
                break;
            }
            if (b(h))
            {
                float f2 = motionevent.getX();
                float f4 = motionevent.getY();
                float f5 = f2 - n;
                float f6 = f4 - o;
                int j1 = q.d();
                flag = flag1;
                if (f5 * f5 + f6 * f6 < (float)(j1 * j1))
                {
                    flag = flag1;
                    if (q.b(h, (int)f2, (int)f4))
                    {
                        a(h, 0);
                        return true;
                    }
                }
            }
        }
        return flag;
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

    public void setPanelSlideListener(PanelSlideListener panelslidelistener)
    {
        p = panelslidelistener;
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
            a = new SlidingPanelLayoutImplJBMR1();
        } else
        if (i1 >= 16)
        {
            a = new SlidingPanelLayoutImplJB();
        } else
        {
            a = new SlidingPanelLayoutImplBase();
        }
    }

    private class LayoutParams extends android.view.ViewGroup.MarginLayoutParams
    {

        private static final int e[] = {
            0x1010181
        };
        public float a;
        boolean b;
        boolean c;
        Paint d;


        public LayoutParams()
        {
            super(-1, -1);
            a = 0.0F;
        }

        public LayoutParams(Context context, AttributeSet attributeset)
        {
            super(context, attributeset);
            a = 0.0F;
            context = context.obtainStyledAttributes(attributeset, e);
            a = context.getFloat(0, 0.0F);
            context.recycle();
        }

        public LayoutParams(android.view.ViewGroup.LayoutParams layoutparams)
        {
            super(layoutparams);
            a = 0.0F;
        }

        public LayoutParams(android.view.ViewGroup.MarginLayoutParams marginlayoutparams)
        {
            super(marginlayoutparams);
            a = 0.0F;
        }
    }


    private class DisableLayerRunnable
        implements Runnable
    {

        final View a;
        final SlidingPaneLayout b;

        public void run()
        {
            if (a.getParent() == b)
            {
                ViewCompat.a(a, 0, null);
                SlidingPaneLayout.a(b, a);
            }
            SlidingPaneLayout.a(b).remove(this);
        }

        DisableLayerRunnable(View view)
        {
            b = SlidingPaneLayout.this;
            super();
            a = view;
        }
    }


    private class SlidingPanelLayoutImpl
    {

        public abstract void a(SlidingPaneLayout slidingpanelayout, View view);
    }


    private class SavedState extends android.view.View.BaseSavedState
    {

        public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

            public SavedState a(Parcel parcel)
            {
                return new SavedState(parcel);
            }

            public SavedState[] a(int i1)
            {
                return new SavedState[i1];
            }

            public Object createFromParcel(Parcel parcel)
            {
                return a(parcel);
            }

            public Object[] newArray(int i1)
            {
                return a(i1);
            }

        };
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


        private SavedState(Parcel parcel)
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


    private class SlidingPanelLayoutImplJBMR1 extends SlidingPanelLayoutImplBase
    {
        private class SlidingPanelLayoutImplBase
            implements SlidingPanelLayoutImpl
        {

            public void a(SlidingPaneLayout slidingpanelayout, View view)
            {
                ViewCompat.a(slidingpanelayout, view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
            }

            SlidingPanelLayoutImplBase()
            {
            }
        }


        public void a(SlidingPaneLayout slidingpanelayout, View view)
        {
            ViewCompat.a(view, ((LayoutParams)view.getLayoutParams()).d);
        }

        SlidingPanelLayoutImplJBMR1()
        {
        }
    }


    private class SlidingPanelLayoutImplJB extends SlidingPanelLayoutImplBase
    {

        private Method a;
        private Field b;

        public void a(SlidingPaneLayout slidingpanelayout, View view)
        {
            if (a != null && b != null)
            {
                try
                {
                    b.setBoolean(view, true);
                    a.invoke(view, (Object[])null);
                }
                catch (Exception exception)
                {
                    Log.e("SlidingPaneLayout", "Error refreshing display list state", exception);
                }
                super.a(slidingpanelayout, view);
                return;
            } else
            {
                view.invalidate();
                return;
            }
        }

        SlidingPanelLayoutImplJB()
        {
            try
            {
                a = android/view/View.getDeclaredMethod("getDisplayList", (Class[])null);
            }
            catch (NoSuchMethodException nosuchmethodexception)
            {
                Log.e("SlidingPaneLayout", "Couldn't fetch getDisplayList method; dimming won't work right.", nosuchmethodexception);
            }
            try
            {
                b = android/view/View.getDeclaredField("mRecreateDisplayList");
                b.setAccessible(true);
                return;
            }
            catch (NoSuchFieldException nosuchfieldexception)
            {
                Log.e("SlidingPaneLayout", "Couldn't fetch mRecreateDisplayList field; dimming will be slow.", nosuchfieldexception);
            }
        }
    }

}
