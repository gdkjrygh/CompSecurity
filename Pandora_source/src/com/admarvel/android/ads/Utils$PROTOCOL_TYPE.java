// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.admarvel.android.ads;


// Referenced classes of package com.admarvel.android.ads:
//            Utils

public static final class  extends Enum
{

    private static final NONE ENUM$VALUES[];
    public static final NONE NONE;
    public static final NONE WITHOUT_SLASH;
    public static final NONE WITH_SLASH;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/admarvel/android/ads/Utils$PROTOCOL_TYPE, s);
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
        WITH_SLASH = new <init>("WITH_SLASH", 0);
        WITHOUT_SLASH = new <init>("WITHOUT_SLASH", 1);
        NONE = new <init>("NONE", 2);
        ENUM$VALUES = (new ENUM.VALUES[] {
            WITH_SLASH, WITHOUT_SLASH, NONE
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
