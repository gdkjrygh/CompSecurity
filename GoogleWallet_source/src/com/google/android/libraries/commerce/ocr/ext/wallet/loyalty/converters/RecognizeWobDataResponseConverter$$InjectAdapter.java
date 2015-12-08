// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.commerce.ocr.ext.wallet.loyalty.converters;

import dagger.internal.Binding;
import dagger.internal.Linker;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package com.google.android.libraries.commerce.ocr.ext.wallet.loyalty.converters:
//            RecognizeWobDataResponseConverter, RecognizedInstanceConverter

public final class  extends Binding
    implements Provider
{

    private Binding recognizedInstanceConverter;

    public final void attach(Linker linker)
    {
        recognizedInstanceConverter = linker.requestBinding("com.google.android.libraries.commerce.ocr.ext.wallet.loyalty.converters.RecognizedInstanceConverter", com/google/android/libraries/commerce/ocr/ext/wallet/loyalty/converters/RecognizeWobDataResponseConverter, getClass().getClassLoader());
    }

    public final RecognizeWobDataResponseConverter get()
    {
        return new RecognizeWobDataResponseConverter((RecognizedInstanceConverter)recognizedInstanceConverter.get());
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set.add(recognizedInstanceConverter);
    }

    public ()
    {
        super("com.google.android.libraries.commerce.ocr.ext.wallet.loyalty.converters.RecognizeWobDataResponseConverter", "members/com.google.android.libraries.commerce.ocr.ext.wallet.loyalty.converters.RecognizeWobDataResponseConverter", true, com/google/android/libraries/commerce/ocr/ext/wallet/loyalty/converters/RecognizeWobDataResponseConverter);
    }
}
