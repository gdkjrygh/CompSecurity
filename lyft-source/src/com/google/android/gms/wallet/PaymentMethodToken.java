// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wallet;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.wallet:
//            zzo

public final class PaymentMethodToken
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new zzo();
    int a;
    String b;
    private final int c;

    private PaymentMethodToken()
    {
        c = 1;
    }

    PaymentMethodToken(int i, int j, String s)
    {
        c = i;
        a = j;
        b = s;
    }

    public int a()
    {
        return c;
    }

    public String b()
    {
        return b;
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        zzo.a(this, parcel, i);
    }

}
