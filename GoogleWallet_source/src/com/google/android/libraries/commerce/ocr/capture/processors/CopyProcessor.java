// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.commerce.ocr.capture.processors;

import android.util.Log;
import com.google.android.libraries.commerce.ocr.cv.OcrImage;
import com.google.android.libraries.commerce.ocr.cv.ResourcePool;
import com.google.android.libraries.commerce.ocr.cv.SafePoolable;

// Referenced classes of package com.google.android.libraries.commerce.ocr.capture.processors:
//            AbstractProcessor, IntervalPolicy

public final class CopyProcessor extends AbstractProcessor
{

    private final IntervalPolicy intervalPolicy;
    private final ResourcePool ocrImagePool;

    public CopyProcessor(IntervalPolicy intervalpolicy, ResourcePool resourcepool)
    {
        intervalPolicy = intervalpolicy;
        ocrImagePool = resourcepool;
    }

    private boolean isProcessingNeeded(OcrImage ocrimage)
    {
        return intervalPolicy.isOverInterval();
    }

    private SafePoolable process(OcrImage ocrimage)
    {
        SafePoolable safepoolable = ocrImagePool.obtainSafePoolable();
        try
        {
            ((OcrImage)safepoolable.get()).init(ocrimage.getData().length).copyFrom(ocrimage);
        }
        // Misplaced declaration of an exception variable
        catch (OcrImage ocrimage)
        {
            Log.w("CopyForBackgroundProcessor", "Ran out of memory for a frame, skipping");
            safepoolable.recycle();
            return null;
        }
        return safepoolable;
    }

    public final volatile boolean isProcessingNeeded(Object obj)
    {
        return isProcessingNeeded((OcrImage)obj);
    }

    public final volatile Object process(Object obj)
    {
        return process((OcrImage)obj);
    }

    public final void shutdown()
    {
        ocrImagePool.evict();
    }
}
