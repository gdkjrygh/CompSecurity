// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.gen;

import com.skype.SkyLib;

// Referenced classes of package com.skype.android.gen:
//            SkyLibListener

public static class _eventType
{

    private com.skype.TYPE _eventType;
    private SkyLib _sender;

    public com.skype.TYPE getEventType()
    {
        return _eventType;
    }

    public SkyLib getSender()
    {
        return _sender;
    }

    public (SkyLib skylib, com.skype.TYPE type)
    {
        _sender = skylib;
        _eventType = type;
    }
}
