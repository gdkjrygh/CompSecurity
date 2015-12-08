// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.commerce.ocr.loyalty.capture;

import com.google.android.libraries.commerce.ocr.loyalty.pub.RecognizedWobInstanceParcelable;
import com.google.common.base.Function;

// Referenced classes of package com.google.android.libraries.commerce.ocr.loyalty.capture:
//            SimpleWobsOcrRecognizer

final class e
    implements Function
{

    private static RecognizedWobInstanceParcelable apply(com.google.commerce.ocr.definitions.ce ce)
    {
        return new RecognizedWobInstanceParcelable(ce);
    }

    public final volatile Object apply(Object obj)
    {
        return apply((com.google.commerce.ocr.definitions.ce)obj);
    }

    e()
    {
    }
}
