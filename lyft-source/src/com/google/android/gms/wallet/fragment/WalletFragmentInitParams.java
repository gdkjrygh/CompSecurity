// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wallet.fragment;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.wallet.MaskedWallet;
import com.google.android.gms.wallet.MaskedWalletRequest;

// Referenced classes of package com.google.android.gms.wallet.fragment:
//            zza

public final class WalletFragmentInitParams
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new zza();
    final int a;
    private String b;
    private MaskedWalletRequest c;
    private int d;
    private MaskedWallet e;

    private WalletFragmentInitParams()
    {
        a = 1;
        d = -1;
    }

    WalletFragmentInitParams(int i, String s, MaskedWalletRequest maskedwalletrequest, int j, MaskedWallet maskedwallet)
    {
        a = i;
        b = s;
        c = maskedwalletrequest;
        d = j;
        e = maskedwallet;
    }

    public String a()
    {
        return b;
    }

    public MaskedWalletRequest b()
    {
        return c;
    }

    public int c()
    {
        return d;
    }

    public MaskedWallet d()
    {
        return e;
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        zza.a(this, parcel, i);
    }

}
