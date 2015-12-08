// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.gen;

import com.skype.SkyLib;

// Referenced classes of package com.skype.android.gen:
//            SkyLibListener

public static class _attributes
{

    private byte _attributes[];
    private SkyLib _sender;
    private int _statsType;

    public byte[] getAttributes()
    {
        return _attributes;
    }

    public SkyLib getSender()
    {
        return _sender;
    }

    public int getStatsType()
    {
        return _statsType;
    }

    public (SkyLib skylib, int i, byte abyte0[])
    {
        _sender = skylib;
        _statsType = i;
        _attributes = abyte0;
    }
}
