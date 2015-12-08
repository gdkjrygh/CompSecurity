// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.gen;

import com.skype.SkyLib;

// Referenced classes of package com.skype.android.gen:
//            SkyLibListener

public static class _userdata
{

    private byte _data[];
    private int _reqID;
    private SkyLib _sender;
    private int _userdata;

    public byte[] getData()
    {
        return _data;
    }

    public int getReqID()
    {
        return _reqID;
    }

    public SkyLib getSender()
    {
        return _sender;
    }

    public int getUserdata()
    {
        return _userdata;
    }

    public (SkyLib skylib, int i, byte abyte0[], int j)
    {
        _sender = skylib;
        _reqID = i;
        _data = abyte0;
        _userdata = j;
    }
}
