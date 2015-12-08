// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fsr.tracker.services;

import com.fsr.tracker.service.Callback;

// Referenced classes of package com.fsr.tracker.services:
//            ExitSurveyServiceClientImpl

class val.callback
    implements com.fsr.tracker.tasks.
{

    final ExitSurveyServiceClientImpl this$0;
    final Callback val$callback;

    public void onComplete(com.fsr.tracker.service.tionResult tionresult)
    {
        val$callback.onComplete(tionresult);
    }

    public volatile void onComplete(Object obj)
    {
        onComplete((com.fsr.tracker.service.tionResult)obj);
    }

    public void onFailure(Throwable throwable)
    {
        val$callback.onFailure(throwable);
    }

    ionResult()
    {
        this$0 = final_exitsurveyserviceclientimpl;
        val$callback = Callback.this;
        super();
    }
}
