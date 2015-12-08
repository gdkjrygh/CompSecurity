// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.addlive.impl;


// Referenced classes of package com.addlive.impl:
//            ADLNativeWrapperImpl

static final class apiName extends Enum
{

    private static final UNKNOWN $VALUES[];
    public static final UNKNOWN CONNECT;
    public static final UNKNOWN DISCONNECT;
    public static final UNKNOWN GET_VIDEO_CAPTURE_DEVICE;
    public static final UNKNOWN GET_VIDEO_CAPTURE_DEVICE_NAMES;
    public static final UNKNOWN SET_PROPERTY;
    public static final UNKNOWN SET_VIDEO_CAPTURE_DEVICE;
    public static final UNKNOWN STOP_LOCAL_VIDEO;
    public static final UNKNOWN UNKNOWN;
    private String apiName;

    static apiName fromString(String s)
    {
        apiName aapiname[] = values();
        int j = aapiname.length;
        for (int i = 0; i < j; i++)
        {
            apiName apiname = aapiname[i];
            if (apiname.apiName.equals(s))
            {
                return apiname;
            }
        }

        return UNKNOWN;
    }

    public static UNKNOWN valueOf(String s)
    {
        return (UNKNOWN)Enum.valueOf(com/addlive/impl/ADLNativeWrapperImpl$MethodName, s);
    }

    public static UNKNOWN[] values()
    {
        return (UNKNOWN[])$VALUES.clone();
    }

    static 
    {
        CONNECT = new <init>("CONNECT", 0, "connect");
        DISCONNECT = new <init>("DISCONNECT", 1, "disconnect");
        GET_VIDEO_CAPTURE_DEVICE_NAMES = new <init>("GET_VIDEO_CAPTURE_DEVICE_NAMES", 2, "getVideoCaptureDeviceNames");
        SET_VIDEO_CAPTURE_DEVICE = new <init>("SET_VIDEO_CAPTURE_DEVICE", 3, "setVideoCaptureDevice");
        GET_VIDEO_CAPTURE_DEVICE = new <init>("GET_VIDEO_CAPTURE_DEVICE", 4, "getVideoCaptureDevice");
        SET_PROPERTY = new <init>("SET_PROPERTY", 5, "setProperty");
        STOP_LOCAL_VIDEO = new <init>("STOP_LOCAL_VIDEO", 6, "stopLocalVideo");
        UNKNOWN = new <init>("UNKNOWN", 7, "unknown");
        $VALUES = (new .VALUES[] {
            CONNECT, DISCONNECT, GET_VIDEO_CAPTURE_DEVICE_NAMES, SET_VIDEO_CAPTURE_DEVICE, GET_VIDEO_CAPTURE_DEVICE, SET_PROPERTY, STOP_LOCAL_VIDEO, UNKNOWN
        });
    }

    private (String s, int i, String s1)
    {
        super(s, i);
        apiName = s1;
    }
}
