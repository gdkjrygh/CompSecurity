// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.plus.internal.model.people;

import android.os.Parcel;
import com.google.android.gms.common.server.response.FastSafeParcelableJsonResponse;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.google.android.gms.plus.internal.model.people:
//            PersonEntity, PersonEntity_AgeRangeEntityCreator

public static final class mMin extends FastSafeParcelableJsonResponse
    implements com.google.android.gms.plus.model.people.esponse
{

    public static final PersonEntity_AgeRangeEntityCreator CREATOR = new PersonEntity_AgeRangeEntityCreator();
    private static final HashMap sFields;
    final Set mIndicatorSet;
    int mMax;
    int mMin;
    final int mVersionCode;

    public final int describeContents()
    {
        return 0;
    }

    public final boolean equals(Object obj)
    {
        if (obj instanceof mMin) goto _L2; else goto _L1
_L1:
        return false;
_L2:
        Iterator iterator;
        if (this == obj)
        {
            return true;
        }
        obj = (mMin)obj;
        iterator = sFields.values().iterator();
_L5:
        com.google.android.gms.common.server.response.ity ity;
        if (!iterator.hasNext())
        {
            break MISSING_BLOCK_LABEL_96;
        }
        ity = (com.google.android.gms.common.server.response.ity.sFields)iterator.next();
        if (!isFieldSet(ity))
        {
            continue; /* Loop/switch isn't completed */
        }
        if (!((isFieldSet) (obj)).isFieldSet(ity)) goto _L1; else goto _L3
_L3:
        if (getFieldValue(ity).equals(((getFieldValue) (obj)).getFieldValue(ity))) goto _L5; else goto _L4
_L4:
        return false;
        if (!((getFieldValue) (obj)).isFieldSet(ity)) goto _L5; else goto _L6
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

    protected final Object getFieldValue(com.google.android.gms.common.server.response.ity ity)
    {
        switch (ity.feParcelableFieldId())
        {
        default:
            throw new IllegalStateException((new StringBuilder("Unknown safe parcelable id=")).append(ity.feParcelableFieldId()).toString());

        case 2: // '\002'
            return Integer.valueOf(mMax);

        case 3: // '\003'
            return Integer.valueOf(mMin);
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
            com.google.android.gms.common.server.response.ity ity = (com.google.android.gms.common.server.response.ity.sFields)iterator.next();
            if (isFieldSet(ity))
            {
                i = ity.feParcelableFieldId() + i + getFieldValue(ity).hashCode();
            }
        } while (true);
        return i;
    }

    public final boolean isDataValid()
    {
        return true;
    }

    protected final boolean isFieldSet(com.google.android.gms.common.server.response.ity ity)
    {
        return mIndicatorSet.contains(Integer.valueOf(ity.feParcelableFieldId()));
    }

    protected final void setIntegerInternal(com.google.android.gms.common.server.response.ity ity, String s, int i)
    {
        int j = ity.feParcelableFieldId();
        j;
        JVM INSTR tableswitch 2 3: default 32
    //                   2 62
    //                   3 83;
           goto _L1 _L2 _L3
_L1:
        throw new IllegalArgumentException((new StringBuilder("Field with id=")).append(j).append(" is not known to be an int.").toString());
_L2:
        mMax = i;
_L5:
        mIndicatorSet.add(Integer.valueOf(j));
        return;
_L3:
        mMin = i;
        if (true) goto _L5; else goto _L4
_L4:
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        PersonEntity_AgeRangeEntityCreator.writeToParcel$665c4158(this, parcel);
    }

    static 
    {
        HashMap hashmap = new HashMap();
        sFields = hashmap;
        hashmap.put("max", com.google.android.gms.common.server.response.teger("max", 2));
        sFields.put("min", com.google.android.gms.common.server.response.teger("min", 3));
    }

    public reator()
    {
        mVersionCode = 1;
        mIndicatorSet = new HashSet();
    }

    mIndicatorSet(Set set, int i, int j, int k)
    {
        mIndicatorSet = set;
        mVersionCode = i;
        mMax = j;
        mMin = k;
    }
}
