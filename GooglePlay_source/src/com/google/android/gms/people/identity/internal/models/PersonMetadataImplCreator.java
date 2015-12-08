// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.people.identity.internal.models;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import java.util.HashSet;
import java.util.Set;

public final class PersonMetadataImplCreator
    implements android.os.Parcelable.Creator
{

    public PersonMetadataImplCreator()
    {
    }

    static void writeToParcel(PersonImpl.PersonMetadataImpl personmetadataimpl, Parcel parcel, int i)
    {
        int j = SafeParcelWriter.beginVariableData(parcel, 20293);
        Set set = personmetadataimpl.mIndicatorSet;
        if (set.contains(Integer.valueOf(1)))
        {
            SafeParcelWriter.writeInt(parcel, 1, personmetadataimpl.mVersionCode);
        }
        if (set.contains(Integer.valueOf(2)))
        {
            SafeParcelWriter.writeStringList(parcel, 2, personmetadataimpl.mAttributions, true);
        }
        if (set.contains(Integer.valueOf(3)))
        {
            SafeParcelWriter.writeStringList(parcel, 3, personmetadataimpl.mBlockTypes, true);
        }
        if (set.contains(Integer.valueOf(4)))
        {
            SafeParcelWriter.writeStringList(parcel, 4, personmetadataimpl.mCircles, true);
        }
        if (set.contains(Integer.valueOf(5)))
        {
            SafeParcelWriter.writeStringList(parcel, 5, personmetadataimpl.mContacts, true);
        }
        if (set.contains(Integer.valueOf(6)))
        {
            SafeParcelWriter.writeStringList(parcel, 6, personmetadataimpl.mGroups, true);
        }
        if (set.contains(Integer.valueOf(7)))
        {
            SafeParcelWriter.writeStringList(parcel, 7, personmetadataimpl.mIncomingBlockTypes, true);
        }
        if (set.contains(Integer.valueOf(8)))
        {
            SafeParcelWriter.writeString(parcel, 8, personmetadataimpl.mObjectType, true);
        }
        if (set.contains(Integer.valueOf(9)))
        {
            SafeParcelWriter.writeString(parcel, 9, personmetadataimpl.mOwnerId, true);
        }
        if (set.contains(Integer.valueOf(10)))
        {
            SafeParcelWriter.writeStringList(parcel, 10, personmetadataimpl.mOwnerUserTypes, true);
        }
        if (set.contains(Integer.valueOf(11)))
        {
            SafeParcelWriter.writeString(parcel, 11, personmetadataimpl.mPlusPageType, true);
        }
        if (set.contains(Integer.valueOf(12)))
        {
            SafeParcelWriter.writeParcelable(parcel, 12, personmetadataimpl.mProfileOwnerStats, i, true);
        }
        if (set.contains(Integer.valueOf(13)))
        {
            SafeParcelWriter.writeBoolean(parcel, 13, personmetadataimpl.mBlocked);
        }
        if (set.contains(Integer.valueOf(14)))
        {
            SafeParcelWriter.writeBoolean(parcel, 14, personmetadataimpl.mDeleted);
        }
        if (set.contains(Integer.valueOf(15)))
        {
            SafeParcelWriter.writeBoolean(parcel, 15, personmetadataimpl.mInViewerDomain);
        }
        SafeParcelWriter.finishVariableData(parcel, j);
    }

    public final volatile Object createFromParcel(Parcel parcel)
    {
        int j = SafeParcelReader.validateObjectHeader(parcel);
        HashSet hashset = new HashSet();
        int i = 0;
        java.util.ArrayList arraylist6 = null;
        java.util.ArrayList arraylist5 = null;
        java.util.ArrayList arraylist4 = null;
        java.util.ArrayList arraylist3 = null;
        java.util.ArrayList arraylist2 = null;
        java.util.ArrayList arraylist1 = null;
        String s2 = null;
        String s1 = null;
        java.util.ArrayList arraylist = null;
        String s = null;
        PersonImpl.ProfileOwnerStatsImpl profileownerstatsimpl = null;
        boolean flag2 = false;
        boolean flag1 = false;
        boolean flag = false;
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
                    arraylist6 = SafeParcelReader.createStringList(parcel, k);
                    hashset.add(Integer.valueOf(2));
                    break;

                case 3: // '\003'
                    arraylist5 = SafeParcelReader.createStringList(parcel, k);
                    hashset.add(Integer.valueOf(3));
                    break;

                case 4: // '\004'
                    arraylist4 = SafeParcelReader.createStringList(parcel, k);
                    hashset.add(Integer.valueOf(4));
                    break;

                case 5: // '\005'
                    arraylist3 = SafeParcelReader.createStringList(parcel, k);
                    hashset.add(Integer.valueOf(5));
                    break;

                case 6: // '\006'
                    arraylist2 = SafeParcelReader.createStringList(parcel, k);
                    hashset.add(Integer.valueOf(6));
                    break;

                case 7: // '\007'
                    arraylist1 = SafeParcelReader.createStringList(parcel, k);
                    hashset.add(Integer.valueOf(7));
                    break;

                case 8: // '\b'
                    s2 = SafeParcelReader.createString(parcel, k);
                    hashset.add(Integer.valueOf(8));
                    break;

                case 9: // '\t'
                    s1 = SafeParcelReader.createString(parcel, k);
                    hashset.add(Integer.valueOf(9));
                    break;

                case 10: // '\n'
                    arraylist = SafeParcelReader.createStringList(parcel, k);
                    hashset.add(Integer.valueOf(10));
                    break;

                case 11: // '\013'
                    s = SafeParcelReader.createString(parcel, k);
                    hashset.add(Integer.valueOf(11));
                    break;

                case 12: // '\f'
                    profileownerstatsimpl = (PersonImpl.ProfileOwnerStatsImpl)SafeParcelReader.createParcelable(parcel, k, PersonImpl.ProfileOwnerStatsImpl.CREATOR);
                    hashset.add(Integer.valueOf(12));
                    break;

                case 13: // '\r'
                    flag2 = SafeParcelReader.readBoolean(parcel, k);
                    hashset.add(Integer.valueOf(13));
                    break;

                case 14: // '\016'
                    flag1 = SafeParcelReader.readBoolean(parcel, k);
                    hashset.add(Integer.valueOf(14));
                    break;

                case 15: // '\017'
                    flag = SafeParcelReader.readBoolean(parcel, k);
                    hashset.add(Integer.valueOf(15));
                    break;
                }
            } else
            {
                if (parcel.dataPosition() != j)
                {
                    throw new com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ParseException((new StringBuilder("Overread allowed size end=")).append(j).toString(), parcel);
                }
                return new PersonImpl.PersonMetadataImpl(hashset, i, arraylist6, arraylist5, arraylist4, arraylist3, arraylist2, arraylist1, s2, s1, arraylist, s, profileownerstatsimpl, flag2, flag1, flag);
            }
        } while (true);
    }

    public final volatile Object[] newArray(int i)
    {
        return new PersonImpl.PersonMetadataImpl[i];
    }
}
