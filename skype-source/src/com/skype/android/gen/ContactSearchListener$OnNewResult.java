// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.gen;

import com.skype.ContactSearch;

// Referenced classes of package com.skype.android.gen:
//            ContactSearchListener

public static class _rankValue
{

    private int _contactObjectID;
    private int _rankValue;
    private ContactSearch _sender;

    public int getContactObjectID()
    {
        return _contactObjectID;
    }

    public int getRankValue()
    {
        return _rankValue;
    }

    public ContactSearch getSender()
    {
        return _sender;
    }

    public (ContactSearch contactsearch, int i, int j)
    {
        _sender = contactsearch;
        _contactObjectID = i;
        _rankValue = j;
    }
}
