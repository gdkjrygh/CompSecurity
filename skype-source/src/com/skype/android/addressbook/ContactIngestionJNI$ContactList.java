// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.addressbook;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.skype.android.addressbook:
//            ContactList, ContactIngestionJNI, PropertySet

public static class contacts extends ContactList
{

    private static final int DEFAULT_CAPACITY = 500;
    private List contacts;

    private contacts findContactById(String s)
    {
        for (Iterator iterator = contacts.iterator(); iterator.hasNext();)
        {
            contacts contacts2 = (contacts)iterator.next();
            if (contacts2.hasId(s))
            {
                return contacts2;
            }
        }

        contacts contacts1 = new <init>();
        contacts1.setName(s);
        contacts.add(contacts1);
        return contacts1;
    }

    public void addContact(contacts contacts1)
    {
        contacts.add(contacts1);
    }

    public void addEmail(String s, String s1)
    {
        findContactById(s).addEmail(s1);
    }

    public void addPhone(String s, String s1)
    {
        findContactById(s).addPhone(s1);
    }

    public void clear()
    {
        contacts.clear();
    }

    public contacts getContact(int i)
    {
        return (contacts)contacts.get(i);
    }

    public volatile PropertySet getContact(int i)
    {
        return getContact(i);
    }

    public String getStats()
    {
        int j = 0;
        int i = 0;
        for (Iterator iterator = contacts.iterator(); iterator.hasNext();)
        {
            getContact getcontact = (contacts)iterator.next();
            j += getcontact.countEmails();
            i += getcontact.countPhones();
        }

        return (new StringBuilder("Contact list contains: ")).append(contacts.size()).append(" contacts, ").append(j).append(" emails, ").append(i).append(" phone numbers").toString();
    }

    public contacts getSubset(int i, int j)
    {
        if (i >= 0 && i < contacts.size()) goto _L2; else goto _L1
_L1:
        contacts contacts1 = null;
_L4:
        return contacts1;
_L2:
        contacts contacts2 = new <init>(j);
        boolean flag = false;
        int k = Math.min(contacts.size() - i, j);
        j = ((flag) ? 1 : 0);
        do
        {
            contacts1 = contacts2;
            if (j >= k)
            {
                continue;
            }
            contacts2.addContact((addContact)contacts.get(i + j));
            j++;
        } while (true);
        if (true) goto _L4; else goto _L3
_L3:
    }

    public volatile ContactList getSubset(int i, int j)
    {
        return getSubset(i, j);
    }

    public int size()
    {
        return contacts.size();
    }

    public ()
    {
        contacts = new ArrayList(500);
    }

    public contacts(int i)
    {
        contacts = new ArrayList(i);
    }
}
