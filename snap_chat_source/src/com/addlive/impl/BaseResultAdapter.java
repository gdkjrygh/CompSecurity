// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.addlive.impl;

import com.addlive.service.Responder;

// Referenced classes of package com.addlive.impl:
//            ServiceResponse

abstract class BaseResultAdapter
{

    protected Responder responder;

    private BaseResultAdapter()
    {
    }

    protected BaseResultAdapter(Responder responder1)
    {
        responder = responder1;
    }

    public Responder getResponder()
    {
        return responder;
    }

    public void handleResponse(ServiceResponse serviceresponse)
    {
        if (serviceresponse.getStatus())
        {
            handleSuccess(serviceresponse.getResult());
            return;
        } else
        {
            responder.errHandler(serviceresponse.getErrorCode(), serviceresponse.getErrorMessage());
            return;
        }
    }

    abstract void handleSuccess(Object obj);
}
