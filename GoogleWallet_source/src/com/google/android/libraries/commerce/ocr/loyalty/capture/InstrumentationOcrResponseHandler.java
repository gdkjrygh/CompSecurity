// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.commerce.ocr.loyalty.capture;

import com.google.android.libraries.commerce.ocr.capture.DecoratingOcrHandler;
import com.google.android.libraries.commerce.ocr.loyalty.debug.DebugInfo;
import com.google.android.libraries.commerce.ocr.loyalty.debug.InstrumentationSupervisor;

public final class InstrumentationOcrResponseHandler extends DecoratingOcrHandler
{

    private final InstrumentationSupervisor instrumentationSupervisor;

    private InstrumentationOcrResponseHandler(com.google.android.libraries.commerce.ocr.capture.OcrRecognizer.OcrResponseHandler ocrresponsehandler, InstrumentationSupervisor instrumentationsupervisor)
    {
        super(ocrresponsehandler);
        instrumentationSupervisor = instrumentationsupervisor;
    }

    public static InstrumentationOcrResponseHandler create(com.google.android.libraries.commerce.ocr.capture.OcrRecognizer.OcrResponseHandler ocrresponsehandler, InstrumentationSupervisor instrumentationsupervisor)
    {
        return new InstrumentationOcrResponseHandler(ocrresponsehandler, instrumentationsupervisor);
    }

    private void onRecognized(Object obj, DebugInfo debuginfo)
    {
        instrumentationSupervisor.onClientResult();
        DebugInfo debuginfo1 = debuginfo;
        if (debuginfo == null)
        {
            debuginfo1 = new DebugInfo();
        }
        super.onRecognized(obj, debuginfo1);
    }

    private void onUnrecognized(DebugInfo debuginfo)
    {
        DebugInfo debuginfo1 = debuginfo;
        if (debuginfo == null)
        {
            debuginfo1 = new DebugInfo();
        }
        super.onUnrecognized(debuginfo1);
    }

    public final volatile void onRecognized(Object obj, Object obj1)
    {
        onRecognized(obj, (DebugInfo)obj1);
    }

    public final volatile void onUnrecognized(Object obj)
    {
        onUnrecognized((DebugInfo)obj);
    }
}
