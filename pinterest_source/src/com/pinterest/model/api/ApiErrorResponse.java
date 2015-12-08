// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.model.api;

import com.pinterest.model.common.Error;

// Referenced classes of package com.pinterest.model.api:
//            ApiResponse

public class ApiErrorResponse extends ApiResponse
{

    private final Error error = null;
    private final String messageDetail = null;

    public ApiErrorResponse()
    {
    }

    public Error getError()
    {
        return error;
    }

    public String getMessageDetail()
    {
        return messageDetail;
    }
}
