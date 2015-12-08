// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.people.identity.internal.models;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.server.response.FastJsonResponse;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.google.android.gms.people.identity.internal.models:
//            DefaultPersonImpl, DefaultPersonImpl_CoverPhotosCreator

public static final class mWidth extends FastJsonResponse
    implements SafeParcelable
{

    public static final DefaultPersonImpl_CoverPhotosCreator CREATOR = new DefaultPersonImpl_CoverPhotosCreator();
    private static final HashMap sFields;
    int mHeight;
    String mId;
    final Set mIndicatorSet;
    boolean mIsDefault;
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
        com.google.android.gms.common.server.response.erPhotos erphotos;
        if (!iterator.hasNext())
        {
            break MISSING_BLOCK_LABEL_96;
        }
        erphotos = (com.google.android.gms.common.server.response.erPhotos.sFields)iterator.next();
        if (!isFieldSet(erphotos))
        {
            continue; /* Loop/switch isn't completed */
        }
        if (!((isFieldSet) (obj)).isFieldSet(erphotos)) goto _L1; else goto _L3
_L3:
        if (getFieldValue(erphotos).equals(((getFieldValue) (obj)).getFieldValue(erphotos))) goto _L5; else goto _L4
_L4:
        return false;
        if (!((getFieldValue) (obj)).isFieldSet(erphotos)) goto _L5; else goto _L6
_L6:
        return false;
        return true;
    }

    public final volatile Map getFieldMappings()
    {
        return sFields;
    }

    protected final Object getFieldValue(com.google.android.gms.common.server.response.erPhotos erphotos)
    {
        switch (erphotos.ParcelableFieldId())
        {
        default:
            throw new IllegalStateException((new StringBuilder("Unknown safe parcelable id=")).append(erphotos.ParcelableFieldId()).toString());

        case 2: // '\002'
            return Integer.valueOf(mHeight);

        case 3: // '\003'
            return mId;

        case 4: // '\004'
            return Boolean.valueOf(mIsDefault);

        case 5: // '\005'
            return mUrl;

        case 6: // '\006'
            return Integer.valueOf(mWidth);
        }
    }

    protected final Object getValueObject(String s)
    {
        return null;
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
            com.google.android.gms.common.server.response.erPhotos erphotos = (com.google.android.gms.common.server.response.erPhotos.sFields)iterator.next();
            if (isFieldSet(erphotos))
            {
                i = erphotos.ParcelableFieldId() + i + getFieldValue(erphotos).hashCode();
            }
        } while (true);
        return i;
    }

    protected final boolean isFieldSet(com.google.android.gms.common.server.response.erPhotos erphotos)
    {
        return mIndicatorSet.contains(Integer.valueOf(erphotos.ParcelableFieldId()));
    }

    protected final boolean isPrimitiveFieldSet(String s)
    {
        return false;
    }

    protected final void setBooleanInternal(com.google.android.gms.common.server.response.erPhotos erphotos, String s, boolean flag)
    {
        int i = erphotos.ParcelableFieldId();
        switch (i)
        {
        default:
            throw new IllegalArgumentException((new StringBuilder("Field with id=")).append(i).append(" is not known to be a boolean.").toString());

        case 4: // '\004'
            mIsDefault = flag;
            break;
        }
        mIndicatorSet.add(Integer.valueOf(i));
    }

    protected final void setIntegerInternal(com.google.android.gms.common.server.response.erPhotos erphotos, String s, int i)
    {
        int j = erphotos.ParcelableFieldId();
        j;
        JVM INSTR lookupswitch 2: default 36
    //                   2: 66
    //                   6: 87;
           goto _L1 _L2 _L3
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

    protected final void setStringInternal(com.google.android.gms.common.server.response.erPhotos erphotos, String s, String s1)
    {
        int i = erphotos.ParcelableFieldId();
        i;
        JVM INSTR tableswitch 3 5: default 36
    //                   3 66
    //                   4 36
    //                   5 87;
           goto _L1 _L2 _L1 _L3
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
        DefaultPersonImpl_CoverPhotosCreator.writeToParcel$2ce9a6c2(this, parcel);
    }

    static 
    {
        HashMap hashmap = new HashMap();
        sFields = hashmap;
        hashmap.put("height", com.google.android.gms.common.server.response.ger("height", 2));
        sFields.put("id", com.google.android.gms.common.server.response.ng("id", 3));
        sFields.put("isDefault", com.google.android.gms.common.server.response.ean("isDefault", 4));
        sFields.put("url", com.google.android.gms.common.server.response.ng("url", 5));
        sFields.put("width", com.google.android.gms.common.server.response.ger("width", 6));
    }

    public reator()
    {
        mVersionCode = 1;
        mIndicatorSet = new HashSet();
    }

    mIndicatorSet(Set set, int i, int j, String s, boolean flag, String s1, int k)
    {
        mIndicatorSet = set;
        mVersionCode = i;
        mHeight = j;
        mId = s;
        mIsDefault = flag;
        mUrl = s1;
        mWidth = k;
    }
}
