// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.people.identity.internal.models;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.people.identity.models.Person;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

// Referenced classes of package com.google.android.gms.people.identity.internal.models:
//            PersonImplCreator, AboutsImplCreator, AddressesImplCreator, BirthdaysImplCreator, 
//            BraggingRightsImplCreator, CoverPhotosImplCreator, ImageReferenceImpl, CustomFieldsImplCreator, 
//            EmailsImplCreator, EventsImplCreator, GendersImplCreator, ImagesImplCreator, 
//            InstantMessagingImplCreator, LegacyFieldsImplCreator, MembershipsImplCreator, MetadataHolderImplCreator, 
//            MetadataImplCreator, NamesImplCreator, NicknamesImplCreator, NotesImplCreator, 
//            OccupationsImplCreator, OrganizationsImplCreator, ParcelableExternalContactsImplCreator, PersonMetadataImplCreator, 
//            PhoneNumbersImplCreator, PlacesLivedImplCreator, ProfileOwnerStatsImplCreator, RelationsImplCreator, 
//            RelationshipInterestsImplCreator, RelationshipStatusesImplCreator, SkillsImplCreator, SortKeysImplCreator, 
//            TaglinesImplCreator, UrlsImplCreator

public class PersonImpl
    implements SafeParcelable, Person
{
    public static class AboutsImpl
        implements SafeParcelable, com.google.android.gms.people.identity.models.Person.Abouts
    {

        public static final AboutsImplCreator CREATOR = new AboutsImplCreator();
        final Set mIndicatorSet;
        MetadataImpl mMetadata;
        String mType;
        String mValue;
        final int mVersionCode;

        public int describeContents()
        {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i)
        {
            AboutsImplCreator.writeToParcel(this, parcel, i);
        }


        public AboutsImpl()
        {
            mIndicatorSet = new HashSet();
            mVersionCode = 1;
        }

        AboutsImpl(Set set, int i, MetadataImpl metadataimpl, String s, String s1)
        {
            mIndicatorSet = set;
            mVersionCode = i;
            mMetadata = metadataimpl;
            mType = s;
            mValue = s1;
        }
    }

    public static class AddressesImpl
        implements SafeParcelable, com.google.android.gms.people.identity.models.Person.Addresses
    {

        public static final AddressesImplCreator CREATOR = new AddressesImplCreator();
        String mCity;
        String mCountry;
        String mCountryCode;
        String mFormattedType;
        final Set mIndicatorSet;
        MetadataImpl mMetadata;
        String mPoBox;
        String mPostalCode;
        String mRegion;
        String mStreetAddress;
        String mType;
        String mValue;
        final int mVersionCode;

        public int describeContents()
        {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i)
        {
            AddressesImplCreator.writeToParcel(this, parcel, i);
        }


        public AddressesImpl()
        {
            mIndicatorSet = new HashSet();
            mVersionCode = 1;
        }

        AddressesImpl(Set set, int i, MetadataImpl metadataimpl, String s, String s1, String s2, String s3, 
                String s4, String s5, String s6, String s7, String s8, String s9)
        {
            mIndicatorSet = set;
            mVersionCode = i;
            mMetadata = metadataimpl;
            mCity = s;
            mCountry = s1;
            mCountryCode = s2;
            mFormattedType = s3;
            mPoBox = s4;
            mPostalCode = s5;
            mRegion = s6;
            mStreetAddress = s7;
            mType = s8;
            mValue = s9;
        }
    }

    public static class BirthdaysImpl
        implements SafeParcelable, com.google.android.gms.people.identity.models.Person.Birthdays
    {

        public static final BirthdaysImplCreator CREATOR = new BirthdaysImplCreator();
        String mDate;
        final Set mIndicatorSet;
        MetadataImpl mMetadata;
        final int mVersionCode;

        public int describeContents()
        {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i)
        {
            BirthdaysImplCreator.writeToParcel(this, parcel, i);
        }


        public BirthdaysImpl()
        {
            mIndicatorSet = new HashSet();
            mVersionCode = 1;
        }

        BirthdaysImpl(Set set, int i, MetadataImpl metadataimpl, String s)
        {
            mIndicatorSet = set;
            mVersionCode = i;
            mMetadata = metadataimpl;
            mDate = s;
        }
    }

    public static class BraggingRightsImpl
        implements SafeParcelable, com.google.android.gms.people.identity.models.Person.BraggingRights
    {

        public static final BraggingRightsImplCreator CREATOR = new BraggingRightsImplCreator();
        final Set mIndicatorSet;
        MetadataImpl mMetadata;
        String mValue;
        final int mVersionCode;

        public int describeContents()
        {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i)
        {
            BraggingRightsImplCreator.writeToParcel(this, parcel, i);
        }


        public BraggingRightsImpl()
        {
            mIndicatorSet = new HashSet();
            mVersionCode = 1;
        }

        BraggingRightsImpl(Set set, int i, MetadataImpl metadataimpl, String s)
        {
            mIndicatorSet = set;
            mVersionCode = i;
            mMetadata = metadataimpl;
            mValue = s;
        }
    }

    public static class CoverPhotosImpl
        implements SafeParcelable, com.google.android.gms.people.identity.models.Person.CoverPhotos
    {

        public static final CoverPhotosImplCreator CREATOR = new CoverPhotosImplCreator();
        boolean mDefault;
        int mHeight;
        String mId;
        ImageReferenceImpl mImageReference;
        final Set mIndicatorSet;
        final int mVersionCode;
        int mWidth;

        public int describeContents()
        {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i)
        {
            CoverPhotosImplCreator.writeToParcel(this, parcel, i);
        }


        public CoverPhotosImpl()
        {
            mIndicatorSet = new HashSet();
            mVersionCode = 1;
        }

        CoverPhotosImpl(Set set, int i, int j, String s, ImageReferenceImpl imagereferenceimpl, int k, boolean flag)
        {
            mIndicatorSet = set;
            mVersionCode = i;
            mHeight = j;
            mId = s;
            mImageReference = imagereferenceimpl;
            mWidth = k;
            mDefault = flag;
        }
    }

    public static class CustomFieldsImpl
        implements SafeParcelable, com.google.android.gms.people.identity.models.Person.CustomFields
    {

        public static final CustomFieldsImplCreator CREATOR = new CustomFieldsImplCreator();
        final Set mIndicatorSet;
        String mKey;
        String mValue;
        final int mVersionCode;

        public int describeContents()
        {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i)
        {
            CustomFieldsImplCreator.writeToParcel$3d0fa9cf(this, parcel);
        }


        public CustomFieldsImpl()
        {
            mIndicatorSet = new HashSet();
            mVersionCode = 1;
        }

        CustomFieldsImpl(Set set, int i, String s, String s1)
        {
            mIndicatorSet = set;
            mVersionCode = i;
            mKey = s;
            mValue = s1;
        }
    }

    public static class EmailsImpl
        implements SafeParcelable, com.google.android.gms.people.identity.models.Person.Emails
    {

        public static final EmailsImplCreator CREATOR = new EmailsImplCreator();
        String mFormattedType;
        final Set mIndicatorSet;
        MetadataImpl mMetadata;
        int mTimesUsed;
        String mType;
        String mValue;
        final int mVersionCode;

        public int describeContents()
        {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i)
        {
            EmailsImplCreator.writeToParcel(this, parcel, i);
        }


        public EmailsImpl()
        {
            mIndicatorSet = new HashSet();
            mVersionCode = 1;
        }

        EmailsImpl(Set set, int i, MetadataImpl metadataimpl, String s, String s1, String s2, int j)
        {
            mIndicatorSet = set;
            mVersionCode = i;
            mMetadata = metadataimpl;
            mFormattedType = s;
            mType = s1;
            mValue = s2;
            mTimesUsed = j;
        }
    }

    public static class EventsImpl
        implements SafeParcelable, com.google.android.gms.people.identity.models.Person.Events
    {

        public static final EventsImplCreator CREATOR = new EventsImplCreator();
        String mDate;
        String mFormattedType;
        final Set mIndicatorSet;
        MetadataImpl mMetadata;
        String mType;
        final int mVersionCode;

        public int describeContents()
        {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i)
        {
            EventsImplCreator.writeToParcel(this, parcel, i);
        }


        public EventsImpl()
        {
            mIndicatorSet = new HashSet();
            mVersionCode = 1;
        }

        EventsImpl(Set set, int i, MetadataImpl metadataimpl, String s, String s1, String s2)
        {
            mIndicatorSet = set;
            mVersionCode = i;
            mMetadata = metadataimpl;
            mFormattedType = s;
            mType = s1;
            mDate = s2;
        }
    }

    public static class GendersImpl
        implements SafeParcelable, com.google.android.gms.people.identity.models.Person.Genders
    {

        public static final GendersImplCreator CREATOR = new GendersImplCreator();
        String mFormattedValue;
        final Set mIndicatorSet;
        MetadataImpl mMetadata;
        String mValue;
        final int mVersionCode;

        public int describeContents()
        {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i)
        {
            GendersImplCreator.writeToParcel(this, parcel, i);
        }


        public GendersImpl()
        {
            mIndicatorSet = new HashSet();
            mVersionCode = 1;
        }

        GendersImpl(Set set, int i, MetadataImpl metadataimpl, String s, String s1)
        {
            mIndicatorSet = set;
            mVersionCode = i;
            mMetadata = metadataimpl;
            mFormattedValue = s;
            mValue = s1;
        }
    }

    public static class ImagesImpl
        implements SafeParcelable, com.google.android.gms.people.identity.models.Person.Images
    {

        public static final ImagesImplCreator CREATOR = new ImagesImplCreator();
        boolean mDefault;
        ImageReferenceImpl mImageReference;
        final Set mIndicatorSet;
        MetadataImpl mMetadata;
        final int mVersionCode;

        public int describeContents()
        {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i)
        {
            ImagesImplCreator.writeToParcel(this, parcel, i);
        }


        public ImagesImpl()
        {
            mIndicatorSet = new HashSet();
            mVersionCode = 1;
        }

        ImagesImpl(Set set, int i, MetadataImpl metadataimpl, ImageReferenceImpl imagereferenceimpl, boolean flag)
        {
            mIndicatorSet = set;
            mVersionCode = i;
            mMetadata = metadataimpl;
            mImageReference = imagereferenceimpl;
            mDefault = flag;
        }
    }

    public static class InstantMessagingImpl
        implements SafeParcelable, com.google.android.gms.people.identity.models.Person.InstantMessaging
    {

        public static final InstantMessagingImplCreator CREATOR = new InstantMessagingImplCreator();
        String mFormattedProtocol;
        String mFormattedType;
        final Set mIndicatorSet;
        MetadataImpl mMetadata;
        String mProtocol;
        String mType;
        String mValue;
        final int mVersionCode;

        public int describeContents()
        {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i)
        {
            InstantMessagingImplCreator.writeToParcel(this, parcel, i);
        }


        public InstantMessagingImpl()
        {
            mIndicatorSet = new HashSet();
            mVersionCode = 1;
        }

        InstantMessagingImpl(Set set, int i, MetadataImpl metadataimpl, String s, String s1, String s2, String s3, 
                String s4)
        {
            mIndicatorSet = set;
            mVersionCode = i;
            mMetadata = metadataimpl;
            mFormattedProtocol = s;
            mFormattedType = s1;
            mProtocol = s2;
            mType = s3;
            mValue = s4;
        }
    }

    public static class LegacyFieldsImpl
        implements SafeParcelable, com.google.android.gms.people.identity.models.Person.LegacyFields
    {

        public static final LegacyFieldsImplCreator CREATOR = new LegacyFieldsImplCreator();
        final Set mIndicatorSet;
        String mMobileOwnerId;
        final int mVersionCode;

        public int describeContents()
        {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i)
        {
            LegacyFieldsImplCreator.writeToParcel$484c5389(this, parcel);
        }


        public LegacyFieldsImpl()
        {
            mIndicatorSet = new HashSet();
            mVersionCode = 1;
        }

        LegacyFieldsImpl(Set set, int i, String s)
        {
            mIndicatorSet = set;
            mVersionCode = i;
            mMobileOwnerId = s;
        }
    }

    public static class MembershipsImpl
        implements SafeParcelable, com.google.android.gms.people.identity.models.Person.Memberships
    {

        public static final MembershipsImplCreator CREATOR = new MembershipsImplCreator();
        String mCircle;
        String mContactGroup;
        final Set mIndicatorSet;
        MetadataImpl mMetadata;
        String mSystemContactGroup;
        final int mVersionCode;

        public int describeContents()
        {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i)
        {
            MembershipsImplCreator.writeToParcel(this, parcel, i);
        }


        public MembershipsImpl()
        {
            mIndicatorSet = new HashSet();
            mVersionCode = 1;
        }

        MembershipsImpl(Set set, int i, MetadataImpl metadataimpl, String s, String s1, String s2)
        {
            mIndicatorSet = set;
            mVersionCode = i;
            mMetadata = metadataimpl;
            mCircle = s;
            mContactGroup = s1;
            mSystemContactGroup = s2;
        }
    }

    public static class MetadataHolderImpl
        implements SafeParcelable, com.google.android.gms.people.identity.models.Person.MetadataHolder
    {

        public static final MetadataHolderImplCreator CREATOR = new MetadataHolderImplCreator();
        final Set mIndicatorSet;
        MetadataImpl mMetadata;
        final int mVersionCode;

        public int describeContents()
        {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i)
        {
            MetadataHolderImplCreator.writeToParcel(this, parcel, i);
        }


        public MetadataHolderImpl()
        {
            mIndicatorSet = new HashSet();
            mVersionCode = 1;
        }

        MetadataHolderImpl(Set set, int i, MetadataImpl metadataimpl)
        {
            mIndicatorSet = set;
            mVersionCode = i;
            mMetadata = metadataimpl;
        }
    }

    public static class MetadataImpl
        implements SafeParcelable, com.google.android.gms.people.identity.models.Person.Metadata
    {

        public static final MetadataImplCreator CREATOR = new MetadataImplCreator();
        String mContainer;
        String mContainerContactId;
        String mContainerId;
        boolean mEdgeKey;
        final Set mIndicatorSet;
        boolean mPrimary;
        int mRawContactId;
        boolean mVerified;
        final int mVersionCode;
        String mVisibility;
        boolean mWriteable;

        public int describeContents()
        {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i)
        {
            MetadataImplCreator.writeToParcel$ca4ed76(this, parcel);
        }


        public MetadataImpl()
        {
            mIndicatorSet = new HashSet();
            mVersionCode = 1;
        }

        MetadataImpl(Set set, int i, String s, String s1, String s2, String s3, boolean flag, 
                boolean flag1, boolean flag2, boolean flag3, int j)
        {
            mIndicatorSet = set;
            mVersionCode = i;
            mContainer = s;
            mContainerContactId = s1;
            mContainerId = s2;
            mVisibility = s3;
            mEdgeKey = flag;
            mPrimary = flag1;
            mVerified = flag2;
            mWriteable = flag3;
            mRawContactId = j;
        }
    }

    public static class NamesImpl
        implements SafeParcelable, com.google.android.gms.people.identity.models.Person.Names
    {

        public static final NamesImplCreator CREATOR = new NamesImplCreator();
        String mDisplayName;
        String mFamilyName;
        String mFormatted;
        String mGivenName;
        String mHonorificPrefix;
        String mHonorificSuffix;
        final Set mIndicatorSet;
        MetadataImpl mMetadata;
        String mMiddleName;
        String mPhoneticFamilyName;
        String mPhoneticGivenName;
        String mPhoneticHonorificPrefix;
        String mPhoneticHonorificSuffix;
        final int mVersionCode;

        public int describeContents()
        {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i)
        {
            NamesImplCreator.writeToParcel(this, parcel, i);
        }


        public NamesImpl()
        {
            mIndicatorSet = new HashSet();
            mVersionCode = 1;
        }

        NamesImpl(Set set, int i, MetadataImpl metadataimpl, String s, String s1, String s2, String s3, 
                String s4, String s5, String s6, String s7, String s8, String s9, String s10)
        {
            mIndicatorSet = set;
            mVersionCode = i;
            mMetadata = metadataimpl;
            mDisplayName = s;
            mFamilyName = s1;
            mFormatted = s2;
            mGivenName = s3;
            mHonorificPrefix = s4;
            mHonorificSuffix = s5;
            mMiddleName = s6;
            mPhoneticFamilyName = s7;
            mPhoneticGivenName = s8;
            mPhoneticHonorificPrefix = s9;
            mPhoneticHonorificSuffix = s10;
        }
    }

    public static class NicknamesImpl
        implements SafeParcelable, com.google.android.gms.people.identity.models.Person.Nicknames
    {

        public static final NicknamesImplCreator CREATOR = new NicknamesImplCreator();
        final Set mIndicatorSet;
        MetadataImpl mMetadata;
        String mType;
        String mValue;
        final int mVersionCode;

        public int describeContents()
        {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i)
        {
            NicknamesImplCreator.writeToParcel(this, parcel, i);
        }


        public NicknamesImpl()
        {
            mIndicatorSet = new HashSet();
            mVersionCode = 1;
        }

        NicknamesImpl(Set set, int i, MetadataImpl metadataimpl, String s, String s1)
        {
            mIndicatorSet = set;
            mVersionCode = i;
            mMetadata = metadataimpl;
            mType = s;
            mValue = s1;
        }
    }

    public static class NotesImpl
        implements SafeParcelable, com.google.android.gms.people.identity.models.Person.Notes
    {

        public static final NotesImplCreator CREATOR = new NotesImplCreator();
        final Set mIndicatorSet;
        MetadataImpl mMetadata;
        String mValue;
        final int mVersionCode;

        public int describeContents()
        {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i)
        {
            NotesImplCreator.writeToParcel(this, parcel, i);
        }


        public NotesImpl()
        {
            mIndicatorSet = new HashSet();
            mVersionCode = 1;
        }

        NotesImpl(Set set, int i, MetadataImpl metadataimpl, String s)
        {
            mIndicatorSet = set;
            mVersionCode = i;
            mMetadata = metadataimpl;
            mValue = s;
        }
    }

    public static class OccupationsImpl
        implements SafeParcelable, com.google.android.gms.people.identity.models.Person.Occupations
    {

        public static final OccupationsImplCreator CREATOR = new OccupationsImplCreator();
        final Set mIndicatorSet;
        MetadataImpl mMetadata;
        String mValue;
        final int mVersionCode;

        public int describeContents()
        {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i)
        {
            OccupationsImplCreator.writeToParcel(this, parcel, i);
        }


        public OccupationsImpl()
        {
            mIndicatorSet = new HashSet();
            mVersionCode = 1;
        }

        OccupationsImpl(Set set, int i, MetadataImpl metadataimpl, String s)
        {
            mIndicatorSet = set;
            mVersionCode = i;
            mMetadata = metadataimpl;
            mValue = s;
        }
    }

    public static class OrganizationsImpl
        implements SafeParcelable, com.google.android.gms.people.identity.models.Person.Organizations
    {

        public static final OrganizationsImplCreator CREATOR = new OrganizationsImplCreator();
        boolean mCurrent;
        String mDepartment;
        String mDescription;
        String mDomain;
        String mEndDate;
        final Set mIndicatorSet;
        String mLocation;
        MetadataImpl mMetadata;
        String mName;
        String mPhoneticName;
        String mStartDate;
        String mSymbol;
        String mTitle;
        String mType;
        final int mVersionCode;

        public int describeContents()
        {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i)
        {
            OrganizationsImplCreator.writeToParcel(this, parcel, i);
        }


        public OrganizationsImpl()
        {
            mIndicatorSet = new HashSet();
            mVersionCode = 1;
        }

        OrganizationsImpl(Set set, int i, MetadataImpl metadataimpl, boolean flag, String s, String s1, String s2, 
                String s3, String s4, String s5, String s6, String s7, String s8, String s9, 
                String s10)
        {
            mIndicatorSet = set;
            mVersionCode = i;
            mMetadata = metadataimpl;
            mCurrent = flag;
            mDepartment = s;
            mDescription = s1;
            mDomain = s2;
            mEndDate = s3;
            mLocation = s4;
            mName = s5;
            mPhoneticName = s6;
            mStartDate = s7;
            mSymbol = s8;
            mTitle = s9;
            mType = s10;
        }
    }

    public static class ParcelableExternalContactsImpl
        implements SafeParcelable, com.google.android.gms.people.identity.models.Person.ParcelableExternalContacts
    {

        public static final ParcelableExternalContactsImplCreator CREATOR = new ParcelableExternalContactsImplCreator();
        final Set mIndicatorSet;
        String mInteractionRank;
        String mName;
        final int mVersionCode;

        public int describeContents()
        {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i)
        {
            ParcelableExternalContactsImplCreator.writeToParcel$74f41d78(this, parcel);
        }


        public ParcelableExternalContactsImpl()
        {
            mIndicatorSet = new HashSet();
            mVersionCode = 1;
        }

        ParcelableExternalContactsImpl(Set set, int i, String s, String s1)
        {
            mIndicatorSet = set;
            mVersionCode = i;
            mInteractionRank = s;
            mName = s1;
        }
    }

    public static class PersonMetadataImpl
        implements SafeParcelable, com.google.android.gms.people.identity.models.Person.PersonMetadata
    {

        public static final PersonMetadataImplCreator CREATOR = new PersonMetadataImplCreator();
        List mAttributions;
        List mBlockTypes;
        boolean mBlocked;
        List mCircles;
        List mContacts;
        boolean mDeleted;
        List mGroups;
        boolean mInViewerDomain;
        List mIncomingBlockTypes;
        final Set mIndicatorSet;
        String mObjectType;
        String mOwnerId;
        List mOwnerUserTypes;
        String mPlusPageType;
        ProfileOwnerStatsImpl mProfileOwnerStats;
        final int mVersionCode;

        public int describeContents()
        {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i)
        {
            PersonMetadataImplCreator.writeToParcel(this, parcel, i);
        }


        public PersonMetadataImpl()
        {
            mIndicatorSet = new HashSet();
            mVersionCode = 1;
        }

        PersonMetadataImpl(Set set, int i, List list, List list1, List list2, List list3, List list4, 
                List list5, String s, String s1, List list6, String s2, ProfileOwnerStatsImpl profileownerstatsimpl, boolean flag, 
                boolean flag1, boolean flag2)
        {
            mIndicatorSet = set;
            mVersionCode = i;
            mAttributions = list;
            mBlockTypes = list1;
            mCircles = list2;
            mContacts = list3;
            mGroups = list4;
            mIncomingBlockTypes = list5;
            mObjectType = s;
            mOwnerId = s1;
            mOwnerUserTypes = list6;
            mPlusPageType = s2;
            mProfileOwnerStats = profileownerstatsimpl;
            mBlocked = flag;
            mDeleted = flag1;
            mInViewerDomain = flag2;
        }
    }

    public static class PhoneNumbersImpl
        implements SafeParcelable, com.google.android.gms.people.identity.models.Person.PhoneNumbers
    {

        public static final PhoneNumbersImplCreator CREATOR = new PhoneNumbersImplCreator();
        String mCanonicalizedForm;
        String mFormattedType;
        final Set mIndicatorSet;
        MetadataImpl mMetadata;
        int mTimesUsed;
        String mType;
        String mValue;
        final int mVersionCode;

        public int describeContents()
        {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i)
        {
            PhoneNumbersImplCreator.writeToParcel(this, parcel, i);
        }


        public PhoneNumbersImpl()
        {
            mIndicatorSet = new HashSet();
            mVersionCode = 1;
        }

        PhoneNumbersImpl(Set set, int i, MetadataImpl metadataimpl, String s, String s1, String s2, String s3, 
                int j)
        {
            mIndicatorSet = set;
            mVersionCode = i;
            mMetadata = metadataimpl;
            mCanonicalizedForm = s;
            mFormattedType = s1;
            mType = s2;
            mValue = s3;
            mTimesUsed = j;
        }
    }

    public static class PlacesLivedImpl
        implements SafeParcelable, com.google.android.gms.people.identity.models.Person.PlacesLived
    {

        public static final PlacesLivedImplCreator CREATOR = new PlacesLivedImplCreator();
        boolean mCurrent;
        final Set mIndicatorSet;
        MetadataImpl mMetadata;
        String mValue;
        final int mVersionCode;

        public int describeContents()
        {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i)
        {
            PlacesLivedImplCreator.writeToParcel(this, parcel, i);
        }


        public PlacesLivedImpl()
        {
            mIndicatorSet = new HashSet();
            mVersionCode = 1;
        }

        PlacesLivedImpl(Set set, int i, MetadataImpl metadataimpl, boolean flag, String s)
        {
            mIndicatorSet = set;
            mVersionCode = i;
            mMetadata = metadataimpl;
            mCurrent = flag;
            mValue = s;
        }
    }

    public static class ProfileOwnerStatsImpl
        implements SafeParcelable, com.google.android.gms.people.identity.models.Person.ProfileOwnerStats
    {

        public static final ProfileOwnerStatsImplCreator CREATOR = new ProfileOwnerStatsImplCreator();
        long mIncomingAnyCircleCount;
        final Set mIndicatorSet;
        final int mVersionCode;
        long mViewCount;

        public int describeContents()
        {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i)
        {
            ProfileOwnerStatsImplCreator.writeToParcel$25ba8b92(this, parcel);
        }


        public ProfileOwnerStatsImpl()
        {
            mIndicatorSet = new HashSet();
            mVersionCode = 1;
        }

        ProfileOwnerStatsImpl(Set set, int i, long l, long l1)
        {
            mIndicatorSet = set;
            mVersionCode = i;
            mIncomingAnyCircleCount = l;
            mViewCount = l1;
        }
    }

    public static class RelationsImpl
        implements SafeParcelable, com.google.android.gms.people.identity.models.Person.Relations
    {

        public static final RelationsImplCreator CREATOR = new RelationsImplCreator();
        String mFormattedType;
        final Set mIndicatorSet;
        MetadataImpl mMetadata;
        String mType;
        String mValue;
        final int mVersionCode;

        public int describeContents()
        {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i)
        {
            RelationsImplCreator.writeToParcel(this, parcel, i);
        }


        public RelationsImpl()
        {
            mIndicatorSet = new HashSet();
            mVersionCode = 1;
        }

        RelationsImpl(Set set, int i, MetadataImpl metadataimpl, String s, String s1, String s2)
        {
            mIndicatorSet = set;
            mVersionCode = i;
            mMetadata = metadataimpl;
            mFormattedType = s;
            mType = s1;
            mValue = s2;
        }
    }

    public static class RelationshipInterestsImpl
        implements SafeParcelable, com.google.android.gms.people.identity.models.Person.RelationshipInterests
    {

        public static final RelationshipInterestsImplCreator CREATOR = new RelationshipInterestsImplCreator();
        final Set mIndicatorSet;
        MetadataImpl mMetadata;
        String mValue;
        final int mVersionCode;

        public int describeContents()
        {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i)
        {
            RelationshipInterestsImplCreator.writeToParcel(this, parcel, i);
        }


        public RelationshipInterestsImpl()
        {
            mIndicatorSet = new HashSet();
            mVersionCode = 1;
        }

        RelationshipInterestsImpl(Set set, int i, MetadataImpl metadataimpl, String s)
        {
            mIndicatorSet = set;
            mVersionCode = i;
            mMetadata = metadataimpl;
            mValue = s;
        }
    }

    public static class RelationshipStatusesImpl
        implements SafeParcelable, com.google.android.gms.people.identity.models.Person.RelationshipStatuses
    {

        public static final RelationshipStatusesImplCreator CREATOR = new RelationshipStatusesImplCreator();
        String mFormattedValue;
        final Set mIndicatorSet;
        MetadataImpl mMetadata;
        String mValue;
        final int mVersionCode;

        public int describeContents()
        {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i)
        {
            RelationshipStatusesImplCreator.writeToParcel(this, parcel, i);
        }


        public RelationshipStatusesImpl()
        {
            mIndicatorSet = new HashSet();
            mVersionCode = 1;
        }

        RelationshipStatusesImpl(Set set, int i, MetadataImpl metadataimpl, String s, String s1)
        {
            mIndicatorSet = set;
            mVersionCode = i;
            mMetadata = metadataimpl;
            mFormattedValue = s;
            mValue = s1;
        }
    }

    public static class SkillsImpl
        implements SafeParcelable, com.google.android.gms.people.identity.models.Person.Skills
    {

        public static final SkillsImplCreator CREATOR = new SkillsImplCreator();
        final Set mIndicatorSet;
        MetadataImpl mMetadata;
        String mValue;
        final int mVersionCode;

        public int describeContents()
        {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i)
        {
            SkillsImplCreator.writeToParcel(this, parcel, i);
        }


        public SkillsImpl()
        {
            mIndicatorSet = new HashSet();
            mVersionCode = 1;
        }

        SkillsImpl(Set set, int i, MetadataImpl metadataimpl, String s)
        {
            mIndicatorSet = set;
            mVersionCode = i;
            mMetadata = metadataimpl;
            mValue = s;
        }
    }

    public static class SortKeysImpl
        implements SafeParcelable, com.google.android.gms.people.identity.models.Person.SortKeys
    {

        public static final SortKeysImplCreator CREATOR = new SortKeysImplCreator();
        final Set mIndicatorSet;
        String mInteractionRank;
        String mName;
        final int mVersionCode;

        public int describeContents()
        {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i)
        {
            SortKeysImplCreator.writeToParcel$6b3464d9(this, parcel);
        }


        public SortKeysImpl()
        {
            mIndicatorSet = new HashSet();
            mVersionCode = 1;
        }

        SortKeysImpl(Set set, int i, String s, String s1)
        {
            mIndicatorSet = set;
            mVersionCode = i;
            mInteractionRank = s;
            mName = s1;
        }
    }

    public static class TaglinesImpl
        implements SafeParcelable, com.google.android.gms.people.identity.models.Person.Taglines
    {

        public static final TaglinesImplCreator CREATOR = new TaglinesImplCreator();
        final Set mIndicatorSet;
        MetadataImpl mMetadata;
        String mValue;
        final int mVersionCode;

        public int describeContents()
        {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i)
        {
            TaglinesImplCreator.writeToParcel(this, parcel, i);
        }


        public TaglinesImpl()
        {
            mIndicatorSet = new HashSet();
            mVersionCode = 1;
        }

        TaglinesImpl(Set set, int i, MetadataImpl metadataimpl, String s)
        {
            mIndicatorSet = set;
            mVersionCode = i;
            mMetadata = metadataimpl;
            mValue = s;
        }
    }

    public static class UrlsImpl
        implements SafeParcelable, com.google.android.gms.people.identity.models.Person.Urls
    {

        public static final UrlsImplCreator CREATOR = new UrlsImplCreator();
        String mFormattedType;
        final Set mIndicatorSet;
        MetadataImpl mMetadata;
        String mType;
        String mValue;
        final int mVersionCode;

        public int describeContents()
        {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i)
        {
            UrlsImplCreator.writeToParcel(this, parcel, i);
        }


        public UrlsImpl()
        {
            mIndicatorSet = new HashSet();
            mVersionCode = 1;
        }

        UrlsImpl(Set set, int i, MetadataImpl metadataimpl, String s, String s1, String s2)
        {
            mIndicatorSet = set;
            mVersionCode = i;
            mMetadata = metadataimpl;
            mFormattedType = s;
            mType = s1;
            mValue = s2;
        }
    }


    public static final PersonImplCreator CREATOR = new PersonImplCreator();
    List mAbouts;
    List mAddresses;
    String mAgeRange;
    List mBirthdays;
    List mBraggingRights;
    List mCoverPhotos;
    List mCustomFields;
    List mEmails;
    String mEtag;
    List mEvents;
    List mGenders;
    String mId;
    List mImages;
    final Set mIndicatorSet;
    List mInstantMessaging;
    String mLanguage;
    LegacyFieldsImpl mLegacyFields;
    List mLinkedPeople;
    List mMemberships;
    PersonMetadataImpl mMetadata;
    List mNames;
    List mNicknames;
    List mNotes;
    List mOccupations;
    List mOrganizations;
    List mParcelableExternalContacts;
    List mPhoneNumbers;
    List mPlacesLived;
    String mProfileUrl;
    List mRelations;
    List mRelationshipInterests;
    List mRelationshipStatuses;
    List mSkills;
    SortKeysImpl mSortKeys;
    List mTaglines;
    List mUrls;
    final int mVersionCode;

    public PersonImpl()
    {
        mIndicatorSet = new HashSet();
        mVersionCode = 1;
    }

    PersonImpl(Set set, int i, List list, List list1, String s, List list2, List list3, 
            List list4, List list5, List list6, String s1, List list7, List list8, String s2, 
            List list9, List list10, String s3, LegacyFieldsImpl legacyfieldsimpl, List list11, List list12, PersonMetadataImpl personmetadataimpl, 
            List list13, List list14, List list15, List list16, List list17, List list18, String s4, 
            List list19, List list20, List list21, List list22, SortKeysImpl sortkeysimpl, List list23, List list24, 
            List list25, List list26)
    {
        mIndicatorSet = set;
        mVersionCode = i;
        mAbouts = list;
        mAddresses = list1;
        mAgeRange = s;
        mBirthdays = list2;
        mBraggingRights = list3;
        mCoverPhotos = list4;
        mCustomFields = list5;
        mEmails = list6;
        mEtag = s1;
        mEvents = list7;
        mGenders = list8;
        mId = s2;
        mImages = list9;
        mInstantMessaging = list10;
        mLanguage = s3;
        mLegacyFields = legacyfieldsimpl;
        mLinkedPeople = list11;
        mMemberships = list12;
        mMetadata = personmetadataimpl;
        mNames = list13;
        mNicknames = list14;
        mOccupations = list15;
        mOrganizations = list16;
        mPhoneNumbers = list17;
        mPlacesLived = list18;
        mProfileUrl = s4;
        mRelations = list19;
        mRelationshipInterests = list20;
        mRelationshipStatuses = list21;
        mSkills = list22;
        mSortKeys = sortkeysimpl;
        mTaglines = list23;
        mUrls = list24;
        mNotes = list25;
        mParcelableExternalContacts = list26;
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        PersonImplCreator.writeToParcel(this, parcel, i);
    }

}
