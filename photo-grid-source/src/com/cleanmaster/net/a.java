// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cleanmaster.net;

import org.apache.http.HttpResponse;
import org.apache.http.StatusLine;

// Referenced classes of package com.cleanmaster.net:
//            ResponseCode

public class a
{

    private ResponseCode a;

    public a()
    {
        a = ResponseCode.DEFAULT;
    }

    public void a(ResponseCode responsecode)
    {
        a = responsecode;
    }

    public void a(HttpResponse httpresponse)
    {
        switch (httpresponse.getStatusLine().getStatusCode())
        {
        default:
            a(ResponseCode.Failed);
            return;

        case 200: 
            a(ResponseCode.Succeed);
            return;

        case 400: 
            a(ResponseCode.BadRequest);
            return;

        case 401: 
            a(ResponseCode.UnAuthorized);
            return;

        case 403: 
            a(ResponseCode.Forbidden);
            return;

        case 404: 
            a(ResponseCode.NotFound);
            return;

        case 409: 
            a(ResponseCode.Conflict);
            return;

        case 500: 
            a(ResponseCode.InternalError);
            break;
        }
    }
}
