// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.adobe.mediacore;

import com.adobe.ave.drm.DRMOperationErrorCallback;
import com.adobe.mediacore.logging.Logger;

// Referenced classes of package com.adobe.mediacore:
//            DRMMetadataInfo

static final class lback
    implements DRMOperationErrorCallback
{

    public void OperationError(long l, long l1, Exception exception)
    {
        DRMMetadataInfo.access$100().e((new StringBuilder()).append(DRMMetadataInfo.access$000()).append("#createDRMMetadataInfo").toString(), (new StringBuilder()).append("Error loading DRM metadata: ").append(l).append(" 0x").append(Long.toHexString(l1)).toString());
    }

    lback()
    {
    }
}
