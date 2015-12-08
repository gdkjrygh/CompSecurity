// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wallet;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.wallet:
//            i

public final class LineItem
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new i();
    String aTI;
    String aTJ;
    int aTK;
    String aTf;
    String aTg;
    String description;
    private final int mVersionCode;

    LineItem()
    {
        mVersionCode = 1;
        aTK = 0;
    }

    LineItem(int j, String s, String s1, String s2, String s3, int k, String s4)
    {
        mVersionCode = j;
        description = s;
        aTI = s1;
        aTJ = s2;
        aTf = s3;
        aTK = k;
        aTg = s4;
    }

    public final int describeContents()
    {
        return 0;
    }

    public final int getVersionCode()
    {
        return mVersionCode;
    }

    public final void writeToParcel(Parcel parcel, int j)
    {
        i.a(this, parcel, j);
    }

}
