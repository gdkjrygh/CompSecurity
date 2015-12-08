// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive.internal.model;

import android.os.Parcel;
import com.google.android.gms.common.server.response.FastSafeParcelableJsonResponse;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.google.android.gms.drive.internal.model:
//            About, About_MaxUploadSizesCreator

public static final class mType extends FastSafeParcelableJsonResponse
{

    public static final About_MaxUploadSizesCreator CREATOR = new About_MaxUploadSizesCreator();
    private static final HashMap sFields;
    final Set mIndicatorSet;
    long mSize;
    String mType;
    final int mVersionCode;

    public final int describeContents()
    {
        return 0;
    }

    public final boolean equals(Object obj)
    {
        if (obj instanceof eld) goto _L2; else goto _L1
_L1:
        return false;
_L2:
        Iterator iterator;
        if (this == obj)
        {
            return true;
        }
        obj = (eld)obj;
        iterator = sFields.values().iterator();
_L5:
        com.google.android.gms.common.server.response.d d;
        if (!iterator.hasNext())
        {
            break MISSING_BLOCK_LABEL_96;
        }
        d = (com.google.android.gms.common.server.response.d)iterator.next();
        if (!isFieldSet(d))
        {
            continue; /* Loop/switch isn't completed */
        }
        if (!((eld) (obj)).isFieldSet(d)) goto _L1; else goto _L3
_L3:
        if (getFieldValue(d).equals(((eld) (obj)).getFieldValue(d))) goto _L5; else goto _L4
_L4:
        return false;
        if (!((eld) (obj)).isFieldSet(d)) goto _L5; else goto _L6
_L6:
        return false;
        return true;
    }

    public final volatile Map getFieldMappings()
    {
        return sFields;
    }

    protected final Object getFieldValue(com.google.android.gms.common.server.response.d d)
    {
        switch (d.getSafeParcelableFieldId())
        {
        default:
            throw new IllegalStateException((new StringBuilder("Unknown safe parcelable id=")).append(d.getSafeParcelableFieldId()).toString());

        case 2: // '\002'
            return Long.valueOf(mSize);

        case 3: // '\003'
            return mType;
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
            com.google.android.gms.common.server.response.d d = (com.google.android.gms.common.server.response.d)iterator.next();
            if (isFieldSet(d))
            {
                i = d.getSafeParcelableFieldId() + i + getFieldValue(d).hashCode();
            }
        } while (true);
        return i;
    }

    protected final boolean isFieldSet(com.google.android.gms.common.server.response.d d)
    {
        return mIndicatorSet.contains(Integer.valueOf(d.getSafeParcelableFieldId()));
    }

    protected final void setLongInternal(com.google.android.gms.common.server.response.d d, String s, long l)
    {
        int i = d.getSafeParcelableFieldId();
        switch (i)
        {
        default:
            throw new IllegalArgumentException((new StringBuilder("Field with id=")).append(i).append(" is not known to be a long.").toString());

        case 2: // '\002'
            mSize = l;
            break;
        }
        mIndicatorSet.add(Integer.valueOf(i));
    }

    protected final void setStringInternal(com.google.android.gms.common.server.response.d d, String s, String s1)
    {
        int i = d.getSafeParcelableFieldId();
        switch (i)
        {
        default:
            throw new IllegalArgumentException((new StringBuilder("Field with id=")).append(i).append(" is not known to be a String.").toString());

        case 3: // '\003'
            mType = s1;
            break;
        }
        mIndicatorSet.add(Integer.valueOf(i));
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        About_MaxUploadSizesCreator.writeToParcel$29bc3553(this, parcel);
    }

    static 
    {
        HashMap hashmap = new HashMap();
        sFields = hashmap;
        hashmap.put("size", com.google.android.gms.common.server.response.d.forLong("size", 2));
        sFields.put("type", com.google.android.gms.common.server.response.d.forString("type", 3));
    }

    public eld()
    {
        mVersionCode = 1;
        mIndicatorSet = new HashSet();
    }

    mIndicatorSet(Set set, int i, long l, String s)
    {
        mIndicatorSet = set;
        mVersionCode = i;
        mSize = l;
        mType = s;
    }
}
