// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive.realtime.internal.event;

import android.os.Parcel;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.drive.realtime.internal.event:
//            b, ParcelableEvent, ParcelableObjectChangedEvent

public class ParcelableEventList
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new b();
    final ParcelableEvent LB[];
    final DataHolder LC;
    final boolean LD;
    final ParcelableObjectChangedEvent LE[];
    final int xM;

    ParcelableEventList(int i, ParcelableEvent aparcelableevent[], DataHolder dataholder, boolean flag, ParcelableObjectChangedEvent aparcelableobjectchangedevent[])
    {
        xM = i;
        LB = aparcelableevent;
        LC = dataholder;
        LD = flag;
        LE = aparcelableobjectchangedevent;
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
