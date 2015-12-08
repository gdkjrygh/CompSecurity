// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.commerce.ocr.ext.wallet.loyalty.converters;

import dagger.internal.Binding;
import javax.inject.Provider;

// Referenced classes of package com.google.android.libraries.commerce.ocr.ext.wallet.loyalty.converters:
//            DebugRequestInfoConverter

public final class  extends Binding
    implements Provider
{

    public final DebugRequestInfoConverter get()
    {
        return new DebugRequestInfoConverter();
    }

    public final volatile Object get()
    {
        return get();
    }

    public ()
    {
        super("com.google.android.libraries.commerce.ocr.ext.wallet.loyalty.converters.DebugRequestInfoConverter", "members/com.google.android.libraries.commerce.ocr.ext.wallet.loyalty.converters.DebugRequestInfoConverter", true, com/google/android/libraries/commerce/ocr/ext/wallet/loyalty/converters/DebugRequestInfoConverter);
    }
}
