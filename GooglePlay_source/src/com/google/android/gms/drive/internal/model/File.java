// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive.internal.model;

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

// Referenced classes of package com.google.android.gms.drive.internal.model:
//            FileCreator, User, FileLocalId, ParentReference, 
//            Permission, Property, File_IndexableTextCreator, File_LabelsCreator, 
//            File_ThumbnailCreator

public final class File extends FastSafeParcelableJsonResponse
{
    public static final class IndexableText extends FastSafeParcelableJsonResponse
    {

        public static final File_IndexableTextCreator CREATOR = new File_IndexableTextCreator();
        private static final HashMap sFields;
        final Set mIndicatorSet;
        String mText;
        final int mVersionCode;

        public final int describeContents()
        {
            return 0;
        }

        public final boolean equals(Object obj)
        {
            if (obj instanceof IndexableText) goto _L2; else goto _L1
_L1:
            return false;
_L2:
            Iterator iterator;
            if (this == obj)
            {
                return true;
            }
            obj = (IndexableText)obj;
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
            if (!((IndexableText) (obj)).isFieldSet(field)) goto _L1; else goto _L3
_L3:
            if (getFieldValue(field).equals(((IndexableText) (obj)).getFieldValue(field))) goto _L5; else goto _L4
_L4:
            return false;
            if (!((IndexableText) (obj)).isFieldSet(field)) goto _L5; else goto _L6
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
                return mText;
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

        protected final void setStringInternal(com.google.android.gms.common.server.response.FastJsonResponse.Field field, String s, String s1)
        {
            int i = field.getSafeParcelableFieldId();
            switch (i)
            {
            default:
                throw new IllegalArgumentException((new StringBuilder("Field with id=")).append(i).append(" is not known to be a String.").toString());

            case 2: // '\002'
                mText = s1;
                break;
            }
            mIndicatorSet.add(Integer.valueOf(i));
        }

        public final void writeToParcel(Parcel parcel, int i)
        {
            File_IndexableTextCreator.writeToParcel$5e40ac0(this, parcel);
        }

        static 
        {
            HashMap hashmap = new HashMap();
            sFields = hashmap;
            hashmap.put("text", com.google.android.gms.common.server.response.FastJsonResponse.Field.forString("text", 2));
        }

        public IndexableText()
        {
            mVersionCode = 1;
            mIndicatorSet = new HashSet();
        }

        IndexableText(Set set, int i, String s)
        {
            mIndicatorSet = set;
            mVersionCode = i;
            mText = s;
        }
    }

    public static final class Labels extends FastSafeParcelableJsonResponse
    {

        public static final File_LabelsCreator CREATOR = new File_LabelsCreator();
        private static final HashMap sFields;
        final Set mIndicatorSet;
        boolean mRestricted;
        boolean mStarred;
        boolean mTrashed;
        final int mVersionCode;
        boolean mViewed;

        public final int describeContents()
        {
            return 0;
        }

        public final boolean equals(Object obj)
        {
            if (obj instanceof Labels) goto _L2; else goto _L1
_L1:
            return false;
_L2:
            Iterator iterator;
            if (this == obj)
            {
                return true;
            }
            obj = (Labels)obj;
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
            if (!((Labels) (obj)).isFieldSet(field)) goto _L1; else goto _L3
_L3:
            if (getFieldValue(field).equals(((Labels) (obj)).getFieldValue(field))) goto _L5; else goto _L4
_L4:
            return false;
            if (!((Labels) (obj)).isFieldSet(field)) goto _L5; else goto _L6
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

            case 3: // '\003'
                return Boolean.valueOf(mRestricted);

            case 4: // '\004'
                return Boolean.valueOf(mStarred);

            case 5: // '\005'
                return Boolean.valueOf(mTrashed);

            case 6: // '\006'
                return Boolean.valueOf(mViewed);
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

        protected final void setBooleanInternal(com.google.android.gms.common.server.response.FastJsonResponse.Field field, String s, boolean flag)
        {
            int i = field.getSafeParcelableFieldId();
            i;
            JVM INSTR tableswitch 3 6: default 40
        //                       3 70
        //                       4 91
        //                       5 99
        //                       6 107;
               goto _L1 _L2 _L3 _L4 _L5
_L1:
            throw new IllegalArgumentException((new StringBuilder("Field with id=")).append(i).append(" is not known to be a boolean.").toString());
_L2:
            mRestricted = flag;
_L7:
            mIndicatorSet.add(Integer.valueOf(i));
            return;
_L3:
            mStarred = flag;
            continue; /* Loop/switch isn't completed */
_L4:
            mTrashed = flag;
            continue; /* Loop/switch isn't completed */
_L5:
            mViewed = flag;
            if (true) goto _L7; else goto _L6
_L6:
        }

        public final void writeToParcel(Parcel parcel, int i)
        {
            File_LabelsCreator.writeToParcel$1d8952dc(this, parcel);
        }

        static 
        {
            HashMap hashmap = new HashMap();
            sFields = hashmap;
            hashmap.put("restricted", com.google.android.gms.common.server.response.FastJsonResponse.Field.forBoolean("restricted", 3));
            sFields.put("starred", com.google.android.gms.common.server.response.FastJsonResponse.Field.forBoolean("starred", 4));
            sFields.put("trashed", com.google.android.gms.common.server.response.FastJsonResponse.Field.forBoolean("trashed", 5));
            sFields.put("viewed", com.google.android.gms.common.server.response.FastJsonResponse.Field.forBoolean("viewed", 6));
        }

        public Labels()
        {
            mVersionCode = 1;
            mIndicatorSet = new HashSet();
        }

        Labels(Set set, int i, boolean flag, boolean flag1, boolean flag2, boolean flag3)
        {
            mIndicatorSet = set;
            mVersionCode = i;
            mRestricted = flag;
            mStarred = flag1;
            mTrashed = flag2;
            mViewed = flag3;
        }
    }

    public static final class Thumbnail extends FastSafeParcelableJsonResponse
    {

        public static final File_ThumbnailCreator CREATOR = new File_ThumbnailCreator();
        private static final HashMap sFields;
        String mImage;
        final Set mIndicatorSet;
        String mMimeType;
        final int mVersionCode;

        public final int describeContents()
        {
            return 0;
        }

        public final boolean equals(Object obj)
        {
            if (obj instanceof Thumbnail) goto _L2; else goto _L1
_L1:
            return false;
_L2:
            Iterator iterator;
            if (this == obj)
            {
                return true;
            }
            obj = (Thumbnail)obj;
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
            if (!((Thumbnail) (obj)).isFieldSet(field)) goto _L1; else goto _L3
_L3:
            if (getFieldValue(field).equals(((Thumbnail) (obj)).getFieldValue(field))) goto _L5; else goto _L4
_L4:
            return false;
            if (!((Thumbnail) (obj)).isFieldSet(field)) goto _L5; else goto _L6
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
                return mImage;

            case 3: // '\003'
                return mMimeType;
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
            mImage = s1;
_L5:
            mIndicatorSet.add(Integer.valueOf(i));
            return;
_L3:
            mMimeType = s1;
            if (true) goto _L5; else goto _L4
_L4:
        }

        public final void writeToParcel(Parcel parcel, int i)
        {
            File_ThumbnailCreator.writeToParcel$57faa993(this, parcel);
        }

        static 
        {
            HashMap hashmap = new HashMap();
            sFields = hashmap;
            hashmap.put("image", com.google.android.gms.common.server.response.FastJsonResponse.Field.forString("image", 2));
            sFields.put("mimeType", com.google.android.gms.common.server.response.FastJsonResponse.Field.forString("mimeType", 3));
        }

        public Thumbnail()
        {
            mVersionCode = 1;
            mIndicatorSet = new HashSet();
        }

        Thumbnail(Set set, int i, String s, String s1)
        {
            mIndicatorSet = set;
            mVersionCode = i;
            mImage = s;
            mMimeType = s1;
        }
    }


    public static final FileCreator CREATOR = new FileCreator();
    private static final HashMap sFields;
    String mAlternateLink;
    boolean mAppDataContents;
    List mAuthorizedAppIds;
    boolean mCopyable;
    String mCreatedDate;
    String mCreatorAppId;
    String mDescription;
    String mDownloadUrl;
    boolean mEditable;
    String mEmbedLink;
    String mEtag;
    boolean mExplicitlyTrashed;
    String mFileExtension;
    long mFileSize;
    String mFolderColorRgb;
    List mFolderFeatures;
    boolean mGplusMedia;
    String mHeadRevisionId;
    String mId;
    IndexableText mIndexableText;
    final Set mIndicatorSet;
    Labels mLabels;
    User mLastModifyingUser;
    String mLastViewedByMeDate;
    FileLocalId mLocalId;
    String mMd5Checksum;
    String mMimeType;
    String mModifiedByMeDate;
    String mModifiedDate;
    String mOriginalFilename;
    List mOwnerNames;
    List mOwners;
    List mParents;
    List mPermissions;
    List mProperties;
    long mQuotaBytesUsed;
    String mRecency;
    String mRecencyReason;
    boolean mShared;
    String mSharedWithMeDate;
    User mSharingUser;
    List mSpaces;
    boolean mSubscribed;
    Thumbnail mThumbnail;
    public String mThumbnailLink;
    String mTitle;
    Permission mUserPermission;
    long mVersion;
    final int mVersionCode;
    String mWebContentLink;
    String mWebViewLink;
    boolean mWritersCanShare;

    public File()
    {
        mVersionCode = 1;
        mIndicatorSet = new HashSet();
    }

    File(Set set, int i, String s, boolean flag, List list, boolean flag1, String s1, 
            String s2, String s3, String s4, boolean flag2, String s5, String s6, boolean flag3, 
            String s7, long l, String s8, List list1, boolean flag4, String s9, 
            String s10, IndexableText indexabletext, Labels labels, User user, String s11, FileLocalId filelocalid, String s12, 
            String s13, String s14, String s15, String s16, List list2, List list3, List list4, 
            List list5, List list6, long l1, String s17, String s18, boolean flag5, 
            String s19, User user1, List list7, boolean flag6, Thumbnail thumbnail, String s20, String s21, 
            Permission permission, long l2, String s22, String s23, boolean flag7)
    {
        mIndicatorSet = set;
        mVersionCode = i;
        mAlternateLink = s;
        mAppDataContents = flag;
        mAuthorizedAppIds = list;
        mCopyable = flag1;
        mCreatedDate = s1;
        mCreatorAppId = s2;
        mDescription = s3;
        mDownloadUrl = s4;
        mEditable = flag2;
        mEmbedLink = s5;
        mEtag = s6;
        mExplicitlyTrashed = flag3;
        mFileExtension = s7;
        mFileSize = l;
        mFolderColorRgb = s8;
        mFolderFeatures = list1;
        mGplusMedia = flag4;
        mHeadRevisionId = s9;
        mId = s10;
        mIndexableText = indexabletext;
        mLabels = labels;
        mLastModifyingUser = user;
        mLastViewedByMeDate = s11;
        mLocalId = filelocalid;
        mMd5Checksum = s12;
        mMimeType = s13;
        mModifiedByMeDate = s14;
        mModifiedDate = s15;
        mOriginalFilename = s16;
        mOwnerNames = list2;
        mOwners = list3;
        mParents = list4;
        mPermissions = list5;
        mProperties = list6;
        mQuotaBytesUsed = l1;
        mRecency = s17;
        mRecencyReason = s18;
        mShared = flag5;
        mSharedWithMeDate = s19;
        mSharingUser = user1;
        mSpaces = list7;
        mSubscribed = flag6;
        mThumbnail = thumbnail;
        mThumbnailLink = s20;
        mTitle = s21;
        mUserPermission = permission;
        mVersion = l2;
        mWebContentLink = s22;
        mWebViewLink = s23;
        mWritersCanShare = flag7;
    }

    public final void addConcreteTypeArrayInternal(com.google.android.gms.common.server.response.FastJsonResponse.Field field, String s, ArrayList arraylist)
    {
        int i = field.getSafeParcelableFieldId();
        i;
        JVM INSTR tableswitch 50 54: default 44
    //                   50 92
    //                   51 113
    //                   52 121
    //                   53 44
    //                   54 129;
           goto _L1 _L2 _L3 _L4 _L1 _L5
_L1:
        throw new IllegalArgumentException((new StringBuilder("Field with id=")).append(i).append(" is not a known array of custom type.  Found ").append(arraylist.getClass().getCanonicalName()).append(".").toString());
_L2:
        mOwners = arraylist;
_L7:
        mIndicatorSet.add(Integer.valueOf(i));
        return;
_L3:
        mParents = arraylist;
        continue; /* Loop/switch isn't completed */
_L4:
        mPermissions = arraylist;
        continue; /* Loop/switch isn't completed */
_L5:
        mProperties = arraylist;
        if (true) goto _L7; else goto _L6
_L6:
    }

    public final void addConcreteTypeInternal(com.google.android.gms.common.server.response.FastJsonResponse.Field field, String s, FastJsonResponse fastjsonresponse)
    {
        int i = field.getSafeParcelableFieldId();
        i;
        JVM INSTR lookupswitch 7: default 76
    //                   34: 124
    //                   36: 148
    //                   37: 159
    //                   40: 170
    //                   65: 181
    //                   71: 192
    //                   74: 203;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8
_L1:
        throw new IllegalArgumentException((new StringBuilder("Field with id=")).append(i).append(" is not a known custom type.  Found ").append(fastjsonresponse.getClass().getCanonicalName()).append(".").toString());
_L2:
        mIndexableText = (IndexableText)fastjsonresponse;
_L10:
        mIndicatorSet.add(Integer.valueOf(i));
        return;
_L3:
        mLabels = (Labels)fastjsonresponse;
        continue; /* Loop/switch isn't completed */
_L4:
        mLastModifyingUser = (User)fastjsonresponse;
        continue; /* Loop/switch isn't completed */
_L5:
        mLocalId = (FileLocalId)fastjsonresponse;
        continue; /* Loop/switch isn't completed */
_L6:
        mSharingUser = (User)fastjsonresponse;
        continue; /* Loop/switch isn't completed */
_L7:
        mThumbnail = (Thumbnail)fastjsonresponse;
        continue; /* Loop/switch isn't completed */
_L8:
        mUserPermission = (Permission)fastjsonresponse;
        if (true) goto _L10; else goto _L9
_L9:
    }

    public final int describeContents()
    {
        return 0;
    }

    public final boolean equals(Object obj)
    {
        if (obj instanceof File) goto _L2; else goto _L1
_L1:
        return false;
_L2:
        Iterator iterator;
        if (this == obj)
        {
            return true;
        }
        obj = (File)obj;
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
        if (!((File) (obj)).isFieldSet(field)) goto _L1; else goto _L3
_L3:
        if (getFieldValue(field).equals(((File) (obj)).getFieldValue(field))) goto _L5; else goto _L4
_L4:
        return false;
        if (!((File) (obj)).isFieldSet(field)) goto _L5; else goto _L6
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
        case 5: // '\005'
        case 9: // '\t'
        case 10: // '\n'
        case 13: // '\r'
        case 15: // '\017'
        case 19: // '\023'
        case 22: // '\026'
        case 23: // '\027'
        case 27: // '\033'
        case 28: // '\034'
        case 29: // '\035'
        case 31: // '\037'
        case 33: // '!'
        case 35: // '#'
        case 38: // '&'
        case 41: // ')'
        case 46: // '.'
        case 48: // '0'
        case 53: // '5'
        case 56: // '8'
        case 59: // ';'
        case 60: // '<'
        case 61: // '='
        case 62: // '>'
        case 66: // 'B'
        case 67: // 'C'
        case 70: // 'F'
        case 76: // 'L'
        default:
            throw new IllegalStateException((new StringBuilder("Unknown safe parcelable id=")).append(field.getSafeParcelableFieldId()).toString());

        case 2: // '\002'
            return mAlternateLink;

        case 3: // '\003'
            return Boolean.valueOf(mAppDataContents);

        case 4: // '\004'
            return mAuthorizedAppIds;

        case 6: // '\006'
            return Boolean.valueOf(mCopyable);

        case 7: // '\007'
            return mCreatedDate;

        case 8: // '\b'
            return mCreatorAppId;

        case 11: // '\013'
            return mDescription;

        case 12: // '\f'
            return mDownloadUrl;

        case 14: // '\016'
            return Boolean.valueOf(mEditable);

        case 16: // '\020'
            return mEmbedLink;

        case 17: // '\021'
            return mEtag;

        case 18: // '\022'
            return Boolean.valueOf(mExplicitlyTrashed);

        case 20: // '\024'
            return mFileExtension;

        case 21: // '\025'
            return Long.valueOf(mFileSize);

        case 24: // '\030'
            return mFolderColorRgb;

        case 25: // '\031'
            return mFolderFeatures;

        case 26: // '\032'
            return Boolean.valueOf(mGplusMedia);

        case 30: // '\036'
            return mHeadRevisionId;

        case 32: // ' '
            return mId;

        case 34: // '"'
            return mIndexableText;

        case 36: // '$'
            return mLabels;

        case 37: // '%'
            return mLastModifyingUser;

        case 39: // '\''
            return mLastViewedByMeDate;

        case 40: // '('
            return mLocalId;

        case 42: // '*'
            return mMd5Checksum;

        case 43: // '+'
            return mMimeType;

        case 44: // ','
            return mModifiedByMeDate;

        case 45: // '-'
            return mModifiedDate;

        case 47: // '/'
            return mOriginalFilename;

        case 49: // '1'
            return mOwnerNames;

        case 50: // '2'
            return mOwners;

        case 51: // '3'
            return mParents;

        case 52: // '4'
            return mPermissions;

        case 54: // '6'
            return mProperties;

        case 55: // '7'
            return Long.valueOf(mQuotaBytesUsed);

        case 57: // '9'
            return mRecency;

        case 58: // ':'
            return mRecencyReason;

        case 63: // '?'
            return Boolean.valueOf(mShared);

        case 64: // '@'
            return mSharedWithMeDate;

        case 65: // 'A'
            return mSharingUser;

        case 68: // 'D'
            return mSpaces;

        case 69: // 'E'
            return Boolean.valueOf(mSubscribed);

        case 71: // 'G'
            return mThumbnail;

        case 72: // 'H'
            return mThumbnailLink;

        case 73: // 'I'
            return mTitle;

        case 74: // 'J'
            return mUserPermission;

        case 75: // 'K'
            return Long.valueOf(mVersion);

        case 77: // 'M'
            return mWebContentLink;

        case 78: // 'N'
            return mWebViewLink;

        case 79: // 'O'
            return Boolean.valueOf(mWritersCanShare);
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

    protected final void setBooleanInternal(com.google.android.gms.common.server.response.FastJsonResponse.Field field, String s, boolean flag)
    {
        int i = field.getSafeParcelableFieldId();
        i;
        JVM INSTR lookupswitch 8: default 84
    //                   3: 116
    //                   6: 137
    //                   14: 145
    //                   18: 153
    //                   26: 161
    //                   63: 169
    //                   69: 177
    //                   79: 185;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9
_L1:
        throw new IllegalArgumentException((new StringBuilder("Field with id=")).append(i).append(" is not known to be a boolean.").toString());
_L2:
        mAppDataContents = flag;
_L11:
        mIndicatorSet.add(Integer.valueOf(i));
        return;
_L3:
        mCopyable = flag;
        continue; /* Loop/switch isn't completed */
_L4:
        mEditable = flag;
        continue; /* Loop/switch isn't completed */
_L5:
        mExplicitlyTrashed = flag;
        continue; /* Loop/switch isn't completed */
_L6:
        mGplusMedia = flag;
        continue; /* Loop/switch isn't completed */
_L7:
        mShared = flag;
        continue; /* Loop/switch isn't completed */
_L8:
        mSubscribed = flag;
        continue; /* Loop/switch isn't completed */
_L9:
        mWritersCanShare = flag;
        if (true) goto _L11; else goto _L10
_L10:
    }

    protected final void setLongInternal(com.google.android.gms.common.server.response.FastJsonResponse.Field field, String s, long l)
    {
        int i = field.getSafeParcelableFieldId();
        i;
        JVM INSTR lookupswitch 3: default 44
    //                   21: 76
    //                   55: 97
    //                   75: 105;
           goto _L1 _L2 _L3 _L4
_L1:
        throw new IllegalArgumentException((new StringBuilder("Field with id=")).append(i).append(" is not known to be a long.").toString());
_L2:
        mFileSize = l;
_L6:
        mIndicatorSet.add(Integer.valueOf(i));
        return;
_L3:
        mQuotaBytesUsed = l;
        continue; /* Loop/switch isn't completed */
_L4:
        mVersion = l;
        if (true) goto _L6; else goto _L5
_L5:
    }

    protected final void setStringInternal(com.google.android.gms.common.server.response.FastJsonResponse.Field field, String s, String s1)
    {
        int i = field.getSafeParcelableFieldId();
        i;
        JVM INSTR lookupswitch 24: default 212
    //                   2: 244
    //                   7: 265
    //                   8: 273
    //                   11: 281
    //                   12: 289
    //                   16: 297
    //                   17: 305
    //                   20: 313
    //                   24: 321
    //                   30: 329
    //                   32: 337
    //                   39: 345
    //                   42: 353
    //                   43: 361
    //                   44: 369
    //                   45: 377
    //                   47: 385
    //                   57: 393
    //                   58: 401
    //                   64: 409
    //                   72: 417
    //                   73: 425
    //                   77: 433
    //                   78: 441;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10 _L11 _L12 _L13 _L14 _L15 _L16 _L17 _L18 _L19 _L20 _L21 _L22 _L23 _L24 _L25
_L1:
        throw new IllegalArgumentException((new StringBuilder("Field with id=")).append(i).append(" is not known to be a String.").toString());
_L2:
        mAlternateLink = s1;
_L27:
        mIndicatorSet.add(Integer.valueOf(i));
        return;
_L3:
        mCreatedDate = s1;
        continue; /* Loop/switch isn't completed */
_L4:
        mCreatorAppId = s1;
        continue; /* Loop/switch isn't completed */
_L5:
        mDescription = s1;
        continue; /* Loop/switch isn't completed */
_L6:
        mDownloadUrl = s1;
        continue; /* Loop/switch isn't completed */
_L7:
        mEmbedLink = s1;
        continue; /* Loop/switch isn't completed */
_L8:
        mEtag = s1;
        continue; /* Loop/switch isn't completed */
_L9:
        mFileExtension = s1;
        continue; /* Loop/switch isn't completed */
_L10:
        mFolderColorRgb = s1;
        continue; /* Loop/switch isn't completed */
_L11:
        mHeadRevisionId = s1;
        continue; /* Loop/switch isn't completed */
_L12:
        mId = s1;
        continue; /* Loop/switch isn't completed */
_L13:
        mLastViewedByMeDate = s1;
        continue; /* Loop/switch isn't completed */
_L14:
        mMd5Checksum = s1;
        continue; /* Loop/switch isn't completed */
_L15:
        mMimeType = s1;
        continue; /* Loop/switch isn't completed */
_L16:
        mModifiedByMeDate = s1;
        continue; /* Loop/switch isn't completed */
_L17:
        mModifiedDate = s1;
        continue; /* Loop/switch isn't completed */
_L18:
        mOriginalFilename = s1;
        continue; /* Loop/switch isn't completed */
_L19:
        mRecency = s1;
        continue; /* Loop/switch isn't completed */
_L20:
        mRecencyReason = s1;
        continue; /* Loop/switch isn't completed */
_L21:
        mSharedWithMeDate = s1;
        continue; /* Loop/switch isn't completed */
_L22:
        mThumbnailLink = s1;
        continue; /* Loop/switch isn't completed */
_L23:
        mTitle = s1;
        continue; /* Loop/switch isn't completed */
_L24:
        mWebContentLink = s1;
        continue; /* Loop/switch isn't completed */
_L25:
        mWebViewLink = s1;
        if (true) goto _L27; else goto _L26
_L26:
    }

    protected final void setStringsInternal(com.google.android.gms.common.server.response.FastJsonResponse.Field field, String s, ArrayList arraylist)
    {
        int i = field.getSafeParcelableFieldId();
        i;
        JVM INSTR lookupswitch 4: default 52
    //                   4: 84
    //                   25: 105
    //                   49: 113
    //                   68: 121;
           goto _L1 _L2 _L3 _L4 _L5
_L1:
        throw new IllegalArgumentException((new StringBuilder("Field with id=")).append(i).append(" is not known to be an array of String.").toString());
_L2:
        mAuthorizedAppIds = arraylist;
_L7:
        mIndicatorSet.add(Integer.valueOf(i));
        return;
_L3:
        mFolderFeatures = arraylist;
        continue; /* Loop/switch isn't completed */
_L4:
        mOwnerNames = arraylist;
        continue; /* Loop/switch isn't completed */
_L5:
        mSpaces = arraylist;
        if (true) goto _L7; else goto _L6
_L6:
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        FileCreator.writeToParcel(this, parcel, i);
    }

    static 
    {
        HashMap hashmap = new HashMap();
        sFields = hashmap;
        hashmap.put("alternateLink", com.google.android.gms.common.server.response.FastJsonResponse.Field.forString("alternateLink", 2));
        sFields.put("appDataContents", com.google.android.gms.common.server.response.FastJsonResponse.Field.forBoolean("appDataContents", 3));
        sFields.put("authorizedAppIds", com.google.android.gms.common.server.response.FastJsonResponse.Field.forStrings("authorizedAppIds", 4));
        sFields.put("copyable", com.google.android.gms.common.server.response.FastJsonResponse.Field.forBoolean("copyable", 6));
        sFields.put("createdDate", com.google.android.gms.common.server.response.FastJsonResponse.Field.forString("createdDate", 7));
        sFields.put("creatorAppId", com.google.android.gms.common.server.response.FastJsonResponse.Field.forString("creatorAppId", 8));
        sFields.put("description", com.google.android.gms.common.server.response.FastJsonResponse.Field.forString("description", 11));
        sFields.put("downloadUrl", com.google.android.gms.common.server.response.FastJsonResponse.Field.forString("downloadUrl", 12));
        sFields.put("editable", com.google.android.gms.common.server.response.FastJsonResponse.Field.forBoolean("editable", 14));
        sFields.put("embedLink", com.google.android.gms.common.server.response.FastJsonResponse.Field.forString("embedLink", 16));
        sFields.put("etag", com.google.android.gms.common.server.response.FastJsonResponse.Field.forString("etag", 17));
        sFields.put("explicitlyTrashed", com.google.android.gms.common.server.response.FastJsonResponse.Field.forBoolean("explicitlyTrashed", 18));
        sFields.put("fileExtension", com.google.android.gms.common.server.response.FastJsonResponse.Field.forString("fileExtension", 20));
        sFields.put("fileSize", com.google.android.gms.common.server.response.FastJsonResponse.Field.forLong("fileSize", 21));
        sFields.put("folderColorRgb", com.google.android.gms.common.server.response.FastJsonResponse.Field.forString("folderColorRgb", 24));
        sFields.put("folderFeatures", com.google.android.gms.common.server.response.FastJsonResponse.Field.forStrings("folderFeatures", 25));
        sFields.put("gplusMedia", com.google.android.gms.common.server.response.FastJsonResponse.Field.forBoolean("gplusMedia", 26));
        sFields.put("headRevisionId", com.google.android.gms.common.server.response.FastJsonResponse.Field.forString("headRevisionId", 30));
        sFields.put("id", com.google.android.gms.common.server.response.FastJsonResponse.Field.forString("id", 32));
        sFields.put("indexableText", com.google.android.gms.common.server.response.FastJsonResponse.Field.forConcreteType("indexableText", 34, com/google/android/gms/drive/internal/model/File$IndexableText));
        sFields.put("labels", com.google.android.gms.common.server.response.FastJsonResponse.Field.forConcreteType("labels", 36, com/google/android/gms/drive/internal/model/File$Labels));
        sFields.put("lastModifyingUser", com.google.android.gms.common.server.response.FastJsonResponse.Field.forConcreteType("lastModifyingUser", 37, com/google/android/gms/drive/internal/model/User));
        sFields.put("lastViewedByMeDate", com.google.android.gms.common.server.response.FastJsonResponse.Field.forString("lastViewedByMeDate", 39));
        sFields.put("localId", com.google.android.gms.common.server.response.FastJsonResponse.Field.forConcreteType("localId", 40, com/google/android/gms/drive/internal/model/FileLocalId));
        sFields.put("md5Checksum", com.google.android.gms.common.server.response.FastJsonResponse.Field.forString("md5Checksum", 42));
        sFields.put("mimeType", com.google.android.gms.common.server.response.FastJsonResponse.Field.forString("mimeType", 43));
        sFields.put("modifiedByMeDate", com.google.android.gms.common.server.response.FastJsonResponse.Field.forString("modifiedByMeDate", 44));
        sFields.put("modifiedDate", com.google.android.gms.common.server.response.FastJsonResponse.Field.forString("modifiedDate", 45));
        sFields.put("originalFilename", com.google.android.gms.common.server.response.FastJsonResponse.Field.forString("originalFilename", 47));
        sFields.put("ownerNames", com.google.android.gms.common.server.response.FastJsonResponse.Field.forStrings("ownerNames", 49));
        sFields.put("owners", com.google.android.gms.common.server.response.FastJsonResponse.Field.forConcreteTypeArray("owners", 50, com/google/android/gms/drive/internal/model/User));
        sFields.put("parents", com.google.android.gms.common.server.response.FastJsonResponse.Field.forConcreteTypeArray("parents", 51, com/google/android/gms/drive/internal/model/ParentReference));
        sFields.put("permissions", com.google.android.gms.common.server.response.FastJsonResponse.Field.forConcreteTypeArray("permissions", 52, com/google/android/gms/drive/internal/model/Permission));
        sFields.put("properties", com.google.android.gms.common.server.response.FastJsonResponse.Field.forConcreteTypeArray("properties", 54, com/google/android/gms/drive/internal/model/Property));
        sFields.put("quotaBytesUsed", com.google.android.gms.common.server.response.FastJsonResponse.Field.forLong("quotaBytesUsed", 55));
        sFields.put("recency", com.google.android.gms.common.server.response.FastJsonResponse.Field.forString("recency", 57));
        sFields.put("recencyReason", com.google.android.gms.common.server.response.FastJsonResponse.Field.forString("recencyReason", 58));
        sFields.put("shared", com.google.android.gms.common.server.response.FastJsonResponse.Field.forBoolean("shared", 63));
        sFields.put("sharedWithMeDate", com.google.android.gms.common.server.response.FastJsonResponse.Field.forString("sharedWithMeDate", 64));
        sFields.put("sharingUser", com.google.android.gms.common.server.response.FastJsonResponse.Field.forConcreteType("sharingUser", 65, com/google/android/gms/drive/internal/model/User));
        sFields.put("spaces", com.google.android.gms.common.server.response.FastJsonResponse.Field.forStrings("spaces", 68));
        sFields.put("subscribed", com.google.android.gms.common.server.response.FastJsonResponse.Field.forBoolean("subscribed", 69));
        sFields.put("thumbnail", com.google.android.gms.common.server.response.FastJsonResponse.Field.forConcreteType("thumbnail", 71, com/google/android/gms/drive/internal/model/File$Thumbnail));
        sFields.put("thumbnailLink", com.google.android.gms.common.server.response.FastJsonResponse.Field.forString("thumbnailLink", 72));
        sFields.put("title", com.google.android.gms.common.server.response.FastJsonResponse.Field.forString("title", 73));
        sFields.put("userPermission", com.google.android.gms.common.server.response.FastJsonResponse.Field.forConcreteType("userPermission", 74, com/google/android/gms/drive/internal/model/Permission));
        sFields.put("version", com.google.android.gms.common.server.response.FastJsonResponse.Field.forLong("version", 75));
        sFields.put("webContentLink", com.google.android.gms.common.server.response.FastJsonResponse.Field.forString("webContentLink", 77));
        sFields.put("webViewLink", com.google.android.gms.common.server.response.FastJsonResponse.Field.forString("webViewLink", 78));
        sFields.put("writersCanShare", com.google.android.gms.common.server.response.FastJsonResponse.Field.forBoolean("writersCanShare", 79));
    }
}
