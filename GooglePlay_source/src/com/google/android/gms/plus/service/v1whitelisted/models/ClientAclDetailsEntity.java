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
//            ClientAclDetails, ClientAclDetailsEntityCreator, ClientLoggedCircleEntity, ClientLoggedCircleMemberEntity

public final class ClientAclDetailsEntity extends FastSafeParcelableJsonResponse
    implements ClientAclDetails
{

    public static final ClientAclDetailsEntityCreator CREATOR = new ClientAclDetailsEntityCreator();
    private static final HashMap sFields;
    List mCircle;
    final Set mIndicatorSet;
    List mPerson;
    List mSystemGroup;
    final int mVersionCode;

    public ClientAclDetailsEntity()
    {
        mVersionCode = 1;
        mIndicatorSet = new HashSet();
    }

    ClientAclDetailsEntity(Set set, int i, List list, List list1, List list2)
    {
        mIndicatorSet = set;
        mVersionCode = i;
        mCircle = list;
        mPerson = list1;
        mSystemGroup = list2;
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
        if (obj instanceof ClientAclDetailsEntity) goto _L2; else goto _L1
_L1:
        return false;
_L2:
        Iterator iterator;
        if (this == obj)
        {
            return true;
        }
        obj = (ClientAclDetailsEntity)obj;
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
        if (!((ClientAclDetailsEntity) (obj)).isFieldSet(field)) goto _L1; else goto _L3
_L3:
        if (getFieldValue(field).equals(((ClientAclDetailsEntity) (obj)).getFieldValue(field))) goto _L5; else goto _L4
_L4:
        return false;
        if (!((ClientAclDetailsEntity) (obj)).isFieldSet(field)) goto _L5; else goto _L6
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
            return mCircle;

        case 4: // '\004'
            return mPerson;

        case 5: // '\005'
            return mSystemGroup;
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

        case 5: // '\005'
            mSystemGroup = arraylist;
            break;
        }
        mIndicatorSet.add(Integer.valueOf(i));
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        ClientAclDetailsEntityCreator.writeToParcel$12494460(this, parcel);
    }

    static 
    {
        HashMap hashmap = new HashMap();
        sFields = hashmap;
        hashmap.put("circle", com.google.android.gms.common.server.response.FastJsonResponse.Field.forConcreteTypeArray("circle", 2, com/google/android/gms/plus/service/v1whitelisted/models/ClientLoggedCircleEntity));
        sFields.put("person", com.google.android.gms.common.server.response.FastJsonResponse.Field.forConcreteTypeArray("person", 4, com/google/android/gms/plus/service/v1whitelisted/models/ClientLoggedCircleMemberEntity));
        sFields.put("systemGroup", com.google.android.gms.common.server.response.FastJsonResponse.Field.forStrings("systemGroup", 5));
    }
}
