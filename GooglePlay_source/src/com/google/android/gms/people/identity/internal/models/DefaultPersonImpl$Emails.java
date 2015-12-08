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
//            DefaultPersonImpl, DefaultPersonImpl_EmailsCreator, DefaultMetadataImpl

public static final class mValue extends FastJsonResponse
    implements SafeParcelable
{

    public static final DefaultPersonImpl_EmailsCreator CREATOR = new DefaultPersonImpl_EmailsCreator();
    private static final HashMap sFields;
    String mFormattedType;
    final Set mIndicatorSet;
    DefaultMetadataImpl mMetadata;
    String mType;
    String mValue;
    final int mVersionCode;

    public final void addConcreteTypeInternal(com.google.android.gms.common.server.response.l.Emails emails, String s, FastJsonResponse fastjsonresponse)
    {
        int i = emails.tSafeParcelableFieldId();
        switch (i)
        {
        default:
            throw new IllegalArgumentException((new StringBuilder("Field with id=")).append(i).append(" is not a known custom type.  Found ").append(fastjsonresponse.getClass().getCanonicalName()).append(".").toString());

        case 3: // '\003'
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
        com.google.android.gms.common.server.response.l.Emails emails;
        if (!iterator.hasNext())
        {
            break MISSING_BLOCK_LABEL_96;
        }
        emails = (com.google.android.gms.common.server.response.l.Emails.sFields)iterator.next();
        if (!isFieldSet(emails))
        {
            continue; /* Loop/switch isn't completed */
        }
        if (!((isFieldSet) (obj)).isFieldSet(emails)) goto _L1; else goto _L3
_L3:
        if (getFieldValue(emails).equals(((getFieldValue) (obj)).getFieldValue(emails))) goto _L5; else goto _L4
_L4:
        return false;
        if (!((getFieldValue) (obj)).isFieldSet(emails)) goto _L5; else goto _L6
_L6:
        return false;
        return true;
    }

    public final volatile Map getFieldMappings()
    {
        return sFields;
    }

    protected final Object getFieldValue(com.google.android.gms.common.server.response.l.Emails emails)
    {
        switch (emails.tSafeParcelableFieldId())
        {
        default:
            throw new IllegalStateException((new StringBuilder("Unknown safe parcelable id=")).append(emails.tSafeParcelableFieldId()).toString());

        case 2: // '\002'
            return mFormattedType;

        case 3: // '\003'
            return mMetadata;

        case 4: // '\004'
            return mType;

        case 5: // '\005'
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
            com.google.android.gms.common.server.response.l.Emails emails = (com.google.android.gms.common.server.response.l.Emails.sFields)iterator.next();
            if (isFieldSet(emails))
            {
                i = emails.tSafeParcelableFieldId() + i + getFieldValue(emails).hashCode();
            }
        } while (true);
        return i;
    }

    protected final boolean isFieldSet(com.google.android.gms.common.server.response.l.Emails emails)
    {
        return mIndicatorSet.contains(Integer.valueOf(emails.tSafeParcelableFieldId()));
    }

    protected final boolean isPrimitiveFieldSet(String s)
    {
        return false;
    }

    protected final void setStringInternal(com.google.android.gms.common.server.response.l.Emails emails, String s, String s1)
    {
        int i = emails.tSafeParcelableFieldId();
        i;
        JVM INSTR tableswitch 2 5: default 40
    //                   2 70
    //                   3 40
    //                   4 91
    //                   5 99;
           goto _L1 _L2 _L1 _L3 _L4
_L1:
        throw new IllegalArgumentException((new StringBuilder("Field with id=")).append(i).append(" is not known to be a String.").toString());
_L2:
        mFormattedType = s1;
_L6:
        mIndicatorSet.add(Integer.valueOf(i));
        return;
_L3:
        mType = s1;
        continue; /* Loop/switch isn't completed */
_L4:
        mValue = s1;
        if (true) goto _L6; else goto _L5
_L5:
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        DefaultPersonImpl_EmailsCreator.writeToParcel(this, parcel, i);
    }

    static 
    {
        HashMap hashmap = new HashMap();
        sFields = hashmap;
        hashmap.put("formattedType", com.google.android.gms.common.server.response.rString("formattedType", 2));
        sFields.put("metadata", com.google.android.gms.common.server.response.rConcreteType("metadata", 3, com/google/android/gms/people/identity/internal/models/DefaultMetadataImpl));
        sFields.put("type", com.google.android.gms.common.server.response.rString("type", 4));
        sFields.put("value", com.google.android.gms.common.server.response.rString("value", 5));
    }

    public reator()
    {
        mVersionCode = 1;
        mIndicatorSet = new HashSet();
    }

    mIndicatorSet(Set set, int i, String s, DefaultMetadataImpl defaultmetadataimpl, String s1, String s2)
    {
        mIndicatorSet = set;
        mVersionCode = i;
        mFormattedType = s;
        mMetadata = defaultmetadataimpl;
        mType = s1;
        mValue = s2;
    }
}
