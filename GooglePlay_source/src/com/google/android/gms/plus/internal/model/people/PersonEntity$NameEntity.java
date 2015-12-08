// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.plus.internal.model.people;

import android.os.Parcel;
import com.google.android.gms.common.server.response.FastSafeParcelableJsonResponse;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.google.android.gms.plus.internal.model.people:
//            PersonEntity, PersonEntity_NameEntityCreator

public static final class mMiddleName extends FastSafeParcelableJsonResponse
    implements com.google.android.gms.plus.model.people.sonResponse
{

    public static final PersonEntity_NameEntityCreator CREATOR = new PersonEntity_NameEntityCreator();
    private static final HashMap sFields;
    String mFamilyName;
    String mFormatted;
    String mGivenName;
    String mHonorificPrefix;
    String mHonorificSuffix;
    final Set mIndicatorSet;
    String mMiddleName;
    final int mVersionCode;

    public final int describeContents()
    {
        return 0;
    }

    public final boolean equals(Object obj)
    {
        if (obj instanceof se) goto _L2; else goto _L1
_L1:
        return false;
_L2:
        Iterator iterator;
        if (this == obj)
        {
            return true;
        }
        obj = (se)obj;
        iterator = sFields.values().iterator();
_L5:
        com.google.android.gms.common.server.response.ity ity;
        if (!iterator.hasNext())
        {
            break MISSING_BLOCK_LABEL_96;
        }
        ity = (com.google.android.gms.common.server.response.ity.sFields)iterator.next();
        if (!isFieldSet(ity))
        {
            continue; /* Loop/switch isn't completed */
        }
        if (!((isFieldSet) (obj)).isFieldSet(ity)) goto _L1; else goto _L3
_L3:
        if (getFieldValue(ity).equals(((getFieldValue) (obj)).getFieldValue(ity))) goto _L5; else goto _L4
_L4:
        return false;
        if (!((getFieldValue) (obj)).isFieldSet(ity)) goto _L5; else goto _L6
_L6:
        return false;
        return true;
    }

    public final volatile Object freeze()
    {
        return this;
    }

    public final volatile Map getFieldMappings()
    {
        return sFields;
    }

    protected final Object getFieldValue(com.google.android.gms.common.server.response.ity ity)
    {
        switch (ity.etSafeParcelableFieldId())
        {
        default:
            throw new IllegalStateException((new StringBuilder("Unknown safe parcelable id=")).append(ity.etSafeParcelableFieldId()).toString());

        case 2: // '\002'
            return mFamilyName;

        case 3: // '\003'
            return mFormatted;

        case 4: // '\004'
            return mGivenName;

        case 5: // '\005'
            return mHonorificPrefix;

        case 6: // '\006'
            return mHonorificSuffix;

        case 7: // '\007'
            return mMiddleName;
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
            com.google.android.gms.common.server.response.ity ity = (com.google.android.gms.common.server.response.ity.sFields)iterator.next();
            if (isFieldSet(ity))
            {
                i = ity.etSafeParcelableFieldId() + i + getFieldValue(ity).hashCode();
            }
        } while (true);
        return i;
    }

    public final boolean isDataValid()
    {
        return true;
    }

    protected final boolean isFieldSet(com.google.android.gms.common.server.response.ity ity)
    {
        return mIndicatorSet.contains(Integer.valueOf(ity.etSafeParcelableFieldId()));
    }

    protected final void setStringInternal(com.google.android.gms.common.server.response.ity ity, String s, String s1)
    {
        int i = ity.etSafeParcelableFieldId();
        i;
        JVM INSTR tableswitch 2 7: default 48
    //                   2 78
    //                   3 99
    //                   4 107
    //                   5 115
    //                   6 123
    //                   7 131;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7
_L1:
        throw new IllegalArgumentException((new StringBuilder("Field with id=")).append(i).append(" is not known to be a String.").toString());
_L2:
        mFamilyName = s1;
_L9:
        mIndicatorSet.add(Integer.valueOf(i));
        return;
_L3:
        mFormatted = s1;
        continue; /* Loop/switch isn't completed */
_L4:
        mGivenName = s1;
        continue; /* Loop/switch isn't completed */
_L5:
        mHonorificPrefix = s1;
        continue; /* Loop/switch isn't completed */
_L6:
        mHonorificSuffix = s1;
        continue; /* Loop/switch isn't completed */
_L7:
        mMiddleName = s1;
        if (true) goto _L9; else goto _L8
_L8:
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        PersonEntity_NameEntityCreator.writeToParcel$65812fc5(this, parcel);
    }

    static 
    {
        HashMap hashmap = new HashMap();
        sFields = hashmap;
        hashmap.put("familyName", com.google.android.gms.common.server.response.orString("familyName", 2));
        sFields.put("formatted", com.google.android.gms.common.server.response.orString("formatted", 3));
        sFields.put("givenName", com.google.android.gms.common.server.response.orString("givenName", 4));
        sFields.put("honorificPrefix", com.google.android.gms.common.server.response.orString("honorificPrefix", 5));
        sFields.put("honorificSuffix", com.google.android.gms.common.server.response.orString("honorificSuffix", 6));
        sFields.put("middleName", com.google.android.gms.common.server.response.orString("middleName", 7));
    }

    public reator()
    {
        mVersionCode = 1;
        mIndicatorSet = new HashSet();
    }

    mIndicatorSet(Set set, int i, String s, String s1, String s2, String s3, String s4, 
            String s5)
    {
        mIndicatorSet = set;
        mVersionCode = i;
        mFamilyName = s;
        mFormatted = s1;
        mGivenName = s2;
        mHonorificPrefix = s3;
        mHonorificSuffix = s4;
        mMiddleName = s5;
    }
}
