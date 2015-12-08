// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.gen;

import com.skype.SkyLib;

// Referenced classes of package com.skype.android.gen:
//            SkyLibListener

public static class _partnerUsername
{

    private String _accessToken;
    private com.skype.kInfoResult._uid _code;
    private String _partnerUsername;
    private SkyLib _sender;
    private String _skypename;
    private String _uid;

    public String getAccessToken()
    {
        return _accessToken;
    }

    public com.skype.kInfoResult getCode()
    {
        return _code;
    }

    public String getPartnerUsername()
    {
        return _partnerUsername;
    }

    public SkyLib getSender()
    {
        return _sender;
    }

    public String getSkypename()
    {
        return _skypename;
    }

    public String getUid()
    {
        return _uid;
    }

    public (SkyLib skylib, com.skype.kInfoResult kinforesult, String s, String s1, String s2, String s3)
    {
        _sender = skylib;
        _code = kinforesult;
        _skypename = s;
        _uid = s1;
        _accessToken = s2;
        _partnerUsername = s3;
    }
}
