// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.contacts.data;

import android.content.res.Resources;
import com.facebook.contacts.models.Contact;
import com.facebook.contacts.models.ContactDetails;
import com.facebook.contacts.models.EntrySection;
import com.facebook.contacts.models.entry.PhoneEntry;
import com.facebook.debug.d.e;
import com.facebook.o;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.common.a.es;

public class a
{

    private final Resources a;
    private final ObjectMapper b;

    public a(Resources resources, ObjectMapper objectmapper)
    {
        a = resources;
        b = objectmapper;
    }

    public EntrySection a(es es1)
    {
        return new EntrySection(a.getString(o.contact_card_contact_info), es1, es.d());
    }

    public EntrySection a(String s)
    {
        return a(es.a(new PhoneEntry(null, true, null, -1L, s, 2)));
    }

    public String a(Contact contact)
    {
        e e1 = e.a((new StringBuilder()).append("serializeContact (").append(contact.getContactId()).append(")").toString());
        contact = b.writeValueAsString(contact);
        e1.a();
        return contact;
    }

    public String a(ContactDetails contactdetails)
    {
        e e1 = e.a((new StringBuilder()).append("serializeContactDetails (").append(contactdetails.getContactId()).append(")").toString());
        contactdetails = b.writeValueAsString(contactdetails);
        e1.a();
        return contactdetails;
    }

    public Contact b(String s)
    {
        e e1 = e.a("deserializeContact");
        s = (Contact)b.readValue(s, com/facebook/contacts/models/Contact);
        e1.a();
        return s;
    }
}
