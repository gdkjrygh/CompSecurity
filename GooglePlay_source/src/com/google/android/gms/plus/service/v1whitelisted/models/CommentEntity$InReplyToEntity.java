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
//            CommentEntity, CommentEntity_InReplyToEntityCreator

public static final class mUrl extends FastSafeParcelableJsonResponse
    implements mUrl
{

    public static final CommentEntity_InReplyToEntityCreator CREATOR = new CommentEntity_InReplyToEntityCreator();
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
        com.google.android.gms.common.server.response.lyToEntity lytoentity;
        if (!iterator.hasNext())
        {
            break MISSING_BLOCK_LABEL_96;
        }
        lytoentity = (com.google.android.gms.common.server.response.lyToEntity.sFields)iterator.next();
        if (!isFieldSet(lytoentity))
        {
            continue; /* Loop/switch isn't completed */
        }
        if (!((isFieldSet) (obj)).isFieldSet(lytoentity)) goto _L1; else goto _L3
_L3:
        if (getFieldValue(lytoentity).equals(((getFieldValue) (obj)).getFieldValue(lytoentity))) goto _L5; else goto _L4
_L4:
        return false;
        if (!((getFieldValue) (obj)).isFieldSet(lytoentity)) goto _L5; else goto _L6
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

    protected final Object getFieldValue(com.google.android.gms.common.server.response.lyToEntity lytoentity)
    {
        switch (lytoentity.ParcelableFieldId())
        {
        default:
            throw new IllegalStateException((new StringBuilder("Unknown safe parcelable id=")).append(lytoentity.ParcelableFieldId()).toString());

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
            com.google.android.gms.common.server.response.lyToEntity lytoentity = (com.google.android.gms.common.server.response.lyToEntity.sFields)iterator.next();
            if (isFieldSet(lytoentity))
            {
                i = lytoentity.ParcelableFieldId() + i + getFieldValue(lytoentity).hashCode();
            }
        } while (true);
        return i;
    }

    public final boolean isDataValid()
    {
        return true;
    }

    protected final boolean isFieldSet(com.google.android.gms.common.server.response.lyToEntity lytoentity)
    {
        return mIndicatorSet.contains(Integer.valueOf(lytoentity.ParcelableFieldId()));
    }

    protected final void setStringInternal(com.google.android.gms.common.server.response.lyToEntity lytoentity, String s, String s1)
    {
        int i = lytoentity.ParcelableFieldId();
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
        CommentEntity_InReplyToEntityCreator.writeToParcel$6cab8fb5(this, parcel);
    }

    static 
    {
        HashMap hashmap = new HashMap();
        sFields = hashmap;
        hashmap.put("id", com.google.android.gms.common.server.response.ng("id", 2));
        sFields.put("url", com.google.android.gms.common.server.response.ng("url", 3));
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
