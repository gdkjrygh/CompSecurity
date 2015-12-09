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
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import java.util.ArrayList;
import jo;
import km;
import qe;
import qf;
import qg;
import qh;
import qi;
import qj;
import qk;
import qn;

public class SlidingPaneLayout extends ViewGroup
{

    private static qh o;
    private int a;
    private final int b;
    private boolean c;
    private View d;
    private float e;
    private int f;
    private boolean g;
    private float h;
    private float i;
    private final qn j;
    private boolean k;
    private boolean l;
    private final Rect m;
    private final ArrayList n;

    public SlidingPaneLayout(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public SlidingPaneLayout(Context context, AttributeSet attributeset, int i1)
    {
        super(context, attributeset, i1);
        a = 0xcccccccc;
        l = true;
        m = new Rect();
        n = new ArrayList();
        float f1 = context.getResources().getDisplayMetrics().density;
        b = (int)(32F * f1 + 0.5F);
        ViewConfiguration.get(context);
        setWillNotDraw(false);
        km.a(this, new qe(this));
        km.c(this, 1);
        j = qn.a(this, 0.5F, new qg(this, (byte)0));
        j.h = f1 * 400F;
    }

    public static void a(SlidingPaneLayout slidingpanelayout, int i1)
    {
        if (slidingpanelayout.d == null)
        {
            slidingpanelayout.e = 0.0F;
        } else
        {
            boolean flag = slidingpanelayout.c();
            LayoutParams layoutparams = (LayoutParams)slidingpanelayout.d.getLayoutParams();
            int k1 = slidingpanelayout.d.getWidth();
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
                k1 = layoutparams.rightMargin;
            } else
            {
                k1 = layoutparams.leftMargin;
            }
            slidingpanelayout.e = (float)(j1 - (k1 + i1)) / (float)slidingpanelayout.f;
            if (layoutparams.c)
            {
                slidingpanelayout.a(slidingpanelayout.d, slidingpanelayout.e, slidingpanelayout.a);
                return;
            }
        }
    }

    public static void a(SlidingPaneLayout slidingpanelayout, View view)
    {
        slidingpanelayout.c(view);
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
            if (km.g(view) != 2)
            {
                km.a(view, 2, layoutparams.d);
            }
            c(view);
        } else
        if (km.g(view) != 0)
        {
            if (layoutparams.d != null)
            {
                layoutparams.d.setColorFilter(null);
            }
            view = new qf(this, view);
            n.add(view);
            km.a(this, view);
            return;
        }
    }

    private boolean a(float f1)
    {
        if (!c)
        {
            return false;
        }
        boolean flag = c();
        LayoutParams layoutparams = (LayoutParams)d.getLayoutParams();
        int i1;
        if (flag)
        {
            i1 = getPaddingRight();
            int j1 = layoutparams.rightMargin;
            int k1 = d.getWidth();
            i1 = (int)((float)getWidth() - ((float)(j1 + i1) + (float)f * f1 + (float)k1));
        } else
        {
            i1 = getPaddingLeft();
            i1 = (int)((float)(layoutparams.leftMargin + i1) + (float)f * f1);
        }
        if (j.a(d, i1, d.getTop()))
        {
            a();
            km.d(this);
            return true;
        } else
        {
            return false;
        }
    }

    public static boolean a(SlidingPaneLayout slidingpanelayout)
    {
        return slidingpanelayout.g;
    }

    public static boolean a(SlidingPaneLayout slidingpanelayout, boolean flag)
    {
        slidingpanelayout.k = flag;
        return flag;
    }

    public static qn b(SlidingPaneLayout slidingpanelayout)
    {
        return slidingpanelayout.j;
    }

    private boolean b()
    {
        boolean flag = false;
        if (l || a(0.0F))
        {
            k = false;
            flag = true;
        }
        return flag;
    }

    public static float c(SlidingPaneLayout slidingpanelayout)
    {
        return slidingpanelayout.e;
    }

    private void c(View view)
    {
        o.a(this, view);
    }

    private boolean c()
    {
        return km.h(this) == 1;
    }

    public static View d(SlidingPaneLayout slidingpanelayout)
    {
        return slidingpanelayout.d;
    }

    public static boolean e(SlidingPaneLayout slidingpanelayout)
    {
        return slidingpanelayout.c();
    }

    public static int f(SlidingPaneLayout slidingpanelayout)
    {
        return slidingpanelayout.f;
    }

    public static ArrayList g(SlidingPaneLayout slidingpanelayout)
    {
        return slidingpanelayout.n;
    }

    public final void a()
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

    public final void a(View view)
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
        if (!km.j(view)) goto _L4; else goto _L3
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

    public final boolean b(View view)
    {
        if (view == null)
        {
            return false;
        }
        view = (LayoutParams)view.getLayoutParams();
        return c && ((LayoutParams) (view)).c && e > 0.0F;
    }

    protected boolean checkLayoutParams(android.view.ViewGroup.LayoutParams layoutparams)
    {
        return (layoutparams instanceof LayoutParams) && super.checkLayoutParams(layoutparams);
    }

    public void computeScroll()
    {
label0:
        {
            if (j.c())
            {
                if (c)
                {
                    break label0;
                }
                j.b();
            }
            return;
        }
        km.d(this);
    }

    public void draw(Canvas canvas)
    {
        super.draw(canvas);
        c();
        if (getChildCount() > 1)
        {
            getChildAt(1);
        }
    }

    protected boolean drawChild(Canvas canvas, View view, long l1)
    {
        boolean flag;
        LayoutParams layoutparams = (LayoutParams)view.getLayoutParams();
        int i1 = canvas.save(2);
        if (c && !layoutparams.b && d != null)
        {
            canvas.getClipBounds(m);
            android.graphics.Bitmap bitmap;
            if (c())
            {
                m.left = Math.max(m.left, d.getRight());
            } else
            {
                m.right = Math.min(m.right, d.getLeft());
            }
            canvas.clipRect(m);
        }
        if (android.os.Build.VERSION.SDK_INT >= 11) goto _L2; else goto _L1
_L1:
        if (!layoutparams.c || e <= 0.0F) goto _L4; else goto _L3
_L3:
        if (!view.isDrawingCacheEnabled())
        {
            view.setDrawingCacheEnabled(true);
        }
        bitmap = view.getDrawingCache();
        if (bitmap == null) goto _L6; else goto _L5
_L5:
        canvas.drawBitmap(bitmap, view.getLeft(), view.getTop(), layoutparams.d);
        flag = false;
_L7:
        canvas.restoreToCount(i1);
        return flag;
_L6:
        Log.e("SlidingPaneLayout", (new StringBuilder("drawChild: child view ")).append(view).append(" returned null drawing cache").toString());
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

    protected void onAttachedToWindow()
    {
        super.onAttachedToWindow();
        l = true;
    }

    protected void onDetachedFromWindow()
    {
        super.onDetachedFromWindow();
        l = true;
        int j1 = n.size();
        for (int i1 = 0; i1 < j1; i1++)
        {
            ((qf)n.get(i1)).run();
        }

        n.clear();
    }

    public boolean onInterceptTouchEvent(MotionEvent motionevent)
    {
        int i1;
        boolean flag;
        boolean flag1;
        flag1 = false;
        i1 = jo.a(motionevent);
        if (!c && i1 == 0 && getChildCount() > 1)
        {
            View view = getChildAt(1);
            if (view != null)
            {
                if (!qn.b(view, (int)motionevent.getX(), (int)motionevent.getY()))
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                k = flag;
            }
        }
        if (c && (!g || i1 == 0)) goto _L2; else goto _L1
_L1:
        j.a();
        flag = super.onInterceptTouchEvent(motionevent);
_L7:
        return flag;
_L2:
        if (i1 == 3 || i1 == 1)
        {
            j.a();
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
        if (j.a(motionevent))
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
        g = false;
        f1 = motionevent.getX();
        f3 = motionevent.getY();
        h = f1;
        i = f3;
        if (!qn.b(d, (int)f1, (int)f3) || !b(d)) goto _L3; else goto _L8
_L8:
        i1 = 1;
          goto _L9
_L5:
        float f4 = motionevent.getX();
        float f2 = motionevent.getY();
        f4 = Math.abs(f4 - h);
        f2 = Math.abs(f2 - i);
        if (f4 > (float)j.b && f2 > f4)
        {
            j.a();
            g = true;
            return false;
        }
          goto _L3
    }

    protected void onLayout(boolean flag, int i1, int j1, int k1, int l1)
    {
        boolean flag1 = c();
        int i3;
        int j3;
        int k3;
        if (flag1)
        {
            j.j = 2;
        } else
        {
            j.j = 1;
        }
        i3 = k1 - i1;
        if (flag1)
        {
            i1 = getPaddingRight();
        } else
        {
            i1 = getPaddingLeft();
        }
        if (flag1)
        {
            k1 = getPaddingLeft();
        } else
        {
            k1 = getPaddingRight();
        }
        k3 = getPaddingTop();
        j3 = getChildCount();
        if (l)
        {
            float f1;
            View view;
            int i2;
            int k2;
            if (c && k)
            {
                f1 = 1.0F;
            } else
            {
                f1 = 0.0F;
            }
            e = f1;
        }
        l1 = 0;
        j1 = i1;
        while (l1 < j3) 
        {
            view = getChildAt(l1);
            if (view.getVisibility() != 8)
            {
                LayoutParams layoutparams = (LayoutParams)view.getLayoutParams();
                int l3 = view.getMeasuredWidth();
                int j2;
                int l2;
                if (layoutparams.b)
                {
                    i2 = layoutparams.leftMargin;
                    k2 = layoutparams.rightMargin;
                    k2 = Math.min(i1, i3 - k1 - b) - j1 - (i2 + k2);
                    f = k2;
                    if (flag1)
                    {
                        j2 = layoutparams.rightMargin;
                    } else
                    {
                        j2 = layoutparams.leftMargin;
                    }
                    if (j1 + j2 + k2 + l3 / 2 > i3 - k1)
                    {
                        flag = true;
                    } else
                    {
                        flag = false;
                    }
                    layoutparams.c = flag;
                    k2 = (int)((float)k2 * e);
                    j1 = j2 + k2 + j1;
                    e = (float)k2 / (float)f;
                } else
                {
                    j1 = i1;
                }
                if (flag1)
                {
                    l2 = i3 - j1;
                    j2 = l2 - l3;
                } else
                {
                    l2 = j1 + l3;
                    j2 = j1;
                }
                view.layout(j2, k3, l2, view.getMeasuredHeight() + k3);
                i1 = view.getWidth() + i1;
            }
            l1++;
        }
        if (l)
        {
            if (c)
            {
                if (((LayoutParams)d.getLayoutParams()).c)
                {
                    a(d, e, a);
                }
            } else
            {
                i1 = 0;
                while (i1 < j3) 
                {
                    a(getChildAt(i1), 0.0F, a);
                    i1++;
                }
            }
            a(d);
        }
        l = false;
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
    //                   -2147483648: 286
    //                   1073741824: 268;
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
        if (i5 > 2)
        {
            Log.e("SlidingPaneLayout", "onMeasure: More than two child views are not supported.");
        }
        d = null;
        j4 = 0;
        j1 = l4;
        f1 = 0.0F;
_L14:
        if (j4 >= i5) goto _L11; else goto _L10
_L10:
        View view;
        LayoutParams layoutparams;
        view = getChildAt(j4);
        layoutparams = (LayoutParams)view.getLayoutParams();
        if (view.getVisibility() != 8) goto _L13; else goto _L12
_L12:
        layoutparams.c = false;
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
        if (layoutparams.a <= 0.0F) goto _L17; else goto _L16
_L16:
        f2 = f1 + layoutparams.a;
        if (layoutparams.width == 0) goto _L18; else goto _L17
_L17:
        int i3 = layoutparams.leftMargin + layoutparams.rightMargin;
        int l3;
        int j5;
        boolean flag1;
        if (layoutparams.width == -2)
        {
            i3 = android.view.View.MeasureSpec.makeMeasureSpec(l4 - i3, 0x80000000);
        } else
        if (layoutparams.width == -1)
        {
            i3 = android.view.View.MeasureSpec.makeMeasureSpec(l4 - i3, 0x40000000);
        } else
        {
            i3 = android.view.View.MeasureSpec.makeMeasureSpec(layoutparams.width, 0x40000000);
        }
        if (layoutparams.height == -2)
        {
            l3 = android.view.View.MeasureSpec.makeMeasureSpec(i2, 0x80000000);
        } else
        if (layoutparams.height == -1)
        {
            l3 = android.view.View.MeasureSpec.makeMeasureSpec(i2, 0x40000000);
        } else
        {
            l3 = android.view.View.MeasureSpec.makeMeasureSpec(layoutparams.height, 0x40000000);
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
        layoutparams.b = flag1;
        if (layoutparams.b)
        {
            d = view;
        }
        f1 = f2;
        flag = flag1 | flag;
        j1 = i3;
          goto _L19
_L11:
        if (flag || f1 > 0.0F)
        {
            int k4 = l4 - b;
            int j3 = 0;
            while (j3 < i5) 
            {
                View view1 = getChildAt(j3);
                if (view1.getVisibility() == 8)
                {
                    continue;
                }
                LayoutParams layoutparams1 = (LayoutParams)view1.getLayoutParams();
                if (view1.getVisibility() != 8)
                {
                    int i4;
                    if (layoutparams1.width == 0 && layoutparams1.a > 0.0F)
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
                    if (flag && view1 != d)
                    {
                        if (layoutparams1.width < 0 && (i4 > k4 || layoutparams1.a > 0.0F))
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
                            view1.measure(android.view.View.MeasureSpec.makeMeasureSpec(k4, 0x40000000), k1);
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
                            int k5 = layoutparams1.leftMargin;
                            k5 = l4 - (layoutparams1.rightMargin + k5);
                            int i6 = android.view.View.MeasureSpec.makeMeasureSpec(k5, 0x40000000);
                            if (i4 != k5)
                            {
                                view1.measure(i6, k1);
                            }
                        } else
                        {
                            int l5 = Math.max(0, j1);
                            view1.measure(android.view.View.MeasureSpec.makeMeasureSpec((int)((layoutparams1.a * (float)l5) / f1) + i4, 0x40000000), k1);
                        }
                    }
                }
                j3++;
            }
        }
        setMeasuredDimension(l1, getPaddingTop() + i1 + getPaddingBottom());
        c = flag;
        if (j.a != 0 && !flag)
        {
            j.b();
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
            if (l || a(1.0F))
            {
                k = true;
            }
        } else
        {
            b();
        }
        k = ((SavedState) (parcelable)).a;
    }

    protected Parcelable onSaveInstanceState()
    {
        SavedState savedstate = new SavedState(super.onSaveInstanceState());
        boolean flag;
        if (c)
        {
            if (!c || e == 1.0F)
            {
                flag = true;
            } else
            {
                flag = false;
            }
        } else
        {
            flag = k;
        }
        savedstate.a = flag;
        return savedstate;
    }

    protected void onSizeChanged(int i1, int j1, int k1, int l1)
    {
        super.onSizeChanged(i1, j1, k1, l1);
        if (i1 != k1)
        {
            l = true;
        }
    }

    public boolean onTouchEvent(MotionEvent motionevent)
    {
        if (!c)
        {
            return super.onTouchEvent(motionevent);
        }
        j.b(motionevent);
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
        h = f1;
        i = f3;
        continue; /* Loop/switch isn't completed */
_L3:
        if (b(d))
        {
            float f2 = motionevent.getX();
            float f4 = motionevent.getY();
            float f5 = f2 - h;
            float f6 = f4 - i;
            int i1 = j.b;
            if (f5 * f5 + f6 * f6 < (float)(i1 * i1) && qn.b(d, (int)f2, (int)f4))
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
        if (!isInTouchMode() && !c)
        {
            boolean flag;
            if (view == d)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            k = flag;
        }
    }

    static 
    {
        int i1 = android.os.Build.VERSION.SDK_INT;
        if (i1 >= 17)
        {
            o = new qk();
        } else
        if (i1 >= 16)
        {
            o = new qj();
        } else
        {
            o = new qi();
        }
    }

    private class LayoutParams extends android.view.ViewGroup.MarginLayoutParams
    {

        private static final int e[] = {
            0x1010181
        };
        public float a;
        public boolean b;
        boolean c;
        public Paint d;


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


    private class SavedState extends android.view.View.BaseSavedState
    {

        public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

            public final Object createFromParcel(Parcel parcel)
            {
                return new SavedState(parcel, (byte)0);
            }

            public final volatile Object[] newArray(int i1)
            {
                return new SavedState[i1];
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

        SavedState(Parcel parcel, byte byte0)
        {
            this(parcel);
        }

        SavedState(Parcelable parcelable)
        {
            super(parcelable);
        }
    }

}
