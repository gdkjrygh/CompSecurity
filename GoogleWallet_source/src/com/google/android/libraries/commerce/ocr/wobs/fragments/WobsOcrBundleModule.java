// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.commerce.ocr.wobs.fragments;

import android.content.pm.PackageManager;
import android.os.Bundle;
import com.google.android.libraries.commerce.ocr.pub.ContinuousPictureFocusModePrerequisiteChecker;
import com.google.android.libraries.commerce.ocr.pub.FeaturePrerequisiteCheckerUtil;
import com.google.android.libraries.commerce.ocr.wobs.pub.AutoSnapPrerequisiteChecker;

public final class WobsOcrBundleModule
{

    public static float provideEdgeFinderWidthToOuterBoundingBoxEdgeLengthRatio(Bundle bundle)
    {
        return bundle.getFloat("EDGE_FINDER_WIDTH_TO_OUTER_BOUNDING_BOX_EDGE_LENGTH_RATIO", 0.08F);
    }

    public static boolean provideEnableAttemptContinuousPictureFocusMode(Bundle bundle, PackageManager packagemanager)
    {
        bundle = bundle.getString("CONTINUOUS_PICTURE_FOCUS_MODE_MODEL_BLACKLIST", "");
        return (new ContinuousPictureFocusModePrerequisiteChecker(new FeaturePrerequisiteCheckerUtil(packagemanager), bundle)).check();
    }

    public static boolean provideEnableAutoSnap(Bundle bundle, PackageManager packagemanager)
    {
        bundle = bundle.getString("AUTO_SNAP_MODEL_BLACKLIST", "");
        return (new AutoSnapPrerequisiteChecker(new FeaturePrerequisiteCheckerUtil(packagemanager), bundle)).check();
    }

    public static com.google.android.libraries.commerce.ocr.wobs.capture.WobsActionDecoratingResponseHandler.OcrAttemptAction provideInitialOcrAttemptAction(Bundle bundle)
    {
        switch (provideUserAddedImageMode(bundle))
        {
        default:
            return com.google.android.libraries.commerce.ocr.wobs.capture.WobsActionDecoratingResponseHandler.OcrAttemptAction.PAUSE_CAPTURE_AND_FLIP_SIDE;

        case 0: // '\0'
        case 1: // '\001'
            return com.google.android.libraries.commerce.ocr.wobs.capture.WobsActionDecoratingResponseHandler.OcrAttemptAction.FINISH_CAPTURE_AND_EXIT;
        }
    }

    public static com.google.android.libraries.commerce.ocr.wobs.pub.OcrImageHolder.Side provideInitialSide(Bundle bundle)
    {
        switch (provideUserAddedImageMode(bundle))
        {
        default:
            return com.google.android.libraries.commerce.ocr.wobs.pub.OcrImageHolder.Side.BACK;

        case 1: // '\001'
            return com.google.android.libraries.commerce.ocr.wobs.pub.OcrImageHolder.Side.FRONT;
        }
    }

    public static int provideMinPerformWobsOcrIntervalInMs(Bundle bundle)
    {
        return bundle.getInt("MIN_PERFORM_LOYALTY_CARD_OCR_INTERVAL_IN_MS", 90);
    }

    private static int provideUserAddedImageMode(Bundle bundle)
    {
        return bundle.getInt("USER_ADDED_IMAGE_MODE", 3);
    }

    public static com.google.commerce.ocr.definitions.WireProto.WobType provideWobType(Bundle bundle)
    {
        return com.google.commerce.ocr.definitions.WireProto.WobType.valueOf(bundle.getInt("WOB_TYPE", 2));
    }
}
