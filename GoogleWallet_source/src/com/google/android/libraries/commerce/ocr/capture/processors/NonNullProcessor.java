// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.commerce.ocr.capture.processors;


// Referenced classes of package com.google.android.libraries.commerce.ocr.capture.processors:
//            AbstractProcessor

public abstract class NonNullProcessor extends AbstractProcessor
{

    public NonNullProcessor()
    {
    }

    public boolean isProcessingNeeded(Object obj)
    {
        return obj != null;
    }
}
