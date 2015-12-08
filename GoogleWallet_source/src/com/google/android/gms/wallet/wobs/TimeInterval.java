// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wallet.wobs;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.wallet.wobs:
//            g

public final class TimeInterval
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new g();
    long aVZ;
    long aWa;
    private final int mVersionCode;

    TimeInterval()
    {
        mVersionCode = 1;
    }

    TimeInterval(int i, long l, long l1)
    {
        mVersionCode = i;
        aVZ = l;
        aWa = l1;
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
        g.a(this, parcel, i);
    }

}
