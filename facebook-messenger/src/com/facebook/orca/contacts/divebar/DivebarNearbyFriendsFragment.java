// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.contacts.divebar;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.base.fragment.FbFragment;
import com.facebook.contacts.a.c;
import com.facebook.contacts.a.d;
import com.facebook.contacts.picker.ah;
import com.facebook.contacts.picker.ak;
import com.facebook.i;
import com.facebook.inject.t;
import com.facebook.k;
import com.facebook.orca.contacts.picker.az;
import com.facebook.user.ChatContext;
import com.facebook.user.User;
import com.facebook.user.UserWithIdentifier;
import com.google.common.a.es;
import com.google.common.a.et;
import com.google.common.a.hq;
import com.google.common.a.kl;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

// Referenced classes of package com.facebook.orca.contacts.divebar:
//            ar, e, au, as, 
//            at, bl

public class DivebarNearbyFriendsFragment extends FbFragment
{

    private e a;
    private c b;
    private d c;
    private az d;
    private ak e;
    private View f;
    private au g;
    private bl h;
    private Comparator i;

    public DivebarNearbyFriendsFragment()
    {
        i = new ar(this);
    }

    static c a(DivebarNearbyFriendsFragment divebarnearbyfriendsfragment)
    {
        return divebarnearbyfriendsfragment.b;
    }

    private void a()
    {
        es es1 = c.b();
        es es2 = a.b();
        es es3 = a.e();
        es es4 = a.f();
        es es5 = a.c();
        Object obj1 = kl.a();
        Object obj = hq.a();
        List alist[] = new List[5];
        alist[0] = es1;
        alist[1] = es2;
        alist[2] = es3;
        alist[3] = es4;
        alist[4] = es5;
        int l = alist.length;
        int j = 0;
        while (j < l) 
        {
            Object obj3 = alist[j];
            if (obj3 != null)
            {
                obj3 = ((List) (obj3)).iterator();
                while (((Iterator) (obj3)).hasNext()) 
                {
                    User user = (User)((Iterator) (obj3)).next();
                    com.facebook.user.UserKey userkey = user.c();
                    if (!((Set) (obj1)).contains(userkey))
                    {
                        ChatContext chatcontext = b.b(userkey);
                        if (chatcontext != null && chatcontext.a())
                        {
                            ((Set) (obj1)).add(userkey);
                            ((List) (obj)).add(user);
                        }
                    }
                }
            }
            j++;
        }
        Collections.sort(((List) (obj)), i);
        obj1 = es.e();
        Object obj2;
        for (obj = ((List) (obj)).iterator(); ((Iterator) (obj)).hasNext(); ((et) (obj1)).b(d.b(((UserWithIdentifier) (obj2)), ah.NEARBY)))
        {
            obj2 = (User)((Iterator) (obj)).next();
            obj2 = new UserWithIdentifier(((User) (obj2)), ((User) (obj2)).i());
        }

        e.a(((et) (obj1)).b());
    }

    static bl b(DivebarNearbyFriendsFragment divebarnearbyfriendsfragment)
    {
        return divebarnearbyfriendsfragment.h;
    }

    public View a(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        g = new au(n());
        e = new ak(n(), g, k.orca_contact_picker_view_for_divebar_nearby_friends);
        e.setOnRowClickedListener(new as(this));
        f = e.findViewById(i.divebar_nearby_friends_back_button);
        f.setOnClickListener(new at(this));
        return e;
    }

    public void a(Bundle bundle)
    {
        super.a(bundle);
        bundle = S();
        a = (e)bundle.a(com/facebook/orca/contacts/divebar/e);
        b = (c)bundle.a(com/facebook/contacts/a/c);
        c = (d)bundle.a(com/facebook/contacts/a/d);
        d = (az)bundle.a(com/facebook/orca/contacts/picker/az);
    }

    public void a(bl bl)
    {
        h = bl;
    }

    public void d(Bundle bundle)
    {
        super.d(bundle);
        a();
    }
}
