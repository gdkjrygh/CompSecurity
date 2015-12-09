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
//            ActivityEntity, ActivityEntity_ObjectEntity_AttachmentsEntity_ImageEntityCreator

public static final class mUrl extends FastSafeParcelableJsonResponse
    implements mUrl
{

    public static final ActivityEntity_ObjectEntity_AttachmentsEntity_ImageEntityCreator CREATOR = new ActivityEntity_ObjectEntity_AttachmentsEntity_ImageEntityCreator();
    private static final HashMap sFields;
    final Set mIndicatorSet;
    String mUrl;
    final int mVersionCode;

    public final int describeContents()
    {
        return 0;
    }

    public final boolean equals(Object obj)
    {
        if (obj instanceof mUrl) goto _L2; else goto _L1
_L1:
        return false;
_L2:
        Iterator iterator;
        if (this == obj)
        {
            return true;
        }
        obj = (mUrl)obj;
        iterator = sFields.values().iterator();
_L5:
        com.google.android.gms.common.server.response.mageEntity mageentity;
        if (!iterator.hasNext())
        {
            break MISSING_BLOCK_LABEL_96;
        }
        mageentity = (com.google.android.gms.common.server.response.mageEntity.sFields)iterator.next();
        if (!isFieldSet(mageentity))
        {
            continue; /* Loop/switch isn't completed */
        }
        if (!((isFieldSet) (obj)).isFieldSet(mageentity)) goto _L1; else goto _L3
_L3:
        if (getFieldValue(mageentity).equals(((getFieldValue) (obj)).getFieldValue(mageentity))) goto _L5; else goto _L4
_L4:
        return false;
        if (!((getFieldValue) (obj)).isFieldSet(mageentity)) goto _L5; else goto _L6
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

    protected final Object getFieldValue(com.google.android.gms.common.server.response.mageEntity mageentity)
    {
        switch (mageentity.mageEntity())
        {
        default:
            throw new IllegalStateException((new StringBuilder("Unknown safe parcelable id=")).append(mageentity.mageEntity()).toString());

        case 4: // '\004'
            return mUrl;
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
            com.google.android.gms.common.server.response.mageEntity mageentity = (com.google.android.gms.common.server.response.mageEntity.sFields)iterator.next();
            if (isFieldSet(mageentity))
            {
                i = mageentity.isFieldSet() + i + getFieldValue(mageentity).hashCode();
            }
        } while (true);
        return i;
    }

    public final boolean isDataValid()
    {
        return true;
    }

    protected final boolean isFieldSet(com.google.android.gms.common.server.response.mageEntity mageentity)
    {
        return mIndicatorSet.contains(Integer.valueOf(mageentity.mIndicatorSet()));
    }

    protected final void setStringInternal(com.google.android.gms.common.server.response.mageEntity mageentity, String s, String s1)
    {
        int i = mageentity.mageEntity();
        switch (i)
        {
        default:
            throw new IllegalArgumentException((new StringBuilder("Field with id=")).append(i).append(" is not known to be a String.").toString());

        case 4: // '\004'
            mUrl = s1;
            break;
        }
        mIndicatorSet.add(Integer.valueOf(i));
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        ActivityEntity_ObjectEntity_AttachmentsEntity_ImageEntityCreator.writeToParcel$1b0a2839(this, parcel);
    }

    static 
    {
        HashMap hashmap = new HashMap();
        sFields = hashmap;
        hashmap.put("url", com.google.android.gms.common.server.response.mageEntity.sFields("url", 4));
    }

    public reator()
    {
        mVersionCode = 1;
        mIndicatorSet = new HashSet();
    }

    mIndicatorSet(Set set, int i, String s)
    {
        mIndicatorSet = set;
        mVersionCode = i;
        mUrl = s;
    }
}
