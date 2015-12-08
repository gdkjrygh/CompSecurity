// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.microsoft.dl.video.capture.impl;


// Referenced classes of package com.microsoft.dl.video.capture.impl:
//            ResolutionMatcher

public static final class  extends Enum
{

    public static final Scale Crop;
    public static final Scale Match;
    public static final Scale Scale;
    private static final Scale a[];

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/microsoft/dl/video/capture/impl/ResolutionMatcher$Transformation, s);
    }

    public static [] values()
    {
        return ([])a.clone();
    }

    static 
    {
        Match = new <init>("Match", 0);
        Crop = new <init>("Crop", 1);
        Scale = new <init>("Scale", 2);
        a = (new a[] {
            Match, Crop, Scale
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
