// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.util.eventbus;


public final class ChangePreviewQualityEvent
{
    public static final class PreviewQuality extends Enum
    {

        private static final PreviewQuality $VALUES[];
        public static final PreviewQuality HIGH;
        public static final PreviewQuality LOW;

        public static PreviewQuality valueOf(String s)
        {
            return (PreviewQuality)Enum.valueOf(com/snapchat/android/util/eventbus/ChangePreviewQualityEvent$PreviewQuality, s);
        }

        public static PreviewQuality[] values()
        {
            return (PreviewQuality[])$VALUES.clone();
        }

        static 
        {
            LOW = new PreviewQuality("LOW", 0);
            HIGH = new PreviewQuality("HIGH", 1);
            $VALUES = (new PreviewQuality[] {
                LOW, HIGH
            });
        }

        private PreviewQuality(String s, int i)
        {
            super(s, i);
        }
    }


    public final com.snapchat.android.camera.model.CameraModel.CameraType cameraType;
    public final PreviewQuality previewQuality;

    public ChangePreviewQualityEvent(PreviewQuality previewquality)
    {
        previewQuality = previewquality;
        cameraType = null;
    }

    public ChangePreviewQualityEvent(PreviewQuality previewquality, com.snapchat.android.camera.model.CameraModel.CameraType cameratype)
    {
        previewQuality = previewquality;
        cameraType = cameratype;
    }
}
