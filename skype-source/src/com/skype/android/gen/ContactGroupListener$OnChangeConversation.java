// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.gen;

import com.skype.ContactGroup;

// Referenced classes of package com.skype.android.gen:
//            ContactGroupListener

public static class _conversationObjectID
{

    private int _conversationObjectID;
    private ContactGroup _sender;

    public int getConversationObjectID()
    {
        return _conversationObjectID;
    }

    public ContactGroup getSender()
    {
        return _sender;
    }

    public (ContactGroup contactgroup, int i)
    {
        _sender = contactgroup;
        _conversationObjectID = i;
    }
}
