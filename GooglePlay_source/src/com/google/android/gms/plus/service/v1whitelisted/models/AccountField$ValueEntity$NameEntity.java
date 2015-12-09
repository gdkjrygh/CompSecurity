// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.plus.service.v1whitelisted.models;

import android.os.Parcel;
import com.google.android.gms.common.server.response.FastSafeParcelableJsonResponse;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.google.android.gms.plus.service.v1whitelisted.models:
//            AccountField, AccountField_ValueEntity_NameEntityCreator

public static final class mReadOnly extends FastSafeParcelableJsonResponse
    implements mReadOnly
{

    public static final AccountField_ValueEntity_NameEntityCreator CREATOR = new AccountField_ValueEntity_NameEntityCreator();
    private static final HashMap sFields;
    String mFamily;
    String mGiven;
    final Set mIndicatorSet;
    boolean mReadOnly;
    final int mVersionCode;

    public final int describeContents()
    {
        return 0;
    }

    public final boolean equals(Object obj)
    {
        if (obj instanceof mReadOnly) goto _L2; else goto _L1
_L1:
        return false;
_L2:
        Iterator iterator;
        if (this == obj)
        {
            return true;
        }
        obj = (mReadOnly)obj;
        iterator = sFields.values().iterator();
_L5:
        com.google.android.gms.common.server.response.NameEntity nameentity;
        if (!iterator.hasNext())
        {
            break MISSING_BLOCK_LABEL_96;
        }
        nameentity = (com.google.android.gms.common.server.response.NameEntity.sFields)iterator.next();
        if (!isFieldSet(nameentity))
        {
            continue; /* Loop/switch isn't completed */
        }
        if (!((isFieldSet) (obj)).isFieldSet(nameentity)) goto _L1; else goto _L3
_L3:
        if (getFieldValue(nameentity).equals(((getFieldValue) (obj)).getFieldValue(nameentity))) goto _L5; else goto _L4
_L4:
        return false;
        if (!((getFieldValue) (obj)).isFieldSet(nameentity)) goto _L5; else goto _L6
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

    protected final Object getFieldValue(com.google.android.gms.common.server.response.NameEntity nameentity)
    {
        switch (nameentity.ableFieldId())
        {
        default:
            throw new IllegalStateException((new StringBuilder("Unknown safe parcelable id=")).append(nameentity.ableFieldId()).toString());

        case 2: // '\002'
            return mFamily;

        case 3: // '\003'
            return mGiven;

        case 4: // '\004'
            return Boolean.valueOf(mReadOnly);
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
            com.google.android.gms.common.server.response.NameEntity nameentity = (com.google.android.gms.common.server.response.NameEntity.sFields)iterator.next();
            if (isFieldSet(nameentity))
            {
                i = nameentity.ableFieldId() + i + getFieldValue(nameentity).hashCode();
            }
        } while (true);
        return i;
    }

    public final boolean isDataValid()
    {
        return true;
    }

    protected final boolean isFieldSet(com.google.android.gms.common.server.response.NameEntity nameentity)
    {
        return mIndicatorSet.contains(Integer.valueOf(nameentity.ableFieldId()));
    }

    protected final void setBooleanInternal(com.google.android.gms.common.server.response.NameEntity nameentity, String s, boolean flag)
    {
        int i = nameentity.ableFieldId();
        switch (i)
        {
        default:
            throw new IllegalArgumentException((new StringBuilder("Field with id=")).append(i).append(" is not known to be a boolean.").toString());

        case 4: // '\004'
            mReadOnly = flag;
            break;
        }
        mIndicatorSet.add(Integer.valueOf(i));
    }

    protected final void setStringInternal(com.google.android.gms.common.server.response.NameEntity nameentity, String s, String s1)
    {
        int i = nameentity.ableFieldId();
        i;
        JVM INSTR tableswitch 2 3: default 32
    //                   2 62
    //                   3 83;
           goto _L1 _L2 _L3
_L1:
        throw new IllegalArgumentException((new StringBuilder("Field with id=")).append(i).append(" is not known to be a String.").toString());
_L2:
        mFamily = s1;
_L5:
        mIndicatorSet.add(Integer.valueOf(i));
        return;
_L3:
        mGiven = s1;
        if (true) goto _L5; else goto _L4
_L4:
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        AccountField_ValueEntity_NameEntityCreator.writeToParcel$3c552c7f(this, parcel);
    }

    static 
    {
        HashMap hashmap = new HashMap();
        sFields = hashmap;
        hashmap.put("family", com.google.android.gms.common.server.response.NameEntity.sFields("family", 2));
        sFields.put("given", com.google.android.gms.common.server.response.NameEntity.sFields("given", 3));
        sFields.put("readOnly", com.google.android.gms.common.server.response.NameEntity.sFields("readOnly", 4));
    }

    public reator()
    {
        mVersionCode = 1;
        mIndicatorSet = new HashSet();
    }

    mIndicatorSet(Set set, int i, String s, String s1, boolean flag)
    {
        mIndicatorSet = set;
        mVersionCode = i;
        mFamily = s;
        mGiven = s1;
        mReadOnly = flag;
    }
}
