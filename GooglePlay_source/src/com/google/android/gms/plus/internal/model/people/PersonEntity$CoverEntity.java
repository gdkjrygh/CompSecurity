// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.plus.internal.model.people;

import android.os.Parcel;
import com.google.android.gms.common.server.converter.StringToIntConverter;
import com.google.android.gms.common.server.response.FastJsonResponse;
import com.google.android.gms.common.server.response.FastSafeParcelableJsonResponse;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.google.android.gms.plus.internal.model.people:
//            PersonEntity, PersonEntity_CoverEntityCreator, PersonEntity_CoverEntity_CoverInfoEntityCreator, PersonEntity_CoverEntity_CoverPhotoEntityCreator

public static final class mLayout extends FastSafeParcelableJsonResponse
    implements com.google.android.gms.plus.model.people.onResponse
{
    public static final class CoverInfoEntity extends FastSafeParcelableJsonResponse
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
            if (obj instanceof CoverInfoEntity) goto _L2; else goto _L1
_L1:
            return false;
_L2:
            Iterator iterator;
            if (this == obj)
            {
                return true;
            }
            obj = (CoverInfoEntity)obj;
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
            if (!((CoverInfoEntity) (obj)).isFieldSet(field)) goto _L1; else goto _L3
_L3:
            if (getFieldValue(field).equals(((CoverInfoEntity) (obj)).getFieldValue(field))) goto _L5; else goto _L4
_L4:
            return false;
            if (!((CoverInfoEntity) (obj)).isFieldSet(field)) goto _L5; else goto _L6
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

        public CoverInfoEntity()
        {
            mVersionCode = 1;
            mIndicatorSet = new HashSet();
        }

        CoverInfoEntity(Set set, int i, int j, int k)
        {
            mIndicatorSet = set;
            mVersionCode = i;
            mLeftImageOffset = j;
            mTopImageOffset = k;
        }
    }

    public static final class CoverPhotoEntity extends FastSafeParcelableJsonResponse
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
            if (obj instanceof CoverPhotoEntity) goto _L2; else goto _L1
_L1:
            return false;
_L2:
            Iterator iterator;
            if (this == obj)
            {
                return true;
            }
            obj = (CoverPhotoEntity)obj;
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
            if (!((CoverPhotoEntity) (obj)).isFieldSet(field)) goto _L1; else goto _L3
_L3:
            if (getFieldValue(field).equals(((CoverPhotoEntity) (obj)).getFieldValue(field))) goto _L5; else goto _L4
_L4:
            return false;
            if (!((CoverPhotoEntity) (obj)).isFieldSet(field)) goto _L5; else goto _L6
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

        public CoverPhotoEntity()
        {
            mVersionCode = 1;
            mIndicatorSet = new HashSet();
        }

        CoverPhotoEntity(Set set, int i, int j, String s, int k)
        {
            mIndicatorSet = set;
            mVersionCode = i;
            mHeight = j;
            mUrl = s;
            mWidth = k;
        }
    }


    public static final PersonEntity_CoverEntityCreator CREATOR = new PersonEntity_CoverEntityCreator();
    private static final HashMap sFields;
    CoverInfoEntity mCoverInfo;
    CoverPhotoEntity mCoverPhoto;
    final Set mIndicatorSet;
    int mLayout;
    final int mVersionCode;

    public final void addConcreteTypeInternal(com.google.android.gms.common.server.response.ity ity, String s, FastJsonResponse fastjsonresponse)
    {
        int i = ity.tSafeParcelableFieldId();
        i;
        JVM INSTR tableswitch 2 3: default 32
    //                   2 77
    //                   3 101;
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
        if (obj instanceof CoverPhotoEntity) goto _L2; else goto _L1
_L1:
        return false;
_L2:
        Iterator iterator;
        if (this == obj)
        {
            return true;
        }
        obj = (CoverPhotoEntity)obj;
        iterator = sFields.values().iterator();
_L5:
        com.google.android.gms.common.server.response.ity ity;
        if (!iterator.hasNext())
        {
            break MISSING_BLOCK_LABEL_96;
        }
        ity = (com.google.android.gms.common.server.response.ity.sFields)iterator.next();
        if (!isFieldSet(ity))
        {
            continue; /* Loop/switch isn't completed */
        }
        if (!((isFieldSet) (obj)).isFieldSet(ity)) goto _L1; else goto _L3
_L3:
        if (getFieldValue(ity).equals(((getFieldValue) (obj)).getFieldValue(ity))) goto _L5; else goto _L4
_L4:
        return false;
        if (!((getFieldValue) (obj)).isFieldSet(ity)) goto _L5; else goto _L6
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

    protected final Object getFieldValue(com.google.android.gms.common.server.response.ity ity)
    {
        switch (ity.tSafeParcelableFieldId())
        {
        default:
            throw new IllegalStateException((new StringBuilder("Unknown safe parcelable id=")).append(ity.tSafeParcelableFieldId()).toString());

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
            com.google.android.gms.common.server.response.ity ity = (com.google.android.gms.common.server.response.ity.sFields)iterator.next();
            if (isFieldSet(ity))
            {
                i = ity.tSafeParcelableFieldId() + i + getFieldValue(ity).hashCode();
            }
        } while (true);
        return i;
    }

    public final boolean isDataValid()
    {
        return true;
    }

    protected final boolean isFieldSet(com.google.android.gms.common.server.response.ity ity)
    {
        return mIndicatorSet.contains(Integer.valueOf(ity.tSafeParcelableFieldId()));
    }

    protected final void setIntegerInternal(com.google.android.gms.common.server.response.ity ity, String s, int i)
    {
        int j = ity.tSafeParcelableFieldId();
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
        hashmap.put("coverInfo", com.google.android.gms.common.server.response.rConcreteType("coverInfo", 2, com/google/android/gms/plus/internal/model/people/PersonEntity$CoverEntity$CoverInfoEntity));
        sFields.put("coverPhoto", com.google.android.gms.common.server.response.rConcreteType("coverPhoto", 3, com/google/android/gms/plus/internal/model/people/PersonEntity$CoverEntity$CoverPhotoEntity));
        sFields.put("layout", com.google.android.gms.common.server.response.thConverter("layout", 4, (new StringToIntConverter()).add("banner", 0), false));
    }

    public CoverPhotoEntity()
    {
        mVersionCode = 1;
        mIndicatorSet = new HashSet();
    }

    CoverPhotoEntity(Set set, int i, CoverInfoEntity coverinfoentity, CoverPhotoEntity coverphotoentity, int j)
    {
        mIndicatorSet = set;
        mVersionCode = i;
        mCoverInfo = coverinfoentity;
        mCoverPhoto = coverphotoentity;
        mLayout = j;
    }
}
