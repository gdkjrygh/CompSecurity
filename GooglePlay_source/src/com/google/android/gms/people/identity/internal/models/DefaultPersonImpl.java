// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.people.identity.internal.models;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.server.response.FastJsonResponse;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.google.android.gms.people.identity.internal.models:
//            DefaultPersonImplCreator, DefaultPersonImpl_AboutsCreator, DefaultMetadataImpl, DefaultPersonImpl_AddressesCreator, 
//            DefaultPersonImpl_BirthdaysCreator, DefaultPersonImpl_BraggingRightsCreator, DefaultPersonImpl_CoverPhotosCreator, DefaultPersonImpl_CustomFieldsCreator, 
//            DefaultPersonImpl_EmailsCreator, DefaultPersonImpl_EventsCreator, DefaultPersonImpl_GendersCreator, DefaultPersonImpl_ImagesCreator, 
//            DefaultPersonImpl_InstantMessagingCreator, DefaultPersonImpl_LegacyFieldsCreator, DefaultPersonImpl_MembershipsCreator, DefaultPersonImpl_MetadataCreator, 
//            DefaultPersonImpl_Metadata_AffinitiesCreator, DefaultPersonImpl_Metadata_ProfileOwnerStatsCreator, DefaultPersonImpl_NamesCreator, DefaultPersonImpl_NicknamesCreator, 
//            DefaultPersonImpl_OccupationsCreator, DefaultPersonImpl_OrganizationsCreator, DefaultPersonImpl_PhoneNumbersCreator, DefaultPersonImpl_PlacesLivedCreator, 
//            DefaultPersonImpl_RelationsCreator, DefaultPersonImpl_RelationshipInterestsCreator, DefaultPersonImpl_RelationshipStatusesCreator, DefaultPersonImpl_SkillsCreator, 
//            DefaultPersonImpl_SortKeysCreator, DefaultPersonImpl_SortKeys_AffinitiesCreator, DefaultPersonImpl_TaglinesCreator, DefaultPersonImpl_UrlsCreator

public class DefaultPersonImpl extends FastJsonResponse
    implements SafeParcelable
{
    public static final class Abouts extends FastJsonResponse
        implements SafeParcelable
    {

        public static final DefaultPersonImpl_AboutsCreator CREATOR = new DefaultPersonImpl_AboutsCreator();
        private static final HashMap sFields;
        final Set mIndicatorSet;
        DefaultMetadataImpl mMetadata;
        String mType;
        String mValue;
        final int mVersionCode;

        public final void addConcreteTypeInternal(com.google.android.gms.common.server.response.FastJsonResponse.Field field, String s, FastJsonResponse fastjsonresponse)
        {
            int i = field.getSafeParcelableFieldId();
            switch (i)
            {
            default:
                throw new IllegalArgumentException((new StringBuilder("Field with id=")).append(i).append(" is not a known custom type.  Found ").append(fastjsonresponse.getClass().getCanonicalName()).append(".").toString());

            case 2: // '\002'
                mMetadata = (DefaultMetadataImpl)fastjsonresponse;
                break;
            }
            mIndicatorSet.add(Integer.valueOf(i));
        }

        public final int describeContents()
        {
            return 0;
        }

        public final boolean equals(Object obj)
        {
            if (obj instanceof Abouts) goto _L2; else goto _L1
_L1:
            return false;
_L2:
            Iterator iterator;
            if (this == obj)
            {
                return true;
            }
            obj = (Abouts)obj;
            iterator = sFields.values().iterator();
_L5:
            com.google.android.gms.common.server.response.FastJsonResponse.Field field;
            if (!iterator.hasNext())
            {
                break MISSING_BLOCK_LABEL_96;
            }
            field = (com.google.android.gms.common.server.response.FastJsonResponse.Field)iterator.next();
            if (!isFieldSet(field))
            {
                continue; /* Loop/switch isn't completed */
            }
            if (!((Abouts) (obj)).isFieldSet(field)) goto _L1; else goto _L3
_L3:
            if (getFieldValue(field).equals(((Abouts) (obj)).getFieldValue(field))) goto _L5; else goto _L4
_L4:
            return false;
            if (!((Abouts) (obj)).isFieldSet(field)) goto _L5; else goto _L6
_L6:
            return false;
            return true;
        }

        public final volatile Map getFieldMappings()
        {
            return sFields;
        }

        protected final Object getFieldValue(com.google.android.gms.common.server.response.FastJsonResponse.Field field)
        {
            switch (field.getSafeParcelableFieldId())
            {
            default:
                throw new IllegalStateException((new StringBuilder("Unknown safe parcelable id=")).append(field.getSafeParcelableFieldId()).toString());

            case 2: // '\002'
                return mMetadata;

            case 3: // '\003'
                return mType;

            case 4: // '\004'
                return mValue;
            }
        }

        protected final Object getValueObject(String s)
        {
            return null;
        }

        public final int hashCode()
        {
            int i = 0;
            Iterator iterator = sFields.values().iterator();
            do
            {
                if (!iterator.hasNext())
                {
                    break;
                }
                com.google.android.gms.common.server.response.FastJsonResponse.Field field = (com.google.android.gms.common.server.response.FastJsonResponse.Field)iterator.next();
                if (isFieldSet(field))
                {
                    i = field.getSafeParcelableFieldId() + i + getFieldValue(field).hashCode();
                }
            } while (true);
            return i;
        }

        protected final boolean isFieldSet(com.google.android.gms.common.server.response.FastJsonResponse.Field field)
        {
            return mIndicatorSet.contains(Integer.valueOf(field.getSafeParcelableFieldId()));
        }

        protected final boolean isPrimitiveFieldSet(String s)
        {
            return false;
        }

        protected final void setStringInternal(com.google.android.gms.common.server.response.FastJsonResponse.Field field, String s, String s1)
        {
            int i = field.getSafeParcelableFieldId();
            i;
            JVM INSTR tableswitch 3 4: default 32
        //                       3 62
        //                       4 83;
               goto _L1 _L2 _L3
_L1:
            throw new IllegalArgumentException((new StringBuilder("Field with id=")).append(i).append(" is not known to be a String.").toString());
_L2:
            mType = s1;
_L5:
            mIndicatorSet.add(Integer.valueOf(i));
            return;
_L3:
            mValue = s1;
            if (true) goto _L5; else goto _L4
_L4:
        }

        public final void writeToParcel(Parcel parcel, int i)
        {
            DefaultPersonImpl_AboutsCreator.writeToParcel(this, parcel, i);
        }

        static 
        {
            HashMap hashmap = new HashMap();
            sFields = hashmap;
            hashmap.put("metadata", com.google.android.gms.common.server.response.FastJsonResponse.Field.forConcreteType("metadata", 2, com/google/android/gms/people/identity/internal/models/DefaultMetadataImpl));
            sFields.put("type", com.google.android.gms.common.server.response.FastJsonResponse.Field.forString("type", 3));
            sFields.put("value", com.google.android.gms.common.server.response.FastJsonResponse.Field.forString("value", 4));
        }

        public Abouts()
        {
            mVersionCode = 1;
            mIndicatorSet = new HashSet();
        }

        Abouts(Set set, int i, DefaultMetadataImpl defaultmetadataimpl, String s, String s1)
        {
            mIndicatorSet = set;
            mVersionCode = i;
            mMetadata = defaultmetadataimpl;
            mType = s;
            mValue = s1;
        }
    }

    public static final class Addresses extends FastJsonResponse
        implements SafeParcelable
    {

        public static final DefaultPersonImpl_AddressesCreator CREATOR = new DefaultPersonImpl_AddressesCreator();
        private static final HashMap sFields;
        String mCity;
        String mCountry;
        String mCountryCode;
        String mFormattedType;
        final Set mIndicatorSet;
        DefaultMetadataImpl mMetadata;
        String mPoBox;
        String mPostalCode;
        String mRegion;
        String mStreetAddress;
        String mType;
        String mValue;
        final int mVersionCode;

        public final void addConcreteTypeInternal(com.google.android.gms.common.server.response.FastJsonResponse.Field field, String s, FastJsonResponse fastjsonresponse)
        {
            int i = field.getSafeParcelableFieldId();
            switch (i)
            {
            default:
                throw new IllegalArgumentException((new StringBuilder("Field with id=")).append(i).append(" is not a known custom type.  Found ").append(fastjsonresponse.getClass().getCanonicalName()).append(".").toString());

            case 6: // '\006'
                mMetadata = (DefaultMetadataImpl)fastjsonresponse;
                break;
            }
            mIndicatorSet.add(Integer.valueOf(i));
        }

        public final int describeContents()
        {
            return 0;
        }

        public final boolean equals(Object obj)
        {
            if (obj instanceof Addresses) goto _L2; else goto _L1
_L1:
            return false;
_L2:
            Iterator iterator;
            if (this == obj)
            {
                return true;
            }
            obj = (Addresses)obj;
            iterator = sFields.values().iterator();
_L5:
            com.google.android.gms.common.server.response.FastJsonResponse.Field field;
            if (!iterator.hasNext())
            {
                break MISSING_BLOCK_LABEL_96;
            }
            field = (com.google.android.gms.common.server.response.FastJsonResponse.Field)iterator.next();
            if (!isFieldSet(field))
            {
                continue; /* Loop/switch isn't completed */
            }
            if (!((Addresses) (obj)).isFieldSet(field)) goto _L1; else goto _L3
_L3:
            if (getFieldValue(field).equals(((Addresses) (obj)).getFieldValue(field))) goto _L5; else goto _L4
_L4:
            return false;
            if (!((Addresses) (obj)).isFieldSet(field)) goto _L5; else goto _L6
_L6:
            return false;
            return true;
        }

        public final volatile Map getFieldMappings()
        {
            return sFields;
        }

        protected final Object getFieldValue(com.google.android.gms.common.server.response.FastJsonResponse.Field field)
        {
            switch (field.getSafeParcelableFieldId())
            {
            default:
                throw new IllegalStateException((new StringBuilder("Unknown safe parcelable id=")).append(field.getSafeParcelableFieldId()).toString());

            case 2: // '\002'
                return mCity;

            case 3: // '\003'
                return mCountry;

            case 4: // '\004'
                return mCountryCode;

            case 5: // '\005'
                return mFormattedType;

            case 6: // '\006'
                return mMetadata;

            case 7: // '\007'
                return mPoBox;

            case 8: // '\b'
                return mPostalCode;

            case 9: // '\t'
                return mRegion;

            case 10: // '\n'
                return mStreetAddress;

            case 11: // '\013'
                return mType;

            case 12: // '\f'
                return mValue;
            }
        }

        protected final Object getValueObject(String s)
        {
            return null;
        }

        public final int hashCode()
        {
            int i = 0;
            Iterator iterator = sFields.values().iterator();
            do
            {
                if (!iterator.hasNext())
                {
                    break;
                }
                com.google.android.gms.common.server.response.FastJsonResponse.Field field = (com.google.android.gms.common.server.response.FastJsonResponse.Field)iterator.next();
                if (isFieldSet(field))
                {
                    i = field.getSafeParcelableFieldId() + i + getFieldValue(field).hashCode();
                }
            } while (true);
            return i;
        }

        protected final boolean isFieldSet(com.google.android.gms.common.server.response.FastJsonResponse.Field field)
        {
            return mIndicatorSet.contains(Integer.valueOf(field.getSafeParcelableFieldId()));
        }

        protected final boolean isPrimitiveFieldSet(String s)
        {
            return false;
        }

        protected final void setStringInternal(com.google.android.gms.common.server.response.FastJsonResponse.Field field, String s, String s1)
        {
            int i = field.getSafeParcelableFieldId();
            i;
            JVM INSTR tableswitch 2 12: default 68
        //                       2 98
        //                       3 119
        //                       4 127
        //                       5 135
        //                       6 68
        //                       7 143
        //                       8 151
        //                       9 159
        //                       10 167
        //                       11 175
        //                       12 183;
               goto _L1 _L2 _L3 _L4 _L5 _L1 _L6 _L7 _L8 _L9 _L10 _L11
_L1:
            throw new IllegalArgumentException((new StringBuilder("Field with id=")).append(i).append(" is not known to be a String.").toString());
_L2:
            mCity = s1;
_L13:
            mIndicatorSet.add(Integer.valueOf(i));
            return;
_L3:
            mCountry = s1;
            continue; /* Loop/switch isn't completed */
_L4:
            mCountryCode = s1;
            continue; /* Loop/switch isn't completed */
_L5:
            mFormattedType = s1;
            continue; /* Loop/switch isn't completed */
_L6:
            mPoBox = s1;
            continue; /* Loop/switch isn't completed */
_L7:
            mPostalCode = s1;
            continue; /* Loop/switch isn't completed */
_L8:
            mRegion = s1;
            continue; /* Loop/switch isn't completed */
_L9:
            mStreetAddress = s1;
            continue; /* Loop/switch isn't completed */
_L10:
            mType = s1;
            continue; /* Loop/switch isn't completed */
_L11:
            mValue = s1;
            if (true) goto _L13; else goto _L12
_L12:
        }

        public final void writeToParcel(Parcel parcel, int i)
        {
            DefaultPersonImpl_AddressesCreator.writeToParcel(this, parcel, i);
        }

        static 
        {
            HashMap hashmap = new HashMap();
            sFields = hashmap;
            hashmap.put("city", com.google.android.gms.common.server.response.FastJsonResponse.Field.forString("city", 2));
            sFields.put("country", com.google.android.gms.common.server.response.FastJsonResponse.Field.forString("country", 3));
            sFields.put("countryCode", com.google.android.gms.common.server.response.FastJsonResponse.Field.forString("countryCode", 4));
            sFields.put("formattedType", com.google.android.gms.common.server.response.FastJsonResponse.Field.forString("formattedType", 5));
            sFields.put("metadata", com.google.android.gms.common.server.response.FastJsonResponse.Field.forConcreteType("metadata", 6, com/google/android/gms/people/identity/internal/models/DefaultMetadataImpl));
            sFields.put("poBox", com.google.android.gms.common.server.response.FastJsonResponse.Field.forString("poBox", 7));
            sFields.put("postalCode", com.google.android.gms.common.server.response.FastJsonResponse.Field.forString("postalCode", 8));
            sFields.put("region", com.google.android.gms.common.server.response.FastJsonResponse.Field.forString("region", 9));
            sFields.put("streetAddress", com.google.android.gms.common.server.response.FastJsonResponse.Field.forString("streetAddress", 10));
            sFields.put("type", com.google.android.gms.common.server.response.FastJsonResponse.Field.forString("type", 11));
            sFields.put("value", com.google.android.gms.common.server.response.FastJsonResponse.Field.forString("value", 12));
        }

        public Addresses()
        {
            mVersionCode = 1;
            mIndicatorSet = new HashSet();
        }

        Addresses(Set set, int i, String s, String s1, String s2, String s3, DefaultMetadataImpl defaultmetadataimpl, 
                String s4, String s5, String s6, String s7, String s8, String s9)
        {
            mIndicatorSet = set;
            mVersionCode = i;
            mCity = s;
            mCountry = s1;
            mCountryCode = s2;
            mFormattedType = s3;
            mMetadata = defaultmetadataimpl;
            mPoBox = s4;
            mPostalCode = s5;
            mRegion = s6;
            mStreetAddress = s7;
            mType = s8;
            mValue = s9;
        }
    }

    public static final class Birthdays extends FastJsonResponse
        implements SafeParcelable
    {

        public static final DefaultPersonImpl_BirthdaysCreator CREATOR = new DefaultPersonImpl_BirthdaysCreator();
        private static final HashMap sFields;
        String mDate;
        final Set mIndicatorSet;
        DefaultMetadataImpl mMetadata;
        final int mVersionCode;

        public final void addConcreteTypeInternal(com.google.android.gms.common.server.response.FastJsonResponse.Field field, String s, FastJsonResponse fastjsonresponse)
        {
            int i = field.getSafeParcelableFieldId();
            switch (i)
            {
            default:
                throw new IllegalArgumentException((new StringBuilder("Field with id=")).append(i).append(" is not a known custom type.  Found ").append(fastjsonresponse.getClass().getCanonicalName()).append(".").toString());

            case 3: // '\003'
                mMetadata = (DefaultMetadataImpl)fastjsonresponse;
                break;
            }
            mIndicatorSet.add(Integer.valueOf(i));
        }

        public final int describeContents()
        {
            return 0;
        }

        public final boolean equals(Object obj)
        {
            if (obj instanceof Birthdays) goto _L2; else goto _L1
_L1:
            return false;
_L2:
            Iterator iterator;
            if (this == obj)
            {
                return true;
            }
            obj = (Birthdays)obj;
            iterator = sFields.values().iterator();
_L5:
            com.google.android.gms.common.server.response.FastJsonResponse.Field field;
            if (!iterator.hasNext())
            {
                break MISSING_BLOCK_LABEL_96;
            }
            field = (com.google.android.gms.common.server.response.FastJsonResponse.Field)iterator.next();
            if (!isFieldSet(field))
            {
                continue; /* Loop/switch isn't completed */
            }
            if (!((Birthdays) (obj)).isFieldSet(field)) goto _L1; else goto _L3
_L3:
            if (getFieldValue(field).equals(((Birthdays) (obj)).getFieldValue(field))) goto _L5; else goto _L4
_L4:
            return false;
            if (!((Birthdays) (obj)).isFieldSet(field)) goto _L5; else goto _L6
_L6:
            return false;
            return true;
        }

        public final volatile Map getFieldMappings()
        {
            return sFields;
        }

        protected final Object getFieldValue(com.google.android.gms.common.server.response.FastJsonResponse.Field field)
        {
            switch (field.getSafeParcelableFieldId())
            {
            default:
                throw new IllegalStateException((new StringBuilder("Unknown safe parcelable id=")).append(field.getSafeParcelableFieldId()).toString());

            case 2: // '\002'
                return mDate;

            case 3: // '\003'
                return mMetadata;
            }
        }

        protected final Object getValueObject(String s)
        {
            return null;
        }

        public final int hashCode()
        {
            int i = 0;
            Iterator iterator = sFields.values().iterator();
            do
            {
                if (!iterator.hasNext())
                {
                    break;
                }
                com.google.android.gms.common.server.response.FastJsonResponse.Field field = (com.google.android.gms.common.server.response.FastJsonResponse.Field)iterator.next();
                if (isFieldSet(field))
                {
                    i = field.getSafeParcelableFieldId() + i + getFieldValue(field).hashCode();
                }
            } while (true);
            return i;
        }

        protected final boolean isFieldSet(com.google.android.gms.common.server.response.FastJsonResponse.Field field)
        {
            return mIndicatorSet.contains(Integer.valueOf(field.getSafeParcelableFieldId()));
        }

        protected final boolean isPrimitiveFieldSet(String s)
        {
            return false;
        }

        protected final void setStringInternal(com.google.android.gms.common.server.response.FastJsonResponse.Field field, String s, String s1)
        {
            int i = field.getSafeParcelableFieldId();
            switch (i)
            {
            default:
                throw new IllegalArgumentException((new StringBuilder("Field with id=")).append(i).append(" is not known to be a String.").toString());

            case 2: // '\002'
                mDate = s1;
                break;
            }
            mIndicatorSet.add(Integer.valueOf(i));
        }

        public final void writeToParcel(Parcel parcel, int i)
        {
            DefaultPersonImpl_BirthdaysCreator.writeToParcel(this, parcel, i);
        }

        static 
        {
            HashMap hashmap = new HashMap();
            sFields = hashmap;
            hashmap.put("date", com.google.android.gms.common.server.response.FastJsonResponse.Field.forString("date", 2));
            sFields.put("metadata", com.google.android.gms.common.server.response.FastJsonResponse.Field.forConcreteType("metadata", 3, com/google/android/gms/people/identity/internal/models/DefaultMetadataImpl));
        }

        public Birthdays()
        {
            mVersionCode = 1;
            mIndicatorSet = new HashSet();
        }

        Birthdays(Set set, int i, String s, DefaultMetadataImpl defaultmetadataimpl)
        {
            mIndicatorSet = set;
            mVersionCode = i;
            mDate = s;
            mMetadata = defaultmetadataimpl;
        }
    }

    public static final class BraggingRights extends FastJsonResponse
        implements SafeParcelable
    {

        public static final DefaultPersonImpl_BraggingRightsCreator CREATOR = new DefaultPersonImpl_BraggingRightsCreator();
        private static final HashMap sFields;
        final Set mIndicatorSet;
        DefaultMetadataImpl mMetadata;
        String mValue;
        final int mVersionCode;

        public final void addConcreteTypeInternal(com.google.android.gms.common.server.response.FastJsonResponse.Field field, String s, FastJsonResponse fastjsonresponse)
        {
            int i = field.getSafeParcelableFieldId();
            switch (i)
            {
            default:
                throw new IllegalArgumentException((new StringBuilder("Field with id=")).append(i).append(" is not a known custom type.  Found ").append(fastjsonresponse.getClass().getCanonicalName()).append(".").toString());

            case 2: // '\002'
                mMetadata = (DefaultMetadataImpl)fastjsonresponse;
                break;
            }
            mIndicatorSet.add(Integer.valueOf(i));
        }

        public final int describeContents()
        {
            return 0;
        }

        public final boolean equals(Object obj)
        {
            if (obj instanceof BraggingRights) goto _L2; else goto _L1
_L1:
            return false;
_L2:
            Iterator iterator;
            if (this == obj)
            {
                return true;
            }
            obj = (BraggingRights)obj;
            iterator = sFields.values().iterator();
_L5:
            com.google.android.gms.common.server.response.FastJsonResponse.Field field;
            if (!iterator.hasNext())
            {
                break MISSING_BLOCK_LABEL_96;
            }
            field = (com.google.android.gms.common.server.response.FastJsonResponse.Field)iterator.next();
            if (!isFieldSet(field))
            {
                continue; /* Loop/switch isn't completed */
            }
            if (!((BraggingRights) (obj)).isFieldSet(field)) goto _L1; else goto _L3
_L3:
            if (getFieldValue(field).equals(((BraggingRights) (obj)).getFieldValue(field))) goto _L5; else goto _L4
_L4:
            return false;
            if (!((BraggingRights) (obj)).isFieldSet(field)) goto _L5; else goto _L6
_L6:
            return false;
            return true;
        }

        public final volatile Map getFieldMappings()
        {
            return sFields;
        }

        protected final Object getFieldValue(com.google.android.gms.common.server.response.FastJsonResponse.Field field)
        {
            switch (field.getSafeParcelableFieldId())
            {
            default:
                throw new IllegalStateException((new StringBuilder("Unknown safe parcelable id=")).append(field.getSafeParcelableFieldId()).toString());

            case 2: // '\002'
                return mMetadata;

            case 3: // '\003'
                return mValue;
            }
        }

        protected final Object getValueObject(String s)
        {
            return null;
        }

        public final int hashCode()
        {
            int i = 0;
            Iterator iterator = sFields.values().iterator();
            do
            {
                if (!iterator.hasNext())
                {
                    break;
                }
                com.google.android.gms.common.server.response.FastJsonResponse.Field field = (com.google.android.gms.common.server.response.FastJsonResponse.Field)iterator.next();
                if (isFieldSet(field))
                {
                    i = field.getSafeParcelableFieldId() + i + getFieldValue(field).hashCode();
                }
            } while (true);
            return i;
        }

        protected final boolean isFieldSet(com.google.android.gms.common.server.response.FastJsonResponse.Field field)
        {
            return mIndicatorSet.contains(Integer.valueOf(field.getSafeParcelableFieldId()));
        }

        protected final boolean isPrimitiveFieldSet(String s)
        {
            return false;
        }

        protected final void setStringInternal(com.google.android.gms.common.server.response.FastJsonResponse.Field field, String s, String s1)
        {
            int i = field.getSafeParcelableFieldId();
            switch (i)
            {
            default:
                throw new IllegalArgumentException((new StringBuilder("Field with id=")).append(i).append(" is not known to be a String.").toString());

            case 3: // '\003'
                mValue = s1;
                break;
            }
            mIndicatorSet.add(Integer.valueOf(i));
        }

        public final void writeToParcel(Parcel parcel, int i)
        {
            DefaultPersonImpl_BraggingRightsCreator.writeToParcel(this, parcel, i);
        }

        static 
        {
            HashMap hashmap = new HashMap();
            sFields = hashmap;
            hashmap.put("metadata", com.google.android.gms.common.server.response.FastJsonResponse.Field.forConcreteType("metadata", 2, com/google/android/gms/people/identity/internal/models/DefaultMetadataImpl));
            sFields.put("value", com.google.android.gms.common.server.response.FastJsonResponse.Field.forString("value", 3));
        }

        public BraggingRights()
        {
            mVersionCode = 1;
            mIndicatorSet = new HashSet();
        }

        BraggingRights(Set set, int i, DefaultMetadataImpl defaultmetadataimpl, String s)
        {
            mIndicatorSet = set;
            mVersionCode = i;
            mMetadata = defaultmetadataimpl;
            mValue = s;
        }
    }

    public static final class CoverPhotos extends FastJsonResponse
        implements SafeParcelable
    {

        public static final DefaultPersonImpl_CoverPhotosCreator CREATOR = new DefaultPersonImpl_CoverPhotosCreator();
        private static final HashMap sFields;
        int mHeight;
        String mId;
        final Set mIndicatorSet;
        boolean mIsDefault;
        String mUrl;
        final int mVersionCode;
        int mWidth;

        public final int describeContents()
        {
            return 0;
        }

        public final boolean equals(Object obj)
        {
            if (obj instanceof CoverPhotos) goto _L2; else goto _L1
_L1:
            return false;
_L2:
            Iterator iterator;
            if (this == obj)
            {
                return true;
            }
            obj = (CoverPhotos)obj;
            iterator = sFields.values().iterator();
_L5:
            com.google.android.gms.common.server.response.FastJsonResponse.Field field;
            if (!iterator.hasNext())
            {
                break MISSING_BLOCK_LABEL_96;
            }
            field = (com.google.android.gms.common.server.response.FastJsonResponse.Field)iterator.next();
            if (!isFieldSet(field))
            {
                continue; /* Loop/switch isn't completed */
            }
            if (!((CoverPhotos) (obj)).isFieldSet(field)) goto _L1; else goto _L3
_L3:
            if (getFieldValue(field).equals(((CoverPhotos) (obj)).getFieldValue(field))) goto _L5; else goto _L4
_L4:
            return false;
            if (!((CoverPhotos) (obj)).isFieldSet(field)) goto _L5; else goto _L6
_L6:
            return false;
            return true;
        }

        public final volatile Map getFieldMappings()
        {
            return sFields;
        }

        protected final Object getFieldValue(com.google.android.gms.common.server.response.FastJsonResponse.Field field)
        {
            switch (field.getSafeParcelableFieldId())
            {
            default:
                throw new IllegalStateException((new StringBuilder("Unknown safe parcelable id=")).append(field.getSafeParcelableFieldId()).toString());

            case 2: // '\002'
                return Integer.valueOf(mHeight);

            case 3: // '\003'
                return mId;

            case 4: // '\004'
                return Boolean.valueOf(mIsDefault);

            case 5: // '\005'
                return mUrl;

            case 6: // '\006'
                return Integer.valueOf(mWidth);
            }
        }

        protected final Object getValueObject(String s)
        {
            return null;
        }

        public final int hashCode()
        {
            int i = 0;
            Iterator iterator = sFields.values().iterator();
            do
            {
                if (!iterator.hasNext())
                {
                    break;
                }
                com.google.android.gms.common.server.response.FastJsonResponse.Field field = (com.google.android.gms.common.server.response.FastJsonResponse.Field)iterator.next();
                if (isFieldSet(field))
                {
                    i = field.getSafeParcelableFieldId() + i + getFieldValue(field).hashCode();
                }
            } while (true);
            return i;
        }

        protected final boolean isFieldSet(com.google.android.gms.common.server.response.FastJsonResponse.Field field)
        {
            return mIndicatorSet.contains(Integer.valueOf(field.getSafeParcelableFieldId()));
        }

        protected final boolean isPrimitiveFieldSet(String s)
        {
            return false;
        }

        protected final void setBooleanInternal(com.google.android.gms.common.server.response.FastJsonResponse.Field field, String s, boolean flag)
        {
            int i = field.getSafeParcelableFieldId();
            switch (i)
            {
            default:
                throw new IllegalArgumentException((new StringBuilder("Field with id=")).append(i).append(" is not known to be a boolean.").toString());

            case 4: // '\004'
                mIsDefault = flag;
                break;
            }
            mIndicatorSet.add(Integer.valueOf(i));
        }

        protected final void setIntegerInternal(com.google.android.gms.common.server.response.FastJsonResponse.Field field, String s, int i)
        {
            int j = field.getSafeParcelableFieldId();
            j;
            JVM INSTR lookupswitch 2: default 36
        //                       2: 66
        //                       6: 87;
               goto _L1 _L2 _L3
_L1:
            throw new IllegalArgumentException((new StringBuilder("Field with id=")).append(j).append(" is not known to be an int.").toString());
_L2:
            mHeight = i;
_L5:
            mIndicatorSet.add(Integer.valueOf(j));
            return;
_L3:
            mWidth = i;
            if (true) goto _L5; else goto _L4
_L4:
        }

        protected final void setStringInternal(com.google.android.gms.common.server.response.FastJsonResponse.Field field, String s, String s1)
        {
            int i = field.getSafeParcelableFieldId();
            i;
            JVM INSTR tableswitch 3 5: default 36
        //                       3 66
        //                       4 36
        //                       5 87;
               goto _L1 _L2 _L1 _L3
_L1:
            throw new IllegalArgumentException((new StringBuilder("Field with id=")).append(i).append(" is not known to be a String.").toString());
_L2:
            mId = s1;
_L5:
            mIndicatorSet.add(Integer.valueOf(i));
            return;
_L3:
            mUrl = s1;
            if (true) goto _L5; else goto _L4
_L4:
        }

        public final void writeToParcel(Parcel parcel, int i)
        {
            DefaultPersonImpl_CoverPhotosCreator.writeToParcel$2ce9a6c2(this, parcel);
        }

        static 
        {
            HashMap hashmap = new HashMap();
            sFields = hashmap;
            hashmap.put("height", com.google.android.gms.common.server.response.FastJsonResponse.Field.forInteger("height", 2));
            sFields.put("id", com.google.android.gms.common.server.response.FastJsonResponse.Field.forString("id", 3));
            sFields.put("isDefault", com.google.android.gms.common.server.response.FastJsonResponse.Field.forBoolean("isDefault", 4));
            sFields.put("url", com.google.android.gms.common.server.response.FastJsonResponse.Field.forString("url", 5));
            sFields.put("width", com.google.android.gms.common.server.response.FastJsonResponse.Field.forInteger("width", 6));
        }

        public CoverPhotos()
        {
            mVersionCode = 1;
            mIndicatorSet = new HashSet();
        }

        CoverPhotos(Set set, int i, int j, String s, boolean flag, String s1, int k)
        {
            mIndicatorSet = set;
            mVersionCode = i;
            mHeight = j;
            mId = s;
            mIsDefault = flag;
            mUrl = s1;
            mWidth = k;
        }
    }

    public static final class CustomFields extends FastJsonResponse
        implements SafeParcelable
    {

        public static final DefaultPersonImpl_CustomFieldsCreator CREATOR = new DefaultPersonImpl_CustomFieldsCreator();
        private static final HashMap sFields;
        final Set mIndicatorSet;
        String mKey;
        String mValue;
        final int mVersionCode;

        public final int describeContents()
        {
            return 0;
        }

        public final boolean equals(Object obj)
        {
            if (obj instanceof CustomFields) goto _L2; else goto _L1
_L1:
            return false;
_L2:
            Iterator iterator;
            if (this == obj)
            {
                return true;
            }
            obj = (CustomFields)obj;
            iterator = sFields.values().iterator();
_L5:
            com.google.android.gms.common.server.response.FastJsonResponse.Field field;
            if (!iterator.hasNext())
            {
                break MISSING_BLOCK_LABEL_96;
            }
            field = (com.google.android.gms.common.server.response.FastJsonResponse.Field)iterator.next();
            if (!isFieldSet(field))
            {
                continue; /* Loop/switch isn't completed */
            }
            if (!((CustomFields) (obj)).isFieldSet(field)) goto _L1; else goto _L3
_L3:
            if (getFieldValue(field).equals(((CustomFields) (obj)).getFieldValue(field))) goto _L5; else goto _L4
_L4:
            return false;
            if (!((CustomFields) (obj)).isFieldSet(field)) goto _L5; else goto _L6
_L6:
            return false;
            return true;
        }

        public final volatile Map getFieldMappings()
        {
            return sFields;
        }

        protected final Object getFieldValue(com.google.android.gms.common.server.response.FastJsonResponse.Field field)
        {
            switch (field.getSafeParcelableFieldId())
            {
            default:
                throw new IllegalStateException((new StringBuilder("Unknown safe parcelable id=")).append(field.getSafeParcelableFieldId()).toString());

            case 2: // '\002'
                return mKey;

            case 3: // '\003'
                return mValue;
            }
        }

        protected final Object getValueObject(String s)
        {
            return null;
        }

        public final int hashCode()
        {
            int i = 0;
            Iterator iterator = sFields.values().iterator();
            do
            {
                if (!iterator.hasNext())
                {
                    break;
                }
                com.google.android.gms.common.server.response.FastJsonResponse.Field field = (com.google.android.gms.common.server.response.FastJsonResponse.Field)iterator.next();
                if (isFieldSet(field))
                {
                    i = field.getSafeParcelableFieldId() + i + getFieldValue(field).hashCode();
                }
            } while (true);
            return i;
        }

        protected final boolean isFieldSet(com.google.android.gms.common.server.response.FastJsonResponse.Field field)
        {
            return mIndicatorSet.contains(Integer.valueOf(field.getSafeParcelableFieldId()));
        }

        protected final boolean isPrimitiveFieldSet(String s)
        {
            return false;
        }

        protected final void setStringInternal(com.google.android.gms.common.server.response.FastJsonResponse.Field field, String s, String s1)
        {
            int i = field.getSafeParcelableFieldId();
            i;
            JVM INSTR tableswitch 2 3: default 32
        //                       2 62
        //                       3 83;
               goto _L1 _L2 _L3
_L1:
            throw new IllegalArgumentException((new StringBuilder("Field with id=")).append(i).append(" is not known to be a String.").toString());
_L2:
            mKey = s1;
_L5:
            mIndicatorSet.add(Integer.valueOf(i));
            return;
_L3:
            mValue = s1;
            if (true) goto _L5; else goto _L4
_L4:
        }

        public final void writeToParcel(Parcel parcel, int i)
        {
            DefaultPersonImpl_CustomFieldsCreator.writeToParcel$2bdc1e24(this, parcel);
        }

        static 
        {
            HashMap hashmap = new HashMap();
            sFields = hashmap;
            hashmap.put("key", com.google.android.gms.common.server.response.FastJsonResponse.Field.forString("key", 2));
            sFields.put("value", com.google.android.gms.common.server.response.FastJsonResponse.Field.forString("value", 3));
        }

        public CustomFields()
        {
            mVersionCode = 1;
            mIndicatorSet = new HashSet();
        }

        CustomFields(Set set, int i, String s, String s1)
        {
            mIndicatorSet = set;
            mVersionCode = i;
            mKey = s;
            mValue = s1;
        }
    }

    public static final class Emails extends FastJsonResponse
        implements SafeParcelable
    {

        public static final DefaultPersonImpl_EmailsCreator CREATOR = new DefaultPersonImpl_EmailsCreator();
        private static final HashMap sFields;
        String mFormattedType;
        final Set mIndicatorSet;
        DefaultMetadataImpl mMetadata;
        String mType;
        String mValue;
        final int mVersionCode;

        public final void addConcreteTypeInternal(com.google.android.gms.common.server.response.FastJsonResponse.Field field, String s, FastJsonResponse fastjsonresponse)
        {
            int i = field.getSafeParcelableFieldId();
            switch (i)
            {
            default:
                throw new IllegalArgumentException((new StringBuilder("Field with id=")).append(i).append(" is not a known custom type.  Found ").append(fastjsonresponse.getClass().getCanonicalName()).append(".").toString());

            case 3: // '\003'
                mMetadata = (DefaultMetadataImpl)fastjsonresponse;
                break;
            }
            mIndicatorSet.add(Integer.valueOf(i));
        }

        public final int describeContents()
        {
            return 0;
        }

        public final boolean equals(Object obj)
        {
            if (obj instanceof Emails) goto _L2; else goto _L1
_L1:
            return false;
_L2:
            Iterator iterator;
            if (this == obj)
            {
                return true;
            }
            obj = (Emails)obj;
            iterator = sFields.values().iterator();
_L5:
            com.google.android.gms.common.server.response.FastJsonResponse.Field field;
            if (!iterator.hasNext())
            {
                break MISSING_BLOCK_LABEL_96;
            }
            field = (com.google.android.gms.common.server.response.FastJsonResponse.Field)iterator.next();
            if (!isFieldSet(field))
            {
                continue; /* Loop/switch isn't completed */
            }
            if (!((Emails) (obj)).isFieldSet(field)) goto _L1; else goto _L3
_L3:
            if (getFieldValue(field).equals(((Emails) (obj)).getFieldValue(field))) goto _L5; else goto _L4
_L4:
            return false;
            if (!((Emails) (obj)).isFieldSet(field)) goto _L5; else goto _L6
_L6:
            return false;
            return true;
        }

        public final volatile Map getFieldMappings()
        {
            return sFields;
        }

        protected final Object getFieldValue(com.google.android.gms.common.server.response.FastJsonResponse.Field field)
        {
            switch (field.getSafeParcelableFieldId())
            {
            default:
                throw new IllegalStateException((new StringBuilder("Unknown safe parcelable id=")).append(field.getSafeParcelableFieldId()).toString());

            case 2: // '\002'
                return mFormattedType;

            case 3: // '\003'
                return mMetadata;

            case 4: // '\004'
                return mType;

            case 5: // '\005'
                return mValue;
            }
        }

        protected final Object getValueObject(String s)
        {
            return null;
        }

        public final int hashCode()
        {
            int i = 0;
            Iterator iterator = sFields.values().iterator();
            do
            {
                if (!iterator.hasNext())
                {
                    break;
                }
                com.google.android.gms.common.server.response.FastJsonResponse.Field field = (com.google.android.gms.common.server.response.FastJsonResponse.Field)iterator.next();
                if (isFieldSet(field))
                {
                    i = field.getSafeParcelableFieldId() + i + getFieldValue(field).hashCode();
                }
            } while (true);
            return i;
        }

        protected final boolean isFieldSet(com.google.android.gms.common.server.response.FastJsonResponse.Field field)
        {
            return mIndicatorSet.contains(Integer.valueOf(field.getSafeParcelableFieldId()));
        }

        protected final boolean isPrimitiveFieldSet(String s)
        {
            return false;
        }

        protected final void setStringInternal(com.google.android.gms.common.server.response.FastJsonResponse.Field field, String s, String s1)
        {
            int i = field.getSafeParcelableFieldId();
            i;
            JVM INSTR tableswitch 2 5: default 40
        //                       2 70
        //                       3 40
        //                       4 91
        //                       5 99;
               goto _L1 _L2 _L1 _L3 _L4
_L1:
            throw new IllegalArgumentException((new StringBuilder("Field with id=")).append(i).append(" is not known to be a String.").toString());
_L2:
            mFormattedType = s1;
_L6:
            mIndicatorSet.add(Integer.valueOf(i));
            return;
_L3:
            mType = s1;
            continue; /* Loop/switch isn't completed */
_L4:
            mValue = s1;
            if (true) goto _L6; else goto _L5
_L5:
        }

        public final void writeToParcel(Parcel parcel, int i)
        {
            DefaultPersonImpl_EmailsCreator.writeToParcel(this, parcel, i);
        }

        static 
        {
            HashMap hashmap = new HashMap();
            sFields = hashmap;
            hashmap.put("formattedType", com.google.android.gms.common.server.response.FastJsonResponse.Field.forString("formattedType", 2));
            sFields.put("metadata", com.google.android.gms.common.server.response.FastJsonResponse.Field.forConcreteType("metadata", 3, com/google/android/gms/people/identity/internal/models/DefaultMetadataImpl));
            sFields.put("type", com.google.android.gms.common.server.response.FastJsonResponse.Field.forString("type", 4));
            sFields.put("value", com.google.android.gms.common.server.response.FastJsonResponse.Field.forString("value", 5));
        }

        public Emails()
        {
            mVersionCode = 1;
            mIndicatorSet = new HashSet();
        }

        Emails(Set set, int i, String s, DefaultMetadataImpl defaultmetadataimpl, String s1, String s2)
        {
            mIndicatorSet = set;
            mVersionCode = i;
            mFormattedType = s;
            mMetadata = defaultmetadataimpl;
            mType = s1;
            mValue = s2;
        }
    }

    public static final class Events extends FastJsonResponse
        implements SafeParcelable
    {

        public static final DefaultPersonImpl_EventsCreator CREATOR = new DefaultPersonImpl_EventsCreator();
        private static final HashMap sFields;
        String mDate;
        String mFormattedType;
        final Set mIndicatorSet;
        DefaultMetadataImpl mMetadata;
        String mType;
        final int mVersionCode;

        public final void addConcreteTypeInternal(com.google.android.gms.common.server.response.FastJsonResponse.Field field, String s, FastJsonResponse fastjsonresponse)
        {
            int i = field.getSafeParcelableFieldId();
            switch (i)
            {
            default:
                throw new IllegalArgumentException((new StringBuilder("Field with id=")).append(i).append(" is not a known custom type.  Found ").append(fastjsonresponse.getClass().getCanonicalName()).append(".").toString());

            case 4: // '\004'
                mMetadata = (DefaultMetadataImpl)fastjsonresponse;
                break;
            }
            mIndicatorSet.add(Integer.valueOf(i));
        }

        public final int describeContents()
        {
            return 0;
        }

        public final boolean equals(Object obj)
        {
            if (obj instanceof Events) goto _L2; else goto _L1
_L1:
            return false;
_L2:
            Iterator iterator;
            if (this == obj)
            {
                return true;
            }
            obj = (Events)obj;
            iterator = sFields.values().iterator();
_L5:
            com.google.android.gms.common.server.response.FastJsonResponse.Field field;
            if (!iterator.hasNext())
            {
                break MISSING_BLOCK_LABEL_96;
            }
            field = (com.google.android.gms.common.server.response.FastJsonResponse.Field)iterator.next();
            if (!isFieldSet(field))
            {
                continue; /* Loop/switch isn't completed */
            }
            if (!((Events) (obj)).isFieldSet(field)) goto _L1; else goto _L3
_L3:
            if (getFieldValue(field).equals(((Events) (obj)).getFieldValue(field))) goto _L5; else goto _L4
_L4:
            return false;
            if (!((Events) (obj)).isFieldSet(field)) goto _L5; else goto _L6
_L6:
            return false;
            return true;
        }

        public final volatile Map getFieldMappings()
        {
            return sFields;
        }

        protected final Object getFieldValue(com.google.android.gms.common.server.response.FastJsonResponse.Field field)
        {
            switch (field.getSafeParcelableFieldId())
            {
            default:
                throw new IllegalStateException((new StringBuilder("Unknown safe parcelable id=")).append(field.getSafeParcelableFieldId()).toString());

            case 2: // '\002'
                return mDate;

            case 3: // '\003'
                return mFormattedType;

            case 4: // '\004'
                return mMetadata;

            case 5: // '\005'
                return mType;
            }
        }

        protected final Object getValueObject(String s)
        {
            return null;
        }

        public final int hashCode()
        {
            int i = 0;
            Iterator iterator = sFields.values().iterator();
            do
            {
                if (!iterator.hasNext())
                {
                    break;
                }
                com.google.android.gms.common.server.response.FastJsonResponse.Field field = (com.google.android.gms.common.server.response.FastJsonResponse.Field)iterator.next();
                if (isFieldSet(field))
                {
                    i = field.getSafeParcelableFieldId() + i + getFieldValue(field).hashCode();
                }
            } while (true);
            return i;
        }

        protected final boolean isFieldSet(com.google.android.gms.common.server.response.FastJsonResponse.Field field)
        {
            return mIndicatorSet.contains(Integer.valueOf(field.getSafeParcelableFieldId()));
        }

        protected final boolean isPrimitiveFieldSet(String s)
        {
            return false;
        }

        protected final void setStringInternal(com.google.android.gms.common.server.response.FastJsonResponse.Field field, String s, String s1)
        {
            int i = field.getSafeParcelableFieldId();
            i;
            JVM INSTR tableswitch 2 5: default 40
        //                       2 70
        //                       3 91
        //                       4 40
        //                       5 99;
               goto _L1 _L2 _L3 _L1 _L4
_L1:
            throw new IllegalArgumentException((new StringBuilder("Field with id=")).append(i).append(" is not known to be a String.").toString());
_L2:
            mDate = s1;
_L6:
            mIndicatorSet.add(Integer.valueOf(i));
            return;
_L3:
            mFormattedType = s1;
            continue; /* Loop/switch isn't completed */
_L4:
            mType = s1;
            if (true) goto _L6; else goto _L5
_L5:
        }

        public final void writeToParcel(Parcel parcel, int i)
        {
            DefaultPersonImpl_EventsCreator.writeToParcel(this, parcel, i);
        }

        static 
        {
            HashMap hashmap = new HashMap();
            sFields = hashmap;
            hashmap.put("date", com.google.android.gms.common.server.response.FastJsonResponse.Field.forString("date", 2));
            sFields.put("formattedType", com.google.android.gms.common.server.response.FastJsonResponse.Field.forString("formattedType", 3));
            sFields.put("metadata", com.google.android.gms.common.server.response.FastJsonResponse.Field.forConcreteType("metadata", 4, com/google/android/gms/people/identity/internal/models/DefaultMetadataImpl));
            sFields.put("type", com.google.android.gms.common.server.response.FastJsonResponse.Field.forString("type", 5));
        }

        public Events()
        {
            mVersionCode = 1;
            mIndicatorSet = new HashSet();
        }

        Events(Set set, int i, String s, String s1, DefaultMetadataImpl defaultmetadataimpl, String s2)
        {
            mIndicatorSet = set;
            mVersionCode = i;
            mDate = s;
            mFormattedType = s1;
            mMetadata = defaultmetadataimpl;
            mType = s2;
        }
    }

    public static final class Genders extends FastJsonResponse
        implements SafeParcelable
    {

        public static final DefaultPersonImpl_GendersCreator CREATOR = new DefaultPersonImpl_GendersCreator();
        private static final HashMap sFields;
        String mFormattedValue;
        final Set mIndicatorSet;
        DefaultMetadataImpl mMetadata;
        String mValue;
        final int mVersionCode;

        public final void addConcreteTypeInternal(com.google.android.gms.common.server.response.FastJsonResponse.Field field, String s, FastJsonResponse fastjsonresponse)
        {
            int i = field.getSafeParcelableFieldId();
            switch (i)
            {
            default:
                throw new IllegalArgumentException((new StringBuilder("Field with id=")).append(i).append(" is not a known custom type.  Found ").append(fastjsonresponse.getClass().getCanonicalName()).append(".").toString());

            case 3: // '\003'
                mMetadata = (DefaultMetadataImpl)fastjsonresponse;
                break;
            }
            mIndicatorSet.add(Integer.valueOf(i));
        }

        public final int describeContents()
        {
            return 0;
        }

        public final boolean equals(Object obj)
        {
            if (obj instanceof Genders) goto _L2; else goto _L1
_L1:
            return false;
_L2:
            Iterator iterator;
            if (this == obj)
            {
                return true;
            }
            obj = (Genders)obj;
            iterator = sFields.values().iterator();
_L5:
            com.google.android.gms.common.server.response.FastJsonResponse.Field field;
            if (!iterator.hasNext())
            {
                break MISSING_BLOCK_LABEL_96;
            }
            field = (com.google.android.gms.common.server.response.FastJsonResponse.Field)iterator.next();
            if (!isFieldSet(field))
            {
                continue; /* Loop/switch isn't completed */
            }
            if (!((Genders) (obj)).isFieldSet(field)) goto _L1; else goto _L3
_L3:
            if (getFieldValue(field).equals(((Genders) (obj)).getFieldValue(field))) goto _L5; else goto _L4
_L4:
            return false;
            if (!((Genders) (obj)).isFieldSet(field)) goto _L5; else goto _L6
_L6:
            return false;
            return true;
        }

        public final volatile Map getFieldMappings()
        {
            return sFields;
        }

        protected final Object getFieldValue(com.google.android.gms.common.server.response.FastJsonResponse.Field field)
        {
            switch (field.getSafeParcelableFieldId())
            {
            default:
                throw new IllegalStateException((new StringBuilder("Unknown safe parcelable id=")).append(field.getSafeParcelableFieldId()).toString());

            case 2: // '\002'
                return mFormattedValue;

            case 3: // '\003'
                return mMetadata;

            case 4: // '\004'
                return mValue;
            }
        }

        protected final Object getValueObject(String s)
        {
            return null;
        }

        public final int hashCode()
        {
            int i = 0;
            Iterator iterator = sFields.values().iterator();
            do
            {
                if (!iterator.hasNext())
                {
                    break;
                }
                com.google.android.gms.common.server.response.FastJsonResponse.Field field = (com.google.android.gms.common.server.response.FastJsonResponse.Field)iterator.next();
                if (isFieldSet(field))
                {
                    i = field.getSafeParcelableFieldId() + i + getFieldValue(field).hashCode();
                }
            } while (true);
            return i;
        }

        protected final boolean isFieldSet(com.google.android.gms.common.server.response.FastJsonResponse.Field field)
        {
            return mIndicatorSet.contains(Integer.valueOf(field.getSafeParcelableFieldId()));
        }

        protected final boolean isPrimitiveFieldSet(String s)
        {
            return false;
        }

        protected final void setStringInternal(com.google.android.gms.common.server.response.FastJsonResponse.Field field, String s, String s1)
        {
            int i = field.getSafeParcelableFieldId();
            i;
            JVM INSTR tableswitch 2 4: default 36
        //                       2 66
        //                       3 36
        //                       4 87;
               goto _L1 _L2 _L1 _L3
_L1:
            throw new IllegalArgumentException((new StringBuilder("Field with id=")).append(i).append(" is not known to be a String.").toString());
_L2:
            mFormattedValue = s1;
_L5:
            mIndicatorSet.add(Integer.valueOf(i));
            return;
_L3:
            mValue = s1;
            if (true) goto _L5; else goto _L4
_L4:
        }

        public final void writeToParcel(Parcel parcel, int i)
        {
            DefaultPersonImpl_GendersCreator.writeToParcel(this, parcel, i);
        }

        static 
        {
            HashMap hashmap = new HashMap();
            sFields = hashmap;
            hashmap.put("formattedValue", com.google.android.gms.common.server.response.FastJsonResponse.Field.forString("formattedValue", 2));
            sFields.put("metadata", com.google.android.gms.common.server.response.FastJsonResponse.Field.forConcreteType("metadata", 3, com/google/android/gms/people/identity/internal/models/DefaultMetadataImpl));
            sFields.put("value", com.google.android.gms.common.server.response.FastJsonResponse.Field.forString("value", 4));
        }

        public Genders()
        {
            mVersionCode = 1;
            mIndicatorSet = new HashSet();
        }

        Genders(Set set, int i, String s, DefaultMetadataImpl defaultmetadataimpl, String s1)
        {
            mIndicatorSet = set;
            mVersionCode = i;
            mFormattedValue = s;
            mMetadata = defaultmetadataimpl;
            mValue = s1;
        }
    }

    public static final class Images extends FastJsonResponse
        implements SafeParcelable
    {

        public static final DefaultPersonImpl_ImagesCreator CREATOR = new DefaultPersonImpl_ImagesCreator();
        private static final HashMap sFields;
        final Set mIndicatorSet;
        boolean mIsDefault;
        DefaultMetadataImpl mMetadata;
        String mUrl;
        final int mVersionCode;

        public final void addConcreteTypeInternal(com.google.android.gms.common.server.response.FastJsonResponse.Field field, String s, FastJsonResponse fastjsonresponse)
        {
            int i = field.getSafeParcelableFieldId();
            switch (i)
            {
            default:
                throw new IllegalArgumentException((new StringBuilder("Field with id=")).append(i).append(" is not a known custom type.  Found ").append(fastjsonresponse.getClass().getCanonicalName()).append(".").toString());

            case 3: // '\003'
                mMetadata = (DefaultMetadataImpl)fastjsonresponse;
                break;
            }
            mIndicatorSet.add(Integer.valueOf(i));
        }

        public final int describeContents()
        {
            return 0;
        }

        public final boolean equals(Object obj)
        {
            if (obj instanceof Images) goto _L2; else goto _L1
_L1:
            return false;
_L2:
            Iterator iterator;
            if (this == obj)
            {
                return true;
            }
            obj = (Images)obj;
            iterator = sFields.values().iterator();
_L5:
            com.google.android.gms.common.server.response.FastJsonResponse.Field field;
            if (!iterator.hasNext())
            {
                break MISSING_BLOCK_LABEL_96;
            }
            field = (com.google.android.gms.common.server.response.FastJsonResponse.Field)iterator.next();
            if (!isFieldSet(field))
            {
                continue; /* Loop/switch isn't completed */
            }
            if (!((Images) (obj)).isFieldSet(field)) goto _L1; else goto _L3
_L3:
            if (getFieldValue(field).equals(((Images) (obj)).getFieldValue(field))) goto _L5; else goto _L4
_L4:
            return false;
            if (!((Images) (obj)).isFieldSet(field)) goto _L5; else goto _L6
_L6:
            return false;
            return true;
        }

        public final volatile Map getFieldMappings()
        {
            return sFields;
        }

        protected final Object getFieldValue(com.google.android.gms.common.server.response.FastJsonResponse.Field field)
        {
            switch (field.getSafeParcelableFieldId())
            {
            default:
                throw new IllegalStateException((new StringBuilder("Unknown safe parcelable id=")).append(field.getSafeParcelableFieldId()).toString());

            case 2: // '\002'
                return Boolean.valueOf(mIsDefault);

            case 3: // '\003'
                return mMetadata;

            case 4: // '\004'
                return mUrl;
            }
        }

        protected final Object getValueObject(String s)
        {
            return null;
        }

        public final int hashCode()
        {
            int i = 0;
            Iterator iterator = sFields.values().iterator();
            do
            {
                if (!iterator.hasNext())
                {
                    break;
                }
                com.google.android.gms.common.server.response.FastJsonResponse.Field field = (com.google.android.gms.common.server.response.FastJsonResponse.Field)iterator.next();
                if (isFieldSet(field))
                {
                    i = field.getSafeParcelableFieldId() + i + getFieldValue(field).hashCode();
                }
            } while (true);
            return i;
        }

        protected final boolean isFieldSet(com.google.android.gms.common.server.response.FastJsonResponse.Field field)
        {
            return mIndicatorSet.contains(Integer.valueOf(field.getSafeParcelableFieldId()));
        }

        protected final boolean isPrimitiveFieldSet(String s)
        {
            return false;
        }

        protected final void setBooleanInternal(com.google.android.gms.common.server.response.FastJsonResponse.Field field, String s, boolean flag)
        {
            int i = field.getSafeParcelableFieldId();
            switch (i)
            {
            default:
                throw new IllegalArgumentException((new StringBuilder("Field with id=")).append(i).append(" is not known to be a boolean.").toString());

            case 2: // '\002'
                mIsDefault = flag;
                break;
            }
            mIndicatorSet.add(Integer.valueOf(i));
        }

        protected final void setStringInternal(com.google.android.gms.common.server.response.FastJsonResponse.Field field, String s, String s1)
        {
            int i = field.getSafeParcelableFieldId();
            switch (i)
            {
            default:
                throw new IllegalArgumentException((new StringBuilder("Field with id=")).append(i).append(" is not known to be a String.").toString());

            case 4: // '\004'
                mUrl = s1;
                break;
            }
            mIndicatorSet.add(Integer.valueOf(i));
        }

        public final void writeToParcel(Parcel parcel, int i)
        {
            DefaultPersonImpl_ImagesCreator.writeToParcel(this, parcel, i);
        }

        static 
        {
            HashMap hashmap = new HashMap();
            sFields = hashmap;
            hashmap.put("isDefault", com.google.android.gms.common.server.response.FastJsonResponse.Field.forBoolean("isDefault", 2));
            sFields.put("metadata", com.google.android.gms.common.server.response.FastJsonResponse.Field.forConcreteType("metadata", 3, com/google/android/gms/people/identity/internal/models/DefaultMetadataImpl));
            sFields.put("url", com.google.android.gms.common.server.response.FastJsonResponse.Field.forString("url", 4));
        }

        public Images()
        {
            mVersionCode = 1;
            mIndicatorSet = new HashSet();
        }

        Images(Set set, int i, boolean flag, DefaultMetadataImpl defaultmetadataimpl, String s)
        {
            mIndicatorSet = set;
            mVersionCode = i;
            mIsDefault = flag;
            mMetadata = defaultmetadataimpl;
            mUrl = s;
        }
    }

    public static final class InstantMessaging extends FastJsonResponse
        implements SafeParcelable
    {

        public static final DefaultPersonImpl_InstantMessagingCreator CREATOR = new DefaultPersonImpl_InstantMessagingCreator();
        private static final HashMap sFields;
        String mFormattedProtocol;
        String mFormattedType;
        final Set mIndicatorSet;
        DefaultMetadataImpl mMetadata;
        String mProtocol;
        String mType;
        String mValue;
        final int mVersionCode;

        public final void addConcreteTypeInternal(com.google.android.gms.common.server.response.FastJsonResponse.Field field, String s, FastJsonResponse fastjsonresponse)
        {
            int i = field.getSafeParcelableFieldId();
            switch (i)
            {
            default:
                throw new IllegalArgumentException((new StringBuilder("Field with id=")).append(i).append(" is not a known custom type.  Found ").append(fastjsonresponse.getClass().getCanonicalName()).append(".").toString());

            case 4: // '\004'
                mMetadata = (DefaultMetadataImpl)fastjsonresponse;
                break;
            }
            mIndicatorSet.add(Integer.valueOf(i));
        }

        public final int describeContents()
        {
            return 0;
        }

        public final boolean equals(Object obj)
        {
            if (obj instanceof InstantMessaging) goto _L2; else goto _L1
_L1:
            return false;
_L2:
            Iterator iterator;
            if (this == obj)
            {
                return true;
            }
            obj = (InstantMessaging)obj;
            iterator = sFields.values().iterator();
_L5:
            com.google.android.gms.common.server.response.FastJsonResponse.Field field;
            if (!iterator.hasNext())
            {
                break MISSING_BLOCK_LABEL_96;
            }
            field = (com.google.android.gms.common.server.response.FastJsonResponse.Field)iterator.next();
            if (!isFieldSet(field))
            {
                continue; /* Loop/switch isn't completed */
            }
            if (!((InstantMessaging) (obj)).isFieldSet(field)) goto _L1; else goto _L3
_L3:
            if (getFieldValue(field).equals(((InstantMessaging) (obj)).getFieldValue(field))) goto _L5; else goto _L4
_L4:
            return false;
            if (!((InstantMessaging) (obj)).isFieldSet(field)) goto _L5; else goto _L6
_L6:
            return false;
            return true;
        }

        public final volatile Map getFieldMappings()
        {
            return sFields;
        }

        protected final Object getFieldValue(com.google.android.gms.common.server.response.FastJsonResponse.Field field)
        {
            switch (field.getSafeParcelableFieldId())
            {
            default:
                throw new IllegalStateException((new StringBuilder("Unknown safe parcelable id=")).append(field.getSafeParcelableFieldId()).toString());

            case 2: // '\002'
                return mFormattedProtocol;

            case 3: // '\003'
                return mFormattedType;

            case 4: // '\004'
                return mMetadata;

            case 5: // '\005'
                return mProtocol;

            case 6: // '\006'
                return mType;

            case 7: // '\007'
                return mValue;
            }
        }

        protected final Object getValueObject(String s)
        {
            return null;
        }

        public final int hashCode()
        {
            int i = 0;
            Iterator iterator = sFields.values().iterator();
            do
            {
                if (!iterator.hasNext())
                {
                    break;
                }
                com.google.android.gms.common.server.response.FastJsonResponse.Field field = (com.google.android.gms.common.server.response.FastJsonResponse.Field)iterator.next();
                if (isFieldSet(field))
                {
                    i = field.getSafeParcelableFieldId() + i + getFieldValue(field).hashCode();
                }
            } while (true);
            return i;
        }

        protected final boolean isFieldSet(com.google.android.gms.common.server.response.FastJsonResponse.Field field)
        {
            return mIndicatorSet.contains(Integer.valueOf(field.getSafeParcelableFieldId()));
        }

        protected final boolean isPrimitiveFieldSet(String s)
        {
            return false;
        }

        protected final void setStringInternal(com.google.android.gms.common.server.response.FastJsonResponse.Field field, String s, String s1)
        {
            int i = field.getSafeParcelableFieldId();
            i;
            JVM INSTR tableswitch 2 7: default 48
        //                       2 78
        //                       3 99
        //                       4 48
        //                       5 107
        //                       6 115
        //                       7 123;
               goto _L1 _L2 _L3 _L1 _L4 _L5 _L6
_L1:
            throw new IllegalArgumentException((new StringBuilder("Field with id=")).append(i).append(" is not known to be a String.").toString());
_L2:
            mFormattedProtocol = s1;
_L8:
            mIndicatorSet.add(Integer.valueOf(i));
            return;
_L3:
            mFormattedType = s1;
            continue; /* Loop/switch isn't completed */
_L4:
            mProtocol = s1;
            continue; /* Loop/switch isn't completed */
_L5:
            mType = s1;
            continue; /* Loop/switch isn't completed */
_L6:
            mValue = s1;
            if (true) goto _L8; else goto _L7
_L7:
        }

        public final void writeToParcel(Parcel parcel, int i)
        {
            DefaultPersonImpl_InstantMessagingCreator.writeToParcel(this, parcel, i);
        }

        static 
        {
            HashMap hashmap = new HashMap();
            sFields = hashmap;
            hashmap.put("formattedProtocol", com.google.android.gms.common.server.response.FastJsonResponse.Field.forString("formattedProtocol", 2));
            sFields.put("formattedType", com.google.android.gms.common.server.response.FastJsonResponse.Field.forString("formattedType", 3));
            sFields.put("metadata", com.google.android.gms.common.server.response.FastJsonResponse.Field.forConcreteType("metadata", 4, com/google/android/gms/people/identity/internal/models/DefaultMetadataImpl));
            sFields.put("protocol", com.google.android.gms.common.server.response.FastJsonResponse.Field.forString("protocol", 5));
            sFields.put("type", com.google.android.gms.common.server.response.FastJsonResponse.Field.forString("type", 6));
            sFields.put("value", com.google.android.gms.common.server.response.FastJsonResponse.Field.forString("value", 7));
        }

        public InstantMessaging()
        {
            mVersionCode = 1;
            mIndicatorSet = new HashSet();
        }

        InstantMessaging(Set set, int i, String s, String s1, DefaultMetadataImpl defaultmetadataimpl, String s2, String s3, 
                String s4)
        {
            mIndicatorSet = set;
            mVersionCode = i;
            mFormattedProtocol = s;
            mFormattedType = s1;
            mMetadata = defaultmetadataimpl;
            mProtocol = s2;
            mType = s3;
            mValue = s4;
        }
    }

    public static final class LegacyFields extends FastJsonResponse
        implements SafeParcelable
    {

        public static final DefaultPersonImpl_LegacyFieldsCreator CREATOR = new DefaultPersonImpl_LegacyFieldsCreator();
        private static final HashMap sFields;
        final Set mIndicatorSet;
        String mMobileOwnerId;
        final int mVersionCode;

        public final int describeContents()
        {
            return 0;
        }

        public final boolean equals(Object obj)
        {
            if (obj instanceof LegacyFields) goto _L2; else goto _L1
_L1:
            return false;
_L2:
            Iterator iterator;
            if (this == obj)
            {
                return true;
            }
            obj = (LegacyFields)obj;
            iterator = sFields.values().iterator();
_L5:
            com.google.android.gms.common.server.response.FastJsonResponse.Field field;
            if (!iterator.hasNext())
            {
                break MISSING_BLOCK_LABEL_96;
            }
            field = (com.google.android.gms.common.server.response.FastJsonResponse.Field)iterator.next();
            if (!isFieldSet(field))
            {
                continue; /* Loop/switch isn't completed */
            }
            if (!((LegacyFields) (obj)).isFieldSet(field)) goto _L1; else goto _L3
_L3:
            if (getFieldValue(field).equals(((LegacyFields) (obj)).getFieldValue(field))) goto _L5; else goto _L4
_L4:
            return false;
            if (!((LegacyFields) (obj)).isFieldSet(field)) goto _L5; else goto _L6
_L6:
            return false;
            return true;
        }

        public final volatile Map getFieldMappings()
        {
            return sFields;
        }

        protected final Object getFieldValue(com.google.android.gms.common.server.response.FastJsonResponse.Field field)
        {
            switch (field.getSafeParcelableFieldId())
            {
            default:
                throw new IllegalStateException((new StringBuilder("Unknown safe parcelable id=")).append(field.getSafeParcelableFieldId()).toString());

            case 2: // '\002'
                return mMobileOwnerId;
            }
        }

        protected final Object getValueObject(String s)
        {
            return null;
        }

        public final int hashCode()
        {
            int i = 0;
            Iterator iterator = sFields.values().iterator();
            do
            {
                if (!iterator.hasNext())
                {
                    break;
                }
                com.google.android.gms.common.server.response.FastJsonResponse.Field field = (com.google.android.gms.common.server.response.FastJsonResponse.Field)iterator.next();
                if (isFieldSet(field))
                {
                    i = field.getSafeParcelableFieldId() + i + getFieldValue(field).hashCode();
                }
            } while (true);
            return i;
        }

        protected final boolean isFieldSet(com.google.android.gms.common.server.response.FastJsonResponse.Field field)
        {
            return mIndicatorSet.contains(Integer.valueOf(field.getSafeParcelableFieldId()));
        }

        protected final boolean isPrimitiveFieldSet(String s)
        {
            return false;
        }

        protected final void setStringInternal(com.google.android.gms.common.server.response.FastJsonResponse.Field field, String s, String s1)
        {
            int i = field.getSafeParcelableFieldId();
            switch (i)
            {
            default:
                throw new IllegalArgumentException((new StringBuilder("Field with id=")).append(i).append(" is not known to be a String.").toString());

            case 2: // '\002'
                mMobileOwnerId = s1;
                break;
            }
            mIndicatorSet.add(Integer.valueOf(i));
        }

        public final void writeToParcel(Parcel parcel, int i)
        {
            DefaultPersonImpl_LegacyFieldsCreator.writeToParcel$54bc877c(this, parcel);
        }

        static 
        {
            HashMap hashmap = new HashMap();
            sFields = hashmap;
            hashmap.put("mobileOwnerId", com.google.android.gms.common.server.response.FastJsonResponse.Field.forString("mobileOwnerId", 2));
        }

        public LegacyFields()
        {
            mVersionCode = 1;
            mIndicatorSet = new HashSet();
        }

        LegacyFields(Set set, int i, String s)
        {
            mIndicatorSet = set;
            mVersionCode = i;
            mMobileOwnerId = s;
        }
    }

    public static final class Memberships extends FastJsonResponse
        implements SafeParcelable
    {

        public static final DefaultPersonImpl_MembershipsCreator CREATOR = new DefaultPersonImpl_MembershipsCreator();
        private static final HashMap sFields;
        String mCircle;
        String mContactGroup;
        final Set mIndicatorSet;
        DefaultMetadataImpl mMetadata;
        String mSystemContactGroup;
        final int mVersionCode;

        public final void addConcreteTypeInternal(com.google.android.gms.common.server.response.FastJsonResponse.Field field, String s, FastJsonResponse fastjsonresponse)
        {
            int i = field.getSafeParcelableFieldId();
            switch (i)
            {
            default:
                throw new IllegalArgumentException((new StringBuilder("Field with id=")).append(i).append(" is not a known custom type.  Found ").append(fastjsonresponse.getClass().getCanonicalName()).append(".").toString());

            case 4: // '\004'
                mMetadata = (DefaultMetadataImpl)fastjsonresponse;
                break;
            }
            mIndicatorSet.add(Integer.valueOf(i));
        }

        public final int describeContents()
        {
            return 0;
        }

        public final boolean equals(Object obj)
        {
            if (obj instanceof Memberships) goto _L2; else goto _L1
_L1:
            return false;
_L2:
            Iterator iterator;
            if (this == obj)
            {
                return true;
            }
            obj = (Memberships)obj;
            iterator = sFields.values().iterator();
_L5:
            com.google.android.gms.common.server.response.FastJsonResponse.Field field;
            if (!iterator.hasNext())
            {
                break MISSING_BLOCK_LABEL_96;
            }
            field = (com.google.android.gms.common.server.response.FastJsonResponse.Field)iterator.next();
            if (!isFieldSet(field))
            {
                continue; /* Loop/switch isn't completed */
            }
            if (!((Memberships) (obj)).isFieldSet(field)) goto _L1; else goto _L3
_L3:
            if (getFieldValue(field).equals(((Memberships) (obj)).getFieldValue(field))) goto _L5; else goto _L4
_L4:
            return false;
            if (!((Memberships) (obj)).isFieldSet(field)) goto _L5; else goto _L6
_L6:
            return false;
            return true;
        }

        public final volatile Map getFieldMappings()
        {
            return sFields;
        }

        protected final Object getFieldValue(com.google.android.gms.common.server.response.FastJsonResponse.Field field)
        {
            switch (field.getSafeParcelableFieldId())
            {
            default:
                throw new IllegalStateException((new StringBuilder("Unknown safe parcelable id=")).append(field.getSafeParcelableFieldId()).toString());

            case 2: // '\002'
                return mCircle;

            case 3: // '\003'
                return mContactGroup;

            case 4: // '\004'
                return mMetadata;

            case 5: // '\005'
                return mSystemContactGroup;
            }
        }

        protected final Object getValueObject(String s)
        {
            return null;
        }

        public final int hashCode()
        {
            int i = 0;
            Iterator iterator = sFields.values().iterator();
            do
            {
                if (!iterator.hasNext())
                {
                    break;
                }
                com.google.android.gms.common.server.response.FastJsonResponse.Field field = (com.google.android.gms.common.server.response.FastJsonResponse.Field)iterator.next();
                if (isFieldSet(field))
                {
                    i = field.getSafeParcelableFieldId() + i + getFieldValue(field).hashCode();
                }
            } while (true);
            return i;
        }

        protected final boolean isFieldSet(com.google.android.gms.common.server.response.FastJsonResponse.Field field)
        {
            return mIndicatorSet.contains(Integer.valueOf(field.getSafeParcelableFieldId()));
        }

        protected final boolean isPrimitiveFieldSet(String s)
        {
            return false;
        }

        protected final void setStringInternal(com.google.android.gms.common.server.response.FastJsonResponse.Field field, String s, String s1)
        {
            int i = field.getSafeParcelableFieldId();
            i;
            JVM INSTR tableswitch 2 5: default 40
        //                       2 70
        //                       3 91
        //                       4 40
        //                       5 99;
               goto _L1 _L2 _L3 _L1 _L4
_L1:
            throw new IllegalArgumentException((new StringBuilder("Field with id=")).append(i).append(" is not known to be a String.").toString());
_L2:
            mCircle = s1;
_L6:
            mIndicatorSet.add(Integer.valueOf(i));
            return;
_L3:
            mContactGroup = s1;
            continue; /* Loop/switch isn't completed */
_L4:
            mSystemContactGroup = s1;
            if (true) goto _L6; else goto _L5
_L5:
        }

        public final void writeToParcel(Parcel parcel, int i)
        {
            DefaultPersonImpl_MembershipsCreator.writeToParcel(this, parcel, i);
        }

        static 
        {
            HashMap hashmap = new HashMap();
            sFields = hashmap;
            hashmap.put("circle", com.google.android.gms.common.server.response.FastJsonResponse.Field.forString("circle", 2));
            sFields.put("contactGroup", com.google.android.gms.common.server.response.FastJsonResponse.Field.forString("contactGroup", 3));
            sFields.put("metadata", com.google.android.gms.common.server.response.FastJsonResponse.Field.forConcreteType("metadata", 4, com/google/android/gms/people/identity/internal/models/DefaultMetadataImpl));
            sFields.put("systemContactGroup", com.google.android.gms.common.server.response.FastJsonResponse.Field.forString("systemContactGroup", 5));
        }

        public Memberships()
        {
            mVersionCode = 1;
            mIndicatorSet = new HashSet();
        }

        Memberships(Set set, int i, String s, String s1, DefaultMetadataImpl defaultmetadataimpl, String s2)
        {
            mIndicatorSet = set;
            mVersionCode = i;
            mCircle = s;
            mContactGroup = s1;
            mMetadata = defaultmetadataimpl;
            mSystemContactGroup = s2;
        }
    }

    public static final class Metadata extends FastJsonResponse
        implements SafeParcelable
    {

        public static final DefaultPersonImpl_MetadataCreator CREATOR = new DefaultPersonImpl_MetadataCreator();
        private static final HashMap sFields;
        List mAffinities;
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
        long mLastUpdateTimeMicros;
        String mObjectType;
        String mOwnerId;
        List mOwnerUserTypes;
        List mPeopleInCommon;
        String mPlusPageType;
        ProfileOwnerStats mProfileOwnerStats;
        final int mVersionCode;

        public final void addConcreteTypeArrayInternal(com.google.android.gms.common.server.response.FastJsonResponse.Field field, String s, ArrayList arraylist)
        {
            int i = field.getSafeParcelableFieldId();
            i;
            JVM INSTR lookupswitch 2: default 36
        //                       2: 81
        //                       16: 102;
               goto _L1 _L2 _L3
_L1:
            throw new IllegalArgumentException((new StringBuilder("Field with id=")).append(i).append(" is not a known array of custom type.  Found ").append(arraylist.getClass().getCanonicalName()).append(".").toString());
_L2:
            mAffinities = arraylist;
_L5:
            mIndicatorSet.add(Integer.valueOf(i));
            return;
_L3:
            mPeopleInCommon = arraylist;
            if (true) goto _L5; else goto _L4
_L4:
        }

        public final void addConcreteTypeInternal(com.google.android.gms.common.server.response.FastJsonResponse.Field field, String s, FastJsonResponse fastjsonresponse)
        {
            int i = field.getSafeParcelableFieldId();
            switch (i)
            {
            default:
                throw new IllegalArgumentException((new StringBuilder("Field with id=")).append(i).append(" is not a known custom type.  Found ").append(fastjsonresponse.getClass().getCanonicalName()).append(".").toString());

            case 18: // '\022'
                mProfileOwnerStats = (ProfileOwnerStats)fastjsonresponse;
                break;
            }
            mIndicatorSet.add(Integer.valueOf(i));
        }

        public final int describeContents()
        {
            return 0;
        }

        public final boolean equals(Object obj)
        {
            if (obj instanceof Metadata) goto _L2; else goto _L1
_L1:
            return false;
_L2:
            Iterator iterator;
            if (this == obj)
            {
                return true;
            }
            obj = (Metadata)obj;
            iterator = sFields.values().iterator();
_L5:
            com.google.android.gms.common.server.response.FastJsonResponse.Field field;
            if (!iterator.hasNext())
            {
                break MISSING_BLOCK_LABEL_96;
            }
            field = (com.google.android.gms.common.server.response.FastJsonResponse.Field)iterator.next();
            if (!isFieldSet(field))
            {
                continue; /* Loop/switch isn't completed */
            }
            if (!((Metadata) (obj)).isFieldSet(field)) goto _L1; else goto _L3
_L3:
            if (getFieldValue(field).equals(((Metadata) (obj)).getFieldValue(field))) goto _L5; else goto _L4
_L4:
            return false;
            if (!((Metadata) (obj)).isFieldSet(field)) goto _L5; else goto _L6
_L6:
            return false;
            return true;
        }

        public final volatile Map getFieldMappings()
        {
            return sFields;
        }

        protected final Object getFieldValue(com.google.android.gms.common.server.response.FastJsonResponse.Field field)
        {
            switch (field.getSafeParcelableFieldId())
            {
            default:
                throw new IllegalStateException((new StringBuilder("Unknown safe parcelable id=")).append(field.getSafeParcelableFieldId()).toString());

            case 2: // '\002'
                return mAffinities;

            case 3: // '\003'
                return mAttributions;

            case 4: // '\004'
                return mBlockTypes;

            case 5: // '\005'
                return Boolean.valueOf(mBlocked);

            case 6: // '\006'
                return mCircles;

            case 7: // '\007'
                return mContacts;

            case 8: // '\b'
                return Boolean.valueOf(mDeleted);

            case 9: // '\t'
                return mGroups;

            case 10: // '\n'
                return Boolean.valueOf(mInViewerDomain);

            case 11: // '\013'
                return mIncomingBlockTypes;

            case 12: // '\f'
                return Long.valueOf(mLastUpdateTimeMicros);

            case 13: // '\r'
                return mObjectType;

            case 14: // '\016'
                return mOwnerId;

            case 15: // '\017'
                return mOwnerUserTypes;

            case 16: // '\020'
                return mPeopleInCommon;

            case 17: // '\021'
                return mPlusPageType;

            case 18: // '\022'
                return mProfileOwnerStats;
            }
        }

        protected final Object getValueObject(String s)
        {
            return null;
        }

        public final int hashCode()
        {
            int i = 0;
            Iterator iterator = sFields.values().iterator();
            do
            {
                if (!iterator.hasNext())
                {
                    break;
                }
                com.google.android.gms.common.server.response.FastJsonResponse.Field field = (com.google.android.gms.common.server.response.FastJsonResponse.Field)iterator.next();
                if (isFieldSet(field))
                {
                    i = field.getSafeParcelableFieldId() + i + getFieldValue(field).hashCode();
                }
            } while (true);
            return i;
        }

        protected final boolean isFieldSet(com.google.android.gms.common.server.response.FastJsonResponse.Field field)
        {
            return mIndicatorSet.contains(Integer.valueOf(field.getSafeParcelableFieldId()));
        }

        protected final boolean isPrimitiveFieldSet(String s)
        {
            return false;
        }

        protected final void setBooleanInternal(com.google.android.gms.common.server.response.FastJsonResponse.Field field, String s, boolean flag)
        {
            int i = field.getSafeParcelableFieldId();
            i;
            JVM INSTR tableswitch 5 10: default 48
        //                       5 79
        //                       6 48
        //                       7 48
        //                       8 100
        //                       9 48
        //                       10 108;
               goto _L1 _L2 _L1 _L1 _L3 _L1 _L4
_L1:
            throw new IllegalArgumentException((new StringBuilder("Field with id=")).append(i).append(" is not known to be a boolean.").toString());
_L2:
            mBlocked = flag;
_L6:
            mIndicatorSet.add(Integer.valueOf(i));
            return;
_L3:
            mDeleted = flag;
            continue; /* Loop/switch isn't completed */
_L4:
            mInViewerDomain = flag;
            if (true) goto _L6; else goto _L5
_L5:
        }

        protected final void setLongInternal(com.google.android.gms.common.server.response.FastJsonResponse.Field field, String s, long l)
        {
            int i = field.getSafeParcelableFieldId();
            switch (i)
            {
            default:
                throw new IllegalArgumentException((new StringBuilder("Field with id=")).append(i).append(" is not known to be a long.").toString());

            case 12: // '\f'
                mLastUpdateTimeMicros = l;
                break;
            }
            mIndicatorSet.add(Integer.valueOf(i));
        }

        protected final void setStringInternal(com.google.android.gms.common.server.response.FastJsonResponse.Field field, String s, String s1)
        {
            int i = field.getSafeParcelableFieldId();
            i;
            JVM INSTR tableswitch 13 17: default 44
        //                       13 75
        //                       14 96
        //                       15 44
        //                       16 44
        //                       17 104;
               goto _L1 _L2 _L3 _L1 _L1 _L4
_L1:
            throw new IllegalArgumentException((new StringBuilder("Field with id=")).append(i).append(" is not known to be a String.").toString());
_L2:
            mObjectType = s1;
_L6:
            mIndicatorSet.add(Integer.valueOf(i));
            return;
_L3:
            mOwnerId = s1;
            continue; /* Loop/switch isn't completed */
_L4:
            mPlusPageType = s1;
            if (true) goto _L6; else goto _L5
_L5:
        }

        protected final void setStringsInternal(com.google.android.gms.common.server.response.FastJsonResponse.Field field, String s, ArrayList arraylist)
        {
            int i = field.getSafeParcelableFieldId();
            i;
            JVM INSTR tableswitch 3 15: default 76
        //                       3 107
        //                       4 128
        //                       5 76
        //                       6 136
        //                       7 144
        //                       8 76
        //                       9 152
        //                       10 76
        //                       11 160
        //                       12 76
        //                       13 76
        //                       14 76
        //                       15 168;
               goto _L1 _L2 _L3 _L1 _L4 _L5 _L1 _L6 _L1 _L7 _L1 _L1 _L1 _L8
_L1:
            throw new IllegalArgumentException((new StringBuilder("Field with id=")).append(i).append(" is not known to be an array of String.").toString());
_L2:
            mAttributions = arraylist;
_L10:
            mIndicatorSet.add(Integer.valueOf(i));
            return;
_L3:
            mBlockTypes = arraylist;
            continue; /* Loop/switch isn't completed */
_L4:
            mCircles = arraylist;
            continue; /* Loop/switch isn't completed */
_L5:
            mContacts = arraylist;
            continue; /* Loop/switch isn't completed */
_L6:
            mGroups = arraylist;
            continue; /* Loop/switch isn't completed */
_L7:
            mIncomingBlockTypes = arraylist;
            continue; /* Loop/switch isn't completed */
_L8:
            mOwnerUserTypes = arraylist;
            if (true) goto _L10; else goto _L9
_L9:
        }

        public final void writeToParcel(Parcel parcel, int i)
        {
            DefaultPersonImpl_MetadataCreator.writeToParcel(this, parcel, i);
        }

        static 
        {
            HashMap hashmap = new HashMap();
            sFields = hashmap;
            hashmap.put("affinities", com.google.android.gms.common.server.response.FastJsonResponse.Field.forConcreteTypeArray("affinities", 2, com/google/android/gms/people/identity/internal/models/DefaultPersonImpl$Metadata$Affinities));
            sFields.put("attributions", com.google.android.gms.common.server.response.FastJsonResponse.Field.forStrings("attributions", 3));
            sFields.put("blockTypes", com.google.android.gms.common.server.response.FastJsonResponse.Field.forStrings("blockTypes", 4));
            sFields.put("blocked", com.google.android.gms.common.server.response.FastJsonResponse.Field.forBoolean("blocked", 5));
            sFields.put("circles", com.google.android.gms.common.server.response.FastJsonResponse.Field.forStrings("circles", 6));
            sFields.put("contacts", com.google.android.gms.common.server.response.FastJsonResponse.Field.forStrings("contacts", 7));
            sFields.put("deleted", com.google.android.gms.common.server.response.FastJsonResponse.Field.forBoolean("deleted", 8));
            sFields.put("groups", com.google.android.gms.common.server.response.FastJsonResponse.Field.forStrings("groups", 9));
            sFields.put("inViewerDomain", com.google.android.gms.common.server.response.FastJsonResponse.Field.forBoolean("inViewerDomain", 10));
            sFields.put("incomingBlockTypes", com.google.android.gms.common.server.response.FastJsonResponse.Field.forStrings("incomingBlockTypes", 11));
            sFields.put("lastUpdateTimeMicros", com.google.android.gms.common.server.response.FastJsonResponse.Field.forLong("lastUpdateTimeMicros", 12));
            sFields.put("objectType", com.google.android.gms.common.server.response.FastJsonResponse.Field.forString("objectType", 13));
            sFields.put("ownerId", com.google.android.gms.common.server.response.FastJsonResponse.Field.forString("ownerId", 14));
            sFields.put("ownerUserTypes", com.google.android.gms.common.server.response.FastJsonResponse.Field.forStrings("ownerUserTypes", 15));
            sFields.put("peopleInCommon", com.google.android.gms.common.server.response.FastJsonResponse.Field.forConcreteTypeArray("peopleInCommon", 16, com/google/android/gms/people/identity/internal/models/DefaultPersonImpl));
            sFields.put("plusPageType", com.google.android.gms.common.server.response.FastJsonResponse.Field.forString("plusPageType", 17));
            sFields.put("profileOwnerStats", com.google.android.gms.common.server.response.FastJsonResponse.Field.forConcreteType("profileOwnerStats", 18, com/google/android/gms/people/identity/internal/models/DefaultPersonImpl$Metadata$ProfileOwnerStats));
        }

        public Metadata()
        {
            mVersionCode = 1;
            mIndicatorSet = new HashSet();
        }

        Metadata(Set set, int i, List list, List list1, List list2, boolean flag, List list3, 
                List list4, boolean flag1, List list5, boolean flag2, List list6, long l, 
                String s, String s1, List list7, List list8, String s2, ProfileOwnerStats profileownerstats)
        {
            mIndicatorSet = set;
            mVersionCode = i;
            mAffinities = list;
            mAttributions = list1;
            mBlockTypes = list2;
            mBlocked = flag;
            mCircles = list3;
            mContacts = list4;
            mDeleted = flag1;
            mGroups = list5;
            mInViewerDomain = flag2;
            mIncomingBlockTypes = list6;
            mLastUpdateTimeMicros = l;
            mObjectType = s;
            mOwnerId = s1;
            mOwnerUserTypes = list7;
            mPeopleInCommon = list8;
            mPlusPageType = s2;
            mProfileOwnerStats = profileownerstats;
        }
    }

    public static final class Metadata.Affinities extends FastJsonResponse
        implements SafeParcelable
    {

        public static final DefaultPersonImpl_Metadata_AffinitiesCreator CREATOR = new DefaultPersonImpl_Metadata_AffinitiesCreator();
        private static final HashMap sFields;
        final Set mIndicatorSet;
        String mType;
        double mValue;
        final int mVersionCode;

        public final int describeContents()
        {
            return 0;
        }

        public final boolean equals(Object obj)
        {
            if (obj instanceof Metadata.Affinities) goto _L2; else goto _L1
_L1:
            return false;
_L2:
            Iterator iterator;
            if (this == obj)
            {
                return true;
            }
            obj = (Metadata.Affinities)obj;
            iterator = sFields.values().iterator();
_L5:
            com.google.android.gms.common.server.response.FastJsonResponse.Field field;
            if (!iterator.hasNext())
            {
                break MISSING_BLOCK_LABEL_96;
            }
            field = (com.google.android.gms.common.server.response.FastJsonResponse.Field)iterator.next();
            if (!isFieldSet(field))
            {
                continue; /* Loop/switch isn't completed */
            }
            if (!((Metadata.Affinities) (obj)).isFieldSet(field)) goto _L1; else goto _L3
_L3:
            if (getFieldValue(field).equals(((Metadata.Affinities) (obj)).getFieldValue(field))) goto _L5; else goto _L4
_L4:
            return false;
            if (!((Metadata.Affinities) (obj)).isFieldSet(field)) goto _L5; else goto _L6
_L6:
            return false;
            return true;
        }

        public final volatile Map getFieldMappings()
        {
            return sFields;
        }

        protected final Object getFieldValue(com.google.android.gms.common.server.response.FastJsonResponse.Field field)
        {
            switch (field.getSafeParcelableFieldId())
            {
            default:
                throw new IllegalStateException((new StringBuilder("Unknown safe parcelable id=")).append(field.getSafeParcelableFieldId()).toString());

            case 2: // '\002'
                return mType;

            case 3: // '\003'
                return Double.valueOf(mValue);
            }
        }

        protected final Object getValueObject(String s)
        {
            return null;
        }

        public final int hashCode()
        {
            int i = 0;
            Iterator iterator = sFields.values().iterator();
            do
            {
                if (!iterator.hasNext())
                {
                    break;
                }
                com.google.android.gms.common.server.response.FastJsonResponse.Field field = (com.google.android.gms.common.server.response.FastJsonResponse.Field)iterator.next();
                if (isFieldSet(field))
                {
                    i = field.getSafeParcelableFieldId() + i + getFieldValue(field).hashCode();
                }
            } while (true);
            return i;
        }

        protected final boolean isFieldSet(com.google.android.gms.common.server.response.FastJsonResponse.Field field)
        {
            return mIndicatorSet.contains(Integer.valueOf(field.getSafeParcelableFieldId()));
        }

        protected final boolean isPrimitiveFieldSet(String s)
        {
            return false;
        }

        protected final void setDoubleInternal(com.google.android.gms.common.server.response.FastJsonResponse.Field field, String s, double d)
        {
            int i = field.getSafeParcelableFieldId();
            switch (i)
            {
            default:
                throw new IllegalArgumentException((new StringBuilder("Field with id=")).append(i).append(" is not known to be a double.").toString());

            case 3: // '\003'
                mValue = d;
                break;
            }
            mIndicatorSet.add(Integer.valueOf(i));
        }

        protected final void setStringInternal(com.google.android.gms.common.server.response.FastJsonResponse.Field field, String s, String s1)
        {
            int i = field.getSafeParcelableFieldId();
            switch (i)
            {
            default:
                throw new IllegalArgumentException((new StringBuilder("Field with id=")).append(i).append(" is not known to be a String.").toString());

            case 2: // '\002'
                mType = s1;
                break;
            }
            mIndicatorSet.add(Integer.valueOf(i));
        }

        public final void writeToParcel(Parcel parcel, int i)
        {
            DefaultPersonImpl_Metadata_AffinitiesCreator.writeToParcel$3ae5cb85(this, parcel);
        }

        static 
        {
            HashMap hashmap = new HashMap();
            sFields = hashmap;
            hashmap.put("type", com.google.android.gms.common.server.response.FastJsonResponse.Field.forString("type", 2));
            sFields.put("value", com.google.android.gms.common.server.response.FastJsonResponse.Field.forDouble("value", 3));
        }

        public Metadata.Affinities()
        {
            mVersionCode = 1;
            mIndicatorSet = new HashSet();
        }

        Metadata.Affinities(Set set, int i, String s, double d)
        {
            mIndicatorSet = set;
            mVersionCode = i;
            mType = s;
            mValue = d;
        }
    }

    public static final class Metadata.ProfileOwnerStats extends FastJsonResponse
        implements SafeParcelable
    {

        public static final DefaultPersonImpl_Metadata_ProfileOwnerStatsCreator CREATOR = new DefaultPersonImpl_Metadata_ProfileOwnerStatsCreator();
        private static final HashMap sFields;
        long mIncomingAnyCircleCount;
        final Set mIndicatorSet;
        final int mVersionCode;
        long mViewCount;

        public final int describeContents()
        {
            return 0;
        }

        public final boolean equals(Object obj)
        {
            if (obj instanceof Metadata.ProfileOwnerStats) goto _L2; else goto _L1
_L1:
            return false;
_L2:
            Iterator iterator;
            if (this == obj)
            {
                return true;
            }
            obj = (Metadata.ProfileOwnerStats)obj;
            iterator = sFields.values().iterator();
_L5:
            com.google.android.gms.common.server.response.FastJsonResponse.Field field;
            if (!iterator.hasNext())
            {
                break MISSING_BLOCK_LABEL_96;
            }
            field = (com.google.android.gms.common.server.response.FastJsonResponse.Field)iterator.next();
            if (!isFieldSet(field))
            {
                continue; /* Loop/switch isn't completed */
            }
            if (!((Metadata.ProfileOwnerStats) (obj)).isFieldSet(field)) goto _L1; else goto _L3
_L3:
            if (getFieldValue(field).equals(((Metadata.ProfileOwnerStats) (obj)).getFieldValue(field))) goto _L5; else goto _L4
_L4:
            return false;
            if (!((Metadata.ProfileOwnerStats) (obj)).isFieldSet(field)) goto _L5; else goto _L6
_L6:
            return false;
            return true;
        }

        public final volatile Map getFieldMappings()
        {
            return sFields;
        }

        protected final Object getFieldValue(com.google.android.gms.common.server.response.FastJsonResponse.Field field)
        {
            switch (field.getSafeParcelableFieldId())
            {
            default:
                throw new IllegalStateException((new StringBuilder("Unknown safe parcelable id=")).append(field.getSafeParcelableFieldId()).toString());

            case 2: // '\002'
                return Long.valueOf(mIncomingAnyCircleCount);

            case 3: // '\003'
                return Long.valueOf(mViewCount);
            }
        }

        protected final Object getValueObject(String s)
        {
            return null;
        }

        public final int hashCode()
        {
            int i = 0;
            Iterator iterator = sFields.values().iterator();
            do
            {
                if (!iterator.hasNext())
                {
                    break;
                }
                com.google.android.gms.common.server.response.FastJsonResponse.Field field = (com.google.android.gms.common.server.response.FastJsonResponse.Field)iterator.next();
                if (isFieldSet(field))
                {
                    i = field.getSafeParcelableFieldId() + i + getFieldValue(field).hashCode();
                }
            } while (true);
            return i;
        }

        protected final boolean isFieldSet(com.google.android.gms.common.server.response.FastJsonResponse.Field field)
        {
            return mIndicatorSet.contains(Integer.valueOf(field.getSafeParcelableFieldId()));
        }

        protected final boolean isPrimitiveFieldSet(String s)
        {
            return false;
        }

        protected final void setLongInternal(com.google.android.gms.common.server.response.FastJsonResponse.Field field, String s, long l)
        {
            int i = field.getSafeParcelableFieldId();
            i;
            JVM INSTR tableswitch 2 3: default 32
        //                       2 62
        //                       3 83;
               goto _L1 _L2 _L3
_L1:
            throw new IllegalArgumentException((new StringBuilder("Field with id=")).append(i).append(" is not known to be a double.").toString());
_L2:
            mIncomingAnyCircleCount = l;
_L5:
            mIndicatorSet.add(Integer.valueOf(i));
            return;
_L3:
            mViewCount = l;
            if (true) goto _L5; else goto _L4
_L4:
        }

        public final void writeToParcel(Parcel parcel, int i)
        {
            DefaultPersonImpl_Metadata_ProfileOwnerStatsCreator.writeToParcel$280ce13a(this, parcel);
        }

        static 
        {
            HashMap hashmap = new HashMap();
            sFields = hashmap;
            hashmap.put("incomingAnyCircleCount", com.google.android.gms.common.server.response.FastJsonResponse.Field.forLong("incomingAnyCircleCount", 2));
            sFields.put("viewCount", com.google.android.gms.common.server.response.FastJsonResponse.Field.forLong("viewCount", 3));
        }

        public Metadata.ProfileOwnerStats()
        {
            mVersionCode = 1;
            mIndicatorSet = new HashSet();
        }

        Metadata.ProfileOwnerStats(Set set, int i, long l, long l1)
        {
            mIndicatorSet = set;
            mVersionCode = i;
            mIncomingAnyCircleCount = l;
            mViewCount = l1;
        }
    }

    public static final class Names extends FastJsonResponse
        implements SafeParcelable
    {

        public static final DefaultPersonImpl_NamesCreator CREATOR = new DefaultPersonImpl_NamesCreator();
        private static final HashMap sFields;
        String mDisplayName;
        String mFamilyName;
        String mFormatted;
        String mGivenName;
        String mHonorificPrefix;
        String mHonorificSuffix;
        final Set mIndicatorSet;
        DefaultMetadataImpl mMetadata;
        String mMiddleName;
        String mPhoneticFamilyName;
        String mPhoneticGivenName;
        String mPhoneticHonorificPrefix;
        String mPhoneticHonorificSuffix;
        final int mVersionCode;

        public final void addConcreteTypeInternal(com.google.android.gms.common.server.response.FastJsonResponse.Field field, String s, FastJsonResponse fastjsonresponse)
        {
            int i = field.getSafeParcelableFieldId();
            switch (i)
            {
            default:
                throw new IllegalArgumentException((new StringBuilder("Field with id=")).append(i).append(" is not a known custom type.  Found ").append(fastjsonresponse.getClass().getCanonicalName()).append(".").toString());

            case 8: // '\b'
                mMetadata = (DefaultMetadataImpl)fastjsonresponse;
                break;
            }
            mIndicatorSet.add(Integer.valueOf(i));
        }

        public final int describeContents()
        {
            return 0;
        }

        public final boolean equals(Object obj)
        {
            if (obj instanceof Names) goto _L2; else goto _L1
_L1:
            return false;
_L2:
            Iterator iterator;
            if (this == obj)
            {
                return true;
            }
            obj = (Names)obj;
            iterator = sFields.values().iterator();
_L5:
            com.google.android.gms.common.server.response.FastJsonResponse.Field field;
            if (!iterator.hasNext())
            {
                break MISSING_BLOCK_LABEL_96;
            }
            field = (com.google.android.gms.common.server.response.FastJsonResponse.Field)iterator.next();
            if (!isFieldSet(field))
            {
                continue; /* Loop/switch isn't completed */
            }
            if (!((Names) (obj)).isFieldSet(field)) goto _L1; else goto _L3
_L3:
            if (getFieldValue(field).equals(((Names) (obj)).getFieldValue(field))) goto _L5; else goto _L4
_L4:
            return false;
            if (!((Names) (obj)).isFieldSet(field)) goto _L5; else goto _L6
_L6:
            return false;
            return true;
        }

        public final volatile Map getFieldMappings()
        {
            return sFields;
        }

        protected final Object getFieldValue(com.google.android.gms.common.server.response.FastJsonResponse.Field field)
        {
            switch (field.getSafeParcelableFieldId())
            {
            default:
                throw new IllegalStateException((new StringBuilder("Unknown safe parcelable id=")).append(field.getSafeParcelableFieldId()).toString());

            case 2: // '\002'
                return mDisplayName;

            case 3: // '\003'
                return mFamilyName;

            case 4: // '\004'
                return mFormatted;

            case 5: // '\005'
                return mGivenName;

            case 6: // '\006'
                return mHonorificPrefix;

            case 7: // '\007'
                return mHonorificSuffix;

            case 8: // '\b'
                return mMetadata;

            case 9: // '\t'
                return mMiddleName;

            case 10: // '\n'
                return mPhoneticFamilyName;

            case 11: // '\013'
                return mPhoneticGivenName;

            case 12: // '\f'
                return mPhoneticHonorificPrefix;

            case 13: // '\r'
                return mPhoneticHonorificSuffix;
            }
        }

        protected final Object getValueObject(String s)
        {
            return null;
        }

        public final int hashCode()
        {
            int i = 0;
            Iterator iterator = sFields.values().iterator();
            do
            {
                if (!iterator.hasNext())
                {
                    break;
                }
                com.google.android.gms.common.server.response.FastJsonResponse.Field field = (com.google.android.gms.common.server.response.FastJsonResponse.Field)iterator.next();
                if (isFieldSet(field))
                {
                    i = field.getSafeParcelableFieldId() + i + getFieldValue(field).hashCode();
                }
            } while (true);
            return i;
        }

        protected final boolean isFieldSet(com.google.android.gms.common.server.response.FastJsonResponse.Field field)
        {
            return mIndicatorSet.contains(Integer.valueOf(field.getSafeParcelableFieldId()));
        }

        protected final boolean isPrimitiveFieldSet(String s)
        {
            return false;
        }

        protected final void setStringInternal(com.google.android.gms.common.server.response.FastJsonResponse.Field field, String s, String s1)
        {
            int i = field.getSafeParcelableFieldId();
            i;
            JVM INSTR tableswitch 2 13: default 72
        //                       2 102
        //                       3 123
        //                       4 131
        //                       5 139
        //                       6 147
        //                       7 155
        //                       8 72
        //                       9 163
        //                       10 171
        //                       11 179
        //                       12 187
        //                       13 195;
               goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L1 _L8 _L9 _L10 _L11 _L12
_L1:
            throw new IllegalArgumentException((new StringBuilder("Field with id=")).append(i).append(" is not known to be a String.").toString());
_L2:
            mDisplayName = s1;
_L14:
            mIndicatorSet.add(Integer.valueOf(i));
            return;
_L3:
            mFamilyName = s1;
            continue; /* Loop/switch isn't completed */
_L4:
            mFormatted = s1;
            continue; /* Loop/switch isn't completed */
_L5:
            mGivenName = s1;
            continue; /* Loop/switch isn't completed */
_L6:
            mHonorificPrefix = s1;
            continue; /* Loop/switch isn't completed */
_L7:
            mHonorificSuffix = s1;
            continue; /* Loop/switch isn't completed */
_L8:
            mMiddleName = s1;
            continue; /* Loop/switch isn't completed */
_L9:
            mPhoneticFamilyName = s1;
            continue; /* Loop/switch isn't completed */
_L10:
            mPhoneticGivenName = s1;
            continue; /* Loop/switch isn't completed */
_L11:
            mPhoneticHonorificPrefix = s1;
            continue; /* Loop/switch isn't completed */
_L12:
            mPhoneticHonorificSuffix = s1;
            if (true) goto _L14; else goto _L13
_L13:
        }

        public final void writeToParcel(Parcel parcel, int i)
        {
            DefaultPersonImpl_NamesCreator.writeToParcel(this, parcel, i);
        }

        static 
        {
            HashMap hashmap = new HashMap();
            sFields = hashmap;
            hashmap.put("displayName", com.google.android.gms.common.server.response.FastJsonResponse.Field.forString("displayName", 2));
            sFields.put("familyName", com.google.android.gms.common.server.response.FastJsonResponse.Field.forString("familyName", 3));
            sFields.put("formatted", com.google.android.gms.common.server.response.FastJsonResponse.Field.forString("formatted", 4));
            sFields.put("givenName", com.google.android.gms.common.server.response.FastJsonResponse.Field.forString("givenName", 5));
            sFields.put("honorificPrefix", com.google.android.gms.common.server.response.FastJsonResponse.Field.forString("honorificPrefix", 6));
            sFields.put("honorificSuffix", com.google.android.gms.common.server.response.FastJsonResponse.Field.forString("honorificSuffix", 7));
            sFields.put("metadata", com.google.android.gms.common.server.response.FastJsonResponse.Field.forConcreteType("metadata", 8, com/google/android/gms/people/identity/internal/models/DefaultMetadataImpl));
            sFields.put("middleName", com.google.android.gms.common.server.response.FastJsonResponse.Field.forString("middleName", 9));
            sFields.put("phoneticFamilyName", com.google.android.gms.common.server.response.FastJsonResponse.Field.forString("phoneticFamilyName", 10));
            sFields.put("phoneticGivenName", com.google.android.gms.common.server.response.FastJsonResponse.Field.forString("phoneticGivenName", 11));
            sFields.put("phoneticHonorificPrefix", com.google.android.gms.common.server.response.FastJsonResponse.Field.forString("phoneticHonorificPrefix", 12));
            sFields.put("phoneticHonorificSuffix", com.google.android.gms.common.server.response.FastJsonResponse.Field.forString("phoneticHonorificSuffix", 13));
        }

        public Names()
        {
            mVersionCode = 1;
            mIndicatorSet = new HashSet();
        }

        Names(Set set, int i, String s, String s1, String s2, String s3, String s4, 
                String s5, DefaultMetadataImpl defaultmetadataimpl, String s6, String s7, String s8, String s9, String s10)
        {
            mIndicatorSet = set;
            mVersionCode = i;
            mDisplayName = s;
            mFamilyName = s1;
            mFormatted = s2;
            mGivenName = s3;
            mHonorificPrefix = s4;
            mHonorificSuffix = s5;
            mMetadata = defaultmetadataimpl;
            mMiddleName = s6;
            mPhoneticFamilyName = s7;
            mPhoneticGivenName = s8;
            mPhoneticHonorificPrefix = s9;
            mPhoneticHonorificSuffix = s10;
        }
    }

    public static final class Nicknames extends FastJsonResponse
        implements SafeParcelable
    {

        public static final DefaultPersonImpl_NicknamesCreator CREATOR = new DefaultPersonImpl_NicknamesCreator();
        private static final HashMap sFields;
        final Set mIndicatorSet;
        DefaultMetadataImpl mMetadata;
        String mType;
        String mValue;
        final int mVersionCode;

        public final void addConcreteTypeInternal(com.google.android.gms.common.server.response.FastJsonResponse.Field field, String s, FastJsonResponse fastjsonresponse)
        {
            int i = field.getSafeParcelableFieldId();
            switch (i)
            {
            default:
                throw new IllegalArgumentException((new StringBuilder("Field with id=")).append(i).append(" is not a known custom type.  Found ").append(fastjsonresponse.getClass().getCanonicalName()).append(".").toString());

            case 2: // '\002'
                mMetadata = (DefaultMetadataImpl)fastjsonresponse;
                break;
            }
            mIndicatorSet.add(Integer.valueOf(i));
        }

        public final int describeContents()
        {
            return 0;
        }

        public final boolean equals(Object obj)
        {
            if (obj instanceof Nicknames) goto _L2; else goto _L1
_L1:
            return false;
_L2:
            Iterator iterator;
            if (this == obj)
            {
                return true;
            }
            obj = (Nicknames)obj;
            iterator = sFields.values().iterator();
_L5:
            com.google.android.gms.common.server.response.FastJsonResponse.Field field;
            if (!iterator.hasNext())
            {
                break MISSING_BLOCK_LABEL_96;
            }
            field = (com.google.android.gms.common.server.response.FastJsonResponse.Field)iterator.next();
            if (!isFieldSet(field))
            {
                continue; /* Loop/switch isn't completed */
            }
            if (!((Nicknames) (obj)).isFieldSet(field)) goto _L1; else goto _L3
_L3:
            if (getFieldValue(field).equals(((Nicknames) (obj)).getFieldValue(field))) goto _L5; else goto _L4
_L4:
            return false;
            if (!((Nicknames) (obj)).isFieldSet(field)) goto _L5; else goto _L6
_L6:
            return false;
            return true;
        }

        public final volatile Map getFieldMappings()
        {
            return sFields;
        }

        protected final Object getFieldValue(com.google.android.gms.common.server.response.FastJsonResponse.Field field)
        {
            switch (field.getSafeParcelableFieldId())
            {
            default:
                throw new IllegalStateException((new StringBuilder("Unknown safe parcelable id=")).append(field.getSafeParcelableFieldId()).toString());

            case 2: // '\002'
                return mMetadata;

            case 3: // '\003'
                return mType;

            case 4: // '\004'
                return mValue;
            }
        }

        protected final Object getValueObject(String s)
        {
            return null;
        }

        public final int hashCode()
        {
            int i = 0;
            Iterator iterator = sFields.values().iterator();
            do
            {
                if (!iterator.hasNext())
                {
                    break;
                }
                com.google.android.gms.common.server.response.FastJsonResponse.Field field = (com.google.android.gms.common.server.response.FastJsonResponse.Field)iterator.next();
                if (isFieldSet(field))
                {
                    i = field.getSafeParcelableFieldId() + i + getFieldValue(field).hashCode();
                }
            } while (true);
            return i;
        }

        protected final boolean isFieldSet(com.google.android.gms.common.server.response.FastJsonResponse.Field field)
        {
            return mIndicatorSet.contains(Integer.valueOf(field.getSafeParcelableFieldId()));
        }

        protected final boolean isPrimitiveFieldSet(String s)
        {
            return false;
        }

        protected final void setStringInternal(com.google.android.gms.common.server.response.FastJsonResponse.Field field, String s, String s1)
        {
            int i = field.getSafeParcelableFieldId();
            i;
            JVM INSTR tableswitch 3 4: default 32
        //                       3 62
        //                       4 83;
               goto _L1 _L2 _L3
_L1:
            throw new IllegalArgumentException((new StringBuilder("Field with id=")).append(i).append(" is not known to be a String.").toString());
_L2:
            mType = s1;
_L5:
            mIndicatorSet.add(Integer.valueOf(i));
            return;
_L3:
            mValue = s1;
            if (true) goto _L5; else goto _L4
_L4:
        }

        public final void writeToParcel(Parcel parcel, int i)
        {
            DefaultPersonImpl_NicknamesCreator.writeToParcel(this, parcel, i);
        }

        static 
        {
            HashMap hashmap = new HashMap();
            sFields = hashmap;
            hashmap.put("metadata", com.google.android.gms.common.server.response.FastJsonResponse.Field.forConcreteType("metadata", 2, com/google/android/gms/people/identity/internal/models/DefaultMetadataImpl));
            sFields.put("type", com.google.android.gms.common.server.response.FastJsonResponse.Field.forString("type", 3));
            sFields.put("value", com.google.android.gms.common.server.response.FastJsonResponse.Field.forString("value", 4));
        }

        public Nicknames()
        {
            mVersionCode = 1;
            mIndicatorSet = new HashSet();
        }

        Nicknames(Set set, int i, DefaultMetadataImpl defaultmetadataimpl, String s, String s1)
        {
            mIndicatorSet = set;
            mVersionCode = i;
            mMetadata = defaultmetadataimpl;
            mType = s;
            mValue = s1;
        }
    }

    public static final class Occupations extends FastJsonResponse
        implements SafeParcelable
    {

        public static final DefaultPersonImpl_OccupationsCreator CREATOR = new DefaultPersonImpl_OccupationsCreator();
        private static final HashMap sFields;
        final Set mIndicatorSet;
        DefaultMetadataImpl mMetadata;
        String mValue;
        final int mVersionCode;

        public final void addConcreteTypeInternal(com.google.android.gms.common.server.response.FastJsonResponse.Field field, String s, FastJsonResponse fastjsonresponse)
        {
            int i = field.getSafeParcelableFieldId();
            switch (i)
            {
            default:
                throw new IllegalArgumentException((new StringBuilder("Field with id=")).append(i).append(" is not a known custom type.  Found ").append(fastjsonresponse.getClass().getCanonicalName()).append(".").toString());

            case 2: // '\002'
                mMetadata = (DefaultMetadataImpl)fastjsonresponse;
                break;
            }
            mIndicatorSet.add(Integer.valueOf(i));
        }

        public final int describeContents()
        {
            return 0;
        }

        public final boolean equals(Object obj)
        {
            if (obj instanceof Occupations) goto _L2; else goto _L1
_L1:
            return false;
_L2:
            Iterator iterator;
            if (this == obj)
            {
                return true;
            }
            obj = (Occupations)obj;
            iterator = sFields.values().iterator();
_L5:
            com.google.android.gms.common.server.response.FastJsonResponse.Field field;
            if (!iterator.hasNext())
            {
                break MISSING_BLOCK_LABEL_96;
            }
            field = (com.google.android.gms.common.server.response.FastJsonResponse.Field)iterator.next();
            if (!isFieldSet(field))
            {
                continue; /* Loop/switch isn't completed */
            }
            if (!((Occupations) (obj)).isFieldSet(field)) goto _L1; else goto _L3
_L3:
            if (getFieldValue(field).equals(((Occupations) (obj)).getFieldValue(field))) goto _L5; else goto _L4
_L4:
            return false;
            if (!((Occupations) (obj)).isFieldSet(field)) goto _L5; else goto _L6
_L6:
            return false;
            return true;
        }

        public final volatile Map getFieldMappings()
        {
            return sFields;
        }

        protected final Object getFieldValue(com.google.android.gms.common.server.response.FastJsonResponse.Field field)
        {
            switch (field.getSafeParcelableFieldId())
            {
            default:
                throw new IllegalStateException((new StringBuilder("Unknown safe parcelable id=")).append(field.getSafeParcelableFieldId()).toString());

            case 2: // '\002'
                return mMetadata;

            case 3: // '\003'
                return mValue;
            }
        }

        protected final Object getValueObject(String s)
        {
            return null;
        }

        public final int hashCode()
        {
            int i = 0;
            Iterator iterator = sFields.values().iterator();
            do
            {
                if (!iterator.hasNext())
                {
                    break;
                }
                com.google.android.gms.common.server.response.FastJsonResponse.Field field = (com.google.android.gms.common.server.response.FastJsonResponse.Field)iterator.next();
                if (isFieldSet(field))
                {
                    i = field.getSafeParcelableFieldId() + i + getFieldValue(field).hashCode();
                }
            } while (true);
            return i;
        }

        protected final boolean isFieldSet(com.google.android.gms.common.server.response.FastJsonResponse.Field field)
        {
            return mIndicatorSet.contains(Integer.valueOf(field.getSafeParcelableFieldId()));
        }

        protected final boolean isPrimitiveFieldSet(String s)
        {
            return false;
        }

        protected final void setStringInternal(com.google.android.gms.common.server.response.FastJsonResponse.Field field, String s, String s1)
        {
            int i = field.getSafeParcelableFieldId();
            switch (i)
            {
            default:
                throw new IllegalArgumentException((new StringBuilder("Field with id=")).append(i).append(" is not known to be a String.").toString());

            case 3: // '\003'
                mValue = s1;
                break;
            }
            mIndicatorSet.add(Integer.valueOf(i));
        }

        public final void writeToParcel(Parcel parcel, int i)
        {
            DefaultPersonImpl_OccupationsCreator.writeToParcel(this, parcel, i);
        }

        static 
        {
            HashMap hashmap = new HashMap();
            sFields = hashmap;
            hashmap.put("metadata", com.google.android.gms.common.server.response.FastJsonResponse.Field.forConcreteType("metadata", 2, com/google/android/gms/people/identity/internal/models/DefaultMetadataImpl));
            sFields.put("value", com.google.android.gms.common.server.response.FastJsonResponse.Field.forString("value", 3));
        }

        public Occupations()
        {
            mVersionCode = 1;
            mIndicatorSet = new HashSet();
        }

        Occupations(Set set, int i, DefaultMetadataImpl defaultmetadataimpl, String s)
        {
            mIndicatorSet = set;
            mVersionCode = i;
            mMetadata = defaultmetadataimpl;
            mValue = s;
        }
    }

    public static final class Organizations extends FastJsonResponse
        implements SafeParcelable
    {

        public static final DefaultPersonImpl_OrganizationsCreator CREATOR = new DefaultPersonImpl_OrganizationsCreator();
        private static final HashMap sFields;
        boolean mCurrent;
        String mDepartment;
        String mDescription;
        String mDomain;
        String mEndDate;
        final Set mIndicatorSet;
        String mLocation;
        DefaultMetadataImpl mMetadata;
        String mName;
        String mPhoneticName;
        String mStartDate;
        String mSymbol;
        String mTitle;
        String mType;
        final int mVersionCode;

        public final void addConcreteTypeInternal(com.google.android.gms.common.server.response.FastJsonResponse.Field field, String s, FastJsonResponse fastjsonresponse)
        {
            int i = field.getSafeParcelableFieldId();
            switch (i)
            {
            default:
                throw new IllegalArgumentException((new StringBuilder("Field with id=")).append(i).append(" is not a known custom type.  Found ").append(fastjsonresponse.getClass().getCanonicalName()).append(".").toString());

            case 8: // '\b'
                mMetadata = (DefaultMetadataImpl)fastjsonresponse;
                break;
            }
            mIndicatorSet.add(Integer.valueOf(i));
        }

        public final int describeContents()
        {
            return 0;
        }

        public final boolean equals(Object obj)
        {
            if (obj instanceof Organizations) goto _L2; else goto _L1
_L1:
            return false;
_L2:
            Iterator iterator;
            if (this == obj)
            {
                return true;
            }
            obj = (Organizations)obj;
            iterator = sFields.values().iterator();
_L5:
            com.google.android.gms.common.server.response.FastJsonResponse.Field field;
            if (!iterator.hasNext())
            {
                break MISSING_BLOCK_LABEL_96;
            }
            field = (com.google.android.gms.common.server.response.FastJsonResponse.Field)iterator.next();
            if (!isFieldSet(field))
            {
                continue; /* Loop/switch isn't completed */
            }
            if (!((Organizations) (obj)).isFieldSet(field)) goto _L1; else goto _L3
_L3:
            if (getFieldValue(field).equals(((Organizations) (obj)).getFieldValue(field))) goto _L5; else goto _L4
_L4:
            return false;
            if (!((Organizations) (obj)).isFieldSet(field)) goto _L5; else goto _L6
_L6:
            return false;
            return true;
        }

        public final volatile Map getFieldMappings()
        {
            return sFields;
        }

        protected final Object getFieldValue(com.google.android.gms.common.server.response.FastJsonResponse.Field field)
        {
            switch (field.getSafeParcelableFieldId())
            {
            default:
                throw new IllegalStateException((new StringBuilder("Unknown safe parcelable id=")).append(field.getSafeParcelableFieldId()).toString());

            case 2: // '\002'
                return Boolean.valueOf(mCurrent);

            case 3: // '\003'
                return mDepartment;

            case 4: // '\004'
                return mDescription;

            case 5: // '\005'
                return mDomain;

            case 6: // '\006'
                return mEndDate;

            case 7: // '\007'
                return mLocation;

            case 8: // '\b'
                return mMetadata;

            case 9: // '\t'
                return mName;

            case 10: // '\n'
                return mPhoneticName;

            case 11: // '\013'
                return mStartDate;

            case 12: // '\f'
                return mSymbol;

            case 13: // '\r'
                return mTitle;

            case 14: // '\016'
                return mType;
            }
        }

        protected final Object getValueObject(String s)
        {
            return null;
        }

        public final int hashCode()
        {
            int i = 0;
            Iterator iterator = sFields.values().iterator();
            do
            {
                if (!iterator.hasNext())
                {
                    break;
                }
                com.google.android.gms.common.server.response.FastJsonResponse.Field field = (com.google.android.gms.common.server.response.FastJsonResponse.Field)iterator.next();
                if (isFieldSet(field))
                {
                    i = field.getSafeParcelableFieldId() + i + getFieldValue(field).hashCode();
                }
            } while (true);
            return i;
        }

        protected final boolean isFieldSet(com.google.android.gms.common.server.response.FastJsonResponse.Field field)
        {
            return mIndicatorSet.contains(Integer.valueOf(field.getSafeParcelableFieldId()));
        }

        protected final boolean isPrimitiveFieldSet(String s)
        {
            return false;
        }

        protected final void setBooleanInternal(com.google.android.gms.common.server.response.FastJsonResponse.Field field, String s, boolean flag)
        {
            int i = field.getSafeParcelableFieldId();
            switch (i)
            {
            default:
                throw new IllegalArgumentException((new StringBuilder("Field with id=")).append(i).append(" is not known to be a boolean.").toString());

            case 2: // '\002'
                mCurrent = flag;
                break;
            }
            mIndicatorSet.add(Integer.valueOf(i));
        }

        protected final void setStringInternal(com.google.android.gms.common.server.response.FastJsonResponse.Field field, String s, String s1)
        {
            int i = field.getSafeParcelableFieldId();
            i;
            JVM INSTR tableswitch 3 14: default 72
        //                       3 102
        //                       4 123
        //                       5 131
        //                       6 139
        //                       7 147
        //                       8 72
        //                       9 155
        //                       10 163
        //                       11 171
        //                       12 179
        //                       13 187
        //                       14 195;
               goto _L1 _L2 _L3 _L4 _L5 _L6 _L1 _L7 _L8 _L9 _L10 _L11 _L12
_L1:
            throw new IllegalArgumentException((new StringBuilder("Field with id=")).append(i).append(" is not known to be a String.").toString());
_L2:
            mDepartment = s1;
_L14:
            mIndicatorSet.add(Integer.valueOf(i));
            return;
_L3:
            mDescription = s1;
            continue; /* Loop/switch isn't completed */
_L4:
            mDomain = s1;
            continue; /* Loop/switch isn't completed */
_L5:
            mEndDate = s1;
            continue; /* Loop/switch isn't completed */
_L6:
            mLocation = s1;
            continue; /* Loop/switch isn't completed */
_L7:
            mName = s1;
            continue; /* Loop/switch isn't completed */
_L8:
            mPhoneticName = s1;
            continue; /* Loop/switch isn't completed */
_L9:
            mStartDate = s1;
            continue; /* Loop/switch isn't completed */
_L10:
            mSymbol = s1;
            continue; /* Loop/switch isn't completed */
_L11:
            mTitle = s1;
            continue; /* Loop/switch isn't completed */
_L12:
            mType = s1;
            if (true) goto _L14; else goto _L13
_L13:
        }

        public final void writeToParcel(Parcel parcel, int i)
        {
            DefaultPersonImpl_OrganizationsCreator.writeToParcel(this, parcel, i);
        }

        static 
        {
            HashMap hashmap = new HashMap();
            sFields = hashmap;
            hashmap.put("current", com.google.android.gms.common.server.response.FastJsonResponse.Field.forBoolean("current", 2));
            sFields.put("department", com.google.android.gms.common.server.response.FastJsonResponse.Field.forString("department", 3));
            sFields.put("description", com.google.android.gms.common.server.response.FastJsonResponse.Field.forString("description", 4));
            sFields.put("domain", com.google.android.gms.common.server.response.FastJsonResponse.Field.forString("domain", 5));
            sFields.put("endDate", com.google.android.gms.common.server.response.FastJsonResponse.Field.forString("endDate", 6));
            sFields.put("location", com.google.android.gms.common.server.response.FastJsonResponse.Field.forString("location", 7));
            sFields.put("metadata", com.google.android.gms.common.server.response.FastJsonResponse.Field.forConcreteType("metadata", 8, com/google/android/gms/people/identity/internal/models/DefaultMetadataImpl));
            sFields.put("name", com.google.android.gms.common.server.response.FastJsonResponse.Field.forString("name", 9));
            sFields.put("phoneticName", com.google.android.gms.common.server.response.FastJsonResponse.Field.forString("phoneticName", 10));
            sFields.put("startDate", com.google.android.gms.common.server.response.FastJsonResponse.Field.forString("startDate", 11));
            sFields.put("symbol", com.google.android.gms.common.server.response.FastJsonResponse.Field.forString("symbol", 12));
            sFields.put("title", com.google.android.gms.common.server.response.FastJsonResponse.Field.forString("title", 13));
            sFields.put("type", com.google.android.gms.common.server.response.FastJsonResponse.Field.forString("type", 14));
        }

        public Organizations()
        {
            mVersionCode = 1;
            mIndicatorSet = new HashSet();
        }

        Organizations(Set set, int i, boolean flag, String s, String s1, String s2, String s3, 
                String s4, DefaultMetadataImpl defaultmetadataimpl, String s5, String s6, String s7, String s8, String s9, 
                String s10)
        {
            mIndicatorSet = set;
            mVersionCode = i;
            mCurrent = flag;
            mDepartment = s;
            mDescription = s1;
            mDomain = s2;
            mEndDate = s3;
            mLocation = s4;
            mMetadata = defaultmetadataimpl;
            mName = s5;
            mPhoneticName = s6;
            mStartDate = s7;
            mSymbol = s8;
            mTitle = s9;
            mType = s10;
        }
    }

    public static final class PhoneNumbers extends FastJsonResponse
        implements SafeParcelable
    {

        public static final DefaultPersonImpl_PhoneNumbersCreator CREATOR = new DefaultPersonImpl_PhoneNumbersCreator();
        private static final HashMap sFields;
        String mCanonicalizedForm;
        String mFormattedType;
        final Set mIndicatorSet;
        DefaultMetadataImpl mMetadata;
        String mType;
        String mValue;
        final int mVersionCode;

        public final void addConcreteTypeInternal(com.google.android.gms.common.server.response.FastJsonResponse.Field field, String s, FastJsonResponse fastjsonresponse)
        {
            int i = field.getSafeParcelableFieldId();
            switch (i)
            {
            default:
                throw new IllegalArgumentException((new StringBuilder("Field with id=")).append(i).append(" is not a known custom type.  Found ").append(fastjsonresponse.getClass().getCanonicalName()).append(".").toString());

            case 4: // '\004'
                mMetadata = (DefaultMetadataImpl)fastjsonresponse;
                break;
            }
            mIndicatorSet.add(Integer.valueOf(i));
        }

        public final int describeContents()
        {
            return 0;
        }

        public final boolean equals(Object obj)
        {
            if (obj instanceof PhoneNumbers) goto _L2; else goto _L1
_L1:
            return false;
_L2:
            Iterator iterator;
            if (this == obj)
            {
                return true;
            }
            obj = (PhoneNumbers)obj;
            iterator = sFields.values().iterator();
_L5:
            com.google.android.gms.common.server.response.FastJsonResponse.Field field;
            if (!iterator.hasNext())
            {
                break MISSING_BLOCK_LABEL_96;
            }
            field = (com.google.android.gms.common.server.response.FastJsonResponse.Field)iterator.next();
            if (!isFieldSet(field))
            {
                continue; /* Loop/switch isn't completed */
            }
            if (!((PhoneNumbers) (obj)).isFieldSet(field)) goto _L1; else goto _L3
_L3:
            if (getFieldValue(field).equals(((PhoneNumbers) (obj)).getFieldValue(field))) goto _L5; else goto _L4
_L4:
            return false;
            if (!((PhoneNumbers) (obj)).isFieldSet(field)) goto _L5; else goto _L6
_L6:
            return false;
            return true;
        }

        public final volatile Map getFieldMappings()
        {
            return sFields;
        }

        protected final Object getFieldValue(com.google.android.gms.common.server.response.FastJsonResponse.Field field)
        {
            switch (field.getSafeParcelableFieldId())
            {
            default:
                throw new IllegalStateException((new StringBuilder("Unknown safe parcelable id=")).append(field.getSafeParcelableFieldId()).toString());

            case 2: // '\002'
                return mCanonicalizedForm;

            case 3: // '\003'
                return mFormattedType;

            case 4: // '\004'
                return mMetadata;

            case 5: // '\005'
                return mType;

            case 6: // '\006'
                return mValue;
            }
        }

        protected final Object getValueObject(String s)
        {
            return null;
        }

        public final int hashCode()
        {
            int i = 0;
            Iterator iterator = sFields.values().iterator();
            do
            {
                if (!iterator.hasNext())
                {
                    break;
                }
                com.google.android.gms.common.server.response.FastJsonResponse.Field field = (com.google.android.gms.common.server.response.FastJsonResponse.Field)iterator.next();
                if (isFieldSet(field))
                {
                    i = field.getSafeParcelableFieldId() + i + getFieldValue(field).hashCode();
                }
            } while (true);
            return i;
        }

        protected final boolean isFieldSet(com.google.android.gms.common.server.response.FastJsonResponse.Field field)
        {
            return mIndicatorSet.contains(Integer.valueOf(field.getSafeParcelableFieldId()));
        }

        protected final boolean isPrimitiveFieldSet(String s)
        {
            return false;
        }

        protected final void setStringInternal(com.google.android.gms.common.server.response.FastJsonResponse.Field field, String s, String s1)
        {
            int i = field.getSafeParcelableFieldId();
            i;
            JVM INSTR tableswitch 2 6: default 44
        //                       2 74
        //                       3 95
        //                       4 44
        //                       5 103
        //                       6 111;
               goto _L1 _L2 _L3 _L1 _L4 _L5
_L1:
            throw new IllegalArgumentException((new StringBuilder("Field with id=")).append(i).append(" is not known to be a String.").toString());
_L2:
            mCanonicalizedForm = s1;
_L7:
            mIndicatorSet.add(Integer.valueOf(i));
            return;
_L3:
            mFormattedType = s1;
            continue; /* Loop/switch isn't completed */
_L4:
            mType = s1;
            continue; /* Loop/switch isn't completed */
_L5:
            mValue = s1;
            if (true) goto _L7; else goto _L6
_L6:
        }

        public final void writeToParcel(Parcel parcel, int i)
        {
            DefaultPersonImpl_PhoneNumbersCreator.writeToParcel(this, parcel, i);
        }

        static 
        {
            HashMap hashmap = new HashMap();
            sFields = hashmap;
            hashmap.put("canonicalizedForm", com.google.android.gms.common.server.response.FastJsonResponse.Field.forString("canonicalizedForm", 2));
            sFields.put("formattedType", com.google.android.gms.common.server.response.FastJsonResponse.Field.forString("formattedType", 3));
            sFields.put("metadata", com.google.android.gms.common.server.response.FastJsonResponse.Field.forConcreteType("metadata", 4, com/google/android/gms/people/identity/internal/models/DefaultMetadataImpl));
            sFields.put("type", com.google.android.gms.common.server.response.FastJsonResponse.Field.forString("type", 5));
            sFields.put("value", com.google.android.gms.common.server.response.FastJsonResponse.Field.forString("value", 6));
        }

        public PhoneNumbers()
        {
            mVersionCode = 1;
            mIndicatorSet = new HashSet();
        }

        PhoneNumbers(Set set, int i, String s, String s1, DefaultMetadataImpl defaultmetadataimpl, String s2, String s3)
        {
            mIndicatorSet = set;
            mVersionCode = i;
            mCanonicalizedForm = s;
            mFormattedType = s1;
            mMetadata = defaultmetadataimpl;
            mType = s2;
            mValue = s3;
        }
    }

    public static final class PlacesLived extends FastJsonResponse
        implements SafeParcelable
    {

        public static final DefaultPersonImpl_PlacesLivedCreator CREATOR = new DefaultPersonImpl_PlacesLivedCreator();
        private static final HashMap sFields;
        boolean mCurrent;
        final Set mIndicatorSet;
        DefaultMetadataImpl mMetadata;
        String mValue;
        final int mVersionCode;

        public final void addConcreteTypeInternal(com.google.android.gms.common.server.response.FastJsonResponse.Field field, String s, FastJsonResponse fastjsonresponse)
        {
            int i = field.getSafeParcelableFieldId();
            switch (i)
            {
            default:
                throw new IllegalArgumentException((new StringBuilder("Field with id=")).append(i).append(" is not a known custom type.  Found ").append(fastjsonresponse.getClass().getCanonicalName()).append(".").toString());

            case 3: // '\003'
                mMetadata = (DefaultMetadataImpl)fastjsonresponse;
                break;
            }
            mIndicatorSet.add(Integer.valueOf(i));
        }

        public final int describeContents()
        {
            return 0;
        }

        public final boolean equals(Object obj)
        {
            if (obj instanceof PlacesLived) goto _L2; else goto _L1
_L1:
            return false;
_L2:
            Iterator iterator;
            if (this == obj)
            {
                return true;
            }
            obj = (PlacesLived)obj;
            iterator = sFields.values().iterator();
_L5:
            com.google.android.gms.common.server.response.FastJsonResponse.Field field;
            if (!iterator.hasNext())
            {
                break MISSING_BLOCK_LABEL_96;
            }
            field = (com.google.android.gms.common.server.response.FastJsonResponse.Field)iterator.next();
            if (!isFieldSet(field))
            {
                continue; /* Loop/switch isn't completed */
            }
            if (!((PlacesLived) (obj)).isFieldSet(field)) goto _L1; else goto _L3
_L3:
            if (getFieldValue(field).equals(((PlacesLived) (obj)).getFieldValue(field))) goto _L5; else goto _L4
_L4:
            return false;
            if (!((PlacesLived) (obj)).isFieldSet(field)) goto _L5; else goto _L6
_L6:
            return false;
            return true;
        }

        public final volatile Map getFieldMappings()
        {
            return sFields;
        }

        protected final Object getFieldValue(com.google.android.gms.common.server.response.FastJsonResponse.Field field)
        {
            switch (field.getSafeParcelableFieldId())
            {
            default:
                throw new IllegalStateException((new StringBuilder("Unknown safe parcelable id=")).append(field.getSafeParcelableFieldId()).toString());

            case 2: // '\002'
                return Boolean.valueOf(mCurrent);

            case 3: // '\003'
                return mMetadata;

            case 4: // '\004'
                return mValue;
            }
        }

        protected final Object getValueObject(String s)
        {
            return null;
        }

        public final int hashCode()
        {
            int i = 0;
            Iterator iterator = sFields.values().iterator();
            do
            {
                if (!iterator.hasNext())
                {
                    break;
                }
                com.google.android.gms.common.server.response.FastJsonResponse.Field field = (com.google.android.gms.common.server.response.FastJsonResponse.Field)iterator.next();
                if (isFieldSet(field))
                {
                    i = field.getSafeParcelableFieldId() + i + getFieldValue(field).hashCode();
                }
            } while (true);
            return i;
        }

        protected final boolean isFieldSet(com.google.android.gms.common.server.response.FastJsonResponse.Field field)
        {
            return mIndicatorSet.contains(Integer.valueOf(field.getSafeParcelableFieldId()));
        }

        protected final boolean isPrimitiveFieldSet(String s)
        {
            return false;
        }

        protected final void setBooleanInternal(com.google.android.gms.common.server.response.FastJsonResponse.Field field, String s, boolean flag)
        {
            int i = field.getSafeParcelableFieldId();
            switch (i)
            {
            default:
                throw new IllegalArgumentException((new StringBuilder("Field with id=")).append(i).append(" is not known to be a boolean.").toString());

            case 2: // '\002'
                mCurrent = flag;
                break;
            }
            mIndicatorSet.add(Integer.valueOf(i));
        }

        protected final void setStringInternal(com.google.android.gms.common.server.response.FastJsonResponse.Field field, String s, String s1)
        {
            int i = field.getSafeParcelableFieldId();
            switch (i)
            {
            default:
                throw new IllegalArgumentException((new StringBuilder("Field with id=")).append(i).append(" is not known to be a String.").toString());

            case 4: // '\004'
                mValue = s1;
                break;
            }
            mIndicatorSet.add(Integer.valueOf(i));
        }

        public final void writeToParcel(Parcel parcel, int i)
        {
            DefaultPersonImpl_PlacesLivedCreator.writeToParcel(this, parcel, i);
        }

        static 
        {
            HashMap hashmap = new HashMap();
            sFields = hashmap;
            hashmap.put("current", com.google.android.gms.common.server.response.FastJsonResponse.Field.forBoolean("current", 2));
            sFields.put("metadata", com.google.android.gms.common.server.response.FastJsonResponse.Field.forConcreteType("metadata", 3, com/google/android/gms/people/identity/internal/models/DefaultMetadataImpl));
            sFields.put("value", com.google.android.gms.common.server.response.FastJsonResponse.Field.forString("value", 4));
        }

        public PlacesLived()
        {
            mVersionCode = 1;
            mIndicatorSet = new HashSet();
        }

        PlacesLived(Set set, int i, boolean flag, DefaultMetadataImpl defaultmetadataimpl, String s)
        {
            mIndicatorSet = set;
            mVersionCode = i;
            mCurrent = flag;
            mMetadata = defaultmetadataimpl;
            mValue = s;
        }
    }

    public static final class Relations extends FastJsonResponse
        implements SafeParcelable
    {

        public static final DefaultPersonImpl_RelationsCreator CREATOR = new DefaultPersonImpl_RelationsCreator();
        private static final HashMap sFields;
        String mFormattedType;
        final Set mIndicatorSet;
        DefaultMetadataImpl mMetadata;
        String mType;
        String mValue;
        final int mVersionCode;

        public final void addConcreteTypeInternal(com.google.android.gms.common.server.response.FastJsonResponse.Field field, String s, FastJsonResponse fastjsonresponse)
        {
            int i = field.getSafeParcelableFieldId();
            switch (i)
            {
            default:
                throw new IllegalArgumentException((new StringBuilder("Field with id=")).append(i).append(" is not a known custom type.  Found ").append(fastjsonresponse.getClass().getCanonicalName()).append(".").toString());

            case 3: // '\003'
                mMetadata = (DefaultMetadataImpl)fastjsonresponse;
                break;
            }
            mIndicatorSet.add(Integer.valueOf(i));
        }

        public final int describeContents()
        {
            return 0;
        }

        public final boolean equals(Object obj)
        {
            if (obj instanceof Relations) goto _L2; else goto _L1
_L1:
            return false;
_L2:
            Iterator iterator;
            if (this == obj)
            {
                return true;
            }
            obj = (Relations)obj;
            iterator = sFields.values().iterator();
_L5:
            com.google.android.gms.common.server.response.FastJsonResponse.Field field;
            if (!iterator.hasNext())
            {
                break MISSING_BLOCK_LABEL_96;
            }
            field = (com.google.android.gms.common.server.response.FastJsonResponse.Field)iterator.next();
            if (!isFieldSet(field))
            {
                continue; /* Loop/switch isn't completed */
            }
            if (!((Relations) (obj)).isFieldSet(field)) goto _L1; else goto _L3
_L3:
            if (getFieldValue(field).equals(((Relations) (obj)).getFieldValue(field))) goto _L5; else goto _L4
_L4:
            return false;
            if (!((Relations) (obj)).isFieldSet(field)) goto _L5; else goto _L6
_L6:
            return false;
            return true;
        }

        public final volatile Map getFieldMappings()
        {
            return sFields;
        }

        protected final Object getFieldValue(com.google.android.gms.common.server.response.FastJsonResponse.Field field)
        {
            switch (field.getSafeParcelableFieldId())
            {
            default:
                throw new IllegalStateException((new StringBuilder("Unknown safe parcelable id=")).append(field.getSafeParcelableFieldId()).toString());

            case 2: // '\002'
                return mFormattedType;

            case 3: // '\003'
                return mMetadata;

            case 4: // '\004'
                return mType;

            case 5: // '\005'
                return mValue;
            }
        }

        protected final Object getValueObject(String s)
        {
            return null;
        }

        public final int hashCode()
        {
            int i = 0;
            Iterator iterator = sFields.values().iterator();
            do
            {
                if (!iterator.hasNext())
                {
                    break;
                }
                com.google.android.gms.common.server.response.FastJsonResponse.Field field = (com.google.android.gms.common.server.response.FastJsonResponse.Field)iterator.next();
                if (isFieldSet(field))
                {
                    i = field.getSafeParcelableFieldId() + i + getFieldValue(field).hashCode();
                }
            } while (true);
            return i;
        }

        protected final boolean isFieldSet(com.google.android.gms.common.server.response.FastJsonResponse.Field field)
        {
            return mIndicatorSet.contains(Integer.valueOf(field.getSafeParcelableFieldId()));
        }

        protected final boolean isPrimitiveFieldSet(String s)
        {
            return false;
        }

        protected final void setStringInternal(com.google.android.gms.common.server.response.FastJsonResponse.Field field, String s, String s1)
        {
            int i = field.getSafeParcelableFieldId();
            i;
            JVM INSTR tableswitch 2 5: default 40
        //                       2 70
        //                       3 40
        //                       4 91
        //                       5 99;
               goto _L1 _L2 _L1 _L3 _L4
_L1:
            throw new IllegalArgumentException((new StringBuilder("Field with id=")).append(i).append(" is not known to be a String.").toString());
_L2:
            mFormattedType = s1;
_L6:
            mIndicatorSet.add(Integer.valueOf(i));
            return;
_L3:
            mType = s1;
            continue; /* Loop/switch isn't completed */
_L4:
            mValue = s1;
            if (true) goto _L6; else goto _L5
_L5:
        }

        public final void writeToParcel(Parcel parcel, int i)
        {
            DefaultPersonImpl_RelationsCreator.writeToParcel(this, parcel, i);
        }

        static 
        {
            HashMap hashmap = new HashMap();
            sFields = hashmap;
            hashmap.put("formattedType", com.google.android.gms.common.server.response.FastJsonResponse.Field.forString("formattedType", 2));
            sFields.put("metadata", com.google.android.gms.common.server.response.FastJsonResponse.Field.forConcreteType("metadata", 3, com/google/android/gms/people/identity/internal/models/DefaultMetadataImpl));
            sFields.put("type", com.google.android.gms.common.server.response.FastJsonResponse.Field.forString("type", 4));
            sFields.put("value", com.google.android.gms.common.server.response.FastJsonResponse.Field.forString("value", 5));
        }

        public Relations()
        {
            mVersionCode = 1;
            mIndicatorSet = new HashSet();
        }

        Relations(Set set, int i, String s, DefaultMetadataImpl defaultmetadataimpl, String s1, String s2)
        {
            mIndicatorSet = set;
            mVersionCode = i;
            mFormattedType = s;
            mMetadata = defaultmetadataimpl;
            mType = s1;
            mValue = s2;
        }
    }

    public static final class RelationshipInterests extends FastJsonResponse
        implements SafeParcelable
    {

        public static final DefaultPersonImpl_RelationshipInterestsCreator CREATOR = new DefaultPersonImpl_RelationshipInterestsCreator();
        private static final HashMap sFields;
        final Set mIndicatorSet;
        DefaultMetadataImpl mMetadata;
        String mValue;
        final int mVersionCode;

        public final void addConcreteTypeInternal(com.google.android.gms.common.server.response.FastJsonResponse.Field field, String s, FastJsonResponse fastjsonresponse)
        {
            int i = field.getSafeParcelableFieldId();
            switch (i)
            {
            default:
                throw new IllegalArgumentException((new StringBuilder("Field with id=")).append(i).append(" is not a known custom type.  Found ").append(fastjsonresponse.getClass().getCanonicalName()).append(".").toString());

            case 2: // '\002'
                mMetadata = (DefaultMetadataImpl)fastjsonresponse;
                break;
            }
            mIndicatorSet.add(Integer.valueOf(i));
        }

        public final int describeContents()
        {
            return 0;
        }

        public final boolean equals(Object obj)
        {
            if (obj instanceof RelationshipInterests) goto _L2; else goto _L1
_L1:
            return false;
_L2:
            Iterator iterator;
            if (this == obj)
            {
                return true;
            }
            obj = (RelationshipInterests)obj;
            iterator = sFields.values().iterator();
_L5:
            com.google.android.gms.common.server.response.FastJsonResponse.Field field;
            if (!iterator.hasNext())
            {
                break MISSING_BLOCK_LABEL_96;
            }
            field = (com.google.android.gms.common.server.response.FastJsonResponse.Field)iterator.next();
            if (!isFieldSet(field))
            {
                continue; /* Loop/switch isn't completed */
            }
            if (!((RelationshipInterests) (obj)).isFieldSet(field)) goto _L1; else goto _L3
_L3:
            if (getFieldValue(field).equals(((RelationshipInterests) (obj)).getFieldValue(field))) goto _L5; else goto _L4
_L4:
            return false;
            if (!((RelationshipInterests) (obj)).isFieldSet(field)) goto _L5; else goto _L6
_L6:
            return false;
            return true;
        }

        public final volatile Map getFieldMappings()
        {
            return sFields;
        }

        protected final Object getFieldValue(com.google.android.gms.common.server.response.FastJsonResponse.Field field)
        {
            switch (field.getSafeParcelableFieldId())
            {
            default:
                throw new IllegalStateException((new StringBuilder("Unknown safe parcelable id=")).append(field.getSafeParcelableFieldId()).toString());

            case 2: // '\002'
                return mMetadata;

            case 3: // '\003'
                return mValue;
            }
        }

        protected final Object getValueObject(String s)
        {
            return null;
        }

        public final int hashCode()
        {
            int i = 0;
            Iterator iterator = sFields.values().iterator();
            do
            {
                if (!iterator.hasNext())
                {
                    break;
                }
                com.google.android.gms.common.server.response.FastJsonResponse.Field field = (com.google.android.gms.common.server.response.FastJsonResponse.Field)iterator.next();
                if (isFieldSet(field))
                {
                    i = field.getSafeParcelableFieldId() + i + getFieldValue(field).hashCode();
                }
            } while (true);
            return i;
        }

        protected final boolean isFieldSet(com.google.android.gms.common.server.response.FastJsonResponse.Field field)
        {
            return mIndicatorSet.contains(Integer.valueOf(field.getSafeParcelableFieldId()));
        }

        protected final boolean isPrimitiveFieldSet(String s)
        {
            return false;
        }

        protected final void setStringInternal(com.google.android.gms.common.server.response.FastJsonResponse.Field field, String s, String s1)
        {
            int i = field.getSafeParcelableFieldId();
            switch (i)
            {
            default:
                throw new IllegalArgumentException((new StringBuilder("Field with id=")).append(i).append(" is not known to be a String.").toString());

            case 3: // '\003'
                mValue = s1;
                break;
            }
            mIndicatorSet.add(Integer.valueOf(i));
        }

        public final void writeToParcel(Parcel parcel, int i)
        {
            DefaultPersonImpl_RelationshipInterestsCreator.writeToParcel(this, parcel, i);
        }

        static 
        {
            HashMap hashmap = new HashMap();
            sFields = hashmap;
            hashmap.put("metadata", com.google.android.gms.common.server.response.FastJsonResponse.Field.forConcreteType("metadata", 2, com/google/android/gms/people/identity/internal/models/DefaultMetadataImpl));
            sFields.put("value", com.google.android.gms.common.server.response.FastJsonResponse.Field.forString("value", 3));
        }

        public RelationshipInterests()
        {
            mVersionCode = 1;
            mIndicatorSet = new HashSet();
        }

        RelationshipInterests(Set set, int i, DefaultMetadataImpl defaultmetadataimpl, String s)
        {
            mIndicatorSet = set;
            mVersionCode = i;
            mMetadata = defaultmetadataimpl;
            mValue = s;
        }
    }

    public static final class RelationshipStatuses extends FastJsonResponse
        implements SafeParcelable
    {

        public static final DefaultPersonImpl_RelationshipStatusesCreator CREATOR = new DefaultPersonImpl_RelationshipStatusesCreator();
        private static final HashMap sFields;
        String mFormattedValue;
        final Set mIndicatorSet;
        DefaultMetadataImpl mMetadata;
        String mValue;
        final int mVersionCode;

        public final void addConcreteTypeInternal(com.google.android.gms.common.server.response.FastJsonResponse.Field field, String s, FastJsonResponse fastjsonresponse)
        {
            int i = field.getSafeParcelableFieldId();
            switch (i)
            {
            default:
                throw new IllegalArgumentException((new StringBuilder("Field with id=")).append(i).append(" is not a known custom type.  Found ").append(fastjsonresponse.getClass().getCanonicalName()).append(".").toString());

            case 3: // '\003'
                mMetadata = (DefaultMetadataImpl)fastjsonresponse;
                break;
            }
            mIndicatorSet.add(Integer.valueOf(i));
        }

        public final int describeContents()
        {
            return 0;
        }

        public final boolean equals(Object obj)
        {
            if (obj instanceof RelationshipStatuses) goto _L2; else goto _L1
_L1:
            return false;
_L2:
            Iterator iterator;
            if (this == obj)
            {
                return true;
            }
            obj = (RelationshipStatuses)obj;
            iterator = sFields.values().iterator();
_L5:
            com.google.android.gms.common.server.response.FastJsonResponse.Field field;
            if (!iterator.hasNext())
            {
                break MISSING_BLOCK_LABEL_96;
            }
            field = (com.google.android.gms.common.server.response.FastJsonResponse.Field)iterator.next();
            if (!isFieldSet(field))
            {
                continue; /* Loop/switch isn't completed */
            }
            if (!((RelationshipStatuses) (obj)).isFieldSet(field)) goto _L1; else goto _L3
_L3:
            if (getFieldValue(field).equals(((RelationshipStatuses) (obj)).getFieldValue(field))) goto _L5; else goto _L4
_L4:
            return false;
            if (!((RelationshipStatuses) (obj)).isFieldSet(field)) goto _L5; else goto _L6
_L6:
            return false;
            return true;
        }

        public final volatile Map getFieldMappings()
        {
            return sFields;
        }

        protected final Object getFieldValue(com.google.android.gms.common.server.response.FastJsonResponse.Field field)
        {
            switch (field.getSafeParcelableFieldId())
            {
            default:
                throw new IllegalStateException((new StringBuilder("Unknown safe parcelable id=")).append(field.getSafeParcelableFieldId()).toString());

            case 2: // '\002'
                return mFormattedValue;

            case 3: // '\003'
                return mMetadata;

            case 4: // '\004'
                return mValue;
            }
        }

        protected final Object getValueObject(String s)
        {
            return null;
        }

        public final int hashCode()
        {
            int i = 0;
            Iterator iterator = sFields.values().iterator();
            do
            {
                if (!iterator.hasNext())
                {
                    break;
                }
                com.google.android.gms.common.server.response.FastJsonResponse.Field field = (com.google.android.gms.common.server.response.FastJsonResponse.Field)iterator.next();
                if (isFieldSet(field))
                {
                    i = field.getSafeParcelableFieldId() + i + getFieldValue(field).hashCode();
                }
            } while (true);
            return i;
        }

        protected final boolean isFieldSet(com.google.android.gms.common.server.response.FastJsonResponse.Field field)
        {
            return mIndicatorSet.contains(Integer.valueOf(field.getSafeParcelableFieldId()));
        }

        protected final boolean isPrimitiveFieldSet(String s)
        {
            return false;
        }

        protected final void setStringInternal(com.google.android.gms.common.server.response.FastJsonResponse.Field field, String s, String s1)
        {
            int i = field.getSafeParcelableFieldId();
            i;
            JVM INSTR tableswitch 2 4: default 36
        //                       2 66
        //                       3 36
        //                       4 87;
               goto _L1 _L2 _L1 _L3
_L1:
            throw new IllegalArgumentException((new StringBuilder("Field with id=")).append(i).append(" is not known to be a String.").toString());
_L2:
            mFormattedValue = s1;
_L5:
            mIndicatorSet.add(Integer.valueOf(i));
            return;
_L3:
            mValue = s1;
            if (true) goto _L5; else goto _L4
_L4:
        }

        public final void writeToParcel(Parcel parcel, int i)
        {
            DefaultPersonImpl_RelationshipStatusesCreator.writeToParcel(this, parcel, i);
        }

        static 
        {
            HashMap hashmap = new HashMap();
            sFields = hashmap;
            hashmap.put("formattedValue", com.google.android.gms.common.server.response.FastJsonResponse.Field.forString("formattedValue", 2));
            sFields.put("metadata", com.google.android.gms.common.server.response.FastJsonResponse.Field.forConcreteType("metadata", 3, com/google/android/gms/people/identity/internal/models/DefaultMetadataImpl));
            sFields.put("value", com.google.android.gms.common.server.response.FastJsonResponse.Field.forString("value", 4));
        }

        public RelationshipStatuses()
        {
            mVersionCode = 1;
            mIndicatorSet = new HashSet();
        }

        RelationshipStatuses(Set set, int i, String s, DefaultMetadataImpl defaultmetadataimpl, String s1)
        {
            mIndicatorSet = set;
            mVersionCode = i;
            mFormattedValue = s;
            mMetadata = defaultmetadataimpl;
            mValue = s1;
        }
    }

    public static final class Skills extends FastJsonResponse
        implements SafeParcelable
    {

        public static final DefaultPersonImpl_SkillsCreator CREATOR = new DefaultPersonImpl_SkillsCreator();
        private static final HashMap sFields;
        final Set mIndicatorSet;
        DefaultMetadataImpl mMetadata;
        String mValue;
        final int mVersionCode;

        public final void addConcreteTypeInternal(com.google.android.gms.common.server.response.FastJsonResponse.Field field, String s, FastJsonResponse fastjsonresponse)
        {
            int i = field.getSafeParcelableFieldId();
            switch (i)
            {
            default:
                throw new IllegalArgumentException((new StringBuilder("Field with id=")).append(i).append(" is not a known custom type.  Found ").append(fastjsonresponse.getClass().getCanonicalName()).append(".").toString());

            case 2: // '\002'
                mMetadata = (DefaultMetadataImpl)fastjsonresponse;
                break;
            }
            mIndicatorSet.add(Integer.valueOf(i));
        }

        public final int describeContents()
        {
            return 0;
        }

        public final boolean equals(Object obj)
        {
            if (obj instanceof Skills) goto _L2; else goto _L1
_L1:
            return false;
_L2:
            Iterator iterator;
            if (this == obj)
            {
                return true;
            }
            obj = (Skills)obj;
            iterator = sFields.values().iterator();
_L5:
            com.google.android.gms.common.server.response.FastJsonResponse.Field field;
            if (!iterator.hasNext())
            {
                break MISSING_BLOCK_LABEL_96;
            }
            field = (com.google.android.gms.common.server.response.FastJsonResponse.Field)iterator.next();
            if (!isFieldSet(field))
            {
                continue; /* Loop/switch isn't completed */
            }
            if (!((Skills) (obj)).isFieldSet(field)) goto _L1; else goto _L3
_L3:
            if (getFieldValue(field).equals(((Skills) (obj)).getFieldValue(field))) goto _L5; else goto _L4
_L4:
            return false;
            if (!((Skills) (obj)).isFieldSet(field)) goto _L5; else goto _L6
_L6:
            return false;
            return true;
        }

        public final volatile Map getFieldMappings()
        {
            return sFields;
        }

        protected final Object getFieldValue(com.google.android.gms.common.server.response.FastJsonResponse.Field field)
        {
            switch (field.getSafeParcelableFieldId())
            {
            default:
                throw new IllegalStateException((new StringBuilder("Unknown safe parcelable id=")).append(field.getSafeParcelableFieldId()).toString());

            case 2: // '\002'
                return mMetadata;

            case 3: // '\003'
                return mValue;
            }
        }

        protected final Object getValueObject(String s)
        {
            return null;
        }

        public final int hashCode()
        {
            int i = 0;
            Iterator iterator = sFields.values().iterator();
            do
            {
                if (!iterator.hasNext())
                {
                    break;
                }
                com.google.android.gms.common.server.response.FastJsonResponse.Field field = (com.google.android.gms.common.server.response.FastJsonResponse.Field)iterator.next();
                if (isFieldSet(field))
                {
                    i = field.getSafeParcelableFieldId() + i + getFieldValue(field).hashCode();
                }
            } while (true);
            return i;
        }

        protected final boolean isFieldSet(com.google.android.gms.common.server.response.FastJsonResponse.Field field)
        {
            return mIndicatorSet.contains(Integer.valueOf(field.getSafeParcelableFieldId()));
        }

        protected final boolean isPrimitiveFieldSet(String s)
        {
            return false;
        }

        protected final void setStringInternal(com.google.android.gms.common.server.response.FastJsonResponse.Field field, String s, String s1)
        {
            int i = field.getSafeParcelableFieldId();
            switch (i)
            {
            default:
                throw new IllegalArgumentException((new StringBuilder("Field with id=")).append(i).append(" is not known to be a String.").toString());

            case 3: // '\003'
                mValue = s1;
                break;
            }
            mIndicatorSet.add(Integer.valueOf(i));
        }

        public final void writeToParcel(Parcel parcel, int i)
        {
            DefaultPersonImpl_SkillsCreator.writeToParcel(this, parcel, i);
        }

        static 
        {
            HashMap hashmap = new HashMap();
            sFields = hashmap;
            hashmap.put("metadata", com.google.android.gms.common.server.response.FastJsonResponse.Field.forConcreteType("metadata", 2, com/google/android/gms/people/identity/internal/models/DefaultMetadataImpl));
            sFields.put("value", com.google.android.gms.common.server.response.FastJsonResponse.Field.forString("value", 3));
        }

        public Skills()
        {
            mVersionCode = 1;
            mIndicatorSet = new HashSet();
        }

        Skills(Set set, int i, DefaultMetadataImpl defaultmetadataimpl, String s)
        {
            mIndicatorSet = set;
            mVersionCode = i;
            mMetadata = defaultmetadataimpl;
            mValue = s;
        }
    }

    public static final class SortKeys extends FastJsonResponse
        implements SafeParcelable
    {

        public static final DefaultPersonImpl_SortKeysCreator CREATOR = new DefaultPersonImpl_SortKeysCreator();
        private static final HashMap sFields;
        List mAffinities;
        final Set mIndicatorSet;
        String mInteractionRank;
        String mName;
        final int mVersionCode;

        public final void addConcreteTypeArrayInternal(com.google.android.gms.common.server.response.FastJsonResponse.Field field, String s, ArrayList arraylist)
        {
            int i = field.getSafeParcelableFieldId();
            switch (i)
            {
            default:
                throw new IllegalArgumentException((new StringBuilder("Field with id=")).append(i).append(" is not a known array of custom type.  Found ").append(arraylist.getClass().getCanonicalName()).append(".").toString());

            case 2: // '\002'
                mAffinities = arraylist;
                break;
            }
            mIndicatorSet.add(Integer.valueOf(i));
        }

        public final int describeContents()
        {
            return 0;
        }

        public final boolean equals(Object obj)
        {
            if (obj instanceof SortKeys) goto _L2; else goto _L1
_L1:
            return false;
_L2:
            Iterator iterator;
            if (this == obj)
            {
                return true;
            }
            obj = (SortKeys)obj;
            iterator = sFields.values().iterator();
_L5:
            com.google.android.gms.common.server.response.FastJsonResponse.Field field;
            if (!iterator.hasNext())
            {
                break MISSING_BLOCK_LABEL_96;
            }
            field = (com.google.android.gms.common.server.response.FastJsonResponse.Field)iterator.next();
            if (!isFieldSet(field))
            {
                continue; /* Loop/switch isn't completed */
            }
            if (!((SortKeys) (obj)).isFieldSet(field)) goto _L1; else goto _L3
_L3:
            if (getFieldValue(field).equals(((SortKeys) (obj)).getFieldValue(field))) goto _L5; else goto _L4
_L4:
            return false;
            if (!((SortKeys) (obj)).isFieldSet(field)) goto _L5; else goto _L6
_L6:
            return false;
            return true;
        }

        public final volatile Map getFieldMappings()
        {
            return sFields;
        }

        protected final Object getFieldValue(com.google.android.gms.common.server.response.FastJsonResponse.Field field)
        {
            switch (field.getSafeParcelableFieldId())
            {
            default:
                throw new IllegalStateException((new StringBuilder("Unknown safe parcelable id=")).append(field.getSafeParcelableFieldId()).toString());

            case 2: // '\002'
                return mAffinities;

            case 3: // '\003'
                return mInteractionRank;

            case 4: // '\004'
                return mName;
            }
        }

        protected final Object getValueObject(String s)
        {
            return null;
        }

        public final int hashCode()
        {
            int i = 0;
            Iterator iterator = sFields.values().iterator();
            do
            {
                if (!iterator.hasNext())
                {
                    break;
                }
                com.google.android.gms.common.server.response.FastJsonResponse.Field field = (com.google.android.gms.common.server.response.FastJsonResponse.Field)iterator.next();
                if (isFieldSet(field))
                {
                    i = field.getSafeParcelableFieldId() + i + getFieldValue(field).hashCode();
                }
            } while (true);
            return i;
        }

        protected final boolean isFieldSet(com.google.android.gms.common.server.response.FastJsonResponse.Field field)
        {
            return mIndicatorSet.contains(Integer.valueOf(field.getSafeParcelableFieldId()));
        }

        protected final boolean isPrimitiveFieldSet(String s)
        {
            return false;
        }

        protected final void setStringInternal(com.google.android.gms.common.server.response.FastJsonResponse.Field field, String s, String s1)
        {
            int i = field.getSafeParcelableFieldId();
            i;
            JVM INSTR tableswitch 3 4: default 32
        //                       3 62
        //                       4 83;
               goto _L1 _L2 _L3
_L1:
            throw new IllegalArgumentException((new StringBuilder("Field with id=")).append(i).append(" is not known to be a String.").toString());
_L2:
            mInteractionRank = s1;
_L5:
            mIndicatorSet.add(Integer.valueOf(i));
            return;
_L3:
            mName = s1;
            if (true) goto _L5; else goto _L4
_L4:
        }

        public final void writeToParcel(Parcel parcel, int i)
        {
            DefaultPersonImpl_SortKeysCreator.writeToParcel$1e7124c(this, parcel);
        }

        static 
        {
            HashMap hashmap = new HashMap();
            sFields = hashmap;
            hashmap.put("affinities", com.google.android.gms.common.server.response.FastJsonResponse.Field.forConcreteTypeArray("affinities", 2, com/google/android/gms/people/identity/internal/models/DefaultPersonImpl$SortKeys$Affinities));
            sFields.put("interactionRank", com.google.android.gms.common.server.response.FastJsonResponse.Field.forString("interactionRank", 3));
            sFields.put("name", com.google.android.gms.common.server.response.FastJsonResponse.Field.forString("name", 4));
        }

        public SortKeys()
        {
            mVersionCode = 1;
            mIndicatorSet = new HashSet();
        }

        SortKeys(Set set, int i, List list, String s, String s1)
        {
            mIndicatorSet = set;
            mVersionCode = i;
            mAffinities = list;
            mInteractionRank = s;
            mName = s1;
        }
    }

    public static final class SortKeys.Affinities extends FastJsonResponse
        implements SafeParcelable
    {

        public static final DefaultPersonImpl_SortKeys_AffinitiesCreator CREATOR = new DefaultPersonImpl_SortKeys_AffinitiesCreator();
        private static final HashMap sFields;
        final Set mIndicatorSet;
        String mType;
        double mValue;
        final int mVersionCode;

        public final int describeContents()
        {
            return 0;
        }

        public final boolean equals(Object obj)
        {
            if (obj instanceof SortKeys.Affinities) goto _L2; else goto _L1
_L1:
            return false;
_L2:
            Iterator iterator;
            if (this == obj)
            {
                return true;
            }
            obj = (SortKeys.Affinities)obj;
            iterator = sFields.values().iterator();
_L5:
            com.google.android.gms.common.server.response.FastJsonResponse.Field field;
            if (!iterator.hasNext())
            {
                break MISSING_BLOCK_LABEL_96;
            }
            field = (com.google.android.gms.common.server.response.FastJsonResponse.Field)iterator.next();
            if (!isFieldSet(field))
            {
                continue; /* Loop/switch isn't completed */
            }
            if (!((SortKeys.Affinities) (obj)).isFieldSet(field)) goto _L1; else goto _L3
_L3:
            if (getFieldValue(field).equals(((SortKeys.Affinities) (obj)).getFieldValue(field))) goto _L5; else goto _L4
_L4:
            return false;
            if (!((SortKeys.Affinities) (obj)).isFieldSet(field)) goto _L5; else goto _L6
_L6:
            return false;
            return true;
        }

        public final volatile Map getFieldMappings()
        {
            return sFields;
        }

        protected final Object getFieldValue(com.google.android.gms.common.server.response.FastJsonResponse.Field field)
        {
            switch (field.getSafeParcelableFieldId())
            {
            default:
                throw new IllegalStateException((new StringBuilder("Unknown safe parcelable id=")).append(field.getSafeParcelableFieldId()).toString());

            case 2: // '\002'
                return mType;

            case 3: // '\003'
                return Double.valueOf(mValue);
            }
        }

        protected final Object getValueObject(String s)
        {
            return null;
        }

        public final int hashCode()
        {
            int i = 0;
            Iterator iterator = sFields.values().iterator();
            do
            {
                if (!iterator.hasNext())
                {
                    break;
                }
                com.google.android.gms.common.server.response.FastJsonResponse.Field field = (com.google.android.gms.common.server.response.FastJsonResponse.Field)iterator.next();
                if (isFieldSet(field))
                {
                    i = field.getSafeParcelableFieldId() + i + getFieldValue(field).hashCode();
                }
            } while (true);
            return i;
        }

        protected final boolean isFieldSet(com.google.android.gms.common.server.response.FastJsonResponse.Field field)
        {
            return mIndicatorSet.contains(Integer.valueOf(field.getSafeParcelableFieldId()));
        }

        protected final boolean isPrimitiveFieldSet(String s)
        {
            return false;
        }

        protected final void setDoubleInternal(com.google.android.gms.common.server.response.FastJsonResponse.Field field, String s, double d)
        {
            int i = field.getSafeParcelableFieldId();
            switch (i)
            {
            default:
                throw new IllegalArgumentException((new StringBuilder("Field with id=")).append(i).append(" is not known to be a double.").toString());

            case 3: // '\003'
                mValue = d;
                break;
            }
            mIndicatorSet.add(Integer.valueOf(i));
        }

        protected final void setStringInternal(com.google.android.gms.common.server.response.FastJsonResponse.Field field, String s, String s1)
        {
            int i = field.getSafeParcelableFieldId();
            switch (i)
            {
            default:
                throw new IllegalArgumentException((new StringBuilder("Field with id=")).append(i).append(" is not known to be a String.").toString());

            case 2: // '\002'
                mType = s1;
                break;
            }
            mIndicatorSet.add(Integer.valueOf(i));
        }

        public final void writeToParcel(Parcel parcel, int i)
        {
            DefaultPersonImpl_SortKeys_AffinitiesCreator.writeToParcel$566cec2(this, parcel);
        }

        static 
        {
            HashMap hashmap = new HashMap();
            sFields = hashmap;
            hashmap.put("type", com.google.android.gms.common.server.response.FastJsonResponse.Field.forString("type", 2));
            sFields.put("value", com.google.android.gms.common.server.response.FastJsonResponse.Field.forDouble("value", 3));
        }

        public SortKeys.Affinities()
        {
            mVersionCode = 1;
            mIndicatorSet = new HashSet();
        }

        SortKeys.Affinities(Set set, int i, String s, double d)
        {
            mIndicatorSet = set;
            mVersionCode = i;
            mType = s;
            mValue = d;
        }
    }

    public static final class Taglines extends FastJsonResponse
        implements SafeParcelable
    {

        public static final DefaultPersonImpl_TaglinesCreator CREATOR = new DefaultPersonImpl_TaglinesCreator();
        private static final HashMap sFields;
        final Set mIndicatorSet;
        DefaultMetadataImpl mMetadata;
        String mValue;
        final int mVersionCode;

        public final void addConcreteTypeInternal(com.google.android.gms.common.server.response.FastJsonResponse.Field field, String s, FastJsonResponse fastjsonresponse)
        {
            int i = field.getSafeParcelableFieldId();
            switch (i)
            {
            default:
                throw new IllegalArgumentException((new StringBuilder("Field with id=")).append(i).append(" is not a known custom type.  Found ").append(fastjsonresponse.getClass().getCanonicalName()).append(".").toString());

            case 2: // '\002'
                mMetadata = (DefaultMetadataImpl)fastjsonresponse;
                break;
            }
            mIndicatorSet.add(Integer.valueOf(i));
        }

        public final int describeContents()
        {
            return 0;
        }

        public final boolean equals(Object obj)
        {
            if (obj instanceof Taglines) goto _L2; else goto _L1
_L1:
            return false;
_L2:
            Iterator iterator;
            if (this == obj)
            {
                return true;
            }
            obj = (Taglines)obj;
            iterator = sFields.values().iterator();
_L5:
            com.google.android.gms.common.server.response.FastJsonResponse.Field field;
            if (!iterator.hasNext())
            {
                break MISSING_BLOCK_LABEL_96;
            }
            field = (com.google.android.gms.common.server.response.FastJsonResponse.Field)iterator.next();
            if (!isFieldSet(field))
            {
                continue; /* Loop/switch isn't completed */
            }
            if (!((Taglines) (obj)).isFieldSet(field)) goto _L1; else goto _L3
_L3:
            if (getFieldValue(field).equals(((Taglines) (obj)).getFieldValue(field))) goto _L5; else goto _L4
_L4:
            return false;
            if (!((Taglines) (obj)).isFieldSet(field)) goto _L5; else goto _L6
_L6:
            return false;
            return true;
        }

        public final volatile Map getFieldMappings()
        {
            return sFields;
        }

        protected final Object getFieldValue(com.google.android.gms.common.server.response.FastJsonResponse.Field field)
        {
            switch (field.getSafeParcelableFieldId())
            {
            default:
                throw new IllegalStateException((new StringBuilder("Unknown safe parcelable id=")).append(field.getSafeParcelableFieldId()).toString());

            case 2: // '\002'
                return mMetadata;

            case 3: // '\003'
                return mValue;
            }
        }

        protected final Object getValueObject(String s)
        {
            return null;
        }

        public final int hashCode()
        {
            int i = 0;
            Iterator iterator = sFields.values().iterator();
            do
            {
                if (!iterator.hasNext())
                {
                    break;
                }
                com.google.android.gms.common.server.response.FastJsonResponse.Field field = (com.google.android.gms.common.server.response.FastJsonResponse.Field)iterator.next();
                if (isFieldSet(field))
                {
                    i = field.getSafeParcelableFieldId() + i + getFieldValue(field).hashCode();
                }
            } while (true);
            return i;
        }

        protected final boolean isFieldSet(com.google.android.gms.common.server.response.FastJsonResponse.Field field)
        {
            return mIndicatorSet.contains(Integer.valueOf(field.getSafeParcelableFieldId()));
        }

        protected final boolean isPrimitiveFieldSet(String s)
        {
            return false;
        }

        protected final void setStringInternal(com.google.android.gms.common.server.response.FastJsonResponse.Field field, String s, String s1)
        {
            int i = field.getSafeParcelableFieldId();
            switch (i)
            {
            default:
                throw new IllegalArgumentException((new StringBuilder("Field with id=")).append(i).append(" is not known to be a String.").toString());

            case 3: // '\003'
                mValue = s1;
                break;
            }
            mIndicatorSet.add(Integer.valueOf(i));
        }

        public final void writeToParcel(Parcel parcel, int i)
        {
            DefaultPersonImpl_TaglinesCreator.writeToParcel(this, parcel, i);
        }

        static 
        {
            HashMap hashmap = new HashMap();
            sFields = hashmap;
            hashmap.put("metadata", com.google.android.gms.common.server.response.FastJsonResponse.Field.forConcreteType("metadata", 2, com/google/android/gms/people/identity/internal/models/DefaultMetadataImpl));
            sFields.put("value", com.google.android.gms.common.server.response.FastJsonResponse.Field.forString("value", 3));
        }

        public Taglines()
        {
            mVersionCode = 1;
            mIndicatorSet = new HashSet();
        }

        Taglines(Set set, int i, DefaultMetadataImpl defaultmetadataimpl, String s)
        {
            mIndicatorSet = set;
            mVersionCode = i;
            mMetadata = defaultmetadataimpl;
            mValue = s;
        }
    }

    public static final class Urls extends FastJsonResponse
        implements SafeParcelable
    {

        public static final DefaultPersonImpl_UrlsCreator CREATOR = new DefaultPersonImpl_UrlsCreator();
        private static final HashMap sFields;
        String mFormattedType;
        final Set mIndicatorSet;
        DefaultMetadataImpl mMetadata;
        String mType;
        String mValue;
        final int mVersionCode;

        public final void addConcreteTypeInternal(com.google.android.gms.common.server.response.FastJsonResponse.Field field, String s, FastJsonResponse fastjsonresponse)
        {
            int i = field.getSafeParcelableFieldId();
            switch (i)
            {
            default:
                throw new IllegalArgumentException((new StringBuilder("Field with id=")).append(i).append(" is not a known custom type.  Found ").append(fastjsonresponse.getClass().getCanonicalName()).append(".").toString());

            case 3: // '\003'
                mMetadata = (DefaultMetadataImpl)fastjsonresponse;
                break;
            }
            mIndicatorSet.add(Integer.valueOf(i));
        }

        public final int describeContents()
        {
            return 0;
        }

        public final boolean equals(Object obj)
        {
            if (obj instanceof Urls) goto _L2; else goto _L1
_L1:
            return false;
_L2:
            Iterator iterator;
            if (this == obj)
            {
                return true;
            }
            obj = (Urls)obj;
            iterator = sFields.values().iterator();
_L5:
            com.google.android.gms.common.server.response.FastJsonResponse.Field field;
            if (!iterator.hasNext())
            {
                break MISSING_BLOCK_LABEL_96;
            }
            field = (com.google.android.gms.common.server.response.FastJsonResponse.Field)iterator.next();
            if (!isFieldSet(field))
            {
                continue; /* Loop/switch isn't completed */
            }
            if (!((Urls) (obj)).isFieldSet(field)) goto _L1; else goto _L3
_L3:
            if (getFieldValue(field).equals(((Urls) (obj)).getFieldValue(field))) goto _L5; else goto _L4
_L4:
            return false;
            if (!((Urls) (obj)).isFieldSet(field)) goto _L5; else goto _L6
_L6:
            return false;
            return true;
        }

        public final volatile Map getFieldMappings()
        {
            return sFields;
        }

        protected final Object getFieldValue(com.google.android.gms.common.server.response.FastJsonResponse.Field field)
        {
            switch (field.getSafeParcelableFieldId())
            {
            default:
                throw new IllegalStateException((new StringBuilder("Unknown safe parcelable id=")).append(field.getSafeParcelableFieldId()).toString());

            case 2: // '\002'
                return mFormattedType;

            case 3: // '\003'
                return mMetadata;

            case 4: // '\004'
                return mType;

            case 5: // '\005'
                return mValue;
            }
        }

        protected final Object getValueObject(String s)
        {
            return null;
        }

        public final int hashCode()
        {
            int i = 0;
            Iterator iterator = sFields.values().iterator();
            do
            {
                if (!iterator.hasNext())
                {
                    break;
                }
                com.google.android.gms.common.server.response.FastJsonResponse.Field field = (com.google.android.gms.common.server.response.FastJsonResponse.Field)iterator.next();
                if (isFieldSet(field))
                {
                    i = field.getSafeParcelableFieldId() + i + getFieldValue(field).hashCode();
                }
            } while (true);
            return i;
        }

        protected final boolean isFieldSet(com.google.android.gms.common.server.response.FastJsonResponse.Field field)
        {
            return mIndicatorSet.contains(Integer.valueOf(field.getSafeParcelableFieldId()));
        }

        protected final boolean isPrimitiveFieldSet(String s)
        {
            return false;
        }

        protected final void setStringInternal(com.google.android.gms.common.server.response.FastJsonResponse.Field field, String s, String s1)
        {
            int i = field.getSafeParcelableFieldId();
            i;
            JVM INSTR tableswitch 2 5: default 40
        //                       2 70
        //                       3 40
        //                       4 91
        //                       5 99;
               goto _L1 _L2 _L1 _L3 _L4
_L1:
            throw new IllegalArgumentException((new StringBuilder("Field with id=")).append(i).append(" is not known to be a String.").toString());
_L2:
            mFormattedType = s1;
_L6:
            mIndicatorSet.add(Integer.valueOf(i));
            return;
_L3:
            mType = s1;
            continue; /* Loop/switch isn't completed */
_L4:
            mValue = s1;
            if (true) goto _L6; else goto _L5
_L5:
        }

        public final void writeToParcel(Parcel parcel, int i)
        {
            DefaultPersonImpl_UrlsCreator.writeToParcel(this, parcel, i);
        }

        static 
        {
            HashMap hashmap = new HashMap();
            sFields = hashmap;
            hashmap.put("formattedType", com.google.android.gms.common.server.response.FastJsonResponse.Field.forString("formattedType", 2));
            sFields.put("metadata", com.google.android.gms.common.server.response.FastJsonResponse.Field.forConcreteType("metadata", 3, com/google/android/gms/people/identity/internal/models/DefaultMetadataImpl));
            sFields.put("type", com.google.android.gms.common.server.response.FastJsonResponse.Field.forString("type", 4));
            sFields.put("value", com.google.android.gms.common.server.response.FastJsonResponse.Field.forString("value", 5));
        }

        public Urls()
        {
            mVersionCode = 1;
            mIndicatorSet = new HashSet();
        }

        Urls(Set set, int i, String s, DefaultMetadataImpl defaultmetadataimpl, String s1, String s2)
        {
            mIndicatorSet = set;
            mVersionCode = i;
            mFormattedType = s;
            mMetadata = defaultmetadataimpl;
            mType = s1;
            mValue = s2;
        }
    }


    public static final DefaultPersonImplCreator CREATOR = new DefaultPersonImplCreator();
    private static final HashMap sFields;
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
    LegacyFields mLegacyFields;
    List mLinkedPeople;
    List mMemberships;
    Metadata mMetadata;
    List mNames;
    List mNicknames;
    List mOccupations;
    List mOrganizations;
    List mPhoneNumbers;
    List mPlacesLived;
    String mProfileUrl;
    List mRelations;
    List mRelationshipInterests;
    List mRelationshipStatuses;
    List mSkills;
    SortKeys mSortKeys;
    List mTaglines;
    List mUrls;
    final int mVersionCode;

    public DefaultPersonImpl()
    {
        mVersionCode = 1;
        mIndicatorSet = new HashSet();
    }

    DefaultPersonImpl(Set set, int i, List list, List list1, String s, List list2, List list3, 
            List list4, List list5, List list6, String s1, List list7, List list8, String s2, 
            List list9, List list10, String s3, LegacyFields legacyfields, List list11, List list12, Metadata metadata, 
            List list13, List list14, List list15, List list16, List list17, List list18, String s4, 
            List list19, List list20, List list21, List list22, SortKeys sortkeys, List list23, List list24)
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
        mLegacyFields = legacyfields;
        mLinkedPeople = list11;
        mMemberships = list12;
        mMetadata = metadata;
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
        mSortKeys = sortkeys;
        mTaglines = list23;
        mUrls = list24;
    }

    public final void addConcreteTypeArrayInternal(com.google.android.gms.common.server.response.FastJsonResponse.Field field, String s, ArrayList arraylist)
    {
        int i = field.getSafeParcelableFieldId();
        i;
        JVM INSTR tableswitch 2 35: default 160
    //                   2 208
    //                   3 229
    //                   4 160
    //                   5 237
    //                   6 245
    //                   7 253
    //                   8 261
    //                   9 269
    //                   10 160
    //                   11 277
    //                   12 285
    //                   13 160
    //                   14 293
    //                   15 301
    //                   16 160
    //                   17 160
    //                   18 160
    //                   19 309
    //                   20 317
    //                   21 160
    //                   22 325
    //                   23 333
    //                   24 341
    //                   25 349
    //                   26 357
    //                   27 365
    //                   28 160
    //                   29 373
    //                   30 381
    //                   31 389
    //                   32 397
    //                   33 160
    //                   34 405
    //                   35 413;
           goto _L1 _L2 _L3 _L1 _L4 _L5 _L6 _L7 _L8 _L1 _L9 _L10 _L1 _L11 _L12 _L1 _L1 _L1 _L13 _L14 _L1 _L15 _L16 _L17 _L18 _L19 _L20 _L1 _L21 _L22 _L23 _L24 _L1 _L25 _L26
_L1:
        throw new IllegalArgumentException((new StringBuilder("Field with id=")).append(i).append(" is not a known array of custom type.  Found ").append(arraylist.getClass().getCanonicalName()).append(".").toString());
_L2:
        mAbouts = arraylist;
_L28:
        mIndicatorSet.add(Integer.valueOf(i));
        return;
_L3:
        mAddresses = arraylist;
        continue; /* Loop/switch isn't completed */
_L4:
        mBirthdays = arraylist;
        continue; /* Loop/switch isn't completed */
_L5:
        mBraggingRights = arraylist;
        continue; /* Loop/switch isn't completed */
_L6:
        mCoverPhotos = arraylist;
        continue; /* Loop/switch isn't completed */
_L7:
        mCustomFields = arraylist;
        continue; /* Loop/switch isn't completed */
_L8:
        mEmails = arraylist;
        continue; /* Loop/switch isn't completed */
_L9:
        mEvents = arraylist;
        continue; /* Loop/switch isn't completed */
_L10:
        mGenders = arraylist;
        continue; /* Loop/switch isn't completed */
_L11:
        mImages = arraylist;
        continue; /* Loop/switch isn't completed */
_L12:
        mInstantMessaging = arraylist;
        continue; /* Loop/switch isn't completed */
_L13:
        mLinkedPeople = arraylist;
        continue; /* Loop/switch isn't completed */
_L14:
        mMemberships = arraylist;
        continue; /* Loop/switch isn't completed */
_L15:
        mNames = arraylist;
        continue; /* Loop/switch isn't completed */
_L16:
        mNicknames = arraylist;
        continue; /* Loop/switch isn't completed */
_L17:
        mOccupations = arraylist;
        continue; /* Loop/switch isn't completed */
_L18:
        mOrganizations = arraylist;
        continue; /* Loop/switch isn't completed */
_L19:
        mPhoneNumbers = arraylist;
        continue; /* Loop/switch isn't completed */
_L20:
        mPlacesLived = arraylist;
        continue; /* Loop/switch isn't completed */
_L21:
        mRelations = arraylist;
        continue; /* Loop/switch isn't completed */
_L22:
        mRelationshipInterests = arraylist;
        continue; /* Loop/switch isn't completed */
_L23:
        mRelationshipStatuses = arraylist;
        continue; /* Loop/switch isn't completed */
_L24:
        mSkills = arraylist;
        continue; /* Loop/switch isn't completed */
_L25:
        mTaglines = arraylist;
        continue; /* Loop/switch isn't completed */
_L26:
        mUrls = arraylist;
        if (true) goto _L28; else goto _L27
_L27:
    }

    public final void addConcreteTypeInternal(com.google.android.gms.common.server.response.FastJsonResponse.Field field, String s, FastJsonResponse fastjsonresponse)
    {
        int i = field.getSafeParcelableFieldId();
        i;
        JVM INSTR lookupswitch 3: default 44
    //                   18: 92
    //                   21: 116
    //                   33: 127;
           goto _L1 _L2 _L3 _L4
_L1:
        throw new IllegalArgumentException((new StringBuilder("Field with id=")).append(i).append(" is not a known custom type.  Found ").append(fastjsonresponse.getClass().getCanonicalName()).append(".").toString());
_L2:
        mLegacyFields = (LegacyFields)fastjsonresponse;
_L6:
        mIndicatorSet.add(Integer.valueOf(i));
        return;
_L3:
        mMetadata = (Metadata)fastjsonresponse;
        continue; /* Loop/switch isn't completed */
_L4:
        mSortKeys = (SortKeys)fastjsonresponse;
        if (true) goto _L6; else goto _L5
_L5:
    }

    public int describeContents()
    {
        return 0;
    }

    public boolean equals(Object obj)
    {
        if (obj instanceof DefaultPersonImpl) goto _L2; else goto _L1
_L1:
        return false;
_L2:
        Iterator iterator;
        if (this == obj)
        {
            return true;
        }
        obj = (DefaultPersonImpl)obj;
        iterator = sFields.values().iterator();
_L5:
        com.google.android.gms.common.server.response.FastJsonResponse.Field field;
        if (!iterator.hasNext())
        {
            break MISSING_BLOCK_LABEL_96;
        }
        field = (com.google.android.gms.common.server.response.FastJsonResponse.Field)iterator.next();
        if (!isFieldSet(field))
        {
            continue; /* Loop/switch isn't completed */
        }
        if (!((DefaultPersonImpl) (obj)).isFieldSet(field)) goto _L1; else goto _L3
_L3:
        if (getFieldValue(field).equals(((DefaultPersonImpl) (obj)).getFieldValue(field))) goto _L5; else goto _L4
_L4:
        return false;
        if (!((DefaultPersonImpl) (obj)).isFieldSet(field)) goto _L5; else goto _L6
_L6:
        return false;
        return true;
    }

    public final volatile Map getFieldMappings()
    {
        return sFields;
    }

    protected final Object getFieldValue(com.google.android.gms.common.server.response.FastJsonResponse.Field field)
    {
        switch (field.getSafeParcelableFieldId())
        {
        case 16: // '\020'
        default:
            throw new IllegalStateException((new StringBuilder("Unknown safe parcelable id=")).append(field.getSafeParcelableFieldId()).toString());

        case 2: // '\002'
            return mAbouts;

        case 3: // '\003'
            return mAddresses;

        case 4: // '\004'
            return mAgeRange;

        case 5: // '\005'
            return mBirthdays;

        case 6: // '\006'
            return mBraggingRights;

        case 7: // '\007'
            return mCoverPhotos;

        case 8: // '\b'
            return mCustomFields;

        case 9: // '\t'
            return mEmails;

        case 10: // '\n'
            return mEtag;

        case 11: // '\013'
            return mEvents;

        case 12: // '\f'
            return mGenders;

        case 13: // '\r'
            return mId;

        case 14: // '\016'
            return mImages;

        case 15: // '\017'
            return mInstantMessaging;

        case 17: // '\021'
            return mLanguage;

        case 18: // '\022'
            return mLegacyFields;

        case 19: // '\023'
            return mLinkedPeople;

        case 20: // '\024'
            return mMemberships;

        case 21: // '\025'
            return mMetadata;

        case 22: // '\026'
            return mNames;

        case 23: // '\027'
            return mNicknames;

        case 24: // '\030'
            return mOccupations;

        case 25: // '\031'
            return mOrganizations;

        case 26: // '\032'
            return mPhoneNumbers;

        case 27: // '\033'
            return mPlacesLived;

        case 28: // '\034'
            return mProfileUrl;

        case 29: // '\035'
            return mRelations;

        case 30: // '\036'
            return mRelationshipInterests;

        case 31: // '\037'
            return mRelationshipStatuses;

        case 32: // ' '
            return mSkills;

        case 33: // '!'
            return mSortKeys;

        case 34: // '"'
            return mTaglines;

        case 35: // '#'
            return mUrls;
        }
    }

    protected final Object getValueObject(String s)
    {
        return null;
    }

    public int hashCode()
    {
        int i = 0;
        Iterator iterator = sFields.values().iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            com.google.android.gms.common.server.response.FastJsonResponse.Field field = (com.google.android.gms.common.server.response.FastJsonResponse.Field)iterator.next();
            if (isFieldSet(field))
            {
                i = field.getSafeParcelableFieldId() + i + getFieldValue(field).hashCode();
            }
        } while (true);
        return i;
    }

    protected final boolean isFieldSet(com.google.android.gms.common.server.response.FastJsonResponse.Field field)
    {
        return mIndicatorSet.contains(Integer.valueOf(field.getSafeParcelableFieldId()));
    }

    protected final boolean isPrimitiveFieldSet(String s)
    {
        return false;
    }

    protected final void setStringInternal(com.google.android.gms.common.server.response.FastJsonResponse.Field field, String s, String s1)
    {
        int i = field.getSafeParcelableFieldId();
        i;
        JVM INSTR lookupswitch 5: default 60
    //                   4: 92
    //                   10: 113
    //                   13: 121
    //                   17: 129
    //                   28: 137;
           goto _L1 _L2 _L3 _L4 _L5 _L6
_L1:
        throw new IllegalArgumentException((new StringBuilder("Field with id=")).append(i).append(" is not known to be a String.").toString());
_L2:
        mAgeRange = s1;
_L8:
        mIndicatorSet.add(Integer.valueOf(i));
        return;
_L3:
        mEtag = s1;
        continue; /* Loop/switch isn't completed */
_L4:
        mId = s1;
        continue; /* Loop/switch isn't completed */
_L5:
        mLanguage = s1;
        continue; /* Loop/switch isn't completed */
_L6:
        mProfileUrl = s1;
        if (true) goto _L8; else goto _L7
_L7:
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        DefaultPersonImplCreator.writeToParcel(this, parcel, i);
    }

    static 
    {
        HashMap hashmap = new HashMap();
        sFields = hashmap;
        hashmap.put("abouts", com.google.android.gms.common.server.response.FastJsonResponse.Field.forConcreteTypeArray("abouts", 2, com/google/android/gms/people/identity/internal/models/DefaultPersonImpl$Abouts));
        sFields.put("addresses", com.google.android.gms.common.server.response.FastJsonResponse.Field.forConcreteTypeArray("addresses", 3, com/google/android/gms/people/identity/internal/models/DefaultPersonImpl$Addresses));
        sFields.put("ageRange", com.google.android.gms.common.server.response.FastJsonResponse.Field.forString("ageRange", 4));
        sFields.put("birthdays", com.google.android.gms.common.server.response.FastJsonResponse.Field.forConcreteTypeArray("birthdays", 5, com/google/android/gms/people/identity/internal/models/DefaultPersonImpl$Birthdays));
        sFields.put("braggingRights", com.google.android.gms.common.server.response.FastJsonResponse.Field.forConcreteTypeArray("braggingRights", 6, com/google/android/gms/people/identity/internal/models/DefaultPersonImpl$BraggingRights));
        sFields.put("coverPhotos", com.google.android.gms.common.server.response.FastJsonResponse.Field.forConcreteTypeArray("coverPhotos", 7, com/google/android/gms/people/identity/internal/models/DefaultPersonImpl$CoverPhotos));
        sFields.put("customFields", com.google.android.gms.common.server.response.FastJsonResponse.Field.forConcreteTypeArray("customFields", 8, com/google/android/gms/people/identity/internal/models/DefaultPersonImpl$CustomFields));
        sFields.put("emails", com.google.android.gms.common.server.response.FastJsonResponse.Field.forConcreteTypeArray("emails", 9, com/google/android/gms/people/identity/internal/models/DefaultPersonImpl$Emails));
        sFields.put("etag", com.google.android.gms.common.server.response.FastJsonResponse.Field.forString("etag", 10));
        sFields.put("events", com.google.android.gms.common.server.response.FastJsonResponse.Field.forConcreteTypeArray("events", 11, com/google/android/gms/people/identity/internal/models/DefaultPersonImpl$Events));
        sFields.put("genders", com.google.android.gms.common.server.response.FastJsonResponse.Field.forConcreteTypeArray("genders", 12, com/google/android/gms/people/identity/internal/models/DefaultPersonImpl$Genders));
        sFields.put("id", com.google.android.gms.common.server.response.FastJsonResponse.Field.forString("id", 13));
        sFields.put("images", com.google.android.gms.common.server.response.FastJsonResponse.Field.forConcreteTypeArray("images", 14, com/google/android/gms/people/identity/internal/models/DefaultPersonImpl$Images));
        sFields.put("instantMessaging", com.google.android.gms.common.server.response.FastJsonResponse.Field.forConcreteTypeArray("instantMessaging", 15, com/google/android/gms/people/identity/internal/models/DefaultPersonImpl$InstantMessaging));
        sFields.put("language", com.google.android.gms.common.server.response.FastJsonResponse.Field.forString("language", 17));
        sFields.put("legacyFields", com.google.android.gms.common.server.response.FastJsonResponse.Field.forConcreteType("legacyFields", 18, com/google/android/gms/people/identity/internal/models/DefaultPersonImpl$LegacyFields));
        sFields.put("linkedPeople", com.google.android.gms.common.server.response.FastJsonResponse.Field.forConcreteTypeArray("linkedPeople", 19, com/google/android/gms/people/identity/internal/models/DefaultPersonImpl));
        sFields.put("memberships", com.google.android.gms.common.server.response.FastJsonResponse.Field.forConcreteTypeArray("memberships", 20, com/google/android/gms/people/identity/internal/models/DefaultPersonImpl$Memberships));
        sFields.put("metadata", com.google.android.gms.common.server.response.FastJsonResponse.Field.forConcreteType("metadata", 21, com/google/android/gms/people/identity/internal/models/DefaultPersonImpl$Metadata));
        sFields.put("names", com.google.android.gms.common.server.response.FastJsonResponse.Field.forConcreteTypeArray("names", 22, com/google/android/gms/people/identity/internal/models/DefaultPersonImpl$Names));
        sFields.put("nicknames", com.google.android.gms.common.server.response.FastJsonResponse.Field.forConcreteTypeArray("nicknames", 23, com/google/android/gms/people/identity/internal/models/DefaultPersonImpl$Nicknames));
        sFields.put("occupations", com.google.android.gms.common.server.response.FastJsonResponse.Field.forConcreteTypeArray("occupations", 24, com/google/android/gms/people/identity/internal/models/DefaultPersonImpl$Occupations));
        sFields.put("organizations", com.google.android.gms.common.server.response.FastJsonResponse.Field.forConcreteTypeArray("organizations", 25, com/google/android/gms/people/identity/internal/models/DefaultPersonImpl$Organizations));
        sFields.put("phoneNumbers", com.google.android.gms.common.server.response.FastJsonResponse.Field.forConcreteTypeArray("phoneNumbers", 26, com/google/android/gms/people/identity/internal/models/DefaultPersonImpl$PhoneNumbers));
        sFields.put("placesLived", com.google.android.gms.common.server.response.FastJsonResponse.Field.forConcreteTypeArray("placesLived", 27, com/google/android/gms/people/identity/internal/models/DefaultPersonImpl$PlacesLived));
        sFields.put("profileUrl", com.google.android.gms.common.server.response.FastJsonResponse.Field.forString("profileUrl", 28));
        sFields.put("relations", com.google.android.gms.common.server.response.FastJsonResponse.Field.forConcreteTypeArray("relations", 29, com/google/android/gms/people/identity/internal/models/DefaultPersonImpl$Relations));
        sFields.put("relationshipInterests", com.google.android.gms.common.server.response.FastJsonResponse.Field.forConcreteTypeArray("relationshipInterests", 30, com/google/android/gms/people/identity/internal/models/DefaultPersonImpl$RelationshipInterests));
        sFields.put("relationshipStatuses", com.google.android.gms.common.server.response.FastJsonResponse.Field.forConcreteTypeArray("relationshipStatuses", 31, com/google/android/gms/people/identity/internal/models/DefaultPersonImpl$RelationshipStatuses));
        sFields.put("skills", com.google.android.gms.common.server.response.FastJsonResponse.Field.forConcreteTypeArray("skills", 32, com/google/android/gms/people/identity/internal/models/DefaultPersonImpl$Skills));
        sFields.put("sortKeys", com.google.android.gms.common.server.response.FastJsonResponse.Field.forConcreteType("sortKeys", 33, com/google/android/gms/people/identity/internal/models/DefaultPersonImpl$SortKeys));
        sFields.put("taglines", com.google.android.gms.common.server.response.FastJsonResponse.Field.forConcreteTypeArray("taglines", 34, com/google/android/gms/people/identity/internal/models/DefaultPersonImpl$Taglines));
        sFields.put("urls", com.google.android.gms.common.server.response.FastJsonResponse.Field.forConcreteTypeArray("urls", 35, com/google/android/gms/people/identity/internal/models/DefaultPersonImpl$Urls));
    }
}
