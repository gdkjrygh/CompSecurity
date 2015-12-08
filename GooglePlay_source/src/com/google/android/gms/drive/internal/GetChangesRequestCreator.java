// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.drive.ChangeSequenceNumber;
import com.google.android.gms.drive.DriveSpace;

// Referenced classes of package com.google.android.gms.drive.internal:
//            GetChangesRequest

public final class GetChangesRequestCreator
    implements android.os.Parcelable.Creator
{

    public GetChangesRequestCreator()
    {
    }

    static void writeToParcel(GetChangesRequest getchangesrequest, Parcel parcel, int i)
    {
        int j = SafeParcelWriter.beginVariableData(parcel, 20293);
        SafeParcelWriter.writeInt(parcel, 1, getchangesrequest.mVersionCode);
        SafeParcelWriter.writeParcelable(parcel, 2, getchangesrequest.mFromSequenceNumber, i, false);
        SafeParcelWriter.writeInt(parcel, 3, getchangesrequest.mMaxResults);
        SafeParcelWriter.writeTypedList(parcel, 4, getchangesrequest.mSpacesList, false);
        SafeParcelWriter.writeBoolean(parcel, 5, getchangesrequest.mIncludeUnsubscribed);
        SafeParcelWriter.finishVariableData(parcel, j);
    }

    public final volatile Object createFromParcel(Parcel parcel)
    {
        java.util.ArrayList arraylist = null;
        boolean flag = false;
        int k = SafeParcelReader.validateObjectHeader(parcel);
        int i = 0;
        ChangeSequenceNumber changesequencenumber = null;
        int j = 0;
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

                case 1: // '\001'
                    j = SafeParcelReader.readInt(parcel, l);
                    break;

                case 2: // '\002'
                    changesequencenumber = (ChangeSequenceNumber)SafeParcelReader.createParcelable(parcel, l, ChangeSequenceNumber.CREATOR);
                    break;

                case 3: // '\003'
                    i = SafeParcelReader.readInt(parcel, l);
                    break;

                case 4: // '\004'
                    arraylist = SafeParcelReader.createTypedList(parcel, l, DriveSpace.CREATOR);
                    break;

                case 5: // '\005'
                    flag = SafeParcelReader.readBoolean(parcel, l);
                    break;
                }
            } else
            if (parcel.dataPosition() != k)
            {
                throw new com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ParseException((new StringBuilder("Overread allowed size end=")).append(k).toString(), parcel);
            } else
            {
                return new GetChangesRequest(j, changesequencenumber, i, arraylist, flag);
            }
        } while (true);
    }

    public final volatile Object[] newArray(int i)
    {
        return new GetChangesRequest[i];
    }
}
