// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive.internal;

import android.os.Parcel;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.drive.DriveId;

// Referenced classes of package com.google.android.gms.drive.internal:
//            LoadRealtimeRequest

public final class LoadRealtimeRequestCreator
    implements android.os.Parcelable.Creator
{

    public LoadRealtimeRequestCreator()
    {
    }

    static void writeToParcel(LoadRealtimeRequest loadrealtimerequest, Parcel parcel, int i)
    {
        int j = SafeParcelWriter.beginVariableData(parcel, 20293);
        SafeParcelWriter.writeInt(parcel, 1, loadrealtimerequest.mVersionCode);
        SafeParcelWriter.writeParcelable(parcel, 2, loadrealtimerequest.mDriveId, i, false);
        SafeParcelWriter.writeBoolean(parcel, 3, loadrealtimerequest.mUseTestMode);
        SafeParcelWriter.writeStringList(parcel, 4, loadrealtimerequest.mCustomTypeWhitelist, false);
        SafeParcelWriter.writeBoolean(parcel, 5, loadrealtimerequest.mIsInMemory);
        SafeParcelWriter.writeParcelable(parcel, 6, loadrealtimerequest.mJson, i, false);
        SafeParcelWriter.writeString(parcel, 7, loadrealtimerequest.mLocalId, false);
        SafeParcelWriter.finishVariableData(parcel, j);
    }

    public final volatile Object createFromParcel(Parcel parcel)
    {
        boolean flag = false;
        String s = null;
        int j = SafeParcelReader.validateObjectHeader(parcel);
        DataHolder dataholder = null;
        java.util.ArrayList arraylist = null;
        boolean flag1 = false;
        DriveId driveid = null;
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
                    driveid = (DriveId)SafeParcelReader.createParcelable(parcel, k, DriveId.CREATOR);
                    break;

                case 3: // '\003'
                    flag1 = SafeParcelReader.readBoolean(parcel, k);
                    break;

                case 4: // '\004'
                    arraylist = SafeParcelReader.createStringList(parcel, k);
                    break;

                case 5: // '\005'
                    flag = SafeParcelReader.readBoolean(parcel, k);
                    break;

                case 6: // '\006'
                    dataholder = (DataHolder)SafeParcelReader.createParcelable(parcel, k, DataHolder.CREATOR);
                    break;

                case 7: // '\007'
                    s = SafeParcelReader.createString(parcel, k);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ParseException((new StringBuilder("Overread allowed size end=")).append(j).toString(), parcel);
            } else
            {
                return new LoadRealtimeRequest(i, driveid, flag1, arraylist, flag, dataholder, s);
            }
        } while (true);
    }

    public final volatile Object[] newArray(int i)
    {
        return new LoadRealtimeRequest[i];
    }
}
