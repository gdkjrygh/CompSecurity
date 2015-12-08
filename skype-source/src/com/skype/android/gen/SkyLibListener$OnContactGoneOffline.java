// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.gen;

import com.skype.SkyLib;

// Referenced classes of package com.skype.android.gen:
//            SkyLibListener

public static class _contactObjectID
{

    private int _contactObjectID;
    private SkyLib _sender;

    public int getContactObjectID()
    {
        return _contactObjectID;
    }

    public SkyLib getSender()
    {
        return _sender;
    }

    public (SkyLib skylib, int i)
    {
        _sender = skylib;
        _contactObjectID = i;
    }
}
