// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wallet.fragment;

import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.wallet.fragment:
//            c

public final class WalletFragmentStyle
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new c();
    final int a;
    Bundle b;
    int c;

    public WalletFragmentStyle()
    {
        a = 1;
        b = new Bundle();
    }

    WalletFragmentStyle(int i, Bundle bundle, int j)
    {
        a = i;
        b = bundle;
        c = j;
    }

    public final int describeContents()
    {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        com.google.android.gms.wallet.fragment.c.a(this, parcel);
    }

}
