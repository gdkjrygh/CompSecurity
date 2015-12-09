// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive.internal.model;

import android.os.Parcel;
import com.google.android.gms.common.server.response.FastSafeParcelableJsonResponse;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.google.android.gms.drive.internal.model:
//            AboutCreator, About_MaxUploadSizesCreator

public final class About extends FastSafeParcelableJsonResponse
{
    public static final class MaxUploadSizes extends FastSafeParcelableJsonResponse
    {

        public static final About_MaxUploadSizesCreator CREATOR = new About_MaxUploadSizesCreator();
        private static final HashMap sFields;
        final Set mIndicatorSet;
        long mSize;
        String mType;
        final int mVersionCode;

        public final int describeContents()
        {
            return 0;
        }

        public final boolean equals(Object obj)
        {
            if (obj instanceof MaxUploadSizes) goto _L2; else goto _L1
_L1:
            return false;
_L2:
            Iterator iterator;
            if (this == obj)
            {
                return true;
            }
            obj = (MaxUploadSizes)obj;
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
            if (!((MaxUploadSizes) (obj)).isFieldSet(field)) goto _L1; else goto _L3
_L3:
            if (getFieldValue(field).equals(((MaxUploadSizes) (obj)).getFieldValue(field))) goto _L5; else goto _L4
_L4:
            return false;
            if (!((MaxUploadSizes) (obj)).isFieldSet(field)) goto _L5; else goto _L6
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
                return Long.valueOf(mSize);

            case 3: // '\003'
                return mType;
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

        protected final boolean isFieldSet(com.google.android.gms.common.server.response.FastJsonResponse.Field field)
        {
            return mIndicatorSet.contains(Integer.valueOf(field.getSafeParcelableFieldId()));
        }

        protected final void setLongInternal(com.google.android.gms.common.server.response.FastJsonResponse.Field field, String s, long l)
        {
            int i = field.getSafeParcelableFieldId();
            switch (i)
            {
            default:
                throw new IllegalArgumentException((new StringBuilder("Field with id=")).append(i).append(" is not known to be a long.").toString());

            case 2: // '\002'
                mSize = l;
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

            case 3: // '\003'
                mType = s1;
                break;
            }
            mIndicatorSet.add(Integer.valueOf(i));
        }

        public final void writeToParcel(Parcel parcel, int i)
        {
            About_MaxUploadSizesCreator.writeToParcel$29bc3553(this, parcel);
        }

        static 
        {
            HashMap hashmap = new HashMap();
            sFields = hashmap;
            hashmap.put("size", com.google.android.gms.common.server.response.FastJsonResponse.Field.forLong("size", 2));
            sFields.put("type", com.google.android.gms.common.server.response.FastJsonResponse.Field.forString("type", 3));
        }

        public MaxUploadSizes()
        {
            mVersionCode = 1;
            mIndicatorSet = new HashSet();
        }

        MaxUploadSizes(Set set, int i, long l, String s)
        {
            mIndicatorSet = set;
            mVersionCode = i;
            mSize = l;
            mType = s;
        }
    }


    public static final AboutCreator CREATOR = new AboutCreator();
    private static final HashMap sFields;
    List mFolderColorPalette;
    final Set mIndicatorSet;
    long mLargestChangeId;
    List mMaxUploadSizes;
    long mRemainingChangeIds;
    final int mVersionCode;

    public About()
    {
        mVersionCode = 1;
        mIndicatorSet = new HashSet();
    }

    About(Set set, int i, List list, long l, List list1, long l1)
    {
        mIndicatorSet = set;
        mVersionCode = i;
        mFolderColorPalette = list;
        mLargestChangeId = l;
        mMaxUploadSizes = list1;
        mRemainingChangeIds = l1;
    }

    public final void addConcreteTypeArrayInternal(com.google.android.gms.common.server.response.FastJsonResponse.Field field, String s, ArrayList arraylist)
    {
        int i = field.getSafeParcelableFieldId();
        switch (i)
        {
        default:
            throw new IllegalArgumentException((new StringBuilder("Field with id=")).append(i).append(" is not a known array of custom type.  Found ").append(arraylist.getClass().getCanonicalName()).append(".").toString());

        case 14: // '\016'
            mMaxUploadSizes = arraylist;
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
        if (obj instanceof About) goto _L2; else goto _L1
_L1:
        return false;
_L2:
        Iterator iterator;
        if (this == obj)
        {
            return true;
        }
        obj = (About)obj;
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
        if (!((About) (obj)).isFieldSet(field)) goto _L1; else goto _L3
_L3:
        if (getFieldValue(field).equals(((About) (obj)).getFieldValue(field))) goto _L5; else goto _L4
_L4:
        return false;
        if (!((About) (obj)).isFieldSet(field)) goto _L5; else goto _L6
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

        case 8: // '\b'
            return mFolderColorPalette;

        case 13: // '\r'
            return Long.valueOf(mLargestChangeId);

        case 14: // '\016'
            return mMaxUploadSizes;

        case 24: // '\030'
            return Long.valueOf(mRemainingChangeIds);
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

    protected final boolean isFieldSet(com.google.android.gms.common.server.response.FastJsonResponse.Field field)
    {
        return mIndicatorSet.contains(Integer.valueOf(field.getSafeParcelableFieldId()));
    }

    protected final void setLongInternal(com.google.android.gms.common.server.response.FastJsonResponse.Field field, String s, long l)
    {
        int i = field.getSafeParcelableFieldId();
        i;
        JVM INSTR lookupswitch 2: default 36
    //                   13: 66
    //                   24: 87;
           goto _L1 _L2 _L3
_L1:
        throw new IllegalArgumentException((new StringBuilder("Field with id=")).append(i).append(" is not known to be a long.").toString());
_L2:
        mLargestChangeId = l;
_L5:
        mIndicatorSet.add(Integer.valueOf(i));
        return;
_L3:
        mRemainingChangeIds = l;
        if (true) goto _L5; else goto _L4
_L4:
    }

    protected final void setStringsInternal(com.google.android.gms.common.server.response.FastJsonResponse.Field field, String s, ArrayList arraylist)
    {
        int i = field.getSafeParcelableFieldId();
        switch (i)
        {
        default:
            throw new IllegalArgumentException((new StringBuilder("Field with id=")).append(i).append(" is not known to be an array of String.").toString());

        case 8: // '\b'
            mFolderColorPalette = arraylist;
            break;
        }
        mIndicatorSet.add(Integer.valueOf(i));
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        AboutCreator.writeToParcel$10935f22(this, parcel);
    }

    static 
    {
        HashMap hashmap = new HashMap();
        sFields = hashmap;
        hashmap.put("folderColorPalette", com.google.android.gms.common.server.response.FastJsonResponse.Field.forStrings("folderColorPalette", 8));
        sFields.put("largestChangeId", com.google.android.gms.common.server.response.FastJsonResponse.Field.forLong("largestChangeId", 13));
        sFields.put("maxUploadSizes", com.google.android.gms.common.server.response.FastJsonResponse.Field.forConcreteTypeArray("maxUploadSizes", 14, com/google/android/gms/drive/internal/model/About$MaxUploadSizes));
        sFields.put("remainingChangeIds", com.google.android.gms.common.server.response.FastJsonResponse.Field.forLong("remainingChangeIds", 24));
    }
}
