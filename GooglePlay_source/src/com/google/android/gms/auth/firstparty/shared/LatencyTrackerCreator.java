// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.auth.firstparty.shared;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

// Referenced classes of package com.google.android.gms.auth.firstparty.shared:
//            LatencyTracker

public final class LatencyTrackerCreator
    implements android.os.Parcelable.Creator
{

    public LatencyTrackerCreator()
    {
    }

    static void writeToParcel(LatencyTracker latencytracker, Parcel parcel, int i)
    {
        int j = SafeParcelWriter.beginVariableData(parcel, 20293);
        SafeParcelWriter.writeInt(parcel, 1, latencytracker.mVersion);
        SafeParcelWriter.writeString(parcel, 2, latencytracker.mName, false);
        SafeParcelWriter.writeLong(parcel, 3, latencytracker.mStartRealtimeMillis);
        SafeParcelWriter.writeParcelable(parcel, 4, latencytracker.parent, i, false);
        SafeParcelWriter.finishVariableData(parcel, j);
    }

    public final volatile Object createFromParcel(Parcel parcel)
    {
        LatencyTracker latencytracker = null;
        int j = SafeParcelReader.validateObjectHeader(parcel);
        int i = 0;
        long l = 0L;
        String s = null;
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
                    s = SafeParcelReader.createString(parcel, k);
                    break;

                case 3: // '\003'
                    l = SafeParcelReader.readLong(parcel, k);
                    break;

                case 4: // '\004'
                    latencytracker = (LatencyTracker)SafeParcelReader.createParcelable(parcel, k, LatencyTracker.CREATOR);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ParseException((new StringBuilder("Overread allowed size end=")).append(j).toString(), parcel);
            } else
            {
                return new LatencyTracker(i, s, l, latencytracker);
            }
        } while (true);
    }

    public final volatile Object[] newArray(int i)
    {
        return new LatencyTracker[i];
    }
}
