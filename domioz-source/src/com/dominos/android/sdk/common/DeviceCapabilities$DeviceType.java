// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.android.sdk.common;


public final class  extends Enum
{

    private static final MOBILE $VALUES[];
    public static final MOBILE MOBILE;
    public static final MOBILE TABLET;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/dominos/android/sdk/common/DeviceCapabilities$DeviceType, s);
    }

    public static [] values()
    {
        return ([])$VALUES.clone();
    }

    static 
    {
        TABLET = new <init>("TABLET", 0);
        MOBILE = new <init>("MOBILE", 1);
        $VALUES = (new .VALUES[] {
            TABLET, MOBILE
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
