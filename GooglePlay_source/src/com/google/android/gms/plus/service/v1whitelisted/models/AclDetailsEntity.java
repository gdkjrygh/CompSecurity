// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.plus.service.v1whitelisted.models;

import android.os.Parcel;
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
//            AclDetails, AclDetailsEntityCreator, LoggedCircleEntity, LoggedCircleMemberEntity

public final class AclDetailsEntity extends FastSafeParcelableJsonResponse
    implements AclDetails
{

    public static final AclDetailsEntityCreator CREATOR = new AclDetailsEntityCreator();
    private static final HashMap sFields;
    List mCircle;
    final Set mIndicatorSet;
    List mPerson;
    int mPersonCount;
    int mSelectedAlphabeticalIndividualCount;
    float mSelectedAlphabeticalIndividualCtr;
    int mSelectedAvatarCount;
    float mSelectedAvatarCtr;
    int mSelectedRankedIndividualCount;
    float mSelectedRankedIndividualCtr;
    int mTotalAvatarCount;
    int mTotalRankedIndividualCount;
    final int mVersionCode;

    public AclDetailsEntity()
    {
        mVersionCode = 1;
        mIndicatorSet = new HashSet();
    }

    AclDetailsEntity(Set set, int i, List list, List list1, int j, int k, float f, 
            int l, float f1, int i1, float f2, int j1, int k1)
    {
        mIndicatorSet = set;
        mVersionCode = i;
        mCircle = list;
        mPerson = list1;
        mPersonCount = j;
        mSelectedAlphabeticalIndividualCount = k;
        mSelectedAlphabeticalIndividualCtr = f;
        mSelectedAvatarCount = l;
        mSelectedAvatarCtr = f1;
        mSelectedRankedIndividualCount = i1;
        mSelectedRankedIndividualCtr = f2;
        mTotalAvatarCount = j1;
        mTotalRankedIndividualCount = k1;
    }

    public final void addConcreteTypeArrayInternal(com.google.android.gms.common.server.response.FastJsonResponse.Field field, String s, ArrayList arraylist)
    {
        int i = field.getSafeParcelableFieldId();
        i;
        JVM INSTR tableswitch 2 4: default 36
    //                   2 81
    //                   3 36
    //                   4 102;
           goto _L1 _L2 _L1 _L3
_L1:
        throw new IllegalArgumentException((new StringBuilder("Field with id=")).append(i).append(" is not a known array of custom type.  Found ").append(arraylist.getClass().getCanonicalName()).append(".").toString());
_L2:
        mCircle = arraylist;
_L5:
        mIndicatorSet.add(Integer.valueOf(i));
        return;
_L3:
        mPerson = arraylist;
        if (true) goto _L5; else goto _L4
_L4:
    }

    public final int describeContents()
    {
        return 0;
    }

    public final boolean equals(Object obj)
    {
        if (obj instanceof AclDetailsEntity) goto _L2; else goto _L1
_L1:
        return false;
_L2:
        Iterator iterator;
        if (this == obj)
        {
            return true;
        }
        obj = (AclDetailsEntity)obj;
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
        if (!((AclDetailsEntity) (obj)).isFieldSet(field)) goto _L1; else goto _L3
_L3:
        if (getFieldValue(field).equals(((AclDetailsEntity) (obj)).getFieldValue(field))) goto _L5; else goto _L4
_L4:
        return false;
        if (!((AclDetailsEntity) (obj)).isFieldSet(field)) goto _L5; else goto _L6
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
        case 12: // '\f'
        default:
            throw new IllegalStateException((new StringBuilder("Unknown safe parcelable id=")).append(field.getSafeParcelableFieldId()).toString());

        case 2: // '\002'
            return mCircle;

        case 4: // '\004'
            return mPerson;

        case 5: // '\005'
            return Integer.valueOf(mPersonCount);

        case 6: // '\006'
            return Integer.valueOf(mSelectedAlphabeticalIndividualCount);

        case 7: // '\007'
            return Float.valueOf(mSelectedAlphabeticalIndividualCtr);

        case 8: // '\b'
            return Integer.valueOf(mSelectedAvatarCount);

        case 9: // '\t'
            return Float.valueOf(mSelectedAvatarCtr);

        case 10: // '\n'
            return Integer.valueOf(mSelectedRankedIndividualCount);

        case 11: // '\013'
            return Float.valueOf(mSelectedRankedIndividualCtr);

        case 13: // '\r'
            return Integer.valueOf(mTotalAvatarCount);

        case 14: // '\016'
            return Integer.valueOf(mTotalRankedIndividualCount);
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

    protected final void setFloatInternal(com.google.android.gms.common.server.response.FastJsonResponse.Field field, String s, float f)
    {
        int i = field.getSafeParcelableFieldId();
        i;
        JVM INSTR tableswitch 7 11: default 44
    //                   7 74
    //                   8 44
    //                   9 95
    //                   10 44
    //                   11 103;
           goto _L1 _L2 _L1 _L3 _L1 _L4
_L1:
        throw new IllegalArgumentException((new StringBuilder("Field with id=")).append(i).append(" is not known to be a float.").toString());
_L2:
        mSelectedAlphabeticalIndividualCtr = f;
_L6:
        mIndicatorSet.add(Integer.valueOf(i));
        return;
_L3:
        mSelectedAvatarCtr = f;
        continue; /* Loop/switch isn't completed */
_L4:
        mSelectedRankedIndividualCtr = f;
        if (true) goto _L6; else goto _L5
_L5:
    }

    protected final void setIntegerInternal(com.google.android.gms.common.server.response.FastJsonResponse.Field field, String s, int i)
    {
        int j = field.getSafeParcelableFieldId();
        j;
        JVM INSTR tableswitch 5 14: default 64
    //                   5 94
    //                   6 115
    //                   7 64
    //                   8 123
    //                   9 64
    //                   10 131
    //                   11 64
    //                   12 64
    //                   13 139
    //                   14 147;
           goto _L1 _L2 _L3 _L1 _L4 _L1 _L5 _L1 _L1 _L6 _L7
_L1:
        throw new IllegalArgumentException((new StringBuilder("Field with id=")).append(j).append(" is not known to be an int.").toString());
_L2:
        mPersonCount = i;
_L9:
        mIndicatorSet.add(Integer.valueOf(j));
        return;
_L3:
        mSelectedAlphabeticalIndividualCount = i;
        continue; /* Loop/switch isn't completed */
_L4:
        mSelectedAvatarCount = i;
        continue; /* Loop/switch isn't completed */
_L5:
        mSelectedRankedIndividualCount = i;
        continue; /* Loop/switch isn't completed */
_L6:
        mTotalAvatarCount = i;
        continue; /* Loop/switch isn't completed */
_L7:
        mTotalRankedIndividualCount = i;
        if (true) goto _L9; else goto _L8
_L8:
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        AclDetailsEntityCreator.writeToParcel$4513f3eb(this, parcel);
    }

    static 
    {
        HashMap hashmap = new HashMap();
        sFields = hashmap;
        hashmap.put("circle", com.google.android.gms.common.server.response.FastJsonResponse.Field.forConcreteTypeArray("circle", 2, com/google/android/gms/plus/service/v1whitelisted/models/LoggedCircleEntity));
        sFields.put("person", com.google.android.gms.common.server.response.FastJsonResponse.Field.forConcreteTypeArray("person", 4, com/google/android/gms/plus/service/v1whitelisted/models/LoggedCircleMemberEntity));
        sFields.put("personCount", com.google.android.gms.common.server.response.FastJsonResponse.Field.forInteger("personCount", 5));
        sFields.put("selectedAlphabeticalIndividualCount", com.google.android.gms.common.server.response.FastJsonResponse.Field.forInteger("selectedAlphabeticalIndividualCount", 6));
        sFields.put("selectedAlphabeticalIndividualCtr", com.google.android.gms.common.server.response.FastJsonResponse.Field.forFloat("selectedAlphabeticalIndividualCtr", 7));
        sFields.put("selectedAvatarCount", com.google.android.gms.common.server.response.FastJsonResponse.Field.forInteger("selectedAvatarCount", 8));
        sFields.put("selectedAvatarCtr", com.google.android.gms.common.server.response.FastJsonResponse.Field.forFloat("selectedAvatarCtr", 9));
        sFields.put("selectedRankedIndividualCount", com.google.android.gms.common.server.response.FastJsonResponse.Field.forInteger("selectedRankedIndividualCount", 10));
        sFields.put("selectedRankedIndividualCtr", com.google.android.gms.common.server.response.FastJsonResponse.Field.forFloat("selectedRankedIndividualCtr", 11));
        sFields.put("totalAvatarCount", com.google.android.gms.common.server.response.FastJsonResponse.Field.forInteger("totalAvatarCount", 13));
        sFields.put("totalRankedIndividualCount", com.google.android.gms.common.server.response.FastJsonResponse.Field.forInteger("totalRankedIndividualCount", 14));
    }
}
