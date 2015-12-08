// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.braintreepayments.cardform.utils;

import android.text.TextUtils;
import java.util.Calendar;

public class DateValidator
{

    private static final DateValidator INSTANCE = new DateValidator(Calendar.getInstance());
    private static final int MAXIMUM_VALID_YEAR_DIFFERENCE = 20;
    private final Calendar mCalendar;

    protected DateValidator(Calendar calendar)
    {
        mCalendar = calendar;
    }

    private int getCurrentMonth()
    {
        return mCalendar.get(2) + 1;
    }

    private int getCurrentTwoDigitYear()
    {
        return mCalendar.get(1) % 100;
    }

    public static boolean isValid(String s, String s1)
    {
        return INSTANCE.isValidHelper(s, s1);
    }

    protected boolean isValidHelper(String s, String s1)
    {
_L2:
        return false;
        if (TextUtils.isEmpty(s) || TextUtils.isEmpty(s1) || !TextUtils.isDigitsOnly(s) || !TextUtils.isDigitsOnly(s1)) goto _L2; else goto _L1
_L1:
        int j = Integer.parseInt(s);
        if (j < 1 || j > 12) goto _L2; else goto _L3
_L3:
        int i;
        int k;
        k = getCurrentTwoDigitYear();
        i = s1.length();
        if (i != 2)
        {
            continue; /* Loop/switch isn't completed */
        }
        i = Integer.parseInt(s1);
_L6:
        if (i == k && j < getCurrentMonth() || i < k && (i + 100) - k > 20) goto _L2; else goto _L4
_L4:
        return true;
        if (i != 4) goto _L2; else goto _L5
_L5:
        i = Integer.parseInt(s1) & 0x64;
          goto _L6
    }

}
