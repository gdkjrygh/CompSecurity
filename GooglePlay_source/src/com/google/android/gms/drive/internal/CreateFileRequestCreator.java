// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.drive.Contents;
import com.google.android.gms.drive.DriveId;
import com.google.android.gms.drive.metadata.internal.MetadataBundle;

// Referenced classes of package com.google.android.gms.drive.internal:
//            CreateFileRequest

public final class CreateFileRequestCreator
    implements android.os.Parcelable.Creator
{

    public CreateFileRequestCreator()
    {
    }

    static void writeToParcel(CreateFileRequest createfilerequest, Parcel parcel, int i)
    {
        int j = SafeParcelWriter.beginVariableData(parcel, 20293);
        SafeParcelWriter.writeInt(parcel, 1, createfilerequest.mVersionCode);
        SafeParcelWriter.writeParcelable(parcel, 2, createfilerequest.mParentDriveId, i, false);
        SafeParcelWriter.writeParcelable(parcel, 3, createfilerequest.mMetadata, i, false);
        SafeParcelWriter.writeParcelable(parcel, 4, createfilerequest.mContentsReference, i, false);
        SafeParcelWriter.writeIntegerObject$1ed7098(parcel, 5, createfilerequest.mFileType);
        SafeParcelWriter.writeBoolean(parcel, 6, createfilerequest.mSendEventOnCompletion);
        SafeParcelWriter.writeString(parcel, 7, createfilerequest.mTrackingTag, false);
        SafeParcelWriter.writeInt(parcel, 8, createfilerequest.mCreateStrategy);
        SafeParcelWriter.writeInt(parcel, 9, createfilerequest.mOpenContentsRequestId);
        SafeParcelWriter.finishVariableData(parcel, j);
    }

    public final volatile Object createFromParcel(Parcel parcel)
    {
        int i = 0;
        String s = null;
        int l = SafeParcelReader.validateObjectHeader(parcel);
        int j = 0;
        boolean flag = false;
        Integer integer = null;
        Contents contents = null;
        MetadataBundle metadatabundle = null;
        DriveId driveid = null;
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
                    k = SafeParcelReader.readInt(parcel, i1);
                    break;

                case 2: // '\002'
                    driveid = (DriveId)SafeParcelReader.createParcelable(parcel, i1, DriveId.CREATOR);
                    break;

                case 3: // '\003'
                    metadatabundle = (MetadataBundle)SafeParcelReader.createParcelable(parcel, i1, MetadataBundle.CREATOR);
                    break;

                case 4: // '\004'
                    contents = (Contents)SafeParcelReader.createParcelable(parcel, i1, Contents.CREATOR);
                    break;

                case 5: // '\005'
                    integer = SafeParcelReader.readIntegerObject(parcel, i1);
                    break;

                case 6: // '\006'
                    flag = SafeParcelReader.readBoolean(parcel, i1);
                    break;

                case 7: // '\007'
                    s = SafeParcelReader.createString(parcel, i1);
                    break;

                case 8: // '\b'
                    j = SafeParcelReader.readInt(parcel, i1);
                    break;

                case 9: // '\t'
                    i = SafeParcelReader.readInt(parcel, i1);
                    break;
                }
            } else
            if (parcel.dataPosition() != l)
            {
                throw new com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ParseException((new StringBuilder("Overread allowed size end=")).append(l).toString(), parcel);
            } else
            {
                return new CreateFileRequest(k, driveid, metadatabundle, contents, integer, flag, s, j, i);
            }
        } while (true);
    }

    public final volatile Object[] newArray(int i)
    {
        return new CreateFileRequest[i];
    }
}
