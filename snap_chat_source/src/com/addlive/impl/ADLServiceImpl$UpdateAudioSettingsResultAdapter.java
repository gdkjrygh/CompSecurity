// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.addlive.impl;

import com.addlive.service.Responder;

// Referenced classes of package com.addlive.impl:
//            BaseResultAdapter, ADLServiceImpl, ADLNativeWrapper

class this._cls0 extends BaseResultAdapter
{

    final ADLServiceImpl this$0;

    void handleSuccess(Object obj)
    {
        ADLServiceImpl.access$200(ADLServiceImpl.this).updateAudioSettings();
        if (responder != null)
        {
            responder.resultHandler(null);
        }
    }

    (Responder responder)
    {
        this$0 = ADLServiceImpl.this;
        super(responder);
    }
}
