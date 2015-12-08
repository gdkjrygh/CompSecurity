// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.api;

import com.android.volley.NetworkResponse;
import com.android.volley.VolleyError;
import java.util.ArrayList;
import java.util.List;
import org.apache.commons.lang3.StringUtils;

// Referenced classes of package com.pinterest.api:
//            ApiResponse, BaseApiResponseHandler

class <init> extends Exception
{

    final BaseApiResponseHandler a;
    private ApiResponse b;
    private int c;
    private String d;

    public String getMessage()
    {
        ArrayList arraylist = new ArrayList();
        if (b != null)
        {
            arraylist.add(String.valueOf(c));
            arraylist.add(d);
            arraylist.add(String.valueOf(b.getCode()));
            arraylist.add(b.getMessage());
        }
        return StringUtils.join(arraylist, ": ");
    }

    private (BaseApiResponseHandler baseapiresponsehandler, ApiResponse apiresponse, Throwable throwable)
    {
        a = baseapiresponsehandler;
        super(throwable);
        b = new ApiResponse();
        c = -1;
        d = "";
        b = apiresponse;
        if (throwable instanceof VolleyError)
        {
            c = ((VolleyError)throwable).networkResponse.statusCode;
            d = throwable.getLocalizedMessage();
        }
    }

    d(BaseApiResponseHandler baseapiresponsehandler, ApiResponse apiresponse, Throwable throwable, byte byte0)
    {
        this(baseapiresponsehandler, apiresponse, throwable);
    }
}
