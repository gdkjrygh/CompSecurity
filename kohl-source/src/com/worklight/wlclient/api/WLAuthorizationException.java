// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.worklight.wlclient.api;


// Referenced classes of package com.worklight.wlclient.api:
//            WLFailResponse

public class WLAuthorizationException extends Exception
{

    private static final long serialVersionUID = 0x1fd0b2833b5a483cL;
    private WLFailResponse response;

    public WLAuthorizationException(WLFailResponse wlfailresponse)
    {
        super(wlfailresponse.errorMsg);
        response = wlfailresponse;
    }

    public WLFailResponse getWLFailResponse()
    {
        return response;
    }
}
