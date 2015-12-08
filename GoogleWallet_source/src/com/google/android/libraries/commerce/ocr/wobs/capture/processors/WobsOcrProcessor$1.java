// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.commerce.ocr.wobs.capture.processors;

import com.google.android.libraries.commerce.ocr.loyalty.pub.RecognizedWobInstanceParcelable;
import com.google.common.base.Function;

// Referenced classes of package com.google.android.libraries.commerce.ocr.wobs.capture.processors:
//            WobsOcrProcessor

final class this._cls0
    implements Function
{

    final WobsOcrProcessor this$0;

    private static RecognizedWobInstanceParcelable apply(com.google.commerce.ocr.definitions.dInstance dinstance)
    {
        return new RecognizedWobInstanceParcelable(dinstance);
    }

    public final volatile Object apply(Object obj)
    {
        return apply((com.google.commerce.ocr.definitions.dInstance)obj);
    }

    ()
    {
        this$0 = WobsOcrProcessor.this;
        super();
    }
}
