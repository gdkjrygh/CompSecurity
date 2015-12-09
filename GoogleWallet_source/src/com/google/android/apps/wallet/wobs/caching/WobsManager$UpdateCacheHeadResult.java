// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.wobs.caching;


// Referenced classes of package com.google.android.apps.wallet.wobs.caching:
//            WobsManager

static final class  extends Enum
{

    private static final ERROR $VALUES[];
    public static final ERROR ERROR;
    public static final ERROR NO_UPDATE;
    public static final ERROR SUCCESS_UPDATED;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/google/android/apps/wallet/wobs/caching/WobsManager$UpdateCacheHeadResult, s);
    }

    public static [] values()
    {
        return ([])$VALUES.clone();
    }

    static 
    {
        SUCCESS_UPDATED = new <init>("SUCCESS_UPDATED", 0);
        NO_UPDATE = new <init>("NO_UPDATE", 1);
        ERROR = new <init>("ERROR", 2);
        $VALUES = (new .VALUES[] {
            SUCCESS_UPDATED, NO_UPDATE, ERROR
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
