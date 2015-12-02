// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.contacts.contactslist;

import android.os.Bundle;
import android.support.v4.a.c;
import android.support.v4.app.ah;
import com.facebook.inject.t;

// Referenced classes of package com.facebook.contacts.contactslist:
//            f, ContactsListActivity, g

class d
    implements ah
{

    final ContactsListActivity a;

    d(ContactsListActivity contactslistactivity)
    {
        a = contactslistactivity;
        super();
    }

    public c a(int i, Bundle bundle)
    {
        return (c)t.a(a).a(com/facebook/contacts/contactslist/f);
    }

    public void a(c c1)
    {
    }

    public void a(c c1, g g1)
    {
        ContactsListActivity.a(a, g1);
    }

    public volatile void a(c c1, Object obj)
    {
        a(c1, (g)obj);
    }
}
