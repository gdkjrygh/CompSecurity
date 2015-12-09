// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps.model;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.maps.model.internal.ITileProviderDelegate;

// Referenced classes of package com.google.android.gms.maps.model:
//            TileOverlayOptions

public final class TileOverlayOptionsCreator
    implements android.os.Parcelable.Creator
{

    public TileOverlayOptionsCreator()
    {
    }

    static void writeToParcel$4b899d8a(TileOverlayOptions tileoverlayoptions, Parcel parcel)
    {
        int i = SafeParcelWriter.beginVariableData(parcel, 20293);
        SafeParcelWriter.writeInt(parcel, 1, tileoverlayoptions.mVersionCode);
        SafeParcelWriter.writeIBinder$cdac282(parcel, 2, tileoverlayoptions.mTileProviderDelegate.asBinder());
        SafeParcelWriter.writeBoolean(parcel, 3, tileoverlayoptions.mVisible);
        SafeParcelWriter.writeFloat(parcel, 4, tileoverlayoptions.mZIndex);
        SafeParcelWriter.writeBoolean(parcel, 5, tileoverlayoptions.mFadeIn);
        SafeParcelWriter.finishVariableData(parcel, i);
    }

    public final volatile Object createFromParcel(Parcel parcel)
    {
        boolean flag1 = false;
        int j = SafeParcelReader.validateObjectHeader(parcel);
        android.os.IBinder ibinder = null;
        float f = 0.0F;
        boolean flag = true;
        int i = 0;
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
                    ibinder = SafeParcelReader.readIBinder(parcel, k);
                    break;

                case 3: // '\003'
                    flag1 = SafeParcelReader.readBoolean(parcel, k);
                    break;

                case 4: // '\004'
                    f = SafeParcelReader.readFloat(parcel, k);
                    break;

                case 5: // '\005'
                    flag = SafeParcelReader.readBoolean(parcel, k);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ParseException((new StringBuilder("Overread allowed size end=")).append(j).toString(), parcel);
            } else
            {
                return new TileOverlayOptions(i, ibinder, flag1, f, flag);
            }
        } while (true);
    }

    public final volatile Object[] newArray(int i)
    {
        return new TileOverlayOptions[i];
    }
}
