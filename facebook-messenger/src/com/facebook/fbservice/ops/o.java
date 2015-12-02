// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.fbservice.ops;

import com.facebook.fbservice.service.OperationResult;
import com.facebook.fbservice.service.ServiceException;
import com.facebook.fbservice.service.t;
import com.facebook.http.protocol.ApiErrorResult;

public class o
{

    public o()
    {
    }

    public boolean a(Exception exception)
    {
        if (exception instanceof ServiceException)
        {
            if ((exception = (ServiceException)exception).a() == t.API_ERROR && (exception = (ApiErrorResult)exception.b().i()) != null)
            {
                boolean flag;
                if (exception.a() == 190 || exception.a() == 102)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                return flag;
            }
        }
        return false;
    }
}
