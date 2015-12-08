// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.aviary.android.feather.sdk.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.support.v4.widget.EdgeEffectCompat;
import android.util.AttributeSet;
import android.util.Log;
import android.view.GestureDetector;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.DecelerateInterpolator;
import android.widget.Adapter;
import java.util.List;
import java.util.Queue;

// Referenced classes of package com.aviary.android.feather.sdk.widget:
//            AviaryAbsSpinner, i, ScrollerRunnable, h, 
//            AviaryAdapterView

public class AviaryGallery extends AviaryAbsSpinner
    implements android.view.GestureDetector.OnGestureListener, ScrollerRunnable.a, i
{
    private class ScrollCompletedSelectionNotifier
        implements Runnable
    {

        final AviaryGallery a;

        public void run()
        {
            if (a.A)
            {
                if (a.getAdapter() != null)
                {
                    a.post(this);
                }
                return;
            } else
            {
                AviaryGallery.b(a);
                return;
            }
        }

        private ScrollCompletedSelectionNotifier()
        {
            a = AviaryGallery.this;
            super();
        }

    }

    private class ScrollScrollSelectionNotifier
        implements Runnable
    {

        final AviaryGallery a;

        public void run()
        {
            if (a.A)
            {
                if (a.getAdapter() != null)
                {
                    a.post(this);
                }
                return;
            } else
            {
                a.f();
                return;
            }
        }
    }

    public static interface a
    {

        public abstract void a(AviaryAdapterView aviaryadapterview, View view, int j, long l1);

        public abstract void b(AviaryAdapterView aviaryadapterview, View view, int j, long l1);

        public abstract void c(AviaryAdapterView aviaryadapterview, View view, int j, long l1);
    }


    ScrollCompletedSelectionNotifier K;
    ScrollScrollSelectionNotifier L;
    private h M;
    private boolean N;
    private a O;
    private int P;
    private int Q;
    private EdgeEffectCompat R;
    private EdgeEffectCompat S;
    private int T;
    private GestureDetector U;
    private int V;
    private boolean W;
    private ScrollerRunnable aa;
    private boolean ab;
    private int ac;
    private int ad;
    private boolean ae;
    private boolean af;
    private boolean ag;
    private boolean ah;
    private AviaryAdapterView.a ai;
    private boolean aj;

    public AviaryGallery(Context context)
    {
        this(context, null);
    }

    public AviaryGallery(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, com.aviary.android.feather.sdk.R.attr.aviaryGalleryStyle);
    }

    public AviaryGallery(Context context, AttributeSet attributeset, int j)
    {
        super(context, attributeset, j);
        N = false;
        O = null;
        P = 0;
        T = 16;
        ab = true;
        ae = false;
        af = true;
        ag = true;
        attributeset = context.getTheme().obtainStyledAttributes(attributeset, com.aviary.android.feather.sdk.R.styleable.AviaryGallery, j, 0);
        Q = attributeset.getInteger(0, 400);
        attributeset.recycle();
        U = new GestureDetector(context, this);
        U.setIsLongpressEnabled(false);
        attributeset = ViewConfiguration.get(context);
        ac = attributeset.getScaledTouchSlop();
        aa = new ScrollerRunnable(this, Q, attributeset.getScaledOverscrollDistance(), new DecelerateInterpolator(1.0F));
        M = new h(context, true);
    }

    private int a(View view, boolean flag)
    {
        int j;
        int i1;
        if (flag)
        {
            j = getMeasuredHeight();
        } else
        {
            j = getHeight();
        }
        if (flag)
        {
            i1 = view.getMeasuredHeight();
        } else
        {
            i1 = view.getHeight();
        }
        switch (T)
        {
        default:
            return 0;

        case 48: // '0'
            return i.top;

        case 16: // '\020'
            int j1 = i.bottom;
            int k1 = i.top;
            int l1 = i.top;
            return (j - j1 - k1 - i1) / 2 + l1;

        case 80: // 'P'
            return j - i.bottom - i1;
        }
    }

    private View a(int j, int i1, int j1, boolean flag)
    {
        int k1 = a.getItemViewType(j);
        View view;
        View view2;
        if (!A)
        {
            View view1 = (View)((Queue)n.get(k1)).poll();
            view = view1;
            if (view1 != null)
            {
                view = a.getView(j, view1, this);
                a(view, i1, j1, flag);
            }
        } else
        {
            view = null;
        }
        view2 = view;
        if (view == null)
        {
            view2 = a.getView(j, null, this);
            a(view2, i1, j1, flag);
        }
        if (!N && view2 != null)
        {
            if (j == ad)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            view2.setSelected(flag);
        }
        return view2;
    }

    private void a(Canvas canvas)
    {
        if (R != null)
        {
            if (!R.isFinished())
            {
                int j = canvas.save();
                int j1 = getHeight() - getPaddingTop() - getPaddingBottom();
                canvas.rotate(270F);
                canvas.translate(-j1 + getPaddingTop(), 0.0F);
                R.setSize(j1, getWidth());
                if (R.draw(canvas))
                {
                    postInvalidate();
                }
                canvas.restoreToCount(j);
            }
            if (!S.isFinished())
            {
                int i1 = canvas.save();
                int k1 = getWidth();
                int l1 = getHeight();
                int i2 = getPaddingTop();
                int j2 = getPaddingBottom();
                canvas.rotate(90F);
                canvas.translate(-getPaddingTop(), -k1);
                S.setSize(l1 - i2 - j2, k1);
                if (S.draw(canvas))
                {
                    postInvalidate();
                }
                canvas.restoreToCount(i1);
            }
        }
    }

    private void a(View view, int j, int i1, boolean flag)
    {
        android.view.ViewGroup.LayoutParams layoutparams = view.getLayoutParams();
        if (layoutparams == null)
        {
            layoutparams = generateDefaultLayoutParams();
        }
        int j1;
        int l1;
        if (flag)
        {
            j1 = -1;
        } else
        {
            j1 = 0;
        }
        addViewInLayout(view, j1, layoutparams);
        if (N)
        {
            int k1;
            boolean flag1;
            if (j == 0)
            {
                flag1 = true;
            } else
            {
                flag1 = false;
            }
            view.setSelected(flag1);
        }
        j = ViewGroup.getChildMeasureSpec(b, l + m, layoutparams.height);
        view.measure(ViewGroup.getChildMeasureSpec(c, 0, layoutparams.width), j);
        j1 = a(view, true);
        k1 = view.getMeasuredHeight();
        l1 = view.getMeasuredWidth();
        if (flag)
        {
            j = i1;
            i1 = l1 + i1;
        } else
        {
            j = i1 - l1;
        }
        view.layout(j, j1, i1, j1 + k1);
    }

    static void a(AviaryGallery aviarygallery)
    {
        aviarygallery.x();
    }

    private void a(boolean flag)
    {
        int i1;
        int j1;
        int i2;
        int k2;
        i1 = 0;
        j1 = 0;
        k2 = getChildCount();
        i2 = p;
        if (!flag) goto _L2; else goto _L1
_L1:
        int j;
        i1 = 0;
        j = 0;
_L7:
        int k1;
        int l1;
        k1 = j;
        l1 = j1;
        if (i1 >= k2) goto _L4; else goto _L3
_L3:
        View view = getChildAt(i1);
        if (view.getRight() < 0) goto _L6; else goto _L5
_L5:
        l1 = j1;
        k1 = j;
_L4:
        detachViewsFromParent(l1, k1);
        if (flag)
        {
            p = k1 + p;
        }
        return;
_L6:
        k1 = a.getItemViewType(i2 + i1);
        ((Queue)n.get(k1)).add(view);
        i1++;
        j++;
          goto _L7
_L2:
        int j2;
        j2 = getWidth();
        j = k2 - 1;
        k1 = 0;
        j1 = i1;
        i1 = k1;
_L10:
        k1 = i1;
        l1 = j1;
        if (j < 0) goto _L4; else goto _L8
_L8:
        view = getChildAt(j);
        k1 = i1;
        l1 = j1;
        if (view.getLeft() <= j2) goto _L4; else goto _L9
_L9:
        j1 = a.getItemViewType(i2 + j);
        ((Queue)n.get(j1)).add(view);
        i1++;
        j1 = j;
        j--;
          goto _L10
    }

    static void b(AviaryGallery aviarygallery)
    {
        aviarygallery.z();
    }

    private static int c(View view)
    {
        return view.getLeft() + view.getWidth() / 2;
    }

    private void d(int j)
    {
        for (int i1 = getChildCount() - 1; i1 >= 0; i1--)
        {
            getChildAt(i1).offsetLeftAndRight(j);
        }

    }

    private void d(View view)
    {
        if (view == null);
        setPressed(true);
    }

    private boolean e(int j)
    {
        View view = getChildAt(j);
        if (view != null)
        {
            if (O != null)
            {
                j = getSelectedItemPosition();
                if (j >= 0)
                {
                    View view1 = getSelectedView();
                    O.a(this, view1, j, getAdapter().getItemId(j));
                }
            }
            j = getCenterOfGallery() - c(view);
            aa.a(0, -j);
            return j != 0;
        } else
        {
            return false;
        }
    }

    private int getCenterOfGallery()
    {
        return P;
    }

    private boolean s()
    {
        if (getChildCount() >= 2 && (D == 0 || D == F - 1))
        {
            View view = getChildAt(D - p);
            if (view != null)
            {
                int j = c(view);
                int i1 = getCenterOfGallery();
                if (D == 0 && j > i1)
                {
                    return true;
                }
                if (D == F - 1 && j < i1)
                {
                    return true;
                }
            }
        }
        return false;
    }

    private void t()
    {
        Log.i("View", "onFinishedMovement");
        if (W)
        {
            return;
        }
        if (ag)
        {
            ag = false;
            b(D, D);
        }
        r();
        if (!N)
        {
            View view = getSelectedView();
            if (ad != D)
            {
                View view1 = getChildAt(ad - p);
                if (view1 != null)
                {
                    view1.setSelected(false);
                }
            }
            ad = D;
            if (view != null)
            {
                view.setSelected(true);
            }
        }
        invalidate();
    }

    private void u()
    {
        View view = getChildAt(D - p);
        if (view != null) goto _L2; else goto _L1
_L1:
        int i2;
        return;
_L2:
        if (view.getLeft() <= (i2 = getCenterOfGallery()) && view.getRight() >= i2) goto _L1; else goto _L3
_L3:
        int j;
        int i1;
        int j1;
        j1 = 0x7fffffff;
        j = getChildCount() - 1;
        i1 = 0;
_L6:
        if (j < 0)
        {
            break MISSING_BLOCK_LABEL_199;
        }
        view = getChildAt(j);
        if (view.getLeft() > i2 || view.getRight() < i2) goto _L5; else goto _L4
_L4:
        j = p + j;
        if (j != D)
        {
            j = Math.min(Math.max(j, 0), F - 1);
            b(j, true);
            setNextSelectedPositionInt(j);
            h();
            return;
        }
          goto _L1
_L5:
        int k1 = Math.min(Math.abs(view.getLeft() - i2), Math.abs(view.getRight() - i2));
        if (k1 < j1)
        {
            j1 = j;
            i1 = k1;
        } else
        {
            int l1 = j1;
            j1 = i1;
            i1 = l1;
        }
        j--;
        k1 = i1;
        i1 = j1;
        j1 = k1;
          goto _L6
        j = i1;
          goto _L4
    }

    private void v()
    {
        View view = getChildAt(0);
        int j;
        int i1;
        if (view != null)
        {
            i1 = p - 1;
            j = view.getLeft();
        } else
        {
            j = getRight() - getLeft();
            i1 = 0;
        }
        while (j > 0) 
        {
            View view1 = a(i1, i1 - D, j, false);
            p = i1;
            j = view1.getLeft();
            i1--;
        }
    }

    private void w()
    {
        int j1 = getRight();
        int k1 = getLeft();
        int j = getChildCount();
        View view = getChildAt(j - 1);
        int i1;
        if (view != null)
        {
            i1 = p + j;
            j = view.getRight();
        } else
        {
            i1 = F - 1;
            p = i1;
            j = 0;
        }
        while (j < j1 - k1) 
        {
            j = a(i1, i1 - D, j, true).getRight();
            i1++;
        }
    }

    private void x()
    {
        for (int j = getChildCount() - 1; j >= 0; j--) { }
        setPressed(false);
    }

    private void y()
    {
        M.a(10);
    }

    private void z()
    {
        Log.i("View", "fireOnScrollCompleted");
        int j;
        if (O != null)
        {
            if ((j = getSelectedItemPosition()) >= 0 && j < F)
            {
                View view = getSelectedView();
                O.c(this, view, j, getAdapter().getItemId(j));
                return;
            }
        }
    }

    int a(View view)
    {
        return view.getMeasuredHeight();
    }

    int a(boolean flag, int j)
    {
        View view;
        int i1;
        boolean flag1;
        flag1 = false;
        if (flag)
        {
            i1 = F - 1;
        } else
        {
            i1 = 0;
        }
        view = getChildAt(i1 - p);
        if (view != null) goto _L2; else goto _L1
_L1:
        i1 = j;
_L4:
        return i1;
_L2:
        int j1;
        int k1;
        j1 = c(view);
        if (flag)
        {
            i1 = view.getWidth() / 2;
        } else
        {
            i1 = -view.getWidth() / 2;
        }
        j1 = i1 + j1;
        k1 = getCenterOfGallery();
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_121;
        }
        i1 = ((flag1) ? 1 : 0);
        if (j1 <= k1) goto _L4; else goto _L3
_L3:
        i1 = k1 - j1;
        if (flag)
        {
            j = Math.max(i1, j);
        } else
        {
            j = Math.min(i1, j);
        }
        return j;
        if (j1 >= k1)
        {
            return 0;
        }
          goto _L3
    }

    public void a(View view, android.view.ViewGroup.LayoutParams layoutparams)
    {
        int j = ViewGroup.getChildMeasureSpec(b, getPaddingTop() + getPaddingBottom(), layoutparams.height);
        view.measure(ViewGroup.getChildMeasureSpec(c, getPaddingLeft() + getPaddingRight(), layoutparams.width), j);
    }

    public void b(int j)
    {
        if (j != 0) goto _L2; else goto _L1
_L1:
        return;
_L2:
        int i1;
        int j1;
        boolean flag;
        i1 = aa.a() - j;
        if (j > 0)
        {
            V = p;
            Math.min((getWidth() + 0 + 0) - 1, j);
        } else
        {
            V = (p + getChildCount()) - 1;
            Math.max(-((getWidth() + 0 + 0) - 1), j);
        }
        if (getChildCount() == 0) goto _L1; else goto _L3
_L3:
        if (i1 < 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (aa.f()) goto _L5; else goto _L4
_L4:
        j1 = a(flag, i1);
        if (j1 == i1) goto _L5; else goto _L6
_L6:
        if (flag) goto _L8; else goto _L7
_L7:
        j = j1;
        if (R != null)
        {
            R.onAbsorb((int)aa.e());
            j = j1;
        }
_L10:
        if (j != i1)
        {
            aa.b(false);
            if (j == 0)
            {
                t();
            }
        }
        d(j);
        a(flag);
        if (flag)
        {
            w();
        } else
        {
            v();
        }
        u();
        onScrollChanged(0, 0, 0, 0);
        invalidate();
        return;
_L8:
        j = j1;
        if (S != null)
        {
            S.onAbsorb((int)aa.e());
            j = j1;
        }
        continue; /* Loop/switch isn't completed */
_L5:
        j = i1;
        if (true) goto _L10; else goto _L9
_L9:
    }

    void b(int j, int i1)
    {
        Log.i("View", (new StringBuilder()).append("selectionChanged: ").append(D).append("(").append(j).append("/").append(i1).append("), inLayout: ").append(w).append(", suppress selection: ").append(ag).toString());
        if (N && j != i1)
        {
            View view = getChildAt(j - p);
            View view1 = getChildAt(i1 - p);
            if (view1 != null)
            {
                view1.setSelected(true);
            }
            if (view != null && view != view1)
            {
                view.setSelected(false);
            }
        }
        if (!ag)
        {
            if (O != null && !w && !d)
            {
                f();
            }
            if (D != -1 && isShown() && !isInTouchMode())
            {
                sendAccessibilityEvent(4);
            }
        }
        if (j != i1 && !w)
        {
            y();
        }
    }

    void b(int j, boolean flag)
    {
        Log.i("View", (new StringBuilder()).append("setSelectedPositionInt: ").append(j).append(" from ").append(D).toString());
        H = D;
        super.setSelectedPositionInt(j);
    }

    int c(int j)
    {
        View view;
        boolean flag;
        int i1 = 0;
        if (j > 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag)
        {
            i1 = F - 1;
        }
        view = getChildAt(i1 - p);
        if (view != null) goto _L2; else goto _L1
_L1:
        return j;
_L2:
        int j1;
        int k1;
        j1 = c(view);
        k1 = getCenterOfGallery();
        if (!flag)
        {
            continue; /* Loop/switch isn't completed */
        }
        if (j1 - j >= k1) goto _L1; else goto _L3
_L3:
        return j1 - k1;
        if (j1 - j <= k1) goto _L1; else goto _L4
_L4:
        return j1 - k1;
    }

    void c(int j, boolean flag, boolean flag1)
    {
        if (!flag1 && j == 0)
        {
            m();
            return;
        }
        int i1 = getRight();
        int j1 = getLeft();
        Log.i("View", (new StringBuilder()).append("layout. delta: ").append(j).append(", animate: ").append(flag).append(", changed: ").append(flag1).append(", inLayout: ").append(w).toString());
        if (A)
        {
            g();
        }
        if (F == 0)
        {
            b();
            return;
        }
        Log.d("View", (new StringBuilder()).append("mNextSelectedPosition: ").append(B).toString());
        if (B >= 0)
        {
            ad = B;
            b(B, flag);
        }
        p = D;
        if (getChildCount() == 0 || flag1 || j != 0)
        {
            c();
            a();
            removeAllViewsInLayout();
            View view = a(D, 0, 0, true);
            view.offsetLeftAndRight(((i1 - j1) / 2 + 0) - view.getWidth() / 2);
            w();
            v();
        }
        A = false;
        u = false;
        ag = false;
        setNextSelectedPositionInt(D);
        h();
        ag = true;
        Log.d("View", "layout complete");
        postInvalidate();
    }

    protected boolean checkLayoutParams(android.view.ViewGroup.LayoutParams layoutparams)
    {
        return layoutparams instanceof android.view.ViewGroup.LayoutParams;
    }

    protected int computeHorizontalScrollExtent()
    {
        return 1;
    }

    protected int computeHorizontalScrollOffset()
    {
        return D;
    }

    protected int computeHorizontalScrollRange()
    {
        return F;
    }

    protected void dispatchDraw(Canvas canvas)
    {
        super.dispatchDraw(canvas);
        if (getChildCount() > 0)
        {
            a(canvas);
        }
    }

    public boolean dispatchKeyEvent(KeyEvent keyevent)
    {
        return keyevent.dispatch(this, null, null);
    }

    protected void dispatchSetPressed(boolean flag)
    {
        if (getChildAt(D - p) == null);
    }

    public void dispatchSetSelected(boolean flag)
    {
        Log.i("View", "dispatchSetSelected");
    }

    protected void f()
    {
        Log.i("View", (new StringBuilder()).append("fireOnSelected: current: ").append(D).append(", next: ").append(getSelectedItemPosition()).append(", inLayout: ").append(w).toString());
        if (O == null)
        {
            return;
        } else
        {
            View view = getSelectedView();
            int j = getSelectedItemPosition();
            O.b(this, view, j, getAdapter().getItemId(j));
            return;
        }
    }

    protected android.view.ViewGroup.LayoutParams generateDefaultLayoutParams()
    {
        return new android.view.ViewGroup.LayoutParams(-2, -1);
    }

    public android.view.ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeset)
    {
        return new android.view.ViewGroup.LayoutParams(getContext(), attributeset);
    }

    protected android.view.ViewGroup.LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams layoutparams)
    {
        return new android.view.ViewGroup.LayoutParams(layoutparams);
    }

    public boolean getAutoSelectChild()
    {
        return N;
    }

    protected android.view.ContextMenu.ContextMenuInfo getContextMenuInfo()
    {
        return ai;
    }

    public int getCurrentSelectedItemPosition()
    {
        if (!N)
        {
            return ad;
        } else
        {
            return D;
        }
    }

    public int getMaxX()
    {
        return 0x7fffffff;
    }

    public int getMinX()
    {
        return 0;
    }

    public int getSelectedItemPosition()
    {
        return super.getSelectedItemPosition();
    }

    public boolean getVibrationEnabled()
    {
        return M.b();
    }

    public void k()
    {
        View view;
        if (getChildCount() != 0)
        {
            if (ab)
            {
                if ((view = getChildAt(D - p)) != null)
                {
                    int j = c(view);
                    j = getCenterOfGallery() - j;
                    if (j != 0)
                    {
                        aa.a(0, -j);
                        return;
                    } else
                    {
                        t();
                        return;
                    }
                }
            } else
            {
                t();
                return;
            }
        }
    }

    public void l()
    {
        int i1 = getChildCount();
        int j = 0;
        while (j < i1) 
        {
            View view = getChildAt(j);
            a.getView(p + j, view, this);
            if (!N)
            {
                boolean flag;
                if (p + j == ad)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                view.setSelected(flag);
            }
            j++;
        }
    }

    public void m()
    {
        for (int j = 0; j < getChildCount(); j++)
        {
            View view = getChildAt(j);
            a(view, view.getLayoutParams());
            view.layout(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        }

    }

    void n()
    {
        W = false;
        if (!aa.f()) goto _L2; else goto _L1
_L1:
        k();
_L4:
        if (R != null)
        {
            R.onRelease();
            S.onRelease();
        }
        x();
        return;
_L2:
        if (s())
        {
            k();
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    void o()
    {
        n();
    }

    protected void onDetachedFromWindow()
    {
        super.onDetachedFromWindow();
        removeCallbacks(K);
        removeCallbacks(L);
    }

    public boolean onDown(MotionEvent motionevent)
    {
        W = true;
        aa.a(false);
        V = a((int)motionevent.getX(), (int)motionevent.getY());
        if (V >= 0 && V < F)
        {
            if (getChildAt(V - p) == null);
        }
        aj = true;
        return true;
    }

    public boolean onFling(MotionEvent motionevent, MotionEvent motionevent1, float f1, float f2)
    {
        if (!ae)
        {
            ag = true;
        }
        int i1 = (int)(-f1) / 2;
        int j;
        byte byte0;
        if (i1 < 0)
        {
            j = 0x7fffffff;
        } else
        {
            j = 0;
        }
        if (i1 < 0)
        {
            byte0 = -2;
        } else
        {
            byte0 = 2;
        }
        if (byte0 == c(byte0))
        {
            aa.b(j, i1);
            return true;
        } else
        {
            return false;
        }
    }

    protected void onFocusChanged(boolean flag, int j, Rect rect)
    {
        super.onFocusChanged(flag, j, rect);
        rect = getChildAt(D - p);
        if (flag && rect != null && N)
        {
            rect.setSelected(true);
        }
    }

    public boolean onKeyDown(int j, KeyEvent keyevent)
    {
        boolean flag = true;
        j;
        JVM INSTR lookupswitch 4: default 44
    //                   21: 48
    //                   22: 62
    //                   23: 76
    //                   66: 76;
           goto _L1 _L2 _L3 _L4 _L4
_L1:
        flag = false;
_L6:
        return flag;
_L2:
        if (!p()) goto _L6; else goto _L5
_L5:
        playSoundEffect(1);
        return true;
_L3:
        if (!q()) goto _L6; else goto _L7
_L7:
        playSoundEffect(3);
        return true;
_L4:
        ah = true;
        if (true) goto _L1; else goto _L8
_L8:
    }

    public boolean onKeyUp(int j, KeyEvent keyevent)
    {
        switch (j)
        {
        default:
            return false;

        case 23: // '\027'
        case 66: // 'B'
            break;
        }
        if (ah && F > 0)
        {
            keyevent = getChildAt(D - p);
            if (keyevent != null)
            {
                d(keyevent);
                postDelayed(new Runnable() {

                    final AviaryGallery a;

                    public void run()
                    {
                        AviaryGallery.a(a);
                    }

            
            {
                a = AviaryGallery.this;
                super();
            }
                }, ViewConfiguration.getPressedStateDuration());
                a(keyevent, D, a.getItemId(D));
            }
        }
        ah = false;
        return true;
    }

    protected void onLayout(boolean flag, int j, int i1, int j1, int k1)
    {
        Log.i("View", (new StringBuilder()).append("onLayout: ").append(flag).toString());
        super.onLayout(flag, j, i1, j1, k1);
        w = true;
        c(0, false, flag);
        w = false;
    }

    public void onLongPress(MotionEvent motionevent)
    {
    }

    protected void onOverScrolled(int j, int i1, boolean flag, boolean flag1)
    {
    }

    public boolean onScroll(MotionEvent motionevent, MotionEvent motionevent1, float f1, float f2)
    {
        int j1;
        getParent().requestDisallowInterceptTouchEvent(true);
        ag = false;
        f2 = f1;
        if (aj)
        {
            if (O != null)
            {
                int j = getSelectedItemPosition();
                if (j >= 0)
                {
                    motionevent = getSelectedView();
                    O.a(this, motionevent, j, getAdapter().getItemId(j));
                }
            }
            int i1;
            if (f1 > 0.0F)
            {
                f2 = f1 - (float)ac;
            } else
            {
                f2 = f1 + (float)ac;
            }
        }
        j1 = (int)f2;
        i1 = c(j1);
        b(i1);
        if (R == null) goto _L2; else goto _L1
_L1:
        if (j1 == i1) goto _L4; else goto _L3
_L3:
        boolean flag;
        if (j1 > 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        motionevent = getChildAt(0);
        if (motionevent != null)
        {
            f1 = motionevent.getWidth() * 2;
        } else
        {
            f1 = getWidth() / 2;
        }
        if (flag) goto _L6; else goto _L5
_L5:
        R.onPull((float)(-j1) / f1);
        if (!S.isFinished())
        {
            S.onRelease();
        }
_L4:
        if (!S.isFinished() || !R.isFinished())
        {
            postInvalidate();
        }
_L2:
        aj = false;
        return true;
_L6:
        S.onPull((float)j1 / f1);
        if (!R.isFinished())
        {
            R.onRelease();
        }
        if (true) goto _L4; else goto _L7
_L7:
    }

    public void onShowPress(MotionEvent motionevent)
    {
    }

    public boolean onSingleTapUp(MotionEvent motionevent)
    {
        if (V >= 0 && V < F && !e(V - p))
        {
            if (af || V == D)
            {
                a(getChildAt(V - p), V, a.getItemId(V));
            }
            return true;
        } else
        {
            return false;
        }
    }

    protected void onSizeChanged(int j, int i1, int j1, int k1)
    {
        super.onSizeChanged(j, i1, j1, k1);
        P = j / 2;
    }

    public boolean onTouchEvent(MotionEvent motionevent)
    {
        boolean flag = U.onTouchEvent(motionevent);
        int j = motionevent.getAction();
        if (j == 1)
        {
            n();
        } else
        if (j == 3)
        {
            o();
            return flag;
        }
        return flag;
    }

    public boolean p()
    {
        if (F > 0 && D > 0)
        {
            e(D - p - 1);
            return true;
        } else
        {
            return false;
        }
    }

    public boolean q()
    {
        if (F > 0 && D < F - 1)
        {
            e((D - p) + 1);
            return true;
        } else
        {
            return false;
        }
    }

    void r()
    {
label0:
        {
            if (O != null)
            {
                if (!w && !d)
                {
                    break label0;
                }
                if (K == null)
                {
                    K = new ScrollCompletedSelectionNotifier();
                }
                post(K);
            }
            return;
        }
        z();
    }

    public void setAnimationDuration(int j)
    {
        Q = j;
    }

    public void setAutoScrollToCenter(boolean flag)
    {
        ab = flag;
    }

    public void setAutoSelectChild(boolean flag)
    {
        N = flag;
    }

    public void setCallbackDuringFling(boolean flag)
    {
        ae = flag;
    }

    public void setCallbackOnUnselectedItemClick(boolean flag)
    {
        af = flag;
    }

    public void setGravity(int j)
    {
        if (T != j)
        {
            T = j;
            requestLayout();
        }
    }

    public void setOnItemsScrollListener(a a1)
    {
        O = a1;
    }

    public void setOverScrollMode(int j)
    {
        super.setOverScrollMode(j);
        if (j != 2)
        {
            if (R == null)
            {
                R = new EdgeEffectCompat(getContext());
                S = new EdgeEffectCompat(getContext());
            }
            return;
        } else
        {
            S = null;
            R = null;
            return;
        }
    }

    public void setVibrationEnabled(boolean flag)
    {
        M.a(flag);
    }
}
