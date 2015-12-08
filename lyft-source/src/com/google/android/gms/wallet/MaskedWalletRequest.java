// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wallet;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.ArrayList;

// Referenced classes of package com.google.android.gms.wallet:
//            zzl, Cart, CountrySpecification, PaymentMethodTokenizationParameters

public final class MaskedWalletRequest
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new zzl();
    String a;
    boolean b;
    boolean c;
    boolean d;
    String e;
    String f;
    String g;
    Cart h;
    boolean i;
    boolean j;
    CountrySpecification k[];
    boolean l;
    boolean m;
    ArrayList n;
    PaymentMethodTokenizationParameters o;
    ArrayList p;
    private final int q;

    MaskedWalletRequest()
    {
        q = 3;
        l = true;
        m = true;
    }

    MaskedWalletRequest(int i1, String s, boolean flag, boolean flag1, boolean flag2, String s1, String s2, 
            String s3, Cart cart, boolean flag3, boolean flag4, CountrySpecification acountryspecification[], boolean flag5, boolean flag6, 
            ArrayList arraylist, PaymentMethodTokenizationParameters paymentmethodtokenizationparameters, ArrayList arraylist1)
    {
        q = i1;
        a = s;
        b = flag;
        c = flag1;
        d = flag2;
        e = s1;
        f = s2;
        g = s3;
        h = cart;
        i = flag3;
        j = flag4;
        k = acountryspecification;
        l = flag5;
        m = flag6;
        n = arraylist;
        o = paymentmethodtokenizationparameters;
        p = arraylist1;
    }

    public static Builder a()
    {
        MaskedWalletRequest maskedwalletrequest = new MaskedWalletRequest();
        maskedwalletrequest.getClass();
        return maskedwalletrequest. new Builder();
    }

    public int b()
    {
        return q;
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i1)
    {
        zzl.a(this, parcel, i1);
    }


    private class Builder
    {

        final MaskedWalletRequest a;

        public Builder a(PaymentMethodTokenizationParameters paymentmethodtokenizationparameters)
        {
            a.o = paymentmethodtokenizationparameters;
            return this;
        }

        public Builder a(String s)
        {
            a.f = s;
            return this;
        }

        public Builder a(boolean flag)
        {
            a.b = flag;
            return this;
        }

        public MaskedWalletRequest a()
        {
            return a;
        }

        public Builder b(String s)
        {
            a.g = s;
            return this;
        }

        public Builder b(boolean flag)
        {
            a.d = flag;
            return this;
        }

        public Builder c(boolean flag)
        {
            a.j = flag;
            return this;
        }

        public Builder d(boolean flag)
        {
            a.l = flag;
            return this;
        }

        private Builder()
        {
            a = MaskedWalletRequest.this;
            super();
        }

    }

}
