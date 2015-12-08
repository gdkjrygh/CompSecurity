// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.drive.DriveId;

// Referenced classes of package com.google.android.gms.drive.internal:
//            ChangeResourceParentsRequest

public final class ChangeResourceParentsRequestCreator
    implements android.os.Parcelable.Creator
{

    public ChangeResourceParentsRequestCreator()
    {
    }

    static void writeToParcel(ChangeResourceParentsRequest changeresourceparentsrequest, Parcel parcel, int i)
    {
        int j = SafeParcelWriter.beginVariableData(parcel, 20293);
        SafeParcelWriter.writeInt(parcel, 1, changeresourceparentsrequest.mVersionCode);
        SafeParcelWriter.writeParcelable(parcel, 2, changeresourceparentsrequest.mTargetId, i, false);
        SafeParcelWriter.writeTypedList(parcel, 3, changeresourceparentsrequest.mParentIdsToAdd, false);
        SafeParcelWriter.writeTypedList(parcel, 4, changeresourceparentsrequest.mParentIdsToRemove, false);
        SafeParcelWriter.finishVariableData(parcel, j);
    }

    public final volatile Object createFromParcel(Parcel parcel)
    {
        int j = SafeParcelReader.validateObjectHeader(parcel);
        java.util.ArrayList arraylist = null;
        DriveId driveid = null;
        int i = 0;
        java.util.ArrayList arraylist1 = null;
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
                    arraylist = SafeParcelReader.createTypedList(parcel, k, DriveId.CREATOR);
                    break;

                case 4: // '\004'
                    arraylist1 = SafeParcelReader.createTypedList(parcel, k, DriveId.CREATOR);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ParseException((new StringBuilder("Overread allowed size end=")).append(j).toString(), parcel);
            } else
            {
                return new ChangeResourceParentsRequest(i, driveid, arraylist, arraylist1);
            }
        } while (true);
    }

    public final volatile Object[] newArray(int i)
    {
        return new ChangeResourceParentsRequest[i];
    }
}
