// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.splitfare;

import java.util.List;

// Referenced classes of package me.lyft.android.ui.splitfare:
//            SplitFareDialogs

public class disabledContacts extends SplitFareDialogs
{

    private final List checkedContacts;
    private final List contacts;
    private final List disabledContacts;

    public List getCheckedContacts()
    {
        return checkedContacts;
    }

    public List getContacts()
    {
        return contacts;
    }

    public List getDisabledContacts()
    {
        return disabledContacts;
    }

    public (List list, List list1, List list2)
    {
        contacts = list;
        checkedContacts = list1;
        disabledContacts = list2;
    }
}
