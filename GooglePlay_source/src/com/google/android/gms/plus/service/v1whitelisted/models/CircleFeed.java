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
//            CircleFeedCreator, CircleEntity

public final class CircleFeed extends FastSafeParcelableJsonResponse
{

    public static final CircleFeedCreator CREATOR = new CircleFeedCreator();
    private static final HashMap sFields;
    String mEtag;
    final Set mIndicatorSet;
    List mItems;
    String mNextPageToken;
    final int mVersionCode;

    public CircleFeed()
    {
        mVersionCode = 1;
        mIndicatorSet = new HashSet();
    }

    CircleFeed(Set set, int i, String s, List list, String s1)
    {
        mIndicatorSet = set;
        mVersionCode = i;
        mEtag = s;
        mItems = list;
        mNextPageToken = s1;
    }

    public final void addConcreteTypeArrayInternal(com.google.android.gms.common.server.response.FastJsonResponse.Field field, String s, ArrayList arraylist)
    {
        int i = field.getSafeParcelableFieldId();
        switch (i)
        {
        default:
            throw new IllegalArgumentException((new StringBuilder("Field with id=")).append(i).append(" is not a known array of custom type.  Found ").append(arraylist.getClass().getCanonicalName()).append(".").toString());

        case 3: // '\003'
            mItems = arraylist;
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
        if (obj instanceof CircleFeed) goto _L2; else goto _L1
_L1:
        return false;
_L2:
        Iterator iterator;
        if (this == obj)
        {
            return true;
        }
        obj = (CircleFeed)obj;
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
        if (!((CircleFeed) (obj)).isFieldSet(field)) goto _L1; else goto _L3
_L3:
        if (getFieldValue(field).equals(((CircleFeed) (obj)).getFieldValue(field))) goto _L5; else goto _L4
_L4:
        return false;
        if (!((CircleFeed) (obj)).isFieldSet(field)) goto _L5; else goto _L6
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

        case 2: // '\002'
            return mEtag;

        case 3: // '\003'
            return mItems;

        case 6: // '\006'
            return mNextPageToken;
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
        i;
        JVM INSTR lookupswitch 2: default 36
    //                   2: 66
    //                   6: 87;
           goto _L1 _L2 _L3
_L1:
        throw new IllegalArgumentException((new StringBuilder("Field with id=")).append(i).append(" is not known to be a String.").toString());
_L2:
        mEtag = s1;
_L5:
        mIndicatorSet.add(Integer.valueOf(i));
        return;
_L3:
        mNextPageToken = s1;
        if (true) goto _L5; else goto _L4
_L4:
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        CircleFeedCreator.writeToParcel$7ca7ea58(this, parcel);
    }

    static 
    {
        HashMap hashmap = new HashMap();
        sFields = hashmap;
        hashmap.put("etag", com.google.android.gms.common.server.response.FastJsonResponse.Field.forString("etag", 2));
        sFields.put("items", com.google.android.gms.common.server.response.FastJsonResponse.Field.forConcreteTypeArray("items", 3, com/google/android/gms/plus/service/v1whitelisted/models/CircleEntity));
        sFields.put("nextPageToken", com.google.android.gms.common.server.response.FastJsonResponse.Field.forString("nextPageToken", 6));
    }
}
