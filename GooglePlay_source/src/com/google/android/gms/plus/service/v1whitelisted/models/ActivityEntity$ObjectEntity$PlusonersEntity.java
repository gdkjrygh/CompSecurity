// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.plus.service.v1whitelisted.models;

import android.os.Parcel;
import com.google.android.gms.common.server.response.FastSafeParcelableJsonResponse;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.google.android.gms.plus.service.v1whitelisted.models:
//            ActivityEntity, ActivityEntity_ObjectEntity_PlusonersEntityCreator

public static final class mTotalItems extends FastSafeParcelableJsonResponse
    implements mTotalItems
{

    public static final ActivityEntity_ObjectEntity_PlusonersEntityCreator CREATOR = new ActivityEntity_ObjectEntity_PlusonersEntityCreator();
    private static final HashMap sFields;
    final Set mIndicatorSet;
    int mTotalItems;
    final int mVersionCode;

    public final int describeContents()
    {
        return 0;
    }

    public final boolean equals(Object obj)
    {
        if (obj instanceof mTotalItems) goto _L2; else goto _L1
_L1:
        return false;
_L2:
        Iterator iterator;
        if (this == obj)
        {
            return true;
        }
        obj = (mTotalItems)obj;
        iterator = sFields.values().iterator();
_L5:
        com.google.android.gms.common.server.response.nersEntity nersentity;
        if (!iterator.hasNext())
        {
            break MISSING_BLOCK_LABEL_96;
        }
        nersentity = (com.google.android.gms.common.server.response.nersEntity.sFields)iterator.next();
        if (!isFieldSet(nersentity))
        {
            continue; /* Loop/switch isn't completed */
        }
        if (!((isFieldSet) (obj)).isFieldSet(nersentity)) goto _L1; else goto _L3
_L3:
        if (getFieldValue(nersentity).equals(((getFieldValue) (obj)).getFieldValue(nersentity))) goto _L5; else goto _L4
_L4:
        return false;
        if (!((getFieldValue) (obj)).isFieldSet(nersentity)) goto _L5; else goto _L6
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

    protected final Object getFieldValue(com.google.android.gms.common.server.response.nersEntity nersentity)
    {
        switch (nersentity.dId())
        {
        default:
            throw new IllegalStateException((new StringBuilder("Unknown safe parcelable id=")).append(nersentity.dId()).toString());

        case 3: // '\003'
            return Integer.valueOf(mTotalItems);
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
            com.google.android.gms.common.server.response.nersEntity nersentity = (com.google.android.gms.common.server.response.nersEntity.sFields)iterator.next();
            if (isFieldSet(nersentity))
            {
                i = nersentity.dId() + i + getFieldValue(nersentity).hashCode();
            }
        } while (true);
        return i;
    }

    public final boolean isDataValid()
    {
        return true;
    }

    protected final boolean isFieldSet(com.google.android.gms.common.server.response.nersEntity nersentity)
    {
        return mIndicatorSet.contains(Integer.valueOf(nersentity.dId()));
    }

    protected final void setIntegerInternal(com.google.android.gms.common.server.response.nersEntity nersentity, String s, int i)
    {
        int j = nersentity.dId();
        switch (j)
        {
        default:
            throw new IllegalArgumentException((new StringBuilder("Field with id=")).append(j).append(" is not known to be an int.").toString());

        case 3: // '\003'
            mTotalItems = i;
            break;
        }
        mIndicatorSet.add(Integer.valueOf(j));
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        ActivityEntity_ObjectEntity_PlusonersEntityCreator.writeToParcel$211e0faa(this, parcel);
    }

    static 
    {
        HashMap hashmap = new HashMap();
        sFields = hashmap;
        hashmap.put("totalItems", com.google.android.gms.common.server.response.nersEntity.sFields("totalItems", 3));
    }

    public reator()
    {
        mVersionCode = 1;
        mIndicatorSet = new HashSet();
    }

    mIndicatorSet(Set set, int i, int j)
    {
        mIndicatorSet = set;
        mVersionCode = i;
        mTotalItems = j;
    }
}
