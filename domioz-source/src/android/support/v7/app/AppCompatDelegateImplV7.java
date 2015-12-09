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
import android.support.v4.app.aw;
import android.support.v4.view.ae;
import android.support.v4.view.an;
import android.support.v4.view.bp;
import android.support.v4.view.ce;
import android.support.v7.a.b;
import android.support.v7.a.d;
import android.support.v7.a.i;
import android.support.v7.a.k;
import android.support.v7.a.l;
import android.support.v7.c.a;
import android.support.v7.internal.view.c;
import android.support.v7.internal.view.menu.g;
import android.support.v7.internal.view.menu.j;
import android.support.v7.internal.widget.ActionBarContextView;
import android.support.v7.internal.widget.ContentFrameLayout;
import android.support.v7.internal.widget.ViewStubCompat;
import android.support.v7.internal.widget.aa;
import android.support.v7.internal.widget.ac;
import android.support.v7.internal.widget.be;
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
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import android.widget.TextView;

// Referenced classes of package android.support.v7.app:
//            o, t, z, ab, 
//            x, u, v, y, 
//            w, ActionBar, m

class AppCompatDelegateImplV7 extends o
    implements an, j
{

    private boolean A;
    private int B;
    private final Runnable C = new t(this);
    private boolean D;
    private Rect E;
    private Rect F;
    private android.support.v7.internal.a.a G;
    a j;
    ActionBarContextView k;
    PopupWindow l;
    Runnable m;
    private aa n;
    private x o;
    private ab p;
    private boolean q;
    private ViewGroup r;
    private ViewGroup s;
    private TextView t;
    private View u;
    private boolean v;
    private boolean w;
    private boolean x;
    private PanelFeatureState y[];
    private PanelFeatureState z;

    AppCompatDelegateImplV7(Context context, Window window, m m1)
    {
        super(context, window, m1);
    }

    static int a(AppCompatDelegateImplV7 appcompatdelegateimplv7)
    {
        return appcompatdelegateimplv7.B;
    }

    static PanelFeatureState a(AppCompatDelegateImplV7 appcompatdelegateimplv7, Menu menu)
    {
        return appcompatdelegateimplv7.a(menu);
    }

    private PanelFeatureState a(Menu menu)
    {
        PanelFeatureState apanelfeaturestate[] = y;
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

    private void a(int i1, PanelFeatureState panelfeaturestate, Menu menu)
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
                    if (i1 < y.length)
                    {
                        panelfeaturestate1 = y[i1];
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
        if (panelfeaturestate2 == null || panelfeaturestate2.o)
        {
            if ((panelfeaturestate = super.b.getCallback()) != null)
            {
                panelfeaturestate.onPanelClosed(i1, ((Menu) (obj)));
                return;
            }
        }
    }

    private void a(PanelFeatureState panelfeaturestate, KeyEvent keyevent)
    {
        byte byte0 = -1;
        if (!panelfeaturestate.o && !n()) goto _L2; else goto _L1
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
        Object obj1 = m();
        TypedValue typedvalue = new TypedValue();
        keyevent = ((Context) (obj1)).getResources().newTheme();
        keyevent.setTo(((Context) (obj1)).getTheme());
        keyevent.resolveAttribute(b.a, typedvalue, true);
        if (typedvalue.resourceId != 0)
        {
            keyevent.applyStyle(typedvalue.resourceId, true);
        }
        keyevent.resolveAttribute(b.B, typedvalue, true);
        if (typedvalue.resourceId != 0)
        {
            keyevent.applyStyle(typedvalue.resourceId, true);
        } else
        {
            keyevent.applyStyle(k.a, true);
        }
        obj1 = new android.support.v7.internal.view.b(((Context) (obj1)), 0);
        ((Context) (obj1)).getTheme().setTo(keyevent);
        panelfeaturestate.l = ((Context) (obj1));
        keyevent = ((Context) (obj1)).obtainStyledAttributes(l.bb);
        panelfeaturestate.b = keyevent.getResourceId(l.be, 0);
        panelfeaturestate.f = keyevent.getResourceId(l.bc, 0);
        keyevent.recycle();
        panelfeaturestate.g = new z(this, panelfeaturestate.l);
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
                if (p == null)
                {
                    p = new ab(this, (byte)0);
                }
                keyevent = p;
                if (panelfeaturestate.j == null)
                {
                    keyevent = null;
                } else
                {
                    if (panelfeaturestate.k == null)
                    {
                        panelfeaturestate.k = new g(panelfeaturestate.l, i.j);
                        panelfeaturestate.k.a(keyevent);
                        panelfeaturestate.j.a(panelfeaturestate.k);
                    }
                    keyevent = panelfeaturestate.k.a(panelfeaturestate.g);
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
        if (panelfeaturestate.k.a().getCount() <= 0) goto _L12; else goto _L17
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

    private void a(PanelFeatureState panelfeaturestate, boolean flag)
    {
        if (flag && panelfeaturestate.a == 0 && n != null && n.d())
        {
            a(panelfeaturestate.j);
        } else
        {
            boolean flag1 = panelfeaturestate.o;
            WindowManager windowmanager = (WindowManager)a.getSystemService("window");
            if (windowmanager != null && flag1 && panelfeaturestate.g != null)
            {
                windowmanager.removeView(panelfeaturestate.g);
            }
            panelfeaturestate.m = false;
            panelfeaturestate.n = false;
            panelfeaturestate.o = false;
            if (flag1 && flag)
            {
                a(panelfeaturestate.a, panelfeaturestate, ((Menu) (null)));
            }
            panelfeaturestate.h = null;
            panelfeaturestate.q = true;
            if (z == panelfeaturestate)
            {
                z = null;
                return;
            }
        }
    }

    static void a(AppCompatDelegateImplV7 appcompatdelegateimplv7, int i1)
    {
        PanelFeatureState panelfeaturestate = appcompatdelegateimplv7.d(i1);
        if (panelfeaturestate.j != null)
        {
            Bundle bundle = new Bundle();
            panelfeaturestate.j.a(bundle);
            if (bundle.size() > 0)
            {
                panelfeaturestate.s = bundle;
            }
            panelfeaturestate.j.g();
            panelfeaturestate.j.clear();
        }
        panelfeaturestate.r = true;
        panelfeaturestate.q = true;
        if ((i1 == 8 || i1 == 0) && appcompatdelegateimplv7.n != null)
        {
            PanelFeatureState panelfeaturestate1 = appcompatdelegateimplv7.d(0);
            if (panelfeaturestate1 != null)
            {
                panelfeaturestate1.m = false;
                appcompatdelegateimplv7.b(panelfeaturestate1, ((KeyEvent) (null)));
            }
        }
    }

    static void a(AppCompatDelegateImplV7 appcompatdelegateimplv7, int i1, PanelFeatureState panelfeaturestate, Menu menu)
    {
        appcompatdelegateimplv7.a(i1, panelfeaturestate, menu);
    }

    static void a(AppCompatDelegateImplV7 appcompatdelegateimplv7, PanelFeatureState panelfeaturestate, boolean flag)
    {
        appcompatdelegateimplv7.a(panelfeaturestate, flag);
    }

    static void a(AppCompatDelegateImplV7 appcompatdelegateimplv7, android.support.v7.internal.view.menu.i i1)
    {
        appcompatdelegateimplv7.a(i1);
    }

    private void a(android.support.v7.internal.view.menu.i i1)
    {
        if (x)
        {
            return;
        }
        x = true;
        n.i();
        android.view.Window.Callback callback = super.b.getCallback();
        if (callback != null && !n())
        {
            callback.onPanelClosed(8, i1);
        }
        x = false;
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
        if (appcompatdelegateimplv7.k != null && (appcompatdelegateimplv7.k.getLayoutParams() instanceof android.view.ViewGroup.MarginLayoutParams))
        {
            android.view.ViewGroup.MarginLayoutParams marginlayoutparams = (android.view.ViewGroup.MarginLayoutParams)appcompatdelegateimplv7.k.getLayoutParams();
            if (appcompatdelegateimplv7.k.isShown())
            {
                if (appcompatdelegateimplv7.E == null)
                {
                    appcompatdelegateimplv7.E = new Rect();
                    appcompatdelegateimplv7.F = new Rect();
                }
                Rect rect = appcompatdelegateimplv7.E;
                Rect rect1 = appcompatdelegateimplv7.F;
                rect.set(0, i1, 0, 0);
                be.a(appcompatdelegateimplv7.s, rect, rect1);
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
                    if (appcompatdelegateimplv7.u == null)
                    {
                        appcompatdelegateimplv7.u = new View(appcompatdelegateimplv7.a);
                        appcompatdelegateimplv7.u.setBackgroundColor(appcompatdelegateimplv7.a.getResources().getColor(d.a));
                        appcompatdelegateimplv7.s.addView(appcompatdelegateimplv7.u, -1, new android.view.ViewGroup.LayoutParams(-1, i1));
                        j1 = 1;
                    } else
                    {
                        android.view.ViewGroup.LayoutParams layoutparams = appcompatdelegateimplv7.u.getLayoutParams();
                        if (layoutparams.height != i1)
                        {
                            layoutparams.height = i1;
                            appcompatdelegateimplv7.u.setLayoutParams(layoutparams);
                        }
                        j1 = 1;
                    }
                } else
                {
                    j1 = 0;
                }
                if (appcompatdelegateimplv7.u == null)
                {
                    flag = false;
                }
                k1 = i1;
                if (!appcompatdelegateimplv7.g)
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
                appcompatdelegateimplv7.k.setLayoutParams(marginlayoutparams);
            }
        } else
        {
            j1 = 0;
        }
        if (appcompatdelegateimplv7.u != null)
        {
            appcompatdelegateimplv7 = appcompatdelegateimplv7.u;
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
        if (!n()) goto _L2; else goto _L1
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
        if (z != null && z != panelfeaturestate)
        {
            a(z, false);
        }
        callback = super.b.getCallback();
        if (callback != null)
        {
            panelfeaturestate.i = callback.onCreatePanelView(panelfeaturestate.a);
        }
        android.content.res.Resources.Theme theme;
        if (panelfeaturestate.a == 0 || panelfeaturestate.a == 8)
        {
            i1 = 1;
        } else
        {
            i1 = 0;
        }
        if (i1 && n != null)
        {
            n.h();
        }
        if (panelfeaturestate.i != null) goto _L4; else goto _L3
_L3:
        if (panelfeaturestate.j != null && !panelfeaturestate.r) goto _L6; else goto _L5
_L5:
        if (panelfeaturestate.j != null)
        {
            break; /* Loop/switch isn't completed */
        }
        context = a;
        if (panelfeaturestate.a != 0 && panelfeaturestate.a != 8 || n == null)
        {
            break MISSING_BLOCK_LABEL_634;
        }
        TypedValue typedvalue = new TypedValue();
        android.content.res.Resources.Theme theme1 = context.getTheme();
        theme1.resolveAttribute(b.f, typedvalue, true);
        if (typedvalue.resourceId != 0)
        {
            obj = context.getResources().newTheme();
            ((android.content.res.Resources.Theme) (obj)).setTo(theme1);
            ((android.content.res.Resources.Theme) (obj)).applyStyle(typedvalue.resourceId, true);
            ((android.content.res.Resources.Theme) (obj)).resolveAttribute(b.g, typedvalue, true);
        } else
        {
            theme1.resolveAttribute(b.g, typedvalue, true);
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
            break MISSING_BLOCK_LABEL_634;
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
            if (i1 && n != null)
            {
                if (o == null)
                {
                    o = new x(this, (byte)0);
                }
                n.a(panelfeaturestate.j, o);
            }
            panelfeaturestate.j.g();
            if (callback.onCreatePanelMenu(panelfeaturestate.a, panelfeaturestate.j))
            {
                break label0;
            }
            panelfeaturestate.a(null);
            if (i1 && n != null)
            {
                n.a(null, o);
                return false;
            }
        }
          goto _L1
        panelfeaturestate.r = false;
_L6:
        panelfeaturestate.j.g();
        if (panelfeaturestate.s != null)
        {
            panelfeaturestate.j.b(panelfeaturestate.s);
            panelfeaturestate.s = null;
        }
        if (!callback.onPreparePanel(0, panelfeaturestate.i, panelfeaturestate.j))
        {
            if (i1 && n != null)
            {
                n.a(null, o);
            }
            panelfeaturestate.j.h();
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
        panelfeaturestate.j.h();
_L4:
        panelfeaturestate.m = true;
        panelfeaturestate.n = false;
        z = panelfeaturestate;
        return true;
        obj = context;
          goto _L8
    }

    static boolean b(AppCompatDelegateImplV7 appcompatdelegateimplv7)
    {
        appcompatdelegateimplv7.A = false;
        return false;
    }

    static int c(AppCompatDelegateImplV7 appcompatdelegateimplv7)
    {
        appcompatdelegateimplv7.B = 0;
        return 0;
    }

    private PanelFeatureState d(int i1)
    {
        PanelFeatureState apanelfeaturestate[];
label0:
        {
            PanelFeatureState apanelfeaturestate1[] = y;
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
            y = apanelfeaturestate;
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

    static void d(AppCompatDelegateImplV7 appcompatdelegateimplv7)
    {
        appcompatdelegateimplv7.a(appcompatdelegateimplv7.d(0), true);
    }

    private void e(int i1)
    {
        B = B | 1 << i1;
        if (!A && r != null)
        {
            bp.a(r, C);
            A = true;
        }
    }

    private void q()
    {
        Object obj;
        if (q)
        {
            break MISSING_BLOCK_LABEL_667;
        }
        obj = LayoutInflater.from(a);
        if (i) goto _L2; else goto _L1
_L1:
        if (!h) goto _L4; else goto _L3
_L3:
        s = (ViewGroup)((LayoutInflater) (obj)).inflate(i.f, null);
        f = false;
        e = false;
_L6:
        if (s == null)
        {
            throw new IllegalArgumentException("AppCompat does not support the current theme features");
        }
        break; /* Loop/switch isn't completed */
_L4:
        if (e)
        {
            obj = new TypedValue();
            a.getTheme().resolveAttribute(b.f, ((TypedValue) (obj)), true);
            if (((TypedValue) (obj)).resourceId != 0)
            {
                obj = new android.support.v7.internal.view.b(a, ((TypedValue) (obj)).resourceId);
            } else
            {
                obj = a;
            }
            s = (ViewGroup)LayoutInflater.from(((Context) (obj))).inflate(i.o, null);
            n = (aa)s.findViewById(android.support.v7.a.g.o);
            n.a(super.b.getCallback());
            if (f)
            {
                n.a(9);
            }
            if (v)
            {
                n.a(2);
            }
            if (w)
            {
                n.a(5);
            }
        }
        continue; /* Loop/switch isn't completed */
_L2:
        if (g)
        {
            s = (ViewGroup)((LayoutInflater) (obj)).inflate(i.n, null);
        } else
        {
            s = (ViewGroup)((LayoutInflater) (obj)).inflate(i.m, null);
        }
        if (android.os.Build.VERSION.SDK_INT >= 21)
        {
            bp.a(s, new u(this));
        } else
        {
            ((ac)s).a(new v(this));
        }
        if (true) goto _L6; else goto _L5
_L5:
        if (n == null)
        {
            t = (TextView)s.findViewById(android.support.v7.a.g.v);
        }
        be.b(s);
        Object obj2 = (ViewGroup)b.findViewById(0x1020002);
        Object obj1 = (ContentFrameLayout)s.findViewById(android.support.v7.a.g.b);
        View view;
        for (; ((ViewGroup) (obj2)).getChildCount() > 0; ((ContentFrameLayout) (obj1)).addView(view))
        {
            view = ((ViewGroup) (obj2)).getChildAt(0);
            ((ViewGroup) (obj2)).removeViewAt(0);
        }

        b.setContentView(s);
        ((ViewGroup) (obj2)).setId(-1);
        ((ContentFrameLayout) (obj1)).setId(0x1020002);
        if (obj2 instanceof FrameLayout)
        {
            ((FrameLayout)obj2).setForeground(null);
        }
        obj2 = o();
        if (!TextUtils.isEmpty(((CharSequence) (obj2))))
        {
            b(((CharSequence) (obj2)));
        }
        ((ContentFrameLayout) (obj1)).a(r.getPaddingLeft(), r.getPaddingTop(), r.getPaddingRight(), r.getPaddingBottom());
        obj2 = a.obtainStyledAttributes(l.bb);
        ((TypedArray) (obj2)).getValue(l.bm, ((ContentFrameLayout) (obj1)).a());
        ((TypedArray) (obj2)).getValue(l.bn, ((ContentFrameLayout) (obj1)).b());
        if (((TypedArray) (obj2)).hasValue(l.bk))
        {
            ((TypedArray) (obj2)).getValue(l.bk, ((ContentFrameLayout) (obj1)).c());
        }
        if (((TypedArray) (obj2)).hasValue(l.bl))
        {
            ((TypedArray) (obj2)).getValue(l.bl, ((ContentFrameLayout) (obj1)).d());
        }
        if (((TypedArray) (obj2)).hasValue(l.bi))
        {
            ((TypedArray) (obj2)).getValue(l.bi, ((ContentFrameLayout) (obj1)).e());
        }
        if (((TypedArray) (obj2)).hasValue(l.bj))
        {
            ((TypedArray) (obj2)).getValue(l.bj, ((ContentFrameLayout) (obj1)).f());
        }
        ((TypedArray) (obj2)).recycle();
        ((ContentFrameLayout) (obj1)).requestLayout();
        q = true;
        obj1 = d(0);
        if (!n() && (obj1 == null || ((PanelFeatureState) (obj1)).j == null))
        {
            e(8);
        }
    }

    final a a(android.support.v7.c.b b1)
    {
        if (j != null)
        {
            j.c();
        }
        y y1 = new y(this, b1);
        if (k == null)
        {
            if (h)
            {
                Object obj1 = new TypedValue();
                Object obj = a.getTheme();
                ((android.content.res.Resources.Theme) (obj)).resolveAttribute(b.f, ((TypedValue) (obj1)), true);
                int i1;
                if (((TypedValue) (obj1)).resourceId != 0)
                {
                    android.content.res.Resources.Theme theme = a.getResources().newTheme();
                    theme.setTo(((android.content.res.Resources.Theme) (obj)));
                    theme.applyStyle(((TypedValue) (obj1)).resourceId, true);
                    obj = new android.support.v7.internal.view.b(a, 0);
                    ((Context) (obj)).getTheme().setTo(theme);
                } else
                {
                    obj = a;
                }
                k = new ActionBarContextView(((Context) (obj)));
                l = new PopupWindow(((Context) (obj)), null, b.i);
                l.setContentView(k);
                l.setWidth(-1);
                ((Context) (obj)).getTheme().resolveAttribute(b.b, ((TypedValue) (obj1)), true);
                i1 = TypedValue.complexToDimensionPixelSize(((TypedValue) (obj1)).data, ((Context) (obj)).getResources().getDisplayMetrics());
                k.a(i1);
                l.setHeight(-2);
                m = new w(this);
            } else
            {
                ViewStubCompat viewstubcompat = (ViewStubCompat)s.findViewById(android.support.v7.a.g.h);
                if (viewstubcompat != null)
                {
                    viewstubcompat.a(LayoutInflater.from(m()));
                    k = (ActionBarContextView)viewstubcompat.a();
                }
            }
        }
        if (k != null)
        {
            k.e();
            obj = k.getContext();
            obj1 = k;
            boolean flag;
            if (l == null)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            obj = new c(((Context) (obj)), ((ActionBarContextView) (obj1)), y1, flag);
            if (b1.a(((a) (obj)), ((a) (obj)).b()))
            {
                ((a) (obj)).d();
                k.a(((a) (obj)));
                k.setVisibility(0);
                j = ((a) (obj));
                if (l != null)
                {
                    b.getDecorView().post(m);
                }
                k.sendAccessibilityEvent(32);
                if (k.getParent() != null)
                {
                    bp.r((View)k.getParent());
                }
            } else
            {
                j = null;
            }
        }
        return j;
    }

    public final View a(View view, String s1, Context context, AttributeSet attributeset)
    {
        View view1 = b(view, s1, context, attributeset);
        if (view1 != null)
        {
            return view1;
        }
        boolean flag;
        boolean flag1;
        if (android.os.Build.VERSION.SDK_INT < 21)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (G == null)
        {
            G = new android.support.v7.internal.a.a();
        }
        if (flag && q && view != null && view.getId() != 0x1020002 && !bp.x(view))
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        return G.a(view, s1, context, attributeset, flag1, flag);
    }

    public final void a(int i1)
    {
        q();
        ViewGroup viewgroup = (ViewGroup)s.findViewById(0x1020002);
        viewgroup.removeAllViews();
        LayoutInflater.from(a).inflate(i1, viewgroup);
        c.onContentChanged();
    }

    public final void a(Bundle bundle)
    {
label0:
        {
            super.a(bundle);
            r = (ViewGroup)b.getDecorView();
            if ((c instanceof Activity) && aw.b((Activity)c) != null)
            {
                bundle = l();
                if (bundle != null)
                {
                    break label0;
                }
                D = true;
            }
            return;
        }
        bundle.a(true);
    }

    public final void a(View view)
    {
        q();
        ViewGroup viewgroup = (ViewGroup)s.findViewById(0x1020002);
        viewgroup.removeAllViews();
        viewgroup.addView(view);
        c.onContentChanged();
    }

    public final void a(View view, android.view.ViewGroup.LayoutParams layoutparams)
    {
        q();
        ViewGroup viewgroup = (ViewGroup)s.findViewById(0x1020002);
        viewgroup.removeAllViews();
        viewgroup.addView(view, layoutparams);
        c.onContentChanged();
    }

    public final boolean a(android.support.v7.internal.view.menu.i i1, MenuItem menuitem)
    {
        android.view.Window.Callback callback = super.b.getCallback();
        if (callback != null && !n())
        {
            i1 = a(((Menu) (i1.o())));
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
        i1 = keyevent.getKeyCode();
        boolean flag;
        if (keyevent.getAction() == 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag)
        {
            switch (i1)
            {
            default:
                if (android.os.Build.VERSION.SDK_INT < 11)
                {
                    return b(keyevent);
                } else
                {
                    return false;
                }

            case 82: // 'R'
                break;
            }
            if (keyevent.getRepeatCount() == 0)
            {
                PanelFeatureState panelfeaturestate = d(0);
                if (!panelfeaturestate.o)
                {
                    b(panelfeaturestate, keyevent);
                }
            }
            return true;
        }
        i1;
        JVM INSTR lookupswitch 2: default 120
    //                   4: 336
    //                   82: 122;
           goto _L1 _L2 _L3
_L1:
        return false;
_L3:
        if (j != null) goto _L5; else goto _L4
_L4:
        PanelFeatureState panelfeaturestate1 = d(0);
        boolean flag2;
        if (n != null && n.c() && !ce.a(ViewConfiguration.get(a)))
        {
            if (!n.d())
            {
                if (n() || !b(panelfeaturestate1, keyevent))
                {
                    break MISSING_BLOCK_LABEL_409;
                }
                flag2 = n.f();
            } else
            {
                flag2 = n.g();
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
                break MISSING_BLOCK_LABEL_409;
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
                break MISSING_BLOCK_LABEL_409;
            }
            a(panelfeaturestate1, keyevent);
            flag2 = true;
        }
_L6:
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
_L5:
        return true;
_L2:
        keyevent = d(0);
        if (keyevent != null && ((PanelFeatureState) (keyevent)).o)
        {
            a(((PanelFeatureState) (keyevent)), true);
            return true;
        }
        if (j != null)
        {
            j.c();
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
          goto _L1
        flag2 = false;
          goto _L6
    }

    View b(View view, String s1, Context context, AttributeSet attributeset)
    {
        if (c instanceof android.view.LayoutInflater.Factory)
        {
            view = ((android.view.LayoutInflater.Factory)c).onCreateView(s1, context, attributeset);
            if (view != null)
            {
                return view;
            }
        }
        return null;
    }

    public final void b(View view, android.view.ViewGroup.LayoutParams layoutparams)
    {
        q();
        ((ViewGroup)s.findViewById(0x1020002)).addView(view, layoutparams);
        c.onContentChanged();
    }

    final void b(CharSequence charsequence)
    {
        if (n != null)
        {
            n.a(charsequence);
        } else
        {
            if (l() != null)
            {
                l().a(charsequence);
                return;
            }
            if (t != null)
            {
                t.setText(charsequence);
                return;
            }
        }
    }

    final boolean b(int i1)
    {
        boolean flag1 = false;
        boolean flag;
        if (i1 == 8)
        {
            ActionBar actionbar = a();
            if (actionbar != null)
            {
                actionbar.c(false);
            }
            flag = true;
        } else
        {
            flag = flag1;
            if (i1 == 0)
            {
                PanelFeatureState panelfeaturestate = d(i1);
                flag = flag1;
                if (panelfeaturestate.o)
                {
                    a(panelfeaturestate, false);
                    return false;
                }
            }
        }
        return flag;
    }

    final boolean b(KeyEvent keyevent)
    {
        a();
        if (z == null || !a(z, keyevent.getKeyCode(), keyevent)) goto _L2; else goto _L1
_L1:
        if (z != null)
        {
            z.n = true;
        }
_L4:
        return true;
_L2:
        boolean flag;
        if (z != null)
        {
            break; /* Loop/switch isn't completed */
        }
        PanelFeatureState panelfeaturestate = d(0);
        b(panelfeaturestate, keyevent);
        flag = a(panelfeaturestate, keyevent.getKeyCode(), keyevent);
        panelfeaturestate.m = false;
        if (flag) goto _L4; else goto _L3
_L3:
        return false;
    }

    public final void c()
    {
        q();
    }

    final boolean c(int i1)
    {
        if (i1 == 8)
        {
            ActionBar actionbar = a();
            if (actionbar != null)
            {
                actionbar.c(true);
            }
            return true;
        } else
        {
            return false;
        }
    }

    public final void d()
    {
        if (e && q)
        {
            ActionBar actionbar = a();
            if (actionbar != null)
            {
                actionbar.c();
            }
        }
    }

    public final void e()
    {
        ActionBar actionbar = a();
        if (actionbar != null)
        {
            actionbar.b(false);
        }
    }

    public final void f()
    {
        ActionBar actionbar = a();
        if (actionbar != null)
        {
            actionbar.b(true);
        }
    }

    public final void g()
    {
        a();
        e(0);
    }

    public final boolean i()
    {
        if (q)
        {
            throw new AndroidRuntimeException("Window feature must be requested before adding content");
        } else
        {
            i = true;
            return true;
        }
    }

    public final void j()
    {
        LayoutInflater layoutinflater = LayoutInflater.from(a);
        if (layoutinflater.getFactory() == null)
        {
            ae.a(layoutinflater, this);
            return;
        } else
        {
            Log.i("AppCompatDelegate", "The Activity's LayoutInflater already has a Factory installed so we can not install AppCompat's");
            return;
        }
    }

    public final ActionBar k()
    {
        android.support.v7.internal.a.b b1;
        q();
        b1 = null;
        if (!(c instanceof Activity)) goto _L2; else goto _L1
_L1:
        b1 = new android.support.v7.internal.a.b((Activity)c, f);
_L4:
        if (b1 != null)
        {
            b1.a(D);
        }
        return b1;
_L2:
        if (c instanceof Dialog)
        {
            b1 = new android.support.v7.internal.a.b((Dialog)c);
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public final void p()
    {
        android.view.Window.Callback callback;
        if (n == null || !n.c() || ce.a(ViewConfiguration.get(a)) && !n.e())
        {
            break MISSING_BLOCK_LABEL_208;
        }
        callback = super.b.getCallback();
        if (n.d()) goto _L2; else goto _L1
_L1:
        if (callback != null && !n())
        {
            if (A && (B & 1) != 0)
            {
                r.removeCallbacks(C);
                C.run();
            }
            PanelFeatureState panelfeaturestate1 = d(0);
            if (panelfeaturestate1.j != null && !panelfeaturestate1.r && callback.onPreparePanel(0, panelfeaturestate1.i, panelfeaturestate1.j))
            {
                callback.onMenuOpened(8, panelfeaturestate1.j);
                n.f();
            }
        }
_L4:
        return;
_L2:
        n.g();
        if (n()) goto _L4; else goto _L3
_L3:
        callback.onPanelClosed(8, d(0).j);
        return;
        PanelFeatureState panelfeaturestate = d(0);
        panelfeaturestate.q = true;
        a(panelfeaturestate, false);
        a(panelfeaturestate, ((KeyEvent) (null)));
        return;
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

}
