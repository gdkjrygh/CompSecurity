// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.plus.internal.model.people;

import android.os.Parcel;
import com.google.android.gms.common.server.converter.StringToIntConverter;
import com.google.android.gms.common.server.response.FastJsonResponse;
import com.google.android.gms.common.server.response.FastSafeParcelableJsonResponse;
import com.google.android.gms.plus.model.people.Person;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.google.android.gms.plus.internal.model.people:
//            PersonEntityCreator, PersonEntity_AgeRangeEntityCreator, PersonEntity_CoverEntityCreator, PersonEntity_CoverEntity_CoverInfoEntityCreator, 
//            PersonEntity_CoverEntity_CoverPhotoEntityCreator, PersonEntity_ImageEntityCreator, PersonEntity_NameEntityCreator, PersonEntity_OrganizationsEntityCreator, 
//            PersonEntity_PlacesLivedEntityCreator, PersonEntity_UrlsEntityCreator

public final class PersonEntity extends FastSafeParcelableJsonResponse
    implements Person
{
    public static final class AgeRangeEntity extends FastSafeParcelableJsonResponse
        implements com.google.android.gms.plus.model.people.Person.AgeRange
    {

        public static final PersonEntity_AgeRangeEntityCreator CREATOR = new PersonEntity_AgeRangeEntityCreator();
        private static final HashMap sFields;
        final Set mIndicatorSet;
        int mMax;
        int mMin;
        final int mVersionCode;

        public final int describeContents()
        {
            return 0;
        }

        public final boolean equals(Object obj)
        {
            if (obj instanceof AgeRangeEntity) goto _L2; else goto _L1
_L1:
            return false;
_L2:
            Iterator iterator;
            if (this == obj)
            {
                return true;
            }
            obj = (AgeRangeEntity)obj;
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
            if (!((AgeRangeEntity) (obj)).isFieldSet(field)) goto _L1; else goto _L3
_L3:
            if (getFieldValue(field).equals(((AgeRangeEntity) (obj)).getFieldValue(field))) goto _L5; else goto _L4
_L4:
            return false;
            if (!((AgeRangeEntity) (obj)).isFieldSet(field)) goto _L5; else goto _L6
_L6:
            return false;
            return true;
        }

        public final volatile Object freeze()
        {
            return this;
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
                return Integer.valueOf(mMax);

            case 3: // '\003'
                return Integer.valueOf(mMin);
            }
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

        public final boolean isDataValid()
        {
            return true;
        }

        protected final boolean isFieldSet(com.google.android.gms.common.server.response.FastJsonResponse.Field field)
        {
            return mIndicatorSet.contains(Integer.valueOf(field.getSafeParcelableFieldId()));
        }

        protected final void setIntegerInternal(com.google.android.gms.common.server.response.FastJsonResponse.Field field, String s, int i)
        {
            int j = field.getSafeParcelableFieldId();
            j;
            JVM INSTR tableswitch 2 3: default 32
        //                       2 62
        //                       3 83;
               goto _L1 _L2 _L3
_L1:
            throw new IllegalArgumentException((new StringBuilder("Field with id=")).append(j).append(" is not known to be an int.").toString());
_L2:
            mMax = i;
_L5:
            mIndicatorSet.add(Integer.valueOf(j));
            return;
_L3:
            mMin = i;
            if (true) goto _L5; else goto _L4
_L4:
        }

        public final void writeToParcel(Parcel parcel, int i)
        {
            PersonEntity_AgeRangeEntityCreator.writeToParcel$665c4158(this, parcel);
        }

        static 
        {
            HashMap hashmap = new HashMap();
            sFields = hashmap;
            hashmap.put("max", com.google.android.gms.common.server.response.FastJsonResponse.Field.forInteger("max", 2));
            sFields.put("min", com.google.android.gms.common.server.response.FastJsonResponse.Field.forInteger("min", 3));
        }

        public AgeRangeEntity()
        {
            mVersionCode = 1;
            mIndicatorSet = new HashSet();
        }

        AgeRangeEntity(Set set, int i, int j, int k)
        {
            mIndicatorSet = set;
            mVersionCode = i;
            mMax = j;
            mMin = k;
        }
    }

    public static final class CoverEntity extends FastSafeParcelableJsonResponse
        implements com.google.android.gms.plus.model.people.Person.Cover
    {

        public static final PersonEntity_CoverEntityCreator CREATOR = new PersonEntity_CoverEntityCreator();
        private static final HashMap sFields;
        CoverInfoEntity mCoverInfo;
        CoverPhotoEntity mCoverPhoto;
        final Set mIndicatorSet;
        int mLayout;
        final int mVersionCode;

        public final void addConcreteTypeInternal(com.google.android.gms.common.server.response.FastJsonResponse.Field field, String s, FastJsonResponse fastjsonresponse)
        {
            int i = field.getSafeParcelableFieldId();
            i;
            JVM INSTR tableswitch 2 3: default 32
        //                       2 77
        //                       3 101;
               goto _L1 _L2 _L3
_L1:
            throw new IllegalArgumentException((new StringBuilder("Field with id=")).append(i).append(" is not a known custom type.  Found ").append(fastjsonresponse.getClass().getCanonicalName()).append(".").toString());
_L2:
            mCoverInfo = (CoverInfoEntity)fastjsonresponse;
_L5:
            mIndicatorSet.add(Integer.valueOf(i));
            return;
_L3:
            mCoverPhoto = (CoverPhotoEntity)fastjsonresponse;
            if (true) goto _L5; else goto _L4
_L4:
        }

        public final int describeContents()
        {
            return 0;
        }

        public final boolean equals(Object obj)
        {
            if (obj instanceof CoverEntity) goto _L2; else goto _L1
_L1:
            return false;
_L2:
            Iterator iterator;
            if (this == obj)
            {
                return true;
            }
            obj = (CoverEntity)obj;
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
            if (!((CoverEntity) (obj)).isFieldSet(field)) goto _L1; else goto _L3
_L3:
            if (getFieldValue(field).equals(((CoverEntity) (obj)).getFieldValue(field))) goto _L5; else goto _L4
_L4:
            return false;
            if (!((CoverEntity) (obj)).isFieldSet(field)) goto _L5; else goto _L6
_L6:
            return false;
            return true;
        }

        public final volatile Object freeze()
        {
            return this;
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
                return mCoverInfo;

            case 3: // '\003'
                return mCoverPhoto;

            case 4: // '\004'
                return Integer.valueOf(mLayout);
            }
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

        public final boolean isDataValid()
        {
            return true;
        }

        protected final boolean isFieldSet(com.google.android.gms.common.server.response.FastJsonResponse.Field field)
        {
            return mIndicatorSet.contains(Integer.valueOf(field.getSafeParcelableFieldId()));
        }

        protected final void setIntegerInternal(com.google.android.gms.common.server.response.FastJsonResponse.Field field, String s, int i)
        {
            int j = field.getSafeParcelableFieldId();
            switch (j)
            {
            default:
                throw new IllegalArgumentException((new StringBuilder("Field with id=")).append(j).append(" is not known to be an int.").toString());

            case 4: // '\004'
                mLayout = i;
                break;
            }
            mIndicatorSet.add(Integer.valueOf(j));
        }

        public final void writeToParcel(Parcel parcel, int i)
        {
            PersonEntity_CoverEntityCreator.writeToParcel(this, parcel, i);
        }

        static 
        {
            HashMap hashmap = new HashMap();
            sFields = hashmap;
            hashmap.put("coverInfo", com.google.android.gms.common.server.response.FastJsonResponse.Field.forConcreteType("coverInfo", 2, com/google/android/gms/plus/internal/model/people/PersonEntity$CoverEntity$CoverInfoEntity));
            sFields.put("coverPhoto", com.google.android.gms.common.server.response.FastJsonResponse.Field.forConcreteType("coverPhoto", 3, com/google/android/gms/plus/internal/model/people/PersonEntity$CoverEntity$CoverPhotoEntity));
            sFields.put("layout", com.google.android.gms.common.server.response.FastJsonResponse.Field.withConverter("layout", 4, (new StringToIntConverter()).add("banner", 0), false));
        }

        public CoverEntity()
        {
            mVersionCode = 1;
            mIndicatorSet = new HashSet();
        }

        CoverEntity(Set set, int i, CoverInfoEntity coverinfoentity, CoverPhotoEntity coverphotoentity, int j)
        {
            mIndicatorSet = set;
            mVersionCode = i;
            mCoverInfo = coverinfoentity;
            mCoverPhoto = coverphotoentity;
            mLayout = j;
        }
    }

    public static final class CoverEntity.CoverInfoEntity extends FastSafeParcelableJsonResponse
        implements com.google.android.gms.plus.model.people.Person.Cover.CoverInfo
    {

        public static final PersonEntity_CoverEntity_CoverInfoEntityCreator CREATOR = new PersonEntity_CoverEntity_CoverInfoEntityCreator();
        private static final HashMap sFields;
        final Set mIndicatorSet;
        int mLeftImageOffset;
        int mTopImageOffset;
        final int mVersionCode;

        public final int describeContents()
        {
            return 0;
        }

        public final boolean equals(Object obj)
        {
            if (obj instanceof CoverEntity.CoverInfoEntity) goto _L2; else goto _L1
_L1:
            return false;
_L2:
            Iterator iterator;
            if (this == obj)
            {
                return true;
            }
            obj = (CoverEntity.CoverInfoEntity)obj;
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
            if (!((CoverEntity.CoverInfoEntity) (obj)).isFieldSet(field)) goto _L1; else goto _L3
_L3:
            if (getFieldValue(field).equals(((CoverEntity.CoverInfoEntity) (obj)).getFieldValue(field))) goto _L5; else goto _L4
_L4:
            return false;
            if (!((CoverEntity.CoverInfoEntity) (obj)).isFieldSet(field)) goto _L5; else goto _L6
_L6:
            return false;
            return true;
        }

        public final volatile Object freeze()
        {
            return this;
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
                return Integer.valueOf(mLeftImageOffset);

            case 3: // '\003'
                return Integer.valueOf(mTopImageOffset);
            }
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

        public final boolean isDataValid()
        {
            return true;
        }

        protected final boolean isFieldSet(com.google.android.gms.common.server.response.FastJsonResponse.Field field)
        {
            return mIndicatorSet.contains(Integer.valueOf(field.getSafeParcelableFieldId()));
        }

        protected final void setIntegerInternal(com.google.android.gms.common.server.response.FastJsonResponse.Field field, String s, int i)
        {
            int j = field.getSafeParcelableFieldId();
            j;
            JVM INSTR tableswitch 2 3: default 32
        //                       2 62
        //                       3 83;
               goto _L1 _L2 _L3
_L1:
            throw new IllegalArgumentException((new StringBuilder("Field with id=")).append(j).append(" is not known to be an int.").toString());
_L2:
            mLeftImageOffset = i;
_L5:
            mIndicatorSet.add(Integer.valueOf(j));
            return;
_L3:
            mTopImageOffset = i;
            if (true) goto _L5; else goto _L4
_L4:
        }

        public final void writeToParcel(Parcel parcel, int i)
        {
            PersonEntity_CoverEntity_CoverInfoEntityCreator.writeToParcel$52cdfcab(this, parcel);
        }

        static 
        {
            HashMap hashmap = new HashMap();
            sFields = hashmap;
            hashmap.put("leftImageOffset", com.google.android.gms.common.server.response.FastJsonResponse.Field.forInteger("leftImageOffset", 2));
            sFields.put("topImageOffset", com.google.android.gms.common.server.response.FastJsonResponse.Field.forInteger("topImageOffset", 3));
        }

        public CoverEntity.CoverInfoEntity()
        {
            mVersionCode = 1;
            mIndicatorSet = new HashSet();
        }

        CoverEntity.CoverInfoEntity(Set set, int i, int j, int k)
        {
            mIndicatorSet = set;
            mVersionCode = i;
            mLeftImageOffset = j;
            mTopImageOffset = k;
        }
    }

    public static final class CoverEntity.CoverPhotoEntity extends FastSafeParcelableJsonResponse
        implements com.google.android.gms.plus.model.people.Person.Cover.CoverPhoto
    {

        public static final PersonEntity_CoverEntity_CoverPhotoEntityCreator CREATOR = new PersonEntity_CoverEntity_CoverPhotoEntityCreator();
        private static final HashMap sFields;
        int mHeight;
        final Set mIndicatorSet;
        String mUrl;
        final int mVersionCode;
        int mWidth;

        public final int describeContents()
        {
            return 0;
        }

        public final boolean equals(Object obj)
        {
            if (obj instanceof CoverEntity.CoverPhotoEntity) goto _L2; else goto _L1
_L1:
            return false;
_L2:
            Iterator iterator;
            if (this == obj)
            {
                return true;
            }
            obj = (CoverEntity.CoverPhotoEntity)obj;
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
            if (!((CoverEntity.CoverPhotoEntity) (obj)).isFieldSet(field)) goto _L1; else goto _L3
_L3:
            if (getFieldValue(field).equals(((CoverEntity.CoverPhotoEntity) (obj)).getFieldValue(field))) goto _L5; else goto _L4
_L4:
            return false;
            if (!((CoverEntity.CoverPhotoEntity) (obj)).isFieldSet(field)) goto _L5; else goto _L6
_L6:
            return false;
            return true;
        }

        public final volatile Object freeze()
        {
            return this;
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
                return mUrl;

            case 4: // '\004'
                return Integer.valueOf(mWidth);
            }
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

        public final boolean isDataValid()
        {
            return true;
        }

        protected final boolean isFieldSet(com.google.android.gms.common.server.response.FastJsonResponse.Field field)
        {
            return mIndicatorSet.contains(Integer.valueOf(field.getSafeParcelableFieldId()));
        }

        protected final void setIntegerInternal(com.google.android.gms.common.server.response.FastJsonResponse.Field field, String s, int i)
        {
            int j = field.getSafeParcelableFieldId();
            j;
            JVM INSTR tableswitch 2 4: default 36
        //                       2 66
        //                       3 36
        //                       4 87;
               goto _L1 _L2 _L1 _L3
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
            switch (i)
            {
            default:
                throw new IllegalArgumentException((new StringBuilder("Field with id=")).append(i).append(" is not known to be a String.").toString());

            case 3: // '\003'
                mUrl = s1;
                break;
            }
            mIndicatorSet.add(Integer.valueOf(i));
        }

        public final void writeToParcel(Parcel parcel, int i)
        {
            PersonEntity_CoverEntity_CoverPhotoEntityCreator.writeToParcel$342dbb01(this, parcel);
        }

        static 
        {
            HashMap hashmap = new HashMap();
            sFields = hashmap;
            hashmap.put("height", com.google.android.gms.common.server.response.FastJsonResponse.Field.forInteger("height", 2));
            sFields.put("url", com.google.android.gms.common.server.response.FastJsonResponse.Field.forString("url", 3));
            sFields.put("width", com.google.android.gms.common.server.response.FastJsonResponse.Field.forInteger("width", 4));
        }

        public CoverEntity.CoverPhotoEntity()
        {
            mVersionCode = 1;
            mIndicatorSet = new HashSet();
        }

        CoverEntity.CoverPhotoEntity(Set set, int i, int j, String s, int k)
        {
            mIndicatorSet = set;
            mVersionCode = i;
            mHeight = j;
            mUrl = s;
            mWidth = k;
        }
    }

    public static final class ImageEntity extends FastSafeParcelableJsonResponse
        implements com.google.android.gms.plus.model.people.Person.Image
    {

        public static final PersonEntity_ImageEntityCreator CREATOR = new PersonEntity_ImageEntityCreator();
        private static final HashMap sFields;
        final Set mIndicatorSet;
        String mUrl;
        final int mVersionCode;

        public final int describeContents()
        {
            return 0;
        }

        public final boolean equals(Object obj)
        {
            if (obj instanceof ImageEntity) goto _L2; else goto _L1
_L1:
            return false;
_L2:
            Iterator iterator;
            if (this == obj)
            {
                return true;
            }
            obj = (ImageEntity)obj;
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
            if (!((ImageEntity) (obj)).isFieldSet(field)) goto _L1; else goto _L3
_L3:
            if (getFieldValue(field).equals(((ImageEntity) (obj)).getFieldValue(field))) goto _L5; else goto _L4
_L4:
            return false;
            if (!((ImageEntity) (obj)).isFieldSet(field)) goto _L5; else goto _L6
_L6:
            return false;
            return true;
        }

        public final volatile Object freeze()
        {
            return this;
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
                return mUrl;
            }
        }

        public final String getUrl()
        {
            return mUrl;
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

        public final boolean isDataValid()
        {
            return true;
        }

        protected final boolean isFieldSet(com.google.android.gms.common.server.response.FastJsonResponse.Field field)
        {
            return mIndicatorSet.contains(Integer.valueOf(field.getSafeParcelableFieldId()));
        }

        protected final void setStringInternal(com.google.android.gms.common.server.response.FastJsonResponse.Field field, String s, String s1)
        {
            int i = field.getSafeParcelableFieldId();
            switch (i)
            {
            default:
                throw new IllegalArgumentException((new StringBuilder("Field with id=")).append(i).append(" is not known to be a String.").toString());

            case 2: // '\002'
                mUrl = s1;
                break;
            }
            mIndicatorSet.add(Integer.valueOf(i));
        }

        public final void writeToParcel(Parcel parcel, int i)
        {
            PersonEntity_ImageEntityCreator.writeToParcel$7aba4735(this, parcel);
        }

        static 
        {
            HashMap hashmap = new HashMap();
            sFields = hashmap;
            hashmap.put("url", com.google.android.gms.common.server.response.FastJsonResponse.Field.forString("url", 2));
        }

        public ImageEntity()
        {
            mVersionCode = 1;
            mIndicatorSet = new HashSet();
        }

        ImageEntity(Set set, int i, String s)
        {
            mIndicatorSet = set;
            mVersionCode = i;
            mUrl = s;
        }
    }

    public static final class NameEntity extends FastSafeParcelableJsonResponse
        implements com.google.android.gms.plus.model.people.Person.Name
    {

        public static final PersonEntity_NameEntityCreator CREATOR = new PersonEntity_NameEntityCreator();
        private static final HashMap sFields;
        String mFamilyName;
        String mFormatted;
        String mGivenName;
        String mHonorificPrefix;
        String mHonorificSuffix;
        final Set mIndicatorSet;
        String mMiddleName;
        final int mVersionCode;

        public final int describeContents()
        {
            return 0;
        }

        public final boolean equals(Object obj)
        {
            if (obj instanceof NameEntity) goto _L2; else goto _L1
_L1:
            return false;
_L2:
            Iterator iterator;
            if (this == obj)
            {
                return true;
            }
            obj = (NameEntity)obj;
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
            if (!((NameEntity) (obj)).isFieldSet(field)) goto _L1; else goto _L3
_L3:
            if (getFieldValue(field).equals(((NameEntity) (obj)).getFieldValue(field))) goto _L5; else goto _L4
_L4:
            return false;
            if (!((NameEntity) (obj)).isFieldSet(field)) goto _L5; else goto _L6
_L6:
            return false;
            return true;
        }

        public final volatile Object freeze()
        {
            return this;
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
                return mFamilyName;

            case 3: // '\003'
                return mFormatted;

            case 4: // '\004'
                return mGivenName;

            case 5: // '\005'
                return mHonorificPrefix;

            case 6: // '\006'
                return mHonorificSuffix;

            case 7: // '\007'
                return mMiddleName;
            }
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

        public final boolean isDataValid()
        {
            return true;
        }

        protected final boolean isFieldSet(com.google.android.gms.common.server.response.FastJsonResponse.Field field)
        {
            return mIndicatorSet.contains(Integer.valueOf(field.getSafeParcelableFieldId()));
        }

        protected final void setStringInternal(com.google.android.gms.common.server.response.FastJsonResponse.Field field, String s, String s1)
        {
            int i = field.getSafeParcelableFieldId();
            i;
            JVM INSTR tableswitch 2 7: default 48
        //                       2 78
        //                       3 99
        //                       4 107
        //                       5 115
        //                       6 123
        //                       7 131;
               goto _L1 _L2 _L3 _L4 _L5 _L6 _L7
_L1:
            throw new IllegalArgumentException((new StringBuilder("Field with id=")).append(i).append(" is not known to be a String.").toString());
_L2:
            mFamilyName = s1;
_L9:
            mIndicatorSet.add(Integer.valueOf(i));
            return;
_L3:
            mFormatted = s1;
            continue; /* Loop/switch isn't completed */
_L4:
            mGivenName = s1;
            continue; /* Loop/switch isn't completed */
_L5:
            mHonorificPrefix = s1;
            continue; /* Loop/switch isn't completed */
_L6:
            mHonorificSuffix = s1;
            continue; /* Loop/switch isn't completed */
_L7:
            mMiddleName = s1;
            if (true) goto _L9; else goto _L8
_L8:
        }

        public final void writeToParcel(Parcel parcel, int i)
        {
            PersonEntity_NameEntityCreator.writeToParcel$65812fc5(this, parcel);
        }

        static 
        {
            HashMap hashmap = new HashMap();
            sFields = hashmap;
            hashmap.put("familyName", com.google.android.gms.common.server.response.FastJsonResponse.Field.forString("familyName", 2));
            sFields.put("formatted", com.google.android.gms.common.server.response.FastJsonResponse.Field.forString("formatted", 3));
            sFields.put("givenName", com.google.android.gms.common.server.response.FastJsonResponse.Field.forString("givenName", 4));
            sFields.put("honorificPrefix", com.google.android.gms.common.server.response.FastJsonResponse.Field.forString("honorificPrefix", 5));
            sFields.put("honorificSuffix", com.google.android.gms.common.server.response.FastJsonResponse.Field.forString("honorificSuffix", 6));
            sFields.put("middleName", com.google.android.gms.common.server.response.FastJsonResponse.Field.forString("middleName", 7));
        }

        public NameEntity()
        {
            mVersionCode = 1;
            mIndicatorSet = new HashSet();
        }

        NameEntity(Set set, int i, String s, String s1, String s2, String s3, String s4, 
                String s5)
        {
            mIndicatorSet = set;
            mVersionCode = i;
            mFamilyName = s;
            mFormatted = s1;
            mGivenName = s2;
            mHonorificPrefix = s3;
            mHonorificSuffix = s4;
            mMiddleName = s5;
        }
    }

    public static final class OrganizationsEntity extends FastSafeParcelableJsonResponse
        implements com.google.android.gms.plus.model.people.Person.Organizations
    {

        public static final PersonEntity_OrganizationsEntityCreator CREATOR = new PersonEntity_OrganizationsEntityCreator();
        private static final HashMap sFields;
        String mDepartment;
        String mDescription;
        String mEndDate;
        final Set mIndicatorSet;
        String mLocation;
        String mName;
        boolean mPrimary;
        String mStartDate;
        String mTitle;
        int mType;
        final int mVersionCode;

        public final int describeContents()
        {
            return 0;
        }

        public final boolean equals(Object obj)
        {
            if (obj instanceof OrganizationsEntity) goto _L2; else goto _L1
_L1:
            return false;
_L2:
            Iterator iterator;
            if (this == obj)
            {
                return true;
            }
            obj = (OrganizationsEntity)obj;
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
            if (!((OrganizationsEntity) (obj)).isFieldSet(field)) goto _L1; else goto _L3
_L3:
            if (getFieldValue(field).equals(((OrganizationsEntity) (obj)).getFieldValue(field))) goto _L5; else goto _L4
_L4:
            return false;
            if (!((OrganizationsEntity) (obj)).isFieldSet(field)) goto _L5; else goto _L6
_L6:
            return false;
            return true;
        }

        public final volatile Object freeze()
        {
            return this;
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
                return mDepartment;

            case 3: // '\003'
                return mDescription;

            case 4: // '\004'
                return mEndDate;

            case 5: // '\005'
                return mLocation;

            case 6: // '\006'
                return mName;

            case 7: // '\007'
                return Boolean.valueOf(mPrimary);

            case 8: // '\b'
                return mStartDate;

            case 9: // '\t'
                return mTitle;

            case 10: // '\n'
                return Integer.valueOf(mType);
            }
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

        public final boolean isDataValid()
        {
            return true;
        }

        protected final boolean isFieldSet(com.google.android.gms.common.server.response.FastJsonResponse.Field field)
        {
            return mIndicatorSet.contains(Integer.valueOf(field.getSafeParcelableFieldId()));
        }

        protected final void setBooleanInternal(com.google.android.gms.common.server.response.FastJsonResponse.Field field, String s, boolean flag)
        {
            int i = field.getSafeParcelableFieldId();
            switch (i)
            {
            default:
                throw new IllegalArgumentException((new StringBuilder("Field with id=")).append(i).append(" is not known to be a boolean.").toString());

            case 7: // '\007'
                mPrimary = flag;
                break;
            }
            mIndicatorSet.add(Integer.valueOf(i));
        }

        protected final void setIntegerInternal(com.google.android.gms.common.server.response.FastJsonResponse.Field field, String s, int i)
        {
            int j = field.getSafeParcelableFieldId();
            switch (j)
            {
            default:
                throw new IllegalArgumentException((new StringBuilder("Field with id=")).append(j).append(" is not known to be an int.").toString());

            case 10: // '\n'
                mType = i;
                break;
            }
            mIndicatorSet.add(Integer.valueOf(j));
        }

        protected final void setStringInternal(com.google.android.gms.common.server.response.FastJsonResponse.Field field, String s, String s1)
        {
            int i = field.getSafeParcelableFieldId();
            i;
            JVM INSTR tableswitch 2 9: default 56
        //                       2 86
        //                       3 107
        //                       4 115
        //                       5 123
        //                       6 131
        //                       7 56
        //                       8 139
        //                       9 147;
               goto _L1 _L2 _L3 _L4 _L5 _L6 _L1 _L7 _L8
_L1:
            throw new IllegalArgumentException((new StringBuilder("Field with id=")).append(i).append(" is not known to be a String.").toString());
_L2:
            mDepartment = s1;
_L10:
            mIndicatorSet.add(Integer.valueOf(i));
            return;
_L3:
            mDescription = s1;
            continue; /* Loop/switch isn't completed */
_L4:
            mEndDate = s1;
            continue; /* Loop/switch isn't completed */
_L5:
            mLocation = s1;
            continue; /* Loop/switch isn't completed */
_L6:
            mName = s1;
            continue; /* Loop/switch isn't completed */
_L7:
            mStartDate = s1;
            continue; /* Loop/switch isn't completed */
_L8:
            mTitle = s1;
            if (true) goto _L10; else goto _L9
_L9:
        }

        public final void writeToParcel(Parcel parcel, int i)
        {
            PersonEntity_OrganizationsEntityCreator.writeToParcel$1290ebf0(this, parcel);
        }

        static 
        {
            HashMap hashmap = new HashMap();
            sFields = hashmap;
            hashmap.put("department", com.google.android.gms.common.server.response.FastJsonResponse.Field.forString("department", 2));
            sFields.put("description", com.google.android.gms.common.server.response.FastJsonResponse.Field.forString("description", 3));
            sFields.put("endDate", com.google.android.gms.common.server.response.FastJsonResponse.Field.forString("endDate", 4));
            sFields.put("location", com.google.android.gms.common.server.response.FastJsonResponse.Field.forString("location", 5));
            sFields.put("name", com.google.android.gms.common.server.response.FastJsonResponse.Field.forString("name", 6));
            sFields.put("primary", com.google.android.gms.common.server.response.FastJsonResponse.Field.forBoolean("primary", 7));
            sFields.put("startDate", com.google.android.gms.common.server.response.FastJsonResponse.Field.forString("startDate", 8));
            sFields.put("title", com.google.android.gms.common.server.response.FastJsonResponse.Field.forString("title", 9));
            sFields.put("type", com.google.android.gms.common.server.response.FastJsonResponse.Field.withConverter("type", 10, (new StringToIntConverter()).add("work", 0).add("school", 1), false));
        }

        public OrganizationsEntity()
        {
            mVersionCode = 1;
            mIndicatorSet = new HashSet();
        }

        OrganizationsEntity(Set set, int i, String s, String s1, String s2, String s3, String s4, 
                boolean flag, String s5, String s6, int j)
        {
            mIndicatorSet = set;
            mVersionCode = i;
            mDepartment = s;
            mDescription = s1;
            mEndDate = s2;
            mLocation = s3;
            mName = s4;
            mPrimary = flag;
            mStartDate = s5;
            mTitle = s6;
            mType = j;
        }
    }

    public static final class PlacesLivedEntity extends FastSafeParcelableJsonResponse
        implements com.google.android.gms.plus.model.people.Person.PlacesLived
    {

        public static final PersonEntity_PlacesLivedEntityCreator CREATOR = new PersonEntity_PlacesLivedEntityCreator();
        private static final HashMap sFields;
        final Set mIndicatorSet;
        boolean mPrimary;
        String mValue;
        final int mVersionCode;

        public final int describeContents()
        {
            return 0;
        }

        public final boolean equals(Object obj)
        {
            if (obj instanceof PlacesLivedEntity) goto _L2; else goto _L1
_L1:
            return false;
_L2:
            Iterator iterator;
            if (this == obj)
            {
                return true;
            }
            obj = (PlacesLivedEntity)obj;
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
            if (!((PlacesLivedEntity) (obj)).isFieldSet(field)) goto _L1; else goto _L3
_L3:
            if (getFieldValue(field).equals(((PlacesLivedEntity) (obj)).getFieldValue(field))) goto _L5; else goto _L4
_L4:
            return false;
            if (!((PlacesLivedEntity) (obj)).isFieldSet(field)) goto _L5; else goto _L6
_L6:
            return false;
            return true;
        }

        public final volatile Object freeze()
        {
            return this;
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
                return Boolean.valueOf(mPrimary);

            case 3: // '\003'
                return mValue;
            }
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

        public final boolean isDataValid()
        {
            return true;
        }

        protected final boolean isFieldSet(com.google.android.gms.common.server.response.FastJsonResponse.Field field)
        {
            return mIndicatorSet.contains(Integer.valueOf(field.getSafeParcelableFieldId()));
        }

        protected final void setBooleanInternal(com.google.android.gms.common.server.response.FastJsonResponse.Field field, String s, boolean flag)
        {
            int i = field.getSafeParcelableFieldId();
            switch (i)
            {
            default:
                throw new IllegalArgumentException((new StringBuilder("Field with id=")).append(i).append(" is not known to be a boolean.").toString());

            case 2: // '\002'
                mPrimary = flag;
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

            case 3: // '\003'
                mValue = s1;
                break;
            }
            mIndicatorSet.add(Integer.valueOf(i));
        }

        public final void writeToParcel(Parcel parcel, int i)
        {
            PersonEntity_PlacesLivedEntityCreator.writeToParcel$2d65ad9c(this, parcel);
        }

        static 
        {
            HashMap hashmap = new HashMap();
            sFields = hashmap;
            hashmap.put("primary", com.google.android.gms.common.server.response.FastJsonResponse.Field.forBoolean("primary", 2));
            sFields.put("value", com.google.android.gms.common.server.response.FastJsonResponse.Field.forString("value", 3));
        }

        public PlacesLivedEntity()
        {
            mVersionCode = 1;
            mIndicatorSet = new HashSet();
        }

        PlacesLivedEntity(Set set, int i, boolean flag, String s)
        {
            mIndicatorSet = set;
            mVersionCode = i;
            mPrimary = flag;
            mValue = s;
        }
    }

    public static final class UrlsEntity extends FastSafeParcelableJsonResponse
        implements com.google.android.gms.plus.model.people.Person.Urls
    {

        public static final PersonEntity_UrlsEntityCreator CREATOR = new PersonEntity_UrlsEntityCreator();
        private static final HashMap sFields;
        final Set mIndicatorSet;
        String mLabel;
        int mType;
        private final int mType_DEPRECATED_FENACHO;
        String mValue;
        final int mVersionCode;

        public static int getType_DEPRECATED_FENACHO()
        {
            return 4;
        }

        public final int describeContents()
        {
            return 0;
        }

        public final boolean equals(Object obj)
        {
            if (obj instanceof UrlsEntity) goto _L2; else goto _L1
_L1:
            return false;
_L2:
            Iterator iterator;
            if (this == obj)
            {
                return true;
            }
            obj = (UrlsEntity)obj;
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
            if (!((UrlsEntity) (obj)).isFieldSet(field)) goto _L1; else goto _L3
_L3:
            if (getFieldValue(field).equals(((UrlsEntity) (obj)).getFieldValue(field))) goto _L5; else goto _L4
_L4:
            return false;
            if (!((UrlsEntity) (obj)).isFieldSet(field)) goto _L5; else goto _L6
_L6:
            return false;
            return true;
        }

        public final volatile Object freeze()
        {
            return this;
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

            case 5: // '\005'
                return mLabel;

            case 6: // '\006'
                return Integer.valueOf(mType);

            case 4: // '\004'
                return mValue;
            }
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

        public final boolean isDataValid()
        {
            return true;
        }

        protected final boolean isFieldSet(com.google.android.gms.common.server.response.FastJsonResponse.Field field)
        {
            return mIndicatorSet.contains(Integer.valueOf(field.getSafeParcelableFieldId()));
        }

        protected final void setIntegerInternal(com.google.android.gms.common.server.response.FastJsonResponse.Field field, String s, int i)
        {
            int j = field.getSafeParcelableFieldId();
            switch (j)
            {
            default:
                throw new IllegalArgumentException((new StringBuilder("Field with id=")).append(j).append(" is not known to be an int.").toString());

            case 6: // '\006'
                mType = i;
                break;
            }
            mIndicatorSet.add(Integer.valueOf(j));
        }

        protected final void setStringInternal(com.google.android.gms.common.server.response.FastJsonResponse.Field field, String s, String s1)
        {
            int i = field.getSafeParcelableFieldId();
            i;
            JVM INSTR tableswitch 4 5: default 32
        //                       4 83
        //                       5 62;
               goto _L1 _L2 _L3
_L1:
            throw new IllegalArgumentException((new StringBuilder("Field with id=")).append(i).append(" is not known to be a String.").toString());
_L3:
            mLabel = s1;
_L5:
            mIndicatorSet.add(Integer.valueOf(i));
            return;
_L2:
            mValue = s1;
            if (true) goto _L5; else goto _L4
_L4:
        }

        public final void writeToParcel(Parcel parcel, int i)
        {
            PersonEntity_UrlsEntityCreator.writeToParcel$b21cc82(this, parcel);
        }

        static 
        {
            HashMap hashmap = new HashMap();
            sFields = hashmap;
            hashmap.put("label", com.google.android.gms.common.server.response.FastJsonResponse.Field.forString("label", 5));
            sFields.put("type", com.google.android.gms.common.server.response.FastJsonResponse.Field.withConverter("type", 6, (new StringToIntConverter()).add("home", 0).add("work", 1).add("blog", 2).add("profile", 3).add("other", 4).add("otherProfile", 5).add("contributor", 6).add("website", 7), false));
            sFields.put("value", com.google.android.gms.common.server.response.FastJsonResponse.Field.forString("value", 4));
        }

        public UrlsEntity()
        {
            mType_DEPRECATED_FENACHO = 4;
            mVersionCode = 1;
            mIndicatorSet = new HashSet();
        }

        UrlsEntity(Set set, int i, String s, int j, String s1)
        {
            mType_DEPRECATED_FENACHO = 4;
            mIndicatorSet = set;
            mVersionCode = i;
            mLabel = s;
            mType = j;
            mValue = s1;
        }
    }


    public static final PersonEntityCreator CREATOR = new PersonEntityCreator();
    private static final HashMap sFields;
    String mAboutMe;
    AgeRangeEntity mAgeRange;
    String mBirthday;
    String mBraggingRights;
    int mCircledByCount;
    CoverEntity mCover;
    String mCurrentLocation;
    String mDisplayName;
    int mGender;
    String mId;
    ImageEntity mImage;
    final Set mIndicatorSet;
    boolean mIsPlusUser;
    String mLanguage;
    NameEntity mName;
    String mNickname;
    int mObjectType;
    List mOrganizations;
    List mPlacesLived;
    int mPlusOneCount;
    int mRelationshipStatus;
    String mTagline;
    String mUrl;
    List mUrls;
    boolean mVerified;
    final int mVersionCode;

    public PersonEntity()
    {
        mVersionCode = 1;
        mIndicatorSet = new HashSet();
    }

    PersonEntity(Set set, int i, String s, AgeRangeEntity agerangeentity, String s1, String s2, int j, 
            CoverEntity coverentity, String s3, String s4, int k, String s5, ImageEntity imageentity, boolean flag, 
            String s6, NameEntity nameentity, String s7, int l, List list, List list1, int i1, 
            int j1, String s8, String s9, List list2, boolean flag1)
    {
        mIndicatorSet = set;
        mVersionCode = i;
        mAboutMe = s;
        mAgeRange = agerangeentity;
        mBirthday = s1;
        mBraggingRights = s2;
        mCircledByCount = j;
        mCover = coverentity;
        mCurrentLocation = s3;
        mDisplayName = s4;
        mGender = k;
        mId = s5;
        mImage = imageentity;
        mIsPlusUser = flag;
        mLanguage = s6;
        mName = nameentity;
        mNickname = s7;
        mObjectType = l;
        mOrganizations = list;
        mPlacesLived = list1;
        mPlusOneCount = i1;
        mRelationshipStatus = j1;
        mTagline = s8;
        mUrl = s9;
        mUrls = list2;
        mVerified = flag1;
    }

    public final void addConcreteTypeArrayInternal(com.google.android.gms.common.server.response.FastJsonResponse.Field field, String s, ArrayList arraylist)
    {
        int i = field.getSafeParcelableFieldId();
        i;
        JVM INSTR lookupswitch 3: default 44
    //                   22: 92
    //                   23: 113
    //                   28: 121;
           goto _L1 _L2 _L3 _L4
_L1:
        throw new IllegalArgumentException((new StringBuilder("Field with id=")).append(i).append(" is not a known array of custom type.  Found ").append(arraylist.getClass().getCanonicalName()).append(".").toString());
_L2:
        mOrganizations = arraylist;
_L6:
        mIndicatorSet.add(Integer.valueOf(i));
        return;
_L3:
        mPlacesLived = arraylist;
        continue; /* Loop/switch isn't completed */
_L4:
        mUrls = arraylist;
        if (true) goto _L6; else goto _L5
_L5:
    }

    public final void addConcreteTypeInternal(com.google.android.gms.common.server.response.FastJsonResponse.Field field, String s, FastJsonResponse fastjsonresponse)
    {
        int i = field.getSafeParcelableFieldId();
        i;
        JVM INSTR lookupswitch 4: default 52
    //                   3: 100
    //                   7: 124
    //                   15: 135
    //                   19: 146;
           goto _L1 _L2 _L3 _L4 _L5
_L1:
        throw new IllegalArgumentException((new StringBuilder("Field with id=")).append(i).append(" is not a known custom type.  Found ").append(fastjsonresponse.getClass().getCanonicalName()).append(".").toString());
_L2:
        mAgeRange = (AgeRangeEntity)fastjsonresponse;
_L7:
        mIndicatorSet.add(Integer.valueOf(i));
        return;
_L3:
        mCover = (CoverEntity)fastjsonresponse;
        continue; /* Loop/switch isn't completed */
_L4:
        mImage = (ImageEntity)fastjsonresponse;
        continue; /* Loop/switch isn't completed */
_L5:
        mName = (NameEntity)fastjsonresponse;
        if (true) goto _L7; else goto _L6
_L6:
    }

    public final int describeContents()
    {
        return 0;
    }

    public final boolean equals(Object obj)
    {
        if (obj instanceof PersonEntity) goto _L2; else goto _L1
_L1:
        return false;
_L2:
        Iterator iterator;
        if (this == obj)
        {
            return true;
        }
        obj = (PersonEntity)obj;
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
        if (!((PersonEntity) (obj)).isFieldSet(field)) goto _L1; else goto _L3
_L3:
        if (getFieldValue(field).equals(((PersonEntity) (obj)).getFieldValue(field))) goto _L5; else goto _L4
_L4:
        return false;
        if (!((PersonEntity) (obj)).isFieldSet(field)) goto _L5; else goto _L6
_L6:
        return false;
        return true;
    }

    public final volatile Object freeze()
    {
        return this;
    }

    public final String getDisplayName()
    {
        return mDisplayName;
    }

    public final volatile Map getFieldMappings()
    {
        return sFields;
    }

    protected final Object getFieldValue(com.google.android.gms.common.server.response.FastJsonResponse.Field field)
    {
        switch (field.getSafeParcelableFieldId())
        {
        case 10: // '\n'
        case 11: // '\013'
        case 13: // '\r'
        case 17: // '\021'
        default:
            throw new IllegalStateException((new StringBuilder("Unknown safe parcelable id=")).append(field.getSafeParcelableFieldId()).toString());

        case 2: // '\002'
            return mAboutMe;

        case 3: // '\003'
            return mAgeRange;

        case 4: // '\004'
            return mBirthday;

        case 5: // '\005'
            return mBraggingRights;

        case 6: // '\006'
            return Integer.valueOf(mCircledByCount);

        case 7: // '\007'
            return mCover;

        case 8: // '\b'
            return mCurrentLocation;

        case 9: // '\t'
            return mDisplayName;

        case 12: // '\f'
            return Integer.valueOf(mGender);

        case 14: // '\016'
            return mId;

        case 15: // '\017'
            return mImage;

        case 16: // '\020'
            return Boolean.valueOf(mIsPlusUser);

        case 18: // '\022'
            return mLanguage;

        case 19: // '\023'
            return mName;

        case 20: // '\024'
            return mNickname;

        case 21: // '\025'
            return Integer.valueOf(mObjectType);

        case 22: // '\026'
            return mOrganizations;

        case 23: // '\027'
            return mPlacesLived;

        case 24: // '\030'
            return Integer.valueOf(mPlusOneCount);

        case 25: // '\031'
            return Integer.valueOf(mRelationshipStatus);

        case 26: // '\032'
            return mTagline;

        case 27: // '\033'
            return mUrl;

        case 28: // '\034'
            return mUrls;

        case 29: // '\035'
            return Boolean.valueOf(mVerified);
        }
    }

    public final String getId()
    {
        return mId;
    }

    public final com.google.android.gms.plus.model.people.Person.Image getImage()
    {
        return mImage;
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

    public final boolean isDataValid()
    {
        return true;
    }

    protected final boolean isFieldSet(com.google.android.gms.common.server.response.FastJsonResponse.Field field)
    {
        return mIndicatorSet.contains(Integer.valueOf(field.getSafeParcelableFieldId()));
    }

    protected final void setBooleanInternal(com.google.android.gms.common.server.response.FastJsonResponse.Field field, String s, boolean flag)
    {
        int i = field.getSafeParcelableFieldId();
        i;
        JVM INSTR lookupswitch 2: default 36
    //                   16: 68
    //                   29: 89;
           goto _L1 _L2 _L3
_L1:
        throw new IllegalArgumentException((new StringBuilder("Field with id=")).append(i).append(" is not known to be a boolean.").toString());
_L2:
        mIsPlusUser = flag;
_L5:
        mIndicatorSet.add(Integer.valueOf(i));
        return;
_L3:
        mVerified = flag;
        if (true) goto _L5; else goto _L4
_L4:
    }

    protected final void setIntegerInternal(com.google.android.gms.common.server.response.FastJsonResponse.Field field, String s, int i)
    {
        int j = field.getSafeParcelableFieldId();
        j;
        JVM INSTR lookupswitch 5: default 60
    //                   6: 92
    //                   12: 113
    //                   21: 121
    //                   24: 129
    //                   25: 137;
           goto _L1 _L2 _L3 _L4 _L5 _L6
_L1:
        throw new IllegalArgumentException((new StringBuilder("Field with id=")).append(j).append(" is not known to be an int.").toString());
_L2:
        mCircledByCount = i;
_L8:
        mIndicatorSet.add(Integer.valueOf(j));
        return;
_L3:
        mGender = i;
        continue; /* Loop/switch isn't completed */
_L4:
        mObjectType = i;
        continue; /* Loop/switch isn't completed */
_L5:
        mPlusOneCount = i;
        continue; /* Loop/switch isn't completed */
_L6:
        mRelationshipStatus = i;
        if (true) goto _L8; else goto _L7
_L7:
    }

    protected final void setStringInternal(com.google.android.gms.common.server.response.FastJsonResponse.Field field, String s, String s1)
    {
        int i = field.getSafeParcelableFieldId();
        i;
        JVM INSTR lookupswitch 10: default 100
    //                   2: 132
    //                   4: 153
    //                   5: 161
    //                   8: 169
    //                   9: 177
    //                   14: 185
    //                   18: 193
    //                   20: 201
    //                   26: 209
    //                   27: 217;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10 _L11
_L1:
        throw new IllegalArgumentException((new StringBuilder("Field with id=")).append(i).append(" is not known to be a String.").toString());
_L2:
        mAboutMe = s1;
_L13:
        mIndicatorSet.add(Integer.valueOf(i));
        return;
_L3:
        mBirthday = s1;
        continue; /* Loop/switch isn't completed */
_L4:
        mBraggingRights = s1;
        continue; /* Loop/switch isn't completed */
_L5:
        mCurrentLocation = s1;
        continue; /* Loop/switch isn't completed */
_L6:
        mDisplayName = s1;
        continue; /* Loop/switch isn't completed */
_L7:
        mId = s1;
        continue; /* Loop/switch isn't completed */
_L8:
        mLanguage = s1;
        continue; /* Loop/switch isn't completed */
_L9:
        mNickname = s1;
        continue; /* Loop/switch isn't completed */
_L10:
        mTagline = s1;
        continue; /* Loop/switch isn't completed */
_L11:
        mUrl = s1;
        if (true) goto _L13; else goto _L12
_L12:
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        PersonEntityCreator.writeToParcel(this, parcel, i);
    }

    static 
    {
        HashMap hashmap = new HashMap();
        sFields = hashmap;
        hashmap.put("aboutMe", com.google.android.gms.common.server.response.FastJsonResponse.Field.forString("aboutMe", 2));
        sFields.put("ageRange", com.google.android.gms.common.server.response.FastJsonResponse.Field.forConcreteType("ageRange", 3, com/google/android/gms/plus/internal/model/people/PersonEntity$AgeRangeEntity));
        sFields.put("birthday", com.google.android.gms.common.server.response.FastJsonResponse.Field.forString("birthday", 4));
        sFields.put("braggingRights", com.google.android.gms.common.server.response.FastJsonResponse.Field.forString("braggingRights", 5));
        sFields.put("circledByCount", com.google.android.gms.common.server.response.FastJsonResponse.Field.forInteger("circledByCount", 6));
        sFields.put("cover", com.google.android.gms.common.server.response.FastJsonResponse.Field.forConcreteType("cover", 7, com/google/android/gms/plus/internal/model/people/PersonEntity$CoverEntity));
        sFields.put("currentLocation", com.google.android.gms.common.server.response.FastJsonResponse.Field.forString("currentLocation", 8));
        sFields.put("displayName", com.google.android.gms.common.server.response.FastJsonResponse.Field.forString("displayName", 9));
        sFields.put("gender", com.google.android.gms.common.server.response.FastJsonResponse.Field.withConverter("gender", 12, (new StringToIntConverter()).add("male", 0).add("female", 1).add("other", 2), false));
        sFields.put("id", com.google.android.gms.common.server.response.FastJsonResponse.Field.forString("id", 14));
        sFields.put("image", com.google.android.gms.common.server.response.FastJsonResponse.Field.forConcreteType("image", 15, com/google/android/gms/plus/internal/model/people/PersonEntity$ImageEntity));
        sFields.put("isPlusUser", com.google.android.gms.common.server.response.FastJsonResponse.Field.forBoolean("isPlusUser", 16));
        sFields.put("language", com.google.android.gms.common.server.response.FastJsonResponse.Field.forString("language", 18));
        sFields.put("name", com.google.android.gms.common.server.response.FastJsonResponse.Field.forConcreteType("name", 19, com/google/android/gms/plus/internal/model/people/PersonEntity$NameEntity));
        sFields.put("nickname", com.google.android.gms.common.server.response.FastJsonResponse.Field.forString("nickname", 20));
        sFields.put("objectType", com.google.android.gms.common.server.response.FastJsonResponse.Field.withConverter("objectType", 21, (new StringToIntConverter()).add("person", 0).add("page", 1), false));
        sFields.put("organizations", com.google.android.gms.common.server.response.FastJsonResponse.Field.forConcreteTypeArray("organizations", 22, com/google/android/gms/plus/internal/model/people/PersonEntity$OrganizationsEntity));
        sFields.put("placesLived", com.google.android.gms.common.server.response.FastJsonResponse.Field.forConcreteTypeArray("placesLived", 23, com/google/android/gms/plus/internal/model/people/PersonEntity$PlacesLivedEntity));
        sFields.put("plusOneCount", com.google.android.gms.common.server.response.FastJsonResponse.Field.forInteger("plusOneCount", 24));
        sFields.put("relationshipStatus", com.google.android.gms.common.server.response.FastJsonResponse.Field.withConverter("relationshipStatus", 25, (new StringToIntConverter()).add("single", 0).add("in_a_relationship", 1).add("engaged", 2).add("married", 3).add("its_complicated", 4).add("open_relationship", 5).add("widowed", 6).add("in_domestic_partnership", 7).add("in_civil_union", 8), false));
        sFields.put("tagline", com.google.android.gms.common.server.response.FastJsonResponse.Field.forString("tagline", 26));
        sFields.put("url", com.google.android.gms.common.server.response.FastJsonResponse.Field.forString("url", 27));
        sFields.put("urls", com.google.android.gms.common.server.response.FastJsonResponse.Field.forConcreteTypeArray("urls", 28, com/google/android/gms/plus/internal/model/people/PersonEntity$UrlsEntity));
        sFields.put("verified", com.google.android.gms.common.server.response.FastJsonResponse.Field.forBoolean("verified", 29));
    }
}
