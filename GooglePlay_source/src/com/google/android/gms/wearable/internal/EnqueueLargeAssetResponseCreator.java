// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

// Referenced classes of package com.google.android.gms.wearable.internal:
//            EnqueueLargeAssetResponse, LargeAssetQueueEntryParcelable

public final class EnqueueLargeAssetResponseCreator
    implements android.os.Parcelable.Creator
{

    public EnqueueLargeAssetResponseCreator()
    {
    }

    static void writeToParcel(EnqueueLargeAssetResponse enqueuelargeassetresponse, Parcel parcel, int i)
    {
        int j = SafeParcelWriter.beginVariableData(parcel, 20293);
        SafeParcelWriter.writeInt(parcel, 1, enqueuelargeassetresponse.mVersionCode);
        SafeParcelWriter.writeInt(parcel, 2, enqueuelargeassetresponse.statusCode);
        SafeParcelWriter.writeParcelable(parcel, 3, enqueuelargeassetresponse.queueEntry, i, false);
        SafeParcelWriter.finishVariableData(parcel, j);
    }

    public final volatile Object createFromParcel(Parcel parcel)
    {
        int j = 0;
        int k = SafeParcelReader.validateObjectHeader(parcel);
        LargeAssetQueueEntryParcelable largeassetqueueentryparcelable = null;
        int i = 0;
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
                    j = SafeParcelReader.readInt(parcel, l);
                    break;

                case 3: // '\003'
                    largeassetqueueentryparcelable = (LargeAssetQueueEntryParcelable)SafeParcelReader.createParcelable(parcel, l, LargeAssetQueueEntryParcelable.CREATOR);
                    break;
                }
            } else
            if (parcel.dataPosition() != k)
            {
                throw new com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ParseException((new StringBuilder("Overread allowed size end=")).append(k).toString(), parcel);
            } else
            {
                return new EnqueueLargeAssetResponse(i, j, largeassetqueueentryparcelable);
            }
        } while (true);
    }

    public final volatile Object[] newArray(int i)
    {
        return new EnqueueLargeAssetResponse[i];
    }
}
