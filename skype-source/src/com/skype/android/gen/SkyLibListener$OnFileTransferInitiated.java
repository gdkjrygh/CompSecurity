// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.gen;

import com.skype.SkyLib;

// Referenced classes of package com.skype.android.gen:
//            SkyLibListener

public static class _transferObjectID
{

    private int _conversationObjectID;
    private int _messageObjectID;
    private SkyLib _sender;
    private int _transferObjectID;

    public int getConversationObjectID()
    {
        return _conversationObjectID;
    }

    public int getMessageObjectID()
    {
        return _messageObjectID;
    }

    public SkyLib getSender()
    {
        return _sender;
    }

    public int getTransferObjectID()
    {
        return _transferObjectID;
    }

    public (SkyLib skylib, int i, int j, int k)
    {
        _sender = skylib;
        _conversationObjectID = i;
        _messageObjectID = j;
        _transferObjectID = k;
    }
}
