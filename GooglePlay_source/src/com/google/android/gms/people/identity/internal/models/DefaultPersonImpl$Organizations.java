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
//            DefaultPersonImpl, DefaultPersonImpl_OrganizationsCreator, DefaultMetadataImpl

public static final class mType extends FastJsonResponse
    implements SafeParcelable
{

    public static final DefaultPersonImpl_OrganizationsCreator CREATOR = new DefaultPersonImpl_OrganizationsCreator();
    private static final HashMap sFields;
    boolean mCurrent;
    String mDepartment;
    String mDescription;
    String mDomain;
    String mEndDate;
    final Set mIndicatorSet;
    String mLocation;
    DefaultMetadataImpl mMetadata;
    String mName;
    String mPhoneticName;
    String mStartDate;
    String mSymbol;
    String mTitle;
    String mType;
    final int mVersionCode;

    public final void addConcreteTypeInternal(com.google.android.gms.common.server.response.izations izations, String s, FastJsonResponse fastjsonresponse)
    {
        int i = izations.rcelableFieldId();
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
        com.google.android.gms.common.server.response.izations izations;
        if (!iterator.hasNext())
        {
            break MISSING_BLOCK_LABEL_96;
        }
        izations = (com.google.android.gms.common.server.response.izations.sFields)iterator.next();
        if (!isFieldSet(izations))
        {
            continue; /* Loop/switch isn't completed */
        }
        if (!((isFieldSet) (obj)).isFieldSet(izations)) goto _L1; else goto _L3
_L3:
        if (getFieldValue(izations).equals(((getFieldValue) (obj)).getFieldValue(izations))) goto _L5; else goto _L4
_L4:
        return false;
        if (!((getFieldValue) (obj)).isFieldSet(izations)) goto _L5; else goto _L6
_L6:
        return false;
        return true;
    }

    public final volatile Map getFieldMappings()
    {
        return sFields;
    }

    protected final Object getFieldValue(com.google.android.gms.common.server.response.izations izations)
    {
        switch (izations.rcelableFieldId())
        {
        default:
            throw new IllegalStateException((new StringBuilder("Unknown safe parcelable id=")).append(izations.rcelableFieldId()).toString());

        case 2: // '\002'
            return Boolean.valueOf(mCurrent);

        case 3: // '\003'
            return mDepartment;

        case 4: // '\004'
            return mDescription;

        case 5: // '\005'
            return mDomain;

        case 6: // '\006'
            return mEndDate;

        case 7: // '\007'
            return mLocation;

        case 8: // '\b'
            return mMetadata;

        case 9: // '\t'
            return mName;

        case 10: // '\n'
            return mPhoneticName;

        case 11: // '\013'
            return mStartDate;

        case 12: // '\f'
            return mSymbol;

        case 13: // '\r'
            return mTitle;

        case 14: // '\016'
            return mType;
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
            com.google.android.gms.common.server.response.izations izations = (com.google.android.gms.common.server.response.izations.sFields)iterator.next();
            if (isFieldSet(izations))
            {
                i = izations.rcelableFieldId() + i + getFieldValue(izations).hashCode();
            }
        } while (true);
        return i;
    }

    protected final boolean isFieldSet(com.google.android.gms.common.server.response.izations izations)
    {
        return mIndicatorSet.contains(Integer.valueOf(izations.rcelableFieldId()));
    }

    protected final boolean isPrimitiveFieldSet(String s)
    {
        return false;
    }

    protected final void setBooleanInternal(com.google.android.gms.common.server.response.izations izations, String s, boolean flag)
    {
        int i = izations.rcelableFieldId();
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

    protected final void setStringInternal(com.google.android.gms.common.server.response.izations izations, String s, String s1)
    {
        int i = izations.rcelableFieldId();
        i;
        JVM INSTR tableswitch 3 14: default 72
    //                   3 102
    //                   4 123
    //                   5 131
    //                   6 139
    //                   7 147
    //                   8 72
    //                   9 155
    //                   10 163
    //                   11 171
    //                   12 179
    //                   13 187
    //                   14 195;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L1 _L7 _L8 _L9 _L10 _L11 _L12
_L1:
        throw new IllegalArgumentException((new StringBuilder("Field with id=")).append(i).append(" is not known to be a String.").toString());
_L2:
        mDepartment = s1;
_L14:
        mIndicatorSet.add(Integer.valueOf(i));
        return;
_L3:
        mDescription = s1;
        continue; /* Loop/switch isn't completed */
_L4:
        mDomain = s1;
        continue; /* Loop/switch isn't completed */
_L5:
        mEndDate = s1;
        continue; /* Loop/switch isn't completed */
_L6:
        mLocation = s1;
        continue; /* Loop/switch isn't completed */
_L7:
        mName = s1;
        continue; /* Loop/switch isn't completed */
_L8:
        mPhoneticName = s1;
        continue; /* Loop/switch isn't completed */
_L9:
        mStartDate = s1;
        continue; /* Loop/switch isn't completed */
_L10:
        mSymbol = s1;
        continue; /* Loop/switch isn't completed */
_L11:
        mTitle = s1;
        continue; /* Loop/switch isn't completed */
_L12:
        mType = s1;
        if (true) goto _L14; else goto _L13
_L13:
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        DefaultPersonImpl_OrganizationsCreator.writeToParcel(this, parcel, i);
    }

    static 
    {
        HashMap hashmap = new HashMap();
        sFields = hashmap;
        hashmap.put("current", com.google.android.gms.common.server.response.n("current", 2));
        sFields.put("department", com.google.android.gms.common.server.response.("department", 3));
        sFields.put("description", com.google.android.gms.common.server.response.("description", 4));
        sFields.put("domain", com.google.android.gms.common.server.response.("domain", 5));
        sFields.put("endDate", com.google.android.gms.common.server.response.("endDate", 6));
        sFields.put("location", com.google.android.gms.common.server.response.("location", 7));
        sFields.put("metadata", com.google.android.gms.common.server.response.teType("metadata", 8, com/google/android/gms/people/identity/internal/models/DefaultMetadataImpl));
        sFields.put("name", com.google.android.gms.common.server.response.("name", 9));
        sFields.put("phoneticName", com.google.android.gms.common.server.response.("phoneticName", 10));
        sFields.put("startDate", com.google.android.gms.common.server.response.("startDate", 11));
        sFields.put("symbol", com.google.android.gms.common.server.response.("symbol", 12));
        sFields.put("title", com.google.android.gms.common.server.response.("title", 13));
        sFields.put("type", com.google.android.gms.common.server.response.("type", 14));
    }

    public reator()
    {
        mVersionCode = 1;
        mIndicatorSet = new HashSet();
    }

    mIndicatorSet(Set set, int i, boolean flag, String s, String s1, String s2, String s3, 
            String s4, DefaultMetadataImpl defaultmetadataimpl, String s5, String s6, String s7, String s8, String s9, 
            String s10)
    {
        mIndicatorSet = set;
        mVersionCode = i;
        mCurrent = flag;
        mDepartment = s;
        mDescription = s1;
        mDomain = s2;
        mEndDate = s3;
        mLocation = s4;
        mMetadata = defaultmetadataimpl;
        mName = s5;
        mPhoneticName = s6;
        mStartDate = s7;
        mSymbol = s8;
        mTitle = s9;
        mType = s10;
    }
}
