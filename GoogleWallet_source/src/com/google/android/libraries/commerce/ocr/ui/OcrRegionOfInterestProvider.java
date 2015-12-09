// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.commerce.ocr.ui;

import android.graphics.Rect;

public interface OcrRegionOfInterestProvider
{

    public abstract Rect getBlurDetectorROI();

    public abstract Rect getBoundingBoxRect();

    public abstract Rect getBoundingBoxRectRelativeToCameraPreview();

    public abstract void onImageAreaChange(Rect rect);
}
