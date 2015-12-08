// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.commerce.ocr.loyalty.fragments;

import android.os.Handler;
import com.google.android.libraries.commerce.ocr.capture.CameraManager;
import com.google.android.libraries.commerce.ocr.loyalty.debug.InstrumentationSupervisor;
import dagger.internal.Binding;
import dagger.internal.Linker;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package com.google.android.libraries.commerce.ocr.loyalty.fragments:
//            OcrStateManager, OcrCaptureListener

public final class  extends Binding
    implements Provider
{

    private Binding cameraManager;
    private Binding instrumentationSupervisor;
    private Binding listener;
    private Binding uiHandler;

    public final void attach(Linker linker)
    {
        listener = linker.requestBinding("com.google.android.libraries.commerce.ocr.loyalty.fragments.OcrCaptureListener", com/google/android/libraries/commerce/ocr/loyalty/fragments/OcrStateManager, getClass().getClassLoader());
        cameraManager = linker.requestBinding("com.google.android.libraries.commerce.ocr.capture.CameraManager", com/google/android/libraries/commerce/ocr/loyalty/fragments/OcrStateManager, getClass().getClassLoader());
        instrumentationSupervisor = linker.requestBinding("com.google.android.libraries.commerce.ocr.loyalty.debug.InstrumentationSupervisor", com/google/android/libraries/commerce/ocr/loyalty/fragments/OcrStateManager, getClass().getClassLoader());
        uiHandler = linker.requestBinding("android.os.Handler", com/google/android/libraries/commerce/ocr/loyalty/fragments/OcrStateManager, getClass().getClassLoader());
    }

    public final OcrStateManager get()
    {
        return new OcrStateManager((OcrCaptureListener)listener.get(), (CameraManager)cameraManager.get(), (InstrumentationSupervisor)instrumentationSupervisor.get(), (Handler)uiHandler.get());
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set.add(listener);
        set.add(cameraManager);
        set.add(instrumentationSupervisor);
        set.add(uiHandler);
    }

    public ()
    {
        super("com.google.android.libraries.commerce.ocr.loyalty.fragments.OcrStateManager", "members/com.google.android.libraries.commerce.ocr.loyalty.fragments.OcrStateManager", true, com/google/android/libraries/commerce/ocr/loyalty/fragments/OcrStateManager);
    }
}
