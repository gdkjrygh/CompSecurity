// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wallet.wobs;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.wallet.wobs:
//            m

public final class l
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new m();
    private final int CK;
    long awU;
    long awV;

    l()
    {
        CK = 1;
    }

    l(int i, long l1, long l2)
    {
        CK = i;
        awU = l1;
        awV = l2;
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
        m.a(this, parcel, i);
    }

}
