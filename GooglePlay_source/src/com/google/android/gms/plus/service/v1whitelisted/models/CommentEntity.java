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
//            Comment, CommentEntityCreator, CommentEntity_ActorEntityCreator, CommentEntity_InReplyToEntityCreator, 
//            CommentEntity_ObjectEntityCreator, CommentEntity_PlusonersEntityCreator, CommentEntity_StatusForViewerEntityCreator

public final class CommentEntity extends FastSafeParcelableJsonResponse
    implements Comment
{
    public static final class ActorEntity extends FastSafeParcelableJsonResponse
        implements Comment.Actor
    {

        public static final CommentEntity_ActorEntityCreator CREATOR = new CommentEntity_ActorEntityCreator();
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
            CommentEntity_ActorEntityCreator.writeToParcel$10d47100(this, parcel);
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

    public static final class InReplyToEntity extends FastSafeParcelableJsonResponse
        implements Comment.InReplyTo
    {

        public static final CommentEntity_InReplyToEntityCreator CREATOR = new CommentEntity_InReplyToEntityCreator();
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
            if (obj instanceof InReplyToEntity) goto _L2; else goto _L1
_L1:
            return false;
_L2:
            Iterator iterator;
            if (this == obj)
            {
                return true;
            }
            obj = (InReplyToEntity)obj;
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
            if (!((InReplyToEntity) (obj)).isFieldSet(field)) goto _L1; else goto _L3
_L3:
            if (getFieldValue(field).equals(((InReplyToEntity) (obj)).getFieldValue(field))) goto _L5; else goto _L4
_L4:
            return false;
            if (!((InReplyToEntity) (obj)).isFieldSet(field)) goto _L5; else goto _L6
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
            CommentEntity_InReplyToEntityCreator.writeToParcel$6cab8fb5(this, parcel);
        }

        static 
        {
            HashMap hashmap = new HashMap();
            sFields = hashmap;
            hashmap.put("id", com.google.android.gms.common.server.response.FastJsonResponse.Field.forString("id", 2));
            sFields.put("url", com.google.android.gms.common.server.response.FastJsonResponse.Field.forString("url", 3));
        }

        public InReplyToEntity()
        {
            mVersionCode = 1;
            mIndicatorSet = new HashSet();
        }

        InReplyToEntity(Set set, int i, String s, String s1)
        {
            mIndicatorSet = set;
            mVersionCode = i;
            mId = s;
            mUrl = s1;
        }
    }

    public static final class ObjectEntity extends FastSafeParcelableJsonResponse
        implements Comment.PlusObject
    {

        public static final CommentEntity_ObjectEntityCreator CREATOR = new CommentEntity_ObjectEntityCreator();
        private static final HashMap sFields;
        String mContent;
        final Set mIndicatorSet;
        final int mVersionCode;

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
            default:
                throw new IllegalStateException((new StringBuilder("Unknown safe parcelable id=")).append(field.getSafeParcelableFieldId()).toString());

            case 2: // '\002'
                return mContent;
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
                mContent = s1;
                break;
            }
            mIndicatorSet.add(Integer.valueOf(i));
        }

        public final void writeToParcel(Parcel parcel, int i)
        {
            CommentEntity_ObjectEntityCreator.writeToParcel$49f165c2(this, parcel);
        }

        static 
        {
            HashMap hashmap = new HashMap();
            sFields = hashmap;
            hashmap.put("content", com.google.android.gms.common.server.response.FastJsonResponse.Field.forString("content", 2));
        }

        public ObjectEntity()
        {
            mVersionCode = 1;
            mIndicatorSet = new HashSet();
        }

        ObjectEntity(Set set, int i, String s)
        {
            mIndicatorSet = set;
            mVersionCode = i;
            mContent = s;
        }
    }

    public static final class PlusonersEntity extends FastSafeParcelableJsonResponse
        implements Comment.Plusoners
    {

        public static final CommentEntity_PlusonersEntityCreator CREATOR = new CommentEntity_PlusonersEntityCreator();
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

            case 2: // '\002'
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

            case 2: // '\002'
                mTotalItems = i;
                break;
            }
            mIndicatorSet.add(Integer.valueOf(j));
        }

        public final void writeToParcel(Parcel parcel, int i)
        {
            CommentEntity_PlusonersEntityCreator.writeToParcel$3e23f28(this, parcel);
        }

        static 
        {
            HashMap hashmap = new HashMap();
            sFields = hashmap;
            hashmap.put("totalItems", com.google.android.gms.common.server.response.FastJsonResponse.Field.forInteger("totalItems", 2));
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

    public static final class StatusForViewerEntity extends FastSafeParcelableJsonResponse
        implements Comment.StatusForViewer
    {

        public static final CommentEntity_StatusForViewerEntityCreator CREATOR = new CommentEntity_StatusForViewerEntityCreator();
        private static final HashMap sFields;
        final Set mIndicatorSet;
        boolean mIsPlusOned;
        final int mVersionCode;

        public final int describeContents()
        {
            return 0;
        }

        public final boolean equals(Object obj)
        {
            if (obj instanceof StatusForViewerEntity) goto _L2; else goto _L1
_L1:
            return false;
_L2:
            Iterator iterator;
            if (this == obj)
            {
                return true;
            }
            obj = (StatusForViewerEntity)obj;
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
            if (!((StatusForViewerEntity) (obj)).isFieldSet(field)) goto _L1; else goto _L3
_L3:
            if (getFieldValue(field).equals(((StatusForViewerEntity) (obj)).getFieldValue(field))) goto _L5; else goto _L4
_L4:
            return false;
            if (!((StatusForViewerEntity) (obj)).isFieldSet(field)) goto _L5; else goto _L6
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
                return Boolean.valueOf(mIsPlusOned);
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

            case 3: // '\003'
                mIsPlusOned = flag;
                break;
            }
            mIndicatorSet.add(Integer.valueOf(i));
        }

        public final void writeToParcel(Parcel parcel, int i)
        {
            CommentEntity_StatusForViewerEntityCreator.writeToParcel$7d5dae8c(this, parcel);
        }

        static 
        {
            HashMap hashmap = new HashMap();
            sFields = hashmap;
            hashmap.put("isPlusOned", com.google.android.gms.common.server.response.FastJsonResponse.Field.forBoolean("isPlusOned", 3));
        }

        public StatusForViewerEntity()
        {
            mVersionCode = 1;
            mIndicatorSet = new HashSet();
        }

        StatusForViewerEntity(Set set, int i, boolean flag)
        {
            mIndicatorSet = set;
            mVersionCode = i;
            mIsPlusOned = flag;
        }
    }


    public static final CommentEntityCreator CREATOR = new CommentEntityCreator();
    private static final HashMap sFields;
    ActorEntity mActor;
    String mId;
    List mInReplyTo;
    final Set mIndicatorSet;
    ObjectEntity mObject;
    PlusonersEntity mPlusoners;
    String mPublished;
    StatusForViewerEntity mStatusForViewer;
    String mUpdated;
    final int mVersionCode;

    public CommentEntity()
    {
        mVersionCode = 1;
        mIndicatorSet = new HashSet();
    }

    CommentEntity(Set set, int i, ActorEntity actorentity, String s, List list, ObjectEntity objectentity, PlusonersEntity plusonersentity, 
            String s1, StatusForViewerEntity statusforviewerentity, String s2)
    {
        mIndicatorSet = set;
        mVersionCode = i;
        mActor = actorentity;
        mId = s;
        mInReplyTo = list;
        mObject = objectentity;
        mPlusoners = plusonersentity;
        mPublished = s1;
        mStatusForViewer = statusforviewerentity;
        mUpdated = s2;
    }

    public final void addConcreteTypeArrayInternal(com.google.android.gms.common.server.response.FastJsonResponse.Field field, String s, ArrayList arraylist)
    {
        int i = field.getSafeParcelableFieldId();
        switch (i)
        {
        default:
            throw new IllegalArgumentException((new StringBuilder("Field with id=")).append(i).append(" is not a known array of custom type.  Found ").append(arraylist.getClass().getCanonicalName()).append(".").toString());

        case 5: // '\005'
            mInReplyTo = arraylist;
            break;
        }
        mIndicatorSet.add(Integer.valueOf(i));
    }

    public final void addConcreteTypeInternal(com.google.android.gms.common.server.response.FastJsonResponse.Field field, String s, FastJsonResponse fastjsonresponse)
    {
        int i = field.getSafeParcelableFieldId();
        i;
        JVM INSTR lookupswitch 4: default 52
    //                   2: 97
    //                   7: 121
    //                   8: 132
    //                   11: 143;
           goto _L1 _L2 _L3 _L4 _L5
_L1:
        throw new IllegalArgumentException((new StringBuilder("Field with id=")).append(i).append(" is not a known custom type.  Found ").append(fastjsonresponse.getClass().getCanonicalName()).append(".").toString());
_L2:
        mActor = (ActorEntity)fastjsonresponse;
_L7:
        mIndicatorSet.add(Integer.valueOf(i));
        return;
_L3:
        mObject = (ObjectEntity)fastjsonresponse;
        continue; /* Loop/switch isn't completed */
_L4:
        mPlusoners = (PlusonersEntity)fastjsonresponse;
        continue; /* Loop/switch isn't completed */
_L5:
        mStatusForViewer = (StatusForViewerEntity)fastjsonresponse;
        if (true) goto _L7; else goto _L6
_L6:
    }

    public final int describeContents()
    {
        return 0;
    }

    public final boolean equals(Object obj)
    {
        if (obj instanceof CommentEntity) goto _L2; else goto _L1
_L1:
        return false;
_L2:
        Iterator iterator;
        if (this == obj)
        {
            return true;
        }
        obj = (CommentEntity)obj;
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
        if (!((CommentEntity) (obj)).isFieldSet(field)) goto _L1; else goto _L3
_L3:
        if (getFieldValue(field).equals(((CommentEntity) (obj)).getFieldValue(field))) goto _L5; else goto _L4
_L4:
        return false;
        if (!((CommentEntity) (obj)).isFieldSet(field)) goto _L5; else goto _L6
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
        case 6: // '\006'
        case 10: // '\n'
        default:
            throw new IllegalStateException((new StringBuilder("Unknown safe parcelable id=")).append(field.getSafeParcelableFieldId()).toString());

        case 2: // '\002'
            return mActor;

        case 4: // '\004'
            return mId;

        case 5: // '\005'
            return mInReplyTo;

        case 7: // '\007'
            return mObject;

        case 8: // '\b'
            return mPlusoners;

        case 9: // '\t'
            return mPublished;

        case 11: // '\013'
            return mStatusForViewer;

        case 12: // '\f'
            return mUpdated;
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
        JVM INSTR lookupswitch 3: default 44
    //                   4: 74
    //                   9: 95
    //                   12: 103;
           goto _L1 _L2 _L3 _L4
_L1:
        throw new IllegalArgumentException((new StringBuilder("Field with id=")).append(i).append(" is not known to be a String.").toString());
_L2:
        mId = s1;
_L6:
        mIndicatorSet.add(Integer.valueOf(i));
        return;
_L3:
        mPublished = s1;
        continue; /* Loop/switch isn't completed */
_L4:
        mUpdated = s1;
        if (true) goto _L6; else goto _L5
_L5:
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        CommentEntityCreator.writeToParcel(this, parcel, i);
    }

    static 
    {
        HashMap hashmap = new HashMap();
        sFields = hashmap;
        hashmap.put("actor", com.google.android.gms.common.server.response.FastJsonResponse.Field.forConcreteType("actor", 2, com/google/android/gms/plus/service/v1whitelisted/models/CommentEntity$ActorEntity));
        sFields.put("id", com.google.android.gms.common.server.response.FastJsonResponse.Field.forString("id", 4));
        sFields.put("inReplyTo", com.google.android.gms.common.server.response.FastJsonResponse.Field.forConcreteTypeArray("inReplyTo", 5, com/google/android/gms/plus/service/v1whitelisted/models/CommentEntity$InReplyToEntity));
        sFields.put("object", com.google.android.gms.common.server.response.FastJsonResponse.Field.forConcreteType("object", 7, com/google/android/gms/plus/service/v1whitelisted/models/CommentEntity$ObjectEntity));
        sFields.put("plusoners", com.google.android.gms.common.server.response.FastJsonResponse.Field.forConcreteType("plusoners", 8, com/google/android/gms/plus/service/v1whitelisted/models/CommentEntity$PlusonersEntity));
        sFields.put("published", com.google.android.gms.common.server.response.FastJsonResponse.Field.forString("published", 9));
        sFields.put("statusForViewer", com.google.android.gms.common.server.response.FastJsonResponse.Field.forConcreteType("statusForViewer", 11, com/google/android/gms/plus/service/v1whitelisted/models/CommentEntity$StatusForViewerEntity));
        sFields.put("updated", com.google.android.gms.common.server.response.FastJsonResponse.Field.forString("updated", 12));
    }
}
