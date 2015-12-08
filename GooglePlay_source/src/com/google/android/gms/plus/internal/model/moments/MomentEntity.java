// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.plus.internal.model.moments;

import android.os.Parcel;
import com.google.android.gms.common.server.response.FastJsonResponse;
import com.google.android.gms.common.server.response.FastSafeParcelableJsonResponse;
import com.google.android.gms.plus.model.moments.Moment;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.google.android.gms.plus.internal.model.moments:
//            MomentEntityCreator, ItemScopeEntity

public final class MomentEntity extends FastSafeParcelableJsonResponse
    implements Moment
{

    public static final MomentEntityCreator CREATOR = new MomentEntityCreator();
    private static final HashMap sFields;
    String mId;
    final Set mIndicatorSet;
    ItemScopeEntity mResult;
    String mStartDate;
    ItemScopeEntity mTarget;
    String mType;
    final int mVersionCode;

    public MomentEntity()
    {
        mVersionCode = 1;
        mIndicatorSet = new HashSet();
    }

    MomentEntity(Set set, int i, String s, ItemScopeEntity itemscopeentity, String s1, ItemScopeEntity itemscopeentity1, String s2)
    {
        mIndicatorSet = set;
        mVersionCode = i;
        mId = s;
        mResult = itemscopeentity;
        mStartDate = s1;
        mTarget = itemscopeentity1;
        mType = s2;
    }

    public final void addConcreteTypeInternal(com.google.android.gms.common.server.response.FastJsonResponse.Field field, String s, FastJsonResponse fastjsonresponse)
    {
        int i = field.getSafeParcelableFieldId();
        i;
        JVM INSTR tableswitch 4 6: default 36
    //                   4 81
    //                   5 36
    //                   6 105;
           goto _L1 _L2 _L1 _L3
_L1:
        throw new IllegalArgumentException((new StringBuilder("Field with id=")).append(i).append(" is not a known custom type.  Found ").append(fastjsonresponse.getClass().getCanonicalName()).append(".").toString());
_L2:
        mResult = (ItemScopeEntity)fastjsonresponse;
_L5:
        mIndicatorSet.add(Integer.valueOf(i));
        return;
_L3:
        mTarget = (ItemScopeEntity)fastjsonresponse;
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
        case 3: // '\003'
        default:
            throw new IllegalStateException((new StringBuilder("Unknown safe parcelable id=")).append(field.getSafeParcelableFieldId()).toString());

        case 2: // '\002'
            return mId;

        case 4: // '\004'
            return mResult;

        case 5: // '\005'
            return mStartDate;

        case 6: // '\006'
            return mTarget;

        case 7: // '\007'
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
        JVM INSTR tableswitch 2 7: default 48
    //                   2 78
    //                   3 48
    //                   4 48
    //                   5 99
    //                   6 48
    //                   7 107;
           goto _L1 _L2 _L1 _L1 _L3 _L1 _L4
_L1:
        throw new IllegalArgumentException((new StringBuilder("Field with id=")).append(i).append(" is not known to be a String.").toString());
_L2:
        mId = s1;
_L6:
        mIndicatorSet.add(Integer.valueOf(i));
        return;
_L3:
        mStartDate = s1;
        continue; /* Loop/switch isn't completed */
_L4:
        mType = s1;
        if (true) goto _L6; else goto _L5
_L5:
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        MomentEntityCreator.writeToParcel(this, parcel, i);
    }

    static 
    {
        HashMap hashmap = new HashMap();
        sFields = hashmap;
        hashmap.put("id", com.google.android.gms.common.server.response.FastJsonResponse.Field.forString("id", 2));
        sFields.put("result", com.google.android.gms.common.server.response.FastJsonResponse.Field.forConcreteType("result", 4, com/google/android/gms/plus/internal/model/moments/ItemScopeEntity));
        sFields.put("startDate", com.google.android.gms.common.server.response.FastJsonResponse.Field.forString("startDate", 5));
        sFields.put("target", com.google.android.gms.common.server.response.FastJsonResponse.Field.forConcreteType("target", 6, com/google/android/gms/plus/internal/model/moments/ItemScopeEntity));
        sFields.put("type", com.google.android.gms.common.server.response.FastJsonResponse.Field.forString("type", 7));
    }
}
