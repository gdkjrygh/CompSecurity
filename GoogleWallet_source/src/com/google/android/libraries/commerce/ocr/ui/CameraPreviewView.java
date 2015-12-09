// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.commerce.ocr.ui;

import android.graphics.Point;
import android.graphics.Rect;
import android.view.View;

public interface CameraPreviewView
{
    public static interface OnErrorCallback
    {

        public abstract void onError();
    }

    public static interface OnPreviewLayoutFinalizedCallback
    {

        public abstract void onFinalized(Rect rect, Point point);
    }

    public static interface Presenter
        extends android.view.SurfaceHolder.Callback
    {

        public abstract void enableImageProcessing();

        public abstract void onPreviewLayoutFinalized(Rect rect, Point point);

        public abstract void setOnErrorCallback(OnErrorCallback onerrorcallback);

        public abstract void setOnPreviewLayoutFinalizedCallback(OnPreviewLayoutFinalizedCallback onpreviewlayoutfinalizedcallback);

        public abstract void setOnPreviewReadyCallback(com.google.android.libraries.commerce.ocr.capture.CameraManager.OnFinishCallback onfinishcallback);

        public abstract void setView(CameraPreviewView camerapreviewview);
    }


    public abstract void setPreviewPadding(int i, int j);

    public abstract View toView();
}
