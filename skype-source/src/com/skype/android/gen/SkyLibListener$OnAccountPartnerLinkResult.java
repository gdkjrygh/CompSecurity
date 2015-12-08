// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.gen;

import com.skype.SkyLib;

// Referenced classes of package com.skype.android.gen:
//            SkyLibListener

public static class _body
{

    private String _body;
    private com.skype.rLinkResult._sender _code;
    private SkyLib _sender;

    public String getBody()
    {
        return _body;
    }

    public com.skype.rLinkResult getCode()
    {
        return _code;
    }

    public SkyLib getSender()
    {
        return _sender;
    }

    public (SkyLib skylib, com.skype.rLinkResult rlinkresult, String s)
    {
        _sender = skylib;
        _code = rlinkresult;
        _body = s;
    }
}
