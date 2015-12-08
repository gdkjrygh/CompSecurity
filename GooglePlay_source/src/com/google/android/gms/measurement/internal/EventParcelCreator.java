// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

// Referenced classes of package com.google.android.gms.measurement.internal:
//            EventParcel, EventParams

public final class EventParcelCreator
    implements android.os.Parcelable.Creator
{

    public EventParcelCreator()
    {
    }

    static void writeToParcel(EventParcel eventparcel, Parcel parcel, int i)
    {
        int j = SafeParcelWriter.beginVariableData(parcel, 20293);
        SafeParcelWriter.writeInt(parcel, 1, eventparcel.versionCode);
        SafeParcelWriter.writeString(parcel, 2, eventparcel.name, false);
        SafeParcelWriter.writeParcelable(parcel, 3, eventparcel.params, i, false);
        SafeParcelWriter.writeString(parcel, 4, eventparcel.origin, false);
        SafeParcelWriter.writeLong(parcel, 5, eventparcel.eventTimeInMilliseconds);
        SafeParcelWriter.finishVariableData(parcel, j);
    }

    public final volatile Object createFromParcel(Parcel parcel)
    {
        String s = null;
        int j = SafeParcelReader.validateObjectHeader(parcel);
        int i = 0;
        long l = 0L;
        EventParams eventparams = null;
        String s1 = null;
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
                    s1 = SafeParcelReader.createString(parcel, k);
                    break;

                case 3: // '\003'
                    eventparams = (EventParams)SafeParcelReader.createParcelable(parcel, k, EventParams.CREATOR);
                    break;

                case 4: // '\004'
                    s = SafeParcelReader.createString(parcel, k);
                    break;

                case 5: // '\005'
                    l = SafeParcelReader.readLong(parcel, k);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ParseException((new StringBuilder("Overread allowed size end=")).append(j).toString(), parcel);
            } else
            {
                return new EventParcel(i, s1, eventparams, s, l);
            }
        } while (true);
    }

    public final volatile Object[] newArray(int i)
    {
        return new EventParcel[i];
    }
}
