// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wallet;

import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.wallet:
//            zzp

public final class PaymentMethodTokenizationParameters
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new zzp();
    int a;
    Bundle b;
    private final int c;

    private PaymentMethodTokenizationParameters()
    {
        b = new Bundle();
        c = 1;
    }

    PaymentMethodTokenizationParameters(int i, int j, Bundle bundle)
    {
        b = new Bundle();
        c = i;
        a = j;
        b = bundle;
    }

    public static Builder a()
    {
        PaymentMethodTokenizationParameters paymentmethodtokenizationparameters = new PaymentMethodTokenizationParameters();
        paymentmethodtokenizationparameters.getClass();
        return paymentmethodtokenizationparameters. new Builder();
    }

    public int b()
    {
        return c;
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        zzp.a(this, parcel, i);
    }


    private class Builder
    {

        final PaymentMethodTokenizationParameters a;

        public Builder a(int i)
        {
            a.a = i;
            return this;
        }

        public Builder a(String s, String s1)
        {
            zzu.a(s, "Tokenization parameter name must not be empty");
            zzu.a(s1, "Tokenization parameter value must not be empty");
            a.b.putString(s, s1);
            return this;
        }

        public PaymentMethodTokenizationParameters a()
        {
            return a;
        }

        private Builder()
        {
            a = PaymentMethodTokenizationParameters.this;
            super();
        }

    }

}
