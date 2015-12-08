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
//            DefaultPersonImpl, DefaultPersonImpl_NamesCreator, DefaultMetadataImpl

public static final class mPhoneticHonorificSuffix extends FastJsonResponse
    implements SafeParcelable
{

    public static final DefaultPersonImpl_NamesCreator CREATOR = new DefaultPersonImpl_NamesCreator();
    private static final HashMap sFields;
    String mDisplayName;
    String mFamilyName;
    String mFormatted;
    String mGivenName;
    String mHonorificPrefix;
    String mHonorificSuffix;
    final Set mIndicatorSet;
    DefaultMetadataImpl mMetadata;
    String mMiddleName;
    String mPhoneticFamilyName;
    String mPhoneticGivenName;
    String mPhoneticHonorificPrefix;
    String mPhoneticHonorificSuffix;
    final int mVersionCode;

    public final void addConcreteTypeInternal(com.google.android.gms.common.server.response.pl.Names names, String s, FastJsonResponse fastjsonresponse)
    {
        int i = names.etSafeParcelableFieldId();
        switch (i)
        {
        default:
            throw new IllegalArgumentException((new StringBuilder("Field with id=")).append(i).append(" is not a known custom type.  Found ").append(fastjsonresponse.getClass().getCanonicalName()).append(".").toString());

        case 8: // '\b'
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
        com.google.android.gms.common.server.response.pl.Names names;
        if (!iterator.hasNext())
        {
            break MISSING_BLOCK_LABEL_96;
        }
        names = (com.google.android.gms.common.server.response.pl.Names.sFields)iterator.next();
        if (!isFieldSet(names))
        {
            continue; /* Loop/switch isn't completed */
        }
        if (!((isFieldSet) (obj)).isFieldSet(names)) goto _L1; else goto _L3
_L3:
        if (getFieldValue(names).equals(((getFieldValue) (obj)).getFieldValue(names))) goto _L5; else goto _L4
_L4:
        return false;
        if (!((getFieldValue) (obj)).isFieldSet(names)) goto _L5; else goto _L6
_L6:
        return false;
        return true;
    }

    public final volatile Map getFieldMappings()
    {
        return sFields;
    }

    protected final Object getFieldValue(com.google.android.gms.common.server.response.pl.Names names)
    {
        switch (names.etSafeParcelableFieldId())
        {
        default:
            throw new IllegalStateException((new StringBuilder("Unknown safe parcelable id=")).append(names.etSafeParcelableFieldId()).toString());

        case 2: // '\002'
            return mDisplayName;

        case 3: // '\003'
            return mFamilyName;

        case 4: // '\004'
            return mFormatted;

        case 5: // '\005'
            return mGivenName;

        case 6: // '\006'
            return mHonorificPrefix;

        case 7: // '\007'
            return mHonorificSuffix;

        case 8: // '\b'
            return mMetadata;

        case 9: // '\t'
            return mMiddleName;

        case 10: // '\n'
            return mPhoneticFamilyName;

        case 11: // '\013'
            return mPhoneticGivenName;

        case 12: // '\f'
            return mPhoneticHonorificPrefix;

        case 13: // '\r'
            return mPhoneticHonorificSuffix;
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
            com.google.android.gms.common.server.response.pl.Names names = (com.google.android.gms.common.server.response.pl.Names.sFields)iterator.next();
            if (isFieldSet(names))
            {
                i = names.etSafeParcelableFieldId() + i + getFieldValue(names).hashCode();
            }
        } while (true);
        return i;
    }

    protected final boolean isFieldSet(com.google.android.gms.common.server.response.pl.Names names)
    {
        return mIndicatorSet.contains(Integer.valueOf(names.etSafeParcelableFieldId()));
    }

    protected final boolean isPrimitiveFieldSet(String s)
    {
        return false;
    }

    protected final void setStringInternal(com.google.android.gms.common.server.response.pl.Names names, String s, String s1)
    {
        int i = names.etSafeParcelableFieldId();
        i;
        JVM INSTR tableswitch 2 13: default 72
    //                   2 102
    //                   3 123
    //                   4 131
    //                   5 139
    //                   6 147
    //                   7 155
    //                   8 72
    //                   9 163
    //                   10 171
    //                   11 179
    //                   12 187
    //                   13 195;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L1 _L8 _L9 _L10 _L11 _L12
_L1:
        throw new IllegalArgumentException((new StringBuilder("Field with id=")).append(i).append(" is not known to be a String.").toString());
_L2:
        mDisplayName = s1;
_L14:
        mIndicatorSet.add(Integer.valueOf(i));
        return;
_L3:
        mFamilyName = s1;
        continue; /* Loop/switch isn't completed */
_L4:
        mFormatted = s1;
        continue; /* Loop/switch isn't completed */
_L5:
        mGivenName = s1;
        continue; /* Loop/switch isn't completed */
_L6:
        mHonorificPrefix = s1;
        continue; /* Loop/switch isn't completed */
_L7:
        mHonorificSuffix = s1;
        continue; /* Loop/switch isn't completed */
_L8:
        mMiddleName = s1;
        continue; /* Loop/switch isn't completed */
_L9:
        mPhoneticFamilyName = s1;
        continue; /* Loop/switch isn't completed */
_L10:
        mPhoneticGivenName = s1;
        continue; /* Loop/switch isn't completed */
_L11:
        mPhoneticHonorificPrefix = s1;
        continue; /* Loop/switch isn't completed */
_L12:
        mPhoneticHonorificSuffix = s1;
        if (true) goto _L14; else goto _L13
_L13:
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        DefaultPersonImpl_NamesCreator.writeToParcel(this, parcel, i);
    }

    static 
    {
        HashMap hashmap = new HashMap();
        sFields = hashmap;
        hashmap.put("displayName", com.google.android.gms.common.server.response.orString("displayName", 2));
        sFields.put("familyName", com.google.android.gms.common.server.response.orString("familyName", 3));
        sFields.put("formatted", com.google.android.gms.common.server.response.orString("formatted", 4));
        sFields.put("givenName", com.google.android.gms.common.server.response.orString("givenName", 5));
        sFields.put("honorificPrefix", com.google.android.gms.common.server.response.orString("honorificPrefix", 6));
        sFields.put("honorificSuffix", com.google.android.gms.common.server.response.orString("honorificSuffix", 7));
        sFields.put("metadata", com.google.android.gms.common.server.response.orConcreteType("metadata", 8, com/google/android/gms/people/identity/internal/models/DefaultMetadataImpl));
        sFields.put("middleName", com.google.android.gms.common.server.response.orString("middleName", 9));
        sFields.put("phoneticFamilyName", com.google.android.gms.common.server.response.orString("phoneticFamilyName", 10));
        sFields.put("phoneticGivenName", com.google.android.gms.common.server.response.orString("phoneticGivenName", 11));
        sFields.put("phoneticHonorificPrefix", com.google.android.gms.common.server.response.orString("phoneticHonorificPrefix", 12));
        sFields.put("phoneticHonorificSuffix", com.google.android.gms.common.server.response.orString("phoneticHonorificSuffix", 13));
    }

    public reator()
    {
        mVersionCode = 1;
        mIndicatorSet = new HashSet();
    }

    mIndicatorSet(Set set, int i, String s, String s1, String s2, String s3, String s4, 
            String s5, DefaultMetadataImpl defaultmetadataimpl, String s6, String s7, String s8, String s9, String s10)
    {
        mIndicatorSet = set;
        mVersionCode = i;
        mDisplayName = s;
        mFamilyName = s1;
        mFormatted = s2;
        mGivenName = s3;
        mHonorificPrefix = s4;
        mHonorificSuffix = s5;
        mMetadata = defaultmetadataimpl;
        mMiddleName = s6;
        mPhoneticFamilyName = s7;
        mPhoneticGivenName = s8;
        mPhoneticHonorificPrefix = s9;
        mPhoneticHonorificSuffix = s10;
    }
}
