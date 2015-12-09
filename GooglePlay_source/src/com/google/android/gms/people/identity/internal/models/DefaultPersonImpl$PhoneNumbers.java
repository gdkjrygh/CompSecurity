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
//            DefaultPersonImpl, DefaultPersonImpl_PhoneNumbersCreator, DefaultMetadataImpl

public static final class mValue extends FastJsonResponse
    implements SafeParcelable
{

    public static final DefaultPersonImpl_PhoneNumbersCreator CREATOR = new DefaultPersonImpl_PhoneNumbersCreator();
    private static final HashMap sFields;
    String mCanonicalizedForm;
    String mFormattedType;
    final Set mIndicatorSet;
    DefaultMetadataImpl mMetadata;
    String mType;
    String mValue;
    final int mVersionCode;

    public final void addConcreteTypeInternal(com.google.android.gms.common.server.response.eNumbers enumbers, String s, FastJsonResponse fastjsonresponse)
    {
        int i = enumbers.arcelableFieldId();
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
        com.google.android.gms.common.server.response.eNumbers enumbers;
        if (!iterator.hasNext())
        {
            break MISSING_BLOCK_LABEL_96;
        }
        enumbers = (com.google.android.gms.common.server.response.eNumbers.sFields)iterator.next();
        if (!isFieldSet(enumbers))
        {
            continue; /* Loop/switch isn't completed */
        }
        if (!((isFieldSet) (obj)).isFieldSet(enumbers)) goto _L1; else goto _L3
_L3:
        if (getFieldValue(enumbers).equals(((getFieldValue) (obj)).getFieldValue(enumbers))) goto _L5; else goto _L4
_L4:
        return false;
        if (!((getFieldValue) (obj)).isFieldSet(enumbers)) goto _L5; else goto _L6
_L6:
        return false;
        return true;
    }

    public final volatile Map getFieldMappings()
    {
        return sFields;
    }

    protected final Object getFieldValue(com.google.android.gms.common.server.response.eNumbers enumbers)
    {
        switch (enumbers.arcelableFieldId())
        {
        default:
            throw new IllegalStateException((new StringBuilder("Unknown safe parcelable id=")).append(enumbers.arcelableFieldId()).toString());

        case 2: // '\002'
            return mCanonicalizedForm;

        case 3: // '\003'
            return mFormattedType;

        case 4: // '\004'
            return mMetadata;

        case 5: // '\005'
            return mType;

        case 6: // '\006'
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
            com.google.android.gms.common.server.response.eNumbers enumbers = (com.google.android.gms.common.server.response.eNumbers.sFields)iterator.next();
            if (isFieldSet(enumbers))
            {
                i = enumbers.arcelableFieldId() + i + getFieldValue(enumbers).hashCode();
            }
        } while (true);
        return i;
    }

    protected final boolean isFieldSet(com.google.android.gms.common.server.response.eNumbers enumbers)
    {
        return mIndicatorSet.contains(Integer.valueOf(enumbers.arcelableFieldId()));
    }

    protected final boolean isPrimitiveFieldSet(String s)
    {
        return false;
    }

    protected final void setStringInternal(com.google.android.gms.common.server.response.eNumbers enumbers, String s, String s1)
    {
        int i = enumbers.arcelableFieldId();
        i;
        JVM INSTR tableswitch 2 6: default 44
    //                   2 74
    //                   3 95
    //                   4 44
    //                   5 103
    //                   6 111;
           goto _L1 _L2 _L3 _L1 _L4 _L5
_L1:
        throw new IllegalArgumentException((new StringBuilder("Field with id=")).append(i).append(" is not known to be a String.").toString());
_L2:
        mCanonicalizedForm = s1;
_L7:
        mIndicatorSet.add(Integer.valueOf(i));
        return;
_L3:
        mFormattedType = s1;
        continue; /* Loop/switch isn't completed */
_L4:
        mType = s1;
        continue; /* Loop/switch isn't completed */
_L5:
        mValue = s1;
        if (true) goto _L7; else goto _L6
_L6:
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        DefaultPersonImpl_PhoneNumbersCreator.writeToParcel(this, parcel, i);
    }

    static 
    {
        HashMap hashmap = new HashMap();
        sFields = hashmap;
        hashmap.put("canonicalizedForm", com.google.android.gms.common.server.response.g("canonicalizedForm", 2));
        sFields.put("formattedType", com.google.android.gms.common.server.response.g("formattedType", 3));
        sFields.put("metadata", com.google.android.gms.common.server.response.eteType("metadata", 4, com/google/android/gms/people/identity/internal/models/DefaultMetadataImpl));
        sFields.put("type", com.google.android.gms.common.server.response.g("type", 5));
        sFields.put("value", com.google.android.gms.common.server.response.g("value", 6));
    }

    public reator()
    {
        mVersionCode = 1;
        mIndicatorSet = new HashSet();
    }

    mIndicatorSet(Set set, int i, String s, String s1, DefaultMetadataImpl defaultmetadataimpl, String s2, String s3)
    {
        mIndicatorSet = set;
        mVersionCode = i;
        mCanonicalizedForm = s;
        mFormattedType = s1;
        mMetadata = defaultmetadataimpl;
        mType = s2;
        mValue = s3;
    }
}
