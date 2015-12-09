// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wallet;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.wallet:
//            f, Cart

public final class FullWalletRequest
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new f();
    String aTl;
    String aTm;
    Cart aTv;
    private final int mVersionCode;

    FullWalletRequest()
    {
        mVersionCode = 1;
    }

    FullWalletRequest(int i, String s, String s1, Cart cart)
    {
        mVersionCode = i;
        aTl = s;
        aTm = s1;
        aTv = cart;
    }

    public final int describeContents()
    {
        return 0;
    }

    public final int getVersionCode()
    {
        return mVersionCode;
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        f.a(this, parcel, i);
    }

}
