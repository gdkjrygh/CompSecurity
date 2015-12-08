// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.internal:
//            iw

public final class iv
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new iw();
    int acs[];
    private final int xH;

    iv()
    {
        this(1, null);
    }

    iv(int i, int ai[])
    {
        xH = i;
        acs = ai;
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
        iw.a(this, parcel, i);
    }

}
