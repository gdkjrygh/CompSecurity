// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.adobe.ave.drm;


// Referenced classes of package com.adobe.ave.drm:
//            DRMManager, DRMOperationErrorCallback

class val.e
    implements Runnable
{

    final val.e this$1;
    final Exception val$e;
    final long val$majorCode;
    final long val$minorCode;

    public void run()
    {
        .OperationError(val$majorCode, val$minorCode, val$e);
    }

    ()
    {
        this$1 = final_;
        val$majorCode = l;
        val$minorCode = l1;
        val$e = Exception.this;
        super();
    }
}
