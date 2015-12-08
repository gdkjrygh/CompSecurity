// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.commerce.ocr.capture.processors;


// Referenced classes of package com.google.android.libraries.commerce.ocr.capture.processors:
//            Processor, SessionData, SessionSafePoolable

public final class SessionPassthroughProcessor
    implements Processor
{

    private final Processor internalProcessor;

    public SessionPassthroughProcessor(Processor processor)
    {
        internalProcessor = processor;
    }

    private void discard(SessionSafePoolable sessionsafepoolable)
    {
        internalProcessor.discard(sessionsafepoolable);
    }

    private boolean isProcessingNeeded(SessionSafePoolable sessionsafepoolable)
    {
        return internalProcessor.isProcessingNeeded(sessionsafepoolable);
    }

    private SessionData process(SessionSafePoolable sessionsafepoolable)
    {
        Object obj = internalProcessor.process(sessionsafepoolable);
        if (obj == null)
        {
            discard(sessionsafepoolable);
            return null;
        } else
        {
            return new SessionData(obj, sessionsafepoolable.getSessionData());
        }
    }

    public final volatile void discard(Object obj)
    {
        discard((SessionSafePoolable)obj);
    }

    public final volatile boolean isProcessingNeeded(Object obj)
    {
        return isProcessingNeeded((SessionSafePoolable)obj);
    }

    public final volatile Object process(Object obj)
    {
        return process((SessionSafePoolable)obj);
    }

    public final void shutdown()
    {
        internalProcessor.shutdown();
    }
}
