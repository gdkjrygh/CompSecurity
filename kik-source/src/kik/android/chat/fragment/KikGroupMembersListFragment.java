// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.chat.fragment;

import android.content.res.Resources;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ListView;
import butterknife.ButterKnife;
import com.kik.cache.ad;
import com.kik.cards.util.UserDataParcelable;
import com.kik.e.a;
import com.kik.g.f;
import com.kik.g.i;
import com.kik.g.p;
import com.kik.view.adapters.ba;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kik.a.d.j;
import kik.a.d.k;
import kik.a.d.n;
import kik.a.e.l;
import kik.a.e.r;
import kik.a.e.v;
import kik.a.z;
import kik.android.chat.KikApplication;
import kik.android.util.an;
import kik.android.util.cq;

// Referenced classes of package kik.android.chat.fragment:
//            KikIqFragmentBase, li, ll, lr, 
//            lt, lq, ln, ProgressDialogFragment, 
//            lk, lm, lj, lo, 
//            lp

public class KikGroupMembersListFragment extends KikIqFragmentBase
{
    public static final class a extends an
    {

        public final String a()
        {
            return g("KikGroupMembersListFragment.groupJid");
        }

        public final a a(String s1)
        {
            a("KikGroupMembersListFragment.groupJid", s1);
            return this;
        }

        public a()
        {
        }
    }


    private com.kik.g.r A;
    ImageView _addButton;
    ListView _groupMembersList;
    protected r a;
    protected v b;
    protected l c;
    protected ad d;
    protected com.kik.android.a e;
    kik.a.d.p f;
    ProgressDialogFragment g;
    private View h;
    private n i;
    private com.kik.view.adapters.k j;
    private ba k;
    private ba l;
    private ba m;
    private ArrayList n;
    private ArrayList o;
    private ArrayList p;
    private String q;
    private String r;
    private String s;
    private a t;
    private i x;
    private i y;
    private com.kik.g.r z;

    public KikGroupMembersListFragment()
    {
        n = new ArrayList();
        o = new ArrayList();
        p = new ArrayList();
        t = new a();
        x = new li(this);
        y = new ll(this);
        z = new lr(this);
        A = new lt(this);
    }

    static ba a(KikGroupMembersListFragment kikgroupmemberslistfragment, ba ba)
    {
        kikgroupmemberslistfragment.k = ba;
        return ba;
    }

    static n a(KikGroupMembersListFragment kikgroupmemberslistfragment)
    {
        return kikgroupmemberslistfragment.i;
    }

    private void a()
    {
        if (i != null && i.B())
        {
            J();
        }
        b(new lq(this));
    }

    static void a(KikGroupMembersListFragment kikgroupmemberslistfragment, Bundle bundle)
    {
        if (bundle != null)
        {
            kikgroupmemberslistfragment.b(KikApplication.f(0x7f090148), false);
            bundle = bundle.getParcelableArray("KikPickUsersFragment.RESULT_SELECTED_USERS");
            ArrayList arraylist = new ArrayList(bundle.length);
            int j1 = bundle.length;
            for (int i1 = 0; i1 < j1; i1++)
            {
                String s1 = ((UserDataParcelable)bundle[i1]).a;
                arraylist.add(kikgroupmemberslistfragment.a.b(s1));
            }

            kikgroupmemberslistfragment.c.a(kikgroupmemberslistfragment.i, arraylist).a(new ln(kikgroupmemberslistfragment));
        }
    }

    private void a(boolean flag, boolean flag1)
    {
        k k1;
        ProgressDialogFragment progressdialogfragment;
        int i1;
        int j1;
        int l1;
        if (flag1)
        {
            i1 = 0x7f090294;
        } else
        if (flag)
        {
            i1 = 0x7f0902fa;
        } else
        {
            i1 = 0x7f090318;
        }
        if (flag1)
        {
            j1 = 0x7f090032;
        } else
        if (flag)
        {
            j1 = 0x7f090036;
        } else
        {
            j1 = 0x7f090037;
        }
        if (flag1)
        {
            l1 = 0x7f090293;
        } else
        if (flag)
        {
            l1 = 0x7f0902f9;
        } else
        {
            l1 = 0x7f090339;
        }
        k1 = f.a();
        progressdialogfragment = new ProgressDialogFragment(KikApplication.f(0x7f090148), true);
        a((new KikDialogFragment.a(getResources())).a(KikApplication.a(i1, new Object[] {
            cq.a(k1)
        })).b(KikApplication.a(j1, new Object[] {
            cq.a(k1)
        })).b(true).a(l1, new lk(this, progressdialogfragment, k1, flag, flag1)).b(0x7f090299, null).a, KikScopedDialogFragment.a.b, "build");
    }

    static ba b(KikGroupMembersListFragment kikgroupmemberslistfragment, ba ba)
    {
        kikgroupmemberslistfragment.l = ba;
        return ba;
    }

    static void b(KikGroupMembersListFragment kikgroupmemberslistfragment)
    {
        kikgroupmemberslistfragment.a();
    }

    static ba c(KikGroupMembersListFragment kikgroupmemberslistfragment, ba ba)
    {
        kikgroupmemberslistfragment.m = ba;
        return ba;
    }

    static void c(KikGroupMembersListFragment kikgroupmemberslistfragment)
    {
        kikgroupmemberslistfragment.n.clear();
        kikgroupmemberslistfragment.o.clear();
        kikgroupmemberslistfragment.p.clear();
        Object obj = kikgroupmemberslistfragment.a.a(kik.a.z.b(kikgroupmemberslistfragment.b).a().a(), true);
        String s1;
        if (kikgroupmemberslistfragment.i.A())
        {
            kikgroupmemberslistfragment.n.add(new kik.a.d.p(((k) (obj)), kik.a.d.p.a.a));
        } else
        {
            kikgroupmemberslistfragment.p.add(new kik.a.d.p(((k) (obj)), kik.a.d.p.a.c));
        }
        for (obj = kikgroupmemberslistfragment.i.z().iterator(); ((Iterator) (obj)).hasNext(); kikgroupmemberslistfragment.n.add(new kik.a.d.p(kikgroupmemberslistfragment.a.a(s1, true), kik.a.d.p.a.a)))
        {
            s1 = (String)((Iterator) (obj)).next();
        }

        String s2;
        for (Iterator iterator = kikgroupmemberslistfragment.i.y().iterator(); iterator.hasNext(); kikgroupmemberslistfragment.o.add(new kik.a.d.p(kikgroupmemberslistfragment.a.a(s2, true), kik.a.d.p.a.b)))
        {
            s2 = (String)iterator.next();
        }

        String s3;
        for (Iterator iterator1 = kikgroupmemberslistfragment.i.x().iterator(); iterator1.hasNext(); kikgroupmemberslistfragment.p.add(new kik.a.d.p(kikgroupmemberslistfragment.a.a(s3, true), kik.a.d.p.a.c)))
        {
            s3 = (String)iterator1.next();
        }

    }

    static ba d(KikGroupMembersListFragment kikgroupmemberslistfragment)
    {
        return kikgroupmemberslistfragment.k;
    }

    static ArrayList e(KikGroupMembersListFragment kikgroupmemberslistfragment)
    {
        return kikgroupmemberslistfragment.n;
    }

    static ba f(KikGroupMembersListFragment kikgroupmemberslistfragment)
    {
        return kikgroupmemberslistfragment.l;
    }

    static ArrayList g(KikGroupMembersListFragment kikgroupmemberslistfragment)
    {
        return kikgroupmemberslistfragment.o;
    }

    static ba h(KikGroupMembersListFragment kikgroupmemberslistfragment)
    {
        return kikgroupmemberslistfragment.m;
    }

    static ArrayList i(KikGroupMembersListFragment kikgroupmemberslistfragment)
    {
        return kikgroupmemberslistfragment.p;
    }

    static String j(KikGroupMembersListFragment kikgroupmemberslistfragment)
    {
        return kikgroupmemberslistfragment.q;
    }

    static com.kik.view.adapters.k k(KikGroupMembersListFragment kikgroupmemberslistfragment)
    {
        return kikgroupmemberslistfragment.j;
    }

    static String l(KikGroupMembersListFragment kikgroupmemberslistfragment)
    {
        return kikgroupmemberslistfragment.r;
    }

    static String m(KikGroupMembersListFragment kikgroupmemberslistfragment)
    {
        return kikgroupmemberslistfragment.s;
    }

    static View n(KikGroupMembersListFragment kikgroupmemberslistfragment)
    {
        return kikgroupmemberslistfragment.h;
    }

    static com.kik.g.r o(KikGroupMembersListFragment kikgroupmemberslistfragment)
    {
        return kikgroupmemberslistfragment.A;
    }

    static com.kik.g.r p(KikGroupMembersListFragment kikgroupmemberslistfragment)
    {
        return kikgroupmemberslistfragment.z;
    }

    protected final int K()
    {
        return 0x7f09015c;
    }

    protected final void a(f f1)
    {
        f1.a(c.e(), x);
        f1.a(a.c(), y);
    }

    protected void onAddButtonPressed()
    {
        KikPickUsersFragment.a a1 = new KikPickUsersFragment.a();
        ArrayList arraylist = new ArrayList(i.w().size() + i.y().size());
        Iterator iterator = i.w().iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            Object obj = (String)iterator.next();
            obj = a.a(((String) (obj)), false);
            if (obj != null)
            {
                arraylist.add(((k) (obj)).e());
            }
        } while (true);
        iterator = i.y().iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            Object obj1 = (String)iterator.next();
            obj1 = a.a(((String) (obj1)), false);
            if (obj1 != null)
            {
                arraylist.add(((k) (obj1)).e());
            }
        } while (true);
        a1.b(arraylist);
        a1.c(50 - arraylist.size());
        a(a1).a(new lm(this));
    }

    public boolean onContextItemSelected(MenuItem menuitem)
    {
        k k1 = f.a();
        menuitem.getItemId();
        JVM INSTR tableswitch 0 4: default 48
    //                   0 55
    //                   1 73
    //                   2 187
    //                   3 196
    //                   4 205;
           goto _L1 _L2 _L3 _L4 _L5 _L6
_L1:
        f = null;
        return true;
_L2:
        a((new KikChatInfoFragment.a()).a(k1));
        return false;
_L3:
        menuitem = f.a();
        ProgressDialogFragment progressdialogfragment = new ProgressDialogFragment(KikApplication.f(0x7f090148), true);
        a((new KikDialogFragment.a(getResources())).a(KikApplication.a(0x7f0902f5, new Object[] {
            cq.a(menuitem)
        })).b(KikApplication.a(0x7f090035, new Object[] {
            cq.a(menuitem)
        })).b(true).a(0x7f0902f4, new lj(this, progressdialogfragment, menuitem)).b(0x7f090299, null).a, KikScopedDialogFragment.a.b, "build");
        continue; /* Loop/switch isn't completed */
_L4:
        a(true, true);
        continue; /* Loop/switch isn't completed */
_L5:
        a(true, false);
        continue; /* Loop/switch isn't completed */
_L6:
        a(false, false);
        if (true) goto _L1; else goto _L7
_L7:
    }

    public void onCreate(Bundle bundle)
    {
        V().a(this);
        super.onCreate(bundle);
        t.a(getArguments());
        bundle = t.a();
        if (!cq.c(bundle))
        {
            k k1 = a.a(bundle, true);
            if (k1 != null && k1.t())
            {
                i = (n)a.a(bundle, true);
            }
        }
        q = getResources().getString(0x7f090028);
        r = getResources().getString(0x7f09004e);
        s = getResources().getString(0x7f09015c);
    }

    public void onCreateContextMenu(ContextMenu contextmenu, View view, android.view.ContextMenu.ContextMenuInfo contextmenuinfo)
    {
        super.onCreateContextMenu(contextmenu, view, contextmenuinfo);
        if (f == null)
        {
            return;
        }
        contextmenu.add(0, 0, 0, 0x7f09035f);
        if (kik.a.z.b(b).a().a().equalsIgnoreCase(f.a().b())) goto _L2; else goto _L1
_L1:
        if (f.b() != kik.a.d.p.a.b) goto _L4; else goto _L3
_L3:
        contextmenu.add(0, 4, 0, 0x7f090339);
_L2:
        contextmenu.setHeaderTitle(f.a().c());
        return;
_L4:
        if (f.b() == kik.a.d.p.a.c)
        {
            contextmenu.add(0, 1, 0, 0x7f0901d7);
            contextmenu.add(0, 3, 0, 0x7f0901f9);
            contextmenu.add(0, 2, 0, 0x7f09004c);
        }
        if (true) goto _L2; else goto _L5
_L5:
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        super.onCreateView(layoutinflater, viewgroup, bundle);
        h = layoutinflater.inflate(0x7f03000e, viewgroup, false);
        ButterKnife.inject(this, h);
        j = new com.kik.view.adapters.k(_groupMembersList.getContext());
        registerForContextMenu(_groupMembersList);
        _groupMembersList.setOnItemClickListener(new lo(this));
        _groupMembersList.setOnItemLongClickListener(new lp(this));
        g = new ProgressDialogFragment(KikApplication.f(0x7f090148), true);
        a();
        _groupMembersList.setAdapter(j);
        return h;
    }
}
