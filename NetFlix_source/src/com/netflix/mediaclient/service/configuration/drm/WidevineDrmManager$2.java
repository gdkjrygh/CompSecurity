// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.service.configuration.drm;

import com.netflix.mediaclient.Log;

// Referenced classes of package com.netflix.mediaclient.service.configuration.drm:
//            WidevineDrmManager

class this._cls0
    implements Runnable
{

    final WidevineDrmManager this$0;

    public void run()
    {
        WidevineDrmManager.access$400(WidevineDrmManager.this).logoutUser();
        Log.d(WidevineDrmManager.TAG, "Redo CDM provisioning");
        init();
    }

    ()
    {
        this$0 = WidevineDrmManager.this;
        super();
    }
}
