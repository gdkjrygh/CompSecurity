// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.gen;

import com.skype.SkyLib;

// Referenced classes of package com.skype.android.gen:
//            SkyLibListener

public static class _expirationDelay
{

    private int _expiration;
    private int _expirationDelay;
    private int _request_id;
    private SkyLib _sender;
    private boolean _success;
    private String _token;

    public int getExpiration()
    {
        return _expiration;
    }

    public int getExpirationDelay()
    {
        return _expirationDelay;
    }

    public int getRequest_id()
    {
        return _request_id;
    }

    public SkyLib getSender()
    {
        return _sender;
    }

    public boolean getSuccess()
    {
        return _success;
    }

    public String getToken()
    {
        return _token;
    }

    public (SkyLib skylib, boolean flag, int i, String s, int j, int k)
    {
        _sender = skylib;
        _success = flag;
        _request_id = i;
        _token = s;
        _expiration = j;
        _expirationDelay = k;
    }
}
