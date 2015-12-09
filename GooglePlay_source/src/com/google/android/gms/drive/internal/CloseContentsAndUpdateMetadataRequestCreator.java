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
//            CloseContentsAndUpdateMetadataRequest

public final class CloseContentsAndUpdateMetadataRequestCreator
    implements android.os.Parcelable.Creator
{

    public CloseContentsAndUpdateMetadataRequestCreator()
    {
    }

    static void writeToParcel(CloseContentsAndUpdateMetadataRequest closecontentsandupdatemetadatarequest, Parcel parcel, int i)
    {
        int j = SafeParcelWriter.beginVariableData(parcel, 20293);
        SafeParcelWriter.writeInt(parcel, 1, closecontentsandupdatemetadatarequest.mVersionCode);
        SafeParcelWriter.writeParcelable(parcel, 2, closecontentsandupdatemetadatarequest.mId, i, false);
        SafeParcelWriter.writeParcelable(parcel, 3, closecontentsandupdatemetadatarequest.mMetadataChangeSet, i, false);
        SafeParcelWriter.writeParcelable(parcel, 4, closecontentsandupdatemetadatarequest.mContentsReference, i, false);
        SafeParcelWriter.writeBoolean(parcel, 5, closecontentsandupdatemetadatarequest.mNotifyOnCompletion);
        SafeParcelWriter.writeString(parcel, 6, closecontentsandupdatemetadatarequest.mTrackingTag, false);
        SafeParcelWriter.writeInt(parcel, 7, closecontentsandupdatemetadatarequest.mCommitStrategy);
        SafeParcelWriter.writeInt(parcel, 8, closecontentsandupdatemetadatarequest.mContentsRequestId);
        SafeParcelWriter.writeBoolean(parcel, 9, closecontentsandupdatemetadatarequest.mIsContentsValidForConflictDetection);
        SafeParcelWriter.finishVariableData(parcel, j);
    }

    public final volatile Object createFromParcel(Parcel parcel)
    {
        String s = null;
        boolean flag = false;
        int l = SafeParcelReader.validateObjectHeader(parcel);
        int i = 0;
        int j = 0;
        boolean flag1 = false;
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
                    flag1 = SafeParcelReader.readBoolean(parcel, i1);
                    break;

                case 6: // '\006'
                    s = SafeParcelReader.createString(parcel, i1);
                    break;

                case 7: // '\007'
                    j = SafeParcelReader.readInt(parcel, i1);
                    break;

                case 8: // '\b'
                    i = SafeParcelReader.readInt(parcel, i1);
                    break;

                case 9: // '\t'
                    flag = SafeParcelReader.readBoolean(parcel, i1);
                    break;
                }
            } else
            if (parcel.dataPosition() != l)
            {
                throw new com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ParseException((new StringBuilder("Overread allowed size end=")).append(l).toString(), parcel);
            } else
            {
                return new CloseContentsAndUpdateMetadataRequest(k, driveid, metadatabundle, contents, flag1, s, j, i, flag);
            }
        } while (true);
    }

    public final volatile Object[] newArray(int i)
    {
        return new CloseContentsAndUpdateMetadataRequest[i];
    }
}
