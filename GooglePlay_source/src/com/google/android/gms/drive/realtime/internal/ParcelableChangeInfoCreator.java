// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive.realtime.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.drive.realtime.internal.event.ParcelableEvent;

// Referenced classes of package com.google.android.gms.drive.realtime.internal:
//            ParcelableChangeInfo

public final class ParcelableChangeInfoCreator
    implements android.os.Parcelable.Creator
{

    public ParcelableChangeInfoCreator()
    {
    }

    static void writeToParcel$4478533c(ParcelableChangeInfo parcelablechangeinfo, Parcel parcel)
    {
        int i = SafeParcelWriter.beginVariableData(parcel, 20293);
        SafeParcelWriter.writeInt(parcel, 1, parcelablechangeinfo.mVersionCode);
        SafeParcelWriter.writeLong(parcel, 2, parcelablechangeinfo.mTimestamp);
        SafeParcelWriter.writeTypedList(parcel, 3, parcelablechangeinfo.mEvents, false);
        SafeParcelWriter.finishVariableData(parcel, i);
    }

    public final volatile Object createFromParcel(Parcel parcel)
    {
        int j = SafeParcelReader.validateObjectHeader(parcel);
        int i = 0;
        long l = 0L;
        java.util.ArrayList arraylist = null;
        do
        {
            if (parcel.dataPosition() < j)
            {
                int k = parcel.readInt();
                switch (0xffff & k)
                {
                default:
                    SafeParcelReader.skipUnknownField(parcel, k);
                    break;

                case 1: // '\001'
                    i = SafeParcelReader.readInt(parcel, k);
                    break;

                case 2: // '\002'
                    l = SafeParcelReader.readLong(parcel, k);
                    break;

                case 3: // '\003'
                    arraylist = SafeParcelReader.createTypedList(parcel, k, ParcelableEvent.CREATOR);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ParseException((new StringBuilder("Overread allowed size end=")).append(j).toString(), parcel);
            } else
            {
                return new ParcelableChangeInfo(i, l, arraylist);
            }
        } while (true);
    }

    public final volatile Object[] newArray(int i)
    {
        return new ParcelableChangeInfo[i];
    }
}
