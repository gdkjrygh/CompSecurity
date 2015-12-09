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
//            ClientActionData, ClientActionDataEntityCreator, ClientAclDetailsEntity, ClientLoggedCircleEntity, 
//            ClientLoggedCircleMemberEntity, ClientLoggedRhsComponentEntity

public final class ClientActionDataEntity extends FastSafeParcelableJsonResponse
    implements ClientActionData
{

    public static final ClientActionDataEntityCreator CREATOR = new ClientActionDataEntityCreator();
    private static final HashMap sFields;
    ClientAclDetailsEntity mAclDetails;
    List mCircle;
    List mCircleMember;
    final Set mIndicatorSet;
    List mObfuscatedGaiaId;
    ClientLoggedRhsComponentEntity mRhsComponent;
    final int mVersionCode;

    public ClientActionDataEntity()
    {
        mVersionCode = 1;
        mIndicatorSet = new HashSet();
    }

    ClientActionDataEntity(Set set, int i, ClientAclDetailsEntity clientacldetailsentity, List list, List list1, List list2, ClientLoggedRhsComponentEntity clientloggedrhscomponententity)
    {
        mIndicatorSet = set;
        mVersionCode = i;
        mAclDetails = clientacldetailsentity;
        mCircle = list;
        mCircleMember = list1;
        mObfuscatedGaiaId = list2;
        mRhsComponent = clientloggedrhscomponententity;
    }

    public final void addConcreteTypeArrayInternal(com.google.android.gms.common.server.response.FastJsonResponse.Field field, String s, ArrayList arraylist)
    {
        int i = field.getSafeParcelableFieldId();
        i;
        JVM INSTR tableswitch 7 8: default 32
    //                   7 77
    //                   8 98;
           goto _L1 _L2 _L3
_L1:
        throw new IllegalArgumentException((new StringBuilder("Field with id=")).append(i).append(" is not a known array of custom type.  Found ").append(arraylist.getClass().getCanonicalName()).append(".").toString());
_L2:
        mCircle = arraylist;
_L5:
        mIndicatorSet.add(Integer.valueOf(i));
        return;
_L3:
        mCircleMember = arraylist;
        if (true) goto _L5; else goto _L4
_L4:
    }

    public final void addConcreteTypeInternal(com.google.android.gms.common.server.response.FastJsonResponse.Field field, String s, FastJsonResponse fastjsonresponse)
    {
        int i = field.getSafeParcelableFieldId();
        i;
        JVM INSTR lookupswitch 2: default 36
    //                   2: 81
    //                   20: 105;
           goto _L1 _L2 _L3
_L1:
        throw new IllegalArgumentException((new StringBuilder("Field with id=")).append(i).append(" is not a known custom type.  Found ").append(fastjsonresponse.getClass().getCanonicalName()).append(".").toString());
_L2:
        mAclDetails = (ClientAclDetailsEntity)fastjsonresponse;
_L5:
        mIndicatorSet.add(Integer.valueOf(i));
        return;
_L3:
        mRhsComponent = (ClientLoggedRhsComponentEntity)fastjsonresponse;
        if (true) goto _L5; else goto _L4
_L4:
    }

    public final int describeContents()
    {
        return 0;
    }

    public final boolean equals(Object obj)
    {
        if (obj instanceof ClientActionDataEntity) goto _L2; else goto _L1
_L1:
        return false;
_L2:
        Iterator iterator;
        if (this == obj)
        {
            return true;
        }
        obj = (ClientActionDataEntity)obj;
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
        if (!((ClientActionDataEntity) (obj)).isFieldSet(field)) goto _L1; else goto _L3
_L3:
        if (getFieldValue(field).equals(((ClientActionDataEntity) (obj)).getFieldValue(field))) goto _L5; else goto _L4
_L4:
        return false;
        if (!((ClientActionDataEntity) (obj)).isFieldSet(field)) goto _L5; else goto _L6
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

        case 7: // '\007'
            return mCircle;

        case 8: // '\b'
            return mCircleMember;

        case 13: // '\r'
            return mObfuscatedGaiaId;

        case 20: // '\024'
            return mRhsComponent;
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

    protected final void setStringsInternal(com.google.android.gms.common.server.response.FastJsonResponse.Field field, String s, ArrayList arraylist)
    {
        int i = field.getSafeParcelableFieldId();
        switch (i)
        {
        default:
            throw new IllegalArgumentException((new StringBuilder("Field with id=")).append(i).append(" is not known to be an array of String.").toString());

        case 13: // '\r'
            mObfuscatedGaiaId = arraylist;
            break;
        }
        mIndicatorSet.add(Integer.valueOf(i));
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        ClientActionDataEntityCreator.writeToParcel(this, parcel, i);
    }

    static 
    {
        HashMap hashmap = new HashMap();
        sFields = hashmap;
        hashmap.put("aclDetails", com.google.android.gms.common.server.response.FastJsonResponse.Field.forConcreteType("aclDetails", 2, com/google/android/gms/plus/service/v1whitelisted/models/ClientAclDetailsEntity));
        sFields.put("circle", com.google.android.gms.common.server.response.FastJsonResponse.Field.forConcreteTypeArray("circle", 7, com/google/android/gms/plus/service/v1whitelisted/models/ClientLoggedCircleEntity));
        sFields.put("circleMember", com.google.android.gms.common.server.response.FastJsonResponse.Field.forConcreteTypeArray("circleMember", 8, com/google/android/gms/plus/service/v1whitelisted/models/ClientLoggedCircleMemberEntity));
        sFields.put("obfuscatedGaiaId", com.google.android.gms.common.server.response.FastJsonResponse.Field.forStrings("obfuscatedGaiaId", 13));
        sFields.put("rhsComponent", com.google.android.gms.common.server.response.FastJsonResponse.Field.forConcreteType("rhsComponent", 20, com/google/android/gms/plus/service/v1whitelisted/models/ClientLoggedRhsComponentEntity));
    }
}
