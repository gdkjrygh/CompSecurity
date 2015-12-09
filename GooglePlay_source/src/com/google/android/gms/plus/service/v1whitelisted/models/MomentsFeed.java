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
//            MomentsFeedCreator, MomentEntity

public final class MomentsFeed extends FastSafeParcelableJsonResponse
{

    public static final MomentsFeedCreator CREATOR = new MomentsFeedCreator();
    private static final HashMap sFields;
    final Set mIndicatorSet;
    List mItems;
    String mNextPageToken;
    String mTitle;
    final int mVersionCode;

    public MomentsFeed()
    {
        mVersionCode = 1;
        mIndicatorSet = new HashSet();
    }

    MomentsFeed(Set set, int i, List list, String s, String s1)
    {
        mIndicatorSet = set;
        mVersionCode = i;
        mItems = list;
        mNextPageToken = s;
        mTitle = s1;
    }

    public final void addConcreteTypeArrayInternal(com.google.android.gms.common.server.response.FastJsonResponse.Field field, String s, ArrayList arraylist)
    {
        int i = field.getSafeParcelableFieldId();
        switch (i)
        {
        default:
            throw new IllegalArgumentException((new StringBuilder("Field with id=")).append(i).append(" is not a known array of custom type.  Found ").append(arraylist.getClass().getCanonicalName()).append(".").toString());

        case 4: // '\004'
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
        if (obj instanceof MomentsFeed) goto _L2; else goto _L1
_L1:
        return false;
_L2:
        Iterator iterator;
        if (this == obj)
        {
            return true;
        }
        obj = (MomentsFeed)obj;
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
        if (!((MomentsFeed) (obj)).isFieldSet(field)) goto _L1; else goto _L3
_L3:
        if (getFieldValue(field).equals(((MomentsFeed) (obj)).getFieldValue(field))) goto _L5; else goto _L4
_L4:
        return false;
        if (!((MomentsFeed) (obj)).isFieldSet(field)) goto _L5; else goto _L6
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
        case 5: // '\005'
        case 6: // '\006'
        case 8: // '\b'
        default:
            throw new IllegalStateException((new StringBuilder("Unknown safe parcelable id=")).append(field.getSafeParcelableFieldId()).toString());

        case 4: // '\004'
            return mItems;

        case 7: // '\007'
            return mNextPageToken;

        case 9: // '\t'
            return mTitle;
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
        JVM INSTR tableswitch 7 9: default 36
    //                   7 66
    //                   8 36
    //                   9 87;
           goto _L1 _L2 _L1 _L3
_L1:
        throw new IllegalArgumentException((new StringBuilder("Field with id=")).append(i).append(" is not known to be a String.").toString());
_L2:
        mNextPageToken = s1;
_L5:
        mIndicatorSet.add(Integer.valueOf(i));
        return;
_L3:
        mTitle = s1;
        if (true) goto _L5; else goto _L4
_L4:
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        MomentsFeedCreator.writeToParcel$41c18585(this, parcel);
    }

    static 
    {
        HashMap hashmap = new HashMap();
        sFields = hashmap;
        hashmap.put("items", com.google.android.gms.common.server.response.FastJsonResponse.Field.forConcreteTypeArray("items", 4, com/google/android/gms/plus/service/v1whitelisted/models/MomentEntity));
        sFields.put("nextPageToken", com.google.android.gms.common.server.response.FastJsonResponse.Field.forString("nextPageToken", 7));
        sFields.put("title", com.google.android.gms.common.server.response.FastJsonResponse.Field.forString("title", 9));
    }
}
