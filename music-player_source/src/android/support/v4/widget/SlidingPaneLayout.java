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
import android.support.v4.view.an;
import android.support.v4.view.w;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import java.util.ArrayList;

// Referenced classes of package android.support.v4.widget:
//            z, y, x, r, 
//            t, aj, s, w, 
//            u

public class SlidingPaneLayout extends ViewGroup
{

    static final android.support.v4.widget.w a;
    private int b;
    private int c;
    private Drawable d;
    private final int e;
    private boolean f;
    private View g;
    private float h;
    private float i;
    private int j;
    private boolean k;
    private int l;
    private float m;
    private float n;
    private u o;
    private final aj p;
    private boolean q;
    private boolean r;
    private final Rect s;
    private final ArrayList t;

    public SlidingPaneLayout(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public SlidingPaneLayout(Context context, AttributeSet attributeset, int i1)
    {
        super(context, attributeset, i1);
        b = 0xcccccccc;
        r = true;
        s = new Rect();
        t = new ArrayList();
        float f1 = context.getResources().getDisplayMetrics().density;
        e = (int)(32F * f1 + 0.5F);
        ViewConfiguration.get(context);
        setWillNotDraw(false);
        an.a(this, new r(this));
        an.e(this);
        p = aj.a(this, 0.5F, new t(this, (byte)0));
        p.a(1);
        p.a(f1 * 400F);
    }

    static void a(SlidingPaneLayout slidingpanelayout, int i1)
    {
        if (slidingpanelayout.g == null)
        {
            slidingpanelayout.h = 0.0F;
        } else
        {
            Object obj = (LayoutParams)slidingpanelayout.g.getLayoutParams();
            slidingpanelayout.h = (float)(i1 - (slidingpanelayout.getPaddingLeft() + ((LayoutParams) (obj)).leftMargin)) / (float)slidingpanelayout.j;
            if (slidingpanelayout.l != 0)
            {
                slidingpanelayout.b(slidingpanelayout.h);
            }
            if (((LayoutParams) (obj)).c)
            {
                slidingpanelayout.a(slidingpanelayout.g, slidingpanelayout.h, slidingpanelayout.b);
            }
            obj = slidingpanelayout.g;
            if (slidingpanelayout.o != null)
            {
                u u = slidingpanelayout.o;
                float f1 = slidingpanelayout.h;
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
        LayoutParams layoutparams = (LayoutParams)view.getLayoutParams();
        if (f1 > 0.0F && i1 != 0)
        {
            int j1 = (int)((float)((0xff000000 & i1) >>> 24) * f1);
            if (layoutparams.d == null)
            {
                layoutparams.d = new Paint();
            }
            layoutparams.d.setColorFilter(new PorterDuffColorFilter(j1 << 24 | 0xffffff & i1, android.graphics.PorterDuff.Mode.SRC_OVER));
            if (an.f(view) != 2)
            {
                an.a(view, 2, layoutparams.d);
            }
            c(view);
        } else
        if (an.f(view) != 0)
        {
            if (layoutparams.d != null)
            {
                layoutparams.d.setColorFilter(null);
            }
            view = new s(this, view);
            t.add(view);
            an.a(this, view);
            return;
        }
    }

    private boolean a(float f1)
    {
        if (!f)
        {
            return false;
        }
        LayoutParams layoutparams = (LayoutParams)g.getLayoutParams();
        int i1 = getPaddingLeft();
        i1 = (int)((float)(layoutparams.leftMargin + i1) + (float)j * f1);
        if (p.a(g, i1, g.getTop()))
        {
            c();
            an.c(this);
            return true;
        } else
        {
            return false;
        }
    }

    static boolean a(SlidingPaneLayout slidingpanelayout)
    {
        return slidingpanelayout.k;
    }

    static boolean a(SlidingPaneLayout slidingpanelayout, boolean flag)
    {
        slidingpanelayout.q = flag;
        return flag;
    }

    static aj b(SlidingPaneLayout slidingpanelayout)
    {
        return slidingpanelayout.p;
    }

    private void b(float f1)
    {
        int i1 = 0;
        LayoutParams layoutparams = (LayoutParams)g.getLayoutParams();
        boolean flag;
        int j1;
        if (layoutparams.c && layoutparams.leftMargin <= 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        for (j1 = getChildCount(); i1 < j1; i1++)
        {
            View view = getChildAt(i1);
            if (view == g)
            {
                continue;
            }
            int k1 = (int)((1.0F - i) * (float)l);
            i = f1;
            view.offsetLeftAndRight(k1 - (int)((1.0F - f1) * (float)l));
            if (flag)
            {
                a(view, 1.0F - i, c);
            }
        }

    }

    static float c(SlidingPaneLayout slidingpanelayout)
    {
        return slidingpanelayout.h;
    }

    private void c(View view)
    {
        a.a(this, view);
    }

    static View d(SlidingPaneLayout slidingpanelayout)
    {
        return slidingpanelayout.g;
    }

    private boolean d()
    {
        boolean flag = false;
        if (r || a(0.0F))
        {
            q = false;
            flag = true;
        }
        return flag;
    }

    static int e(SlidingPaneLayout slidingpanelayout)
    {
        return slidingpanelayout.j;
    }

    static ArrayList f(SlidingPaneLayout slidingpanelayout)
    {
        return slidingpanelayout.t;
    }

    final void a()
    {
        u u;
        if (o != null)
        {
            u = o;
        }
        sendAccessibilityEvent(32);
    }

    final void a(View view)
    {
        int k2;
        int l2;
        int i3;
        int j3;
        int k3;
        int l3;
        k2 = getPaddingLeft();
        l2 = getWidth();
        i3 = getPaddingRight();
        j3 = getPaddingTop();
        k3 = getHeight();
        l3 = getPaddingBottom();
        if (view == null) goto _L2; else goto _L1
_L1:
        if (!an.i(view)) goto _L4; else goto _L3
_L3:
        int i1 = 1;
_L6:
        int j1;
        int k1;
        int l1;
        if (i1 != 0)
        {
            l1 = view.getLeft();
            k1 = view.getRight();
            j1 = view.getTop();
            i1 = view.getBottom();
            break MISSING_BLOCK_LABEL_76;
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
                    i1 = 1;
                } else
                {
                    i1 = 0;
                }
                continue; /* Loop/switch isn't completed */
            }
        }
        i1 = 0;
        continue; /* Loop/switch isn't completed */
_L2:
        i1 = 0;
        j1 = 0;
        k1 = 0;
        l1 = 0;
        int i4 = getChildCount();
        int i2 = 0;
        do
        {
            if (i2 >= i4)
            {
                break;
            }
            View view1 = getChildAt(i2);
            if (view1 == view)
            {
                break;
            }
            int j2 = Math.max(k2, view1.getLeft());
            int j4 = Math.max(j3, view1.getTop());
            int k4 = Math.min(l2 - i3, view1.getRight());
            int l4 = Math.min(k3 - l3, view1.getBottom());
            if (j2 >= l1 && j4 >= j1 && k4 <= k1 && l4 <= i1)
            {
                j2 = 4;
            } else
            {
                j2 = 0;
            }
            view1.setVisibility(j2);
            i2++;
        } while (true);
        return;
        if (true) goto _L6; else goto _L5
_L5:
    }

    final void b()
    {
        u u;
        if (o != null)
        {
            u = o;
        }
        sendAccessibilityEvent(32);
    }

    final boolean b(View view)
    {
        if (view == null)
        {
            return false;
        }
        view = (LayoutParams)view.getLayoutParams();
        return f && ((LayoutParams) (view)).c && h > 0.0F;
    }

    final void c()
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

    protected boolean checkLayoutParams(android.view.ViewGroup.LayoutParams layoutparams)
    {
        return (layoutparams instanceof LayoutParams) && super.checkLayoutParams(layoutparams);
    }

    public void computeScroll()
    {
label0:
        {
            if (p.g())
            {
                if (f)
                {
                    break label0;
                }
                p.f();
            }
            return;
        }
        an.c(this);
    }

    public void draw(Canvas canvas)
    {
        super.draw(canvas);
        View view;
        if (getChildCount() > 1)
        {
            view = getChildAt(1);
        } else
        {
            view = null;
        }
        if (view == null || d == null)
        {
            return;
        } else
        {
            int i1 = d.getIntrinsicWidth();
            int j1 = view.getLeft();
            int k1 = view.getTop();
            int l1 = view.getBottom();
            d.setBounds(j1 - i1, k1, j1, l1);
            d.draw(canvas);
            return;
        }
    }

    protected boolean drawChild(Canvas canvas, View view, long l1)
    {
        LayoutParams layoutparams;
        int i1;
        layoutparams = (LayoutParams)view.getLayoutParams();
        i1 = canvas.save(2);
        if (f && !layoutparams.b && g != null)
        {
            canvas.getClipBounds(s);
            s.right = Math.min(s.right, g.getLeft());
            canvas.clipRect(s);
        }
        if (android.os.Build.VERSION.SDK_INT >= 11) goto _L2; else goto _L1
_L1:
        if (!layoutparams.c || h <= 0.0F) goto _L4; else goto _L3
_L3:
        android.graphics.Bitmap bitmap;
        if (!view.isDrawingCacheEnabled())
        {
            view.setDrawingCacheEnabled(true);
        }
        bitmap = view.getDrawingCache();
        if (bitmap == null) goto _L6; else goto _L5
_L5:
        boolean flag;
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
        r = true;
    }

    protected void onDetachedFromWindow()
    {
        super.onDetachedFromWindow();
        r = true;
        int j1 = t.size();
        for (int i1 = 0; i1 < j1; i1++)
        {
            ((s)t.get(i1)).run();
        }

        t.clear();
    }

    public boolean onInterceptTouchEvent(MotionEvent motionevent)
    {
        int i1;
        boolean flag;
        boolean flag1;
        flag1 = false;
        i1 = w.a(motionevent);
        if (!f && i1 == 0 && getChildCount() > 1)
        {
            View view = getChildAt(1);
            if (view != null)
            {
                aj aj2 = p;
                if (!aj.b(view, (int)motionevent.getX(), (int)motionevent.getY()))
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                q = flag;
            }
        }
        if (f && (!k || i1 == 0)) goto _L2; else goto _L1
_L1:
        p.e();
        flag = super.onInterceptTouchEvent(motionevent);
_L7:
        return flag;
_L2:
        if (i1 == 3 || i1 == 1)
        {
            p.e();
            return false;
        }
        i1;
        JVM INSTR tableswitch 0 2: default 164
    //                   0 189
    //                   1 164
    //                   2 251;
           goto _L3 _L4 _L3 _L5
_L3:
        i1 = 0;
_L9:
        if (p.a(motionevent))
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
        k = false;
        f1 = motionevent.getX();
        f3 = motionevent.getY();
        m = f1;
        n = f3;
        aj aj1 = p;
        if (!aj.b(g, (int)f1, (int)f3) || !b(g)) goto _L3; else goto _L8
_L8:
        i1 = 1;
          goto _L9
_L5:
        float f4 = motionevent.getX();
        float f2 = motionevent.getY();
        f4 = Math.abs(f4 - m);
        f2 = Math.abs(f2 - n);
        if (f4 > (float)p.d() && f2 > f4)
        {
            p.e();
            k = true;
            return false;
        }
          goto _L3
    }

    protected void onLayout(boolean flag, int i1, int j1, int k1, int l1)
    {
        int j2 = k1 - i1;
        j1 = getPaddingLeft();
        int k2 = getPaddingRight();
        int l2 = getPaddingTop();
        int i2 = getChildCount();
        if (r)
        {
            float f1;
            View view;
            LayoutParams layoutparams;
            int i3;
            int j3;
            int k3;
            if (f && q)
            {
                f1 = 1.0F;
            } else
            {
                f1 = 0.0F;
            }
            h = f1;
        }
        k1 = 0;
        i1 = j1;
        while (k1 < i2) 
        {
            view = getChildAt(k1);
            if (view.getVisibility() != 8)
            {
                layoutparams = (LayoutParams)view.getLayoutParams();
                i3 = view.getMeasuredWidth();
                l1 = 0;
                if (layoutparams.b)
                {
                    j3 = layoutparams.leftMargin;
                    k3 = layoutparams.rightMargin;
                    j3 = Math.min(i1, j2 - k2 - e) - j1 - (j3 + k3);
                    j = j3;
                    if (layoutparams.leftMargin + j1 + j3 + i3 / 2 > j2 - k2)
                    {
                        flag = true;
                    } else
                    {
                        flag = false;
                    }
                    layoutparams.c = flag;
                    j3 = (int)((float)j3 * h);
                    j1 = layoutparams.leftMargin + j3 + j1;
                    h = (float)j3 / (float)j;
                } else
                {
                    if (f && l != 0)
                    {
                        j1 = (int)((1.0F - h) * (float)l);
                    } else
                    {
                        j1 = 0;
                    }
                    l1 = j1;
                    j1 = i1;
                }
                l1 = j1 - l1;
                view.layout(l1, l2, l1 + i3, view.getMeasuredHeight() + l2);
                i1 += view.getWidth();
            }
            k1++;
        }
        if (r)
        {
            if (f)
            {
                if (l != 0)
                {
                    b(h);
                }
                if (((LayoutParams)g.getLayoutParams()).c)
                {
                    a(g, h, b);
                }
            } else
            {
                i1 = 0;
                while (i1 < i2) 
                {
                    a(getChildAt(i1), 0.0F, b);
                    i1++;
                }
            }
            a(g);
        }
        r = false;
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
    //                   -2147483648: 282
    //                   1073741824: 264;
           goto _L7 _L8 _L9
_L7:
        i1 = 0;
        i2 = -1;
_L15:
        float f1;
        int j4;
        int l4;
        boolean flag;
        flag = false;
        j1 = l1 - getPaddingLeft() - getPaddingRight();
        l4 = getChildCount();
        if (l4 > 2)
        {
            Log.e("SlidingPaneLayout", "onMeasure: More than two child views are not supported.");
        }
        g = null;
        j4 = 0;
        f1 = 0.0F;
_L14:
        if (j4 >= l4) goto _L11; else goto _L10
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
        int i5;
        boolean flag1;
        if (layoutparams.width == -2)
        {
            i3 = android.view.View.MeasureSpec.makeMeasureSpec(l1 - i3, 0x80000000);
        } else
        if (layoutparams.width == -1)
        {
            i3 = android.view.View.MeasureSpec.makeMeasureSpec(l1 - i3, 0x40000000);
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
            g = view;
        }
        f1 = f2;
        flag = flag1 | flag;
        j1 = i3;
          goto _L19
_L11:
        if (flag || f1 > 0.0F)
        {
            int k4 = l1 - e;
            int j3 = 0;
            while (j3 < l4) 
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
                    if (flag && view1 != g)
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
                            int j5 = layoutparams1.leftMargin;
                            j5 = l1 - (layoutparams1.rightMargin + j5);
                            int l5 = android.view.View.MeasureSpec.makeMeasureSpec(j5, 0x40000000);
                            if (i4 != j5)
                            {
                                view1.measure(l5, k1);
                            }
                        } else
                        {
                            int k5 = Math.max(0, j1);
                            view1.measure(android.view.View.MeasureSpec.makeMeasureSpec((int)((layoutparams1.a * (float)k5) / f1) + i4, 0x40000000), k1);
                        }
                    }
                }
                j3++;
            }
        }
        setMeasuredDimension(l1, i1);
        f = flag;
        if (p.a() != 0 && !flag)
        {
            p.f();
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
            View view = g;
            if (r || a(1.0F))
            {
                q = true;
            }
        } else
        {
            View view1 = g;
            d();
        }
        q = ((SavedState) (parcelable)).a;
    }

    protected Parcelable onSaveInstanceState()
    {
        SavedState savedstate = new SavedState(super.onSaveInstanceState());
        boolean flag;
        if (f)
        {
            if (!f || h == 1.0F)
            {
                flag = true;
            } else
            {
                flag = false;
            }
        } else
        {
            flag = q;
        }
        savedstate.a = flag;
        return savedstate;
    }

    protected void onSizeChanged(int i1, int j1, int k1, int l1)
    {
        super.onSizeChanged(i1, j1, k1, l1);
        if (i1 != k1)
        {
            r = true;
        }
    }

    public boolean onTouchEvent(MotionEvent motionevent)
    {
        if (!f)
        {
            return super.onTouchEvent(motionevent);
        }
        p.b(motionevent);
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
        m = f1;
        n = f3;
        continue; /* Loop/switch isn't completed */
_L3:
        if (b(g))
        {
            float f2 = motionevent.getX();
            float f4 = motionevent.getY();
            float f5 = f2 - m;
            float f6 = f4 - n;
            int i1 = p.d();
            if (f5 * f5 + f6 * f6 < (float)(i1 * i1))
            {
                motionevent = p;
                if (aj.b(g, (int)f2, (int)f4))
                {
                    motionevent = g;
                    d();
                }
            }
        }
        if (true) goto _L1; else goto _L4
_L4:
    }

    public void requestChildFocus(View view, View view1)
    {
        super.requestChildFocus(view, view1);
        if (!isInTouchMode() && !f)
        {
            boolean flag;
            if (view == g)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            q = flag;
        }
    }

    static 
    {
        int i1 = android.os.Build.VERSION.SDK_INT;
        if (i1 >= 17)
        {
            a = new z();
        } else
        if (i1 >= 16)
        {
            a = new y();
        } else
        {
            a = new x();
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


    private class SavedState extends android.view.View.BaseSavedState
    {

        public static final android.os.Parcelable.Creator CREATOR = new v();
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
