// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.amobee.adsdk;


// Referenced classes of package com.amobee.adsdk:
//            AdManager

public static final class  extends Enum
{

    public static final NODEBUG DEBUG;
    private static final NODEBUG ENUM$VALUES[];
    public static final NODEBUG NODEBUG;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/amobee/adsdk/AdManager$DebugLevel, s);
    }

    public static [] values()
    {
         a[] = ENUM$VALUES;
        int i = a.length;
         a1[] = new ENUM.VALUES[i];
        System.arraycopy(a, 0, a1, 0, i);
        return a1;
    }

    static 
    {
        DEBUG = new <init>("DEBUG", 0);
        NODEBUG = new <init>("NODEBUG", 1);
        ENUM$VALUES = (new ENUM.VALUES[] {
            DEBUG, NODEBUG
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
