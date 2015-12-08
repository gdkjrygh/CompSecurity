// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

// Referenced classes of package com.google.android.gms.wearable.internal:
//            GetLargeAssetQueueStateResponse, LargeAssetQueueStateParcelable

public final class GetLargeAssetQueueStateResponseCreator
    implements android.os.Parcelable.Creator
{

    public GetLargeAssetQueueStateResponseCreator()
    {
    }

    static void writeToParcel(GetLargeAssetQueueStateResponse getlargeassetqueuestateresponse, Parcel parcel, int i)
    {
        int j = SafeParcelWriter.beginVariableData(parcel, 20293);
        SafeParcelWriter.writeInt(parcel, 1, getlargeassetqueuestateresponse.mVersionCode);
        SafeParcelWriter.writeParcelable(parcel, 2, getlargeassetqueuestateresponse.status, i, false);
        SafeParcelWriter.writeParcelable(parcel, 3, getlargeassetqueuestateresponse.queueState, i, false);
        SafeParcelWriter.finishVariableData(parcel, j);
    }

    public final volatile Object createFromParcel(Parcel parcel)
    {
        int j = SafeParcelReader.validateObjectHeader(parcel);
        Status status = null;
        int i = 0;
        LargeAssetQueueStateParcelable largeassetqueuestateparcelable = null;
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
                    status = (Status)SafeParcelReader.createParcelable(parcel, k, Status.CREATOR);
                    break;

                case 3: // '\003'
                    largeassetqueuestateparcelable = (LargeAssetQueueStateParcelable)SafeParcelReader.createParcelable(parcel, k, LargeAssetQueueStateParcelable.CREATOR);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ParseException((new StringBuilder("Overread allowed size end=")).append(j).toString(), parcel);
            } else
            {
                return new GetLargeAssetQueueStateResponse(i, status, largeassetqueuestateparcelable);
            }
        } while (true);
    }

    public final volatile Object[] newArray(int i)
    {
        return new GetLargeAssetQueueStateResponse[i];
    }
}
