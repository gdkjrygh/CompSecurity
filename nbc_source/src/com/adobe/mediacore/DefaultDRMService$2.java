// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.adobe.mediacore;

import com.adobe.ave.drm.DRMOperationCompleteCallback;

// Referenced classes of package com.adobe.mediacore:
//            DefaultDRMService

class this._cls0
    implements DRMOperationCompleteCallback
{

    final DefaultDRMService this$0;

    public void OperationComplete()
    {
        DefaultDRMService.access$102(DefaultDRMService.this, true);
        if (DefaultDRMService.access$000(DefaultDRMService.this) != null)
        {
            DefaultDRMService.access$000(DefaultDRMService.this).onInitialized();
        }
    }

    istener()
    {
        this$0 = DefaultDRMService.this;
        super();
    }
}
