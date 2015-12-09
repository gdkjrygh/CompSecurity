// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.pin;


// Referenced classes of package com.google.android.apps.wallet.pin:
//            UserPin

public class PinQualityVerifier
{
    public static final class PinQualityResult extends Enum
    {

        private static final PinQualityResult $VALUES[];
        public static final PinQualityResult CONSECUTIVE_DIGITS;
        public static final PinQualityResult IDENTICAL_DIGITS;
        public static final PinQualityResult VALID;
        private final int mLocalizedMessageResourceId;
        private final boolean mPoorQuality;

        public static PinQualityResult valueOf(String s)
        {
            return (PinQualityResult)Enum.valueOf(com/google/android/apps/wallet/pin/PinQualityVerifier$PinQualityResult, s);
        }

        public static PinQualityResult[] values()
        {
            return (PinQualityResult[])$VALUES.clone();
        }

        public final int getLocalizedMessageResourceId()
        {
            return mLocalizedMessageResourceId;
        }

        static 
        {
            IDENTICAL_DIGITS = new PinQualityResult("IDENTICAL_DIGITS", 0, com.google.android.apps.walletnfcrel.R.string.pin_quality_identical_pin_error, true);
            CONSECUTIVE_DIGITS = new PinQualityResult("CONSECUTIVE_DIGITS", 1, com.google.android.apps.walletnfcrel.R.string.pin_quality_consecutive_pin_error, true);
            VALID = new PinQualityResult("VALID", 2, 0, false);
            $VALUES = (new PinQualityResult[] {
                IDENTICAL_DIGITS, CONSECUTIVE_DIGITS, VALID
            });
        }

        private PinQualityResult(String s, int i, int j, boolean flag)
        {
            super(s, i);
            mLocalizedMessageResourceId = j;
            mPoorQuality = flag;
        }
    }


    public PinQualityVerifier()
    {
    }

    private boolean hasAllIdenticalDigits(UserPin userpin)
    {
        return isConsecutiveNumbers(userpin, 0);
    }

    private static boolean isConsecutiveNumbers(UserPin userpin, int i)
    {
        int k = userpin.length();
        for (int j = 0; j < k - 1; j++)
        {
            if (Character.getNumericValue(userpin.charAt(j + 1)) != Character.getNumericValue(userpin.charAt(j)) + i)
            {
                return false;
            }
        }

        return true;
    }

    public final PinQualityResult verifyPinQuality(UserPin userpin)
    {
        if (isConsecutiveNumbers(userpin, 1) || isConsecutiveNumbers(userpin, -1))
        {
            return PinQualityResult.CONSECUTIVE_DIGITS;
        }
        if (hasAllIdenticalDigits(userpin))
        {
            return PinQualityResult.IDENTICAL_DIGITS;
        } else
        {
            return PinQualityResult.VALID;
        }
    }
}
