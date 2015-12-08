// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.drive.DriveFileRange;

// Referenced classes of package com.google.android.gms.drive.internal:
//            OnDownloadProgressResponse

public final class OnDownloadProgressResponseCreator
    implements android.os.Parcelable.Creator
{

    public OnDownloadProgressResponseCreator()
    {
    }

    static void writeToParcel$6043b49e(OnDownloadProgressResponse ondownloadprogressresponse, Parcel parcel)
    {
        int i = SafeParcelWriter.beginVariableData(parcel, 20293);
        SafeParcelWriter.writeInt(parcel, 1, ondownloadprogressresponse.mVersionCode);
        SafeParcelWriter.writeLong(parcel, 2, ondownloadprogressresponse.mBytesLoaded);
        SafeParcelWriter.writeLong(parcel, 3, ondownloadprogressresponse.mBytesExpected);
        SafeParcelWriter.writeInt(parcel, 4, ondownloadprogressresponse.mStatus);
        SafeParcelWriter.writeTypedList(parcel, 5, ondownloadprogressresponse.mRangesAvailable, false);
        SafeParcelWriter.finishVariableData(parcel, i);
    }

    public final volatile Object createFromParcel(Parcel parcel)
    {
        long l1 = 0L;
        int i = 0;
        int k = SafeParcelReader.validateObjectHeader(parcel);
        java.util.ArrayList arraylist = null;
        long l2 = 0L;
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
                    l2 = SafeParcelReader.readLong(parcel, l);
                    break;

                case 3: // '\003'
                    l1 = SafeParcelReader.readLong(parcel, l);
                    break;

                case 4: // '\004'
                    i = SafeParcelReader.readInt(parcel, l);
                    break;

                case 5: // '\005'
                    arraylist = SafeParcelReader.createTypedList(parcel, l, DriveFileRange.CREATOR);
                    break;
                }
            } else
            if (parcel.dataPosition() != k)
            {
                throw new com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ParseException((new StringBuilder("Overread allowed size end=")).append(k).toString(), parcel);
            } else
            {
                return new OnDownloadProgressResponse(j, l2, l1, i, arraylist);
            }
        } while (true);
    }

    public final volatile Object[] newArray(int i)
    {
        return new OnDownloadProgressResponse[i];
    }
}
