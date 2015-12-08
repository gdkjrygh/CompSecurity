// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.microsoft.dl.video.capture.impl;


// Referenced classes of package com.microsoft.dl.video.capture.impl:
//            ResolutionMatcher

public static final class Q extends Enum
{

    public static final AllScaling AllScaling;
    public static final AllScaling Cropping;
    public static final AllScaling MultipleScaling;
    private static final AllScaling a[];

    public static Q valueOf(String s)
    {
        return (Q)Enum.valueOf(com/microsoft/dl/video/capture/impl/ResolutionMatcher$TransformationAllowed, s);
    }

    public static Q[] values()
    {
        return (Q[])a.clone();
    }

    static 
    {
        Cropping = new <init>("Cropping", 0);
        MultipleScaling = new <init>("MultipleScaling", 1);
        AllScaling = new <init>("AllScaling", 2);
        a = (new a[] {
            Cropping, MultipleScaling, AllScaling
        });
    }

    private Q(String s, int i)
    {
        super(s, i);
    }
}
