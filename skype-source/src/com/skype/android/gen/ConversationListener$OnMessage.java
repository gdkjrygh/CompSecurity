// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.gen;

import com.skype.Conversation;

// Referenced classes of package com.skype.android.gen:
//            ConversationListener

public static class _messageObjectID
{

    private int _messageObjectID;
    private Conversation _sender;

    public int getMessageObjectID()
    {
        return _messageObjectID;
    }

    public Conversation getSender()
    {
        return _sender;
    }

    public (Conversation conversation, int i)
    {
        _sender = conversation;
        _messageObjectID = i;
    }
}
