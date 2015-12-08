// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.gen;

import com.skype.SkyLib;

// Referenced classes of package com.skype.android.gen:
//            SkyLibListener

public static class _notification
{

    private int _clientID;
    private String _notification;
    private SkyLib _sender;

    public int getClientID()
    {
        return _clientID;
    }

    public String getNotification()
    {
        return _notification;
    }

    public SkyLib getSender()
    {
        return _sender;
    }

    public (SkyLib skylib, int i, String s)
    {
        _sender = skylib;
        _clientID = i;
        _notification = s;
    }
}
