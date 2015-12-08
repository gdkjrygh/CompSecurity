// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.commerce.ocr.ui;

import android.graphics.Rect;
import android.view.View;

public interface PreviewOverlayView
{
    public static interface Presenter
    {

        public abstract void onPreviewLayoutFinalized(Rect rect, Rect rect1);

        public abstract void setView(PreviewOverlayView previewoverlayview);

        public abstract void snapAndPerformOcr();
    }


    public abstract void showBoundingBox(Rect rect);

    public abstract View toView();
}
