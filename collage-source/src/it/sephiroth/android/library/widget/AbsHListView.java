// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package it.sephiroth.android.library.widget;

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
import android.support.v4.graphics.drawable.DrawableCompat;
import android.support.v4.util.LongSparseArray;
import android.support.v4.util.SparseArrayCompat;
import android.support.v4.widget.EdgeEffectCompat;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Log;
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
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.Adapter;
import android.widget.Checkable;
import android.widget.ListAdapter;
import it.sephiroth.android.library.c.a;
import it.sephiroth.android.library.c.b;
import java.util.ArrayList;

// Referenced classes of package it.sephiroth.android.library.widget:
//            AdapterView, c

public abstract class AbsHListView extends AdapterView
    implements android.view.ViewTreeObserver.OnGlobalLayoutListener, android.view.ViewTreeObserver.OnTouchModeChangeListener
{

    static final Interpolator S = new LinearInterpolator();
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
    protected a I;
    protected int J;
    protected boolean K;
    boolean L;
    protected int M;
    protected int N;
    protected Runnable O;
    final boolean P[];
    int Q;
    int R;
    protected boolean T;
    it.sephiroth.android.library.c.b.a a;
    private boolean aA;
    private Rect aB;
    private android.view.ContextMenu.ContextMenuInfo aC;
    private int aD;
    private boolean aE;
    private boolean aF;
    private CheckForLongPress aG;
    private CheckForTap aH;
    private CheckForKeyLongPress aI;
    private PerformClick aJ;
    private Runnable aK;
    private int aL;
    private int aM;
    private boolean aN;
    private int aO;
    private int aP;
    private float aQ;
    private Runnable aR;
    private int aS;
    private int aT;
    private float aU;
    private final int aV[];
    private final int aW[];
    private int aX;
    private int aY;
    private EdgeEffectCompat aZ;
    private final Thread au;
    private boolean av;
    private VelocityTracker aw;
    private FlingRunnable ax;
    private d ay;
    private boolean az;
    protected int b;
    private EdgeEffectCompat ba;
    private int bb;
    private int bc;
    private int bd;
    private boolean be;
    private int bf;
    private int bg;
    private int bh;
    private int bi;
    private int bj;
    private SavedState bk;
    private boolean bl;
    private float bm;
    public Object c;
    Object d;
    int e;
    protected SparseArrayCompat f;
    LongSparseArray g;
    protected int h;
    protected b i;
    protected ListAdapter j;
    boolean k;
    boolean l;
    Drawable m;
    int n;
    protected Rect o;
    protected final e p;
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
        av = false;
        l = false;
        n = -1;
        o = new Rect();
    /* block-local class not found */
    class e {}

        p = new e();
        q = 0;
        r = 0;
        s = 0;
        t = 0;
        u = new Rect();
        v = 0;
        F = -1;
        J = 0;
        az = true;
        M = -1;
        aC = null;
        aD = -1;
        aE = false;
        aF = false;
        aO = 0;
        aU = 1.0F;
        P = new boolean[1];
        aV = new int[2];
        aW = new int[2];
        aX = 0;
        aY = -1;
        bd = 0;
        y();
        au = Thread.currentThread();
    }

    public AbsHListView(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, it.sephiroth.android.library.R.attr.hlv_absHListViewStyle);
    }

    public AbsHListView(Context context, AttributeSet attributeset, int i1)
    {
        boolean flag1 = true;
        int j1 = 0;
        super(context, attributeset, i1);
        b = 0;
        h = 0;
        av = false;
        l = false;
        n = -1;
        o = new Rect();
        p = new e();
        q = 0;
        r = 0;
        s = 0;
        t = 0;
        u = new Rect();
        v = 0;
        F = -1;
        J = 0;
        az = true;
        M = -1;
        aC = null;
        aD = -1;
        aE = false;
        aF = false;
        aO = 0;
        aU = 1.0F;
        P = new boolean[1];
        aV = new int[2];
        aW = new int[2];
        aX = 0;
        aY = -1;
        bd = 0;
        y();
        au = Thread.currentThread();
        attributeset = context.getTheme().obtainStyledAttributes(attributeset, it.sephiroth.android.library.R.styleable.AbsHListView, i1, 0);
        int k1;
        boolean flag2;
        boolean flag3;
        boolean flag4;
        if (attributeset != null)
        {
            context = attributeset.getDrawable(it.sephiroth.android.library.R.styleable.AbsHListView_android_listSelector);
            flag4 = attributeset.getBoolean(it.sephiroth.android.library.R.styleable.AbsHListView_android_drawSelectorOnTop, false);
            flag3 = attributeset.getBoolean(it.sephiroth.android.library.R.styleable.AbsHListView_hlv_stackFromRight, false);
            flag2 = attributeset.getBoolean(it.sephiroth.android.library.R.styleable.AbsHListView_android_scrollingCache, true);
            k1 = attributeset.getInt(it.sephiroth.android.library.R.styleable.AbsHListView_hlv_transcriptMode, 0);
            j1 = attributeset.getColor(it.sephiroth.android.library.R.styleable.AbsHListView_android_cacheColorHint, 0);
            flag1 = attributeset.getBoolean(it.sephiroth.android.library.R.styleable.AbsHListView_android_smoothScrollbar, true);
            i1 = attributeset.getInt(it.sephiroth.android.library.R.styleable.AbsHListView_android_choiceMode, 0);
            attributeset.recycle();
        } else
        {
            k1 = 0;
            flag2 = true;
            flag3 = false;
            flag4 = false;
            context = null;
            boolean flag = false;
            i1 = j1;
            j1 = ((flag) ? 1 : 0);
        }
        if (context != null)
        {
            setSelector(context);
        }
        l = flag4;
        setStackFromRight(flag3);
        setScrollingCacheEnabled(flag2);
        setTranscriptMode(k1);
        setCacheColorHint(j1);
        setSmoothScrollbarEnabled(flag1);
        setChoiceMode(i1);
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
            if (getChildAt(0).getTop() < u.top || getChildAt(i1 - 1).getBottom() > getHeight() - u.bottom)
            {
                return false;
            }
        }
        return true;
    }

    private void B()
    {
        if (a.f)
        {
            setSelector(getContext().getDrawable(0x1080062));
            return;
        } else
        {
            setSelector(getResources().getDrawable(0x1080062));
            return;
        }
    }

    private boolean C()
    {
        boolean flag;
        if (V > 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (!flag && getChildCount() > 0)
        {
            return getChildAt(0).getLeft() < u.left;
        } else
        {
            return flag;
        }
    }

    private boolean D()
    {
        int i1 = getChildCount();
        boolean flag;
        if (V + i1 < ao)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (!flag && i1 > 0)
        {
            return getChildAt(i1 - 1).getRight() > getRight() - u.right;
        } else
        {
            return flag;
        }
    }

    private void E()
    {
        F;
        JVM INSTR tableswitch 5 6: default 28
    //                   5 107
    //                   6 78;
           goto _L1 _L2 _L3
_L3:
        break; /* Loop/switch isn't completed */
_L1:
        F = -1;
        setPressed(false);
        View view = getChildAt(A - V);
        if (view != null)
        {
            view.setPressed(false);
        }
        J();
        removeCallbacks(aG);
        H();
_L5:
        if (aZ != null)
        {
            aZ.onRelease();
            ba.onRelease();
        }
        aY = -1;
        return;
_L2:
    /* block-local class not found */
    class FlingRunnable {}

        if (ax == null)
        {
            ax = new FlingRunnable();
        }
        ax.a();
        if (true) goto _L5; else goto _L4
_L4:
    }

    private void F()
    {
        if (aw == null)
        {
            aw = VelocityTracker.obtain();
            return;
        } else
        {
            aw.clear();
            return;
        }
    }

    private void G()
    {
        if (aw == null)
        {
            aw = VelocityTracker.obtain();
        }
    }

    private void H()
    {
        if (aw != null)
        {
            aw.recycle();
            aw = null;
        }
    }

    private void I()
    {
        if (L && !y && !a.a())
        {
            setChildrenDrawnWithCacheEnabled(true);
            setChildrenDrawingCacheEnabled(true);
            z = true;
            y = true;
        }
    }

    private void J()
    {
        if (!a.a())
        {
            if (aR == null)
            {
                aR = new _cls2();
            }
            post(aR);
        }
    }

    private void K()
    {
        if (aZ != null)
        {
            aZ.finish();
            ba.finish();
        }
    }

    public static int a(Rect rect, Rect rect1, int i1)
    {
        i1;
        JVM INSTR lookupswitch 6: default 60
    //                   1: 246
    //                   2: 246
    //                   17: 166
    //                   33: 205
    //                   66: 71
    //                   130: 125;
           goto _L1 _L2 _L2 _L3 _L4 _L5 _L6
_L1:
        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT, FOCUS_FORWARD, FOCUS_BACKWARD}.");
_L5:
        int j1;
        int k1;
        int l1;
        l1 = rect.right;
        k1 = rect.top + rect.height() / 2;
        j1 = rect1.left;
        i1 = rect1.top + rect1.height() / 2;
_L8:
        j1 -= l1;
        i1 -= k1;
        return i1 * i1 + j1 * j1;
_L6:
        l1 = rect.left + rect.width() / 2;
        k1 = rect.bottom;
        i1 = rect1.left;
        j1 = rect1.width() / 2 + i1;
        i1 = rect1.top;
        continue; /* Loop/switch isn't completed */
_L3:
        l1 = rect.left;
        k1 = rect.top + rect.height() / 2;
        j1 = rect1.right;
        i1 = rect1.top + rect1.height() / 2;
        continue; /* Loop/switch isn't completed */
_L4:
        l1 = rect.left + rect.width() / 2;
        k1 = rect.top;
        i1 = rect1.left;
        j1 = rect1.width() / 2 + i1;
        i1 = rect1.bottom;
        continue; /* Loop/switch isn't completed */
_L2:
        l1 = rect.right + rect.width() / 2;
        k1 = rect.top + rect.height() / 2;
        i1 = rect1.left;
        j1 = rect1.width() / 2 + i1;
        i1 = rect1.top + rect1.height() / 2;
        if (true) goto _L8; else goto _L7
_L7:
    }

    static int a(AbsHListView abshlistview)
    {
        return abshlistview.getWindowAttachCount();
    }

    static CheckForLongPress a(AbsHListView abshlistview, CheckForLongPress checkforlongpress)
    {
        abshlistview.aG = checkforlongpress;
        return checkforlongpress;
    }

    static Runnable a(AbsHListView abshlistview, Runnable runnable)
    {
        abshlistview.aK = runnable;
        return runnable;
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

    private void a(MotionEvent motionevent, MotionEvent motionevent1)
    {
        int i1;
        int j1;
        j1 = motionevent.findPointerIndex(aY);
        i1 = j1;
        if (j1 == -1)
        {
            aY = motionevent.getPointerId(0);
            i1 = 0;
        }
        if (aj)
        {
            e();
        }
        j1 = (int)motionevent.getX(i1);
        F;
        JVM INSTR tableswitch 0 5: default 96
    //                   0 97
    //                   1 97
    //                   2 97
    //                   3 204
    //                   4 96
    //                   5 204;
           goto _L1 _L2 _L2 _L2 _L3 _L1 _L3
_L1:
        return;
_L2:
        float f1;
        if (!a(j1, (int)motionevent.getY(i1), motionevent1) && !a.a(j1, f1 = motionevent.getY(i1), aP))
        {
            setPressed(false);
            motionevent = getChildAt(A - V);
            if (motionevent != null)
            {
                motionevent.setPressed(false);
            }
            if (F == 0)
            {
                motionevent = aH;
            } else
            {
                motionevent = aG;
            }
            removeCallbacks(motionevent);
            F = 2;
            j();
            return;
        }
          goto _L1
_L3:
        b(j1, (int)motionevent.getY(i1), motionevent1);
        return;
    }

    private void a(View view, int i1)
    {
        Object obj = view.getLayoutParams();
    /* block-local class not found */
    class c {}

        if (obj == null)
        {
            obj = (c)generateDefaultLayoutParams();
        } else
        if (!checkLayoutParams(((android.view.ViewGroup.LayoutParams) (obj))))
        {
            obj = (c)generateLayoutParams(((android.view.ViewGroup.LayoutParams) (obj)));
        } else
        {
            obj = (c)obj;
        }
        if (k)
        {
            obj.e = j.getItemId(i1);
        }
        obj.a = j.getItemViewType(i1);
        view.setLayoutParams(((android.view.ViewGroup.LayoutParams) (obj)));
    }

    static void a(AbsHListView abshlistview, View view, boolean flag)
    {
        abshlistview.removeDetachedView(view, flag);
    }

    static void a(AbsHListView abshlistview, boolean flag)
    {
        abshlistview.setChildrenDrawnWithCacheEnabled(flag);
    }

    private boolean a(int i1, int j1, MotionEvent motionevent)
    {
        int l1 = i1 - D;
        int i2 = Math.abs(l1);
        boolean flag;
        if (getScrollX() != 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if ((flag || i2 > aP) && (a.b() & 1) == 0)
        {
            I();
            Object obj;
            if (flag)
            {
                F = 5;
                H = 0;
            } else
            {
                F = 3;
                int k1;
                if (l1 > 0)
                {
                    k1 = aP;
                } else
                {
                    k1 = -aP;
                }
                H = k1;
            }
            obj = getHandler();
            if (obj != null)
            {
                ((Handler) (obj)).removeCallbacks(aG);
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
            b(i1, j1, motionevent);
            return true;
        } else
        {
            return false;
        }
    }

    static boolean a(AbsHListView abshlistview, int i1, int j1, int k1, int l1, int i2, int j2, int k2, 
            int l2, boolean flag)
    {
        return abshlistview.overScrollBy(i1, j1, k1, l1, i2, j2, k2, l2, flag);
    }

    static int b(AbsHListView abshlistview)
    {
        return abshlistview.getWindowAttachCount();
    }

    private void b(int i1, int j1, MotionEvent motionevent)
    {
        int k1 = i1 - D;
        j1 = k1;
        if (G == 0x80000000)
        {
            j1 = k1 - H;
        }
        if (!a.f) goto _L2; else goto _L1
_L1:
        int l1;
        int i2;
        if (G != 0x80000000)
        {
            l1 = G - i1;
        } else
        {
            l1 = -j1;
        }
        if (!dispatchNestedPreScroll(0, l1, aW, aV)) goto _L2; else goto _L3
_L3:
        int j2 = aW[0];
        l1 = -aV[0];
        i2 = aW[0];
        if (motionevent != null)
        {
            motionevent.offsetLocation(aV[0], 0.0F);
            aX = aX + aV[0];
        }
        j1 += j2;
_L17:
        if (G != 0x80000000)
        {
            i2 += i1 - G;
        } else
        {
            i2 = j1;
        }
        if (F != 3) goto _L5; else goto _L4
_L4:
        if (i1 == G) goto _L7; else goto _L6
_L6:
        if (Math.abs(j1) > aP)
        {
            ViewParent viewparent = getParent();
            if (viewparent != null)
            {
                viewparent.requestDisallowInterceptTouchEvent(true);
            }
        }
        View view;
        int k2;
        int l2;
        boolean flag;
        if (A >= 0)
        {
            k2 = A - V;
        } else
        {
            k2 = getChildCount() / 2;
        }
        view = getChildAt(k2);
        int i3;
        int j3;
        if (view != null)
        {
            l2 = view.getLeft();
        } else
        {
            l2 = 0;
        }
        flag = false;
        if (i2 != 0)
        {
            flag = d(j1, i2);
        }
        view = getChildAt(k2);
        if (view == null)
        {
            break MISSING_BLOCK_LABEL_944;
        }
        j1 = view.getLeft();
        if (!flag) goto _L9; else goto _L8
_L8:
        j1 = -i2 - (j1 - l2);
        if (!a.f || !dispatchNestedScroll(j1 - i2, 0, j1, 0, aV)) goto _L11; else goto _L10
_L10:
        i2 = 0 - aV[0];
        j1 = i2;
        if (motionevent != null)
        {
            motionevent.offsetLocation(aV[0], 0.0F);
            aX = aX + aV[0];
            j1 = i2;
        }
_L13:
        D = i1 + j1 + l1;
_L15:
        G = j1 + i1 + l1;
_L7:
        return;
_L11:
        flag = overScrollBy(j1, 0, getScrollX(), 0, 0, 0, Q, 0, true);
        if (flag && aw != null)
        {
            aw.clear();
        }
        k2 = getOverScrollMode();
        if (k2 != 0 && (k2 != 1 || A())) goto _L9; else goto _L12
_L12:
label0:
        {
            if (!flag)
            {
                bd = 0;
                F = 5;
            }
            if (i2 <= 0)
            {
                break label0;
            }
            aZ.onPull((float)(-j1) / (float)getWidth());
            if (!ba.isFinished())
            {
                ba.onRelease();
            }
            invalidate();
            j1 = 0;
        }
          goto _L13
        if (i2 < 0)
        {
            ba.onPull((float)j1 / (float)getWidth());
            if (!aZ.isFinished())
            {
                aZ.onRelease();
            }
            invalidate();
        }
_L9:
        j1 = 0;
          goto _L13
_L5:
        if (F != 5 || i1 == G) goto _L7; else goto _L14
_L14:
        i3 = getScrollX();
        j3 = i3 - i2;
        if (i1 > G)
        {
            k2 = 1;
        } else
        {
            k2 = -1;
        }
        if (bd == 0)
        {
            bd = k2;
        }
        l2 = -i2;
        if (j3 < 0 && i3 >= 0 || j3 > 0 && i3 <= 0)
        {
            i3 = -i3;
            l2 = i2 + i3;
            i2 = i3;
        } else
        {
            i3 = 0;
            i2 = l2;
            l2 = i3;
        }
        if (i2 != 0)
        {
            overScrollBy(i2, 0, getScrollX(), 0, 0, 0, Q, 0, true);
            i3 = getOverScrollMode();
            if (i3 == 0 || i3 == 1 && !A())
            {
                if (j1 > 0)
                {
                    aZ.onPull((float)i2 / (float)getWidth());
                    if (!ba.isFinished())
                    {
                        ba.onRelease();
                    }
                    invalidate();
                } else
                if (j1 < 0)
                {
                    ba.onPull((float)i2 / (float)getWidth());
                    if (!aZ.isFinished())
                    {
                        aZ.onRelease();
                    }
                    invalidate();
                }
            }
        }
        if (l2 != 0)
        {
            if (getScrollX() != 0)
            {
                a.a(0);
                k();
            }
            d(l2, l2);
            F = 3;
            i2 = f(i1);
            H = 0;
            motionevent = getChildAt(i2 - V);
            if (motionevent != null)
            {
                j1 = motionevent.getLeft();
            } else
            {
                j1 = 0;
            }
            B = j1;
            D = i1 + l1;
            A = i2;
        }
        G = i1 + 0 + l1;
        bd = k2;
        return;
        j1 = 0;
          goto _L15
_L2:
        l1 = 0;
        i2 = 0;
        if (true) goto _L17; else goto _L16
_L16:
    }

    private void b(MotionEvent motionevent)
    {
        aY = motionevent.getPointerId(0);
        if (F != 6) goto _L2; else goto _L1
_L1:
        ax.b();
    /* block-local class not found */
    class a {}

        if (I != null)
        {
            I.a();
        }
        F = 5;
        D = (int)motionevent.getX();
        E = (int)motionevent.getY();
        G = D;
        H = 0;
        bd = 0;
_L4:
        if (F == 0 && A != -1 && a(motionevent))
        {
            removeCallbacks(aH);
        }
        return;
_L2:
        int i1;
        int j1;
        int k1;
        j1 = (int)motionevent.getX();
        k1 = (int)motionevent.getY();
        i1 = a(j1, k1);
        if (!aj)
        {
            if (F != 4)
            {
                break; /* Loop/switch isn't completed */
            }
            I();
            F = 3;
            H = 0;
            i1 = e(j1);
            ax.c();
        }
_L6:
        if (i1 >= 0)
        {
            B = getChildAt(i1 - V).getLeft();
        }
        D = j1;
        E = k1;
        A = i1;
        G = 0x80000000;
        if (true) goto _L4; else goto _L3
_L3:
        if (i1 < 0 || !((ListAdapter)getAdapter()).isEnabled(i1)) goto _L6; else goto _L5
_L5:
        F = 0;
    /* block-local class not found */
    class CheckForTap {}

        if (aH == null)
        {
            aH = new CheckForTap(null);
        }
        aH.a = motionevent.getX();
        aH.b = motionevent.getY();
        postDelayed(aH, ViewConfiguration.getTapTimeout());
          goto _L6
    }

    static void b(AbsHListView abshlistview, boolean flag)
    {
        abshlistview.setChildrenDrawingCacheEnabled(flag);
    }

    static boolean b(AbsHListView abshlistview, int i1, int j1, int k1, int l1, int i2, int j2, int k2, 
            int l2, boolean flag)
    {
        return abshlistview.overScrollBy(i1, j1, k1, l1, i2, j2, k2, l2, flag);
    }

    static CheckForLongPress c(AbsHListView abshlistview)
    {
        return abshlistview.aG;
    }

    private void c(MotionEvent motionevent)
    {
        F;
        JVM INSTR tableswitch 0 5: default 44
    //                   0 95
    //                   1 95
    //                   2 95
    //                   3 478
    //                   4 44
    //                   5 865;
           goto _L1 _L2 _L2 _L2 _L3 _L1 _L4
_L1:
        setPressed(false);
        if (aZ != null)
        {
            aZ.onRelease();
            ba.onRelease();
        }
        invalidate();
        removeCallbacks(aG);
        H();
        aY = -1;
        return;
_L2:
        int j1 = A;
        View view = getChildAt(j1 - V);
        if (view != null)
        {
            if (F != 0)
            {
                view.setPressed(false);
            }
            float f1 = motionevent.getY();
            boolean flag;
            if (f1 > (float)u.top && f1 < (float)(getHeight() - u.bottom))
            {
                flag = true;
            } else
            {
                flag = false;
            }
            if (flag && !view.hasFocusable())
            {
    /* block-local class not found */
    class PerformClick {}

                if (aJ == null)
                {
                    aJ = new PerformClick(null);
                }
                PerformClick performclick = aJ;
                performclick.a = j1;
                performclick.a();
                M = j1;
                if (F == 0 || F == 1)
                {
                    Object obj;
                    if (F == 0)
                    {
                        obj = aH;
                    } else
                    {
                        obj = aG;
                    }
                    removeCallbacks(((Runnable) (obj)));
                    h = 0;
                    if (!aj && j.isEnabled(j1))
                    {
                        F = 1;
                        setSelectedPositionInt(A);
                        e();
                        view.setPressed(true);
                        b(A, view);
                        setPressed(true);
                        if (m != null)
                        {
                            obj = m.getCurrent();
                            if (obj != null && (obj instanceof TransitionDrawable))
                            {
                                ((TransitionDrawable)obj).resetTransition();
                            }
                            DrawableCompat.setHotspot(m, motionevent.getX(), f1);
                        }
                        if (aK != null)
                        {
                            removeCallbacks(aK);
                        }
                        aK = new _cls1(view, performclick);
                        postDelayed(aK, ViewConfiguration.getPressedStateDuration());
                        return;
                    } else
                    {
                        F = -1;
                        j();
                        return;
                    }
                }
                if (!aj && j.isEnabled(j1))
                {
                    performclick.run();
                }
            }
        }
        F = -1;
        j();
        continue; /* Loop/switch isn't completed */
_L3:
        int k1 = getChildCount();
        if (k1 > 0)
        {
            int l1 = getChildAt(0).getLeft();
            int i2 = getChildAt(k1 - 1).getRight();
            int j2 = u.left;
            int k2 = getWidth() - u.right;
            if (V == 0 && l1 >= j2 && V + k1 < ao && i2 <= getWidth() - k2)
            {
                F = -1;
                b(0);
            } else
            {
                motionevent = aw;
                motionevent.computeCurrentVelocity(1000, aT);
                int l2 = (int)(motionevent.getXVelocity(aY) * aU);
                boolean flag1;
                if (Math.abs(l2) > aS)
                {
                    flag1 = true;
                } else
                {
                    flag1 = false;
                }
                if (flag1 && (V != 0 || l1 != j2 - Q) && (k1 + V != ao || i2 != Q + k2))
                {
                    if (!a.f || !dispatchNestedPreFling(-l2, 0.0F))
                    {
                        if (ax == null)
                        {
                            ax = new FlingRunnable();
                        }
                        b(2);
                        ax.a(-l2);
                        if (a.f)
                        {
                            dispatchNestedFling(-l2, 0.0F, true);
                        }
                    } else
                    {
                        F = -1;
                        b(0);
                    }
                } else
                {
                    F = -1;
                    b(0);
                    if (ax != null)
                    {
                        ax.b();
                    }
                    if (I != null)
                    {
                        I.a();
                    }
                    if (a.f && flag1 && !dispatchNestedPreFling(-l2, 0.0F))
                    {
                        dispatchNestedFling(-l2, 0.0F, false);
                    }
                }
            }
        } else
        {
            F = -1;
            b(0);
        }
        continue; /* Loop/switch isn't completed */
_L4:
        if (ax == null)
        {
            ax = new FlingRunnable();
        }
        motionevent = aw;
        motionevent.computeCurrentVelocity(1000, aT);
        int i1 = (int)motionevent.getXVelocity(aY);
        b(2);
        if (Math.abs(i1) > aS)
        {
            ax.b(-i1);
        } else
        {
            ax.a();
        }
        if (true) goto _L1; else goto _L5
_L5:
    }

    private void d(MotionEvent motionevent)
    {
        int i1 = (motionevent.getAction() & 0xff00) >> 8;
        if (motionevent.getPointerId(i1) == aY)
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
            aY = motionevent.getPointerId(i1);
        }
    }

    static boolean d(AbsHListView abshlistview)
    {
        return abshlistview.bl;
    }

    static int e(AbsHListView abshlistview)
    {
        return abshlistview.aY;
    }

    static VelocityTracker f(AbsHListView abshlistview)
    {
        return abshlistview.aw;
    }

    static int g(AbsHListView abshlistview)
    {
        return abshlistview.aT;
    }

    static int h(AbsHListView abshlistview)
    {
        return abshlistview.aS;
    }

    static boolean i(AbsHListView abshlistview)
    {
        return abshlistview.A();
    }

    static EdgeEffectCompat j(AbsHListView abshlistview)
    {
        return abshlistview.aZ;
    }

    static EdgeEffectCompat k(AbsHListView abshlistview)
    {
        return abshlistview.ba;
    }

    static void l(AbsHListView abshlistview)
    {
        abshlistview.J();
    }

    private void y()
    {
        setClickable(true);
        setFocusableInTouchMode(true);
        setWillNotDraw(false);
        setAlwaysDrawnWithCacheEnabled(false);
        setScrollingCacheEnabled(true);
        ViewConfiguration viewconfiguration = ViewConfiguration.get(getContext());
        aP = viewconfiguration.getScaledTouchSlop();
        aS = viewconfiguration.getScaledMinimumFlingVelocity();
        aT = viewconfiguration.getScaledMaximumFlingVelocity();
        Q = viewconfiguration.getScaledOverscrollDistance();
        R = viewconfiguration.getScaledOverflingDistance();
        a = it.sephiroth.android.library.c.b.a(this);
        aQ = getContext().getResources().getDisplayMetrics().density;
    }

    private void z()
    {
        int j1 = V;
        int k1 = getChildCount();
        boolean flag = a.b;
        int i1 = 0;
        while (i1 < k1) 
        {
            View view = getChildAt(i1);
            int l1 = j1 + i1;
            if (view instanceof Checkable)
            {
                ((Checkable)view).setChecked(((Boolean)f.get(l1, Boolean.valueOf(false))).booleanValue());
            } else
            if (flag)
            {
                view.setActivated(((Boolean)f.get(l1, Boolean.valueOf(false))).booleanValue());
            }
            i1++;
        }
    }

    public int a(int i1, int j1)
    {
        Rect rect1 = aB;
        Rect rect = rect1;
        if (rect1 == null)
        {
            aB = new Rect();
            rect = aB;
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

    protected View a(int i1, boolean aflag[])
    {
        aflag[0] = false;
        View view = p.d(i1);
        if (view != null)
        {
            if (((c)view.getLayoutParams()).a == j.getItemViewType(i1))
            {
                View view1 = j.getView(i1, view, this);
                if (view1 != view)
                {
                    a(view1, i1);
                    p.a(view1, i1);
                }
            }
            aflag[0] = true;
            return view;
        }
        view = p.e(i1);
        View view2 = j.getView(i1, view, this);
        if (view != null)
        {
            if (view2 != view)
            {
                p.a(view, i1);
            } else
            {
                aflag[0] = true;
                view2.onFinishTemporaryDetach();
            }
        }
        if (aM != 0)
        {
            view2.setDrawingCacheBackgroundColor(aM);
        }
        if (android.os.Build.VERSION.SDK_INT >= 16 && view2.getImportantForAccessibility() == 0)
        {
            view2.setImportantForAccessibility(1);
        }
        a(view2, i1);
        return view2;
    }

    public c a(AttributeSet attributeset)
    {
        return new c(getContext(), attributeset);
    }

    public void a()
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

    public void a(int i1, int j1, int k1)
    {
        if (I == null)
        {
            I = l();
        }
        I.a(i1, j1, k1);
    }

    public void a(int i1, int j1, boolean flag)
    {
        if (ax == null)
        {
            ax = new FlingRunnable();
        }
        int k1 = V;
        int l1 = getChildCount();
        int i2 = getPaddingLeft();
        int j2 = getWidth();
        int k2 = getPaddingRight();
        if (i1 == 0 || ao == 0 || l1 == 0 || k1 == 0 && getChildAt(0).getLeft() == i2 && i1 < 0 || k1 + l1 == ao && getChildAt(l1 - 1).getRight() == j2 - k2 && i1 > 0)
        {
            ax.b();
            if (I != null)
            {
                I.a();
            }
            return;
        } else
        {
            b(2);
            ax.a(i1, j1, flag);
            return;
        }
    }

    void a(int i1, View view)
    {
        boolean flag1 = true;
        Drawable drawable = m;
        boolean flag;
        if (drawable != null && n != i1 && i1 != -1)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag)
        {
            drawable.setVisible(false, false);
        }
        b(i1, view);
        if (flag)
        {
            view = o;
            float f1 = view.exactCenterX();
            float f2 = view.exactCenterY();
            if (getVisibility() != 0)
            {
                flag1 = false;
            }
            drawable.setVisible(flag1, false);
            DrawableCompat.setHotspot(drawable, f1, f2);
        }
    }

    public void a(int i1, boolean flag)
    {
        if (b != 0) goto _L2; else goto _L1
_L1:
        return;
_L2:
        if (a.b && flag && b == 3 && c == null)
        {
            if (d == null || !((it.sephiroth.android.library.c.a.b)d).a())
            {
                throw new IllegalStateException("AbsListView: attempted to start selection mode for CHOICE_MODE_MULTIPLE_MODAL but no choice mode callback was supplied. Call setMultiChoiceModeListener to set a callback.");
            }
            c = startActionMode((it.sephiroth.android.library.c.a.b)d);
        }
        if (b != 2 && (!a.b || b != 3))
        {
            break; /* Loop/switch isn't completed */
        }
        boolean flag2 = ((Boolean)f.get(i1, Boolean.valueOf(false))).booleanValue();
        f.put(i1, Boolean.valueOf(flag));
        if (g != null && j.hasStableIds())
        {
            if (flag)
            {
                g.put(j.getItemId(i1), Integer.valueOf(i1));
            } else
            {
                g.delete(j.getItemId(i1));
            }
        }
        if (flag2 != flag)
        {
            if (flag)
            {
                e = e + 1;
            } else
            {
                e = e - 1;
            }
        }
        if (c != null)
        {
            long l1 = j.getItemId(i1);
            ((it.sephiroth.android.library.c.a.b)d).a((ActionMode)c, i1, l1, flag);
        }
_L4:
        if (!af && !at)
        {
            aj = true;
            x();
            requestLayout();
            return;
        }
        if (true) goto _L1; else goto _L3
_L3:
        boolean flag1;
        if (g != null && j.hasStableIds())
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        if (flag || a(i1))
        {
            f.clear();
            if (flag1)
            {
                g.clear();
            }
        }
        if (flag)
        {
            f.put(i1, Boolean.valueOf(true));
            if (flag1)
            {
                g.put(j.getItemId(i1), Integer.valueOf(i1));
            }
            e = 1;
        } else
        if (f.size() == 0 || !((Boolean)f.valueAt(0)).booleanValue())
        {
            e = 0;
        }
          goto _L4
        if (true) goto _L1; else goto _L5
_L5:
    }

    protected abstract void a(boolean flag);

    public boolean a(float f1, float f2, int i1)
    {
        int j1 = a((int)f1, (int)f2);
        if (j1 != -1)
        {
            long l1 = j.getItemId(j1);
            View view = getChildAt(j1 - V);
            if (view != null)
            {
                aC = b(view, j1, l1);
                return super.showContextMenuForChild(this);
            }
        }
        return a(f1, f2, i1);
    }

    public boolean a(int i1)
    {
        boolean flag1 = false;
        boolean flag = flag1;
        if (b != 0)
        {
            flag = flag1;
            if (f != null)
            {
                flag = ((Boolean)f.get(i1, Boolean.valueOf(false))).booleanValue();
            }
        }
        return flag;
    }

    protected boolean a(MotionEvent motionevent)
    {
        return android.os.Build.VERSION.SDK_INT >= 14 && (motionevent.getButtonState() & 2) != 0 && a(motionevent.getX(), motionevent.getY(), motionevent.getMetaState());
    }

    public boolean a(View view, int i1, long l1)
    {
        boolean flag = true;
        boolean flag1 = false;
        boolean flag2 = false;
        boolean flag3;
        if (b != 0)
        {
            if (b == 2 || a.b && b == 3 && c != null)
            {
                boolean flag4;
                if (!((Boolean)f.get(i1, Boolean.valueOf(false))).booleanValue())
                {
                    flag3 = true;
                } else
                {
                    flag3 = false;
                }
                f.put(i1, Boolean.valueOf(flag3));
                if (g != null && j.hasStableIds())
                {
                    if (flag3)
                    {
                        g.put(j.getItemId(i1), Integer.valueOf(i1));
                    } else
                    {
                        g.delete(j.getItemId(i1));
                    }
                }
                if (flag3)
                {
                    e = e + 1;
                } else
                {
                    e = e - 1;
                }
                if (c != null)
                {
                    ((it.sephiroth.android.library.c.a.b)d).a((ActionMode)c, i1, l1, flag3);
                    flag = flag2;
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
                flag = true;
            }
            if (flag1)
            {
                z();
            }
            flag3 = true;
        } else
        {
            flag3 = false;
        }
        flag4 = flag3;
        if (flag)
        {
            flag4 = flag3 | super.a(view, i1, l1);
        }
        return flag4;
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

    android.view.ContextMenu.ContextMenuInfo b(View view, int i1, long l1)
    {
        return new AdapterView.a(view, i1, l1);
    }

    void b()
    {
    /* block-local class not found */
    class d {}

        if (ay != null)
        {
            ay.a(this, V, getChildCount(), ao);
        }
        onScrollChanged(0, 0, 0, 0);
    }

    void b(int i1)
    {
        if (i1 != aO && ay != null)
        {
            aO = i1;
            ay.a(this, i1);
        }
    }

    public void b(int i1, int j1)
    {
        if (I == null)
        {
            I = l();
        }
        I.a(i1, j1);
    }

    protected void b(int i1, View view)
    {
        if (i1 != -1)
        {
            n = i1;
        }
        Rect rect = o;
        rect.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
    /* block-local class not found */
    class g {}

        if (view instanceof g)
        {
            ((g)view).a(rect);
        }
        rect.left = rect.left - q;
        rect.right = rect.right + s;
        rect.top = rect.top - r;
        rect.bottom = rect.bottom + t;
        Drawable drawable = m;
        if (drawable != null)
        {
            drawable.setBounds(rect);
        }
        boolean flag = aN;
        if (view.isEnabled() != flag)
        {
            if (!flag)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            aN = flag;
            if (getSelectedItemPosition() != -1)
            {
                refreshDrawableState();
            }
        }
    }

    void c()
    {
        if (getChildCount() > 0)
        {
            d();
            requestLayout();
            invalidate();
        }
    }

    public void c(int i1, int j1)
    {
        a(i1, j1, false);
    }

    public boolean c(int i1)
    {
        int k1 = getChildCount();
        if (k1 != 0) goto _L2; else goto _L1
_L1:
        return false;
_L2:
        Rect rect;
        int j1;
        j1 = V;
        rect = u;
        if (i1 <= 0)
        {
            break; /* Loop/switch isn't completed */
        }
        i1 = getChildAt(k1 - 1).getRight();
        if (k1 + j1 < ao || i1 > getWidth() - rect.right)
        {
            return true;
        }
        if (true) goto _L1; else goto _L3
_L3:
        i1 = getChildAt(0).getLeft();
        if (j1 > 0 || i1 < rect.left)
        {
            return true;
        }
        if (true) goto _L1; else goto _L4
_L4:
    }

    boolean c(View view, int i1, long l1)
    {
        boolean flag1;
        if (android.os.Build.VERSION.SDK_INT >= 11 && b == 3)
        {
            if (c == null)
            {
                view = startActionMode((it.sephiroth.android.library.c.a.b)d);
                c = view;
                if (view != null)
                {
                    a(i1, true);
                    performHapticFeedback(0);
                }
            }
            flag1 = true;
        } else
        {
            boolean flag;
            if (ai != null)
            {
                flag1 = ai.a(this, view, i1, l1);
            } else
            {
                flag1 = false;
            }
            flag = flag1;
            if (!flag1)
            {
                aC = b(view, i1, l1);
                flag = super.showContextMenuForChild(this);
            }
            flag1 = flag;
            if (flag)
            {
                performHapticFeedback(0);
                return flag;
            }
        }
        return flag1;
    }

    public boolean checkInputConnectionProxy(View view)
    {
        return false;
    }

    protected boolean checkLayoutParams(android.view.ViewGroup.LayoutParams layoutparams)
    {
        return layoutparams instanceof c;
    }

    protected int computeHorizontalScrollExtent()
    {
        int k1 = getChildCount();
        if (k1 > 0)
        {
            if (az)
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
                    if (!az)
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
        if (az)
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
        removeAllViewsInLayout();
        V = 0;
        aj = false;
        O = null;
        ad = false;
        bk = null;
        ar = -1;
        as = 0x8000000000000000L;
        setSelectedPositionInt(-1);
        setNextSelectedPositionInt(-1);
        J = 0;
        n = -1;
        o.setEmpty();
        invalidate();
    }

    public void d(int i1)
    {
        int k1 = getChildCount();
        for (int j1 = 0; j1 < k1; j1++)
        {
            getChildAt(j1).offsetLeftAndRight(i1);
        }

    }

    boolean d(int i1, int j1)
    {
        Object obj;
        int j2;
        int k2;
        int l2;
        int l3;
        int i4;
        int j4;
        int k4;
        i4 = getChildCount();
        if (i4 == 0)
        {
            return true;
        }
        int i3 = getChildAt(0).getLeft();
        int j3 = getChildAt(i4 - 1).getRight();
        obj = u;
        int k3 = getWidth();
        int k1 = getWidth() - getPaddingRight() - getPaddingLeft();
        int i2;
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
            bb = i3 - ((Rect) (obj)).left;
        } else
        {
            bb = bb + j2;
        }
        if (l3 + i4 == ao)
        {
            bc = ((Rect) (obj)).right + j3;
        } else
        {
            bc = bc + j2;
        }
        if (l3 == 0 && i3 >= ((Rect) (obj)).left && j2 >= 0)
        {
            i1 = 1;
        } else
        {
            i1 = 0;
        }
        if (l3 + i4 == ao && j3 <= getWidth() - ((Rect) (obj)).right && j2 <= 0)
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
        int l4;
        boolean flag;
        boolean flag1;
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
            m();
        }
        j4 = getHeaderViewsCount();
        k4 = ao - getFooterViewsCount();
        k2 = 0;
        k1 = 0;
        if (!flag) goto _L2; else goto _L1
_L1:
        l4 = -j2;
        i1 = 0;
        j1 = 0;
_L7:
        k2 = i1;
        l2 = k1;
        if (j1 >= i4) goto _L4; else goto _L3
_L3:
        obj = getChildAt(j1);
        if (((View) (obj)).getRight() < l4) goto _L6; else goto _L5
_L5:
        l2 = k1;
        k2 = i1;
_L4:
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
        d(j2);
        if (flag)
        {
            V = k2 + V;
        }
        i1 = Math.abs(j2);
        if (0 - i3 < i1 || j3 - (k3 - 0) < i1)
        {
            a(flag);
        }
        int l1;
        int i5;
        if (!flag1 && am != -1)
        {
            i1 = am - V;
            if (i1 >= 0 && i1 < getChildCount())
            {
                b(am, getChildAt(i1));
            }
        } else
        if (n != -1)
        {
            i1 = n - V;
            if (i1 >= 0 && i1 < getChildCount())
            {
                b(-1, getChildAt(i1));
            }
        } else
        {
            o.setEmpty();
        }
        at = false;
        b();
        return false;
_L6:
        k2 = l3 + j1;
        if (k2 >= j4 && k2 < k4)
        {
            p.a(((View) (obj)), k2);
        }
        j1++;
        i1++;
          goto _L7
_L2:
        i5 = getWidth();
        j1 = 0;
        i1 = i4 - 1;
        l1 = k2;
_L10:
        k2 = j1;
        l2 = l1;
        if (i1 < 0) goto _L4; else goto _L8
_L8:
        obj = getChildAt(i1);
        k2 = j1;
        l2 = l1;
        if (((View) (obj)).getLeft() <= i5 - j2) goto _L4; else goto _L9
_L9:
        l1 = l3 + i1;
        if (l1 >= j4 && l1 < k4)
        {
            p.a(((View) (obj)), l1);
        }
        j1++;
        l1 = i1;
        i1--;
          goto _L10
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
        if (aZ != null)
        {
            int i1 = getScrollX();
            if (!aZ.isFinished())
            {
                int j1 = canvas.save();
                int l1 = u.top + bf;
                int j2 = u.bottom;
                int l2 = bg;
                j2 = getHeight() - l1 - (j2 + l2);
                l2 = Math.min(0, bb + i1);
                canvas.rotate(-90F);
                canvas.translate(l1 + -getHeight(), l2);
                aZ.setSize(j2, j2);
                if (aZ.draw(canvas))
                {
                    invalidate();
                }
                canvas.restoreToCount(j1);
            }
            if (!ba.isFinished())
            {
                int k1 = canvas.save();
                int i2 = u.left + bf;
                int k2 = u.right;
                int i3 = bg;
                k2 = getHeight() - i2 - (k2 + i3);
                i1 = Math.max(getWidth(), i1 + bc);
                canvas.rotate(90F);
                canvas.translate(-i2, -i1);
                ba.setSize(k2, k2);
                if (ba.draw(canvas))
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
        j();
    }

    protected abstract int e(int i1);

    protected void e()
    {
    }

    void e(int i1, int j1)
    {
    }

    protected int f(int i1)
    {
        int k1 = getChildCount();
        if (k1 == 0)
        {
            i1 = -1;
        } else
        {
            int j1 = e(i1);
            i1 = j1;
            if (j1 == -1)
            {
                return (V + k1) - 1;
            }
        }
        return i1;
    }

    void f()
    {
        boolean flag = false;
        int i1;
        if (w != null)
        {
            View view = w;
            if (C())
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
            view = x;
            if (D())
            {
                i1 = ((flag) ? 1 : 0);
            } else
            {
                i1 = 4;
            }
            view.setVisibility(i1);
        }
    }

    public void f(int i1, int j1)
    {
        if (j != null)
        {
            if (!isInTouchMode())
            {
                int k1 = b(i1, true);
                i1 = k1;
                if (k1 >= 0)
                {
                    setNextSelectedPositionInt(k1);
                    i1 = k1;
                }
            } else
            {
                M = i1;
            }
            if (i1 >= 0)
            {
                h = 4;
                W = u.left + j1;
                if (ad)
                {
                    aa = i1;
                    ab = j.getItemId(i1);
                }
                if (I != null)
                {
                    I.a();
                }
                requestLayout();
                return;
            }
        }
    }

    boolean g()
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

    protected android.view.ViewGroup.LayoutParams generateDefaultLayoutParams()
    {
        return new c(-2, -1, 0);
    }

    public android.view.ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeset)
    {
        return a(attributeset);
    }

    protected android.view.ViewGroup.LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams layoutparams)
    {
        return new c(layoutparams);
    }

    public int getCacheColorHint()
    {
        return aM;
    }

    public int getCheckedItemCount()
    {
        return e;
    }

    public long[] getCheckedItemIds()
    {
        int i1 = 0;
        if (b != 0 && g != null && j != null) goto _L2; else goto _L1
_L1:
        long al[] = new long[0];
_L4:
        return al;
_L2:
        LongSparseArray longsparsearray = g;
        int j1 = longsparsearray.size();
        long al1[] = new long[j1];
        do
        {
            al = al1;
            if (i1 >= j1)
            {
                continue;
            }
            al1[i1] = longsparsearray.keyAt(i1);
            i1++;
        } while (true);
        if (true) goto _L4; else goto _L3
_L3:
    }

    public int getCheckedItemPosition()
    {
        if (b == 1 && f != null && f.size() == 1)
        {
            return f.keyAt(0);
        } else
        {
            return -1;
        }
    }

    public SparseArrayCompat getCheckedItemPositions()
    {
        if (b != 0)
        {
            return f;
        } else
        {
            return null;
        }
    }

    public int getChoiceMode()
    {
        return b;
    }

    protected android.view.ContextMenu.ContextMenuInfo getContextMenuInfo()
    {
        return aC;
    }

    public void getFocusedRect(Rect rect)
    {
        View view = getSelectedView();
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

    int getFooterViewsCount()
    {
        return 0;
    }

    int getHeaderViewsCount()
    {
        return 0;
    }

    protected float getHorizontalScrollFactor()
    {
label0:
        {
            if (bm == 0.0F)
            {
                TypedValue typedvalue = new TypedValue();
                if (!getContext().getTheme().resolveAttribute(it.sephiroth.android.library.R.attr.hlv_listPreferredItemWidth, typedvalue, true))
                {
                    break label0;
                }
                bm = typedvalue.getDimension(getContext().getResources().getDisplayMetrics());
            }
            return bm;
        }
        throw new IllegalStateException("Expected theme to define hlv_listPreferredItemWidth.");
    }

    public int getHorizontalScrollbarHeight()
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

    public int getListPaddingBottom()
    {
        return u.bottom;
    }

    public int getListPaddingLeft()
    {
        return u.left;
    }

    public int getListPaddingRight()
    {
        return u.right;
    }

    public int getListPaddingTop()
    {
        return u.top;
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

    public View getSelectedView()
    {
        if (ao > 0 && am >= 0)
        {
            return getChildAt(am - V);
        } else
        {
            return null;
        }
    }

    int getSelectionModeForAccessibility()
    {
        switch (getChoiceMode())
        {
        case 0: // '\0'
        default:
            return 0;

        case 1: // '\001'
            return 1;

        case 2: // '\002'
        case 3: // '\003'
            return 2;
        }
    }

    public Drawable getSelector()
    {
        return m;
    }

    public int getSolidColor()
    {
        return aM;
    }

    public int getTranscriptMode()
    {
        return aL;
    }

    protected boolean h()
    {
        return hasFocus() && !isInTouchMode() || g();
    }

    protected void i()
    {
        if (isEnabled() && isClickable()) goto _L2; else goto _L1
_L1:
        return;
_L2:
        Drawable drawable;
        drawable = m;
        Object obj = o;
        if (drawable == null || !isFocused() && !g() || ((Rect) (obj)).isEmpty())
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
    /* block-local class not found */
    class CheckForKeyLongPress {}

            if (aI == null)
            {
                aI = new CheckForKeyLongPress(null);
            }
            aI.a();
            postDelayed(aI, ViewConfiguration.getLongPressTimeout());
            return;
        }
        if (true) goto _L1; else goto _L4
_L4:
    }

    void j()
    {
label0:
        {
            if (m != null)
            {
                if (!h())
                {
                    break label0;
                }
                m.setState(getDrawableState());
            }
            return;
        }
        m.setState(U);
    }

    public void jumpDrawablesToCurrentState()
    {
        super.jumpDrawablesToCurrentState();
        if (m != null)
        {
            m.jumpToCurrentState();
        }
    }

    protected void k()
    {
        if (a.a() && (getParent() instanceof View))
        {
            ((View)getParent()).invalidate();
        }
    }

    a l()
    {
    /* block-local class not found */
    class PositionScroller {}

        return new PositionScroller();
    }

    protected void m()
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
            setSelectedPositionInt(-1);
            setNextSelectedPositionInt(-1);
            J = 0;
        }
    }

    protected int n()
    {
        int j1 = am;
        int i1 = j1;
        if (j1 < 0)
        {
            i1 = M;
        }
        return Math.min(Math.max(0, i1), ao - 1);
    }

    protected boolean o()
    {
        if (am < 0 && p())
        {
            j();
            return true;
        } else
        {
            return false;
        }
    }

    protected void onAttachedToWindow()
    {
        super.onAttachedToWindow();
        T = true;
        getViewTreeObserver().addOnTouchModeChangeListener(this);
        if (j != null && i == null)
        {
    /* block-local class not found */
    class b {}

            i = new b();
            j.registerDataSetObserver(i);
            aj = true;
            ap = ao;
            ao = j.getCount();
        }
    }

    protected int[] onCreateDrawableState(int i1)
    {
        if (!aN) goto _L2; else goto _L1
_L1:
        int ai[] = super.onCreateDrawableState(i1);
_L5:
        return ai;
_L2:
        int ai1[];
        int j1;
        j1 = ENABLED_STATE_SET[0];
        ai1 = super.onCreateDrawableState(i1 + 1);
        i1 = ai1.length - 1;
_L6:
        if (i1 < 0)
        {
            break MISSING_BLOCK_LABEL_77;
        }
        if (ai1[i1] != j1) goto _L4; else goto _L3
_L3:
        ai = ai1;
        if (i1 >= 0)
        {
            System.arraycopy(ai1, i1 + 1, ai1, i1, ai1.length - i1 - 1);
            return ai1;
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
        T = false;
        bl = true;
        p.b();
        getViewTreeObserver().removeOnTouchModeChangeListener(this);
        if (j != null && i != null)
        {
            j.unregisterDataSetObserver(i);
            i = null;
        }
        if (ax != null)
        {
            removeCallbacks(ax);
        }
        if (I != null)
        {
            I.a();
        }
        if (aR != null)
        {
            removeCallbacks(aR);
        }
        if (aJ != null)
        {
            removeCallbacks(aJ);
        }
        if (aK != null)
        {
            removeCallbacks(aK);
            aK = null;
        }
        bl = false;
    }

    protected void onFocusChanged(boolean flag, int i1, Rect rect)
    {
        super.onFocusChanged(flag, i1, rect);
        if (flag && am < 0 && !isInTouchMode())
        {
            if (!T && j != null)
            {
                aj = true;
                ap = ao;
                ao = j.getCount();
            }
            p();
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
        int i1;
        if (F == -1 && (f1 = motionevent.getAxisValue(10)) != 0.0F && !d(i1 = (int)(f1 * getHorizontalScrollFactor()), i1))
        {
            return true;
        }
        if (true) goto _L2; else goto _L4
_L4:
    }

    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityevent)
    {
        super.onInitializeAccessibilityEvent(accessibilityevent);
        accessibilityevent.setClassName(it/sephiroth/android/library/widget/AbsHListView.getName());
    }

    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilitynodeinfo)
    {
        super.onInitializeAccessibilityNodeInfo(accessibilitynodeinfo);
        accessibilitynodeinfo.setClassName(it/sephiroth/android/library/widget/AbsHListView.getName());
        if (isEnabled())
        {
            if (C())
            {
                accessibilitynodeinfo.addAction(8192);
                accessibilitynodeinfo.setScrollable(true);
            }
            if (D())
            {
                accessibilitynodeinfo.addAction(4096);
                accessibilitynodeinfo.setScrollable(true);
            }
        }
    }

    public boolean onInterceptTouchEvent(MotionEvent motionevent)
    {
        int i1;
        i1 = motionevent.getActionMasked();
        if (I != null)
        {
            I.a();
        }
        if (!bl && T) goto _L2; else goto _L1
_L1:
        return false;
_L2:
        switch (i1)
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
            aY = motionevent.getPointerId(0);
            int k2 = e(l1);
            if (j1 != 4 && k2 >= 0)
            {
                B = getChildAt(k2 - V).getLeft();
                D = l1;
                E = j2;
                A = k2;
                F = 0;
                J();
            }
            G = 0x80000000;
            F();
            aw.addMovement(motionevent);
            aX = 0;
            if (a.f)
            {
                startNestedScroll(1);
            }
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
                i2 = motionevent.findPointerIndex(aY);
                break;
            }
            int k1 = i2;
            if (i2 == -1)
            {
                aY = motionevent.getPointerId(0);
                k1 = 0;
            }
            i2 = (int)motionevent.getX(k1);
            G();
            aw.addMovement(motionevent);
            if (a(i2, (int)motionevent.getY(k1), ((MotionEvent) (null))))
            {
                return true;
            }
            break;

        case 1: // '\001'
        case 3: // '\003'
            F = -1;
            aY = -1;
            H();
            b(0);
            if (a.f)
            {
                stopNestedScroll();
                return false;
            }
            break;

        case 6: // '\006'
            d(motionevent);
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
        l1 = getChildCount();
        if (flag)
        {
            for (j1 = 0; j1 < l1; j1++)
            {
                getChildAt(j1).forceLayout();
            }

            p.a();
        }
        e();
        af = false;
        N = (k1 - i1) / 3;
    }

    protected void onMeasure(int i1, int j1)
    {
        if (m == null)
        {
            B();
        }
        Rect rect = u;
        rect.left = q + getPaddingLeft();
        rect.top = r + getPaddingTop();
        rect.right = s + getPaddingRight();
        rect.bottom = t + getPaddingBottom();
        if (aL == 1)
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
            if (k1 + V >= bj && i1 <= j1)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            be = flag;
        }
    }

    public boolean onNestedFling(View view, float f1, float f2, boolean flag)
    {
        int i1 = getChildCount();
        if (!flag && i1 > 0 && c((int)f1) && Math.abs(f1) > (float)aS)
        {
            b(2);
            if (ax == null)
            {
                ax = new FlingRunnable();
            }
            if (!dispatchNestedPreFling(f1, 0.0F))
            {
                ax.a((int)f1);
            }
            return true;
        } else
        {
            return dispatchNestedFling(f1, f2, flag);
        }
    }

    public void onNestedScroll(View view, int i1, int j1, int k1, int l1)
    {
        view = getChildAt(getChildCount() / 2);
        if (view != null)
        {
            i1 = view.getLeft();
        } else
        {
            i1 = 0;
        }
        if (view == null || d(-l1, -l1))
        {
            if (view != null)
            {
                i1 = view.getLeft() - i1;
                j1 = k1 - i1;
            } else
            {
                i1 = 0;
                j1 = k1;
            }
            if (a.f)
            {
                dispatchNestedScroll(i1, 0, j1, 0, null);
            }
        }
    }

    public void onNestedScrollAccepted(View view, View view1, int i1)
    {
        if (a.f)
        {
            super.onNestedScrollAccepted(view, view1, i1);
            startNestedScroll(1);
        }
    }

    protected void onOverScrolled(int i1, int j1, boolean flag, boolean flag1)
    {
        if (getScrollX() != i1)
        {
            onScrollChanged(i1, j1, getScrollX(), getScrollY());
            a.a(i1);
            k();
            awakenScrollBars();
        }
    }

    public void onRestoreInstanceState(Parcelable parcelable)
    {
    /* block-local class not found */
    class SavedState {}

        parcelable = (SavedState)parcelable;
        super.onRestoreInstanceState(parcelable.getSuperState());
        aj = true;
        ac = ((SavedState) (parcelable)).e;
        if (((SavedState) (parcelable)).a < 0L) goto _L2; else goto _L1
_L1:
        ad = true;
        bk = parcelable;
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
            c = startActionMode((it.sephiroth.android.library.c.a.b)d);
        }
        requestLayout();
        return;
_L2:
        if (((SavedState) (parcelable)).b >= 0L)
        {
            setSelectedPositionInt(-1);
            setNextSelectedPositionInt(-1);
            n = -1;
            ad = true;
            bk = parcelable;
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
        if (bk != null)
        {
            savedstate.a = bk.a;
            savedstate.b = bk.b;
            savedstate.c = bk.c;
            savedstate.d = bk.d;
            savedstate.e = bk.e;
            savedstate.f = bk.f;
            savedstate.g = bk.g;
            savedstate.h = bk.h;
            savedstate.i = bk.i;
            savedstate.j = bk.j;
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
        l2 = getSelectedItemId();
        savedstate.a = l2;
        savedstate.e = getWidth();
        if (l2 >= 0L)
        {
            savedstate.c = J;
            savedstate.d = getSelectedItemPosition();
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
            x();
        }
    }

    public boolean onStartNestedScroll(View view, View view1, int i1)
    {
        return (i1 & 1) != 0;
    }

    public boolean onTouchEvent(MotionEvent motionevent)
    {
        boolean flag1 = false;
        if (isEnabled()) goto _L2; else goto _L1
_L1:
        boolean flag;
label0:
        {
            if (!isClickable())
            {
                flag = flag1;
                if (!isLongClickable())
                {
                    break label0;
                }
            }
            flag = true;
        }
_L4:
        return flag;
_L2:
        if (I != null)
        {
            I.a();
        }
        flag = flag1;
        if (bl) goto _L4; else goto _L3
_L3:
        flag = flag1;
        if (!T) goto _L4; else goto _L5
_L5:
        MotionEvent motionevent1;
        int i1;
        if (a.f)
        {
            startNestedScroll(1);
        }
        G();
        motionevent1 = MotionEvent.obtain(motionevent);
        i1 = motionevent.getActionMasked();
        if (i1 == 0)
        {
            aX = 0;
        }
        motionevent1.offsetLocation(aX, 0.0F);
        i1;
        JVM INSTR tableswitch 0 6: default 160
    //                   0 181
    //                   1 198
    //                   2 189
    //                   3 206
    //                   4 160
    //                   5 271
    //                   6 213;
           goto _L6 _L7 _L8 _L9 _L10 _L6 _L11 _L12
_L6:
        if (aw != null)
        {
            aw.addMovement(motionevent1);
        }
        motionevent1.recycle();
        return true;
_L7:
        b(motionevent);
        continue; /* Loop/switch isn't completed */
_L9:
        a(motionevent, motionevent1);
        continue; /* Loop/switch isn't completed */
_L8:
        c(motionevent);
        continue; /* Loop/switch isn't completed */
_L10:
        E();
        continue; /* Loop/switch isn't completed */
_L12:
        d(motionevent);
        int j1 = D;
        int l1 = a(j1, E);
        if (l1 >= 0)
        {
            B = getChildAt(l1 - V).getLeft();
            A = l1;
        }
        G = j1;
        continue; /* Loop/switch isn't completed */
_L11:
        int j2 = motionevent.getActionIndex();
        int i2 = motionevent.getPointerId(j2);
        int k1 = (int)motionevent.getX(j2);
        j2 = (int)motionevent.getY(j2);
        H = 0;
        aY = i2;
        D = k1;
        E = j2;
        i2 = a(k1, j2);
        if (i2 >= 0)
        {
            B = getChildAt(i2 - V).getLeft();
            A = i2;
        }
        G = k1;
        if (true) goto _L6; else goto _L13
_L13:
    }

    public void onTouchModeChanged(boolean flag)
    {
        if (flag)
        {
            m();
            if (getWidth() > 0 && getChildCount() > 0)
            {
                e();
            }
            j();
        } else
        {
            int i1 = F;
            if (i1 == 5 || i1 == 6)
            {
                if (ax != null)
                {
                    ax.b();
                }
                if (I != null)
                {
                    I.a();
                }
                if (getScrollX() != 0)
                {
                    a.a(0);
                    K();
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
        if (ax != null)
        {
            removeCallbacks(ax);
            ax.b();
            if (I != null)
            {
                I.a();
            }
            if (getScrollX() != 0)
            {
                a.a(0);
                K();
                invalidate();
            }
        }
        if (i1 == 1)
        {
            M = am;
        }
_L4:
        aD = i1;
        return;
_L2:
        if (i1 != aD && aD != -1)
        {
            if (i1 == 1)
            {
                p();
            } else
            {
                m();
                h = 0;
                e();
            }
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    boolean p()
    {
        int i1;
        int j1;
        int k1;
        int l2;
        int i3;
        boolean flag1;
        flag1 = true;
        i3 = getChildCount();
        if (i3 <= 0)
        {
            return false;
        }
        i1 = u.left;
        j1 = getRight() - getLeft() - u.right;
        l2 = V;
        k1 = M;
        if (k1 < l2 || k1 >= l2 + i3) goto _L2; else goto _L1
_L1:
        boolean flag;
        View view = getChildAt(k1 - V);
        int l1 = view.getLeft();
        int j2 = view.getRight();
        if (l1 < i1)
        {
            i1 = getHorizontalFadingEdgeLength() + i1;
        } else
        {
            i1 = l1;
            if (j2 > j1)
            {
                i1 = j1 - view.getMeasuredWidth() - getHorizontalFadingEdgeLength();
            }
        }
        flag = true;
        j1 = k1;
_L7:
        M = -1;
        removeCallbacks(ax);
        if (I != null)
        {
            I.a();
        }
        F = -1;
        J();
        W = i1;
        i1 = b(j1, flag);
        View view1;
        int i2;
        int j3;
        int k3;
        if (i1 >= l2 && i1 <= getLastVisiblePosition())
        {
            h = 4;
            j();
            setSelectionInt(i1);
            b();
        } else
        {
            i1 = -1;
        }
        b(0);
        if (i1 >= 0)
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        return flag;
_L2:
        if (k1 >= l2) goto _L4; else goto _L3
_L3:
        i2 = 0;
        j1 = 0;
_L8:
        if (i2 >= i3)
        {
            break MISSING_BLOCK_LABEL_488;
        }
        k1 = getChildAt(i2).getLeft();
        int k2;
        if (i2 == 0)
        {
            if (l2 > 0 || k1 < i1)
            {
                i1 = getHorizontalFadingEdgeLength() + i1;
                j1 = k1;
            } else
            {
                j1 = k1;
            }
        }
        if (k1 < i1) goto _L6; else goto _L5
_L5:
        i1 = l2 + i2;
_L10:
        flag = true;
        j1 = i1;
        i1 = k1;
          goto _L7
_L6:
        i2++;
          goto _L8
_L4:
        j3 = ao;
        i2 = i3 - 1;
        i1 = 0;
_L9:
label0:
        {
            if (i2 < 0)
            {
                break MISSING_BLOCK_LABEL_465;
            }
            view1 = getChildAt(i2);
            k1 = view1.getLeft();
            k3 = view1.getRight();
            if (i2 == i3 - 1)
            {
                if (l2 + i3 < j3 || k3 > j1)
                {
                    i1 = j1 - getHorizontalFadingEdgeLength();
                    j1 = k1;
                } else
                {
                    i1 = j1;
                    j1 = k1;
                }
            } else
            {
                k2 = i1;
                i1 = j1;
                j1 = k2;
            }
            if (k3 > i1)
            {
                break label0;
            }
            i1 = k1;
            j1 = l2 + i2;
            flag = false;
        }
          goto _L7
        i2--;
        k1 = i1;
        i1 = j1;
        j1 = k1;
          goto _L9
        j1 = (l2 + i3) - 1;
        flag = false;
          goto _L7
        i1 = l2;
        k1 = j1;
          goto _L10
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
            if (isEnabled() && getLastVisiblePosition() < getCount() - 1)
            {
                c(getWidth() - u.left - u.right, 200);
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
            c(-(getWidth() - u.left - u.right), 200);
            return true;
        } else
        {
            return false;
        }
    }

    void q()
    {
        int i1;
        int j1;
        f.clear();
        i1 = 0;
        j1 = 0;
_L7:
        if (i1 >= g.size()) goto _L2; else goto _L1
_L1:
        int i2;
        long l2;
        l2 = g.keyAt(i1);
        i2 = ((Integer)g.valueAt(i1)).intValue();
        if (l2 == j.getItemId(i2)) goto _L4; else goto _L3
_L3:
        int k1;
        int l1;
        k1 = Math.max(0, i2 - 20);
        l1 = Math.min(i2 + 20, ao);
_L8:
        if (k1 >= l1)
        {
            break MISSING_BLOCK_LABEL_282;
        }
        if (l2 != j.getItemId(k1)) goto _L6; else goto _L5
_L5:
        boolean flag;
        f.put(k1, Boolean.valueOf(true));
        g.setValueAt(i1, Integer.valueOf(k1));
        flag = true;
_L10:
        k1 = i1;
        if (!flag)
        {
            g.delete(l2);
            e = e - 1;
            if (android.os.Build.VERSION.SDK_INT > 11 && c != null && d != null)
            {
                ((it.sephiroth.android.library.c.a.b)d).a((ActionMode)c, i2, l2, false);
            }
            k1 = i1 - 1;
            j1 = 1;
        }
        i1 = j1;
_L9:
        j1 = i1;
        i1 = k1 + 1;
          goto _L7
_L6:
        k1++;
          goto _L8
_L4:
        f.put(i2, Boolean.valueOf(true));
        k1 = i1;
        i1 = j1;
          goto _L9
_L2:
        if (j1 != 0 && c != null && android.os.Build.VERSION.SDK_INT > 11)
        {
            ((ActionMode)c).invalidate();
        }
        return;
        flag = false;
          goto _L10
    }

    protected void r()
    {
        int l2;
        int i3;
        l2 = ao;
        i3 = bj;
        bj = ao;
        if (b != 0 && j != null && j.hasStableIds())
        {
            q();
        }
        p.c();
        if (l2 <= 0) goto _L2; else goto _L1
_L1:
        if (!ad) goto _L4; else goto _L3
_L3:
        ad = false;
        bk = null;
        if (aL != 2) goto _L6; else goto _L5
_L5:
        h = 3;
_L10:
        return;
_L6:
        if (aL == 1)
        {
            if (be)
            {
                be = false;
                h = 3;
                return;
            }
            int j3 = getChildCount();
            int j2 = getWidth() - getPaddingRight();
            View view = getChildAt(j3 - 1);
            int i1;
            if (view != null)
            {
                i1 = view.getBottom();
            } else
            {
                i1 = j2;
            }
            if (j3 + V >= i3 && i1 <= j2)
            {
                h = 3;
                return;
            }
            awakenScrollBars();
        }
        ae;
        JVM INSTR tableswitch 0 1: default 212
    //                   0 262
    //                   1 350;
           goto _L4 _L7 _L8
_L4:
        int k2;
        if (isInTouchMode())
        {
            continue; /* Loop/switch isn't completed */
        }
        k2 = getSelectedItemPosition();
        int j1 = k2;
        if (k2 >= l2)
        {
            j1 = l2 - 1;
        }
        k2 = j1;
        if (j1 < 0)
        {
            k2 = 0;
        }
        j1 = b(k2, true);
        if (j1 >= 0)
        {
            setNextSelectedPositionInt(j1);
            return;
        }
        break; /* Loop/switch isn't completed */
_L7:
        if (isInTouchMode())
        {
            h = 5;
            aa = Math.min(Math.max(0, aa), l2 - 1);
            return;
        }
        int k1 = w();
        if (k1 >= 0 && b(k1, true) == k1)
        {
            aa = k1;
            if (ac == (long)getWidth())
            {
                h = 5;
            } else
            {
                h = 2;
            }
            setNextSelectedPositionInt(k1);
            return;
        }
        if (true) goto _L4; else goto _L9
_L8:
        h = 5;
        aa = Math.min(Math.max(0, aa), l2 - 1);
        return;
_L9:
        int l1 = b(k2, false);
        if (l1 >= 0)
        {
            setNextSelectedPositionInt(l1);
            return;
        }
        break; /* Loop/switch isn't completed */
        if (M >= 0) goto _L10; else goto _L2
_L2:
        int i2;
        if (K)
        {
            i2 = 3;
        } else
        {
            i2 = 1;
        }
        h = i2;
        am = -1;
        an = 0x8000000000000000L;
        ak = -1;
        al = 0x8000000000000000L;
        ad = false;
        bk = null;
        n = -1;
        v();
        return;
    }

    public void requestDisallowInterceptTouchEvent(boolean flag)
    {
        if (flag)
        {
            H();
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
            int j1 = getFirstVisiblePosition();
            int k1 = getLastVisiblePosition();
            if (bh == j1 && bi == k1)
            {
                return;
            }
            bh = j1;
            bi = k1;
        }
        super.sendAccessibilityEvent(i1);
    }

    public volatile void setAdapter(Adapter adapter)
    {
        setAdapter((ListAdapter)adapter);
    }

    public void setAdapter(ListAdapter listadapter)
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

    public void setCacheColorHint(int i1)
    {
        if (i1 != aM)
        {
            aM = i1;
            int k1 = getChildCount();
            for (int j1 = 0; j1 < k1; j1++)
            {
                getChildAt(j1).setDrawingCacheBackgroundColor(i1);
            }

            p.f(i1);
        }
    }

    public void setChoiceMode(int i1)
    {
        b = i1;
        if (a.b && c != null)
        {
            ((ActionMode)c).finish();
            c = null;
        }
        if (b != 0)
        {
            if (f == null)
            {
                f = new SparseArrayCompat(0);
            }
            if (g == null && j != null && j.hasStableIds())
            {
                g = new LongSparseArray(0);
            }
            if (a.b && b == 3)
            {
                a();
                setLongClickable(true);
            }
        }
    }

    public void setDrawSelectorOnTop(boolean flag)
    {
        l = flag;
    }

    public void setFriction(float f1)
    {
        if (ax == null)
        {
            ax = new FlingRunnable();
        }
        it.sephiroth.android.library.widget.FlingRunnable.a(ax).b(f1);
    }

    public void setMultiChoiceModeListener(it.sephiroth.android.library.c.a.a a1)
    {
        if (a.b)
        {
            if (d == null)
            {
                d = new it.sephiroth.android.library.c.a.b(this);
            }
            ((it.sephiroth.android.library.c.a.b)d).a(a1);
            return;
        } else
        {
            Log.e("AbsListView", "setMultiChoiceModeListener not supported for this version of Android");
            return;
        }
    }

    public void setOnScrollListener(d d1)
    {
        ay = d1;
        b();
    }

    public void setOverScrollMode(int i1)
    {
        if (i1 != 2)
        {
            if (aZ == null)
            {
                Context context = getContext();
                aZ = new EdgeEffectCompat(context);
                ba = new EdgeEffectCompat(context);
            }
        } else
        {
            aZ = null;
            ba = null;
        }
        super.setOverScrollMode(i1);
    }

    public void setRecyclerListener(f f1)
    {
        it.sephiroth.android.library.widget.e.a(p, f1);
    }

    public void setScrollingCacheEnabled(boolean flag)
    {
        if (L && !flag)
        {
            J();
        }
        L = flag;
    }

    public abstract void setSelectionInt(int i1);

    public void setSelector(int i1)
    {
        if (a.f)
        {
            setSelector(getContext().getDrawable(i1));
            return;
        } else
        {
            setSelector(getResources().getDrawable(i1));
            return;
        }
    }

    public void setSelector(Drawable drawable)
    {
        Log.i("AbsListView", (new StringBuilder()).append("setSelector: ").append(drawable).toString());
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
        j();
    }

    public void setSmoothScrollbarEnabled(boolean flag)
    {
        az = flag;
    }

    public void setStackFromRight(boolean flag)
    {
        if (K != flag)
        {
            K = flag;
            c();
        }
    }

    public void setTextFilterEnabled(boolean flag)
    {
        aA = flag;
    }

    public void setTranscriptMode(int i1)
    {
        aL = i1;
    }

    public void setVelocityScale(float f1)
    {
        aU = f1;
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
                flag1 = ai.a(this, view, i1, l1);
            }
            flag = flag1;
            if (!flag1)
            {
                aC = b(getChildAt(i1 - V), i1, l1);
                flag = super.showContextMenuForChild(view);
            }
        }
        return flag;
    }

    public boolean verifyDrawable(Drawable drawable)
    {
        return m == drawable || super.verifyDrawable(drawable);
    }


    // Unreferenced inner class it/sephiroth/android/library/widget/AbsHListView$CheckForLongPress
    /* block-local class not found */
    class CheckForLongPress {}


    // Unreferenced inner class it/sephiroth/android/library/widget/AbsHListView$f
    /* block-local class not found */
    class f {}


    // Unreferenced inner class it/sephiroth/android/library/widget/AbsHListView$h
    /* block-local class not found */
    class h {}


    /* member class not found */
    class _cls2 {}


    /* member class not found */
    class _cls1 {}

}
