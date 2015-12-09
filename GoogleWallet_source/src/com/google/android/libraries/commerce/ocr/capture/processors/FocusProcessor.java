// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.commerce.ocr.capture.processors;

import android.util.Log;
import com.google.android.libraries.commerce.ocr.capture.InFocusFrameCheck;
import com.google.android.libraries.commerce.ocr.cv.OcrImage;
import com.google.android.libraries.commerce.ocr.cv.SafePoolable;
import com.google.android.libraries.commerce.ocr.ui.OcrRegionOfInterestProvider;

// Referenced classes of package com.google.android.libraries.commerce.ocr.capture.processors:
//            AbstractProcessor

public final class FocusProcessor extends AbstractProcessor
{

    private final boolean discardBlurryFrames;
    private final InFocusFrameCheck inFocusFrameCheck;
    private final OcrRegionOfInterestProvider roiProvider;

    public FocusProcessor(OcrRegionOfInterestProvider ocrregionofinterestprovider, InFocusFrameCheck infocusframecheck)
    {
        this(ocrregionofinterestprovider, infocusframecheck, true);
    }

    public FocusProcessor(OcrRegionOfInterestProvider ocrregionofinterestprovider, InFocusFrameCheck infocusframecheck, boolean flag)
    {
        roiProvider = ocrregionofinterestprovider;
        inFocusFrameCheck = infocusframecheck;
        discardBlurryFrames = flag;
    }

    private static void discard(SafePoolable safepoolable)
    {
        safepoolable.recycle();
    }

    private SafePoolable process(SafePoolable safepoolable)
    {
        SafePoolable safepoolable1 = safepoolable;
        if (!inFocusFrameCheck.isGoodAndTriggerAutofocus((OcrImage)safepoolable.get(), roiProvider))
        {
            safepoolable1 = safepoolable;
            if (discardBlurryFrames)
            {
                discard(safepoolable);
                safepoolable1 = null;
            }
        }
        return safepoolable1;
    }

    public final volatile void discard(Object obj)
    {
        discard((SafePoolable)obj);
    }

    public final volatile Object process(Object obj)
    {
        return process((SafePoolable)obj);
    }

    public final void shutdown()
    {
        Log.d("FocusProcessor", "Stop trying to focus");
    }
}
