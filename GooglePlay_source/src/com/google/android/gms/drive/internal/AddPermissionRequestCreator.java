// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.drive.DriveId;
import com.google.android.gms.drive.Permission;

// Referenced classes of package com.google.android.gms.drive.internal:
//            AddPermissionRequest

public final class AddPermissionRequestCreator
    implements android.os.Parcelable.Creator
{

    public AddPermissionRequestCreator()
    {
    }

    static void writeToParcel(AddPermissionRequest addpermissionrequest, Parcel parcel, int i)
    {
        int j = SafeParcelWriter.beginVariableData(parcel, 20293);
        SafeParcelWriter.writeInt(parcel, 1, addpermissionrequest.mVersionCode);
        SafeParcelWriter.writeParcelable(parcel, 2, addpermissionrequest.mDriveId, i, false);
        SafeParcelWriter.writeParcelable(parcel, 3, addpermissionrequest.mPermission, i, false);
        SafeParcelWriter.writeBoolean(parcel, 4, addpermissionrequest.mSendNotificationEmail);
        SafeParcelWriter.writeString(parcel, 5, addpermissionrequest.mEmailMessage, false);
        SafeParcelWriter.writeBoolean(parcel, 6, addpermissionrequest.mSendEventOnCompletion);
        SafeParcelWriter.writeString(parcel, 7, addpermissionrequest.mTrackingTag, false);
        SafeParcelWriter.finishVariableData(parcel, j);
    }

    public final volatile Object createFromParcel(Parcel parcel)
    {
        boolean flag = false;
        String s = null;
        int j = SafeParcelReader.validateObjectHeader(parcel);
        String s1 = null;
        boolean flag1 = false;
        Permission permission = null;
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
                    permission = (Permission)SafeParcelReader.createParcelable(parcel, k, Permission.CREATOR);
                    break;

                case 4: // '\004'
                    flag1 = SafeParcelReader.readBoolean(parcel, k);
                    break;

                case 5: // '\005'
                    s1 = SafeParcelReader.createString(parcel, k);
                    break;

                case 6: // '\006'
                    flag = SafeParcelReader.readBoolean(parcel, k);
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
                return new AddPermissionRequest(i, driveid, permission, flag1, s1, flag, s);
            }
        } while (true);
    }

    public final volatile Object[] newArray(int i)
    {
        return new AddPermissionRequest[i];
    }
}
