// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.drive.DriveId;

// Referenced classes of package com.google.android.gms.drive.internal:
//            UpdatePermissionRequest

public final class UpdatePermissionRequestCreator
    implements android.os.Parcelable.Creator
{

    public UpdatePermissionRequestCreator()
    {
    }

    static void writeToParcel(UpdatePermissionRequest updatepermissionrequest, Parcel parcel, int i)
    {
        int j = SafeParcelWriter.beginVariableData(parcel, 20293);
        SafeParcelWriter.writeInt(parcel, 1, updatepermissionrequest.mVersionCode);
        SafeParcelWriter.writeParcelable(parcel, 2, updatepermissionrequest.mDriveId, i, false);
        SafeParcelWriter.writeString(parcel, 3, updatepermissionrequest.mAccountIdentifier, false);
        SafeParcelWriter.writeInt(parcel, 4, updatepermissionrequest.mNewRole);
        SafeParcelWriter.writeBoolean(parcel, 5, updatepermissionrequest.mSendEventOnCompletion);
        SafeParcelWriter.writeString(parcel, 6, updatepermissionrequest.mTrackingTag, false);
        SafeParcelWriter.finishVariableData(parcel, j);
    }

    public final volatile Object createFromParcel(Parcel parcel)
    {
        String s = null;
        boolean flag = false;
        int k = SafeParcelReader.validateObjectHeader(parcel);
        int i = 0;
        String s1 = null;
        DriveId driveid = null;
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
                    driveid = (DriveId)SafeParcelReader.createParcelable(parcel, l, DriveId.CREATOR);
                    break;

                case 3: // '\003'
                    s1 = SafeParcelReader.createString(parcel, l);
                    break;

                case 4: // '\004'
                    i = SafeParcelReader.readInt(parcel, l);
                    break;

                case 5: // '\005'
                    flag = SafeParcelReader.readBoolean(parcel, l);
                    break;

                case 6: // '\006'
                    s = SafeParcelReader.createString(parcel, l);
                    break;
                }
            } else
            if (parcel.dataPosition() != k)
            {
                throw new com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ParseException((new StringBuilder("Overread allowed size end=")).append(k).toString(), parcel);
            } else
            {
                return new UpdatePermissionRequest(j, driveid, s1, i, flag, s);
            }
        } while (true);
    }

    public final volatile Object[] newArray(int i)
    {
        return new UpdatePermissionRequest[i];
    }
}
