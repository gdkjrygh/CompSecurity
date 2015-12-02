// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo360.mobilesafe.share;


// Referenced classes of package com.qihoo360.mobilesafe.share:
//            SharedPref

public static final class  extends Enum
{

    public static final CUSTOM CUSTOM;
    public static final CUSTOM DEFUALT;
    public static final CUSTOM MUTE;
    private static final CUSTOM a[];

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/qihoo360/mobilesafe/share/SharedPref$CustomPrivateRingUriInfo$RingType, s);
    }

    public static [] values()
    {
        return ([])a.clone();
    }

    static 
    {
        DEFUALT = new <init>("DEFUALT", 0);
        MUTE = new <init>("MUTE", 1);
        CUSTOM = new <init>("CUSTOM", 2);
        a = (new a[] {
            DEFUALT, MUTE, CUSTOM
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
