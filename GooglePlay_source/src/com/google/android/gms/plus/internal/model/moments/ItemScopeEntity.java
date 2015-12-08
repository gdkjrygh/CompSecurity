// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.plus.internal.model.moments;

import android.os.Parcel;
import com.google.android.gms.common.server.response.FastJsonResponse;
import com.google.android.gms.common.server.response.FastSafeParcelableJsonResponse;
import com.google.android.gms.plus.model.moments.ItemScope;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.google.android.gms.plus.internal.model.moments:
//            ItemScopeEntityCreator

public final class ItemScopeEntity extends FastSafeParcelableJsonResponse
    implements ItemScope
{

    public static final ItemScopeEntityCreator CREATOR = new ItemScopeEntityCreator();
    private static final HashMap sFields;
    ItemScopeEntity mAbout;
    List mAdditionalName;
    ItemScopeEntity mAddress;
    String mAddressCountry;
    String mAddressLocality;
    String mAddressRegion;
    List mAssociated_media;
    int mAttendeeCount;
    List mAttendees;
    ItemScopeEntity mAudio;
    List mAuthor;
    String mBestRating;
    String mBirthDate;
    ItemScopeEntity mByArtist;
    String mCaption;
    String mContentSize;
    String mContentUrl;
    List mContributor;
    String mDateCreated;
    String mDateModified;
    String mDatePublished;
    String mDescription;
    String mDuration;
    String mEmbedUrl;
    String mEndDate;
    String mFamilyName;
    String mGender;
    ItemScopeEntity mGeo;
    String mGivenName;
    String mHeight;
    String mId;
    String mImage;
    ItemScopeEntity mInAlbum;
    final Set mIndicatorSet;
    double mLatitude;
    ItemScopeEntity mLocation;
    double mLongitude;
    String mName;
    ItemScopeEntity mPartOfTVSeries;
    List mPerformers;
    String mPlayerType;
    String mPostOfficeBoxNumber;
    String mPostalCode;
    String mRatingValue;
    ItemScopeEntity mReviewRating;
    String mStartDate;
    String mStreetAddress;
    String mText;
    ItemScopeEntity mThumbnail;
    String mThumbnailUrl;
    String mTickerSymbol;
    String mType;
    String mUrl;
    final int mVersionCode;
    String mWidth;
    String mWorstRating;

    public ItemScopeEntity()
    {
        mVersionCode = 1;
        mIndicatorSet = new HashSet();
    }

    ItemScopeEntity(Set set, int i, ItemScopeEntity itemscopeentity, List list, ItemScopeEntity itemscopeentity1, String s, String s1, 
            String s2, List list1, int j, List list2, ItemScopeEntity itemscopeentity2, List list3, String s3, 
            String s4, ItemScopeEntity itemscopeentity3, String s5, String s6, String s7, List list4, String s8, 
            String s9, String s10, String s11, String s12, String s13, String s14, String s15, 
            String s16, ItemScopeEntity itemscopeentity4, String s17, String s18, String s19, String s20, ItemScopeEntity itemscopeentity5, 
            double d, ItemScopeEntity itemscopeentity6, double d1, String s21, ItemScopeEntity itemscopeentity7, 
            List list5, String s22, String s23, String s24, String s25, ItemScopeEntity itemscopeentity8, String s26, 
            String s27, String s28, ItemScopeEntity itemscopeentity9, String s29, String s30, String s31, String s32, 
            String s33, String s34)
    {
        mIndicatorSet = set;
        mVersionCode = i;
        mAbout = itemscopeentity;
        mAdditionalName = list;
        mAddress = itemscopeentity1;
        mAddressCountry = s;
        mAddressLocality = s1;
        mAddressRegion = s2;
        mAssociated_media = list1;
        mAttendeeCount = j;
        mAttendees = list2;
        mAudio = itemscopeentity2;
        mAuthor = list3;
        mBestRating = s3;
        mBirthDate = s4;
        mByArtist = itemscopeentity3;
        mCaption = s5;
        mContentSize = s6;
        mContentUrl = s7;
        mContributor = list4;
        mDateCreated = s8;
        mDateModified = s9;
        mDatePublished = s10;
        mDescription = s11;
        mDuration = s12;
        mEmbedUrl = s13;
        mEndDate = s14;
        mFamilyName = s15;
        mGender = s16;
        mGeo = itemscopeentity4;
        mGivenName = s17;
        mHeight = s18;
        mId = s19;
        mImage = s20;
        mInAlbum = itemscopeentity5;
        mLatitude = d;
        mLocation = itemscopeentity6;
        mLongitude = d1;
        mName = s21;
        mPartOfTVSeries = itemscopeentity7;
        mPerformers = list5;
        mPlayerType = s22;
        mPostOfficeBoxNumber = s23;
        mPostalCode = s24;
        mRatingValue = s25;
        mReviewRating = itemscopeentity8;
        mStartDate = s26;
        mStreetAddress = s27;
        mText = s28;
        mThumbnail = itemscopeentity9;
        mThumbnailUrl = s29;
        mTickerSymbol = s30;
        mType = s31;
        mUrl = s32;
        mWidth = s33;
        mWorstRating = s34;
    }

    public final void addConcreteTypeArrayInternal(com.google.android.gms.common.server.response.FastJsonResponse.Field field, String s, ArrayList arraylist)
    {
        int i = field.getSafeParcelableFieldId();
        i;
        JVM INSTR lookupswitch 5: default 60
    //                   8: 108
    //                   10: 129
    //                   12: 137
    //                   19: 145
    //                   41: 153;
           goto _L1 _L2 _L3 _L4 _L5 _L6
_L1:
        throw new IllegalArgumentException((new StringBuilder("Field with id=")).append(i).append(" is not a known array of custom type.  Found ").append(arraylist.getClass().getCanonicalName()).append(".").toString());
_L2:
        mAssociated_media = arraylist;
_L8:
        mIndicatorSet.add(Integer.valueOf(i));
        return;
_L3:
        mAttendees = arraylist;
        continue; /* Loop/switch isn't completed */
_L4:
        mAuthor = arraylist;
        continue; /* Loop/switch isn't completed */
_L5:
        mContributor = arraylist;
        continue; /* Loop/switch isn't completed */
_L6:
        mPerformers = arraylist;
        if (true) goto _L8; else goto _L7
_L7:
    }

    public final void addConcreteTypeInternal(com.google.android.gms.common.server.response.FastJsonResponse.Field field, String s, FastJsonResponse fastjsonresponse)
    {
        int i = field.getSafeParcelableFieldId();
        i;
        JVM INSTR lookupswitch 10: default 100
    //                   2: 148
    //                   4: 172
    //                   11: 183
    //                   15: 194
    //                   29: 205
    //                   34: 216
    //                   37: 227
    //                   40: 238
    //                   46: 249
    //                   50: 260;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10 _L11
_L1:
        throw new IllegalArgumentException((new StringBuilder("Field with id=")).append(i).append(" is not a known custom type.  Found ").append(fastjsonresponse.getClass().getCanonicalName()).append(".").toString());
_L2:
        mAbout = (ItemScopeEntity)fastjsonresponse;
_L13:
        mIndicatorSet.add(Integer.valueOf(i));
        return;
_L3:
        mAddress = (ItemScopeEntity)fastjsonresponse;
        continue; /* Loop/switch isn't completed */
_L4:
        mAudio = (ItemScopeEntity)fastjsonresponse;
        continue; /* Loop/switch isn't completed */
_L5:
        mByArtist = (ItemScopeEntity)fastjsonresponse;
        continue; /* Loop/switch isn't completed */
_L6:
        mGeo = (ItemScopeEntity)fastjsonresponse;
        continue; /* Loop/switch isn't completed */
_L7:
        mInAlbum = (ItemScopeEntity)fastjsonresponse;
        continue; /* Loop/switch isn't completed */
_L8:
        mLocation = (ItemScopeEntity)fastjsonresponse;
        continue; /* Loop/switch isn't completed */
_L9:
        mPartOfTVSeries = (ItemScopeEntity)fastjsonresponse;
        continue; /* Loop/switch isn't completed */
_L10:
        mReviewRating = (ItemScopeEntity)fastjsonresponse;
        continue; /* Loop/switch isn't completed */
_L11:
        mThumbnail = (ItemScopeEntity)fastjsonresponse;
        if (true) goto _L13; else goto _L12
_L12:
    }

    public final int describeContents()
    {
        return 0;
    }

    public final boolean equals(Object obj)
    {
        if (obj instanceof ItemScopeEntity) goto _L2; else goto _L1
_L1:
        return false;
_L2:
        Iterator iterator;
        if (this == obj)
        {
            return true;
        }
        obj = (ItemScopeEntity)obj;
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
        if (!((ItemScopeEntity) (obj)).isFieldSet(field)) goto _L1; else goto _L3
_L3:
        if (getFieldValue(field).equals(((ItemScopeEntity) (obj)).getFieldValue(field))) goto _L5; else goto _L4
_L4:
        return false;
        if (!((ItemScopeEntity) (obj)).isFieldSet(field)) goto _L5; else goto _L6
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
        case 35: // '#'
        default:
            throw new IllegalStateException((new StringBuilder("Unknown safe parcelable id=")).append(field.getSafeParcelableFieldId()).toString());

        case 2: // '\002'
            return mAbout;

        case 3: // '\003'
            return mAdditionalName;

        case 4: // '\004'
            return mAddress;

        case 5: // '\005'
            return mAddressCountry;

        case 6: // '\006'
            return mAddressLocality;

        case 7: // '\007'
            return mAddressRegion;

        case 8: // '\b'
            return mAssociated_media;

        case 9: // '\t'
            return Integer.valueOf(mAttendeeCount);

        case 10: // '\n'
            return mAttendees;

        case 11: // '\013'
            return mAudio;

        case 12: // '\f'
            return mAuthor;

        case 13: // '\r'
            return mBestRating;

        case 14: // '\016'
            return mBirthDate;

        case 15: // '\017'
            return mByArtist;

        case 16: // '\020'
            return mCaption;

        case 17: // '\021'
            return mContentSize;

        case 18: // '\022'
            return mContentUrl;

        case 19: // '\023'
            return mContributor;

        case 20: // '\024'
            return mDateCreated;

        case 21: // '\025'
            return mDateModified;

        case 22: // '\026'
            return mDatePublished;

        case 23: // '\027'
            return mDescription;

        case 24: // '\030'
            return mDuration;

        case 25: // '\031'
            return mEmbedUrl;

        case 26: // '\032'
            return mEndDate;

        case 27: // '\033'
            return mFamilyName;

        case 28: // '\034'
            return mGender;

        case 29: // '\035'
            return mGeo;

        case 30: // '\036'
            return mGivenName;

        case 31: // '\037'
            return mHeight;

        case 32: // ' '
            return mId;

        case 33: // '!'
            return mImage;

        case 34: // '"'
            return mInAlbum;

        case 36: // '$'
            return Double.valueOf(mLatitude);

        case 37: // '%'
            return mLocation;

        case 38: // '&'
            return Double.valueOf(mLongitude);

        case 39: // '\''
            return mName;

        case 40: // '('
            return mPartOfTVSeries;

        case 41: // ')'
            return mPerformers;

        case 42: // '*'
            return mPlayerType;

        case 43: // '+'
            return mPostOfficeBoxNumber;

        case 44: // ','
            return mPostalCode;

        case 45: // '-'
            return mRatingValue;

        case 46: // '.'
            return mReviewRating;

        case 47: // '/'
            return mStartDate;

        case 48: // '0'
            return mStreetAddress;

        case 49: // '1'
            return mText;

        case 50: // '2'
            return mThumbnail;

        case 51: // '3'
            return mThumbnailUrl;

        case 52: // '4'
            return mTickerSymbol;

        case 53: // '5'
            return mType;

        case 54: // '6'
            return mUrl;

        case 55: // '7'
            return mWidth;

        case 56: // '8'
            return mWorstRating;
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

    protected final void setDoubleInternal(com.google.android.gms.common.server.response.FastJsonResponse.Field field, String s, double d)
    {
        int i = field.getSafeParcelableFieldId();
        i;
        JVM INSTR tableswitch 36 38: default 36
    //                   36 68
    //                   37 36
    //                   38 89;
           goto _L1 _L2 _L1 _L3
_L1:
        throw new IllegalArgumentException((new StringBuilder("Field with id=")).append(i).append(" is not known to be a double.").toString());
_L2:
        mLatitude = d;
_L5:
        mIndicatorSet.add(Integer.valueOf(i));
        return;
_L3:
        mLongitude = d;
        if (true) goto _L5; else goto _L4
_L4:
    }

    protected final void setIntegerInternal(com.google.android.gms.common.server.response.FastJsonResponse.Field field, String s, int i)
    {
        int j = field.getSafeParcelableFieldId();
        switch (j)
        {
        default:
            throw new IllegalArgumentException((new StringBuilder("Field with id=")).append(j).append(" is not known to be an int.").toString());

        case 9: // '\t'
            mAttendeeCount = i;
            break;
        }
        mIndicatorSet.add(Integer.valueOf(j));
    }

    protected final void setStringInternal(com.google.android.gms.common.server.response.FastJsonResponse.Field field, String s, String s1)
    {
        int i = field.getSafeParcelableFieldId();
        i;
        JVM INSTR tableswitch 5 56: default 232
    //                   5 264
    //                   6 285
    //                   7 293
    //                   8 232
    //                   9 232
    //                   10 232
    //                   11 232
    //                   12 232
    //                   13 301
    //                   14 309
    //                   15 232
    //                   16 317
    //                   17 325
    //                   18 333
    //                   19 232
    //                   20 341
    //                   21 349
    //                   22 357
    //                   23 365
    //                   24 373
    //                   25 381
    //                   26 389
    //                   27 397
    //                   28 405
    //                   29 232
    //                   30 413
    //                   31 421
    //                   32 429
    //                   33 437
    //                   34 232
    //                   35 232
    //                   36 232
    //                   37 232
    //                   38 232
    //                   39 445
    //                   40 232
    //                   41 232
    //                   42 453
    //                   43 461
    //                   44 469
    //                   45 477
    //                   46 232
    //                   47 485
    //                   48 493
    //                   49 501
    //                   50 232
    //                   51 509
    //                   52 517
    //                   53 525
    //                   54 533
    //                   55 541
    //                   56 549;
           goto _L1 _L2 _L3 _L4 _L1 _L1 _L1 _L1 _L1 _L5 _L6 _L1 _L7 _L8 _L9 _L1 _L10 _L11 _L12 _L13 _L14 _L15 _L16 _L17 _L18 _L1 _L19 _L20 _L21 _L22 _L1 _L1 _L1 _L1 _L1 _L23 _L1 _L1 _L24 _L25 _L26 _L27 _L1 _L28 _L29 _L30 _L1 _L31 _L32 _L33 _L34 _L35 _L36
_L1:
        throw new IllegalArgumentException((new StringBuilder("Field with id=")).append(i).append(" is not known to be a String.").toString());
_L2:
        mAddressCountry = s1;
_L38:
        mIndicatorSet.add(Integer.valueOf(i));
        return;
_L3:
        mAddressLocality = s1;
        continue; /* Loop/switch isn't completed */
_L4:
        mAddressRegion = s1;
        continue; /* Loop/switch isn't completed */
_L5:
        mBestRating = s1;
        continue; /* Loop/switch isn't completed */
_L6:
        mBirthDate = s1;
        continue; /* Loop/switch isn't completed */
_L7:
        mCaption = s1;
        continue; /* Loop/switch isn't completed */
_L8:
        mContentSize = s1;
        continue; /* Loop/switch isn't completed */
_L9:
        mContentUrl = s1;
        continue; /* Loop/switch isn't completed */
_L10:
        mDateCreated = s1;
        continue; /* Loop/switch isn't completed */
_L11:
        mDateModified = s1;
        continue; /* Loop/switch isn't completed */
_L12:
        mDatePublished = s1;
        continue; /* Loop/switch isn't completed */
_L13:
        mDescription = s1;
        continue; /* Loop/switch isn't completed */
_L14:
        mDuration = s1;
        continue; /* Loop/switch isn't completed */
_L15:
        mEmbedUrl = s1;
        continue; /* Loop/switch isn't completed */
_L16:
        mEndDate = s1;
        continue; /* Loop/switch isn't completed */
_L17:
        mFamilyName = s1;
        continue; /* Loop/switch isn't completed */
_L18:
        mGender = s1;
        continue; /* Loop/switch isn't completed */
_L19:
        mGivenName = s1;
        continue; /* Loop/switch isn't completed */
_L20:
        mHeight = s1;
        continue; /* Loop/switch isn't completed */
_L21:
        mId = s1;
        continue; /* Loop/switch isn't completed */
_L22:
        mImage = s1;
        continue; /* Loop/switch isn't completed */
_L23:
        mName = s1;
        continue; /* Loop/switch isn't completed */
_L24:
        mPlayerType = s1;
        continue; /* Loop/switch isn't completed */
_L25:
        mPostOfficeBoxNumber = s1;
        continue; /* Loop/switch isn't completed */
_L26:
        mPostalCode = s1;
        continue; /* Loop/switch isn't completed */
_L27:
        mRatingValue = s1;
        continue; /* Loop/switch isn't completed */
_L28:
        mStartDate = s1;
        continue; /* Loop/switch isn't completed */
_L29:
        mStreetAddress = s1;
        continue; /* Loop/switch isn't completed */
_L30:
        mText = s1;
        continue; /* Loop/switch isn't completed */
_L31:
        mThumbnailUrl = s1;
        continue; /* Loop/switch isn't completed */
_L32:
        mTickerSymbol = s1;
        continue; /* Loop/switch isn't completed */
_L33:
        mType = s1;
        continue; /* Loop/switch isn't completed */
_L34:
        mUrl = s1;
        continue; /* Loop/switch isn't completed */
_L35:
        mWidth = s1;
        continue; /* Loop/switch isn't completed */
_L36:
        mWorstRating = s1;
        if (true) goto _L38; else goto _L37
_L37:
    }

    protected final void setStringsInternal(com.google.android.gms.common.server.response.FastJsonResponse.Field field, String s, ArrayList arraylist)
    {
        int i = field.getSafeParcelableFieldId();
        switch (i)
        {
        default:
            throw new IllegalArgumentException((new StringBuilder("Field with id=")).append(i).append(" is not known to be an array of String.").toString());

        case 3: // '\003'
            mAdditionalName = arraylist;
            break;
        }
        mIndicatorSet.add(Integer.valueOf(i));
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        ItemScopeEntityCreator.writeToParcel(this, parcel, i);
    }

    static 
    {
        HashMap hashmap = new HashMap();
        sFields = hashmap;
        hashmap.put("about", com.google.android.gms.common.server.response.FastJsonResponse.Field.forConcreteType("about", 2, com/google/android/gms/plus/internal/model/moments/ItemScopeEntity));
        sFields.put("additionalName", com.google.android.gms.common.server.response.FastJsonResponse.Field.forStrings("additionalName", 3));
        sFields.put("address", com.google.android.gms.common.server.response.FastJsonResponse.Field.forConcreteType("address", 4, com/google/android/gms/plus/internal/model/moments/ItemScopeEntity));
        sFields.put("addressCountry", com.google.android.gms.common.server.response.FastJsonResponse.Field.forString("addressCountry", 5));
        sFields.put("addressLocality", com.google.android.gms.common.server.response.FastJsonResponse.Field.forString("addressLocality", 6));
        sFields.put("addressRegion", com.google.android.gms.common.server.response.FastJsonResponse.Field.forString("addressRegion", 7));
        sFields.put("associated_media", com.google.android.gms.common.server.response.FastJsonResponse.Field.forConcreteTypeArray("associated_media", 8, com/google/android/gms/plus/internal/model/moments/ItemScopeEntity));
        sFields.put("attendeeCount", com.google.android.gms.common.server.response.FastJsonResponse.Field.forInteger("attendeeCount", 9));
        sFields.put("attendees", com.google.android.gms.common.server.response.FastJsonResponse.Field.forConcreteTypeArray("attendees", 10, com/google/android/gms/plus/internal/model/moments/ItemScopeEntity));
        sFields.put("audio", com.google.android.gms.common.server.response.FastJsonResponse.Field.forConcreteType("audio", 11, com/google/android/gms/plus/internal/model/moments/ItemScopeEntity));
        sFields.put("author", com.google.android.gms.common.server.response.FastJsonResponse.Field.forConcreteTypeArray("author", 12, com/google/android/gms/plus/internal/model/moments/ItemScopeEntity));
        sFields.put("bestRating", com.google.android.gms.common.server.response.FastJsonResponse.Field.forString("bestRating", 13));
        sFields.put("birthDate", com.google.android.gms.common.server.response.FastJsonResponse.Field.forString("birthDate", 14));
        sFields.put("byArtist", com.google.android.gms.common.server.response.FastJsonResponse.Field.forConcreteType("byArtist", 15, com/google/android/gms/plus/internal/model/moments/ItemScopeEntity));
        sFields.put("caption", com.google.android.gms.common.server.response.FastJsonResponse.Field.forString("caption", 16));
        sFields.put("contentSize", com.google.android.gms.common.server.response.FastJsonResponse.Field.forString("contentSize", 17));
        sFields.put("contentUrl", com.google.android.gms.common.server.response.FastJsonResponse.Field.forString("contentUrl", 18));
        sFields.put("contributor", com.google.android.gms.common.server.response.FastJsonResponse.Field.forConcreteTypeArray("contributor", 19, com/google/android/gms/plus/internal/model/moments/ItemScopeEntity));
        sFields.put("dateCreated", com.google.android.gms.common.server.response.FastJsonResponse.Field.forString("dateCreated", 20));
        sFields.put("dateModified", com.google.android.gms.common.server.response.FastJsonResponse.Field.forString("dateModified", 21));
        sFields.put("datePublished", com.google.android.gms.common.server.response.FastJsonResponse.Field.forString("datePublished", 22));
        sFields.put("description", com.google.android.gms.common.server.response.FastJsonResponse.Field.forString("description", 23));
        sFields.put("duration", com.google.android.gms.common.server.response.FastJsonResponse.Field.forString("duration", 24));
        sFields.put("embedUrl", com.google.android.gms.common.server.response.FastJsonResponse.Field.forString("embedUrl", 25));
        sFields.put("endDate", com.google.android.gms.common.server.response.FastJsonResponse.Field.forString("endDate", 26));
        sFields.put("familyName", com.google.android.gms.common.server.response.FastJsonResponse.Field.forString("familyName", 27));
        sFields.put("gender", com.google.android.gms.common.server.response.FastJsonResponse.Field.forString("gender", 28));
        sFields.put("geo", com.google.android.gms.common.server.response.FastJsonResponse.Field.forConcreteType("geo", 29, com/google/android/gms/plus/internal/model/moments/ItemScopeEntity));
        sFields.put("givenName", com.google.android.gms.common.server.response.FastJsonResponse.Field.forString("givenName", 30));
        sFields.put("height", com.google.android.gms.common.server.response.FastJsonResponse.Field.forString("height", 31));
        sFields.put("id", com.google.android.gms.common.server.response.FastJsonResponse.Field.forString("id", 32));
        sFields.put("image", com.google.android.gms.common.server.response.FastJsonResponse.Field.forString("image", 33));
        sFields.put("inAlbum", com.google.android.gms.common.server.response.FastJsonResponse.Field.forConcreteType("inAlbum", 34, com/google/android/gms/plus/internal/model/moments/ItemScopeEntity));
        sFields.put("latitude", com.google.android.gms.common.server.response.FastJsonResponse.Field.forDouble("latitude", 36));
        sFields.put("location", com.google.android.gms.common.server.response.FastJsonResponse.Field.forConcreteType("location", 37, com/google/android/gms/plus/internal/model/moments/ItemScopeEntity));
        sFields.put("longitude", com.google.android.gms.common.server.response.FastJsonResponse.Field.forDouble("longitude", 38));
        sFields.put("name", com.google.android.gms.common.server.response.FastJsonResponse.Field.forString("name", 39));
        sFields.put("partOfTVSeries", com.google.android.gms.common.server.response.FastJsonResponse.Field.forConcreteType("partOfTVSeries", 40, com/google/android/gms/plus/internal/model/moments/ItemScopeEntity));
        sFields.put("performers", com.google.android.gms.common.server.response.FastJsonResponse.Field.forConcreteTypeArray("performers", 41, com/google/android/gms/plus/internal/model/moments/ItemScopeEntity));
        sFields.put("playerType", com.google.android.gms.common.server.response.FastJsonResponse.Field.forString("playerType", 42));
        sFields.put("postOfficeBoxNumber", com.google.android.gms.common.server.response.FastJsonResponse.Field.forString("postOfficeBoxNumber", 43));
        sFields.put("postalCode", com.google.android.gms.common.server.response.FastJsonResponse.Field.forString("postalCode", 44));
        sFields.put("ratingValue", com.google.android.gms.common.server.response.FastJsonResponse.Field.forString("ratingValue", 45));
        sFields.put("reviewRating", com.google.android.gms.common.server.response.FastJsonResponse.Field.forConcreteType("reviewRating", 46, com/google/android/gms/plus/internal/model/moments/ItemScopeEntity));
        sFields.put("startDate", com.google.android.gms.common.server.response.FastJsonResponse.Field.forString("startDate", 47));
        sFields.put("streetAddress", com.google.android.gms.common.server.response.FastJsonResponse.Field.forString("streetAddress", 48));
        sFields.put("text", com.google.android.gms.common.server.response.FastJsonResponse.Field.forString("text", 49));
        sFields.put("thumbnail", com.google.android.gms.common.server.response.FastJsonResponse.Field.forConcreteType("thumbnail", 50, com/google/android/gms/plus/internal/model/moments/ItemScopeEntity));
        sFields.put("thumbnailUrl", com.google.android.gms.common.server.response.FastJsonResponse.Field.forString("thumbnailUrl", 51));
        sFields.put("tickerSymbol", com.google.android.gms.common.server.response.FastJsonResponse.Field.forString("tickerSymbol", 52));
        sFields.put("type", com.google.android.gms.common.server.response.FastJsonResponse.Field.forString("type", 53));
        sFields.put("url", com.google.android.gms.common.server.response.FastJsonResponse.Field.forString("url", 54));
        sFields.put("width", com.google.android.gms.common.server.response.FastJsonResponse.Field.forString("width", 55));
        sFields.put("worstRating", com.google.android.gms.common.server.response.FastJsonResponse.Field.forString("worstRating", 56));
    }
}
