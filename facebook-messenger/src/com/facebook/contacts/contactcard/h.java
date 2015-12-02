// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.contacts.contactcard;

import com.facebook.contacts.models.entry.Entry;
import com.facebook.contacts.models.entry.PhoneEntry;

// Referenced classes of package com.facebook.contacts.contactcard:
//            af, ContactCardFragment

class h
    implements af
{

    final ContactCardFragment a;

    h(ContactCardFragment contactcardfragment)
    {
        a = contactcardfragment;
        super();
    }

    public void a()
    {
        a.c();
    }

    public void a(Entry entry)
    {
        ContactCardFragment.a(a, entry);
    }

    public void b()
    {
        ContactCardFragment.k(a);
    }

    public void b(Entry entry)
    {
        entry = (PhoneEntry)entry;
        ContactCardFragment.a(a, entry);
    }
}
