// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.people.identity.internal.models;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.server.response.FastJsonResponse;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.google.android.gms.people.identity.internal.models:
//            DefaultPersonImpl, DefaultPersonImpl_Metadata_ProfileOwnerStatsCreator

public static final class mViewCount extends FastJsonResponse
    implements SafeParcelable
{

    public static final DefaultPersonImpl_Metadata_ProfileOwnerStatsCreator CREATOR = new DefaultPersonImpl_Metadata_ProfileOwnerStatsCreator();
    private static final HashMap sFields;
    long mIncomingAnyCircleCount;
    final Set mIndicatorSet;
    final int mVersionCode;
    long mViewCount;

    public final int describeContents()
    {
        return 0;
    }

    public final boolean equals(Object obj)
    {
        if (obj instanceof mViewCount) goto _L2; else goto _L1
_L1:
        return false;
_L2:
        Iterator iterator;
        if (this == obj)
        {
            return true;
        }
        obj = (mViewCount)obj;
        iterator = sFields.values().iterator();
_L5:
        com.google.android.gms.common.server.response.nerStats nerstats;
        if (!iterator.hasNext())
        {
            break MISSING_BLOCK_LABEL_96;
        }
        nerstats = (com.google.android.gms.common.server.response.nerStats.sFields)iterator.next();
        if (!isFieldSet(nerstats))
        {
            continue; /* Loop/switch isn't completed */
        }
        if (!((isFieldSet) (obj)).isFieldSet(nerstats)) goto _L1; else goto _L3
_L3:
        if (getFieldValue(nerstats).equals(((getFieldValue) (obj)).getFieldValue(nerstats))) goto _L5; else goto _L4
_L4:
        return false;
        if (!((getFieldValue) (obj)).isFieldSet(nerstats)) goto _L5; else goto _L6
_L6:
        return false;
        return true;
    }

    public final volatile Map getFieldMappings()
    {
        return sFields;
    }

    protected final Object getFieldValue(com.google.android.gms.common.server.response.nerStats nerstats)
    {
        switch (nerstats.Id())
        {
        default:
            throw new IllegalStateException((new StringBuilder("Unknown safe parcelable id=")).append(nerstats.Id()).toString());

        case 2: // '\002'
            return Long.valueOf(mIncomingAnyCircleCount);

        case 3: // '\003'
            return Long.valueOf(mViewCount);
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
            com.google.android.gms.common.server.response.nerStats nerstats = (com.google.android.gms.common.server.response.nerStats.sFields)iterator.next();
            if (isFieldSet(nerstats))
            {
                i = nerstats.Id() + i + getFieldValue(nerstats).hashCode();
            }
        } while (true);
        return i;
    }

    protected final boolean isFieldSet(com.google.android.gms.common.server.response.nerStats nerstats)
    {
        return mIndicatorSet.contains(Integer.valueOf(nerstats.Id()));
    }

    protected final boolean isPrimitiveFieldSet(String s)
    {
        return false;
    }

    protected final void setLongInternal(com.google.android.gms.common.server.response.nerStats nerstats, String s, long l)
    {
        int i = nerstats.Id();
        i;
        JVM INSTR tableswitch 2 3: default 32
    //                   2 62
    //                   3 83;
           goto _L1 _L2 _L3
_L1:
        throw new IllegalArgumentException((new StringBuilder("Field with id=")).append(i).append(" is not known to be a double.").toString());
_L2:
        mIncomingAnyCircleCount = l;
_L5:
        mIndicatorSet.add(Integer.valueOf(i));
        return;
_L3:
        mViewCount = l;
        if (true) goto _L5; else goto _L4
_L4:
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        DefaultPersonImpl_Metadata_ProfileOwnerStatsCreator.writeToParcel$280ce13a(this, parcel);
    }

    static 
    {
        HashMap hashmap = new HashMap();
        sFields = hashmap;
        hashmap.put("incomingAnyCircleCount", com.google.android.gms.common.server.response.nerStats.sFields("incomingAnyCircleCount", 2));
        sFields.put("viewCount", com.google.android.gms.common.server.response.nerStats.sFields("viewCount", 3));
    }

    public reator()
    {
        mVersionCode = 1;
        mIndicatorSet = new HashSet();
    }

    mIndicatorSet(Set set, int i, long l, long l1)
    {
        mIndicatorSet = set;
        mVersionCode = i;
        mIncomingAnyCircleCount = l;
        mViewCount = l1;
    }
}
