// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.chat.fragment;

import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import com.kik.d.f;
import com.kik.e.a;
import com.kik.view.adapters.bb;
import com.kik.view.adapters.bd;
import java.util.ArrayList;
import java.util.Iterator;
import kik.a.e.r;
import kik.a.e.w;
import kik.a.h.j;
import kik.android.a.b;
import kik.android.chat.KikApplication;
import kik.android.chat.activity.k;
import kik.android.util.ck;
import kik.android.util.u;

// Referenced classes of package kik.android.chat.fragment:
//            KikSponsoredBaseFragment, lf

public class KikFindPeopleFragment extends KikSponsoredBaseFragment
{
    public static final class a extends com.kik.ui.fragment.FragmentBase.a
    {

        public a()
        {
        }
    }


    protected r a;
    protected w b;
    private final a m = new a();
    private android.widget.AdapterView.OnItemClickListener n;

    public KikFindPeopleFragment()
    {
        n = new lf(this);
    }

    static void a(KikFindPeopleFragment kikfindpeoplefragment)
    {
        KikApplication.i().c().a(com.kik.d.b.a.k.y, j.b());
        KikAddContactFragment.b b1 = new KikAddContactFragment.b();
        b1.a(kikfindpeoplefragment.m.h());
        k.a(b1, kikfindpeoplefragment.getActivity()).f();
    }

    protected final int K()
    {
        return 0x7f0900fb;
    }

    protected final void a()
    {
        android.content.Context context = _contactsList.getContext();
        e.e(_contactsList.getResources().getString(0x7f0900ea), new bd(context, d.c(kik.android.util.ck.b.a), d.d(kik.android.util.ck.b.a), c, a, l));
    }

    protected final boolean b()
    {
        return d.b(kik.android.util.ck.b.a);
    }

    protected final void c()
    {
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        m.a(getArguments());
        V().a(this);
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        byte byte0 = 28;
        if (u.d())
        {
            byte0 = 60;
        }
        layoutinflater = super.onCreateView(layoutinflater, viewgroup, bundle);
        e.d(_contactsList.getResources().getString(0x7f090014), new com.kik.view.adapters.a(_contactsList.getContext(), byte0));
        _contactsList.setAdapter(e);
        _contactsList.setOnItemClickListener(n);
        e();
        return layoutinflater;
    }

    public void onResume()
    {
        super.onResume();
        if (b())
        {
            d();
            ArrayList arraylist = new ArrayList();
            for (Iterator iterator = d.c(kik.android.util.ck.b.a).iterator(); iterator.hasNext(); arraylist.add(((kik.a.d.k)iterator.next()).e())) { }
            l.b("Promoted Chat View").a("Bots", arraylist.toArray()).b();
        } else
        {
            l.b("Promoted Chat Slow Response").b();
        }
        if (getActivity() != null)
        {
            d.a(kik.android.util.ck.b.b);
        }
    }

    public final boolean v()
    {
        k.a(new KikConversationsFragment.a(), getActivity()).a().f();
        return true;
    }
}
