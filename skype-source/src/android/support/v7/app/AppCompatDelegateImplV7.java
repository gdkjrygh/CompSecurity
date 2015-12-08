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
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.app.t;
import android.support.v4.view.LayoutInflaterFactory;
import android.support.v4.view.ab;
import android.support.v4.view.af;
import android.support.v4.view.ak;
import android.support.v4.view.am;
import android.support.v4.view.g;
import android.support.v4.view.x;
import android.support.v4.widget.l;
import android.support.v7.internal.app.c;
import android.support.v7.internal.view.b;
import android.support.v7.internal.view.menu.e;
import android.support.v7.internal.view.menu.f;
import android.support.v7.internal.widget.ActionBarContextView;
import android.support.v7.internal.widget.ContentFrameLayout;
import android.support.v7.internal.widget.ViewStubCompat;
import android.support.v7.internal.widget.i;
import android.support.v7.internal.widget.o;
import android.support.v7.internal.widget.r;
import android.support.v7.view.a;
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
import android.view.MotionEvent;
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
//            f, ActionBar, d

class AppCompatDelegateImplV7 extends android.support.v7.app.f
    implements LayoutInflaterFactory, android.support.v7.internal.view.menu.f.a
{
    private static final class PanelFeatureState
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
        f j;
        e k;
        Context l;
        boolean m;
        boolean n;
        boolean o;
        public boolean p;
        boolean q;
        boolean r;
        Bundle s;

        final void a(f f1)
        {
            if (f1 != j)
            {
                if (j != null)
                {
                    j.b(k);
                }
                j = f1;
                if (f1 != null && k != null)
                {
                    f1.a(k);
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

    private static class PanelFeatureState.SavedState
        implements Parcelable
    {

        public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

            public final Object createFromParcel(Parcel parcel)
            {
                return android.support.v7.app.PanelFeatureState.SavedState.a(parcel);
            }

            public final volatile Object[] newArray(int i1)
            {
                return new PanelFeatureState.SavedState[i1];
            }

        };
        int a;
        boolean b;
        Bundle c;

        static PanelFeatureState.SavedState a(Parcel parcel)
        {
            boolean flag = true;
            PanelFeatureState.SavedState savedstate = new PanelFeatureState.SavedState();
            savedstate.a = parcel.readInt();
            if (parcel.readInt() != 1)
            {
                flag = false;
            }
            savedstate.b = flag;
            if (savedstate.b)
            {
                savedstate.c = parcel.readBundle();
            }
            return savedstate;
        }

        public int describeContents()
        {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i1)
        {
            parcel.writeInt(a);
            if (b)
            {
                i1 = 1;
            } else
            {
                i1 = 0;
            }
            parcel.writeInt(i1);
            if (b)
            {
                parcel.writeBundle(c);
            }
        }


        private PanelFeatureState.SavedState()
        {
        }
    }

    private final class a
        implements android.support.v7.internal.view.menu.l.a
    {

        final AppCompatDelegateImplV7 a;

        public final void onCloseMenu(f f1, boolean flag)
        {
            android.support.v7.app.AppCompatDelegateImplV7.a(a, f1);
        }

        public final boolean onOpenSubMenu(f f1)
        {
            android.view.Window.Callback callback = ((android.support.v7.app.f) (a)).b.getCallback();
            if (callback != null)
            {
                callback.onMenuOpened(108, f1);
            }
            return true;
        }

        private a()
        {
            a = AppCompatDelegateImplV7.this;
            super();
        }

        a(byte byte0)
        {
            this();
        }
    }

    final class b
        implements android.support.v7.view.a.a
    {

        final AppCompatDelegateImplV7 a;
        private android.support.v7.view.a.a b;

        public final void a(android.support.v7.view.a a1)
        {
            b.a(a1);
            if (a.o != null)
            {
                a.b.getDecorView().removeCallbacks(a.p);
            }
            if (a.n != null)
            {
                AppCompatDelegateImplV7.d(a);
                a.q = android.support.v4.view.x.s(a.n).a(0.0F);
                a.q.a(new ak(this) {

                    final b a;

                    public final void b(View view)
                    {
                        a.a.n.setVisibility(8);
                        if (a.a.o == null) goto _L2; else goto _L1
_L1:
                        a.a.o.dismiss();
_L4:
                        a.a.n.removeAllViews();
                        a.a.q.a(null);
                        a.a.q = null;
                        return;
_L2:
                        if (a.a.n.getParent() instanceof View)
                        {
                            android.support.v4.view.x.w((View)a.a.n.getParent());
                        }
                        if (true) goto _L4; else goto _L3
_L3:
                    }

            
            {
                a = b1;
                super();
            }
                });
            }
            if (a.e != null)
            {
                a.e.onSupportActionModeFinished(a.m);
            }
            a.m = null;
        }

        public final boolean a(android.support.v7.view.a a1, Menu menu)
        {
            return b.a(a1, menu);
        }

        public final boolean a(android.support.v7.view.a a1, MenuItem menuitem)
        {
            return b.a(a1, menuitem);
        }

        public final boolean b(android.support.v7.view.a a1, Menu menu)
        {
            return b.b(a1, menu);
        }

        public b(android.support.v7.view.a.a a1)
        {
            a = AppCompatDelegateImplV7.this;
            super();
            b = a1;
        }
    }

    private final class c extends FrameLayout
    {

        final AppCompatDelegateImplV7 a;

        public final boolean dispatchKeyEvent(KeyEvent keyevent)
        {
            return a.a(keyevent) || super.dispatchKeyEvent(keyevent);
        }

        public final boolean onInterceptTouchEvent(MotionEvent motionevent)
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
                    android.support.v7.app.AppCompatDelegateImplV7.e(a);
                    return true;
                }
            }
            return super.onInterceptTouchEvent(motionevent);
        }

        public final void setBackgroundResource(int i1)
        {
            setBackgroundDrawable(android.support.v7.internal.widget.o.a(getContext(), i1));
        }

        public c(Context context)
        {
            a = AppCompatDelegateImplV7.this;
            super(context);
        }
    }

    private final class d
        implements android.support.v7.internal.view.menu.l.a
    {

        final AppCompatDelegateImplV7 a;

        public final void onCloseMenu(f f1, boolean flag)
        {
label0:
            {
                f f2 = f1.o();
                AppCompatDelegateImplV7 appcompatdelegateimplv7;
                boolean flag1;
                if (f2 != f1)
                {
                    flag1 = true;
                } else
                {
                    flag1 = false;
                }
                appcompatdelegateimplv7 = a;
                if (flag1)
                {
                    f1 = f2;
                }
                f1 = android.support.v7.app.AppCompatDelegateImplV7.a(appcompatdelegateimplv7, f1);
                if (f1 != null)
                {
                    if (!flag1)
                    {
                        break label0;
                    }
                    android.support.v7.app.AppCompatDelegateImplV7.a(a, ((PanelFeatureState) (f1)).a, f1, f2);
                    android.support.v7.app.AppCompatDelegateImplV7.a(a, f1, true);
                }
                return;
            }
            android.support.v7.app.AppCompatDelegateImplV7.a(a, f1, flag);
        }

        public final boolean onOpenSubMenu(f f1)
        {
            if (f1 == null && a.h)
            {
                android.view.Window.Callback callback = ((android.support.v7.app.f) (a)).b.getCallback();
                if (callback != null && !a.n())
                {
                    callback.onMenuOpened(108, f1);
                }
            }
            return true;
        }

        private d()
        {
            a = AppCompatDelegateImplV7.this;
            super();
        }

        d(byte byte0)
        {
            this();
        }
    }


    private boolean A;
    private boolean B;
    private PanelFeatureState C[];
    private PanelFeatureState D;
    private boolean E;
    private int F;
    private final Runnable G = new Runnable() {

        final AppCompatDelegateImplV7 a;

        public final void run()
        {
            if ((android.support.v7.app.AppCompatDelegateImplV7.a(a) & 1) != 0)
            {
                android.support.v7.app.AppCompatDelegateImplV7.a(a, 0);
            }
            if ((android.support.v7.app.AppCompatDelegateImplV7.a(a) & 0x1000) != 0)
            {
                android.support.v7.app.AppCompatDelegateImplV7.a(a, 108);
            }
            android.support.v7.app.AppCompatDelegateImplV7.b(a);
            android.support.v7.app.AppCompatDelegateImplV7.c(a);
        }

            
            {
                a = AppCompatDelegateImplV7.this;
                super();
            }
    };
    private boolean H;
    private Rect I;
    private Rect J;
    private android.support.v7.internal.app.a K;
    android.support.v7.view.a m;
    ActionBarContextView n;
    PopupWindow o;
    Runnable p;
    af q;
    private android.support.v7.internal.widget.f r;
    private a s;
    private d t;
    private boolean u;
    private ViewGroup v;
    private ViewGroup w;
    private TextView x;
    private View y;
    private boolean z;

    AppCompatDelegateImplV7(Context context, Window window, android.support.v7.app.d d1)
    {
        super(context, window, d1);
        q = null;
    }

    static int a(AppCompatDelegateImplV7 appcompatdelegateimplv7)
    {
        return appcompatdelegateimplv7.F;
    }

    static PanelFeatureState a(AppCompatDelegateImplV7 appcompatdelegateimplv7, Menu menu)
    {
        return appcompatdelegateimplv7.a(menu);
    }

    private PanelFeatureState a(Menu menu)
    {
        PanelFeatureState apanelfeaturestate[] = C;
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
                    if (i1 < C.length)
                    {
                        panelfeaturestate1 = C[i1];
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
        while (panelfeaturestate2 != null && !panelfeaturestate2.o || n()) 
        {
            return;
        }
        c.onPanelClosed(i1, ((Menu) (obj)));
    }

    private void a(PanelFeatureState panelfeaturestate, KeyEvent keyevent)
    {
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
        byte byte0;
        byte0 = -2;
        if (panelfeaturestate.g != null && !panelfeaturestate.q)
        {
            break MISSING_BLOCK_LABEL_762;
        }
        if (panelfeaturestate.g != null) goto _L6; else goto _L5
_L5:
        int i1;
        Object obj1 = l();
        TypedValue typedvalue = new TypedValue();
        keyevent = ((Context) (obj1)).getResources().newTheme();
        keyevent.setTo(((Context) (obj1)).getTheme());
        keyevent.resolveAttribute(android.support.v7.appcompat.a.a.actionBarPopupTheme, typedvalue, true);
        if (typedvalue.resourceId != 0)
        {
            keyevent.applyStyle(typedvalue.resourceId, true);
        }
        keyevent.resolveAttribute(android.support.v7.appcompat.a.a.panelMenuListTheme, typedvalue, true);
        if (typedvalue.resourceId != 0)
        {
            keyevent.applyStyle(typedvalue.resourceId, true);
        } else
        {
            keyevent.applyStyle(android.support.v7.appcompat.a.j.Theme_AppCompat_CompactMenu, true);
        }
        obj1 = new android.support.v7.internal.view.b(((Context) (obj1)), 0);
        ((Context) (obj1)).getTheme().setTo(keyevent);
        panelfeaturestate.l = ((Context) (obj1));
        keyevent = ((Context) (obj1)).obtainStyledAttributes(android.support.v7.appcompat.a.k.Theme);
        panelfeaturestate.b = keyevent.getResourceId(android.support.v7.appcompat.a.k.Theme_panelBackground, 0);
        panelfeaturestate.f = keyevent.getResourceId(android.support.v7.appcompat.a.k.Theme_android_windowAnimationStyle, 0);
        keyevent.recycle();
        panelfeaturestate.g = new c(panelfeaturestate.l);
        panelfeaturestate.c = 81;
        if (panelfeaturestate.g == null) goto _L1; else goto _L7
_L7:
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
                if (t == null)
                {
                    t = new d((byte)0);
                }
                keyevent = t;
                if (panelfeaturestate.j == null)
                {
                    keyevent = null;
                } else
                {
                    if (panelfeaturestate.k == null)
                    {
                        panelfeaturestate.k = new e(panelfeaturestate.l, android.support.v7.appcompat.a.h.abc_list_menu_item_layout);
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
_L14:
        if (i1 == 0) goto _L1; else goto _L8
_L8:
        if (panelfeaturestate.h == null) goto _L10; else goto _L9
_L9:
        if (panelfeaturestate.i == null) goto _L12; else goto _L11
_L11:
        i1 = 1;
_L16:
        if (i1 == 0) goto _L1; else goto _L13
_L13:
        obj1 = panelfeaturestate.h.getLayoutParams();
        keyevent = ((KeyEvent) (obj1));
        if (obj1 == null)
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
        i1 = byte0;
        if (!panelfeaturestate.h.hasFocus())
        {
            panelfeaturestate.h.requestFocus();
            i1 = byte0;
        }
_L17:
        panelfeaturestate.n = false;
        keyevent = new android.view.WindowManager.LayoutParams(i1, -2, panelfeaturestate.d, panelfeaturestate.e, 1002, 0x820000, -3);
        keyevent.gravity = panelfeaturestate.c;
        keyevent.windowAnimations = panelfeaturestate.f;
        windowmanager.addView(panelfeaturestate.g, keyevent);
        panelfeaturestate.o = true;
        return;
_L6:
        if (panelfeaturestate.q && panelfeaturestate.g.getChildCount() > 0)
        {
            panelfeaturestate.g.removeAllViews();
        }
          goto _L7
        i1 = 0;
          goto _L14
_L12:
        if (panelfeaturestate.k.c().getCount() <= 0) goto _L10; else goto _L15
_L15:
        i1 = 1;
          goto _L16
_L10:
        i1 = 0;
          goto _L16
        i1 = byte0;
        if (panelfeaturestate.i != null)
        {
            keyevent = panelfeaturestate.i.getLayoutParams();
            i1 = byte0;
            if (keyevent != null)
            {
                i1 = byte0;
                if (((android.view.ViewGroup.LayoutParams) (keyevent)).width == -1)
                {
                    i1 = -1;
                }
            }
        }
          goto _L17
    }

    private void a(PanelFeatureState panelfeaturestate, boolean flag)
    {
        if (flag && panelfeaturestate.a == 0 && r != null && r.d())
        {
            a(panelfeaturestate.j);
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
            if (D == panelfeaturestate)
            {
                D = null;
                return;
            }
        }
    }

    static void a(AppCompatDelegateImplV7 appcompatdelegateimplv7, int i1)
    {
        PanelFeatureState panelfeaturestate = appcompatdelegateimplv7.e(i1);
        if (panelfeaturestate.j != null)
        {
            Bundle bundle = new Bundle();
            panelfeaturestate.j.c(bundle);
            if (bundle.size() > 0)
            {
                panelfeaturestate.s = bundle;
            }
            panelfeaturestate.j.g();
            panelfeaturestate.j.clear();
        }
        panelfeaturestate.r = true;
        panelfeaturestate.q = true;
        if ((i1 == 108 || i1 == 0) && appcompatdelegateimplv7.r != null)
        {
            PanelFeatureState panelfeaturestate1 = appcompatdelegateimplv7.e(0);
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

    static void a(AppCompatDelegateImplV7 appcompatdelegateimplv7, f f1)
    {
        appcompatdelegateimplv7.a(f1);
    }

    private void a(f f1)
    {
        if (B)
        {
            return;
        }
        B = true;
        r.h();
        android.view.Window.Callback callback = super.b.getCallback();
        if (callback != null && !n())
        {
            callback.onPanelClosed(108, f1);
        }
        B = false;
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
        if (appcompatdelegateimplv7.n != null && (appcompatdelegateimplv7.n.getLayoutParams() instanceof android.view.ViewGroup.MarginLayoutParams))
        {
            android.view.ViewGroup.MarginLayoutParams marginlayoutparams = (android.view.ViewGroup.MarginLayoutParams)appcompatdelegateimplv7.n.getLayoutParams();
            if (appcompatdelegateimplv7.n.isShown())
            {
                if (appcompatdelegateimplv7.I == null)
                {
                    appcompatdelegateimplv7.I = new Rect();
                    appcompatdelegateimplv7.J = new Rect();
                }
                Rect rect = appcompatdelegateimplv7.I;
                Rect rect1 = appcompatdelegateimplv7.J;
                rect.set(0, i1, 0, 0);
                android.support.v7.internal.widget.r.a(appcompatdelegateimplv7.w, rect, rect1);
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
                    if (appcompatdelegateimplv7.y == null)
                    {
                        appcompatdelegateimplv7.y = new View(appcompatdelegateimplv7.a);
                        appcompatdelegateimplv7.y.setBackgroundColor(appcompatdelegateimplv7.a.getResources().getColor(android.support.v7.appcompat.a.c.abc_input_method_navigation_guard));
                        appcompatdelegateimplv7.w.addView(appcompatdelegateimplv7.y, -1, new android.view.ViewGroup.LayoutParams(-1, i1));
                        j1 = 1;
                    } else
                    {
                        android.view.ViewGroup.LayoutParams layoutparams = appcompatdelegateimplv7.y.getLayoutParams();
                        if (layoutparams.height != i1)
                        {
                            layoutparams.height = i1;
                            appcompatdelegateimplv7.y.setLayoutParams(layoutparams);
                        }
                        j1 = 1;
                    }
                } else
                {
                    j1 = 0;
                }
                if (appcompatdelegateimplv7.y == null)
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
                appcompatdelegateimplv7.n.setLayoutParams(marginlayoutparams);
            }
        } else
        {
            j1 = 0;
        }
        if (appcompatdelegateimplv7.y != null)
        {
            appcompatdelegateimplv7 = appcompatdelegateimplv7.y;
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
        if (D != null && D != panelfeaturestate)
        {
            a(D, false);
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
        if (i1 && r != null)
        {
            r.setMenuPrepared();
        }
        if (panelfeaturestate.i != null || i1 && (super.f instanceof android.support.v7.internal.app.b)) goto _L4; else goto _L3
_L3:
        if (panelfeaturestate.j != null && !panelfeaturestate.r) goto _L6; else goto _L5
_L5:
        if (panelfeaturestate.j != null)
        {
            break; /* Loop/switch isn't completed */
        }
        context = a;
        if (panelfeaturestate.a != 0 && panelfeaturestate.a != 108 || r == null)
        {
            break MISSING_BLOCK_LABEL_649;
        }
        TypedValue typedvalue = new TypedValue();
        android.content.res.Resources.Theme theme1 = context.getTheme();
        theme1.resolveAttribute(android.support.v7.appcompat.a.a.actionBarTheme, typedvalue, true);
        if (typedvalue.resourceId != 0)
        {
            obj = context.getResources().newTheme();
            ((android.content.res.Resources.Theme) (obj)).setTo(theme1);
            ((android.content.res.Resources.Theme) (obj)).applyStyle(typedvalue.resourceId, true);
            ((android.content.res.Resources.Theme) (obj)).resolveAttribute(android.support.v7.appcompat.a.a.actionBarWidgetTheme, typedvalue, true);
        } else
        {
            theme1.resolveAttribute(android.support.v7.appcompat.a.a.actionBarWidgetTheme, typedvalue, true);
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
            break MISSING_BLOCK_LABEL_649;
        }
        obj = new android.support.v7.internal.view.b(context, 0);
        ((Context) (obj)).getTheme().setTo(theme);
_L8:
        obj = new f(((Context) (obj)));
        ((f) (obj)).a(this);
        panelfeaturestate.a(((f) (obj)));
        if (panelfeaturestate.j == null) goto _L1; else goto _L7
_L7:
label0:
        {
            if (i1 && r != null)
            {
                if (s == null)
                {
                    s = new a((byte)0);
                }
                r.setMenu(panelfeaturestate.j, s);
            }
            panelfeaturestate.j.g();
            if (callback.onCreatePanelMenu(panelfeaturestate.a, panelfeaturestate.j))
            {
                break label0;
            }
            panelfeaturestate.a(null);
            if (i1 && r != null)
            {
                r.setMenu(null, s);
                return false;
            }
        }
          goto _L1
        panelfeaturestate.r = false;
_L6:
        panelfeaturestate.j.g();
        if (panelfeaturestate.s != null)
        {
            panelfeaturestate.j.d(panelfeaturestate.s);
            panelfeaturestate.s = null;
        }
        if (!callback.onPreparePanel(0, panelfeaturestate.i, panelfeaturestate.j))
        {
            if (i1 && r != null)
            {
                r.setMenu(null, s);
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
        D = panelfeaturestate;
        return true;
        obj = context;
          goto _L8
    }

    static boolean b(AppCompatDelegateImplV7 appcompatdelegateimplv7)
    {
        appcompatdelegateimplv7.E = false;
        return false;
    }

    static int c(AppCompatDelegateImplV7 appcompatdelegateimplv7)
    {
        appcompatdelegateimplv7.F = 0;
        return 0;
    }

    static void d(AppCompatDelegateImplV7 appcompatdelegateimplv7)
    {
        appcompatdelegateimplv7.q();
    }

    private PanelFeatureState e(int i1)
    {
        PanelFeatureState apanelfeaturestate[];
label0:
        {
            PanelFeatureState apanelfeaturestate1[] = C;
            if (apanelfeaturestate1 != null)
            {
                apanelfeaturestate = apanelfeaturestate1;
                if (apanelfeaturestate1.length > i1)
                {
                    break label0;
                }
            }
            PanelFeatureState apanelfeaturestate2[] = new PanelFeatureState[i1 + 1];
            if (apanelfeaturestate1 != null)
            {
                System.arraycopy(apanelfeaturestate1, 0, apanelfeaturestate2, 0, apanelfeaturestate1.length);
            }
            apanelfeaturestate = apanelfeaturestate2;
            C = apanelfeaturestate2;
        }
        PanelFeatureState panelfeaturestate1 = apanelfeaturestate[i1];
        PanelFeatureState panelfeaturestate = panelfeaturestate1;
        if (panelfeaturestate1 == null)
        {
            panelfeaturestate = new PanelFeatureState(i1);
            apanelfeaturestate[i1] = panelfeaturestate;
        }
        return panelfeaturestate;
    }

    static void e(AppCompatDelegateImplV7 appcompatdelegateimplv7)
    {
        appcompatdelegateimplv7.a(appcompatdelegateimplv7.e(0), true);
    }

    private void f(int i1)
    {
        F = F | 1 << i1;
        if (!E && v != null)
        {
            android.support.v4.view.x.a(v, G);
            E = true;
        }
    }

    private void p()
    {
        if (!u)
        {
            Object obj = a.obtainStyledAttributes(android.support.v7.appcompat.a.k.Theme);
            if (!((TypedArray) (obj)).hasValue(android.support.v7.appcompat.a.k.Theme_windowActionBar))
            {
                ((TypedArray) (obj)).recycle();
                throw new IllegalStateException("You need to use a Theme.AppCompat theme (or descendant) with this activity.");
            }
            if (((TypedArray) (obj)).getBoolean(android.support.v7.appcompat.a.k.Theme_windowNoTitle, false))
            {
                b(1);
            } else
            if (((TypedArray) (obj)).getBoolean(android.support.v7.appcompat.a.k.Theme_windowActionBar, false))
            {
                b(108);
            }
            if (((TypedArray) (obj)).getBoolean(android.support.v7.appcompat.a.k.Theme_windowActionBarOverlay, false))
            {
                b(109);
            }
            if (((TypedArray) (obj)).getBoolean(android.support.v7.appcompat.a.k.Theme_windowActionModeOverlay, false))
            {
                b(10);
            }
            k = ((TypedArray) (obj)).getBoolean(android.support.v7.appcompat.a.k.Theme_android_windowIsFloating, false);
            ((TypedArray) (obj)).recycle();
            obj = LayoutInflater.from(a);
            Object obj1;
            ContentFrameLayout contentframelayout;
            if (!l)
            {
                if (k)
                {
                    obj = (ViewGroup)((LayoutInflater) (obj)).inflate(android.support.v7.appcompat.a.h.abc_dialog_title_material, null);
                    i = false;
                    h = false;
                } else
                if (h)
                {
                    obj = new TypedValue();
                    a.getTheme().resolveAttribute(android.support.v7.appcompat.a.a.actionBarTheme, ((TypedValue) (obj)), true);
                    if (((TypedValue) (obj)).resourceId != 0)
                    {
                        obj = new android.support.v7.internal.view.b(a, ((TypedValue) (obj)).resourceId);
                    } else
                    {
                        obj = a;
                    }
                    obj = (ViewGroup)LayoutInflater.from(((Context) (obj))).inflate(android.support.v7.appcompat.a.h.abc_screen_toolbar, null);
                    r = (android.support.v7.internal.widget.f)((ViewGroup) (obj)).findViewById(android.support.v7.appcompat.a.f.decor_content_parent);
                    r.setWindowCallback(super.b.getCallback());
                    if (i)
                    {
                        r.a(109);
                    }
                    if (z)
                    {
                        r.a(2);
                    }
                    if (A)
                    {
                        r.a(5);
                    }
                } else
                {
                    obj = null;
                }
            } else
            {
                if (j)
                {
                    obj = (ViewGroup)((LayoutInflater) (obj)).inflate(android.support.v7.appcompat.a.h.abc_screen_simple_overlay_action_mode, null);
                } else
                {
                    obj = (ViewGroup)((LayoutInflater) (obj)).inflate(android.support.v7.appcompat.a.h.abc_screen_simple, null);
                }
                if (android.os.Build.VERSION.SDK_INT >= 21)
                {
                    android.support.v4.view.x.a(((View) (obj)), new android.support.v4.view.r() {

                        final AppCompatDelegateImplV7 a;

                        public final am a(View view1, am am1)
                        {
                            int i1 = am1.b();
                            int j1 = android.support.v7.app.AppCompatDelegateImplV7.b(a, i1);
                            am am2 = am1;
                            if (i1 != j1)
                            {
                                am2 = am1.a(am1.a(), j1, am1.c(), am1.d());
                            }
                            return android.support.v4.view.x.a(view1, am2);
                        }

            
            {
                a = AppCompatDelegateImplV7.this;
                super();
            }
                    });
                } else
                {
                    ((i)obj).setOnFitSystemWindowsListener(new android.support.v7.internal.widget.i.a() {

                        final AppCompatDelegateImplV7 a;

                        public final void a(Rect rect)
                        {
                            rect.top = android.support.v7.app.AppCompatDelegateImplV7.b(a, rect.top);
                        }

            
            {
                a = AppCompatDelegateImplV7.this;
                super();
            }
                    });
                }
            }
            if (obj == null)
            {
                throw new IllegalArgumentException((new StringBuilder("AppCompat does not support the current theme features: { windowActionBar: ")).append(h).append(", windowActionBarOverlay: ").append(i).append(", android:windowIsFloating: ").append(k).append(", windowActionModeOverlay: ").append(j).append(", windowNoTitle: ").append(l).append(" }").toString());
            }
            if (r == null)
            {
                x = (TextView)((ViewGroup) (obj)).findViewById(android.support.v7.appcompat.a.f.title);
            }
            android.support.v7.internal.widget.r.b(((View) (obj)));
            obj1 = (ViewGroup)b.findViewById(0x1020002);
            contentframelayout = (ContentFrameLayout)((ViewGroup) (obj)).findViewById(android.support.v7.appcompat.a.f.action_bar_activity_content);
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
            w = ((ViewGroup) (obj));
            obj = o();
            if (!TextUtils.isEmpty(((CharSequence) (obj))))
            {
                b(((CharSequence) (obj)));
            }
            obj = (ContentFrameLayout)w.findViewById(0x1020002);
            ((ContentFrameLayout) (obj)).setDecorPadding(v.getPaddingLeft(), v.getPaddingTop(), v.getPaddingRight(), v.getPaddingBottom());
            obj1 = a.obtainStyledAttributes(android.support.v7.appcompat.a.k.Theme);
            ((TypedArray) (obj1)).getValue(android.support.v7.appcompat.a.k.Theme_windowMinWidthMajor, ((ContentFrameLayout) (obj)).a());
            ((TypedArray) (obj1)).getValue(android.support.v7.appcompat.a.k.Theme_windowMinWidthMinor, ((ContentFrameLayout) (obj)).b());
            if (((TypedArray) (obj1)).hasValue(android.support.v7.appcompat.a.k.Theme_windowFixedWidthMajor))
            {
                ((TypedArray) (obj1)).getValue(android.support.v7.appcompat.a.k.Theme_windowFixedWidthMajor, ((ContentFrameLayout) (obj)).c());
            }
            if (((TypedArray) (obj1)).hasValue(android.support.v7.appcompat.a.k.Theme_windowFixedWidthMinor))
            {
                ((TypedArray) (obj1)).getValue(android.support.v7.appcompat.a.k.Theme_windowFixedWidthMinor, ((ContentFrameLayout) (obj)).d());
            }
            if (((TypedArray) (obj1)).hasValue(android.support.v7.appcompat.a.k.Theme_windowFixedHeightMajor))
            {
                ((TypedArray) (obj1)).getValue(android.support.v7.appcompat.a.k.Theme_windowFixedHeightMajor, ((ContentFrameLayout) (obj)).e());
            }
            if (((TypedArray) (obj1)).hasValue(android.support.v7.appcompat.a.k.Theme_windowFixedHeightMinor))
            {
                ((TypedArray) (obj1)).getValue(android.support.v7.appcompat.a.k.Theme_windowFixedHeightMinor, ((ContentFrameLayout) (obj)).f());
            }
            ((TypedArray) (obj1)).recycle();
            ((ContentFrameLayout) (obj)).requestLayout();
            u = true;
            obj = e(0);
            if (!n() && (obj == null || ((PanelFeatureState) (obj)).j == null))
            {
                f(108);
            }
        }
    }

    private void q()
    {
        if (q != null)
        {
            q.d();
        }
    }

    private void r()
    {
        if (u)
        {
            throw new AndroidRuntimeException("Window feature must be requested before adding content");
        } else
        {
            return;
        }
    }

    public final android.support.v7.view.a a(android.support.v7.view.a.a a1)
    {
        if (a1 == null)
        {
            throw new IllegalArgumentException("ActionMode callback can not be null.");
        }
        if (m != null)
        {
            m.c();
        }
        a1 = new b(a1);
        ActionBar actionbar = a();
        if (actionbar != null)
        {
            m = actionbar.a(a1);
            if (m != null && e != null)
            {
                e.onSupportActionModeStarted(m);
            }
        }
        if (m == null)
        {
            m = b(a1);
        }
        return m;
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
        p();
        ViewGroup viewgroup = (ViewGroup)w.findViewById(0x1020002);
        viewgroup.removeAllViews();
        LayoutInflater.from(a).inflate(i1, viewgroup);
        c.onContentChanged();
    }

    public final void a(Configuration configuration)
    {
        if (h && u)
        {
            ActionBar actionbar = a();
            if (actionbar != null)
            {
                actionbar.a(configuration);
            }
        }
    }

    public final void a(Toolbar toolbar)
    {
        if (!(c instanceof Activity))
        {
            return;
        }
        if (a() instanceof android.support.v7.internal.app.c)
        {
            throw new IllegalStateException("This Activity already has an action bar supplied by the window decor. Do not request Window.FEATURE_SUPPORT_ACTION_BAR and set windowActionBar to false in your theme to use a Toolbar instead.");
        } else
        {
            g = null;
            toolbar = new android.support.v7.internal.app.b(toolbar, ((Activity)a).getTitle(), d);
            f = toolbar;
            b.setCallback(toolbar.m());
            toolbar.k();
            return;
        }
    }

    public final void a(View view)
    {
        p();
        ViewGroup viewgroup = (ViewGroup)w.findViewById(0x1020002);
        viewgroup.removeAllViews();
        viewgroup.addView(view);
        c.onContentChanged();
    }

    public final void a(View view, android.view.ViewGroup.LayoutParams layoutparams)
    {
        p();
        ViewGroup viewgroup = (ViewGroup)w.findViewById(0x1020002);
        viewgroup.removeAllViews();
        viewgroup.addView(view, layoutparams);
        c.onContentChanged();
    }

    final boolean a(int i1, KeyEvent keyevent)
    {
        ActionBar actionbar = a();
        if (actionbar == null || !actionbar.a(i1, keyevent)) goto _L2; else goto _L1
_L1:
        return true;
_L2:
        if (D == null || !a(D, keyevent.getKeyCode(), keyevent))
        {
            break; /* Loop/switch isn't completed */
        }
        if (D != null)
        {
            D.n = true;
            return true;
        }
        if (true) goto _L1; else goto _L3
_L3:
        boolean flag;
        if (D != null)
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
    //                   4: 360
    //                   82: 146;
           goto _L5 _L6 _L7
_L5:
        return false;
_L7:
        if (m != null) goto _L9; else goto _L8
_L8:
        PanelFeatureState panelfeaturestate1 = e(0);
        boolean flag2;
        if (r != null && r.c() && !ab.b(ViewConfiguration.get(a)))
        {
            if (!r.d())
            {
                if (n() || !b(panelfeaturestate1, keyevent))
                {
                    break MISSING_BLOCK_LABEL_433;
                }
                flag2 = r.f();
            } else
            {
                flag2 = r.g();
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
                break MISSING_BLOCK_LABEL_433;
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
                break MISSING_BLOCK_LABEL_433;
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
            } else
            {
                Log.w("AppCompatDelegate", "Couldn't get audio manager");
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
        if (m != null)
        {
            m.c();
            flag1 = true;
        } else
        {
            keyevent = a();
            if (keyevent != null && keyevent.l())
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

    final android.support.v7.view.a b(android.support.v7.view.a.a a1)
    {
        q();
        if (m != null)
        {
            m.c();
        }
        b b1 = new b(a1);
        Object obj1 = null;
        Object obj = obj1;
        if (e != null)
        {
            obj = obj1;
            android.content.res.Resources.Theme theme;
            int i1;
            boolean flag;
            if (!n())
            {
                try
                {
                    obj = e.onWindowStartingSupportActionMode(b1);
                }
                catch (AbstractMethodError abstractmethoderror)
                {
                    abstractmethoderror = ((AbstractMethodError) (obj1));
                }
            }
        }
        if (obj == null) goto _L2; else goto _L1
_L1:
        m = ((android.support.v7.view.a) (obj));
_L4:
        if (m != null && e != null)
        {
            e.onSupportActionModeStarted(m);
        }
        return m;
_L2:
        if (n == null)
        {
            if (k)
            {
                obj1 = new TypedValue();
                obj = a.getTheme();
                ((android.content.res.Resources.Theme) (obj)).resolveAttribute(android.support.v7.appcompat.a.a.actionBarTheme, ((TypedValue) (obj1)), true);
                if (((TypedValue) (obj1)).resourceId != 0)
                {
                    theme = a.getResources().newTheme();
                    theme.setTo(((android.content.res.Resources.Theme) (obj)));
                    theme.applyStyle(((TypedValue) (obj1)).resourceId, true);
                    obj = new android.support.v7.internal.view.b(a, 0);
                    ((Context) (obj)).getTheme().setTo(theme);
                } else
                {
                    obj = a;
                }
                n = new ActionBarContextView(((Context) (obj)));
                o = new PopupWindow(((Context) (obj)), null, android.support.v7.appcompat.a.a.actionModePopupWindowStyle);
                l.a(o);
                o.setContentView(n);
                o.setWidth(-1);
                ((Context) (obj)).getTheme().resolveAttribute(android.support.v7.appcompat.a.a.actionBarSize, ((TypedValue) (obj1)), true);
                i1 = TypedValue.complexToDimensionPixelSize(((TypedValue) (obj1)).data, ((Context) (obj)).getResources().getDisplayMetrics());
                n.setContentHeight(i1);
                o.setHeight(-2);
                p = new Runnable() {

                    final AppCompatDelegateImplV7 a;

                    public final void run()
                    {
                        a.o.showAtLocation(a.n, 55, 0, 0);
                        AppCompatDelegateImplV7.d(a);
                        android.support.v4.view.x.c(a.n, 0.0F);
                        a.q = android.support.v4.view.x.s(a.n).a(1.0F);
                        a.q.a(new ak(this) {

                            final _cls4 a;

                            public final void a(View view)
                            {
                                a.a.n.setVisibility(0);
                            }

                            public final void b(View view)
                            {
                                android.support.v4.view.x.c(a.a.n, 1.0F);
                                a.a.q.a(null);
                                a.a.q = null;
                            }

            
            {
                a = _pcls4;
                super();
            }
                        });
                    }

            
            {
                a = AppCompatDelegateImplV7.this;
                super();
            }
                };
            } else
            {
                obj = (ViewStubCompat)w.findViewById(android.support.v7.appcompat.a.f.action_mode_bar_stub);
                if (obj != null)
                {
                    ((ViewStubCompat) (obj)).setLayoutInflater(LayoutInflater.from(l()));
                    n = (ActionBarContextView)((ViewStubCompat) (obj)).a();
                }
            }
        }
        if (n != null)
        {
            q();
            n.e();
            obj = n.getContext();
            obj1 = n;
            if (o == null)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            obj = new android.support.v7.internal.view.c(((Context) (obj)), ((ActionBarContextView) (obj1)), b1, flag);
            if (a1.a(((android.support.v7.view.a) (obj)), ((android.support.v7.view.a) (obj)).b()))
            {
                ((android.support.v7.view.a) (obj)).d();
                n.a(((android.support.v7.view.a) (obj)));
                m = ((android.support.v7.view.a) (obj));
                android.support.v4.view.x.c(n, 0.0F);
                q = android.support.v4.view.x.s(n).a(1.0F);
                q.a(new ak() {

                    final AppCompatDelegateImplV7 a;

                    public final void a(View view)
                    {
                        a.n.setVisibility(0);
                        a.n.sendAccessibilityEvent(32);
                        if (a.n.getParent() != null)
                        {
                            android.support.v4.view.x.w((View)a.n.getParent());
                        }
                    }

                    public final void b(View view)
                    {
                        android.support.v4.view.x.c(a.n, 1.0F);
                        a.q.a(null);
                        a.q = null;
                    }

            
            {
                a = AppCompatDelegateImplV7.this;
                super();
            }
                });
                if (o != null)
                {
                    b.getDecorView().post(p);
                }
            } else
            {
                m = null;
            }
        }
        continue; /* Loop/switch isn't completed */
        if (true) goto _L4; else goto _L3
_L3:
    }

    public final void b(View view, android.view.ViewGroup.LayoutParams layoutparams)
    {
        p();
        ((ViewGroup)w.findViewById(0x1020002)).addView(view, layoutparams);
        c.onContentChanged();
    }

    final void b(CharSequence charsequence)
    {
        if (r != null)
        {
            r.setWindowTitle(charsequence);
        } else
        {
            if (super.f != null)
            {
                super.f.b(charsequence);
                return;
            }
            if (x != null)
            {
                x.setText(charsequence);
                return;
            }
        }
    }

    public final boolean b(int i1)
    {
        if (i1 != 8) goto _L2; else goto _L1
_L1:
        int j1;
        Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR id when requesting this feature.");
        j1 = 108;
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
            Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR_OVERLAY id when requesting this feature.");
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
            r();
            h = true;
            return true;

        case 109: // 'm'
            r();
            i = true;
            return true;

        case 10: // '\n'
            r();
            j = true;
            return true;

        case 2: // '\002'
            r();
            z = true;
            return true;

        case 5: // '\005'
            r();
            A = true;
            return true;

        case 1: // '\001'
            r();
            l = true;
            return true;
        }
    }

    public final void c()
    {
        ActionBar actionbar;
label0:
        {
            v = (ViewGroup)b.getDecorView();
            if ((c instanceof Activity) && android.support.v4.app.t.b((Activity)c) != null)
            {
                actionbar = super.f;
                if (actionbar != null)
                {
                    break label0;
                }
                H = true;
            }
            return;
        }
        actionbar.c(true);
    }

    final void c(int i1)
    {
        if (i1 == 108)
        {
            ActionBar actionbar = a();
            if (actionbar != null)
            {
                actionbar.e(false);
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
        p();
    }

    final boolean d(int i1)
    {
        if (i1 == 108)
        {
            ActionBar actionbar = a();
            if (actionbar != null)
            {
                actionbar.e(true);
            }
            return true;
        } else
        {
            return false;
        }
    }

    public final void e()
    {
        ActionBar actionbar = a();
        if (actionbar != null)
        {
            actionbar.d(false);
        }
    }

    public final void f()
    {
        ActionBar actionbar = a();
        if (actionbar != null)
        {
            actionbar.d(true);
        }
    }

    public final void g()
    {
        ActionBar actionbar = a();
        if (actionbar != null && actionbar.k())
        {
            return;
        } else
        {
            f(0);
            return;
        }
    }

    public final void j()
    {
        LayoutInflater layoutinflater = LayoutInflater.from(a);
        if (layoutinflater.getFactory() == null)
        {
            android.support.v4.view.g.a(layoutinflater, this);
            return;
        } else
        {
            Log.i("AppCompatDelegate", "The Activity's LayoutInflater already has a Factory installed so we can not install AppCompat's");
            return;
        }
    }

    public final void k()
    {
        p();
        if (h && f == null)
        {
            if (c instanceof Activity)
            {
                f = new android.support.v7.internal.app.c((Activity)c, i);
            } else
            if (c instanceof Dialog)
            {
                f = new android.support.v7.internal.app.c((Dialog)c);
            }
            if (f != null)
            {
                f.c(H);
                return;
            }
        }
    }

    public final View onCreateView(View view, String s1, Context context, AttributeSet attributeset)
    {
        Object obj;
        boolean flag;
        boolean flag2;
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
        if (K == null)
        {
            K = new android.support.v7.internal.app.a();
        }
        if (!flag1 || !u)
        {
            break MISSING_BLOCK_LABEL_158;
        }
        obj = (ViewParent)view;
        if (obj != null) goto _L2; else goto _L1
_L1:
        flag = false;
_L3:
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_158;
        }
        flag2 = true;
_L6:
        return K.a(view, s1, context, attributeset, flag2, flag1);
_L5:
        obj = ((ViewParent) (obj)).getParent();
_L2:
        if (obj != null)
        {
            continue; /* Loop/switch isn't completed */
        }
        flag = true;
          goto _L3
        if (obj != v && (obj instanceof View) && !android.support.v4.view.x.G((View)obj)) goto _L5; else goto _L4
_L4:
        flag = false;
          goto _L3
        flag2 = false;
          goto _L6
    }

    public boolean onMenuItemSelected(f f1, MenuItem menuitem)
    {
        android.view.Window.Callback callback = super.b.getCallback();
        if (callback != null && !n())
        {
            f1 = a(f1.o());
            if (f1 != null)
            {
                return callback.onMenuItemSelected(((PanelFeatureState) (f1)).a, menuitem);
            }
        }
        return false;
    }

    public void onMenuModeChange(f f1)
    {
        if (r == null || !r.c() || ab.b(ViewConfiguration.get(a)) && !r.e())
        {
            break MISSING_BLOCK_LABEL_208;
        }
        f1 = super.b.getCallback();
        if (r.d()) goto _L2; else goto _L1
_L1:
        if (f1 != null && !n())
        {
            if (E && (F & 1) != 0)
            {
                v.removeCallbacks(G);
                G.run();
            }
            PanelFeatureState panelfeaturestate = e(0);
            if (panelfeaturestate.j != null && !panelfeaturestate.r && f1.onPreparePanel(0, panelfeaturestate.i, panelfeaturestate.j))
            {
                f1.onMenuOpened(108, panelfeaturestate.j);
                r.f();
            }
        }
_L4:
        return;
_L2:
        r.g();
        if (n()) goto _L4; else goto _L3
_L3:
        f1.onPanelClosed(108, e(0).j);
        return;
        f1 = e(0);
        f1.q = true;
        a(f1, false);
        a(f1, ((KeyEvent) (null)));
        return;
    }
}
