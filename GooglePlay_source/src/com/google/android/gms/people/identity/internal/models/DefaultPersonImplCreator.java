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
//            DefaultPersonImpl

public final class DefaultPersonImplCreator
    implements android.os.Parcelable.Creator
{

    public DefaultPersonImplCreator()
    {
    }

    static void writeToParcel(DefaultPersonImpl defaultpersonimpl, Parcel parcel, int i)
    {
        int j = SafeParcelWriter.beginVariableData(parcel, 20293);
        Set set = defaultpersonimpl.mIndicatorSet;
        if (set.contains(Integer.valueOf(1)))
        {
            SafeParcelWriter.writeInt(parcel, 1, defaultpersonimpl.mVersionCode);
        }
        if (set.contains(Integer.valueOf(2)))
        {
            SafeParcelWriter.writeTypedList(parcel, 2, defaultpersonimpl.mAbouts, true);
        }
        if (set.contains(Integer.valueOf(3)))
        {
            SafeParcelWriter.writeTypedList(parcel, 3, defaultpersonimpl.mAddresses, true);
        }
        if (set.contains(Integer.valueOf(4)))
        {
            SafeParcelWriter.writeString(parcel, 4, defaultpersonimpl.mAgeRange, true);
        }
        if (set.contains(Integer.valueOf(5)))
        {
            SafeParcelWriter.writeTypedList(parcel, 5, defaultpersonimpl.mBirthdays, true);
        }
        if (set.contains(Integer.valueOf(6)))
        {
            SafeParcelWriter.writeTypedList(parcel, 6, defaultpersonimpl.mBraggingRights, true);
        }
        if (set.contains(Integer.valueOf(7)))
        {
            SafeParcelWriter.writeTypedList(parcel, 7, defaultpersonimpl.mCoverPhotos, true);
        }
        if (set.contains(Integer.valueOf(8)))
        {
            SafeParcelWriter.writeTypedList(parcel, 8, defaultpersonimpl.mCustomFields, true);
        }
        if (set.contains(Integer.valueOf(9)))
        {
            SafeParcelWriter.writeTypedList(parcel, 9, defaultpersonimpl.mEmails, true);
        }
        if (set.contains(Integer.valueOf(10)))
        {
            SafeParcelWriter.writeString(parcel, 10, defaultpersonimpl.mEtag, true);
        }
        if (set.contains(Integer.valueOf(11)))
        {
            SafeParcelWriter.writeTypedList(parcel, 11, defaultpersonimpl.mEvents, true);
        }
        if (set.contains(Integer.valueOf(12)))
        {
            SafeParcelWriter.writeTypedList(parcel, 12, defaultpersonimpl.mGenders, true);
        }
        if (set.contains(Integer.valueOf(13)))
        {
            SafeParcelWriter.writeString(parcel, 13, defaultpersonimpl.mId, true);
        }
        if (set.contains(Integer.valueOf(14)))
        {
            SafeParcelWriter.writeTypedList(parcel, 14, defaultpersonimpl.mImages, true);
        }
        if (set.contains(Integer.valueOf(15)))
        {
            SafeParcelWriter.writeTypedList(parcel, 15, defaultpersonimpl.mInstantMessaging, true);
        }
        if (set.contains(Integer.valueOf(17)))
        {
            SafeParcelWriter.writeString(parcel, 17, defaultpersonimpl.mLanguage, true);
        }
        if (set.contains(Integer.valueOf(19)))
        {
            SafeParcelWriter.writeTypedList(parcel, 19, defaultpersonimpl.mLinkedPeople, true);
        }
        if (set.contains(Integer.valueOf(18)))
        {
            SafeParcelWriter.writeParcelable(parcel, 18, defaultpersonimpl.mLegacyFields, i, true);
        }
        if (set.contains(Integer.valueOf(21)))
        {
            SafeParcelWriter.writeParcelable(parcel, 21, defaultpersonimpl.mMetadata, i, true);
        }
        if (set.contains(Integer.valueOf(20)))
        {
            SafeParcelWriter.writeTypedList(parcel, 20, defaultpersonimpl.mMemberships, true);
        }
        if (set.contains(Integer.valueOf(23)))
        {
            SafeParcelWriter.writeTypedList(parcel, 23, defaultpersonimpl.mNicknames, true);
        }
        if (set.contains(Integer.valueOf(22)))
        {
            SafeParcelWriter.writeTypedList(parcel, 22, defaultpersonimpl.mNames, true);
        }
        if (set.contains(Integer.valueOf(25)))
        {
            SafeParcelWriter.writeTypedList(parcel, 25, defaultpersonimpl.mOrganizations, true);
        }
        if (set.contains(Integer.valueOf(24)))
        {
            SafeParcelWriter.writeTypedList(parcel, 24, defaultpersonimpl.mOccupations, true);
        }
        if (set.contains(Integer.valueOf(27)))
        {
            SafeParcelWriter.writeTypedList(parcel, 27, defaultpersonimpl.mPlacesLived, true);
        }
        if (set.contains(Integer.valueOf(26)))
        {
            SafeParcelWriter.writeTypedList(parcel, 26, defaultpersonimpl.mPhoneNumbers, true);
        }
        if (set.contains(Integer.valueOf(29)))
        {
            SafeParcelWriter.writeTypedList(parcel, 29, defaultpersonimpl.mRelations, true);
        }
        if (set.contains(Integer.valueOf(28)))
        {
            SafeParcelWriter.writeString(parcel, 28, defaultpersonimpl.mProfileUrl, true);
        }
        if (set.contains(Integer.valueOf(31)))
        {
            SafeParcelWriter.writeTypedList(parcel, 31, defaultpersonimpl.mRelationshipStatuses, true);
        }
        if (set.contains(Integer.valueOf(30)))
        {
            SafeParcelWriter.writeTypedList(parcel, 30, defaultpersonimpl.mRelationshipInterests, true);
        }
        if (set.contains(Integer.valueOf(34)))
        {
            SafeParcelWriter.writeTypedList(parcel, 34, defaultpersonimpl.mTaglines, true);
        }
        if (set.contains(Integer.valueOf(35)))
        {
            SafeParcelWriter.writeTypedList(parcel, 35, defaultpersonimpl.mUrls, true);
        }
        if (set.contains(Integer.valueOf(32)))
        {
            SafeParcelWriter.writeTypedList(parcel, 32, defaultpersonimpl.mSkills, true);
        }
        if (set.contains(Integer.valueOf(33)))
        {
            SafeParcelWriter.writeParcelable(parcel, 33, defaultpersonimpl.mSortKeys, i, true);
        }
        SafeParcelWriter.finishVariableData(parcel, j);
    }

    public final volatile Object createFromParcel(Parcel parcel)
    {
        int j = SafeParcelReader.validateObjectHeader(parcel);
        HashSet hashset = new HashSet();
        int i = 0;
        java.util.ArrayList arraylist24 = null;
        java.util.ArrayList arraylist23 = null;
        String s4 = null;
        java.util.ArrayList arraylist22 = null;
        java.util.ArrayList arraylist21 = null;
        java.util.ArrayList arraylist20 = null;
        java.util.ArrayList arraylist19 = null;
        java.util.ArrayList arraylist18 = null;
        String s3 = null;
        java.util.ArrayList arraylist17 = null;
        java.util.ArrayList arraylist16 = null;
        String s2 = null;
        java.util.ArrayList arraylist15 = null;
        java.util.ArrayList arraylist14 = null;
        String s1 = null;
        DefaultPersonImpl.LegacyFields legacyfields = null;
        java.util.ArrayList arraylist13 = null;
        java.util.ArrayList arraylist12 = null;
        DefaultPersonImpl.Metadata metadata = null;
        java.util.ArrayList arraylist11 = null;
        java.util.ArrayList arraylist10 = null;
        java.util.ArrayList arraylist9 = null;
        java.util.ArrayList arraylist8 = null;
        java.util.ArrayList arraylist7 = null;
        java.util.ArrayList arraylist6 = null;
        String s = null;
        java.util.ArrayList arraylist5 = null;
        java.util.ArrayList arraylist4 = null;
        java.util.ArrayList arraylist3 = null;
        java.util.ArrayList arraylist2 = null;
        DefaultPersonImpl.SortKeys sortkeys = null;
        java.util.ArrayList arraylist1 = null;
        java.util.ArrayList arraylist = null;
        do
        {
            if (parcel.dataPosition() < j)
            {
                int k = parcel.readInt();
                switch (0xffff & k)
                {
                case 16: // '\020'
                default:
                    SafeParcelReader.skipUnknownField(parcel, k);
                    break;

                case 1: // '\001'
                    i = SafeParcelReader.readInt(parcel, k);
                    hashset.add(Integer.valueOf(1));
                    break;

                case 2: // '\002'
                    arraylist24 = SafeParcelReader.createTypedList(parcel, k, DefaultPersonImpl.Abouts.CREATOR);
                    hashset.add(Integer.valueOf(2));
                    break;

                case 3: // '\003'
                    arraylist23 = SafeParcelReader.createTypedList(parcel, k, DefaultPersonImpl.Addresses.CREATOR);
                    hashset.add(Integer.valueOf(3));
                    break;

                case 4: // '\004'
                    s4 = SafeParcelReader.createString(parcel, k);
                    hashset.add(Integer.valueOf(4));
                    break;

                case 5: // '\005'
                    arraylist22 = SafeParcelReader.createTypedList(parcel, k, DefaultPersonImpl.Birthdays.CREATOR);
                    hashset.add(Integer.valueOf(5));
                    break;

                case 6: // '\006'
                    arraylist21 = SafeParcelReader.createTypedList(parcel, k, DefaultPersonImpl.BraggingRights.CREATOR);
                    hashset.add(Integer.valueOf(6));
                    break;

                case 7: // '\007'
                    arraylist20 = SafeParcelReader.createTypedList(parcel, k, DefaultPersonImpl.CoverPhotos.CREATOR);
                    hashset.add(Integer.valueOf(7));
                    break;

                case 8: // '\b'
                    arraylist19 = SafeParcelReader.createTypedList(parcel, k, DefaultPersonImpl.CustomFields.CREATOR);
                    hashset.add(Integer.valueOf(8));
                    break;

                case 9: // '\t'
                    arraylist18 = SafeParcelReader.createTypedList(parcel, k, DefaultPersonImpl.Emails.CREATOR);
                    hashset.add(Integer.valueOf(9));
                    break;

                case 10: // '\n'
                    s3 = SafeParcelReader.createString(parcel, k);
                    hashset.add(Integer.valueOf(10));
                    break;

                case 11: // '\013'
                    arraylist17 = SafeParcelReader.createTypedList(parcel, k, DefaultPersonImpl.Events.CREATOR);
                    hashset.add(Integer.valueOf(11));
                    break;

                case 12: // '\f'
                    arraylist16 = SafeParcelReader.createTypedList(parcel, k, DefaultPersonImpl.Genders.CREATOR);
                    hashset.add(Integer.valueOf(12));
                    break;

                case 13: // '\r'
                    s2 = SafeParcelReader.createString(parcel, k);
                    hashset.add(Integer.valueOf(13));
                    break;

                case 14: // '\016'
                    arraylist15 = SafeParcelReader.createTypedList(parcel, k, DefaultPersonImpl.Images.CREATOR);
                    hashset.add(Integer.valueOf(14));
                    break;

                case 15: // '\017'
                    arraylist14 = SafeParcelReader.createTypedList(parcel, k, DefaultPersonImpl.InstantMessaging.CREATOR);
                    hashset.add(Integer.valueOf(15));
                    break;

                case 17: // '\021'
                    s1 = SafeParcelReader.createString(parcel, k);
                    hashset.add(Integer.valueOf(17));
                    break;

                case 19: // '\023'
                    arraylist13 = SafeParcelReader.createTypedList(parcel, k, DefaultPersonImpl.CREATOR);
                    hashset.add(Integer.valueOf(19));
                    break;

                case 18: // '\022'
                    legacyfields = (DefaultPersonImpl.LegacyFields)SafeParcelReader.createParcelable(parcel, k, DefaultPersonImpl.LegacyFields.CREATOR);
                    hashset.add(Integer.valueOf(18));
                    break;

                case 21: // '\025'
                    metadata = (DefaultPersonImpl.Metadata)SafeParcelReader.createParcelable(parcel, k, DefaultPersonImpl.Metadata.CREATOR);
                    hashset.add(Integer.valueOf(21));
                    break;

                case 20: // '\024'
                    arraylist12 = SafeParcelReader.createTypedList(parcel, k, DefaultPersonImpl.Memberships.CREATOR);
                    hashset.add(Integer.valueOf(20));
                    break;

                case 23: // '\027'
                    arraylist10 = SafeParcelReader.createTypedList(parcel, k, DefaultPersonImpl.Nicknames.CREATOR);
                    hashset.add(Integer.valueOf(23));
                    break;

                case 22: // '\026'
                    arraylist11 = SafeParcelReader.createTypedList(parcel, k, DefaultPersonImpl.Names.CREATOR);
                    hashset.add(Integer.valueOf(22));
                    break;

                case 25: // '\031'
                    arraylist8 = SafeParcelReader.createTypedList(parcel, k, DefaultPersonImpl.Organizations.CREATOR);
                    hashset.add(Integer.valueOf(25));
                    break;

                case 24: // '\030'
                    arraylist9 = SafeParcelReader.createTypedList(parcel, k, DefaultPersonImpl.Occupations.CREATOR);
                    hashset.add(Integer.valueOf(24));
                    break;

                case 27: // '\033'
                    arraylist6 = SafeParcelReader.createTypedList(parcel, k, DefaultPersonImpl.PlacesLived.CREATOR);
                    hashset.add(Integer.valueOf(27));
                    break;

                case 26: // '\032'
                    arraylist7 = SafeParcelReader.createTypedList(parcel, k, DefaultPersonImpl.PhoneNumbers.CREATOR);
                    hashset.add(Integer.valueOf(26));
                    break;

                case 29: // '\035'
                    arraylist5 = SafeParcelReader.createTypedList(parcel, k, DefaultPersonImpl.Relations.CREATOR);
                    hashset.add(Integer.valueOf(29));
                    break;

                case 28: // '\034'
                    s = SafeParcelReader.createString(parcel, k);
                    hashset.add(Integer.valueOf(28));
                    break;

                case 31: // '\037'
                    arraylist3 = SafeParcelReader.createTypedList(parcel, k, DefaultPersonImpl.RelationshipStatuses.CREATOR);
                    hashset.add(Integer.valueOf(31));
                    break;

                case 30: // '\036'
                    arraylist4 = SafeParcelReader.createTypedList(parcel, k, DefaultPersonImpl.RelationshipInterests.CREATOR);
                    hashset.add(Integer.valueOf(30));
                    break;

                case 34: // '"'
                    arraylist1 = SafeParcelReader.createTypedList(parcel, k, DefaultPersonImpl.Taglines.CREATOR);
                    hashset.add(Integer.valueOf(34));
                    break;

                case 35: // '#'
                    arraylist = SafeParcelReader.createTypedList(parcel, k, DefaultPersonImpl.Urls.CREATOR);
                    hashset.add(Integer.valueOf(35));
                    break;

                case 32: // ' '
                    arraylist2 = SafeParcelReader.createTypedList(parcel, k, DefaultPersonImpl.Skills.CREATOR);
                    hashset.add(Integer.valueOf(32));
                    break;

                case 33: // '!'
                    sortkeys = (DefaultPersonImpl.SortKeys)SafeParcelReader.createParcelable(parcel, k, DefaultPersonImpl.SortKeys.CREATOR);
                    hashset.add(Integer.valueOf(33));
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ParseException((new StringBuilder("Overread allowed size end=")).append(j).toString(), parcel);
            } else
            {
                return new DefaultPersonImpl(hashset, i, arraylist24, arraylist23, s4, arraylist22, arraylist21, arraylist20, arraylist19, arraylist18, s3, arraylist17, arraylist16, s2, arraylist15, arraylist14, s1, legacyfields, arraylist13, arraylist12, metadata, arraylist11, arraylist10, arraylist9, arraylist8, arraylist7, arraylist6, s, arraylist5, arraylist4, arraylist3, arraylist2, sortkeys, arraylist1, arraylist);
            }
        } while (true);
    }

    public final volatile Object[] newArray(int i)
    {
        return new DefaultPersonImpl[i];
    }
}
