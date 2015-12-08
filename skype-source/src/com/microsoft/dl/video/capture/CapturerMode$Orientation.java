// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.microsoft.dl.video.capture;


// Referenced classes of package com.microsoft.dl.video.capture:
//            CapturerMode

public static final class  extends Enum
{

    public static final Transposed FlippedHorizontally;
    public static final Transposed FlippedVertically;
    public static final Transposed Transposed;
    private static final Transposed a[];

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/microsoft/dl/video/capture/CapturerMode$Orientation, s);
    }

    public static [] values()
    {
        return ([])a.clone();
    }

    static 
    {
        FlippedHorizontally = new <init>("FlippedHorizontally", 0);
        FlippedVertically = new <init>("FlippedVertically", 1);
        Transposed = new <init>("Transposed", 2);
        a = (new a[] {
            FlippedHorizontally, FlippedVertically, Transposed
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
