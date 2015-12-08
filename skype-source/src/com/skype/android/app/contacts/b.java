// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.contacts;

import com.skype.ContactGroup;
import java.io.Serializable;
import java.util.Comparator;

final class b
    implements Serializable, Comparator
{

    private static final long serialVersionUID = 0x8bd7bc3fc0be8e9fL;

    b()
    {
    }

    public final int compare(ContactGroup contactgroup, ContactGroup contactgroup1)
    {
        return contactgroup.getGivenDisplaynameProp().compareToIgnoreCase(contactgroup1.getGivenDisplaynameProp());
    }

    public final volatile int compare(Object obj, Object obj1)
    {
        return compare((ContactGroup)obj, (ContactGroup)obj1);
    }
}
