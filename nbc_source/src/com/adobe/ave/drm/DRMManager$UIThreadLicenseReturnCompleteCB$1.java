// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.adobe.ave.drm;


// Referenced classes of package com.adobe.ave.drm:
//            DRMManager, DRMLicenseReturnCompleteCallback

class val.numReturned
    implements Runnable
{

    final val.numReturned this$1;
    final long val$numReturned;

    public void run()
    {
        .OperationComplete(val$numReturned);
    }

    ()
    {
        this$1 = final_;
        val$numReturned = J.this;
        super();
    }
}
