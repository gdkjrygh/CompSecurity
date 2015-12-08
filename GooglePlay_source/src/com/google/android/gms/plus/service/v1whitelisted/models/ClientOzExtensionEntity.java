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
//            ClientOzExtension, ClientOzExtensionEntityCreator, ClientOzEventEntity

public final class ClientOzExtensionEntity extends FastSafeParcelableJsonResponse
    implements ClientOzExtension
{

    public static final ClientOzExtensionEntityCreator CREATOR = new ClientOzExtensionEntityCreator();
    private static final HashMap sFields;
    String mCallingApplication;
    List mClientEvent;
    String mClientId;
    String mClientVersion;
    final Set mIndicatorSet;
    long mSendTimeMsec;
    final int mVersionCode;

    public ClientOzExtensionEntity()
    {
        mVersionCode = 1;
        mIndicatorSet = new HashSet();
    }

    ClientOzExtensionEntity(Set set, int i, String s, List list, String s1, String s2, long l)
    {
        mIndicatorSet = set;
        mVersionCode = i;
        mCallingApplication = s;
        mClientEvent = list;
        mClientId = s1;
        mClientVersion = s2;
        mSendTimeMsec = l;
    }

    public final void addConcreteTypeArrayInternal(com.google.android.gms.common.server.response.FastJsonResponse.Field field, String s, ArrayList arraylist)
    {
        int i = field.getSafeParcelableFieldId();
        switch (i)
        {
        default:
            throw new IllegalArgumentException((new StringBuilder("Field with id=")).append(i).append(" is not a known array of custom type.  Found ").append(arraylist.getClass().getCanonicalName()).append(".").toString());

        case 3: // '\003'
            mClientEvent = arraylist;
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
        if (obj instanceof ClientOzExtensionEntity) goto _L2; else goto _L1
_L1:
        return false;
_L2:
        Iterator iterator;
        if (this == obj)
        {
            return true;
        }
        obj = (ClientOzExtensionEntity)obj;
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
        if (!((ClientOzExtensionEntity) (obj)).isFieldSet(field)) goto _L1; else goto _L3
_L3:
        if (getFieldValue(field).equals(((ClientOzExtensionEntity) (obj)).getFieldValue(field))) goto _L5; else goto _L4
_L4:
        return false;
        if (!((ClientOzExtensionEntity) (obj)).isFieldSet(field)) goto _L5; else goto _L6
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
            return mCallingApplication;

        case 3: // '\003'
            return mClientEvent;

        case 4: // '\004'
            return mClientId;

        case 5: // '\005'
            return mClientVersion;

        case 6: // '\006'
            return Long.valueOf(mSendTimeMsec);
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

        case 6: // '\006'
            mSendTimeMsec = l;
            break;
        }
        mIndicatorSet.add(Integer.valueOf(i));
    }

    protected final void setStringInternal(com.google.android.gms.common.server.response.FastJsonResponse.Field field, String s, String s1)
    {
        int i = field.getSafeParcelableFieldId();
        i;
        JVM INSTR tableswitch 2 5: default 40
    //                   2 70
    //                   3 40
    //                   4 91
    //                   5 99;
           goto _L1 _L2 _L1 _L3 _L4
_L1:
        throw new IllegalArgumentException((new StringBuilder("Field with id=")).append(i).append(" is not known to be a String.").toString());
_L2:
        mCallingApplication = s1;
_L6:
        mIndicatorSet.add(Integer.valueOf(i));
        return;
_L3:
        mClientId = s1;
        continue; /* Loop/switch isn't completed */
_L4:
        mClientVersion = s1;
        if (true) goto _L6; else goto _L5
_L5:
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        ClientOzExtensionEntityCreator.writeToParcel$868c136(this, parcel);
    }

    static 
    {
        HashMap hashmap = new HashMap();
        sFields = hashmap;
        hashmap.put("callingApplication", com.google.android.gms.common.server.response.FastJsonResponse.Field.forString("callingApplication", 2));
        sFields.put("clientEvent", com.google.android.gms.common.server.response.FastJsonResponse.Field.forConcreteTypeArray("clientEvent", 3, com/google/android/gms/plus/service/v1whitelisted/models/ClientOzEventEntity));
        sFields.put("clientId", com.google.android.gms.common.server.response.FastJsonResponse.Field.forString("clientId", 4));
        sFields.put("clientVersion", com.google.android.gms.common.server.response.FastJsonResponse.Field.forString("clientVersion", 5));
        sFields.put("sendTimeMsec", com.google.android.gms.common.server.response.FastJsonResponse.Field.forLong("sendTimeMsec", 6));
    }
}
