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
//            DefaultPersonImpl, DefaultPersonImpl_SortKeys_AffinitiesCreator

public static final class mValue extends FastJsonResponse
    implements SafeParcelable
{

    public static final DefaultPersonImpl_SortKeys_AffinitiesCreator CREATOR = new DefaultPersonImpl_SortKeys_AffinitiesCreator();
    private static final HashMap sFields;
    final Set mIndicatorSet;
    String mType;
    double mValue;
    final int mVersionCode;

    public final int describeContents()
    {
        return 0;
    }

    public final boolean equals(Object obj)
    {
        if (obj instanceof mValue) goto _L2; else goto _L1
_L1:
        return false;
_L2:
        Iterator iterator;
        if (this == obj)
        {
            return true;
        }
        obj = (mValue)obj;
        iterator = sFields.values().iterator();
_L5:
        com.google.android.gms.common.server.response.finities finities;
        if (!iterator.hasNext())
        {
            break MISSING_BLOCK_LABEL_96;
        }
        finities = (com.google.android.gms.common.server.response.finities.sFields)iterator.next();
        if (!isFieldSet(finities))
        {
            continue; /* Loop/switch isn't completed */
        }
        if (!((isFieldSet) (obj)).isFieldSet(finities)) goto _L1; else goto _L3
_L3:
        if (getFieldValue(finities).equals(((getFieldValue) (obj)).getFieldValue(finities))) goto _L5; else goto _L4
_L4:
        return false;
        if (!((getFieldValue) (obj)).isFieldSet(finities)) goto _L5; else goto _L6
_L6:
        return false;
        return true;
    }

    public final volatile Map getFieldMappings()
    {
        return sFields;
    }

    protected final Object getFieldValue(com.google.android.gms.common.server.response.finities finities)
    {
        switch (finities.leFieldId())
        {
        default:
            throw new IllegalStateException((new StringBuilder("Unknown safe parcelable id=")).append(finities.leFieldId()).toString());

        case 2: // '\002'
            return mType;

        case 3: // '\003'
            return Double.valueOf(mValue);
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
            com.google.android.gms.common.server.response.finities finities = (com.google.android.gms.common.server.response.finities.sFields)iterator.next();
            if (isFieldSet(finities))
            {
                i = finities.leFieldId() + i + getFieldValue(finities).hashCode();
            }
        } while (true);
        return i;
    }

    protected final boolean isFieldSet(com.google.android.gms.common.server.response.finities finities)
    {
        return mIndicatorSet.contains(Integer.valueOf(finities.leFieldId()));
    }

    protected final boolean isPrimitiveFieldSet(String s)
    {
        return false;
    }

    protected final void setDoubleInternal(com.google.android.gms.common.server.response.finities finities, String s, double d)
    {
        int i = finities.leFieldId();
        switch (i)
        {
        default:
            throw new IllegalArgumentException((new StringBuilder("Field with id=")).append(i).append(" is not known to be a double.").toString());

        case 3: // '\003'
            mValue = d;
            break;
        }
        mIndicatorSet.add(Integer.valueOf(i));
    }

    protected final void setStringInternal(com.google.android.gms.common.server.response.finities finities, String s, String s1)
    {
        int i = finities.leFieldId();
        switch (i)
        {
        default:
            throw new IllegalArgumentException((new StringBuilder("Field with id=")).append(i).append(" is not known to be a String.").toString());

        case 2: // '\002'
            mType = s1;
            break;
        }
        mIndicatorSet.add(Integer.valueOf(i));
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        DefaultPersonImpl_SortKeys_AffinitiesCreator.writeToParcel$566cec2(this, parcel);
    }

    static 
    {
        HashMap hashmap = new HashMap();
        sFields = hashmap;
        hashmap.put("type", com.google.android.gms.common.server.response.finities.sFields("type", 2));
        sFields.put("value", com.google.android.gms.common.server.response.finities.sFields("value", 3));
    }

    public reator()
    {
        mVersionCode = 1;
        mIndicatorSet = new HashSet();
    }

    mIndicatorSet(Set set, int i, String s, double d)
    {
        mIndicatorSet = set;
        mVersionCode = i;
        mType = s;
        mValue = d;
    }
}
