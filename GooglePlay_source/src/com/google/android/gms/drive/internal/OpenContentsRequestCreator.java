// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.drive.DriveId;

// Referenced classes of package com.google.android.gms.drive.internal:
//            OpenContentsRequest

public final class OpenContentsRequestCreator
    implements android.os.Parcelable.Creator
{

    public OpenContentsRequestCreator()
    {
    }

    static void writeToParcel(OpenContentsRequest opencontentsrequest, Parcel parcel, int i)
    {
        int j = SafeParcelWriter.beginVariableData(parcel, 20293);
        SafeParcelWriter.writeInt(parcel, 1, opencontentsrequest.mVersionCode);
        SafeParcelWriter.writeParcelable(parcel, 2, opencontentsrequest.mId, i, false);
        SafeParcelWriter.writeInt(parcel, 3, opencontentsrequest.mMode);
        SafeParcelWriter.writeInt(parcel, 4, opencontentsrequest.mBaseRequestId);
        SafeParcelWriter.finishVariableData(parcel, j);
    }

    public final volatile Object createFromParcel(Parcel parcel)
    {
        int l = SafeParcelReader.validateObjectHeader(parcel);
        int j = 0;
        DriveId driveid = null;
        int i = 0;
        int k = 0;
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
                    i = SafeParcelReader.readInt(parcel, i1);
                    break;

                case 2: // '\002'
                    driveid = (DriveId)SafeParcelReader.createParcelable(parcel, i1, DriveId.CREATOR);
                    break;

                case 3: // '\003'
                    j = SafeParcelReader.readInt(parcel, i1);
                    break;

                case 4: // '\004'
                    k = SafeParcelReader.readInt(parcel, i1);
                    break;
                }
            } else
            if (parcel.dataPosition() != l)
            {
                throw new com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ParseException((new StringBuilder("Overread allowed size end=")).append(l).toString(), parcel);
            } else
            {
                return new OpenContentsRequest(i, driveid, j, k);
            }
        } while (true);
    }

    public final volatile Object[] newArray(int i)
    {
        return new OpenContentsRequest[i];
    }
}
