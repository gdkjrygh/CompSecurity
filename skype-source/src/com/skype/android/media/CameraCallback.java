// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.media;

import android.graphics.PointF;

public interface CameraCallback
{
    public static final class PictureType extends Enum
    {

        public static final PictureType a;
        public static final PictureType b;
        public static final PictureType c;
        private static final PictureType d[];

        public static PictureType valueOf(String s)
        {
            return (PictureType)Enum.valueOf(com/skype/android/media/CameraCallback$PictureType, s);
        }

        public static PictureType[] values()
        {
            return (PictureType[])d.clone();
        }

        static 
        {
            a = new PictureType("POST", 0);
            b = new PictureType("RAW", 1);
            c = new PictureType("JPEG", 2);
            d = (new PictureType[] {
                a, b, c
            });
        }

        private PictureType(String s, int i)
        {
            super(s, i);
        }
    }


    public abstract void onError(int i);

    public abstract void onFacesDetected(android.hardware.Camera.Face aface[]);

    public abstract void onFocusEnd(boolean flag);

    public abstract void onFocusStart(PointF pointf);

    public abstract void onOpenFailed(Exception exception);

    public abstract void onPictureTaken(PictureType picturetype, byte abyte0[]);

    public abstract void onPreviewStarted(int i);

    public abstract void onShutter();
}
