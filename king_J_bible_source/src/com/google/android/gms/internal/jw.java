// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.internal:
//            jx

public final class jw
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new jx();
    String adq;
    String description;
    private final int xH;

    jw()
    {
        xH = 1;
    }

    jw(int i, String s, String s1)
    {
        xH = i;
        adq = s;
        description = s1;
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
        jx.a(this, parcel, i);
    }

}
