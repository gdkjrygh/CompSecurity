// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.unveil.sensors.proxies.camera;

import com.google.android.apps.unveil.env.Size;
import java.util.List;

public interface ParametersProxy
{

    public static final String FLASH_MODE_KEY = "flash-mode";
    public static final String FLASH_MODE_VALUES_KEY = "flash-mode-values";
    public static final String FOCUS_MODE_KEY = "focus-mode";
    public static final String FOCUS_MODE_VALUES_KEY = "focus-mode-values";
    public static final String JPEG_QUALITY_KEY = "jpeg-quality";
    public static final String PICTURE_SIZE_KEY = "picture-size";
    public static final String PICTURE_SIZE_VALUES_KEY = "picture-size-values";
    public static final String PREVIEW_FRAME_RATE_KEY = "preview-frame-rate";
    public static final String PREVIEW_SIZE_KEY = "preview-size";
    public static final String PREVIEW_SIZE_VALUES_KEY = "preview-size-values";

    public abstract String flatten();

    public abstract String get(String s);

    public abstract android.hardware.Camera.Parameters getActualParameters();

    public abstract int getInt(String s);

    public abstract int getMaxZoom();

    public abstract int getPictureFormat();

    public abstract Size getPictureSize();

    public abstract int getPreviewFormat();

    public abstract int getPreviewFrameRate();

    public abstract Size getPreviewSize();

    public abstract List getSupportedPictureSizes();

    public abstract List getSupportedPreviewSizes();

    public abstract boolean isSmoothZoomSupported();

    public abstract void remove(String s);

    public abstract void set(String s, int i);

    public abstract void set(String s, String s1);

    public abstract void setPictureFormat(int i);

    public abstract void setPictureSize(int i, int j);

    public abstract void setPreviewFormat(int i);

    public abstract void setPreviewFrameRate(int i);

    public abstract void setPreviewSize(int i, int j);

    public abstract void setRecordingHint(boolean flag);

    public abstract void unflatten(String s);
}
