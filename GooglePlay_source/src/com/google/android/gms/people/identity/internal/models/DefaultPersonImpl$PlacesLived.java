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
//            DefaultPersonImpl, DefaultPersonImpl_PlacesLivedCreator, DefaultMetadataImpl

public static final class mValue extends FastJsonResponse
    implements SafeParcelable
{

    public static final DefaultPersonImpl_PlacesLivedCreator CREATOR = new DefaultPersonImpl_PlacesLivedCreator();
    private static final HashMap sFields;
    boolean mCurrent;
    final Set mIndicatorSet;
    DefaultMetadataImpl mMetadata;
    String mValue;
    final int mVersionCode;

    public final void addConcreteTypeInternal(com.google.android.gms.common.server.response.cesLived ceslived, String s, FastJsonResponse fastjsonresponse)
    {
        int i = ceslived.ParcelableFieldId();
        switch (i)
        {
        default:
            throw new IllegalArgumentException((new StringBuilder("Field with id=")).append(i).append(" is not a known custom type.  Found ").append(fastjsonresponse.getClass().getCanonicalName()).append(".").toString());

        case 3: // '\003'
            mMetadata = (DefaultMetadataImpl)fastjsonresponse;
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
        if (obj instanceof mIndicatorSet) goto _L2; else goto _L1
_L1:
        return false;
_L2:
        Iterator iterator;
        if (this == obj)
        {
            return true;
        }
        obj = (mIndicatorSet)obj;
        iterator = sFields.values().iterator();
_L5:
        com.google.android.gms.common.server.response.cesLived ceslived;
        if (!iterator.hasNext())
        {
            break MISSING_BLOCK_LABEL_96;
        }
        ceslived = (com.google.android.gms.common.server.response.cesLived.sFields)iterator.next();
        if (!isFieldSet(ceslived))
        {
            continue; /* Loop/switch isn't completed */
        }
        if (!((isFieldSet) (obj)).isFieldSet(ceslived)) goto _L1; else goto _L3
_L3:
        if (getFieldValue(ceslived).equals(((getFieldValue) (obj)).getFieldValue(ceslived))) goto _L5; else goto _L4
_L4:
        return false;
        if (!((getFieldValue) (obj)).isFieldSet(ceslived)) goto _L5; else goto _L6
_L6:
        return false;
        return true;
    }

    public final volatile Map getFieldMappings()
    {
        return sFields;
    }

    protected final Object getFieldValue(com.google.android.gms.common.server.response.cesLived ceslived)
    {
        switch (ceslived.ParcelableFieldId())
        {
        default:
            throw new IllegalStateException((new StringBuilder("Unknown safe parcelable id=")).append(ceslived.ParcelableFieldId()).toString());

        case 2: // '\002'
            return Boolean.valueOf(mCurrent);

        case 3: // '\003'
            return mMetadata;

        case 4: // '\004'
            return mValue;
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
            com.google.android.gms.common.server.response.cesLived ceslived = (com.google.android.gms.common.server.response.cesLived.sFields)iterator.next();
            if (isFieldSet(ceslived))
            {
                i = ceslived.ParcelableFieldId() + i + getFieldValue(ceslived).hashCode();
            }
        } while (true);
        return i;
    }

    protected final boolean isFieldSet(com.google.android.gms.common.server.response.cesLived ceslived)
    {
        return mIndicatorSet.contains(Integer.valueOf(ceslived.ParcelableFieldId()));
    }

    protected final boolean isPrimitiveFieldSet(String s)
    {
        return false;
    }

    protected final void setBooleanInternal(com.google.android.gms.common.server.response.cesLived ceslived, String s, boolean flag)
    {
        int i = ceslived.ParcelableFieldId();
        switch (i)
        {
        default:
            throw new IllegalArgumentException((new StringBuilder("Field with id=")).append(i).append(" is not known to be a boolean.").toString());

        case 2: // '\002'
            mCurrent = flag;
            break;
        }
        mIndicatorSet.add(Integer.valueOf(i));
    }

    protected final void setStringInternal(com.google.android.gms.common.server.response.cesLived ceslived, String s, String s1)
    {
        int i = ceslived.ParcelableFieldId();
        switch (i)
        {
        default:
            throw new IllegalArgumentException((new StringBuilder("Field with id=")).append(i).append(" is not known to be a String.").toString());

        case 4: // '\004'
            mValue = s1;
            break;
        }
        mIndicatorSet.add(Integer.valueOf(i));
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        DefaultPersonImpl_PlacesLivedCreator.writeToParcel(this, parcel, i);
    }

    static 
    {
        HashMap hashmap = new HashMap();
        sFields = hashmap;
        hashmap.put("current", com.google.android.gms.common.server.response.ean("current", 2));
        sFields.put("metadata", com.google.android.gms.common.server.response.reteType("metadata", 3, com/google/android/gms/people/identity/internal/models/DefaultMetadataImpl));
        sFields.put("value", com.google.android.gms.common.server.response.ng("value", 4));
    }

    public reator()
    {
        mVersionCode = 1;
        mIndicatorSet = new HashSet();
    }

    mIndicatorSet(Set set, int i, boolean flag, DefaultMetadataImpl defaultmetadataimpl, String s)
    {
        mIndicatorSet = set;
        mVersionCode = i;
        mCurrent = flag;
        mMetadata = defaultmetadataimpl;
        mValue = s;
    }
}
