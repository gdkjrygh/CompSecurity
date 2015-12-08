// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive.realtime.internal.event;

import android.os.Parcel;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.drive.realtime.internal.event:
//            b, ParcelableObjectChangedEvent, ParcelableEvent

public class ParcelableEventList
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new b();
    final boolean LA;
    final ParcelableObjectChangedEvent LB[];
    final ParcelableEvent Ly[];
    final DataHolder Lz;
    final int xJ;

    ParcelableEventList(int i, ParcelableEvent aparcelableevent[], DataHolder dataholder, boolean flag, ParcelableObjectChangedEvent aparcelableobjectchangedevent[])
    {
        xJ = i;
        Ly = aparcelableevent;
        Lz = dataholder;
        LA = flag;
        LB = aparcelableobjectchangedevent;
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        b.a(this, parcel, i);
    }

}
