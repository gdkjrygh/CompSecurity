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
//            LoggedCircleMember, LoggedCircleMemberEntityCreator

public final class LoggedCircleMemberEntity extends FastSafeParcelableJsonResponse
    implements LoggedCircleMember
{

    public static final LoggedCircleMemberEntityCreator CREATOR = new LoggedCircleMemberEntityCreator();
    private static final HashMap sFields;
    String mEmailId;
    String mFocusContactId;
    String mGaiaId;
    final Set mIndicatorSet;
    final int mVersionCode;

    public LoggedCircleMemberEntity()
    {
        mVersionCode = 1;
        mIndicatorSet = new HashSet();
    }

    LoggedCircleMemberEntity(Set set, int i, String s, String s1, String s2)
    {
        mIndicatorSet = set;
        mVersionCode = i;
        mEmailId = s;
        mFocusContactId = s1;
        mGaiaId = s2;
    }

    public final int describeContents()
    {
        return 0;
    }

    public final boolean equals(Object obj)
    {
        if (obj instanceof LoggedCircleMemberEntity) goto _L2; else goto _L1
_L1:
        return false;
_L2:
        Iterator iterator;
        if (this == obj)
        {
            return true;
        }
        obj = (LoggedCircleMemberEntity)obj;
        iterator = sFields.values().iterator();
_L5:
        com.google.android.gms.common.server.response.FastJsonResponse.Field field;
        if (!iterator.hasNext())
        {
            break MISSING_BLOCK_LABEL_96;
        }
        field = (com.google.android.gms.common.server.response.FastJsonResponse.Field)iterator.next();
        if (!isFieldSet(field))
        {
            continue; /* Loop/switch isn't completed */
        }
        if (!((LoggedCircleMemberEntity) (obj)).isFieldSet(field)) goto _L1; else goto _L3
_L3:
        if (getFieldValue(field).equals(((LoggedCircleMemberEntity) (obj)).getFieldValue(field))) goto _L5; else goto _L4
_L4:
        return false;
        if (!((LoggedCircleMemberEntity) (obj)).isFieldSet(field)) goto _L5; else goto _L6
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

    protected final Object getFieldValue(com.google.android.gms.common.server.response.FastJsonResponse.Field field)
    {
        switch (field.getSafeParcelableFieldId())
        {
        default:
            throw new IllegalStateException((new StringBuilder("Unknown safe parcelable id=")).append(field.getSafeParcelableFieldId()).toString());

        case 3: // '\003'
            return mEmailId;

        case 4: // '\004'
            return mFocusContactId;

        case 5: // '\005'
            return mGaiaId;
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
            com.google.android.gms.common.server.response.FastJsonResponse.Field field = (com.google.android.gms.common.server.response.FastJsonResponse.Field)iterator.next();
            if (isFieldSet(field))
            {
                i = field.getSafeParcelableFieldId() + i + getFieldValue(field).hashCode();
            }
        } while (true);
        return i;
    }

    public final boolean isDataValid()
    {
        return true;
    }

    protected final boolean isFieldSet(com.google.android.gms.common.server.response.FastJsonResponse.Field field)
    {
        return mIndicatorSet.contains(Integer.valueOf(field.getSafeParcelableFieldId()));
    }

    protected final void setStringInternal(com.google.android.gms.common.server.response.FastJsonResponse.Field field, String s, String s1)
    {
        int i = field.getSafeParcelableFieldId();
        i;
        JVM INSTR tableswitch 3 5: default 36
    //                   3 66
    //                   4 87
    //                   5 95;
           goto _L1 _L2 _L3 _L4
_L1:
        throw new IllegalArgumentException((new StringBuilder("Field with id=")).append(i).append(" is not known to be a String.").toString());
_L2:
        mEmailId = s1;
_L6:
        mIndicatorSet.add(Integer.valueOf(i));
        return;
_L3:
        mFocusContactId = s1;
        continue; /* Loop/switch isn't completed */
_L4:
        mGaiaId = s1;
        if (true) goto _L6; else goto _L5
_L5:
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        LoggedCircleMemberEntityCreator.writeToParcel$78c72097(this, parcel);
    }

    static 
    {
        HashMap hashmap = new HashMap();
        sFields = hashmap;
        hashmap.put("emailId", com.google.android.gms.common.server.response.FastJsonResponse.Field.forString("emailId", 3));
        sFields.put("focusContactId", com.google.android.gms.common.server.response.FastJsonResponse.Field.forString("focusContactId", 4));
        sFields.put("gaiaId", com.google.android.gms.common.server.response.FastJsonResponse.Field.forString("gaiaId", 5));
    }
}
