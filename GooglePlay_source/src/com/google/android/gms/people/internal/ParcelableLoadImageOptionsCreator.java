// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.people.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

// Referenced classes of package com.google.android.gms.people.internal:
//            ParcelableLoadImageOptions

public final class ParcelableLoadImageOptionsCreator
    implements android.os.Parcelable.Creator
{

    public ParcelableLoadImageOptionsCreator()
    {
    }

    public static ParcelableLoadImageOptions createFromParcel(Parcel parcel)
    {
        int l = SafeParcelReader.validateObjectHeader(parcel);
        int i = 0;
        int j = 0;
        int k = 0;
        boolean flag = false;
        do
        {
            if (parcel.dataPosition() < l)
            {
                int i1 = parcel.readInt();
                switch (0xffff & i1)
                {
                default:
                    SafeParcelReader.skipUnknownField(parcel, i1);
                    break;

                case 1: // '\001'
                    j = SafeParcelReader.readInt(parcel, i1);
                    break;

                case 1000: 
                    i = SafeParcelReader.readInt(parcel, i1);
                    break;

                case 2: // '\002'
                    k = SafeParcelReader.readInt(parcel, i1);
                    break;

                case 3: // '\003'
                    flag = SafeParcelReader.readBoolean(parcel, i1);
                    break;
                }
            } else
            if (parcel.dataPosition() != l)
            {
                throw new com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ParseException((new StringBuilder("Overread allowed size end=")).append(l).toString(), parcel);
            } else
            {
                return new ParcelableLoadImageOptions(i, j, k, flag);
            }
        } while (true);
    }

    static void writeToParcel$277d357a(ParcelableLoadImageOptions parcelableloadimageoptions, Parcel parcel)
    {
        int i = SafeParcelWriter.beginVariableData(parcel, 20293);
        SafeParcelWriter.writeInt(parcel, 1, parcelableloadimageoptions.mImageSize);
        SafeParcelWriter.writeInt(parcel, 1000, parcelableloadimageoptions.mVersionCode);
        SafeParcelWriter.writeInt(parcel, 2, parcelableloadimageoptions.mAvatarOptions);
        SafeParcelWriter.writeBoolean(parcel, 3, parcelableloadimageoptions.mUseLargePictureForCp2Images);
        SafeParcelWriter.finishVariableData(parcel, i);
    }

    public final volatile Object createFromParcel(Parcel parcel)
    {
        return createFromParcel(parcel);
    }

    public final volatile Object[] newArray(int i)
    {
        return new ParcelableLoadImageOptions[i];
    }
}
