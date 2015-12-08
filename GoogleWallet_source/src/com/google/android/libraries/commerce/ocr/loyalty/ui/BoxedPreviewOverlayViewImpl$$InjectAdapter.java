// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.commerce.ocr.loyalty.ui;

import android.content.Context;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import com.google.android.libraries.commerce.ocr.ui.OcrRegionOfInterestProvider;
import com.google.android.libraries.commerce.ocr.ui.UserSkipHandler;
import dagger.internal.Binding;
import dagger.internal.Linker;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package com.google.android.libraries.commerce.ocr.loyalty.ui:
//            BoxedPreviewOverlayViewImpl

public final class  extends Binding
    implements Provider
{

    private Binding captureFrameButton;
    private Binding context;
    private Binding messageTextView;
    private Binding presenter;
    private Binding previewOverlayView;
    private Binding roiProvider;
    private Binding skipScanButton;
    private Binding uiHandler;
    private Binding userSkipHandler;

    public final void attach(Linker linker)
    {
        context = linker.requestBinding("android.content.Context", com/google/android/libraries/commerce/ocr/loyalty/ui/BoxedPreviewOverlayViewImpl, getClass().getClassLoader());
        previewOverlayView = linker.requestBinding("@com.google.android.libraries.commerce.ocr.annotations.ViewGroupAnnotations$PreviewOverlayView()/android.view.View", com/google/android/libraries/commerce/ocr/loyalty/ui/BoxedPreviewOverlayViewImpl, getClass().getClassLoader());
        messageTextView = linker.requestBinding("@com.google.android.libraries.commerce.ocr.annotations.ViewGroupAnnotations$PreviewOverlayTextView()/android.widget.TextView", com/google/android/libraries/commerce/ocr/loyalty/ui/BoxedPreviewOverlayViewImpl, getClass().getClassLoader());
        presenter = linker.requestBinding("com.google.android.libraries.commerce.ocr.ui.PreviewOverlayView$Presenter<com.google.android.libraries.commerce.ocr.ui.PreviewOverlayView>", com/google/android/libraries/commerce/ocr/loyalty/ui/BoxedPreviewOverlayViewImpl, getClass().getClassLoader());
        userSkipHandler = linker.requestBinding("com.google.android.libraries.commerce.ocr.ui.UserSkipHandler", com/google/android/libraries/commerce/ocr/loyalty/ui/BoxedPreviewOverlayViewImpl, getClass().getClassLoader());
        roiProvider = linker.requestBinding("com.google.android.libraries.commerce.ocr.ui.OcrRegionOfInterestProvider", com/google/android/libraries/commerce/ocr/loyalty/ui/BoxedPreviewOverlayViewImpl, getClass().getClassLoader());
        captureFrameButton = linker.requestBinding("@com.google.android.libraries.commerce.ocr.annotations.ViewGroupAnnotations$CaptureFrameButton()/android.widget.Button", com/google/android/libraries/commerce/ocr/loyalty/ui/BoxedPreviewOverlayViewImpl, getClass().getClassLoader());
        skipScanButton = linker.requestBinding("@com.google.android.libraries.commerce.ocr.annotations.ViewGroupAnnotations$SkipScanButton()/android.widget.Button", com/google/android/libraries/commerce/ocr/loyalty/ui/BoxedPreviewOverlayViewImpl, getClass().getClassLoader());
        uiHandler = linker.requestBinding("android.os.Handler", com/google/android/libraries/commerce/ocr/loyalty/ui/BoxedPreviewOverlayViewImpl, getClass().getClassLoader());
    }

    public final BoxedPreviewOverlayViewImpl get()
    {
        return new BoxedPreviewOverlayViewImpl((Context)context.get(), (View)previewOverlayView.get(), (TextView)messageTextView.get(), (com.google.android.libraries.commerce.ocr.ui.Adapter.messageTextView)presenter.get(), (UserSkipHandler)userSkipHandler.get(), (OcrRegionOfInterestProvider)roiProvider.get(), (Button)captureFrameButton.get(), (Button)skipScanButton.get(), (Handler)uiHandler.get());
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set.add(context);
        set.add(previewOverlayView);
        set.add(messageTextView);
        set.add(presenter);
        set.add(userSkipHandler);
        set.add(roiProvider);
        set.add(captureFrameButton);
        set.add(skipScanButton);
        set.add(uiHandler);
    }

    public ()
    {
        super("com.google.android.libraries.commerce.ocr.loyalty.ui.BoxedPreviewOverlayViewImpl", "members/com.google.android.libraries.commerce.ocr.loyalty.ui.BoxedPreviewOverlayViewImpl", false, com/google/android/libraries/commerce/ocr/loyalty/ui/BoxedPreviewOverlayViewImpl);
    }
}
