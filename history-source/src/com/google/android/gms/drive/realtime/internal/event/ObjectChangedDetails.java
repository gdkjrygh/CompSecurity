// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive.realtime.internal.event;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.drive.realtime.internal.event:
//            a

public class ObjectChangedDetails
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new a();
    final int CK;
    final int SO;
    final int SP;

    ObjectChangedDetails(int i, int j, int k)
    {
        CK = i;
        SO = j;
        SP = k;
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        a.a(this, parcel, i);
    }

}
