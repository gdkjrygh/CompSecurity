// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.plus.service.v1whitelisted.models;

import android.os.Parcel;
import com.google.android.gms.common.server.response.FastJsonResponse;
import com.google.android.gms.common.server.response.FastSafeParcelableJsonResponse;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.google.android.gms.plus.service.v1whitelisted.models:
//            Person, PersonEntityCreator, PersonEntity_EmailsEntityCreator, PersonEntity_ImageEntityCreator, 
//            PersonEntity_NameEntityCreator, PersonEntity_StatusForViewerEntityCreator

public final class PersonEntity extends FastSafeParcelableJsonResponse
    implements Person
{
    public static final class EmailsEntity extends FastSafeParcelableJsonResponse
        implements Person.Emails
    {

        public static final PersonEntity_EmailsEntityCreator CREATOR = new PersonEntity_EmailsEntityCreator();
        private static final HashMap sFields;
        final Set mIndicatorSet;
        String mType;
        String mValue;
        final int mVersionCode;

        public final int describeContents()
        {
            return 0;
        }

        public final boolean equals(Object obj)
        {
            if (obj instanceof EmailsEntity) goto _L2; else goto _L1
_L1:
            return false;
_L2:
            Iterator iterator;
            if (this == obj)
            {
                return true;
            }
            obj = (EmailsEntity)obj;
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
            if (!((EmailsEntity) (obj)).isFieldSet(field)) goto _L1; else goto _L3
_L3:
            if (getFieldValue(field).equals(((EmailsEntity) (obj)).getFieldValue(field))) goto _L5; else goto _L4
_L4:
            return false;
            if (!((EmailsEntity) (obj)).isFieldSet(field)) goto _L5; else goto _L6
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
                return mType;

            case 3: // '\003'
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

        protected final void setStringInternal(com.google.android.gms.common.server.response.FastJsonResponse.Field field, String s, String s1)
        {
            int i = field.getSafeParcelableFieldId();
            i;
            JVM INSTR tableswitch 2 3: default 32
        //                       2 62
        //                       3 83;
               goto _L1 _L2 _L3
_L1:
            throw new IllegalArgumentException((new StringBuilder("Field with id=")).append(i).append(" is not known to be a String.").toString());
_L2:
            mType = s1;
_L5:
            mIndicatorSet.add(Integer.valueOf(i));
            return;
_L3:
            mValue = s1;
            if (true) goto _L5; else goto _L4
_L4:
        }

        public final void writeToParcel(Parcel parcel, int i)
        {
            PersonEntity_EmailsEntityCreator.writeToParcel$7ed771d0(this, parcel);
        }

        static 
        {
            HashMap hashmap = new HashMap();
            sFields = hashmap;
            hashmap.put("type", com.google.android.gms.common.server.response.FastJsonResponse.Field.forString("type", 2));
            sFields.put("value", com.google.android.gms.common.server.response.FastJsonResponse.Field.forString("value", 3));
        }

        public EmailsEntity()
        {
            mVersionCode = 1;
            mIndicatorSet = new HashSet();
        }

        EmailsEntity(Set set, int i, String s, String s1)
        {
            mIndicatorSet = set;
            mVersionCode = i;
            mType = s;
            mValue = s1;
        }
    }

    public static final class ImageEntity extends FastSafeParcelableJsonResponse
        implements Person.Image
    {

        public static final PersonEntity_ImageEntityCreator CREATOR = new PersonEntity_ImageEntityCreator();
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
            if (obj instanceof ImageEntity) goto _L2; else goto _L1
_L1:
            return false;
_L2:
            Iterator iterator;
            if (this == obj)
            {
                return true;
            }
            obj = (ImageEntity)obj;
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
            if (!((ImageEntity) (obj)).isFieldSet(field)) goto _L1; else goto _L3
_L3:
            if (getFieldValue(field).equals(((ImageEntity) (obj)).getFieldValue(field))) goto _L5; else goto _L4
_L4:
            return false;
            if (!((ImageEntity) (obj)).isFieldSet(field)) goto _L5; else goto _L6
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
            case 3: // '\003'
            default:
                throw new IllegalStateException((new StringBuilder("Unknown safe parcelable id=")).append(field.getSafeParcelableFieldId()).toString());

            case 2: // '\002'
                return mId;

            case 4: // '\004'
                return mUrl;
            }
        }

        public final String getUrl()
        {
            return mUrl;
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

        protected final void setStringInternal(com.google.android.gms.common.server.response.FastJsonResponse.Field field, String s, String s1)
        {
            int i = field.getSafeParcelableFieldId();
            i;
            JVM INSTR tableswitch 2 4: default 36
        //                       2 66
        //                       3 36
        //                       4 87;
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
            PersonEntity_ImageEntityCreator.writeToParcel$1fd9038c(this, parcel);
        }

        static 
        {
            HashMap hashmap = new HashMap();
            sFields = hashmap;
            hashmap.put("id", com.google.android.gms.common.server.response.FastJsonResponse.Field.forString("id", 2));
            sFields.put("url", com.google.android.gms.common.server.response.FastJsonResponse.Field.forString("url", 4));
        }

        public ImageEntity()
        {
            mVersionCode = 1;
            mIndicatorSet = new HashSet();
        }

        ImageEntity(Set set, int i, String s, String s1)
        {
            mIndicatorSet = set;
            mVersionCode = i;
            mId = s;
            mUrl = s1;
        }
    }

    public static final class NameEntity extends FastSafeParcelableJsonResponse
        implements Person.Name
    {

        public static final PersonEntity_NameEntityCreator CREATOR = new PersonEntity_NameEntityCreator();
        private static final HashMap sFields = new HashMap();
        final Set mIndicatorSet;
        final int mVersionCode;

        public final int describeContents()
        {
            return 0;
        }

        public final boolean equals(Object obj)
        {
            if (obj instanceof NameEntity) goto _L2; else goto _L1
_L1:
            return false;
_L2:
            Iterator iterator;
            if (this == obj)
            {
                return true;
            }
            obj = (NameEntity)obj;
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
            if (!((NameEntity) (obj)).isFieldSet(field)) goto _L1; else goto _L3
_L3:
            if (getFieldValue(field).equals(((NameEntity) (obj)).getFieldValue(field))) goto _L5; else goto _L4
_L4:
            return false;
            if (!((NameEntity) (obj)).isFieldSet(field)) goto _L5; else goto _L6
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
            field.getSafeParcelableFieldId();
            throw new IllegalStateException((new StringBuilder("Unknown safe parcelable id=")).append(field.getSafeParcelableFieldId()).toString());
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

        public final void writeToParcel(Parcel parcel, int i)
        {
            PersonEntity_NameEntityCreator.writeToParcel$17e908e4(this, parcel);
        }


        public NameEntity()
        {
            mVersionCode = 1;
            mIndicatorSet = new HashSet();
        }

        NameEntity(Set set, int i)
        {
            mIndicatorSet = set;
            mVersionCode = i;
        }
    }

    public static final class StatusForViewerEntity extends FastSafeParcelableJsonResponse
        implements Person.StatusForViewer
    {

        public static final PersonEntity_StatusForViewerEntityCreator CREATOR = new PersonEntity_StatusForViewerEntityCreator();
        private static final HashMap sFields;
        final Set mIndicatorSet;
        boolean mIsCircled;
        final int mVersionCode;

        public final int describeContents()
        {
            return 0;
        }

        public final boolean equals(Object obj)
        {
            if (obj instanceof StatusForViewerEntity) goto _L2; else goto _L1
_L1:
            return false;
_L2:
            Iterator iterator;
            if (this == obj)
            {
                return true;
            }
            obj = (StatusForViewerEntity)obj;
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
            if (!((StatusForViewerEntity) (obj)).isFieldSet(field)) goto _L1; else goto _L3
_L3:
            if (getFieldValue(field).equals(((StatusForViewerEntity) (obj)).getFieldValue(field))) goto _L5; else goto _L4
_L4:
            return false;
            if (!((StatusForViewerEntity) (obj)).isFieldSet(field)) goto _L5; else goto _L6
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

            case 4: // '\004'
                return Boolean.valueOf(mIsCircled);
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
            switch (i)
            {
            default:
                throw new IllegalArgumentException((new StringBuilder("Field with id=")).append(i).append(" is not known to be a boolean.").toString());

            case 4: // '\004'
                mIsCircled = flag;
                break;
            }
            mIndicatorSet.add(Integer.valueOf(i));
        }

        public final void writeToParcel(Parcel parcel, int i)
        {
            PersonEntity_StatusForViewerEntityCreator.writeToParcel$3b08a0da(this, parcel);
        }

        static 
        {
            HashMap hashmap = new HashMap();
            sFields = hashmap;
            hashmap.put("isCircled", com.google.android.gms.common.server.response.FastJsonResponse.Field.forBoolean("isCircled", 4));
        }

        public StatusForViewerEntity()
        {
            mVersionCode = 1;
            mIndicatorSet = new HashSet();
        }

        StatusForViewerEntity(Set set, int i, boolean flag)
        {
            mIndicatorSet = set;
            mVersionCode = i;
            mIsCircled = flag;
        }
    }


    public static final PersonEntityCreator CREATOR = new PersonEntityCreator();
    private static final HashMap sFields;
    public String mDisplayName;
    List mEmails;
    String mEtag;
    public String mId;
    public ImageEntity mImage;
    final Set mIndicatorSet;
    NameEntity mName;
    String mObjectType;
    StatusForViewerEntity mStatusForViewer;
    String mSuggestionId;
    String mUrl;
    final int mVersionCode;

    public PersonEntity()
    {
        mVersionCode = 1;
        mIndicatorSet = new HashSet();
    }

    PersonEntity(Set set, int i, String s, List list, String s1, String s2, ImageEntity imageentity, 
            NameEntity nameentity, String s3, StatusForViewerEntity statusforviewerentity, String s4, String s5)
    {
        mIndicatorSet = set;
        mVersionCode = i;
        mDisplayName = s;
        mEmails = list;
        mEtag = s1;
        mId = s2;
        mImage = imageentity;
        mName = nameentity;
        mObjectType = s3;
        mStatusForViewer = statusforviewerentity;
        mSuggestionId = s4;
        mUrl = s5;
    }

    public final void addConcreteTypeArrayInternal(com.google.android.gms.common.server.response.FastJsonResponse.Field field, String s, ArrayList arraylist)
    {
        int i = field.getSafeParcelableFieldId();
        switch (i)
        {
        default:
            throw new IllegalArgumentException((new StringBuilder("Field with id=")).append(i).append(" is not a known array of custom type.  Found ").append(arraylist.getClass().getCanonicalName()).append(".").toString());

        case 11: // '\013'
            mEmails = arraylist;
            break;
        }
        mIndicatorSet.add(Integer.valueOf(i));
    }

    public final void addConcreteTypeInternal(com.google.android.gms.common.server.response.FastJsonResponse.Field field, String s, FastJsonResponse fastjsonresponse)
    {
        int i = field.getSafeParcelableFieldId();
        i;
        JVM INSTR lookupswitch 3: default 44
    //                   16: 89
    //                   20: 113
    //                   29: 124;
           goto _L1 _L2 _L3 _L4
_L1:
        throw new IllegalArgumentException((new StringBuilder("Field with id=")).append(i).append(" is not a known custom type.  Found ").append(fastjsonresponse.getClass().getCanonicalName()).append(".").toString());
_L2:
        mImage = (ImageEntity)fastjsonresponse;
_L6:
        mIndicatorSet.add(Integer.valueOf(i));
        return;
_L3:
        mName = (NameEntity)fastjsonresponse;
        continue; /* Loop/switch isn't completed */
_L4:
        mStatusForViewer = (StatusForViewerEntity)fastjsonresponse;
        if (true) goto _L6; else goto _L5
_L5:
    }

    public final int describeContents()
    {
        return 0;
    }

    public final boolean equals(Object obj)
    {
        if (obj instanceof PersonEntity) goto _L2; else goto _L1
_L1:
        return false;
_L2:
        Iterator iterator;
        if (this == obj)
        {
            return true;
        }
        obj = (PersonEntity)obj;
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
        if (!((PersonEntity) (obj)).isFieldSet(field)) goto _L1; else goto _L3
_L3:
        if (getFieldValue(field).equals(((PersonEntity) (obj)).getFieldValue(field))) goto _L5; else goto _L4
_L4:
        return false;
        if (!((PersonEntity) (obj)).isFieldSet(field)) goto _L5; else goto _L6
_L6:
        return false;
        return true;
    }

    public final volatile Object freeze()
    {
        return this;
    }

    public final String getDisplayName()
    {
        return mDisplayName;
    }

    public final volatile Map getFieldMappings()
    {
        return sFields;
    }

    protected final Object getFieldValue(com.google.android.gms.common.server.response.FastJsonResponse.Field field)
    {
        switch (field.getSafeParcelableFieldId())
        {
        case 10: // '\n'
        case 13: // '\r'
        case 14: // '\016'
        case 17: // '\021'
        case 18: // '\022'
        case 19: // '\023'
        case 21: // '\025'
        case 23: // '\027'
        case 24: // '\030'
        case 25: // '\031'
        case 26: // '\032'
        case 27: // '\033'
        case 28: // '\034'
        case 31: // '\037'
        default:
            throw new IllegalStateException((new StringBuilder("Unknown safe parcelable id=")).append(field.getSafeParcelableFieldId()).toString());

        case 9: // '\t'
            return mDisplayName;

        case 11: // '\013'
            return mEmails;

        case 12: // '\f'
            return mEtag;

        case 15: // '\017'
            return mId;

        case 16: // '\020'
            return mImage;

        case 20: // '\024'
            return mName;

        case 22: // '\026'
            return mObjectType;

        case 29: // '\035'
            return mStatusForViewer;

        case 30: // '\036'
            return mSuggestionId;

        case 32: // ' '
            return mUrl;
        }
    }

    public final String getId()
    {
        return mId;
    }

    public final Person.Image getImage()
    {
        return mImage;
    }

    public final String getObjectType()
    {
        return mObjectType;
    }

    public final String getSuggestionId()
    {
        return mSuggestionId;
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

    protected final void setStringInternal(com.google.android.gms.common.server.response.FastJsonResponse.Field field, String s, String s1)
    {
        int i = field.getSafeParcelableFieldId();
        i;
        JVM INSTR lookupswitch 6: default 68
    //                   9: 98
    //                   12: 119
    //                   15: 127
    //                   22: 135
    //                   30: 143
    //                   32: 151;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7
_L1:
        throw new IllegalArgumentException((new StringBuilder("Field with id=")).append(i).append(" is not known to be a String.").toString());
_L2:
        mDisplayName = s1;
_L9:
        mIndicatorSet.add(Integer.valueOf(i));
        return;
_L3:
        mEtag = s1;
        continue; /* Loop/switch isn't completed */
_L4:
        mId = s1;
        continue; /* Loop/switch isn't completed */
_L5:
        mObjectType = s1;
        continue; /* Loop/switch isn't completed */
_L6:
        mSuggestionId = s1;
        continue; /* Loop/switch isn't completed */
_L7:
        mUrl = s1;
        if (true) goto _L9; else goto _L8
_L8:
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        PersonEntityCreator.writeToParcel(this, parcel, i);
    }

    static 
    {
        HashMap hashmap = new HashMap();
        sFields = hashmap;
        hashmap.put("displayName", com.google.android.gms.common.server.response.FastJsonResponse.Field.forString("displayName", 9));
        sFields.put("emails", com.google.android.gms.common.server.response.FastJsonResponse.Field.forConcreteTypeArray("emails", 11, com/google/android/gms/plus/service/v1whitelisted/models/PersonEntity$EmailsEntity));
        sFields.put("etag", com.google.android.gms.common.server.response.FastJsonResponse.Field.forString("etag", 12));
        sFields.put("id", com.google.android.gms.common.server.response.FastJsonResponse.Field.forString("id", 15));
        sFields.put("image", com.google.android.gms.common.server.response.FastJsonResponse.Field.forConcreteType("image", 16, com/google/android/gms/plus/service/v1whitelisted/models/PersonEntity$ImageEntity));
        sFields.put("name", com.google.android.gms.common.server.response.FastJsonResponse.Field.forConcreteType("name", 20, com/google/android/gms/plus/service/v1whitelisted/models/PersonEntity$NameEntity));
        sFields.put("objectType", com.google.android.gms.common.server.response.FastJsonResponse.Field.forString("objectType", 22));
        sFields.put("statusForViewer", com.google.android.gms.common.server.response.FastJsonResponse.Field.forConcreteType("statusForViewer", 29, com/google/android/gms/plus/service/v1whitelisted/models/PersonEntity$StatusForViewerEntity));
        sFields.put("suggestionId", com.google.android.gms.common.server.response.FastJsonResponse.Field.forString("suggestionId", 30));
        sFields.put("url", com.google.android.gms.common.server.response.FastJsonResponse.Field.forString("url", 32));
    }
}
