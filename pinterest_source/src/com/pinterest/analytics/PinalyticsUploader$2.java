// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.analytics;

import com.pinterest.api.ApiResponse;
import com.pinterest.api.BaseApiResponseHandler;
import com.pinterest.kit.data.DiskCache;
import com.pinterest.kit.log.PLog;
import java.io.File;
import java.util.Arrays;

// Referenced classes of package com.pinterest.analytics:
//            PinalyticsUploader

class t> extends BaseApiResponseHandler
{

    final PinalyticsUploader a;

    public void onFailure(Throwable throwable, ApiResponse apiresponse)
    {
        throwable = PinalyticsUploader.b();
        throwable;
        JVM INSTR monitorenter ;
        if (apiresponse.getCode() == 15 || PinalyticsUploader.e(a) == null)
        {
            break MISSING_BLOCK_LABEL_123;
        }
        if (PinalyticsUploader.c(a) != null) goto _L2; else goto _L1
_L1:
        apiresponse = (new StringBuilder()).append(PinalyticsUploader.c()).append(Arrays.hashCode(PinalyticsUploader.e(a))).toString();
        DiskCache.ensureDirectory(PinalyticsUploader.d());
        DiskCache.setBytes(apiresponse, PinalyticsUploader.e(a));
        PLog.log("PinalyticsUploader", "Submitting: FAILED: Saving payload to disk for later.", new Object[0]);
_L3:
        PinalyticsUploader.d(a);
        return;
_L2:
        PLog.log("PinalyticsUploader", "Submitting: FAILED: Payload already on disk for later.", new Object[0]);
          goto _L3
        apiresponse;
        throwable;
        JVM INSTR monitorexit ;
        throw apiresponse;
        PLog.log("PinalyticsUploader", "Submitting: FATAL: %s", new Object[] {
            String.valueOf(apiresponse.getDeveloperError())
        });
        if (PinalyticsUploader.c(a) != null)
        {
            PinalyticsUploader.c(a).delete();
            PLog.log("PinalyticsUploader", "Deleted used cache events because they were invalid", new Object[0]);
        }
        PinalyticsUploader.a(apiresponse);
          goto _L3
    }

    public void onSuccess(ApiResponse apiresponse)
    {
        super.onSuccess(apiresponse);
        PLog.log("PinalyticsUploader", "Submitting: Success.", new Object[0]);
        synchronized (PinalyticsUploader.b())
        {
            if (PinalyticsUploader.c(a) != null)
            {
                PinalyticsUploader.c(a).delete();
                PLog.log("PinalyticsUploader", "Deleted used cache events.", new Object[0]);
            }
        }
        PinalyticsUploader.d(a);
        return;
        exception;
        apiresponse;
        JVM INSTR monitorexit ;
        throw exception;
    }

    (PinalyticsUploader pinalyticsuploader)
    {
        a = pinalyticsuploader;
        super();
    }
}
