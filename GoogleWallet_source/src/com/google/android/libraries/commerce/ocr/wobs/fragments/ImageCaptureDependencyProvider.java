// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.commerce.ocr.wobs.fragments;

import com.google.android.libraries.commerce.ocr.capture.CameraManager;

public interface ImageCaptureDependencyProvider
{

    public abstract CameraManager provideCameraManager();

    public abstract com.google.android.libraries.commerce.ocr.capture.OcrRecognizer.OcrResponseHandler provideWobsOcrResponseHandler();
}
