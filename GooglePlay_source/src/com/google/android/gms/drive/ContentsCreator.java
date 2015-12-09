// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

// Referenced classes of package com.google.android.gms.drive:
//            Contents, DriveId

public final class ContentsCreator
    implements android.os.Parcelable.Creator
{

    public ContentsCreator()
    {
    }

    static void writeToParcel(Contents contents, Parcel parcel, int i)
    {
        int j = SafeParcelWriter.beginVariableData(parcel, 20293);
        SafeParcelWriter.writeInt(parcel, 1, contents.mVersionCode);
        SafeParcelWriter.writeParcelable(parcel, 2, contents.mParcelFileDescriptor, i, false);
        SafeParcelWriter.writeInt(parcel, 3, contents.mRequestId);
        SafeParcelWriter.writeInt(parcel, 4, contents.mMode);
        SafeParcelWriter.writeParcelable(parcel, 5, contents.mDriveId, i, false);
        SafeParcelWriter.writeBoolean(parcel, 7, contents.mValidForConflictDetection);
        SafeParcelWriter.writeString(parcel, 8, contents.mSignature, false);
        SafeParcelWriter.finishVariableData(parcel, j);
    }

    public final volatile Object createFromParcel(Parcel parcel)
    {
        String s = null;
        boolean flag = false;
        int l = SafeParcelReader.validateObjectHeader(parcel);
        DriveId driveid = null;
        int i = 0;
        int j = 0;
        ParcelFileDescriptor parcelfiledescriptor = null;
        int k = 0;
        do
        {
            if (parcel.dataPosition() < l)
            {
                int i1 = parcel.readInt();
                switch (0xffff & i1)
                {
                case 6: // '\006'
                default:
                    SafeParcelReader.skipUnknownField(parcel, i1);
                    break;

                case 1: // '\001'
                    k = SafeParcelReader.readInt(parcel, i1);
                    break;

                case 2: // '\002'
                    parcelfiledescriptor = (ParcelFileDescriptor)SafeParcelReader.createParcelable(parcel, i1, ParcelFileDescriptor.CREATOR);
                    break;

                case 3: // '\003'
                    j = SafeParcelReader.readInt(parcel, i1);
                    break;

                case 4: // '\004'
                    i = SafeParcelReader.readInt(parcel, i1);
                    break;

                case 5: // '\005'
                    driveid = (DriveId)SafeParcelReader.createParcelable(parcel, i1, DriveId.CREATOR);
                    break;

                case 7: // '\007'
                    flag = SafeParcelReader.readBoolean(parcel, i1);
                    break;

                case 8: // '\b'
                    s = SafeParcelReader.createString(parcel, i1);
                    break;
                }
            } else
            if (parcel.dataPosition() != l)
            {
                throw new com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ParseException((new StringBuilder("Overread allowed size end=")).append(l).toString(), parcel);
            } else
            {
                return new Contents(k, parcelfiledescriptor, j, i, driveid, flag, s);
            }
        } while (true);
    }

    public final volatile Object[] newArray(int i)
    {
        return new Contents[i];
    }
}
