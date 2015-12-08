// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.plus.internal.model.people;

import android.os.Parcel;
import com.google.android.gms.common.server.converter.StringToIntConverter;
import com.google.android.gms.common.server.response.FastSafeParcelableJsonResponse;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.google.android.gms.plus.internal.model.people:
//            PersonEntity, PersonEntity_OrganizationsEntityCreator

public static final class mType extends FastSafeParcelableJsonResponse
    implements com.google.android.gms.plus.model.people.se
{

    public static final PersonEntity_OrganizationsEntityCreator CREATOR = new PersonEntity_OrganizationsEntityCreator();
    private static final HashMap sFields;
    String mDepartment;
    String mDescription;
    String mEndDate;
    final Set mIndicatorSet;
    String mLocation;
    String mName;
    boolean mPrimary;
    String mStartDate;
    String mTitle;
    int mType;
    final int mVersionCode;

    public final int describeContents()
    {
        return 0;
    }

    public final boolean equals(Object obj)
    {
        if (obj instanceof mType) goto _L2; else goto _L1
_L1:
        return false;
_L2:
        Iterator iterator;
        if (this == obj)
        {
            return true;
        }
        obj = (mType)obj;
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
        switch (ity.celableFieldId())
        {
        default:
            throw new IllegalStateException((new StringBuilder("Unknown safe parcelable id=")).append(ity.celableFieldId()).toString());

        case 2: // '\002'
            return mDepartment;

        case 3: // '\003'
            return mDescription;

        case 4: // '\004'
            return mEndDate;

        case 5: // '\005'
            return mLocation;

        case 6: // '\006'
            return mName;

        case 7: // '\007'
            return Boolean.valueOf(mPrimary);

        case 8: // '\b'
            return mStartDate;

        case 9: // '\t'
            return mTitle;

        case 10: // '\n'
            return Integer.valueOf(mType);
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
                i = ity.celableFieldId() + i + getFieldValue(ity).hashCode();
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
        return mIndicatorSet.contains(Integer.valueOf(ity.celableFieldId()));
    }

    protected final void setBooleanInternal(com.google.android.gms.common.server.response.ity ity, String s, boolean flag)
    {
        int i = ity.celableFieldId();
        switch (i)
        {
        default:
            throw new IllegalArgumentException((new StringBuilder("Field with id=")).append(i).append(" is not known to be a boolean.").toString());

        case 7: // '\007'
            mPrimary = flag;
            break;
        }
        mIndicatorSet.add(Integer.valueOf(i));
    }

    protected final void setIntegerInternal(com.google.android.gms.common.server.response.ity ity, String s, int i)
    {
        int j = ity.celableFieldId();
        switch (j)
        {
        default:
            throw new IllegalArgumentException((new StringBuilder("Field with id=")).append(j).append(" is not known to be an int.").toString());

        case 10: // '\n'
            mType = i;
            break;
        }
        mIndicatorSet.add(Integer.valueOf(j));
    }

    protected final void setStringInternal(com.google.android.gms.common.server.response.ity ity, String s, String s1)
    {
        int i = ity.celableFieldId();
        i;
        JVM INSTR tableswitch 2 9: default 56
    //                   2 86
    //                   3 107
    //                   4 115
    //                   5 123
    //                   6 131
    //                   7 56
    //                   8 139
    //                   9 147;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L1 _L7 _L8
_L1:
        throw new IllegalArgumentException((new StringBuilder("Field with id=")).append(i).append(" is not known to be a String.").toString());
_L2:
        mDepartment = s1;
_L10:
        mIndicatorSet.add(Integer.valueOf(i));
        return;
_L3:
        mDescription = s1;
        continue; /* Loop/switch isn't completed */
_L4:
        mEndDate = s1;
        continue; /* Loop/switch isn't completed */
_L5:
        mLocation = s1;
        continue; /* Loop/switch isn't completed */
_L6:
        mName = s1;
        continue; /* Loop/switch isn't completed */
_L7:
        mStartDate = s1;
        continue; /* Loop/switch isn't completed */
_L8:
        mTitle = s1;
        if (true) goto _L10; else goto _L9
_L9:
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        PersonEntity_OrganizationsEntityCreator.writeToParcel$1290ebf0(this, parcel);
    }

    static 
    {
        HashMap hashmap = new HashMap();
        sFields = hashmap;
        hashmap.put("department", com.google.android.gms.common.server.response.ity.sFields("department", 2));
        sFields.put("description", com.google.android.gms.common.server.response.ity.sFields("description", 3));
        sFields.put("endDate", com.google.android.gms.common.server.response.ity.sFields("endDate", 4));
        sFields.put("location", com.google.android.gms.common.server.response.ity.sFields("location", 5));
        sFields.put("name", com.google.android.gms.common.server.response.ity.sFields("name", 6));
        sFields.put("primary", com.google.android.gms.common.server.response.("primary", 7));
        sFields.put("startDate", com.google.android.gms.common.server.response.ity.sFields("startDate", 8));
        sFields.put("title", com.google.android.gms.common.server.response.ity.sFields("title", 9));
        sFields.put("type", com.google.android.gms.common.server.response.ter("type", 10, (new StringToIntConverter()).add("work", 0).add("school", 1), false));
    }

    public reator()
    {
        mVersionCode = 1;
        mIndicatorSet = new HashSet();
    }

    mIndicatorSet(Set set, int i, String s, String s1, String s2, String s3, String s4, 
            boolean flag, String s5, String s6, int j)
    {
        mIndicatorSet = set;
        mVersionCode = i;
        mDepartment = s;
        mDescription = s1;
        mEndDate = s2;
        mLocation = s3;
        mName = s4;
        mPrimary = flag;
        mStartDate = s5;
        mTitle = s6;
        mType = j;
    }
}
