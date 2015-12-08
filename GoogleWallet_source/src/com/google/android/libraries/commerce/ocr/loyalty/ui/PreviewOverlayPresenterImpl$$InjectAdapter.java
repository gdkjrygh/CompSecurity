// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.commerce.ocr.loyalty.ui;

import android.os.Handler;
import android.os.Vibrator;
import android.view.View;
import android.widget.TextView;
import com.google.android.libraries.commerce.ocr.capture.CameraManager;
import com.google.android.libraries.commerce.ocr.capture.ImageUtil;
import dagger.internal.Binding;
import dagger.internal.Linker;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package com.google.android.libraries.commerce.ocr.loyalty.ui:
//            PreviewOverlayPresenterImpl

public final class  extends Binding
    implements Provider
{

    private Binding cameraManager;
    private Binding imageUtil;
    private Binding messageTextView;
    private Binding progressOverlayView;
    private Binding saveOcrImage;
    private Binding uiHandler;
    private Binding vibrator;

    public final void attach(Linker linker)
    {
        cameraManager = linker.requestBinding("com.google.android.libraries.commerce.ocr.capture.CameraManager", com/google/android/libraries/commerce/ocr/loyalty/ui/PreviewOverlayPresenterImpl, getClass().getClassLoader());
        vibrator = linker.requestBinding("android.os.Vibrator", com/google/android/libraries/commerce/ocr/loyalty/ui/PreviewOverlayPresenterImpl, getClass().getClassLoader());
        uiHandler = linker.requestBinding("android.os.Handler", com/google/android/libraries/commerce/ocr/loyalty/ui/PreviewOverlayPresenterImpl, getClass().getClassLoader());
        progressOverlayView = linker.requestBinding("@com.google.android.libraries.commerce.ocr.annotations.ViewGroupAnnotations$ProgressOverlayView()/android.view.View", com/google/android/libraries/commerce/ocr/loyalty/ui/PreviewOverlayPresenterImpl, getClass().getClassLoader());
        messageTextView = linker.requestBinding("@com.google.android.libraries.commerce.ocr.annotations.ViewGroupAnnotations$PreviewOverlayTextView()/android.widget.TextView", com/google/android/libraries/commerce/ocr/loyalty/ui/PreviewOverlayPresenterImpl, getClass().getClassLoader());
        imageUtil = linker.requestBinding("com.google.android.libraries.commerce.ocr.capture.ImageUtil", com/google/android/libraries/commerce/ocr/loyalty/ui/PreviewOverlayPresenterImpl, getClass().getClassLoader());
        saveOcrImage = linker.requestBinding("@com.google.android.libraries.commerce.ocr.annotations.IntentAnnotations$SaveOcrImage()/java.lang.Boolean", com/google/android/libraries/commerce/ocr/loyalty/ui/PreviewOverlayPresenterImpl, getClass().getClassLoader());
    }

    public final PreviewOverlayPresenterImpl get()
    {
        return new PreviewOverlayPresenterImpl((CameraManager)cameraManager.get(), (Vibrator)vibrator.get(), (Handler)uiHandler.get(), (View)progressOverlayView.get(), (TextView)messageTextView.get(), (ImageUtil)imageUtil.get(), ((Boolean)saveOcrImage.get()).booleanValue());
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set.add(cameraManager);
        set.add(vibrator);
        set.add(uiHandler);
        set.add(progressOverlayView);
        set.add(messageTextView);
        set.add(imageUtil);
        set.add(saveOcrImage);
    }

    public ()
    {
        super("com.google.android.libraries.commerce.ocr.loyalty.ui.PreviewOverlayPresenterImpl", "members/com.google.android.libraries.commerce.ocr.loyalty.ui.PreviewOverlayPresenterImpl", true, com/google/android/libraries/commerce/ocr/loyalty/ui/PreviewOverlayPresenterImpl);
    }
}
