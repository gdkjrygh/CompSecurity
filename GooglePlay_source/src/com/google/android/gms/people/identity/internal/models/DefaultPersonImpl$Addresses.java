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
//            DefaultPersonImpl, DefaultPersonImpl_AddressesCreator, DefaultMetadataImpl

public static final class mValue extends FastJsonResponse
    implements SafeParcelable
{

    public static final DefaultPersonImpl_AddressesCreator CREATOR = new DefaultPersonImpl_AddressesCreator();
    private static final HashMap sFields;
    String mCity;
    String mCountry;
    String mCountryCode;
    String mFormattedType;
    final Set mIndicatorSet;
    DefaultMetadataImpl mMetadata;
    String mPoBox;
    String mPostalCode;
    String mRegion;
    String mStreetAddress;
    String mType;
    String mValue;
    final int mVersionCode;

    public final void addConcreteTypeInternal(com.google.android.gms.common.server.response.ddresses ddresses, String s, FastJsonResponse fastjsonresponse)
    {
        int i = ddresses.feParcelableFieldId();
        switch (i)
        {
        default:
            throw new IllegalArgumentException((new StringBuilder("Field with id=")).append(i).append(" is not a known custom type.  Found ").append(fastjsonresponse.getClass().getCanonicalName()).append(".").toString());

        case 6: // '\006'
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
        com.google.android.gms.common.server.response.ddresses ddresses;
        if (!iterator.hasNext())
        {
            break MISSING_BLOCK_LABEL_96;
        }
        ddresses = (com.google.android.gms.common.server.response.ddresses.sFields)iterator.next();
        if (!isFieldSet(ddresses))
        {
            continue; /* Loop/switch isn't completed */
        }
        if (!((isFieldSet) (obj)).isFieldSet(ddresses)) goto _L1; else goto _L3
_L3:
        if (getFieldValue(ddresses).equals(((getFieldValue) (obj)).getFieldValue(ddresses))) goto _L5; else goto _L4
_L4:
        return false;
        if (!((getFieldValue) (obj)).isFieldSet(ddresses)) goto _L5; else goto _L6
_L6:
        return false;
        return true;
    }

    public final volatile Map getFieldMappings()
    {
        return sFields;
    }

    protected final Object getFieldValue(com.google.android.gms.common.server.response.ddresses ddresses)
    {
        switch (ddresses.feParcelableFieldId())
        {
        default:
            throw new IllegalStateException((new StringBuilder("Unknown safe parcelable id=")).append(ddresses.feParcelableFieldId()).toString());

        case 2: // '\002'
            return mCity;

        case 3: // '\003'
            return mCountry;

        case 4: // '\004'
            return mCountryCode;

        case 5: // '\005'
            return mFormattedType;

        case 6: // '\006'
            return mMetadata;

        case 7: // '\007'
            return mPoBox;

        case 8: // '\b'
            return mPostalCode;

        case 9: // '\t'
            return mRegion;

        case 10: // '\n'
            return mStreetAddress;

        case 11: // '\013'
            return mType;

        case 12: // '\f'
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
            com.google.android.gms.common.server.response.ddresses ddresses = (com.google.android.gms.common.server.response.ddresses.sFields)iterator.next();
            if (isFieldSet(ddresses))
            {
                i = ddresses.feParcelableFieldId() + i + getFieldValue(ddresses).hashCode();
            }
        } while (true);
        return i;
    }

    protected final boolean isFieldSet(com.google.android.gms.common.server.response.ddresses ddresses)
    {
        return mIndicatorSet.contains(Integer.valueOf(ddresses.feParcelableFieldId()));
    }

    protected final boolean isPrimitiveFieldSet(String s)
    {
        return false;
    }

    protected final void setStringInternal(com.google.android.gms.common.server.response.ddresses ddresses, String s, String s1)
    {
        int i = ddresses.feParcelableFieldId();
        i;
        JVM INSTR tableswitch 2 12: default 68
    //                   2 98
    //                   3 119
    //                   4 127
    //                   5 135
    //                   6 68
    //                   7 143
    //                   8 151
    //                   9 159
    //                   10 167
    //                   11 175
    //                   12 183;
           goto _L1 _L2 _L3 _L4 _L5 _L1 _L6 _L7 _L8 _L9 _L10 _L11
_L1:
        throw new IllegalArgumentException((new StringBuilder("Field with id=")).append(i).append(" is not known to be a String.").toString());
_L2:
        mCity = s1;
_L13:
        mIndicatorSet.add(Integer.valueOf(i));
        return;
_L3:
        mCountry = s1;
        continue; /* Loop/switch isn't completed */
_L4:
        mCountryCode = s1;
        continue; /* Loop/switch isn't completed */
_L5:
        mFormattedType = s1;
        continue; /* Loop/switch isn't completed */
_L6:
        mPoBox = s1;
        continue; /* Loop/switch isn't completed */
_L7:
        mPostalCode = s1;
        continue; /* Loop/switch isn't completed */
_L8:
        mRegion = s1;
        continue; /* Loop/switch isn't completed */
_L9:
        mStreetAddress = s1;
        continue; /* Loop/switch isn't completed */
_L10:
        mType = s1;
        continue; /* Loop/switch isn't completed */
_L11:
        mValue = s1;
        if (true) goto _L13; else goto _L12
_L12:
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        DefaultPersonImpl_AddressesCreator.writeToParcel(this, parcel, i);
    }

    static 
    {
        HashMap hashmap = new HashMap();
        sFields = hashmap;
        hashmap.put("city", com.google.android.gms.common.server.response.ring("city", 2));
        sFields.put("country", com.google.android.gms.common.server.response.ring("country", 3));
        sFields.put("countryCode", com.google.android.gms.common.server.response.ring("countryCode", 4));
        sFields.put("formattedType", com.google.android.gms.common.server.response.ring("formattedType", 5));
        sFields.put("metadata", com.google.android.gms.common.server.response.ncreteType("metadata", 6, com/google/android/gms/people/identity/internal/models/DefaultMetadataImpl));
        sFields.put("poBox", com.google.android.gms.common.server.response.ring("poBox", 7));
        sFields.put("postalCode", com.google.android.gms.common.server.response.ring("postalCode", 8));
        sFields.put("region", com.google.android.gms.common.server.response.ring("region", 9));
        sFields.put("streetAddress", com.google.android.gms.common.server.response.ring("streetAddress", 10));
        sFields.put("type", com.google.android.gms.common.server.response.ring("type", 11));
        sFields.put("value", com.google.android.gms.common.server.response.ring("value", 12));
    }

    public reator()
    {
        mVersionCode = 1;
        mIndicatorSet = new HashSet();
    }

    mIndicatorSet(Set set, int i, String s, String s1, String s2, String s3, DefaultMetadataImpl defaultmetadataimpl, 
            String s4, String s5, String s6, String s7, String s8, String s9)
    {
        mIndicatorSet = set;
        mVersionCode = i;
        mCity = s;
        mCountry = s1;
        mCountryCode = s2;
        mFormattedType = s3;
        mMetadata = defaultmetadataimpl;
        mPoBox = s4;
        mPostalCode = s5;
        mRegion = s6;
        mStreetAddress = s7;
        mType = s8;
        mValue = s9;
    }
}
