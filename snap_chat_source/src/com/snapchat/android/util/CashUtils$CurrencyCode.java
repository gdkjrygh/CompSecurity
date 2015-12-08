// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.util;


// Referenced classes of package com.snapchat.android.util:
//            CashUtils

public static final class  extends Enum
{

    private static final USD $VALUES[];
    public static final USD USD;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/snapchat/android/util/CashUtils$CurrencyCode, s);
    }

    public static [] values()
    {
        return ([])$VALUES.clone();
    }

    static 
    {
        USD = new <init>("USD");
        $VALUES = (new .VALUES[] {
            USD
        });
    }

    private (String s)
    {
        super(s, 0);
    }
}
