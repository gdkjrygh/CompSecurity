// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.analytics;


// Referenced classes of package com.snapchat.android.analytics:
//            PhoneVerificationAnalytics

public static final class  extends Enum
{

    private static final VERIFIED_NEW_NUMBER $VALUES[];
    public static final VERIFIED_NEW_NUMBER REGISTERED_NUMBER;
    public static final VERIFIED_NEW_NUMBER VERIFIED_NEW_NUMBER;
    public static final VERIFIED_NEW_NUMBER VERIFIED_NUMBER;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/snapchat/android/analytics/PhoneVerificationAnalytics$VerificationType, s);
    }

    public static [] values()
    {
        return ([])$VALUES.clone();
    }

    static 
    {
        REGISTERED_NUMBER = new <init>("REGISTERED_NUMBER", 0);
        VERIFIED_NUMBER = new <init>("VERIFIED_NUMBER", 1);
        VERIFIED_NEW_NUMBER = new <init>("VERIFIED_NEW_NUMBER", 2);
        $VALUES = (new .VALUES[] {
            REGISTERED_NUMBER, VERIFIED_NUMBER, VERIFIED_NEW_NUMBER
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
