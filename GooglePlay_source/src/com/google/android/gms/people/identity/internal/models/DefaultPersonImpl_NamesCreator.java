// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.people.identity.internal.models;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import java.util.HashSet;
import java.util.Set;

// Referenced classes of package com.google.android.gms.people.identity.internal.models:
//            DefaultMetadataImpl

public final class DefaultPersonImpl_NamesCreator
    implements android.os.Parcelable.Creator
{

    public DefaultPersonImpl_NamesCreator()
    {
    }

    static void writeToParcel(DefaultPersonImpl.Names names, Parcel parcel, int i)
    {
        int j = SafeParcelWriter.beginVariableData(parcel, 20293);
        Set set = names.mIndicatorSet;
        if (set.contains(Integer.valueOf(1)))
        {
            SafeParcelWriter.writeInt(parcel, 1, names.mVersionCode);
        }
        if (set.contains(Integer.valueOf(2)))
        {
            SafeParcelWriter.writeString(parcel, 2, names.mDisplayName, true);
        }
        if (set.contains(Integer.valueOf(3)))
        {
            SafeParcelWriter.writeString(parcel, 3, names.mFamilyName, true);
        }
        if (set.contains(Integer.valueOf(4)))
        {
            SafeParcelWriter.writeString(parcel, 4, names.mFormatted, true);
        }
        if (set.contains(Integer.valueOf(5)))
        {
            SafeParcelWriter.writeString(parcel, 5, names.mGivenName, true);
        }
        if (set.contains(Integer.valueOf(6)))
        {
            SafeParcelWriter.writeString(parcel, 6, names.mHonorificPrefix, true);
        }
        if (set.contains(Integer.valueOf(7)))
        {
            SafeParcelWriter.writeString(parcel, 7, names.mHonorificSuffix, true);
        }
        if (set.contains(Integer.valueOf(8)))
        {
            SafeParcelWriter.writeParcelable(parcel, 8, names.mMetadata, i, true);
        }
        if (set.contains(Integer.valueOf(9)))
        {
            SafeParcelWriter.writeString(parcel, 9, names.mMiddleName, true);
        }
        if (set.contains(Integer.valueOf(10)))
        {
            SafeParcelWriter.writeString(parcel, 10, names.mPhoneticFamilyName, true);
        }
        if (set.contains(Integer.valueOf(11)))
        {
            SafeParcelWriter.writeString(parcel, 11, names.mPhoneticGivenName, true);
        }
        if (set.contains(Integer.valueOf(12)))
        {
            SafeParcelWriter.writeString(parcel, 12, names.mPhoneticHonorificPrefix, true);
        }
        if (set.contains(Integer.valueOf(13)))
        {
            SafeParcelWriter.writeString(parcel, 13, names.mPhoneticHonorificSuffix, true);
        }
        SafeParcelWriter.finishVariableData(parcel, j);
    }

    public final volatile Object createFromParcel(Parcel parcel)
    {
        int j = SafeParcelReader.validateObjectHeader(parcel);
        HashSet hashset = new HashSet();
        int i = 0;
        String s10 = null;
        String s9 = null;
        String s8 = null;
        String s7 = null;
        String s6 = null;
        String s5 = null;
        DefaultMetadataImpl defaultmetadataimpl = null;
        String s4 = null;
        String s3 = null;
        String s2 = null;
        String s1 = null;
        String s = null;
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
                    hashset.add(Integer.valueOf(1));
                    break;

                case 2: // '\002'
                    s10 = SafeParcelReader.createString(parcel, k);
                    hashset.add(Integer.valueOf(2));
                    break;

                case 3: // '\003'
                    s9 = SafeParcelReader.createString(parcel, k);
                    hashset.add(Integer.valueOf(3));
                    break;

                case 4: // '\004'
                    s8 = SafeParcelReader.createString(parcel, k);
                    hashset.add(Integer.valueOf(4));
                    break;

                case 5: // '\005'
                    s7 = SafeParcelReader.createString(parcel, k);
                    hashset.add(Integer.valueOf(5));
                    break;

                case 6: // '\006'
                    s6 = SafeParcelReader.createString(parcel, k);
                    hashset.add(Integer.valueOf(6));
                    break;

                case 7: // '\007'
                    s5 = SafeParcelReader.createString(parcel, k);
                    hashset.add(Integer.valueOf(7));
                    break;

                case 8: // '\b'
                    defaultmetadataimpl = (DefaultMetadataImpl)SafeParcelReader.createParcelable(parcel, k, DefaultMetadataImpl.CREATOR);
                    hashset.add(Integer.valueOf(8));
                    break;

                case 9: // '\t'
                    s4 = SafeParcelReader.createString(parcel, k);
                    hashset.add(Integer.valueOf(9));
                    break;

                case 10: // '\n'
                    s3 = SafeParcelReader.createString(parcel, k);
                    hashset.add(Integer.valueOf(10));
                    break;

                case 11: // '\013'
                    s2 = SafeParcelReader.createString(parcel, k);
                    hashset.add(Integer.valueOf(11));
                    break;

                case 12: // '\f'
                    s1 = SafeParcelReader.createString(parcel, k);
                    hashset.add(Integer.valueOf(12));
                    break;

                case 13: // '\r'
                    s = SafeParcelReader.createString(parcel, k);
                    hashset.add(Integer.valueOf(13));
                    break;
                }
            } else
            {
                if (parcel.dataPosition() != j)
                {
                    throw new com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ParseException((new StringBuilder("Overread allowed size end=")).append(j).toString(), parcel);
                }
                return new DefaultPersonImpl.Names(hashset, i, s10, s9, s8, s7, s6, s5, defaultmetadataimpl, s4, s3, s2, s1, s);
            }
        } while (true);
    }

    public final volatile Object[] newArray(int i)
    {
        return new DefaultPersonImpl.Names[i];
    }
}
