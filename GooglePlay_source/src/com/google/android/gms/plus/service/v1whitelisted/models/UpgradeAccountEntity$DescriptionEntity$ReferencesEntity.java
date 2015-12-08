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
//            UpgradeAccountEntity, UpgradeAccountEntity_DescriptionEntity_ReferencesEntityCreator

public static final class mTitle extends FastSafeParcelableJsonResponse
    implements mTitle
{

    public static final UpgradeAccountEntity_DescriptionEntity_ReferencesEntityCreator CREATOR = new UpgradeAccountEntity_DescriptionEntity_ReferencesEntityCreator();
    private static final HashMap sFields;
    String mId;
    final Set mIndicatorSet;
    String mText;
    String mTitle;
    final int mVersionCode;

    public final int describeContents()
    {
        return 0;
    }

    public final boolean equals(Object obj)
    {
        if (obj instanceof mTitle) goto _L2; else goto _L1
_L1:
        return false;
_L2:
        Iterator iterator;
        if (this == obj)
        {
            return true;
        }
        obj = (mTitle)obj;
        iterator = sFields.values().iterator();
_L5:
        com.google.android.gms.common.server.response.ncesEntity ncesentity;
        if (!iterator.hasNext())
        {
            break MISSING_BLOCK_LABEL_96;
        }
        ncesentity = (com.google.android.gms.common.server.response.ncesEntity.sFields)iterator.next();
        if (!isFieldSet(ncesentity))
        {
            continue; /* Loop/switch isn't completed */
        }
        if (!((isFieldSet) (obj)).isFieldSet(ncesentity)) goto _L1; else goto _L3
_L3:
        if (getFieldValue(ncesentity).equals(((getFieldValue) (obj)).getFieldValue(ncesentity))) goto _L5; else goto _L4
_L4:
        return false;
        if (!((getFieldValue) (obj)).isFieldSet(ncesentity)) goto _L5; else goto _L6
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

    protected final Object getFieldValue(com.google.android.gms.common.server.response.ncesEntity ncesentity)
    {
        switch (ncesentity.ncesEntity())
        {
        default:
            throw new IllegalStateException((new StringBuilder("Unknown safe parcelable id=")).append(ncesentity.ncesEntity()).toString());

        case 2: // '\002'
            return mId;

        case 3: // '\003'
            return mText;

        case 4: // '\004'
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
            com.google.android.gms.common.server.response.ncesEntity ncesentity = (com.google.android.gms.common.server.response.ncesEntity.sFields)iterator.next();
            if (isFieldSet(ncesentity))
            {
                i = ncesentity.isFieldSet() + i + getFieldValue(ncesentity).hashCode();
            }
        } while (true);
        return i;
    }

    public final boolean isDataValid()
    {
        return true;
    }

    protected final boolean isFieldSet(com.google.android.gms.common.server.response.ncesEntity ncesentity)
    {
        return mIndicatorSet.contains(Integer.valueOf(ncesentity.mIndicatorSet()));
    }

    protected final void setStringInternal(com.google.android.gms.common.server.response.ncesEntity ncesentity, String s, String s1)
    {
        int i = ncesentity.ncesEntity();
        i;
        JVM INSTR tableswitch 2 4: default 36
    //                   2 66
    //                   3 87
    //                   4 95;
           goto _L1 _L2 _L3 _L4
_L1:
        throw new IllegalArgumentException((new StringBuilder("Field with id=")).append(i).append(" is not known to be a String.").toString());
_L2:
        mId = s1;
_L6:
        mIndicatorSet.add(Integer.valueOf(i));
        return;
_L3:
        mText = s1;
        continue; /* Loop/switch isn't completed */
_L4:
        mTitle = s1;
        if (true) goto _L6; else goto _L5
_L5:
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        UpgradeAccountEntity_DescriptionEntity_ReferencesEntityCreator.writeToParcel$4775ef6a(this, parcel);
    }

    static 
    {
        HashMap hashmap = new HashMap();
        sFields = hashmap;
        hashmap.put("id", com.google.android.gms.common.server.response.ncesEntity.sFields("id", 2));
        sFields.put("text", com.google.android.gms.common.server.response.ncesEntity.sFields("text", 3));
        sFields.put("title", com.google.android.gms.common.server.response.ncesEntity.sFields("title", 4));
    }

    public reator()
    {
        mVersionCode = 1;
        mIndicatorSet = new HashSet();
    }

    mIndicatorSet(Set set, int i, String s, String s1, String s2)
    {
        mIndicatorSet = set;
        mVersionCode = i;
        mId = s;
        mText = s1;
        mTitle = s2;
    }
}
