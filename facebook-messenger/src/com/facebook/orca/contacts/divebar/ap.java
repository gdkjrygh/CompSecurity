// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.contacts.divebar;

import android.app.Activity;
import android.support.v4.app.ad;
import android.support.v4.app.q;
import android.view.View;
import android.view.Window;
import android.view.inputmethod.InputMethodManager;
import com.facebook.contacts.a.c;
import com.facebook.contacts.a.d;
import com.facebook.debug.log.b;
import com.facebook.i;
import com.facebook.user.ChatContext;
import com.facebook.user.User;
import com.google.common.a.es;
import com.google.common.a.et;
import com.google.common.a.kl;
import com.google.common.base.Optional;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import javax.inject.a;

// Referenced classes of package com.facebook.orca.contacts.divebar:
//            av, aw, DivebarFragment, DivebarNearbyFriendsFragment, 
//            e, ax, aq, bl

public class ap
{

    private static final Class a = com/facebook/orca/contacts/divebar/ap;
    private final a b;
    private final com.facebook.backgroundlocation.status.d c;
    private final e d;
    private final c e;
    private final d f;
    private final InputMethodManager g;
    private DivebarFragment h;
    private bl i;

    public ap(a a1, com.facebook.backgroundlocation.status.d d1, e e1, c c1, d d2, InputMethodManager inputmethodmanager)
    {
        b = a1;
        c = d1;
        d = e1;
        e = c1;
        f = d2;
        g = inputmethodmanager;
    }

    static void a(ap ap1, av av1)
    {
        ap1.a(av1);
    }

    private void a(av av1)
    {
        if (av1.a == aw.UPSELL)
        {
            com.facebook.debug.log.b.c(a, "Going to background location NUX");
            return;
        } else
        {
            com.facebook.debug.log.b.c(a, "Showing list of nearby friends");
            b();
            return;
        }
    }

    private boolean b()
    {
        DivebarNearbyFriendsFragment divebarnearbyfriendsfragment = c();
        q q1;
        if (divebarnearbyfriendsfragment != null)
        {
            if ((q1 = h.p()).c())
            {
                divebarnearbyfriendsfragment.a(i);
                Object obj = h.l();
                if (obj != null)
                {
                    g.hideSoftInputFromWindow(((Activity) (obj)).getWindow().getDecorView().getWindowToken(), 0);
                }
                obj = q1.a();
                ((ad) (obj)).a(com.facebook.b.in_from_right, com.facebook.b.out_to_left);
                ((ad) (obj)).b(h);
                ((ad) (obj)).c(divebarnearbyfriendsfragment);
                ((ad) (obj)).a(null);
                ((ad) (obj)).a();
                q1.b();
                return true;
            }
        }
        return false;
    }

    private DivebarNearbyFriendsFragment c()
    {
        Object obj = d();
        if (obj != null)
        {
            return ((DivebarNearbyFriendsFragment) (obj));
        }
        obj = h.p();
        if (!((q) (obj)).c())
        {
            return null;
        } else
        {
            DivebarNearbyFriendsFragment divebarnearbyfriendsfragment = new DivebarNearbyFriendsFragment();
            ad ad1 = ((q) (obj)).a();
            ad1.a(i.orca_diverbar_fragment_container, divebarnearbyfriendsfragment, "nearbyFriends");
            ad1.b(divebarnearbyfriendsfragment);
            ad1.a();
            ((q) (obj)).b();
            return divebarnearbyfriendsfragment;
        }
    }

    private DivebarNearbyFriendsFragment d()
    {
        return (DivebarNearbyFriendsFragment)h.p().a("nearbyFriends");
    }

    public Optional a()
    {
        int j = 0;
        if (!((Boolean)b.b()).booleanValue())
        {
            return Optional.absent();
        }
        es es1 = f.b();
        es es2 = d.b();
        es es3 = d.e();
        es es4 = d.f();
        es es5 = d.c();
        Object obj = kl.a();
        et et1 = es.e();
        List alist[] = new List[5];
        alist[0] = es1;
        alist[1] = es2;
        alist[2] = es3;
        alist[3] = es4;
        alist[4] = es5;
        int k = alist.length;
        while (j < k) 
        {
            Object obj1 = alist[j];
            if (obj1 != null)
            {
                obj1 = ((List) (obj1)).iterator();
                while (((Iterator) (obj1)).hasNext()) 
                {
                    User user = (User)((Iterator) (obj1)).next();
                    if (!((Set) (obj)).contains(user.c()))
                    {
                        ChatContext chatcontext = e.b(user.c());
                        if (chatcontext != null && chatcontext.a())
                        {
                            et1.b(user);
                            ((Set) (obj)).add(user.c());
                        }
                    }
                }
            }
            j++;
        }
        obj = et1.b();
        if (((es) (obj)).isEmpty())
        {
            return Optional.absent();
        } else
        {
            obj = com.facebook.orca.contacts.divebar.av.a(((es) (obj)));
            return Optional.of((new ax()).a(((av) (obj))).a(new aq(this)));
        }
    }

    public void a(DivebarFragment divebarfragment)
    {
        h = divebarfragment;
    }

    public void a(bl bl)
    {
        i = bl;
        DivebarNearbyFriendsFragment divebarnearbyfriendsfragment = d();
        if (divebarnearbyfriendsfragment != null)
        {
            divebarnearbyfriendsfragment.a(bl);
        }
    }

}
