// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.gen;

import com.skype.Conversation;

// Referenced classes of package com.skype.android.gen:
//            ConversationListener

public static class _receiverObjectID
{

    private int _receiverObjectID;
    private Conversation _sender;

    public int getReceiverObjectID()
    {
        return _receiverObjectID;
    }

    public Conversation getSender()
    {
        return _sender;
    }

    public (Conversation conversation, int i)
    {
        _sender = conversation;
        _receiverObjectID = i;
    }
}
