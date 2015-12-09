// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.commerce.ocr.kyc.capture;

import android.content.res.Resources;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.view.WindowManager;
import com.google.android.libraries.commerce.ocr.capture.CameraManager;
import com.google.android.libraries.commerce.ocr.capture.CameraManagerImpl;
import com.google.android.libraries.commerce.ocr.capture.SizeSelectionStrategy;
import com.google.android.libraries.commerce.ocr.kyc.fragments.KycOcrFlagModule;
import com.google.android.libraries.commerce.ocr.util.ScreenManager;
import com.google.android.libraries.commerce.ocr.util.ShapeModifier;

public final class CaptureModule
{

    public static CameraManager provideBarcodeCameraManager(Fragment fragment, boolean flag)
    {
        return provideCameraManager(fragment, flag, provideBarcodeSizeSelectionStrategy());
    }

    public static SizeSelectionStrategy provideBarcodeSizeSelectionStrategy()
    {
        return SizeSelectionStrategy.LARGEST_POSSIBLE;
    }

    private static CameraManager provideCameraManager(Fragment fragment, boolean flag, SizeSelectionStrategy sizeselectionstrategy)
    {
        return provideCameraManager(new ScreenManager(fragment.getActivity().getResources().getConfiguration(), fragment.getActivity().getWindowManager().getDefaultDisplay()), flag, sizeselectionstrategy);
    }

    private static CameraManager provideCameraManager(ScreenManager screenmanager, boolean flag, SizeSelectionStrategy sizeselectionstrategy)
    {
        return new CameraManagerImpl(screenmanager, 0, new ShapeModifier(), KycOcrFlagModule.provideTargetPreviewSize(), KycOcrFlagModule.provideTargetPictureSize(), sizeselectionstrategy, flag);
    }

    public static CameraManager provideCardCameraManager(Fragment fragment, boolean flag)
    {
        return provideCameraManager(fragment, flag, provideCardSizeSelectionStrategy());
    }

    public static SizeSelectionStrategy provideCardSizeSelectionStrategy()
    {
        return SizeSelectionStrategy.RATIO_AND_HEIGHT;
    }
}
