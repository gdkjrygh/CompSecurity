// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.commerce.ocr.capture.processors;

import com.google.android.libraries.commerce.ocr.cv.SafePoolable;
import javax.inject.Provider;

// Referenced classes of package com.google.android.libraries.commerce.ocr.capture.processors:
//            Processor, SessionSafePoolable

public final class SessionProcessor
    implements Processor
{

    private final Provider sessionProvider;

    public SessionProcessor(Provider provider)
    {
        sessionProvider = provider;
    }

    private static void discard(SafePoolable safepoolable)
    {
        safepoolable.recycle();
    }

    private static boolean isProcessingNeeded(SafePoolable safepoolable)
    {
        return true;
    }

    private SessionSafePoolable process(SafePoolable safepoolable)
    {
        return new SessionSafePoolable(safepoolable, sessionProvider.get());
    }

    public final volatile void discard(Object obj)
    {
        discard((SafePoolable)obj);
    }

    public final volatile boolean isProcessingNeeded(Object obj)
    {
        return isProcessingNeeded((SafePoolable)obj);
    }

    public final volatile Object process(Object obj)
    {
        return process((SafePoolable)obj);
    }

    public final void shutdown()
    {
    }
}
