// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.plus.service.v1whitelisted.models;

import android.os.Parcel;
import com.google.android.gms.common.server.response.FastJsonResponse;
import com.google.android.gms.common.server.response.FastSafeParcelableJsonResponse;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.google.android.gms.plus.service.v1whitelisted.models:
//            ActivityEntity, ActivityEntity_ObjectEntityCreator, ActivityEntity_ObjectEntity_ActorEntityCreator, ActivityEntity_ObjectEntity_AttachmentsEntityCreator, 
//            ActivityEntity_ObjectEntity_AttachmentsEntity_ActionEntityCreator, ActivityEntity_ObjectEntity_AttachmentsEntity_ActionEntity_DeepLinkEntityCreator, ActivityEntity_ObjectEntity_AttachmentsEntity_DeepLinkEntityCreator, ActivityEntity_ObjectEntity_AttachmentsEntity_ImageEntityCreator, 
//            ActivityEntity_ObjectEntity_AttachmentsEntity_ThumbnailsEntityCreator, ActivityEntity_ObjectEntity_AttachmentsEntity_ThumbnailsEntity_ImageEntityCreator, ActivityEntity_ObjectEntity_PlusonersEntityCreator, ActivityEntity_ObjectEntity_RepliesEntityCreator

public static final class mReplies extends FastSafeParcelableJsonResponse
    implements mReplies
{
    public static final class ActorEntity extends FastSafeParcelableJsonResponse
        implements Activity.PlusObject.Actor
    {

        public static final ActivityEntity_ObjectEntity_ActorEntityCreator CREATOR = new ActivityEntity_ObjectEntity_ActorEntityCreator();
        private static final HashMap sFields;
        String mDisplayName;
        final Set mIndicatorSet;
        final int mVersionCode;

        public final int describeContents()
        {
            return 0;
        }

        public final boolean equals(Object obj)
        {
            if (obj instanceof ActorEntity) goto _L2; else goto _L1
_L1:
            return false;
_L2:
            Iterator iterator;
            if (this == obj)
            {
                return true;
            }
            obj = (ActorEntity)obj;
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
            if (!((ActorEntity) (obj)).isFieldSet(field)) goto _L1; else goto _L3
_L3:
            if (getFieldValue(field).equals(((ActorEntity) (obj)).getFieldValue(field))) goto _L5; else goto _L4
_L4:
            return false;
            if (!((ActorEntity) (obj)).isFieldSet(field)) goto _L5; else goto _L6
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
                return mDisplayName;
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

            case 2: // '\002'
                mDisplayName = s1;
                break;
            }
            mIndicatorSet.add(Integer.valueOf(i));
        }

        public final void writeToParcel(Parcel parcel, int i)
        {
            ActivityEntity_ObjectEntity_ActorEntityCreator.writeToParcel$3816d2(this, parcel);
        }

        static 
        {
            HashMap hashmap = new HashMap();
            sFields = hashmap;
            hashmap.put("displayName", com.google.android.gms.common.server.response.FastJsonResponse.Field.forString("displayName", 2));
        }

        public ActorEntity()
        {
            mVersionCode = 1;
            mIndicatorSet = new HashSet();
        }

        ActorEntity(Set set, int i, String s)
        {
            mIndicatorSet = set;
            mVersionCode = i;
            mDisplayName = s;
        }
    }

    public static final class AttachmentsEntity extends FastSafeParcelableJsonResponse
        implements Activity.PlusObject.Attachments
    {

        public static final ActivityEntity_ObjectEntity_AttachmentsEntityCreator CREATOR = new ActivityEntity_ObjectEntity_AttachmentsEntityCreator();
        private static final HashMap sFields;
        ActionEntity mAction;
        String mContent;
        DeepLinkEntity mDeepLink;
        String mDisplayName;
        ImageEntity mImage;
        final Set mIndicatorSet;
        String mObjectType;
        List mThumbnails;
        String mUrl;
        final int mVersionCode;

        public final void addConcreteTypeArrayInternal(com.google.android.gms.common.server.response.FastJsonResponse.Field field, String s, ArrayList arraylist)
        {
            int i = field.getSafeParcelableFieldId();
            switch (i)
            {
            default:
                throw new IllegalArgumentException((new StringBuilder("Field with id=")).append(i).append(" is not a known array of custom type.  Found ").append(arraylist.getClass().getCanonicalName()).append(".").toString());

            case 13: // '\r'
                mThumbnails = arraylist;
                break;
            }
            mIndicatorSet.add(Integer.valueOf(i));
        }

        public final void addConcreteTypeInternal(com.google.android.gms.common.server.response.FastJsonResponse.Field field, String s, FastJsonResponse fastjsonresponse)
        {
            int i = field.getSafeParcelableFieldId();
            i;
            JVM INSTR lookupswitch 3: default 44
        //                       2: 89
        //                       5: 113
        //                       10: 124;
               goto _L1 _L2 _L3 _L4
_L1:
            throw new IllegalArgumentException((new StringBuilder("Field with id=")).append(i).append(" is not a known custom type.  Found ").append(fastjsonresponse.getClass().getCanonicalName()).append(".").toString());
_L2:
            mAction = (ActionEntity)fastjsonresponse;
_L6:
            mIndicatorSet.add(Integer.valueOf(i));
            return;
_L3:
            mDeepLink = (DeepLinkEntity)fastjsonresponse;
            continue; /* Loop/switch isn't completed */
_L4:
            mImage = (ImageEntity)fastjsonresponse;
            if (true) goto _L6; else goto _L5
_L5:
        }

        public final int describeContents()
        {
            return 0;
        }

        public final boolean equals(Object obj)
        {
            if (obj instanceof AttachmentsEntity) goto _L2; else goto _L1
_L1:
            return false;
_L2:
            Iterator iterator;
            if (this == obj)
            {
                return true;
            }
            obj = (AttachmentsEntity)obj;
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
            if (!((AttachmentsEntity) (obj)).isFieldSet(field)) goto _L1; else goto _L3
_L3:
            if (getFieldValue(field).equals(((AttachmentsEntity) (obj)).getFieldValue(field))) goto _L5; else goto _L4
_L4:
            return false;
            if (!((AttachmentsEntity) (obj)).isFieldSet(field)) goto _L5; else goto _L6
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
            case 3: // '\003'
            case 7: // '\007'
            case 8: // '\b'
            case 9: // '\t'
            case 12: // '\f'
            default:
                throw new IllegalStateException((new StringBuilder("Unknown safe parcelable id=")).append(field.getSafeParcelableFieldId()).toString());

            case 2: // '\002'
                return mAction;

            case 4: // '\004'
                return mContent;

            case 5: // '\005'
                return mDeepLink;

            case 6: // '\006'
                return mDisplayName;

            case 10: // '\n'
                return mImage;

            case 11: // '\013'
                return mObjectType;

            case 13: // '\r'
                return mThumbnails;

            case 14: // '\016'
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
            i;
            JVM INSTR lookupswitch 4: default 52
        //                       4: 82
        //                       6: 103
        //                       11: 111
        //                       14: 119;
               goto _L1 _L2 _L3 _L4 _L5
_L1:
            throw new IllegalArgumentException((new StringBuilder("Field with id=")).append(i).append(" is not known to be a String.").toString());
_L2:
            mContent = s1;
_L7:
            mIndicatorSet.add(Integer.valueOf(i));
            return;
_L3:
            mDisplayName = s1;
            continue; /* Loop/switch isn't completed */
_L4:
            mObjectType = s1;
            continue; /* Loop/switch isn't completed */
_L5:
            mUrl = s1;
            if (true) goto _L7; else goto _L6
_L6:
        }

        public final void writeToParcel(Parcel parcel, int i)
        {
            ActivityEntity_ObjectEntity_AttachmentsEntityCreator.writeToParcel(this, parcel, i);
        }

        static 
        {
            HashMap hashmap = new HashMap();
            sFields = hashmap;
            hashmap.put("action", com.google.android.gms.common.server.response.FastJsonResponse.Field.forConcreteType("action", 2, com/google/android/gms/plus/service/v1whitelisted/models/ActivityEntity$ObjectEntity$AttachmentsEntity$ActionEntity));
            sFields.put("content", com.google.android.gms.common.server.response.FastJsonResponse.Field.forString("content", 4));
            sFields.put("deepLink", com.google.android.gms.common.server.response.FastJsonResponse.Field.forConcreteType("deepLink", 5, com/google/android/gms/plus/service/v1whitelisted/models/ActivityEntity$ObjectEntity$AttachmentsEntity$DeepLinkEntity));
            sFields.put("displayName", com.google.android.gms.common.server.response.FastJsonResponse.Field.forString("displayName", 6));
            sFields.put("image", com.google.android.gms.common.server.response.FastJsonResponse.Field.forConcreteType("image", 10, com/google/android/gms/plus/service/v1whitelisted/models/ActivityEntity$ObjectEntity$AttachmentsEntity$ImageEntity));
            sFields.put("objectType", com.google.android.gms.common.server.response.FastJsonResponse.Field.forString("objectType", 11));
            sFields.put("thumbnails", com.google.android.gms.common.server.response.FastJsonResponse.Field.forConcreteTypeArray("thumbnails", 13, com/google/android/gms/plus/service/v1whitelisted/models/ActivityEntity$ObjectEntity$AttachmentsEntity$ThumbnailsEntity));
            sFields.put("url", com.google.android.gms.common.server.response.FastJsonResponse.Field.forString("url", 14));
        }

        public AttachmentsEntity()
        {
            mVersionCode = 1;
            mIndicatorSet = new HashSet();
        }

        AttachmentsEntity(Set set, int i, ActionEntity actionentity, String s, DeepLinkEntity deeplinkentity, String s1, ImageEntity imageentity, 
                String s2, List list, String s3)
        {
            mIndicatorSet = set;
            mVersionCode = i;
            mAction = actionentity;
            mContent = s;
            mDeepLink = deeplinkentity;
            mDisplayName = s1;
            mImage = imageentity;
            mObjectType = s2;
            mThumbnails = list;
            mUrl = s3;
        }
    }

    public static final class AttachmentsEntity.ActionEntity extends FastSafeParcelableJsonResponse
        implements Activity.PlusObject.Attachments.Action
    {

        public static final ActivityEntity_ObjectEntity_AttachmentsEntity_ActionEntityCreator CREATOR = new ActivityEntity_ObjectEntity_AttachmentsEntity_ActionEntityCreator();
        private static final HashMap sFields;
        DeepLinkEntity mDeepLink;
        String mDisplayName;
        final Set mIndicatorSet;
        String mType;
        final int mVersionCode;

        public final void addConcreteTypeInternal(com.google.android.gms.common.server.response.FastJsonResponse.Field field, String s, FastJsonResponse fastjsonresponse)
        {
            int i = field.getSafeParcelableFieldId();
            switch (i)
            {
            default:
                throw new IllegalArgumentException((new StringBuilder("Field with id=")).append(i).append(" is not a known custom type.  Found ").append(fastjsonresponse.getClass().getCanonicalName()).append(".").toString());

            case 2: // '\002'
                mDeepLink = (DeepLinkEntity)fastjsonresponse;
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
            if (obj instanceof AttachmentsEntity.ActionEntity) goto _L2; else goto _L1
_L1:
            return false;
_L2:
            Iterator iterator;
            if (this == obj)
            {
                return true;
            }
            obj = (AttachmentsEntity.ActionEntity)obj;
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
            if (!((AttachmentsEntity.ActionEntity) (obj)).isFieldSet(field)) goto _L1; else goto _L3
_L3:
            if (getFieldValue(field).equals(((AttachmentsEntity.ActionEntity) (obj)).getFieldValue(field))) goto _L5; else goto _L4
_L4:
            return false;
            if (!((AttachmentsEntity.ActionEntity) (obj)).isFieldSet(field)) goto _L5; else goto _L6
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
                return mDeepLink;

            case 3: // '\003'
                return mDisplayName;

            case 4: // '\004'
                return mType;
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
            JVM INSTR tableswitch 3 4: default 32
        //                       3 62
        //                       4 83;
               goto _L1 _L2 _L3
_L1:
            throw new IllegalArgumentException((new StringBuilder("Field with id=")).append(i).append(" is not known to be a String.").toString());
_L2:
            mDisplayName = s1;
_L5:
            mIndicatorSet.add(Integer.valueOf(i));
            return;
_L3:
            mType = s1;
            if (true) goto _L5; else goto _L4
_L4:
        }

        public final void writeToParcel(Parcel parcel, int i)
        {
            ActivityEntity_ObjectEntity_AttachmentsEntity_ActionEntityCreator.writeToParcel(this, parcel, i);
        }

        static 
        {
            HashMap hashmap = new HashMap();
            sFields = hashmap;
            hashmap.put("deepLink", com.google.android.gms.common.server.response.FastJsonResponse.Field.forConcreteType("deepLink", 2, com/google/android/gms/plus/service/v1whitelisted/models/ActivityEntity$ObjectEntity$AttachmentsEntity$ActionEntity$DeepLinkEntity));
            sFields.put("displayName", com.google.android.gms.common.server.response.FastJsonResponse.Field.forString("displayName", 3));
            sFields.put("type", com.google.android.gms.common.server.response.FastJsonResponse.Field.forString("type", 4));
        }

        public AttachmentsEntity.ActionEntity()
        {
            mVersionCode = 1;
            mIndicatorSet = new HashSet();
        }

        AttachmentsEntity.ActionEntity(Set set, int i, DeepLinkEntity deeplinkentity, String s, String s1)
        {
            mIndicatorSet = set;
            mVersionCode = i;
            mDeepLink = deeplinkentity;
            mDisplayName = s;
            mType = s1;
        }
    }

    public static final class AttachmentsEntity.ActionEntity.DeepLinkEntity extends FastSafeParcelableJsonResponse
        implements Activity.PlusObject.Attachments.Action.DeepLink
    {

        public static final ActivityEntity_ObjectEntity_AttachmentsEntity_ActionEntity_DeepLinkEntityCreator CREATOR = new ActivityEntity_ObjectEntity_AttachmentsEntity_ActionEntity_DeepLinkEntityCreator();
        private static final HashMap sFields;
        String mId;
        final Set mIndicatorSet;
        String mUrl;
        final int mVersionCode;

        public final int describeContents()
        {
            return 0;
        }

        public final boolean equals(Object obj)
        {
            if (obj instanceof AttachmentsEntity.ActionEntity.DeepLinkEntity) goto _L2; else goto _L1
_L1:
            return false;
_L2:
            Iterator iterator;
            if (this == obj)
            {
                return true;
            }
            obj = (AttachmentsEntity.ActionEntity.DeepLinkEntity)obj;
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
            if (!((AttachmentsEntity.ActionEntity.DeepLinkEntity) (obj)).isFieldSet(field)) goto _L1; else goto _L3
_L3:
            if (getFieldValue(field).equals(((AttachmentsEntity.ActionEntity.DeepLinkEntity) (obj)).getFieldValue(field))) goto _L5; else goto _L4
_L4:
            return false;
            if (!((AttachmentsEntity.ActionEntity.DeepLinkEntity) (obj)).isFieldSet(field)) goto _L5; else goto _L6
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
                return mId;

            case 3: // '\003'
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
            i;
            JVM INSTR tableswitch 2 3: default 32
        //                       2 62
        //                       3 83;
               goto _L1 _L2 _L3
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
            ActivityEntity_ObjectEntity_AttachmentsEntity_ActionEntity_DeepLinkEntityCreator.writeToParcel$5f80c9a3(this, parcel);
        }

        static 
        {
            HashMap hashmap = new HashMap();
            sFields = hashmap;
            hashmap.put("id", com.google.android.gms.common.server.response.FastJsonResponse.Field.forString("id", 2));
            sFields.put("url", com.google.android.gms.common.server.response.FastJsonResponse.Field.forString("url", 3));
        }

        public AttachmentsEntity.ActionEntity.DeepLinkEntity()
        {
            mVersionCode = 1;
            mIndicatorSet = new HashSet();
        }

        AttachmentsEntity.ActionEntity.DeepLinkEntity(Set set, int i, String s, String s1)
        {
            mIndicatorSet = set;
            mVersionCode = i;
            mId = s;
            mUrl = s1;
        }
    }

    public static final class AttachmentsEntity.DeepLinkEntity extends FastSafeParcelableJsonResponse
        implements Activity.PlusObject.Attachments.DeepLink
    {

        public static final ActivityEntity_ObjectEntity_AttachmentsEntity_DeepLinkEntityCreator CREATOR = new ActivityEntity_ObjectEntity_AttachmentsEntity_DeepLinkEntityCreator();
        private static final HashMap sFields;
        String mId;
        final Set mIndicatorSet;
        String mUrl;
        final int mVersionCode;

        public final int describeContents()
        {
            return 0;
        }

        public final boolean equals(Object obj)
        {
            if (obj instanceof AttachmentsEntity.DeepLinkEntity) goto _L2; else goto _L1
_L1:
            return false;
_L2:
            Iterator iterator;
            if (this == obj)
            {
                return true;
            }
            obj = (AttachmentsEntity.DeepLinkEntity)obj;
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
            if (!((AttachmentsEntity.DeepLinkEntity) (obj)).isFieldSet(field)) goto _L1; else goto _L3
_L3:
            if (getFieldValue(field).equals(((AttachmentsEntity.DeepLinkEntity) (obj)).getFieldValue(field))) goto _L5; else goto _L4
_L4:
            return false;
            if (!((AttachmentsEntity.DeepLinkEntity) (obj)).isFieldSet(field)) goto _L5; else goto _L6
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
                return mId;

            case 3: // '\003'
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
            i;
            JVM INSTR tableswitch 2 3: default 32
        //                       2 62
        //                       3 83;
               goto _L1 _L2 _L3
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
            ActivityEntity_ObjectEntity_AttachmentsEntity_DeepLinkEntityCreator.writeToParcel$6035e89c(this, parcel);
        }

        static 
        {
            HashMap hashmap = new HashMap();
            sFields = hashmap;
            hashmap.put("id", com.google.android.gms.common.server.response.FastJsonResponse.Field.forString("id", 2));
            sFields.put("url", com.google.android.gms.common.server.response.FastJsonResponse.Field.forString("url", 3));
        }

        public AttachmentsEntity.DeepLinkEntity()
        {
            mVersionCode = 1;
            mIndicatorSet = new HashSet();
        }

        AttachmentsEntity.DeepLinkEntity(Set set, int i, String s, String s1)
        {
            mIndicatorSet = set;
            mVersionCode = i;
            mId = s;
            mUrl = s1;
        }
    }

    public static final class AttachmentsEntity.ImageEntity extends FastSafeParcelableJsonResponse
        implements Activity.PlusObject.Attachments.Image
    {

        public static final ActivityEntity_ObjectEntity_AttachmentsEntity_ImageEntityCreator CREATOR = new ActivityEntity_ObjectEntity_AttachmentsEntity_ImageEntityCreator();
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
            if (obj instanceof AttachmentsEntity.ImageEntity) goto _L2; else goto _L1
_L1:
            return false;
_L2:
            Iterator iterator;
            if (this == obj)
            {
                return true;
            }
            obj = (AttachmentsEntity.ImageEntity)obj;
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
            if (!((AttachmentsEntity.ImageEntity) (obj)).isFieldSet(field)) goto _L1; else goto _L3
_L3:
            if (getFieldValue(field).equals(((AttachmentsEntity.ImageEntity) (obj)).getFieldValue(field))) goto _L5; else goto _L4
_L4:
            return false;
            if (!((AttachmentsEntity.ImageEntity) (obj)).isFieldSet(field)) goto _L5; else goto _L6
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
            ActivityEntity_ObjectEntity_AttachmentsEntity_ImageEntityCreator.writeToParcel$1b0a2839(this, parcel);
        }

        static 
        {
            HashMap hashmap = new HashMap();
            sFields = hashmap;
            hashmap.put("url", com.google.android.gms.common.server.response.FastJsonResponse.Field.forString("url", 4));
        }

        public AttachmentsEntity.ImageEntity()
        {
            mVersionCode = 1;
            mIndicatorSet = new HashSet();
        }

        AttachmentsEntity.ImageEntity(Set set, int i, String s)
        {
            mIndicatorSet = set;
            mVersionCode = i;
            mUrl = s;
        }
    }

    public static final class AttachmentsEntity.ThumbnailsEntity extends FastSafeParcelableJsonResponse
        implements Activity.PlusObject.Attachments.Thumbnails
    {

        public static final ActivityEntity_ObjectEntity_AttachmentsEntity_ThumbnailsEntityCreator CREATOR = new ActivityEntity_ObjectEntity_AttachmentsEntity_ThumbnailsEntityCreator();
        private static final HashMap sFields;
        ImageEntity mImage;
        final Set mIndicatorSet;
        String mUrl;
        final int mVersionCode;

        public final void addConcreteTypeInternal(com.google.android.gms.common.server.response.FastJsonResponse.Field field, String s, FastJsonResponse fastjsonresponse)
        {
            int i = field.getSafeParcelableFieldId();
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
            if (obj instanceof AttachmentsEntity.ThumbnailsEntity) goto _L2; else goto _L1
_L1:
            return false;
_L2:
            Iterator iterator;
            if (this == obj)
            {
                return true;
            }
            obj = (AttachmentsEntity.ThumbnailsEntity)obj;
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
            if (!((AttachmentsEntity.ThumbnailsEntity) (obj)).isFieldSet(field)) goto _L1; else goto _L3
_L3:
            if (getFieldValue(field).equals(((AttachmentsEntity.ThumbnailsEntity) (obj)).getFieldValue(field))) goto _L5; else goto _L4
_L4:
            return false;
            if (!((AttachmentsEntity.ThumbnailsEntity) (obj)).isFieldSet(field)) goto _L5; else goto _L6
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
            hashmap.put("image", com.google.android.gms.common.server.response.FastJsonResponse.Field.forConcreteType("image", 4, com/google/android/gms/plus/service/v1whitelisted/models/ActivityEntity$ObjectEntity$AttachmentsEntity$ThumbnailsEntity$ImageEntity));
            sFields.put("url", com.google.android.gms.common.server.response.FastJsonResponse.Field.forString("url", 5));
        }

        public AttachmentsEntity.ThumbnailsEntity()
        {
            mVersionCode = 1;
            mIndicatorSet = new HashSet();
        }

        AttachmentsEntity.ThumbnailsEntity(Set set, int i, ImageEntity imageentity, String s)
        {
            mIndicatorSet = set;
            mVersionCode = i;
            mImage = imageentity;
            mUrl = s;
        }
    }

    public static final class AttachmentsEntity.ThumbnailsEntity.ImageEntity extends FastSafeParcelableJsonResponse
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
            if (obj instanceof AttachmentsEntity.ThumbnailsEntity.ImageEntity) goto _L2; else goto _L1
_L1:
            return false;
_L2:
            Iterator iterator;
            if (this == obj)
            {
                return true;
            }
            obj = (AttachmentsEntity.ThumbnailsEntity.ImageEntity)obj;
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
            if (!((AttachmentsEntity.ThumbnailsEntity.ImageEntity) (obj)).isFieldSet(field)) goto _L1; else goto _L3
_L3:
            if (getFieldValue(field).equals(((AttachmentsEntity.ThumbnailsEntity.ImageEntity) (obj)).getFieldValue(field))) goto _L5; else goto _L4
_L4:
            return false;
            if (!((AttachmentsEntity.ThumbnailsEntity.ImageEntity) (obj)).isFieldSet(field)) goto _L5; else goto _L6
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

        public AttachmentsEntity.ThumbnailsEntity.ImageEntity()
        {
            mVersionCode = 1;
            mIndicatorSet = new HashSet();
        }

        AttachmentsEntity.ThumbnailsEntity.ImageEntity(Set set, int i, String s)
        {
            mIndicatorSet = set;
            mVersionCode = i;
            mUrl = s;
        }
    }

    public static final class PlusonersEntity extends FastSafeParcelableJsonResponse
        implements Activity.PlusObject.Plusoners
    {

        public static final ActivityEntity_ObjectEntity_PlusonersEntityCreator CREATOR = new ActivityEntity_ObjectEntity_PlusonersEntityCreator();
        private static final HashMap sFields;
        final Set mIndicatorSet;
        int mTotalItems;
        final int mVersionCode;

        public final int describeContents()
        {
            return 0;
        }

        public final boolean equals(Object obj)
        {
            if (obj instanceof PlusonersEntity) goto _L2; else goto _L1
_L1:
            return false;
_L2:
            Iterator iterator;
            if (this == obj)
            {
                return true;
            }
            obj = (PlusonersEntity)obj;
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
            if (!((PlusonersEntity) (obj)).isFieldSet(field)) goto _L1; else goto _L3
_L3:
            if (getFieldValue(field).equals(((PlusonersEntity) (obj)).getFieldValue(field))) goto _L5; else goto _L4
_L4:
            return false;
            if (!((PlusonersEntity) (obj)).isFieldSet(field)) goto _L5; else goto _L6
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

            case 3: // '\003'
                return Integer.valueOf(mTotalItems);
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

            case 3: // '\003'
                mTotalItems = i;
                break;
            }
            mIndicatorSet.add(Integer.valueOf(j));
        }

        public final void writeToParcel(Parcel parcel, int i)
        {
            ActivityEntity_ObjectEntity_PlusonersEntityCreator.writeToParcel$211e0faa(this, parcel);
        }

        static 
        {
            HashMap hashmap = new HashMap();
            sFields = hashmap;
            hashmap.put("totalItems", com.google.android.gms.common.server.response.FastJsonResponse.Field.forInteger("totalItems", 3));
        }

        public PlusonersEntity()
        {
            mVersionCode = 1;
            mIndicatorSet = new HashSet();
        }

        PlusonersEntity(Set set, int i, int j)
        {
            mIndicatorSet = set;
            mVersionCode = i;
            mTotalItems = j;
        }
    }

    public static final class RepliesEntity extends FastSafeParcelableJsonResponse
        implements Activity.PlusObject.Replies
    {

        public static final ActivityEntity_ObjectEntity_RepliesEntityCreator CREATOR = new ActivityEntity_ObjectEntity_RepliesEntityCreator();
        private static final HashMap sFields;
        final Set mIndicatorSet;
        int mTotalItems;
        final int mVersionCode;

        public final int describeContents()
        {
            return 0;
        }

        public final boolean equals(Object obj)
        {
            if (obj instanceof RepliesEntity) goto _L2; else goto _L1
_L1:
            return false;
_L2:
            Iterator iterator;
            if (this == obj)
            {
                return true;
            }
            obj = (RepliesEntity)obj;
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
            if (!((RepliesEntity) (obj)).isFieldSet(field)) goto _L1; else goto _L3
_L3:
            if (getFieldValue(field).equals(((RepliesEntity) (obj)).getFieldValue(field))) goto _L5; else goto _L4
_L4:
            return false;
            if (!((RepliesEntity) (obj)).isFieldSet(field)) goto _L5; else goto _L6
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
                return Integer.valueOf(mTotalItems);
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
                mTotalItems = i;
                break;
            }
            mIndicatorSet.add(Integer.valueOf(j));
        }

        public final void writeToParcel(Parcel parcel, int i)
        {
            ActivityEntity_ObjectEntity_RepliesEntityCreator.writeToParcel$50a03b05(this, parcel);
        }

        static 
        {
            HashMap hashmap = new HashMap();
            sFields = 