// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.paypal.android.sdk.payments;

import android.os.Parcel;
import android.os.Parcelable;

// Referenced classes of package com.paypal.android.sdk.payments:
//            br

final class aj extends Enum
    implements Parcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new br();
    public static final aj a;
    public static final aj b;
    public static final aj c;
    public static final aj d;
    public static final aj e;
    public static final aj f;
    public static final aj g;
    public static final aj h;
    public static final aj i;
    public static final aj j;
    public static final aj k;
    public static final aj l;
    public static final aj m;
    private static final aj n[];

    private aj(String s, int i1)
    {
        super(s, i1);
    }

    public static aj valueOf(String s)
    {
        return (aj)Enum.valueOf(com/paypal/android/sdk/payments/aj, s);
    }

    public static aj[] values()
    {
        return (aj[])n.clone();
    }

    public final int describeContents()
    {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i1)
    {
        parcel.writeSerializable(this);
    }

    static 
    {
        a = new aj("EMAIL", 0);
        b = new aj("PIN", 1);
        c = new aj("EMAIL_LOGIN_IN_PROGRESS", 2);
        d = new aj("PIN_LOGIN_IN_PROGRESS", 3);
        e = new aj("EMAIL_LOGIN_FAILED", 4);
        f = new aj("PIN_LOGIN_FAILED", 5);
        g = new aj("TWO_FA_SEND_FIRST_SMS", 6);
        h = new aj("TWO_FA_SEND_FIRST_SMS_IN_PROGRESS", 7);
        i = new aj("TWO_FA_SEND_ANOTHER_SMS_IN_PROGRESS", 8);
        j = new aj("TWO_FA_ENTER_OTP", 9);
        k = new aj("TWO_FA_LOGIN_OTP_IN_PROGRESS", 10);
        l = new aj("TWO_FA_SEND_SMS_FAILED", 11);
        m = new aj("TWO_FA_LOGIN_OTP_FAILED", 12);
        n = (new aj[] {
            a, b, c, d, e, f, g, h, i, j, 
            k, l, m
        });
    }
}
