// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.adobe.ave.drm;

import android.os.Handler;

// Referenced classes of package com.adobe.ave.drm:
//            DRMLicenseReturnCompleteCallback, DRMManager

class cb
    implements DRMLicenseReturnCompleteCallback
{

    DRMLicenseReturnCompleteCallback cb;
    final DRMManager this$0;

    public void OperationComplete(final long numReturned)
    {
        DRMManager.access$000(DRMManager.this).post(new Runnable() {

            final DRMManager.UIThreadLicenseReturnCompleteCB this$1;
            final long val$numReturned;

            public void run()
            {
                cb.OperationComplete(numReturned);
            }

            
            {
                this$1 = DRMManager.UIThreadLicenseReturnCompleteCB.this;
                numReturned = l;
                super();
            }
        });
    }

    public _cls1.val.numReturned(DRMLicenseReturnCompleteCallback drmlicensereturncompletecallback)
    {
        this$0 = DRMManager.this;
        super();
        cb = drmlicensereturncompletecallback;
    }
}
