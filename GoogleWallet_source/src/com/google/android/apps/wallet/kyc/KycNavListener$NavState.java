// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.kyc;


// Referenced classes of package com.google.android.apps.wallet.kyc:
//            KycNavListener

public static final class  extends Enum
{

    private static final PASSED $VALUES[];
    public static final PASSED ENTER_ADDRESS;
    public static final PASSED ENTER_OOW;
    public static final PASSED ENTER_PERSONAL_INFO;
    public static final PASSED ENTER_PERSONAL_INFO_RETRY;
    public static final PASSED FAILED;
    public static final PASSED OOW_INTRO;
    public static final PASSED PASSED;
    public static final PASSED REFERRED;
    public static final PASSED UNINITIALIZED;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/google/android/apps/wallet/kyc/KycNavListener$NavState, s);
    }

    public static [] values()
    {
        return ([])$VALUES.clone();
    }

    static 
    {
        UNINITIALIZED = new <init>("UNINITIALIZED", 0);
        ENTER_PERSONAL_INFO = new <init>("ENTER_PERSONAL_INFO", 1);
        ENTER_ADDRESS = new <init>("ENTER_ADDRESS", 2);
        ENTER_PERSONAL_INFO_RETRY = new <init>("ENTER_PERSONAL_INFO_RETRY", 3);
        OOW_INTRO = new <init>("OOW_INTRO", 4);
        ENTER_OOW = new <init>("ENTER_OOW", 5);
        REFERRED = new <init>("REFERRED", 6);
        FAILED = new <init>("FAILED", 7);
        PASSED = new <init>("PASSED", 8);
        $VALUES = (new .VALUES[] {
            UNINITIALIZED, ENTER_PERSONAL_INFO, ENTER_ADDRESS, ENTER_PERSONAL_INFO_RETRY, OOW_INTRO, ENTER_OOW, REFERRED, FAILED, PASSED
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
