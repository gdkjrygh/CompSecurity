// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.adobe.ave.drm;

import android.os.Handler;

// Referenced classes of package com.adobe.ave.drm:
//            DRMLicenseAcquiredCallback, DRMManager, DRMLicense

class cb
    implements DRMLicenseAcquiredCallback
{

    DRMLicenseAcquiredCallback cb;
    final DRMManager this$0;

    public void LicenseAcquired(final DRMLicense license)
    {
        DRMManager.access$000(DRMManager.this).post(new Runnable() {

            final DRMManager.UIThreadLicenseAcquiredCB this$1;
            final DRMLicense val$license;

            public void run()
            {
                cb.LicenseAcquired(license);
            }

            
            {
                this$1 = DRMManager.UIThreadLicenseAcquiredCB.this;
                license = drmlicense;
                super();
            }
        });
    }

    public _cls1.val.license(DRMLicenseAcquiredCallback drmlicenseacquiredcallback)
    {
        this$0 = DRMManager.this;
        super();
        cb = drmlicenseacquiredcallback;
    }
}
