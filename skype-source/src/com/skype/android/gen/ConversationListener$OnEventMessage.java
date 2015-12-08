// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.gen;

import com.skype.Conversation;

// Referenced classes of package com.skype.android.gen:
//            ConversationListener

public static class _body
{

    private String _body;
    private Conversation _sender;
    private com.skype.ventMessage._type _type;

    public String getBody()
    {
        return _body;
    }

    public Conversation getSender()
    {
        return _sender;
    }

    public com.skype.ventMessage getType()
    {
        return _type;
    }

    public (Conversation conversation, com.skype.ventMessage ventmessage, String s)
    {
        _sender = conversation;
        _type = ventmessage;
        _body = s;
    }
}
