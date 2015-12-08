// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.baselib.hlistview;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.TransitionDrawable;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcelable;
import android.support.v4.util.LongSparseArray;
import android.support.v4.util.SparseArrayCompat;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ActionMode;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.Checkable;
import android.widget.ListAdapter;
import com.roidapp.baselib.b;
import com.roidapp.baselib.i;
import java.util.ArrayList;

// Referenced classes of package com.roidapp.baselib.hlistview:
//            AdapterView, n, ag, b, 
//            l, w, q, ai, 
//            ah, aj, i, g, 
//            ac, t, d, c, 
//            f, k, a, e, 
//            j

public abstract class AbsHListView extends AdapterView
    implements android.view.ViewTreeObserver.OnGlobalLayoutListener, android.view.ViewTreeObserver.OnTouchModeChangeListener
{

    static final Interpolator T = new LinearInterpolator();
    public static final int U[] = {
        0
    };
    protected int A;
    int B;
    int C;
    int D;
    int E;
    protected int F;
    int G;
    int H;
    protected l I;
    protected int J;
    protected boolean K;
    boolean L;
    protected int M;
    protected int N;
    protected Runnable O;
    protected final boolean P[];
    int Q;
    int R;
    protected boolean S;
    ag a;
    private int aA;
    private e aB;
    private Runnable aC;
    private d aD;
    private k aE;
    private Runnable aF;
    private int aG;
    private int aH;
    private boolean aI;
    private int aJ;
    private int aK;
    private Runnable aL;
    private int aM;
    private int aN;
    private float aO;
    private int aP;
    private w aQ;
    private w aR;
    private int aS;
    private int aT;
    private int aU;
    private boolean aV;
    private int aW;
    private int aX;
    private com.roidapp.baselib.hlistview.i aY;
    private int aZ;
    private VelocityTracker au;
    private g av;
    private j aw;
    private boolean ax;
    private Rect ay;
    private android.view.ContextMenu.ContextMenuInfo az;
    protected int b;
    private int ba;
    private int bb;
    private SavedState bc;
    private float bd;
    public Object c;
    Object d;
    int e;
    protected SparseArrayCompat f;
    LongSparseArray g;
    protected int h;
    protected c i;
    protected ListAdapter j;
    boolean k;
    boolean l;
    Drawable m;
    int n;
    protected Rect o;
    protected final n p;
    int q;
    int r;
    int s;
    int t;
    protected Rect u;
    protected int v;
    View w;
    View x;
    protected boolean y;
    protected boolean z;

    public AbsHListView(Context context)
    {
        super(context);
        b = 0;
        h = 0;
        l = false;
        n = -1;
        o = new Rect();
        p = new n(this);
        q = 0;
        r = 0;
        s = 0;
        t = 0;
        u = new Rect();
        v = 0;
        F = -1;
        J = 0;
        ax = true;
        M = -1;
        az = null;
        aA = -1;
        aJ = 0;
        aO = 1.0F;
        P = new boolean[1];
        aP = -1;
        aU = 0;
        z();
    }

    public AbsHListView(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, b.a);
    }

    public AbsHListView(Context context, AttributeSet attributeset, int i1)
    {
        super(context, attributeset, i1);
        b = 0;
        h = 0;
        l = false;
        n = -1;
        o = new Rect();
        p = new n(this);
        q = 0;
        r = 0;
        s = 0;
        t = 0;
        u = new Rect();
        v = 0;
        F = -1;
        J = 0;
        ax = true;
        M = -1;
        az = null;
        aA = -1;
        aJ = 0;
        aO = 1.0F;
        P = new boolean[1];
        aP = -1;
        aU = 0;
        z();
        attributeset = context.getTheme().obtainStyledAttributes(attributeset, i.a, i1, 0);
        context = null;
        boolean flag3 = false;
        boolean flag2 = false;
        boolean flag1 = true;
        int k1 = 0;
        int j1 = 0;
        boolean flag = true;
        i1 = 0;
        if (attributeset != null)
        {
            context = attributeset.getDrawable(i.e);
            flag3 = attributeset.getBoolean(i.d, false);
            flag2 = attributeset.getBoolean(i.h, false);
            flag1 = attributeset.getBoolean(i.f, true);
            k1 = attributeset.getInt(i.i, 0);
            j1 = attributeset.getColor(i.b, 0);
            flag = attributeset.getBoolean(i.g, true);
            i1 = attributeset.getInt(i.c, 0);
            attributeset.recycle();
        }
        if (context != null)
        {
            a(context);
        }
        l = flag3;
        if (K != flag2)
        {
            K = flag2;
            if (getChildCount() > 0)
            {
                c();
                requestLayout();
                invalidate();
            }
        }
        b(flag1);
        aG = k1;
        h(j1);
        ax = flag;
        b = i1;
        if (android.os.Build.VERSION.SDK_INT >= 11 && c != null)
        {
            if (android.os.Build.VERSION.SDK_INT >= 11)
            {
                ((ActionMode)c).finish();
            }
            c = null;
        }
        if (b != 0)
        {
            if (f == null)
            {
                f = new SparseArrayCompat();
            }
            if (g == null && j != null && j.hasStableIds())
            {
                g = new LongSparseArray();
            }
            if (android.os.Build.VERSION.SDK_INT >= 11 && b == 3)
            {
                a();
                setLongClickable(true);
            }
        }
    }

    private boolean A()
    {
        int i1 = getChildCount();
        if (i1 != 0)
        {
            if (i1 != ao)
            {
                return false;
            }
            if (getChildAt(0).getLeft() < u.left || getChildAt(i1 - 1).getRight() > getWidth() - u.right)
            {
                return false;
            }
        }
        return true;
    }

    private boolean B()
    {
        switch (F)
        {
        default:
            return false;

        case 1: // '\001'
        case 2: // '\002'
            return true;
        }
    }

    private void C()
    {
label0:
        {
            if (m != null)
            {
                if (!g())
                {
                    break label0;
                }
                m.setState(getDrawableState());
            }
            return;
        }
        m.setState(U);
    }

    private void D()
    {
        if (a.a() && (getParent() instanceof View))
        {
            ((View)getParent()).invalidate();
        }
    }

    private void E()
    {
        if (au == null)
        {
            au = VelocityTracker.obtain();
        }
    }

    private void F()
    {
        if (au != null)
        {
            au.recycle();
            au = null;
        }
    }

    private void G()
    {
        if (L && !y && !a.a())
        {
            setChildrenDrawnWithCacheEnabled(true);
            setChildrenDrawingCacheEnabled(true);
            z = true;
            y = true;
        }
    }

    private void H()
    {
        if (!a.a())
        {
            if (aL == null)
            {
                aL = new com.roidapp.baselib.hlistview.b(this);
            }
            post(aL);
        }
    }

    private boolean I()
    {
        int k3 = getChildCount();
        if (k3 > 0) goto _L2; else goto _L1
_L1:
        return false;
_L2:
        int i1;
        int j1;
        int k1;
        int j3;
        i1 = u.left;
        j1 = getRight() - getLeft() - u.right;
        j3 = V;
        k1 = M;
        if (k1 < j3 || k1 >= j3 + k3) goto _L4; else goto _L3
_L3:
        boolean flag;
        View view = getChildAt(k1 - V);
        int i2 = view.getLeft();
        int k2 = view.getRight();
        if (i2 < i1)
        {
            i1 = getHorizontalFadingEdgeLength() + i1;
            flag = true;
            j1 = k1;
        } else
        {
            i1 = i2;
            if (k2 > j1)
            {
                i1 = j1 - view.getMeasuredWidth() - getHorizontalFadingEdgeLength();
            }
            flag = true;
            j1 = k1;
        }
_L5:
        M = -1;
        removeCallbacks(av);
        if (I != null)
        {
            I.a();
        }
        F = -1;
        H();
        W = i1;
        i1 = a(j1, flag);
        View view1;
        int j2;
        int l3;
        int i4;
        if (i1 >= j3 && i1 <= u())
        {
            h = 4;
            C();
            g(i1);
            b();
        } else
        {
            i1 = -1;
        }
        b(0);
        if (i1 >= 0)
        {
            return true;
        }
        if (true) goto _L1; else goto _L4
_L4:
        if (k1 >= j3)
        {
            break MISSING_BLOCK_LABEL_343;
        }
        j2 = 0;
        k1 = 0;
        j1 = i1;
        i1 = k1;
_L6:
label0:
        {
            if (j2 >= k3)
            {
                break MISSING_BLOCK_LABEL_334;
            }
            int l1 = getChildAt(j2).getLeft();
            int l2;
            if (j2 == 0)
            {
                if (j3 > 0 || l1 < j1)
                {
                    i1 = getHorizontalFadingEdgeLength() + j1;
                    j1 = l1;
                } else
                {
                    i1 = j1;
                    j1 = l1;
                }
            } else
            {
                int i3 = i1;
                i1 = j1;
                j1 = i3;
            }
            if (l1 < i1)
            {
                break label0;
            }
            i1 = l1;
            j1 = j3 + j2;
            flag = true;
        }
          goto _L5
        j2++;
        l1 = i1;
        i1 = j1;
        j1 = l1;
          goto _L6
        j1 = j3;
        flag = true;
          goto _L5
        l3 = ao;
        j2 = k3 - 1;
        i1 = 0;
_L7:
label1:
        {
            if (j2 < 0)
            {
                break MISSING_BLOCK_LABEL_478;
            }
            view1 = getChildAt(j2);
            l1 = view1.getLeft();
            i4 = view1.getRight();
            if (j2 == k3 - 1)
            {
                if (j3 + k3 < l3 || i4 > j1)
                {
                    i1 = j1 - getHorizontalFadingEdgeLength();
                    j1 = l1;
                } else
                {
                    i1 = j1;
                    j1 = l1;
                }
            } else
            {
                l2 = i1;
                i1 = j1;
                j1 = l2;
            }
            if (i4 > i1)
            {
                break label1;
            }
            i1 = l1;
            j1 = j3 + j2;
            flag = false;
        }
          goto _L5
        j2--;
        l1 = i1;
        i1 = j1;
        j1 = l1;
          goto _L7
        j1 = (j3 + k3) - 1;
        flag = false;
          goto _L5
    }

    private void J()
    {
        if (aQ != null)
        {
            aQ.b();
            aR.b();
        }
    }

    static int a(AbsHListView abshlistview)
    {
        return abshlistview.getWindowAttachCount();
    }

    static View a(ArrayList arraylist, int i1)
    {
        int k1 = arraylist.size();
        if (k1 > 0)
        {
            for (int j1 = 0; j1 < k1; j1++)
            {
                View view = (View)arraylist.get(j1);
                if (((LayoutParams)view.getLayoutParams()).d == i1)
                {
                    arraylist.remove(j1);
                    return view;
                }
            }

            return (View)arraylist.remove(k1 - 1);
        } else
        {
            return null;
        }
    }

    static e a(AbsHListView abshlistview, e e1)
    {
        abshlistview.aB = e1;
        return e1;
    }

    private void a(Canvas canvas)
    {
        if (!o.isEmpty())
        {
            Drawable drawable = m;
            drawable.setBounds(o);
            drawable.draw(canvas);
        }
    }

    private void a(MotionEvent motionevent)
    {
        int i1 = (motionevent.getAction() & 0xff00) >> 8;
        if (motionevent.getPointerId(i1) == aP)
        {
            if (i1 == 0)
            {
                i1 = 1;
            } else
            {
                i1 = 0;
            }
            D = (int)motionevent.getX(i1);
            E = (int)motionevent.getY(i1);
            H = 0;
            aP = motionevent.getPointerId(i1);
        }
    }

    static void a(AbsHListView abshlistview, View view)
    {
        abshlistview.removeDetachedView(view, false);
    }

    static boolean a(AbsHListView abshlistview, int i1, int j1, int k1)
    {
        return abshlistview.overScrollBy(i1, 0, j1, 0, 0, 0, k1, 0, false);
    }

    private int b(int i1, int j1)
    {
        Rect rect1 = ay;
        Rect rect = rect1;
        if (rect1 == null)
        {
            ay = new Rect();
            rect = ay;
        }
        for (int k1 = getChildCount() - 1; k1 >= 0; k1--)
        {
            View view = getChildAt(k1);
            if (view.getVisibility() != 0)
            {
                continue;
            }
            view.getHitRect(rect);
            if (rect.contains(i1, j1))
            {
                return V + k1;
            }
        }

        return -1;
    }

    static int b(AbsHListView abshlistview)
    {
        return abshlistview.getWindowAttachCount();
    }

    static void b(AbsHListView abshlistview, View view)
    {
        abshlistview.removeDetachedView(view, false);
    }

    private void b(boolean flag)
    {
        if (L && !flag)
        {
            H();
        }
        L = flag;
    }

    static boolean b(AbsHListView abshlistview, int i1, int j1, int k1)
    {
        return abshlistview.overScrollBy(i1, 0, j1, 0, 0, 0, k1, 0, false);
    }

    private static android.view.ContextMenu.ContextMenuInfo c(View view, int i1, long l1)
    {
        return new q(view, i1, l1);
    }

    static e c(AbsHListView abshlistview)
    {
        return abshlistview.aB;
    }

    static void c(AbsHListView abshlistview, View view)
    {
        abshlistview.removeDetachedView(view, false);
    }

    static int d(AbsHListView abshlistview)
    {
        return abshlistview.aP;
    }

    static void d(AbsHListView abshlistview, View view)
    {
        abshlistview.removeDetachedView(view, false);
    }

    static VelocityTracker e(AbsHListView abshlistview)
    {
        return abshlistview.au;
    }

    static void e(AbsHListView abshlistview, View view)
    {
        abshlistview.removeDetachedView(view, false);
    }

    static int f(AbsHListView abshlistview)
    {
        return abshlistview.aN;
    }

    static int g(AbsHListView abshlistview)
    {
        return abshlistview.aM;
    }

    static boolean h(AbsHListView abshlistview)
    {
        return abshlistview.A();
    }

    static w i(AbsHListView abshlistview)
    {
        return abshlistview.aQ;
    }

    static w j(AbsHListView abshlistview)
    {
        return abshlistview.aR;
    }

    static void k(AbsHListView abshlistview)
    {
        abshlistview.H();
    }

    static boolean l(AbsHListView abshlistview)
    {
        return abshlistview.overScrollBy(0, 0, 0, 0, 0, 0, 0, 0, false);
    }

    static void m(AbsHListView abshlistview)
    {
        abshlistview.setChildrenDrawnWithCacheEnabled(false);
    }

    static void n(AbsHListView abshlistview)
    {
        abshlistview.setChildrenDrawingCacheEnabled(false);
    }

    private boolean n(int i1)
    {
        boolean flag = false;
        int k1 = i1 - D;
        int l1 = Math.abs(k1);
        int j1;
        if (getScrollX() != 0)
        {
            j1 = 1;
        } else
        {
            j1 = 0;
        }
        if (j1 != 0 || l1 > aK)
        {
            G();
            Object obj;
            if (j1 != 0)
            {
                F = 5;
                j1 = 0;
            } else
            {
                F = 3;
                if (k1 > 0)
                {
                    j1 = aK;
                } else
                {
                    j1 = -aK;
                }
            }
            H = j1;
            obj = getHandler();
            if (obj != null)
            {
                ((Handler) (obj)).removeCallbacks(aB);
            }
            setPressed(false);
            obj = getChildAt(A - V);
            if (obj != null)
            {
                ((View) (obj)).setPressed(false);
            }
            b(1);
            obj = getParent();
            if (obj != null)
            {
                ((ViewParent) (obj)).requestDisallowInterceptTouchEvent(true);
            }
            o(i1);
            flag = true;
        }
        return flag;
    }

    private void o(int i1)
    {
        int j2 = i1 - D;
        int i2 = j2 - H;
        int j1;
        if (G != 0x80000000)
        {
            j1 = i1 - G;
        } else
        {
            j1 = i2;
        }
        if (F == 3)
        {
            if (i1 != G)
            {
                if (Math.abs(j2) > aK)
                {
                    ViewParent viewparent = getParent();
                    if (viewparent != null)
                    {
                        viewparent.requestDisallowInterceptTouchEvent(true);
                    }
                }
                View view;
                int k1;
                int l1;
                boolean flag;
                if (A >= 0)
                {
                    k1 = A - V;
                } else
                {
                    k1 = getChildCount() / 2;
                }
                view = getChildAt(k1);
                int k2;
                if (view != null)
                {
                    l1 = view.getLeft();
                } else
                {
                    l1 = 0;
                }
                if (j1 != 0)
                {
                    flag = a(i2, j1);
                } else
                {
                    flag = false;
                }
                view = getChildAt(k1);
                if (view != null)
                {
                    k1 = view.getLeft();
                    if (flag)
                    {
                        j1 = -j1 - (k1 - l1);
                        overScrollBy(j1, 0, getScrollX(), 0, 0, 0, Q, 0, true);
                        if (Math.abs(Q) == Math.abs(getScrollX()) && au != null)
                        {
                            au.clear();
                        }
                        k1 = getOverScrollMode();
                        if (k1 == 0 || k1 == 1 && !A())
                        {
                            aU = 0;
                            F = 5;
                            if (j2 > 0)
                            {
                                aQ.a((float)j1 / (float)getWidth());
                                if (!aR.a())
                                {
                                    aR.c();
                                }
                                invalidate(aQ.a(false));
                            } else
                            if (j2 < 0)
                            {
                                aR.a((float)j1 / (float)getWidth());
                                if (!aQ.a())
                                {
                                    aQ.c();
                                }
                                invalidate(aR.a(true));
                            }
                        }
                    }
                    D = i1;
                }
                G = i1;
            }
        } else
        if (F == 5 && i1 != G)
        {
            i2 = getScrollX();
            k2 = i2 - j1;
            if (i1 > G)
            {
                k1 = 1;
            } else
            {
                k1 = -1;
            }
            if (aU == 0)
            {
                aU = k1;
            }
            l1 = -j1;
            if (k2 < 0 && i2 >= 0 || k2 > 0 && i2 <= 0)
            {
                i2 = -i2;
                l1 = j1 + i2;
                j1 = i2;
            } else
            {
                i2 = 0;
                j1 = l1;
                l1 = i2;
            }
            if (j1 != 0)
            {
                overScrollBy(j1, 0, getScrollX(), 0, 0, 0, Q, 0, true);
                i2 = getOverScrollMode();
                if (i2 == 0 || i2 == 1 && !A())
                {
                    if (j2 > 0)
                    {
                        aQ.a((float)j1 / (float)getWidth());
                        if (!aR.a())
                        {
                            aR.c();
                        }
                        invalidate(aQ.a(false));
                    } else
                    if (j2 < 0)
                    {
                        aR.a((float)j1 / (float)getWidth());
                        if (!aQ.a())
                        {
                            aQ.c();
                        }
                        invalidate(aR.a(true));
                    }
                }
            }
            if (l1 != 0)
            {
                if (getScrollX() != 0)
                {
                    a.a(0);
                    D();
                }
                a(l1, l1);
                F = 3;
                i2 = getChildCount();
                if (i2 == 0)
                {
                    j1 = -1;
                } else
                {
                    l1 = f(i1);
                    j1 = l1;
                    if (l1 == -1)
                    {
                        j1 = (V + i2) - 1;
                    }
                }
                H = 0;
                view = getChildAt(j1 - V);
                if (view != null)
                {
                    l1 = view.getLeft();
                } else
                {
                    l1 = 0;
                }
                B = l1;
                D = i1;
                A = j1;
            }
            G = i1;
            aU = k1;
            return;
        }
    }

    private void z()
    {
        setClickable(true);
        setFocusableInTouchMode(true);
        setWillNotDraw(false);
        setAlwaysDrawnWithCacheEnabled(false);
        b(true);
        Object obj = ViewConfiguration.get(getContext());
        aK = ((ViewConfiguration) (obj)).getScaledTouchSlop();
        aM = ((ViewConfiguration) (obj)).getScaledMinimumFlingVelocity();
        aN = ((ViewConfiguration) (obj)).getScaledMaximumFlingVelocity();
        Q = ((ViewConfiguration) (obj)).getScaledOverscrollDistance();
        R = ((ViewConfiguration) (obj)).getScaledOverflingDistance();
        int i1 = android.os.Build.VERSION.SDK_INT;
        if (i1 >= 16)
        {
            obj = new ai(this);
        } else
        if (i1 >= 14)
        {
            obj = new ah(this);
        } else
        {
            obj = new aj(this);
        }
        a = ((ag) (obj));
    }

    protected final View a(int i1, boolean aflag[])
    {
        Object obj;
        aflag[0] = false;
        obj = p.c(i1);
        if (obj == null) goto _L2; else goto _L1
_L1:
        return ((View) (obj));
_L2:
        View view = p.d(i1);
        if (view == null) goto _L4; else goto _L3
_L3:
        obj = j.getView(i1, view, this);
        if (android.os.Build.VERSION.SDK_INT >= 16 && ((View) (obj)).getImportantForAccessibility() == 0)
        {
            ((View) (obj)).setImportantForAccessibility(1);
        }
        if (obj != view)
        {
            p.a(view, i1);
            aflag = ((boolean []) (obj));
            if (aH != 0)
            {
                ((View) (obj)).setDrawingCacheBackgroundColor(aH);
                aflag = ((boolean []) (obj));
            }
        } else
        {
            aflag[0] = true;
            ((View) (obj)).onFinishTemporaryDetach();
            aflag = ((boolean []) (obj));
        }
_L5:
        if (k)
        {
            obj = aflag.getLayoutParams();
            if (obj == null)
            {
                obj = (LayoutParams)generateDefaultLayoutParams();
            } else
            if (!checkLayoutParams(((android.view.ViewGroup.LayoutParams) (obj))))
            {
                obj = (LayoutParams)generateLayoutParams(((android.view.ViewGroup.LayoutParams) (obj)));
            } else
            {
                obj = (LayoutParams)obj;
            }
            obj.e = j.getItemId(i1);
            aflag.setLayoutParams(((android.view.ViewGroup.LayoutParams) (obj)));
        }
        obj = aflag;
        if (aq.isEnabled())
        {
            obj = aflag;
            if (aY == null)
            {
                aY = new com.roidapp.baselib.hlistview.i(this);
                return aflag;
            }
        }
        if (true) goto _L1; else goto _L4
_L4:
        obj = j.getView(i1, null, this);
        if (android.os.Build.VERSION.SDK_INT >= 16 && ((View) (obj)).getImportantForAccessibility() == 0)
        {
            ((View) (obj)).setImportantForAccessibility(1);
        }
        aflag = ((boolean []) (obj));
        if (aH != 0)
        {
            ((View) (obj)).setDrawingCacheBackgroundColor(aH);
            aflag = ((boolean []) (obj));
        }
          goto _L5
    }

    public final void a()
    {
        if (f != null)
        {
            f.clear();
        }
        if (g != null)
        {
            g.clear();
        }
        e = 0;
    }

    public final void a(int i1)
    {
        a(getResources().getDrawable(i1));
    }

    public final void a(int i1, int j1, boolean flag)
    {
        if (av == null)
        {
            av = new g(this);
        }
        int k1 = V;
        int l1 = getChildCount();
        int i2 = getPaddingLeft();
        int j2 = getWidth();
        int k2 = getPaddingRight();
        if (i1 == 0 || ao == 0 || l1 == 0 || k1 == 0 && getChildAt(0).getLeft() == i2 && i1 < 0 || k1 + l1 == ao && getChildAt(l1 - 1).getRight() == j2 - k2 && i1 > 0)
        {
            av.b();
            if (I != null)
            {
                I.a();
            }
            return;
        } else
        {
            b(2);
            av.a(i1, j1, flag);
            return;
        }
    }

    protected final void a(int i1, View view)
    {
        if (i1 != -1)
        {
            n = i1;
        }
        Rect rect = o;
        rect.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        i1 = rect.left;
        int j1 = rect.top;
        int k1 = rect.right;
        int l1 = rect.bottom;
        o.set(i1 - q, j1 - r, k1 + s, l1 + t);
        boolean flag = aI;
        if (view.isEnabled() != flag)
        {
            if (!flag)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            aI = flag;
            if (q() != -1)
            {
                refreshDrawableState();
            }
        }
    }

    public final void a(Drawable drawable)
    {
        if (m != null)
        {
            m.setCallback(null);
            unscheduleDrawable(m);
        }
        m = drawable;
        Rect rect = new Rect();
        drawable.getPadding(rect);
        q = rect.left;
        r = rect.top;
        s = rect.right;
        t = rect.bottom;
        drawable.setCallback(this);
        C();
    }

    public void a(ListAdapter listadapter)
    {
        if (listadapter != null)
        {
            k = j.hasStableIds();
            if (b != 0 && k && g == null)
            {
                g = new LongSparseArray();
            }
        }
        if (f != null)
        {
            f.clear();
        }
        if (g != null)
        {
            g.clear();
        }
    }

    protected abstract void a(boolean flag);

    final boolean a(int i1, int j1)
    {
        boolean flag1;
        int i4 = getChildCount();
        if (i4 == 0)
        {
            return true;
        }
        int i3 = getChildAt(0).getLeft();
        int j3 = getChildAt(i4 - 1).getRight();
        Rect rect = u;
        int k3 = getWidth();
        int k1 = getWidth() - getPaddingRight() - getPaddingLeft();
        int i2;
        int j2;
        int l3;
        if (i1 < 0)
        {
            i2 = Math.max(-(k1 - 1), i1);
        } else
        {
            i2 = Math.min(k1 - 1, i1);
        }
        if (j1 < 0)
        {
            j2 = Math.max(-(k1 - 1), j1);
        } else
        {
            j2 = Math.min(k1 - 1, j1);
        }
        l3 = V;
        if (l3 == 0)
        {
            aS = i3 - rect.left;
        } else
        {
            aS = aS + j2;
        }
        if (l3 + i4 == ao)
        {
            aT = rect.right + j3;
        } else
        {
            aT = aT + j2;
        }
        if (l3 == 0 && i3 >= rect.left && j2 >= 0)
        {
            i1 = 1;
        } else
        {
            i1 = 0;
        }
        if (l3 + i4 == ao && j3 <= getWidth() - rect.right && j2 <= 0)
        {
            j1 = 1;
        } else
        {
            j1 = 0;
        }
        if (i1 != 0 || j1 != 0)
        {
            return j2 != 0;
        }
        int k2;
        int l2;
        int j4;
        int k4;
        boolean flag;
        if (j2 < 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        flag1 = isInTouchMode();
        if (flag1)
        {
            k();
        }
        j4 = i();
        k4 = ao - j();
        k1 = 0;
        j1 = 0;
        if (flag)
        {
            int l4 = -j2;
            i1 = 0;
            j1 = 0;
            do
            {
                k2 = i1;
                l2 = k1;
                if (j1 >= i4)
                {
                    break;
                }
                View view = getChildAt(j1);
                k2 = i1;
                l2 = k1;
                if (view.getRight() >= l4)
                {
                    break;
                }
                k2 = l3 + j1;
                if (k2 >= j4 && k2 < k4)
                {
                    p.a(view, k2);
                }
                j1++;
                i1++;
            } while (true);
        } else
        {
            int i5 = getWidth();
            k2 = 0;
            i1 = i4 - 1;
            int l1 = j1;
            j1 = k2;
            do
            {
                k2 = j1;
                l2 = l1;
                if (i1 < 0)
                {
                    break;
                }
                View view1 = getChildAt(i1);
                k2 = j1;
                l2 = l1;
                if (view1.getLeft() <= i5 - j2)
                {
                    break;
                }
                l1 = l3 + i1;
                if (l1 >= j4 && l1 < k4)
                {
                    p.a(view1, l1);
                }
                j1++;
                l1 = i1;
                i1--;
            } while (true);
        }
        C = B + i2;
        at = true;
        if (k2 > 0)
        {
            detachViewsFromParent(l2, k2);
            p.d();
        }
        if (!awakenScrollBars())
        {
            invalidate();
        }
        e(j2);
        if (flag)
        {
            V = k2 + V;
        }
        i1 = Math.abs(j2);
        if (0 - i3 < i1 || j3 - (k3 + 0) < i1)
        {
            a(flag);
        }
        if (flag1 || am == -1) goto _L2; else goto _L1
_L1:
        i1 = am - V;
        if (i1 >= 0 && i1 < getChildCount())
        {
            a(am, getChildAt(i1));
        }
_L4:
        at = false;
        b();
        return false;
_L2:
        if (n != -1)
        {
            i1 = n - V;
            if (i1 >= 0 && i1 < getChildCount())
            {
                a(-1, getChildAt(i1));
            }
        } else
        {
            o.setEmpty();
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public final boolean a(View view, int i1, long l1)
    {
        boolean flag = true;
        boolean flag2;
        if (b != 0)
        {
            if (b == 2 || android.os.Build.VERSION.SDK_INT >= 11 && b == 3 && c != null)
            {
                View view1;
                boolean flag1;
                int j1;
                int k1;
                int i2;
                int j2;
                if (!((Boolean)f.get(i1, Boolean.valueOf(false))).booleanValue())
                {
                    flag2 = true;
                } else
                {
                    flag2 = false;
                }
                f.put(i1, Boolean.valueOf(flag2));
                if (g != null && j.hasStableIds())
                {
                    if (flag2)
                    {
                        g.put(j.getItemId(i1), Integer.valueOf(i1));
                    } else
                    {
                        g.delete(j.getItemId(i1));
                    }
                }
                if (flag2)
                {
                    e = e + 1;
                } else
                {
                    e = e - 1;
                }
                boolean flag3;
                if (c != null)
                {
                    ((ac)d).a((ActionMode)c, i1, l1, flag2);
                    flag = false;
                } else
                {
                    flag = true;
                }
                flag1 = true;
            } else
            if (b == 1)
            {
                if (!((Boolean)f.get(i1, Boolean.valueOf(false))).booleanValue())
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                if (flag)
                {
                    f.clear();
                    f.put(i1, Boolean.valueOf(true));
                    if (g != null && j.hasStableIds())
                    {
                        g.clear();
                        g.put(j.getItemId(i1), Integer.valueOf(i1));
                    }
                    e = 1;
                } else
                if (f.size() == 0 || !((Boolean)f.valueAt(0)).booleanValue())
                {
                    e = 0;
                }
                flag1 = true;
                flag = true;
            } else
            {
                flag1 = false;
                flag = true;
            }
            if (flag1)
            {
                k1 = V;
                i2 = getChildCount();
                if (android.os.Build.VERSION.SDK_INT >= 11)
                {
                    flag1 = true;
                } else
                {
                    flag1 = false;
                }
                j1 = 0;
                do
                {
                    if (j1 >= i2)
                    {
                        break;
                    }
                    view1 = getChildAt(j1);
                    j2 = k1 + j1;
                    if (view1 instanceof Checkable)
                    {
                        ((Checkable)view1).setChecked(((Boolean)f.get(j2, Boolean.valueOf(false))).booleanValue());
                    } else
                    if (flag1)
                    {
                        view1.setActivated(((Boolean)f.get(j2, Boolean.valueOf(false))).booleanValue());
                    }
                    j1++;
                } while (true);
            }
            flag2 = true;
        } else
        {
            flag2 = false;
        }
        flag3 = flag2;
        if (flag)
        {
            flag3 = flag2 | super.a(view, i1, l1);
        }
        return flag3;
    }

    public void addTouchables(ArrayList arraylist)
    {
        int j1 = getChildCount();
        int k1 = V;
        ListAdapter listadapter = j;
        if (listadapter != null)
        {
            int i1 = 0;
            while (i1 < j1) 
            {
                View view = getChildAt(i1);
                if (listadapter.isEnabled(k1 + i1))
                {
                    arraylist.add(view);
                }
                view.addTouchables(arraylist);
                i1++;
            }
        }
    }

    protected final void b()
    {
        if (aw != null)
        {
            getChildCount();
        }
        onScrollChanged(0, 0, 0, 0);
    }

    final void b(int i1)
    {
        if (i1 != aJ && aw != null)
        {
            aJ = i1;
        }
    }

    final boolean b(View view, int i1, long l1)
    {
        boolean flag1 = true;
        boolean flag3;
        if (android.os.Build.VERSION.SDK_INT >= 11 && b == 3)
        {
            flag3 = flag1;
            if (c == null)
            {
                view = startActionMode((ac)d);
                c = view;
                flag3 = flag1;
                if (view != null)
                {
                    if (b != 0)
                    {
                        if (android.os.Build.VERSION.SDK_INT >= 11 && b == 3 && c == null)
                        {
                            if (d == null || !((ac)d).a())
                            {
                                throw new IllegalStateException("AbsListView: attempted to start selection mode for CHOICE_MODE_MULTIPLE_MODAL but no choice mode callback was supplied. Call setMultiChoiceModeListener to set a callback.");
                            }
                            c = startActionMode((ac)d);
                        }
                        if (b == 2 || android.os.Build.VERSION.SDK_INT >= 11 && b == 3)
                        {
                            flag3 = ((Boolean)f.get(i1, Boolean.valueOf(false))).booleanValue();
                            f.put(i1, Boolean.valueOf(true));
                            if (g != null && j.hasStableIds())
                            {
                                g.put(j.getItemId(i1), Integer.valueOf(i1));
                            }
                            if (!flag3)
                            {
                                e = e + 1;
                            }
                            if (c != null)
                            {
                                l1 = j.getItemId(i1);
                                ((ac)d).a((ActionMode)c, i1, l1, true);
                            }
                        } else
                        {
                            boolean flag;
                            if (g != null && j.hasStableIds())
                            {
                                flag = true;
                            } else
                            {
                                flag = false;
                            }
                            f.clear();
                            if (flag)
                            {
                                g.clear();
                            }
                            f.put(i1, Boolean.valueOf(true));
                            if (flag)
                            {
                                g.put(j.getItemId(i1), Integer.valueOf(i1));
                            }
                            e = 1;
                        }
                        if (!af && !at)
                        {
                            aj = true;
                            y();
                            requestLayout();
                        }
                    }
                    performHapticFeedback(0);
                    flag3 = flag1;
                }
            }
        } else
        {
            boolean flag2;
            if (ai != null)
            {
                flag3 = ai.a();
            } else
            {
                flag3 = false;
            }
            flag2 = flag3;
            if (!flag3)
            {
                az = c(view, i1, l1);
                flag2 = super.showContextMenuForChild(this);
            }
            flag3 = flag2;
            if (flag2)
            {
                performHapticFeedback(0);
                return flag2;
            }
        }
        return flag3;
    }

    protected void c()
    {
        removeAllViewsInLayout();
        V = 0;
        aj = false;
        O = null;
        ad = false;
        bc = null;
        ar = -1;
        as = 0x8000000000000000L;
        l(-1);
        m(-1);
        J = 0;
        n = -1;
        o.setEmpty();
        invalidate();
    }

    public void c(int i1)
    {
        if (I == null)
        {
            I = new l(this);
        }
        I.a(i1);
    }

    public boolean checkInputConnectionProxy(View view)
    {
        return false;
    }

    protected boolean checkLayoutParams(android.view.ViewGroup.LayoutParams layoutparams)
    {
        return layoutparams instanceof LayoutParams;
    }

    protected int computeHorizontalScrollExtent()
    {
        int k1 = getChildCount();
        if (k1 > 0)
        {
            if (ax)
            {
                int j1 = k1 * 100;
                View view = getChildAt(0);
                int l1 = view.getLeft();
                int i2 = view.getWidth();
                int i1 = j1;
                if (i2 > 0)
                {
                    i1 = j1 + (l1 * 100) / i2;
                }
                view = getChildAt(k1 - 1);
                k1 = view.getRight();
                l1 = view.getWidth();
                j1 = i1;
                if (l1 > 0)
                {
                    j1 = i1 - ((k1 - getWidth()) * 100) / l1;
                }
                return j1;
            } else
            {
                return 1;
            }
        } else
        {
            return 0;
        }
    }

    protected int computeHorizontalScrollOffset()
    {
        int l1;
        int i2;
        int j2;
label0:
        {
            l1 = 0;
            boolean flag = false;
            i2 = V;
            j2 = getChildCount();
            int i1 = ((flag) ? 1 : 0);
            if (i2 >= 0)
            {
                i1 = ((flag) ? 1 : 0);
                if (j2 > 0)
                {
                    if (!ax)
                    {
                        break label0;
                    }
                    View view = getChildAt(0);
                    l1 = view.getLeft();
                    j2 = view.getWidth();
                    i1 = ((flag) ? 1 : 0);
                    if (j2 > 0)
                    {
                        i1 = Math.max((i2 * 100 - (l1 * 100) / j2) + (int)(((float)getScrollX() / (float)getWidth()) * (float)ao * 100F), 0);
                    }
                }
            }
            return i1;
        }
        int k1 = ao;
        float f1;
        float f2;
        int j1;
        if (i2 == 0)
        {
            j1 = l1;
        } else
        if (i2 + j2 == k1)
        {
            j1 = k1;
        } else
        {
            j1 = j2 / 2 + i2;
        }
        f1 = i2;
        f2 = j2;
        return (int)(((float)j1 / (float)k1) * f2 + f1);
    }

    protected int computeHorizontalScrollRange()
    {
        if (ax)
        {
            int j1 = Math.max(ao * 100, 0);
            int i1 = j1;
            if (getScrollX() != 0)
            {
                i1 = j1 + Math.abs((int)(((float)getScrollX() / (float)getWidth()) * (float)ao * 100F));
            }
            return i1;
        } else
        {
            return ao;
        }
    }

    protected void d()
    {
    }

    public final void d(int i1)
    {
        a(i1, 200, false);
    }

    protected void dispatchDraw(Canvas canvas)
    {
        boolean flag = l;
        if (!flag)
        {
            a(canvas);
        }
        super.dispatchDraw(canvas);
        if (flag)
        {
            a(canvas);
        }
    }

    protected void dispatchSetPressed(boolean flag)
    {
    }

    public void draw(Canvas canvas)
    {
        super.draw(canvas);
        if (aQ != null)
        {
            int i1 = getScrollX();
            if (!aQ.a())
            {
                int j1 = canvas.save();
                int l1 = u.top + aW;
                int j2 = u.bottom;
                int l2 = aX;
                j2 = getHeight() - l1 - (j2 + l2);
                l2 = Math.min(0, aS + i1);
                canvas.rotate(-90F);
                canvas.translate(-getHeight() + l1, l2);
                aQ.a(j2, j2);
                if (aQ.a(canvas))
                {
                    aQ.b(l2, l1);
                    invalidate();
                }
                canvas.restoreToCount(j1);
            }
            if (!aR.a())
            {
                int k1 = canvas.save();
                int i2 = u.left + aW;
                int k2 = u.right;
                int i3 = aX;
                k2 = getHeight() - i2 - (k2 + i3);
                i1 = Math.max(getWidth(), i1 + aT);
                canvas.rotate(90F);
                canvas.translate(-i2, -i1);
                aR.a(k2, k2);
                if (aR.a(canvas))
                {
                    invalidate();
                }
                canvas.restoreToCount(k1);
            }
        }
    }

    protected void drawableStateChanged()
    {
        super.drawableStateChanged();
        C();
    }

    protected final void e()
    {
        boolean flag1 = true;
        boolean flag = false;
        int i1;
        if (w != null)
        {
            int j1;
            if (V > 0)
            {
                i1 = 1;
            } else
            {
                i1 = 0;
            }
            j1 = i1;
            if (i1 == 0)
            {
                j1 = i1;
                View view;
                if (getChildCount() > 0)
                {
                    if (getChildAt(0).getLeft() < u.left)
                    {
                        j1 = 1;
                    } else
                    {
                        j1 = 0;
                    }
                }
            }
            view = w;
            if (j1 != 0)
            {
                i1 = 0;
            } else
            {
                i1 = 4;
            }
            view.setVisibility(i1);
        }
        if (x != null)
        {
            j1 = getChildCount();
            if (V + j1 < ao)
            {
                i1 = 1;
            } else
            {
                i1 = 0;
            }
            if (i1 == 0 && j1 > 0)
            {
                if (getChildAt(j1 - 1).getRight() > getRight() - u.right)
                {
                    i1 = ((flag1) ? 1 : 0);
                } else
                {
                    i1 = 0;
                }
            }
            view = x;
            if (i1 != 0)
            {
                i1 = ((flag) ? 1 : 0);
            } else
            {
                i1 = 4;
            }
            view.setVisibility(i1);
        }
    }

    public final void e(int i1)
    {
        int k1 = getChildCount();
        for (int j1 = 0; j1 < k1; j1++)
        {
            getChildAt(j1).offsetLeftAndRight(i1);
        }

    }

    protected abstract int f(int i1);

    public final View f()
    {
        if (ao > 0 && am >= 0)
        {
            return getChildAt(am - V);
        } else
        {
            return null;
        }
    }

    public abstract void g(int i1);

    protected final boolean g()
    {
        return hasFocus() && !isInTouchMode() || B();
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
        return new LayoutParams(layoutparams);
    }

    protected android.view.ContextMenu.ContextMenuInfo getContextMenuInfo()
    {
        return az;
    }

    public void getFocusedRect(Rect rect)
    {
        View view = f();
        if (view != null && view.getParent() == this)
        {
            view.getFocusedRect(rect);
            offsetDescendantRectToMyCoords(view, rect);
            return;
        } else
        {
            super.getFocusedRect(rect);
            return;
        }
    }

    protected int getHorizontalScrollbarHeight()
    {
        return super.getHorizontalScrollbarHeight();
    }

    protected float getLeftFadingEdgeStrength()
    {
        int i1 = getChildCount();
        float f1 = super.getLeftFadingEdgeStrength();
        if (i1 != 0)
        {
            if (V > 0)
            {
                return 1.0F;
            }
            int j1 = getChildAt(0).getLeft();
            float f2 = getHorizontalFadingEdgeLength();
            if (j1 < getPaddingLeft())
            {
                return (float)(-(j1 - getPaddingLeft())) / f2;
            }
        }
        return f1;
    }

    protected float getRightFadingEdgeStrength()
    {
        int i1 = getChildCount();
        float f1 = super.getRightFadingEdgeStrength();
        if (i1 != 0)
        {
            if ((V + i1) - 1 < ao - 1)
            {
                return 1.0F;
            }
            i1 = getChildAt(i1 - 1).getRight();
            int j1 = getWidth();
            float f2 = getHorizontalFadingEdgeLength();
            if (i1 > j1 - getPaddingRight())
            {
                return (float)((i1 - j1) + getPaddingRight()) / f2;
            }
        }
        return f1;
    }

    public int getSolidColor()
    {
        return aH;
    }

    protected final void h()
    {
        if (isEnabled() && isClickable()) goto _L2; else goto _L1
_L1:
        return;
_L2:
        Drawable drawable;
        drawable = m;
        Object obj = o;
        if (drawable == null || !isFocused() && !B() || ((Rect) (obj)).isEmpty())
        {
            continue; /* Loop/switch isn't completed */
        }
        obj = getChildAt(am - V);
        if (obj == null)
        {
            break; /* Loop/switch isn't completed */
        }
        if (((View) (obj)).hasFocusable())
        {
            continue; /* Loop/switch isn't completed */
        }
        ((View) (obj)).setPressed(true);
        break; /* Loop/switch isn't completed */
        if (true) goto _L1; else goto _L3
_L3:
        setPressed(true);
        boolean flag = isLongClickable();
        drawable = drawable.getCurrent();
        if (drawable != null && (drawable instanceof TransitionDrawable))
        {
            if (flag)
            {
                ((TransitionDrawable)drawable).startTransition(ViewConfiguration.getLongPressTimeout());
            } else
            {
                ((TransitionDrawable)drawable).resetTransition();
            }
        }
        if (flag && !aj)
        {
            if (aD == null)
            {
                aD = new d(this, (byte)0);
            }
            aD.a();
            postDelayed(aD, ViewConfiguration.getLongPressTimeout());
            return;
        }
        if (true) goto _L1; else goto _L4
_L4:
    }

    public void h(int i1)
    {
        if (i1 != aH)
        {
            aH = i1;
            int k1 = getChildCount();
            for (int j1 = 0; j1 < k1; j1++)
            {
                getChildAt(j1).setDrawingCacheBackgroundColor(i1);
            }

            p.e(i1);
        }
    }

    protected int i()
    {
        return 0;
    }

    protected int j()
    {
        return 0;
    }

    public void jumpDrawablesToCurrentState()
    {
        super.jumpDrawablesToCurrentState();
        if (m != null)
        {
            m.jumpToCurrentState();
        }
    }

    protected final void k()
    {
        if (am != -1)
        {
            if (h != 4)
            {
                M = am;
            }
            if (ak >= 0 && ak != am)
            {
                M = ak;
            }
            l(-1);
            m(-1);
            J = 0;
        }
    }

    protected final int l()
    {
        int j1 = am;
        int i1 = j1;
        if (j1 < 0)
        {
            i1 = M;
        }
        return Math.min(Math.max(0, i1), ao - 1);
    }

    protected final boolean m()
    {
        if (am < 0 && I())
        {
            C();
            return true;
        } else
        {
            return false;
        }
    }

    protected final void n()
    {
        int j3;
        int k3;
        j3 = ao;
        k3 = bb;
        bb = ao;
        if (b == 0 || j == null || !j.hasStableIds()) goto _L2; else goto _L1
_L1:
        int i1;
        int k2;
        f.clear();
        k2 = 0;
        i1 = 0;
_L20:
        int l2;
        boolean flag1;
        int l3;
        int i4;
        long l4;
        if (i1 >= g.size())
        {
            break MISSING_BLOCK_LABEL_316;
        }
        l4 = g.keyAt(i1);
        l3 = ((Integer)g.valueAt(i1)).intValue();
        if (l4 == j.getItemId(l3))
        {
            break MISSING_BLOCK_LABEL_295;
        }
        l2 = Math.max(0, l3 - 20);
        i4 = Math.min(l3 + 20, ao);
        flag1 = false;
_L7:
        boolean flag = flag1;
        if (l2 >= i4) goto _L4; else goto _L3
_L3:
        if (l4 != j.getItemId(l2)) goto _L6; else goto _L5
_L5:
        flag = true;
        f.put(l2, Boolean.valueOf(true));
        g.setValueAt(i1, Integer.valueOf(l2));
_L4:
        l2 = i1;
        if (!flag)
        {
            g.delete(l4);
            e = e - 1;
            if (android.os.Build.VERSION.SDK_INT > 11 && c != null && d != null)
            {
                ((ac)d).a((ActionMode)c, l3, l4, false);
            }
            l2 = i1 - 1;
            k2 = 1;
        }
        i1 = k2;
_L8:
        k2 = i1;
        i1 = l2 + 1;
        continue; /* Loop/switch isn't completed */
_L6:
        l2++;
          goto _L7
        f.put(l3, Boolean.valueOf(true));
        l2 = i1;
        i1 = k2;
          goto _L8
        if (k2 != 0 && c != null && android.os.Build.VERSION.SDK_INT > 11)
        {
            ((ActionMode)c).invalidate();
        }
_L2:
        p.c();
        if (j3 <= 0) goto _L10; else goto _L9
_L9:
        if (!ad) goto _L12; else goto _L11
_L11:
        ad = false;
        bc = null;
        if (aG != 2) goto _L14; else goto _L13
_L13:
        h = 3;
_L18:
        return;
_L14:
        if (aG == 1)
        {
            if (aV)
            {
                aV = false;
                h = 3;
                return;
            }
            int i3 = getChildCount();
            k2 = getWidth() - getPaddingRight();
            View view = getChildAt(i3 - 1);
            int j1;
            if (view != null)
            {
                j1 = view.getBottom();
            } else
            {
                j1 = k2;
            }
            if (i3 + V >= k3 && j1 <= k2)
            {
                h = 3;
                return;
            }
            awakenScrollBars();
        }
        ae;
        JVM INSTR tableswitch 0 1: default 508
    //                   0 558
    //                   1 646;
           goto _L12 _L15 _L16
_L12:
        if (isInTouchMode())
        {
            continue; /* Loop/switch isn't completed */
        }
        k2 = q();
        int k1 = k2;
        if (k2 >= j3)
        {
            k1 = j3 - 1;
        }
        k2 = k1;
        if (k1 < 0)
        {
            k2 = 0;
        }
        k1 = a(k2, true);
        if (k1 >= 0)
        {
            m(k1);
            return;
        }
        break; /* Loop/switch isn't completed */
_L15:
        if (isInTouchMode())
        {
            h = 5;
            aa = Math.min(Math.max(0, aa), j3 - 1);
            return;
        }
        int l1 = x();
        if (l1 >= 0 && a(l1, true) == l1)
        {
            aa = l1;
            if (ac == (long)getWidth())
            {
                h = 5;
            } else
            {
                h = 2;
            }
            m(l1);
            return;
        }
        if (true) goto _L12; else goto _L17
_L16:
        h = 5;
        aa = Math.min(Math.max(0, aa), j3 - 1);
        return;
_L17:
        int i2 = a(k2, false);
        if (i2 >= 0)
        {
            m(i2);
            return;
        }
        break; /* Loop/switch isn't completed */
        if (M >= 0) goto _L18; else goto _L10
_L10:
        int j2;
        if (K)
        {
            j2 = 3;
        } else
        {
            j2 = 1;
        }
        h = j2;
        am = -1;
        an = 0x8000000000000000L;
        ak = -1;
        al = 0x8000000000000000L;
        ad = false;
        bc = null;
        n = -1;
        w();
        return;
        if (true) goto _L20; else goto _L19
_L19:
    }

    public final int o()
    {
        return aH;
    }

    protected void onAttachedToWindow()
    {
        super.onAttachedToWindow();
        getViewTreeObserver().addOnTouchModeChangeListener(this);
        if (j != null && i == null)
        {
            i = new c(this);
            j.registerDataSetObserver(i);
            aj = true;
            ap = ao;
            ao = j.getCount();
        }
        S = true;
    }

    protected int[] onCreateDrawableState(int i1)
    {
        if (!aI) goto _L2; else goto _L1
_L1:
        int ai1[] = super.onCreateDrawableState(i1);
_L5:
        return ai1;
_L2:
        int ai2[];
        int j1;
        j1 = ENABLED_STATE_SET[0];
        ai2 = super.onCreateDrawableState(i1 + 1);
        i1 = ai2.length - 1;
_L6:
        if (i1 < 0)
        {
            break MISSING_BLOCK_LABEL_77;
        }
        if (ai2[i1] != j1) goto _L4; else goto _L3
_L3:
        ai1 = ai2;
        if (i1 >= 0)
        {
            System.arraycopy(ai2, i1 + 1, ai2, i1, ai2.length - i1 - 1);
            return ai2;
        }
          goto _L5
_L4:
        i1--;
          goto _L6
        i1 = -1;
          goto _L3
    }

    public InputConnection onCreateInputConnection(EditorInfo editorinfo)
    {
        return null;
    }

    protected void onDetachedFromWindow()
    {
        super.onDetachedFromWindow();
        p.b();
        getViewTreeObserver().removeOnTouchModeChangeListener(this);
        if (j != null && i != null)
        {
            j.unregisterDataSetObserver(i);
            i = null;
        }
        if (av != null)
        {
            removeCallbacks(av);
        }
        if (I != null)
        {
            I.a();
        }
        if (aL != null)
        {
            removeCallbacks(aL);
        }
        if (aE != null)
        {
            removeCallbacks(aE);
        }
        if (aF != null)
        {
            removeCallbacks(aF);
            aF = null;
        }
        S = false;
    }

    protected void onFocusChanged(boolean flag, int i1, Rect rect)
    {
        super.onFocusChanged(flag, i1, rect);
        if (flag && am < 0 && !isInTouchMode())
        {
            if (!S && j != null)
            {
                aj = true;
                ap = ao;
                ao = j.getCount();
            }
            I();
        }
    }

    public boolean onGenericMotionEvent(MotionEvent motionevent)
    {
        if ((motionevent.getSource() & 2) == 0) goto _L2; else goto _L1
_L1:
        motionevent.getAction();
        JVM INSTR tableswitch 8 8: default 32
    //                   8 38;
           goto _L2 _L3
_L2:
        return super.onGenericMotionEvent(motionevent);
_L3:
        float f1;
        if (F != -1 || (f1 = motionevent.getAxisValue(10)) == 0.0F)
        {
            continue; /* Loop/switch isn't completed */
        }
        if (bd == 0.0F)
        {
            TypedValue typedvalue = new TypedValue();
            if (!getContext().getTheme().resolveAttribute(b.b, typedvalue, true))
            {
                break; /* Loop/switch isn't completed */
            }
            bd = typedvalue.getDimension(getContext().getResources().getDisplayMetrics());
        }
        int i1 = (int)(f1 * bd);
        if (!a(i1, i1))
        {
            return true;
        }
        if (true) goto _L2; else goto _L4
_L4:
        throw new IllegalStateException("Expected theme to define hlv_listPreferredItemWidth.");
    }

    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityevent)
    {
        super.onInitializeAccessibilityEvent(accessibilityevent);
        accessibilityevent.setClassName(com/roidapp/baselib/hlistview/AbsHListView.getName());
    }

    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilitynodeinfo)
    {
        super.onInitializeAccessibilityNodeInfo(accessibilitynodeinfo);
        accessibilitynodeinfo.setClassName(com/roidapp/baselib/hlistview/AbsHListView.getName());
        if (isEnabled())
        {
            if (t() > 0)
            {
                accessibilitynodeinfo.addAction(8192);
            }
            if (u() < s() - 1)
            {
                accessibilitynodeinfo.addAction(4096);
            }
        }
    }

    public boolean onInterceptTouchEvent(MotionEvent motionevent)
    {
        int i1;
        i1 = motionevent.getAction();
        if (I != null)
        {
            I.a();
        }
        if (S) goto _L2; else goto _L1
_L1:
        return false;
_L2:
        switch (i1 & 0xff)
        {
        case 4: // '\004'
        case 5: // '\005'
        default:
            return false;

        case 0: // '\0'
            int j1 = F;
            if (j1 == 6 || j1 == 5)
            {
                H = 0;
                return true;
            }
            int l1 = (int)motionevent.getX();
            int j2 = (int)motionevent.getY();
            aP = motionevent.getPointerId(0);
            int k2 = f(l1);
            if (j1 != 4 && k2 >= 0)
            {
                B = getChildAt(k2 - V).getLeft();
                D = l1;
                E = j2;
                A = k2;
                F = 0;
                H();
            }
            G = 0x80000000;
            if (au == null)
            {
                au = VelocityTracker.obtain();
            } else
            {
                au.clear();
            }
            au.addMovement(motionevent);
            if (j1 == 4)
            {
                return true;
            }
            break;

        case 2: // '\002'
            int i2;
            switch (F)
            {
            default:
                return false;

            case 0: // '\0'
                i2 = motionevent.findPointerIndex(aP);
                break;
            }
            int k1 = i2;
            if (i2 == -1)
            {
                aP = motionevent.getPointerId(0);
                k1 = 0;
            }
            k1 = (int)motionevent.getX(k1);
            E();
            au.addMovement(motionevent);
            if (n(k1))
            {
                return true;
            }
            break;

        case 1: // '\001'
        case 3: // '\003'
            F = -1;
            aP = -1;
            F();
            b(0);
            return false;

        case 6: // '\006'
            a(motionevent);
            return false;
        }
        if (true) goto _L1; else goto _L3
_L3:
    }

    public boolean onKeyDown(int i1, KeyEvent keyevent)
    {
        return false;
    }

    public boolean onKeyUp(int i1, KeyEvent keyevent)
    {
        boolean flag = true;
        i1;
        JVM INSTR lookupswitch 2: default 28
    //                   23: 37
    //                   66: 37;
           goto _L1 _L2 _L2
_L1:
        flag = super.onKeyUp(i1, keyevent);
_L4:
        return flag;
_L2:
        if (!isEnabled()) goto _L4; else goto _L3
_L3:
        if (isClickable() && isPressed() && am >= 0 && j != null && am < j.getCount())
        {
            keyevent = getChildAt(am - V);
            if (keyevent != null)
            {
                a(keyevent, am, an);
                keyevent.setPressed(false);
            }
            setPressed(false);
            return true;
        }
        if (true) goto _L1; else goto _L5
_L5:
    }

    protected void onLayout(boolean flag, int i1, int j1, int k1, int l1)
    {
        super.onLayout(flag, i1, j1, k1, l1);
        af = true;
        if (flag)
        {
            l1 = getChildCount();
            for (j1 = 0; j1 < l1; j1++)
            {
                getChildAt(j1).forceLayout();
            }

            p.a();
        }
        d();
        af = false;
        N = (k1 - i1) / 3;
    }

    protected void onMeasure(int i1, int j1)
    {
        if (m == null)
        {
            a(getResources().getDrawable(0x1080062));
        }
        Rect rect = u;
        rect.left = q + getPaddingLeft();
        rect.top = r + getPaddingTop();
        rect.right = s + getPaddingRight();
        rect.bottom = t + getPaddingBottom();
        if (aG == 1)
        {
            int k1 = getChildCount();
            j1 = getWidth() - getPaddingRight();
            View view = getChildAt(k1 - 1);
            boolean flag;
            if (view != null)
            {
                i1 = view.getRight();
            } else
            {
                i1 = j1;
            }
            if (k1 + V >= bb && i1 <= j1)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            aV = flag;
        }
    }

    protected void onOverScrolled(int i1, int j1, boolean flag, boolean flag1)
    {
        if (getScrollX() != i1)
        {
            onScrollChanged(i1, getScrollY(), getScrollX(), getScrollY());
            a.a(i1);
            D();
            awakenScrollBars();
        }
    }

    public void onRestoreInstanceState(Parcelable parcelable)
    {
        parcelable = (SavedState)parcelable;
        super.onRestoreInstanceState(parcelable.getSuperState());
        aj = true;
        ac = ((SavedState) (parcelable)).e;
        if (((SavedState) (parcelable)).a < 0L) goto _L2; else goto _L1
_L1:
        ad = true;
        bc = parcelable;
        ab = ((SavedState) (parcelable)).a;
        aa = ((SavedState) (parcelable)).d;
        W = ((SavedState) (parcelable)).c;
        ae = 0;
_L4:
        if (((SavedState) (parcelable)).i != null)
        {
            f = ((SavedState) (parcelable)).i;
        }
        if (((SavedState) (parcelable)).j != null)
        {
            g = ((SavedState) (parcelable)).j;
        }
        e = ((SavedState) (parcelable)).h;
        if (android.os.Build.VERSION.SDK_INT >= 11 && ((SavedState) (parcelable)).g && b == 3 && d != null)
        {
            c = startActionMode((ac)d);
        }
        requestLayout();
        return;
_L2:
        if (((SavedState) (parcelable)).b >= 0L)
        {
            l(-1);
            m(-1);
            n = -1;
            ad = true;
            bc = parcelable;
            ab = ((SavedState) (parcelable)).b;
            aa = ((SavedState) (parcelable)).d;
            W = ((SavedState) (parcelable)).c;
            ae = 1;
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public Parcelable onSaveInstanceState()
    {
        boolean flag1 = true;
        boolean flag = false;
        SavedState savedstate = new SavedState(super.onSaveInstanceState());
        if (bc != null)
        {
            savedstate.a = bc.a;
            savedstate.b = bc.b;
            savedstate.c = bc.c;
            savedstate.d = bc.d;
            savedstate.e = bc.e;
            savedstate.f = bc.f;
            savedstate.g = bc.g;
            savedstate.h = bc.h;
            savedstate.i = bc.i;
            savedstate.j = bc.j;
            return savedstate;
        }
        int i1;
        long l2;
        if (getChildCount() > 0 && ao > 0)
        {
            i1 = 1;
        } else
        {
            i1 = 0;
        }
        l2 = r();
        savedstate.a = l2;
        savedstate.e = getWidth();
        if (l2 >= 0L)
        {
            savedstate.c = J;
            savedstate.d = q();
            savedstate.b = -1L;
        } else
        if (i1 != 0 && V > 0)
        {
            savedstate.c = getChildAt(0).getLeft();
            int l1 = V;
            int j1 = l1;
            if (l1 >= ao)
            {
                j1 = ao - 1;
            }
            savedstate.d = j1;
            savedstate.b = j.getItemId(j1);
        } else
        {
            savedstate.c = 0;
            savedstate.b = -1L;
            savedstate.d = 0;
        }
        savedstate.f = null;
        if (android.os.Build.VERSION.SDK_INT < 11 || b != 3 || c == null)
        {
            flag1 = false;
        }
        savedstate.g = flag1;
        if (f != null)
        {
            try
            {
                savedstate.i = f.clone();
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                ((NoSuchMethodError) (obj)).printStackTrace();
                savedstate.i = new SparseArrayCompat();
            }
        }
        if (g != null)
        {
            Object obj = new LongSparseArray();
            int k1 = g.size();
            for (i1 = ((flag) ? 1 : 0); i1 < k1; i1++)
            {
                ((LongSparseArray) (obj)).put(g.keyAt(i1), g.valueAt(i1));
            }

            savedstate.j = ((LongSparseArray) (obj));
        }
        savedstate.h = e;
        return savedstate;
    }

    protected void onSizeChanged(int i1, int j1, int k1, int l1)
    {
        if (getChildCount() > 0)
        {
            aj = true;
            y();
        }
    }

    public boolean onTouchEvent(MotionEvent motionevent)
    {
        boolean flag1;
        boolean flag2;
        flag1 = false;
        flag2 = false;
        if (isEnabled()) goto _L2; else goto _L1
_L1:
        if (isClickable() || isLongClickable())
        {
            flag2 = true;
        }
_L4:
        return flag2;
_L2:
        if (I != null)
        {
            I.a();
        }
        if (!S) goto _L4; else goto _L3
_L3:
        int i1;
        i1 = motionevent.getAction();
        E();
        au.addMovement(motionevent);
        i1 & 0xff;
        JVM INSTR tableswitch 0 6: default 120
    //                   0 122
    //                   1 666
    //                   2 551
    //                   3 1530
    //                   4 120
    //                   5 1733
    //                   6 1672;
           goto _L5 _L6 _L7 _L8 _L9 _L5 _L10 _L11
_L28:
        return true;
_L6:
        F;
        JVM INSTR tableswitch 6 6: default 144
    //                   6 435;
           goto _L12 _L13
_L12:
        int i4;
        int l4;
        aP = motionevent.getPointerId(0);
        i4 = (int)motionevent.getX();
        l4 = (int)motionevent.getY();
        i1 = b(i4, l4);
        if (aj) goto _L15; else goto _L14
_L14:
        if (F == 4 || i1 < 0 || !((ListAdapter)p()).isEnabled(i1)) goto _L17; else goto _L16
_L16:
        F = 0;
        if (aC == null)
        {
            aC = new f(this);
        }
        postDelayed(aC, ViewConfiguration.getTapTimeout());
_L15:
        if (i1 >= 0)
        {
            B = getChildAt(i1 - V).getLeft();
        }
        D = i4;
        E = l4;
        A = i1;
        G = 0x80000000;
_L18:
        i1 = ((flag1) ? 1 : 0);
        if (android.os.Build.VERSION.SDK_INT >= 14)
        {
            i1 = ((flag1) ? 1 : 0);
            if ((motionevent.getButtonState() & 2) != 0)
            {
                float f1 = motionevent.getX();
                float f3 = motionevent.getY();
                motionevent.getMetaState();
                long l5;
                do
                {
                    do
                    {
                        i1 = b((int)f1, (int)f3);
                    } while (i1 == -1);
                    l5 = j.getItemId(i1);
                    motionevent = getChildAt(i1 - V);
                } while (motionevent == null);
                az = c(motionevent, i1, l5);
                i1 = ((flag1) ? 1 : 0);
                if (super.showContextMenuForChild(this))
                {
                    i1 = 1;
                }
            }
        }
        if (i1 != 0 && F == 0)
        {
            removeCallbacks(aC);
        }
          goto _L5
_L13:
        av.b();
        if (I != null)
        {
            I.a();
        }
        F = 5;
        E = (int)motionevent.getY();
        i1 = (int)motionevent.getX();
        G = i1;
        D = i1;
        H = 0;
        aP = motionevent.getPointerId(0);
        aU = 0;
        if (true) goto _L18; else goto _L17
_L17:
        if (F == 4)
        {
            G();
            F = 3;
            H = 0;
            i1 = f(i4);
            av.c();
        }
        if (true) goto _L15; else goto _L8
_L8:
        int l2 = motionevent.findPointerIndex(aP);
        int j1 = l2;
        if (l2 == -1)
        {
            aP = motionevent.getPointerId(0);
            j1 = 0;
        }
        j1 = (int)motionevent.getX(j1);
        if (aj)
        {
            d();
        }
        switch (F)
        {
        case 0: // '\0'
        case 1: // '\001'
        case 2: // '\002'
            n(j1);
            break;

        case 3: // '\003'
        case 5: // '\005'
            o(j1);
            break;
        }
_L5:
        if (false)
        {
        }
        continue; /* Loop/switch isn't completed */
_L7:
        F;
        JVM INSTR tableswitch 0 5: default 708
    //                   0 767
    //                   1 767
    //                   2 767
    //                   3 1152
    //                   4 708
    //                   5 1443;
           goto _L19 _L20 _L20 _L20 _L21 _L19 _L22
_L19:
        setPressed(false);
        if (aQ != null)
        {
            aQ.c();
            aR.c();
        }
        invalidate();
        motionevent = getHandler();
        if (motionevent != null)
        {
            motionevent.removeCallbacks(aB);
        }
        F();
        aP = -1;
        continue; /* Loop/switch isn't completed */
_L20:
        int i3 = A;
        View view = getChildAt(i3 - V);
        float f2 = motionevent.getX();
        boolean flag;
        if (f2 > (float)u.left && f2 < (float)(getWidth() - u.right))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (view != null && !view.hasFocusable() && flag)
        {
            if (F != 0)
            {
                view.setPressed(false);
            }
            if (aE == null)
            {
                aE = new k(this, (byte)0);
            }
            k k1 = aE;
            k1.a = i3;
            k1.a();
            M = i3;
            if (F == 0 || F == 1)
            {
                Handler handler = getHandler();
                if (handler != null)
                {
                    if (F == 0)
                    {
                        motionevent = aC;
                    } else
                    {
                        motionevent = aB;
                    }
                    handler.removeCallbacks(motionevent);
                }
                h = 0;
                if (!aj && j.isEnabled(i3))
                {
                    F = 1;
                    l(A);
                    d();
                    view.setPressed(true);
                    a(A, view);
                    setPressed(true);
                    if (m != null)
                    {
                        motionevent = m.getCurrent();
                        if (motionevent != null && (motionevent instanceof TransitionDrawable))
                        {
                            ((TransitionDrawable)motionevent).resetTransition();
                        }
                    }
                    if (aF != null)
                    {
                        removeCallbacks(aF);
                    }
                    aF = new a(this, view, k1);
                    postDelayed(aF, ViewConfiguration.getPressedStateDuration());
                } else
                {
                    F = -1;
                    C();
                }
                return true;
            }
            if (!aj && j.isEnabled(i3))
            {
                k1.run();
            }
        }
        F = -1;
        C();
        continue; /* Loop/switch isn't completed */
_L21:
        int l1 = getChildCount();
        if (l1 > 0)
        {
            int j3 = getChildAt(0).getLeft();
            int j4 = getChildAt(l1 - 1).getRight();
            int i5 = u.left;
            int j5 = getWidth() - u.right;
            if (V == 0 && j3 >= i5 && V + l1 < ao && j4 <= getWidth() - j5)
            {
                F = -1;
                b(0);
            } else
            {
                motionevent = au;
                motionevent.computeCurrentVelocity(1000, aN);
                int k5 = (int)(motionevent.getXVelocity(aP) * aO);
                if (Math.abs(k5) > aM && (V != 0 || j3 != i5 - Q) && (l1 + V != ao || j4 != Q + j5))
                {
                    if (av == null)
                    {
                        av = new g(this);
                    }
                    b(2);
                    av.a(-k5);
                } else
                {
                    F = -1;
                    b(0);
                    if (av != null)
                    {
                        av.b();
                    }
                    if (I != null)
                    {
                        I.a();
                    }
                }
            }
        } else
        {
            F = -1;
            b(0);
        }
        continue; /* Loop/switch isn't completed */
_L22:
        if (av == null)
        {
            av = new g(this);
        }
        motionevent = au;
        motionevent.computeCurrentVelocity(1000, aN);
        int i2 = (int)motionevent.getXVelocity(aP);
        b(2);
        if (Math.abs(i2) > aM)
        {
            av.b(-i2);
        } else
        {
            av.a();
        }
        if (true) goto _L19; else goto _L9
_L9:
        F;
        JVM INSTR tableswitch 5 6: default 1556
    //                   5 1643
    //                   6 1614;
           goto _L23 _L24 _L25
_L25:
        break; /* Loop/switch isn't completed */
_L23:
        F = -1;
        setPressed(false);
        motionevent = getChildAt(A - V);
        if (motionevent != null)
        {
            motionevent.setPressed(false);
        }
        H();
        motionevent = getHandler();
        if (motionevent != null)
        {
            motionevent.removeCallbacks(aB);
        }
        F();
_L26:
        if (aQ != null)
        {
            aQ.c();
            aR.c();
        }
        aP = -1;
        continue; /* Loop/switch isn't completed */
_L24:
        if (av == null)
        {
            av = new g(this);
        }
        av.a();
        if (true) goto _L26; else goto _L11
_L11:
        a(motionevent);
        int j2 = D;
        int k3 = b(j2, E);
        if (k3 >= 0)
        {
            B = getChildAt(k3 - V).getLeft();
            A = k3;
        }
        G = j2;
        continue; /* Loop/switch isn't completed */
_L10:
        int k4 = motionevent.getActionIndex();
        int l3 = motionevent.getPointerId(k4);
        int k2 = (int)motionevent.getX(k4);
        k4 = (int)motionevent.getY(k4);
        H = 0;
        aP = l3;
        D = k2;
        E = k4;
        l3 = b(k2, k4);
        if (l3 >= 0)
        {
            B = getChildAt(l3 - V).getLeft();
            A = l3;
        }
        G = k2;
        if (true) goto _L28; else goto _L27
_L27:
    }

    public void onTouchModeChanged(boolean flag)
    {
        if (flag)
        {
            k();
            if (getWidth() > 0 && getChildCount() > 0)
            {
                d();
            }
            C();
        } else
        {
            int i1 = F;
            if (i1 == 5 || i1 == 6)
            {
                if (av != null)
                {
                    av.b();
                }
                if (I != null)
                {
                    I.a();
                }
                if (getScrollX() != 0)
                {
                    a.a(0);
                    J();
                    invalidate();
                    return;
                }
            }
        }
    }

    public void onWindowFocusChanged(boolean flag)
    {
        int i1;
        super.onWindowFocusChanged(flag);
        if (isInTouchMode())
        {
            i1 = 0;
        } else
        {
            i1 = 1;
        }
        if (flag) goto _L2; else goto _L1
_L1:
        setChildrenDrawingCacheEnabled(false);
        if (av != null)
        {
            removeCallbacks(av);
            av.b();
            if (I != null)
            {
                I.a();
            }
            if (getScrollX() != 0)
            {
                a.a(0);
                J();
                invalidate();
            }
        }
        if (i1 == 1)
        {
            M = am;
        }
_L4:
        aA = i1;
        return;
_L2:
        if (i1 != aA && aA != -1)
        {
            if (i1 == 1)
            {
                I();
            } else
            {
                k();
                h = 0;
                d();
            }
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public boolean performAccessibilityAction(int i1, Bundle bundle)
    {
        if (super.performAccessibilityAction(i1, bundle))
        {
            return true;
        }
        switch (i1)
        {
        default:
            return false;

        case 4096: 
            if (isEnabled() && u() < s() - 1)
            {
                a(getWidth() - u.left - u.right, 200, false);
                return true;
            } else
            {
                return false;
            }

        case 8192: 
            break;
        }
        if (isEnabled() && V > 0)
        {
            a(-(getWidth() - u.left - u.right), 200, false);
            return true;
        } else
        {
            return false;
        }
    }

    public void requestDisallowInterceptTouchEvent(boolean flag)
    {
        if (flag)
        {
            F();
        }
        super.requestDisallowInterceptTouchEvent(flag);
    }

    public void requestLayout()
    {
        if (!at && !af)
        {
            super.requestLayout();
        }
    }

    public void sendAccessibilityEvent(int i1)
    {
        if (i1 == 4096)
        {
            int j1 = t();
            int k1 = u();
            if (aZ == j1 && ba == k1)
            {
                return;
            }
            aZ = j1;
            ba = k1;
        }
        super.sendAccessibilityEvent(i1);
    }

    public void setOverScrollMode(int i1)
    {
        int j1 = i1;
        if (i1 != 0)
        {
            j1 = 2;
        }
        if (j1 != 2)
        {
            if (aQ == null)
            {
                Context context = getContext();
                aQ = new w(context);
                aR = new w(context);
            }
        } else
        {
            aQ = null;
            aR = null;
        }
        super.setOverScrollMode(j1);
    }

    public boolean showContextMenuForChild(View view)
    {
        boolean flag = false;
        boolean flag1 = false;
        int i1 = a(view);
        if (i1 >= 0)
        {
            long l1 = j.getItemId(i1);
            if (ai != null)
            {
                flag1 = ai.a();
            }
            flag = flag1;
            if (!flag1)
            {
                az = c(getChildAt(i1 - V), i1, l1);
                flag = super.showContextMenuForChild(view);
            }
        }
        return flag;
    }

    public boolean verifyDrawable(Drawable drawable)
    {
        return m == drawable || super.verifyDrawable(drawable);
    }


    private class LayoutParams extends android.view.ViewGroup.LayoutParams
    {

        public int a;
        public boolean b;
        public boolean c;
        public int d;
        public long e;

        public LayoutParams()
        {
            super(-2, -1);
            e = -1L;
            a = 0;
        }

        public LayoutParams(Context context, AttributeSet attributeset)
        {
            super(context, attributeset);
            e = -1L;
        }

        public LayoutParams(android.view.ViewGroup.LayoutParams layoutparams)
        {
            super(layoutparams);
            e = -1L;
        }
    }


    private class SavedState extends android.view.View.BaseSavedState
    {

        public static final android.os.Parcelable.Creator CREATOR = new o();
        long a;
        long b;
        int c;
        int d;
        int e;
        String f;
        boolean g;
        int h;
        SparseArrayCompat i;
        LongSparseArray j;

        private static void a(LongSparseArray longsparsearray, Parcel parcel, int i1)
        {
            for (; i1 > 0; i1--)
            {
                longsparsearray.put(parcel.readLong(), Integer.valueOf(parcel.readInt()));
            }

        }

        private static void a(SparseArrayCompat sparsearraycompat, Parcel parcel, int i1)
        {
            while (i1 > 0) 
            {
                int j1 = parcel.readInt();
                boolean flag;
                if (parcel.readByte() == 1)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                sparsearraycompat.append(j1, Boolean.valueOf(flag));
                i1--;
            }
        }

        public String toString()
        {
            return (new StringBuilder("AbsListView.SavedState{")).append(Integer.toHexString(System.identityHashCode(this))).append(" selectedId=").append(a).append(" firstId=").append(b).append(" viewLeft=").append(c).append(" position=").append(d).append(" width=").append(e).append(" filter=").append(f).append(" checkState=").append(i).append("}").toString();
        }

        public void writeToParcel(Parcel parcel, int i1)
        {
            boolean flag = false;
            super.writeToParcel(parcel, i1);
            parcel.writeLong(a);
            parcel.writeLong(b);
            parcel.writeInt(c);
            parcel.writeInt(d);
            parcel.writeInt(e);
            parcel.writeString(f);
            Object obj;
            if (g)
            {
                i1 = 1;
            } else
            {
                i1 = 0;
            }
            parcel.writeByte((byte)i1);
            parcel.writeInt(h);
            obj = i;
            if (obj == null)
            {
                parcel.writeInt(-1);
            } else
            {
                int l1 = ((SparseArrayCompat) (obj)).size();
                parcel.writeInt(l1);
                i1 = 0;
                while (i1 < l1) 
                {
                    parcel.writeInt(((SparseArrayCompat) (obj)).keyAt(i1));
                    int k1;
                    if (((Boolean)((SparseArrayCompat) (obj)).valueAt(i1)).booleanValue())
                    {
                        k1 = 1;
                    } else
                    {
                        k1 = 0;
                    }
                    parcel.writeByte((byte)k1);
                    i1++;
                }
            }
            obj = j;
            if (obj != null)
            {
                i1 = ((LongSparseArray) (obj)).size();
            } else
            {
                i1 = 0;
            }
            parcel.writeInt(i1);
            for (int j1 = ((flag) ? 1 : 0); j1 < i1; j1++)
            {
                parcel.writeLong(((LongSparseArray) (obj)).keyAt(j1));
                parcel.writeInt(((Integer)((LongSparseArray) (obj)).valueAt(j1)).intValue());
            }

        }


        private SavedState(Parcel parcel)
        {
            Object obj = null;
            super(parcel);
            a = parcel.readLong();
            b = parcel.readLong();
            c = parcel.readInt();
            d = parcel.readInt();
            e = parcel.readInt();
            f = parcel.readString();
            SparseArrayCompat sparsearraycompat;
            int i1;
            boolean flag;
            if (parcel.readByte() != 0)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            g = flag;
            h = parcel.readInt();
            i1 = parcel.readInt();
            if (i1 < 0)
            {
                sparsearraycompat = null;
            } else
            {
                sparsearraycompat = new SparseArrayCompat(i1);
                a(sparsearraycompat, parcel, i1);
            }
            i = sparsearraycompat;
            i1 = parcel.readInt();
            if (i1 <= 0)
            {
                parcel = obj;
            } else
            {
                LongSparseArray longsparsearray = new LongSparseArray(i1);
                a(longsparsearray, parcel, i1);
                parcel = longsparsearray;
            }
            j = parcel;
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
