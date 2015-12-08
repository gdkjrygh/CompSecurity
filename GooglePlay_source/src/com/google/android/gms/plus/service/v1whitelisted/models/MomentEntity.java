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
//            Moment, MomentEntityCreator, AclEntity, ItemScope

public final class MomentEntity extends FastSafeParcelableJsonResponse
    implements Moment
{

    public static final MomentEntityCreator CREATOR = new MomentEntityCreator();
    private static final HashMap sFields;
    AclEntity mAccess;
    String mApplicationId;
    String mConfirmDeleteText;
    String mDescription;
    String mId;
    final Set mIndicatorSet;
    String mStartDate;
    ItemScope mTarget;
    final int mVersionCode;

    public MomentEntity()
    {
        mVersionCode = 1;
        mIndicatorSet = new HashSet();
    }

    MomentEntity(Set set, int i, AclEntity aclentity, String s, String s1, String s2, String s3, 
            String s4, ItemScope itemscope)
    {
        mIndicatorSet = set;
        mVersionCode = i;
        mAccess = aclentity;
        mApplicationId = s;
        mConfirmDeleteText = s1;
        mDescription = s2;
        mId = s3;
        mStartDate = s4;
        mTarget = itemscope;
    }

    public final void addConcreteTypeInternal(com.google.android.gms.common.server.response.FastJsonResponse.Field field, String s, FastJsonResponse fastjsonresponse)
    {
        int i = field.getSafeParcelableFieldId();
        i;
        JVM INSTR lookupswitch 2: default 36
    //                   2: 81
    //                   11: 105;
           goto _L1 _L2 _L3
_L1:
        throw new IllegalArgumentException((new StringBuilder("Field with id=")).append(i).append(" is not a known custom type.  Found ").append(fastjsonresponse.getClass().getCanonicalName()).append(".").toString());
_L2:
        mAccess = (AclEntity)fastjsonresponse;
_L5:
        mIndicatorSet.add(Integer.valueOf(i));
        return;
_L3:
        mTarget = (ItemScope)fastjsonresponse;
        if (true) goto _L5; else goto _L4
_L4:
    }

    public final int describeContents()
    {
        return 0;
    }

    public final boolean equals(Object obj)
    {
        if (obj instanceof MomentEntity) goto _L2; else goto _L1
_L1:
        return false;
_L2:
        Iterator iterator;
        if (this == obj)
        {
            return true;
        }
        obj = (MomentEntity)obj;
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
        if (!((MomentEntity) (obj)).isFieldSet(field)) goto _L1; else goto _L3
_L3:
        if (getFieldValue(field).equals(((MomentEntity) (obj)).getFieldValue(field))) goto _L5; else goto _L4
_L4:
        return false;
        if (!((MomentEntity) (obj)).isFieldSet(field)) goto _L5; else goto _L6
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
        case 7: // '\007'
        case 8: // '\b'
        case 9: // '\t'
        default:
            throw new IllegalStateException((new StringBuilder("Unknown safe parcelable id=")).append(field.getSafeParcelableFieldId()).toString());

        case 2: // '\002'
            return mAccess;

        case 3: // '\003'
            return mApplicationId;

        case 4: // '\004'
            return mConfirmDeleteText;

        case 5: // '\005'
            return mDescription;

        case 6: // '\006'
            return mId;

        case 10: // '\n'
            return mStartDate;

        case 11: // '\013'
            return mTarget;
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
        JVM INSTR tableswitch 3 10: default 56
    //                   3 86
    //                   4 107
    //                   5 115
    //                   6 123
    //                   7 56
    //                   8 56
    //                   9 56
    //                   10 131;
           goto _L1 _L2 _L3 _L4 _L5 _L1 _L1 _L1 _L6
_L1:
        throw new IllegalArgumentException((new StringBuilder("Field with id=")).append(i).append(" is not known to be a String.").toString());
_L2:
        mApplicationId = s1;
_L8:
        mIndicatorSet.add(Integer.valueOf(i));
        return;
_L3:
        mConfirmDeleteText = s1;
        continue; /* Loop/switch isn't completed */
_L4:
        mDescription = s1;
        continue; /* Loop/switch isn't completed */
_L5:
        mId = s1;
        continue; /* Loop/switch isn't completed */
_L6:
        mStartDate = s1;
        if (true) goto _L8; else goto _L7
_L7:
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        MomentEntityCreator.writeToParcel(this, parcel, i);
    }

    static 
    {
        HashMap hashmap = new HashMap();
        sFields = hashmap;
        hashmap.put("access", com.google.android.gms.common.server.response.FastJsonResponse.Field.forConcreteType("access", 2, com/google/android/gms/plus/service/v1whitelisted/models/AclEntity));
        sFields.put("applicationId", com.google.android.gms.common.server.response.FastJsonResponse.Field.forString("applicationId", 3));
        sFields.put("confirmDeleteText", com.google.android.gms.common.server.response.FastJsonResponse.Field.forString("confirmDeleteText", 4));
        sFields.put("description", com.google.android.gms.common.server.response.FastJsonResponse.Field.forString("description", 5));
        sFields.put("id", com.google.android.gms.common.server.response.FastJsonResponse.Field.forString("id", 6));
        sFields.put("startDate", com.google.android.gms.common.server.response.FastJsonResponse.Field.forString("startDate", 10));
        sFields.put("target", com.google.android.gms.common.server.response.FastJsonResponse.Field.forConcreteType("target", 11, com/google/android/gms/plus/service/v1whitelisted/models/ItemScope));
    }
}
