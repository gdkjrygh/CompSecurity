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
//            DefaultPersonImpl, DefaultPersonImpl_ImagesCreator, DefaultMetadataImpl

public static final class mUrl extends FastJsonResponse
    implements SafeParcelable
{

    public static final DefaultPersonImpl_ImagesCreator CREATOR = new DefaultPersonImpl_ImagesCreator();
    private static final HashMap sFields;
    final Set mIndicatorSet;
    boolean mIsDefault;
    DefaultMetadataImpl mMetadata;
    String mUrl;
    final int mVersionCode;

    public final void addConcreteTypeInternal(com.google.android.gms.common.server.response.l.Images images, String s, FastJsonResponse fastjsonresponse)
    {
        int i = images.tSafeParcelableFieldId();
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
        com.google.android.gms.common.server.response.l.Images images;
        if (!iterator.hasNext())
        {
            break MISSING_BLOCK_LABEL_96;
        }
        images = (com.google.android.gms.common.server.response.l.Images.sFields)iterator.next();
        if (!isFieldSet(images))
        {
            continue; /* Loop/switch isn't completed */
        }
        if (!((isFieldSet) (obj)).isFieldSet(images)) goto _L1; else goto _L3
_L3:
        if (getFieldValue(images).equals(((getFieldValue) (obj)).getFieldValue(images))) goto _L5; else goto _L4
_L4:
        return false;
        if (!((getFieldValue) (obj)).isFieldSet(images)) goto _L5; else goto _L6
_L6:
        return false;
        return true;
    }

    public final volatile Map getFieldMappings()
    {
        return sFields;
    }

    protected final Object getFieldValue(com.google.android.gms.common.server.response.l.Images images)
    {
        switch (images.tSafeParcelableFieldId())
        {
        default:
            throw new IllegalStateException((new StringBuilder("Unknown safe parcelable id=")).append(images.tSafeParcelableFieldId()).toString());

        case 2: // '\002'
            return Boolean.valueOf(mIsDefault);

        case 3: // '\003'
            return mMetadata;

        case 4: // '\004'
            return mUrl;
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
            com.google.android.gms.common.server.response.l.Images images = (com.google.android.gms.common.server.response.l.Images.sFields)iterator.next();
            if (isFieldSet(images))
            {
                i = images.tSafeParcelableFieldId() + i + getFieldValue(images).hashCode();
            }
        } while (true);
        return i;
    }

    protected final boolean isFieldSet(com.google.android.gms.common.server.response.l.Images images)
    {
        return mIndicatorSet.contains(Integer.valueOf(images.tSafeParcelableFieldId()));
    }

    protected final boolean isPrimitiveFieldSet(String s)
    {
        return false;
    }

    protected final void setBooleanInternal(com.google.android.gms.common.server.response.l.Images images, String s, boolean flag)
    {
        int i = images.tSafeParcelableFieldId();
        switch (i)
        {
        default:
            throw new IllegalArgumentException((new StringBuilder("Field with id=")).append(i).append(" is not known to be a boolean.").toString());

        case 2: // '\002'
            mIsDefault = flag;
            break;
        }
        mIndicatorSet.add(Integer.valueOf(i));
    }

    protected final void setStringInternal(com.google.android.gms.common.server.response.l.Images images, String s, String s1)
    {
        int i = images.tSafeParcelableFieldId();
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
        DefaultPersonImpl_ImagesCreator.writeToParcel(this, parcel, i);
    }

    static 
    {
        HashMap hashmap = new HashMap();
        sFields = hashmap;
        hashmap.put("isDefault", com.google.android.gms.common.server.response.rBoolean("isDefault", 2));
        sFields.put("metadata", com.google.android.gms.common.server.response.rConcreteType("metadata", 3, com/google/android/gms/people/identity/internal/models/DefaultMetadataImpl));
        sFields.put("url", com.google.android.gms.common.server.response.rString("url", 4));
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
        mIsDefault = flag;
        mMetadata = defaultmetadataimpl;
        mUrl = s;
    }
}
