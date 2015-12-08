// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.gen;

import com.skype.SkyLib;

// Referenced classes of package com.skype.android.gen:
//            SkyLibListener

public static class _data
{

    private String _data;
    private com.skype.QueryResult._sender _errcode;
    private int _reqid;
    private SkyLib _sender;

    public String getData()
    {
        return _data;
    }

    public com.skype.QueryResult getErrcode()
    {
        return _errcode;
    }

    public int getReqid()
    {
        return _reqid;
    }

    public SkyLib getSender()
    {
        return _sender;
    }

    public (SkyLib skylib, int i, com.skype.QueryResult queryresult, String s)
    {
        _sender = skylib;
        _reqid = i;
        _errcode = queryresult;
        _data = s;
    }
}
