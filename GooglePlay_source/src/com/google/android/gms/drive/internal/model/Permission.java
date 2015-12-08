// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive.internal.model;

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

// Referenced classes of package com.google.android.gms.drive.internal.model:
//            PermissionCreator

public final class Permission extends FastSafeParcelableJsonResponse
{

    public static final PermissionCreator CREATOR = new PermissionCreator();
    private static final HashMap sFields;
    List mAdditionalRoles;
    String mDomain;
    String mEmailAddress;
    String mId;
    final Set mIndicatorSet;
    String mName;
    String mPhotoLink;
    String mRole;
    String mType;
    String mValue;
    final int mVersionCode;
    boolean mWithLink;

    public Permission()
    {
        mVersionCode = 1;
        mIndicatorSet = new HashSet();
    }

    Permission(Set set, int i, List list, String s, String s1, String s2, String s3, 
            String s4, String s5, String s6, String s7, boolean flag)
    {
        mIndicatorSet = set;
        mVersionCode = i;
        mAdditionalRoles = list;
        mDomain = s;
        mEmailAddress = s1;
        mId = s2;
        mName = s3;
        mPhotoLink = s4;
        mRole = s5;
        mType = s6;
        mValue = s7;
        mWithLink = flag;
    }

    public final int describeContents()
    {
        return 0;
    }

    public final boolean equals(Object obj)
    {
        if (obj instanceof Permission) goto _L2; else goto _L1
_L1:
        return false;
_L2:
        Iterator iterator;
        if (this == obj)
        {
            return true;
        }
        obj = (Permission)obj;
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
        if (!((Permission) (obj)).isFieldSet(field)) goto _L1; else goto _L3
_L3:
        if (getFieldValue(field).equals(((Permission) (obj)).getFieldValue(field))) goto _L5; else goto _L4
_L4:
        return false;
        if (!((Permission) (obj)).isFieldSet(field)) goto _L5; else goto _L6
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
        case 6: // '\006'
        case 8: // '\b'
        case 12: // '\f'
        case 14: // '\016'
        default:
            throw new IllegalStateException((new StringBuilder("Unknown safe parcelable id=")).append(field.getSafeParcelableFieldId()).toString());

        case 2: // '\002'
            return mAdditionalRoles;

        case 4: // '\004'
            return mDomain;

        case 5: // '\005'
            return mEmailAddress;

        case 7: // '\007'
            return mId;

        case 9: // '\t'
            return mName;

        case 10: // '\n'
            return mPhotoLink;

        case 11: // '\013'
            return mRole;

        case 13: // '\r'
            return mType;

        case 15: // '\017'
            return mValue;

        case 16: // '\020'
            return Boolean.valueOf(mWithLink);
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

    protected final void setBooleanInternal(com.google.android.gms.common.server.response.FastJsonResponse.Field field, String s, boolean flag)
    {
        int i = field.getSafeParcelableFieldId();
        switch (i)
        {
        default:
            throw new IllegalArgumentException((new StringBuilder("Field with id=")).append(i).append(" is not known to be a boolean.").toString());

        case 16: // '\020'
            mWithLink = flag;
            break;
        }
        mIndicatorSet.add(Integer.valueOf(i));
    }

    protected final void setStringInternal(com.google.android.gms.common.server.response.FastJsonResponse.Field field, String s, String s1)
    {
        int i = field.getSafeParcelableFieldId();
        i;
        JVM INSTR tableswitch 4 15: default 72
    //                   4 102
    //                   5 123
    //                   6 72
    //                   7 131
    //                   8 72
    //                   9 139
    //                   10 147
    //                   11 155
    //                   12 72
    //                   13 163
    //                   14 72
    //                   15 171;
           goto _L1 _L2 _L3 _L1 _L4 _L1 _L5 _L6 _L7 _L1 _L8 _L1 _L9
_L1:
        throw new IllegalArgumentException((new StringBuilder("Field with id=")).append(i).append(" is not known to be a String.").toString());
_L2:
        mDomain = s1;
_L11:
        mIndicatorSet.add(Integer.valueOf(i));
        return;
_L3:
        mEmailAddress = s1;
        continue; /* Loop/switch isn't completed */
_L4:
        mId = s1;
        continue; /* Loop/switch isn't completed */
_L5:
        mName = s1;
        continue; /* Loop/switch isn't completed */
_L6:
        mPhotoLink = s1;
        continue; /* Loop/switch isn't completed */
_L7:
        mRole = s1;
        continue; /* Loop/switch isn't completed */
_L8:
        mType = s1;
        continue; /* Loop/switch isn't completed */
_L9:
        mValue = s1;
        if (true) goto _L11; else goto _L10
_L10:
    }

    protected final void setStringsInternal(com.google.android.gms.common.server.response.FastJsonResponse.Field field, String s, ArrayList arraylist)
    {
        int i = field.getSafeParcelableFieldId();
        switch (i)
        {
        default:
            throw new IllegalArgumentException((new StringBuilder("Field with id=")).append(i).append(" is not known to be an array of String.").toString());

        case 2: // '\002'
            mAdditionalRoles = arraylist;
            break;
        }
        mIndicatorSet.add(Integer.valueOf(i));
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        PermissionCreator.writeToParcel$255a8a9e(this, parcel);
    }

    static 
    {
        HashMap hashmap = new HashMap();
        sFields = hashmap;
        hashmap.put("additionalRoles", com.google.android.gms.common.server.response.FastJsonResponse.Field.forStrings("additionalRoles", 2));
        sFields.put("domain", com.google.android.gms.common.server.response.FastJsonResponse.Field.forString("domain", 4));
        sFields.put("emailAddress", com.google.android.gms.common.server.response.FastJsonResponse.Field.forString("emailAddress", 5));
        sFields.put("id", com.google.android.gms.common.server.response.FastJsonResponse.Field.forString("id", 7));
        sFields.put("name", com.google.android.gms.common.server.response.FastJsonResponse.Field.forString("name", 9));
        sFields.put("photoLink", com.google.android.gms.common.server.response.FastJsonResponse.Field.forString("photoLink", 10));
        sFields.put("role", com.google.android.gms.common.server.response.FastJsonResponse.Field.forString("role", 11));
        sFields.put("type", com.google.android.gms.common.server.response.FastJsonResponse.Field.forString("type", 13));
        sFields.put("value", com.google.android.gms.common.server.response.FastJsonResponse.Field.forString("value", 15));
        sFields.put("withLink", com.google.android.gms.common.server.response.FastJsonResponse.Field.forBoolean("withLink", 16));
    }
}
