// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive.internal.model;

import android.os.Parcel;
import com.google.android.gms.common.server.response.FastSafeParcelableJsonResponse;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.google.android.gms.drive.internal.model:
//            PropertyCreator

public final class Property extends FastSafeParcelableJsonResponse
{

    public static final PropertyCreator CREATOR = new PropertyCreator();
    private static final HashMap sFields;
    String mAppId;
    final Set mIndicatorSet;
    String mKey;
    String mValue;
    final int mVersionCode;
    String mVisibility;

    public Property()
    {
        mVersionCode = 1;
        mIndicatorSet = new HashSet();
    }

    Property(Set set, int i, String s, String s1, String s2, String s3)
    {
        mIndicatorSet = set;
        mVersionCode = i;
        mAppId = s;
        mKey = s1;
        mValue = s2;
        mVisibility = s3;
    }

    public final int describeContents()
    {
        return 0;
    }

    public final boolean equals(Object obj)
    {
        if (obj instanceof Property) goto _L2; else goto _L1
_L1:
        return false;
_L2:
        Iterator iterator;
        if (this == obj)
        {
            return true;
        }
        obj = (Property)obj;
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
        if (!((Property) (obj)).isFieldSet(field)) goto _L1; else goto _L3
_L3:
        if (getFieldValue(field).equals(((Property) (obj)).getFieldValue(field))) goto _L5; else goto _L4
_L4:
        return false;
        if (!((Property) (obj)).isFieldSet(field)) goto _L5; else goto _L6
_L6:
        return false;
        return true;
    }

    public final volatile Map getFieldMappings()
    {
        return sFields;
    }

    protected final Object getFieldValue(com.google.android.gms.common.server.response.FastJsonResponse.Field field)
    {
        switch (field.getSafeParcelableFieldId())
        {
        case 3: // '\003'
        case 5: // '\005'
        case 6: // '\006'
        default:
            throw new IllegalStateException((new StringBuilder("Unknown safe parcelable id=")).append(field.getSafeParcelableFieldId()).toString());

        case 2: // '\002'
            return mAppId;

        case 4: // '\004'
            return mKey;

        case 7: // '\007'
            return mValue;

        case 8: // '\b'
            return mVisibility;
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

    protected final boolean isFieldSet(com.google.android.gms.common.server.response.FastJsonResponse.Field field)
    {
        return mIndicatorSet.contains(Integer.valueOf(field.getSafeParcelableFieldId()));
    }

    protected final void setStringInternal(com.google.android.gms.common.server.response.FastJsonResponse.Field field, String s, String s1)
    {
        int i = field.getSafeParcelableFieldId();
        i;
        JVM INSTR tableswitch 2 8: default 52
    //                   2 82
    //                   3 52
    //                   4 103
    //                   5 52
    //                   6 52
    //                   7 111
    //                   8 119;
           goto _L1 _L2 _L1 _L3 _L1 _L1 _L4 _L5
_L1:
        throw new IllegalArgumentException((new StringBuilder("Field with id=")).append(i).append(" is not known to be a String.").toString());
_L2:
        mAppId = s1;
_L7:
        mIndicatorSet.add(Integer.valueOf(i));
        return;
_L3:
        mKey = s1;
        continue; /* Loop/switch isn't completed */
_L4:
        mValue = s1;
        continue; /* Loop/switch isn't completed */
_L5:
        mVisibility = s1;
        if (true) goto _L7; else goto _L6
_L6:
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        PropertyCreator.writeToParcel$137abf5c(this, parcel);
    }

    static 
    {
        HashMap hashmap = new HashMap();
        sFields = hashmap;
        hashmap.put("appId", com.google.android.gms.common.server.response.FastJsonResponse.Field.forString("appId", 2));
        sFields.put("key", com.google.android.gms.common.server.response.FastJsonResponse.Field.forString("key", 4));
        sFields.put("value", com.google.android.gms.common.server.response.FastJsonResponse.Field.forString("value", 7));
        sFields.put("visibility", com.google.android.gms.common.server.response.FastJsonResponse.Field.forString("visibility", 8));
    }
}
