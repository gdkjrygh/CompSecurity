// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.contacts;

import java.io.Serializable;
import java.util.Comparator;

// Referenced classes of package com.skype.android.app.contacts:
//            ContactItem

public class ContactPopularityComparator
    implements Serializable, Comparator
{

    private static final long serialVersionUID = 0x6568f3511159d51eL;

    public ContactPopularityComparator()
    {
    }

    public int compare(ContactItem contactitem, ContactItem contactitem1)
    {
        return contactitem.getPopularityOrder() - contactitem1.getPopularityOrder();
    }

    public volatile int compare(Object obj, Object obj1)
    {
        return compare((ContactItem)obj, (ContactItem)obj1);
    }
}
