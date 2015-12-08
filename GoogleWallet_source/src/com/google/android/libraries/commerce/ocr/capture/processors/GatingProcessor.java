// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.commerce.ocr.capture.processors;

import com.google.android.libraries.commerce.ocr.cv.SafePoolable;
import java.util.concurrent.atomic.AtomicBoolean;

// Referenced classes of package com.google.android.libraries.commerce.ocr.capture.processors:
//            Processor

public final class GatingProcessor
    implements Processor
{

    private final AtomicBoolean isAllowed = new AtomicBoolean();

    public GatingProcessor()
    {
        block();
    }

    public final void allow()
    {
        isAllowed.set(true);
    }

    public final void block()
    {
        isAllowed.set(false);
    }

    public final void discard(Object obj)
    {
        if (obj instanceof SafePoolable)
        {
            ((SafePoolable)obj).recycle();
        }
    }

    public final boolean isProcessingNeeded(Object obj)
    {
        return isAllowed.get();
    }

    public final Object process(Object obj)
    {
        if (isProcessingNeeded(obj))
        {
            return obj;
        } else
        {
            discard(obj);
            return null;
        }
    }

    public final void shutdown()
    {
        block();
    }
}
