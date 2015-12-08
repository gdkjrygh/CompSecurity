// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.chat.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ListView;
import butterknife.ButterKnife;
import com.kik.android.a;
import com.kik.cache.ad;
import com.kik.m.d;
import com.kik.m.n;
import com.kik.view.adapters.bb;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import kik.android.chat.activity.k;
import kik.android.util.ck;

// Referenced classes of package kik.android.chat.fragment:
//            KikIqFragmentBase, pn

public abstract class KikSponsoredBaseFragment extends KikIqFragmentBase
{
    protected static final class a extends Enum
    {

        public static final int a;
        public static final int b;
        public static final int c;
        private static final int d[];

        static 
        {
            a = 1;
            b = 2;
            c = 3;
            d = (new int[] {
                a, b, c
            });
        }
    }


    ListView _contactsList;
    LinearLayout _emptyView;
    LinearLayout _loadingLayout;
    private HashSet a;
    private HashSet b;
    ad c;
    protected ck d;
    protected bb e;
    protected ScheduledExecutorService f;
    protected ScheduledFuture g;
    protected boolean h;
    protected boolean i;
    protected String j;
    protected int k;
    protected com.kik.android.a l;
    private android.widget.AbsListView.OnScrollListener m;

    public KikSponsoredBaseFragment()
    {
        a = new HashSet();
        b = new HashSet();
        h = false;
        i = false;
        m = new pn(this);
    }

    static HashSet a(KikSponsoredBaseFragment kiksponsoredbasefragment)
    {
        return kiksponsoredbasefragment.a;
    }

    static HashSet b(KikSponsoredBaseFragment kiksponsoredbasefragment)
    {
        return kiksponsoredbasefragment.b;
    }

    private void f()
    {
        if (e != null)
        {
            bb bb1 = e;
            Object obj = b;
            Object aobj[] = new Object[((Set) (obj)).size()];
            obj = ((Set) (obj)).iterator();
            for (int i1 = 0; ((Iterator) (obj)).hasNext(); i1++)
            {
                aobj[i1] = bb1.getItem(((Integer)((Iterator) (obj)).next()).intValue());
            }

            b.clear();
        }
    }

    protected abstract void a();

    protected final void a(String s)
    {
        KikChatFragment.a a1 = new KikChatFragment.a();
        a1.a(s).a(true).c(j);
        kik.android.chat.activity.k.a(a1, getActivity()).f();
    }

    protected final void b(String s)
    {
        KikChatInfoFragment.a a1 = new KikChatInfoFragment.a();
        a1.d(s).c(j);
        kik.android.chat.activity.k.a(a1, getActivity()).f();
    }

    protected abstract boolean b();

    protected abstract void c();

    protected final void d()
    {
        e();
        _emptyView.setVisibility(8);
        if (k != a.c && b())
        {
            if (g != null)
            {
                g.cancel(true);
            }
            if (d.b() == 0)
            {
                c();
                return;
            } else
            {
                k = a.b;
                _contactsList.setVisibility(0);
                a();
                _contactsList.setAdapter(e);
                n.a(_contactsList);
                _contactsList.invalidate();
                return;
            }
        } else
        {
            _emptyView.setVisibility(0);
            l.b("Suggested Chat Slow Response").b();
            return;
        }
    }

    protected final void e()
    {
        _loadingLayout.setVisibility(8);
    }

    public void onCreate(Bundle bundle)
    {
        V().a(this);
        k = kik.android.chat.fragment.a.a;
        f = Executors.newSingleThreadScheduledExecutor();
        super.onCreate(bundle);
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        View view = layoutinflater.inflate(0x7f030014, viewgroup, false);
        ButterKnife.inject(this, view);
        super.onCreateView(layoutinflater, viewgroup, bundle);
        k = kik.android.chat.fragment.a.a;
        com.kik.m.d.a(_contactsList, "AUTOMATION_SPONSORED_LIST");
        _contactsList.setOnScrollListener(m);
        e = new bb(_contactsList.getContext());
        return view;
    }

    public void onPause()
    {
        f();
        super.onPause();
    }

    public void onResume()
    {
        if (getUserVisibleHint())
        {
            G();
            j = UUID.randomUUID().toString();
        } else
        {
            F();
        }
        super.onResume();
    }

    public void setUserVisibleHint(boolean flag)
    {
        super.setUserVisibleHint(flag);
        i = flag;
        if (flag)
        {
            j = UUID.randomUUID().toString();
        } else
        {
            f();
            if (h)
            {
                h = false;
                k = kik.android.chat.fragment.a.a;
                d();
                return;
            }
        }
    }
}
