// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.afollestad.materialdialogs;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ListAdapter;
import com.afollestad.materialdialogs.internal.c;
import com.afollestad.materialdialogs.util.a;
import java.text.NumberFormat;

// Referenced classes of package com.afollestad.materialdialogs:
//            f, e, g

public static class M
{

    protected ai A;
    protected ai B;
    protected ai C;
    protected boolean D;
    protected boolean E;
    protected g F;
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
    protected android.content.ogInterface.OnDismissListener R;
    protected android.content.ogInterface.OnCancelListener S;
    protected android.content.ogInterface.OnKeyListener T;
    protected android.content.ogInterface.OnShowListener U;
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
    protected istener ag;
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
    protected e c;
    protected e d;
    protected e e;
    protected e f;
    protected e g;
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
    protected istener u;
    protected istener v;
    protected istener w;
    protected istener x;
    protected istener y;
    protected istener z;

    private void d()
    {
        if (com.afollestad.materialdialogs.internal.c.a(false) == null)
        {
            return;
        }
        c c1 = com.afollestad.materialdialogs.internal.c.a();
        if (c1.a)
        {
            F = g.b;
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

    public a a(a a1)
    {
        v = a1;
        return this;
    }

    public v a(CharSequence charsequence)
    {
        b = charsequence;
        return this;
    }

    public b a(CharSequence charsequence, CharSequence charsequence1, boolean flag, b b1)
    {
        if (p != null)
        {
            throw new IllegalStateException("You cannot set content() when you're using a custom view.");
        } else
        {
            ag = b1;
            af = charsequence;
            ae = charsequence1;
            ah = flag;
            return this;
        }
    }

    public ah a(String s1, String s2)
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

    public <init> b(int i1)
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

    public a b(a a1)
    {
        w = a1;
        return this;
    }

    public w b(CharSequence charsequence)
    {
        m = charsequence;
        return this;
    }

    public f b()
    {
        return new f(this);
    }

    public nit> c(int i1)
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

    public f c()
    {
        f f1 = b();
        f1.show();
        return f1;
    }

    public ow d(int i1)
    {
        ai = i1;
        return this;
    }

    public howListener(Context context)
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
        int j1 = com.afollestad.materialdialogs.util.a.b(context, lor.md_material_blue_600);
        q = com.afollestad.materialdialogs.util.a.a(context, tr.colorAccent, j1);
        if (android.os.d.VERSION.SDK_INT >= 21)
        {
            q = com.afollestad.materialdialogs.util.a.a(context, 0x1010435, q);
        }
        r = com.afollestad.materialdialogs.util.a.g(context, q);
        s = com.afollestad.materialdialogs.util.a.g(context, q);
        t = com.afollestad.materialdialogs.util.a.g(context, q);
        if (android.os.d.VERSION.SDK_INT >= 21)
        {
            i1 = com.afollestad.materialdialogs.util.a.a(context, 0x101042c);
        }
        h = com.afollestad.materialdialogs.util.a.a(context, tr.md_btn_ripple_color, com.afollestad.materialdialogs.util.a.a(context, tr.colorControlHighlight, i1));
        ap = NumberFormat.getPercentInstance();
        ao = "%1d/%2d";
        g g1;
        if (com.afollestad.materialdialogs.util.a.a(com.afollestad.materialdialogs.util.a.a(context, 0x1010036)))
        {
            g1 = com.afollestad.materialdialogs.g.a;
        } else
        {
            g1 = g.b;
        }
        F = g1;
        d();
        c = com.afollestad.materialdialogs.util.a.a(context, tr.md_title_gravity, c);
        d = com.afollestad.materialdialogs.util.a.a(context, tr.md_content_gravity, d);
        e = com.afollestad.materialdialogs.util.a.a(context, tr.md_btnstacked_gravity, e);
        f = com.afollestad.materialdialogs.util.a.a(context, tr.md_items_gravity, f);
        g = com.afollestad.materialdialogs.util.a.a(context, tr.md_buttons_gravity, g);
        a(com.afollestad.materialdialogs.util.a.c(context, tr.md_medium_font), com.afollestad.materialdialogs.util.a.c(context, tr.md_regular_font));
        if (M != null) goto _L2; else goto _L1
_L1:
        if (android.os.d.VERSION.SDK_INT < 21) goto _L4; else goto _L3
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
