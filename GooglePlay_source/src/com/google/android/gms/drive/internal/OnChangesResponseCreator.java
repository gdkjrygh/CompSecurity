// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive.internal;

import android.os.Parcel;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.drive.ChangeSequenceNumber;
import com.google.android.gms.drive.DriveId;

// Referenced classes of package com.google.android.gms.drive.internal:
//            OnChangesResponse

public final class OnChangesResponseCreator
    implements android.os.Parcelable.Creator
{

    public OnChangesResponseCreator()
    {
    }

    static void writeToParcel(OnChangesResponse onchangesresponse, Parcel parcel, int i)
    {
        int j = SafeParcelWriter.beginVariableData(parcel, 20293);
        SafeParcelWriter.writeInt(parcel, 1, onchangesresponse.mVersionCode);
        SafeParcelWriter.writeParcelable(parcel, 2, onchangesresponse.mNewOrModifiedResourcesData, i, false);
        SafeParcelWriter.writeTypedList(parcel, 3, onchangesresponse.mDeleted, false);
        SafeParcelWriter.writeParcelable(parcel, 4, onchangesresponse.mLastChangeSequenceNumber, i, false);
        SafeParcelWriter.writeBoolean(parcel, 5, onchangesresponse.mMoreChangesExist);
        SafeParcelWriter.finishVariableData(parcel, j);
    }

    public final volatile Object createFromParcel(Parcel parcel)
    {
        boolean flag = false;
        ChangeSequenceNumber changesequencenumber = null;
        int j = SafeParcelReader.validateObjectHeader(parcel);
        java.util.ArrayList arraylist = null;
        DataHolder dataholder = null;
        int i = 0;
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
                    dataholder = (DataHolder)SafeParcelReader.createParcelable(parcel, k, DataHolder.CREATOR);
                    break;

                case 3: // '\003'
                    arraylist = SafeParcelReader.createTypedList(parcel, k, DriveId.CREATOR);
                    break;

                case 4: // '\004'
                    changesequencenumber = (ChangeSequenceNumber)SafeParcelReader.createParcelable(parcel, k, ChangeSequenceNumber.CREATOR);
                    break;

                case 5: // '\005'
                    flag = SafeParcelReader.readBoolean(parcel, k);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ParseException((new StringBuilder("Overread allowed size end=")).append(j).toString(), parcel);
            } else
            {
                return new OnChangesResponse(i, dataholder, arraylist, changesequencenumber, flag);
            }
        } while (true);
    }

    public final volatile Object[] newArray(int i)
    {
        return new OnChangesResponse[i];
    }
}
