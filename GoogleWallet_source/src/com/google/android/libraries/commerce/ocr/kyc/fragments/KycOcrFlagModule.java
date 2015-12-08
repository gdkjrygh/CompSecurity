// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.commerce.ocr.kyc.fragments;

import android.graphics.Point;

public final class KycOcrFlagModule
{

    public static int provideJpegCompressionRate()
    {
        return 90;
    }

    public static long providePauseCaptureFadeAnimationDurationInMs()
    {
        return 300L;
    }

    public static long provideRestartCaptureFadeAnimationDurationInMs()
    {
        return 300L;
    }

    public static Point provideTargetPictureSize()
    {
        return new Point(1920, 1080);
    }

    public static Point provideTargetPreviewSize()
    {
        return new Point(1280, 720);
    }
}
