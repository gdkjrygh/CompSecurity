// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.amobee.adsdk;


// Referenced classes of package com.amobee.adsdk:
//            Parameters

public static final class  extends Enum
{

    private static final Female ENUM$VALUES[];
    public static final Female Female;
    public static final Female Male;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/amobee/adsdk/Parameters$Gender, s);
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
        Male = new <init>("Male", 0);
        Female = new <init>("Female", 1);
        ENUM$VALUES = (new ENUM.VALUES[] {
            Male, Female
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
