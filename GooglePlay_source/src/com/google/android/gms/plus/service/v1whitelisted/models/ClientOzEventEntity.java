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
//            ClientOzEvent, ClientOzEventEntityCreator, ClientActionDataEntity, OzEventEntity

public final class ClientOzEventEntity extends FastSafeParcelableJsonResponse
    implements ClientOzEvent
{

    public static final ClientOzEventEntityCreator CREATOR = new ClientOzEventEntityCreator();
    private static final HashMap sFields;
    ClientActionDataEntity mActionData;
    long mClientTimeMsec;
    final Set mIndicatorSet;
    OzEventEntity mOzEvent;
    final int mVersionCode;

    public ClientOzEventEntity()
    {
        mVersionCode = 1;
        mIndicatorSet = new HashSet();
    }

    ClientOzEventEntity(Set set, int i, ClientActionDataEntity clientactiondataentity, long l, OzEventEntity ozevententity)
    {
        mIndicatorSet = set;
        mVersionCode = i;
        mActionData = clientactiondataentity;
        mClientTimeMsec = l;
        mOzEvent = ozevententity;
    }

    public final void addConcreteTypeInternal(com.google.android.gms.common.server.response.FastJsonResponse.Field field, String s, FastJsonResponse fastjsonresponse)
    {
        int i = field.getSafeParcelableFieldId();
        i;
        JVM INSTR tableswitch 2 5: default 40
    //                   2 85
    //                   3 40
    //                   4 40
    //                   5 109;
           goto _L1 _L2 _L1 _L1 _L3
_L1:
        throw new IllegalArgumentException((new StringBuilder("Field with id=")).append(i).append(" is not a known custom type.  Found ").append(fastjsonresponse.getClass().getCanonicalName()).append(".").toString());
_L2:
        mActionData = (ClientActionDataEntity)fastjsonresponse;
_L5:
        mIndicatorSet.add(Integer.valueOf(i));
        return;
_L3:
        mOzEvent = (OzEventEntity)fastjsonresponse;
        if (true) goto _L5; else goto _L4
_L4:
    }

    public final int describeContents()
    {
        return 0;
    }

    public final boolean equals(Object obj)
    {
        if (obj instanceof ClientOzEventEntity) goto _L2; else goto _L1
_L1:
        return false;
_L2:
        Iterator iterator;
        if (this == obj)
        {
            return true;
        }
        obj = (ClientOzEventEntity)obj;
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
        if (!((ClientOzEventEntity) (obj)).isFieldSet(field)) goto _L1; else goto _L3
_L3:
        if (getFieldValue(field).equals(((ClientOzEventEntity) (obj)).getFieldValue(field))) goto _L5; else goto _L4
_L4:
        return false;
        if (!((ClientOzEventEntity) (obj)).isFieldSet(field)) goto _L5; else goto _L6
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
        case 4: // '\004'
        default:
            throw new IllegalStateException((new StringBuilder("Unknown safe parcelable id=")).append(field.getSafeParcelableFieldId()).toString());

        case 2: // '\002'
            return mActionData;

        case 3: // '\003'
            return Long.valueOf(mClientTimeMsec);

        case 5: // '\005'
            return mOzEvent;
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

    protected final void setLongInternal(com.google.android.gms.common.server.response.FastJsonResponse.Field field, String s, long l)
    {
        int i = field.getSafeParcelableFieldId();
        switch (i)
        {
        default:
            throw new IllegalArgumentException((new StringBuilder("Field with id=")).append(i).append(" is not known to be a long.").toString());

        case 3: // '\003'
            mClientTimeMsec = l;
            break;
        }
        mIndicatorSet.add(Integer.valueOf(i));
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        ClientOzEventEntityCreator.writeToParcel(this, parcel, i);
    }

    static 
    {
        HashMap hashmap = new HashMap();
        sFields = hashmap;
        hashmap.put("actionData", com.google.android.gms.common.server.response.FastJsonResponse.Field.forConcreteType("actionData", 2, com/google/android/gms/plus/service/v1whitelisted/models/ClientActionDataEntity));
        sFields.put("clientTimeMsec", com.google.android.gms.common.server.response.FastJsonResponse.Field.forLong("clientTimeMsec", 3));
        sFields.put("ozEvent", com.google.android.gms.common.server.response.FastJsonResponse.Field.forConcreteType("ozEvent", 5, com/google/android/gms/plus/service/v1whitelisted/models/OzEventEntity));
    }
}
