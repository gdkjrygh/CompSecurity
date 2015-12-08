// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

// Referenced classes of package com.google.android.gms.wearable.internal:
//            LargeAssetQueueStateChangeParcelable, LargeAssetQueueStateParcelable

public final class LargeAssetQueueStateChangeParcelableCreator
    implements android.os.Parcelable.Creator
{

    public LargeAssetQueueStateChangeParcelableCreator()
    {
    }

    static void writeToParcel(LargeAssetQueueStateChangeParcelable largeassetqueuestatechangeparcelable, Parcel parcel, int i)
    {
        int j = SafeParcelWriter.beginVariableData(parcel, 20293);
        SafeParcelWriter.writeInt(parcel, 1, largeassetqueuestatechangeparcelable.mVersionCode);
        SafeParcelWriter.writeParcelable(parcel, 4, largeassetqueuestatechangeparcelable.queueEntryBufferDataHolder, i, false);
        SafeParcelWriter.writeParcelable(parcel, 5, largeassetqueuestatechangeparcelable.mQueueState, i, false);
        SafeParcelWriter.finishVariableData(parcel, j);
    }

    public final volatile Object createFromParcel(Parcel parcel)
    {
        int j = SafeParcelReader.validateObjectHeader(parcel);
        DataHolder dataholder = null;
        int i = 0;
        LargeAssetQueueStateParcelable largeassetqueuestateparcelable = null;
        do
        {
            if (parcel.dataPosition() < j)
            {
                int k = parcel.readInt();
                switch (0xffff & k)
                {
                case 2: // '\002'
                case 3: // '\003'
                default:
                    SafeParcelReader.skipUnknownField(parcel, k);
                    break;

                case 1: // '\001'
                    i = SafeParcelReader.readInt(parcel, k);
                    break;

                case 4: // '\004'
                    dataholder = (DataHolder)SafeParcelReader.createParcelable(parcel, k, DataHolder.CREATOR);
                    break;

                case 5: // '\005'
                    largeassetqueuestateparcelable = (LargeAssetQueueStateParcelable)SafeParcelReader.createParcelable(parcel, k, LargeAssetQueueStateParcelable.CREATOR);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ParseException((new StringBuilder("Overread allowed size end=")).append(j).toString(), parcel);
            } else
            {
                return new LargeAssetQueueStateChangeParcelable(i, dataholder, largeassetqueuestateparcelable);
            }
        } while (true);
    }

    public final volatile Object[] newArray(int i)
    {
        return new LargeAssetQueueStateChangeParcelable[i];
    }
}
