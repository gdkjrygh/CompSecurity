// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.commerce.ocr.ext.wallet.loyalty.converters;

import dagger.internal.Binding;
import dagger.internal.Linker;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package com.google.android.libraries.commerce.ocr.ext.wallet.loyalty.converters:
//            WobsOcrRequestConverter, DebugRequestInfoConverter

public final class  extends Binding
    implements Provider
{

    private Binding debugRequestInfoConverter;

    public final void attach(Linker linker)
    {
        debugRequestInfoConverter = linker.requestBinding("com.google.android.libraries.commerce.ocr.ext.wallet.loyalty.converters.DebugRequestInfoConverter", com/google/android/libraries/commerce/ocr/ext/wallet/loyalty/converters/WobsOcrRequestConverter, getClass().getClassLoader());
    }

    public final WobsOcrRequestConverter get()
    {
        return new WobsOcrRequestConverter((DebugRequestInfoConverter)debugRequestInfoConverter.get());
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set.add(debugRequestInfoConverter);
    }

    public ()
    {
        super("com.google.android.libraries.commerce.ocr.ext.wallet.loyalty.converters.WobsOcrRequestConverter", "members/com.google.android.libraries.commerce.ocr.ext.wallet.loyalty.converters.WobsOcrRequestConverter", true, com/google/android/libraries/commerce/ocr/ext/wallet/loyalty/converters/WobsOcrRequestConverter);
    }
}
