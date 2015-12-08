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
//            CommentEntity, CommentEntity_StatusForViewerEntityCreator

public static final class mIsPlusOned extends FastSafeParcelableJsonResponse
    implements mIsPlusOned
{

    public static final CommentEntity_StatusForViewerEntityCreator CREATOR = new CommentEntity_StatusForViewerEntityCreator();
    private static final HashMap sFields;
    final Set mIndicatorSet;
    boolean mIsPlusOned;
    final int mVersionCode;

    public final int describeContents()
    {
        return 0;
    }

    public final boolean equals(Object obj)
    {
        if (obj instanceof mIsPlusOned) goto _L2; else goto _L1
_L1:
        return false;
_L2:
        Iterator iterator;
        if (this == obj)
        {
            return true;
        }
        obj = (mIsPlusOned)obj;
        iterator = sFields.values().iterator();
_L5:
        com.google.android.gms.common.server.response.ewerEntity ewerentity;
        if (!iterator.hasNext())
        {
            break MISSING_BLOCK_LABEL_96;
        }
        ewerentity = (com.google.android.gms.common.server.response.ewerEntity.sFields)iterator.next();
        if (!isFieldSet(ewerentity))
        {
            continue; /* Loop/switch isn't completed */
        }
        if (!((isFieldSet) (obj)).isFieldSet(ewerentity)) goto _L1; else goto _L3
_L3:
        if (getFieldValue(ewerentity).equals(((getFieldValue) (obj)).getFieldValue(ewerentity))) goto _L5; else goto _L4
_L4:
        return false;
        if (!((getFieldValue) (obj)).isFieldSet(ewerentity)) goto _L5; else goto _L6
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

    protected final Object getFieldValue(com.google.android.gms.common.server.response.ewerEntity ewerentity)
    {
        switch (ewerentity.ableFieldId())
        {
        default:
            throw new IllegalStateException((new StringBuilder("Unknown safe parcelable id=")).append(ewerentity.ableFieldId()).toString());

        case 3: // '\003'
            return Boolean.valueOf(mIsPlusOned);
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
            com.google.android.gms.common.server.response.ewerEntity ewerentity = (com.google.android.gms.common.server.response.ewerEntity.sFields)iterator.next();
            if (isFieldSet(ewerentity))
            {
                i = ewerentity.ableFieldId() + i + getFieldValue(ewerentity).hashCode();
            }
        } while (true);
        return i;
    }

    public final boolean isDataValid()
    {
        return true;
    }

    protected final boolean isFieldSet(com.google.android.gms.common.server.response.ewerEntity ewerentity)
    {
        return mIndicatorSet.contains(Integer.valueOf(ewerentity.ableFieldId()));
    }

    protected final void setBooleanInternal(com.google.android.gms.common.server.response.ewerEntity ewerentity, String s, boolean flag)
    {
        int i = ewerentity.ableFieldId();
        switch (i)
        {
        default:
            throw new IllegalArgumentException((new StringBuilder("Field with id=")).append(i).append(" is not known to be a boolean.").toString());

        case 3: // '\003'
            mIsPlusOned = flag;
            break;
        }
        mIndicatorSet.add(Integer.valueOf(i));
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        CommentEntity_StatusForViewerEntityCreator.writeToParcel$7d5dae8c(this, parcel);
    }

    static 
    {
        HashMap hashmap = new HashMap();
        sFields = hashmap;
        hashmap.put("isPlusOned", com.google.android.gms.common.server.response.ewerEntity.sFields("isPlusOned", 3));
    }

    public reator()
    {
        mVersionCode = 1;
        mIndicatorSet = new HashSet();
    }

    mIndicatorSet(Set set, int i, boolean flag)
    {
        mIndicatorSet = set;
        mVersionCode = i;
        mIsPlusOned = flag;
    }
}
