// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.loyalty.discovery;


// Referenced classes of package com.google.android.apps.wallet.loyalty.discovery:
//            FeaturedLoyaltyProgramListFragment

static final class  extends Enum
{

    private static final ERROR $VALUES[];
    public static final ERROR ERROR;
    public static final ERROR LIST;
    public static final ERROR LOADING;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/google/android/apps/wallet/loyalty/discovery/FeaturedLoyaltyProgramListFragment$DisplayType, s);
    }

    public static [] values()
    {
        return ([])$VALUES.clone();
    }

    static 
    {
        LOADING = new <init>("LOADING", 0);
        LIST = new <init>("LIST", 1);
        ERROR = new <init>("ERROR", 2);
        $VALUES = (new .VALUES[] {
            LOADING, LIST, ERROR
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
