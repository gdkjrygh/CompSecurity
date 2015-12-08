// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.adobe.mediacore;

import com.adobe.ave.drm.DRMOperationErrorCallback;

// Referenced classes of package com.adobe.mediacore:
//            DefaultDRMService

class this._cls0
    implements DRMOperationErrorCallback
{

    final DefaultDRMService this$0;

    public void OperationError(long l, long l1, Exception exception)
    {
        if (DefaultDRMService.access$000(DefaultDRMService.this) != null)
        {
            DefaultDRMService.access$000(DefaultDRMService.this).onError(l, l1, exception);
        }
    }

    istener()
    {
        this$0 = DefaultDRMService.this;
        super();
    }
}
