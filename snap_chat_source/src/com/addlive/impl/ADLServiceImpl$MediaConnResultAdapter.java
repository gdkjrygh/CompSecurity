// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.addlive.impl;

import com.addlive.service.Responder;
import java.util.Map;

// Referenced classes of package com.addlive.impl:
//            BaseResultAdapter, ADLServiceImpl, ADLMediaConnectionImpl, ADLNativeWrapper

class scopeId extends BaseResultAdapter
{

    private String scopeId;
    final ADLServiceImpl this$0;

    void handleSuccess(Object obj)
    {
        if (responder != null)
        {
            obj = new ADLMediaConnectionImpl(scopeId);
            ADLServiceImpl.access$200(ADLServiceImpl.this).getActiveConnections().put(scopeId, obj);
            responder.resultHandler(obj);
        }
    }

    (Responder responder, String s)
    {
        this$0 = ADLServiceImpl.this;
        super(responder);
        scopeId = s;
    }
}
