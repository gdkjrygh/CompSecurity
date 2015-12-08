// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.microsoft.dl.video.capture;


// Referenced classes of package com.microsoft.dl.video.capture:
//            CapturerConfiguration

static final class  extends Enum
{

    public static final AllowScalingAnyResolution AllowCroppingAnyResolution;
    public static final AllowScalingAnyResolution AllowCroppingMandatoryResolutions;
    public static final AllowScalingAnyResolution AllowMultipleScalingAnyResolution;
    public static final AllowScalingAnyResolution AllowMultipleScalingMandatoryResolutions;
    public static final AllowScalingAnyResolution AllowScalingAnyResolution;
    public static final AllowScalingAnyResolution AllowScalingMandatoryResolutions;
    private static final AllowScalingAnyResolution a[];

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/microsoft/dl/video/capture/CapturerConfiguration$TransformationOptions, s);
    }

    public static [] values()
    {
        return ([])a.clone();
    }

    static 
    {
        AllowCroppingMandatoryResolutions = new <init>("AllowCroppingMandatoryResolutions", 0);
        AllowMultipleScalingMandatoryResolutions = new <init>("AllowMultipleScalingMandatoryResolutions", 1);
        AllowScalingMandatoryResolutions = new <init>("AllowScalingMandatoryResolutions", 2);
        AllowCroppingAnyResolution = new <init>("AllowCroppingAnyResolution", 3);
        AllowMultipleScalingAnyResolution = new <init>("AllowMultipleScalingAnyResolution", 4);
        AllowScalingAnyResolution = new <init>("AllowScalingAnyResolution", 5);
        a = (new a[] {
            AllowCroppingMandatoryResolutions, AllowMultipleScalingMandatoryResolutions, AllowScalingMandatoryResolutions, AllowCroppingAnyResolution, AllowMultipleScalingAnyResolution, AllowScalingAnyResolution
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
