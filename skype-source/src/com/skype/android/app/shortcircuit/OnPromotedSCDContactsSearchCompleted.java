// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.shortcircuit;

import com.skype.android.util.ContactUtil;
import java.util.List;

public class OnPromotedSCDContactsSearchCompleted
{

    private ContactUtil contactUtil;
    private int promotedSCDContactIds[];
    private int requestId;
    private boolean updatesOnly;

    public OnPromotedSCDContactsSearchCompleted(ContactUtil contactutil, com.skype.android.gen.SkyLibListener.OnPromotedSCDContactsFound onpromotedscdcontactsfound, boolean flag)
    {
        requestId = onpromotedscdcontactsfound.getRequestId();
        promotedSCDContactIds = onpromotedscdcontactsfound.getResultObjectIDList();
        contactUtil = contactutil;
        updatesOnly = flag;
    }

    public int[] getPromotedSCDContactIds()
    {
        return promotedSCDContactIds;
    }

    public List getPromotedSCDContacts()
    {
        return contactUtil.a(promotedSCDContactIds);
    }

    public int getRequestId()
    {
        return requestId;
    }

    public boolean isUpdatesOnly()
    {
        return updatesOnly;
    }
}
