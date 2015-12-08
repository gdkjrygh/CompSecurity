// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.commerce.ocr.loyalty.fragments;


// Referenced classes of package com.google.android.libraries.commerce.ocr.loyalty.fragments:
//            BarcodeFragment, OcrCaptureListener, CameraFailureHandler

public class BarcodeModule
{

    private final BarcodeFragment fragment;

    public BarcodeModule(BarcodeFragment barcodefragment)
    {
        fragment = barcodefragment;
    }

    static com.google.android.libraries.commerce.ocr.ui.CameraPreviewView.OnErrorCallback provideCameraOnErrorCallback(CameraFailureHandler camerafailurehandler)
    {
        return camerafailurehandler;
    }

    final OcrCaptureListener provideOcrCaptureListener()
    {
        return (OcrCaptureListener)fragment.getActivity();
    }
}
