// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.commerce.ocr.capture.processors;


// Referenced classes of package com.google.android.libraries.commerce.ocr.capture.processors:
//            Processor

public abstract class AbstractProcessor
    implements Processor
{

    public AbstractProcessor()
    {
    }

    public void discard(Object obj)
    {
    }

    public boolean isProcessingNeeded(Object obj)
    {
        return true;
    }

    public void shutdown()
    {
    }
}
