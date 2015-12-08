// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive.realtime.internal.event;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.drive.realtime.internal.event:
//            i

public class ValuesRemovedDetails
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new i();
    final int LF;
    final int LG;
    final String LP;
    final int LQ;
    final int mIndex;
    final int xM;

    ValuesRemovedDetails(int j, int k, int l, int i1, String s, int j1)
    {
        xM = j;
        mIndex = k;
        LF = l;
        LG = i1;
        LP = s;
        LQ = j1;
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int j)
    {
        i.a(this, parcel, j);
    }

}
