// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.push;


// Referenced classes of package com.skype.android.push:
//            ChatPushMessage

public class OnChatPushMessageStoredEvent
{

    private final boolean fastSyncMessage;
    private final ChatPushMessage message;
    private final long syntheticId;

    public OnChatPushMessageStoredEvent(ChatPushMessage chatpushmessage, boolean flag, long l)
    {
        message = chatpushmessage;
        fastSyncMessage = flag;
        syntheticId = l;
    }

    public ChatPushMessage getStoredMessage()
    {
        return message;
    }

    public long getSyntheticId()
    {
        return syntheticId;
    }

    public boolean isFastSyncMessage()
    {
        return fastSyncMessage;
    }
}
