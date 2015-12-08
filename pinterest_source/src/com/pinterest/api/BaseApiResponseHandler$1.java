// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.api;


// Referenced classes of package com.pinterest.api:
//            BaseApiResponseHandler, ApiResponse

class a
    implements Runnable
{

    final ApiResponse a;
    final BaseApiResponseHandler b;

    public void run()
    {
        b.onSuccess(a);
    }

    (BaseApiResponseHandler baseapiresponsehandler, ApiResponse apiresponse)
    {
        b = baseapiresponsehandler;
        a = apiresponse;
        super();
    }
}
