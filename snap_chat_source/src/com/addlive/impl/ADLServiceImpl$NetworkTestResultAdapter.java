// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.addlive.impl;

import com.addlive.service.ConnectionQuality;
import com.addlive.service.Responder;

// Referenced classes of package com.addlive.impl:
//            BaseResultAdapter, ADLServiceImpl

class this._cls0 extends BaseResultAdapter
{

    final ADLServiceImpl this$0;

    void handleSuccess(Object obj)
    {
        if (responder == null)
        {
            return;
        } else
        {
            obj = (Integer)obj;
            responder.resultHandler(ConnectionQuality._fromInt(((Integer) (obj)).intValue()));
            return;
        }
    }

    (Responder responder)
    {
        this$0 = ADLServiceImpl.this;
        super(responder);
    }
}
