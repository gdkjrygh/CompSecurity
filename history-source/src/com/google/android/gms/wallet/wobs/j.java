// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wallet.wobs;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.wallet.wobs:
//            k

public final class j
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new k();
    private final int CK;
    String awT;
    String tU;

    j()
    {
        CK = 1;
    }

    j(int i, String s, String s1)
    {
        CK = i;
        awT = s;
        tU = s1;
    }

    public int describeContents()
    {
        return 0;
    }

    public int getVersionCode()
    {
        return CK;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        k.a(this, parcel, i);
    }

}
