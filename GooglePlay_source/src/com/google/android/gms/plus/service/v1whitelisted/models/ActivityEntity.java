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
//            Activity, ActivityEntityCreator, AclEntity, ActivityEntity_ObjectEntityCreator, 
//            ActivityEntity_ObjectEntity_ActorEntityCreator, ActivityEntity_ObjectEntity_AttachmentsEntityCreator, ActivityEntity_ObjectEntity_AttachmentsEntity_ActionEntityCreator, ActivityEntity_ObjectEntity_AttachmentsEntity_ActionEntity_DeepLinkEntityCreator, 
//            ActivityEntity_ObjectEntity_AttachmentsEntity_DeepLinkEntityCreator, ActivityEntity_ObjectEntity_AttachmentsEntity_ImageEntityCreator, ActivityEntity_ObjectEntity_AttachmentsEntity_ThumbnailsEntityCreator, ActivityEntity_ObjectEntity_AttachmentsEntity_ThumbnailsEntity_ImageEntityCreator, 
//            ActivityEntity_ObjectEntity_PlusonersEntityCreator, ActivityEntity_ObjectEntity_RepliesEntityCreator

public final class ActivityEntity extends FastSafeParcelableJsonResponse
    implements Activity
{
    public static final class ObjectEntity extends FastSafeParcelableJsonResponse
        implements Activity.PlusObject
    {

        public static final ActivityEntity_ObjectEntityCreator CREATOR = new ActivityEntity_ObjectEntityCreator();
        private static final HashMap sFields;
        ActorEntity mActor;
        List mAttachments;
        String mContent;
        final Set mIndicatorSet;
        PlusonersEntity mPlusoners;
        RepliesEntity mReplies;
        final int mVersionCode;

        public final void addConcreteTypeArrayInternal(com.google.android.gms.common.server.response.FastJsonResponse.Field field, String s, ArrayList arraylist)
        {
            int i = field.getSafeParcelableFieldId();
            switch (i)
            {
            default:
                throw new IllegalArgumentException((new StringBuilder("Field with id=")).append(i).append(" is not a known array of custom type.  Found ").append(arraylist.getClass().getCanonicalName()).append(".").toString());

            case 3: // '\003'
                mAttachments = arraylist;
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
        //                       9: 113
        //                       10: 124;
               goto _L1 _L2 _L3 _L4
_L1:
            throw new IllegalArgumentException((new StringBuilder("Field with id=")).append(i).append(" is not a known custom type.  Found ").append(fastjsonresponse.getClass().getCanonicalName()).append(".").toString());
_L2:
            mActor = (ActorEntity)fastjsonresponse;
_L6:
            mIndicatorSet.add(Integer.valueOf(i));
            return;
_L3:
            mPlusoners = (PlusonersEntity)fastjsonresponse;
            continue; /* Loop/switch isn't completed */
_L4:
            mReplies = (RepliesEntity)fastjsonresponse;
            if (true) goto _L6; else goto _L5
_L5:
        }

        public final int describeContents()
        {
            return 0;
        }

        public final boolean equals(Object obj)
        {
            if (obj instanceof ObjectEntity) goto _L2; else goto _L1
_L1:
            return false;
_L2:
            Iterator iterator;
            if (this == obj)
            {
                return true;
            }
            obj = (ObjectEntity)obj;
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
            if (!((ObjectEntity) (obj)).isFieldSet(field)) goto _L1; else goto _L3
_L3:
            if (getFieldValue(field).equals(((ObjectEntity) (obj)).getFieldValue(field))) goto _L5; else goto _L4
_L4:
            return false;
            if (!((ObjectEntity) (obj)).isFieldSet(field)) goto _L5; else goto _L6
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
            case 5: // '\005'
            case 6: // '\006'
            case 7: // '\007'
            case 8: // '\b'
            default:
                throw new IllegalStateException((new StringBuilder("Unknown safe parcelable id=")).append(field.getSafeParcelableFieldId()).toString());

            case 2: // '\002'
                return mActor;

            case 3: // '\003'
                return mAttachments;

            case 4: // '\004'
                return mContent;

            case 9: // '\t'
                return mPlusoners;

            case 10: // '\n'
                return mReplies;
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
                mContent = s1;
                break;
            }
            mIndicatorSet.add(Integer.valueOf(i));
        }

        public final void writeToParcel(Parcel parcel, int i)
        {
            ActivityEntity_ObjectEntityCreator.writeToParcel(this, parcel, i);
        }

        static 
        {
            HashMap hashmap = new HashMap();
            sFields = hashmap;
            hashmap.put("actor", com.google.android.gms.common.server.response.FastJsonResponse.Field.forConcreteType("actor", 2, com/google/android/gms/plus/service/v1whitelisted/models/ActivityEntity$ObjectEntity$ActorEntity));
            sFields.put("attachments", com.google.android.gms.common.server.response.FastJsonResponse.Field.forConcreteTypeArray("attachments", 3, com/google/android/gms/plus/service/v1whitelisted/models/ActivityEntity$ObjectEntity$AttachmentsEntity));
            sFields.put("content", com.google.android.gms.common.server.response.FastJsonResponse.Field.forString("content", 4));
            sFields.put("plusoners", com.google.android.gms.common.server.response.FastJsonResponse.Field.forConcreteType("plusoners", 9, com/google/android/gms/plus/service/v1whitelisted/models/ActivityEntity$ObjectEntity$PlusonersEntity));
            sFields.put("replies", com.google.android.gms.common.server.response.FastJsonResponse.Field.forConcreteType("replies", 10, com/google/android/gms/plus/service/v1whitelisted/models/ActivityEntity$ObjectEntity$RepliesEntity));
        }

        public ObjectEntity()
        {
            mVersionCode = 1;
            mIndicatorSet = new HashSet();
        }

        ObjectEntity(Set set, int i, ActorEntity actorentity, List list, String s, PlusonersEntity plusonersentity, RepliesEntity repliesentity)
        {
            mIndicatorSet = set;
            mVersionCode = i;
            mActor = actorentity;
            mAttachments = list;
            mContent = s;
            mPlusoners = plusonersentity;
            mReplies = repliesentity;
        }
    }

    public static final class ObjectEntity.ActorEntity extends FastSafeParcelableJsonResponse
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
            if (obj instanceof ObjectEntity.ActorEntity) goto _L2; else goto _L1
_L1:
            return false;
_L2:
            Iterator iterator;
            if (this == obj)
            {
                return true;
            }
            obj = (ObjectEntity.ActorEntity)obj;
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
            if (!((ObjectEntity.ActorEntity) (obj)).isFieldSet(field)) goto _L1; else goto _L3
_L3:
            if (getFieldValue(field).equals(((ObjectEntity.ActorEntity) (obj)).getFieldValue(field))) goto _L5; else goto _L4
_L4:
            return false;
            if (!((ObjectEntity.ActorEntity) (obj)).isFieldSet(field)) goto _L5; else goto _L6
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

        public ObjectEntity.ActorEntity()
        {
            mVersionCode = 1;
            mIndicatorSet = new HashSet();
        }

        ObjectEntity.ActorEntity(Set set, int i, String s)
        {
            mIndicatorSet = set;
            mVersionCode = i;
            mDisplayName = s;
        }
    }

    public static final class ObjectEntity.AttachmentsEntity extends FastSafeParcelableJsonResponse
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
            if (obj instanceof ObjectEntity.AttachmentsEntity) goto _L2; else goto _L1
_L1:
            return false;
_L2:
            Iterator iterator;
            if (this == obj)
            {
                return true;
            }
            obj = (ObjectEntity.AttachmentsEntity)obj;
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
            if (!((ObjectEntity.AttachmentsEntity) (obj)).isFieldSet(field)) goto _L1; else goto _L3
_L3:
            if (getFieldValue(field).equals(((ObjectEntity.AttachmentsEntity) (obj)).getFieldValue(field))) goto _L5; else goto _L4
_L4:
            return false;
            if (!((ObjectEntity.AttachmentsEntity) (obj)).isFieldSet(field)) goto _L5; else goto _L6
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

        public ObjectEntity.AttachmentsEntity()
        {
            mVersionCode = 1;
            mIndicatorSet = new HashSet();
        }

        ObjectEntity.AttachmentsEntity(Set set, int i, ActionEntity actionentity, String s, DeepLinkEntity deeplinkentity, String s1, ImageEntity imageentity, 
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

    public static final class ObjectEntity.AttachmentsEntity.ActionEntity extends FastSafeParcelableJsonResponse
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
            if (obj instanceof ObjectEntity.AttachmentsEntity.ActionEntity) goto _L2; else goto _L1
_L1:
            return false;
_L2:
            Iterator iterator;
            if (this == obj)
            {
                return true;
            }
            obj = (ObjectEntity.AttachmentsEntity.ActionEntity)obj;
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
            if (!((ObjectEntity.AttachmentsEntity.ActionEntity) (obj)).isFieldSet(field)) goto _L1; else goto _L3
_L3:
            if (getFieldValue(field).equals(((ObjectEntity.AttachmentsEntity.ActionEntity) (obj)).getFieldValue(field))) goto _L5; else goto _L4
_L4:
            return false;
            if (!((ObjectEntity.AttachmentsEntity.ActionEntity) (obj)).isFieldSet(field)) goto _L5; else goto _L6
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

        public ObjectEntity.AttachmentsEntity.ActionEntity()
        {
            mVersionCode = 1;
            mIndicatorSet = new HashSet();
        }

        ObjectEntity.AttachmentsEntity.ActionEntity(Set set, int i, DeepLinkEntity deeplinkentity, String s, String s1)
        {
            mIndicatorSet = set;
            mVersionCode = i;
            mDeepLink = deeplinkentity;
            mDisplayName = s;
            mType = s1;
        }
    }

    public static final class ObjectEntity.AttachmentsEntity.ActionEntity.DeepLinkEntity extends FastSafeParcelableJsonResponse
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
            if (obj instanceof ObjectEntity.AttachmentsEntity.ActionEntity.DeepLinkEntity) goto _L2; else goto _L1
_L1:
            return false;
_L2:
            Iterator iterator;
            if (this == obj)
            {
                return true;
            }
            obj = (ObjectEntity.AttachmentsEntity.ActionEntity.DeepLinkEntity)obj;
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
            if (!((ObjectEntity.AttachmentsEntity.ActionEntity.DeepLinkEntity) (obj)).isFieldSet(field)) goto _L1; else goto _L3
_L3:
            if (getFieldValue(field).equals(((ObjectEntity.AttachmentsEntity.ActionEntity.DeepLinkEntity) (obj)).getFieldValue(field))) goto _L5; else goto _L4
_L4:
            return false;
            if (!((ObjectEntity.AttachmentsEntity.ActionEntity.DeepLinkEntity) (obj)).isFieldSet(field)) goto _L5; else goto _L6
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

        public ObjectEntity.AttachmentsEntity.ActionEntity.DeepLinkEntity()
        {
            mVersionCode = 1;
            mIndicatorSet = new HashSet();
        }

        ObjectEntity.AttachmentsEntity.ActionEntity.DeepLinkEntity(Set set, int i, String s, String s1)
        {
            mIndicatorSet = set;
            mVersionCode = i;
            mId = s;
            mUrl = s1;
        }
    }

    public static final class ObjectEntity.AttachmentsEntity.DeepLinkEntity extends FastSafeParcelableJsonResponse
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
            if (obj instanceof ObjectEntity.AttachmentsEntity.DeepLinkEntity) goto _L2; else goto _L1
_L1:
            return false;
_L2:
            Iterator iterator;
            if (this == obj)
            {
                return true;
            }
            obj = (ObjectEntity.AttachmentsEntity.DeepLinkEntity)obj;
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
            if (!((ObjectEntity.AttachmentsEntity.DeepLinkEntity) (obj)).isFieldSet(field)) goto _L1; else goto _L3
_L3:
            if (getFieldValue(field).equals(((ObjectEntity.AttachmentsEntity.DeepLinkEntity) (obj)).getFieldValue(field))) goto _L5; else goto _L4
_L4:
            return false;
            if (!((ObjectEntity.AttachmentsEntity.DeepLinkEntity) (obj)).isFieldSet(field)) goto _L5; else goto _L6
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

        public ObjectEntity.AttachmentsEntity.DeepLinkEntity()
        {
            mVersionCode = 1;
            mIndicatorSet = new HashSet();
        }

        ObjectEntity.AttachmentsEntity.DeepLinkEntity(Set set, int i, String s, String s1)
        {
            mIndicatorSet = set;
            mVersionCode = i;
            mId = s;
            mUrl = s1;
        }
    }

    public static final class ObjectEntity.AttachmentsEntity.ImageEntity extends FastSafeParcelableJsonResponse
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
            if (obj instanceof ObjectEntity.AttachmentsEntity.ImageEntity) goto _L2; else goto _L1
_L1:
            return false;
_L2:
            Iterator iterator;
            if (this == obj)
            {
                return true;
            }
            obj = (ObjectEntity.AttachmentsEntity.ImageEntity)obj;
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
            if (!((ObjectEntity.AttachmentsEntity.ImageEntity) (obj)).isFieldSet(field)) goto _L1; else goto _L3
_L3:
            if (getFieldValue(field).equals(((ObjectEntity.AttachmentsEntity.ImageEntity) (obj)).getFieldValue(field))) goto _L5; else goto _L4
_L4:
            return false;
            if (!((ObjectEntity.AttachmentsEntity.ImageEntity) (obj)).isFieldSet(field)) goto _L5; else goto _L6
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

        public ObjectEntity.AttachmentsEntity.ImageEntity()
        {
            mVersionCode = 1;
            mIndicatorSet = new HashSet();
        }

        ObjectEntity.AttachmentsEntity.ImageEntity(Set set, int i, String s)
        {
            mIndicatorSet = set;
            mVersionCode = i;
            mUrl = s;
        }
    }

    public static final class ObjectEntity.AttachmentsEntity.ThumbnailsEntity extends FastSafeParcelableJsonResponse
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
            if (obj instanceof ObjectEntity.AttachmentsEntity.ThumbnailsEntity) goto _L2; else goto _L1
_L1:
            return false;
_L2:
            Iterator iterator;
            if (this == obj)
            {
                return true;
            }
            obj = (ObjectEntity.AttachmentsEntity.ThumbnailsEntity)obj;
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
            if (!((ObjectEntity.AttachmentsEntity.ThumbnailsEntity) (obj)).isFieldSet(field)) goto _L1; else goto _L3
_L3:
            if (getFieldValue(field).equals(((ObjectEntity.AttachmentsEntity.ThumbnailsEntity) (obj)).getFieldValue(field))) goto _L5; else goto _L4
_L4:
            return false;
            if (!((ObjectEntity.AttachmentsEntity.ThumbnailsEntity) (obj)).isFieldSet(field)) goto _L5; else goto _L6
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

        public ObjectEntity.AttachmentsEntity.ThumbnailsEntity()
        {
            mVersionCode = 1;
            mIndicatorSet = new HashSet();
        }

        ObjectEntity.AttachmentsEntity.ThumbnailsEntity(Set set, int i, ImageEntity imageentity, String s)
        {
            mIndicatorSet = set;
            mVersionCode = i;
            mImage = imageentity;
            mUrl = s;
        }
    }

    public static final class ObjectEntity.AttachmentsEntity.ThumbnailsEntity.ImageEntity extends FastSafeParcelableJsonResponse
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
            if (obj instanceof ObjectEntity.AttachmentsEntity.ThumbnailsEntity.ImageEntity) goto _L2; else goto _L1
_L1:
            return false;
_L2:
            Iterator iterator;
            if (this == obj)
            {
                return true;
            }
            obj = (ObjectEntity.AttachmentsEntity.ThumbnailsEntity.ImageEntity)obj;
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
            if (!((ObjectEntity.AttachmentsEntity.ThumbnailsEntity.ImageEntity) (obj)).isFieldSet(field)) goto _L1; else goto _L3
_L3:
            if (getFieldValue(field).equals(((ObjectEntity.AttachmentsEntity.ThumbnailsEntity.ImageEntity) (obj)).getFieldValue(field))) goto _L5; else goto _L4
_L4:
            return false;
            if (!((ObjectEntity.AttachmentsEntity.ThumbnailsEntity.ImageEntity) (obj)).isFieldSet(field)) goto _L5; else goto _L6
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

        public ObjectEntity.AttachmentsEntity.ThumbnailsEntity.ImageEntity()
        {
            mVersionCode = 1;
            mIndicatorSet = new HashSet();
        }

        ObjectEntity.AttachmentsEntity.ThumbnailsEntity.ImageEntity(Set set, int i, String s)
        {
            mIndicatorSet = set;
            mVersionCode = i;
            mUrl = s;
        }
    }

    public static final class ObjectEntity.PlusonersEntity extends FastSafeParcelableJsonResponse
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
            if (obj instanceof ObjectEntity.PlusonersEntity) goto _L2; else goto _L1
_L1:
            return false;
_L2:
            Iterator iterator;
            if (this == obj)
            {
                return true;
            }
            obj = (ObjectEntity.PlusonersEntity)obj;
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
            if (!((ObjectEntity.PlusonersEntity) (obj)).isFieldSet(field)) goto _L1; else goto _L3
_L3:
            if (getFieldValue(field).equals(((ObjectEntity.PlusonersEntity) (obj)).getFieldValue(field))) goto _L5; else goto _L4
_L4:
            return false;
            if (!((ObjectEntity.PlusonersEntity) (obj)).isFieldSet(field)) goto _L5; else goto _L6
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

        public ObjectEntity.PlusonersEntity()
        {
            mVersionCode = 1;
            mIndicatorSet = new HashSet();
        }

        ObjectEntity.PlusonersEntity(Set set, int i, int j)
        {
            mIndicatorSet = set;
            mVersionCode = i;
            mTotalItems = j;
        }
    }

    public static final class ObjectEntity.RepliesEntity extends FastSafeParcelableJsonResponse
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
            if (obj instanceof ObjectEntity.RepliesEntity) goto _L2; else goto _L1
_L1:
            return false;
_L2:
            Iterator iterator;
            if (this == obj)
            {
                return true;
            }
            obj = (ObjectEntity.RepliesEntity)obj;
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
            if (!((ObjectEntity.RepliesEntity) (obj)).isFieldSet(field)) goto _L1; else goto _L3
_L3:
            if (getFieldValue(field).equals(((ObjectEntity.RepliesEntity) (obj)).getFieldValue(field))) goto _L5; else goto _L4
_L4:
            return false;
            if (!((ObjectEntity.RepliesEntity) (obj)).isFieldSet(field)) goto _L5; else goto _L6
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
            sFields = hashmap;
            hashmap.put("totalItems", com.google.android.gms.common.server.response.FastJsonResponse.Field.forInteger("totalItems", 4));
        }

        public ObjectEntity.RepliesEntity()
        {
            mVersionCode = 1;
            mIndicatorSet = new HashSet();
        }

        ObjectEntity.RepliesEntity(Set set, int i, int j)
        {
            mIndicatorSet = set;
            mVersionCode = i;
            mTotalItems = j;
        }
    }


    public static final ActivityEntityCreator CREATOR = new ActivityEntityCreator();
    private static final HashMap sFields;
    AclEntity mAccess;
    String mAnnotation;
    String mId;
    final Set mIndicatorSet;
    ObjectEntity mObject;
    String mPlaceName;
    String mPublished;
    String mUpdated;
    String mUrl;
    String mVerb;
    final int mVersionCode;

    public ActivityEntity()
    {
        mVersionCode = 1;
        mIndicatorSet = new HashSet();
    }

    ActivityEntity(Set set, int i, AclEntity aclentity, String s, String s1, ObjectEntity objectentity, String s2, 
            String s3, String s4, String s5, String s6)
    {
        mIndicatorSet = set;
        mVersionCode = i;
        mAccess = aclentity;
        mAnnotation = s;
        mId = s1;
        mObject = objectentity;
        mPlaceName = s2;
        mPublished = s3;
        mUpdated = s4;
        mUrl = s5;
        mVerb = s6;
    }

    public final void addConcreteTypeInternal(com.google.android.gms.common.server.response.FastJsonResponse.Field field, String s, FastJsonResponse fastjsonresponse)
    {
        int i = field.getSafeParcelableFieldId();
        i;
        JVM INSTR lookupswitch 2: default 36
    //                   2: 81
    //                   15: 105;
           goto _L1 _L2 _L3
_L1:
        throw new IllegalArgumentException((new StringBuilder("Field with id=")).append(i).append(" is not a known custom type.  Found ").append(fastjsonresponse.getClass().getCanonicalName()).append(".").toString());
_L2:
        mAccess = (AclEntity)fastjsonresponse;
_L5:
        mIndicatorSet.add(Integer.valueOf(i));
        return;
_L3:
        mObject = (ObjectEntity)fastjsonresponse;
        if (true) goto _L5; else goto _L4
_L4:
    }

    public final int describeContents()
    {
        return 0;
    }

    public final boolean equals(Object obj)
    {
        if (obj instanceof ActivityEntity) goto _L2; else goto _L1
_L1:
        return false;
_L2:
        Iterator iterator;
        if (this == obj)
        {
            return true;
        }
        obj = (ActivityEntity)obj;
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
        if (!((ActivityEntity) (obj)).isFieldSet(field)) goto _L1; else goto _L3
_L3:
        if (getFieldValue(field).equals(((ActivityEntity) (obj)).getFieldValue(field))) goto _L5; else goto _L4
_L4:
        return false;
        if (!((ActivityEntity) (obj)).isFieldSet(field)) goto _L5; else goto _L6
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
            return mAccess;

        case 5: // '\005'
            return mAnnotation;

        case 10: // '\n'
            return mId;

        case 15: // '\017'
            return mObject;

        case 17: // '\021'
            return mPlaceName;

        case 19: // '\023'
            return mPublished;

        case 23: // '\027'
            return mUpdated;

        case 24: // '\030'
            return mUrl;

        case 25: // '\031'
            return mVerb;
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
        JVM INSTR lookupswitch 7: default 76
    //                   5: 106
    //                   10: 127
    //                   17: 135
    //                   19: 143
    //                   23: 151
    //                   24: 159
    //                   25: 167;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8
_L1:
        throw new IllegalArgumentException((new StringBuilder("Field with id=")).append(i).append(" is not known to be a String.").toString());
_L2:
        mAnnotation = s1;
_L10:
        mIndicatorSet.add(Integer.valueOf(i));
        return;
_L3:
        mId = s1;
        continue; /* Loop/switch isn't completed */
_L4:
        mPlaceName = s1;
        continue; /* Loop/switch isn't completed */
_L5:
        mPublished = s1;
        continue; /* Loop/switch isn't completed */
_L6:
        mUpdated = s1;
        continue; /* Loop/switch isn't completed */
_L7:
        mUrl = s1;
        continue; /* Loop/switch isn't completed */
_L8:
        mVerb = s1;
        if (true) goto _L10; else goto _L9
_L9:
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        ActivityEntityCreator.writeToParcel(this, parcel, i);
    }

    static 
    {
        HashMap hashmap = new HashMap();
        sFields = hashmap;
        hashmap.put("access", com.google.android.gms.common.server.response.FastJsonResponse.Field.forConcreteType("access", 2, com/google/android/gms/plus/service/v1whitelisted/models/AclEntity));
        sFields.put("annotation", com.google.android.gms.common.server.response.FastJsonResponse.Field.forString("annotation", 5));
        sFields.put("id", com.google.android.gms.common.server.response.FastJsonResponse.Field.forString("id", 10));
        sFields.put("object", com.google.android.gms.common.server.response.FastJsonResponse.Field.forConcreteType("object", 15, com/google/android/gms/plus/service/v1whitelisted/models/ActivityEntity$ObjectEntity));
        sFields.put("placeName", com.google.android.gms.common.server.response.FastJsonResponse.Field.forString("placeName", 17));
        sFields.put("published", com.google.android.gms.common.server.response.FastJsonResponse.Field.forString("published", 19));
        sFields.put("updated", com.google.android.gms.common.server.response.FastJsonResponse.Field.forString("updated", 23));
        sFields.put("url", com.google.android.gms.common.server.response.FastJsonResponse.Field.forString("url", 24));
        sFields.put("verb", com.google.android.gms.common.server.response.FastJsonResponse.Field.forString("verb", 25));
    }
}
