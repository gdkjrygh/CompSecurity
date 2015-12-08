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
//            CommentEntity, CommentEntity_ActorEntityCreator

public static final class mDisplayName extends FastSafeParcelableJsonResponse
    implements mDisplayName
{

    public static final CommentEntity_ActorEntityCreator CREATOR = new CommentEntity_ActorEntityCreator();
    private static final HashMap sFields;
    String mDisplayName;
    final Set mIndicatorSet;
    final int mVersionCode;

    public final int describeContents()
    {
        return 0;
    }

    public final boolean equals(Object obj)
    {
        if (obj instanceof mDisplayName) goto _L2; else goto _L1
_L1:
        return false;
_L2:
        Iterator iterator;
        if (this == obj)
        {
            return true;
        }
        obj = (mDisplayName)obj;
        iterator = sFields.values().iterator();
_L5:
        com.google.android.gms.common.server.response.ctorEntity ctorentity;
        if (!iterator.hasNext())
        {
            break MISSING_BLOCK_LABEL_96;
        }
        ctorentity = (com.google.android.gms.common.server.response.ctorEntity.sFields)iterator.next();
        if (!isFieldSet(ctorentity))
        {
            continue; /* Loop/switch isn't completed */
        }
        if (!((isFieldSet) (obj)).isFieldSet(ctorentity)) goto _L1; else goto _L3
_L3:
        if (getFieldValue(ctorentity).equals(((getFieldValue) (obj)).getFieldValue(ctorentity))) goto _L5; else goto _L4
_L4:
        return false;
        if (!((getFieldValue) (obj)).isFieldSet(ctorentity)) goto _L5; else goto _L6
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

    protected final Object getFieldValue(com.google.android.gms.common.server.response.ctorEntity ctorentity)
    {
        switch (ctorentity.SafeParcelableFieldId())
        {
        default:
            throw new IllegalStateException((new StringBuilder("Unknown safe parcelable id=")).append(ctorentity.SafeParcelableFieldId()).toString());

        case 2: // '\002'
            return mDisplayName;
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
            com.google.android.gms.common.server.response.ctorEntity ctorentity = (com.google.android.gms.common.server.response.ctorEntity.sFields)iterator.next();
            if (isFieldSet(ctorentity))
            {
                i = ctorentity.SafeParcelableFieldId() + i + getFieldValue(ctorentity).hashCode();
            }
        } while (true);
        return i;
    }

    public final boolean isDataValid()
    {
        return true;
    }

    protected final boolean isFieldSet(com.google.android.gms.common.server.response.ctorEntity ctorentity)
    {
        return mIndicatorSet.contains(Integer.valueOf(ctorentity.SafeParcelableFieldId()));
    }

    protected final void setStringInternal(com.google.android.gms.common.server.response.ctorEntity ctorentity, String s, String s1)
    {
        int i = ctorentity.SafeParcelableFieldId();
        switch (i)
        {
        default:
            throw new IllegalArgumentException((new StringBuilder("Field with id=")).append(i).append(" is not known to be a String.").toString());

        case 2: // '\002'
            mDisplayName = s1;
            break;
        }
        mIndicatorSet.add(Integer.valueOf(i));
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        CommentEntity_ActorEntityCreator.writeToParcel$10d47100(this, parcel);
    }

    static 
    {
        HashMap hashmap = new HashMap();
        sFields = hashmap;
        hashmap.put("displayName", com.google.android.gms.common.server.response.String("displayName", 2));
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
        mDisplayName = s;
    }
}
