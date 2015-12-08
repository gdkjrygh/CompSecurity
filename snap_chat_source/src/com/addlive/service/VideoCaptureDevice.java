// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.addlive.service;


public final class VideoCaptureDevice extends Enum
{

    private static final VideoCaptureDevice $VALUES[];
    public static final VideoCaptureDevice BACK_CAMERA;
    public static final VideoCaptureDevice FRONT_CAMERA;
    private String id;

    private VideoCaptureDevice(String s, int i, String s1)
    {
        super(s, i);
        id = s1;
    }

    public static VideoCaptureDevice valueOf(String s)
    {
        return (VideoCaptureDevice)Enum.valueOf(com/addlive/service/VideoCaptureDevice, s);
    }

    public static VideoCaptureDevice[] values()
    {
        return (VideoCaptureDevice[])$VALUES.clone();
    }

    public final String getId()
    {
        return id;
    }

    static 
    {
        FRONT_CAMERA = new VideoCaptureDevice("FRONT_CAMERA", 0, "front_cam");
        BACK_CAMERA = new VideoCaptureDevice("BACK_CAMERA", 1, "back_cam");
        $VALUES = (new VideoCaptureDevice[] {
            FRONT_CAMERA, BACK_CAMERA
        });
    }
}
