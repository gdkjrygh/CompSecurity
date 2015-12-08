// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.plus.service.v1whitelisted.models;

import android.os.Parcel;
import com.google.android.gms.common.server.response.FastSafeParcelableJsonResponse;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.google.android.gms.plus.service.v1whitelisted.models:
//            Acl, AclEntityCreator, PlusAclentryResourceEntity

public final class AclEntity extends FastSafeParcelableJsonResponse
    implements Acl
{

    public static final AclEntityCreator CREATOR = new AclEntityCreator();
    private static final HashMap sFields;
    String mAccessSummary;
    String mDescription;
    boolean mDomainRestricted;
    String mEtag;
    final Set mIndicatorSet;
    List mItems;
    boolean mReadOnly;
    boolean mRestricted;
    boolean mShowCircles;
    boolean mShowContacts;
    String mTitle;
    final int mVersionCode;

    public AclEntity()
    {
        mVersionCode = 1;
        mIndicatorSet = new HashSet();
    }

    AclEntity(Set set, int i, String s, String s1, boolean flag, String s2, List list, 
            boolean flag1, boolean flag2, boolean flag3, boolean flag4, String s3)
    {
        mIndicatorSet = set;
        mVersionCode = i;
        mAccessSummary = s;
        mDescription = s1;
        mDomainRestricted = flag;
        mEtag = s2;
        mItems = list;
        mReadOnly = flag1;
        mRestricted = flag2;
        mShowCircles = flag3;
        mShowContacts = flag4;
        mTitle = s3;
    }

    public final void addConcreteTypeArrayInternal(com.google.android.gms.common.server.response.FastJsonResponse.Field field, String s, ArrayList arraylist)
    {
        int i = field.getSafeParcelableFieldId();
        switch (i)
        {
        default:
            throw new IllegalArgumentException((new StringBuilder("Field with id=")).append(i).append(" is not a known array of custom type.  Found ").append(arraylist.getClass().getCanonicalName()).append(".").toString());

        case 6: // '\006'
            mItems = arraylist;
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
        if (obj instanceof AclEntity) goto _L2; else goto _L1
_L1:
        return false;
_L2:
        Iterator iterator;
        if (this == obj)
        {
            return true;
        }
        obj = (AclEntity)obj;
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
        if (!((AclEntity) (obj)).isFieldSet(field)) goto _L1; else goto _L3
_L3:
        if (getFieldValue(field).equals(((AclEntity) (obj)).getFieldValue(field))) goto _L5; else goto _L4
_L4:
        return false;
        if (!((AclEntity) (obj)).isFieldSet(field)) goto _L5; else goto _L6
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
        case 7: // '\007'
        default:
            throw new IllegalStateException((new StringBuilder("Unknown safe parcelable id=")).append(field.getSafeParcelableFieldId()).toString());

        case 2: // '\002'
            return mAccessSummary;

        case 3: // '\003'
            return mDescription;

        case 4: // '\004'
            return Boolean.valueOf(mDomainRestricted);

        case 5: // '\005'
            return mEtag;

        case 6: // '\006'
            return mItems;

        case 8: // '\b'
            return Boolean.valueOf(mReadOnly);

        case 9: // '\t'
            return Boolean.valueOf(mRestricted);

        case 10: // '\n'
            return Boolean.valueOf(mShowCircles);

        case 11: // '\013'
            return Boolean.valueOf(mShowContacts);

        case 12: // '\f'
            return mTitle;
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

    protected final void setBooleanInternal(com.google.android.gms.common.server.response.FastJsonResponse.Field field, String s, boolean flag)
    {
        int i = field.getSafeParcelableFieldId();
        i;
        JVM INSTR tableswitch 4 11: default 56
    //                   4 86
    //                   5 56
    //                   6 56
    //                   7 56
    //                   8 107
    //                   9 115
    //                   10 123
    //                   11 131;
           goto _L1 _L2 _L1 _L1 _L1 _L3 _L4 _L5 _L6
_L1:
        throw new IllegalArgumentException((new StringBuilder("Field with id=")).append(i).append(" is not known to be a boolean.").toString());
_L2:
        mDomainRestricted = flag;
_L8:
        mIndicatorSet.add(Integer.valueOf(i));
        return;
_L3:
        mReadOnly = flag;
        continue; /* Loop/switch isn't completed */
_L4:
        mRestricted = flag;
        continue; /* Loop/switch isn't completed */
_L5:
        mShowCircles = flag;
        continue; /* Loop/switch isn't completed */
_L6:
        mShowContacts = flag;
        if (true) goto _L8; else goto _L7
_L7:
    }

    protected final void setStringInternal(com.google.android.gms.common.server.response.FastJsonResponse.Field field, String s, String s1)
    {
        int i = field.getSafeParcelableFieldId();
        i;
        JVM INSTR lookupswitch 4: default 52
    //                   2: 82
    //                   3: 103
    //                   5: 111
    //                   12: 119;
           goto _L1 _L2 _L3 _L4 _L5
_L1:
        throw new IllegalArgumentException((new StringBuilder("Field with id=")).append(i).append(" is not known to be a String.").toString());
_L2:
        mAccessSummary = s1;
_L7:
        mIndicatorSet.add(Integer.valueOf(i));
        return;
_L3:
        mDescription = s1;
        continue; /* Loop/switch isn't completed */
_L4:
        mEtag = s1;
        continue; /* Loop/switch isn't completed */
_L5:
        mTitle = s1;
        if (true) goto _L7; else goto _L6
_L6:
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        AclEntityCreator.writeToParcel$1d3dde57(this, parcel);
    }

    static 
    {
        HashMap hashmap = new HashMap();
        sFields = hashmap;
        hashmap.put("accessSummary", com.google.android.gms.common.server.response.FastJsonResponse.Field.forString("accessSummary", 2));
        sFields.put("description", com.google.android.gms.common.server.response.FastJsonResponse.Field.forString("description", 3));
        sFields.put("domainRestricted", com.google.android.gms.common.server.response.FastJsonResponse.Field.forBoolean("domainRestricted", 4));
        sFields.put("etag", com.google.android.gms.common.server.response.FastJsonResponse.Field.forString("etag", 5));
        sFields.put("items", com.google.android.gms.common.server.response.FastJsonResponse.Field.forConcreteTypeArray("items", 6, com/google/android/gms/plus/service/v1whitelisted/models/PlusAclentryResourceEntity));
        sFields.put("readOnly", com.google.android.gms.common.server.response.FastJsonResponse.Field.forBoolean("readOnly", 8));
        sFields.put("restricted", com.google.android.gms.common.server.response.FastJsonResponse.Field.forBoolean("restricted", 9));
        sFields.put("showCircles", com.google.android.gms.common.server.response.FastJsonResponse.Field.forBoolean("showCircles", 10));
        sFields.put("showContacts", com.google.android.gms.common.server.response.FastJsonResponse.Field.forBoolean("showContacts", 11));
        sFields.put("title", com.google.android.gms.common.server.response.FastJsonResponse.Field.forString("title", 12));
    }
}
