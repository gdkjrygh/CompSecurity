// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive.internal.model;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import java.util.HashSet;
import java.util.Set;

// Referenced classes of package com.google.android.gms.drive.internal.model:
//            File, User, FileLocalId, ParentReference, 
//            Property, Permission

public final class FileCreator
    implements android.os.Parcelable.Creator
{

    public FileCreator()
    {
    }

    static void writeToParcel(File file, Parcel parcel, int i)
    {
        int j = SafeParcelWriter.beginVariableData(parcel, 20293);
        Set set = file.mIndicatorSet;
        if (set.contains(Integer.valueOf(1)))
        {
            SafeParcelWriter.writeInt(parcel, 1, file.mVersionCode);
        }
        if (set.contains(Integer.valueOf(2)))
        {
            SafeParcelWriter.writeString(parcel, 2, file.mAlternateLink, true);
        }
        if (set.contains(Integer.valueOf(3)))
        {
            SafeParcelWriter.writeBoolean(parcel, 3, file.mAppDataContents);
        }
        if (set.contains(Integer.valueOf(4)))
        {
            SafeParcelWriter.writeStringList(parcel, 4, file.mAuthorizedAppIds, true);
        }
        if (set.contains(Integer.valueOf(6)))
        {
            SafeParcelWriter.writeBoolean(parcel, 6, file.mCopyable);
        }
        if (set.contains(Integer.valueOf(7)))
        {
            SafeParcelWriter.writeString(parcel, 7, file.mCreatedDate, true);
        }
        if (set.contains(Integer.valueOf(8)))
        {
            SafeParcelWriter.writeString(parcel, 8, file.mCreatorAppId, true);
        }
        if (set.contains(Integer.valueOf(11)))
        {
            SafeParcelWriter.writeString(parcel, 11, file.mDescription, true);
        }
        if (set.contains(Integer.valueOf(12)))
        {
            SafeParcelWriter.writeString(parcel, 12, file.mDownloadUrl, true);
        }
        if (set.contains(Integer.valueOf(14)))
        {
            SafeParcelWriter.writeBoolean(parcel, 14, file.mEditable);
        }
        if (set.contains(Integer.valueOf(17)))
        {
            SafeParcelWriter.writeString(parcel, 17, file.mEtag, true);
        }
        if (set.contains(Integer.valueOf(16)))
        {
            SafeParcelWriter.writeString(parcel, 16, file.mEmbedLink, true);
        }
        if (set.contains(Integer.valueOf(18)))
        {
            SafeParcelWriter.writeBoolean(parcel, 18, file.mExplicitlyTrashed);
        }
        if (set.contains(Integer.valueOf(21)))
        {
            SafeParcelWriter.writeLong(parcel, 21, file.mFileSize);
        }
        if (set.contains(Integer.valueOf(20)))
        {
            SafeParcelWriter.writeString(parcel, 20, file.mFileExtension, true);
        }
        if (set.contains(Integer.valueOf(25)))
        {
            SafeParcelWriter.writeStringList(parcel, 25, file.mFolderFeatures, true);
        }
        if (set.contains(Integer.valueOf(24)))
        {
            SafeParcelWriter.writeString(parcel, 24, file.mFolderColorRgb, true);
        }
        if (set.contains(Integer.valueOf(26)))
        {
            SafeParcelWriter.writeBoolean(parcel, 26, file.mGplusMedia);
        }
        if (set.contains(Integer.valueOf(30)))
        {
            SafeParcelWriter.writeString(parcel, 30, file.mHeadRevisionId, true);
        }
        if (set.contains(Integer.valueOf(34)))
        {
            SafeParcelWriter.writeParcelable(parcel, 34, file.mIndexableText, i, true);
        }
        if (set.contains(Integer.valueOf(32)))
        {
            SafeParcelWriter.writeString(parcel, 32, file.mId, true);
        }
        if (set.contains(Integer.valueOf(39)))
        {
            SafeParcelWriter.writeString(parcel, 39, file.mLastViewedByMeDate, true);
        }
        if (set.contains(Integer.valueOf(36)))
        {
            SafeParcelWriter.writeParcelable(parcel, 36, file.mLabels, i, true);
        }
        if (set.contains(Integer.valueOf(37)))
        {
            SafeParcelWriter.writeParcelable(parcel, 37, file.mLastModifyingUser, i, true);
        }
        if (set.contains(Integer.valueOf(42)))
        {
            SafeParcelWriter.writeString(parcel, 42, file.mMd5Checksum, true);
        }
        if (set.contains(Integer.valueOf(43)))
        {
            SafeParcelWriter.writeString(parcel, 43, file.mMimeType, true);
        }
        if (set.contains(Integer.valueOf(40)))
        {
            SafeParcelWriter.writeParcelable(parcel, 40, file.mLocalId, i, true);
        }
        if (set.contains(Integer.valueOf(47)))
        {
            SafeParcelWriter.writeString(parcel, 47, file.mOriginalFilename, true);
        }
        if (set.contains(Integer.valueOf(44)))
        {
            SafeParcelWriter.writeString(parcel, 44, file.mModifiedByMeDate, true);
        }
        if (set.contains(Integer.valueOf(45)))
        {
            SafeParcelWriter.writeString(parcel, 45, file.mModifiedDate, true);
        }
        if (set.contains(Integer.valueOf(51)))
        {
            SafeParcelWriter.writeTypedList(parcel, 51, file.mParents, true);
        }
        if (set.contains(Integer.valueOf(50)))
        {
            SafeParcelWriter.writeTypedList(parcel, 50, file.mOwners, true);
        }
        if (set.contains(Integer.valueOf(49)))
        {
            SafeParcelWriter.writeStringList(parcel, 49, file.mOwnerNames, true);
        }
        if (set.contains(Integer.valueOf(55)))
        {
            SafeParcelWriter.writeLong(parcel, 55, file.mQuotaBytesUsed);
        }
        if (set.contains(Integer.valueOf(54)))
        {
            SafeParcelWriter.writeTypedList(parcel, 54, file.mProperties, true);
        }
        if (set.contains(Integer.valueOf(52)))
        {
            SafeParcelWriter.writeTypedList(parcel, 52, file.mPermissions, true);
        }
        if (set.contains(Integer.valueOf(58)))
        {
            SafeParcelWriter.writeString(parcel, 58, file.mRecencyReason, true);
        }
        if (set.contains(Integer.valueOf(57)))
        {
            SafeParcelWriter.writeString(parcel, 57, file.mRecency, true);
        }
        if (set.contains(Integer.valueOf(63)))
        {
            SafeParcelWriter.writeBoolean(parcel, 63, file.mShared);
        }
        if (set.contains(Integer.valueOf(68)))
        {
            SafeParcelWriter.writeStringList(parcel, 68, file.mSpaces, true);
        }
        if (set.contains(Integer.valueOf(69)))
        {
            SafeParcelWriter.writeBoolean(parcel, 69, file.mSubscribed);
        }
        if (set.contains(Integer.valueOf(71)))
        {
            SafeParcelWriter.writeParcelable(parcel, 71, file.mThumbnail, i, true);
        }
        if (set.contains(Integer.valueOf(64)))
        {
            SafeParcelWriter.writeString(parcel, 64, file.mSharedWithMeDate, true);
        }
        if (set.contains(Integer.valueOf(65)))
        {
            SafeParcelWriter.writeParcelable(parcel, 65, file.mSharingUser, i, true);
        }
        if (set.contains(Integer.valueOf(77)))
        {
            SafeParcelWriter.writeString(parcel, 77, file.mWebContentLink, true);
        }
        if (set.contains(Integer.valueOf(78)))
        {
            SafeParcelWriter.writeString(parcel, 78, file.mWebViewLink, true);
        }
        if (set.contains(Integer.valueOf(79)))
        {
            SafeParcelWriter.writeBoolean(parcel, 79, file.mWritersCanShare);
        }
        if (set.contains(Integer.valueOf(72)))
        {
            SafeParcelWriter.writeString(parcel, 72, file.mThumbnailLink, true);
        }
        if (set.contains(Integer.valueOf(73)))
        {
            SafeParcelWriter.writeString(parcel, 73, file.mTitle, true);
        }
        if (set.contains(Integer.valueOf(74)))
        {
            SafeParcelWriter.writeParcelable(parcel, 74, file.mUserPermission, i, true);
        }
        if (set.contains(Integer.valueOf(75)))
        {
            SafeParcelWriter.writeLong(parcel, 75, file.mVersion);
        }
        SafeParcelWriter.finishVariableData(parcel, j);
    }

    public final volatile Object createFromParcel(Parcel parcel)
    {
        int j = SafeParcelReader.validateObjectHeader(parcel);
        HashSet hashset = new HashSet();
        int i = 0;
        String s23 = null;
        boolean flag7 = false;
        java.util.ArrayList arraylist7 = null;
        boolean flag6 = false;
        String s22 = null;
        String s21 = null;
        String s20 = null;
        String s19 = null;
        boolean flag5 = false;
        String s18 = null;
        String s17 = null;
        boolean flag4 = false;
        String s16 = null;
        long l2 = 0L;
        String s15 = null;
        java.util.ArrayList arraylist6 = null;
        boolean flag3 = false;
        String s14 = null;
        String s13 = null;
        File.IndexableText indexabletext = null;
        File.Labels labels = null;
        User user1 = null;
        String s12 = null;
        FileLocalId filelocalid = null;
        String s11 = null;
        String s10 = null;
        String s9 = null;
        String s8 = null;
        String s7 = null;
        java.util.ArrayList arraylist5 = null;
        java.util.ArrayList arraylist4 = null;
        java.util.ArrayList arraylist3 = null;
        java.util.ArrayList arraylist2 = null;
        java.util.ArrayList arraylist1 = null;
        long l1 = 0L;
        String s6 = null;
        String s5 = null;
        boolean flag2 = false;
        String s4 = null;
        User user = null;
        java.util.ArrayList arraylist = null;
        boolean flag1 = false;
        File.Thumbnail thumbnail = null;
        String s3 = null;
        String s2 = null;
        Permission permission = null;
        long l = 0L;
        String s1 = null;
        String s = null;
        boolean flag = false;
        do
        {
            if (parcel.dataPosition() < j)
            {
                int k = parcel.readInt();
                switch (0xffff & k)
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
                    SafeParcelReader.skipUnknownField(parcel, k);
                    break;

                case 1: // '\001'
                    i = SafeParcelReader.readInt(parcel, k);
                    hashset.add(Integer.valueOf(1));
                    break;

                case 2: // '\002'
                    s23 = SafeParcelReader.createString(parcel, k);
                    hashset.add(Integer.valueOf(2));
                    break;

                case 3: // '\003'
                    flag7 = SafeParcelReader.readBoolean(parcel, k);
                    hashset.add(Integer.valueOf(3));
                    break;

                case 4: // '\004'
                    arraylist7 = SafeParcelReader.createStringList(parcel, k);
                    hashset.add(Integer.valueOf(4));
                    break;

                case 6: // '\006'
                    flag6 = SafeParcelReader.readBoolean(parcel, k);
                    hashset.add(Integer.valueOf(6));
                    break;

                case 7: // '\007'
                    s22 = SafeParcelReader.createString(parcel, k);
                    hashset.add(Integer.valueOf(7));
                    break;

                case 8: // '\b'
                    s21 = SafeParcelReader.createString(parcel, k);
                    hashset.add(Integer.valueOf(8));
                    break;

                case 11: // '\013'
                    s20 = SafeParcelReader.createString(parcel, k);
                    hashset.add(Integer.valueOf(11));
                    break;

                case 12: // '\f'
                    s19 = SafeParcelReader.createString(parcel, k);
                    hashset.add(Integer.valueOf(12));
                    break;

                case 14: // '\016'
                    flag5 = SafeParcelReader.readBoolean(parcel, k);
                    hashset.add(Integer.valueOf(14));
                    break;

                case 17: // '\021'
                    s17 = SafeParcelReader.createString(parcel, k);
                    hashset.add(Integer.valueOf(17));
                    break;

                case 16: // '\020'
                    s18 = SafeParcelReader.createString(parcel, k);
                    hashset.add(Integer.valueOf(16));
                    break;

                case 18: // '\022'
                    flag4 = SafeParcelReader.readBoolean(parcel, k);
                    hashset.add(Integer.valueOf(18));
                    break;

                case 21: // '\025'
                    l2 = SafeParcelReader.readLong(parcel, k);
                    hashset.add(Integer.valueOf(21));
                    break;

                case 20: // '\024'
                    s16 = SafeParcelReader.createString(parcel, k);
                    hashset.add(Integer.valueOf(20));
                    break;

                case 25: // '\031'
                    arraylist6 = SafeParcelReader.createStringList(parcel, k);
                    hashset.add(Integer.valueOf(25));
                    break;

                case 24: // '\030'
                    s15 = SafeParcelReader.createString(parcel, k);
                    hashset.add(Integer.valueOf(24));
                    break;

                case 26: // '\032'
                    flag3 = SafeParcelReader.readBoolean(parcel, k);
                    hashset.add(Integer.valueOf(26));
                    break;

                case 30: // '\036'
                    s14 = SafeParcelReader.createString(parcel, k);
                    hashset.add(Integer.valueOf(30));
                    break;

                case 34: // '"'
                    indexabletext = (File.IndexableText)SafeParcelReader.createParcelable(parcel, k, File.IndexableText.CREATOR);
                    hashset.add(Integer.valueOf(34));
                    break;

                case 32: // ' '
                    s13 = SafeParcelReader.createString(parcel, k);
                    hashset.add(Integer.valueOf(32));
                    break;

                case 39: // '\''
                    s12 = SafeParcelReader.createString(parcel, k);
                    hashset.add(Integer.valueOf(39));
                    break;

                case 36: // '$'
                    labels = (File.Labels)SafeParcelReader.createParcelable(parcel, k, File.Labels.CREATOR);
                    hashset.add(Integer.valueOf(36));
                    break;

                case 37: // '%'
                    user1 = (User)SafeParcelReader.createParcelable(parcel, k, User.CREATOR);
                    hashset.add(Integer.valueOf(37));
                    break;

                case 42: // '*'
                    s11 = SafeParcelReader.createString(parcel, k);
                    hashset.add(Integer.valueOf(42));
                    break;

                case 43: // '+'
                    s10 = SafeParcelReader.createString(parcel, k);
                    hashset.add(Integer.valueOf(43));
                    break;

                case 40: // '('
                    filelocalid = (FileLocalId)SafeParcelReader.createParcelable(parcel, k, FileLocalId.CREATOR);
                    hashset.add(Integer.valueOf(40));
                    break;

                case 47: // '/'
                    s7 = SafeParcelReader.createString(parcel, k);
                    hashset.add(Integer.valueOf(47));
                    break;

                case 44: // ','
                    s9 = SafeParcelReader.createString(parcel, k);
                    hashset.add(Integer.valueOf(44));
                    break;

                case 45: // '-'
                    s8 = SafeParcelReader.createString(parcel, k);
                    hashset.add(Integer.valueOf(45));
                    break;

                case 51: // '3'
                    arraylist3 = SafeParcelReader.createTypedList(parcel, k, ParentReference.CREATOR);
                    hashset.add(Integer.valueOf(51));
                    break;

                case 50: // '2'
                    arraylist4 = SafeParcelReader.createTypedList(parcel, k, User.CREATOR);
                    hashset.add(Integer.valueOf(50));
                    break;

                case 49: // '1'
                    arraylist5 = SafeParcelReader.createStringList(parcel, k);
                    hashset.add(Integer.valueOf(49));
                    break;

                case 55: // '7'
                    l1 = SafeParcelReader.readLong(parcel, k);
                    hashset.add(Integer.valueOf(55));
                    break;

                case 54: // '6'
                    arraylist1 = SafeParcelReader.createTypedList(parcel, k, Property.CREATOR);
                    hashset.add(Integer.valueOf(54));
                    break;

                case 52: // '4'
                    arraylist2 = SafeParcelReader.createTypedList(parcel, k, Permission.CREATOR);
                    hashset.add(Integer.valueOf(52));
                    break;

                case 58: // ':'
                    s5 = SafeParcelReader.createString(parcel, k);
                    hashset.add(Integer.valueOf(58));
                    break;

                case 57: // '9'
                    s6 = SafeParcelReader.createString(parcel, k);
                    hashset.add(Integer.valueOf(57));
                    break;

                case 63: // '?'
                    flag2 = SafeParcelReader.readBoolean(parcel, k);
                    hashset.add(Integer.valueOf(63));
                    break;

                case 68: // 'D'
                    arraylist = SafeParcelReader.createStringList(parcel, k);
                    hashset.add(Integer.valueOf(68));
                    break;

                case 69: // 'E'
                    flag1 = SafeParcelReader.readBoolean(parcel, k);
                    hashset.add(Integer.valueOf(69));
                    break;

                case 71: // 'G'
                    thumbnail = (File.Thumbnail)SafeParcelReader.createParcelable(parcel, k, File.Thumbnail.CREATOR);
                    hashset.add(Integer.valueOf(71));
                    break;

                case 64: // '@'
                    s4 = SafeParcelReader.createString(parcel, k);
                    hashset.add(Integer.valueOf(64));
                    break;

                case 65: // 'A'
                    user = (User)SafeParcelReader.createParcelable(parcel, k, User.CREATOR);
                    hashset.add(Integer.valueOf(65));
                    break;

                case 77: // 'M'
                    s1 = SafeParcelReader.createString(parcel, k);
                    hashset.add(Integer.valueOf(77));
                    break;

                case 78: // 'N'
                    s = SafeParcelReader.createString(parcel, k);
                    hashset.add(Integer.valueOf(78));
                    break;

                case 79: // 'O'
                    flag = SafeParcelReader.readBoolean(parcel, k);
                    hashset.add(Integer.valueOf(79));
                    break;

                case 72: // 'H'
                    s3 = SafeParcelReader.createString(parcel, k);
                    hashset.add(Integer.valueOf(72));
                    break;

                case 73: // 'I'
                    s2 = SafeParcelReader.createString(parcel, k);
                    hashset.add(Integer.valueOf(73));
                    break;

                case 74: // 'J'
                    permission = (Permission)SafeParcelReader.createParcelable(parcel, k, Permission.CREATOR);
                    hashset.add(Integer.valueOf(74));
                    break;

                case 75: // 'K'
                    l = SafeParcelReader.readLong(parcel, k);
                    hashset.add(Integer.valueOf(75));
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ParseException((new StringBuilder("Overread allowed size end=")).append(j).toString(), parcel);
            } else
            {
                return new File(hashset, i, s23, flag7, arraylist7, flag6, s22, s21, s20, s19, flag5, s18, s17, flag4, s16, l2, s15, arraylist6, flag3, s14, s13, indexabletext, labels, user1, s12, filelocalid, s11, s10, s9, s8, s7, arraylist5, arraylist4, arraylist3, arraylist2, arraylist1, l1, s6, s5, flag2, s4, user, arraylist, flag1, thumbnail, s3, s2, permission, l, s1, s, flag);
            }
        } while (true);
    }

    public final volatile Object[] newArray(int i)
    {
        return new File[i];
    }
}
