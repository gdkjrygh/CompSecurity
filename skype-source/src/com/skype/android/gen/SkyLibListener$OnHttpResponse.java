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
    private int _httpcode;
    private int _reqID;
    private com.skype.ttpResponse._userdata _result;
    private SkyLib _sender;
    private int _userdata;

    public byte[] getData()
    {
        return _data;
    }

    public int getHttpcode()
    {
        return _httpcode;
    }

    public int getReqID()
    {
        return _reqID;
    }

    public com.skype.ttpResponse getResult()
    {
        return _result;
    }

    public SkyLib getSender()
    {
        return _sender;
    }

    public int getUserdata()
    {
        return _userdata;
    }

    public _cls9(SkyLib skylib, int i, com.skype.ttpResponse ttpresponse, int j, byte abyte0[], int k)
    {
        _sender = skylib;
        _reqID = i;
        _result = ttpresponse;
        _httpcode = j;
        _data = abyte0;
        _userdata = k;
    }
}
