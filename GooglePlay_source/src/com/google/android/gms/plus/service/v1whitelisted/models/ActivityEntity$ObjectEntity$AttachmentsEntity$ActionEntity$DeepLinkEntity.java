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
//            ActivityEntity, ActivityEntity_ObjectEntity_AttachmentsEntity_ActionEntity_DeepLinkEntityCreator

public static final class mUrl extends FastSafeParcelableJsonResponse
    implements mUrl
{

    public static final ActivityEntity_ObjectEntity_AttachmentsEntity_ActionEntity_DeepLinkEntityCreator CREATOR = new ActivityEntity_ObjectEntity_AttachmentsEntity_ActionEntity_DeepLinkEntityCreator();
    private static final HashMap sFields;
    String mId;
    final Set mIndicatorSet;
    String mUrl;
    final int mVersionCode;

    public final int describeContents()
    {
        return 0;
    }

    public final boolean equals(Object obj)
    {
        if (obj instanceof mUrl) goto _L2; else goto _L1
_L1:
        return false;
_L2:
        Iterator iterator;
        if (this == obj)
        {
            return true;
        }
        obj = (mUrl)obj;
        iterator = sFields.values().iterator();
_L5:
        com.google.android.gms.common.server.response.LinkEntity linkentity;
        if (!iterator.hasNext())
        {
            break MISSING_BLOCK_LABEL_96;
        }
        linkentity = (com.google.android.gms.common.server.response.LinkEntity.sFields)iterator.next();
        if (!isFieldSet(linkentity))
        {
            continue; /* Loop/switch isn't completed */
        }
        if (!((isFieldSet) (obj)).isFieldSet(linkentity)) goto _L1; else goto _L3
_L3:
        if (getFieldValue(linkentity).equals(((getFieldValue) (obj)).getFieldValue(linkentity))) goto _L5; else goto _L4
_L4:
        return false;
        if (!((getFieldValue) (obj)).isFieldSet(linkentity)) goto _L5; else goto _L6
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

    protected final Object getFieldValue(com.google.android.gms.common.server.response.LinkEntity linkentity)
    {
        switch (linkentity.LinkEntity())
        {
        default:
            throw new IllegalStateException((new StringBuilder("Unknown safe parcelable id=")).append(linkentity.LinkEntity()).toString());

        case 2: // '\002'
            return mId;

        case 3: // '\003'
            return mUrl;
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
            com.google.android.gms.common.server.response.LinkEntity linkentity = (com.google.android.gms.common.server.response.LinkEntity.sFields)iterator.next();
            if (isFieldSet(linkentity))
            {
                i = linkentity.isFieldSet() + i + getFieldValue(linkentity).hashCode();
            }
        } while (true);
        return i;
    }

    public final boolean isDataValid()
    {
        return true;
    }

    protected final boolean isFieldSet(com.google.android.gms.common.server.response.LinkEntity linkentity)
    {
        return mIndicatorSet.contains(Integer.valueOf(linkentity.mIndicatorSet()));
    }

    protected final void setStringInternal(com.google.android.gms.common.server.response.LinkEntity linkentity, String s, String s1)
    {
        int i = linkentity.LinkEntity();
        i;
        JVM INSTR tableswitch 2 3: default 32
    //                   2 62
    //                   3 83;
           goto _L1 _L2 _L3
_L1:
        throw new IllegalArgumentException((new StringBuilder("Field with id=")).append(i).append(" is not known to be a String.").toString());
_L2:
        mId = s1;
_L5:
        mIndicatorSet.add(Integer.valueOf(i));
        return;
_L3:
        mUrl = s1;
        if (true) goto _L5; else goto _L4
_L4:
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        ActivityEntity_ObjectEntity_AttachmentsEntity_ActionEntity_DeepLinkEntityCreator.writeToParcel$5f80c9a3(this, parcel);
    }

    static 
    {
        HashMap hashmap = new HashMap();
        sFields = hashmap;
        hashmap.put("id", com.google.android.gms.common.server.response.LinkEntity.sFields("id", 2));
        sFields.put("url", com.google.android.gms.common.server.response.LinkEntity.sFields("url", 3));
    }

    public reator()
    {
        mVersionCode = 1;
        mIndicatorSet = new HashSet();
    }

    mIndicatorSet(Set set, int i, String s, String s1)
    {
        mIndicatorSet = set;
        mVersionCode = i;
        mId = s;
        mUrl = s1;
    }
}
