// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.addlive.impl.cam;

import java.util.concurrent.CountDownLatch;

// Referenced classes of package com.addlive.impl.cam:
//            ADLCameraHelper

class yncResult
    implements Runnable
{

    final ADLCameraHelper this$0;
    final yncResult val$result;
    final CountDownLatch val$syncLatch;
    final mTask val$task;

    public void run()
    {
        ADLCameraHelper.access$300(ADLCameraHelper.this, val$syncLatch, val$task, val$result);
    }

    yncResult()
    {
        this$0 = final_adlcamerahelper;
        val$syncLatch = countdownlatch;
        val$task = mtask;
        val$result = yncResult.this;
        super();
    }
}
