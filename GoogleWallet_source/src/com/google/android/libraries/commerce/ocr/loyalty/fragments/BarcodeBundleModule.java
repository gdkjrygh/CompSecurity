// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.commerce.ocr.loyalty.fragments;

import android.graphics.Point;
import android.os.Bundle;

public class BarcodeBundleModule
{

    private final Bundle bundle;

    public BarcodeBundleModule(Bundle bundle1)
    {
        Bundle bundle2 = bundle1;
        if (bundle1 == null)
        {
            bundle2 = new Bundle();
        }
        bundle = bundle2;
    }

    static boolean provideKillFrameProcessorsOnSurfaceDestroy()
    {
        return true;
    }

    static Point provideTargetPictureSize()
    {
        return null;
    }

    static Point provideTargetPreviewSize()
    {
        return new Point(1280, 720);
    }

    final String provideContinuousPictureFocusModeBlacklist()
    {
        return bundle.getString("CONTINUOUS_PICTURE_FOCUS_MODE_MODEL_BLACKLIST", "");
    }

    final float provideEdgeFinderWidthToOuterBoundingBoxEdgeLengthRatio()
    {
        return bundle.getFloat("EDGE_FINDER_WIDTH_TO_OUTER_BOUNDING_BOX_EDGE_LENGTH_RATIO", 0.05F);
    }

    final int provideImageCompressionRate()
    {
        return bundle.getInt("DEBUG_IMAGE_COMPRESSION_RATE", 90);
    }

    final int provideMinPerformOcrIntervalInMs()
    {
        return bundle.getInt("MIN_PERFORM_LOYALTY_CARD_OCR_INTERVAL_IN_MS", 500);
    }

    final boolean provideSaveOcrImage()
    {
        return bundle.getBoolean("DEBUG_SAVE_OCR_IMAGE", false);
    }
}
