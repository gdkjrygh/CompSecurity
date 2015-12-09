// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.wearable.internal:
//            AncsNotificationParcelableCreator

public class AncsNotificationParcelable
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new AncsNotificationParcelableCreator();
    final String mAppId;
    byte mCategoryCount;
    byte mCategoryId;
    final String mDateTime;
    String mDisplayName;
    byte mEventFlags;
    byte mEventId;
    int mId;
    final String mNotificationText;
    final String mSubtitle;
    final String mTitle;
    final int mVersionCode;

    AncsNotificationParcelable(int i, int j, String s, String s1, String s2, String s3, String s4, 
            String s5, byte byte0, byte byte1, byte byte2, byte byte3)
    {
        mId = j;
        mVersionCode = i;
        mAppId = s;
        mDateTime = s1;
        mNotificationText = s2;
        mTitle = s3;
        mSubtitle = s4;
        mDisplayName = s5;
        mEventId = byte0;
        mEventFlags = byte1;
        mCategoryId = byte2;
        mCategoryCount = byte3;
    }

    public int describeContents()
    {
        return 0;
    }

    public boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (obj == null || getClass() != obj.getClass())
            {
                return false;
            }
            obj = (AncsNotificationParcelable)obj;
            if (mCategoryCount != ((AncsNotificationParcelable) (obj)).mCategoryCount)
            {
                return false;
            }
            if (mCategoryId != ((AncsNotificationParcelable) (obj)).mCategoryId)
            {
                return false;
            }
            if (mEventFlags != ((AncsNotificationParcelable) (obj)).mEventFlags)
            {
                return false;
            }
            if (mEventId != ((AncsNotificationParcelable) (obj)).mEventId)
            {
                return false;
            }
            if (mId != ((AncsNotificationParcelable) (obj)).mId)
            {
                return false;
            }
            if (mVersionCode != ((AncsNotificationParcelable) (obj)).mVersionCode)
            {
                return false;
            }
            if (!mAppId.equals(((AncsNotificationParcelable) (obj)).mAppId))
            {
                return false;
            }
            if (mDateTime == null ? ((AncsNotificationParcelable) (obj)).mDateTime != null : !mDateTime.equals(((AncsNotificationParcelable) (obj)).mDateTime))
            {
                return false;
            }
            if (!mDisplayName.equals(((AncsNotificationParcelable) (obj)).mDisplayName))
            {
                return false;
            }
            if (!mNotificationText.equals(((AncsNotificationParcelable) (obj)).mNotificationText))
            {
                return false;
            }
            if (!mSubtitle.equals(((AncsNotificationParcelable) (obj)).mSubtitle))
            {
                return false;
            }
            if (!mTitle.equals(((AncsNotificationParcelable) (obj)).mTitle))
            {
                return false;
            }
        }
        return true;
    }

    public int hashCode()
    {
        int j = mVersionCode;
        int k = mId;
        int l = mAppId.hashCode();
        int i;
        if (mDateTime != null)
        {
            i = mDateTime.hashCode();
        } else
        {
            i = 0;
        }
        return ((((((((((j * 31 + k) * 31 + l) * 31 + i) * 31 + mNotificationText.hashCode()) * 31 + mTitle.hashCode()) * 31 + mSubtitle.hashCode()) * 31 + mDisplayName.hashCode()) * 31 + mEventId) * 31 + mEventFlags) * 31 + mCategoryId) * 31 + mCategoryCount;
    }

    public String toString()
    {
        return (new StringBuilder("AncsNotificationParcelable{mVersionCode=")).append(mVersionCode).append(", mId=").append(mId).append(", mAppId='").append(mAppId).append('\'').append(", mDateTime='").append(mDateTime).append('\'').append(", mNotificationText='").append(mNotificationText).append('\'').append(", mTitle='").append(mTitle).append('\'').append(", mSubtitle='").append(mSubtitle).append('\'').append(", mDisplayName='").append(mDisplayName).append('\'').append(", mEventId=").append(mEventId).append(", mEventFlags=").append(mEventFlags).append(", mCategoryId=").append(mCategoryId).append(", mCategoryCount=").append(mCategoryCount).append('}').toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        AncsNotificationParcelableCreator.writeToParcel$4e9d8cf1(this, parcel);
    }

}
