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
//            CommentEntity, CommentEntity_ObjectEntityCreator

public static final class mContent extends FastSafeParcelableJsonResponse
    implements mContent
{

    public static final CommentEntity_ObjectEntityCreator CREATOR = new CommentEntity_ObjectEntityCreator();
    private static final HashMap sFields;
    String mContent;
    final Set mIndicatorSet;
    final int mVersionCode;

    public final int describeContents()
    {
        return 0;
    }

    public final boolean equals(Object obj)
    {
        if (obj instanceof mContent) goto _L2; else goto _L1
_L1:
        return false;
_L2:
        Iterator iterator;
        if (this == obj)
        {
            return true;
        }
        obj = (mContent)obj;
        iterator = sFields.values().iterator();
_L5:
        com.google.android.gms.common.server.response.jectEntity jectentity;
        if (!iterator.hasNext())
        {
            break MISSING_BLOCK_LABEL_96;
        }
        jectentity = (com.google.android.gms.common.server.response.jectEntity.sFields)iterator.next();
        if (!isFieldSet(jectentity))
        {
            continue; /* Loop/switch isn't completed */
        }
        if (!((isFieldSet) (obj)).isFieldSet(jectentity)) goto _L1; else goto _L3
_L3:
        if (getFieldValue(jectentity).equals(((getFieldValue) (obj)).getFieldValue(jectentity))) goto _L5; else goto _L4
_L4:
        return false;
        if (!((getFieldValue) (obj)).isFieldSet(jectentity)) goto _L5; else goto _L6
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

    protected final Object getFieldValue(com.google.android.gms.common.server.response.jectEntity jectentity)
    {
        switch (jectentity.afeParcelableFieldId())
        {
        default:
            throw new IllegalStateException((new StringBuilder("Unknown safe parcelable id=")).append(jectentity.afeParcelableFieldId()).toString());

        case 2: // '\002'
            return mContent;
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
            com.google.android.gms.common.server.response.jectEntity jectentity = (com.google.android.gms.common.server.response.jectEntity.sFields)iterator.next();
            if (isFieldSet(jectentity))
            {
                i = jectentity.afeParcelableFieldId() + i + getFieldValue(jectentity).hashCode();
            }
        } while (true);
        return i;
    }

    public final boolean isDataValid()
    {
        return true;
    }

    protected final boolean isFieldSet(com.google.android.gms.common.server.response.jectEntity jectentity)
    {
        return mIndicatorSet.contains(Integer.valueOf(jectentity.afeParcelableFieldId()));
    }

    protected final void setStringInternal(com.google.android.gms.common.server.response.jectEntity jectentity, String s, String s1)
    {
        int i = jectentity.afeParcelableFieldId();
        switch (i)
        {
        default:
            throw new IllegalArgumentException((new StringBuilder("Field with id=")).append(i).append(" is not known to be a String.").toString());

        case 2: // '\002'
            mContent = s1;
            break;
        }
        mIndicatorSet.add(Integer.valueOf(i));
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        CommentEntity_ObjectEntityCreator.writeToParcel$49f165c2(this, parcel);
    }

    static 
    {
        HashMap hashmap = new HashMap();
        sFields = hashmap;
        hashmap.put("content", com.google.android.gms.common.server.response.tring("content", 2));
    }

    public reator()
    {
        mVersionCode = 1;
        mIndicatorSet = new HashSet();
    }

    mIndicatorSet(Set set, int i, String s)
    {
        mIndicatorSet = set;
        mVersionCode = i;
        mContent = s;
    }
}
