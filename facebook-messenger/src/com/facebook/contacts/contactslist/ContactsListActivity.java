// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.contacts.contactslist;

import android.os.Bundle;
import android.support.v4.app.ag;
import com.facebook.base.activity.i;
import com.facebook.debug.log.f;
import com.facebook.inject.t;
import com.facebook.k;
import com.facebook.widget.listview.BetterListView;

// Referenced classes of package com.facebook.contacts.contactslist:
//            g, e, d, c

public class ContactsListActivity extends i
{

    private e p;
    private BetterListView q;

    public ContactsListActivity()
    {
    }

    static void a(ContactsListActivity contactslistactivity, int l)
    {
        contactslistactivity.c(l);
    }

    static void a(ContactsListActivity contactslistactivity, g g1)
    {
        contactslistactivity.a(g1);
    }

    private void a(g g1)
    {
        f.d("loaded contacts: ", g1.toString());
        p.a(g1.a());
    }

    private void c(int l)
    {
    }

    private void j()
    {
        g().a(1, null, new d(this));
    }

    public void b(Bundle bundle)
    {
        super.b(bundle);
        p = (e)i().a(com/facebook/contacts/contactslist/e);
        setContentView(k.contacts_list_activity);
        q = (BetterListView)b(com.facebook.i.contacts_list);
        q.setAdapter(p);
        q.setDividerHeight(0);
        q.setOnItemClickListener(new c(this));
        j();
    }
}
