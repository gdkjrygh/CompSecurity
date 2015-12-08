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
//            ActionTarget, ActionTargetEntityCreator, AclDetailsEntity, LoggedProfileEntity

public final class ActionTargetEntity extends FastSafeParcelableJsonResponse
    implements ActionTarget
{

    public static final ActionTargetEntityCreator CREATOR = new ActionTargetEntityCreator();
    private static final HashMap sFields;
    AclDetailsEntity mAclDetails;
    String mActivityId;
    int mAlphabeticalAclListCount;
    List mGaiaId;
    final Set mIndicatorSet;
    LoggedProfileEntity mProfile;
    String mProfileData;
    List mTargetType;
    final int mVersionCode;

    public ActionTargetEntity()
    {
        mVersionCode = 1;
        mIndicatorSet = new HashSet();
    }

    ActionTargetEntity(Set set, int i, AclDetailsEntity acldetailsentity, String s, int j, List list, LoggedProfileEntity loggedprofileentity, 
            String s1, List list1)
    {
        mIndicatorSet = set;
        mVersionCode = i;
        mAclDetails = acldetailsentity;
        mActivityId = s;
        mAlphabeticalAclListCount = j;
        mGaiaId = list;
        mProfile = loggedprofileentity;
        mProfileData = s1;
        mTargetType = list1;
    }

    public final void addConcreteTypeInternal(com.google.android.gms.common.server.response.FastJsonResponse.Field field, String s, FastJsonResponse fastjsonresponse)
    {
        int i = field.getSafeParcelableFieldId();
        i;
        JVM INSTR lookupswitch 2: default 36
    //                   2: 81
    //                   61: 105;
           goto _L1 _L2 _L3
_L1:
        throw new IllegalArgumentException((new StringBuilder("Field with id=")).append(i).append(" is not a known custom type.  Found ").append(fastjsonresponse.getClass().getCanonicalName()).append(".").toString());
_L2:
        mAclDetails = (AclDetailsEntity)fastjsonresponse;
_L5:
        mIndicatorSet.add(Integer.valueOf(i));
        return;
_L3:
        mProfile = (LoggedProfileEntity)fastjsonresponse;
        if (true) goto _L5; else goto _L4
_L4:
    }

    public final int describeContents()
    {
        return 0;
    }

    public final boolean equals(Object obj)
    {
        if (obj instanceof ActionTargetEntity) goto _L2; else goto _L1
_L1:
        return false;
_L2:
        Iterator iterator;
        if (this == obj)
        {
            return true;
        }
        obj = (ActionTargetEntity)obj;
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
        if (!((ActionTargetEntity) (obj)).isFieldSet(field)) goto _L1; else goto _L3
_L3:
        if (getFieldValue(field).equals(((ActionTargetEntity) (obj)).getFieldValue(field))) goto _L5; else goto _L4
_L4:
        return false;
        if (!((ActionTargetEntity) (obj)).isFieldSet(field)) goto _L5; else goto _L6
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
            return mAclDetails;

        case 5: // '\005'
            return mActivityId;

        case 6: // '\006'
            return Integer.valueOf(mAlphabeticalAclListCount);

        case 25: // '\031'
            return mGaiaId;

        case 61: // '='
            return mProfile;

        case 62: // '>'
            return mProfileData;

        case 89: // 'Y'
            return mTargetType;
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

        case 6: // '\006'
            mAlphabeticalAclListCount = i;
            break;
        }
        mIndicatorSet.add(Integer.valueOf(j));
    }

    protected final void setStringInternal(com.google.android.gms.common.server.response.FastJsonResponse.Field field, String s, String s1)
    {
        int i = field.getSafeParcelableFieldId();
        i;
        JVM INSTR lookupswitch 2: default 36
    //                   5: 66
    //                   62: 87;
           goto _L1 _L2 _L3
_L1:
        throw new IllegalArgumentException((new StringBuilder("Field with id=")).append(i).append(" is not known to be a String.").toString());
_L2:
        mActivityId = s1;
_L5:
        mIndicatorSet.add(Integer.valueOf(i));
        return;
_L3:
        mProfileData = s1;
        if (true) goto _L5; else goto _L4
_L4:
    }

    protected final void setStringsInternal(com.google.android.gms.common.server.response.FastJsonResponse.Field field, String s, ArrayList arraylist)
    {
        int i = field.getSafeParcelableFieldId();
        i;
        JVM INSTR lookupswitch 2: default 36
    //                   25: 66
    //                   89: 87;
           goto _L1 _L2 _L3
_L1:
        throw new IllegalArgumentException((new StringBuilder("Field with id=")).append(i).append(" is not known to be an array of String.").toString());
_L2:
        mGaiaId = arraylist;
_L5:
        mIndicatorSet.add(Integer.valueOf(i));
        return;
_L3:
        mTargetType = arraylist;
        if (true) goto _L5; else goto _L4
_L4:
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        ActionTargetEntityCreator.writeToParcel(this, parcel, i);
    }

    static 
    {
        HashMap hashmap = new HashMap();
        sFields = hashmap;
        hashmap.put("aclDetails", com.google.android.gms.common.server.response.FastJsonResponse.Field.forConcreteType("aclDetails", 2, com/google/android/gms/plus/service/v1whitelisted/models/AclDetailsEntity));
        sFields.put("activityId", com.google.android.gms.common.server.response.FastJsonResponse.Field.forString("activityId", 5));
        sFields.put("alphabeticalAclListCount", com.google.android.gms.common.server.response.FastJsonResponse.Field.forInteger("alphabeticalAclListCount", 6));
        sFields.put("gaiaId", com.google.android.gms.common.server.response.FastJsonResponse.Field.forStrings("gaiaId", 25));
        sFields.put("profile", com.google.android.gms.common.server.response.FastJsonResponse.Field.forConcreteType("profile", 61, com/google/android/gms/plus/service/v1whitelisted/models/LoggedProfileEntity));
        sFields.put("profileData", com.google.android.gms.common.server.response.FastJsonResponse.Field.forString("profileData", 62));
        sFields.put("targetType", com.google.android.gms.common.server.response.FastJsonResponse.Field.forStrings("targetType", 89));
    }
}
