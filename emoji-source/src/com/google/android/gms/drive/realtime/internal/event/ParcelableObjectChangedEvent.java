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
    final int LF;
    final int LG;
    final String Lm;
    final String Lq;
    final boolean Ls;
    final String Lt;
    final String rR;
    final int xM;

    ParcelableObjectChangedEvent(int i, String s, String s1, boolean flag, String s2, String s3, int j, 
            int k)
    {
        rR = s;
        Lm = s1;
        Ls = flag;
        Lq = s2;
        Lt = s3;
        xM = i;
        LF = j;
        LG = k;
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
