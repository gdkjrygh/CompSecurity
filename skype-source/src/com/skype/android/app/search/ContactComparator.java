// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.search;

import com.skype.android.app.contacts.ContactItem;
import java.text.Collator;
import java.util.Comparator;

public class ContactComparator
    implements Comparator
{

    private Collator collator;

    public ContactComparator()
    {
        collator = Collator.getInstance();
        collator.setStrength(0);
    }

    public int compare(ContactItem contactitem, ContactItem contactitem1)
    {
        return collator.compare(contactitem.getDisplayName(), contactitem1.getDisplayName());
    }

    public volatile int compare(Object obj, Object obj1)
    {
        return compare((ContactItem)obj, (ContactItem)obj1);
    }
}
