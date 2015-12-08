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
//            AccountField, AccountField_ValueEntityCreator, AccountField_ValueEntity_NameEntityCreator

public static final class mString extends FastSafeParcelableJsonResponse
    implements mString
{
    public static final class NameEntity extends FastSafeParcelableJsonResponse
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

        public NameEntity()
        {
            mVersionCode = 1;
            mIndicatorSet = new HashSet();
        }

        NameEntity(Set set, int i, String s, String s1, boolean flag)
        {
            mIndicatorSet = set;
            mVersionCode = i;
            mFamily = s;
            mGiven = s1;
            mReadOnly = flag;
        }
    }


    public static final AccountField_ValueEntityCreator CREATOR = new AccountField_ValueEntityCreator();
    private static final HashMap sFields;
    boolean mCheck;
    String mDate;
    final Set mIndicatorSet;
    NameEntity mName;
    String mOption;
    String mString;
    final int mVersionCode;

    public final void addConcreteTypeInternal(com.google.android.gms.common.server.response.alueEntity alueentity, String s, FastJsonResponse fastjsonresponse)
    {
        int i = alueentity.tSafeParcelableFieldId();
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
        com.google.android.gms.common.server.response.alueEntity alueentity;
        if (!iterator.hasNext())
        {
            break MISSING_BLOCK_LABEL_96;
        }
        alueentity = (com.google.android.gms.common.server.response.alueEntity.sFields)iterator.next();
        if (!isFieldSet(alueentity))
        {
            continue; /* Loop/switch isn't completed */
        }
        if (!((isFieldSet) (obj)).isFieldSet(alueentity)) goto _L1; else goto _L3
_L3:
        if (getFieldValue(alueentity).equals(((getFieldValue) (obj)).getFieldValue(alueentity))) goto _L5; else goto _L4
_L4:
        return false;
        if (!((getFieldValue) (obj)).isFieldSet(alueentity)) goto _L5; else goto _L6
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

    protected final Object getFieldValue(com.google.android.gms.common.server.response.alueEntity alueentity)
    {
        switch (alueentity.tSafeParcelableFieldId())
        {
        default:
            throw new IllegalStateException((new StringBuilder("Unknown safe parcelable id=")).append(alueentity.tSafeParcelableFieldId()).toString());

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
            com.google.android.gms.common.server.response.alueEntity alueentity = (com.google.android.gms.common.server.response.alueEntity.sFields)iterator.next();
            if (isFieldSet(alueentity))
            {
                i = alueentity.tSafeParcelableFieldId() + i + getFieldValue(alueentity).hashCode();
            }
        } while (true);
        return i;
    }

    public final boolean isDataValid()
    {
        return true;
    }

    protected final boolean isFieldSet(com.google.android.gms.common.server.response.alueEntity alueentity)
    {
        return mIndicatorSet.contains(Integer.valueOf(alueentity.tSafeParcelableFieldId()));
    }

    protected final void setBooleanInternal(com.google.android.gms.common.server.response.alueEntity alueentity, String s, boolean flag)
    {
        int i = alueentity.tSafeParcelableFieldId();
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

    protected final void setStringInternal(com.google.android.gms.common.server.response.alueEntity alueentity, String s, String s1)
    {
        int i = alueentity.tSafeParcelableFieldId();
        i;
        JVM INSTR tableswitch 3 6: default 40
    //                   3 70
    //                   4 40
    //                   5 91
    //                   6 99;
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
        hashmap.put("check", com.google.android.gms.common.server.response.rBoolean("check", 2));
        sFields.put("date", com.google.android.gms.common.server.response.rString("date", 3));
        sFields.put("name", com.google.android.gms.common.server.response.rConcreteType("name", 4, com/google/android/gms/plus/service/v1whitelisted/models/AccountField$ValueEntity$NameEntity));
        sFields.put("option", com.google.android.gms.common.server.response.rString("option", 5));
        sFields.put("string", com.google.android.gms.common.server.response.rString("string", 6));
    }

    public NameEntity()
    {
        mVersionCode = 1;
        mIndicatorSet = new HashSet();
    }

    NameEntity(Set set, int i, boolean flag, String s, NameEntity nameentity, String s1, String s2)
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
