// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps.model.internal;

import android.graphics.Bitmap;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

// Referenced classes of package com.google.android.gms.maps.model.internal:
//            BitmapDescriptorParcelable

public final class BitmapDescriptorParcelableCreator
    implements android.os.Parcelable.Creator
{

    public BitmapDescriptorParcelableCreator()
    {
    }

    static void writeToParcel(BitmapDescriptorParcelable bitmapdescriptorparcelable, Parcel parcel, int i)
    {
        int j = SafeParcelWriter.beginVariableData(parcel, 20293);
        SafeParcelWriter.writeInt(parcel, 1, bitmapdescriptorparcelable.mVersionCode);
        SafeParcelWriter.writeByte(parcel, 2, bitmapdescriptorparcelable.type);
        SafeParcelWriter.writeBundle(parcel, 3, bitmapdescriptorparcelable.parameters, false);
        SafeParcelWriter.writeParcelable(parcel, 4, bitmapdescriptorparcelable.bitmap, i, false);
        SafeParcelWriter.finishVariableData(parcel, j);
    }

    public final volatile Object createFromParcel(Parcel parcel)
    {
        Bitmap bitmap = null;
        int j = SafeParcelReader.validateObjectHeader(parcel);
        byte byte0 = 0;
        int i = 0;
        android.os.Bundle bundle = null;
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
                    byte0 = SafeParcelReader.readByte(parcel, k);
                    break;

                case 3: // '\003'
                    bundle = SafeParcelReader.createBundle(parcel, k);
                    break;

                case 4: // '\004'
                    bitmap = (Bitmap)SafeParcelReader.createParcelable(parcel, k, Bitmap.CREATOR);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ParseException((new StringBuilder("Overread allowed size end=")).append(j).toString(), parcel);
            } else
            {
                return new BitmapDescriptorParcelable(i, byte0, bundle, bitmap);
            }
        } while (true);
    }

    public final volatile Object[] newArray(int i)
    {
        return new BitmapDescriptorParcelable[i];
    }
}
