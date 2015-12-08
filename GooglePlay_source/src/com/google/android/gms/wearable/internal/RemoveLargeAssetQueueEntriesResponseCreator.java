// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

// Referenced classes of package com.google.android.gms.wearable.internal:
//            RemoveLargeAssetQueueEntriesResponse

public final class RemoveLargeAssetQueueEntriesResponseCreator
    implements android.os.Parcelable.Creator
{

    public RemoveLargeAssetQueueEntriesResponseCreator()
    {
    }

    static void writeToParcel(RemoveLargeAssetQueueEntriesResponse removelargeassetqueueentriesresponse, Parcel parcel, int i)
    {
        int j = SafeParcelWriter.beginVariableData(parcel, 20293);
        SafeParcelWriter.writeInt(parcel, 1, removelargeassetqueueentriesresponse.versionCode);
        SafeParcelWriter.writeParcelable(parcel, 2, removelargeassetqueueentriesresponse.status, i, false);
        SafeParcelWriter.writeInt(parcel, 3, removelargeassetqueueentriesresponse.numDeleted);
        SafeParcelWriter.finishVariableData(parcel, j);
    }

    public final volatile Object createFromParcel(Parcel parcel)
    {
        int k = SafeParcelReader.validateObjectHeader(parcel);
        Status status = null;
        int i = 0;
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
                    i = SafeParcelReader.readInt(parcel, l);
                    break;

                case 2: // '\002'
                    status = (Status)SafeParcelReader.createParcelable(parcel, l, Status.CREATOR);
                    break;

                case 3: // '\003'
                    j = SafeParcelReader.readInt(parcel, l);
                    break;
                }
            } else
            if (parcel.dataPosition() != k)
            {
                throw new com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ParseException((new StringBuilder("Overread allowed size end=")).append(k).toString(), parcel);
            } else
            {
                return new RemoveLargeAssetQueueEntriesResponse(i, status, j);
            }
        } while (true);
    }

    public final volatile Object[] newArray(int i)
    {
        return new RemoveLargeAssetQueueEntriesResponse[i];
    }
}
