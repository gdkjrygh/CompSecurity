// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.commerce.ocr.kyc.fragments;

import android.content.pm.PackageManager;
import android.os.Bundle;
import com.google.android.libraries.commerce.ocr.pub.ContinuousPictureFocusModePrerequisiteChecker;
import com.google.android.libraries.commerce.ocr.pub.FeaturePrerequisiteCheckerUtil;

public final class KycOcrBundleModule
{

    public static boolean allowSkipCapture(Bundle bundle)
    {
        return bundle.getBoolean("KYC_ALLOW_SKIP", true);
    }

    public static boolean captureBothSides(Bundle bundle)
    {
        return bundle.getBoolean("KYC_TWO_SIDES", false);
    }

    public static float provideEdgeFinderWidthToOuterBoundingBoxEdgeLengthRatio(Bundle bundle)
    {
        return bundle.getFloat("EDGE_FINDER_WIDTH_TO_OUTER_BOUNDING_BOX_EDGE_LENGTH_RATIO", 0.08F);
    }

    public static boolean provideEnableAttemptContinuousPictureFocusMode(Bundle bundle, PackageManager packagemanager)
    {
        bundle = bundle.getString("CONTINUOUS_PICTURE_FOCUS_MODE_MODEL_BLACKLIST", "");
        return (new ContinuousPictureFocusModePrerequisiteChecker(new FeaturePrerequisiteCheckerUtil(packagemanager), bundle)).check();
    }

    public static int provideMinPerformOcrIntervalInMs(Bundle bundle)
    {
        return bundle.getInt("MIN_PERFORM_LOYALTY_CARD_OCR_INTERVAL_IN_MS", 90);
    }

    public static boolean showManualCaptureButton(Bundle bundle)
    {
        return bundle.getBoolean("KYC_MANUAL_IMAGE_CAPTURE", true);
    }
}
