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
//            AccountFieldEntity, AccountFieldCreator, AccountField_ErrorsEntityCreator, AccountField_ErrorsEntity_ReferencesEntityCreator, 
//            AccountField_LabelEntityCreator, AccountField_LabelEntity_ReferencesEntityCreator, AccountField_OptionsEntityCreator, AccountField_ValueEntityCreator, 
//            AccountField_ValueEntity_NameEntityCreator

public final class AccountField extends FastSafeParcelableJsonResponse
    implements AccountFieldEntity
{
    public static final class ErrorsEntity extends FastSafeParcelableJsonResponse
        implements AccountFieldEntity.Errors
    {

        public static final AccountField_ErrorsEntityCreator CREATOR = new AccountField_ErrorsEntityCreator();
        private static final HashMap sFields;
        String mId;
        final Set mIndicatorSet;
        List mReferences;
        String mText;
        final int mVersionCode;

        public final void addConcreteTypeArrayInternal(com.google.android.gms.common.server.response.FastJsonResponse.Field field, String s, ArrayList arraylist)
        {
            int i = field.getSafeParcelableFieldId();
            switch (i)
            {
            default:
                throw new IllegalArgumentException((new StringBuilder("Field with id=")).append(i).append(" is not a known array of custom type.  Found ").append(arraylist.getClass().getCanonicalName()).append(".").toString());

            case 3: // '\003'
                mReferences = arraylist;
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
            if (obj instanceof ErrorsEntity) goto _L2; else goto _L1
_L1:
            return false;
_L2:
            Iterator iterator;
            if (this == obj)
            {
                return true;
            }
            obj = (ErrorsEntity)obj;
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
            if (!((ErrorsEntity) (obj)).isFieldSet(field)) goto _L1; else goto _L3
_L3:
            if (getFieldValue(field).equals(((ErrorsEntity) (obj)).getFieldValue(field))) goto _L5; else goto _L4
_L4:
            return false;
            if (!((ErrorsEntity) (obj)).isFieldSet(field)) goto _L5; else goto _L6
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
                return mReferences;

            case 4: // '\004'
                return mText;
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
            JVM INSTR tableswitch 2 4: default 36
        //                       2 66
        //                       3 36
        //                       4 87;
               goto _L1 _L2 _L1 _L3
_L1:
            throw new IllegalArgumentException((new StringBuilder("Field with id=")).append(i).append(" is not known to be a String.").toString());
_L2:
            mId = s1;
_L5:
            mIndicatorSet.add(Integer.valueOf(i));
            return;
_L3:
            mText = s1;
            if (true) goto _L5; else goto _L4
_L4:
        }

        public final void writeToParcel(Parcel parcel, int i)
        {
            AccountField_ErrorsEntityCreator.writeToParcel$7186200f(this, parcel);
        }

        static 
        {
            HashMap hashmap = new HashMap();
            sFields = hashmap;
            hashmap.put("id", com.google.android.gms.common.server.response.FastJsonResponse.Field.forString("id", 2));
            sFields.put("references", com.google.android.gms.common.server.response.FastJsonResponse.Field.forConcreteTypeArray("references", 3, com/google/android/gms/plus/service/v1whitelisted/models/AccountField$ErrorsEntity$ReferencesEntity));
            sFields.put("text", com.google.android.gms.common.server.response.FastJsonResponse.Field.forString("text", 4));
        }

        public ErrorsEntity()
        {
            mVersionCode = 1;
            mIndicatorSet = new HashSet();
        }

        ErrorsEntity(Set set, int i, String s, List list, String s1)
        {
            mIndicatorSet = set;
            mVersionCode = i;
            mId = s;
            mReferences = list;
            mText = s1;
        }
    }

    public static final class ErrorsEntity.ReferencesEntity extends FastSafeParcelableJsonResponse
        implements AccountFieldEntity.Errors.References
    {

        public static final AccountField_ErrorsEntity_ReferencesEntityCreator CREATOR = new AccountField_ErrorsEntity_ReferencesEntityCreator();
        private static final HashMap sFields;
        String mId;
        final Set mIndicatorSet;
        String mText;
        String mTitle;
        final int mVersionCode;

        public final int describeContents()
        {
            return 0;
        }

        public final boolean equals(Object obj)
        {
            if (obj instanceof ErrorsEntity.ReferencesEntity) goto _L2; else goto _L1
_L1:
            return false;
_L2:
            Iterator iterator;
            if (this == obj)
            {
                return true;
            }
            obj = (ErrorsEntity.ReferencesEntity)obj;
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
            if (!((ErrorsEntity.ReferencesEntity) (obj)).isFieldSet(field)) goto _L1; else goto _L3
_L3:
            if (getFieldValue(field).equals(((ErrorsEntity.ReferencesEntity) (obj)).getFieldValue(field))) goto _L5; else goto _L4
_L4:
            return false;
            if (!((ErrorsEntity.ReferencesEntity) (obj)).isFieldSet(field)) goto _L5; else goto _L6
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
                return mText;

            case 4: // '\004'
                return mTitle;
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
            JVM INSTR tableswitch 2 4: default 36
        //                       2 66
        //                       3 87
        //                       4 95;
               goto _L1 _L2 _L3 _L4
_L1:
            throw new IllegalArgumentException((new StringBuilder("Field with id=")).append(i).append(" is not known to be a String.").toString());
_L2:
            mId = s1;
_L6:
            mIndicatorSet.add(Integer.valueOf(i));
            return;
_L3:
            mText = s1;
            continue; /* Loop/switch isn't completed */
_L4:
            mTitle = s1;
            if (true) goto _L6; else goto _L5
_L5:
        }

        public final void writeToParcel(Parcel parcel, int i)
        {
            AccountField_ErrorsEntity_ReferencesEntityCreator.writeToParcel$7b791e44(this, parcel);
        }

        static 
        {
            HashMap hashmap = new HashMap();
            sFields = hashmap;
            hashmap.put("id", com.google.android.gms.common.server.response.FastJsonResponse.Field.forString("id", 2));
            sFields.put("text", com.google.android.gms.common.server.response.FastJsonResponse.Field.forString("text", 3));
            sFields.put("title", com.google.android.gms.common.server.response.FastJsonResponse.Field.forString("title", 4));
        }

        public ErrorsEntity.ReferencesEntity()
        {
            mVersionCode = 1;
            mIndicatorSet = new HashSet();
        }

        ErrorsEntity.ReferencesEntity(Set set, int i, String s, String s1, String s2)
        {
            mIndicatorSet = set;
            mVersionCode = i;
            mId = s;
            mText = s1;
            mTitle = s2;
        }
    }

    public static final class LabelEntity extends FastSafeParcelableJsonResponse
        implements AccountFieldEntity.Label
    {

        public static final AccountField_LabelEntityCreator CREATOR = new AccountField_LabelEntityCreator();
        private static final HashMap sFields;
        final Set mIndicatorSet;
        List mReferences;
        String mText;
        final int mVersionCode;

        public final void addConcreteTypeArrayInternal(com.google.android.gms.common.server.response.FastJsonResponse.Field field, String s, ArrayList arraylist)
        {
            int i = field.getSafeParcelableFieldId();
            switch (i)
            {
            default:
                throw new IllegalArgumentException((new StringBuilder("Field with id=")).append(i).append(" is not a known array of custom type.  Found ").append(arraylist.getClass().getCanonicalName()).append(".").toString());

            case 2: // '\002'
                mReferences = arraylist;
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
            if (obj instanceof LabelEntity) goto _L2; else goto _L1
_L1:
            return false;
_L2:
            Iterator iterator;
            if (this == obj)
            {
                return true;
            }
            obj = (LabelEntity)obj;
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
            if (!((LabelEntity) (obj)).isFieldSet(field)) goto _L1; else goto _L3
_L3:
            if (getFieldValue(field).equals(((LabelEntity) (obj)).getFieldValue(field))) goto _L5; else goto _L4
_L4:
            return false;
            if (!((LabelEntity) (obj)).isFieldSet(field)) goto _L5; else goto _L6
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
                return mReferences;

            case 3: // '\003'
                return mText;
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

            case 3: // '\003'
                mText = s1;
                break;
            }
            mIndicatorSet.add(Integer.valueOf(i));
        }

        public final void writeToParcel(Parcel parcel, int i)
        {
            AccountField_LabelEntityCreator.writeToParcel$1633fdda(this, parcel);
        }

        static 
        {
            HashMap hashmap = new HashMap();
            sFields = hashmap;
            hashmap.put("references", com.google.android.gms.common.server.response.FastJsonResponse.Field.forConcreteTypeArray("references", 2, com/google/android/gms/plus/service/v1whitelisted/models/AccountField$LabelEntity$ReferencesEntity));
            sFields.put("text", com.google.android.gms.common.server.response.FastJsonResponse.Field.forString("text", 3));
        }

        public LabelEntity()
        {
            mVersionCode = 1;
            mIndicatorSet = new HashSet();
        }

        LabelEntity(Set set, int i, List list, String s)
        {
            mIndicatorSet = set;
            mVersionCode = i;
            mReferences = list;
            mText = s;
        }
    }

    public static final class LabelEntity.ReferencesEntity extends FastSafeParcelableJsonResponse
        implements AccountFieldEntity.Label.References
    {

        public static final AccountField_LabelEntity_ReferencesEntityCreator CREATOR = new AccountField_LabelEntity_ReferencesEntityCreator();
        private static final HashMap sFields;
        String mId;
        final Set mIndicatorSet;
        String mText;
        String mTitle;
        final int mVersionCode;

        public final int describeContents()
        {
            return 0;
        }

        public final boolean equals(Object obj)
        {
            if (obj instanceof LabelEntity.ReferencesEntity) goto _L2; else goto _L1
_L1:
            return false;
_L2:
            Iterator iterator;
            if (this == obj)
            {
                return true;
            }
            obj = (LabelEntity.ReferencesEntity)obj;
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
            if (!((LabelEntity.ReferencesEntity) (obj)).isFieldSet(field)) goto _L1; else goto _L3
_L3:
            if (getFieldValue(field).equals(((LabelEntity.ReferencesEntity) (obj)).getFieldValue(field))) goto _L5; else goto _L4
_L4:
            return false;
            if (!((LabelEntity.ReferencesEntity) (obj)).isFieldSet(field)) goto _L5; else goto _L6
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
                return mText;

            case 4: // '\004'
                return mTitle;
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
            JVM INSTR tableswitch 2 4: default 36
        //                       2 66
        //                       3 87
        //                       4 95;
               goto _L1 _L2 _L3 _L4
_L1:
            throw new IllegalArgumentException((new StringBuilder("Field with id=")).append(i).append(" is not known to be a String.").toString());
_L2:
            mId = s1;
_L6:
            mIndicatorSet.add(Integer.valueOf(i));
            return;
_L3:
            mText = s1;
            continue; /* Loop/switch isn't completed */
_L4:
            mTitle = s1;
            if (true) goto _L6; else goto _L5
_L5:
        }

        public final void writeToParcel(Parcel parcel, int i)
        {
            AccountField_LabelEntity_ReferencesEntityCreator.writeToParcel$9b0d027(this, parcel);
        }

        static 
        {
            HashMap hashmap = new HashMap();
            sFields = hashmap;
            hashmap.put("id", com.google.android.gms.common.server.response.FastJsonResponse.Field.forString("id", 2));
            sFields.put("text", com.google.android.gms.common.server.response.FastJsonResponse.Field.forString("text", 3));
            sFields.put("title", com.google.android.gms.common.server.response.FastJsonResponse.Field.forString("title", 4));
        }

        public LabelEntity.ReferencesEntity()
        {
            mVersionCode = 1;
            mIndicatorSet = new HashSet();
        }

        LabelEntity.ReferencesEntity(Set set, int i, String s, String s1, String s2)
        {
            mIndicatorSet = set;
            mVersionCode = i;
            mId = s;
            mText = s1;
            mTitle = s2;
        }
    }

    public static final class OptionsEntity extends FastSafeParcelableJsonResponse
        implements AccountFieldEntity.Options
    {

        public static final AccountField_OptionsEntityCreator CREATOR = new AccountField_OptionsEntityCreator();
        private static final HashMap sFields;
        String mId;
        final Set mIndicatorSet;
        String mText;
        final int mVersionCode;

        public final int describeContents()
        {
            return 0;
        }

        public final boolean equals(Object obj)
        {
            if (obj instanceof OptionsEntity) goto _L2; else goto _L1
_L1:
            return false;
_L2:
            Iterator iterator;
            if (this == obj)
            {
                return true;
            }
            obj = (OptionsEntity)obj;
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
            if (!((OptionsEntity) (obj)).isFieldSet(field)) goto _L1; else goto _L3
_L3:
            if (getFieldValue(field).equals(((OptionsEntity) (obj)).getFieldValue(field))) goto _L5; else goto _L4
_L4:
            return false;
            if (!((OptionsEntity) (obj)).isFieldSet(field)) goto _L5; else goto _L6
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
                return mText;
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
            mText = s1;
            if (true) goto _L5; else goto _L4
_L4:
        }

        public final void writeToParcel(Parcel parcel, int i)
        {
            AccountField_OptionsEntityCreator.writeToParcel$299ed104(this, parcel);
        }

        static 
        {
            HashMap hashmap = new HashMap();
            sFields = hashmap;
            hashmap.put("id", com.google.android.gms.common.server.response.FastJsonResponse.Field.forString("id", 2));
            sFields.put("text", com.google.android.gms.common.server.response.FastJsonResponse.Field.forString("text", 3));
        }

        public OptionsEntity()
        {
            mVersionCode = 1;
            mIndicatorSet = new HashSet();
        }

        OptionsEntity(Set set, int i, String s, String s1)
        {
            mIndicatorSet = set;
            mVersionCode = i;
            mId = s;
            mText = s1;
        }
    }

    public static final class ValueEntity extends FastSafeParcelableJsonResponse
        implements AccountFieldEntity.Value
    {

        public static final AccountField_ValueEntityCreator CREATOR = new AccountField_ValueEntityCreator();
        private static final HashMap sFields;
        boolean mCheck;
        String mDate;
        final Set mIndicatorSet;
        NameEntity mName;
        String mOption;
        String mString;
        final int mVersionCode;

        public final void addConcreteTypeInternal(com.google.android.gms.common.server.response.FastJsonResponse.Field field, String s, FastJsonResponse fastjsonresponse)
        {
            int i = field.getSafeParcelableFieldId();
            switch (i)
            {
            default:
                throw new IllegalArgumentException((new StringBuilder("Field with id=")).append(i).append(" is not a known custom type.  Found ").append(fastjsonresponse.getClass().getCanonicalName()).append(".").toString());

            case 4: // '\004'
                mName = (NameEntity)fastjsonresponse;
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
            if (obj instanceof ValueEntity) goto _L2; else goto _L1
_L1:
            return false;
_L2:
            Iterator iterator;
            if (this == obj)
            {
                return true;
            }
            obj = (ValueEntity)obj;
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
            if (!((ValueEntity) (obj)).isFieldSet(field)) goto _L1; else goto _L3
_L3:
            if (getFieldValue(field).equals(((ValueEntity) (obj)).getFieldValue(field))) goto _L5; else goto _L4
_L4:
            return false;
            if (!((ValueEntity) (obj)).isFieldSet(field)) goto _L5; else goto _L6
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
                return Boolean.valueOf(mCheck);

            case 3: // '\003'
                return mDate;

            case 4: // '\004'
                return mName;

            case 5: // '\005'
                return mOption;

            case 6: // '\006'
                return mString;
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
                mCheck = flag;
                break;
            }
            mIndicatorSet.add(Integer.valueOf(i));
        }

        protected final void setStringInternal(com.google.android.gms.common.server.response.FastJsonResponse.Field field, String s, String s1)
        {
            int i = field.getSafeParcelableFieldId();
            i;
            JVM INSTR tableswitch 3 6: default 40
        //                       3 70
        //                       4 40
        //                       5 91
        //                       6 99;
               goto _L1 _L2 _L1 _L3 _L4
_L1:
            throw new IllegalArgumentException((new StringBuilder("Field with id=")).append(i).append(" is not known to be a String.").toString());
_L2:
            mDate = s1;
_L6:
            mIndicatorSet.add(Integer.valueOf(i));
            return;
_L3:
            mOption = s1;
            continue; /* Loop/switch isn't completed */
_L4:
            mString = s1;
            if (true) goto _L6; else goto _L5
_L5:
        }

        public final void writeToParcel(Parcel parcel, int i)
        {
            AccountField_ValueEntityCreator.writeToParcel(this, parcel, i);
        }

        static 
        {
            HashMap hashmap = new HashMap();
            sFields = hashmap;
            hashmap.put("check", com.google.android.gms.common.server.response.FastJsonResponse.Field.forBoolean("check", 2));
            sFields.put("date", com.google.android.gms.common.server.response.FastJsonResponse.Field.forString("date", 3));
            sFields.put("name", com.google.android.gms.common.server.response.FastJsonResponse.Field.forConcreteType("name", 4, com/google/android/gms/plus/service/v1whitelisted/models/AccountField$ValueEntity$NameEntity));
            sFields.put("option", com.google.android.gms.common.server.response.FastJsonResponse.Field.forString("option", 5));
            sFields.put("string", com.google.android.gms.common.server.response.FastJsonResponse.Field.forString("string", 6));
        }

        public ValueEntity()
        {
            mVersionCode = 1;
            mIndicatorSet = new HashSet();
        }

        ValueEntity(Set set, int i, boolean flag, String s, NameEntity nameentity, String s1, String s2)
        {
            mIndicatorSet = set;
            mVersionCode = i;
            mCheck = flag;
            mDate = s;
            mName = nameentity;
            mOption = s1;
            mString = s2;
        }
    }

    public static final class ValueEntity.NameEntity extends FastSafeParcelableJsonResponse
        implements AccountFieldEntity.Value.Name
    {

        public static final AccountField_ValueEntity_NameEntityCreator CREATOR = new AccountField_ValueEntity_NameEntityCreator();
        private static final HashMap sFields;
        String mFamily;
        String mGiven;
        final Set mIndicatorSet;
        boolean mReadOnly;
        final int mVersionCode;

        public final int describeContents()
        {
            return 0;
        }

        public final boolean equals(Object obj)
        {
            if (obj instanceof ValueEntity.NameEntity) goto _L2; else goto _L1
_L1:
            return false;
_L2:
            Iterator iterator;
            if (this == obj)
            {
                return true;
            }
            obj = (ValueEntity.NameEntity)obj;
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
            if (!((ValueEntity.NameEntity) (obj)).isFieldSet(field)) goto _L1; else goto _L3
_L3:
            if (getFieldValue(field).equals(((ValueEntity.NameEntity) (obj)).getFieldValue(field))) goto _L5; else goto _L4
_L4:
            return false;
            if (!((ValueEntity.NameEntity) (obj)).isFieldSet(field)) goto _L5; else goto _L6
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
                return mFamily;

            case 3: // '\003'
                return mGiven;

            case 4: // '\004'
                return Boolean.valueOf(mReadOnly);
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

            case 4: // '\004'
                mReadOnly = flag;
                break;
            }
            mIndicatorSet.add(Integer.valueOf(i));
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
            mFamily = s1;
_L5:
            mIndicatorSet.add(Integer.valueOf(i));
            return;
_L3:
            mGiven = s1;
            if (true) goto _L5; else goto _L4
_L4:
        }

        public final void writeToParcel(Parcel parcel, int i)
        {
            AccountField_ValueEntity_NameEntityCreator.writeToParcel$3c552c7f(this, parcel);
        }

        static 
        {
            HashMap hashmap = new HashMap();
            sFields = hashmap;
            hashmap.put("family", com.google.android.gms.common.server.response.FastJsonResponse.Field.forString("family", 2));
            sFields.put("given", com.google.android.gms.common.server.response.FastJsonResponse.Field.forString("given", 3));
            sFields.put("readOnly", com.google.android.gms.common.server.response.FastJsonResponse.Field.forBoolean("readOnly", 4));
        }

        public ValueEntity.NameEntity()
        {
            mVersionCode = 1;
            mIndicatorSet = new HashSet();
        }

        ValueEntity.NameEntity(Set set, int i, String s, String s1, boolean flag)
        {
            mIndicatorSet = set;
            mVersionCode = i;
            mFamily = s;
            mGiven = s1;
            mReadOnly = flag;
        }
    }


    public static final AccountFieldCreator CREATOR = new AccountFieldCreator();
    private static final HashMap sFields;
    List mErrors;
    boolean mHidden;
    String mId;
    final Set mIndicatorSet;
    LabelEntity mLabel;
    boolean mMandatory;
    List mOptions;
    String mType;
    ValueEntity mValue;
    String mVersion;
    final int mVersionCode;

    public AccountField()
    {
        mVersionCode = 1;
        mIndicatorSet = new HashSet();
    }

    AccountField(Set set, int i, List list, boolean flag, String s, LabelEntity labelentity, boolean flag1, 
            List list1, String s1, ValueEntity valueentity, String s2)
    {
        mIndicatorSet = set;
        mVersionCode = i;
        mErrors = list;
        mHidden = flag;
        mId = s;
        mLabel = labelentity;
        mMandatory = flag1;
        mOptions = list1;
        mType = s1;
        mValue = valueentity;
        mVersion = s2;
    }

    public final void addConcreteTypeArrayInternal(com.google.android.gms.common.server.response.FastJsonResponse.Field field, String s, ArrayList arraylist)
    {
        int i = field.getSafeParcelableFieldId();
        i;
        JVM INSTR lookupswitch 2: default 36
    //                   2: 81
    //                   8: 102;
           goto _L1 _L2 _L3
_L1:
        throw new IllegalArgumentException((new StringBuilder("Field with id=")).append(i).append(" is not a known array of custom type.  Found ").append(arraylist.getClass().getCanonicalName()).append(".").toString());
_L2:
        mErrors = arraylist;
_L5:
        mIndicatorSet.add(Integer.valueOf(i));
        return;
_L3:
        mOptions = arraylist;
        if (true) goto _L5; else goto _L4
_L4:
    }

    public final void addConcreteTypeInternal(com.google.android.gms.common.server.response.FastJsonResponse.Field field, String s, FastJsonResponse fastjsonresponse)
    {
        int i = field.getSafeParcelableFieldId();
        i;
        JVM INSTR lookupswitch 2: default 36
    //                   6: 81
    //                   10: 105;
           goto _L1 _L2 _L3
_L1:
        throw new IllegalArgumentException((new StringBuilder("Field with id=")).append(i).append(" is not a known custom type.  Found ").append(fastjsonresponse.getClass().getCanonicalName()).append(".").toString());
_L2:
        mLabel = (LabelEntity)fastjsonresponse;
_L5:
        mIndicatorSet.add(Integer.valueOf(i));
        return;
_L3:
        mValue = (ValueEntity)fastjsonresponse;
        if (true) goto _L5; else goto _L4
_L4:
    }

    public final int describeContents()
    {
        return 0;
    }

    public final boolean equals(Object obj)
    {
        if (obj instanceof AccountField) goto _L2; else goto _L1
_L1:
        return false;
_L2:
        Iterator iterator;
        if (this == obj)
        {
            return true;
        }
        obj = (AccountField)obj;
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
        if (!((AccountField) (obj)).isFieldSet(field)) goto _L1; else goto _L3
_L3:
        if (getFieldValue(field).equals(((AccountField) (obj)).getFieldValue(field))) goto _L5; else goto _L4
_L4:
        return false;
        if (!((AccountField) (obj)).isFieldSet(field)) goto _L5; else goto _L6
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
        default:
            throw new IllegalStateException((new StringBuilder("Unknown safe parcelable id=")).append(field.getSafeParcelableFieldId()).toString());

        case 2: // '\002'
            return mErrors;

        case 3: // '\003'
            return Boolean.valueOf(mHidden);

        case 4: // '\004'
            return mId;

        case 6: // '\006'
            return mLabel;

        case 7: // '\007'
            return Boolean.valueOf(mMandatory);

        case 8: // '\b'
            return mOptions;

        case 9: // '\t'
            return mType;

        case 10: // '\n'
            return mValue;

        case 11: // '\013'
            return mVersion;
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
        i;
        JVM INSTR lookupswitch 2: default 36
    //                   3: 66
    //                   7: 87;
           goto _L1 _L2 _L3
_L1:
        throw new IllegalArgumentException((new StringBuilder("Field with id=")).append(i).append(" is not known to be a boolean.").toString());
_L2:
        mHidden = flag;
_L5:
        mIndicatorSet.add(Integer.valueOf(i));
        return;
_L3:
        mMandatory = flag;
        if (true) goto _L5; else goto _L4
_L4:
    }

    protected final void setStringInternal(com.google.android.gms.common.server.response.FastJsonResponse.Field field, String s, String s1)
    {
        int i = field.getSafeParcelableFieldId();
        i;
        JVM INSTR lookupswitch 3: default 44
    //                   4: 74
    //                   9: 95
    //                   11: 103;
           goto _L1 _L2 _L3 _L4
_L1:
        throw new IllegalArgumentException((new StringBuilder("Field with id=")).append(i).append(" is not known to be a String.").toString());
_L2:
        mId = s1;
_L6:
        mIndicatorSet.add(Integer.valueOf(i));
        return;
_L3:
        mType = s1;
        continue; /* Loop/switch isn't completed */
_L4:
        mVersion = s1;
        if (true) goto _L6; else goto _L5
_L5:
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        AccountFieldCreator.writeToParcel(this, parcel, i);
    }

    static 
    {
        HashMap hashmap = new HashMap();
        sFields = hashmap;
        hashmap.put("errors", com.google.android.gms.common.server.response.FastJsonResponse.Field.forConcreteTypeArray("errors", 2, com/google/android/gms/plus/service/v1whitelisted/models/AccountField$ErrorsEntity));
        sFields.put("hidden", com.google.android.gms.common.server.response.FastJsonResponse.Field.forBoolean("hidden", 3));
        sFields.put("id", com.google.android.gms.common.server.response.FastJsonResponse.Field.forString("id", 4));
        sFields.put("label", com.google.android.gms.common.server.response.FastJsonResponse.Field.forConcreteType("label", 6, com/google/android/gms/plus/service/v1whitelisted/models/AccountField$LabelEntity));
        sFields.put("mandatory", com.google.android.gms.common.server.response.FastJsonResponse.Field.forBoolean("mandatory", 7));
        sFields.put("options", com.google.android.gms.common.server.response.FastJsonResponse.Field.forConcreteTypeArray("options", 8, com/google/android/gms/plus/service/v1whitelisted/models/AccountField$OptionsEntity));
        sFields.put("type", com.google.android.gms.common.server.response.FastJsonResponse.Field.forString("type", 9));
        sFields.put("value", com.google.android.gms.common.server.response.FastJsonResponse.Field.forConcreteType("value", 10, com/google/android/gms/plus/service/v1whitelisted/models/AccountField$ValueEntity));
        sFields.put("version", com.google.android.gms.common.server.response.FastJsonResponse.Field.forString("version", 11));
    }
}
