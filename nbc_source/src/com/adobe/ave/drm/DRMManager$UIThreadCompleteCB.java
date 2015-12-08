// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.adobe.ave.drm;

import android.os.Handler;

// Referenced classes of package com.adobe.ave.drm:
//            DRMOperationCompleteCallback, DRMManager

class cb
    implements DRMOperationCompleteCallback
{

    DRMOperationCompleteCallback cb;
    final DRMManager this$0;

    public void OperationComplete()
    {
        DRMManager.access$000(DRMManager.this).post(new Runnable() {

            final DRMManager.UIThreadCompleteCB this$1;

            public void run()
            {
                cb.OperationComplete();
            }

            
            {
                this$1 = DRMManager.UIThreadCompleteCB.this;
                super();
            }
        });
    }

    public _cls1.this._cls1(DRMOperationCompleteCallback drmoperationcompletecallback)
    {
        this$0 = DRMManager.this;
        super();
        cb = drmoperationcompletecallback;
    }
}
