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
//            UpgradeAccount, UpgradeAccountEntityCreator, UpgradeAccountEntity_DescriptionEntityCreator, UpgradeAccountEntity_DescriptionEntity_ReferencesEntityCreator, 
//            UpgradeAccountEntity_FormEntityCreator, AccountField

public final class UpgradeAccountEntity extends FastSafeParcelableJsonResponse
    implements UpgradeAccount
{
    public static final class DescriptionEntity extends FastSafeParcelableJsonResponse
        implements UpgradeAccount.Description
    {

        public static final UpgradeAccountEntity_DescriptionEntityCreator CREATOR = new UpgradeAccountEntity_DescriptionEntityCreator();
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
            if (obj instanceof DescriptionEntity) goto _L2; else goto _L1
_L1:
            return false;
_L2:
            Iterator iterator;
            if (this == obj)
            {
                return true;
            }
            obj = (DescriptionEntity)obj;
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
            if (!((DescriptionEntity) (obj)).isFieldSet(field)) goto _L1; else goto _L3
_L3:
            if (getFieldValue(field).equals(((DescriptionEntity) (obj)).getFieldValue(field))) goto _L5; else goto _L4
_L4:
            return false;
            if (!((DescriptionEntity) (obj)).isFieldSet(field)) goto _L5; else goto _L6
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
            UpgradeAccountEntity_DescriptionEntityCreator.writeToParcel$6afcf9d7(this, parcel);
        }

        static 
        {
            HashMap hashmap = new HashMap();
            sFields = hashmap;
            hashmap.put("id", com.google.android.gms.common.server.response.FastJsonResponse.Field.forString("id", 2));
            sFields.put("references", com.google.android.gms.common.server.response.FastJsonResponse.Field.forConcreteTypeArray("references", 3, com/google/android/gms/plus/service/v1whitelisted/models/UpgradeAccountEntity$DescriptionEntity$ReferencesEntity));
            sFields.put("text", com.google.android.gms.common.server.response.FastJsonResponse.Field.forString("text", 4));
        }

        public DescriptionEntity()
        {
            mVersionCode = 1;
            mIndicatorSet = new HashSet();
        }

        DescriptionEntity(Set set, int i, String s, List list, String s1)
        {
            mIndicatorSet = set;
            mVersionCode = i;
            mId = s;
            mReferences = list;
            mText = s1;
        }
    }

    public static final class DescriptionEntity.ReferencesEntity extends FastSafeParcelableJsonResponse
        implements UpgradeAccount.Description.References
    {

        public static final UpgradeAccountEntity_DescriptionEntity_ReferencesEntityCreator CREATOR = new UpgradeAccountEntity_DescriptionEntity_ReferencesEntityCreator();
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
            if (obj instanceof DescriptionEntity.ReferencesEntity) goto _L2; else goto _L1
_L1:
            return false;
_L2:
            Iterator iterator;
            if (this == obj)
            {
                return true;
            }
            obj = (DescriptionEntity.ReferencesEntity)obj;
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
            if (!((DescriptionEntity.ReferencesEntity) (obj)).isFieldSet(field)) goto _L1; else goto _L3
_L3:
            if (getFieldValue(field).equals(((DescriptionEntity.ReferencesEntity) (obj)).getFieldValue(field))) goto _L5; else goto _L4
_L4:
            return false;
            if (!((DescriptionEntity.ReferencesEntity) (obj)).isFieldSet(field)) goto _L5; else goto _L6
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
            UpgradeAccountEntity_DescriptionEntity_ReferencesEntityCreator.writeToParcel$4775ef6a(this, parcel);
        }

        static 
        {
            HashMap hashmap = new HashMap();
            sFields = hashmap;
            hashmap.put("id", com.google.android.gms.common.server.response.FastJsonResponse.Field.forString("id", 2));
            sFields.put("text", com.google.android.gms.common.server.response.FastJsonResponse.Field.forString("text", 3));
            sFields.put("title", com.google.android.gms.common.server.response.FastJsonResponse.Field.forString("title", 4));
        }

        public DescriptionEntity.ReferencesEntity()
        {
            mVersionCode = 1;
            mIndicatorSet = new HashSet();
        }

        DescriptionEntity.ReferencesEntity(Set set, int i, String s, String s1, String s2)
        {
            mIndicatorSet = set;
            mVersionCode = i;
            mId = s;
            mText = s1;
            mTitle = s2;
        }
    }

    public static final class FormEntity extends FastSafeParcelableJsonResponse
        implements UpgradeAccount.Form
    {

        public static final UpgradeAccountEntity_FormEntityCreator CREATOR = new UpgradeAccountEntity_FormEntityCreator();
        private static final HashMap sFields;
        List mFields;
        final Set mIndicatorSet;
        final int mVersionCode;

        public final void addConcreteTypeArrayInternal(com.google.android.gms.common.server.response.FastJsonResponse.Field field, String s, ArrayList arraylist)
        {
            int i = field.getSafeParcelableFieldId();
            switch (i)
            {
            default:
                throw new IllegalArgumentException((new StringBuilder("Field with id=")).append(i).append(" is not a known array of custom type.  Found ").append(arraylist.getClass().getCanonicalName()).append(".").toString());

            case 2: // '\002'
                mFields = arraylist;
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
            if (obj instanceof FormEntity) goto _L2; else goto _L1
_L1:
            return false;
_L2:
            Iterator iterator;
            if (this == obj)
            {
                return true;
            }
            obj = (FormEntity)obj;
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
            if (!((FormEntity) (obj)).isFieldSet(field)) goto _L1; else goto _L3
_L3:
            if (getFieldValue(field).equals(((FormEntity) (obj)).getFieldValue(field))) goto _L5; else goto _L4
_L4:
            return false;
            if (!((FormEntity) (obj)).isFieldSet(field)) goto _L5; else goto _L6
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
                return mFields;
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

        public final void writeToParcel(Parcel parcel, int i)
        {
            UpgradeAccountEntity_FormEntityCreator.writeToParcel$6d03cc9f(this, parcel);
        }

        static 
        {
            HashMap hashmap = new HashMap();
            sFields = hashmap;
            hashmap.put("fields", com.google.android.gms.common.server.response.FastJsonResponse.Field.forConcreteTypeArray("fields", 2, com/google/android/gms/plus/service/v1whitelisted/models/AccountField));
        }

        public FormEntity()
        {
            mVersionCode = 1;
            mIndicatorSet = new HashSet();
        }

        FormEntity(Set set, int i, List list)
        {
            mIndicatorSet = set;
            mVersionCode = i;
            mFields = list;
        }
    }


    public static final UpgradeAccountEntityCreator CREATOR = new UpgradeAccountEntityCreator();
    private static final HashMap sFields;
    DescriptionEntity mDescription;
    FormEntity mForm;
    final Set mIndicatorSet;
    String mState;
    final int mVersionCode;

    public UpgradeAccountEntity()
    {
        mVersionCode = 1;
        mIndicatorSet = new HashSet();
    }

    UpgradeAccountEntity(Set set, int i, DescriptionEntity descriptionentity, FormEntity formentity, String s)
    {
        mIndicatorSet = set;
        mVersionCode = i;
        mDescription = descriptionentity;
        mForm = formentity;
        mState = s;
    }

    public final void addConcreteTypeInternal(com.google.android.gms.common.server.response.FastJsonResponse.Field field, String s, FastJsonResponse fastjsonresponse)
    {
        int i = field.getSafeParcelableFieldId();
        i;
        JVM INSTR tableswitch 2 4: default 36
    //                   2 81
    //                   3 36
    //                   4 105;
           goto _L1 _L2 _L1 _L3
_L1:
        throw new IllegalArgumentException((new StringBuilder("Field with id=")).append(i).append(" is not a known custom type.  Found ").append(fastjsonresponse.getClass().getCanonicalName()).append(".").toString());
_L2:
        mDescription = (DescriptionEntity)fastjsonresponse;
_L5:
        mIndicatorSet.add(Integer.valueOf(i));
        return;
_L3:
        mForm = (FormEntity)fastjsonresponse;
        if (true) goto _L5; else goto _L4
_L4:
    }

    public final int describeContents()
    {
        return 0;
    }

    public final boolean equals(Object obj)
    {
        if (obj instanceof UpgradeAccountEntity) goto _L2; else goto _L1
_L1:
        return false;
_L2:
        Iterator iterator;
        if (this == obj)
        {
            return true;
        }
        obj = (UpgradeAccountEntity)obj;
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
        if (!((UpgradeAccountEntity) (obj)).isFieldSet(field)) goto _L1; else goto _L3
_L3:
        if (getFieldValue(field).equals(((UpgradeAccountEntity) (obj)).getFieldValue(field))) goto _L5; else goto _L4
_L4:
        return false;
        if (!((UpgradeAccountEntity) (obj)).isFieldSet(field)) goto _L5; else goto _L6
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
        case 5: // '\005'
        default:
            throw new IllegalStateException((new StringBuilder("Unknown safe parcelable id=")).append(field.getSafeParcelableFieldId()).toString());

        case 2: // '\002'
            return mDescription;

        case 4: // '\004'
            return mForm;

        case 6: // '\006'
            return mState;
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

        case 6: // '\006'
            mState = s1;
            break;
        }
        mIndicatorSet.add(Integer.valueOf(i));
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        UpgradeAccountEntityCreator.writeToParcel(this, parcel, i);
    }

    static 
    {
        HashMap hashmap = new HashMap();
        sFields = hashmap;
        hashmap.put("description", com.google.android.gms.common.server.response.FastJsonResponse.Field.forConcreteType("description", 2, com/google/android/gms/plus/service/v1whitelisted/models/UpgradeAccountEntity$DescriptionEntity));
        sFields.put("form", com.google.android.gms.common.server.response.FastJsonResponse.Field.forConcreteType("form", 4, com/google/android/gms/plus/service/v1whitelisted/models/UpgradeAccountEntity$FormEntity));
        sFields.put("state", com.google.android.gms.common.server.response.FastJsonResponse.Field.forString("state", 6));
    }
}
