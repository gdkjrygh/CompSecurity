// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.ui.activity.dialog.artistlove.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.spotify.mobile.android.cosmos.JacksonModel;

public class FeedbackChannelDialogModel
    implements Parcelable, JacksonModel
{

    public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

        public final Object createFromParcel(Parcel parcel)
        {
            return new FeedbackChannelDialogModel(parcel);
        }

        public final volatile Object[] newArray(int i)
        {
            return new FeedbackChannelDialogModel[i];
        }

    };
    String mAlbumUri;
    String mArtistUri;
    String mBody;
    String mCallToActions;
    String mCloseButtonLabel;
    String mId;
    String mImageSubtitle;
    String mImageTitle;
    String mImageUrl;
    String mTitle;
    String mTweetBody;

    private FeedbackChannelDialogModel(Parcel parcel)
    {
        mId = parcel.readString();
        mImageTitle = parcel.readString();
        mImageSubtitle = parcel.readString();
        mTitle = parcel.readString();
        mImageUrl = parcel.readString();
        mBody = parcel.readString();
        mCallToActions = parcel.readString();
        mCloseButtonLabel = parcel.readString();
        mTweetBody = parcel.readString();
        mArtistUri = parcel.readString();
        mAlbumUri = parcel.readString();
    }


    public FeedbackChannelDialogModel(String s, String s1, String s2, String s3, String s4, String s5, String s6, 
            String s7, String s8, String s9, String s10)
    {
        mId = s;
        mTitle = s1;
        mImageUrl = s2;
        mImageTitle = s3;
        mImageSubtitle = s4;
        mBody = s5;
        mCallToActions = s6;
        mCloseButtonLabel = s7;
        mTweetBody = s8;
        mArtistUri = s9;
        mAlbumUri = s10;
    }

    public int describeContents()
    {
        return 0;
    }

    public String getAlbumUri()
    {
        return mAlbumUri;
    }

    public String getArtistUri()
    {
        return mArtistUri;
    }

    public String getBody()
    {
        return mBody;
    }

    public String getCallToActions()
    {
        return mCallToActions;
    }

    public String getCloseButtonLabel()
    {
        return mCloseButtonLabel;
    }

    public String getId()
    {
        return mId;
    }

    public String getImageSubtitle()
    {
        return mImageSubtitle;
    }

    public String getImageTitle()
    {
        return mImageTitle;
    }

    public String getImageUrl()
    {
        return mImageUrl;
    }

    public String getTitle()
    {
        return mTitle;
    }

    public String getTweetBody()
    {
        return mTweetBody;
    }

    public boolean isIdentifiedBy(String s)
    {
        return mId != null && mId.equals(s);
    }

    public void setAlbumUri(String s)
    {
        mAlbumUri = s;
    }

    public void setArtistUri(String s)
    {
        mArtistUri = s;
    }

    public void setBody(String s)
    {
        mBody = s;
    }

    public void setCallToActions(String s)
    {
        mCallToActions = s;
    }

    public void setCloseButtonLabel(String s)
    {
        mCloseButtonLabel = s;
    }

    public void setId(String s)
    {
        mId = s;
    }

    public void setImageSubtitle(String s)
    {
        mImageSubtitle = s;
    }

    public void setImageTitle(String s)
    {
        mImageTitle = s;
    }

    public void setImageUrl(String s)
    {
        mImageUrl = s;
    }

    public void setTitle(String s)
    {
        mTitle = s;
    }

    public void setTweetBody(String s)
    {
        mTweetBody = s;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeString(mId);
        parcel.writeString(mImageTitle);
        parcel.writeString(mImageSubtitle);
        parcel.writeString(mTitle);
        parcel.writeString(mImageUrl);
        parcel.writeString(mBody);
        parcel.writeString(mCallToActions);
        parcel.writeString(mCloseButtonLabel);
        parcel.writeString(mTweetBody);
        parcel.writeString(mArtistUri);
        parcel.writeString(mAlbumUri);
    }

}
