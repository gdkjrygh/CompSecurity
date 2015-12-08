// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.transfer;


// Referenced classes of package com.google.android.apps.wallet.transfer:
//            ContactSearchActivity

public static final class selectSeflError extends Enum
{

    private static final REQUEST_MONEY $VALUES[];
    public static final REQUEST_MONEY REQUEST_MONEY;
    public static final REQUEST_MONEY SEND_MONEY;
    final String analyticsScreen;
    final int searchTitile;
    final int selectSeflError;

    public static selectSeflError valueOf(String s)
    {
        return (selectSeflError)Enum.valueOf(com/google/android/apps/wallet/transfer/ContactSearchActivity$ContactSearchMode, s);
    }

    public static selectSeflError[] values()
    {
        return (selectSeflError[])$VALUES.clone();
    }

    static 
    {
        SEND_MONEY = new <init>("SEND_MONEY", 0, com.google.android.apps.walletnfcrel.de, "Send Money Contact Search", com.google.android.apps.walletnfcrel.de);
        REQUEST_MONEY = new <init>("REQUEST_MONEY", 1, com.google.android.apps.walletnfcrel.tle, "Request Money Contact Search", com.google.android.apps.walletnfcrel.om_self);
        $VALUES = (new .VALUES[] {
            SEND_MONEY, REQUEST_MONEY
        });
    }

    private (String s, int i, int j, String s1, int k)
    {
        super(s, i);
        searchTitile = j;
        analyticsScreen = s1;
        selectSeflError = k;
    }
}
