// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.afollestad.materialdialogs;

import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.support.v4.content.res.ResourcesCompat;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.AdapterView;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.RadioButton;
import android.widget.TextView;
import com.afollestad.materialdialogs.internal.MDButton;
import com.afollestad.materialdialogs.internal.MDRootLayout;
import com.afollestad.materialdialogs.util.a;
import com.afollestad.materialdialogs.util.b;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.afollestad.materialdialogs:
//            c, d, b, a, 
//            e, g

public class com.afollestad.materialdialogs.f extends com.afollestad.materialdialogs.c
    implements android.view.View.OnClickListener, android.widget.AdapterView.OnItemClickListener
{
    public static class a
    {

        protected g A;
        protected f B;
        protected e C;
        protected boolean D;
        protected boolean E;
        protected com.afollestad.materialdialogs.g F;
        protected boolean G;
        protected float H;
        protected int I;
        protected Integer J[];
        protected boolean K;
        protected Typeface L;
        protected Typeface M;
        protected Drawable N;
        protected boolean O;
        protected int P;
        protected ListAdapter Q;
        protected android.content.DialogInterface.OnDismissListener R;
        protected android.content.DialogInterface.OnCancelListener S;
        protected android.content.DialogInterface.OnKeyListener T;
        protected android.content.DialogInterface.OnShowListener U;
        protected boolean V;
        protected boolean W;
        protected int X;
        protected int Y;
        protected int Z;
        protected final Context a;
        protected int aA;
        protected int aB;
        protected int aC;
        protected int aD;
        protected boolean aa;
        protected boolean ab;
        protected int ac;
        protected int ad;
        protected CharSequence ae;
        protected CharSequence af;
        protected d ag;
        protected boolean ah;
        protected int ai;
        protected boolean aj;
        protected int ak;
        protected int al;
        protected int am;
        protected int an[];
        protected String ao;
        protected NumberFormat ap;
        protected boolean aq;
        protected boolean ar;
        protected boolean as;
        protected boolean at;
        protected boolean au;
        protected boolean av;
        protected boolean aw;
        protected boolean ax;
        protected boolean ay;
        protected int az;
        protected CharSequence b;
        protected com.afollestad.materialdialogs.e c;
        protected com.afollestad.materialdialogs.e d;
        protected com.afollestad.materialdialogs.e e;
        protected com.afollestad.materialdialogs.e f;
        protected com.afollestad.materialdialogs.e g;
        protected int h;
        protected int i;
        protected int j;
        protected CharSequence k;
        protected CharSequence l[];
        protected CharSequence m;
        protected CharSequence n;
        protected CharSequence o;
        protected View p;
        protected int q;
        protected ColorStateList r;
        protected ColorStateList s;
        protected ColorStateList t;
        protected b u;
        protected j v;
        protected j w;
        protected j x;
        protected j y;
        protected e z;

        private void d()
        {
            if (com.afollestad.materialdialogs.internal.c.a(false) == null)
            {
                return;
            }
            com.afollestad.materialdialogs.internal.c c1 = com.afollestad.materialdialogs.internal.c.a();
            if (c1.a)
            {
                F = com.afollestad.materialdialogs.g.b;
            }
            if (c1.b != 0)
            {
                i = c1.b;
            }
            if (c1.c != 0)
            {
                j = c1.c;
            }
            if (c1.d != null)
            {
                r = c1.d;
            }
            if (c1.e != null)
            {
                t = c1.e;
            }
            if (c1.f != null)
            {
                s = c1.f;
            }
            if (c1.h != 0)
            {
                Z = c1.h;
            }
            if (c1.i != null)
            {
                N = c1.i;
            }
            if (c1.j != 0)
            {
                Y = c1.j;
            }
            if (c1.k != 0)
            {
                X = c1.k;
            }
            if (c1.m != 0)
            {
                aA = c1.m;
            }
            if (c1.l != 0)
            {
                az = c1.l;
            }
            if (c1.n != 0)
            {
                aB = c1.n;
            }
            if (c1.o != 0)
            {
                aC = c1.o;
            }
            if (c1.p != 0)
            {
                aD = c1.p;
            }
            if (c1.g != 0)
            {
                q = c1.g;
            }
            c = c1.q;
            d = c1.r;
            e = c1.s;
            f = c1.t;
            g = c1.u;
        }

        public final Context a()
        {
            return a;
        }

        public a a(int i1)
        {
            a(a.getText(i1));
            return this;
        }

        public a a(j j1)
        {
            v = j1;
            return this;
        }

        public a a(CharSequence charsequence)
        {
            b = charsequence;
            return this;
        }

        public a a(CharSequence charsequence, CharSequence charsequence1, boolean flag, d d1)
        {
            if (p != null)
            {
                throw new IllegalStateException("You cannot set content() when you're using a custom view.");
            } else
            {
                ag = d1;
                af = charsequence;
                ae = charsequence1;
                ah = flag;
                return this;
            }
        }

        public a a(String s1, String s2)
        {
            if (s1 != null)
            {
                M = com.afollestad.materialdialogs.util.c.a(a, s1);
                if (M == null)
                {
                    throw new IllegalArgumentException((new StringBuilder()).append("No font asset found for ").append(s1).toString());
                }
            }
            if (s2 != null)
            {
                L = com.afollestad.materialdialogs.util.c.a(a, s2);
                if (L == null)
                {
                    throw new IllegalArgumentException((new StringBuilder()).append("No font asset found for ").append(s2).toString());
                }
            }
            return this;
        }

        public a b(int i1)
        {
            if (i1 == 0)
            {
                return this;
            } else
            {
                b(a.getText(i1));
                return this;
            }
        }

        public a b(j j1)
        {
            w = j1;
            return this;
        }

        public a b(CharSequence charsequence)
        {
            m = charsequence;
            return this;
        }

        public com.afollestad.materialdialogs.f b()
        {
            return new com.afollestad.materialdialogs.f(this);
        }

        public a c(int i1)
        {
            if (i1 == 0)
            {
                return this;
            } else
            {
                return c(a.getText(i1));
            }
        }

        public a c(CharSequence charsequence)
        {
            o = charsequence;
            return this;
        }

        public com.afollestad.materialdialogs.f c()
        {
            com.afollestad.materialdialogs.f f1 = b();
            f1.show();
            return f1;
        }

        public a d(int i1)
        {
            ai = i1;
            return this;
        }

        public a(Context context)
        {
            int i1 = 0;
            super();
            c = com.afollestad.materialdialogs.e.a;
            d = com.afollestad.materialdialogs.e.a;
            e = com.afollestad.materialdialogs.e.c;
            f = com.afollestad.materialdialogs.e.a;
            g = com.afollestad.materialdialogs.e.a;
            h = 0;
            i = -1;
            j = -1;
            D = false;
            E = false;
            F = com.afollestad.materialdialogs.g.a;
            G = true;
            H = 1.2F;
            I = -1;
            J = null;
            K = true;
            P = -1;
            ac = -2;
            ad = 0;
            ai = -1;
            ak = -1;
            al = -1;
            am = 0;
            ar = false;
            as = false;
            at = false;
            au = false;
            av = false;
            aw = false;
            ax = false;
            ay = false;
            a = context;
            int j1 = com.afollestad.materialdialogs.util.a.b(context, R.color.md_material_blue_600);
            q = com.afollestad.materialdialogs.util.a.a(context, R.attr.colorAccent, j1);
            if (android.os.Build.VERSION.SDK_INT >= 21)
            {
                q = com.afollestad.materialdialogs.util.a.a(context, 0x1010435, q);
            }
            r = com.afollestad.materialdialogs.util.a.g(context, q);
            s = com.afollestad.materialdialogs.util.a.g(context, q);
            t = com.afollestad.materialdialogs.util.a.g(context, q);
            if (android.os.Build.VERSION.SDK_INT >= 21)
            {
                i1 = com.afollestad.materialdialogs.util.a.a(context, 0x101042c);
            }
            h = com.afollestad.materialdialogs.util.a.a(context, R.attr.md_btn_ripple_color, com.afollestad.materialdialogs.util.a.a(context, R.attr.colorControlHighlight, i1));
            ap = NumberFormat.getPercentInstance();
            ao = "%1d/%2d";
            com.afollestad.materialdialogs.g g1;
            if (com.afollestad.materialdialogs.util.a.a(com.afollestad.materialdialogs.util.a.a(context, 0x1010036)))
            {
                g1 = com.afollestad.materialdialogs.g.a;
            } else
            {
                g1 = com.afollestad.materialdialogs.g.b;
            }
            F = g1;
            d();
            c = com.afollestad.materialdialogs.util.a.a(context, R.attr.md_title_gravity, c);
            d = com.afollestad.materialdialogs.util.a.a(context, R.attr.md_content_gravity, d);
            e = com.afollestad.materialdialogs.util.a.a(context, R.attr.md_btnstacked_gravity, e);
            f = com.afollestad.materialdialogs.util.a.a(context, R.attr.md_items_gravity, f);
            g = com.afollestad.materialdialogs.util.a.a(context, R.attr.md_buttons_gravity, g);
            a(com.afollestad.materialdialogs.util.a.c(context, R.attr.md_medium_font), com.afollestad.materialdialogs.util.a.c(context, R.attr.md_regular_font));
            if (M != null) goto _L2; else goto _L1
_L1:
            if (android.os.Build.VERSION.SDK_INT < 21) goto _L4; else goto _L3
_L3:
            M = Typeface.create("sans-serif-medium", 0);
_L2:
            if (L != null)
            {
                break MISSING_BLOCK_LABEL_470;
            }
            L = Typeface.create("sans-serif", 0);
            return;
_L4:
            try
            {
                M = Typeface.create("sans-serif", 1);
            }
            // Misplaced declaration of an exception variable
            catch (Context context) { }
            if (true) goto _L2; else goto _L5
_L5:
            context;
        }
    }

    public static abstract class b
    {

        public void a(com.afollestad.materialdialogs.f f1)
        {
        }

        public void b(com.afollestad.materialdialogs.f f1)
        {
        }

        public void c(com.afollestad.materialdialogs.f f1)
        {
        }

        protected final Object clone()
            throws CloneNotSupportedException
        {
            return super.clone();
        }

        public void d(com.afollestad.materialdialogs.f f1)
        {
        }

        public final boolean equals(Object obj)
        {
            return super.equals(obj);
        }

        protected final void finalize()
            throws Throwable
        {
            super.finalize();
        }

        public final int hashCode()
        {
            return super.hashCode();
        }

        public final String toString()
        {
            return super.toString();
        }

        public b()
        {
        }
    }

    public static class c extends android.view.WindowManager.BadTokenException
    {

        public c(String s1)
        {
            super(s1);
        }
    }

    public static interface d
    {

        public abstract void a(com.afollestad.materialdialogs.f f1, CharSequence charsequence);
    }

    public static interface e
    {

        public abstract void a(com.afollestad.materialdialogs.f f1, View view, int i1, CharSequence charsequence);
    }

    public static interface f
    {

        public abstract boolean a(com.afollestad.materialdialogs.f f1, Integer ainteger[], CharSequence acharsequence[]);
    }

    public static interface g
    {

        public abstract boolean a(com.afollestad.materialdialogs.f f1, View view, int i1, CharSequence charsequence);
    }

    protected static final class h extends Enum
    {

        public static final h a;
        public static final h b;
        public static final h c;
        private static final h d[];

        public static int a(h h1)
        {
            static class _cls3
            {

                static final int a[];
                static final int b[];

                static 
                {
                    b = new int[h.values().length];
                    try
                    {
                        b[com.afollestad.materialdialogs.h.a.ordinal()] = 1;
                    }
                    catch (NoSuchFieldError nosuchfielderror5) { }
                    try
                    {
                        b[com.afollestad.materialdialogs.h.b.ordinal()] = 2;
                    }
                    catch (NoSuchFieldError nosuchfielderror4) { }
                    try
                    {
                        b[h.c.ordinal()] = 3;
                    }
                    catch (NoSuchFieldError nosuchfielderror3) { }
                    a = new int[com.afollestad.materialdialogs.b.values().length];
                    try
                    {
                        a[com.afollestad.materialdialogs.b.b.ordinal()] = 1;
                    }
                    catch (NoSuchFieldError nosuchfielderror2) { }
                    try
                    {
                        a[com.afollestad.materialdialogs.b.c.ordinal()] = 2;
                    }
                    catch (NoSuchFieldError nosuchfielderror1) { }
                    try
                    {
                        a[com.afollestad.materialdialogs.b.a.ordinal()] = 3;
                    }
                    catch (NoSuchFieldError nosuchfielderror)
                    {
                        return;
                    }
                }
            }

            switch (com.afollestad.materialdialogs._cls3.b[h1.ordinal()])
            {
            default:
                throw new IllegalArgumentException("Not a valid list type");

            case 1: // '\001'
                return R.layout.md_listitem;

            case 2: // '\002'
                return R.layout.md_listitem_singlechoice;

            case 3: // '\003'
                return R.layout.md_listitem_multichoice;
            }
        }

        public static h valueOf(String s1)
        {
            return (h)Enum.valueOf(com/afollestad/materialdialogs/f$h, s1);
        }

        public static h[] values()
        {
            return (h[])d.clone();
        }

        static 
        {
            a = new h("REGULAR", 0);
            b = new h("SINGLE", 1);
            c = new h("MULTI", 2);
            d = (new h[] {
                a, b, c
            });
        }

        private h(String s1, int i1)
        {
            super(s1, i1);
        }
    }

    public static class i extends Error
    {

        public i(String s1)
        {
            super(s1);
        }
    }

    public static interface j
    {

        public abstract void a(com.afollestad.materialdialogs.f f1, com.afollestad.materialdialogs.b b1);
    }


    protected final a b;
    protected ListView c;
    protected ImageView d;
    protected TextView e;
    protected View f;
    protected FrameLayout g;
    protected ProgressBar h;
    protected TextView i;
    protected TextView j;
    protected TextView k;
    protected EditText l;
    protected TextView m;
    protected MDButton n;
    protected MDButton o;
    protected MDButton p;
    protected h q;
    protected List r;
    private final Handler s = new Handler();

    protected com.afollestad.materialdialogs.f(a a1)
    {
        super(a1.a, com.afollestad.materialdialogs.d.a(a1));
        b = a1;
        a = (MDRootLayout)LayoutInflater.from(a1.a).inflate(com.afollestad.materialdialogs.d.b(a1), null);
        com.afollestad.materialdialogs.d.a(this);
    }

    private boolean b(View view)
    {
        if (b.A == null)
        {
            return false;
        }
        CharSequence charsequence = null;
        if (b.I >= 0)
        {
            charsequence = b.l[b.I];
        }
        return b.A.a(this, view, b.I, charsequence);
    }

    private boolean j()
    {
        if (b.B == null)
        {
            return false;
        }
        Collections.sort(r);
        ArrayList arraylist = new ArrayList();
        Integer integer;
        for (Iterator iterator = r.iterator(); iterator.hasNext(); arraylist.add(b.l[integer.intValue()]))
        {
            integer = (Integer)iterator.next();
        }

        return b.B.a(this, (Integer[])r.toArray(new Integer[r.size()]), (CharSequence[])arraylist.toArray(new CharSequence[arraylist.size()]));
    }

    Drawable a(com.afollestad.materialdialogs.b b1, boolean flag)
    {
        if (!flag) goto _L2; else goto _L1
_L1:
        if (b.aA == 0) goto _L4; else goto _L3
_L3:
        b1 = ResourcesCompat.getDrawable(b.a.getResources(), b.aA, null);
_L6:
        return b1;
_L4:
        Drawable drawable = com.afollestad.materialdialogs.util.a.d(b.a, R.attr.md_btn_stacked_selector);
        b1 = drawable;
        if (drawable == null)
        {
            return com.afollestad.materialdialogs.util.a.d(getContext(), R.attr.md_btn_stacked_selector);
        }
        continue; /* Loop/switch isn't completed */
_L2:
        Drawable drawable5;
        switch (com.afollestad.materialdialogs._cls3.a[b1.ordinal()])
        {
        default:
            if (b.aB != 0)
            {
                return ResourcesCompat.getDrawable(b.a.getResources(), b.aB, null);
            }
            Drawable drawable1 = com.afollestad.materialdialogs.util.a.d(b.a, R.attr.md_btn_positive_selector);
            b1 = drawable1;
            if (drawable1 == null)
            {
                Drawable drawable2 = com.afollestad.materialdialogs.util.a.d(getContext(), R.attr.md_btn_positive_selector);
                b1 = drawable2;
                if (android.os.Build.VERSION.SDK_INT >= 21)
                {
                    com.afollestad.materialdialogs.util.b.a(drawable2, b.h);
                    return drawable2;
                }
            }
            break;

        case 1: // '\001'
            if (b.aC != 0)
            {
                return ResourcesCompat.getDrawable(b.a.getResources(), b.aC, null);
            }
            Drawable drawable3 = com.afollestad.materialdialogs.util.a.d(b.a, R.attr.md_btn_neutral_selector);
            b1 = drawable3;
            if (drawable3 == null)
            {
                Drawable drawable4 = com.afollestad.materialdialogs.util.a.d(getContext(), R.attr.md_btn_neutral_selector);
                b1 = drawable4;
                if (android.os.Build.VERSION.SDK_INT >= 21)
                {
                    com.afollestad.materialdialogs.util.b.a(drawable4, b.h);
                    return drawable4;
                }
            }
            break;

        case 2: // '\002'
            if (b.aD != 0)
            {
                return ResourcesCompat.getDrawable(b.a.getResources(), b.aD, null);
            }
            drawable5 = com.afollestad.materialdialogs.util.a.d(b.a, R.attr.md_btn_negative_selector);
            b1 = drawable5;
            continue; /* Loop/switch isn't completed */
        }
        if (true)
        {
            continue; /* Loop/switch isn't completed */
        }
        if (drawable5 != null) goto _L6; else goto _L5
_L5:
        Drawable drawable6 = com.afollestad.materialdialogs.util.a.d(getContext(), R.attr.md_btn_negative_selector);
        b1 = drawable6;
        if (android.os.Build.VERSION.SDK_INT >= 21)
        {
            com.afollestad.materialdialogs.util.b.a(drawable6, b.h);
            return drawable6;
        }
        if (true) goto _L6; else goto _L7
_L7:
    }

    public final MDButton a(com.afollestad.materialdialogs.b b1)
    {
        switch (com.afollestad.materialdialogs._cls3.a[b1.ordinal()])
        {
        default:
            return n;

        case 1: // '\001'
            return o;

        case 2: // '\002'
            return p;
        }
    }

    protected void a(int i1, boolean flag)
    {
        if (m != null)
        {
            m.setText(String.format("%d/%d", new Object[] {
                Integer.valueOf(i1), Integer.valueOf(b.al)
            }));
            MDButton mdbutton;
            int j1;
            int k1;
            if (flag && i1 == 0 || i1 > b.al || i1 < b.ak)
            {
                i1 = 1;
            } else
            {
                i1 = 0;
            }
            if (i1 != 0)
            {
                j1 = b.am;
            } else
            {
                j1 = b.j;
            }
            if (i1 != 0)
            {
                k1 = b.am;
            } else
            {
                k1 = b.q;
            }
            m.setTextColor(j1);
            com.afollestad.materialdialogs.internal.b.a(l, k1);
            mdbutton = a(com.afollestad.materialdialogs.b.a);
            if (i1 == 0)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            mdbutton.setEnabled(flag);
        }
    }

    public final void a(TextView textview, Typeface typeface)
    {
        if (typeface == null)
        {
            return;
        } else
        {
            textview.setPaintFlags(textview.getPaintFlags() | 0x80);
            textview.setTypeface(typeface);
            return;
        }
    }

    public final a b()
    {
        return b;
    }

    protected final void c()
    {
        if (c == null)
        {
            return;
        } else
        {
            c.getViewTreeObserver().addOnGlobalLayoutListener(new android.view.ViewTreeObserver.OnGlobalLayoutListener() {

                final com.afollestad.materialdialogs.f a;

                public void onGlobalLayout()
                {
                    if (android.os.Build.VERSION.SDK_INT < 16)
                    {
                        a.c.getViewTreeObserver().removeGlobalOnLayoutListener(this);
                    } else
                    {
                        a.c.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                    }
                    if (a.q != com.afollestad.materialdialogs.h.b && a.q != h.c) goto _L2; else goto _L1
_L1:
                    if (a.q != com.afollestad.materialdialogs.h.b) goto _L4; else goto _L3
_L3:
                    if (a.b.I >= 0) goto _L5; else goto _L2
_L2:
                    return;
_L5:
                    int i1 = a.b.I;
_L8:
                    if (a.c.getLastVisiblePosition() >= i1) goto _L2; else goto _L6
_L6:
                    int j1 = i1 - (a.c.getLastVisiblePosition() - a.c.getFirstVisiblePosition()) / 2;
                    i1 = j1;
                    if (j1 < 0)
                    {
                        i1 = 0;
                    }
                    a.c.post(new MaterialDialog._cls1._cls1(this, i1));
                    return;
_L4:
                    if (a.r == null || a.r.size() == 0) goto _L2; else goto _L7
_L7:
                    Collections.sort(a.r);
                    i1 = ((Integer)a.r.get(0)).intValue();
                      goto _L8
                }

            
            {
                a = com.afollestad.materialdialogs.f.this;
                super();
            }
            });
            return;
        }
    }

    protected final void d()
    {
        if (c != null && (b.l != null && b.l.length != 0 || b.Q != null))
        {
            c.setAdapter(b.Q);
            if (q != null || b.C != null)
            {
                c.setOnItemClickListener(this);
                return;
            }
        }
    }

    protected final Drawable e()
    {
        Drawable drawable;
        if (b.az != 0)
        {
            drawable = ResourcesCompat.getDrawable(b.a.getResources(), b.az, null);
        } else
        {
            Drawable drawable1 = com.afollestad.materialdialogs.util.a.d(b.a, R.attr.md_list_selector);
            drawable = drawable1;
            if (drawable1 == null)
            {
                return com.afollestad.materialdialogs.util.a.d(getContext(), R.attr.md_list_selector);
            }
        }
        return drawable;
    }

    public final EditText f()
    {
        return l;
    }

    public volatile View findViewById(int i1)
    {
        return super.findViewById(i1);
    }

    public final int g()
    {
        if (h == null)
        {
            return -1;
        } else
        {
            return h.getProgress();
        }
    }

    public final int h()
    {
        if (h == null)
        {
            return -1;
        } else
        {
            return h.getMax();
        }
    }

    protected void i()
    {
        if (l == null)
        {
            return;
        } else
        {
            l.addTextChangedListener(new TextWatcher() {

                final com.afollestad.materialdialogs.f a;

                public void afterTextChanged(Editable editable)
                {
                }

                public void beforeTextChanged(CharSequence charsequence, int i1, int j1, int k1)
                {
                }

                public void onTextChanged(CharSequence charsequence, int i1, int j1, int k1)
                {
                    boolean flag1 = true;
                    i1 = charsequence.toString().length();
                    boolean flag;
                    if (!a.b.ah)
                    {
                        MDButton mdbutton;
                        if (i1 == 0)
                        {
                            flag = true;
                        } else
                        {
                            flag = false;
                        }
                        mdbutton = a.a(com.afollestad.materialdialogs.b.a);
                        if (flag)
                        {
                            flag1 = false;
                        }
                        mdbutton.setEnabled(flag1);
                    } else
                    {
                        flag = false;
                    }
                    a.a(i1, flag);
                    if (a.b.aj)
                    {
                        a.b.ag.a(a, charsequence);
                    }
                }

            
            {
                a = com.afollestad.materialdialogs.f.this;
                super();
            }
            });
            return;
        }
    }

    public final void onClick(View view)
    {
        com.afollestad.materialdialogs.b b1 = (com.afollestad.materialdialogs.b)view.getTag();
        com.afollestad.materialdialogs._cls3.a[b1.ordinal()];
        JVM INSTR tableswitch 1 3: default 44
    //                   1 273
    //                   2 200
    //                   3 69;
           goto _L1 _L2 _L3 _L4
_L1:
        if (b.y != null)
        {
            b.y.a(this, b1);
        }
        return;
_L4:
        if (b.u != null)
        {
            b.u.a(this);
            b.u.b(this);
        }
        if (b.v != null)
        {
            b.v.a(this, b1);
        }
        b(view);
        j();
        if (b.ag != null && l != null && !b.aj)
        {
            b.ag.a(this, l.getText());
        }
        if (b.K)
        {
            dismiss();
        }
        continue; /* Loop/switch isn't completed */
_L3:
        if (b.u != null)
        {
            b.u.a(this);
            b.u.c(this);
        }
        if (b.w != null)
        {
            b.w.a(this, b1);
        }
        if (b.K)
        {
            dismiss();
        }
        continue; /* Loop/switch isn't completed */
_L2:
        if (b.u != null)
        {
            b.u.a(this);
            b.u.d(this);
        }
        if (b.x != null)
        {
            b.x.a(this, b1);
        }
        if (b.K)
        {
            dismiss();
        }
        if (true) goto _L1; else goto _L5
_L5:
    }

    public void onItemClick(AdapterView adapterview, View view, int i1, long l1)
    {
        if (b.C == null) goto _L2; else goto _L1
_L1:
        adapterview = null;
        if (view instanceof TextView)
        {
            adapterview = ((TextView)view).getText();
        }
        b.C.a(this, view, i1, adapterview);
_L4:
        return;
_L2:
        if (q != null && q != com.afollestad.materialdialogs.h.a)
        {
            break; /* Loop/switch isn't completed */
        }
        if (b.K)
        {
            dismiss();
        }
        if (b.z != null)
        {
            b.z.a(this, view, i1, b.l[i1]);
            return;
        }
        if (true) goto _L4; else goto _L3
_L3:
        if (q != h.c)
        {
            continue; /* Loop/switch isn't completed */
        }
        boolean flag;
        if (!r.contains(Integer.valueOf(i1)))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        adapterview = (CheckBox)view.findViewById(R.id.control);
        if (flag)
        {
            r.add(Integer.valueOf(i1));
            if (b.D)
            {
                if (j())
                {
                    adapterview.setChecked(true);
                    return;
                } else
                {
                    r.remove(Integer.valueOf(i1));
                    return;
                }
            } else
            {
                adapterview.setChecked(true);
                return;
            }
        }
        r.remove(Integer.valueOf(i1));
        adapterview.setChecked(false);
        if (b.D)
        {
            j();
            return;
        }
        continue; /* Loop/switch isn't completed */
        if (q != com.afollestad.materialdialogs.h.b) goto _L4; else goto _L5
_L5:
        adapterview = (com.afollestad.materialdialogs.a)b.Q;
        RadioButton radiobutton = (RadioButton)view.findViewById(R.id.control);
        boolean flag1;
        if (b.K && b.m == null)
        {
            dismiss();
            b.I = i1;
            b(view);
            flag1 = false;
        } else
        if (b.E)
        {
            int j1 = b.I;
            b.I = i1;
            flag1 = b(view);
            b.I = j1;
        } else
        {
            flag1 = true;
        }
        if (flag1 && b.I != i1)
        {
            b.I = i1;
            if (((com.afollestad.materialdialogs.a) (adapterview)).a == null)
            {
                adapterview.b = true;
                adapterview.notifyDataSetChanged();
            }
            if (((com.afollestad.materialdialogs.a) (adapterview)).a != null)
            {
                ((com.afollestad.materialdialogs.a) (adapterview)).a.setChecked(false);
            }
            radiobutton.setChecked(true);
            adapterview.a = radiobutton;
            return;
        }
        if (true) goto _L4; else goto _L6
_L6:
    }

    public final void onShow(DialogInterface dialoginterface)
    {
        if (l != null)
        {
            com.afollestad.materialdialogs.util.a.a(this, b);
            if (l.getText().length() > 0)
            {
                l.setSelection(l.getText().length());
            }
        }
        super.onShow(dialoginterface);
    }

    protected void onStop()
    {
        super.onStop();
        if (l != null)
        {
            com.afollestad.materialdialogs.util.a.b(this, b);
        }
    }

    public volatile void setContentView(int i1)
        throws IllegalAccessError
    {
        super.setContentView(i1);
    }

    public volatile void setContentView(View view)
        throws IllegalAccessError
    {
        super.setContentView(view);
    }

    public volatile void setContentView(View view, android.view.ViewGroup.LayoutParams layoutparams)
        throws IllegalAccessError
    {
        super.setContentView(view, layoutparams);
    }

    public final void setTitle(int i1)
    {
        setTitle(((CharSequence) (b.a.getString(i1))));
    }

    public final void setTitle(CharSequence charsequence)
    {
        e.setText(charsequence);
    }

    public void show()
    {
        try
        {
            super.show();
            return;
        }
        catch (android.view.WindowManager.BadTokenException badtokenexception)
        {
            throw new c("Bad window token, you cannot show a dialog before an Activity is created or after it's hidden.");
        }
    }

    // Unreferenced inner class com/afollestad/materialdialogs/MaterialDialog$1$1

/* anonymous class */
    class MaterialDialog._cls1._cls1
        implements Runnable
    {

        final int a;
        final _cls1 b;

        public void run()
        {
            b.a.c.requestFocus();
            b.a.c.setSelection(a);
        }

            
            {
                b = _pcls1;
                a = i1;
                super();
            }
    }


    // Unreferenced inner class com/afollestad/materialdialogs/MaterialDialog$2

/* anonymous class */
    class MaterialDialog._cls2
        implements Runnable
    {

        final com.afollestad.materialdialogs.f a;

        public void run()
        {
            if (a.i != null)
            {
                a.i.setText(a.b.ap.format((float)a.g() / (float)a.h()));
            }
            if (a.j != null)
            {
                a.j.setText(String.format(a.b.ao, new Object[] {
                    Integer.valueOf(a.g()), Integer.valueOf(a.h())
                }));
            }
        }
    }

}
