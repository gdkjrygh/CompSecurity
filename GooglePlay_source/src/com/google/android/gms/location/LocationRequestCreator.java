// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.location;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

// Referenced classes of package com.google.android.gms.location:
//            LocationRequest

public final class LocationRequestCreator
    implements android.os.Parcelable.Creator
{

    public LocationRequestCreator()
    {
    }

    static void writeToParcel$1fef69e8(LocationRequest locationrequest, Parcel parcel)
    {
        int i = SafeParcelWriter.beginVariableData(parcel, 20293);
        SafeParcelWriter.writeInt(parcel, 1, locationrequest.mPriority);
        SafeParcelWriter.writeInt(parcel, 1000, locationrequest.mVersionCode);
        SafeParcelWriter.writeLong(parcel, 2, locationrequest.mInterval);
        SafeParcelWriter.writeLong(parcel, 3, locationrequest.mFastestInterval);
        SafeParcelWriter.writeBoolean(parcel, 4, locationrequest.mExplicitFastestInterval);
        SafeParcelWriter.writeLong(parcel, 5, locationrequest.mExpireAt);
        SafeParcelWriter.writeInt(parcel, 6, locationrequest.mNumUpdates);
        SafeParcelWriter.writeFloat(parcel, 7, locationrequest.mSmallestDisplacement);
        SafeParcelWriter.writeLong(parcel, 8, locationrequest.mMaxWaitTime);
        SafeParcelWriter.finishVariableData(parcel, i);
    }

    public final volatile Object createFromParcel(Parcel parcel)
    {
        int l = SafeParcelReader.validateObjectHeader(parcel);
        int k = 0;
        int j = 102;
        long l4 = 0x36ee80L;
        long l3 = 0x927c0L;
        boolean flag = false;
        long l2 = 0x7fffffffffffffffL;
        int i = 0x7fffffff;
        float f = 0.0F;
        long l1 = 0L;
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
                    l4 = SafeParcelReader.readLong(parcel, i1);
                    break;

                case 3: // '\003'
                    l3 = SafeParcelReader.readLong(parcel, i1);
                    break;

                case 4: // '\004'
                    flag = SafeParcelReader.readBoolean(parcel, i1);
                    break;

                case 5: // '\005'
                    l2 = SafeParcelReader.readLong(parcel, i1);
                    break;

                case 6: // '\006'
                    i = SafeParcelReader.readInt(parcel, i1);
                    break;

                case 7: // '\007'
                    f = SafeParcelReader.readFloat(parcel, i1);
                    break;

                case 8: // '\b'
                    l1 = SafeParcelReader.readLong(parcel, i1);
                    break;
                }
            } else
            if (parcel.dataPosition() != l)
            {
                throw new com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ParseException((new StringBuilder("Overread allowed size end=")).append(l).toString(), parcel);
            } else
            {
                return new LocationRequest(k, j, l4, l3, flag, l2, i, f, l1);
            }
        } while (true);
    }

    public final volatile Object[] newArray(int i)
    {
        return new LocationRequest[i];
    }
}
