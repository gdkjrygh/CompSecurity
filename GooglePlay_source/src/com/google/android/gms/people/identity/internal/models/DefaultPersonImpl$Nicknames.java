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
//            DefaultPersonImpl, DefaultPersonImpl_NicknamesCreator, DefaultMetadataImpl

public static final class mValue extends FastJsonResponse
    implements SafeParcelable
{

    public static final DefaultPersonImpl_NicknamesCreator CREATOR = new DefaultPersonImpl_NicknamesCreator();
    private static final HashMap sFields;
    final Set mIndicatorSet;
    DefaultMetadataImpl mMetadata;
    String mType;
    String mValue;
    final int mVersionCode;

    public final void addConcreteTypeInternal(com.google.android.gms.common.server.response.icknames icknames, String s, FastJsonResponse fastjsonresponse)
    {
        int i = icknames.feParcelableFieldId();
        switch (i)
        {
        default:
            throw new IllegalArgumentException((new StringBuilder("Field with id=")).append(i).append(" is not a known custom type.  Found ").append(fastjsonresponse.getClass().getCanonicalName()).append(".").toString());

        case 2: // '\002'
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
        com.google.android.gms.common.server.response.icknames icknames;
        if (!iterator.hasNext())
        {
            break MISSING_BLOCK_LABEL_96;
        }
        icknames = (com.google.android.gms.common.server.response.icknames.sFields)iterator.next();
        if (!isFieldSet(icknames))
        {
            continue; /* Loop/switch isn't completed */
        }
        if (!((isFieldSet) (obj)).isFieldSet(icknames)) goto _L1; else goto _L3
_L3:
        if (getFieldValue(icknames).equals(((getFieldValue) (obj)).getFieldValue(icknames))) goto _L5; else goto _L4
_L4:
        return false;
        if (!((getFieldValue) (obj)).isFieldSet(icknames)) goto _L5; else goto _L6
_L6:
        return false;
        return true;
    }

    public final volatile Map getFieldMappings()
    {
        return sFields;
    }

    protected final Object getFieldValue(com.google.android.gms.common.server.response.icknames icknames)
    {
        switch (icknames.feParcelableFieldId())
        {
        default:
            throw new IllegalStateException((new StringBuilder("Unknown safe parcelable id=")).append(icknames.feParcelableFieldId()).toString());

        case 2: // '\002'
            return mMetadata;

        case 3: // '\003'
            return mType;

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
            com.google.android.gms.common.server.response.icknames icknames = (com.google.android.gms.common.server.response.icknames.sFields)iterator.next();
            if (isFieldSet(icknames))
            {
                i = icknames.feParcelableFieldId() + i + getFieldValue(icknames).hashCode();
            }
        } while (true);
        return i;
    }

    protected final boolean isFieldSet(com.google.android.gms.common.server.response.icknames icknames)
    {
        return mIndicatorSet.contains(Integer.valueOf(icknames.feParcelableFieldId()));
    }

    protected final boolean isPrimitiveFieldSet(String s)
    {
        return false;
    }

    protected final void setStringInternal(com.google.android.gms.common.server.response.icknames icknames, String s, String s1)
    {
        int i = icknames.feParcelableFieldId();
        i;
        JVM INSTR tableswitch 3 4: default 32
    //                   3 62
    //                   4 83;
           goto _L1 _L2 _L3
_L1:
        throw new IllegalArgumentException((new StringBuilder("Field with id=")).append(i).append(" is not known to be a String.").toString());
_L2:
        mType = s1;
_L5:
        mIndicatorSet.add(Integer.valueOf(i));
        return;
_L3:
        mValue = s1;
        if (true) goto _L5; else goto _L4
_L4:
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        DefaultPersonImpl_NicknamesCreator.writeToParcel(this, parcel, i);
    }

    static 
    {
        HashMap hashmap = new HashMap();
        sFields = hashmap;
        hashmap.put("metadata", com.google.android.gms.common.server.response.ncreteType("metadata", 2, com/google/android/gms/people/identity/internal/models/DefaultMetadataImpl));
        sFields.put("type", com.google.android.gms.common.server.response.ring("type", 3));
        sFields.put("value", com.google.android.gms.common.server.response.ring("value", 4));
    }

    public reator()
    {
        mVersionCode = 1;
        mIndicatorSet = new HashSet();
    }

    mIndicatorSet(Set set, int i, DefaultMetadataImpl defaultmetadataimpl, String s, String s1)
    {
        mIndicatorSet = set;
        mVersionCode = i;
        mMetadata = defaultmetadataimpl;
        mType = s;
        mValue = s1;
    }
}
