// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.adjust.sdk;


// Referenced classes of package com.adjust.sdk:
//            ActivityHandler, OnFinishedListener, ResponseData

class val.responseData
    implements Runnable
{

    final ActivityHandler this$0;
    final ResponseData val$responseData;

    public void run()
    {
        try
        {
            ActivityHandler.access$000(ActivityHandler.this).onFinishedTracking(val$responseData);
            return;
        }
        catch (NullPointerException nullpointerexception)
        {
            return;
        }
    }

    ()
    {
        this$0 = final_activityhandler;
        val$responseData = ResponseData.this;
        super();
    }
}
