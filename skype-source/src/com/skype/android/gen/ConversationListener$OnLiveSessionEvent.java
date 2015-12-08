// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.gen;

import com.skype.Conversation;

// Referenced classes of package com.skype.android.gen:
//            ConversationListener

public static class _callEventId
{

    private com.skype.essionEvent._sender _callEventId;
    private Conversation _sender;

    public com.skype.essionEvent getCallEventId()
    {
        return _callEventId;
    }

    public Conversation getSender()
    {
        return _sender;
    }

    public (Conversation conversation, com.skype.essionEvent essionevent)
    {
        _sender = conversation;
        _callEventId = essionevent;
    }
}
