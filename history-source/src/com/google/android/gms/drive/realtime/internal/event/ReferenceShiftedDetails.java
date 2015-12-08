// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive.realtime.internal.event;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.drive.realtime.internal.event:
//            d

public class ReferenceShiftedDetails
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new d();
    final int CK;
    final String Te;
    final String Tf;
    final int Tg;
    final int Th;

    ReferenceShiftedDetails(int i, String s, String s1, int j, int k)
    {
        CK = i;
        Te = s;
        Tf = s1;
        Tg = j;
        Th = k;
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        d.a(this, parcel, i);
    }

}
