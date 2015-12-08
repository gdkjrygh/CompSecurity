// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wallet.firstparty;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.wallet.firstparty:
//            zzb

public final class GetBuyFlowInitializationTokenRequest
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new zzb();
    byte a[];
    private final int b;

    GetBuyFlowInitializationTokenRequest()
    {
        this(1, null);
    }

    GetBuyFlowInitializationTokenRequest(int i, byte abyte0[])
    {
        b = i;
        a = abyte0;
    }

    public int a()
    {
        return b;
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        zzb.a(this, parcel, i);
    }

}
