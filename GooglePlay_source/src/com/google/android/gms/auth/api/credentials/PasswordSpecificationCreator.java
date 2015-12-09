// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.auth.api.credentials;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

// Referenced classes of package com.google.android.gms.auth.api.credentials:
//            PasswordSpecification

public final class PasswordSpecificationCreator
    implements android.os.Parcelable.Creator
{

    public PasswordSpecificationCreator()
    {
    }

    static void writeToParcel$18e098bf(PasswordSpecification passwordspecification, Parcel parcel)
    {
        int i = SafeParcelWriter.beginVariableData(parcel, 20293);
        SafeParcelWriter.writeString(parcel, 1, passwordspecification.mAllowedChars, false);
        SafeParcelWriter.writeInt(parcel, 1000, passwordspecification.mVersionCode);
        SafeParcelWriter.writeStringList(parcel, 2, passwordspecification.mRequiredCharSets, false);
        SafeParcelWriter.writeIntegerList$62107c48(parcel, 3, passwordspecification.mRequiredCharCounts);
        SafeParcelWriter.writeInt(parcel, 4, passwordspecification.mMinimumSize);
        SafeParcelWriter.writeInt(parcel, 5, passwordspecification.mMaximumSize);
        SafeParcelWriter.finishVariableData(parcel, i);
    }

    public final volatile Object createFromParcel(Parcel parcel)
    {
        java.util.ArrayList arraylist = null;
        int i = 0;
        int l = SafeParcelReader.validateObjectHeader(parcel);
        int j = 0;
        java.util.ArrayList arraylist1 = null;
        String s = null;
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
                    s = SafeParcelReader.createString(parcel, i1);
                    break;

                case 1000: 
                    k = SafeParcelReader.readInt(parcel, i1);
                    break;

                case 2: // '\002'
                    arraylist1 = SafeParcelReader.createStringList(parcel, i1);
                    break;

                case 3: // '\003'
                    arraylist = SafeParcelReader.createIntegerList(parcel, i1);
                    break;

                case 4: // '\004'
                    j = SafeParcelReader.readInt(parcel, i1);
                    break;

                case 5: // '\005'
                    i = SafeParcelReader.readInt(parcel, i1);
                    break;
                }
            } else
            if (parcel.dataPosition() != l)
            {
                throw new com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ParseException((new StringBuilder("Overread allowed size end=")).append(l).toString(), parcel);
            } else
            {
                return new PasswordSpecification(k, s, arraylist1, arraylist, j, i);
            }
        } while (true);
    }

    public final volatile Object[] newArray(int i)
    {
        return new PasswordSpecification[i];
    }
}
