// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.android.sdk.core.models.loyalty;


public final class  extends Enum
{

    private static final ACTIVE $VALUES[];
    public static final ACTIVE ACTIVE;
    public static final ACTIVE PENDING;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/dominos/android/sdk/core/models/loyalty/History$HistoryHeaderType, s);
    }

    public static [] values()
    {
        return ([])$VALUES.clone();
    }

    static 
    {
        PENDING = new <init>("PENDING", 0);
        ACTIVE = new <init>("ACTIVE", 1);
        $VALUES = (new .VALUES[] {
            PENDING, ACTIVE
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
