// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.commerce.ocr.loyalty.debug;

import dagger.internal.Binding;
import javax.inject.Provider;

// Referenced classes of package com.google.android.libraries.commerce.ocr.loyalty.debug:
//            InstrumentationSupervisor

public final class  extends Binding
    implements Provider
{

    public final InstrumentationSupervisor get()
    {
        return new InstrumentationSupervisor();
    }

    public final volatile Object get()
    {
        return get();
    }

    public ()
    {
        super("com.google.android.libraries.commerce.ocr.loyalty.debug.InstrumentationSupervisor", "members/com.google.android.libraries.commerce.ocr.loyalty.debug.InstrumentationSupervisor", true, com/google/android/libraries/commerce/ocr/loyalty/debug/InstrumentationSupervisor);
    }
}
