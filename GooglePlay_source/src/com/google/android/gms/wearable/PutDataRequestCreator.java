// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wearable;

import android.net.Uri;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

// Referenced classes of package com.google.android.gms.wearable:
//            PutDataRequest

public final class PutDataRequestCreator
    implements android.os.Parcelable.Creator
{

    public PutDataRequestCreator()
    {
    }

    static void writeToParcel(PutDataRequest putdatarequest, Parcel parcel, int i)
    {
        int j = SafeParcelWriter.beginVariableData(parcel, 20293);
        SafeParcelWriter.writeInt(parcel, 1, putdatarequest.mVersionCode);
        SafeParcelWriter.writeParcelable(parcel, 2, putdatarequest.mUri, i, false);
        SafeParcelWriter.writeBundle(parcel, 4, putdatarequest.mAssets, false);
        SafeParcelWriter.writeByteArray(parcel, 5, putdatarequest.mData, false);
        SafeParcelWriter.writeLong(parcel, 6, putdatarequest.mSyncDeadline);
        SafeParcelWriter.finishVariableData(parcel, j);
    }

    public final volatile Object createFromParcel(Parcel parcel)
    {
        byte abyte0[] = null;
        int j = SafeParcelReader.validateObjectHeader(parcel);
        int i = 0;
        long l = 0L;
        android.os.Bundle bundle = null;
        Uri uri = null;
        do
        {
            if (parcel.dataPosition() < j)
            {
                int k = parcel.readInt();
                switch (0xffff & k)
                {
                case 3: // '\003'
                default:
                    SafeParcelReader.skipUnknownField(parcel, k);
                    break;

                case 1: // '\001'
                    i = SafeParcelReader.readInt(parcel, k);
                    break;

                case 2: // '\002'
                    uri = (Uri)SafeParcelReader.createParcelable(parcel, k, Uri.CREATOR);
                    break;

                case 4: // '\004'
                    bundle = SafeParcelReader.createBundle(parcel, k);
                    break;

                case 5: // '\005'
                    abyte0 = SafeParcelReader.createByteArray(parcel, k);
                    break;

                case 6: // '\006'
                    l = SafeParcelReader.readLong(parcel, k);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ParseException((new StringBuilder("Overread allowed size end=")).append(j).toString(), parcel);
            } else
            {
                return new PutDataRequest(i, uri, bundle, abyte0, l);
            }
        } while (true);
    }

    public final volatile Object[] newArray(int i)
    {
        return new PutDataRequest[i];
    }
}
