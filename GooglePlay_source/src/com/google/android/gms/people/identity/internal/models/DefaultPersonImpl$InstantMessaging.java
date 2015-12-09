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
//            DefaultPersonImpl, DefaultPersonImpl_InstantMessagingCreator, DefaultMetadataImpl

public static final class mValue extends FastJsonResponse
    implements SafeParcelable
{

    public static final DefaultPersonImpl_InstantMessagingCreator CREATOR = new DefaultPersonImpl_InstantMessagingCreator();
    private static final HashMap sFields;
    String mFormattedProtocol;
    String mFormattedType;
    final Set mIndicatorSet;
    DefaultMetadataImpl mMetadata;
    String mProtocol;
    String mType;
    String mValue;
    final int mVersionCode;

    public final void addConcreteTypeInternal(com.google.android.gms.common.server.response.essaging essaging, String s, FastJsonResponse fastjsonresponse)
    {
        int i = essaging.lableFieldId();
        switch (i)
        {
        default:
            throw new IllegalArgumentException((new StringBuilder("Field with id=")).append(i).append(" is not a known custom type.  Found ").append(fastjsonresponse.getClass().getCanonicalName()).append(".").toString());

        case 4: // '\004'
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
        com.google.android.gms.common.server.response.essaging essaging;
        if (!iterator.hasNext())
        {
            break MISSING_BLOCK_LABEL_96;
        }
        essaging = (com.google.android.gms.common.server.response.essaging.sFields)iterator.next();
        if (!isFieldSet(essaging))
        {
            continue; /* Loop/switch isn't completed */
        }
        if (!((isFieldSet) (obj)).isFieldSet(essaging)) goto _L1; else goto _L3
_L3:
        if (getFieldValue(essaging).equals(((getFieldValue) (obj)).getFieldValue(essaging))) goto _L5; else goto _L4
_L4:
        return false;
        if (!((getFieldValue) (obj)).isFieldSet(essaging)) goto _L5; else goto _L6
_L6:
        return false;
        return true;
    }

    public final volatile Map getFieldMappings()
    {
        return sFields;
    }

    protected final Object getFieldValue(com.google.android.gms.common.server.response.essaging essaging)
    {
        switch (essaging.lableFieldId())
        {
        default:
            throw new IllegalStateException((new StringBuilder("Unknown safe parcelable id=")).append(essaging.lableFieldId()).toString());

        case 2: // '\002'
            return mFormattedProtocol;

        case 3: // '\003'
            return mFormattedType;

        case 4: // '\004'
            return mMetadata;

        case 5: // '\005'
            return mProtocol;

        case 6: // '\006'
            return mType;

        case 7: // '\007'
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
            com.google.android.gms.common.server.response.essaging essaging = (com.google.android.gms.common.server.response.essaging.sFields)iterator.next();
            if (isFieldSet(essaging))
            {
                i = essaging.lableFieldId() + i + getFieldValue(essaging).hashCode();
            }
        } while (true);
        return i;
    }

    protected final boolean isFieldSet(com.google.android.gms.common.server.response.essaging essaging)
    {
        return mIndicatorSet.contains(Integer.valueOf(essaging.lableFieldId()));
    }

    protected final boolean isPrimitiveFieldSet(String s)
    {
        return false;
    }

    protected final void setStringInternal(com.google.android.gms.common.server.response.essaging essaging, String s, String s1)
    {
        int i = essaging.lableFieldId();
        i;
        JVM INSTR tableswitch 2 7: default 48
    //                   2 78
    //                   3 99
    //                   4 48
    //                   5 107
    //                   6 115
    //                   7 123;
           goto _L1 _L2 _L3 _L1 _L4 _L5 _L6
_L1:
        throw new IllegalArgumentException((new StringBuilder("Field with id=")).append(i).append(" is not known to be a String.").toString());
_L2:
        mFormattedProtocol = s1;
_L8:
        mIndicatorSet.add(Integer.valueOf(i));
        return;
_L3:
        mFormattedType = s1;
        continue; /* Loop/switch isn't completed */
_L4:
        mProtocol = s1;
        continue; /* Loop/switch isn't completed */
_L5:
        mType = s1;
        continue; /* Loop/switch isn't completed */
_L6:
        mValue = s1;
        if (true) goto _L8; else goto _L7
_L7:
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        DefaultPersonImpl_InstantMessagingCreator.writeToParcel(this, parcel, i);
    }

    static 
    {
        HashMap hashmap = new HashMap();
        sFields = hashmap;
        hashmap.put("formattedProtocol", com.google.android.gms.common.server.response.essaging.sFields("formattedProtocol", 2));
        sFields.put("formattedType", com.google.android.gms.common.server.response.essaging.sFields("formattedType", 3));
        sFields.put("metadata", com.google.android.gms.common.server.response.ype("metadata", 4, com/google/android/gms/people/identity/internal/models/DefaultMetadataImpl));
        sFields.put("protocol", com.google.android.gms.common.server.response.essaging.sFields("protocol", 5));
        sFields.put("type", com.google.android.gms.common.server.response.essaging.sFields("type", 6));
        sFields.put("value", com.google.android.gms.common.server.response.essaging.sFields("value", 7));
    }

    public reator()
    {
        mVersionCode = 1;
        mIndicatorSet = new HashSet();
    }

    mIndicatorSet(Set set, int i, String s, String s1, DefaultMetadataImpl defaultmetadataimpl, String s2, String s3, 
            String s4)
    {
        mIndicatorSet = set;
        mVersionCode = i;
        mFormattedProtocol = s;
        mFormattedType = s1;
        mMetadata = defaultmetadataimpl;
        mProtocol = s2;
        mType = s3;
        mValue = s4;
    }
}
