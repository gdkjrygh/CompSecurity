// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.gen;

import com.skype.SkyLib;

// Referenced classes of package com.skype.android.gen:
//            SkyLibListener

public static class _code
{

    private com.skype.tionsChange._sender _code;
    private int _reqid;
    private SkyLib _sender;

    public com.skype.tionsChange getCode()
    {
        return _code;
    }

    public int getReqid()
    {
        return _reqid;
    }

    public SkyLib getSender()
    {
        return _sender;
    }

    public (SkyLib skylib, int i, com.skype.tionsChange tionschange)
    {
        _sender = skylib;
        _reqid = i;
        _code = tionschange;
    }
}
