// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.chat.fragment;

import android.app.Activity;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Handler;
import android.support.v4.app.FragmentActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.HeaderViewListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import com.kik.cache.ad;
import com.kik.e.a;
import com.kik.g.f;
import com.kik.g.l;
import com.kik.g.o;
import com.kik.sdkutils.y;
import com.kik.view.adapters.t;
import java.util.List;
import kik.a.e.i;
import kik.a.e.n;
import kik.a.e.r;
import kik.a.e.v;
import kik.android.chat.KikApplication;
import kik.android.util.af;

// Referenced classes of package kik.android.chat.fragment:
//            KikScopedDialogFragment, qx, qy, re, 
//            rf, qz, ra, rd

public class SendToFragment extends KikScopedDialogFragment
{
    public static final class a extends com.kik.ui.fragment.FragmentBase.a
    {

        static boolean a(a a1)
        {
            return a1.f("SendToFragment.EXTRA_AUTOMATICALLY_OPEN_CHAT").booleanValue();
        }

        static long b(a a1)
        {
            return a1.j("SendToFragment.EXTRA_DEPENDENT_PROMISE");
        }

        public final a a(long l1)
        {
            a("SendToFragment.EXTRA_DEPENDENT_PROMISE", l1);
            return this;
        }

        public final a a(boolean flag)
        {
            a("SendToFragment.EXTRA_AUTOMATICALLY_OPEN_CHAT", flag);
            return this;
        }

        public a()
        {
        }
    }


    protected r a;
    protected kik.a.e.l b;
    protected n c;
    protected i d;
    protected v e;
    protected com.kik.android.a f;
    ad g;
    private final int h = 3;
    private final Handler i = new qx(this);
    private ListView j;
    private boolean k;
    private boolean l;
    private long m;
    private f n;
    private kik.a.d.a.a o;
    private long p;
    private String q;
    private List r;
    private final a s = new a();
    private com.kik.g.i t;

    public SendToFragment()
    {
        k = false;
        l = true;
        m = -1L;
        n = new f();
        t = new qy(this);
    }

    private void a()
    {
        FragmentActivity fragmentactivity = getActivity();
        if (fragmentactivity == null)
        {
            J();
        }
        int i1 = ((KikApplication)fragmentactivity.getApplication()).m().a(m);
        if (i1 != 0 && (i1 == com.kik.g.p.a.d || i1 == com.kik.g.p.a.c))
        {
            J();
        }
    }

    static void a(SendToFragment sendtofragment)
    {
        if (sendtofragment.j.getAdapter() == null)
        {
            sendtofragment.j.setAdapter(new t(sendtofragment.j.getContext(), sendtofragment.d.A(), sendtofragment.g, sendtofragment.a, sendtofragment.b, sendtofragment.c, sendtofragment.f));
            return;
        }
        android.widget.ListAdapter listadapter = sendtofragment.j.getAdapter();
        Object obj = listadapter;
        if (listadapter instanceof HeaderViewListAdapter)
        {
            obj = ((HeaderViewListAdapter)listadapter).getWrappedAdapter();
        }
        obj = (t)obj;
        ((t) (obj)).a(sendtofragment.d.A());
        ((t) (obj)).notifyDataSetChanged();
    }

    static void a(SendToFragment sendtofragment, Bundle bundle)
    {
        Bundle bundle1;
label0:
        {
            if (bundle != null)
            {
                bundle1 = new Bundle();
                bundle1.putString("SendToFragment.RESULT_JID", bundle.getString("KikSelectUserFragment.RESULT_JID"));
                if (sendtofragment.isResumed())
                {
                    break label0;
                }
                sendtofragment.a(((Runnable) (new re(sendtofragment, bundle1))));
            }
            return;
        }
        sendtofragment.b(bundle1);
    }

    static Handler b(SendToFragment sendtofragment)
    {
        return sendtofragment.i;
    }

    private void b(Bundle bundle)
    {
        a(bundle);
        J();
    }

    static void b(SendToFragment sendtofragment, Bundle bundle)
    {
        sendtofragment.b(bundle);
    }

    static ListView c(SendToFragment sendtofragment)
    {
        return sendtofragment.j;
    }

    static boolean d(SendToFragment sendtofragment)
    {
        return sendtofragment.l;
    }

    static a e(SendToFragment sendtofragment)
    {
        return sendtofragment.s;
    }

    static boolean f(SendToFragment sendtofragment)
    {
        sendtofragment.k = true;
        return true;
    }

    static long g(SendToFragment sendtofragment)
    {
        return sendtofragment.m;
    }

    static void h(SendToFragment sendtofragment)
    {
        sendtofragment.a();
    }

    public void onCreate(Bundle bundle)
    {
        V().a(this);
        super.onCreate(bundle);
        n.a(a.c(), t, new o());
        n.a(b.e(), t, new o());
        n.a(d.i(), t, new o());
        n.a(d.e(), t, new o());
        n.a(d.k(), t, new o());
        n.a(e.c(), t, new o());
        n.a(d.o(), t, new o());
        n.a(d.g(), t, new o());
        n.a(d.h(), t, new o());
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        viewgroup = (ViewGroup)layoutinflater.inflate(0x7f030093, viewgroup, false);
        o = kik.android.f.a.f.a().e();
        p = kik.android.f.a.f.a().g();
        q = kik.android.f.a.f.a().h();
        r = kik.android.f.a.f.a().i();
        layoutinflater.inflate(0x7f03003c, viewgroup, true);
        j = (ListView)viewgroup.findViewById(0x7f0e004b);
        if (viewgroup != null)
        {
            bundle = viewgroup.findViewById(0x7f0e001d);
            if (bundle != null)
            {
                bundle.setOnClickListener(new rf(this));
            }
            bundle = (TextView)viewgroup.findViewById(0x7f0e0078);
            if (bundle != null)
            {
                bundle.setText(viewgroup.getResources().getString(0x7f09030a));
            }
        }
        if (!y.b(9))
        {
            j.setOverscrollFooter(null);
        }
        j.setEmptyView(viewgroup.findViewById(0x7f0e003e));
        j.setOnItemClickListener(new qz(this));
        bundle = new af();
        bundle.a = new ra(this);
        j.addHeaderView(layoutinflater.inflate(0x7f030083, j, false), bundle, true);
        layoutinflater = new t(getActivity(), d.A(), g, a, b, c, f, (byte)0);
        layoutinflater.c();
        j.setAdapter(layoutinflater);
        s.a(getArguments());
        l = kik.android.chat.fragment.a.a(s);
        m = a.b(s);
        if (m > -1L)
        {
            a();
            n.a(((KikApplication)getActivity().getApplication()).m().a(), new rd(this));
        }
        return viewgroup;
    }

    public void onDestroy()
    {
        super.onDestroy();
        n.a();
        if (l && !k)
        {
            kik.android.f.a.f.a().a(o, p);
            kik.android.f.a.f.a().c(q);
            kik.android.f.a.f.a().a(r);
        }
    }

    public final boolean v()
    {
        kik.android.f.a.f.a().a(o, p);
        kik.android.f.a.f.a().c(q);
        return super.v();
    }
}
