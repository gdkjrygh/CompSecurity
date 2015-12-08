// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.adobe.ave.drm;


// Referenced classes of package com.adobe.ave.drm:
//            DRMManager, DRMOperationErrorWithErrorObjectCallback, DRMError, DRMOperationErrorCallback

class this._cls1
    implements Runnable
{

    final mError this$1;

    public void run()
    {
        if ( instanceof DRMOperationErrorWithErrorObjectCallback)
        {
            ((DRMOperationErrorWithErrorObjectCallback)).OperationError(mError);
            return;
        } else
        {
            .OperationError(mError.getMajorError(), mError.getMinorError(), null);
            return;
        }
    }

    ectCallback()
    {
        this$1 = this._cls1.this;
        super();
    }
}
