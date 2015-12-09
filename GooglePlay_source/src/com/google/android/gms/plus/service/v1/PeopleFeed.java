// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.plus.service.v1;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.server.response.FastJsonResponse;
import com.google.android.gms.plus.internal.model.people.PersonEntity;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.google.android.gms.plus.service.v1:
//            PeopleFeedCreator

public final class PeopleFeed extends FastJsonResponse
    implements SafeParcelable
{

    public static final PeopleFeedCreator CREATOR = new PeopleFeedCreator();
    private static final HashMap sFields;
    String mEtag;
    final Set mIndicatorSet;
    public List mItems;
    public String mNextPageToken;
    String mSelfLink;
    String mTitle;
    public int mTotalItems;
    final int mVersionCode;

    public PeopleFeed()
    {
        mVersionCode = 1;
        mIndicatorSet = new HashSet();
    }

    PeopleFeed(Set set, int i, String s, List list, String s1, String s2, String s3, 
            int j)
    {
        mIndicatorSet = set;
        mVersionCode = i;
        mEtag = s;
        mItems = list;
        mNextPageToken = s1;
        mSelfLink = s2;
        mTitle = s3;
        mTotalItems = j;
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
        if (obj instanceof PeopleFeed) goto _L2; else goto _L1
_L1:
        return false;
_L2:
        Iterator iterator;
        if (this == obj)
        {
            return true;
        }
        obj = (PeopleFeed)obj;
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
        if (!((PeopleFeed) (obj)).isFieldSet(field)) goto _L1; else goto _L3
_L3:
        if (getFieldValue(field).equals(((PeopleFeed) (obj)).getFieldValue(field))) goto _L5; else goto _L4
_L4:
        return false;
        if (!((PeopleFeed) (obj)).isFieldSet(field)) goto _L5; else goto _L6
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
        default:
            throw new IllegalStateException((new StringBuilder("Unknown safe parcelable id=")).append(field.getSafeParcelableFieldId()).toString());

        case 2: // '\002'
            return mEtag;

        case 3: // '\003'
            return mItems;

        case 5: // '\005'
            return mNextPageToken;

        case 6: // '\006'
            return mSelfLink;

        case 7: // '\007'
            return mTitle;

        case 8: // '\b'
            return Integer.valueOf(mTotalItems);
        }
    }

    protected final Object getValueObject(String s)
    {
        return null;
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

    protected final boolean isPrimitiveFieldSet(String s)
    {
        return false;
    }

    protected final void setIntegerInternal(com.google.android.gms.common.server.response.FastJsonResponse.Field field, String s, int i)
    {
        int j = field.getSafeParcelableFieldId();
        switch (j)
        {
        default:
            throw new IllegalArgumentException((new StringBuilder("Field with id=")).append(j).append(" is not known to be an int.").toString());

        case 8: // '\b'
            mTotalItems = i;
            break;
        }
        mIndicatorSet.add(Integer.valueOf(j));
    }

    protected final void setStringInternal(com.google.android.gms.common.server.response.FastJsonResponse.Field field, String s, String s1)
    {
        int i = field.getSafeParcelableFieldId();
        i;
        JVM INSTR tableswitch 2 7: default 48
    //                   2 78
    //                   3 48
    //                   4 48
    //                   5 99
    //                   6 107
    //                   7 115;
           goto _L1 _L2 _L1 _L1 _L3 _L4 _L5
_L1:
        throw new IllegalArgumentException((new StringBuilder("Field with id=")).append(i).append(" is not known to be a String.").toString());
_L2:
        mEtag = s1;
_L7:
        mIndicatorSet.add(Integer.valueOf(i));
        return;
_L3:
        mNextPageToken = s1;
        continue; /* Loop/switch isn't completed */
_L4:
        mSelfLink = s1;
        continue; /* Loop/switch isn't completed */
_L5:
        mTitle = s1;
        if (true) goto _L7; else goto _L6
_L6:
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        PeopleFeedCreator.writeToParcel$628e586(this, parcel);
    }

    static 
    {
        HashMap hashmap = new HashMap();
        sFields = hashmap;
        hashmap.put("etag", com.google.android.gms.common.server.response.FastJsonResponse.Field.forString("etag", 2));
        sFields.put("items", com.google.android.gms.common.server.response.FastJsonResponse.Field.forConcreteTypeArray("items", 3, com/google/android/gms/plus/internal/model/people/PersonEntity));
        sFields.put("nextPageToken", com.google.android.gms.common.server.response.FastJsonResponse.Field.forString("nextPageToken", 5));
        sFields.put("selfLink", com.google.android.gms.common.server.response.FastJsonResponse.Field.forString("selfLink", 6));
        sFields.put("title", com.google.android.gms.common.server.response.FastJsonResponse.Field.forString("title", 7));
        sFields.put("totalItems", com.google.android.gms.common.server.response.FastJsonResponse.Field.forInteger("totalItems", 8));
    }
}
