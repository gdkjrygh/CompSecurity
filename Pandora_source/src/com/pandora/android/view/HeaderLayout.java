// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pandora.android.view;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.pandora.android.provider.b;
import com.pandora.android.util.SearchBox;
import p.bz.h;
import p.bz.i;

// Referenced classes of package com.pandora.android.view:
//            RoundLinearLayout

public class HeaderLayout extends RoundLinearLayout
{
    public static final class a extends Enum
    {

        public static final a a;
        public static final a b;
        public static final a c;
        public static final a d;
        public static final a e;
        public static final a f;
        private static final a g[];

        public static a valueOf(String s1)
        {
            return (a)Enum.valueOf(com/pandora/android/view/HeaderLayout$a, s1);
        }

        public static a[] values()
        {
            return (a[])g.clone();
        }

        static 
        {
            a = new a("NONE", 0);
            b = new a("BACK", 1);
            c = new a("EDIT", 2);
            d = new a("FIND_PEOPLE", 3);
            e = new a("CLOSE", 4);
            f = new a("CUSTOM_TEXT", 5);
            g = (new a[] {
                a, b, c, d, e, f
            });
        }

        private a(String s1, int i1)
        {
            super(s1, i1);
        }
    }

    public static final class b extends Enum
    {

        public static final b a;
        public static final b b;
        public static final b c;
        private static final b d[];

        public static b valueOf(String s1)
        {
            return (b)Enum.valueOf(com/pandora/android/view/HeaderLayout$b, s1);
        }

        public static b[] values()
        {
            return (b[])d.clone();
        }

        static 
        {
            a = new b("NONE", 0);
            b = new b("SEARCH_BOX", 1);
            c = new b("TITLE", 2);
            d = (new b[] {
                a, b, c
            });
        }

        private b(String s1, int i1)
        {
            super(s1, i1);
        }
    }

    public static final class c extends Enum
    {

        public static final c a;
        public static final c b;
        private static final c c[];

        public static c valueOf(String s1)
        {
            return (c)Enum.valueOf(com/pandora/android/view/HeaderLayout$c, s1);
        }

        public static c[] values()
        {
            return (c[])c.clone();
        }

        static 
        {
            a = new c("BUTTON", 0);
            b = new c("SEARCH_BOX", 1);
            c = (new c[] {
                a, b
            });
        }

        private c(String s1, int i1)
        {
            super(s1, i1);
        }
    }

    public static final class d extends Enum
    {

        public static final d a;
        public static final d b;
        public static final d c;
        private static final d d[];

        public static d valueOf(String s1)
        {
            return (d)Enum.valueOf(com/pandora/android/view/HeaderLayout$d, s1);
        }

        public static d[] values()
        {
            return (d[])d.clone();
        }

        static 
        {
            a = new d("STATION_PANE", 0);
            b = new d("MODAL_PRESENTER", 1);
            c = new d("THIRD_PANE", 2);
            d = (new d[] {
                a, b, c
            });
        }

        private d(String s1, int i1)
        {
            super(s1, i1);
        }
    }


    private TextWatcher A;
    private CharSequence B;
    private boolean C;
    private boolean D;
    private d e;
    private boolean f;
    private a g;
    private a h;
    private CharSequence i;
    private boolean j;
    private CharSequence k;
    private b l;
    private ImageView m;
    private TextView n;
    private ImageView o;
    private TextView p;
    private ImageView q;
    private ImageView r;
    private View s;
    private TextView t;
    private View u;
    private SearchBox v;
    private c w;
    private int x;
    private android.view.View.OnClickListener y;
    private com.pandora.android.util.SearchBox.a z;

    public HeaderLayout(Context context)
    {
        this(context, null, 0);
    }

    public HeaderLayout(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public HeaderLayout(Context context, AttributeSet attributeset, int i1)
    {
        super(context, attributeset);
        if (!isInEditMode())
        {
            com.pandora.android.provider.b.a.e().c(this);
        }
        f = true;
        attributeset = context.obtainStyledAttributes(attributeset, com.pandora.android.R.styleable.HeaderLayout);
        e = d.values()[attributeset.getInt(3, d.a.ordinal())];
        g = a.values()[attributeset.getInt(0, a.a.ordinal())];
        h = a.values()[attributeset.getInt(1, a.a.ordinal())];
        l = b.values()[attributeset.getInt(2, b.c.ordinal())];
        i = attributeset.getString(4);
        j = attributeset.getBoolean(6, false);
        c = attributeset.getColor(5, getResources().getColor(0x7f0b005a));
        attributeset.recycle();
        k = "";
        x = -1;
        ((LayoutInflater)context.getSystemService("layout_inflater")).inflate(0x7f04005c, this, true);
        m = (ImageView)findViewById(0x7f100189);
        n = (TextView)findViewById(0x7f10018b);
        o = (ImageView)findViewById(0x7f10018a);
        v = (SearchBox)findViewById(0x7f10018e);
        p = (TextView)findViewById(0x7f10018f);
        q = (ImageView)findViewById(0x7f100190);
        r = (ImageView)findViewById(0x7f10018c);
        s = findViewById(0x7f100191);
        t = (TextView)findViewById(0x7f100192);
        u = findViewById(0x7f100193);
        a();
        b();
    }

    static d a(HeaderLayout headerlayout)
    {
        return headerlayout.e;
    }

    private void a()
    {
        m.setOnClickListener(new android.view.View.OnClickListener() {

            final HeaderLayout a;

            public void onClick(View view)
            {
                com.pandora.android.provider.b.a.e().a(new h(HeaderLayout.a(a), com.pandora.android.view.a.b));
            }

            
            {
                a = HeaderLayout.this;
                super();
            }
        });
        n.setOnClickListener(new android.view.View.OnClickListener() {

            final HeaderLayout a;

            public void onClick(View view)
            {
                com.pandora.android.provider.b.a.e().a(new h(HeaderLayout.a(a), a.c));
            }

            
            {
                a = HeaderLayout.this;
                super();
            }
        });
        o.setOnClickListener(new android.view.View.OnClickListener() {

            final HeaderLayout a;

            public void onClick(View view)
            {
                com.pandora.android.provider.b.a.e().a(new h(HeaderLayout.a(a), a.d));
            }

            
            {
                a = HeaderLayout.this;
                super();
            }
        });
        q.setOnClickListener(new android.view.View.OnClickListener() {

            final HeaderLayout a;

            public void onClick(View view)
            {
                com.pandora.android.provider.b.a.e().a(new h(HeaderLayout.a(a), a.e));
            }

            
            {
                a = HeaderLayout.this;
                super();
            }
        });
        s.setOnClickListener(new android.view.View.OnClickListener() {

            final HeaderLayout a;

            public void onClick(View view)
            {
                com.pandora.android.provider.b.a.e().a(new h(HeaderLayout.a(a), a.f));
            }

            
            {
                a = HeaderLayout.this;
                super();
            }
        });
        r.setOnClickListener(new android.view.View.OnClickListener() {

            final HeaderLayout a;

            public void onClick(View view)
            {
                com.pandora.android.provider.b.a.e().a(new h(HeaderLayout.a(a), a.e));
            }

            
            {
                a = HeaderLayout.this;
                super();
            }
        });
    }

    private void b()
    {
        static class _cls7
        {

            static final int a[];
            static final int b[];
            static final int c[];

            static 
            {
                c = new int[b.values().length];
                try
                {
                    c[b.a.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror10) { }
                try
                {
                    c[com.pandora.android.view.b.b.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror9) { }
                try
                {
                    c[b.c.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror8) { }
                b = new int[c.values().length];
                try
                {
                    b[c.a.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror7) { }
                try
                {
                    b[com.pandora.android.view.c.b.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror6) { }
                a = new int[a.values().length];
                try
                {
                    a[a.a.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror5) { }
                try
                {
                    a[com.pandora.android.view.a.b.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror4) { }
                try
                {
                    a[a.c.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror3) { }
                try
                {
                    a[a.d.ordinal()] = 4;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    a[a.e.ordinal()] = 5;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    a[a.f.ordinal()] = 6;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        View view = u;
        int i1;
        if (j)
        {
            i1 = 0;
        } else
        {
            i1 = 8;
        }
        view.setVisibility(i1);
        if (!f) goto _L2; else goto _L1
_L1:
        findViewById(0x7f100187).setVisibility(0);
        a(b, a, c);
        r.setVisibility(8);
        _cls7.a[g.ordinal()];
        JVM INSTR tableswitch 1 5: default 108
    //                   1 166
    //                   2 275
    //                   3 304
    //                   4 333
    //                   5 362;
           goto _L3 _L4 _L5 _L6 _L7 _L8
_L3:
        throw new IllegalArgumentException((new StringBuilder()).append("Unsupported Left Button value : ").append(g).toString());
_L2:
        findViewById(0x7f100187).setVisibility(8);
        setPadding(0, 0, 0, 0);
_L20:
        return;
_L4:
        m.setVisibility(8);
        n.setVisibility(8);
        o.setVisibility(8);
_L13:
        _cls7.a[h.ordinal()];
        JVM INSTR tableswitch 1 6: default 244
    //                   1 410
    //                   2 244
    //                   3 244
    //                   4 244
    //                   5 495
    //                   6 515;
           goto _L9 _L10 _L9 _L9 _L9 _L11 _L12
_L9:
        throw new IllegalArgumentException((new StringBuilder()).append("Unsupported Right Button value : ").append(g).toString());
_L5:
        m.setVisibility(0);
        n.setVisibility(8);
        o.setVisibility(8);
          goto _L13
_L6:
        m.setVisibility(8);
        n.setVisibility(0);
        o.setVisibility(8);
          goto _L13
_L7:
        m.setVisibility(8);
        n.setVisibility(8);
        o.setVisibility(0);
          goto _L13
_L8:
        if (e != com.pandora.android.view.d.b)
        {
            continue; /* Loop/switch isn't completed */
        }
        m.setVisibility(8);
        n.setVisibility(8);
        o.setVisibility(8);
        r.setVisibility(0);
          goto _L13
        continue; /* Loop/switch isn't completed */
_L10:
        q.setVisibility(8);
        s.setVisibility(8);
_L18:
        _cls7.c[l.ordinal()];
        JVM INSTR tableswitch 1 3: default 464
    //                   1 546
    //                   2 565
    //                   3 831;
           goto _L14 _L15 _L16 _L17
_L14:
        throw new IllegalArgumentException((new StringBuilder()).append("Unsupported Center value : ").append(l).toString());
_L11:
        q.setVisibility(0);
        s.setVisibility(8);
          goto _L18
_L12:
        q.setVisibility(8);
        s.setVisibility(0);
        t.setText(k);
          goto _L18
_L15:
        p.setVisibility(8);
        v.setVisibility(8);
        return;
_L16:
        p.setVisibility(8);
        v.setVisibility(0);
        int j1 = getResources().getDimensionPixelSize(0x7f0900ec);
        if (h == a.e)
        {
            v.setPadding(j1, 0, 0, 0);
        } else
        {
            v.setPadding(j1, 0, j1, 0);
        }
        switch (com.pandora.android.view._cls7.b[w.ordinal()])
        {
        default:
            throw new IllegalArgumentException((new StringBuilder()).append("Unsupported SearchBoxType value : ").append(w).toString());

        case 2: // '\002'
            break; /* Loop/switch isn't completed */

        case 1: // '\001'
            v.requestFocus();
            if (C)
            {
                v.a();
            }
            v.a(y);
            break;
        }
_L21:
        if (x != -1)
        {
            v.setSmallHint(x);
            return;
        }
        if (true) goto _L20; else goto _L19
_L19:
        v.a(x, z);
        v.setSearchText(B);
        if (A != null)
        {
            v.a(A);
        }
        if (C)
        {
            v.a();
        }
        if (D)
        {
            v.c();
        } else
        {
            v.d();
        }
          goto _L21
          goto _L20
_L17:
        p.setVisibility(0);
        v.setVisibility(8);
        p.setText(i);
        return;
        if (true) goto _L3; else goto _L22
_L22:
    }

    public void onAttachedToWindow()
    {
        super.onAttachedToWindow();
    }

    public void onDetachedFromWindow()
    {
        super.onDetachedFromWindow();
        com.pandora.android.provider.b.a.e().b(this);
    }

    public void onHeaderConfigurationReadyEvent(i i1)
    {
        if (i1.b != e)
        {
            return;
        }
        if (i1.a)
        {
            if (f != i1.h)
            {
                f = i1.h;
            }
            if (C != i1.q)
            {
                C = i1.q;
            }
            if (D != i1.r)
            {
                D = i1.r;
            }
            if (j != i1.i)
            {
                j = i1.i;
            }
            if (c != getResources().getColor(0x7f0b005a))
            {
                c = i1.j;
            }
            if (i == null)
            {
                i = i1.f;
            }
            if (g == null)
            {
                g = i1.c;
            }
            if (h == null)
            {
                h = i1.d;
            }
            if (k == null)
            {
                k = i1.g;
            }
            if (l == null)
            {
                l = i1.e;
            }
            if (w == null)
            {
                w = i1.l;
            }
            if (x == -1)
            {
                x = i1.k;
            }
            if (y == null)
            {
                y = i1.m;
            }
            if (z == null)
            {
                z = i1.n;
            }
            if (A == null)
            {
                A = i1.o;
            }
            B = v.getSearchText();
        } else
        {
            f = i1.h;
            j = i1.i;
            c = i1.j;
            i = i1.f;
            g = i1.c;
            h = i1.d;
            k = i1.g;
            l = i1.e;
            w = i1.l;
            x = i1.k;
            y = i1.m;
            z = i1.n;
            A = i1.o;
            B = i1.p;
            C = i1.q;
            D = i1.r;
        }
        b();
    }
}
