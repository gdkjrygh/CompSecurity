// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.commerce.ocr.ext.wallet.loyalty.converters;

import dagger.internal.Binding;
import dagger.internal.Linker;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package com.google.android.libraries.commerce.ocr.ext.wallet.loyalty.converters:
//            RecognizedTextConverter, AttributionConverter

public final class  extends Binding
    implements Provider
{

    private Binding attributionConverter;

    public final void attach(Linker linker)
    {
        attributionConverter = linker.requestBinding("com.google.android.libraries.commerce.ocr.ext.wallet.loyalty.converters.AttributionConverter", com/google/android/libraries/commerce/ocr/ext/wallet/loyalty/converters/RecognizedTextConverter, getClass().getClassLoader());
    }

    public final RecognizedTextConverter get()
    {
        return new RecognizedTextConverter((AttributionConverter)attributionConverter.get());
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set.add(attributionConverter);
    }

    public ()
    {
        super("com.google.android.libraries.commerce.ocr.ext.wallet.loyalty.converters.RecognizedTextConverter", "members/com.google.android.libraries.commerce.ocr.ext.wallet.loyalty.converters.RecognizedTextConverter", true, com/google/android/libraries/commerce/ocr/ext/wallet/loyalty/converters/RecognizedTextConverter);
    }
}
