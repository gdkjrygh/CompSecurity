// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.stats;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

// Referenced classes of package com.google.android.gms.common.stats:
//            AlarmEvent

public final class AlarmEventCreator
    implements android.os.Parcelable.Creator
{

    public AlarmEventCreator()
    {
    }

    static void writeToParcel$30c10467(AlarmEvent alarmevent, Parcel parcel)
    {
        int i = SafeParcelWriter.beginVariableData(parcel, 20293);
        SafeParcelWriter.writeInt(parcel, 1, alarmevent.mVersionCode);
        SafeParcelWriter.writeLong(parcel, 2, alarmevent.mTimeMillis);
        SafeParcelWriter.writeInt(parcel, 3, alarmevent.mType);
        SafeParcelWriter.writeString(parcel, 4, alarmevent.mName, false);
        SafeParcelWriter.writeLong(parcel, 5, alarmevent.mTriggerAfterMillis);
        SafeParcelWriter.writeLong(parcel, 6, alarmevent.mWindowMillis);
        SafeParcelWriter.writeLong(parcel, 7, alarmevent.mIntervalMillis);
        SafeParcelWriter.writeStringList(parcel, 8, alarmevent.mCallingPackages, false);
        SafeParcelWriter.writeInt(parcel, 9, alarmevent.mFlags);
        SafeParcelWriter.writeInt(parcel, 10, alarmevent.mDeviceState);
        SafeParcelWriter.writeString(parcel, 11, alarmevent.mHostPackageName, false);
        SafeParcelWriter.writeFloat(parcel, 12, alarmevent.mPowerPercentage);
        SafeParcelWriter.finishVariableData(parcel, i);
    }

    public final volatile Object createFromParcel(Parcel parcel)
    {
        int i1 = SafeParcelReader.validateObjectHeader(parcel);
        int l = 0;
        long l4 = 0L;
        int k = 0;
        String s1 = null;
        long l3 = 0L;
        long l2 = 0L;
        long l1 = 0L;
        java.util.ArrayList arraylist = null;
        int j = 0;
        int i = 0;
        String s = null;
        float f = 0.0F;
        do
        {
            if (parcel.dataPosition() < i1)
            {
                int j1 = parcel.readInt();
                switch (0xffff & j1)
                {
                default:
                    SafeParcelReader.skipUnknownField(parcel, j1);
                    break;

                case 1: // '\001'
                    l = SafeParcelReader.readInt(parcel, j1);
                    break;

                case 2: // '\002'
                    l4 = SafeParcelReader.readLong(parcel, j1);
                    break;

                case 3: // '\003'
                    k = SafeParcelReader.readInt(parcel, j1);
                    break;

                case 4: // '\004'
                    s1 = SafeParcelReader.createString(parcel, j1);
                    break;

                case 5: // '\005'
                    l3 = SafeParcelReader.readLong(parcel, j1);
                    break;

                case 6: // '\006'
                    l2 = SafeParcelReader.readLong(parcel, j1);
                    break;

                case 7: // '\007'
                    l1 = SafeParcelReader.readLong(parcel, j1);
                    break;

                case 8: // '\b'
                    arraylist = SafeParcelReader.createStringList(parcel, j1);
                    break;

                case 9: // '\t'
                    j = SafeParcelReader.readInt(parcel, j1);
                    break;

                case 10: // '\n'
                    i = SafeParcelReader.readInt(parcel, j1);
                    break;

                case 11: // '\013'
                    s = SafeParcelReader.createString(parcel, j1);
                    break;

                case 12: // '\f'
                    f = SafeParcelReader.readFloat(parcel, j1);
                    break;
                }
            } else
            if (parcel.dataPosition() != i1)
            {
                throw new com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ParseException((new StringBuilder("Overread allowed size end=")).append(i1).toString(), parcel);
            } else
            {
                return new AlarmEvent(l, l4, k, s1, l3, l2, l1, arraylist, j, i, s, f);
            }
        } while (true);
    }

    public final volatile Object[] newArray(int i)
    {
        return new AlarmEvent[i];
    }
}
