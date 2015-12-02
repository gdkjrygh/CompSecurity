// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.contacts.favorites;

import android.os.Bundle;
import android.support.v4.a.c;
import android.support.v4.app.ag;
import android.view.ViewGroup;
import com.facebook.analytics.av;
import com.facebook.analytics.cb;
import com.facebook.analytics.d;
import com.facebook.base.activity.i;
import com.facebook.contacts.picker.u;
import com.facebook.contacts.picker.v;
import com.facebook.contacts.server.UpdateFavoriteContactsParams;
import com.facebook.fbservice.ops.aa;
import com.facebook.fbservice.ops.k;
import com.facebook.fbservice.ops.m;
import com.facebook.fbservice.service.OperationResult;
import com.facebook.fbservice.service.ServiceException;
import com.facebook.inject.t;
import com.facebook.o;
import com.facebook.orca.common.ui.widgets.FavoritesDragSortListView;
import com.facebook.orca.contacts.divebar.an;
import com.facebook.orca.contacts.divebar.ao;
import com.facebook.orca.contacts.divebar.e;
import com.facebook.orca.contacts.picker.ar;
import com.facebook.ui.d.a;
import com.facebook.user.User;
import com.facebook.user.UserFbidIdentifier;
import com.facebook.user.UserWithIdentifier;
import com.facebook.widget.listview.g;
import com.google.common.a.es;
import com.google.common.a.et;
import com.google.common.a.hq;
import com.google.common.a.kl;
import com.google.common.d.a.s;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

// Referenced classes of package com.facebook.orca.contacts.favorites:
//            n, q, o, m, 
//            ac, u, p, aa, 
//            r, i, j

public class EditFavoritesActivity extends i
    implements d
{

    private static final Class q = com/facebook/orca/contacts/favorites/EditFavoritesActivity;
    private FavoritesDragSortListView A;
    private List B;
    private List C;
    private boolean D;
    private g E;
    v p;
    private com.facebook.orca.contacts.favorites.aa r;
    private com.facebook.contacts.a.d s;
    private ao t;
    private e u;
    private av v;
    private k w;
    private s x;
    private aa y;
    private ac z;

    public EditFavoritesActivity()
    {
        D = false;
        E = new n(this);
    }

    static s a(EditFavoritesActivity editfavoritesactivity, s s1)
    {
        editfavoritesactivity.x = s1;
        return s1;
    }

    private void a(OperationResult operationresult)
    {
        v.a((new cb("update_favorites_success")).h(h()));
        operationresult = es.e();
        for (Iterator iterator = B.iterator(); iterator.hasNext(); operationresult.b((User)iterator.next())) { }
        s.a(operationresult.b());
        D = false;
        finish();
    }

    private void a(ServiceException serviceexception)
    {
        v.a((new cb("update_favorites_failed")).h(h()).b("reason", serviceexception.getMessage()));
        com.facebook.ui.d.a.a(this).a(o.app_error_dialog_title).b(getString(o.save_favorites_failed)).a(new q(this)).a();
    }

    private void a(an an1)
    {
        if (an1 != null)
        {
            if (an1.a() != null && an1.b() != null)
            {
                B = hq.a(an1.a());
                C = hq.a(an1.b());
                o();
            }
            if (B != null && !an1.g())
            {
                g().a(1).k();
                return;
            }
        }
    }

    static void a(EditFavoritesActivity editfavoritesactivity)
    {
        editfavoritesactivity.l();
    }

    static void a(EditFavoritesActivity editfavoritesactivity, OperationResult operationresult)
    {
        editfavoritesactivity.a(operationresult);
    }

    static void a(EditFavoritesActivity editfavoritesactivity, ServiceException serviceexception)
    {
        editfavoritesactivity.a(serviceexception);
    }

    static void a(EditFavoritesActivity editfavoritesactivity, an an1)
    {
        editfavoritesactivity.a(an1);
    }

    static void a(EditFavoritesActivity editfavoritesactivity, User user)
    {
        editfavoritesactivity.b(user);
    }

    private void a(User user)
    {
        user = new com.facebook.orca.contacts.favorites.o(this, user);
        (new android.app.AlertDialog.Builder(this)).setMessage(getString(o.favorites_delete_contact_prompt)).setPositiveButton(getString(o.dialog_yes), user).setNegativeButton(getString(o.dialog_no), user).show();
    }

    static ac b(EditFavoritesActivity editfavoritesactivity)
    {
        return editfavoritesactivity.z;
    }

    static void b(EditFavoritesActivity editfavoritesactivity, User user)
    {
        editfavoritesactivity.a(user);
    }

    private void b(User user)
    {
        B.add(user);
        n();
        o();
        int i1 = B.size() - 1;
        if (i1 < A.getFirstVisiblePosition())
        {
            A.smoothScrollToPosition(i1);
        }
    }

    static ao c(EditFavoritesActivity editfavoritesactivity)
    {
        return editfavoritesactivity.t;
    }

    static List d(EditFavoritesActivity editfavoritesactivity)
    {
        return editfavoritesactivity.B;
    }

    static void e(EditFavoritesActivity editfavoritesactivity)
    {
        editfavoritesactivity.n();
    }

    static void f(EditFavoritesActivity editfavoritesactivity)
    {
        editfavoritesactivity.o();
    }

    static aa g(EditFavoritesActivity editfavoritesactivity)
    {
        return editfavoritesactivity.y;
    }

    static Class j()
    {
        return q;
    }

    private void k()
    {
        g().a(1, null, new com.facebook.orca.contacts.favorites.m(this));
    }

    private void l()
    {
        z.e();
        if (D)
        {
            p();
            return;
        } else
        {
            finish();
            return;
        }
    }

    private es m()
    {
        et et1 = es.e();
        for (Iterator iterator = B.iterator(); iterator.hasNext(); et1.b(((User)iterator.next()).i().c())) { }
        return et1.b();
    }

    private void n()
    {
        D = true;
    }

    private void o()
    {
        Object obj = es.e();
        java.util.HashSet hashset = kl.a();
        if (B.size() == 0)
        {
            ((et) (obj)).b(ar.f);
        }
        Object obj1;
        for (Iterator iterator = B.iterator(); iterator.hasNext(); ((et) (obj)).b(obj1))
        {
            obj1 = (User)iterator.next();
            hashset.add(((User) (obj1)).c());
            obj1 = new com.facebook.orca.contacts.favorites.u(((User) (obj1)));
            ((com.facebook.orca.contacts.favorites.u) (obj1)).a(new p(this));
        }

        if (C != null)
        {
            Iterator iterator1 = C.iterator();
            boolean flag1;
            for (boolean flag = false; iterator1.hasNext(); flag = flag1)
            {
                User user = (User)iterator1.next();
                flag1 = flag;
                if (hashset.contains(user.c()))
                {
                    continue;
                }
                flag1 = flag;
                if (!flag)
                {
                    ((et) (obj)).b(ar.e);
                    flag1 = true;
                }
                ((et) (obj)).b(p.a(new UserWithIdentifier(user, user.i())));
            }

        }
        r.a().a(m());
        obj = ((et) (obj)).b();
        z.a(((es) (obj)));
        r.notifyDataSetChanged();
    }

    private void p()
    {
        v.a((new cb("update_favorites")).a("favorite_count", B.size()).h(h()));
        Bundle bundle = new Bundle();
        bundle.putParcelable("favorites", new UpdateFavoriteContactsParams(B));
        x = w.a(com.facebook.contacts.server.d.h, bundle).a();
        com.google.common.d.a.i.a(x, new r(this));
        y = new aa(this, o.updating_favorites);
        y.a();
    }

    public void b(Bundle bundle)
    {
        super.b(bundle);
        setContentView(com.facebook.k.orca_edit_favorites);
        bundle = i();
        s = (com.facebook.contacts.a.d)bundle.a(com/facebook/contacts/a/d);
        t = (ao)bundle.a(com/facebook/orca/contacts/divebar/ao);
        u = (e)bundle.a(com/facebook/orca/contacts/divebar/e);
        r = (com.facebook.orca.contacts.favorites.aa)bundle.a(com/facebook/orca/contacts/favorites/aa);
        w = (k)bundle.a(com/facebook/fbservice/ops/k);
        v = (av)bundle.a(com/facebook/analytics/av);
        z = new ac(this, r);
        z.setOnDoneClickedListener(new com.facebook.orca.contacts.favorites.i(this));
        z.setSearchHint(getString(o.name_search_hint));
        ((ViewGroup)b(com.facebook.i.picker_container)).addView(z);
        p = new j(this);
        r.a().a(p);
        A = z.getDraggableList();
        A.setDropListener(E);
        B = hq.a();
        if (s.b() != null)
        {
            B = hq.a(s.b());
        }
        bundle = u.b();
        if (bundle != null)
        {
            C = hq.a(bundle);
        }
        o();
        k();
    }

    public com.facebook.analytics.f.a g_()
    {
        return com.facebook.analytics.f.a.EDIT_MESSAGING_FAVORITES_ACTIVITY;
    }

}
