// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.contacts.contactslist;

import com.facebook.common.w.n;
import com.facebook.contacts.models.Contact;
import com.facebook.user.Name;
import java.text.Collator;
import java.util.Comparator;

public class a
    implements Comparator
{

    private final Collator a = Collator.getInstance();

    public a()
    {
        a.setStrength(0);
    }

    public int a(Contact contact, Contact contact1)
    {
        contact = n.a(contact.getName().f());
        contact1 = n.a(contact1.getName().f());
        return a.compare(contact, contact1);
    }

    public int compare(Object obj, Object obj1)
    {
        return a((Contact)obj, (Contact)obj1);
    }
}
