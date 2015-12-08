// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.location.places.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

// Referenced classes of package com.google.android.gms.location.places.internal:
//            AutocompletePredictionEntity

public final class AutocompletePredictionEntityCreator
    implements android.os.Parcelable.Creator
{

    public AutocompletePredictionEntityCreator()
    {
    }

    static void writeToParcel$5ee7caff(AutocompletePredictionEntity autocompletepredictionentity, Parcel parcel)
    {
        int i = SafeParcelWriter.beginVariableData(parcel, 20293);
        SafeParcelWriter.writeString(parcel, 1, autocompletepredictionentity.mFullText, false);
        SafeParcelWriter.writeInt(parcel, 1000, autocompletepredictionentity.mVersionCode);
        SafeParcelWriter.writeString(parcel, 2, autocompletepredictionentity.mPlaceId, false);
        SafeParcelWriter.writeIntegerList$62107c48(parcel, 3, autocompletepredictionentity.mPlaceTypes);
        SafeParcelWriter.writeTypedList(parcel, 4, autocompletepredictionentity.mFullTextMatchedSubstrings, false);
        SafeParcelWriter.writeInt(parcel, 5, autocompletepredictionentity.mPersonalizationType);
        SafeParcelWriter.writeString(parcel, 6, autocompletepredictionentity.mPrimaryText, false);
        SafeParcelWriter.writeTypedList(parcel, 7, autocompletepredictionentity.mPrimaryTextMatchedSubstrings, false);
        SafeParcelWriter.writeString(parcel, 8, autocompletepredictionentity.mSecondaryText, false);
        SafeParcelWriter.writeTypedList(parcel, 9, autocompletepredictionentity.mSecondaryTextMatchedSubstrings, false);
        SafeParcelWriter.finishVariableData(parcel, i);
    }

    public final volatile Object createFromParcel(Parcel parcel)
    {
        int i = 0;
        java.util.ArrayList arraylist = null;
        int k = SafeParcelReader.validateObjectHeader(parcel);
        String s = null;
        java.util.ArrayList arraylist1 = null;
        String s1 = null;
        java.util.ArrayList arraylist2 = null;
        String s2 = null;
        java.util.ArrayList arraylist3 = null;
        String s3 = null;
        int j = 0;
        do
        {
            if (parcel.dataPosition() < k)
            {
                int l = parcel.readInt();
                switch (0xffff & l)
                {
                default:
                    SafeParcelReader.skipUnknownField(parcel, l);
                    break;

                case 1: // '\001'
                    s2 = SafeParcelReader.createString(parcel, l);
                    break;

                case 1000: 
                    j = SafeParcelReader.readInt(parcel, l);
                    break;

                case 2: // '\002'
                    s3 = SafeParcelReader.createString(parcel, l);
                    break;

                case 3: // '\003'
                    arraylist3 = SafeParcelReader.createIntegerList(parcel, l);
                    break;

                case 4: // '\004'
                    arraylist2 = SafeParcelReader.createTypedList(parcel, l, AutocompletePredictionEntity.SubstringEntity.CREATOR);
                    break;

                case 5: // '\005'
                    i = SafeParcelReader.readInt(parcel, l);
                    break;

                case 6: // '\006'
                    s1 = SafeParcelReader.createString(parcel, l);
                    break;

                case 7: // '\007'
                    arraylist1 = SafeParcelReader.createTypedList(parcel, l, AutocompletePredictionEntity.SubstringEntity.CREATOR);
                    break;

                case 8: // '\b'
                    s = SafeParcelReader.createString(parcel, l);
                    break;

                case 9: // '\t'
                    arraylist = SafeParcelReader.createTypedList(parcel, l, AutocompletePredictionEntity.SubstringEntity.CREATOR);
                    break;
                }
            } else
            if (parcel.dataPosition() != k)
            {
                throw new com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ParseException((new StringBuilder("Overread allowed size end=")).append(k).toString(), parcel);
            } else
            {
                return new AutocompletePredictionEntity(j, s3, arraylist3, i, s2, arraylist2, s1, arraylist1, s, arraylist);
            }
        } while (true);
    }

    public final volatile Object[] newArray(int i)
    {
        return new AutocompletePredictionEntity[i];
    }
}
