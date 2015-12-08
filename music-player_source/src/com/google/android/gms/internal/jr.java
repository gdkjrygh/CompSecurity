// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.internal:
//            kl

public final class jr
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new kl();
    long a;
    long b;
    private final int c;

    jr()
    {
        c = 1;
    }

    jr(int i, long l, long l1)
    {
        c = i;
        a = l;
        b = l1;
    }

    public final int a()
    {
        return c;
    }

    public final int describeContents()
    {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        kl.a(this, parcel);
    }

}
