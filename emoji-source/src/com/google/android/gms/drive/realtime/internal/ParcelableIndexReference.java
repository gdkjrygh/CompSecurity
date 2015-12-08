// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive.realtime.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.drive.realtime.internal:
//            q

public class ParcelableIndexReference
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new q();
    final String Lq;
    final boolean Lr;
    final int mIndex;
    final int xM;

    ParcelableIndexReference(int i, String s, int j, boolean flag)
    {
        xM = i;
        Lq = s;
        mIndex = j;
        Lr = flag;
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        q.a(this, parcel, i);
    }

}
