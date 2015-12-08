// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wallet.fragment;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.wallet.MaskedWallet;
import com.google.android.gms.wallet.MaskedWalletRequest;

// Referenced classes of package com.google.android.gms.wallet.fragment:
//            a

public final class WalletFragmentInitParams
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new a();
    private String Fl;
    private MaskedWalletRequest aUM;
    private MaskedWallet aUN;
    private int aVa;
    final int mVersionCode;

    private WalletFragmentInitParams()
    {
        mVersionCode = 1;
        aVa = -1;
    }

    WalletFragmentInitParams(int i, String s, MaskedWalletRequest maskedwalletrequest, int j, MaskedWallet maskedwallet)
    {
        mVersionCode = i;
        Fl = s;
        aUM = maskedwalletrequest;
        aVa = j;
        aUN = maskedwallet;
    }

    public final int describeContents()
    {
        return 0;
    }

    public final String getAccountName()
    {
        return Fl;
    }

    public final MaskedWallet getMaskedWallet()
    {
        return aUN;
    }

    public final MaskedWalletRequest getMaskedWalletRequest()
    {
        return aUM;
    }

    public final int getMaskedWalletRequestCode()
    {
        return aVa;
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        a.a(this, parcel, i);
    }

}
