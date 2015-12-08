// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.commerce.ocr.ext.wallet.loyalty.converters;

import dagger.internal.Binding;
import javax.inject.Provider;

// Referenced classes of package com.google.android.libraries.commerce.ocr.ext.wallet.loyalty.converters:
//            AttributionConverter

public final class q extends Binding
    implements Provider
{

    public final AttributionConverter get()
    {
        return new AttributionConverter();
    }

    public final volatile Object get()
    {
        return get();
    }

    public q()
    {
        super("com.google.android.libraries.commerce.ocr.ext.wallet.loyalty.converters.AttributionConverter", "members/com.google.android.libraries.commerce.ocr.ext.wallet.loyalty.converters.AttributionConverter", true, com/google/android/libraries/commerce/ocr/ext/wallet/loyalty/converters/AttributionConverter);
    }
}
