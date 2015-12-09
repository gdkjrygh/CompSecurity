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
//            AudienceCreator, PlusAclentryResourceEntity

public final class Audience extends FastSafeParcelableJsonResponse
{

    public static final AudienceCreator CREATOR = new AudienceCreator();
    private static final HashMap sFields;
    final Set mIndicatorSet;
    PlusAclentryResourceEntity mItem;
    final int mVersionCode;
    String mVisibility;

    public Audience()
    {
        mVersionCode = 1;
        mIndicatorSet = new HashSet();
    }

    Audience(Set set, int i, PlusAclentryResourceEntity plusaclentryresourceentity, String s)
    {
        mIndicatorSet = set;
        mVersionCode = i;
        mItem = plusaclentryresourceentity;
        mVisibility = s;
    }

    public final void addConcreteTypeInternal(com.google.android.gms.common.server.response.FastJsonResponse.Field field, String s, FastJsonResponse fastjsonresponse)
    {
        int i = field.getSafeParcelableFieldId();
        switch (i)
        {
        default:
            throw new IllegalArgumentException((new StringBuilder("Field with id=")).append(i).append(" is not a known custom type.  Found ").append(fastjsonresponse.getClass().getCanonicalName()).append(".").toString());

        case 3: // '\003'
            mItem = (PlusAclentryResourceEntity)fastjsonresponse;
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
        if (obj instanceof Audience) goto _L2; else goto _L1
_L1:
        return false;
_L2:
        Iterator iterator;
        if (this == obj)
        {
            return true;
        }
        obj = (Audience)obj;
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
        if (!((Audience) (obj)).isFieldSet(field)) goto _L1; else goto _L3
_L3:
        if (getFieldValue(field).equals(((Audience) (obj)).getFieldValue(field))) goto _L5; else goto _L4
_L4:
        return false;
        if (!((Audience) (obj)).isFieldSet(field)) goto _L5; else goto _L6
_L6:
        return false;
        return true;
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
        case 5: // '\005'
        default:
            throw new IllegalStateException((new StringBuilder("Unknown safe parcelable id=")).append(field.getSafeParcelableFieldId()).toString());

        case 3: // '\003'
            return mItem;

        case 6: // '\006'
            return mVisibility;
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

    protected final boolean isFieldSet(com.google.android.gms.common.server.response.FastJsonResponse.Field field)
    {
        return mIndicatorSet.contains(Integer.valueOf(field.getSafeParcelableFieldId()));
    }

    protected final void setStringInternal(com.google.android.gms.common.server.response.FastJsonResponse.Field field, String s, String s1)
    {
        int i = field.getSafeParcelableFieldId();
        switch (i)
        {
        default:
            throw new IllegalArgumentException((new StringBuilder("Field with id=")).append(i).append(" is not known to be a String.").toString());

        case 6: // '\006'
            mVisibility = s1;
            break;
        }
        mIndicatorSet.add(Integer.valueOf(i));
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        AudienceCreator.writeToParcel(this, parcel, i);
    }

    static 
    {
        HashMap hashmap = new HashMap();
        sFields = hashmap;
        hashmap.put("item", com.google.android.gms.common.server.response.FastJsonResponse.Field.forConcreteType("item", 3, com/google/android/gms/plus/service/v1whitelisted/models/PlusAclentryResourceEntity));
        sFields.put("visibility", com.google.android.gms.common.server.response.FastJsonResponse.Field.forString("visibility", 6));
    }
}
