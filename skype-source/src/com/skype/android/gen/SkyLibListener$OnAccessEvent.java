// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.gen;

import com.skype.SkyLib;

// Referenced classes of package com.skype.android.gen:
//            SkyLibListener

public static class _data
{

    private int _data;
    private com.skype.AccessEvent._sender _eventtype;
    private SkyLib _sender;

    public int getData()
    {
        return _data;
    }

    public com.skype.AccessEvent getEventtype()
    {
        return _eventtype;
    }

    public SkyLib getSender()
    {
        return _sender;
    }

    public (SkyLib skylib, com.skype.AccessEvent accessevent, int i)
    {
        _sender = skylib;
        _eventtype = accessevent;
        _data = i;
    }
}
