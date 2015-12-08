// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.app;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Message;
import android.support.v7.a.g;
import android.support.v7.a.l;
import android.support.v7.internal.widget.az;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.ScrollView;
import android.widget.TextView;

// Referenced classes of package android.support.v7.app:
//            c, i, ac, n

final class b
{

    private TextView A;
    private TextView B;
    private View C;
    private ListAdapter D;
    private int E;
    private int F;
    private int G;
    private int H;
    private int I;
    private int J;
    private int K;
    private int L;
    private Handler M;
    private final android.view.View.OnClickListener N = new c(this);
    private final Context a;
    private final ac b;
    private final Window c;
    private CharSequence d;
    private CharSequence e;
    private ListView f;
    private View g;
    private int h;
    private int i;
    private int j;
    private int k;
    private int l;
    private boolean m;
    private Button n;
    private CharSequence o;
    private Message p;
    private Button q;
    private CharSequence r;
    private Message s;
    private Button t;
    private CharSequence u;
    private Message v;
    private ScrollView w;
    private int x;
    private Drawable y;
    private ImageView z;

    public b(Context context, ac ac1, Window window)
    {
        m = false;
        x = 0;
        E = -1;
        L = 0;
        a = context;
        b = ac1;
        c = window;
        M = new i(ac1);
        context = context.obtainStyledAttributes(null, l.G, android.support.v7.a.b.n, 0);
        F = context.getResourceId(l.H, 0);
        G = context.getResourceId(l.I, 0);
        H = context.getResourceId(l.K, 0);
        I = context.getResourceId(l.L, 0);
        J = context.getResourceId(l.M, 0);
        K = context.getResourceId(l.J, 0);
        context.recycle();
    }

    static int a(b b1, int i1)
    {
        b1.E = i1;
        return i1;
    }

    static Button a(b b1)
    {
        return b1.n;
    }

    static ListAdapter a(b b1, ListAdapter listadapter)
    {
        b1.D = listadapter;
        return listadapter;
    }

    static ListView a(b b1, ListView listview)
    {
        b1.f = listview;
        return listview;
    }

    private static void a(Button button)
    {
        android.widget.LinearLayout.LayoutParams layoutparams = (android.widget.LinearLayout.LayoutParams)button.getLayoutParams();
        layoutparams.gravity = 1;
        layoutparams.weight = 0.5F;
        button.setLayoutParams(layoutparams);
    }

    static Message b(b b1)
    {
        return b1.p;
    }

    static Button c(b b1)
    {
        return b1.q;
    }

    private static boolean c(View view)
    {
        if (view.onCheckIsTextEditor())
        {
            return true;
        }
        if (!(view instanceof ViewGroup))
        {
            return false;
        }
        view = (ViewGroup)view;
        for (int i1 = view.getChildCount(); i1 > 0;)
        {
            int j1 = i1 - 1;
            i1 = j1;
            if (c(view.getChildAt(j1)))
            {
                return true;
            }
        }

        return false;
    }

    static Message d(b b1)
    {
        return b1.s;
    }

    static Button e(b b1)
    {
        return b1.t;
    }

    static Message f(b b1)
    {
        return b1.v;
    }

    static ac g(b b1)
    {
        return b1.b;
    }

    static Handler h(b b1)
    {
        return b1.M;
    }

    static int i(b b1)
    {
        return b1.H;
    }

    static int j(b b1)
    {
        return b1.I;
    }

    static int k(b b1)
    {
        return b1.J;
    }

    static int l(b b1)
    {
        return b1.K;
    }

    public final void a()
    {
        boolean flag2 = false;
        b.a().i();
        Object obj;
        Object obj1;
        FrameLayout framelayout;
        int i1;
        boolean flag;
        if (G != 0 && L == 1)
        {
            i1 = G;
        } else
        {
            i1 = F;
        }
        b.setContentView(i1);
        obj = (ViewGroup)c.findViewById(g.l);
        w = (ScrollView)c.findViewById(g.r);
        w.setFocusable(false);
        B = (TextView)c.findViewById(0x102000b);
        if (B != null)
        {
            if (e != null)
            {
                B.setText(e);
            } else
            {
                B.setVisibility(8);
                w.removeView(B);
                if (f != null)
                {
                    obj = (ViewGroup)w.getParent();
                    i1 = ((ViewGroup) (obj)).indexOfChild(w);
                    ((ViewGroup) (obj)).removeViewAt(i1);
                    ((ViewGroup) (obj)).addView(f, i1, new android.view.ViewGroup.LayoutParams(-1, -1));
                } else
                {
                    ((ViewGroup) (obj)).setVisibility(8);
                }
            }
        }
        n = (Button)c.findViewById(0x1020019);
        n.setOnClickListener(N);
        if (TextUtils.isEmpty(o))
        {
            n.setVisibility(8);
            i1 = 0;
        } else
        {
            n.setText(o);
            n.setVisibility(0);
            i1 = 1;
        }
        q = (Button)c.findViewById(0x102001a);
        q.setOnClickListener(N);
        if (TextUtils.isEmpty(r))
        {
            q.setVisibility(8);
        } else
        {
            q.setText(r);
            q.setVisibility(0);
            i1 |= 2;
        }
        t = (Button)c.findViewById(0x102001b);
        t.setOnClickListener(N);
        if (TextUtils.isEmpty(u))
        {
            t.setVisibility(8);
        } else
        {
            t.setText(u);
            t.setVisibility(0);
            i1 |= 4;
        }
        obj = a;
        obj1 = new TypedValue();
        ((Context) (obj)).getTheme().resolveAttribute(android.support.v7.a.b.m, ((TypedValue) (obj1)), true);
        if (((TypedValue) (obj1)).data != 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag)
        {
            if (i1 == 1)
            {
                a(n);
            } else
            if (i1 == 2)
            {
                a(q);
            } else
            if (i1 == 4)
            {
                a(t);
            }
        }
        if (i1 != 0)
        {
            i1 = 1;
        } else
        {
            i1 = 0;
        }
        obj = (ViewGroup)c.findViewById(g.x);
        obj1 = az.a(a, null, l.G, android.support.v7.a.b.n);
        if (C != null)
        {
            android.view.ViewGroup.LayoutParams layoutparams = new android.view.ViewGroup.LayoutParams(-1, -2);
            ((ViewGroup) (obj)).addView(C, 0, layoutparams);
            c.findViewById(g.w).setVisibility(8);
        } else
        {
            z = (ImageView)c.findViewById(0x1020006);
            boolean flag1;
            if (!TextUtils.isEmpty(d))
            {
                flag1 = true;
            } else
            {
                flag1 = false;
            }
            if (flag1)
            {
                A = (TextView)c.findViewById(g.j);
                A.setText(d);
                if (x != 0)
                {
                    z.setImageResource(x);
                } else
                if (y != null)
                {
                    z.setImageDrawable(y);
                } else
                {
                    A.setPadding(z.getPaddingLeft(), z.getPaddingTop(), z.getPaddingRight(), z.getPaddingBottom());
                    z.setVisibility(8);
                }
            } else
            {
                c.findViewById(g.w).setVisibility(8);
                z.setVisibility(8);
                ((ViewGroup) (obj)).setVisibility(8);
            }
        }
        obj = c.findViewById(g.k);
        if (i1 == 0)
        {
            ((View) (obj)).setVisibility(8);
            obj = c.findViewById(g.u);
            if (obj != null)
            {
                ((View) (obj)).setVisibility(0);
            }
        }
        framelayout = (FrameLayout)c.findViewById(g.n);
        if (g != null)
        {
            obj = g;
        } else
        if (h != 0)
        {
            obj = LayoutInflater.from(a).inflate(h, framelayout, false);
        } else
        {
            obj = null;
        }
        i1 = ((flag2) ? 1 : 0);
        if (obj != null)
        {
            i1 = 1;
        }
        if (i1 == 0 || !c(((View) (obj))))
        {
            c.setFlags(0x20000, 0x20000);
        }
        if (i1 != 0)
        {
            FrameLayout framelayout1 = (FrameLayout)c.findViewById(g.m);
            framelayout1.addView(((View) (obj)), new android.view.ViewGroup.LayoutParams(-1, -1));
            if (m)
            {
                framelayout1.setPadding(i, j, k, l);
            }
            if (f != null)
            {
                ((android.widget.LinearLayout.LayoutParams)framelayout.getLayoutParams()).weight = 0.0F;
            }
        } else
        {
            framelayout.setVisibility(8);
        }
        obj = f;
        if (obj != null && D != null)
        {
            ((ListView) (obj)).setAdapter(D);
            i1 = E;
            if (i1 >= 0)
            {
                ((ListView) (obj)).setItemChecked(i1, true);
                ((ListView) (obj)).setSelection(i1);
            }
        }
        ((az) (obj1)).b();
    }

    public final void a(int i1)
    {
        g = null;
        h = i1;
        m = false;
    }

    public final void a(int i1, CharSequence charsequence, android.content.DialogInterface.OnClickListener onclicklistener, Message message)
    {
        if (onclicklistener != null)
        {
            message = M.obtainMessage(i1, onclicklistener);
        }
        switch (i1)
        {
        default:
            throw new IllegalArgumentException("Button does not exist");

        case -1: 
            o = charsequence;
            p = message;
            return;

        case -2: 
            r = charsequence;
            s = message;
            return;

        case -3: 
            u = charsequence;
            v = message;
            return;
        }
    }

    public final void a(Drawable drawable)
    {
label0:
        {
            y = drawable;
            x = 0;
            if (z != null)
            {
                if (drawable == null)
                {
                    break label0;
                }
                z.setImageDrawable(drawable);
            }
            return;
        }
        z.setVisibility(8);
    }

    public final void a(View view)
    {
        C = view;
    }

    public final void a(View view, int i1, int j1, int k1, int l1)
    {
        g = view;
        h = 0;
        m = true;
        i = i1;
        j = j1;
        k = k1;
        l = l1;
    }

    public final void a(CharSequence charsequence)
    {
        d = charsequence;
        if (A != null)
        {
            A.setText(charsequence);
        }
    }

    public final boolean a(KeyEvent keyevent)
    {
        return w != null && w.executeKeyEvent(keyevent);
    }

    public final void b(int i1)
    {
label0:
        {
            y = null;
            x = i1;
            if (z != null)
            {
                if (i1 == 0)
                {
                    break label0;
                }
                z.setImageResource(x);
            }
            return;
        }
        z.setVisibility(8);
    }

    public final void b(View view)
    {
        g = view;
        h = 0;
        m = false;
    }

    public final void b(CharSequence charsequence)
    {
        e = charsequence;
        if (B != null)
        {
            B.setText(charsequence);
        }
    }

    public final boolean b(KeyEvent keyevent)
    {
        return w != null && w.executeKeyEvent(keyevent);
    }

    public final int c(int i1)
    {
        TypedValue typedvalue = new TypedValue();
        a.getTheme().resolveAttribute(i1, typedvalue, true);
        return typedvalue.resourceId;
    }
}
