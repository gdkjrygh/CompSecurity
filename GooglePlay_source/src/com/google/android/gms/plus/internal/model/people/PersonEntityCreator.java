// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.plus.internal.model.people;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import java.util.HashSet;
import java.util.Set;

// Referenced classes of package com.google.android.gms.plus.internal.model.people:
//            PersonEntity

public final class PersonEntityCreator
    implements android.os.Parcelable.Creator
{

    public PersonEntityCreator()
    {
    }

    static void writeToParcel(PersonEntity personentity, Parcel parcel, int i)
    {
        int j = SafeParcelWriter.beginVariableData(parcel, 20293);
        Set set = personentity.mIndicatorSet;
        if (set.contains(Integer.valueOf(1)))
        {
            SafeParcelWriter.writeInt(parcel, 1, personentity.mVersionCode);
        }
        if (set.contains(Integer.valueOf(2)))
        {
            SafeParcelWriter.writeString(parcel, 2, personentity.mAboutMe, true);
        }
        if (set.contains(Integer.valueOf(3)))
        {
            SafeParcelWriter.writeParcelable(parcel, 3, personentity.mAgeRange, i, true);
        }
        if (set.contains(Integer.valueOf(4)))
        {
            SafeParcelWriter.writeString(parcel, 4, personentity.mBirthday, true);
        }
        if (set.contains(Integer.valueOf(5)))
        {
            SafeParcelWriter.writeString(parcel, 5, personentity.mBraggingRights, true);
        }
        if (set.contains(Integer.valueOf(6)))
        {
            SafeParcelWriter.writeInt(parcel, 6, personentity.mCircledByCount);
        }
        if (set.contains(Integer.valueOf(7)))
        {
            SafeParcelWriter.writeParcelable(parcel, 7, personentity.mCover, i, true);
        }
        if (set.contains(Integer.valueOf(8)))
        {
            SafeParcelWriter.writeString(parcel, 8, personentity.mCurrentLocation, true);
        }
        if (set.contains(Integer.valueOf(9)))
        {
            SafeParcelWriter.writeString(parcel, 9, personentity.mDisplayName, true);
        }
        if (set.contains(Integer.valueOf(12)))
        {
            SafeParcelWriter.writeInt(parcel, 12, personentity.mGender);
        }
        if (set.contains(Integer.valueOf(14)))
        {
            SafeParcelWriter.writeString(parcel, 14, personentity.mId, true);
        }
        if (set.contains(Integer.valueOf(15)))
        {
            SafeParcelWriter.writeParcelable(parcel, 15, personentity.mImage, i, true);
        }
        if (set.contains(Integer.valueOf(16)))
        {
            SafeParcelWriter.writeBoolean(parcel, 16, personentity.mIsPlusUser);
        }
        if (set.contains(Integer.valueOf(19)))
        {
            SafeParcelWriter.writeParcelable(parcel, 19, personentity.mName, i, true);
        }
        if (set.contains(Integer.valueOf(18)))
        {
            SafeParcelWriter.writeString(parcel, 18, personentity.mLanguage, true);
        }
        if (set.contains(Integer.valueOf(21)))
        {
            SafeParcelWriter.writeInt(parcel, 21, personentity.mObjectType);
        }
        if (set.contains(Integer.valueOf(20)))
        {
            SafeParcelWriter.writeString(parcel, 20, personentity.mNickname, true);
        }
        if (set.contains(Integer.valueOf(23)))
        {
            SafeParcelWriter.writeTypedList(parcel, 23, personentity.mPlacesLived, true);
        }
        if (set.contains(Integer.valueOf(22)))
        {
            SafeParcelWriter.writeTypedList(parcel, 22, personentity.mOrganizations, true);
        }
        if (set.contains(Integer.valueOf(25)))
        {
            SafeParcelWriter.writeInt(parcel, 25, personentity.mRelationshipStatus);
        }
        if (set.contains(Integer.valueOf(24)))
        {
            SafeParcelWriter.writeInt(parcel, 24, personentity.mPlusOneCount);
        }
        if (set.contains(Integer.valueOf(27)))
        {
            SafeParcelWriter.writeString(parcel, 27, personentity.mUrl, true);
        }
        if (set.contains(Integer.valueOf(26)))
        {
            SafeParcelWriter.writeString(parcel, 26, personentity.mTagline, true);
        }
        if (set.contains(Integer.valueOf(29)))
        {
            SafeParcelWriter.writeBoolean(parcel, 29, personentity.mVerified);
        }
        if (set.contains(Integer.valueOf(28)))
        {
            SafeParcelWriter.writeTypedList(parcel, 28, personentity.mUrls, true);
        }
        SafeParcelWriter.finishVariableData(parcel, j);
    }

    public final volatile Object createFromParcel(Parcel parcel)
    {
        int k1 = SafeParcelReader.validateObjectHeader(parcel);
        HashSet hashset = new HashSet();
        int j1 = 0;
        String s9 = null;
        PersonEntity.AgeRangeEntity agerangeentity = null;
        String s8 = null;
        String s7 = null;
        int i1 = 0;
        PersonEntity.CoverEntity coverentity = null;
        String s6 = null;
        String s5 = null;
        int l = 0;
        String s4 = null;
        PersonEntity.ImageEntity imageentity = null;
        boolean flag1 = false;
        String s3 = null;
        PersonEntity.NameEntity nameentity = null;
        String s2 = null;
        int k = 0;
        java.util.ArrayList arraylist2 = null;
        java.util.ArrayList arraylist1 = null;
        int j = 0;
        int i = 0;
        String s1 = null;
        String s = null;
        java.util.ArrayList arraylist = null;
        boolean flag = false;
        do
        {
            if (parcel.dataPosition() < k1)
            {
                int l1 = parcel.readInt();
                switch (0xffff & l1)
                {
                case 10: // '\n'
                case 11: // '\013'
                case 13: // '\r'
                case 17: // '\021'
                default:
                    SafeParcelReader.skipUnknownField(parcel, l1);
                    break;

                case 1: // '\001'
                    j1 = SafeParcelReader.readInt(parcel, l1);
                    hashset.add(Integer.valueOf(1));
                    break;

                case 2: // '\002'
                    s9 = SafeParcelReader.createString(parcel, l1);
                    hashset.add(Integer.valueOf(2));
                    break;

                case 3: // '\003'
                    agerangeentity = (PersonEntity.AgeRangeEntity)SafeParcelReader.createParcelable(parcel, l1, PersonEntity.AgeRangeEntity.CREATOR);
                    hashset.add(Integer.valueOf(3));
                    break;

                case 4: // '\004'
                    s8 = SafeParcelReader.createString(parcel, l1);
                    hashset.add(Integer.valueOf(4));
                    break;

                case 5: // '\005'
                    s7 = SafeParcelReader.createString(parcel, l1);
                    hashset.add(Integer.valueOf(5));
                    break;

                case 6: // '\006'
                    i1 = SafeParcelReader.readInt(parcel, l1);
                    hashset.add(Integer.valueOf(6));
                    break;

                case 7: // '\007'
                    coverentity = (PersonEntity.CoverEntity)SafeParcelReader.createParcelable(parcel, l1, PersonEntity.CoverEntity.CREATOR);
                    hashset.add(Integer.valueOf(7));
                    break;

                case 8: // '\b'
                    s6 = SafeParcelReader.createString(parcel, l1);
                    hashset.add(Integer.valueOf(8));
                    break;

                case 9: // '\t'
                    s5 = SafeParcelReader.createString(parcel, l1);
                    hashset.add(Integer.valueOf(9));
                    break;

                case 12: // '\f'
                    l = SafeParcelReader.readInt(parcel, l1);
                    hashset.add(Integer.valueOf(12));
                    break;

                case 14: // '\016'
                    s4 = SafeParcelReader.createString(parcel, l1);
                    hashset.add(Integer.valueOf(14));
                    break;

                case 15: // '\017'
                    imageentity = (PersonEntity.ImageEntity)SafeParcelReader.createParcelable(parcel, l1, PersonEntity.ImageEntity.CREATOR);
                    hashset.add(Integer.valueOf(15));
                    break;

                case 16: // '\020'
                    flag1 = SafeParcelReader.readBoolean(parcel, l1);
                    hashset.add(Integer.valueOf(16));
                    break;

                case 19: // '\023'
                    nameentity = (PersonEntity.NameEntity)SafeParcelReader.createParcelable(parcel, l1, PersonEntity.NameEntity.CREATOR);
                    hashset.add(Integer.valueOf(19));
                    break;

                case 18: // '\022'
                    s3 = SafeParcelReader.createString(parcel, l1);
                    hashset.add(Integer.valueOf(18));
                    break;

                case 21: // '\025'
                    k = SafeParcelReader.readInt(parcel, l1);
                    hashset.add(Integer.valueOf(21));
                    break;

                case 20: // '\024'
                    s2 = SafeParcelReader.createString(parcel, l1);
                    hashset.add(Integer.valueOf(20));
                    break;

                case 23: // '\027'
                    arraylist1 = SafeParcelReader.createTypedList(parcel, l1, PersonEntity.PlacesLivedEntity.CREATOR);
                    hashset.add(Integer.valueOf(23));
                    break;

                case 22: // '\026'
                    arraylist2 = SafeParcelReader.createTypedList(parcel, l1, PersonEntity.OrganizationsEntity.CREATOR);
                    hashset.add(Integer.valueOf(22));
                    break;

                case 25: // '\031'
                    i = SafeParcelReader.readInt(parcel, l1);
                    hashset.add(Integer.valueOf(25));
                    break;

                case 24: // '\030'
                    j = SafeParcelReader.readInt(parcel, l1);
                    hashset.add(Integer.valueOf(24));
                    break;

                case 27: // '\033'
                    s = SafeParcelReader.createString(parcel, l1);
                    hashset.add(Integer.valueOf(27));
                    break;

                case 26: // '\032'
                    s1 = SafeParcelReader.createString(parcel, l1);
                    hashset.add(Integer.valueOf(26));
                    break;

                case 29: // '\035'
                    flag = SafeParcelReader.readBoolean(parcel, l1);
                    hashset.add(Integer.valueOf(29));
                    break;

                case 28: // '\034'
                    arraylist = SafeParcelReader.createTypedList(parcel, l1, PersonEntity.UrlsEntity.CREATOR);
                    hashset.add(Integer.valueOf(28));
                    break;
                }
            } else
            if (parcel.dataPosition() != k1)
            {
                throw new com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ParseException((new StringBuilder("Overread allowed size end=")).append(k1).toString(), parcel);
            } else
            {
                return new PersonEntity(hashset, j1, s9, agerangeentity, s8, s7, i1, coverentity, s6, s5, l, s4, imageentity, flag1, s3, nameentity, s2, k, arraylist2, arraylist1, j, i, s1, s, arraylist, flag);
            }
        } while (true);
    }

    public final volatile Object[] newArray(int i)
    {
        return new PersonEntity[i];
    }
}
