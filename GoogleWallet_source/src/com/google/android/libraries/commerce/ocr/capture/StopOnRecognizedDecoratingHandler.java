// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.commerce.ocr.capture;

import android.util.Log;
import com.google.android.libraries.commerce.ocr.capture.pipeline.PipelineNode;

// Referenced classes of package com.google.android.libraries.commerce.ocr.capture:
//            DecoratingOcrHandler

public final class StopOnRecognizedDecoratingHandler extends DecoratingOcrHandler
{

    private PipelineNode pipeline;

    private StopOnRecognizedDecoratingHandler(OcrRecognizer.OcrResponseHandler ocrresponsehandler)
    {
        super(ocrresponsehandler);
    }

    public static StopOnRecognizedDecoratingHandler create(OcrRecognizer.OcrResponseHandler ocrresponsehandler)
    {
        return new StopOnRecognizedDecoratingHandler(ocrresponsehandler);
    }

    private void stopProcessing()
    {
        String s = String.valueOf(pipeline);
        Log.d("StopOnRecognizedDecoratingHandler", (new StringBuilder(String.valueOf(s).length() + 26)).append("Stopping frame processor: ").append(s).toString());
        if (pipeline != null)
        {
            pipeline.shutdown();
        }
    }

    public final void onRecognized(Object obj)
    {
        stopProcessing();
        super.onRecognized(obj);
    }

    public final void onRecognized(Object obj, Object obj1)
    {
        stopProcessing();
        super.onRecognized(obj, obj1);
    }

    public final void setPipeline(PipelineNode pipelinenode)
    {
        pipeline = pipelinenode;
    }
}
