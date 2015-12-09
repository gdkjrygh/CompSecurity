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
//            OzDeviceInfo, OzDeviceInfoEntityCreator

public final class OzDeviceInfoEntity extends FastSafeParcelableJsonResponse
    implements OzDeviceInfo
{

    public static final OzDeviceInfoEntityCreator CREATOR = new OzDeviceInfoEntityCreator();
    private static final HashMap sFields;
    int mDensityDpi;
    boolean mFeatureLandscape;
    boolean mFeaturePortrait;
    String mFingerprint;
    final Set mIndicatorSet;
    String mManufacturer;
    String mOrientation;
    int mScreenHeightDp;
    int mScreenWidthDp;
    final int mVersionCode;

    public OzDeviceInfoEntity()
    {
        mVersionCode = 1;
        mIndicatorSet = new HashSet();
    }

    OzDeviceInfoEntity(Set set, int i, int j, boolean flag, boolean flag1, String s, String s1, 
            String s2, int k, int l)
    {
        mIndicatorSet = set;
        mVersionCode = i;
        mDensityDpi = j;
        mFeatureLandscape = flag;
        mFeaturePortrait = flag1;
        mFingerprint = s;
        mManufacturer = s1;
        mOrientation = s2;
        mScreenHeightDp = k;
        mScreenWidthDp = l;
    }

    public final int describeContents()
    {
        return 0;
    }

    public final boolean equals(Object obj)
    {
        if (obj instanceof OzDeviceInfoEntity) goto _L2; else goto _L1
_L1:
        return false;
_L2:
        Iterator iterator;
        if (this == obj)
        {
            return true;
        }
        obj = (OzDeviceInfoEntity)obj;
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
        if (!((OzDeviceInfoEntity) (obj)).isFieldSet(field)) goto _L1; else goto _L3
_L3:
        if (getFieldValue(field).equals(((OzDeviceInfoEntity) (obj)).getFieldValue(field))) goto _L5; else goto _L4
_L4:
        return false;
        if (!((OzDeviceInfoEntity) (obj)).isFieldSet(field)) goto _L5; else goto _L6
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

    protected final Object getFieldValue(com.google.android.gms.common.server.response.FastJsonResponse.Field field)
    {
        switch (field.getSafeParcelableFieldId())
        {
        default:
            throw new IllegalStateException((new StringBuilder("Unknown safe parcelable id=")).append(field.getSafeParcelableFieldId()).toString());

        case 2: // '\002'
            return Integer.valueOf(mDensityDpi);

        case 3: // '\003'
            return Boolean.valueOf(mFeatureLandscape);

        case 4: // '\004'
            return Boolean.valueOf(mFeaturePortrait);

        case 5: // '\005'
            return mFingerprint;

        case 6: // '\006'
            return mManufacturer;

        case 7: // '\007'
            return mOrientation;

        case 8: // '\b'
            return Integer.valueOf(mScreenHeightDp);

        case 9: // '\t'
            return Integer.valueOf(mScreenWidthDp);
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

    public final boolean isDataValid()
    {
        return true;
    }

    protected final boolean isFieldSet(com.google.android.gms.common.server.response.FastJsonResponse.Field field)
    {
        return mIndicatorSet.contains(Integer.valueOf(field.getSafeParcelableFieldId()));
    }

    protected final void setBooleanInternal(com.google.android.gms.common.server.response.FastJsonResponse.Field field, String s, boolean flag)
    {
        int i = field.getSafeParcelableFieldId();
        i;
        JVM INSTR tableswitch 3 4: default 32
    //                   3 62
    //                   4 83;
           goto _L1 _L2 _L3
_L1:
        throw new IllegalArgumentException((new StringBuilder("Field with id=")).append(i).append(" is not known to be a boolean.").toString());
_L2:
        mFeatureLandscape = flag;
_L5:
        mIndicatorSet.add(Integer.valueOf(i));
        return;
_L3:
        mFeaturePortrait = flag;
        if (true) goto _L5; else goto _L4
_L4:
    }

    protected final void setIntegerInternal(com.google.android.gms.common.server.response.FastJsonResponse.Field field, String s, int i)
    {
        int j = field.getSafeParcelableFieldId();
        j;
        JVM INSTR lookupswitch 3: default 44
    //                   2: 74
    //                   8: 95
    //                   9: 103;
           goto _L1 _L2 _L3 _L4
_L1:
        throw new IllegalArgumentException((new StringBuilder("Field with id=")).append(j).append(" is not known to be an int.").toString());
_L2:
        mDensityDpi = i;
_L6:
        mIndicatorSet.add(Integer.valueOf(j));
        return;
_L3:
        mScreenHeightDp = i;
        continue; /* Loop/switch isn't completed */
_L4:
        mScreenWidthDp = i;
        if (true) goto _L6; else goto _L5
_L5:
    }

    protected final void setStringInternal(com.google.android.gms.common.server.response.FastJsonResponse.Field field, String s, String s1)
    {
        int i = field.getSafeParcelableFieldId();
        i;
        JVM INSTR tableswitch 5 7: default 36
    //                   5 66
    //                   6 87
    //                   7 95;
           goto _L1 _L2 _L3 _L4
_L1:
        throw new IllegalArgumentException((new StringBuilder("Field with id=")).append(i).append(" is not known to be a String.").toString());
_L2:
        mFingerprint = s1;
_L6:
        mIndicatorSet.add(Integer.valueOf(i));
        return;
_L3:
        mManufacturer = s1;
        continue; /* Loop/switch isn't completed */
_L4:
        mOrientation = s1;
        if (true) goto _L6; else goto _L5
_L5:
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        OzDeviceInfoEntityCreator.writeToParcel$76fee4cc(this, parcel);
    }

    static 
    {
        HashMap hashmap = new HashMap();
        sFields = hashmap;
        hashmap.put("densityDpi", com.google.android.gms.common.server.response.FastJsonResponse.Field.forInteger("densityDpi", 2));
        sFields.put("featureLandscape", com.google.android.gms.common.server.response.FastJsonResponse.Field.forBoolean("featureLandscape", 3));
        sFields.put("featurePortrait", com.google.android.gms.common.server.response.FastJsonResponse.Field.forBoolean("featurePortrait", 4));
        sFields.put("fingerprint", com.google.android.gms.common.server.response.FastJsonResponse.Field.forString("fingerprint", 5));
        sFields.put("manufacturer", com.google.android.gms.common.server.response.FastJsonResponse.Field.forString("manufacturer", 6));
        sFields.put("orientation", com.google.android.gms.common.server.response.FastJsonResponse.Field.forString("orientation", 7));
        sFields.put("screenHeightDp", com.google.android.gms.common.server.response.FastJsonResponse.Field.forInteger("screenHeightDp", 8));
        sFields.put("screenWidthDp", com.google.android.gms.common.server.response.FastJsonResponse.Field.forInteger("screenWidthDp", 9));
    }
}
