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
//            OzEvent, OzEventEntityCreator, ActionTargetEntity, OzDeviceInfoEntity, 
//            FavaDiagnosticsEntity

public final class OzEventEntity extends FastSafeParcelableJsonResponse
    implements OzEvent
{

    public static final OzEventEntityCreator CREATOR = new OzEventEntityCreator();
    private static final HashMap sFields;
    ActionTargetEntity mActionTarget;
    OzDeviceInfoEntity mDeviceInfo;
    FavaDiagnosticsEntity mFavaDiagnostics;
    final Set mIndicatorSet;
    boolean mIsNativePlatformEvent;
    String mThirdPartyAppName;
    String mThirdPartyCertificateHash;
    final int mVersionCode;

    public OzEventEntity()
    {
        mVersionCode = 1;
        mIndicatorSet = new HashSet();
    }

    OzEventEntity(Set set, int i, ActionTargetEntity actiontargetentity, OzDeviceInfoEntity ozdeviceinfoentity, FavaDiagnosticsEntity favadiagnosticsentity, boolean flag, String s, 
            String s1)
    {
        mIndicatorSet = set;
        mVersionCode = i;
        mActionTarget = actiontargetentity;
        mDeviceInfo = ozdeviceinfoentity;
        mFavaDiagnostics = favadiagnosticsentity;
        mIsNativePlatformEvent = flag;
        mThirdPartyAppName = s;
        mThirdPartyCertificateHash = s1;
    }

    public final void addConcreteTypeInternal(com.google.android.gms.common.server.response.FastJsonResponse.Field field, String s, FastJsonResponse fastjsonresponse)
    {
        int i = field.getSafeParcelableFieldId();
        i;
        JVM INSTR tableswitch 2 7: default 48
    //                   2 93
    //                   3 48
    //                   4 48
    //                   5 117
    //                   6 48
    //                   7 128;
           goto _L1 _L2 _L1 _L1 _L3 _L1 _L4
_L1:
        throw new IllegalArgumentException((new StringBuilder("Field with id=")).append(i).append(" is not a known custom type.  Found ").append(fastjsonresponse.getClass().getCanonicalName()).append(".").toString());
_L2:
        mActionTarget = (ActionTargetEntity)fastjsonresponse;
_L6:
        mIndicatorSet.add(Integer.valueOf(i));
        return;
_L3:
        mDeviceInfo = (OzDeviceInfoEntity)fastjsonresponse;
        continue; /* Loop/switch isn't completed */
_L4:
        mFavaDiagnostics = (FavaDiagnosticsEntity)fastjsonresponse;
        if (true) goto _L6; else goto _L5
_L5:
    }

    public final int describeContents()
    {
        return 0;
    }

    public final boolean equals(Object obj)
    {
        if (obj instanceof OzEventEntity) goto _L2; else goto _L1
_L1:
        return false;
_L2:
        Iterator iterator;
        if (this == obj)
        {
            return true;
        }
        obj = (OzEventEntity)obj;
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
        if (!((OzEventEntity) (obj)).isFieldSet(field)) goto _L1; else goto _L3
_L3:
        if (getFieldValue(field).equals(((OzEventEntity) (obj)).getFieldValue(field))) goto _L5; else goto _L4
_L4:
        return false;
        if (!((OzEventEntity) (obj)).isFieldSet(field)) goto _L5; else goto _L6
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
        case 4: // '\004'
        case 6: // '\006'
        case 8: // '\b'
        case 9: // '\t'
        case 11: // '\013'
        case 12: // '\f'
        case 13: // '\r'
        default:
            throw new IllegalStateException((new StringBuilder("Unknown safe parcelable id=")).append(field.getSafeParcelableFieldId()).toString());

        case 2: // '\002'
            return mActionTarget;

        case 5: // '\005'
            return mDeviceInfo;

        case 7: // '\007'
            return mFavaDiagnostics;

        case 10: // '\n'
            return Boolean.valueOf(mIsNativePlatformEvent);

        case 14: // '\016'
            return mThirdPartyAppName;

        case 15: // '\017'
            return mThirdPartyCertificateHash;
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

        case 10: // '\n'
            mIsNativePlatformEvent = flag;
            break;
        }
        mIndicatorSet.add(Integer.valueOf(i));
    }

    protected final void setStringInternal(com.google.android.gms.common.server.response.FastJsonResponse.Field field, String s, String s1)
    {
        int i = field.getSafeParcelableFieldId();
        i;
        JVM INSTR tableswitch 14 15: default 32
    //                   14 62
    //                   15 83;
           goto _L1 _L2 _L3
_L1:
        throw new IllegalArgumentException((new StringBuilder("Field with id=")).append(i).append(" is not known to be a String.").toString());
_L2:
        mThirdPartyAppName = s1;
_L5:
        mIndicatorSet.add(Integer.valueOf(i));
        return;
_L3:
        mThirdPartyCertificateHash = s1;
        if (true) goto _L5; else goto _L4
_L4:
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        OzEventEntityCreator.writeToParcel(this, parcel, i);
    }

    static 
    {
        HashMap hashmap = new HashMap();
        sFields = hashmap;
        hashmap.put("actionTarget", com.google.android.gms.common.server.response.FastJsonResponse.Field.forConcreteType("actionTarget", 2, com/google/android/gms/plus/service/v1whitelisted/models/ActionTargetEntity));
        sFields.put("deviceInfo", com.google.android.gms.common.server.response.FastJsonResponse.Field.forConcreteType("deviceInfo", 5, com/google/android/gms/plus/service/v1whitelisted/models/OzDeviceInfoEntity));
        sFields.put("favaDiagnostics", com.google.android.gms.common.server.response.FastJsonResponse.Field.forConcreteType("favaDiagnostics", 7, com/google/android/gms/plus/service/v1whitelisted/models/FavaDiagnosticsEntity));
        sFields.put("isNativePlatformEvent", com.google.android.gms.common.server.response.FastJsonResponse.Field.forBoolean("isNativePlatformEvent", 10));
        sFields.put("thirdPartyAppName", com.google.android.gms.common.server.response.FastJsonResponse.Field.forString("thirdPartyAppName", 14));
        sFields.put("thirdPartyCertificateHash", com.google.android.gms.common.server.response.FastJsonResponse.Field.forString("thirdPartyCertificateHash", 15));
    }
}
