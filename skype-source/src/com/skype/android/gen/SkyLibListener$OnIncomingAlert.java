// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.gen;

import com.skype.SkyLib;

// Referenced classes of package com.skype.android.gen:
//            SkyLibListener

public static class _alertObjectID
{

    private int _alertObjectID;
    private SkyLib _sender;

    public int getAlertObjectID()
    {
        return _alertObjectID;
    }

    public SkyLib getSender()
    {
        return _sender;
    }

    public (SkyLib skylib, int i)
    {
        _sender = skylib;
        _alertObjectID = i;
    }
}
