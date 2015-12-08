// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wallet;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.wallet:
//            zzf, Cart

public final class FullWalletRequest
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new zzf();
    String a;
    String b;
    Cart c;
    private final int d;

    FullWalletRequest()
    {
        d = 1;
    }

    FullWalletRequest(int i, String s, String s1, Cart cart)
    {
        d = i;
        a = s;
        b = s1;
        c = cart;
    }

    public static Builder a()
    {
        FullWalletRequest fullwalletrequest = new FullWalletRequest();
        fullwalletrequest.getClass();
        return fullwalletrequest. new Builder();
    }

    public int b()
    {
        return d;
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        zzf.a(this, parcel, i);
    }


    private class Builder
    {

        final FullWalletRequest a;

        public Builder a(String s)
        {
            a.a = s;
            return this;
        }

        public FullWalletRequest a()
        {
            return a;
        }

        private Builder()
        {
            a = FullWalletRequest.this;
            super();
        }

    }

}
