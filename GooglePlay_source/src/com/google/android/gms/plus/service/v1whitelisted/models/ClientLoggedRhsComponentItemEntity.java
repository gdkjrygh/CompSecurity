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
//            ClientLoggedRhsComponentItem, ClientLoggedRhsComponentItemEntityCreator, ClientLoggedCircleEntity, ClientLoggedCircleMemberEntity

public final class ClientLoggedRhsComponentItemEntity extends FastSafeParcelableJsonResponse
    implements ClientLoggedRhsComponentItem
{

    public static final ClientLoggedRhsComponentItemEntityCreator CREATOR = new ClientLoggedRhsComponentItemEntityCreator();
    private static final HashMap sFields;
    List mCircle;
    final Set mIndicatorSet;
    List mPerson;
    final int mVersionCode;

    public ClientLoggedRhsComponentItemEntity()
    {
        mVersionCode = 1;
        mIndicatorSet = new HashSet();
    }

    ClientLoggedRhsComponentItemEntity(Set set, int i, List list, List list1)
    {
        mIndicatorSet = set;
        mVersionCode = i;
        mCircle = list;
        mPerson = list1;
    }

    public final void addConcreteTypeArrayInternal(com.google.android.gms.common.server.response.FastJsonResponse.Field field, String s, ArrayList arraylist)
    {
        int i = field.getSafeParcelableFieldId();
        i;
        JVM INSTR lookupswitch 2: default 36
    //                   2: 81
    //                   9: 102;
           goto _L1 _L2 _L3
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
        if (obj instanceof ClientLoggedRhsComponentItemEntity) goto _L2; else goto _L1
_L1:
        return false;
_L2:
        Iterator iterator;
        if (this == obj)
        {
            return true;
        }
        obj = (ClientLoggedRhsComponentItemEntity)obj;
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
        if (!((ClientLoggedRhsComponentItemEntity) (obj)).isFieldSet(field)) goto _L1; else goto _L3
_L3:
        if (getFieldValue(field).equals(((ClientLoggedRhsComponentItemEntity) (obj)).getFieldValue(field))) goto _L5; else goto _L4
_L4:
        return false;
        if (!((ClientLoggedRhsComponentItemEntity) (obj)).isFieldSet(field)) goto _L5; else goto _L6
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
            return mCircle;

        case 9: // '\t'
            return mPerson;
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
        ClientLoggedRhsComponentItemEntityCreator.writeToParcel$7dd98243(this, parcel);
    }

    static 
    {
        HashMap hashmap = new HashMap();
        sFields = hashmap;
        hashmap.put("circle", com.google.android.gms.common.server.response.FastJsonResponse.Field.forConcreteTypeArray("circle", 2, com/google/android/gms/plus/service/v1whitelisted/models/ClientLoggedCircleEntity));
        sFields.put("person", com.google.android.gms.common.server.response.FastJsonResponse.Field.forConcreteTypeArray("person", 9, com/google/android/gms/plus/service/v1whitelisted/models/ClientLoggedCircleMemberEntity));
    }
}
