// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.location;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

// Referenced classes of package com.google.android.gms.location:
//            FloorChangeEvent

public final class FloorChangeEventCreator
    implements android.os.Parcelable.Creator
{

    public FloorChangeEventCreator()
    {
    }

    static void writeToParcel$1ffa25d4(FloorChangeEvent floorchangeevent, Parcel parcel)
    {
        int i = SafeParcelWriter.beginVariableData(parcel, 20293);
        SafeParcelWriter.writeInt(parcel, 1, floorchangeevent.mType);
        SafeParcelWriter.writeInt(parcel, 1000, floorchangeevent.mVersionCode);
        SafeParcelWriter.writeInt(parcel, 2, floorchangeevent.mConfidence);
        SafeParcelWriter.writeLong(parcel, 3, floorchangeevent.mStartTimeMillis);
        SafeParcelWriter.writeLong(parcel, 4, floorchangeevent.mEndTimeMillis);
        SafeParcelWriter.writeLong(parcel, 5, floorchangeevent.mStartElapsedRealtimeMillis);
        SafeParcelWriter.writeLong(parcel, 6, floorchangeevent.mEndElapsedRealtimeMillis);
        SafeParcelWriter.writeFloat(parcel, 7, floorchangeevent.mElevationChange);
        SafeParcelWriter.finishVariableData(parcel, i);
    }

    public final volatile Object createFromParcel(Parcel parcel)
    {
        int l = SafeParcelReader.validateObjectHeader(parcel);
        int k = 0;
        int j = 0;
        int i = 0;
        long l4 = 0L;
        long l3 = 0L;
        long l2 = 0L;
        long l1 = 0L;
        float f = 0.0F;
        do
        {
            if (parcel.dataPosition() < l)
            {
                int i1 = parcel.readInt();
                switch (0xffff & i1)
                {
                default:
                    SafeParcelReader.skipUnknownField(parcel, i1);
                    break;

                case 1: // '\001'
                    j = SafeParcelReader.readInt(parcel, i1);
                    break;

                case 1000: 
                    k = SafeParcelReader.readInt(parcel, i1);
                    break;

                case 2: // '\002'
                    i = SafeParcelReader.readInt(parcel, i1);
                    break;

                case 3: // '\003'
                    l4 = SafeParcelReader.readLong(parcel, i1);
                    break;

                case 4: // '\004'
                    l3 = SafeParcelReader.readLong(parcel, i1);
                    break;

                case 5: // '\005'
                    l2 = SafeParcelReader.readLong(parcel, i1);
                    break;

                case 6: // '\006'
                    l1 = SafeParcelReader.readLong(parcel, i1);
                    break;

                case 7: // '\007'
                    f = SafeParcelReader.readFloat(parcel, i1);
                    break;
                }
            } else
            if (parcel.dataPosition() != l)
            {
                throw new com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ParseException((new StringBuilder("Overread allowed size end=")).append(l).toString(), parcel);
            } else
            {
                return new FloorChangeEvent(k, j, i, l4, l3, l2, l1, f);
            }
        } while (true);
    }

    public final volatile Object[] newArray(int i)
    {
        return new FloorChangeEvent[i];
    }
}
