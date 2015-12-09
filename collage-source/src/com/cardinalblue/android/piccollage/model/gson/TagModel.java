// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.piccollage.model.gson;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.b.h;
import java.lang.reflect.Type;

// Referenced classes of package com.cardinalblue.android.piccollage.model.gson:
//            IGsonable

public class TagModel
    implements Parcelable, IGsonable, h
{

    public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

        public TagModel createFromParcel(Parcel parcel)
        {
            return new TagModel(parcel);
        }

        public volatile Object createFromParcel(Parcel parcel)
        {
            return createFromParcel(parcel);
        }

        public TagModel[] newArray(int i)
        {
            return new TagModel[i];
        }

        public volatile Object[] newArray(int i)
        {
            return newArray(i);
        }

    };
    private String mBundleId;
    private String mId;
    private String mLatitude;
    private String mLongitude;
    private String mOriginalCollageId;
    private String mPageUrl;
    private String mProgenitorCollageId;
    private String mSearchTerm;
    private String mStickerPackName;
    private String mStickerTagName;
    private String mType;
    private String mUid;
    private String mUrl;
    private String mX;
    private String mY;

    TagModel()
    {
    }

    TagModel(Parcel parcel)
    {
        mType = parcel.readString();
        mUid = parcel.readString();
        mX = parcel.readString();
        mY = parcel.readString();
        mSearchTerm = parcel.readString();
        mUrl = parcel.readString();
        mPageUrl = parcel.readString();
        mId = parcel.readString();
        mLatitude = parcel.readString();
        mLongitude = parcel.readString();
        mBundleId = parcel.readString();
        mStickerPackName = parcel.readString();
        mStickerTagName = parcel.readString();
        mOriginalCollageId = parcel.readString();
        mProgenitorCollageId = parcel.readString();
    }

    public static TagModel newSearchTermTag(String s)
    {
        TagModel tagmodel = new TagModel();
        tagmodel.mType = "search";
        tagmodel.mSearchTerm = s;
        return tagmodel;
    }

    public static TagModel newSearchTermTag(String s, String s1, String s2)
    {
        TagModel tagmodel = new TagModel();
        tagmodel.mType = "search";
        tagmodel.mSearchTerm = s;
        tagmodel.mUrl = s1;
        tagmodel.mPageUrl = s2;
        return tagmodel;
    }

    public static TagModel newStickerTag(String s, String s1, String s2)
    {
        TagModel tagmodel = new TagModel();
        tagmodel.mType = "sticker";
        tagmodel.mBundleId = s;
        tagmodel.mStickerPackName = s1;
        tagmodel.mStickerTagName = s2;
        return tagmodel;
    }

    public TagModel createInstance(Type type)
    {
        return new TagModel();
    }

    public volatile Object createInstance(Type type)
    {
        return createInstance(type);
    }

    public int describeContents()
    {
        return 0;
    }

    public boolean equals(Object obj)
    {
        if (obj == null || !(obj instanceof TagModel))
        {
            return false;
        } else
        {
            return ((TagModel)obj).getType().equals(mType);
        }
    }

    public String getOriginalCollageId()
    {
        return mOriginalCollageId;
    }

    public String getProgenitorCollageId()
    {
        return mProgenitorCollageId;
    }

    public String getType()
    {
        return mType;
    }

    public boolean isEchoTag()
    {
        return !TextUtils.isEmpty(mProgenitorCollageId) && !TextUtils.isEmpty(mOriginalCollageId);
    }

    public void setOriginalCollageId(String s)
    {
        mOriginalCollageId = s;
    }

    public void setProgenitorCollageId(String s)
    {
        mProgenitorCollageId = s;
    }

    public void setType(String s)
    {
        mType = s;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeString(mType);
        parcel.writeString(mUid);
        parcel.writeString(mX);
        parcel.writeString(mY);
        parcel.writeString(mSearchTerm);
        parcel.writeString(mUrl);
        parcel.writeString(mPageUrl);
        parcel.writeString(mId);
        parcel.writeString(mLatitude);
        parcel.writeString(mLongitude);
        parcel.writeString(mBundleId);
        parcel.writeString(mStickerPackName);
        parcel.writeString(mStickerTagName);
        parcel.writeString(mOriginalCollageId);
        parcel.writeString(mProgenitorCollageId);
    }

}
