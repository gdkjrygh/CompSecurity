// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.plus.internal.model.moments;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import java.util.HashSet;
import java.util.Set;

// Referenced classes of package com.google.android.gms.plus.internal.model.moments:
//            ItemScopeEntity

public final class ItemScopeEntityCreator
    implements android.os.Parcelable.Creator
{

    public ItemScopeEntityCreator()
    {
    }

    static void writeToParcel(ItemScopeEntity itemscopeentity, Parcel parcel, int i)
    {
        int j = SafeParcelWriter.beginVariableData(parcel, 20293);
        Set set = itemscopeentity.mIndicatorSet;
        if (set.contains(Integer.valueOf(1)))
        {
            SafeParcelWriter.writeInt(parcel, 1, itemscopeentity.mVersionCode);
        }
        if (set.contains(Integer.valueOf(2)))
        {
            SafeParcelWriter.writeParcelable(parcel, 2, itemscopeentity.mAbout, i, true);
        }
        if (set.contains(Integer.valueOf(3)))
        {
            SafeParcelWriter.writeStringList(parcel, 3, itemscopeentity.mAdditionalName, true);
        }
        if (set.contains(Integer.valueOf(4)))
        {
            SafeParcelWriter.writeParcelable(parcel, 4, itemscopeentity.mAddress, i, true);
        }
        if (set.contains(Integer.valueOf(5)))
        {
            SafeParcelWriter.writeString(parcel, 5, itemscopeentity.mAddressCountry, true);
        }
        if (set.contains(Integer.valueOf(6)))
        {
            SafeParcelWriter.writeString(parcel, 6, itemscopeentity.mAddressLocality, true);
        }
        if (set.contains(Integer.valueOf(7)))
        {
            SafeParcelWriter.writeString(parcel, 7, itemscopeentity.mAddressRegion, true);
        }
        if (set.contains(Integer.valueOf(8)))
        {
            SafeParcelWriter.writeTypedList(parcel, 8, itemscopeentity.mAssociated_media, true);
        }
        if (set.contains(Integer.valueOf(9)))
        {
            SafeParcelWriter.writeInt(parcel, 9, itemscopeentity.mAttendeeCount);
        }
        if (set.contains(Integer.valueOf(10)))
        {
            SafeParcelWriter.writeTypedList(parcel, 10, itemscopeentity.mAttendees, true);
        }
        if (set.contains(Integer.valueOf(11)))
        {
            SafeParcelWriter.writeParcelable(parcel, 11, itemscopeentity.mAudio, i, true);
        }
        if (set.contains(Integer.valueOf(12)))
        {
            SafeParcelWriter.writeTypedList(parcel, 12, itemscopeentity.mAuthor, true);
        }
        if (set.contains(Integer.valueOf(13)))
        {
            SafeParcelWriter.writeString(parcel, 13, itemscopeentity.mBestRating, true);
        }
        if (set.contains(Integer.valueOf(14)))
        {
            SafeParcelWriter.writeString(parcel, 14, itemscopeentity.mBirthDate, true);
        }
        if (set.contains(Integer.valueOf(15)))
        {
            SafeParcelWriter.writeParcelable(parcel, 15, itemscopeentity.mByArtist, i, true);
        }
        if (set.contains(Integer.valueOf(17)))
        {
            SafeParcelWriter.writeString(parcel, 17, itemscopeentity.mContentSize, true);
        }
        if (set.contains(Integer.valueOf(16)))
        {
            SafeParcelWriter.writeString(parcel, 16, itemscopeentity.mCaption, true);
        }
        if (set.contains(Integer.valueOf(19)))
        {
            SafeParcelWriter.writeTypedList(parcel, 19, itemscopeentity.mContributor, true);
        }
        if (set.contains(Integer.valueOf(18)))
        {
            SafeParcelWriter.writeString(parcel, 18, itemscopeentity.mContentUrl, true);
        }
        if (set.contains(Integer.valueOf(21)))
        {
            SafeParcelWriter.writeString(parcel, 21, itemscopeentity.mDateModified, true);
        }
        if (set.contains(Integer.valueOf(20)))
        {
            SafeParcelWriter.writeString(parcel, 20, itemscopeentity.mDateCreated, true);
        }
        if (set.contains(Integer.valueOf(23)))
        {
            SafeParcelWriter.writeString(parcel, 23, itemscopeentity.mDescription, true);
        }
        if (set.contains(Integer.valueOf(22)))
        {
            SafeParcelWriter.writeString(parcel, 22, itemscopeentity.mDatePublished, true);
        }
        if (set.contains(Integer.valueOf(25)))
        {
            SafeParcelWriter.writeString(parcel, 25, itemscopeentity.mEmbedUrl, true);
        }
        if (set.contains(Integer.valueOf(24)))
        {
            SafeParcelWriter.writeString(parcel, 24, itemscopeentity.mDuration, true);
        }
        if (set.contains(Integer.valueOf(27)))
        {
            SafeParcelWriter.writeString(parcel, 27, itemscopeentity.mFamilyName, true);
        }
        if (set.contains(Integer.valueOf(26)))
        {
            SafeParcelWriter.writeString(parcel, 26, itemscopeentity.mEndDate, true);
        }
        if (set.contains(Integer.valueOf(29)))
        {
            SafeParcelWriter.writeParcelable(parcel, 29, itemscopeentity.mGeo, i, true);
        }
        if (set.contains(Integer.valueOf(28)))
        {
            SafeParcelWriter.writeString(parcel, 28, itemscopeentity.mGender, true);
        }
        if (set.contains(Integer.valueOf(31)))
        {
            SafeParcelWriter.writeString(parcel, 31, itemscopeentity.mHeight, true);
        }
        if (set.contains(Integer.valueOf(30)))
        {
            SafeParcelWriter.writeString(parcel, 30, itemscopeentity.mGivenName, true);
        }
        if (set.contains(Integer.valueOf(34)))
        {
            SafeParcelWriter.writeParcelable(parcel, 34, itemscopeentity.mInAlbum, i, true);
        }
        if (set.contains(Integer.valueOf(32)))
        {
            SafeParcelWriter.writeString(parcel, 32, itemscopeentity.mId, true);
        }
        if (set.contains(Integer.valueOf(33)))
        {
            SafeParcelWriter.writeString(parcel, 33, itemscopeentity.mImage, true);
        }
        if (set.contains(Integer.valueOf(38)))
        {
            SafeParcelWriter.writeDouble(parcel, 38, itemscopeentity.mLongitude);
        }
        if (set.contains(Integer.valueOf(39)))
        {
            SafeParcelWriter.writeString(parcel, 39, itemscopeentity.mName, true);
        }
        if (set.contains(Integer.valueOf(36)))
        {
            SafeParcelWriter.writeDouble(parcel, 36, itemscopeentity.mLatitude);
        }
        if (set.contains(Integer.valueOf(37)))
        {
            SafeParcelWriter.writeParcelable(parcel, 37, itemscopeentity.mLocation, i, true);
        }
        if (set.contains(Integer.valueOf(42)))
        {
            SafeParcelWriter.writeString(parcel, 42, itemscopeentity.mPlayerType, true);
        }
        if (set.contains(Integer.valueOf(43)))
        {
            SafeParcelWriter.writeString(parcel, 43, itemscopeentity.mPostOfficeBoxNumber, true);
        }
        if (set.contains(Integer.valueOf(40)))
        {
            SafeParcelWriter.writeParcelable(parcel, 40, itemscopeentity.mPartOfTVSeries, i, true);
        }
        if (set.contains(Integer.valueOf(41)))
        {
            SafeParcelWriter.writeTypedList(parcel, 41, itemscopeentity.mPerformers, true);
        }
        if (set.contains(Integer.valueOf(46)))
        {
            SafeParcelWriter.writeParcelable(parcel, 46, itemscopeentity.mReviewRating, i, true);
        }
        if (set.contains(Integer.valueOf(47)))
        {
            SafeParcelWriter.writeString(parcel, 47, itemscopeentity.mStartDate, true);
        }
        if (set.contains(Integer.valueOf(44)))
        {
            SafeParcelWriter.writeString(parcel, 44, itemscopeentity.mPostalCode, true);
        }
        if (set.contains(Integer.valueOf(45)))
        {
            SafeParcelWriter.writeString(parcel, 45, itemscopeentity.mRatingValue, true);
        }
        if (set.contains(Integer.valueOf(51)))
        {
            SafeParcelWriter.writeString(parcel, 51, itemscopeentity.mThumbnailUrl, true);
        }
        if (set.contains(Integer.valueOf(50)))
        {
            SafeParcelWriter.writeParcelable(parcel, 50, itemscopeentity.mThumbnail, i, true);
        }
        if (set.contains(Integer.valueOf(49)))
        {
            SafeParcelWriter.writeString(parcel, 49, itemscopeentity.mText, true);
        }
        if (set.contains(Integer.valueOf(48)))
        {
            SafeParcelWriter.writeString(parcel, 48, itemscopeentity.mStreetAddress, true);
        }
        if (set.contains(Integer.valueOf(55)))
        {
            SafeParcelWriter.writeString(parcel, 55, itemscopeentity.mWidth, true);
        }
        if (set.contains(Integer.valueOf(54)))
        {
            SafeParcelWriter.writeString(parcel, 54, itemscopeentity.mUrl, true);
        }
        if (set.contains(Integer.valueOf(53)))
        {
            SafeParcelWriter.writeString(parcel, 53, itemscopeentity.mType, true);
        }
        if (set.contains(Integer.valueOf(52)))
        {
            SafeParcelWriter.writeString(parcel, 52, itemscopeentity.mTickerSymbol, true);
        }
        if (set.contains(Integer.valueOf(56)))
        {
            SafeParcelWriter.writeString(parcel, 56, itemscopeentity.mWorstRating, true);
        }
        SafeParcelWriter.finishVariableData(parcel, j);
    }

    public final volatile Object createFromParcel(Parcel parcel)
    {
        int k = SafeParcelReader.validateObjectHeader(parcel);
        HashSet hashset = new HashSet();
        int j = 0;
        ItemScopeEntity itemscopeentity9 = null;
        java.util.ArrayList arraylist5 = null;
        ItemScopeEntity itemscopeentity8 = null;
        String s34 = null;
        String s33 = null;
        String s32 = null;
        java.util.ArrayList arraylist4 = null;
        int i = 0;
        java.util.ArrayList arraylist3 = null;
        ItemScopeEntity itemscopeentity7 = null;
        java.util.ArrayList arraylist2 = null;
        String s31 = null;
        String s30 = null;
        ItemScopeEntity itemscopeentity6 = null;
        String s29 = null;
        String s28 = null;
        String s27 = null;
        java.util.ArrayList arraylist1 = null;
        String s26 = null;
        String s25 = null;
        String s24 = null;
        String s23 = null;
        String s22 = null;
        String s21 = null;
        String s20 = null;
        String s19 = null;
        String s18 = null;
        ItemScopeEntity itemscopeentity5 = null;
        String s17 = null;
        String s16 = null;
        String s15 = null;
        String s14 = null;
        ItemScopeEntity itemscopeentity4 = null;
        double d1 = 0.0D;
        ItemScopeEntity itemscopeentity3 = null;
        double d = 0.0D;
        String s13 = null;
        ItemScopeEntity itemscopeentity2 = null;
        java.util.ArrayList arraylist = null;
        String s12 = null;
        String s11 = null;
        String s10 = null;
        String s9 = null;
        ItemScopeEntity itemscopeentity1 = null;
        String s8 = null;
        String s7 = null;
        String s6 = null;
        ItemScopeEntity itemscopeentity = null;
        String s5 = null;
        String s4 = null;
        String s3 = null;
        String s2 = null;
        String s1 = null;
        String s = null;
        do
        {
            if (parcel.dataPosition() < k)
            {
                int l = parcel.readInt();
                switch (0xffff & l)
                {
                case 35: // '#'
                default:
                    SafeParcelReader.skipUnknownField(parcel, l);
                    break;

                case 1: // '\001'
                    j = SafeParcelReader.readInt(parcel, l);
                    hashset.add(Integer.valueOf(1));
                    break;

                case 2: // '\002'
                    itemscopeentity9 = (ItemScopeEntity)SafeParcelReader.createParcelable(parcel, l, ItemScopeEntity.CREATOR);
                    hashset.add(Integer.valueOf(2));
                    break;

                case 3: // '\003'
                    arraylist5 = SafeParcelReader.createStringList(parcel, l);
                    hashset.add(Integer.valueOf(3));
                    break;

                case 4: // '\004'
                    itemscopeentity8 = (ItemScopeEntity)SafeParcelReader.createParcelable(parcel, l, ItemScopeEntity.CREATOR);
                    hashset.add(Integer.valueOf(4));
                    break;

                case 5: // '\005'
                    s34 = SafeParcelReader.createString(parcel, l);
                    hashset.add(Integer.valueOf(5));
                    break;

                case 6: // '\006'
                    s33 = SafeParcelReader.createString(parcel, l);
                    hashset.add(Integer.valueOf(6));
                    break;

                case 7: // '\007'
                    s32 = SafeParcelReader.createString(parcel, l);
                    hashset.add(Integer.valueOf(7));
                    break;

                case 8: // '\b'
                    arraylist4 = SafeParcelReader.createTypedList(parcel, l, ItemScopeEntity.CREATOR);
                    hashset.add(Integer.valueOf(8));
                    break;

                case 9: // '\t'
                    i = SafeParcelReader.readInt(parcel, l);
                    hashset.add(Integer.valueOf(9));
                    break;

                case 10: // '\n'
                    arraylist3 = SafeParcelReader.createTypedList(parcel, l, ItemScopeEntity.CREATOR);
                    hashset.add(Integer.valueOf(10));
                    break;

                case 11: // '\013'
                    itemscopeentity7 = (ItemScopeEntity)SafeParcelReader.createParcelable(parcel, l, ItemScopeEntity.CREATOR);
                    hashset.add(Integer.valueOf(11));
                    break;

                case 12: // '\f'
                    arraylist2 = SafeParcelReader.createTypedList(parcel, l, ItemScopeEntity.CREATOR);
                    hashset.add(Integer.valueOf(12));
                    break;

                case 13: // '\r'
                    s31 = SafeParcelReader.createString(parcel, l);
                    hashset.add(Integer.valueOf(13));
                    break;

                case 14: // '\016'
                    s30 = SafeParcelReader.createString(parcel, l);
                    hashset.add(Integer.valueOf(14));
                    break;

                case 15: // '\017'
                    itemscopeentity6 = (ItemScopeEntity)SafeParcelReader.createParcelable(parcel, l, ItemScopeEntity.CREATOR);
                    hashset.add(Integer.valueOf(15));
                    break;

                case 17: // '\021'
                    s28 = SafeParcelReader.createString(parcel, l);
                    hashset.add(Integer.valueOf(17));
                    break;

                case 16: // '\020'
                    s29 = SafeParcelReader.createString(parcel, l);
                    hashset.add(Integer.valueOf(16));
                    break;

                case 19: // '\023'
                    arraylist1 = SafeParcelReader.createTypedList(parcel, l, ItemScopeEntity.CREATOR);
                    hashset.add(Integer.valueOf(19));
                    break;

                case 18: // '\022'
                    s27 = SafeParcelReader.createString(parcel, l);
                    hashset.add(Integer.valueOf(18));
                    break;

                case 21: // '\025'
                    s25 = SafeParcelReader.createString(parcel, l);
                    hashset.add(Integer.valueOf(21));
                    break;

                case 20: // '\024'
                    s26 = SafeParcelReader.createString(parcel, l);
                    hashset.add(Integer.valueOf(20));
                    break;

                case 23: // '\027'
                    s23 = SafeParcelReader.createString(parcel, l);
                    hashset.add(Integer.valueOf(23));
                    break;

                case 22: // '\026'
                    s24 = SafeParcelReader.createString(parcel, l);
                    hashset.add(Integer.valueOf(22));
                    break;

                case 25: // '\031'
                    s21 = SafeParcelReader.createString(parcel, l);
                    hashset.add(Integer.valueOf(25));
                    break;

                case 24: // '\030'
                    s22 = SafeParcelReader.createString(parcel, l);
                    hashset.add(Integer.valueOf(24));
                    break;

                case 27: // '\033'
                    s19 = SafeParcelReader.createString(parcel, l);
                    hashset.add(Integer.valueOf(27));
                    break;

                case 26: // '\032'
                    s20 = SafeParcelReader.createString(parcel, l);
                    hashset.add(Integer.valueOf(26));
                    break;

                case 29: // '\035'
                    itemscopeentity5 = (ItemScopeEntity)SafeParcelReader.createParcelable(parcel, l, ItemScopeEntity.CREATOR);
                    hashset.add(Integer.valueOf(29));
                    break;

                case 28: // '\034'
                    s18 = SafeParcelReader.createString(parcel, l);
                    hashset.add(Integer.valueOf(28));
                    break;

                case 31: // '\037'
                    s16 = SafeParcelReader.createString(parcel, l);
                    hashset.add(Integer.valueOf(31));
                    break;

                case 30: // '\036'
                    s17 = SafeParcelReader.createString(parcel, l);
                    hashset.add(Integer.valueOf(30));
                    break;

                case 34: // '"'
                    itemscopeentity4 = (ItemScopeEntity)SafeParcelReader.createParcelable(parcel, l, ItemScopeEntity.CREATOR);
                    hashset.add(Integer.valueOf(34));
                    break;

                case 32: // ' '
                    s15 = SafeParcelReader.createString(parcel, l);
                    hashset.add(Integer.valueOf(32));
                    break;

                case 33: // '!'
                    s14 = SafeParcelReader.createString(parcel, l);
                    hashset.add(Integer.valueOf(33));
                    break;

                case 38: // '&'
                    d = SafeParcelReader.readDouble(parcel, l);
                    hashset.add(Integer.valueOf(38));
                    break;

                case 39: // '\''
                    s13 = SafeParcelReader.createString(parcel, l);
                    hashset.add(Integer.valueOf(39));
                    break;

                case 36: // '$'
                    d1 = SafeParcelReader.readDouble(parcel, l);
                    hashset.add(Integer.valueOf(36));
                    break;

                case 37: // '%'
                    itemscopeentity3 = (ItemScopeEntity)SafeParcelReader.createParcelable(parcel, l, ItemScopeEntity.CREATOR);
                    hashset.add(Integer.valueOf(37));
                    break;

                case 42: // '*'
                    s12 = SafeParcelReader.createString(parcel, l);
                    hashset.add(Integer.valueOf(42));
                    break;

                case 43: // '+'
                    s11 = SafeParcelReader.createString(parcel, l);
                    hashset.add(Integer.valueOf(43));
                    break;

                case 40: // '('
                    itemscopeentity2 = (ItemScopeEntity)SafeParcelReader.createParcelable(parcel, l, ItemScopeEntity.CREATOR);
                    hashset.add(Integer.valueOf(40));
                    break;

                case 41: // ')'
                    arraylist = SafeParcelReader.createTypedList(parcel, l, ItemScopeEntity.CREATOR);
                    hashset.add(Integer.valueOf(41));
                    break;

                case 46: // '.'
                    itemscopeentity1 = (ItemScopeEntity)SafeParcelReader.createParcelable(parcel, l, ItemScopeEntity.CREATOR);
                    hashset.add(Integer.valueOf(46));
                    break;

                case 47: // '/'
                    s8 = SafeParcelReader.createString(parcel, l);
                    hashset.add(Integer.valueOf(47));
                    break;

                case 44: // ','
                    s10 = SafeParcelReader.createString(parcel, l);
                    hashset.add(Integer.valueOf(44));
                    break;

                case 45: // '-'
                    s9 = SafeParcelReader.createString(parcel, l);
                    hashset.add(Integer.valueOf(45));
                    break;

                case 51: // '3'
                    s5 = SafeParcelReader.createString(parcel, l);
                    hashset.add(Integer.valueOf(51));
                    break;

                case 50: // '2'
                    itemscopeentity = (ItemScopeEntity)SafeParcelReader.createParcelable(parcel, l, ItemScopeEntity.CREATOR);
                    hashset.add(Integer.valueOf(50));
                    break;

                case 49: // '1'
                    s6 = SafeParcelReader.createString(parcel, l);
                    hashset.add(Integer.valueOf(49));
                    break;

                case 48: // '0'
                    s7 = SafeParcelReader.createString(parcel, l);
                    hashset.add(Integer.valueOf(48));
                    break;

                case 55: // '7'
                    s1 = SafeParcelReader.createString(parcel, l);
                    hashset.add(Integer.valueOf(55));
                    break;

                case 54: // '6'
                    s2 = SafeParcelReader.createString(parcel, l);
                    hashset.add(Integer.valueOf(54));
                    break;

                case 53: // '5'
                    s3 = SafeParcelReader.createString(parcel, l);
                    hashset.add(Integer.valueOf(53));
                    break;

                case 52: // '4'
                    s4 = SafeParcelReader.createString(parcel, l);
                    hashset.add(Integer.valueOf(52));
                    break;

                case 56: // '8'
                    s = SafeParcelReader.createString(parcel, l);
                    hashset.add(Integer.valueOf(56));
                    break;
                }
            } else
            {
                if (parcel.dataPosition() != k)
                {
                    throw new com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ParseException((new StringBuilder("Overread allowed size end=")).append(k).toString(), parcel);
                }
                return new ItemScopeEntity(hashset, j, itemscopeentity9, arraylist5, itemscopeentity8, s34, s33, s32, arraylist4, i, arraylist3, itemscopeentity7, arraylist2, s31, s30, itemscopeentity6, s29, s28, s27, arraylist1, s26, s25, s24, s23, s22, s21, s20, s19, s18, itemscopeentity5, s17, s16, s15, s14, itemscopeentity4, d1, itemscopeentity3, d, s13, itemscopeentity2, arraylist, s12, s11, s10, s9, itemscopeentity1, s8, s7, s6, itemscopeentity, s5, s4, s3, s2, s1, s);
            }
        } while (true);
    }

    public final volatile Object[] newArray(int i)
    {
        return new ItemScopeEntity[i];
    }
}
