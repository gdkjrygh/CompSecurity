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
//            PersonImpl

public final class PersonImplCreator
    implements android.os.Parcelable.Creator
{

    public PersonImplCreator()
    {
    }

    static void writeToParcel(PersonImpl personimpl, Parcel parcel, int i)
    {
        int j = SafeParcelWriter.beginVariableData(parcel, 20293);
        Set set = personimpl.mIndicatorSet;
        if (set.contains(Integer.valueOf(1)))
        {
            SafeParcelWriter.writeInt(parcel, 1, personimpl.mVersionCode);
        }
        if (set.contains(Integer.valueOf(2)))
        {
            SafeParcelWriter.writeTypedList(parcel, 2, personimpl.mAbouts, true);
        }
        if (set.contains(Integer.valueOf(3)))
        {
            SafeParcelWriter.writeTypedList(parcel, 3, personimpl.mAddresses, true);
        }
        if (set.contains(Integer.valueOf(4)))
        {
            SafeParcelWriter.writeString(parcel, 4, personimpl.mAgeRange, true);
        }
        if (set.contains(Integer.valueOf(5)))
        {
            SafeParcelWriter.writeTypedList(parcel, 5, personimpl.mBirthdays, true);
        }
        if (set.contains(Integer.valueOf(6)))
        {
            SafeParcelWriter.writeTypedList(parcel, 6, personimpl.mBraggingRights, true);
        }
        if (set.contains(Integer.valueOf(7)))
        {
            SafeParcelWriter.writeTypedList(parcel, 7, personimpl.mCoverPhotos, true);
        }
        if (set.contains(Integer.valueOf(8)))
        {
            SafeParcelWriter.writeTypedList(parcel, 8, personimpl.mCustomFields, true);
        }
        if (set.contains(Integer.valueOf(9)))
        {
            SafeParcelWriter.writeTypedList(parcel, 9, personimpl.mEmails, true);
        }
        if (set.contains(Integer.valueOf(10)))
        {
            SafeParcelWriter.writeString(parcel, 10, personimpl.mEtag, true);
        }
        if (set.contains(Integer.valueOf(11)))
        {
            SafeParcelWriter.writeTypedList(parcel, 11, personimpl.mEvents, true);
        }
        if (set.contains(Integer.valueOf(12)))
        {
            SafeParcelWriter.writeTypedList(parcel, 12, personimpl.mGenders, true);
        }
        if (set.contains(Integer.valueOf(13)))
        {
            SafeParcelWriter.writeString(parcel, 13, personimpl.mId, true);
        }
        if (set.contains(Integer.valueOf(14)))
        {
            SafeParcelWriter.writeTypedList(parcel, 14, personimpl.mImages, true);
        }
        if (set.contains(Integer.valueOf(15)))
        {
            SafeParcelWriter.writeTypedList(parcel, 15, personimpl.mInstantMessaging, true);
        }
        if (set.contains(Integer.valueOf(17)))
        {
            SafeParcelWriter.writeParcelable(parcel, 17, personimpl.mLegacyFields, i, true);
        }
        if (set.contains(Integer.valueOf(16)))
        {
            SafeParcelWriter.writeString(parcel, 16, personimpl.mLanguage, true);
        }
        if (set.contains(Integer.valueOf(19)))
        {
            SafeParcelWriter.writeTypedList(parcel, 19, personimpl.mMemberships, true);
        }
        if (set.contains(Integer.valueOf(18)))
        {
            SafeParcelWriter.writeTypedList(parcel, 18, personimpl.mLinkedPeople, true);
        }
        if (set.contains(Integer.valueOf(21)))
        {
            SafeParcelWriter.writeTypedList(parcel, 21, personimpl.mNames, true);
        }
        if (set.contains(Integer.valueOf(20)))
        {
            SafeParcelWriter.writeParcelable(parcel, 20, personimpl.mMetadata, i, true);
        }
        if (set.contains(Integer.valueOf(23)))
        {
            SafeParcelWriter.writeTypedList(parcel, 23, personimpl.mOccupations, true);
        }
        if (set.contains(Integer.valueOf(22)))
        {
            SafeParcelWriter.writeTypedList(parcel, 22, personimpl.mNicknames, true);
        }
        if (set.contains(Integer.valueOf(25)))
        {
            SafeParcelWriter.writeTypedList(parcel, 25, personimpl.mPhoneNumbers, true);
        }
        if (set.contains(Integer.valueOf(24)))
        {
            SafeParcelWriter.writeTypedList(parcel, 24, personimpl.mOrganizations, true);
        }
        if (set.contains(Integer.valueOf(27)))
        {
            SafeParcelWriter.writeString(parcel, 27, personimpl.mProfileUrl, true);
        }
        if (set.contains(Integer.valueOf(26)))
        {
            SafeParcelWriter.writeTypedList(parcel, 26, personimpl.mPlacesLived, true);
        }
        if (set.contains(Integer.valueOf(29)))
        {
            SafeParcelWriter.writeTypedList(parcel, 29, personimpl.mRelationshipInterests, true);
        }
        if (set.contains(Integer.valueOf(28)))
        {
            SafeParcelWriter.writeTypedList(parcel, 28, personimpl.mRelations, true);
        }
        if (set.contains(Integer.valueOf(31)))
        {
            SafeParcelWriter.writeTypedList(parcel, 31, personimpl.mSkills, true);
        }
        if (set.contains(Integer.valueOf(30)))
        {
            SafeParcelWriter.writeTypedList(parcel, 30, personimpl.mRelationshipStatuses, true);
        }
        if (set.contains(Integer.valueOf(34)))
        {
            SafeParcelWriter.writeTypedList(parcel, 34, personimpl.mUrls, true);
        }
        if (set.contains(Integer.valueOf(35)))
        {
            SafeParcelWriter.writeTypedList(parcel, 35, personimpl.mNotes, true);
        }
        if (set.contains(Integer.valueOf(32)))
        {
            SafeParcelWriter.writeParcelable(parcel, 32, personimpl.mSortKeys, i, true);
        }
        if (set.contains(Integer.valueOf(33)))
        {
            SafeParcelWriter.writeTypedList(parcel, 33, personimpl.mTaglines, true);
        }
        if (set.contains(Integer.valueOf(36)))
        {
            SafeParcelWriter.writeTypedList(parcel, 36, personimpl.mParcelableExternalContacts, true);
        }
        SafeParcelWriter.finishVariableData(parcel, j);
    }

    public final volatile Object createFromParcel(Parcel parcel)
    {
        int j = SafeParcelReader.validateObjectHeader(parcel);
        HashSet hashset = new HashSet();
        int i = 0;
        java.util.ArrayList arraylist26 = null;
        java.util.ArrayList arraylist25 = null;
        String s4 = null;
        java.util.ArrayList arraylist24 = null;
        java.util.ArrayList arraylist23 = null;
        java.util.ArrayList arraylist22 = null;
        java.util.ArrayList arraylist21 = null;
        java.util.ArrayList arraylist20 = null;
        String s3 = null;
        java.util.ArrayList arraylist19 = null;
        java.util.ArrayList arraylist18 = null;
        String s2 = null;
        java.util.ArrayList arraylist17 = null;
        java.util.ArrayList arraylist16 = null;
        String s1 = null;
        PersonImpl.LegacyFieldsImpl legacyfieldsimpl = null;
        java.util.ArrayList arraylist15 = null;
        java.util.ArrayList arraylist14 = null;
        PersonImpl.PersonMetadataImpl personmetadataimpl = null;
        java.util.ArrayList arraylist13 = null;
        java.util.ArrayList arraylist12 = null;
        java.util.ArrayList arraylist11 = null;
        java.util.ArrayList arraylist10 = null;
        java.util.ArrayList arraylist9 = null;
        java.util.ArrayList arraylist8 = null;
        String s = null;
        java.util.ArrayList arraylist7 = null;
        java.util.ArrayList arraylist6 = null;
        java.util.ArrayList arraylist5 = null;
        java.util.ArrayList arraylist4 = null;
        PersonImpl.SortKeysImpl sortkeysimpl = null;
        java.util.ArrayList arraylist3 = null;
        java.util.ArrayList arraylist2 = null;
        java.util.ArrayList arraylist1 = null;
        java.util.ArrayList arraylist = null;
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
                    arraylist26 = SafeParcelReader.createTypedList(parcel, k, PersonImpl.AboutsImpl.CREATOR);
                    hashset.add(Integer.valueOf(2));
                    break;

                case 3: // '\003'
                    arraylist25 = SafeParcelReader.createTypedList(parcel, k, PersonImpl.AddressesImpl.CREATOR);
                    hashset.add(Integer.valueOf(3));
                    break;

                case 4: // '\004'
                    s4 = SafeParcelReader.createString(parcel, k);
                    hashset.add(Integer.valueOf(4));
                    break;

                case 5: // '\005'
                    arraylist24 = SafeParcelReader.createTypedList(parcel, k, PersonImpl.BirthdaysImpl.CREATOR);
                    hashset.add(Integer.valueOf(5));
                    break;

                case 6: // '\006'
                    arraylist23 = SafeParcelReader.createTypedList(parcel, k, PersonImpl.BraggingRightsImpl.CREATOR);
                    hashset.add(Integer.valueOf(6));
                    break;

                case 7: // '\007'
                    arraylist22 = SafeParcelReader.createTypedList(parcel, k, PersonImpl.CoverPhotosImpl.CREATOR);
                    hashset.add(Integer.valueOf(7));
                    break;

                case 8: // '\b'
                    arraylist21 = SafeParcelReader.createTypedList(parcel, k, PersonImpl.CustomFieldsImpl.CREATOR);
                    hashset.add(Integer.valueOf(8));
                    break;

                case 9: // '\t'
                    arraylist20 = SafeParcelReader.createTypedList(parcel, k, PersonImpl.EmailsImpl.CREATOR);
                    hashset.add(Integer.valueOf(9));
                    break;

                case 10: // '\n'
                    s3 = SafeParcelReader.createString(parcel, k);
                    hashset.add(Integer.valueOf(10));
                    break;

                case 11: // '\013'
                    arraylist19 = SafeParcelReader.createTypedList(parcel, k, PersonImpl.EventsImpl.CREATOR);
                    hashset.add(Integer.valueOf(11));
                    break;

                case 12: // '\f'
                    arraylist18 = SafeParcelReader.createTypedList(parcel, k, PersonImpl.GendersImpl.CREATOR);
                    hashset.add(Integer.valueOf(12));
                    break;

                case 13: // '\r'
                    s2 = SafeParcelReader.createString(parcel, k);
                    hashset.add(Integer.valueOf(13));
                    break;

                case 14: // '\016'
                    arraylist17 = SafeParcelReader.createTypedList(parcel, k, PersonImpl.ImagesImpl.CREATOR);
                    hashset.add(Integer.valueOf(14));
                    break;

                case 15: // '\017'
                    arraylist16 = SafeParcelReader.createTypedList(parcel, k, PersonImpl.InstantMessagingImpl.CREATOR);
                    hashset.add(Integer.valueOf(15));
                    break;

                case 17: // '\021'
                    legacyfieldsimpl = (PersonImpl.LegacyFieldsImpl)SafeParcelReader.createParcelable(parcel, k, PersonImpl.LegacyFieldsImpl.CREATOR);
                    hashset.add(Integer.valueOf(17));
                    break;

                case 16: // '\020'
                    s1 = SafeParcelReader.createString(parcel, k);
                    hashset.add(Integer.valueOf(16));
                    break;

                case 19: // '\023'
                    arraylist14 = SafeParcelReader.createTypedList(parcel, k, PersonImpl.MembershipsImpl.CREATOR);
                    hashset.add(Integer.valueOf(19));
                    break;

                case 18: // '\022'
                    arraylist15 = SafeParcelReader.createTypedList(parcel, k, PersonImpl.CREATOR);
                    hashset.add(Integer.valueOf(18));
                    break;

                case 21: // '\025'
                    arraylist13 = SafeParcelReader.createTypedList(parcel, k, PersonImpl.NamesImpl.CREATOR);
                    hashset.add(Integer.valueOf(21));
                    break;

                case 20: // '\024'
                    personmetadataimpl = (PersonImpl.PersonMetadataImpl)SafeParcelReader.createParcelable(parcel, k, PersonImpl.PersonMetadataImpl.CREATOR);
                    hashset.add(Integer.valueOf(20));
                    break;

                case 23: // '\027'
                    arraylist11 = SafeParcelReader.createTypedList(parcel, k, PersonImpl.OccupationsImpl.CREATOR);
                    hashset.add(Integer.valueOf(23));
                    break;

                case 22: // '\026'
                    arraylist12 = SafeParcelReader.createTypedList(parcel, k, PersonImpl.NicknamesImpl.CREATOR);
                    hashset.add(Integer.valueOf(22));
                    break;

                case 25: // '\031'
                    arraylist9 = SafeParcelReader.createTypedList(parcel, k, PersonImpl.PhoneNumbersImpl.CREATOR);
                    hashset.add(Integer.valueOf(25));
                    break;

                case 24: // '\030'
                    arraylist10 = SafeParcelReader.createTypedList(parcel, k, PersonImpl.OrganizationsImpl.CREATOR);
                    hashset.add(Integer.valueOf(24));
                    break;

                case 27: // '\033'
                    s = SafeParcelReader.createString(parcel, k);
                    hashset.add(Integer.valueOf(27));
                    break;

                case 26: // '\032'
                    arraylist8 = SafeParcelReader.createTypedList(parcel, k, PersonImpl.PlacesLivedImpl.CREATOR);
                    hashset.add(Integer.valueOf(26));
                    break;

                case 29: // '\035'
                    arraylist6 = SafeParcelReader.createTypedList(parcel, k, PersonImpl.RelationshipInterestsImpl.CREATOR);
                    hashset.add(Integer.valueOf(29));
                    break;

                case 28: // '\034'
                    arraylist7 = SafeParcelReader.createTypedList(parcel, k, PersonImpl.RelationsImpl.CREATOR);
                    hashset.add(Integer.valueOf(28));
                    break;

                case 31: // '\037'
                    arraylist4 = SafeParcelReader.createTypedList(parcel, k, PersonImpl.SkillsImpl.CREATOR);
                    hashset.add(Integer.valueOf(31));
                    break;

                case 30: // '\036'
                    arraylist5 = SafeParcelReader.createTypedList(parcel, k, PersonImpl.RelationshipStatusesImpl.CREATOR);
                    hashset.add(Integer.valueOf(30));
                    break;

                case 34: // '"'
                    arraylist2 = SafeParcelReader.createTypedList(parcel, k, PersonImpl.UrlsImpl.CREATOR);
                    hashset.add(Integer.valueOf(34));
                    break;

                case 35: // '#'
                    arraylist1 = SafeParcelReader.createTypedList(parcel, k, PersonImpl.NotesImpl.CREATOR);
                    hashset.add(Integer.valueOf(35));
                    break;

                case 32: // ' '
                    sortkeysimpl = (PersonImpl.SortKeysImpl)SafeParcelReader.createParcelable(parcel, k, PersonImpl.SortKeysImpl.CREATOR);
                    hashset.add(Integer.valueOf(32));
                    break;

                case 33: // '!'
                    arraylist3 = SafeParcelReader.createTypedList(parcel, k, PersonImpl.TaglinesImpl.CREATOR);
                    hashset.add(Integer.valueOf(33));
                    break;

                case 36: // '$'
                    arraylist = SafeParcelReader.createTypedList(parcel, k, PersonImpl.ParcelableExternalContactsImpl.CREATOR);
                    hashset.add(Integer.valueOf(36));
                    break;
                }
            } else
            {
                if (parcel.dataPosition() != j)
                {
                    throw new com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ParseException((new StringBuilder("Overread allowed size end=")).append(j).toString(), parcel);
                }
                return new PersonImpl(hashset, i, arraylist26, arraylist25, s4, arraylist24, arraylist23, arraylist22, arraylist21, arraylist20, s3, arraylist19, arraylist18, s2, arraylist17, arraylist16, s1, legacyfieldsimpl, arraylist15, arraylist14, personmetadataimpl, arraylist13, arraylist12, arraylist11, arraylist10, arraylist9, arraylist8, s, arraylist7, arraylist6, arraylist5, arraylist4, sortkeysimpl, arraylist3, arraylist2, arraylist1, arraylist);
            }
        } while (true);
    }

    public final volatile Object[] newArray(int i)
    {
        return new PersonImpl[i];
    }
}
