// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.location.places;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

// Referenced classes of package com.google.android.gms.location.places:
//            PlaceRequest, PlaceFilter

public final class PlaceRequestCreator
    implements android.os.Parcelable.Creator
{

    public PlaceRequestCreator()
    {
    }

    static void writeToParcel(PlaceRequest placerequest, Parcel parcel, int i)
    {
        int j = SafeParcelWriter.beginVariableData(parcel, 20293);
        SafeParcelWriter.writeInt(parcel, 1000, placerequest.mVersionCode);
        SafeParcelWriter.writeParcelable(parcel, 2, placerequest.mFilter, i, false);
        SafeParcelWriter.writeLong(parcel, 3, placerequest.mInterval);
        SafeParcelWriter.writeInt(parcel, 4, placerequest.mPriority);
        SafeParcelWriter.writeLong(parcel, 5, placerequest.mExpireAt);
        SafeParcelWriter.finishVariableData(parcel, j);
    }

    public final volatile Object createFromParcel(Parcel parcel)
    {
        int k = SafeParcelReader.validateObjectHeader(parcel);
        int j = 0;
        PlaceFilter placefilter = null;
        long l2 = PlaceRequest.DEFAULT_INTERVAL;
        int i = 102;
        long l1 = 0x7fffffffffffffffL;
        do
        {
            if (parcel.dataPosition() < k)
            {
                int l = parcel.readInt();
                switch (0xffff & l)
                {
                default:
                    SafeParcelReader.skipUnknownField(parcel, l);
                    break;

                case 1000: 
                    j = SafeParcelReader.readInt(parcel, l);
                    break;

                case 2: // '\002'
                    placefilter = (PlaceFilter)SafeParcelReader.createParcelable(parcel, l, PlaceFilter.CREATOR);
                    break;

                case 3: // '\003'
                    l2 = SafeParcelReader.readLong(parcel, l);
                    break;

                case 4: // '\004'
                    i = SafeParcelReader.readInt(parcel, l);
                    break;

                case 5: // '\005'
                    l1 = SafeParcelReader.readLong(parcel, l);
                    break;
                }
            } else
            if (parcel.dataPosition() != k)
            {
                throw new com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ParseException((new StringBuilder("Overread allowed size end=")).append(k).toString(), parcel);
            } else
            {
                return new PlaceRequest(j, placefilter, l2, i, l1);
            }
        } while (true);
    }

    public final volatile Object[] newArray(int i)
    {
        return new PlaceRequest[i];
    }
}
