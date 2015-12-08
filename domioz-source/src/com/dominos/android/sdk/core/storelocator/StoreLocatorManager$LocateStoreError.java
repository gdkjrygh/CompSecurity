// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.android.sdk.core.storelocator;


public final class  extends Enum
{

    private static final STREET_NUMBER_MISSING $VALUES[];
    public static final STREET_NUMBER_MISSING STREET_NUMBER_MISSING;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/dominos/android/sdk/core/storelocator/StoreLocatorManager$LocateStoreError, s);
    }

    public static [] values()
    {
        return ([])$VALUES.clone();
    }

    static 
    {
        STREET_NUMBER_MISSING = new <init>("STREET_NUMBER_MISSING", 0);
        $VALUES = (new .VALUES[] {
            STREET_NUMBER_MISSING
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
