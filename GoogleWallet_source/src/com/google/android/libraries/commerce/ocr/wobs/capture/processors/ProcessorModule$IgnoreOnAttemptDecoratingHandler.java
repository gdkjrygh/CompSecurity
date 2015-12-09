// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.commerce.ocr.wobs.capture.processors;

import com.google.android.libraries.commerce.ocr.capture.DecoratingOcrHandler;

// Referenced classes of package com.google.android.libraries.commerce.ocr.wobs.capture.processors:
//            ProcessorModule

static final class  extends DecoratingOcrHandler
{

    public static  create(com.google.android.libraries.commerce.ocr.capture.coratingHandler coratinghandler)
    {
        return new <init>(coratinghandler);
    }

    public final boolean onOcrAttempt()
    {
        return true;
    }

    private (com.google.android.libraries.commerce.ocr.capture.coratingHandler coratinghandler)
    {
        super(coratinghandler);
    }
}
