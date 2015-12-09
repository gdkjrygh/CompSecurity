// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.pin;


// Referenced classes of package com.google.android.apps.wallet.pin:
//            PinQualityVerifier

public static final class mPoorQuality extends Enum
{

    private static final VALID $VALUES[];
    public static final VALID CONSECUTIVE_DIGITS;
    public static final VALID IDENTICAL_DIGITS;
    public static final VALID VALID;
    private final int mLocalizedMessageResourceId;
    private final boolean mPoorQuality;

    public static mPoorQuality valueOf(String s)
    {
        return (mPoorQuality)Enum.valueOf(com/google/android/apps/wallet/pin/PinQualityVerifier$PinQualityResult, s);
    }

    public static mPoorQuality[] values()
    {
        return (mPoorQuality[])$VALUES.clone();
    }

    public final int getLocalizedMessageResourceId()
    {
        return mLocalizedMessageResourceId;
    }

    static 
    {
        IDENTICAL_DIGITS = new <init>("IDENTICAL_DIGITS", 0, com.google.android.apps.walletnfcrel.rror, true);
        CONSECUTIVE_DIGITS = new <init>("CONSECUTIVE_DIGITS", 1, com.google.android.apps.walletnfcrel._error, true);
        VALID = new <init>("VALID", 2, 0, false);
        $VALUES = (new .VALUES[] {
            IDENTICAL_DIGITS, CONSECUTIVE_DIGITS, VALID
        });
    }

    private (String s, int i, int j, boolean flag)
    {
        super(s, i);
        mLocalizedMessageResourceId = j;
        mPoorQuality = flag;
    }
}
