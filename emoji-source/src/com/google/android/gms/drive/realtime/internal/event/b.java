// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive.realtime.internal.event;

import android.os.Parcel;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.internal.safeparcel.a;

// Referenced classes of package com.google.android.gms.drive.realtime.internal.event:
//            ParcelableEventList, ParcelableEvent, ParcelableObjectChangedEvent

public class b
    implements android.os.Parcelable.Creator
{

    public b()
    {
    }

    static void a(ParcelableEventList parcelableeventlist, Parcel parcel, int i)
    {
        int j = com.google.android.gms.common.internal.safeparcel.b.C(parcel);
        com.google.android.gms.common.internal.safeparcel.b.c(parcel, 1, parcelableeventlist.xM);
        com.google.android.gms.common.internal.safeparcel.b.a(parcel, 2, parcelableeventlist.LB, i, false);
        com.google.android.gms.common.internal.safeparcel.b.a(parcel, 3, parcelableeventlist.LC, i, false);
        com.google.android.gms.common.internal.safeparcel.b.a(parcel, 4, parcelableeventlist.LD);
        com.google.android.gms.common.internal.safeparcel.b.a(parcel, 5, parcelableeventlist.LE, i, false);
        com.google.android.gms.common.internal.safeparcel.b.G(parcel, j);
    }

    public ParcelableEventList aU(Parcel parcel)
    {
        boolean flag = false;
        ParcelableObjectChangedEvent aparcelableobjectchangedevent[] = null;
        int j = com.google.android.gms.common.internal.safeparcel.a.B(parcel);
        DataHolder dataholder = null;
        ParcelableEvent aparcelableevent[] = null;
        int i = 0;
        do
        {
            if (parcel.dataPosition() < j)
            {
                int k = com.google.android.gms.common.internal.safeparcel.a.A(parcel);
                switch (com.google.android.gms.common.internal.safeparcel.a.ar(k))
                {
                default:
                    com.google.android.gms.common.internal.safeparcel.a.b(parcel, k);
                    break;

                case 1: // '\001'
                    i = com.google.android.gms.common.internal.safeparcel.a.g(parcel, k);
                    break;

                case 2: // '\002'
                    aparcelableevent = (ParcelableEvent[])com.google.android.gms.common.internal.safeparcel.a.b(parcel, k, ParcelableEvent.CREATOR);
                    break;

                case 3: // '\003'
                    dataholder = (DataHolder)com.google.android.gms.common.internal.safeparcel.a.a(parcel, k, DataHolder.CREATOR);
                    break;

                case 4: // '\004'
                    flag = com.google.android.gms.common.internal.safeparcel.a.c(parcel, k);
                    break;

                case 5: // '\005'
                    aparcelableobjectchangedevent = (ParcelableObjectChangedEvent[])com.google.android.gms.common.internal.safeparcel.a.b(parcel, k, ParcelableObjectChangedEvent.CREATOR);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new com.google.android.gms.common.internal.safeparcel.a.a((new StringBuilder()).append("Overread allowed size end=").append(j).toString(), parcel);
            } else
            {
                return new ParcelableEventList(i, aparcelableevent, dataholder, flag, aparcelableobjectchangedevent);
            }
        } while (true);
    }

    public ParcelableEventList[] bR(int i)
    {
        return new ParcelableEventList[i];
    }

    public Object createFromParcel(Parcel parcel)
    {
        return aU(parcel);
    }

    public Object[] newArray(int i)
    {
        return bR(i);
    }
}
