// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.plus.internal.model.people;

import android.os.Parcel;
import com.google.android.gms.common.server.response.FastSafeParcelableJsonResponse;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.google.android.gms.plus.internal.model.people:
//            PersonEntity, PersonEntity_CoverEntity_CoverPhotoEntityCreator

public static final class mWidth extends FastSafeParcelableJsonResponse
    implements com.google.android.gms.plus.model.people.toEntity
{

    public static final PersonEntity_CoverEntity_CoverPhotoEntityCreator CREATOR = new PersonEntity_CoverEntity_CoverPhotoEntityCreator();
    private static final HashMap sFields;
    int mHeight;
    final Set mIndicatorSet;
    String mUrl;
    final int mVersionCode;
    int mWidth;

    public final int describeContents()
    {
        return 0;
    }

    public final boolean equals(Object obj)
    {
        if (obj instanceof mWidth) goto _L2; else goto _L1
_L1:
        return false;
_L2:
        Iterator iterator;
        if (this == obj)
        {
            return true;
        }
        obj = (mWidth)obj;
        iterator = sFields.values().iterator();
_L5:
        com.google.android.gms.common.server.response.ity ity;
        if (!iterator.hasNext())
        {
            break MISSING_BLOCK_LABEL_96;
        }
        ity = (com.google.android.gms.common.server.response.ity.sFields)iterator.next();
        if (!isFieldSet(ity))
        {
            continue; /* Loop/switch isn't completed */
        }
        if (!((isFieldSet) (obj)).isFieldSet(ity)) goto _L1; else goto _L3
_L3:
        if (getFieldValue(ity).equals(((getFieldValue) (obj)).getFieldValue(ity))) goto _L5; else goto _L4
_L4:
        return false;
        if (!((getFieldValue) (obj)).isFieldSet(ity)) goto _L5; else goto _L6
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

    protected final Object getFieldValue(com.google.android.gms.common.server.response.ity ity)
    {
        switch (ity.eldId())
        {
        default:
            throw new IllegalStateException((new StringBuilder("Unknown safe parcelable id=")).append(ity.eldId()).toString());

        case 2: // '\002'
            return Integer.valueOf(mHeight);

        case 3: // '\003'
            return mUrl;

        case 4: // '\004'
            return Integer.valueOf(mWidth);
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
            com.google.android.gms.common.server.response.ity ity = (com.google.android.gms.common.server.response.ity.sFields)iterator.next();
            if (isFieldSet(ity))
            {
                i = ity.eldId() + i + getFieldValue(ity).hashCode();
            }
        } while (true);
        return i;
    }

    public final boolean isDataValid()
    {
        return true;
    }

    protected final boolean isFieldSet(com.google.android.gms.common.server.response.ity ity)
    {
        return mIndicatorSet.contains(Integer.valueOf(ity.eldId()));
    }

    protected final void setIntegerInternal(com.google.android.gms.common.server.response.ity ity, String s, int i)
    {
        int j = ity.eldId();
        j;
        JVM INSTR tableswitch 2 4: default 36
    //                   2 66
    //                   3 36
    //                   4 87;
           goto _L1 _L2 _L1 _L3
_L1:
        throw new IllegalArgumentException((new StringBuilder("Field with id=")).append(j).append(" is not known to be an int.").toString());
_L2:
        mHeight = i;
_L5:
        mIndicatorSet.add(Integer.valueOf(j));
        return;
_L3:
        mWidth = i;
        if (true) goto _L5; else goto _L4
_L4:
    }

    protected final void setStringInternal(com.google.android.gms.common.server.response.ity ity, String s, String s1)
    {
        int i = ity.eldId();
        switch (i)
        {
        default:
            throw new IllegalArgumentException((new StringBuilder("Field with id=")).append(i).append(" is not known to be a String.").toString());

        case 3: // '\003'
            mUrl = s1;
            break;
        }
        mIndicatorSet.add(Integer.valueOf(i));
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        PersonEntity_CoverEntity_CoverPhotoEntityCreator.writeToParcel$342dbb01(this, parcel);
    }

    static 
    {
        HashMap hashmap = new HashMap();
        sFields = hashmap;
        hashmap.put("height", com.google.android.gms.common.server.response.ity.sFields("height", 2));
        sFields.put("url", com.google.android.gms.common.server.response.ity.sFields("url", 3));
        sFields.put("width", com.google.android.gms.common.server.response.ity.sFields("width", 4));
    }

    public reator()
    {
        mVersionCode = 1;
        mIndicatorSet = new HashSet();
    }

    mIndicatorSet(Set set, int i, int j, String s, int k)
    {
        mIndicatorSet = set;
        mVersionCode = i;
        mHeight = j;
        mUrl = s;
        mWidth = k;
    }
}
