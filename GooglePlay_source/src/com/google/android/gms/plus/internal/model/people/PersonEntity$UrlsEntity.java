// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.plus.internal.model.people;

import android.os.Parcel;
import com.google.android.gms.common.server.converter.StringToIntConverter;
import com.google.android.gms.common.server.response.FastSafeParcelableJsonResponse;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.google.android.gms.plus.internal.model.people:
//            PersonEntity, PersonEntity_UrlsEntityCreator

public static final class mValue extends FastSafeParcelableJsonResponse
    implements com.google.android.gms.plus.model.people.sonResponse
{

    public static final PersonEntity_UrlsEntityCreator CREATOR = new PersonEntity_UrlsEntityCreator();
    private static final HashMap sFields;
    final Set mIndicatorSet;
    String mLabel;
    int mType;
    private final int mType_DEPRECATED_FENACHO;
    String mValue;
    final int mVersionCode;

    public static int getType_DEPRECATED_FENACHO()
    {
        return 4;
    }

    public final int describeContents()
    {
        return 0;
    }

    public final boolean equals(Object obj)
    {
        if (obj instanceof se) goto _L2; else goto _L1
_L1:
        return false;
_L2:
        Iterator iterator;
        if (this == obj)
        {
            return true;
        }
        obj = (se)obj;
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
        switch (ity.etSafeParcelableFieldId())
        {
        default:
            throw new IllegalStateException((new StringBuilder("Unknown safe parcelable id=")).append(ity.etSafeParcelableFieldId()).toString());

        case 5: // '\005'
            return mLabel;

        case 6: // '\006'
            return Integer.valueOf(mType);

        case 4: // '\004'
            return mValue;
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
                i = ity.etSafeParcelableFieldId() + i + getFieldValue(ity).hashCode();
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
        return mIndicatorSet.contains(Integer.valueOf(ity.etSafeParcelableFieldId()));
    }

    protected final void setIntegerInternal(com.google.android.gms.common.server.response.ity ity, String s, int i)
    {
        int j = ity.etSafeParcelableFieldId();
        switch (j)
        {
        default:
            throw new IllegalArgumentException((new StringBuilder("Field with id=")).append(j).append(" is not known to be an int.").toString());

        case 6: // '\006'
            mType = i;
            break;
        }
        mIndicatorSet.add(Integer.valueOf(j));
    }

    protected final void setStringInternal(com.google.android.gms.common.server.response.ity ity, String s, String s1)
    {
        int i = ity.etSafeParcelableFieldId();
        i;
        JVM INSTR tableswitch 4 5: default 32
    //                   4 83
    //                   5 62;
           goto _L1 _L2 _L3
_L1:
        throw new IllegalArgumentException((new StringBuilder("Field with id=")).append(i).append(" is not known to be a String.").toString());
_L3:
        mLabel = s1;
_L5:
        mIndicatorSet.add(Integer.valueOf(i));
        return;
_L2:
        mValue = s1;
        if (true) goto _L5; else goto _L4
_L4:
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        PersonEntity_UrlsEntityCreator.writeToParcel$b21cc82(this, parcel);
    }

    static 
    {
        HashMap hashmap = new HashMap();
        sFields = hashmap;
        hashmap.put("label", com.google.android.gms.common.server.response.orString("label", 5));
        sFields.put("type", com.google.android.gms.common.server.response.ithConverter("type", 6, (new StringToIntConverter()).add("home", 0).add("work", 1).add("blog", 2).add("profile", 3).add("other", 4).add("otherProfile", 5).add("contributor", 6).add("website", 7), false));
        sFields.put("value", com.google.android.gms.common.server.response.orString("value", 4));
    }

    public reator()
    {
        mType_DEPRECATED_FENACHO = 4;
        mVersionCode = 1;
        mIndicatorSet = new HashSet();
    }

    mIndicatorSet(Set set, int i, String s, int j, String s1)
    {
        mType_DEPRECATED_FENACHO = 4;
        mIndicatorSet = set;
        mVersionCode = i;
        mLabel = s;
        mType = j;
        mValue = s1;
    }
}
