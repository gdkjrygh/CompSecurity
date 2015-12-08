// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.cloudlib.sns.notification;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.graphics.Color;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.support.v4.app.FragmentActivity;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.ForegroundColorSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.roidapp.baselib.c.aj;
import com.roidapp.baselib.c.n;
import com.roidapp.cloudlib.a.a;
import com.roidapp.cloudlib.al;
import com.roidapp.cloudlib.ap;
import com.roidapp.cloudlib.aq;
import com.roidapp.cloudlib.ar;
import com.roidapp.cloudlib.as;
import com.roidapp.cloudlib.at;
import com.roidapp.cloudlib.sns.ab;
import com.roidapp.cloudlib.sns.af;
import com.roidapp.cloudlib.sns.b.a.c;
import com.roidapp.cloudlib.sns.b.p;
import com.roidapp.cloudlib.sns.d;
import com.roidapp.cloudlib.sns.g;
import com.roidapp.cloudlib.sns.g.e;
import com.roidapp.cloudlib.sns.h;
import com.roidapp.cloudlib.sns.modifiedrefresh.SwipeRefreshLayout2;
import com.roidapp.cloudlib.sns.modifiedrefresh.x;
import com.roidapp.cloudlib.sns.o;
import com.roidapp.cloudlib.sns.q;
import com.roidapp.cloudlib.sns.u;
import com.roidapp.cloudlib.sns.w;

// Referenced classes of package com.roidapp.cloudlib.sns.notification:
//            o, c, f, s, 
//            e

public final class b extends com.roidapp.cloudlib.sns.main.b
    implements android.view.View.OnClickListener, x, com.roidapp.cloudlib.sns.notification.o
{

    public final w a = new com.roidapp.cloudlib.sns.notification.c(this);
    private SwipeRefreshLayout2 b;
    private ListView c;
    private com.roidapp.cloudlib.sns.b.x d;
    private p e;
    private c f;
    private f g;
    private ProgressBar h;
    private RelativeLayout i;
    private TextView j;
    private ImageView k;
    private boolean l;
    private boolean m;
    private boolean n;
    private int o;
    private View p;
    private TextView q;
    private TextView r;
    private ImageView v;

    public b()
    {
        x();
    }

    static c a(b b1, c c1)
    {
        b1.f = c1;
        return c1;
    }

    static boolean a(b b1)
    {
        return b1.z();
    }

    static c b(b b1)
    {
        return b1.f;
    }

    static void b(b b1, c c1)
    {
        if (b1.z())
        {
            b1.b.setEnabled(true);
            b1.b.a(b1);
            if (b1.g == null)
            {
                b1.g = new f(b1, b1.c, b1);
                b1.c.setAdapter(b1.g);
            }
            b1.g.a(b1);
            b1.g.a(c1);
            b1.g.notifyDataSetChanged();
        }
    }

    static RelativeLayout c(b b1)
    {
        return b1.i;
    }

    static TextView d(b b1)
    {
        return b1.j;
    }

    private void d()
    {
        al.g().a("Notification");
        al.g().b(getActivity(), "Notification");
        com.roidapp.baselib.c.b.b("Notification");
        if (e == null || d == null)
        {
            return;
        }
        if (l)
        {
            l = false;
            b.setEnabled(true);
            b.a(true);
            com.roidapp.cloudlib.sns.q.a(e.a, d.a, a).a(this);
            return;
        }
        if (g == null)
        {
            com.roidapp.cloudlib.sns.q.a(e.a, d.a, a).a(this);
            return;
        } else
        {
            c.setAdapter(g);
            return;
        }
    }

    static ImageView e(b b1)
    {
        return b1.k;
    }

    static com.roidapp.cloudlib.sns.main.a f(b b1)
    {
        return b1.s;
    }

    private void f()
    {
        if (p != null) goto _L2; else goto _L1
_L1:
        return;
_L2:
        if (!com.roidapp.cloudlib.a.a.a(aj.a()).a("event", "quickpic2015_3", false))
        {
            break; /* Loop/switch isn't completed */
        }
        if (r == null || q == null || v == null)
        {
            r = (TextView)p.findViewById(ar.j);
            q = (TextView)p.findViewById(ar.n);
            v = (ImageView)p.findViewById(ar.bc);
        }
        String s1 = PreferenceManager.getDefaultSharedPreferences(aj.a()).getString("QPicCode", null);
        if (PreferenceManager.getDefaultSharedPreferences(aj.a()).getBoolean("QPicFailed", false))
        {
            p.setVisibility(0);
            if (v.getDrawable() == null)
            {
                com.roidapp.baselib.c.n.a(v, aq.X);
            }
            q.setText("Oops, something went wrong.\nYou are almost there, try one more time.");
            r.setText("Try again");
            r.setTag(null);
            r.setOnClickListener(this);
            if (g != null)
            {
                g.notifyDataSetChanged();
                return;
            }
            continue; /* Loop/switch isn't completed */
        }
        if (TextUtils.isEmpty(s1))
        {
            break; /* Loop/switch isn't completed */
        }
        p.setVisibility(0);
        if (v.getDrawable() == null)
        {
            com.roidapp.baselib.c.n.a(v, aq.X);
        }
        String s2 = com.roidapp.cloudlib.sns.h.a().a(aj.a(), PreferenceManager.getDefaultSharedPreferences(aj.a()).getLong("QPicCodeTime", System.currentTimeMillis()) / 1000L);
        SpannableStringBuilder spannablestringbuilder = new SpannableStringBuilder(TextUtils.concat(new CharSequence[] {
            "Your QuickPic invitation code is ", s1, ", 1000GB cloud storage is ready, the offer is only good for 1 day. act now! ", s2
        }));
        spannablestringbuilder.setSpan(new ForegroundColorSpan(Color.parseColor("#384248")), 0, "Your QuickPic invitation code is ".length() + 0, 33);
        AbsoluteSizeSpan absolutesizespan = new AbsoluteSizeSpan(getResources().getDimensionPixelSize(ap.k), false);
        int j1 = "Your QuickPic invitation code is ".length() + 0;
        spannablestringbuilder.setSpan(absolutesizespan, 0, j1, 33);
        spannablestringbuilder.setSpan(new ForegroundColorSpan(Color.parseColor("#ff5555")), j1, s1.length() + j1, 33);
        absolutesizespan = new AbsoluteSizeSpan(getResources().getDimensionPixelSize(ap.k), false);
        int i1 = s1.length() + j1;
        spannablestringbuilder.setSpan(absolutesizespan, j1, i1, 33);
        spannablestringbuilder.setSpan(new ForegroundColorSpan(Color.parseColor("#384248")), i1, ", 1000GB cloud storage is ready, the offer is only good for 1 day. act now! ".length() + i1, 33);
        absolutesizespan = new AbsoluteSizeSpan(getResources().getDimensionPixelSize(ap.k), false);
        j1 = ", 1000GB cloud storage is ready, the offer is only good for 1 day. act now! ".length() + i1;
        spannablestringbuilder.setSpan(absolutesizespan, i1, j1, 33);
        spannablestringbuilder.setSpan(new ForegroundColorSpan(Color.parseColor("#8f8f8f")), j1, s2.length() + j1, 33);
        spannablestringbuilder.setSpan(new AbsoluteSizeSpan(getResources().getDimensionPixelSize(ap.l), false), j1, s2.length() + j1, 33);
        q.setText(spannablestringbuilder);
        r.setText("Sign up");
        r.setTag(s1);
        r.setOnClickListener(this);
        if (g != null)
        {
            g.notifyDataSetChanged();
            return;
        }
        if (true) goto _L1; else goto _L3
_L3:
        p.setVisibility(8);
        return;
    }

    static com.roidapp.cloudlib.sns.main.a g(b b1)
    {
        return b1.s;
    }

    static ProgressBar h(b b1)
    {
        return b1.h;
    }

    static SwipeRefreshLayout2 i(b b1)
    {
        return b1.b;
    }

    static boolean j(b b1)
    {
        return b1.z();
    }

    static f k(b b1)
    {
        return b1.g;
    }

    static boolean l(b b1)
    {
        return b1.z();
    }

    static com.roidapp.cloudlib.sns.main.a m(b b1)
    {
        return b1.s;
    }

    static com.roidapp.cloudlib.sns.main.a n(b b1)
    {
        return b1.s;
    }

    static void o(b b1)
    {
        b1.f();
    }

    static com.roidapp.cloudlib.sns.main.a p(b b1)
    {
        return b1.s;
    }

    static com.roidapp.cloudlib.sns.main.a q(b b1)
    {
        return b1.s;
    }

    public final View a(Context context)
    {
        t = new ab(context);
        t.a(u);
        t.a("Notification");
        return t;
    }

    public final void a(int i1, boolean flag)
    {
        if (flag && !isAdded())
        {
            o = i1;
            return;
        } else
        {
            o = 0;
            s s1 = new s();
            ((s)s1).a(i1, "Post");
            a(((com.roidapp.cloudlib.sns.main.b) (s1)));
            return;
        }
    }

    public final void a(e e1, Object obj)
    {
        if (g != null)
        {
            if (e.c == e1)
            {
                g.a(((Integer)obj).intValue());
            }
            g.notifyDataSetChanged();
        }
    }

    public final void a(String s1)
    {
        com.roidapp.cloudlib.sns.topic.e e1 = new com.roidapp.cloudlib.sns.topic.e();
        e1.a(s1, "Notification_Page");
        a(((com.roidapp.cloudlib.sns.main.b) (e1)));
    }

    protected final void b()
    {
        super.b();
        com.roidapp.baselib.c.b.a("Notification", a());
    }

    public final void b(String s1)
    {
        if (!af.a(getActivity()))
        {
            return;
        }
        if (e == null)
        {
            e = com.roidapp.cloudlib.sns.b.q.a(getActivity()).c();
            d = e.b;
        }
        d.b.equals(s1);
        s1 = com.roidapp.cloudlib.sns.h.h.b(s1);
        s1.C();
        a(s1);
    }

    public final void i_()
    {
        super.i_();
        if (c == null)
        {
            return;
        } else
        {
            getActivity();
            com.roidapp.baselib.c.b.a("SNS", "click", "SNS/TittleClick/Notification");
            al.g().a(getActivity(), "SNS", "click", "SNS/TittleClick/Notification", Long.valueOf(1L));
            c.setSelection(0);
            return;
        }
    }

    public final void onAttach(Activity activity)
    {
        super.onAttach(activity);
        if (o != 0)
        {
            a(o, false);
        }
    }

    public final void onClick(View view)
    {
        int i1 = view.getId();
        if (i1 == ar.dn || i1 == 4097)
        {
            i1 = ((Integer)view.getTag()).intValue();
            view = g.b(i1);
            view = com.roidapp.cloudlib.sns.h.h.a(((com.roidapp.cloudlib.sns.b.h) (view)).c.a, ((com.roidapp.cloudlib.sns.b.h) (view)).c.b, ((com.roidapp.cloudlib.sns.b.h) (view)).c.h);
            view.C();
            a(view);
        } else
        {
            if (i1 == ar.aQ)
            {
                i1 = ((Integer)view.getTag()).intValue();
                a(g.b(i1).d.a, false);
                return;
            }
            if (i1 == ar.j && s != null && isAdded() && getActivity() != null && !getActivity().isFinishing())
            {
                view = (String)view.getTag();
                if (TextUtils.isEmpty(view))
                {
                    s.i();
                    (new g(new com.roidapp.cloudlib.sns.notification.e(this))).a(this);
                    return;
                } else
                {
                    com.roidapp.cloudlib.sns.d.a(getActivity(), view);
                    return;
                }
            }
        }
    }

    public final void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        if (af.a(getActivity()))
        {
            e = com.roidapp.cloudlib.sns.b.q.a(getActivity()).c();
            d = e.b;
            a(new e[] {
                e.a, e.c, e.d
            });
        }
        l = true;
    }

    public final View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        layoutinflater = layoutinflater.inflate(as.L, viewgroup, false);
        i = (RelativeLayout)layoutinflater.findViewById(ar.cO);
        j = (TextView)layoutinflater.findViewById(ar.bz);
        k = (ImageView)layoutinflater.findViewById(ar.by);
        b = (SwipeRefreshLayout2)layoutinflater.findViewById(ar.cm);
        b.setEnabled(false);
        a(b, false, false);
        h = (ProgressBar)layoutinflater.findViewById(ar.bO);
        c = (ListView)layoutinflater.findViewById(ar.bG);
        com.roidapp.cloudlib.sns.a.a.a(c, s.b(), Integer.valueOf(hashCode()));
        viewgroup = LayoutInflater.from(getActivity()).inflate(as.Q, c, false);
        p = viewgroup.findViewById(ar.bR);
        f();
        c.addHeaderView(viewgroup);
        if (g != null)
        {
            if (h.getVisibility() == 0)
            {
                h.setVisibility(8);
            }
            b.setEnabled(true);
            b.a(this);
            c.setAdapter(g);
        } else
        {
            b.setEnabled(false);
        }
        if (g != null && g.getCount() == 0)
        {
            i.setVisibility(0);
            j.setText(getActivity().getString(at.al));
            k.setVisibility(8);
        } else
        {
            i.setVisibility(8);
        }
        m = true;
        if (n)
        {
            d();
        }
        return layoutinflater;
    }

    public final void onDestroy()
    {
        super.onDestroy();
        if (g != null)
        {
            f f1 = g;
            u.a().a(f1);
        }
    }

    public final void onDestroyView()
    {
        super.onDestroyView();
        r = null;
        v = null;
        q = null;
        p = null;
    }

    public final void onRefresh()
    {
        if (af.a(getActivity()))
        {
            e = com.roidapp.cloudlib.sns.b.q.a(getActivity()).c();
            d = e.b;
            o o1 = com.roidapp.cloudlib.sns.q.a(e.a, d.a, a);
            o1.l();
            o1.a(this);
            i.setVisibility(8);
            h.setVisibility(8);
        } else
        if (b.b())
        {
            b.a(false);
            return;
        }
    }

    public final void setUserVisibleHint(boolean flag)
    {
        n = flag;
        super.setUserVisibleHint(flag);
        if (m && flag)
        {
            d();
        }
        if (flag)
        {
            f();
        }
    }
}
