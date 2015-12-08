// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.gen;

import com.skype.SkyLib;

// Referenced classes of package com.skype.android.gen:
//            SkyLibListener

public static class _requestId
{

    private int _requestId;
    private SkyLib _sender;
    private com.skype.xtsComplete._success _success;

    public int getRequestId()
    {
        return _requestId;
    }

    public SkyLib getSender()
    {
        return _sender;
    }

    public com.skype.xtsComplete getSuccess()
    {
        return _success;
    }

    public (SkyLib skylib, com.skype.xtsComplete xtscomplete, int i)
    {
        _sender = skylib;
        _success = xtscomplete;
        _requestId = i;
    }
}
