// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive.realtime.internal.event;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.drive.realtime.internal.event:
//            h

public class ValuesAddedDetails
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new h();
    final int LF;
    final int LG;
    final String LN;
    final int LO;
    final int mIndex;
    final int xM;

    ValuesAddedDetails(int i, int j, int k, int l, String s, int i1)
    {
        xM = i;
        mIndex = j;
        LF = k;
        LG = l;
        LN = s;
        LO = i1;
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        h.a(this, parcel, i);
    }

}
