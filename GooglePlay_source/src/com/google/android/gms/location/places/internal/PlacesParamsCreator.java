// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.location.places.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

// Referenced classes of package com.google.android.gms.location.places.internal:
//            PlacesParams

public final class PlacesParamsCreator
    implements android.os.Parcelable.Creator
{

    public PlacesParamsCreator()
    {
    }

    static void writeToParcel$1b076b97(PlacesParams placesparams, Parcel parcel)
    {
        int i = SafeParcelWriter.beginVariableData(parcel, 20293);
        SafeParcelWriter.writeString(parcel, 1, placesparams.clientPackageName, false);
        SafeParcelWriter.writeInt(parcel, 1000, placesparams.versionCode);
        SafeParcelWriter.writeString(parcel, 2, placesparams.localeString, false);
        SafeParcelWriter.writeString(parcel, 3, placesparams.accountName, false);
        SafeParcelWriter.writeString(parcel, 4, placesparams.gCoreClientName, false);
        SafeParcelWriter.writeInt(parcel, 6, placesparams.gCoreClientJarVersion);
        SafeParcelWriter.writeInt(parcel, 7, placesparams.requestSource);
        SafeParcelWriter.finishVariableData(parcel, i);
    }

    public final volatile Object createFromParcel(Parcel parcel)
    {
        int i = 0;
        String s = null;
        int l = SafeParcelReader.validateObjectHeader(parcel);
        int j = 0;
        String s1 = null;
        String s2 = null;
        String s3 = null;
        int k = 0;
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
                    s3 = SafeParcelReader.createString(parcel, i1);
                    break;

                case 1000: 
                    k = SafeParcelReader.readInt(parcel, i1);
                    break;

                case 2: // '\002'
                    s2 = SafeParcelReader.createString(parcel, i1);
                    break;

                case 3: // '\003'
                    s1 = SafeParcelReader.createString(parcel, i1);
                    break;

                case 4: // '\004'
                    s = SafeParcelReader.createString(parcel, i1);
                    break;

                case 6: // '\006'
                    j = SafeParcelReader.readInt(parcel, i1);
                    break;

                case 7: // '\007'
                    i = SafeParcelReader.readInt(parcel, i1);
                    break;
                }
            } else
            if (parcel.dataPosition() != l)
            {
                throw new com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ParseException((new StringBuilder("Overread allowed size end=")).append(l).toString(), parcel);
            } else
            {
                return new PlacesParams(k, s3, s2, s1, s, j, i);
            }
        } while (true);
    }

    public final volatile Object[] newArray(int i)
    {
        return new PlacesParams[i];
    }
}
