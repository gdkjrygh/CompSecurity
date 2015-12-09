// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.amazon.device.iap.internal.model;

import com.amazon.device.iap.model.RequestId;
import com.amazon.device.iap.model.UserData;
import com.amazon.device.iap.model.UserDataResponse;

public class UserDataResponseBuilder
{

    private RequestId requestId;
    private com.amazon.device.iap.model.UserDataResponse.RequestStatus requestStatus;
    private UserData userData;

    public UserDataResponseBuilder()
    {
    }

    public UserDataResponse build()
    {
        return new UserDataResponse(this);
    }

    public RequestId getRequestId()
    {
        return requestId;
    }

    public com.amazon.device.iap.model.UserDataResponse.RequestStatus getRequestStatus()
    {
        return requestStatus;
    }

    public UserData getUserData()
    {
        return userData;
    }

    public UserDataResponseBuilder setRequestId(RequestId requestid)
    {
        requestId = requestid;
        return this;
    }

    public UserDataResponseBuilder setRequestStatus(com.amazon.device.iap.model.UserDataResponse.RequestStatus requeststatus)
    {
        requestStatus = requeststatus;
        return this;
    }

    public UserDataResponseBuilder setUserData(UserData userdata)
    {
        userData = userdata;
        return this;
    }
}
