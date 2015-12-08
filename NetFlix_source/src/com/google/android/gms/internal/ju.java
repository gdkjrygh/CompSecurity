// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.internal:
//            jv

public final class ju
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new jv();
    long ado;
    long adp;
    private final int xH;

    ju()
    {
        xH = 1;
    }

    ju(int i, long l, long l1)
    {
        xH = i;
        ado = l;
        adp = l1;
    }

    public int describeContents()
    {
        return 0;
    }

    public int getVersionCode()
    {
        return xH;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        jv.a(this, parcel, i);
    }

}
