// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.location;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

// Referenced classes of package com.google.android.gms.location:
//            GestureEvent

public final class GestureEventCreator
    implements android.os.Parcelable.Creator
{

    public GestureEventCreator()
    {
    }

    static void writeToParcel$124bc2e7(GestureEvent gestureevent, Parcel parcel)
    {
        int i = SafeParcelWriter.beginVariableData(parcel, 20293);
        SafeParcelWriter.writeInt(parcel, 1, gestureevent.mType);
        SafeParcelWriter.writeInt(parcel, 1000, gestureevent.mVersionCode);
        SafeParcelWriter.writeLong(parcel, 2, gestureevent.mTimeSinceEpochMillis);
        SafeParcelWriter.writeLong(parcel, 3, gestureevent.mTimeSinceBootMillis);
        SafeParcelWriter.writeInt(parcel, 4, gestureevent.mCount);
        SafeParcelWriter.writeBoolean(parcel, 5, gestureevent.mIsStart);
        SafeParcelWriter.writeBoolean(parcel, 6, gestureevent.mIsEnd);
        SafeParcelWriter.finishVariableData(parcel, i);
    }

    public final volatile Object createFromParcel(Parcel parcel)
    {
        long l1 = 0L;
        boolean flag = false;
        int l = SafeParcelReader.validateObjectHeader(parcel);
        boolean flag1 = false;
        int i = 0;
        long l2 = 0L;
        int j = 0;
        int k = 0;
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
                    l2 = SafeParcelReader.readLong(parcel, i1);
                    break;

                case 3: // '\003'
                    l1 = SafeParcelReader.readLong(parcel, i1);
                    break;

                case 4: // '\004'
                    i = SafeParcelReader.readInt(parcel, i1);
                    break;

                case 5: // '\005'
                    flag1 = SafeParcelReader.readBoolean(parcel, i1);
                    break;

                case 6: // '\006'
                    flag = SafeParcelReader.readBoolean(parcel, i1);
                    break;
                }
            } else
            if (parcel.dataPosition() != l)
            {
                throw new com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ParseException((new StringBuilder("Overread allowed size end=")).append(l).toString(), parcel);
            } else
            {
                return new GestureEvent(k, j, l2, l1, i, flag1, flag);
            }
        } while (true);
    }

    public final volatile Object[] newArray(int i)
    {
        return new GestureEvent[i];
    }
}
