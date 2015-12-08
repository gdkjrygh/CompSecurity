// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.app;

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
import android.support.v4.app.aq;
import android.support.v4.view.ai;
import android.support.v4.view.bt;
import android.support.v4.view.cj;
import android.support.v4.view.dq;
import android.support.v4.view.z;
import android.support.v7.a.b;
import android.support.v7.a.d;
import android.support.v7.a.i;
import android.support.v7.a.k;
import android.support.v7.a.l;
import android.support.v7.internal.a.a;
import android.support.v7.internal.a.e;
import android.support.v7.internal.view.menu.ExpandedMenuView;
import android.support.v7.internal.view.menu.g;
import android.support.v7.internal.view.menu.h;
import android.support.v7.internal.view.menu.j;
import android.support.v7.internal.widget.ActionBarContextView;
import android.support.v7.internal.widget.ContentFrameLayout;
import android.support.v7.internal.widget.aa;
import android.support.v7.internal.widget.at;
import android.support.v7.internal.widget.x;
import android.support.v7.widget.AppCompatAutoCompleteTextView;
import android.support.v7.widget.AppCompatButton;
import android.support.v7.widget.AppCompatCheckBox;
import android.support.v7.widget.AppCompatCheckedTextView;
import android.support.v7.widget.AppCompatEditText;
import android.support.v7.widget.AppCompatMultiAutoCompleteTextView;
import android.support.v7.widget.AppCompatRadioButton;
import android.support.v7.widget.AppCompatRatingBar;
import android.support.v7.widget.AppCompatSpinner;
import android.support.v7.widget.AppCompatTextView;
import android.text.TextUtils;
import android.util.AndroidRuntimeException;
import android.util.AttributeSet;
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

// Referenced classes of package android.support.v7.app:
//            q, x, ah, ad, 
//            y, z, a, o

class AppCompatDelegateImplV7 extends q
    implements ai, j
{

    private ViewGroup A;
    private TextView B;
    private View C;
    private boolean D;
    private boolean E;
    private boolean F;
    private PanelFeatureState G[];
    private PanelFeatureState H;
    private final Runnable I = new android.support.v7.app.x(this);
    private boolean J;
    private Rect K;
    private Rect L;
    private a M;
    private x o;
    android.support.v7.c.a p;
    ActionBarContextView q;
    PopupWindow r;
    Runnable s;
    dq t;
    ViewGroup u;
    boolean v;
    int w;
    private ad x;
    private ah y;
    private boolean z;

    AppCompatDelegateImplV7(Context context, Window window, o o1)
    {
        super(context, window, o1);
        t = null;
    }

    private void a(PanelFeatureState panelfeaturestate, KeyEvent keyevent)
    {
        byte byte0 = -1;
        if (!panelfeaturestate.o && !super.n) goto _L2; else goto _L1
_L1:
        return;
_L2:
        if (panelfeaturestate.a != 0)
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
        if (obj != null && !((android.view.Window.Callback) (obj)).onMenuOpened(panelfeaturestate.a, panelfeaturestate.j))
        {
            a(panelfeaturestate, true);
            return;
        }
        windowmanager = (WindowManager)a.getSystemService("window");
        if (windowmanager == null || !b(panelfeaturestate, keyevent)) goto _L1; else goto _L4
_L4:
        if (panelfeaturestate.g != null && !panelfeaturestate.q) goto _L6; else goto _L5
_L5:
        if (panelfeaturestate.g != null) goto _L8; else goto _L7
_L7:
        int i1;
        Object obj1 = k();
        TypedValue typedvalue = new TypedValue();
        keyevent = ((Context) (obj1)).getResources().newTheme();
        keyevent.setTo(((Context) (obj1)).getTheme());
        keyevent.resolveAttribute(b.actionBarPopupTheme, typedvalue, true);
        if (typedvalue.resourceId != 0)
        {
            keyevent.applyStyle(typedvalue.resourceId, true);
        }
        keyevent.resolveAttribute(b.panelMenuListTheme, typedvalue, true);
        if (typedvalue.resourceId != 0)
        {
            keyevent.applyStyle(typedvalue.resourceId, true);
        } else
        {
            keyevent.applyStyle(k.Theme_AppCompat_CompactMenu, true);
        }
        obj1 = new android.support.v7.internal.view.b(((Context) (obj1)), 0);
        ((Context) (obj1)).getTheme().setTo(keyevent);
        panelfeaturestate.l = ((Context) (obj1));
        keyevent = ((Context) (obj1)).obtainStyledAttributes(l.Theme);
        panelfeaturestate.b = keyevent.getResourceId(l.Theme_panelBackground, 0);
        panelfeaturestate.f = keyevent.getResourceId(l.Theme_android_windowAnimationStyle, 0);
        keyevent.recycle();
        panelfeaturestate.g = new ListMenuDecorView(panelfeaturestate.l);
        panelfeaturestate.c = 81;
        if (panelfeaturestate.g == null) goto _L1; else goto _L9
_L9:
        if (panelfeaturestate.i != null)
        {
            panelfeaturestate.h = panelfeaturestate.i;
            i1 = 1;
        } else
        {
label0:
            {
                if (panelfeaturestate.j == null)
                {
                    break label0;
                }
                if (y == null)
                {
                    y = new ah(this);
                }
                keyevent = y;
                if (panelfeaturestate.j == null)
                {
                    keyevent = null;
                } else
                {
                    if (panelfeaturestate.k == null)
                    {
                        panelfeaturestate.k = new g(panelfeaturestate.l, i.abc_list_menu_item_layout);
                        panelfeaturestate.k.g = keyevent;
                        panelfeaturestate.j.a(panelfeaturestate.k);
                    }
                    keyevent = panelfeaturestate.k;
                    ViewGroup viewgroup = panelfeaturestate.g;
                    if (((g) (keyevent)).d == null)
                    {
                        keyevent.d = (ExpandedMenuView)((g) (keyevent)).b.inflate(i.abc_expanded_menu_layout, viewgroup, false);
                        if (((g) (keyevent)).h == null)
                        {
                            keyevent.h = new h(keyevent);
                        }
                        ((g) (keyevent)).d.setAdapter(((g) (keyevent)).h);
                        ((g) (keyevent)).d.setOnItemClickListener(keyevent);
                    }
                    keyevent = ((g) (keyevent)).d;
                }
                panelfeaturestate.h = (View)keyevent;
                if (panelfeaturestate.h == null)
                {
                    break label0;
                }
                i1 = 1;
            }
        }
_L16:
        if (i1 == 0) goto _L1; else goto _L10
_L10:
        if (panelfeaturestate.h == null) goto _L12; else goto _L11
_L11:
        if (panelfeaturestate.i == null) goto _L14; else goto _L13
_L13:
        i1 = 1;
_L18:
        if (i1 == 0) goto _L1; else goto _L15
_L15:
        keyevent = panelfeaturestate.h.getLayoutParams();
        if (keyevent == null)
        {
            keyevent = new android.view.ViewGroup.LayoutParams(-2, -2);
        }
        i1 = panelfeaturestate.b;
        panelfeaturestate.g.setBackgroundResource(i1);
        obj1 = panelfeaturestate.h.getParent();
        if (obj1 != null && (obj1 instanceof ViewGroup))
        {
            ((ViewGroup)obj1).removeView(panelfeaturestate.h);
        }
        panelfeaturestate.g.addView(panelfeaturestate.h, keyevent);
        if (!panelfeaturestate.h.hasFocus())
        {
            panelfeaturestate.h.requestFocus();
        }
        i1 = -2;
_L22:
        panelfeaturestate.n = false;
        keyevent = new android.view.WindowManager.LayoutParams(i1, -2, panelfeaturestate.d, panelfeaturestate.e, 1002, 0x820000, -3);
        keyevent.gravity = panelfeaturestate.c;
        keyevent.windowAnimations = panelfeaturestate.f;
        windowmanager.addView(panelfeaturestate.g, keyevent);
        panelfeaturestate.o = true;
        return;
_L8:
        if (panelfeaturestate.q && panelfeaturestate.g.getChildCount() > 0)
        {
            panelfeaturestate.g.removeAllViews();
        }
          goto _L9
        i1 = 0;
          goto _L16
_L14:
        if (panelfeaturestate.k.b().getCount() <= 0) goto _L12; else goto _L17
_L17:
        i1 = 1;
          goto _L18
_L12:
        i1 = 0;
          goto _L18
_L6:
        if (panelfeaturestate.i == null) goto _L20; else goto _L19
_L19:
        keyevent = panelfeaturestate.i.getLayoutParams();
        if (keyevent == null) goto _L20; else goto _L21
_L21:
        i1 = byte0;
        if (((android.view.ViewGroup.LayoutParams) (keyevent)).width == -1) goto _L22; else goto _L20
_L20:
        i1 = -2;
          goto _L22
    }

    static void a(AppCompatDelegateImplV7 appcompatdelegateimplv7, int i1)
    {
        PanelFeatureState panelfeaturestate = appcompatdelegateimplv7.e(i1);
        if (panelfeaturestate.j != null)
        {
            Bundle bundle = new Bundle();
            panelfeaturestate.j.a(bundle);
            if (bundle.size() > 0)
            {
                panelfeaturestate.s = bundle;
            }
            panelfeaturestate.j.d();
            panelfeaturestate.j.clear();
        }
        panelfeaturestate.r = true;
        panelfeaturestate.q = true;
        if ((i1 == 108 || i1 == 0) && appcompatdelegateimplv7.o != null)
        {
            PanelFeatureState panelfeaturestate1 = appcompatdelegateimplv7.e(0);
            if (panelfeaturestate1 != null)
            {
                panelfeaturestate1.m = false;
                appcompatdelegateimplv7.b(panelfeaturestate1, ((KeyEvent) (null)));
            }
        }
    }

    private boolean a(PanelFeatureState panelfeaturestate, int i1, KeyEvent keyevent)
    {
        while (keyevent.isSystem() || !panelfeaturestate.m && !b(panelfeaturestate, keyevent) || panelfeaturestate.j == null) 
        {
            return false;
        }
        return panelfeaturestate.j.performShortcut(i1, keyevent, 1);
    }

    static int b(AppCompatDelegateImplV7 appcompatdelegateimplv7, int i1)
    {
        int k1 = 1;
        boolean flag = true;
        boolean flag1 = false;
        int j1;
        if (appcompatdelegateimplv7.q != null && (appcompatdelegateimplv7.q.getLayoutParams() instanceof android.view.ViewGroup.MarginLayoutParams))
        {
            android.view.ViewGroup.MarginLayoutParams marginlayoutparams = (android.view.ViewGroup.MarginLayoutParams)appcompatdelegateimplv7.q.getLayoutParams();
            if (appcompatdelegateimplv7.q.isShown())
            {
                if (appcompatdelegateimplv7.K == null)
                {
                    appcompatdelegateimplv7.K = new Rect();
                    appcompatdelegateimplv7.L = new Rect();
                }
                Rect rect = appcompatdelegateimplv7.K;
                Rect rect1 = appcompatdelegateimplv7.L;
                rect.set(0, i1, 0, 0);
                at.a(appcompatdelegateimplv7.u, rect, rect1);
                if (rect1.top == 0)
                {
                    j1 = i1;
                } else
                {
                    j1 = 0;
                }
                if (marginlayoutparams.topMargin != j1)
                {
                    marginlayoutparams.topMargin = i1;
                    if (appcompatdelegateimplv7.C == null)
                    {
                        appcompatdelegateimplv7.C = new View(appcompatdelegateimplv7.a);
                        appcompatdelegateimplv7.C.setBackgroundColor(appcompatdelegateimplv7.a.getResources().getColor(d.abc_input_method_navigation_guard));
                        appcompatdelegateimplv7.u.addView(appcompatdelegateimplv7.C, -1, new android.view.ViewGroup.LayoutParams(-1, i1));
                        j1 = 1;
                    } else
                    {
                        android.view.ViewGroup.LayoutParams layoutparams = appcompatdelegateimplv7.C.getLayoutParams();
                        if (layoutparams.height != i1)
                        {
                            layoutparams.height = i1;
                            appcompatdelegateimplv7.C.setLayoutParams(layoutparams);
                        }
                        j1 = 1;
                    }
                } else
                {
                    j1 = 0;
                }
                if (appcompatdelegateimplv7.C == null)
                {
                    flag = false;
                }
                k1 = i1;
                if (!appcompatdelegateimplv7.j)
                {
                    k1 = i1;
                    if (flag)
                    {
                        k1 = 0;
                    }
                }
                i1 = k1;
                k1 = j1;
                j1 = ((flag) ? 1 : 0);
            } else
            if (marginlayoutparams.topMargin != 0)
            {
                marginlayoutparams.topMargin = 0;
                j1 = 0;
            } else
            {
                k1 = 0;
                j1 = 0;
            }
            if (k1 != 0)
            {
                appcompatdelegateimplv7.q.setLayoutParams(marginlayoutparams);
            }
        } else
        {
            j1 = 0;
        }
        if (appcompatdelegateimplv7.C != null)
        {
            appcompatdelegateimplv7 = appcompatdelegateimplv7.C;
            if (j1 != 0)
            {
                j1 = ((flag1) ? 1 : 0);
            } else
            {
                j1 = 8;
            }
            appcompatdelegateimplv7.setVisibility(j1);
        }
        return i1;
    }

    private boolean b(PanelFeatureState panelfeaturestate, KeyEvent keyevent)
    {
        if (!super.n) goto _L2; else goto _L1
_L1:
        return false;
_L2:
        Object obj;
        Context context;
        android.view.Window.Callback callback;
        int i1;
        if (panelfeaturestate.m)
        {
            return true;
        }
        if (H != null && H != panelfeaturestate)
        {
            a(H, false);
        }
        callback = super.b.getCallback();
        if (callback != null)
        {
            panelfeaturestate.i = callback.onCreatePanelView(panelfeaturestate.a);
        }
        android.content.res.Resources.Theme theme;
        if (panelfeaturestate.a == 0 || panelfeaturestate.a == 108)
        {
            i1 = 1;
        } else
        {
            i1 = 0;
        }
        if (i1 && o != null)
        {
            o.setMenuPrepared();
        }
        if (panelfeaturestate.i != null || i1 && (super.f instanceof android.support.v7.internal.a.b)) goto _L4; else goto _L3
_L3:
        if (panelfeaturestate.j != null && !panelfeaturestate.r) goto _L6; else goto _L5
_L5:
        if (panelfeaturestate.j != null)
        {
            break; /* Loop/switch isn't completed */
        }
        context = a;
        if (panelfeaturestate.a != 0 && panelfeaturestate.a != 108 || o == null)
        {
            break MISSING_BLOCK_LABEL_648;
        }
        TypedValue typedvalue = new TypedValue();
        android.content.res.Resources.Theme theme1 = context.getTheme();
        theme1.resolveAttribute(b.actionBarTheme, typedvalue, true);
        if (typedvalue.resourceId != 0)
        {
            obj = context.getResources().newTheme();
            ((android.content.res.Resources.Theme) (obj)).setTo(theme1);
            ((android.content.res.Resources.Theme) (obj)).applyStyle(typedvalue.resourceId, true);
            ((android.content.res.Resources.Theme) (obj)).resolveAttribute(b.actionBarWidgetTheme, typedvalue, true);
        } else
        {
            theme1.resolveAttribute(b.actionBarWidgetTheme, typedvalue, true);
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
        obj = new android.support.v7.internal.view.b(context, 0);
        ((Context) (obj)).getTheme().setTo(theme);
_L8:
        obj = new android.support.v7.internal.view.menu.i(((Context) (obj)));
        ((android.support.v7.internal.view.menu.i) (obj)).a(this);
        panelfeaturestate.a(((android.support.v7.internal.view.menu.i) (obj)));
        if (panelfeaturestate.j == null) goto _L1; else goto _L7
_L7:
label0:
        {
            if (i1 && o != null)
            {
                if (x == null)
                {
                    x = new ad(this);
                }
                o.setMenu(panelfeaturestate.j, x);
            }
            panelfeaturestate.j.d();
            if (callback.onCreatePanelMenu(panelfeaturestate.a, panelfeaturestate.j))
            {
                break label0;
            }
            panelfeaturestate.a(null);
            if (i1 && o != null)
            {
                o.setMenu(null, x);
                return false;
            }
        }
          goto _L1
        panelfeaturestate.r = false;
_L6:
        panelfeaturestate.j.d();
        if (panelfeaturestate.s != null)
        {
            panelfeaturestate.j.b(panelfeaturestate.s);
            panelfeaturestate.s = null;
        }
        if (!callback.onPreparePanel(0, panelfeaturestate.i, panelfeaturestate.j))
        {
            if (i1 && o != null)
            {
                o.setMenu(null, x);
            }
            panelfeaturestate.j.e();
            return false;
        }
        boolean flag;
        if (keyevent != null)
        {
            i1 = keyevent.getDeviceId();
        } else
        {
            i1 = -1;
        }
        if (KeyCharacterMap.load(i1).getKeyboardType() != 1)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        panelfeaturestate.p = flag;
        panelfeaturestate.j.setQwertyMode(panelfeaturestate.p);
        panelfeaturestate.j.e();
_L4:
        panelfeaturestate.m = true;
        panelfeaturestate.n = false;
        H = panelfeaturestate;
        return true;
        obj = context;
          goto _L8
    }

    private void f(int i1)
    {
        w = w | 1 << i1;
        if (!v && A != null)
        {
            bt.a(A, I);
            v = true;
        }
    }

    private void m()
    {
        if (!z)
        {
            Object obj = a.obtainStyledAttributes(l.Theme);
            if (!((TypedArray) (obj)).hasValue(l.Theme_windowActionBar))
            {
                ((TypedArray) (obj)).recycle();
                throw new IllegalStateException("You need to use a Theme.AppCompat theme (or descendant) with this activity.");
            }
            if (((TypedArray) (obj)).getBoolean(l.Theme_windowNoTitle, false))
            {
                b(1);
            } else
            if (((TypedArray) (obj)).getBoolean(l.Theme_windowActionBar, false))
            {
                b(108);
            }
            if (((TypedArray) (obj)).getBoolean(l.Theme_windowActionBarOverlay, false))
            {
                b(109);
            }
            if (((TypedArray) (obj)).getBoolean(l.Theme_windowActionModeOverlay, false))
            {
                b(10);
            }
            k = ((TypedArray) (obj)).getBoolean(l.Theme_android_windowIsFloating, false);
            ((TypedArray) (obj)).recycle();
            obj = LayoutInflater.from(a);
            Object obj1;
            ContentFrameLayout contentframelayout;
            if (!l)
            {
                if (k)
                {
                    obj = (ViewGroup)((LayoutInflater) (obj)).inflate(i.abc_dialog_title_material, null);
                    i = false;
                    h = false;
                } else
                if (h)
                {
                    obj = new TypedValue();
                    a.getTheme().resolveAttribute(b.actionBarTheme, ((TypedValue) (obj)), true);
                    if (((TypedValue) (obj)).resourceId != 0)
                    {
                        obj = new android.support.v7.internal.view.b(a, ((TypedValue) (obj)).resourceId);
                    } else
                    {
                        obj = a;
                    }
                    obj = (ViewGroup)LayoutInflater.from(((Context) (obj))).inflate(i.abc_screen_toolbar, null);
                    o = (x)((ViewGroup) (obj)).findViewById(android.support.v7.a.g.decor_content_parent);
                    o.setWindowCallback(super.b.getCallback());
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
                } else
                {
                    obj = null;
                }
            } else
            {
                if (j)
                {
                    obj = (ViewGroup)((LayoutInflater) (obj)).inflate(i.abc_screen_simple_overlay_action_mode, null);
                } else
                {
                    obj = (ViewGroup)((LayoutInflater) (obj)).inflate(i.abc_screen_simple, null);
                }
                if (android.os.Build.VERSION.SDK_INT >= 21)
                {
                    bt.a(((View) (obj)), new y(this));
                } else
                {
                    ((aa)obj).setOnFitSystemWindowsListener(new android.support.v7.app.z(this));
                }
            }
            if (obj == null)
            {
                throw new IllegalArgumentException((new StringBuilder("AppCompat does not support the current theme features: { windowActionBar: ")).append(h).append(", windowActionBarOverlay: ").append(i).append(", android:windowIsFloating: ").append(k).append(", windowActionModeOverlay: ").append(j).append(", windowNoTitle: ").append(l).append(" }").toString());
            }
            if (o == null)
            {
                B = (TextView)((ViewGroup) (obj)).findViewById(android.support.v7.a.g.title);
            }
            at.b(((View) (obj)));
            obj1 = (ViewGroup)b.findViewById(0x1020002);
            contentframelayout = (ContentFrameLayout)((ViewGroup) (obj)).findViewById(android.support.v7.a.g.action_bar_activity_content);
            View view;
            for (; ((ViewGroup) (obj1)).getChildCount() > 0; contentframelayout.addView(view))
            {
                view = ((ViewGroup) (obj1)).getChildAt(0);
                ((ViewGroup) (obj1)).removeViewAt(0);
            }

            b.setContentView(((View) (obj)));
            ((ViewGroup) (obj1)).setId(-1);
            contentframelayout.setId(0x1020002);
            if (obj1 instanceof FrameLayout)
            {
                ((FrameLayout)obj1).setForeground(null);
            }
            u = ((ViewGroup) (obj));
            if (super.c instanceof Activity)
            {
                obj = ((Activity)super.c).getTitle();
            } else
            {
                obj = super.m;
            }
            if (!TextUtils.isEmpty(((CharSequence) (obj))))
            {
                b(((CharSequence) (obj)));
            }
            obj = (ContentFrameLayout)u.findViewById(0x1020002);
            ((ContentFrameLayout) (obj)).setDecorPadding(A.getPaddingLeft(), A.getPaddingTop(), A.getPaddingRight(), A.getPaddingBottom());
            obj1 = a.obtainStyledAttributes(l.Theme);
            ((TypedArray) (obj1)).getValue(l.Theme_windowMinWidthMajor, ((ContentFrameLayout) (obj)).getMinWidthMajor());
            ((TypedArray) (obj1)).getValue(l.Theme_windowMinWidthMinor, ((ContentFrameLayout) (obj)).getMinWidthMinor());
            if (((TypedArray) (obj1)).hasValue(l.Theme_windowFixedWidthMajor))
            {
                ((TypedArray) (obj1)).getValue(l.Theme_windowFixedWidthMajor, ((ContentFrameLayout) (obj)).getFixedWidthMajor());
            }
            if (((TypedArray) (obj1)).hasValue(l.Theme_windowFixedWidthMinor))
            {
                ((TypedArray) (obj1)).getValue(l.Theme_windowFixedWidthMinor, ((ContentFrameLayout) (obj)).getFixedWidthMinor());
            }
            if (((TypedArray) (obj1)).hasValue(l.Theme_windowFixedHeightMajor))
            {
                ((TypedArray) (obj1)).getValue(l.Theme_windowFixedHeightMajor, ((ContentFrameLayout) (obj)).getFixedHeightMajor());
            }
            if (((TypedArray) (obj1)).hasValue(l.Theme_windowFixedHeightMinor))
            {
                ((TypedArray) (obj1)).getValue(l.Theme_windowFixedHeightMinor, ((ContentFrameLayout) (obj)).getFixedHeightMinor());
            }
            ((TypedArray) (obj1)).recycle();
            ((ContentFrameLayout) (obj)).requestLayout();
            z = true;
            obj = e(0);
            if (!super.n && (obj == null || ((PanelFeatureState) (obj)).j == null))
            {
                f(108);
            }
        }
    }

    private void n()
    {
        if (z)
        {
            throw new AndroidRuntimeException("Window feature must be requested before adding content");
        } else
        {
            return;
        }
    }

    final PanelFeatureState a(Menu menu)
    {
        PanelFeatureState apanelfeaturestate[] = G;
        int i1;
        int j1;
        if (apanelfeaturestate != null)
        {
            i1 = apanelfeaturestate.length;
        } else
        {
            i1 = 0;
        }
        for (j1 = 0; j1 < i1; j1++)
        {
            PanelFeatureState panelfeaturestate = apanelfeaturestate[j1];
            if (panelfeaturestate != null && panelfeaturestate.j == menu)
            {
                return panelfeaturestate;
            }
        }

        return null;
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
            M = new a();
        }
        if (!flag1 || !z) goto _L2; else goto _L1
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
        view = android.support.v7.internal.a.a.a(view, attributeset, flag1);
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
                return ((a) (obj)).a(view, s1, attributeset);
            } else
            {
                return null;
            }

        case 0: // '\0'
            return new AppCompatEditText(view, attributeset);

        case 1: // '\001'
            return new AppCompatSpinner(view, attributeset);

        case 2: // '\002'
            return new AppCompatCheckBox(view, attributeset);

        case 3: // '\003'
            return new AppCompatRadioButton(view, attributeset);

        case 4: // '\004'
            return new AppCompatCheckedTextView(view, attributeset);

        case 5: // '\005'
            return new AppCompatAutoCompleteTextView(view, attributeset);

        case 6: // '\006'
            return new AppCompatMultiAutoCompleteTextView(view, attributeset);

        case 7: // '\007'
            return new AppCompatRatingBar(view, attributeset);

        case 8: // '\b'
            return new AppCompatButton(view, attributeset);

        case 9: // '\t'
            return new AppCompatTextView(view, attributeset);
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
        if (obj != A && (obj instanceof View) && !bt.x((View)obj)) goto _L19; else goto _L18
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

    public final void a(int i1)
    {
        m();
        ViewGroup viewgroup = (ViewGroup)u.findViewById(0x1020002);
        viewgroup.removeAllViews();
        LayoutInflater.from(a).inflate(i1, viewgroup);
        c.onContentChanged();
    }

    final void a(int i1, PanelFeatureState panelfeaturestate, Menu menu)
    {
        PanelFeatureState panelfeaturestate2 = panelfeaturestate;
        Object obj = menu;
        if (menu == null)
        {
            PanelFeatureState panelfeaturestate1 = panelfeaturestate;
            if (panelfeaturestate == null)
            {
                panelfeaturestate1 = panelfeaturestate;
                if (i1 >= 0)
                {
                    panelfeaturestate1 = panelfeaturestate;
                    if (i1 < G.length)
                    {
                        panelfeaturestate1 = G[i1];
                    }
                }
            }
            panelfeaturestate2 = panelfeaturestate1;
            obj = menu;
            if (panelfeaturestate1 != null)
            {
                obj = panelfeaturestate1.j;
                panelfeaturestate2 = panelfeaturestate1;
            }
        }
        while (panelfeaturestate2 != null && !panelfeaturestate2.o || super.n) 
        {
            return;
        }
        c.onPanelClosed(i1, ((Menu) (obj)));
    }

    public final void a(Configuration configuration)
    {
        if (h && z)
        {
            android.support.v7.app.a a1 = a();
            if (a1 != null)
            {
                a1.a(configuration);
            }
        }
    }

    final void a(PanelFeatureState panelfeaturestate, boolean flag)
    {
        if (flag && panelfeaturestate.a == 0 && o != null && o.b())
        {
            b(panelfeaturestate.j);
        } else
        {
            WindowManager windowmanager = (WindowManager)a.getSystemService("window");
            if (windowmanager != null && panelfeaturestate.o && panelfeaturestate.g != null)
            {
                windowmanager.removeView(panelfeaturestate.g);
                if (flag)
                {
                    a(panelfeaturestate.a, panelfeaturestate, ((Menu) (null)));
                }
            }
            panelfeaturestate.m = false;
            panelfeaturestate.n = false;
            panelfeaturestate.o = false;
            panelfeaturestate.h = null;
            panelfeaturestate.q = true;
            if (H == panelfeaturestate)
            {
                H = null;
                return;
            }
        }
    }

    public final void a(android.support.v7.internal.view.menu.i i1)
    {
        if (o == null || !o.a() || cj.b(ViewConfiguration.get(a)) && !o.c())
        {
            break MISSING_BLOCK_LABEL_208;
        }
        i1 = super.b.getCallback();
        if (o.b()) goto _L2; else goto _L1
_L1:
        if (i1 != null && !super.n)
        {
            if (v && (w & 1) != 0)
            {
                A.removeCallbacks(I);
                I.run();
            }
            PanelFeatureState panelfeaturestate = e(0);
            if (panelfeaturestate.j != null && !panelfeaturestate.r && i1.onPreparePanel(0, panelfeaturestate.i, panelfeaturestate.j))
            {
                i1.onMenuOpened(108, panelfeaturestate.j);
                o.d();
            }
        }
_L4:
        return;
_L2:
        o.e();
        if (super.n) goto _L4; else goto _L3
_L3:
        i1.onPanelClosed(108, e(0).j);
        return;
        i1 = e(0);
        i1.q = true;
        a(((PanelFeatureState) (i1)), false);
        a(((PanelFeatureState) (i1)), ((KeyEvent) (null)));
        return;
    }

    public final void a(View view)
    {
        m();
        ViewGroup viewgroup = (ViewGroup)u.findViewById(0x1020002);
        viewgroup.removeAllViews();
        viewgroup.addView(view);
        c.onContentChanged();
    }

    public final void a(View view, android.view.ViewGroup.LayoutParams layoutparams)
    {
        m();
        ViewGroup viewgroup = (ViewGroup)u.findViewById(0x1020002);
        viewgroup.removeAllViews();
        viewgroup.addView(view, layoutparams);
        c.onContentChanged();
    }

    final boolean a(int i1, KeyEvent keyevent)
    {
        android.support.v7.app.a a1 = a();
        if (a1 == null || !a1.a(i1, keyevent)) goto _L2; else goto _L1
_L1:
        return true;
_L2:
        if (H == null || !a(H, keyevent.getKeyCode(), keyevent))
        {
            break; /* Loop/switch isn't completed */
        }
        if (H != null)
        {
            H.n = true;
            return true;
        }
        if (true) goto _L1; else goto _L3
_L3:
        boolean flag;
        if (H != null)
        {
            break; /* Loop/switch isn't completed */
        }
        PanelFeatureState panelfeaturestate = e(0);
        b(panelfeaturestate, keyevent);
        flag = a(panelfeaturestate, keyevent.getKeyCode(), keyevent);
        panelfeaturestate.m = false;
        if (flag) goto _L1; else goto _L4
_L4:
        return false;
    }

    public final boolean a(android.support.v7.internal.view.menu.i i1, MenuItem menuitem)
    {
        android.view.Window.Callback callback = super.b.getCallback();
        if (callback != null && !super.n)
        {
            i1 = a(((Menu) (i1.k())));
            if (i1 != null)
            {
                return callback.onMenuItemSelected(((PanelFeatureState) (i1)).a, menuitem);
            }
        }
        return false;
    }

    final boolean a(KeyEvent keyevent)
    {
        int i1;
        if (keyevent.getKeyCode() == 82 && c.dispatchKeyEvent(keyevent))
        {
            return true;
        }
        i1 = keyevent.getKeyCode();
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
        i1;
        JVM INSTR tableswitch 82 82: default 64
    //                   82 87;
           goto _L3 _L4
_L3:
        if (android.os.Build.VERSION.SDK_INT < 11)
        {
            a(i1, keyevent);
        }
        return false;
_L4:
        if (keyevent.getRepeatCount() == 0)
        {
            PanelFeatureState panelfeaturestate = e(0);
            if (!panelfeaturestate.o)
            {
                b(panelfeaturestate, keyevent);
            }
        }
        if (true) goto _L3; else goto _L2
_L2:
        i1;
        JVM INSTR lookupswitch 2: default 144
    //                   4: 347
    //                   82: 146;
           goto _L5 _L6 _L7
_L5:
        return false;
_L7:
        if (p != null) goto _L9; else goto _L8
_L8:
        PanelFeatureState panelfeaturestate1 = e(0);
        boolean flag2;
        if (o != null && o.a() && !cj.b(ViewConfiguration.get(a)))
        {
            if (!o.b())
            {
                if (super.n || !b(panelfeaturestate1, keyevent))
                {
                    break MISSING_BLOCK_LABEL_420;
                }
                flag2 = o.d();
            } else
            {
                flag2 = o.e();
            }
        } else
        if (panelfeaturestate1.o || panelfeaturestate1.n)
        {
            flag2 = panelfeaturestate1.o;
            a(panelfeaturestate1, true);
        } else
        {
            if (!panelfeaturestate1.m)
            {
                break MISSING_BLOCK_LABEL_420;
            }
            boolean flag1;
            if (panelfeaturestate1.r)
            {
                panelfeaturestate1.m = false;
                flag2 = b(panelfeaturestate1, keyevent);
            } else
            {
                flag2 = true;
            }
            if (!flag2)
            {
                break MISSING_BLOCK_LABEL_420;
            }
            a(panelfeaturestate1, keyevent);
            flag2 = true;
        }
_L10:
        if (flag2)
        {
            keyevent = (AudioManager)a.getSystemService("audio");
            if (keyevent != null)
            {
                keyevent.playSoundEffect(0);
            }
        }
_L9:
        return true;
_L6:
        keyevent = e(0);
        if (keyevent != null && ((PanelFeatureState) (keyevent)).o)
        {
            a(((PanelFeatureState) (keyevent)), true);
            return true;
        }
        if (p != null)
        {
            p.c();
            flag1 = true;
        } else
        {
            keyevent = a();
            if (keyevent != null && keyevent.d())
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
          goto _L10
    }

    final void b(android.support.v7.internal.view.menu.i i1)
    {
        if (F)
        {
            return;
        }
        F = true;
        o.f();
        android.view.Window.Callback callback = super.b.getCallback();
        if (callback != null && !super.n)
        {
            callback.onPanelClosed(108, i1);
        }
        F = false;
    }

    public final void b(View view, android.view.ViewGroup.LayoutParams layoutparams)
    {
        m();
        ((ViewGroup)u.findViewById(0x1020002)).addView(view, layoutparams);
        c.onContentChanged();
    }

    final void b(CharSequence charsequence)
    {
        if (o != null)
        {
            o.setWindowTitle(charsequence);
        } else
        {
            if (super.f != null)
            {
                super.f.a(charsequence);
                return;
            }
            if (B != null)
            {
                B.setText(charsequence);
                return;
            }
        }
    }

    public final boolean b(int i1)
    {
        if (i1 != 8) goto _L2; else goto _L1
_L1:
        int j1 = 108;
_L4:
        if (l && j1 == 108)
        {
            return false;
        }
        break; /* Loop/switch isn't completed */
_L2:
        j1 = i1;
        if (i1 == 9)
        {
            j1 = 109;
        }
        if (true) goto _L4; else goto _L3
_L3:
        if (h && j1 == 1)
        {
            h = false;
        }
        switch (j1)
        {
        default:
            return b.requestFeature(j1);

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
        android.support.v7.app.a a1;
label0:
        {
            A = (ViewGroup)b.getDecorView();
            if ((c instanceof Activity) && aq.b((Activity)c) != null)
            {
                a1 = super.f;
                if (a1 != null)
                {
                    break label0;
                }
                J = true;
            }
            return;
        }
        a1.a(true);
    }

    final void c(int i1)
    {
        if (i1 == 108)
        {
            android.support.v7.app.a a1 = a();
            if (a1 != null)
            {
                a1.c(false);
            }
        } else
        if (i1 == 0)
        {
            PanelFeatureState panelfeaturestate = e(i1);
            if (panelfeaturestate.o)
            {
                a(panelfeaturestate, false);
                return;
            }
        }
    }

    public final void d()
    {
        m();
    }

    final boolean d(int i1)
    {
        if (i1 == 108)
        {
            android.support.v7.app.a a1 = a();
            if (a1 != null)
            {
                a1.c(true);
            }
            return true;
        } else
        {
            return false;
        }
    }

    final PanelFeatureState e(int i1)
    {
        PanelFeatureState apanelfeaturestate[];
label0:
        {
            PanelFeatureState apanelfeaturestate1[] = G;
            if (apanelfeaturestate1 != null)
            {
                apanelfeaturestate = apanelfeaturestate1;
                if (apanelfeaturestate1.length > i1)
                {
                    break label0;
                }
            }
            apanelfeaturestate = new PanelFeatureState[i1 + 1];
            if (apanelfeaturestate1 != null)
            {
                System.arraycopy(apanelfeaturestate1, 0, apanelfeaturestate, 0, apanelfeaturestate1.length);
            }
            G = apanelfeaturestate;
        }
        PanelFeatureState panelfeaturestate = apanelfeaturestate[i1];
        if (panelfeaturestate == null)
        {
            panelfeaturestate = new PanelFeatureState(i1);
            apanelfeaturestate[i1] = panelfeaturestate;
            return panelfeaturestate;
        } else
        {
            return panelfeaturestate;
        }
    }

    public final void e()
    {
        android.support.v7.app.a a1 = a();
        if (a1 != null)
        {
            a1.b(false);
        }
    }

    public final void f()
    {
        android.support.v7.app.a a1 = a();
        if (a1 != null)
        {
            a1.b(true);
        }
    }

    public final void g()
    {
        android.support.v7.app.a a1 = a();
        if (a1 != null && a1.c())
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
            android.support.v4.view.z.a(layoutinflater, this);
        }
    }

    public final void j()
    {
        m();
        if (h && f == null)
        {
            if (c instanceof Activity)
            {
                f = new e((Activity)c, i);
            } else
            if (c instanceof Dialog)
            {
                f = new e((Dialog)c);
            }
            if (f != null)
            {
                f.a(J);
                return;
            }
        }
    }

    final void l()
    {
        if (t != null)
        {
            t.a();
        }
    }

    private class PanelFeatureState
    {

        int a;
        int b;
        int c;
        int d;
        int e;
        int f;
        ViewGroup g;
        View h;
        View i;
        android.support.v7.internal.view.menu.i j;
        g k;
        Context l;
        boolean m;
        boolean n;
        boolean o;
        public boolean p;
        boolean q;
        boolean r;
        Bundle s;

        final void a(android.support.v7.internal.view.menu.i i1)
        {
            if (i1 != j)
            {
                if (j != null)
                {
                    j.b(k);
                }
                j = i1;
                if (i1 != null && k != null)
                {
                    i1.a(k);
                    return;
                }
            }
        }

        PanelFeatureState(int i1)
        {
            a = i1;
            q = false;
        }
    }


    private class ListMenuDecorView extends FrameLayout
    {

        final AppCompatDelegateImplV7 a;

        public boolean dispatchKeyEvent(KeyEvent keyevent)
        {
            return a.a(keyevent) || super.dispatchKeyEvent(keyevent);
        }

        public boolean onInterceptTouchEvent(MotionEvent motionevent)
        {
            if (motionevent.getAction() == 0)
            {
                int i1 = (int)motionevent.getX();
                int j1 = (int)motionevent.getY();
                boolean flag;
                if (i1 < -5 || j1 < -5 || i1 > getWidth() + 5 || j1 > getHeight() + 5)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                if (flag)
                {
                    motionevent = a;
                    motionevent.a(motionevent.e(0), true);
                    return true;
                }
            }
            return super.onInterceptTouchEvent(motionevent);
        }

        public void setBackgroundResource(int i1)
        {
            setBackgroundDrawable(al.a(getContext(), i1));
        }

        public ListMenuDecorView(Context context)
        {
            a = AppCompatDelegateImplV7.this;
            super(context);
        }
    }

}
