// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.people.identity.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

// Referenced classes of package com.google.android.gms.people.identity.internal:
//            ParcelableFirstPartyOptions, ParcelableListOptions

public final class ParcelableListOptionsCreator
    implements android.os.Parcelable.Creator
{

    public ParcelableListOptionsCreator()
    {
    }

    public static ParcelableListOptions createFromParcel(Parcel parcel)
    {
        int j = SafeParcelReader.validateObjectHeader(parcel);
        int i = 0;
        boolean flag2 = false;
        boolean flag1 = false;
        boolean flag = false;
        String s = null;
        android.os.Bundle bundle = null;
        ParcelableFirstPartyOptions parcelablefirstpartyoptions = null;
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
                    flag2 = SafeParcelReader.readBoolean(parcel, k);
                    break;

                case 1000: 
                    i = SafeParcelReader.readInt(parcel, k);
                    break;

                case 2: // '\002'
                    flag1 = SafeParcelReader.readBoolean(parcel, k);
                    break;

                case 3: // '\003'
                    s = SafeParcelReader.createString(parcel, k);
                    break;

                case 4: // '\004'
                    flag = SafeParcelReader.readBoolean(parcel, k);
                    break;

                case 5: // '\005'
                    bundle = SafeParcelReader.createBundle(parcel, k);
                    break;

                case 6: // '\006'
                    parcelablefirstpartyoptions = (ParcelableFirstPartyOptions)SafeParcelReader.createParcelable(parcel, k, ParcelableFirstPartyOptions.CREATOR);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ParseException((new StringBuilder("Overread allowed size end=")).append(j).toString(), parcel);
            } else
            {
                return new ParcelableListOptions(i, flag2, flag1, flag, s, bundle, parcelablefirstpartyoptions);
            }
        } while (true);
    }

    static void writeToParcel(ParcelableListOptions parcelablelistoptions, Parcel parcel, int i)
    {
        int j = SafeParcelWriter.beginVariableData(parcel, 20293);
        SafeParcelWriter.writeBoolean(parcel, 1, parcelablelistoptions.mUseOfflineDatabase);
        SafeParcelWriter.writeInt(parcel, 1000, parcelablelistoptions.mVersionCode);
        SafeParcelWriter.writeBoolean(parcel, 2, parcelablelistoptions.mUseWebData);
        SafeParcelWriter.writeString(parcel, 3, parcelablelistoptions.mEndpoint, false);
        SafeParcelWriter.writeBoolean(parcel, 4, parcelablelistoptions.mUseCp2);
        SafeParcelWriter.writeBundle(parcel, 5, parcelablelistoptions.mEndpointArguments, false);
        SafeParcelWriter.writeParcelable(parcel, 6, parcelablelistoptions.mOptions, i, false);
        SafeParcelWriter.finishVariableData(parcel, j);
    }

    public final volatile Object createFromParcel(Parcel parcel)
    {
        return createFromParcel(parcel);
    }

    public final volatile Object[] newArray(int i)
    {
        return new ParcelableListOptions[i];
    }
}
