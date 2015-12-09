// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wearable;

import android.net.Uri;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

// Referenced classes of package com.google.android.gms.wearable:
//            Asset

public final class AssetCreator
    implements android.os.Parcelable.Creator
{

    public AssetCreator()
    {
    }

    static void writeToParcel(Asset asset, Parcel parcel, int i)
    {
        int j = SafeParcelWriter.beginVariableData(parcel, 20293);
        SafeParcelWriter.writeInt(parcel, 1, asset.mVersionCode);
        SafeParcelWriter.writeByteArray(parcel, 2, asset.mData, false);
        SafeParcelWriter.writeString(parcel, 3, asset.mDigest, false);
        SafeParcelWriter.writeParcelable(parcel, 4, asset.fd, i, false);
        SafeParcelWriter.writeParcelable(parcel, 5, asset.uri, i, false);
        SafeParcelWriter.finishVariableData(parcel, j);
    }

    public final volatile Object createFromParcel(Parcel parcel)
    {
        Uri uri = null;
        int j = SafeParcelReader.validateObjectHeader(parcel);
        int i = 0;
        ParcelFileDescriptor parcelfiledescriptor = null;
        String s = null;
        byte abyte0[] = null;
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
                    abyte0 = SafeParcelReader.createByteArray(parcel, k);
                    break;

                case 3: // '\003'
                    s = SafeParcelReader.createString(parcel, k);
                    break;

                case 4: // '\004'
                    parcelfiledescriptor = (ParcelFileDescriptor)SafeParcelReader.createParcelable(parcel, k, ParcelFileDescriptor.CREATOR);
                    break;

                case 5: // '\005'
                    uri = (Uri)SafeParcelReader.createParcelable(parcel, k, Uri.CREATOR);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ParseException((new StringBuilder("Overread allowed size end=")).append(j).toString(), parcel);
            } else
            {
                return new Asset(i, abyte0, s, parcelfiledescriptor, uri);
            }
        } while (true);
    }

    public final volatile Object[] newArray(int i)
    {
        return new Asset[i];
    }
}
