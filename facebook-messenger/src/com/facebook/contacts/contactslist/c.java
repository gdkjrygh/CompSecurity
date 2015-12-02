// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.contacts.contactslist;

import android.view.View;
import android.widget.AdapterView;

// Referenced classes of package com.facebook.contacts.contactslist:
//            ContactsListActivity

class c
    implements android.widget.AdapterView.OnItemClickListener
{

    final ContactsListActivity a;

    c(ContactsListActivity contactslistactivity)
    {
        a = contactslistactivity;
        super();
    }

    public void onItemClick(AdapterView adapterview, View view, int i, long l)
    {
        ContactsListActivity.a(a, i);
    }
}
