// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.analytics;


// Referenced classes of package com.snapchat.android.analytics:
//            RegistrationAnalytics

public static final class  extends Enum
{

    private static final CANCEL $VALUES[];
    public static final CANCEL CALL;
    public static final CANCEL CANCEL;
    public static final CANCEL TEXT;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/snapchat/android/analytics/RegistrationAnalytics$PhoneVerificationMethod, s);
    }

    public static [] values()
    {
        return ([])$VALUES.clone();
    }

    static 
    {
        TEXT = new <init>("TEXT", 0);
        CALL = new <init>("CALL", 1);
        CANCEL = new <init>("CANCEL", 2);
        $VALUES = (new .VALUES[] {
            TEXT, CALL, CANCEL
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
