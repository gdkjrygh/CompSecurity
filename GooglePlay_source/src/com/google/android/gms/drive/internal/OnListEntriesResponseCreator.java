// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive.internal;

import android.os.Parcel;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

// Referenced classes of package com.google.android.gms.drive.internal:
//            OnListEntriesResponse

public final class OnListEntriesResponseCreator
    implements android.os.Parcelable.Creator
{

    public OnListEntriesResponseCreator()
    {
    }

    static void writeToParcel(OnListEntriesResponse onlistentriesresponse, Parcel parcel, int i)
    {
        int j = SafeParcelWriter.beginVariableData(parcel, 20293);
        SafeParcelWriter.writeInt(parcel, 1, onlistentriesresponse.mVersionCode);
        SafeParcelWriter.writeParcelable(parcel, 2, onlistentriesresponse.mEntries, i, false);
        SafeParcelWriter.writeBoolean(parcel, 3, onlistentriesresponse.mMoreEntriesMayExist);
        SafeParcelWriter.finishVariableData(parcel, j);
    }

    public final volatile Object createFromParcel(Parcel parcel)
    {
        int j = SafeParcelReader.validateObjectHeader(parcel);
        DataHolder dataholder = null;
        int i = 0;
        boolean flag = false;
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
                    flag = SafeParcelReader.readBoolean(parcel, k);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ParseException((new StringBuilder("Overread allowed size end=")).append(j).toString(), parcel);
            } else
            {
                return new OnListEntriesResponse(i, dataholder, flag);
            }
        } while (true);
    }

    public final volatile Object[] newArray(int i)
    {
        return new OnListEntriesResponse[i];
    }
}
