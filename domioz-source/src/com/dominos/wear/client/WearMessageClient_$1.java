// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.wear.client;

import org.androidannotations.api.c;

// Referenced classes of package com.dominos.wear.client:
//            WearMessageClient_

class val.wearConnectionCallback extends c
{

    final WearMessageClient_ this$0;
    final rConnectionCallback val$wearConnectionCallback;

    public void execute()
    {
        try
        {
            WearMessageClient_.access$001(WearMessageClient_.this, val$wearConnectionCallback);
            return;
        }
        catch (Throwable throwable)
        {
            Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), throwable);
        }
    }

    rConnectionCallback(int i, String s1, rConnectionCallback rconnectioncallback)
    {
        this$0 = final_wearmessageclient_;
        val$wearConnectionCallback = rconnectioncallback;
        super(String.this, i, s1);
    }
}
