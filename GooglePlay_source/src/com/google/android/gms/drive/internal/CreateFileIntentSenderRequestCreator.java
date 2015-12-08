// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.drive.DriveId;
import com.google.android.gms.drive.metadata.internal.MetadataBundle;

// Referenced classes of package com.google.android.gms.drive.internal:
//            CreateFileIntentSenderRequest

public final class CreateFileIntentSenderRequestCreator
    implements android.os.Parcelable.Creator
{

    public CreateFileIntentSenderRequestCreator()
    {
    }

    static void writeToParcel(CreateFileIntentSenderRequest createfileintentsenderrequest, Parcel parcel, int i)
    {
        int j = SafeParcelWriter.beginVariableData(parcel, 20293);
        SafeParcelWriter.writeInt(parcel, 1, createfileintentsenderrequest.mVersionCode);
        SafeParcelWriter.writeParcelable(parcel, 2, createfileintentsenderrequest.mMetadata, i, false);
        SafeParcelWriter.writeInt(parcel, 3, createfileintentsenderrequest.mRequestId);
        SafeParcelWriter.writeString(parcel, 4, createfileintentsenderrequest.mTitle, false);
        SafeParcelWriter.writeParcelable(parcel, 5, createfileintentsenderrequest.mStartFolder, i, false);
        SafeParcelWriter.writeIntegerObject$1ed7098(parcel, 6, createfileintentsenderrequest.mFileType);
        SafeParcelWriter.finishVariableData(parcel, j);
    }

    public final volatile Object createFromParcel(Parcel parcel)
    {
        int i = 0;
        Integer integer = null;
        int k = SafeParcelReader.validateObjectHeader(parcel);
        DriveId driveid = null;
        String s = null;
        MetadataBundle metadatabundle = null;
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
                    metadatabundle = (MetadataBundle)SafeParcelReader.createParcelable(parcel, l, MetadataBundle.CREATOR);
                    break;

                case 3: // '\003'
                    i = SafeParcelReader.readInt(parcel, l);
                    break;

                case 4: // '\004'
                    s = SafeParcelReader.createString(parcel, l);
                    break;

                case 5: // '\005'
                    driveid = (DriveId)SafeParcelReader.createParcelable(parcel, l, DriveId.CREATOR);
                    break;

                case 6: // '\006'
                    integer = SafeParcelReader.readIntegerObject(parcel, l);
                    break;
                }
            } else
            if (parcel.dataPosition() != k)
            {
                throw new com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ParseException((new StringBuilder("Overread allowed size end=")).append(k).toString(), parcel);
            } else
            {
                return new CreateFileIntentSenderRequest(j, metadatabundle, i, s, driveid, integer);
            }
        } while (true);
    }

    public final volatile Object[] newArray(int i)
    {
        return new CreateFileIntentSenderRequest[i];
    }
}
