// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.cloudlib.sns.c;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ListView;
import com.bumptech.glide.d;
import com.bumptech.glide.h;
import com.bumptech.glide.p;
import com.roidapp.baselib.b.a;
import com.roidapp.baselib.c.aj;
import com.roidapp.cloudlib.al;
import com.roidapp.cloudlib.ar;
import com.roidapp.cloudlib.as;
import com.roidapp.cloudlib.at;
import com.roidapp.cloudlib.sns.ab;
import com.roidapp.cloudlib.sns.af;
import com.roidapp.cloudlib.sns.g.e;
import com.roidapp.cloudlib.sns.main.b;
import com.roidapp.cloudlib.sns.modifiedrefresh.SwipeRefreshLayout2;
import com.roidapp.cloudlib.sns.modifiedrefresh.x;
import com.roidapp.cloudlib.sns.o;
import com.roidapp.cloudlib.sns.q;

// Referenced classes of package com.roidapp.cloudlib.sns.c:
//            e, d

public final class c extends b
    implements x
{

    private SwipeRefreshLayout2 a;
    private ListView b;
    private ImageView c;
    private View d;
    private com.roidapp.cloudlib.sns.login.a e;
    private com.roidapp.cloudlib.sns.c.e f;
    private int g;
    private int h;
    private boolean i;
    private String j;
    private boolean k;

    public c()
    {
    }

    static void a(c c1, String s)
    {
        c1.a(s);
    }

    private void a(String s)
    {
        if (c == null)
        {
            return;
        } else
        {
            j = s;
            com.bumptech.glide.h.a(this).a(s).b(com.roidapp.baselib.b.a.b()).g().a(c);
            return;
        }
    }

    static boolean a(c c1)
    {
        return c1.z();
    }

    static void b(c c1)
    {
        c1.c(false);
    }

    private void b(boolean flag)
    {
        if (e == null)
        {
            return;
        }
        Object obj;
        if (!af.a(aj.a()))
        {
            obj = new com.roidapp.cloudlib.sns.c.e(this, (byte)0);
            f = ((com.roidapp.cloudlib.sns.c.e) (obj));
            obj = q.c(((com.roidapp.cloudlib.sns.w) (obj)));
        } else
        {
            Object obj1 = com.roidapp.cloudlib.sns.b.q.a(aj.a()).c();
            e.a(((com.roidapp.cloudlib.sns.b.p) (obj1)).b.a);
            obj = ((com.roidapp.cloudlib.sns.b.p) (obj1)).a;
            long l = ((com.roidapp.cloudlib.sns.b.p) (obj1)).b.a;
            obj1 = new com.roidapp.cloudlib.sns.c.e(this, (byte)0);
            f = ((com.roidapp.cloudlib.sns.c.e) (obj1));
            obj = q.a(((String) (obj)), l, false, ((com.roidapp.cloudlib.sns.w) (obj1)));
        }
        if (flag)
        {
            ((o) (obj)).l();
        }
        c(true);
        ((o) (obj)).a(this);
    }

    static com.roidapp.cloudlib.sns.login.a c(c c1)
    {
        return c1.e;
    }

    private void c(boolean flag)
    {
        i = flag;
        if (a != null)
        {
            a.a(flag);
        }
    }

    static void d(c c1)
    {
        if (c1.e != null && c1.d != null)
        {
            View view = c1.d;
            int l;
            if (c1.e.isEmpty())
            {
                l = 0;
            } else
            {
                l = 8;
            }
            view.setVisibility(l);
        }
    }

    static ListView e(c c1)
    {
        return c1.b;
    }

    static boolean f(c c1)
    {
        c1.k = true;
        return true;
    }

    static View g(c c1)
    {
        return c1.d;
    }

    static boolean h(c c1)
    {
        return c1.z();
    }

    public final View a(Context context)
    {
        context = new ab(context);
        context.a(at.B);
        context.a(u);
        return context;
    }

    public final void a(e e1, Object obj)
    {
        if (e1 == e.a && e != null)
        {
            e.notifyDataSetChanged();
        }
    }

    protected final void a(boolean flag)
    {
        al.g().b(getActivity(), "SNS/PopularUserPage");
        com.roidapp.baselib.c.b.b("PopularUserPage");
    }

    protected final void b()
    {
        super.b();
        if (e != null)
        {
            if (e.c())
            {
                com.roidapp.baselib.c.b.e("PopularUserPage");
            }
            int l;
            if (e.getCount() == 0)
            {
                l = -1;
            } else
            {
                l = b.getFirstVisiblePosition();
            }
            if (l != -1)
            {
                com.roidapp.baselib.c.b.b("PopularUserPage", l);
            }
        }
        com.roidapp.baselib.c.b.a("PopularUserPage", a());
    }

    public final void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        e = new com.roidapp.cloudlib.sns.login.a(this, "Explore_Leaderboard_Page");
        e.b();
        e.a("PopularUser");
        a(new e[] {
            e.a
        });
        b(false);
    }

    public final View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        com.roidapp.cloudlib.sns.f.a.a().a("Explore_Leaderboard_Page", 1);
        viewgroup = layoutinflater.inflate(as.V, viewgroup, false);
        a = (SwipeRefreshLayout2)viewgroup.findViewById(ar.cm);
        a(a, false, false);
        b = (ListView)a.findViewById(ar.dp);
        d = viewgroup.findViewById(ar.v);
        com.roidapp.cloudlib.sns.a.a.a(b, s.b(), Integer.valueOf(hashCode()));
        g = getResources().getDisplayMetrics().widthPixels;
        h = (int)((float)g * 0.3125F);
        c = (ImageView)layoutinflater.inflate(as.W, b, false);
        c.getLayoutParams().width = g;
        c.getLayoutParams().height = h;
        b.addHeaderView(c);
        if (i)
        {
            a.a(true);
        }
        a.a(this);
        c.setImageBitmap(null);
        c.setBackgroundColor(0);
        a(j);
        b.setAdapter(e);
        if (k && e.isEmpty())
        {
            d.setVisibility(0);
        }
        d.setOnClickListener(new com.roidapp.cloudlib.sns.c.d(this));
        return viewgroup;
    }

    public final void onDestroy()
    {
        if (e != null)
        {
            e.a();
            e = null;
        }
        if (f != null)
        {
            f = null;
        }
        super.onDestroy();
    }

    public final void onDestroyView()
    {
        super.onDestroyView();
        a = null;
        b = null;
        c = null;
    }

    public final void onRefresh()
    {
        if (!i)
        {
            if (d != null && d.getVisibility() != 8)
            {
                d.setVisibility(8);
            }
            k = false;
            b(true);
        }
    }
}
