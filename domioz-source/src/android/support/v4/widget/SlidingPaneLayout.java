// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.widget;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.support.v4.view.ay;
import android.support.v4.view.bp;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;

// Referenced classes of package android.support.v4.widget:
//            ao, an, am, al, 
//            aj, ax

public final class SlidingPaneLayout extends ViewGroup
{

    static final al a;
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
    private final ax p;
    private boolean q;
    private boolean r;
    private final Rect s;
    private final ArrayList t;

    static ArrayList a(SlidingPaneLayout slidingpanelayout)
    {
        return slidingpanelayout.t;
    }

    static void a(SlidingPaneLayout slidingpanelayout, View view)
    {
        slidingpanelayout.a(view);
    }

    private void a(View view)
    {
        a.a(this, view);
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
            if (bp.g(view) != 2)
            {
                bp.a(view, 2, layoutparams.d);
            }
            a(view);
        } else
        if (bp.g(view) != 0)
        {
            if (layoutparams.d != null)
            {
                layoutparams.d.setColorFilter(null);
            }
            view = new aj(this, view);
            t.add(view);
            bp.a(this, view);
            return;
        }
    }

    private boolean a()
    {
        boolean flag = false;
        if (r || a(0.0F))
        {
            q = false;
            flag = true;
        }
        return flag;
    }

    private boolean a(float f1)
    {
        if (!g)
        {
            return false;
        }
        boolean flag = b();
        Object obj = (LayoutParams)h.getLayoutParams();
        int i1;
        if (flag)
        {
            i1 = getPaddingRight();
            int j1 = ((LayoutParams) (obj)).rightMargin;
            int l1 = h.getWidth();
            i1 = (int)((float)getWidth() - ((float)(j1 + i1) + (float)k * f1 + (float)l1));
        } else
        {
            i1 = getPaddingLeft();
            i1 = (int)((float)(((LayoutParams) (obj)).leftMargin + i1) + (float)k * f1);
        }
        if (p.a(h, i1, h.getTop()))
        {
            int k1 = getChildCount();
            for (i1 = 0; i1 < k1; i1++)
            {
                obj = getChildAt(i1);
                if (((View) (obj)).getVisibility() == 4)
                {
                    ((View) (obj)).setVisibility(0);
                }
            }

            bp.d(this);
            return true;
        } else
        {
            return false;
        }
    }

    private boolean b()
    {
        return bp.h(this) == 1;
    }

    private boolean b(View view)
    {
        if (view == null)
        {
            return false;
        }
        view = (LayoutParams)view.getLayoutParams();
        return g && ((LayoutParams) (view)).c && i > 0.0F;
    }

    protected final boolean checkLayoutParams(android.view.ViewGroup.LayoutParams layoutparams)
    {
        return (layoutparams instanceof LayoutParams) && super.checkLayoutParams(layoutparams);
    }

    public final void computeScroll()
    {
label0:
        {
            if (p.g())
            {
                if (g)
                {
                    break label0;
                }
                p.f();
            }
            return;
        }
        bp.d(this);
    }

    public final void draw(Canvas canvas)
    {
        super.draw(canvas);
        Drawable drawable;
        View view;
        if (b())
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
        if (b())
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

    protected final boolean drawChild(Canvas canvas, View view, long l1)
    {
        boolean flag;
        LayoutParams layoutparams = (LayoutParams)view.getLayoutParams();
        int i1 = canvas.save(2);
        if (g && !layoutparams.b && h != null)
        {
            canvas.getClipBounds(s);
            android.graphics.Bitmap bitmap;
            if (b())
            {
                s.left = Math.max(s.left, h.getRight());
            } else
            {
                s.right = Math.min(s.right, h.getLeft());
            }
            canvas.clipRect(s);
        }
        if (android.os.Build.VERSION.SDK_INT >= 11) goto _L2; else goto _L1
_L1:
        if (!layoutparams.c || i <= 0.0F) goto _L4; else goto _L3
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

    protected final android.view.ViewGroup.LayoutParams generateDefaultLayoutParams()
    {
        return new LayoutParams();
    }

    public final android.view.ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeset)
    {
        return new LayoutParams(getContext(), attributeset);
    }

    protected final android.view.ViewGroup.LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams layoutparams)
    {
        if (layoutparams instanceof android.view.ViewGroup.MarginLayoutParams)
        {
            return new LayoutParams((android.view.ViewGroup.MarginLayoutParams)layoutparams);
        } else
        {
            return new LayoutParams(layoutparams);
        }
    }

    protected final void onAttachedToWindow()
    {
        super.onAttachedToWindow();
        r = true;
    }

    protected final void onDetachedFromWindow()
    {
        super.onDetachedFromWindow();
        r = true;
        int j1 = t.size();
        for (int i1 = 0; i1 < j1; i1++)
        {
            ((aj)t.get(i1)).run();
        }

        t.clear();
    }

    public final boolean onInterceptTouchEvent(MotionEvent motionevent)
    {
        int i1;
        boolean flag;
        boolean flag1;
        flag1 = false;
        i1 = ay.a(motionevent);
        if (!g && i1 == 0 && getChildCount() > 1)
        {
            View view = getChildAt(1);
            if (view != null)
            {
                if (!ax.b(view, (int)motionevent.getX(), (int)motionevent.getY()))
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                q = flag;
            }
        }
        if (g && (!l || i1 == 0)) goto _L2; else goto _L1
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
        JVM INSTR tableswitch 0 2: default 160
    //                   0 185
    //                   1 160
    //                   2 241;
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
        l = false;
        f1 = motionevent.getX();
        f3 = motionevent.getY();
        n = f1;
        o = f3;
        if (!ax.b(h, (int)f1, (int)f3) || !b(h)) goto _L3; else goto _L8
_L8:
        i1 = 1;
          goto _L9
_L5:
        float f4 = motionevent.getX();
        float f2 = motionevent.getY();
        f4 = Math.abs(f4 - n);
        f2 = Math.abs(f2 - o);
        if (f4 > (float)p.d() && f2 > f4)
        {
            p.e();
            l = true;
            return false;
        }
          goto _L3
    }

    protected final void onLayout(boolean flag, int i1, int j1, int k1, int l1)
    {
        boolean flag2 = b();
        int i3;
        int k3;
        int l3;
        if (flag2)
        {
            p.a(2);
        } else
        {
            p.a(1);
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
        l3 = getPaddingTop();
        k3 = getChildCount();
        if (r)
        {
            float f1;
            View view;
            int i2;
            boolean flag1;
            int k4;
            if (g && q)
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
        while (l1 < k3) 
        {
            view = getChildAt(l1);
            if (view.getVisibility() != 8)
            {
                LayoutParams layoutparams = (LayoutParams)view.getLayoutParams();
                int j4 = view.getMeasuredWidth();
                flag1 = false;
                int j2;
                int l2;
                if (layoutparams.b)
                {
                    i2 = layoutparams.leftMargin;
                    k4 = layoutparams.rightMargin;
                    k4 = Math.min(i1, i3 - k1 - f) - j1 - (i2 + k4);
                    k = k4;
                    if (flag2)
                    {
                        j2 = layoutparams.rightMargin;
                    } else
                    {
                        j2 = layoutparams.leftMargin;
                    }
                    if (j1 + j2 + k4 + j4 / 2 > i3 - k1)
                    {
                        flag = true;
                    } else
                    {
                        flag = false;
                    }
                    layoutparams.c = flag;
                    k4 = (int)((float)k4 * i);
                    j1 += j2 + k4;
                    i = (float)k4 / (float)k;
                    j2 = ((flag1) ? 1 : 0);
                } else
                {
                    float f2;
                    float f3;
                    Object obj;
                    Object obj1;
                    int j3;
                    int i4;
                    int l4;
                    int i5;
                    int j5;
                    int k5;
                    int l5;
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
                    j2 = l2 - j4;
                } else
                {
                    j2 = j1 - j2;
                    l2 = j2 + j4;
                }
                view.layout(j2, l3, l2, view.getMeasuredHeight() + l3);
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
        if (!r)
        {
            break MISSING_BLOCK_LABEL_1063;
        }
        if (!g) goto _L2; else goto _L1
_L1:
        if (m == 0)
        {
            break MISSING_BLOCK_LABEL_657;
        }
        f3 = i;
        flag = b();
        obj = (LayoutParams)h.getLayoutParams();
        if (!((LayoutParams) (obj)).c)
        {
            break MISSING_BLOCK_LABEL_641;
        }
        if (flag)
        {
            i1 = ((LayoutParams) (obj)).rightMargin;
        } else
        {
            i1 = ((LayoutParams) (obj)).leftMargin;
        }
        if (i1 > 0)
        {
            break MISSING_BLOCK_LABEL_641;
        }
        i1 = 1;
_L3:
        j2 = getChildCount();
        j1 = 0;
        while (j1 < j2) 
        {
            obj = getChildAt(j1);
            if (obj != h)
            {
                k1 = (int)((1.0F - j) * (float)m);
                j = f3;
                l1 = k1 - (int)((1.0F - f3) * (float)m);
                k1 = l1;
                if (flag)
                {
                    k1 = -l1;
                }
                ((View) (obj)).offsetLeftAndRight(k1);
                if (i1 != 0)
                {
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
        break MISSING_BLOCK_LABEL_657;
        i1 = 0;
          goto _L3
        if (((LayoutParams)h.getLayoutParams()).c)
        {
            a(h, i, b);
        }
_L7:
        obj = h;
        flag = b();
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
        i4 = getPaddingTop();
        j4 = getHeight();
        l4 = getPaddingBottom();
        if (obj == null) goto _L5; else goto _L4
_L4:
        if (bp.i(((View) (obj))))
        {
            k1 = 1;
        } else
        {
label0:
            {
                if (android.os.Build.VERSION.SDK_INT >= 18)
                {
                    break label0;
                }
                obj1 = ((View) (obj)).getBackground();
                if (obj1 == null)
                {
                    break label0;
                }
                if (((Drawable) (obj1)).getOpacity() == -1)
                {
                    k1 = 1;
                } else
                {
                    k1 = 0;
                }
            }
        }
_L8:
        if (k1 == 0) goto _L5; else goto _L6
_L6:
        l2 = ((View) (obj)).getLeft();
        j2 = ((View) (obj)).getRight();
        l1 = ((View) (obj)).getTop();
        k1 = ((View) (obj)).getBottom();
_L9:
        i5 = getChildCount();
        j3 = 0;
        do
        {
            if (j3 >= i5)
            {
                break;
            }
            obj1 = getChildAt(j3);
            if (obj1 == obj)
            {
                break;
            }
            if (flag)
            {
                k3 = j1;
            } else
            {
                k3 = i1;
            }
            j5 = Math.max(k3, ((View) (obj1)).getLeft());
            k5 = Math.max(i4, ((View) (obj1)).getTop());
            if (flag)
            {
                k3 = i1;
            } else
            {
                k3 = j1;
            }
            k3 = Math.min(k3, ((View) (obj1)).getRight());
            l5 = Math.min(j4 - l4, ((View) (obj1)).getBottom());
            if (j5 >= l2 && k5 >= l1 && k3 <= j2 && l5 <= k1)
            {
                k3 = 4;
            } else
            {
                k3 = 0;
            }
            ((View) (obj1)).setVisibility(k3);
            j3++;
        } while (true);
        break MISSING_BLOCK_LABEL_1063;
_L2:
        i1 = 0;
        while (i1 < k3) 
        {
            a(getChildAt(i1), 0.0F, b);
            i1++;
        }
          goto _L7
        k1 = 0;
          goto _L8
_L5:
        k1 = 0;
        l1 = 0;
        j2 = 0;
        l2 = 0;
          goto _L9
        r = false;
        return;
          goto _L8
    }

    protected final void onMeasure(int i1, int j1)
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
        h = null;
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
                    if (flag && view1 != h)
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
        g = flag;
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

    protected final void onRestoreInstanceState(Parcelable parcelable)
    {
        parcelable = (SavedState)parcelable;
        super.onRestoreInstanceState(parcelable.getSuperState());
        if (((SavedState) (parcelable)).a)
        {
            if (r || a(1.0F))
            {
                q = true;
            }
        } else
        {
            a();
        }
        q = ((SavedState) (parcelable)).a;
    }

    protected final Parcelable onSaveInstanceState()
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
            flag = q;
        }
        savedstate.a = flag;
        return savedstate;
    }

    protected final void onSizeChanged(int i1, int j1, int k1, int l1)
    {
        super.onSizeChanged(i1, j1, k1, l1);
        if (i1 != k1)
        {
            r = true;
        }
    }

    public final boolean onTouchEvent(MotionEvent motionevent)
    {
        if (!g)
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
            int i1 = p.d();
            if (f5 * f5 + f6 * f6 < (float)(i1 * i1) && ax.b(h, (int)f2, (int)f4))
            {
                a();
            }
        }
        if (true) goto _L1; else goto _L4
_L4:
    }

    public final void requestChildFocus(View view, View view1)
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
            q = flag;
        }
    }

    static 
    {
        int i1 = android.os.Build.VERSION.SDK_INT;
        if (i1 >= 17)
        {
            a = new ao();
        } else
        if (i1 >= 16)
        {
            a = new an();
        } else
        {
            a = new am();
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

        public static final android.os.Parcelable.Creator CREATOR = new ak();
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
