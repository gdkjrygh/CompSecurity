// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.amazon.device.associates;


// Referenced classes of package com.amazon.device.associates:
//            an, RequestId

public abstract class ShoppingServiceResponse
{

    private final RequestId a;

    ShoppingServiceResponse(RequestId requestid)
    {
        an.a(requestid, "requestId");
        a = requestid;
    }

    protected abstract boolean a();

    public RequestId getRequestId()
    {
        return a;
    }
}
