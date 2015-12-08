// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.microsoft.dl.video;


// Referenced classes of package com.microsoft.dl.video:
//            VideoPlatform

private static final class  extends Enum
{

    public static final VIRTUAL REAL;
    public static final VIRTUAL VIRTUAL;
    private static final VIRTUAL a[];

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/microsoft/dl/video/VideoPlatform$CameraManagerFactoryType, s);
    }

    public static [] values()
    {
        return ([])a.clone();
    }

    static 
    {
        REAL = new <init>("REAL", 0);
        VIRTUAL = new <init>("VIRTUAL", 1);
        a = (new a[] {
            REAL, VIRTUAL
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
