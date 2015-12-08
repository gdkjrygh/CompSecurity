// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.addressbook;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.skype.android.addressbook:
//            PropertySet

public class ContactList
{

    private static final int DEFAULT_CAPACITY = 500;
    private List contacts;

    public ContactList()
    {
        contacts = new ArrayList(500);
    }

    public ContactList(int i)
    {
        contacts = new ArrayList(i);
    }

    private PropertySet findContactById(String s)
    {
        for (Iterator iterator = contacts.iterator(); iterator.hasNext();)
        {
            PropertySet propertyset1 = (PropertySet)iterator.next();
            if (propertyset1.hasId(s))
            {
                return propertyset1;
            }
        }

        PropertySet propertyset = createPropertySet();
        propertyset.setName(s);
        contacts.add(propertyset);
        return propertyset;
    }

    public void addContact(PropertySet propertyset)
    {
        contacts.add(propertyset);
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

    protected PropertySet createPropertySet()
    {
        return new PropertySet();
    }

    public PropertySet getContact(int i)
    {
        return (PropertySet)contacts.get(i);
    }

    protected ContactList getContactListOfSize(int i)
    {
        return new ContactList(i);
    }

    public String getStats()
    {
        int j = 0;
        int i = 0;
        for (Iterator iterator = contacts.iterator(); iterator.hasNext();)
        {
            PropertySet propertyset = (PropertySet)iterator.next();
            j += propertyset.countEmails();
            i += propertyset.countPhones();
        }

        return (new StringBuilder("Contact list contains: ")).append(contacts.size()).append(" contacts, ").append(j).append(" emails, ").append(i).append(" phone numbers").toString();
    }

    public ContactList getSubset(int i, int j)
    {
        if (i >= 0 && i < contacts.size()) goto _L2; else goto _L1
_L1:
        ContactList contactlist = null;
_L4:
        return contactlist;
_L2:
        ContactList contactlist1 = getContactListOfSize(j);
        boolean flag = false;
        int k = Math.min(contacts.size() - i, j);
        j = ((flag) ? 1 : 0);
        do
        {
            contactlist = contactlist1;
            if (j >= k)
            {
                continue;
            }
            contactlist1.addContact((PropertySet)contacts.get(i + j));
            j++;
        } while (true);
        if (true) goto _L4; else goto _L3
_L3:
    }

    public int size()
    {
        return contacts.size();
    }
}
