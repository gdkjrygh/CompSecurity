// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive.realtime.internal.event;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.drive.realtime.internal.event:
//            c

public class ParcelableObjectChangedEvent
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new c();
    final int LC;
    final int LD;
    final String Lj;
    final String Ln;
    final boolean Lp;
    final String Lq;
    final String rO;
    final int xJ;

    ParcelableObjectChangedEvent(int i, String s, String s1, boolean flag, String s2, String s3, int j, 
            int k)
    {
        rO = s;
        Lj = s1;
        Lp = flag;
        Ln = s2;
        Lq = s3;
        xJ = i;
        LC = j;
        LD = k;
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        c.a(this, parcel, i);
    }

}
