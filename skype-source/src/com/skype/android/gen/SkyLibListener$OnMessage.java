// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.gen;

import com.skype.SkyLib;

// Referenced classes of package com.skype.android.gen:
//            SkyLibListener

public static class _showNotification
{

    private boolean _changesInboxTimestamp;
    private int _conversationObjectID;
    private int _messageObjectID;
    private SkyLib _sender;
    private boolean _showNotification;
    private int _supersedesHistoryMessageObjectID;

    public boolean getChangesInboxTimestamp()
    {
        return _changesInboxTimestamp;
    }

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

    public boolean getShowNotification()
    {
        return _showNotification;
    }

    public int getSupersedesHistoryMessageObjectID()
    {
        return _supersedesHistoryMessageObjectID;
    }

    public (SkyLib skylib, int i, boolean flag, int j, int k, boolean flag1)
    {
        _sender = skylib;
        _messageObjectID = i;
        _changesInboxTimestamp = flag;
        _supersedesHistoryMessageObjectID = j;
        _conversationObjectID = k;
        _showNotification = flag1;
    }
}
