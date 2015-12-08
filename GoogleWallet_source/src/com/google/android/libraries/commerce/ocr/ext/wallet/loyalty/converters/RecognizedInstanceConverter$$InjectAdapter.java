// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.commerce.ocr.ext.wallet.loyalty.converters;

import dagger.internal.Binding;
import dagger.internal.Linker;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package com.google.android.libraries.commerce.ocr.ext.wallet.loyalty.converters:
//            RecognizedInstanceConverter, RecognizedTextConverter, RecognizedBarcodeConverter, AttributionConverter

public final class  extends Binding
    implements Provider
{

    private Binding attributionConverter;
    private Binding recognizedBarcodeConverter;
    private Binding recognizedTextConverter;

    public final void attach(Linker linker)
    {
        recognizedTextConverter = linker.requestBinding("com.google.android.libraries.commerce.ocr.ext.wallet.loyalty.converters.RecognizedTextConverter", com/google/android/libraries/commerce/ocr/ext/wallet/loyalty/converters/RecognizedInstanceConverter, getClass().getClassLoader());
        recognizedBarcodeConverter = linker.requestBinding("com.google.android.libraries.commerce.ocr.ext.wallet.loyalty.converters.RecognizedBarcodeConverter", com/google/android/libraries/commerce/ocr/ext/wallet/loyalty/converters/RecognizedInstanceConverter, getClass().getClassLoader());
        attributionConverter = linker.requestBinding("com.google.android.libraries.commerce.ocr.ext.wallet.loyalty.converters.AttributionConverter", com/google/android/libraries/commerce/ocr/ext/wallet/loyalty/converters/RecognizedInstanceConverter, getClass().getClassLoader());
    }

    public final RecognizedInstanceConverter get()
    {
        return new RecognizedInstanceConverter((RecognizedTextConverter)recognizedTextConverter.get(), (RecognizedBarcodeConverter)recognizedBarcodeConverter.get(), (AttributionConverter)attributionConverter.get());
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set.add(recognizedTextConverter);
        set.add(recognizedBarcodeConverter);
        set.add(attributionConverter);
    }

    public ()
    {
        super("com.google.android.libraries.commerce.ocr.ext.wallet.loyalty.converters.RecognizedInstanceConverter", "members/com.google.android.libraries.commerce.ocr.ext.wallet.loyalty.converters.RecognizedInstanceConverter", true, com/google/android/libraries/commerce/ocr/ext/wallet/loyalty/converters/RecognizedInstanceConverter);
    }
}
