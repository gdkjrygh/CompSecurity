// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.ui;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.support.v7.app.ActionBar;
import android.support.v7.widget.Toolbar;
import android.util.TypedValue;
import android.view.View;
import com.spotify.mobile.android.ui.view.MainLayout;
import com.spotify.music.MainActivity;
import ctz;
import dcr;
import dct;
import dft;
import dgo;
import fnx;
import fnz;
import fob;
import foc;
import fog;
import fok;
import gay;
import gcg;
import gcl;
import gfv;
import ggi;
import java.util.ArrayList;
import rf;

// Referenced classes of package com.spotify.mobile.android.ui:
//            ActionBarTitle

public final class ActionBarManager
{

    rf a;
    public ActionBar b;
    public Drawable c;
    final Drawable d = a(0x7f02024f);
    final Drawable e = a(0x7f020250);
    public boolean f;
    public ActionBarTitle g;
    public float h;
    final fog i;
    public fnz j;
    public State k;
    public final foc l = new foc(this);
    private final dcr m;
    private View n;
    private ActionBarTitle o;
    private final MainLayout p;
    private final gay q = new gay() {

        private ActionBarManager a;

        public final void a(boolean flag)
        {
            ActionBarManager actionbarmanager = a;
            ActionBar actionbar = actionbarmanager.b;
            Object obj;
            if (flag)
            {
                obj = actionbarmanager.e;
            } else
            {
                obj = actionbarmanager.d;
            }
            actionbar.a(((Drawable) (obj)));
            if (flag)
            {
                obj = State.a;
            } else
            {
                obj = State.b;
            }
            actionbarmanager.k = ((State) (obj));
            actionbarmanager.j.a(flag);
        }

        public final boolean a(View view)
        {
            Object obj;
            int j1;
            obj = a.i;
            j1 = ((fog) (obj)).c.size() - 1;
_L9:
            if (j1 < 0) goto _L2; else goto _L1
_L1:
            fok fok1 = (fok)((fog) (obj)).c.get(j1);
            if (fok1.a() == 0) goto _L2; else goto _L3
_L3:
            if (fok1.b() != view) goto _L5; else goto _L4
_L4:
            view = fok1.c();
_L7:
            obj = a.a;
            if (obj == null || view == null)
            {
                return false;
            }
            break; /* Loop/switch isn't completed */
_L5:
            j1--;
            continue; /* Loop/switch isn't completed */
_L2:
            view = null;
            if (true) goto _L7; else goto _L6
_L6:
            view = (fnx)view.getAnnotation(fnx);
            if (view != null)
            {
                boolean flag;
                if (ggi.b(((Context) (obj))) && view.b() || ggi.a(((Context) (obj))) && view.a())
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                if (flag)
                {
                    return true;
                }
            }
            return false;
            if (true) goto _L9; else goto _L8
_L8:
        }

            
            {
                a = ActionBarManager.this;
                super();
            }
    };

    public ActionBarManager(MainActivity mainactivity)
    {
        k = State.b;
        j = new fob(this);
        a = mainactivity;
        Toolbar toolbar = (Toolbar)mainactivity.findViewById(0x7f110400);
        mainactivity.a(toolbar);
        m = dct.a(mainactivity, toolbar);
        b = mainactivity.f();
        n = mainactivity.findViewById(0x7f1103ff);
        TypedArray typedarray = a.obtainStyledAttributes(new int[] {
            0x7f0100e6
        });
        int i1 = typedarray.getResourceId(0, 0);
        typedarray.recycle();
        typedarray = a.obtainStyledAttributes(i1, new int[] {
            0x7f010030
        });
        c = typedarray.getDrawable(0);
        typedarray.recycle();
        if (n != null)
        {
            b.b(null);
            dgo.a(n, c);
        } else
        {
            b.b(c);
        }
        ctz.a(c);
        if (n != null)
        {
            n.getLayoutParams().height = a(mainactivity);
        }
        p = (MainLayout)mainactivity.findViewById(0x7f11032d);
        i = mainactivity.e;
        a();
        if (gcl.i)
        {
            android.widget.FrameLayout.LayoutParams layoutparams = (android.widget.FrameLayout.LayoutParams)toolbar.getLayoutParams();
            layoutparams.topMargin = gfv.c(mainactivity);
            toolbar.setLayoutParams(layoutparams);
        }
        b.b();
        b.a();
        b.a(true);
        b.g();
        b.a(d);
    }

    public static int a(Context context)
    {
        TypedValue typedvalue = new TypedValue();
        int i1;
        if (!context.getTheme().resolveAttribute(0x7f0100ea, typedvalue, true))
        {
            i1 = 0;
        } else
        {
            int j1 = TypedValue.complexToDimensionPixelSize(typedvalue.data, context.getResources().getDisplayMetrics());
            i1 = j1;
            if (gfv.b(context))
            {
                return j1 + gfv.c(context);
            }
        }
        return i1;
    }

    private Drawable a(int i1)
    {
        Object obj = a.getResources();
        Drawable drawable = gcg.a(a, i1);
        i1 = dft.b(4F, ((Resources) (obj)));
        int j1 = dft.b(4F, ((Resources) (obj)));
        obj = new LayerDrawable(new Drawable[] {
            drawable
        });
        ((LayerDrawable) (obj)).setLayerInset(0, i1, 0, j1, 0);
        return ((Drawable) (obj));
    }

    public final void a()
    {
        p.b = q;
    }

    public final void a(float f1)
    {
        if (k == State.b)
        {
            return;
        } else
        {
            int i1 = (int)((float)State.a(State.b) * f1);
            c.setAlpha(i1);
            return;
        }
    }

    public final void a(ActionBarTitle actionbartitle)
    {
        o = actionbartitle;
        b();
    }

    public final void b()
    {
        b(h);
    }

    public final void b(float f1)
    {
        boolean flag = false;
        float f2 = 1.0F;
        h = f1;
        j.a(f1);
        ActionBarTitle actionbartitle;
        if (f1 < 0.05F)
        {
            actionbartitle = o;
            f1 = f2;
        } else
        if (f1 < 0.5F)
        {
            actionbartitle = o;
            f1 = 1.0F - (f1 - 0.05F) / 0.45F;
        } else
        {
            actionbartitle = g;
            f1 = (f1 - 0.5F) / 0.5F;
            flag = true;
        }
        if (f != flag)
        {
            f = flag;
            a.q_();
        }
        if (actionbartitle != null)
        {
            actionbartitle.b = f1;
            m.a(actionbartitle.toString());
            dcr dcr1 = m;
            f1 = actionbartitle.a;
            dcr1.a(actionbartitle.b * f1);
            return;
        } else
        {
            m.a("");
            return;
        }
    }

    private class State extends Enum
    {

        public static final State a;
        public static final State b;
        private static final State c[];
        private final int mAlpha;

        public static int a(State state)
        {
            return state.mAlpha;
        }

        public static int b(State state)
        {
            return state.mAlpha;
        }

        public static State valueOf(String s)
        {
            return (State)Enum.valueOf(com/spotify/mobile/android/ui/ActionBarManager$State, s);
        }

        public static State[] values()
        {
            return (State[])c.clone();
        }

        static 
        {
            a = new State("TRANSPARENT", 0, 0);
            b = new State("OPAQUE", 1, 255);
            c = (new State[] {
                a, b
            });
        }

        private State(String s, int i1, int j1)
        {
            super(s, i1);
            mAlpha = j1;
        }
    }

}
