// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.commerce.ocr.wobs.fragments;

import android.graphics.Point;

public final class WobsOcrFlagModule
{

    public static int provideJpegCompressionRate()
    {
        return 90;
    }

    public static long providePauseCaptureBeforeFlipTimeInMs()
    {
        return 2000L;
    }

    public static long providePauseCaptureBeforePreviewTimeInMs()
    {
        return 1000L;
    }

    public static long providePauseCaptureFadeAnimationDurationInMs()
    {
        return 500L;
    }

    public static long provideRestartCaptureFadeAnimationDurationInMs()
    {
        return 1500L;
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
