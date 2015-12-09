// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.commerce.ocr.loyalty.fragments;

import dagger.internal.Binding;
import dagger.internal.Linker;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package com.google.android.libraries.commerce.ocr.loyalty.fragments:
//            CameraFailureHandler, OcrStateManager

public final class  extends Binding
    implements Provider
{

    private Binding stateManager;

    public final void attach(Linker linker)
    {
        stateManager = linker.requestBinding("com.google.android.libraries.commerce.ocr.loyalty.fragments.OcrStateManager", com/google/android/libraries/commerce/ocr/loyalty/fragments/CameraFailureHandler, getClass().getClassLoader());
    }

    public final CameraFailureHandler get()
    {
        return new CameraFailureHandler((OcrStateManager)stateManager.get());
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set.add(stateManager);
    }

    public ()
    {
        super("com.google.android.libraries.commerce.ocr.loyalty.fragments.CameraFailureHandler", "members/com.google.android.libraries.commerce.ocr.loyalty.fragments.CameraFailureHandler", false, com/google/android/libraries/commerce/ocr/loyalty/fragments/CameraFailureHandler);
    }
}
