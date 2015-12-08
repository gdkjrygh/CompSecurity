// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.chat.fragment;

import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ListView;
import com.kik.android.a;
import com.kik.g.f;
import com.kik.g.i;
import com.kik.view.adapters.bb;
import com.kik.view.adapters.bd;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import kik.a.d.k;
import kik.a.e.r;
import kik.android.util.ck;

// Referenced classes of package kik.android.chat.fragment:
//            KikSponsoredBaseFragment, oc, of, oh, 
//            od

public class KikPromotedChatsFragment extends KikSponsoredBaseFragment
{
    public static final class a extends com.kik.ui.fragment.FragmentBase.a
    {

        public a()
        {
        }
    }


    protected r a;
    private android.widget.AdapterView.OnItemClickListener b;
    private i m;
    private Runnable n;

    public KikPromotedChatsFragment()
    {
        b = new oc(this);
        m = new of(this);
        n = new oh(this);
    }

    protected final int K()
    {
        return 0x7f0900f2;
    }

    protected final void a()
    {
        android.content.Context context = _contactsList.getContext();
        String s = _contactsList.getResources().getString(0x7f090223);
        if (e.a(s) == null)
        {
            e.c(s, new bd(context, d.c(kik.android.util.ck.b.b), d.d(kik.android.util.ck.b.b), c, a, l), false);
            return;
        } else
        {
            e.e(s, new bd(context, d.c(kik.android.util.ck.b.b), d.d(kik.android.util.ck.b.b), c, a, l));
            return;
        }
    }

    protected final void a(f f1)
    {
        f1.a(d.a(), new od(this));
        if (b() && d.b() > 0)
        {
            d();
            ArrayList arraylist = new ArrayList();
            for (Iterator iterator = d.c(kik.android.util.ck.b.b).iterator(); iterator.hasNext(); arraylist.add(((k)iterator.next()).e())) { }
            l.b("Suggested Chat View").a("Bots", arraylist.toArray()).b();
            f1.a(d.a(), m);
            return;
        } else
        {
            g = f.schedule(n, 30000L, TimeUnit.MILLISECONDS);
            super._loadingLayout.setVisibility(0);
            f1.a(d.a(), m);
            return;
        }
    }

    protected final boolean b()
    {
        return d.b(kik.android.util.ck.b.b);
    }

    protected final void c()
    {
        _emptyView.setVisibility(0);
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        V().a(this);
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        layoutinflater = super.onCreateView(layoutinflater, viewgroup, bundle);
        _contactsList.setOnItemClickListener(b);
        return layoutinflater;
    }
}
