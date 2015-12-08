// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.camera;


public final class TakeSnapButtonTouchIntent
{
    public static final class MediaCaptureType extends Enum
    {

        private static final MediaCaptureType $VALUES[];
        public static final MediaCaptureType PHOTO;
        public static final MediaCaptureType UNKNOWN;
        public static final MediaCaptureType VIDEO;

        public static MediaCaptureType valueOf(String s)
        {
            return (MediaCaptureType)Enum.valueOf(com/snapchat/android/camera/TakeSnapButtonTouchIntent$MediaCaptureType, s);
        }

        public static MediaCaptureType[] values()
        {
            return (MediaCaptureType[])$VALUES.clone();
        }

        static 
        {
            UNKNOWN = new MediaCaptureType("UNKNOWN", 0);
            PHOTO = new MediaCaptureType("PHOTO", 1);
            VIDEO = new MediaCaptureType("VIDEO", 2);
            $VALUES = (new MediaCaptureType[] {
                UNKNOWN, PHOTO, VIDEO
            });
        }

        private MediaCaptureType(String s, int i)
        {
            super(s, i);
        }
    }


    MediaCaptureType a;

    public TakeSnapButtonTouchIntent()
    {
        a = MediaCaptureType.UNKNOWN;
    }
}
