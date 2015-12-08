// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.drive.DriveId;

// Referenced classes of package com.google.android.gms.drive.internal:
//            AuthorizeAccessRequest

public final class AuthorizeAccessRequestCreator
    implements android.os.Parcelable.Creator
{

    public AuthorizeAccessRequestCreator()
    {
    }

    static void writeToParcel(AuthorizeAccessRequest authorizeaccessrequest, Parcel parcel, int i)
    {
        int j = SafeParcelWriter.beginVariableData(parcel, 20293);
        SafeParcelWriter.writeInt(parcel, 1, authorizeaccessrequest.mVersionCode);
        SafeParcelWriter.writeLong(parcel, 2, authorizeaccessrequest.mProjectNumber);
        SafeParcelWriter.writeParcelable(parcel, 3, authorizeaccessrequest.mDriveId, i, false);
        SafeParcelWriter.finishVariableData(parcel, j);
    }

    public final volatile Object createFromParcel(Parcel parcel)
    {
        int j = SafeParcelReader.validateObjectHeader(parcel);
        int i = 0;
        long l = 0L;
        DriveId driveid = null;
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
                    l = SafeParcelReader.readLong(parcel, k);
                    break;

                case 3: // '\003'
                    driveid = (DriveId)SafeParcelReader.createParcelable(parcel, k, DriveId.CREATOR);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ParseException((new StringBuilder("Overread allowed size end=")).append(j).toString(), parcel);
            } else
            {
                return new AuthorizeAccessRequest(i, l, driveid);
            }
        } while (true);
    }

    public final volatile Object[] newArray(int i)
    {
        return new AuthorizeAccessRequest[i];
    }
}
