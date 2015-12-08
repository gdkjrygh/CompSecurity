// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.cloudlib.sns.basepost;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Color;
import android.support.v4.app.Fragment;
import android.support.v7.widget.al;
import android.support.v7.widget.bi;
import android.text.SpannableStringBuilder;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.bumptech.glide.c;
import com.bumptech.glide.d;
import com.bumptech.glide.h;
import com.bumptech.glide.k;
import com.bumptech.glide.l;
import com.bumptech.glide.load.b.e;
import com.roidapp.baselib.c.an;
import com.roidapp.baselib.view.r;
import com.roidapp.cloudlib.ao;
import com.roidapp.cloudlib.ap;
import com.roidapp.cloudlib.aq;
import com.roidapp.cloudlib.ar;
import com.roidapp.cloudlib.as;
import com.roidapp.cloudlib.at;
import com.roidapp.cloudlib.sns.af;
import com.roidapp.cloudlib.sns.b.g;
import com.roidapp.cloudlib.sns.b.m;
import com.roidapp.cloudlib.sns.b.n;
import com.roidapp.cloudlib.sns.b.o;
import com.roidapp.cloudlib.sns.b.p;
import com.roidapp.cloudlib.sns.b.x;
import com.roidapp.cloudlib.sns.g.a;
import com.roidapp.cloudlib.sns.g.b;
import com.roidapp.cloudlib.sns.g.f;
import com.roidapp.cloudlib.sns.q;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

// Referenced classes of package com.roidapp.cloudlib.sns.basepost:
//            b, bd, bi, bp, 
//            bo, bj, bk, bl, 
//            bm, d, u, PostCommentsTextView, 
//            aw, bq, bg, bt, 
//            bs, PinnedListView2, be, bf, 
//            bn

public final class bc extends al
    implements android.view.View.OnClickListener, k, l, com.roidapp.cloudlib.sns.basepost.b
{

    private boolean A;
    private boolean B;
    private boolean C;
    private final List D = new ArrayList();
    private int E;
    private boolean F;
    private Context a;
    private Fragment b;
    private PinnedListView2 c;
    private List d;
    private int e;
    private int f;
    private r g;
    private p h;
    private x i;
    private boolean j;
    private u k;
    private int l;
    private int m;
    private int n;
    private int o;
    private int p;
    private int q;
    private int r;
    private int s;
    private int t;
    private TextPaint u;
    private int v;
    private long w;
    private Pattern x;
    private m y;
    private boolean z;

    public bc(Fragment fragment, PinnedListView2 pinnedlistview2, boolean flag, boolean flag1, boolean flag2, u u1)
    {
        f = 1;
        v = -1;
        w = -1L;
        x = Pattern.compile("[#|@]\\w+");
        C = true;
        b = fragment;
        a = fragment.getActivity();
        c = pinnedlistview2;
        z = flag;
        A = flag1;
        B = flag2;
        e = a.getResources().getDisplayMetrics().widthPixels;
        k = u1;
        m = Color.parseColor("#bdbdbd");
        n = Color.parseColor("#a0a0a0");
        o = Color.parseColor("#00ca72");
        p = Color.parseColor("#00844a");
        q = Color.parseColor("#384248");
        r = Color.parseColor("#7f878c");
        s = Color.parseColor("#1de9b6");
        t = Color.parseColor("#19cea1");
        u = new TextPaint();
        u.setAntiAlias(true);
        u.setColor(Color.parseColor("#384248"));
        u.setTextSize(a.getResources().getDimensionPixelSize(ap.k));
        l = e - (int)a.getResources().getDisplayMetrics().density * 20;
        y = new bd(this);
    }

    static Context a(bc bc1)
    {
        return bc1.a;
    }

    private void a(int i1, boolean flag)
    {
        Object obj = (n)g(i1);
        com.roidapp.cloudlib.sns.g.b.a();
        obj = com.roidapp.cloudlib.sns.g.a.a(com.roidapp.cloudlib.sns.g.f.b(com.roidapp.cloudlib.sns.g.b.a(((n) (obj)).b), ((n) (obj)).a.a), ((n) (obj)).f);
        switch (com.roidapp.cloudlib.sns.basepost.bi.b[((g) (obj)).ordinal()])
        {
        default:
            return;

        case 1: // '\001'
            o o1;
            if (flag)
            {
                com.roidapp.baselib.c.b.a("SNS", "click", "SNS/Like/DoubleClick");
                com.roidapp.cloudlib.al.g().a(a, "SNS", "click", "SNS/Like/DoubleClick", Long.valueOf(1L));
            } else
            {
                com.roidapp.baselib.c.b.a("SNS", "click", "SNS/Like/Click");
                com.roidapp.cloudlib.al.g().a(a, "SNS", "click", "SNS/Like/Click", Long.valueOf(1L));
            }
            obj = (n)g(i1);
            o1 = ((n) (obj)).a;
            com.roidapp.cloudlib.sns.g.b.a().c(((n) (obj)));
            com.roidapp.cloudlib.sns.q.h(h.a, i.a, o1.a, new bp(this, ((n) (obj)))).a(this);
            return;

        case 2: // '\002'
            break;
        }
        o o2;
        if (flag)
        {
            com.roidapp.baselib.c.b.a("SNS", "click", "SNS/UnLike/DoubleClick");
            com.roidapp.cloudlib.al.g().a(a, "SNS", "click", "SNS/UnLike/DoubleClick", Long.valueOf(1L));
        } else
        {
            com.roidapp.baselib.c.b.a("SNS", "click", "SNS/UnLike/Click");
            com.roidapp.cloudlib.al.g().a(a, "SNS", "click", "SNS/UnLike/Click", Long.valueOf(1L));
        }
        obj = (n)g(i1);
        o2 = ((n) (obj)).a;
        com.roidapp.cloudlib.sns.g.b.a().c(((n) (obj)));
        com.roidapp.cloudlib.sns.q.g(h.a, i.a, o2.a, new bo(this, ((n) (obj)))).a(this);
    }

    private void a(SpannableStringBuilder spannablestringbuilder, CharSequence charsequence, int i1, x x1, long l1, boolean flag, 
            int j1, int k1)
    {
        int i2 = spannablestringbuilder.length();
        spannablestringbuilder.append(charsequence);
        if (flag)
        {
            spannablestringbuilder.setSpan(new bj(this, j1, k1, l1, i1), i2, spannablestringbuilder.length(), 33);
            a(spannablestringbuilder, charsequence, i2, true);
            spannablestringbuilder.append("\n");
            return;
        } else
        {
            spannablestringbuilder.setSpan(new bk(this, j1, k1, x1), i2, charsequence.length() + i2, 33);
            spannablestringbuilder.append("   ");
            return;
        }
    }

    private void a(SpannableStringBuilder spannablestringbuilder, CharSequence charsequence, int i1, boolean flag)
    {
        for (charsequence = x.matcher(charsequence); charsequence.find();)
        {
            String s1 = charsequence.group();
            if (s1.startsWith("#"))
            {
                spannablestringbuilder.setSpan(new bl(this, s1, s, t, flag), charsequence.start() + i1, charsequence.end() + i1, 33);
            } else
            {
                spannablestringbuilder.setSpan(new bm(this, o, p, s1, flag), charsequence.start() + i1, charsequence.end() + i1, 33);
            }
        }

    }

    private void a(n n1)
    {
        int i1 = d.indexOf(n1);
        if (i1 >= 0)
        {
            com.roidapp.cloudlib.sns.basepost.d.a().a(n1.b.a);
            d.remove(i1);
            d(i1);
            if (a() == 0)
            {
                k.q();
                k.b(true);
                k.i();
                return;
            }
        }
    }

    private void a(x x1)
    {
        k.a(x1, null);
    }

    private void a(PostCommentsTextView postcommentstextview, String s1)
    {
        if (!TextUtils.isEmpty(s1))
        {
            SpannableStringBuilder spannablestringbuilder = new SpannableStringBuilder(s1);
            a(spannablestringbuilder, ((CharSequence) (s1)), 0, false);
            postcommentstextview.a(new StaticLayout(spannablestringbuilder, u, l, android.text.Layout.Alignment.ALIGN_NORMAL, 1.0F, 1.0F, true));
            return;
        } else
        {
            postcommentstextview.a();
            return;
        }
    }

    static void a(bc bc1, int i1)
    {
        if (bc1.j)
        {
            an.a(bc1.a, bc1.a.getString(at.F));
            return;
        } else
        {
            (new aw(new bq(bc1, i1))).a(bc1.a, at.ap, at.ao, at.v, at.j);
            return;
        }
    }

    static void a(bc bc1, PostCommentsTextView postcommentstextview, String s1)
    {
        bc1.a(postcommentstextview, s1);
    }

    static boolean a(bc bc1, boolean flag)
    {
        bc1.j = flag;
        return flag;
    }

    static u b(bc bc1)
    {
        return bc1.k;
    }

    static void b(bc bc1, int i1)
    {
        (new aw(new bg(bc1, i1))).a(bc1.a, at.aA, at.az, at.av, at.j);
    }

    static p c(bc bc1)
    {
        return bc1.h;
    }

    static List d(bc bc1)
    {
        return bc1.d;
    }

    static x e(bc bc1)
    {
        return bc1.i;
    }

    private boolean j()
    {
        boolean flag = true;
        if (!af.a(a))
        {
            k.k();
            flag = false;
        }
        return flag;
    }

    public final int a()
    {
        if (d == null)
        {
            return 0;
        } else
        {
            return d.size();
        }
    }

    public final int a(int i1)
    {
        n n1 = (n)g(i1);
        if (n1.g)
        {
            if (n1.a.m == null)
            {
                C = false;
                return 1;
            } else
            {
                return 2;
            }
        } else
        {
            return 1;
        }
    }

    public final bi a(ViewGroup viewgroup, int i1)
    {
        switch (i1)
        {
        default:
            return null;

        case 2: // '\002'
            viewgroup = LayoutInflater.from(a).inflate(as.v, viewgroup, false);
            if (!B)
            {
                viewgroup.findViewById(ar.aE).setVisibility(8);
            }
            return new bt(viewgroup);

        case 1: // '\001'
            viewgroup = LayoutInflater.from(a).inflate(as.u, viewgroup, false);
            ImageView imageview = (ImageView)viewgroup.findViewById(ar.ar);
            android.widget.RelativeLayout.LayoutParams layoutparams = (android.widget.RelativeLayout.LayoutParams)imageview.getLayoutParams();
            layoutparams.width = e;
            layoutparams.height = e;
            imageview.setLayoutParams(layoutparams);
            break;
        }
        if (!z)
        {
            viewgroup.findViewById(ar.aC).setVisibility(4);
        }
        if (A)
        {
            viewgroup.findViewById(ar.aK).setVisibility(8);
            viewgroup.findViewById(ar.ah).setVisibility(0);
        }
        if (!C)
        {
            viewgroup.findViewById(ar.M).setVisibility(8);
        }
        return new bs(viewgroup);
    }

    public final View a(View view)
    {
        view = ((View) (view.getTag()));
        if (view != null)
        {
            if (view instanceof bs)
            {
                return ((bs)view).j;
            }
            if (!B)
            {
                return ((bt)view).k;
            }
        }
        return null;
    }

    public final com.bumptech.glide.e a(Object obj)
    {
        obj = (n)obj;
        return com.bumptech.glide.h.a(b).a(((n) (obj)).a.f).g().f().a(e.c);
    }

    public final void a(long l1)
    {
        if (d == null) goto _L2; else goto _L1
_L1:
        int i1;
        int j1;
        j1 = d.size();
        i1 = 0;
_L7:
        if (i1 >= j1) goto _L2; else goto _L3
_L3:
        n n1 = (n)d.get(i1);
        if (!n1.g || n1.b.a != l1) goto _L5; else goto _L4
_L4:
        a(n1);
_L2:
        return;
_L5:
        i1++;
        if (true) goto _L7; else goto _L6
_L6:
    }

    public final void a(bi bi1, int i1)
    {
        o o1;
        x x1;
        n n1;
        n1 = (n)g(i1);
        o1 = n1.a;
        x1 = n1.b;
        a(i1);
        JVM INSTR tableswitch 1 2: default 52
    //                   1 809
    //                   2 53;
           goto _L1 _L2 _L3
_L1:
        return;
_L3:
        bi1 = (bt)bi1;
        Object obj;
        boolean flag;
        int k1;
        int l1;
        int i2;
        if (o1.n != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        obj = (android.widget.RelativeLayout.LayoutParams)((bt) (bi1)).t.getLayoutParams();
        i2 = com.roidapp.cloudlib.common.d.a(a.getResources(), 2.0F);
        if (flag)
        {
            k1 = (e / 3) * 2;
        } else
        {
            k1 = e / 2;
        }
        obj.rightMargin = i2;
        l1 = Math.max(0, k1 - ((android.widget.RelativeLayout.LayoutParams) (obj)).leftMargin - ((android.widget.RelativeLayout.LayoutParams) (obj)).rightMargin);
        k1 = Math.max(0, k1 - ((android.widget.RelativeLayout.LayoutParams) (obj)).topMargin - ((android.widget.RelativeLayout.LayoutParams) (obj)).bottomMargin);
        obj.width = l1;
        obj.height = k1;
        ((bt) (bi1)).t.setLayoutParams(((android.view.ViewGroup.LayoutParams) (obj)));
        obj = (android.widget.RelativeLayout.LayoutParams)((bt) (bi1)).u.getLayoutParams();
        if (flag)
        {
            k1 = e / 3;
            l1 = k1;
        }
        obj.leftMargin = i2;
        obj.bottomMargin = i2;
        obj.width = l1;
        obj.height = k1;
        ((bt) (bi1)).u.setLayoutParams(((android.view.ViewGroup.LayoutParams) (obj)));
        ((bt) (bi1)).v.getLayoutParams();
        if (flag)
        {
            obj = (android.widget.RelativeLayout.LayoutParams)((bt) (bi1)).v.getLayoutParams();
            obj.topMargin = i2;
            obj.leftMargin = i2;
            obj.width = l1;
            obj.height = l1;
            ((bt) (bi1)).v.setVisibility(0);
            ((bt) (bi1)).v.setLayoutParams(((android.view.ViewGroup.LayoutParams) (obj)));
        } else
        {
            ((bt) (bi1)).v.setVisibility(8);
        }
        ((bt) (bi1)).o.setText(x1.b);
        ((bt) (bi1)).l.setTag(Integer.valueOf(i1));
        ((bt) (bi1)).l.setOnClickListener(this);
        com.bumptech.glide.h.a(b).a(x1.h).i().a(e.c).a().a(new com.roidapp.cloudlib.sns.e.a(((bt) (bi1)).n));
        ((bt) (bi1)).q.setTag(Integer.valueOf(i1));
        ((bt) (bi1)).q.setOnClickListener(this);
        ((bt) (bi1)).j.setTag(Integer.valueOf(i1));
        ((bt) (bi1)).j.setOnClickListener(this);
        ((bt) (bi1)).s.setTag(Integer.valueOf(i1));
        ((bt) (bi1)).s.setOnClickListener(this);
        com.roidapp.cloudlib.sns.g.b.a();
        obj = com.roidapp.cloudlib.sns.g.f.a(com.roidapp.cloudlib.sns.g.b.a(x1), x1.q);
        com.roidapp.cloudlib.sns.basepost.bi.a[((com.roidapp.cloudlib.sns.b.c) (obj)).ordinal()];
        JVM INSTR tableswitch 1 3: default 476
    //                   1 667
    //                   2 719
    //                   3 778;
           goto _L4 _L5 _L6 _L7
_L4:
        break; /* Loop/switch isn't completed */
_L5:
        break; /* Loop/switch isn't completed */
_L9:
        com.bumptech.glide.h.a(b).a(x1.h).i().a(e.c).a().a(new com.roidapp.cloudlib.sns.e.a(((bt) (bi1)).n));
        com.bumptech.glide.h.a(b).a(o1.e).b(com.roidapp.baselib.b.a.b()).g().a(e.c).a(((bt) (bi1)).t);
        com.bumptech.glide.h.a(b).a(o1.m).b(com.roidapp.baselib.b.a.b()).g().a(e.c).a(((bt) (bi1)).u);
        if (flag)
        {
            com.bumptech.glide.h.a(b).a(o1.n).b(com.roidapp.baselib.b.a.b()).g().a(e.c).a(((bt) (bi1)).v);
            return;
        }
        if (true) goto _L1; else goto _L8
_L8:
        ((bt) (bi1)).r.setVisibility(8);
        ((bt) (bi1)).q.setText(a.getString(at.N));
        ((bt) (bi1)).q.setTextColor(Color.parseColor("#ffffff"));
        ((bt) (bi1)).q.setBackgroundResource(aq.k);
          goto _L9
_L6:
        ((bt) (bi1)).r.setVisibility(8);
        ((bt) (bi1)).q.setText(a.getString(at.P));
        ((bt) (bi1)).q.setTextColor(a.getResources().getColor(ao.a));
        ((bt) (bi1)).q.setBackgroundResource(aq.K);
          goto _L9
_L7:
        ((bt) (bi1)).r.setVisibility(0);
        ((bt) (bi1)).q.setText("");
        ((bt) (bi1)).q.setBackgroundResource(aq.K);
          goto _L9
_L2:
        bs bs1;
        bs1 = (bs)bi1;
        bs1.s.setClickable(true);
        bs1.t.setOnClickListener(this);
        bs1.u.setOnClickListener(this);
        bs1.v.setOnClickListener(this);
        bs1.j.setOnClickListener(this);
        bs1.o.setOnClickListener(this);
        bs1.p.setOnClickListener(this);
        bs1.C.setOnClickListener(this);
        bs1.C.setTag(Integer.valueOf(i1));
        bs1.C.setOnClickListener(this);
        if (d == null) goto _L1; else goto _L10
_L10:
        a a1;
        com.roidapp.cloudlib.sns.g.b.a();
        a1 = com.roidapp.cloudlib.sns.g.f.b(com.roidapp.cloudlib.sns.g.b.a(n1.b), n1.a.a);
        if (n1.f == null) goto _L12; else goto _L11
_L11:
        bi1 = com.roidapp.cloudlib.sns.g.a.a(a1, n1.f);
        com.roidapp.cloudlib.sns.basepost.bi.b[bi1.ordinal()];
        JVM INSTR tableswitch 1 3: default 992
    //                   1 1250
    //                   2 1283
    //                   3 1316;
           goto _L13 _L14 _L15 _L16
_L13:
        break; /* Loop/switch isn't completed */
_L14:
        bs1.w.setVisibility(8);
        bs1.x.setVisibility(0);
        bs1.x.setImageResource(aq.o);
          goto _L12
_L15:
        bs1.w.setVisibility(8);
        bs1.x.setVisibility(0);
        bs1.x.setImageResource(aq.p);
          goto _L12
_L16:
        bs1.w.setVisibility(0);
        bs1.x.setVisibility(8);
_L12:
        n1.c = com.roidapp.cloudlib.sns.g.a.a(a1, n1.c);
        if (n1.c != null)
        {
            bs1.r.setVisibility(0);
            SpannableStringBuilder spannablestringbuilder = new SpannableStringBuilder();
            int j1 = n1.c.size();
            if (j1 > 4)
            {
                a(spannablestringbuilder, ((CharSequence) (a.getString(at.s))), i1, null, 0L, true, m, n);
                spannablestringbuilder.append("\n");
                j1 = 3;
            } else
            {
                j1--;
            }
            for (; j1 >= 0; j1--)
            {
                com.roidapp.cloudlib.sns.b.a a2 = (com.roidapp.cloudlib.sns.b.a)n1.c.get(j1);
                x x2 = a2.d;
                long l2 = a2.a;
                String s1 = a2.d.b;
                bi1 = s1;
                if (h != null)
                {
                    bi1 = s1;
                    if (h.b != null)
                    {
                        bi1 = s1;
                        if (x2.a == h.b.a)
                        {
                            com.roidapp.cloudlib.sns.g.b.a();
                            bi1 = com.roidapp.cloudlib.sns.g.f.a(com.roidapp.cloudlib.sns.g.b.a(x2), a2.d.b);
                        }
                    }
                }
                a(spannablestringbuilder, ((CharSequence) (bi1)), i1, x2, l2, false, o, p);
                a(spannablestringbuilder, ((CharSequence) (a2.c)), i1, x2, l2, true, q, r);
            }

            bi1 = new StaticLayout(spannablestringbuilder, u, l, android.text.Layout.Alignment.ALIGN_NORMAL, 1.0F, 1.0F, true);
            bs1.s.a(bi1);
        } else
        {
            bs1.r.setVisibility(8);
        }
        bi1 = null;
        if (i != null && x1.a == i.a)
        {
            com.roidapp.cloudlib.sns.g.b.a();
            bi1 = com.roidapp.cloudlib.sns.g.b.a(x1);
            bs1.l.setText(com.roidapp.cloudlib.sns.g.f.a(bi1, i.b));
            x1.h = com.roidapp.cloudlib.sns.g.f.b(bi1, i.h);
            bi1 = com.roidapp.cloudlib.sns.g.f.a(bi1);
        } else
        {
            bs1.l.setText(x1.b);
        }
        if (bi1 != null)
        {
            com.bumptech.glide.h.a(b).a(x1.h).i().a(com.bumptech.glide.h.a(b).a(bi1).i()).a(e.c).a().a(new com.roidapp.cloudlib.sns.e.a(bs1.k));
        } else
        {
            com.bumptech.glide.h.a(b).a(x1.h).i().a(e.c).a().a(new com.roidapp.cloudlib.sns.e.a(bs1.k));
        }
        bs1.j.setTag(Integer.valueOf(i1));
        bs1.t.setTag(Integer.valueOf(i1));
        bs1.u.setTag(Integer.valueOf(i1));
        bs1.o.setTag(Integer.valueOf(i1));
        if (z)
        {
            bs1.v.setTag(o1);
        }
        bs1.m.setText(com.roidapp.cloudlib.sns.h.a().a(a, o1.j));
        bs1.z.setText(String.valueOf(com.roidapp.cloudlib.sns.g.a.b(a1, o1.i)));
        bs1.y.setText(String.valueOf(com.roidapp.cloudlib.sns.g.a.a(a1, o1.h)));
        if (o1.d != null)
        {
            if (o1.l)
            {
                com.roidapp.cloudlib.sns.b.k.a(bs1.q, o1.d, y);
            } else
            {
                a(bs1.q, o1.d);
            }
        }
        com.bumptech.glide.h.a(b).a(o1.f).b(com.roidapp.baselib.b.a.b()).g().a(e.c).a(new com.roidapp.cloudlib.sns.e.c(bs1.o, bs1.n, bs1.p));
        return;
    }

    public final void a(com.roidapp.cloudlib.sns.b.a.e e1)
    {
        j = false;
        if (e1 != null && d != null)
        {
            f = f + 1;
            d.addAll(e1);
            c.b(d.size());
            c();
            if (d.size() <= 0)
            {
                k.b(true);
                return;
            }
        }
    }

    public final void a(p p1, x x1)
    {
        h = p1;
        i = x1;
    }

    public final void a(List list)
    {
        d = list;
    }

    public final void a(boolean flag)
    {
        j = flag;
    }

    public final long b(int i1)
    {
        return 0L;
    }

    public final volatile int[] b()
    {
        return (new int[] {
            e, e
        });
    }

    public final void b_(int i1)
    {
        if (!af.a(a))
        {
            return;
        } else
        {
            a(((n)g(i1)).b);
            return;
        }
    }

    public final List c(int i1)
    {
        i1 = (i1 - E) + 1;
        if (i1 < 0 || i1 >= a())
        {
            return D;
        }
        a(i1);
        JVM INSTR tableswitch 1 1: default 48
    //                   1 53;
           goto _L1 _L2
_L1:
        return D;
_L2:
        if ((i1 = Math.max(0, i1)) < d.size())
        {
            return d.subList(i1, i1 + 1);
        }
        if (true) goto _L1; else goto _L3
_L3:
    }

    public final void d()
    {
        j = false;
    }

    public final void e()
    {
        j = false;
    }

    public final void e(int i1)
    {
        k.m();
        if (d == null) goto _L2; else goto _L1
_L1:
        Iterator iterator = d.iterator();
_L5:
        if (!iterator.hasNext()) goto _L2; else goto _L3
_L3:
        n n1 = (n)iterator.next();
        if (n1.a == null || n1.a.a != i1) goto _L5; else goto _L4
_L4:
        iterator.remove();
        i1 = 1;
_L7:
        if (i1 != 0)
        {
            c();
            k.q();
            an.a(a, a.getString(at.G));
            if (a() == 0)
            {
                k.b(true);
                k.i();
            }
        }
        return;
_L2:
        i1 = 0;
        if (true) goto _L7; else goto _L6
_L6:
    }

    public final int f()
    {
        return f;
    }

    public final void f(int i1)
    {
        f = i1;
    }

    public final Object g(int i1)
    {
        return d.get(i1);
    }

    public final List g()
    {
        return d;
    }

    public final void h(int i1)
    {
        E = i1;
    }

    public final boolean h()
    {
        return j;
    }

    public final boolean i()
    {
        return a() > 0 && !F;
    }

    public final void j_()
    {
        k.p();
    }

    public final void onClick(View view)
    {
        int i1;
        i1 = view.getId();
        F = true;
        if (h == null)
        {
            h = com.roidapp.cloudlib.sns.b.q.a(a).c();
            if (h != null)
            {
                i = h.b;
            }
        }
        if (i1 != ar.ax) goto _L2; else goto _L1
_L1:
        if (j()) goto _L4; else goto _L3
_L3:
        return;
_L4:
        a(((Integer)view.getTag()).intValue(), false);
        return;
_L2:
        if (i1 != ar.N)
        {
            break; /* Loop/switch isn't completed */
        }
        if (j())
        {
            com.roidapp.baselib.c.b.a("SNS", "click", "SNS/ToComments/Layout/Click");
            com.roidapp.cloudlib.al.g().a(a, "SNS", "click", "SNS/ToComments/Layout/Click", Long.valueOf(1L));
            i1 = ((Integer)view.getTag()).intValue();
            k.a(i1, true);
            return;
        }
        if (true) goto _L3; else goto _L5
_L5:
        if (i1 != ar.aC)
        {
            break; /* Loop/switch isn't completed */
        }
        if (j())
        {
            com.roidapp.baselib.c.b.a("SNS", "click", "SNS/More/Layout/Click");
            com.roidapp.cloudlib.al.g().a(a, "SNS", "click", "SNS/More/Layout/Click", Long.valueOf(1L));
            o o1 = (o)view.getTag();
            if (o1.b == i.a)
            {
                g = new r(a, new String[] {
                    a.getResources().getString(at.v)
                }, 0, 1);
                g.a(new be(this));
            } else
            {
                g = new r(a, new String[] {
                    a.getResources().getString(at.av)
                }, 0, 1);
                g.a(new bf(this));
            }
            g.a(view, o1.a);
            return;
        }
        if (true) goto _L3; else goto _L6
_L6:
        if (i1 != ar.aJ)
        {
            break; /* Loop/switch isn't completed */
        }
        if (j())
        {
            com.roidapp.baselib.c.b.a("SNS", "click", "SNS/ToPersonalCenter/FromPostTittle/Click");
            com.roidapp.cloudlib.al.g().a(a, "SNS", "click", "SNS/ToPersonalCenter/FromPostTittle/Click", Long.valueOf(1L));
            a(((n)g(((Integer)view.getTag()).intValue())).b);
            return;
        }
        if (true) goto _L3; else goto _L7
_L7:
        if (i1 != ar.av)
        {
            break; /* Loop/switch isn't completed */
        }
        if (j())
        {
            com.roidapp.baselib.c.b.a("SNS", "click", "SNS/ToPersonalCenter/FromPostThumbnail/Click");
            com.roidapp.cloudlib.al.g().a(a, "SNS", "click", "SNS/ToPersonalCenter/FromPostThumbnail/Click", Long.valueOf(1L));
            a(((n)g(((Integer)view.getTag()).intValue())).b);
            return;
        }
        if (true) goto _L3; else goto _L8
_L8:
        if (i1 != ar.ar)
        {
            break; /* Loop/switch isn't completed */
        }
        i1 = ((Integer)view.getTag()).intValue();
        if (System.currentTimeMillis() - w < 300L && i1 == v)
        {
            if (j())
            {
                v = -1;
                w = -1L;
                ((View)view.getParent().getParent()).getTag();
                a(i1, true);
                return;
            }
        } else
        {
            v = i1;
            w = System.currentTimeMillis();
            return;
        }
        if (true) goto _L3; else goto _L9
_L9:
        if (i1 == ar.aj)
        {
            if (!j())
            {
                com.roidapp.baselib.c.b.a("SNS", "click", "SNS/Suggested/Follow/Click/NoLogin");
                com.roidapp.cloudlib.al.g().a(a, "SNS", "click", "SNS/Suggested/Follow/Click/NoLogin", Long.valueOf(1L));
                return;
            }
            n n1 = (n)g(((Integer)view.getTag()).intValue());
            switch (com.roidapp.cloudlib.sns.basepost.bi.a[n1.b.q.ordinal()])
            {
            default:
                return;

            case 1: // '\001'
                com.roidapp.baselib.c.b.a("SNS", "click", "SNS/Suggested/Follow/Click");
                break;
            }
            com.roidapp.cloudlib.al.g().a(a, "SNS", "click", "SNS/Suggested/Follow/Click", Long.valueOf(1L));
            view = (View)view.getParent();
            view.findViewById(ar.ai).setVisibility(0);
            TextView textview = (TextView)view.findViewById(ar.aj);
            textview.setText("");
            textview.setBackgroundResource(aq.K);
            com.roidapp.cloudlib.sns.g.b.a().b(n1.b, h);
            com.roidapp.cloudlib.sns.q.a(h.a, i.a, n1.b.a, new bn(this, view, n1)).a(this);
            return;
        }
        if (i1 != ar.am)
        {
            continue; /* Loop/switch isn't completed */
        }
        if (!j()) goto _L3; else goto _L10
_L10:
        com.roidapp.baselib.c.b.a("SNS", "click", "SNS/ToPersonalCenter/FromPostTittle/Click");
        com.roidapp.cloudlib.al.g().a(a, "SNS", "click", "SNS/ToPersonalCenter/FromPostTittle/Click", Long.valueOf(1L));
        a(((n)g(((Integer)view.getTag()).intValue())).b);
        return;
        if (i1 != ar.al) goto _L3; else goto _L11
_L11:
        com.roidapp.baselib.c.b.a("SNS", "click", "SNS/Suggested/Close/Click");
        com.roidapp.cloudlib.al.g().a(a, "SNS", "click", "SNS/Suggested/Close/Click", Long.valueOf(1L));
        a((n)g(((Integer)view.getTag()).intValue()));
        return;
    }
}
