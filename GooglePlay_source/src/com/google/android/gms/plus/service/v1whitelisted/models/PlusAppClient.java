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
//            PlusAppClientCreator

public final class PlusAppClient extends FastSafeParcelableJsonResponse
{

    public static final PlusAppClientCreator CREATOR = new PlusAppClientCreator();
    private static final HashMap sFields;
    String mAndroidCertificateHash;
    String mAndroidPackageName;
    final Set mIndicatorSet;
    String mType;
    final int mVersionCode;

    public PlusAppClient()
    {
        mVersionCode = 1;
        mIndicatorSet = new HashSet();
    }

    PlusAppClient(Set set, int i, String s, String s1, String s2)
    {
        mIndicatorSet = set;
        mVersionCode = i;
        mAndroidCertificateHash = s;
        mAndroidPackageName = s1;
        mType = s2;
    }

    public final int describeContents()
    {
        return 0;
    }

    public final boolean equals(Object obj)
    {
        if (obj instanceof PlusAppClient) goto _L2; else goto _L1
_L1:
        return false;
_L2:
        Iterator iterator;
        if (this == obj)
        {
            return true;
        }
        obj = (PlusAppClient)obj;
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
        if (!((PlusAppClient) (obj)).isFieldSet(field)) goto _L1; else goto _L3
_L3:
        if (getFieldValue(field).equals(((PlusAppClient) (obj)).getFieldValue(field))) goto _L5; else goto _L4
_L4:
        return false;
        if (!((PlusAppClient) (obj)).isFieldSet(field)) goto _L5; else goto _L6
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
        case 4: // '\004'
        case 5: // '\005'
        default:
            throw new IllegalStateException((new StringBuilder("Unknown safe parcelable id=")).append(field.getSafeParcelableFieldId()).toString());

        case 2: // '\002'
            return mAndroidCertificateHash;

        case 3: // '\003'
            return mAndroidPackageName;

        case 6: // '\006'
            return mType;
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
        JVM INSTR tableswitch 2 6: default 44
    //                   2 74
    //                   3 95
    //                   4 44
    //                   5 44
    //                   6 103;
           goto _L1 _L2 _L3 _L1 _L1 _L4
_L1:
        throw new IllegalArgumentException((new StringBuilder("Field with id=")).append(i).append(" is not known to be a String.").toString());
_L2:
        mAndroidCertificateHash = s1;
_L6:
        mIndicatorSet.add(Integer.valueOf(i));
        return;
_L3:
        mAndroidPackageName = s1;
        continue; /* Loop/switch isn't completed */
_L4:
        mType = s1;
        if (true) goto _L6; else goto _L5
_L5:
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        PlusAppClientCreator.writeToParcel$127f8444(this, parcel);
    }

    static 
    {
        HashMap hashmap = new HashMap();
        sFields = hashmap;
        hashmap.put("androidCertificateHash", com.google.android.gms.common.server.response.FastJsonResponse.Field.forString("androidCertificateHash", 2));
        sFields.put("androidPackageName", com.google.android.gms.common.server.response.FastJsonResponse.Field.forString("androidPackageName", 3));
        sFields.put("type", com.google.android.gms.common.server.response.FastJsonResponse.Field.forString("type", 6));
    }
}
