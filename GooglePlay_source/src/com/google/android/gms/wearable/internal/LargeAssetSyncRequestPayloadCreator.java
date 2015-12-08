// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

// Referenced classes of package com.google.android.gms.wearable.internal:
//            LargeAssetSyncRequestPayload

public final class LargeAssetSyncRequestPayloadCreator
    implements android.os.Parcelable.Creator
{

    public LargeAssetSyncRequestPayloadCreator()
    {
    }

    static void writeToParcel$2799b5f3(LargeAssetSyncRequestPayload largeassetsyncrequestpayload, Parcel parcel)
    {
        int i = SafeParcelWriter.beginVariableData(parcel, 20293);
        SafeParcelWriter.writeInt(parcel, 1, largeassetsyncrequestpayload.versionCode);
        SafeParcelWriter.writeString(parcel, 2, largeassetsyncrequestpayload.path, false);
        SafeParcelWriter.writeLong(parcel, 3, largeassetsyncrequestpayload.offset);
        SafeParcelWriter.finishVariableData(parcel, i);
    }

    public final volatile Object createFromParcel(Parcel parcel)
    {
        int j = SafeParcelReader.validateObjectHeader(parcel);
        int i = 0;
        String s = null;
        long l = 0L;
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
                    s = SafeParcelReader.createString(parcel, k);
                    break;

                case 3: // '\003'
                    l = SafeParcelReader.readLong(parcel, k);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ParseException((new StringBuilder("Overread allowed size end=")).append(j).toString(), parcel);
            } else
            {
                return new LargeAssetSyncRequestPayload(i, s, l);
            }
        } while (true);
    }

    public final volatile Object[] newArray(int i)
    {
        return new LargeAssetSyncRequestPayload[i];
    }
}
