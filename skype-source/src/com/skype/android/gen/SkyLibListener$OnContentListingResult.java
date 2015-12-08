// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.gen;

import com.skype.SkyLib;

// Referenced classes of package com.skype.android.gen:
//            SkyLibListener

public static class _contextid
{

    private int _contextid;
    private int _requestID;
    private com.skype.stingResult._sender _result;
    private byte _result_hash[];
    private SkyLib _sender;

    public int getContextid()
    {
        return _contextid;
    }

    public int getRequestID()
    {
        return _requestID;
    }

    public com.skype.stingResult getResult()
    {
        return _result;
    }

    public byte[] getResult_hash()
    {
        return _result_hash;
    }

    public SkyLib getSender()
    {
        return _sender;
    }

    public A(SkyLib skylib, int i, com.skype.stingResult stingresult, byte abyte0[], int j)
    {
        _sender = skylib;
        _requestID = i;
        _result = stingresult;
        _result_hash = abyte0;
        _contextid = j;
    }
}
