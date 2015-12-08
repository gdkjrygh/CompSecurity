// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.microsoft.dl.video.capture.api;


// Referenced classes of package com.microsoft.dl.video.capture.api:
//            CameraCapabilities

public static final class  extends Enum
{

    public static final OTHER BACK;
    public static final OTHER FRONT;
    public static final OTHER OTHER;
    private static final OTHER a[];

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/microsoft/dl/video/capture/api/CameraCapabilities$Facing, s);
    }

    public static [] values()
    {
        return ([])a.clone();
    }

    static 
    {
        BACK = new <init>("BACK", 0);
        FRONT = new <init>("FRONT", 1);
        OTHER = new <init>("OTHER", 2);
        a = (new a[] {
            BACK, FRONT, OTHER
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
