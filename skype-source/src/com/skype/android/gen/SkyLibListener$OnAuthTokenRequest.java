// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.gen;

import com.skype.SkyLib;

// Referenced classes of package com.skype.android.gen:
//            SkyLibListener

public static class _scopes
{

    private long _partnerId;
    private String _scopes[];
    private SkyLib _sender;

    public long getPartnerId()
    {
        return _partnerId;
    }

    public String[] getScopes()
    {
        return _scopes;
    }

    public SkyLib getSender()
    {
        return _sender;
    }

    public (SkyLib skylib, long l, String as[])
    {
        _sender = skylib;
        _partnerId = l;
        _scopes = as;
    }
}
