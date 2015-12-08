// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.plus.service.v1whitelisted.models;

import android.os.Parcel;
import com.google.android.gms.common.server.response.FastJsonResponse;
import com.google.android.gms.common.server.response.FastSafeParcelableJsonResponse;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.google.android.gms.plus.service.v1whitelisted.models:
//            ActivityEntity, ActivityEntity_ObjectEntity_AttachmentsEntity_ThumbnailsEntityCreator, ActivityEntity_ObjectEntity_AttachmentsEntity_ThumbnailsEntity_ImageEntityCreator

public static final class mUrl extends FastSafeParcelableJsonResponse
    implements mUrl
{
    public static final class ImageEntity extends FastSafeParcelableJsonResponse
        implements Activity.PlusObject.Attachments.Thumbnails.Image
    {

        public static final ActivityEntity_ObjectEntity_AttachmentsEntity_ThumbnailsEntity_ImageEntityCreator CREATOR = new ActivityEntity_ObjectEntity_AttachmentsEntity_ThumbnailsEntity_ImageEntityCreator();
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

            case 4: // '\004'
                return mUrl;
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
            ActivityEntity_ObjectEntity_AttachmentsEntity_ThumbnailsEntity_ImageEntityCreator.writeToParcel$392ece9f(this, parcel);
        }

        static 
        {
            HashMap hashmap = new HashMap();
            sFields = hashmap;
            hashmap.put("url", com.google.android.gms.common.server.response.FastJsonResponse.Field.forString("url", 4));
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


    public static final ActivityEntity_ObjectEntity_AttachmentsEntity_ThumbnailsEntityCreator CREATOR = new ActivityEntity_ObjectEntity_AttachmentsEntity_ThumbnailsEntityCreator();
    private static final HashMap sFields;
    ImageEntity mImage;
    final Set mIndicatorSet;
    String mUrl;
    final int mVersionCode;

    public final void addConcreteTypeInternal(com.google.android.gms.common.server.response.ailsEntity ailsentity, String s, FastJsonResponse fastjsonresponse)
    {
        int i = ailsentity.ailsEntity();
        switch (i)
        {
        default:
            throw new IllegalArgumentException((new StringBuilder("Field with id=")).append(i).append(" is not a known custom type.  Found ").append(fastjsonresponse.getClass().getCanonicalName()).append(".").toString());

        case 4: // '\004'
            mImage = (ImageEntity)fastjsonresponse;
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
        if (obj instanceof mIndicatorSet) goto _L2; else goto _L1
_L1:
        return false;
_L2:
        Iterator iterator;
        if (this == obj)
        {
            return true;
        }
        obj = (mIndicatorSet)obj;
        iterator = sFields.values().iterator();
_L5:
        com.google.android.gms.common.server.response.ailsEntity ailsentity;
        if (!iterator.hasNext())
        {
            break MISSING_BLOCK_LABEL_96;
        }
        ailsentity = (com.google.android.gms.common.server.response.ailsEntity.sFields)iterator.next();
        if (!isFieldSet(ailsentity))
        {
            continue; /* Loop/switch isn't completed */
        }
        if (!((isFieldSet) (obj)).isFieldSet(ailsentity)) goto _L1; else goto _L3
_L3:
        if (getFieldValue(ailsentity).equals(((getFieldValue) (obj)).getFieldValue(ailsentity))) goto _L5; else goto _L4
_L4:
        return false;
        if (!((getFieldValue) (obj)).isFieldSet(ailsentity)) goto _L5; else goto _L6
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

    protected final Object getFieldValue(com.google.android.gms.common.server.response.ailsEntity ailsentity)
    {
        switch (ailsentity.ailsEntity())
        {
        default:
            throw new IllegalStateException((new StringBuilder("Unknown safe parcelable id=")).append(ailsentity.ailsEntity()).toString());

        case 4: // '\004'
            return mImage;

        case 5: // '\005'
            return mUrl;
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
            com.google.android.gms.common.server.response.ailsEntity ailsentity = (com.google.android.gms.common.server.response.ailsEntity.sFields)iterator.next();
            if (isFieldSet(ailsentity))
            {
                i = ailsentity.isFieldSet() + i + getFieldValue(ailsentity).hashCode();
            }
        } while (true);
        return i;
    }

    public final boolean isDataValid()
    {
        return true;
    }

    protected final boolean isFieldSet(com.google.android.gms.common.server.response.ailsEntity ailsentity)
    {
        return mIndicatorSet.contains(Integer.valueOf(ailsentity.mIndicatorSet()));
    }

    protected final void setStringInternal(com.google.android.gms.common.server.response.ailsEntity ailsentity, String s, String s1)
    {
        int i = ailsentity.ailsEntity();
        switch (i)
        {
        default:
            throw new IllegalArgumentException((new StringBuilder("Field with id=")).append(i).append(" is not known to be a String.").toString());

        case 5: // '\005'
            mUrl = s1;
            break;
        }
        mIndicatorSet.add(Integer.valueOf(i));
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        ActivityEntity_ObjectEntity_AttachmentsEntity_ThumbnailsEntityCreator.writeToParcel(this, parcel, i);
    }

    static 
    {
        HashMap hashmap = new HashMap();
        sFields = hashmap;
        hashmap.put("image", com.google.android.gms.common.server.response.ailsEntity.sFields("image", 4, com/google/android/gms/plus/service/v1whitelisted/models/ActivityEntity$ObjectEntity$AttachmentsEntity$ThumbnailsEntity$ImageEntity));
        sFields.put("url", com.google.android.gms.common.server.response.ailsEntity.sFields("url", 5));
    }

    public ImageEntity()
    {
        mVersionCode = 1;
        mIndicatorSet = new HashSet();
    }

    ImageEntity(Set set, int i, ImageEntity imageentity, String s)
    {
        mIndicatorSet = set;
        mVersionCode = i;
        mImage = imageentity;
        mUrl = s;
    }
}
