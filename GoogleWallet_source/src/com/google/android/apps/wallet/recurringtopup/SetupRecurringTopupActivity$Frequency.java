// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.recurringtopup;


// Referenced classes of package com.google.android.apps.wallet.recurringtopup:
//            SetupRecurringTopupActivity

static final class text extends Enum
{

    private static final MONTH $VALUES[];
    public static final MONTH BIWEEKLY;
    public static final MONTH MONTH;
    public static final MONTH WEEK;
    private final int id;
    private final int text;

    public static text valueOf(String s)
    {
        return (text)Enum.valueOf(com/google/android/apps/wallet/recurringtopup/SetupRecurringTopupActivity$Frequency, s);
    }

    public static text[] values()
    {
        return (text[])$VALUES.clone();
    }

    public final int getId()
    {
        return id;
    }

    public final int getText()
    {
        return text;
    }

    static 
    {
        WEEK = new <init>("WEEK", 0, 1, com.google.android.apps.walletnfcrel.requency);
        BIWEEKLY = new <init>("BIWEEKLY", 1, 2, com.google.android.apps.walletnfcrel.requency);
        MONTH = new <init>("MONTH", 2, 3, com.google.android.apps.walletnfcrel.requency);
        $VALUES = (new .VALUES[] {
            WEEK, BIWEEKLY, MONTH
        });
    }

    private Y(String s, int i, int j, int k)
    {
        super(s, i);
        id = j;
        text = k;
    }
}
