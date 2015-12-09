// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive.events;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.drive.DriveId;

// Referenced classes of package com.google.android.gms.drive.events:
//            ProgressEvent

public final class ProgressEventCreator
    implements android.os.Parcelable.Creator
{

    public ProgressEventCreator()
    {
    }

    static void writeToParcel(ProgressEvent progressevent, Parcel parcel, int i)
    {
        int j = SafeParcelWriter.beginVariableData(parcel, 20293);
        SafeParcelWriter.writeInt(parcel, 1, progressevent.mVersionCode);
        SafeParcelWriter.writeParcelable(parcel, 2, progressevent.mDriveId, i, false);
        SafeParcelWriter.writeInt(parcel, 3, progressevent.mStatus);
        SafeParcelWriter.writeLong(parcel, 4, progressevent.mBytesTransferred);
        SafeParcelWriter.writeLong(parcel, 5, progressevent.mTotalBytes);
        SafeParcelWriter.writeInt(parcel, 6, progressevent.mType);
        SafeParcelWriter.finishVariableData(parcel, j);
    }

    public final volatile Object createFromParcel(Parcel parcel)
    {
        long l1 = 0L;
        int i = 0;
        int l = SafeParcelReader.validateObjectHeader(parcel);
        DriveId driveid = null;
        long l2 = 0L;
        int j = 0;
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
                    j = SafeParcelReader.readInt(parcel, i1);
                    break;

                case 4: // '\004'
                    l2 = SafeParcelReader.readLong(parcel, i1);
                    break;

                case 5: // '\005'
                    l1 = SafeParcelReader.readLong(parcel, i1);
                    break;

                case 6: // '\006'
                    i = SafeParcelReader.readInt(parcel, i1);
                    break;
                }
            } else
            if (parcel.dataPosition() != l)
            {
                throw new com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ParseException((new StringBuilder("Overread allowed size end=")).append(l).toString(), parcel);
            } else
            {
                return new ProgressEvent(k, driveid, j, l2, l1, i);
            }
        } while (true);
    }

    public final volatile Object[] newArray(int i)
    {
        return new ProgressEvent[i];
    }
}
