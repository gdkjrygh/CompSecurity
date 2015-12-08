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
//            UpgradeAccountEntity, UpgradeAccountEntity_FormEntityCreator, AccountField

public static final class mFields extends FastSafeParcelableJsonResponse
    implements mFields
{

    public static final UpgradeAccountEntity_FormEntityCreator CREATOR = new UpgradeAccountEntity_FormEntityCreator();
    private static final HashMap sFields;
    List mFields;
    final Set mIndicatorSet;
    final int mVersionCode;

    public final void addConcreteTypeArrayInternal(com.google.android.gms.common.server.response.FormEntity formentity, String s, ArrayList arraylist)
    {
        int i = formentity.rcelableFieldId();
        switch (i)
        {
        default:
            throw new IllegalArgumentException((new StringBuilder("Field with id=")).append(i).append(" is not a known array of custom type.  Found ").append(arraylist.getClass().getCanonicalName()).append(".").toString());

        case 2: // '\002'
            mFields = arraylist;
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
        if (obj instanceof mIndicatorSet) goto _L2; else goto _L1
_L1:
        return false;
_L2:
        Iterator iterator;
        if (this == obj)
        {
            return true;
        }
        obj = (mIndicatorSet)obj;
        iterator = sFields.values().iterator();
_L5:
        com.google.android.gms.common.server.response.FormEntity formentity;
        if (!iterator.hasNext())
        {
            break MISSING_BLOCK_LABEL_96;
        }
        formentity = (com.google.android.gms.common.server.response.FormEntity.sFields)iterator.next();
        if (!isFieldSet(formentity))
        {
            continue; /* Loop/switch isn't completed */
        }
        if (!((isFieldSet) (obj)).isFieldSet(formentity)) goto _L1; else goto _L3
_L3:
        if (getFieldValue(formentity).equals(((getFieldValue) (obj)).getFieldValue(formentity))) goto _L5; else goto _L4
_L4:
        return false;
        if (!((getFieldValue) (obj)).isFieldSet(formentity)) goto _L5; else goto _L6
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

    protected final Object getFieldValue(com.google.android.gms.common.server.response.FormEntity formentity)
    {
        switch (formentity.rcelableFieldId())
        {
        default:
            throw new IllegalStateException((new StringBuilder("Unknown safe parcelable id=")).append(formentity.rcelableFieldId()).toString());

        case 2: // '\002'
            return mFields;
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
            com.google.android.gms.common.server.response.FormEntity formentity = (com.google.android.gms.common.server.response.FormEntity.sFields)iterator.next();
            if (isFieldSet(formentity))
            {
                i = formentity.rcelableFieldId() + i + getFieldValue(formentity).hashCode();
            }
        } while (true);
        return i;
    }

    public final boolean isDataValid()
    {
        return true;
    }

    protected final boolean isFieldSet(com.google.android.gms.common.server.response.FormEntity formentity)
    {
        return mIndicatorSet.contains(Integer.valueOf(formentity.rcelableFieldId()));
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        UpgradeAccountEntity_FormEntityCreator.writeToParcel$6d03cc9f(this, parcel);
    }

    static 
    {
        HashMap hashmap = new HashMap();
        sFields = hashmap;
        hashmap.put("fields", com.google.android.gms.common.server.response.teTypeArray("fields", 2, com/google/android/gms/plus/service/v1whitelisted/models/AccountField));
    }

    public reator()
    {
        mVersionCode = 1;
        mIndicatorSet = new HashSet();
    }

    mIndicatorSet(Set set, int i, List list)
    {
        mIndicatorSet = set;
        mVersionCode = i;
        mFields = list;
    }
}
