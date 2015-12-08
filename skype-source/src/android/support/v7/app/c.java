// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.app;

import android.content.Context;
import android.content.DialogInterface;
import android.content.res.TypedArray;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Message;
import android.support.v7.internal.widget.p;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckedTextView;
import android.widget.CursorAdapter;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.ScrollView;
import android.widget.TextView;
import java.lang.ref.WeakReference;

// Referenced classes of package android.support.v7.app:
//            AppCompatDialog, e

final class android.support.v7.app.c
{
    public static final class a
    {

        public int A;
        public boolean B;
        public boolean C[];
        public boolean D;
        public boolean E;
        public int F;
        public android.content.DialogInterface.OnMultiChoiceClickListener G;
        public Cursor H;
        public String I;
        public String J;
        public android.widget.AdapterView.OnItemSelectedListener K;
        public boolean L;
        public final Context a;
        public final LayoutInflater b;
        public int c;
        public Drawable d;
        public int e;
        public CharSequence f;
        public View g;
        public CharSequence h;
        public CharSequence i;
        public android.content.DialogInterface.OnClickListener j;
        public CharSequence k;
        public android.content.DialogInterface.OnClickListener l;
        public CharSequence m;
        public android.content.DialogInterface.OnClickListener n;
        public boolean o;
        public android.content.DialogInterface.OnCancelListener p;
        public android.content.DialogInterface.OnDismissListener q;
        public android.content.DialogInterface.OnKeyListener r;
        public CharSequence s[];
        public ListAdapter t;
        public android.content.DialogInterface.OnClickListener u;
        public int v;
        public View w;
        public int x;
        public int y;
        public int z;

        public a(Context context)
        {
            c = 0;
            e = 0;
            B = false;
            F = -1;
            L = true;
            a = context;
            o = true;
            b = (LayoutInflater)context.getSystemService("layout_inflater");
        }
    }

    private static final class b extends Handler
    {

        private WeakReference a;

        public final void handleMessage(Message message)
        {
            switch (message.what)
            {
            case 0: // '\0'
            default:
                return;

            case -3: 
            case -2: 
            case -1: 
                ((android.content.DialogInterface.OnClickListener)message.obj).onClick((DialogInterface)a.get(), message.what);
                return;

            case 1: // '\001'
                ((DialogInterface)message.obj).dismiss();
                break;
            }
        }

        public b(DialogInterface dialoginterface)
        {
            a = new WeakReference(dialoginterface);
        }
    }

    private static final class c extends ArrayAdapter
    {

        public final long getItemId(int i1)
        {
            return (long)i1;
        }

        public final boolean hasStableIds()
        {
            return true;
        }

        public c(Context context, int i1, CharSequence acharsequence[])
        {
            super(context, i1, 0x1020014, acharsequence);
        }
    }


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
    private final android.view.View.OnClickListener N = new android.view.View.OnClickListener() {

        final android.support.v7.app.c a;

        public final void onClick(View view)
        {
            if (view == android.support.v7.app.c.a(a) && android.support.v7.app.c.b(a) != null)
            {
                view = Message.obtain(android.support.v7.app.c.b(a));
            } else
            if (view == android.support.v7.app.c.c(a) && android.support.v7.app.c.d(a) != null)
            {
                view = Message.obtain(android.support.v7.app.c.d(a));
            } else
            if (view == android.support.v7.app.c.e(a) && android.support.v7.app.c.f(a) != null)
            {
                view = Message.obtain(android.support.v7.app.c.f(a));
            } else
            {
                view = null;
            }
            if (view != null)
            {
                view.sendToTarget();
            }
            android.support.v7.app.c.h(a).obtainMessage(1, android.support.v7.app.c.g(a)).sendToTarget();
        }

            
            {
                a = android.support.v7.app.c.this;
                super();
            }
    };
    private final Context a;
    private final AppCompatDialog b;
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

    public android.support.v7.app.c(Context context, AppCompatDialog appcompatdialog, Window window)
    {
        m = false;
        x = 0;
        E = -1;
        L = 0;
        a = context;
        b = appcompatdialog;
        c = window;
        M = new b(appcompatdialog);
        context = context.obtainStyledAttributes(null, android.support.v7.appcompat.a.k.AlertDialog, android.support.v7.appcompat.a.a.alertDialogStyle, 0);
        F = context.getResourceId(android.support.v7.appcompat.a.k.AlertDialog_android_layout, 0);
        G = context.getResourceId(android.support.v7.appcompat.a.k.AlertDialog_buttonPanelSideLayout, 0);
        H = context.getResourceId(android.support.v7.appcompat.a.k.AlertDialog_listLayout, 0);
        I = context.getResourceId(android.support.v7.appcompat.a.k.AlertDialog_multiChoiceItemLayout, 0);
        J = context.getResourceId(android.support.v7.appcompat.a.k.AlertDialog_singleChoiceItemLayout, 0);
        K = context.getResourceId(android.support.v7.appcompat.a.k.AlertDialog_listItemLayout, 0);
        context.recycle();
    }

    static int a(android.support.v7.app.c c1, int i1)
    {
        c1.E = i1;
        return i1;
    }

    static Button a(android.support.v7.app.c c1)
    {
        return c1.n;
    }

    static ListAdapter a(android.support.v7.app.c c1, ListAdapter listadapter)
    {
        c1.D = listadapter;
        return listadapter;
    }

    static ListView a(android.support.v7.app.c c1, ListView listview)
    {
        c1.f = listview;
        return listview;
    }

    private static void a(Button button)
    {
        android.widget.LinearLayout.LayoutParams layoutparams = (android.widget.LinearLayout.LayoutParams)button.getLayoutParams();
        layoutparams.gravity = 1;
        layoutparams.weight = 0.5F;
        button.setLayoutParams(layoutparams);
    }

    static Message b(android.support.v7.app.c c1)
    {
        return c1.p;
    }

    static Button c(android.support.v7.app.c c1)
    {
        return c1.q;
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

    static Message d(android.support.v7.app.c c1)
    {
        return c1.s;
    }

    static Button e(android.support.v7.app.c c1)
    {
        return c1.t;
    }

    static Message f(android.support.v7.app.c c1)
    {
        return c1.v;
    }

    static AppCompatDialog g(android.support.v7.app.c c1)
    {
        return c1.b;
    }

    static Handler h(android.support.v7.app.c c1)
    {
        return c1.M;
    }

    static int i(android.support.v7.app.c c1)
    {
        return c1.H;
    }

    static int j(android.support.v7.app.c c1)
    {
        return c1.I;
    }

    static int k(android.support.v7.app.c c1)
    {
        return c1.J;
    }

    static int l(android.support.v7.app.c c1)
    {
        return c1.K;
    }

    public final void a()
    {
        boolean flag2 = false;
        b.a().b(1);
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
        obj = (ViewGroup)c.findViewById(android.support.v7.appcompat.a.f.contentPanel);
        w = (ScrollView)c.findViewById(android.support.v7.appcompat.a.f.scrollView);
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
        ((Context) (obj)).getTheme().resolveAttribute(android.support.v7.appcompat.a.a.alertDialogCenterButtons, ((TypedValue) (obj1)), true);
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
        obj = (ViewGroup)c.findViewById(android.support.v7.appcompat.a.f.topPanel);
        obj1 = android.support.v7.internal.widget.p.a(a, null, android.support.v7.appcompat.a.k.AlertDialog, android.support.v7.appcompat.a.a.alertDialogStyle);
        if (C != null)
        {
            android.view.ViewGroup.LayoutParams layoutparams = new android.view.ViewGroup.LayoutParams(-1, -2);
            ((ViewGroup) (obj)).addView(C, 0, layoutparams);
            c.findViewById(android.support.v7.appcompat.a.f.title_template).setVisibility(8);
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
                A = (TextView)c.findViewById(android.support.v7.appcompat.a.f.alertTitle);
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
                c.findViewById(android.support.v7.appcompat.a.f.title_template).setVisibility(8);
                z.setVisibility(8);
                ((ViewGroup) (obj)).setVisibility(8);
            }
        }
        obj = c.findViewById(android.support.v7.appcompat.a.f.buttonPanel);
        if (i1 == 0)
        {
            ((View) (obj)).setVisibility(8);
            obj = c.findViewById(android.support.v7.appcompat.a.f.textSpacerNoButtons);
            if (obj != null)
            {
                ((View) (obj)).setVisibility(0);
            }
        }
        framelayout = (FrameLayout)c.findViewById(android.support.v7.appcompat.a.f.customPanel);
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
            FrameLayout framelayout1 = (FrameLayout)c.findViewById(android.support.v7.appcompat.a.f.custom);
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
        ((p) (obj1)).b();
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

    // Unreferenced inner class android/support/v7/app/c$a$1

/* anonymous class */
    final class a._cls1 extends ArrayAdapter
    {

        final ListView a;
        final a b;

        public final View getView(int i1, View view, ViewGroup viewgroup)
        {
            view = super.getView(i1, view, viewgroup);
            if (b.C != null && b.C[i1])
            {
                a.setItemChecked(i1, true);
            }
            return view;
        }

            
            {
                b = a1;
                a = listview;
                super(context, i1, 0x1020014, acharsequence);
            }
    }


    // Unreferenced inner class android/support/v7/app/c$a$2

/* anonymous class */
    final class a._cls2 extends CursorAdapter
    {

        final ListView a;
        final android.support.v7.app.c b;
        final a c;
        private final int d;
        private final int e;

        public final void bindView(View view, Context context, Cursor cursor)
        {
            ((CheckedTextView)view.findViewById(0x1020014)).setText(cursor.getString(d));
            view = a;
            int i1 = cursor.getPosition();
            boolean flag;
            if (cursor.getInt(e) == 1)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            view.setItemChecked(i1, flag);
        }

        public final View newView(Context context, Cursor cursor, ViewGroup viewgroup)
        {
            return c.b.inflate(android.support.v7.app.c.j(b), viewgroup, false);
        }

            
            {
                c = a1;
                a = listview;
                b = c1;
                super(context, cursor, false);
                a1 = getCursor();
                d = a1.getColumnIndexOrThrow(c.I);
                e = a1.getColumnIndexOrThrow(c.J);
            }
    }


    // Unreferenced inner class android/support/v7/app/c$a$3

/* anonymous class */
    final class a._cls3
        implements android.widget.AdapterView.OnItemClickListener
    {

        final android.support.v7.app.c a;
        final a b;

        public final void onItemClick(AdapterView adapterview, View view, int i1, long l1)
        {
            b.u.onClick(android.support.v7.app.c.g(a), i1);
            if (!b.E)
            {
                android.support.v7.app.c.g(a).dismiss();
            }
        }

            
            {
                b = a1;
                a = c1;
                super();
            }
    }


    // Unreferenced inner class android/support/v7/app/c$a$4

/* anonymous class */
    final class a._cls4
        implements android.widget.AdapterView.OnItemClickListener
    {

        final ListView a;
        final android.support.v7.app.c b;
        final a c;

        public final void onItemClick(AdapterView adapterview, View view, int i1, long l1)
        {
            if (c.C != null)
            {
                c.C[i1] = a.isItemChecked(i1);
            }
            c.G.onClick(android.support.v7.app.c.g(b), i1, a.isItemChecked(i1));
        }

            
            {
                c = a1;
                a = listview;
                b = c1;
                super();
            }
    }

}
