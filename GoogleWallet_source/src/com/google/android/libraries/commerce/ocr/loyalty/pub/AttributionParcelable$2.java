// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.commerce.ocr.loyalty.pub;

import com.google.common.base.Function;

// Referenced classes of package com.google.android.libraries.commerce.ocr.loyalty.pub:
//            AttributionParcelable

final class 
    implements Function
{

    private static AttributionParcelable apply(com.google.commerce.ocr.definitions.ion ion)
    {
        return new AttributionParcelable(ion);
    }

    public final volatile Object apply(Object obj)
    {
        return apply((com.google.commerce.ocr.definitions.ion)obj);
    }

    ()
    {
    }
}
