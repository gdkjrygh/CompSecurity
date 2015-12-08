// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.cloudlib.sns.login;

import android.app.Application;
import android.content.res.Resources;
import android.graphics.Color;
import android.support.v4.app.Fragment;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.bumptech.glide.d;
import com.bumptech.glide.load.b.e;
import com.bumptech.glide.p;
import com.roidapp.baselib.c.aj;
import com.roidapp.baselib.c.u;
import com.roidapp.baselib.e.l;
import com.roidapp.baselib.view.RoundImageView;
import com.roidapp.cloudlib.al;
import com.roidapp.cloudlib.ao;
import com.roidapp.cloudlib.aq;
import com.roidapp.cloudlib.ar;
import com.roidapp.cloudlib.as;
import com.roidapp.cloudlib.at;
import com.roidapp.cloudlib.sns.af;
import com.roidapp.cloudlib.sns.b.c;
import com.roidapp.cloudlib.sns.b.q;
import com.roidapp.cloudlib.sns.b.x;
import com.roidapp.cloudlib.sns.g.f;
import com.roidapp.cloudlib.sns.h.h;
import com.roidapp.cloudlib.sns.main.b;
import com.roidapp.cloudlib.sns.o;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

// Referenced classes of package com.roidapp.cloudlib.sns.login:
//            b, d, c

public final class a extends BaseAdapter
    implements android.view.View.OnClickListener
{

    private static final int a[];
    private Fragment b;
    private long c;
    private int d;
    private boolean e;
    private List f;
    private String g;
    private String h;
    private boolean i;
    private boolean j;

    public a(Fragment fragment, String s)
    {
        this(fragment, null, -1L, s);
    }

    public a(Fragment fragment, List list, long l1, String s)
    {
        this(fragment, list, l1, false, s);
    }

    public a(Fragment fragment, List list, long l1, boolean flag, String s)
    {
        c = -1L;
        f = new ArrayList(0);
        g = null;
        h = null;
        a(list);
        b = fragment;
        j = flag;
        c = l1;
        h = s;
        d = aj.a().getResources().getColor(ao.a);
    }

    static Fragment a(a a1)
    {
        return a1.b;
    }

    private void a(long l1, String s, String s1)
    {
        if (b == null)
        {
            return;
        } else
        {
            s = com.roidapp.cloudlib.sns.h.h.a(l1, s, s1);
            s.C();
            ((b)b).a(s);
            return;
        }
    }

    public final void a()
    {
        f.clear();
        b = null;
    }

    public final void a(long l1)
    {
        c = l1;
    }

    public final void a(String s)
    {
        g = s;
    }

    public final void a(List list)
    {
        if (list != null)
        {
            f = list;
            return;
        } else
        {
            f.clear();
            return;
        }
    }

    public final void b()
    {
        e = true;
    }

    public final boolean c()
    {
        return getCount() > 0 && !i;
    }

    public final int getCount()
    {
        return f.size();
    }

    public final Object getItem(int k)
    {
        return f.get(k);
    }

    public final long getItemId(int k)
    {
        return (long)k;
    }

    public final View getView(int k, View view, ViewGroup viewgroup)
    {
        View view1 = view;
        if (view == null)
        {
            view1 = LayoutInflater.from(viewgroup.getContext()).inflate(as.C, null);
        }
        RoundImageView roundimageview = (RoundImageView)u.a(view1, ar.bf);
        Object obj = (TextView)u.a(view1, ar.aT);
        view = (TextView)u.a(view1, ar.h);
        viewgroup = (ProgressBar)u.a(view1, ar.aR);
        viewgroup.setVisibility(8);
        x x1 = (x)getItem(k);
        ((TextView) (obj)).setText(x1.b);
        String s = x1.h;
        com.bumptech.glide.h.a(b).a(s).i().a(e.c).a().a(new com.roidapp.cloudlib.sns.e.a(roundimageview));
        roundimageview.setTag(x1);
        roundimageview.setOnClickListener(this);
        ((TextView) (obj)).setTag(x1);
        ((TextView) (obj)).setOnClickListener(this);
        if (e)
        {
            TextView textview = (TextView)u.a(view1, ar.bS);
            textview.setText(String.valueOf(k + 1));
            textview.setVisibility(0);
            if (k < a.length)
            {
                ((TextView) (obj)).setCompoundDrawablesWithIntrinsicBounds(0, 0, a[k], 0);
            } else
            {
                ((TextView) (obj)).setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
            }
        }
        com.roidapp.cloudlib.sns.g.b.a();
        obj = com.roidapp.cloudlib.sns.g.f.a(com.roidapp.cloudlib.sns.g.b.a(x1), x1.q);
        if (obj == c.b)
        {
            viewgroup.setVisibility(8);
            view.setText(at.P);
            view.setTextColor(d);
            view.setBackgroundResource(aq.K);
        } else
        if (obj == c.c)
        {
            viewgroup.setVisibility(8);
            view.setText(at.N);
            view.setTextColor(Color.parseColor("#ffffff"));
            view.setBackgroundResource(aq.k);
        } else
        {
            viewgroup.setVisibility(0);
            view.setText("");
            view.setBackgroundResource(aq.K);
        }
        if (x1.a == c)
        {
            view.setVisibility(8);
        } else
        {
            view.setVisibility(0);
        }
        view.setTag(new com.roidapp.baselib.c.x(x1, obj));
        view.setOnClickListener(this);
        view1.setTag(ar.cp, x1);
        view1.setOnClickListener(this);
        return view1;
    }

    public final void onClick(View view)
    {
        if (b != null) goto _L2; else goto _L1
_L1:
        return;
_L2:
        i = true;
        if (g != null)
        {
            if (view.getId() == ar.h)
            {
                aj.a();
                com.roidapp.baselib.c.b.a("SNS", "click", String.format(Locale.ENGLISH, "SNS/%s/UserCenter/Click", new Object[] {
                    g
                }));
                al.g().a(aj.a(), "SNS", "click", String.format(Locale.ENGLISH, "SNS/%s/UserCenter/Click", new Object[] {
                    g
                }), Long.valueOf(1L));
            } else
            if (view.getId() == ar.bf || view.getId() == ar.aT)
            {
                aj.a();
                com.roidapp.baselib.c.b.a("SNS", "click", String.format(Locale.ENGLISH, "SNS/%s/Follow/Click", new Object[] {
                    g
                }));
                al.g().a(aj.a(), "SNS", "click", String.format(Locale.ENGLISH, "SNS/%s/Follow/Click", new Object[] {
                    g
                }), Long.valueOf(1L));
            }
        }
        if (!(b instanceof b) || af.a(aj.a()))
        {
            break; /* Loop/switch isn't completed */
        }
        if (!((b)b).s())
        {
            af.a(b.getActivity(), new com.roidapp.cloudlib.sns.login.b(this), h);
            return;
        }
        if (true) goto _L1; else goto _L3
_L3:
        Object obj;
        if (view.getId() != ar.h)
        {
            continue; /* Loop/switch isn't completed */
        }
        if (b.getActivity() != null && !l.b(aj.a()))
        {
            l.a(b.getActivity(), null);
            return;
        }
        obj = (com.roidapp.baselib.c.x)view.getTag();
        view = (x)((com.roidapp.baselib.c.x) (obj)).a;
        obj = (c)((com.roidapp.baselib.c.x) (obj)).b;
        if (obj != c.b)
        {
            continue; /* Loop/switch isn't completed */
        }
        if (b != null)
        {
            obj = q.a(aj.a()).c();
            com.roidapp.cloudlib.sns.g.b.a().b(view, ((com.roidapp.cloudlib.sns.b.p) (obj)));
            com.roidapp.cloudlib.sns.q.b(((com.roidapp.cloudlib.sns.b.p) (obj)).a, ((com.roidapp.cloudlib.sns.b.p) (obj)).b.a, ((x) (view)).a, new com.roidapp.cloudlib.sns.login.d(this, view, ((com.roidapp.cloudlib.sns.b.p) (obj)))).a(b);
            return;
        }
        continue; /* Loop/switch isn't completed */
        if (obj != c.c || b == null) goto _L1; else goto _L4
_L4:
        com.roidapp.cloudlib.sns.b.p p1 = q.a(aj.a()).c();
        com.roidapp.cloudlib.sns.g.b.a().b(view, p1);
        com.roidapp.cloudlib.sns.q.a(p1.a, p1.b.a, ((x) (view)).a, new com.roidapp.cloudlib.sns.login.c(this, view, p1)).a(b);
        return;
        if (b == null || j) goto _L1; else goto _L5
_L5:
        if (view.getId() == ar.bf || view.getId() == ar.aT)
        {
            x x1 = (x)view.getTag();
            long l1 = x1.a;
            if (TextUtils.isEmpty(x1.b))
            {
                view = x1.c;
            } else
            {
                view = x1.b;
            }
            a(l1, view, x1.h);
            return;
        }
        if (view.getTag(ar.cp) instanceof x)
        {
            x x2 = (x)view.getTag(ar.cp);
            long l2 = x2.a;
            if (TextUtils.isEmpty(x2.b))
            {
                view = x2.c;
            } else
            {
                view = x2.b;
            }
            a(l2, view, x2.h);
            return;
        }
        if (true) goto _L1; else goto _L6
_L6:
    }

    static 
    {
        a = (new int[] {
            aq.ab, aq.ac, aq.ad
        });
    }
}
