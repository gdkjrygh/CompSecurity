// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.amobee.adsdk;


// Referenced classes of package com.amobee.adsdk:
//            AdManager

static final class  extends Enum
{

    private static final TIMER ENUM$VALUES[];
    public static final TIMER MANUAL;
    public static final TIMER TIMER;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/amobee/adsdk/AdManager$SdkMode, s);
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
        MANUAL = new <init>("MANUAL", 0);
        TIMER = new <init>("TIMER", 1);
        ENUM$VALUES = (new ENUM.VALUES[] {
            MANUAL, TIMER
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
