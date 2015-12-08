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
//            FavaDiagnostics, FavaDiagnosticsEntityCreator, FavaDiagnosticsNamespacedTypeEntity

public final class FavaDiagnosticsEntity extends FastSafeParcelableJsonResponse
    implements FavaDiagnostics
{

    public static final FavaDiagnosticsEntityCreator CREATOR = new FavaDiagnosticsEntityCreator();
    private static final HashMap sFields;
    FavaDiagnosticsNamespacedTypeEntity mActionType;
    FavaDiagnosticsNamespacedTypeEntity mEndView;
    final Set mIndicatorSet;
    FavaDiagnosticsNamespacedTypeEntity mStartView;
    int mTotalTimeMs;
    final int mVersionCode;

    public FavaDiagnosticsEntity()
    {
        mVersionCode = 1;
        mIndicatorSet = new HashSet();
    }

    FavaDiagnosticsEntity(Set set, int i, FavaDiagnosticsNamespacedTypeEntity favadiagnosticsnamespacedtypeentity, FavaDiagnosticsNamespacedTypeEntity favadiagnosticsnamespacedtypeentity1, FavaDiagnosticsNamespacedTypeEntity favadiagnosticsnamespacedtypeentity2, int j)
    {
        mIndicatorSet = set;
        mVersionCode = i;
        mActionType = favadiagnosticsnamespacedtypeentity;
        mEndView = favadiagnosticsnamespacedtypeentity1;
        mStartView = favadiagnosticsnamespacedtypeentity2;
        mTotalTimeMs = j;
    }

    public final void addConcreteTypeInternal(com.google.android.gms.common.server.response.FastJsonResponse.Field field, String s, FastJsonResponse fastjsonresponse)
    {
        int i = field.getSafeParcelableFieldId();
        i;
        JVM INSTR lookupswitch 3: default 44
    //                   3: 89
    //                   4: 113
    //                   20: 124;
           goto _L1 _L2 _L3 _L4
_L1:
        throw new IllegalArgumentException((new StringBuilder("Field with id=")).append(i).append(" is not a known custom type.  Found ").append(fastjsonresponse.getClass().getCanonicalName()).append(".").toString());
_L2:
        mActionType = (FavaDiagnosticsNamespacedTypeEntity)fastjsonresponse;
_L6:
        mIndicatorSet.add(Integer.valueOf(i));
        return;
_L3:
        mEndView = (FavaDiagnosticsNamespacedTypeEntity)fastjsonresponse;
        continue; /* Loop/switch isn't completed */
_L4:
        mStartView = (FavaDiagnosticsNamespacedTypeEntity)fastjsonresponse;
        if (true) goto _L6; else goto _L5
_L5:
    }

    public final int describeContents()
    {
        return 0;
    }

    public final boolean equals(Object obj)
    {
        if (obj instanceof FavaDiagnosticsEntity) goto _L2; else goto _L1
_L1:
        return false;
_L2:
        Iterator iterator;
        if (this == obj)
        {
            return true;
        }
        obj = (FavaDiagnosticsEntity)obj;
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
        if (!((FavaDiagnosticsEntity) (obj)).isFieldSet(field)) goto _L1; else goto _L3
_L3:
        if (getFieldValue(field).equals(((FavaDiagnosticsEntity) (obj)).getFieldValue(field))) goto _L5; else goto _L4
_L4:
        return false;
        if (!((FavaDiagnosticsEntity) (obj)).isFieldSet(field)) goto _L5; else goto _L6
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

        case 3: // '\003'
            return mActionType;

        case 4: // '\004'
            return mEndView;

        case 20: // '\024'
            return mStartView;

        case 24: // '\030'
            return Integer.valueOf(mTotalTimeMs);
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

        case 24: // '\030'
            mTotalTimeMs = i;
            break;
        }
        mIndicatorSet.add(Integer.valueOf(j));
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        FavaDiagnosticsEntityCreator.writeToParcel(this, parcel, i);
    }

    static 
    {
        HashMap hashmap = new HashMap();
        sFields = hashmap;
        hashmap.put("actionType", com.google.android.gms.common.server.response.FastJsonResponse.Field.forConcreteType("actionType", 3, com/google/android/gms/plus/service/v1whitelisted/models/FavaDiagnosticsNamespacedTypeEntity));
        sFields.put("endView", com.google.android.gms.common.server.response.FastJsonResponse.Field.forConcreteType("endView", 4, com/google/android/gms/plus/service/v1whitelisted/models/FavaDiagnosticsNamespacedTypeEntity));
        sFields.put("startView", com.google.android.gms.common.server.response.FastJsonResponse.Field.forConcreteType("startView", 20, com/google/android/gms/plus/service/v1whitelisted/models/FavaDiagnosticsNamespacedTypeEntity));
        sFields.put("totalTimeMs", com.google.android.gms.common.server.response.FastJsonResponse.Field.forInteger("totalTimeMs", 24));
    }
}
