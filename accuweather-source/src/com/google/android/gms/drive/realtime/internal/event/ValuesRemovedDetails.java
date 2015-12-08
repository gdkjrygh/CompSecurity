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
    final int LC;
    final int LD;
    final String LM;
    final int LN;
    final int mIndex;
    final int xJ;

    ValuesRemovedDetails(int j, int k, int l, int i1, String s, int j1)
    {
        xJ = j;
        mIndex = k;
        LC = l;
        LD = i1;
        LM = s;
        LN = j1;
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
