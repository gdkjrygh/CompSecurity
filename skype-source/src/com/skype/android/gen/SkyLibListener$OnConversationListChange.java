// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.gen;

import com.skype.SkyLib;

// Referenced classes of package com.skype.android.gen:
//            SkyLibListener

public static class _added
{

    private boolean _added;
    private int _conversationObjectID;
    private SkyLib _sender;
    private com.skype.nListChange._type _type;

    public boolean getAdded()
    {
        return _added;
    }

    public int getConversationObjectID()
    {
        return _conversationObjectID;
    }

    public SkyLib getSender()
    {
        return _sender;
    }

    public com.skype.nListChange getType()
    {
        return _type;
    }

    public (SkyLib skylib, int i, com.skype.nListChange nlistchange, boolean flag)
    {
        _sender = skylib;
        _conversationObjectID = i;
        _type = nlistchange;
        _added = flag;
    }
}
