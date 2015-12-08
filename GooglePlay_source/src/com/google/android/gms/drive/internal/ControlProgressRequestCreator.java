// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.drive.DriveId;

// Referenced classes of package com.google.android.gms.drive.internal:
//            ControlProgressRequest

public final class ControlProgressRequestCreator
    implements android.os.Parcelable.Creator
{

    public ControlProgressRequestCreator()
    {
    }

    static void writeToParcel(ControlProgressRequest controlprogressrequest, Parcel parcel, int i)
    {
        int j = SafeParcelWriter.beginVariableData(parcel, 20293);
        SafeParcelWriter.writeInt(parcel, 1, controlprogressrequest.mVersionCode);
        SafeParcelWriter.writeInt(parcel, 2, controlprogressrequest.mControllerType);
        SafeParcelWriter.writeInt(parcel, 3, controlprogressrequest.mMethodCode);
        SafeParcelWriter.writeParcelable(parcel, 4, controlprogressrequest.mDriveId, i, false);
        SafeParcelWriter.finishVariableData(parcel, j);
    }

    public final volatile Object createFromParcel(Parcel parcel)
    {
        int k = 0;
        int l = SafeParcelReader.validateObjectHeader(parcel);
        DriveId driveid = null;
        int j = 0;
        int i = 0;
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
                    j = SafeParcelReader.readInt(parcel, i1);
                    break;

                case 3: // '\003'
                    k = SafeParcelReader.readInt(parcel, i1);
                    break;

                case 4: // '\004'
                    driveid = (DriveId)SafeParcelReader.createParcelable(parcel, i1, DriveId.CREATOR);
                    break;
                }
            } else
            if (parcel.dataPosition() != l)
            {
                throw new com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ParseException((new StringBuilder("Overread allowed size end=")).append(l).toString(), parcel);
            } else
            {
                return new ControlProgressRequest(i, j, k, driveid);
            }
        } while (true);
    }

    public final volatile Object[] newArray(int i)
    {
        return new ControlProgressRequest[i];
    }
}
