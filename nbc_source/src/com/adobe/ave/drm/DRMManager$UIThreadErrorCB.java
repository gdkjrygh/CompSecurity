// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.adobe.ave.drm;

import android.os.Handler;

// Referenced classes of package com.adobe.ave.drm:
//            DRMOperationErrorWithErrorObjectCallback, DRMManager, DRMOperationErrorCallback, DRMError

class cb
    implements DRMOperationErrorWithErrorObjectCallback
{

    DRMOperationErrorCallback cb;
    DRMError drmError;
    final DRMManager this$0;

    public void OperationError(final long majorCode, final long minorCode, final Exception e)
    {
        DRMManager.access$000(DRMManager.this).post(new Runnable() {

            final DRMManager.UIThreadErrorCB this$1;
            final Exception val$e;
            final long val$majorCode;
            final long val$minorCode;

            public void run()
            {
                cb.OperationError(majorCode, minorCode, e);
            }

            
            {
                this$1 = DRMManager.UIThreadErrorCB.this;
                majorCode = l;
                minorCode = l1;
                e = exception;
                super();
            }
        });
    }

    public void OperationError(DRMError drmerror)
    {
        drmError = drmerror;
        DRMManager.access$000(DRMManager.this).post(new Runnable() {

            final DRMManager.UIThreadErrorCB this$1;

            public void run()
            {
                if (cb instanceof DRMOperationErrorWithErrorObjectCallback)
                {
                    ((DRMOperationErrorWithErrorObjectCallback)cb).OperationError(drmError);
                    return;
                } else
                {
                    cb.OperationError(drmError.getMajorError(), drmError.getMinorError(), null);
                    return;
                }
            }

            
            {
                this$1 = DRMManager.UIThreadErrorCB.this;
                super();
            }
        });
    }

    public _cls2.val.e(DRMOperationErrorCallback drmoperationerrorcallback)
    {
        this$0 = DRMManager.this;
        super();
        cb = drmoperationerrorcallback;
    }
}
