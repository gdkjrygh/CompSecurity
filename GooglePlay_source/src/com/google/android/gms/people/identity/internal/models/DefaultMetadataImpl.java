// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.people.identity.internal.models;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.server.response.FastJsonResponse;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.google.android.gms.people.identity.internal.models:
//            DefaultMetadataImplCreator, DefaultMetadataImpl_AffinitiesCreator

public final class DefaultMetadataImpl extends FastJsonResponse
    implements SafeParcelable
{
    public static final class Affinities extends FastJsonResponse
        implements SafeParcelable
    {

        public static final DefaultMetadataImpl_AffinitiesCreator CREATOR = new DefaultMetadataImpl_AffinitiesCreator();
        private static final HashMap sFields;
        final Set mIndicatorSet;
        String mType;
        double mValue;
        final int mVersionCode;

        public final int describeContents()
        {
            return 0;
        }

        public final boolean equals(Object obj)
        {
            if (obj instanceof Affinities) goto _L2; else goto _L1
_L1:
            return false;
_L2:
            Iterator iterator;
            if (this == obj)
            {
                return true;
            }
            obj = (Affinities)obj;
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
            if (!((Affinities) (obj)).isFieldSet(field)) goto _L1; else goto _L3
_L3:
            if (getFieldValue(field).equals(((Affinities) (obj)).getFieldValue(field))) goto _L5; else goto _L4
_L4:
            return false;
            if (!((Affinities) (obj)).isFieldSet(field)) goto _L5; else goto _L6
_L6:
            return false;
            return true;
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
                return mType;

            case 3: // '\003'
                return Double.valueOf(mValue);
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
                com.google.android.gms.common.server.response.FastJsonResponse.Field field = (com.google.android.gms.common.server.response.FastJsonResponse.Field)iterator.next();
                if (isFieldSet(field))
                {
                    i = field.getSafeParcelableFieldId() + i + getFieldValue(field).hashCode();
                }
            } while (true);
            return i;
        }

        protected final boolean isFieldSet(com.google.android.gms.common.server.response.FastJsonResponse.Field field)
        {
            return mIndicatorSet.contains(Integer.valueOf(field.getSafeParcelableFieldId()));
        }

        protected final boolean isPrimitiveFieldSet(String s)
        {
            return false;
        }

        protected final void setDoubleInternal(com.google.android.gms.common.server.response.FastJsonResponse.Field field, String s, double d)
        {
            int i = field.getSafeParcelableFieldId();
            switch (i)
            {
            default:
                throw new IllegalArgumentException((new StringBuilder("Field with id=")).append(i).append(" is not known to be a double.").toString());

            case 3: // '\003'
                mValue = d;
                break;
            }
            mIndicatorSet.add(Integer.valueOf(i));
        }

        protected final void setStringInternal(com.google.android.gms.common.server.response.FastJsonResponse.Field field, String s, String s1)
        {
            int i = field.getSafeParcelableFieldId();
            switch (i)
            {
            default:
                throw new IllegalArgumentException((new StringBuilder("Field with id=")).append(i).append(" is not known to be a String.").toString());

            case 2: // '\002'
                mType = s1;
                break;
            }
            mIndicatorSet.add(Integer.valueOf(i));
        }

        public final void writeToParcel(Parcel parcel, int i)
        {
            DefaultMetadataImpl_AffinitiesCreator.writeToParcel$3d3518ba(this, parcel);
        }

        static 
        {
            HashMap hashmap = new HashMap();
            sFields = hashmap;
            hashmap.put("type", com.google.android.gms.common.server.response.FastJsonResponse.Field.forString("type", 2));
            sFields.put("value", com.google.android.gms.common.server.response.FastJsonResponse.Field.forDouble("value", 3));
        }

        public Affinities()
        {
            mVersionCode = 1;
            mIndicatorSet = new HashSet();
        }

        Affinities(Set set, int i, String s, double d)
        {
            mIndicatorSet = set;
            mVersionCode = i;
            mType = s;
            mValue = d;
        }
    }


    public static final DefaultMetadataImplCreator CREATOR = new DefaultMetadataImplCreator();
    private static final HashMap sFields;
    List mAffinities;
    String mContainer;
    String mContainerContactId;
    String mContainerId;
    boolean mEdgeKey;
    final Set mIndicatorSet;
    boolean mPrimary;
    boolean mVerified;
    final int mVersionCode;
    String mVisibility;
    boolean mWriteable;

    public DefaultMetadataImpl()
    {
        mVersionCode = 1;
        mIndicatorSet = new HashSet();
    }

    DefaultMetadataImpl(Set set, int i, List list, String s, String s1, String s2, boolean flag, 
            boolean flag1, boolean flag2, String s3, boolean flag3)
    {
        mIndicatorSet = set;
        mVersionCode = i;
        mAffinities = list;
        mContainer = s;
        mContainerContactId = s1;
        mContainerId = s2;
        mEdgeKey = flag;
        mPrimary = flag1;
        mVerified = flag2;
        mVisibility = s3;
        mWriteable = flag3;
    }

    public final void addConcreteTypeArrayInternal(com.google.android.gms.common.server.response.FastJsonResponse.Field field, String s, ArrayList arraylist)
    {
        int i = field.getSafeParcelableFieldId();
        switch (i)
        {
        default:
            throw new IllegalArgumentException((new StringBuilder("Field with id=")).append(i).append(" is not a known array of custom type.  Found ").append(arraylist.getClass().getCanonicalName()).append(".").toString());

        case 2: // '\002'
            mAffinities = arraylist;
            break;
        }
        mIndicatorSet.add(Integer.valueOf(i));
    }

    public final int describeContents()
    {
        return 0;
    }

    public final boolean equals(Object obj)
    {
        if (obj instanceof DefaultMetadataImpl) goto _L2; else goto _L1
_L1:
        return false;
_L2:
        Iterator iterator;
        if (this == obj)
        {
            return true;
        }
        obj = (DefaultMetadataImpl)obj;
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
        if (!((DefaultMetadataImpl) (obj)).isFieldSet(field)) goto _L1; else goto _L3
_L3:
        if (getFieldValue(field).equals(((DefaultMetadataImpl) (obj)).getFieldValue(field))) goto _L5; else goto _L4
_L4:
        return false;
        if (!((DefaultMetadataImpl) (obj)).isFieldSet(field)) goto _L5; else goto _L6
_L6:
        return false;
        return true;
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
            return mAffinities;

        case 3: // '\003'
            return mContainer;

        case 4: // '\004'
            return mContainerContactId;

        case 5: // '\005'
            return mContainerId;

        case 6: // '\006'
            return Boolean.valueOf(mEdgeKey);

        case 7: // '\007'
            return Boolean.valueOf(mPrimary);

        case 8: // '\b'
            return Boolean.valueOf(mVerified);

        case 9: // '\t'
            return mVisibility;

        case 10: // '\n'
            return Boolean.valueOf(mWriteable);
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
            com.google.android.gms.common.server.response.FastJsonResponse.Field field = (com.google.android.gms.common.server.response.FastJsonResponse.Field)iterator.next();
            if (isFieldSet(field))
            {
                i = field.getSafeParcelableFieldId() + i + getFieldValue(field).hashCode();
            }
        } while (true);
        return i;
    }

    protected final boolean isFieldSet(com.google.android.gms.common.server.response.FastJsonResponse.Field field)
    {
        return mIndicatorSet.contains(Integer.valueOf(field.getSafeParcelableFieldId()));
    }

    protected final boolean isPrimitiveFieldSet(String s)
    {
        return false;
    }

    protected final void setBooleanInternal(com.google.android.gms.common.server.response.FastJsonResponse.Field field, String s, boolean flag)
    {
        int i = field.getSafeParcelableFieldId();
        i;
        JVM INSTR tableswitch 6 10: default 44
    //                   6 74
    //                   7 95
    //                   8 103
    //                   9 44
    //                   10 111;
           goto _L1 _L2 _L3 _L4 _L1 _L5
_L1:
        throw new IllegalArgumentException((new StringBuilder("Field with id=")).append(i).append(" is not known to be a boolean.").toString());
_L2:
        mEdgeKey = flag;
_L7:
        mIndicatorSet.add(Integer.valueOf(i));
        return;
_L3:
        mPrimary = flag;
        continue; /* Loop/switch isn't completed */
_L4:
        mVerified = flag;
        continue; /* Loop/switch isn't completed */
_L5:
        mWriteable = flag;
        if (true) goto _L7; else goto _L6
_L6:
    }

    protected final void setStringInternal(com.google.android.gms.common.server.response.FastJsonResponse.Field field, String s, String s1)
    {
        int i = field.getSafeParcelableFieldId();
        i;
        JVM INSTR tableswitch 3 9: default 52
    //                   3 82
    //                   4 103
    //                   5 111
    //                   6 52
    //                   7 52
    //                   8 52
    //                   9 119;
           goto _L1 _L2 _L3 _L4 _L1 _L1 _L1 _L5
_L1:
        throw new IllegalArgumentException((new StringBuilder("Field with id=")).append(i).append(" is not known to be a String.").toString());
_L2:
        mContainer = s1;
_L7:
        mIndicatorSet.add(Integer.valueOf(i));
        return;
_L3:
        mContainerContactId = s1;
        continue; /* Loop/switch isn't completed */
_L4:
        mContainerId = s1;
        continue; /* Loop/switch isn't completed */
_L5:
        mVisibility = s1;
        if (true) goto _L7; else goto _L6
_L6:
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        DefaultMetadataImplCreator.writeToParcel$559d2448(this, parcel);
    }

    static 
    {
        HashMap hashmap = new HashMap();
        sFields = hashmap;
        hashmap.put("affinities", com.google.android.gms.common.server.response.FastJsonResponse.Field.forConcreteTypeArray("affinities", 2, com/google/android/gms/people/identity/internal/models/DefaultMetadataImpl$Affinities));
        sFields.put("container", com.google.android.gms.common.server.response.FastJsonResponse.Field.forString("container", 3));
        sFields.put("containerContactId", com.google.android.gms.common.server.response.FastJsonResponse.Field.forString("containerContactId", 4));
        sFields.put("containerId", com.google.android.gms.common.server.response.FastJsonResponse.Field.forString("containerId", 5));
        sFields.put("edgeKey", com.google.android.gms.common.server.response.FastJsonResponse.Field.forBoolean("edgeKey", 6));
        sFields.put("primary", com.google.android.gms.common.server.response.FastJsonResponse.Field.forBoolean("primary", 7));
        sFields.put("verified", com.google.android.gms.common.server.response.FastJsonResponse.Field.forBoolean("verified", 8));
        sFields.put("visibility", com.google.android.gms.common.server.response.FastJsonResponse.Field.forString("visibility", 9));
        sFields.put("writeable", com.google.android.gms.common.server.response.FastJsonResponse.Field.forBoolean("writeable", 10));
    }
}
