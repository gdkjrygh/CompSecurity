// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wallet.wobs;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.wallet.wobs:
//            zzg

public final class TimeInterval
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new zzg();
    long a;
    long b;
    private final int c;

    TimeInterval()
    {
        c = 1;
    }

    TimeInterval(int i, long l, long l1)
    {
        c = i;
        a = l;
        b = l1;
    }

    public int a()
    {
        return c;
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        zzg.a(this, parcel, i);
    }

}
