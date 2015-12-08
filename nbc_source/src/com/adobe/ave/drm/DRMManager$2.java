// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.adobe.ave.drm;


// Referenced classes of package com.adobe.ave.drm:
//            DRMLicenseAcquiredCallback, DRMManager, DRMOperationCompleteCallback, DRMLicense

class ompleteCallback
    implements DRMLicenseAcquiredCallback
{

    final DRMManager this$0;
    final DRMOperationCompleteCallback val$complete;

    public void LicenseAcquired(DRMLicense drmlicense)
    {
        val$complete.OperationComplete();
    }

    ompleteCallback()
    {
        this$0 = final_drmmanager;
        val$complete = DRMOperationCompleteCallback.this;
        super();
    }
}
