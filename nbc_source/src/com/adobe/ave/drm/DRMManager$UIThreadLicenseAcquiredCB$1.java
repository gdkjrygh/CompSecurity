// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.adobe.ave.drm;


// Referenced classes of package com.adobe.ave.drm:
//            DRMManager, DRMLicenseAcquiredCallback, DRMLicense

class val.license
    implements Runnable
{

    final val.license this$1;
    final DRMLicense val$license;

    public void run()
    {
        .LicenseAcquired(val$license);
    }

    ()
    {
        this$1 = final_;
        val$license = DRMLicense.this;
        super();
    }
}
