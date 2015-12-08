// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.location.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

// Referenced classes of package com.google.android.gms.location.internal:
//            ParcelableGeofence

public final class ParcelableGeofenceCreator
    implements android.os.Parcelable.Creator
{

    public ParcelableGeofenceCreator()
    {
    }

    static void writeToParcel$3125d07d(ParcelableGeofence parcelablegeofence, Parcel parcel)
    {
        int i = SafeParcelWriter.beginVariableData(parcel, 20293);
        SafeParcelWriter.writeString(parcel, 1, parcelablegeofence.mRequestId, false);
        SafeParcelWriter.writeInt(parcel, 1000, parcelablegeofence.mVersionCode);
        SafeParcelWriter.writeLong(parcel, 2, parcelablegeofence.mExpirationTime);
        short word0 = parcelablegeofence.mType;
        SafeParcelWriter.writeHeader(parcel, 3, 4);
        parcel.writeInt(word0);
        SafeParcelWriter.writeDouble(parcel, 4, parcelablegeofence.mLatitude);
        SafeParcelWriter.writeDouble(parcel, 5, parcelablegeofence.mLongitude);
        SafeParcelWriter.writeFloat(parcel, 6, parcelablegeofence.mRadius);
        SafeParcelWriter.writeInt(parcel, 7, parcelablegeofence.mTransitionTypes);
        SafeParcelWriter.writeInt(parcel, 8, parcelablegeofence.mNotificationResponsiveness);
        SafeParcelWriter.writeInt(parcel, 9, parcelablegeofence.mLoiteringDelayMillis);
        SafeParcelWriter.finishVariableData(parcel, i);
    }

    public final volatile Object createFromParcel(Parcel parcel)
    {
        int i1 = SafeParcelReader.validateObjectHeader(parcel);
        int l = 0;
        String s = null;
        int k = 0;
        short word0 = 0;
        double d1 = 0.0D;
        double d = 0.0D;
        float f = 0.0F;
        long l1 = 0L;
        int j = 0;
        int i = -1;
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
                    s = SafeParcelReader.createString(parcel, j1);
                    break;

                case 1000: 
                    l = SafeParcelReader.readInt(parcel, j1);
                    break;

                case 2: // '\002'
                    l1 = SafeParcelReader.readLong(parcel, j1);
                    break;

                case 3: // '\003'
                    SafeParcelReader.readAndEnforceSize(parcel, j1, 4);
                    word0 = (short)parcel.readInt();
                    break;

                case 4: // '\004'
                    d1 = SafeParcelReader.readDouble(parcel, j1);
                    break;

                case 5: // '\005'
                    d = SafeParcelReader.readDouble(parcel, j1);
                    break;

                case 6: // '\006'
                    f = SafeParcelReader.readFloat(parcel, j1);
                    break;

                case 7: // '\007'
                    k = SafeParcelReader.readInt(parcel, j1);
                    break;

                case 8: // '\b'
                    j = SafeParcelReader.readInt(parcel, j1);
                    break;

                case 9: // '\t'
                    i = SafeParcelReader.readInt(parcel, j1);
                    break;
                }
            } else
            if (parcel.dataPosition() != i1)
            {
                throw new com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ParseException((new StringBuilder("Overread allowed size end=")).append(i1).toString(), parcel);
            } else
            {
                return new ParcelableGeofence(l, s, k, word0, d1, d, f, l1, j, i);
            }
        } while (true);
    }

    public final volatile Object[] newArray(int i)
    {
        return new ParcelableGeofence[i];
    }
}
