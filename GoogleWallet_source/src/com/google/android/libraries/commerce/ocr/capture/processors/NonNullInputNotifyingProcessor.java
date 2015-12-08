// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.commerce.ocr.capture.processors;


// Referenced classes of package com.google.android.libraries.commerce.ocr.capture.processors:
//            AbstractProcessor

public abstract class NonNullInputNotifyingProcessor extends AbstractProcessor
{

    public NonNullInputNotifyingProcessor()
    {
    }

    public abstract void onNonNullInput(Object obj);

    public final Object process(Object obj)
    {
        if (obj != null)
        {
            onNonNullInput(obj);
        }
        return obj;
    }
}
