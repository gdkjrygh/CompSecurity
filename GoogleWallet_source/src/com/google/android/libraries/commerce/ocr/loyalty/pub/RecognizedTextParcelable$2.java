// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.commerce.ocr.loyalty.pub;

import com.google.common.base.Function;

// Referenced classes of package com.google.android.libraries.commerce.ocr.loyalty.pub:
//            RecognizedTextParcelable

final class 
    implements Function
{

    private static RecognizedTextParcelable apply(com.google.commerce.ocr.definitions.ext ext)
    {
        return new RecognizedTextParcelable(ext);
    }

    public final volatile Object apply(Object obj)
    {
        return apply((com.google.commerce.ocr.definitions.ext)obj);
    }

    ()
    {
    }
}
