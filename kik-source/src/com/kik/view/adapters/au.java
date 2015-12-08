// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kik.view.adapters;

import android.content.Context;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import com.kik.cache.ad;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Vector;
import kik.a.d.a.a;
import kik.a.d.a.d;
import kik.a.d.a.g;
import kik.a.d.a.l;
import kik.a.d.a.m;
import kik.a.d.s;
import kik.a.e.n;
import kik.a.e.r;
import kik.a.f.k;
import kik.android.e.f;
import kik.android.i.b;
import kik.android.util.ae;
import kik.android.util.t;

// Referenced classes of package com.kik.view.adapters:
//            aj, e, be, az, 
//            l, h, z, m, 
//            ac, i, ad, w, 
//            n, af, ar, aq, 
//            av, ax, aw

public final class au extends ArrayAdapter
    implements ar.a
{
    private static final class a extends Enum
    {

        public static final a a;
        public static final a b;
        public static final a c;
        public static final a d;
        public static final a e;
        public static final a f;
        public static final a g;
        public static final a h;
        public static final a i;
        public static final a j;
        public static final a k;
        private static final a l[];

        public static a valueOf(String s1)
        {
            return (a)Enum.valueOf(com/kik/view/adapters/au$a, s1);
        }

        public static a[] values()
        {
            return (a[])l.clone();
        }

        static 
        {
            a = new a("VIEW_TYPE_SYSTEM", 0);
            b = new a("VIEW_TYPE_CHAT", 1);
            c = new a("VIEW_TYPE_ARTICLE", 2);
            d = new a("VIEW_TYPE_REDACTED", 3);
            e = new a("VIEW_TYPE_CONTENT_PHOTO", 4);
            f = new a("VIEW_TYPE_CONTENT_PNG_PHOTO", 5);
            g = new a("VIEW_TYPE_FULL_BLEED", 6);
            h = new a("VIEW_TYPE_VIDEO_FULL_BLEED", 7);
            i = new a("VIEW_TYPE_VIDEO_CLASSIC", 8);
            j = new a("VIEW_TYPE_BANNER", 9);
            k = new a("VIEW_TYPE_GIF", 10);
            l = (new a[] {
                a, b, c, d, e, f, g, h, i, j, 
                k
            });
        }

        private a(String s1, int i1)
        {
            super(s1, i1);
        }
    }

    public static interface b
        extends android.widget.AdapterView.OnItemClickListener
    {

        public abstract void a();
    }


    private static final Handler e = new Handler();
    private b A;
    private HashSet B;
    private HashSet C;
    private final f D;
    private HashSet E;
    private HashSet F;
    private boolean G;
    private final LayoutInflater a;
    private boolean b;
    private boolean c;
    private final int d = a.values().length;
    private int f;
    private final Vector g;
    private final android.view.View.OnClickListener h;
    private final android.view.View.OnClickListener i;
    private final ArrayList j;
    private final r k;
    private final be l;
    private final e m;
    private final az n;
    private final com.kik.view.adapters.n o;
    private final com.kik.view.adapters.m p;
    private final h q;
    private final z r;
    private final ac s;
    private final i t;
    private final w u;
    private final com.kik.view.adapters.ad v;
    private final com.kik.android.a w;
    private final kik.android.chat.b.d x;
    private final af y = new aj();
    private kik.android.util.bw.a z;

    public au(Context context, List list, Vector vector, android.view.View.OnClickListener onclicklistener, android.view.View.OnClickListener onclicklistener1, kik.android.util.bw.a a1, ArrayList arraylist, 
            r r1, ad ad1, f f1, com.kik.android.a a2, n n1, k k1, kik.android.chat.b.d d1, 
            com.kik.e.a a3)
    {
        super(context, 0, list);
        b = false;
        c = false;
        B = new HashSet();
        C = new HashSet();
        E = new HashSet();
        F = new HashSet();
        G = true;
        f = list.size();
        k = r1;
        a = LayoutInflater.from(context);
        g = vector;
        h = onclicklistener;
        z = a1;
        w = a2;
        x = d1;
        j = arraylist;
        i = onclicklistener1;
        D = f1;
        list = new kik.android.i.b();
        m = new e(a, context, h, z, this, ad1, D, w, n1, d1, a3);
        l = new be(a, context, h, z, this, ad1, w, n1, a3);
        n = new az(a, context, h, z, this, ad1, w, n1, d1, a3);
        o = new com.kik.view.adapters.l(a, context, h, i, this, ad1, w, n1, k1, d1, a3);
        q = new h(a, context, h, i, this, ad1, w, n1, k1, d1, a3);
        r = new z(a, context, h, i, this, ad1, w, n1, k1, d1, a3);
        p = new com.kik.view.adapters.m(a, context, h, i, this, ad1, w, n1, k1, d1, a3);
        s = new ac(a, context, h, i, this, ad1, w, n1, k1, a3, list, y);
        t = new i(a, context, h, i, this, ad1, w, n1, k1, d1, a3, list, y);
        v = new com.kik.view.adapters.ad(a, context, h, i, this, ad1, w, n1, k1, d1, a3);
        u = new w(a, context, h, this, ad1, w, n1, a3);
        q.a(B);
        q.b();
        o.a(C);
        o.b();
        r.a(E);
        r.b();
        s.a(E);
        s.b();
        t.a(E);
        t.b();
        p.a(F);
        p.b();
        v.a(B);
        v.b();
    }

    static b a(au au1)
    {
        return au1.A;
    }

    private ar c(int i1)
    {
        a a1 = d(i1);
        static final class _cls1
        {

            static final int a[];

            static 
            {
                a = new int[a.values().length];
                try
                {
                    a[com.kik.view.adapters.a.d.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror10) { }
                try
                {
                    a[com.kik.view.adapters.a.b.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror9) { }
                try
                {
                    a[com.kik.view.adapters.a.a.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror8) { }
                try
                {
                    a[a.c.ordinal()] = 4;
                }
                catch (NoSuchFieldError nosuchfielderror7) { }
                try
                {
                    a[a.e.ordinal()] = 5;
                }
                catch (NoSuchFieldError nosuchfielderror6) { }
                try
                {
                    a[com.kik.view.adapters.a.f.ordinal()] = 6;
                }
                catch (NoSuchFieldError nosuchfielderror5) { }
                try
                {
                    a[com.kik.view.adapters.a.g.ordinal()] = 7;
                }
                catch (NoSuchFieldError nosuchfielderror4) { }
                try
                {
                    a[a.h.ordinal()] = 8;
                }
                catch (NoSuchFieldError nosuchfielderror3) { }
                try
                {
                    a[a.i.ordinal()] = 9;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    a[a.j.ordinal()] = 10;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    a[com.kik.view.adapters.a.k.ordinal()] = 11;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        switch (com.kik.view.adapters._cls1.a[a1.ordinal()])
        {
        default:
            return null;

        case 1: // '\001'
            return n;

        case 2: // '\002'
            return m;

        case 3: // '\003'
            return l;

        case 4: // '\004'
            return o;

        case 5: // '\005'
            return q;

        case 6: // '\006'
            return u;

        case 7: // '\007'
            return r;

        case 8: // '\b'
            return s;

        case 9: // '\t'
            return t;

        case 10: // '\n'
            return p;

        case 11: // '\013'
            return v;
        }
    }

    private a d(int i1)
    {
        Object obj = (s)getItem(i1);
        if (kik.a.d.a.g.a(((s) (obj)), kik/a/d/a/l) != null || kik.a.d.a.g.a(((s) (obj)), kik/a/d/a/m) != null || kik.a.d.a.g.a(((s) (obj)), kik/a/d/a/b) != null)
        {
            return com.kik.view.adapters.a.a;
        }
        if (!((s) (obj)).d() && g.contains(((s) (obj)).h()))
        {
            return com.kik.view.adapters.a.d;
        }
        if (kik.a.d.a.g.a(((s) (obj)), kik/a/d/a/a) != null)
        {
            obj = (kik.a.d.a.a)kik.a.d.a.g.a(((s) (obj)), kik/a/d/a/a);
            if (kik.android.util.t.a(((kik.a.d.a.a) (obj))).a(kik.a.d.a.a.b.c))
            {
                return a.c;
            }
            if (kik.android.util.t.a(((kik.a.d.a.a) (obj))).a(kik.a.d.a.a.b.f))
            {
                return a.j;
            }
            if (kik.android.util.t.a(((kik.a.d.a.a) (obj))).a(kik.a.d.a.a.b.d))
            {
                if (kik.android.util.t.a(((kik.a.d.a.a) (obj)).u()))
                {
                    return com.kik.view.adapters.a.g;
                } else
                {
                    return a.e;
                }
            }
            if (kik.android.util.t.a(((kik.a.d.a.a) (obj))).a(kik.a.d.a.a.b.e))
            {
                if ("com.kik.ext.gif".equals(((kik.a.d.a.a) (obj)).u()) && kik.android.gifs.a.a(((kik.a.d.a.a) (obj))))
                {
                    return com.kik.view.adapters.a.k;
                }
                if (ae.b(((kik.a.d.a.a) (obj))) || kik.android.util.t.a(((kik.a.d.a.a) (obj)).u()))
                {
                    return a.h;
                } else
                {
                    return a.h;
                }
            }
            if (((kik.a.d.a.a) (obj)).a("png-preview") != null)
            {
                return com.kik.view.adapters.a.f;
            } else
            {
                return a.e;
            }
        }
        if (kik.a.d.a.g.a(((s) (obj)), kik/a/d/a/d) != null)
        {
            return com.kik.view.adapters.a.a;
        } else
        {
            return com.kik.view.adapters.a.b;
        }
    }

    public final kik.a.d.k a(s s1)
    {
        if (s1 == null)
        {
            return null;
        }
        l l1 = (l)kik.a.d.a.g.a(s1, kik/a/d/a/l);
        if (l1 != null)
        {
            return k.a(l1.b(), false);
        } else
        {
            return k.a(s1.h(), false);
        }
    }

    public final void a()
    {
        y.a();
    }

    public final void a(int i1)
    {
        if (i1 >= 0 && i1 < getCount())
        {
            ar ar1 = c(i1);
            if (ar1 != null)
            {
                ar1.b(i1);
            }
        }
    }

    public final void a(b b1)
    {
        A = b1;
    }

    public final void a(boolean flag)
    {
        c = flag;
    }

    public final void b()
    {
        s.c();
        t.c();
    }

    public final void b(int i1)
    {
        if (i1 >= 0 && i1 < getCount())
        {
            ar ar1 = c(i1);
            if (ar1 != null)
            {
                ar1.a(i1);
            }
        }
    }

    public final void b(s s1)
    {
        a(getPosition(s1));
    }

    public final void c(s s1)
    {
        int i1 = getPosition(s1);
        if (i1 >= 0)
        {
            s1 = c(i1);
            if (s1 != null)
            {
                s1.c(i1);
            }
        }
    }

    public final int getItemViewType(int i1)
    {
        return d(i1).ordinal();
    }

    public final View getView(int i1, View view, ViewGroup viewgroup)
    {
        boolean flag1 = true;
        ar ar1 = c(i1);
        if (ar1 == null)
        {
            throw new IllegalArgumentException((new StringBuilder("Invalid view type: ")).append(d(i1)).toString());
        }
        s s1 = (s)getItem(i1);
        Object obj;
        boolean flag;
        if ((ar1 instanceof aq) && ((aq)ar1).a(s1))
        {
            obj = new av(this, (aq)ar1, s1, i1);
        } else
        {
            obj = new aw(this, i1);
        }
        if (f < getCount())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag)
        {
            f = f + 1;
            e.postDelayed(new ax(this, s1), 300L);
        }
        if (i1 >= j.size() || !((Boolean)j.get(i1)).booleanValue())
        {
            flag1 = false;
        }
        return ar1.a(i1, view, viewgroup, s1, flag1, ((b) (obj)));
    }

    public final int getViewTypeCount()
    {
        return d;
    }

    public final boolean hasStableIds()
    {
        return true;
    }

    public final void notifyDataSetChanged()
    {
        if (!c)
        {
            super.notifyDataSetChanged();
        }
    }

}
