// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.commerce.ocr.ui;


// Referenced classes of package com.google.android.libraries.commerce.ocr.ui:
//            CameraPreviewView, PreviewOverlayView

public interface OcrView
{
    public static interface Presenter
    {

        public abstract void showErrorMessage(int i);
    }


    public abstract CameraPreviewView getCameraPreviewView();

    public abstract PreviewOverlayView getPreviewOverlayView();

    public abstract void showErrorMessage(int i);
}
