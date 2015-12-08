// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.gen;

import com.skype.Conversation;

// Referenced classes of package com.skype.android.gen:
//            ConversationListener

public static class _capabilities
{

    private boolean _capabilities[];
    private Conversation _sender;

    public boolean[] getCapabilities()
    {
        return _capabilities;
    }

    public Conversation getSender()
    {
        return _sender;
    }

    public (Conversation conversation, boolean aflag[])
    {
        _sender = conversation;
        _capabilities = aflag;
    }
}
