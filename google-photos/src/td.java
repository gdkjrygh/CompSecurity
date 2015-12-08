// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.media.AudioManager;
import android.os.Bundle;
import android.support.v7.internal.widget.ActionBarContextView;
import android.support.v7.internal.widget.ContentFrameLayout;
import android.support.v7.internal.widget.ViewStubCompat;
import android.support.v7.widget.AppCompatButton;
import android.support.v7.widget.Toolbar;
import android.text.TextUtils;
import android.util.AndroidRuntimeException;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import android.widget.TextView;

class td extends sv
    implements li, vv
{

    private ViewGroup A;
    private TextView B;
    private View C;
    private boolean D;
    private boolean E;
    private boolean F;
    private to G[];
    private to H;
    private final Runnable I = new te(this);
    private boolean J;
    private Rect K;
    private Rect L;
    private ul M;
    private xo o;
    aav p;
    ActionBarContextView q;
    PopupWindow r;
    Runnable s;
    ob t;
    boolean u;
    int v;
    private tk w;
    private tp x;
    private boolean y;
    private ViewGroup z;

    td(Context context, Window window, st st1)
    {
        super(context, window, st1);
        t = null;
    }

    static void a(td td1, int k)
    {
        to to1 = td1.e(k);
        if (to1.h != null)
        {
            Bundle bundle = new Bundle();
            to1.h.a(bundle);
            if (bundle.size() > 0)
            {
                to1.q = bundle;
            }
            to1.h.d();
            to1.h.clear();
        }
        to1.p = true;
        to1.o = true;
        if ((k == 108 || k == 0) && td1.o != null)
        {
            to to2 = td1.e(0);
            if (to2 != null)
            {
                to2.k = false;
                td1.b(to2, ((KeyEvent) (null)));
            }
        }
    }

    private void a(to to1, KeyEvent keyevent)
    {
        byte byte0 = -1;
        if (!to1.m && !super.n) goto _L2; else goto _L1
_L1:
        return;
_L2:
        if (to1.a != 0)
        {
            break; /* Loop/switch isn't completed */
        }
        Object obj = a;
        boolean flag;
        boolean flag1;
        if ((((Context) (obj)).getResources().getConfiguration().screenLayout & 0xf) == 4)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (((Context) (obj)).getApplicationInfo().targetSdkVersion >= 11)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        if (flag && flag1) goto _L1; else goto _L3
_L3:
        WindowManager windowmanager;
        obj = super.b.getCallback();
        if (obj != null && !((android.view.Window.Callback) (obj)).onMenuOpened(to1.a, to1.h))
        {
            a(to1, true);
            return;
        }
        windowmanager = (WindowManager)a.getSystemService("window");
        if (windowmanager == null || !b(to1, keyevent)) goto _L1; else goto _L4
_L4:
        if (to1.e != null && !to1.o) goto _L6; else goto _L5
_L5:
        if (to1.e != null) goto _L8; else goto _L7
_L7:
        int k;
        Object obj1 = k();
        TypedValue typedvalue = new TypedValue();
        keyevent = ((Context) (obj1)).getResources().newTheme();
        keyevent.setTo(((Context) (obj1)).getTheme());
        keyevent.resolveAttribute(b.g, typedvalue, true);
        if (typedvalue.resourceId != 0)
        {
            keyevent.applyStyle(typedvalue.resourceId, true);
        }
        keyevent.resolveAttribute(b.M, typedvalue, true);
        if (typedvalue.resourceId != 0)
        {
            keyevent.applyStyle(typedvalue.resourceId, true);
        } else
        {
            keyevent.applyStyle(b.bN, true);
        }
        obj1 = new vc(((Context) (obj1)), 0);
        ((Context) (obj1)).getTheme().setTo(keyevent);
        to1.j = ((Context) (obj1));
        keyevent = ((Context) (obj1)).obtainStyledAttributes(uh.bs);
        to1.b = keyevent.getResourceId(uh.bv, 0);
        to1.d = keyevent.getResourceId(uh.bt, 0);
        keyevent.recycle();
        to1.e = new tn(this, to1.j);
        to1.c = 81;
        if (to1.e == null) goto _L1; else goto _L9
_L9:
        if (to1.g != null)
        {
            to1.f = to1.g;
            k = 1;
        } else
        {
label0:
            {
                if (to1.h == null)
                {
                    break label0;
                }
                if (x == null)
                {
                    x = new tp(this);
                }
                keyevent = x;
                if (to1.h == null)
                {
                    keyevent = null;
                } else
                {
                    if (to1.i == null)
                    {
                        to1.i = new vs(to1.j, b.bB);
                        to1.i.d = keyevent;
                        to1.h.a(to1.i);
                    }
                    keyevent = to1.i.a(to1.e);
                }
                to1.f = (View)keyevent;
                if (to1.f == null)
                {
                    break label0;
                }
                k = 1;
            }
        }
_L16:
        if (k == 0) goto _L1; else goto _L10
_L10:
        if (to1.f == null) goto _L12; else goto _L11
_L11:
        if (to1.g == null) goto _L14; else goto _L13
_L13:
        k = 1;
_L18:
        if (k == 0) goto _L1; else goto _L15
_L15:
        keyevent = to1.f.getLayoutParams();
        if (keyevent == null)
        {
            keyevent = new android.view.ViewGroup.LayoutParams(-2, -2);
        }
        k = to1.b;
        to1.e.setBackgroundResource(k);
        obj1 = to1.f.getParent();
        if (obj1 != null && (obj1 instanceof ViewGroup))
        {
            ((ViewGroup)obj1).removeView(to1.f);
        }
        to1.e.addView(to1.f, keyevent);
        if (!to1.f.hasFocus())
        {
            to1.f.requestFocus();
        }
        k = -2;
_L22:
        to1.l = false;
        keyevent = new android.view.WindowManager.LayoutParams(k, -2, 0, 0, 1002, 0x820000, -3);
        keyevent.gravity = to1.c;
        keyevent.windowAnimations = to1.d;
        windowmanager.addView(to1.e, keyevent);
        to1.m = true;
        return;
_L8:
        if (to1.o && to1.e.getChildCount() > 0)
        {
            to1.e.removeAllViews();
        }
          goto _L9
        k = 0;
          goto _L16
_L14:
        if (to1.i.b().getCount() <= 0) goto _L12; else goto _L17
_L17:
        k = 1;
          goto _L18
_L12:
        k = 0;
          goto _L18
_L6:
        if (to1.g == null) goto _L20; else goto _L19
_L19:
        keyevent = to1.g.getLayoutParams();
        if (keyevent == null) goto _L20; else goto _L21
_L21:
        k = byte0;
        if (((android.view.ViewGroup.LayoutParams) (keyevent)).width == -1) goto _L22; else goto _L20
_L20:
        k = -2;
          goto _L22
    }

    private boolean a(to to1, int k, KeyEvent keyevent, int i1)
    {
        while (keyevent.isSystem() || !to1.k && !b(to1, keyevent) || to1.h == null) 
        {
            return false;
        }
        return to1.h.performShortcut(k, keyevent, 1);
    }

    static int b(td td1, int k)
    {
        int j1 = 1;
        boolean flag = true;
        boolean flag1 = false;
        int i1;
        if (td1.q != null && (td1.q.getLayoutParams() instanceof android.view.ViewGroup.MarginLayoutParams))
        {
            android.view.ViewGroup.MarginLayoutParams marginlayoutparams = (android.view.ViewGroup.MarginLayoutParams)td1.q.getLayoutParams();
            if (td1.q.isShown())
            {
                if (td1.K == null)
                {
                    td1.K = new Rect();
                    td1.L = new Rect();
                }
                Rect rect = td1.K;
                Rect rect1 = td1.L;
                rect.set(0, k, 0, 0);
                yo.a(td1.A, rect, rect1);
                if (rect1.top == 0)
                {
                    i1 = k;
                } else
                {
                    i1 = 0;
                }
                if (marginlayoutparams.topMargin != i1)
                {
                    marginlayoutparams.topMargin = k;
                    if (td1.C == null)
                    {
                        td1.C = new View(td1.a);
                        td1.C.setBackgroundColor(td1.a.getResources().getColor(b.Z));
                        td1.A.addView(td1.C, -1, new android.view.ViewGroup.LayoutParams(-1, k));
                        i1 = 1;
                    } else
                    {
                        android.view.ViewGroup.LayoutParams layoutparams = td1.C.getLayoutParams();
                        if (layoutparams.height != k)
                        {
                            layoutparams.height = k;
                            td1.C.setLayoutParams(layoutparams);
                        }
                        i1 = 1;
                    }
                } else
                {
                    i1 = 0;
                }
                if (td1.C == null)
                {
                    flag = false;
                }
                j1 = k;
                if (!td1.j)
                {
                    j1 = k;
                    if (flag)
                    {
                        j1 = 0;
                    }
                }
                k = j1;
                j1 = i1;
                i1 = ((flag) ? 1 : 0);
            } else
            if (marginlayoutparams.topMargin != 0)
            {
                marginlayoutparams.topMargin = 0;
                i1 = 0;
            } else
            {
                j1 = 0;
                i1 = 0;
            }
            if (j1 != 0)
            {
                td1.q.setLayoutParams(marginlayoutparams);
            }
        } else
        {
            i1 = 0;
        }
        if (td1.C != null)
        {
            td1 = td1.C;
            if (i1 != 0)
            {
                i1 = ((flag1) ? 1 : 0);
            } else
            {
                i1 = 8;
            }
            td1.setVisibility(i1);
        }
        return k;
    }

    private boolean b(to to1, KeyEvent keyevent)
    {
        if (!super.n) goto _L2; else goto _L1
_L1:
        return false;
_L2:
        Object obj;
        Context context;
        android.view.Window.Callback callback;
        int k;
        if (to1.k)
        {
            return true;
        }
        if (H != null && H != to1)
        {
            a(H, false);
        }
        callback = super.b.getCallback();
        if (callback != null)
        {
            to1.g = callback.onCreatePanelView(to1.a);
        }
        android.content.res.Resources.Theme theme;
        if (to1.a == 0 || to1.a == 108)
        {
            k = 1;
        } else
        {
            k = 0;
        }
        if (k && o != null)
        {
            o.h();
        }
        if (to1.g != null || k && (super.f instanceof un)) goto _L4; else goto _L3
_L3:
        if (to1.h != null && !to1.p) goto _L6; else goto _L5
_L5:
        if (to1.h != null)
        {
            break; /* Loop/switch isn't completed */
        }
        context = a;
        if (to1.a != 0 && to1.a != 108 || o == null)
        {
            break MISSING_BLOCK_LABEL_648;
        }
        TypedValue typedvalue = new TypedValue();
        android.content.res.Resources.Theme theme1 = context.getTheme();
        theme1.resolveAttribute(b.m, typedvalue, true);
        if (typedvalue.resourceId != 0)
        {
            obj = context.getResources().newTheme();
            ((android.content.res.Resources.Theme) (obj)).setTo(theme1);
            ((android.content.res.Resources.Theme) (obj)).applyStyle(typedvalue.resourceId, true);
            ((android.content.res.Resources.Theme) (obj)).resolveAttribute(b.n, typedvalue, true);
        } else
        {
            theme1.resolveAttribute(b.n, typedvalue, true);
            obj = null;
        }
        theme = ((android.content.res.Resources.Theme) (obj));
        if (typedvalue.resourceId != 0)
        {
            theme = ((android.content.res.Resources.Theme) (obj));
            if (obj == null)
            {
                theme = context.getResources().newTheme();
                theme.setTo(theme1);
            }
            theme.applyStyle(typedvalue.resourceId, true);
        }
        if (theme == null)
        {
            break MISSING_BLOCK_LABEL_648;
        }
        obj = new vc(context, 0);
        ((Context) (obj)).getTheme().setTo(theme);
_L8:
        obj = new vu(((Context) (obj)));
        ((vu) (obj)).a(this);
        to1.a(((vu) (obj)));
        if (to1.h == null) goto _L1; else goto _L7
_L7:
label0:
        {
            if (k && o != null)
            {
                if (w == null)
                {
                    w = new tk(this);
                }
                o.a(to1.h, w);
            }
            to1.h.d();
            if (callback.onCreatePanelMenu(to1.a, to1.h))
            {
                break label0;
            }
            to1.a(null);
            if (k && o != null)
            {
                o.a(null, w);
                return false;
            }
        }
          goto _L1
        to1.p = false;
_L6:
        to1.h.d();
        if (to1.q != null)
        {
            to1.h.b(to1.q);
            to1.q = null;
        }
        if (!callback.onPreparePanel(0, to1.g, to1.h))
        {
            if (k && o != null)
            {
                o.a(null, w);
            }
            to1.h.e();
            return false;
        }
        boolean flag;
        if (keyevent != null)
        {
            k = keyevent.getDeviceId();
        } else
        {
            k = -1;
        }
        if (KeyCharacterMap.load(k).getKeyboardType() != 1)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        to1.n = flag;
        to1.h.setQwertyMode(to1.n);
        to1.h.e();
_L4:
        to1.k = true;
        to1.l = false;
        H = to1;
        return true;
        obj = context;
          goto _L8
    }

    private void f(int k)
    {
        v = v | 1 << k;
        if (!u && z != null)
        {
            mk.a(z, I);
            u = true;
        }
    }

    private void m()
    {
        Object obj;
        if (y)
        {
            break MISSING_BLOCK_LABEL_920;
        }
        obj = LayoutInflater.from(a);
        if (l) goto _L2; else goto _L1
_L1:
        if (!this.k) goto _L4; else goto _L3
_L3:
        A = (ViewGroup)((LayoutInflater) (obj)).inflate(b.bx, null);
        i = false;
        h = false;
_L6:
        if (A == null)
        {
            throw new IllegalArgumentException((new StringBuilder("AppCompat does not support the current theme features: { windowActionBar: ")).append(h).append(", windowActionBarOverlay: ").append(i).append(", android:windowIsFloating: ").append(this.k).append(", windowActionModeOverlay: ").append(j).append(", windowNoTitle: ").append(l).append(" }").toString());
        }
        break; /* Loop/switch isn't completed */
_L4:
        if (h)
        {
            obj = new TypedValue();
            a.getTheme().resolveAttribute(b.m, ((TypedValue) (obj)), true);
            if (((TypedValue) (obj)).resourceId != 0)
            {
                obj = new vc(a, ((TypedValue) (obj)).resourceId);
            } else
            {
                obj = a;
            }
            A = (ViewGroup)LayoutInflater.from(((Context) (obj))).inflate(b.bG, null);
            o = (xo)A.findViewById(b.bd);
            o.a(super.b.getCallback());
            if (i)
            {
                o.a(109);
            }
            if (D)
            {
                o.a(2);
            }
            if (E)
            {
                o.a(5);
            }
        }
        continue; /* Loop/switch isn't completed */
_L2:
        if (j)
        {
            A = (ViewGroup)((LayoutInflater) (obj)).inflate(b.bF, null);
        } else
        {
            A = (ViewGroup)((LayoutInflater) (obj)).inflate(b.bE, null);
        }
        if (android.os.Build.VERSION.SDK_INT >= 21)
        {
            mk.a(A, new tf(this));
        } else
        {
            ((xr)A).a(new tg(this));
        }
        if (true) goto _L6; else goto _L5
_L5:
        if (o == null)
        {
            B = (TextView)A.findViewById(b.bn);
        }
        yo.b(A);
        Object obj1 = (ViewGroup)b.findViewById(0x1020002);
        ContentFrameLayout contentframelayout = (ContentFrameLayout)A.findViewById(b.aQ);
        View view;
        for (; ((ViewGroup) (obj1)).getChildCount() > 0; contentframelayout.addView(view))
        {
            view = ((ViewGroup) (obj1)).getChildAt(0);
            ((ViewGroup) (obj1)).removeViewAt(0);
        }

        b.setContentView(A);
        ((ViewGroup) (obj1)).setId(-1);
        contentframelayout.setId(0x1020002);
        if (obj1 instanceof FrameLayout)
        {
            ((FrameLayout)obj1).setForeground(null);
        }
        int k;
        int i2;
        int j2;
        int k2;
        if (super.c instanceof Activity)
        {
            obj1 = ((Activity)super.c).getTitle();
        } else
        {
            obj1 = super.m;
        }
        if (!TextUtils.isEmpty(((CharSequence) (obj1))))
        {
            b(((CharSequence) (obj1)));
        }
        k = z.getPaddingLeft();
        i2 = z.getPaddingTop();
        j2 = z.getPaddingRight();
        k2 = z.getPaddingBottom();
        contentframelayout.g.set(k, i2, j2, k2);
        if (mk.z(contentframelayout))
        {
            contentframelayout.requestLayout();
        }
        obj1 = a.obtainStyledAttributes(uh.bs);
        k = uh.bD;
        if (contentframelayout.a == null)
        {
            contentframelayout.a = new TypedValue();
        }
        ((TypedArray) (obj1)).getValue(k, contentframelayout.a);
        k = uh.bE;
        if (contentframelayout.b == null)
        {
            contentframelayout.b = new TypedValue();
        }
        ((TypedArray) (obj1)).getValue(k, contentframelayout.b);
        if (((TypedArray) (obj1)).hasValue(uh.bB))
        {
            int i1 = uh.bB;
            if (contentframelayout.c == null)
            {
                contentframelayout.c = new TypedValue();
            }
            ((TypedArray) (obj1)).getValue(i1, contentframelayout.c);
        }
        if (((TypedArray) (obj1)).hasValue(uh.bC))
        {
            int j1 = uh.bC;
            if (contentframelayout.d == null)
            {
                contentframelayout.d = new TypedValue();
            }
            ((TypedArray) (obj1)).getValue(j1, contentframelayout.d);
        }
        if (((TypedArray) (obj1)).hasValue(uh.bz))
        {
            int k1 = uh.bz;
            if (contentframelayout.e == null)
            {
                contentframelayout.e = new TypedValue();
            }
            ((TypedArray) (obj1)).getValue(k1, contentframelayout.e);
        }
        if (((TypedArray) (obj1)).hasValue(uh.bA))
        {
            int l1 = uh.bA;
            if (contentframelayout.f == null)
            {
                contentframelayout.f = new TypedValue();
            }
            ((TypedArray) (obj1)).getValue(l1, contentframelayout.f);
        }
        ((TypedArray) (obj1)).recycle();
        contentframelayout.requestLayout();
        y = true;
        obj1 = e(0);
        if (!super.n && (obj1 == null || ((to) (obj1)).h == null))
        {
            f(108);
        }
    }

    private void n()
    {
        if (y)
        {
            throw new AndroidRuntimeException("Window feature must be requested before adding content");
        } else
        {
            return;
        }
    }

    public final aav a(aaw aaw1)
    {
        if (aaw1 == null)
        {
            throw new IllegalArgumentException("ActionMode callback can not be null.");
        }
        if (p != null)
        {
            p.c();
        }
        tl tl1 = new tl(this, aaw1);
        aaw1 = a();
        if (aaw1 != null)
        {
            p = aaw1.a(tl1);
            if (p != null && e != null)
            {
                e.a(p);
            }
        }
        if (p == null)
        {
            l();
            if (p != null)
            {
                p.c();
            }
            tl tl2 = new tl(this, tl1);
            if (q == null)
            {
                if (this.k)
                {
                    Object obj = new TypedValue();
                    aaw1 = a.getTheme();
                    aaw1.resolveAttribute(b.m, ((TypedValue) (obj)), true);
                    int k;
                    if (((TypedValue) (obj)).resourceId != 0)
                    {
                        android.content.res.Resources.Theme theme = a.getResources().newTheme();
                        theme.setTo(aaw1);
                        theme.applyStyle(((TypedValue) (obj)).resourceId, true);
                        aaw1 = new vc(a, 0);
                        aaw1.getTheme().setTo(theme);
                    } else
                    {
                        aaw1 = a;
                    }
                    q = new ActionBarContextView(aaw1);
                    r = new PopupWindow(aaw1, null, b.p);
                    re.a(r, 2);
                    r.setContentView(q);
                    r.setWidth(-1);
                    aaw1.getTheme().resolveAttribute(b.h, ((TypedValue) (obj)), true);
                    k = TypedValue.complexToDimensionPixelSize(((TypedValue) (obj)).data, aaw1.getResources().getDisplayMetrics());
                    q.d = k;
                    r.setHeight(-2);
                    s = new th(this);
                } else
                {
                    aaw1 = (ViewStubCompat)A.findViewById(b.aV);
                    if (aaw1 != null)
                    {
                        aaw1.a = LayoutInflater.from(k());
                        q = (ActionBarContextView)aaw1.a();
                    }
                }
            }
            if (q != null)
            {
                l();
                q.b();
                aaw1 = q.getContext();
                obj = q;
                boolean flag;
                if (r == null)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                aaw1 = new vd(aaw1, ((ActionBarContextView) (obj)), tl2, flag);
                if (tl1.a(aaw1, aaw1.b()))
                {
                    aaw1.d();
                    q.a(aaw1);
                    p = aaw1;
                    mk.c(q, 0.0F);
                    t = mk.r(q).a(1.0F);
                    t.a(new tj(this));
                    if (r != null)
                    {
                        b.getDecorView().post(s);
                    }
                } else
                {
                    p = null;
                }
            }
            if (p != null && e != null)
            {
                e.a(p);
            }
            p = p;
        }
        return p;
    }

    public final View a(View view, String s1, Context context, AttributeSet attributeset)
    {
        Object obj;
        byte byte0;
        boolean flag;
        flag = false;
        obj = a(s1, context, attributeset);
        if (obj != null)
        {
            return ((View) (obj));
        }
        boolean flag1;
        if (android.os.Build.VERSION.SDK_INT < 21)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        if (M == null)
        {
            M = new ul();
        }
        if (!flag1 || !y) goto _L2; else goto _L1
_L1:
        obj = (ViewParent)view;
        if (obj != null) goto _L4; else goto _L3
_L3:
        byte0 = 0;
_L17:
        if (byte0 == 0) goto _L2; else goto _L5
_L5:
        byte0 = 1;
_L20:
        obj = M;
        if (byte0 != 0 && view != null)
        {
            view = view.getContext();
        } else
        {
            view = context;
        }
        view = ul.a(view, attributeset, flag1, true);
        s1.hashCode();
        JVM INSTR lookupswitch 10: default 208
    //                   -1946472170: 463
    //                   -1455429095: 414
    //                   -1346021293: 446
    //                   -938935918: 497
    //                   -339785223: 366
    //                   776382189: 398
    //                   1413872058: 430
    //                   1601505219: 382
    //                   1666676343: 349
    //                   2001146706: 480;
           goto _L6 _L7 _L8 _L9 _L10 _L11 _L12 _L13 _L14 _L15 _L16
_L6:
        byte0 = -1;
_L22:
        switch (byte0)
        {
        default:
            if (context != view)
            {
                return ((ul) (obj)).a(view, s1, attributeset);
            } else
            {
                return null;
            }

        case 0: // '\0'
            return new abt(view, attributeset);

        case 1: // '\001'
            return new abx(view, attributeset);

        case 2: // '\002'
            return new abq(view, attributeset);

        case 3: // '\003'
            return new abv(view, attributeset);

        case 4: // '\004'
            return new abr(view, attributeset);

        case 5: // '\005'
            return new abo(view, attributeset);

        case 6: // '\006'
            return new abu(view, attributeset);

        case 7: // '\007'
            return new abw(view, attributeset);

        case 8: // '\b'
            return new AppCompatButton(view, attributeset);

        case 9: // '\t'
            return new acf(view, attributeset);
        }
_L19:
        obj = ((ViewParent) (obj)).getParent();
_L4:
        if (obj != null)
        {
            continue; /* Loop/switch isn't completed */
        }
        byte0 = 1;
          goto _L17
        if (obj != z && (obj instanceof View) && !mk.A((View)obj)) goto _L19; else goto _L18
_L18:
        byte0 = 0;
          goto _L17
_L2:
        byte0 = 0;
          goto _L20
_L15:
        if (!s1.equals("EditText")) goto _L6; else goto _L21
_L21:
        byte0 = flag;
          goto _L22
_L11:
        if (!s1.equals("Spinner")) goto _L6; else goto _L23
_L23:
        byte0 = 1;
          goto _L22
_L14:
        if (!s1.equals("CheckBox")) goto _L6; else goto _L24
_L24:
        byte0 = 2;
          goto _L22
_L12:
        if (!s1.equals("RadioButton")) goto _L6; else goto _L25
_L25:
        byte0 = 3;
          goto _L22
_L8:
        if (!s1.equals("CheckedTextView")) goto _L6; else goto _L26
_L26:
        byte0 = 4;
          goto _L22
_L13:
        if (!s1.equals("AutoCompleteTextView")) goto _L6; else goto _L27
_L27:
        byte0 = 5;
          goto _L22
_L9:
        if (!s1.equals("MultiAutoCompleteTextView")) goto _L6; else goto _L28
_L28:
        byte0 = 6;
          goto _L22
_L7:
        if (!s1.equals("RatingBar")) goto _L6; else goto _L29
_L29:
        byte0 = 7;
          goto _L22
_L16:
        if (!s1.equals("Button")) goto _L6; else goto _L30
_L30:
        byte0 = 8;
          goto _L22
_L10:
        if (!s1.equals("TextView")) goto _L6; else goto _L31
_L31:
        byte0 = 9;
          goto _L22
    }

    View a(String s1, Context context, AttributeSet attributeset)
    {
        if (c instanceof android.view.LayoutInflater.Factory)
        {
            s1 = ((android.view.LayoutInflater.Factory)c).onCreateView(s1, context, attributeset);
            if (s1 != null)
            {
                return s1;
            }
        }
        return null;
    }

    to a(Menu menu)
    {
        to ato[] = G;
        int k;
        int i1;
        if (ato != null)
        {
            k = ato.length;
        } else
        {
            k = 0;
        }
        for (i1 = 0; i1 < k; i1++)
        {
            to to1 = ato[i1];
            if (to1 != null && to1.h == menu)
            {
                return to1;
            }
        }

        return null;
    }

    public final void a(int k)
    {
        m();
        ViewGroup viewgroup = (ViewGroup)A.findViewById(0x1020002);
        viewgroup.removeAllViews();
        LayoutInflater.from(a).inflate(k, viewgroup);
        c.onContentChanged();
    }

    void a(int k, to to1, Menu menu)
    {
        to to3 = to1;
        Object obj = menu;
        if (menu == null)
        {
            to to2 = to1;
            if (to1 == null)
            {
                to2 = to1;
                if (k >= 0)
                {
                    to2 = to1;
                    if (k < G.length)
                    {
                        to2 = G[k];
                    }
                }
            }
            to3 = to2;
            obj = menu;
            if (to2 != null)
            {
                obj = to2.h;
                to3 = to2;
            }
        }
        while (to3 != null && !to3.m || super.n) 
        {
            return;
        }
        c.onPanelClosed(k, ((Menu) (obj)));
    }

    public final void a(Configuration configuration)
    {
        if (h && y)
        {
            rv rv1 = a();
            if (rv1 != null)
            {
                rv1.a(configuration);
            }
        }
    }

    public final void a(Bundle bundle)
    {
label0:
        {
            super.a(bundle);
            z = (ViewGroup)b.getDecorView();
            if ((c instanceof Activity) && cd.c((Activity)c) != null)
            {
                bundle = super.f;
                if (bundle != null)
                {
                    break label0;
                }
                J = true;
            }
            return;
        }
        bundle.e(true);
    }

    public final void a(Toolbar toolbar)
    {
        if (!(c instanceof Activity))
        {
            return;
        }
        if (a() instanceof uu)
        {
            throw new IllegalStateException("This Activity already has an action bar supplied by the window decor. Do not request Window.FEATURE_SUPPORT_ACTION_BAR and set windowActionBar to false in your theme to use a Toolbar instead.");
        } else
        {
            g = null;
            toolbar = new un(toolbar, ((Activity)a).getTitle(), d);
            f = toolbar;
            b.setCallback(((un) (toolbar)).c);
            toolbar.h();
            return;
        }
    }

    public final void a(View view)
    {
        m();
        ViewGroup viewgroup = (ViewGroup)A.findViewById(0x1020002);
        viewgroup.removeAllViews();
        viewgroup.addView(view);
        c.onContentChanged();
    }

    public final void a(View view, android.view.ViewGroup.LayoutParams layoutparams)
    {
        m();
        ViewGroup viewgroup = (ViewGroup)A.findViewById(0x1020002);
        viewgroup.removeAllViews();
        viewgroup.addView(view, layoutparams);
        c.onContentChanged();
    }

    void a(to to1, boolean flag)
    {
        if (flag && to1.a == 0 && o != null && o.d())
        {
            b(to1.h);
        } else
        {
            WindowManager windowmanager = (WindowManager)a.getSystemService("window");
            if (windowmanager != null && to1.m && to1.e != null)
            {
                windowmanager.removeView(to1.e);
                if (flag)
                {
                    a(to1.a, to1, ((Menu) (null)));
                }
            }
            to1.k = false;
            to1.l = false;
            to1.m = false;
            to1.f = null;
            to1.o = true;
            if (H == to1)
            {
                H = null;
                return;
            }
        }
    }

    public final void a(vu vu1)
    {
        if (o == null || !o.c() || mx.b(ViewConfiguration.get(a)) && !o.e())
        {
            break MISSING_BLOCK_LABEL_208;
        }
        vu1 = super.b.getCallback();
        if (o.d()) goto _L2; else goto _L1
_L1:
        if (vu1 != null && !super.n)
        {
            if (u && (v & 1) != 0)
            {
                z.removeCallbacks(I);
                I.run();
            }
            to to1 = e(0);
            if (to1.h != null && !to1.p && vu1.onPreparePanel(0, to1.g, to1.h))
            {
                vu1.onMenuOpened(108, to1.h);
                o.f();
            }
        }
_L4:
        return;
_L2:
        o.g();
        if (super.n) goto _L4; else goto _L3
_L3:
        vu1.onPanelClosed(108, e(0).h);
        return;
        vu1 = e(0);
        vu1.o = true;
        a(((to) (vu1)), false);
        a(((to) (vu1)), ((KeyEvent) (null)));
        return;
    }

    final boolean a(int k, KeyEvent keyevent)
    {
        rv rv1 = a();
        if (rv1 == null || !rv1.a(k, keyevent)) goto _L2; else goto _L1
_L1:
        return true;
_L2:
        if (H == null || !a(H, keyevent.getKeyCode(), keyevent, 1))
        {
            break; /* Loop/switch isn't completed */
        }
        if (H != null)
        {
            H.l = true;
            return true;
        }
        if (true) goto _L1; else goto _L3
_L3:
        boolean flag;
        if (H != null)
        {
            break; /* Loop/switch isn't completed */
        }
        to to1 = e(0);
        b(to1, keyevent);
        flag = a(to1, keyevent.getKeyCode(), keyevent, 1);
        to1.k = false;
        if (flag) goto _L1; else goto _L4
_L4:
        return false;
    }

    final boolean a(KeyEvent keyevent)
    {
        int k;
        if (keyevent.getKeyCode() == 82 && c.dispatchKeyEvent(keyevent))
        {
            return true;
        }
        k = keyevent.getKeyCode();
        boolean flag;
        if (keyevent.getAction() == 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (!flag) goto _L2; else goto _L1
_L1:
        k;
        JVM INSTR tableswitch 82 82: default 64
    //                   82 87;
           goto _L3 _L4
_L3:
        if (android.os.Build.VERSION.SDK_INT < 11)
        {
            a(k, keyevent);
        }
        return false;
_L4:
        if (keyevent.getRepeatCount() == 0)
        {
            to to1 = e(0);
            if (!to1.m)
            {
                b(to1, keyevent);
            }
        }
        if (true) goto _L3; else goto _L2
_L2:
        k;
        JVM INSTR lookupswitch 2: default 144
    //                   4: 363
    //                   82: 146;
           goto _L5 _L6 _L7
_L5:
        return false;
_L7:
        if (p == null) goto _L9; else goto _L8
_L8:
        return true;
_L9:
        to to2 = e(0);
        if (o == null || !o.c() || mx.b(ViewConfiguration.get(a))) goto _L11; else goto _L10
_L10:
        boolean flag2;
        if (!o.d())
        {
            if (super.n || !b(to2, keyevent))
            {
                break MISSING_BLOCK_LABEL_436;
            }
            flag2 = o.f();
        } else
        {
            flag2 = o.g();
        }
_L12:
        if (flag2)
        {
            keyevent = (AudioManager)a.getSystemService("audio");
            if (keyevent != null)
            {
                keyevent.playSoundEffect(0);
            } else
            {
                Log.w("AppCompatDelegate", "Couldn't get audio manager");
            }
        }
        if (true) goto _L8; else goto _L11
_L11:
        if (to2.m || to2.l)
        {
            flag2 = to2.m;
            a(to2, true);
        } else
        {
            if (!to2.k)
            {
                break MISSING_BLOCK_LABEL_436;
            }
            boolean flag1;
            if (to2.p)
            {
                to2.k = false;
                flag2 = b(to2, keyevent);
            } else
            {
                flag2 = true;
            }
            if (!flag2)
            {
                break MISSING_BLOCK_LABEL_436;
            }
            a(to2, keyevent);
            flag2 = true;
        }
          goto _L12
_L6:
        keyevent = e(0);
        if (keyevent != null && ((to) (keyevent)).m)
        {
            a(((to) (keyevent)), true);
            return true;
        }
        if (p != null)
        {
            p.c();
            flag1 = true;
        } else
        {
            keyevent = a();
            if (keyevent != null && keyevent.i())
            {
                flag1 = true;
            } else
            {
                flag1 = false;
            }
        }
        if (flag1)
        {
            return true;
        }
          goto _L5
        flag2 = false;
          goto _L12
    }

    public final boolean a(vu vu1, MenuItem menuitem)
    {
        android.view.Window.Callback callback = super.b.getCallback();
        if (callback != null && !super.n)
        {
            vu1 = a(((Menu) (vu1.k())));
            if (vu1 != null)
            {
                return callback.onMenuItemSelected(((to) (vu1)).a, menuitem);
            }
        }
        return false;
    }

    public final void b(View view, android.view.ViewGroup.LayoutParams layoutparams)
    {
        m();
        ((ViewGroup)A.findViewById(0x1020002)).addView(view, layoutparams);
        c.onContentChanged();
    }

    final void b(CharSequence charsequence)
    {
        if (o != null)
        {
            o.a(charsequence);
        } else
        {
            if (super.f != null)
            {
                super.f.b(charsequence);
                return;
            }
            if (B != null)
            {
                B.setText(charsequence);
                return;
            }
        }
    }

    void b(vu vu1)
    {
        if (F)
        {
            return;
        }
        F = true;
        o.i();
        android.view.Window.Callback callback = super.b.getCallback();
        if (callback != null && !super.n)
        {
            callback.onPanelClosed(108, vu1);
        }
        F = false;
    }

    public final boolean b(int k)
    {
        if (k != 8) goto _L2; else goto _L1
_L1:
        int i1 = 108;
_L4:
        if (l && i1 == 108)
        {
            return false;
        }
        break; /* Loop/switch isn't completed */
_L2:
        i1 = k;
        if (k == 9)
        {
            i1 = 109;
        }
        if (true) goto _L4; else goto _L3
_L3:
        if (h && i1 == 1)
        {
            h = false;
        }
        switch (i1)
        {
        default:
            return b.requestFeature(i1);

        case 108: // 'l'
            n();
            h = true;
            return true;

        case 109: // 'm'
            n();
            i = true;
            return true;

        case 10: // '\n'
            n();
            j = true;
            return true;

        case 2: // '\002'
            n();
            D = true;
            return true;

        case 5: // '\005'
            n();
            E = true;
            return true;

        case 1: // '\001'
            n();
            l = true;
            return true;
        }
    }

    public final void c()
    {
        m();
    }

    final void c(int k)
    {
        if (k == 108)
        {
            rv rv1 = a();
            if (rv1 != null)
            {
                rv1.g(false);
            }
        } else
        if (k == 0)
        {
            to to1 = e(k);
            if (to1.m)
            {
                a(to1, false);
                return;
            }
        }
    }

    public final void d()
    {
        rv rv1 = a();
        if (rv1 != null)
        {
            rv1.f(false);
        }
    }

    final boolean d(int k)
    {
        if (k == 108)
        {
            rv rv1 = a();
            if (rv1 != null)
            {
                rv1.g(true);
            }
            return true;
        } else
        {
            return false;
        }
    }

    to e(int k)
    {
        to ato[];
label0:
        {
            to ato1[] = G;
            if (ato1 != null)
            {
                ato = ato1;
                if (ato1.length > k)
                {
                    break label0;
                }
            }
            ato = new to[k + 1];
            if (ato1 != null)
            {
                System.arraycopy(ato1, 0, ato, 0, ato1.length);
            }
            G = ato;
        }
        to to1 = ato[k];
        if (to1 == null)
        {
            to1 = new to(k);
            ato[k] = to1;
            return to1;
        } else
        {
            return to1;
        }
    }

    public final void e()
    {
        rv rv1 = a();
        if (rv1 != null)
        {
            rv1.f(true);
        }
    }

    public final void f()
    {
        rv rv1 = a();
        if (rv1 != null && rv1.h())
        {
            return;
        } else
        {
            f(0);
            return;
        }
    }

    public final void i()
    {
        LayoutInflater layoutinflater = LayoutInflater.from(a);
        if (layoutinflater.getFactory() == null)
        {
            lc.a(layoutinflater, this);
        }
    }

    public final void j()
    {
        m();
        if (h && f == null)
        {
            if (c instanceof Activity)
            {
                f = new uu((Activity)c, i);
            } else
            if (c instanceof Dialog)
            {
                f = new uu((Dialog)c);
            }
            if (f != null)
            {
                f.e(J);
                return;
            }
        }
    }

    void l()
    {
        if (t != null)
        {
            t.a();
        }
    }
}
