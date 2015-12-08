// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.commerce.ocr.kyc.fragments;

import com.google.android.libraries.commerce.ocr.capture.CameraManager;
import com.google.android.libraries.commerce.ocr.fragments.FragmentModule;

public interface KycDependencyProvider
{

    public abstract CameraManager provideBarcodeCameraManager();

    public abstract CameraManager provideCardCameraManager();

    public abstract FragmentModule provideFragmentModule();
}
