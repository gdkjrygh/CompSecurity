// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.ui;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.netflix.mediaclient.Log;
import com.netflix.mediaclient.servicemgr.Playable;
import com.netflix.mediaclient.ui.common.PlayContext;
import com.netflix.mediaclient.util.ParcelUtils;
import com.netflix.mediaclient.util.StringUtils;

public class Asset
    implements Parcelable, PlayContext
{

    public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

        public Asset createFromParcel(Parcel parcel)
        {
            return new Asset(parcel);
        }

        public volatile Object createFromParcel(Parcel parcel)
        {
            return createFromParcel(parcel);
        }

        public Asset[] newArray(int i)
        {
            return new Asset[i];
        }

        public volatile Object[] newArray(int i)
        {
            return newArray(i);
        }

    };
    public static final String PARAM_DURATION = "duration";
    public static final String PARAM_ENDTIME = "endtime";
    public static final String PARAM_EP_BOOKMARK = "playback_bookmark";
    public static final String PARAM_EP_BOOKMARK_TS = "watched_date";
    public static final String PARAM_EP_EPISODE_NUMBER = "episodeNumber";
    public static final String PARAM_EP_SEASON_NUMBER = "seasonNumber";
    public static final String PARAM_FACEBOOK_DONOT_SHARE = "fb_dontsharebtn";
    public static final String PARAM_IS_AUTOPLAY = "isAutoPlayEnabled";
    public static final String PARAM_IS_EPISODE = "isEpisode";
    public static final String PARAM_IS_NEXT_EPISODE = "isNextPlayableEpisode";
    public static final String PARAM_IS_PIN_PROTECTED = "isPinProtected";
    public static final String PARAM_IS_PIN_VERIFIED = "isPinVerified";
    public static final String PARAM_LIST_POS = "listpos";
    public static final String PARAM_ORIGINAL_URL = "nflx";
    public static final String PARAM_PARENT_ID = "parentid";
    public static final String PARAM_PARENT_TITLE = "parent_title";
    public static final String PARAM_PLAYABLE_ID = "playableid";
    public static final String PARAM_POSTPLAY_COUNT = "postPlayCount";
    public static final String PARAM_REQ_ID = "reqid";
    public static final String PARAM_TITLE = "title";
    public static final String PARAM_TRK_ID = "trkid";
    public static final String PARAM_VIDEO_POS = "videopos";
    private static final String TAG = "mdxui";
    private int mDuration;
    private int mEndtime;
    private int mEpisodeNumber;
    private boolean mIsAutoPlayEnabled;
    private boolean mIsEpisode;
    private boolean mIsNextPlayableEpisode;
    private boolean mIsPinProtected;
    private boolean mIsPinVerified;
    private int mListPos;
    private String mNflx;
    private String mParentId;
    private String mParentTitle;
    private String mPlayableId;
    private int mPlaybackBookmark;
    private int mPostPlayVideoPlayed;
    private String mReqId;
    private int mSeasonNumber;
    private boolean mSocialDoNotShareVisible;
    private String mTitle;
    private int mTrackId;
    private int mVideoPos;
    private long mWatchedDate;

    private Asset()
    {
    }

    private Asset(Parcel parcel)
    {
        mPlayableId = ParcelUtils.readString(parcel);
        mParentId = ParcelUtils.readString(parcel);
        mTrackId = ParcelUtils.readInt(parcel);
        mIsEpisode = ParcelUtils.readBoolean(parcel);
        mTitle = ParcelUtils.readString(parcel);
        mParentTitle = ParcelUtils.readString(parcel);
        mWatchedDate = ParcelUtils.readLong(parcel);
        mPlaybackBookmark = ParcelUtils.readInt(parcel);
        mNflx = ParcelUtils.readString(parcel);
        mSocialDoNotShareVisible = ParcelUtils.readBoolean(parcel);
        mSeasonNumber = ParcelUtils.readInt(parcel);
        mEpisodeNumber = ParcelUtils.readInt(parcel);
        mDuration = ParcelUtils.readInt(parcel);
        mReqId = ParcelUtils.readString(parcel);
        mListPos = ParcelUtils.readInt(parcel);
        mVideoPos = ParcelUtils.readInt(parcel);
        mEndtime = ParcelUtils.readInt(parcel);
        mIsAutoPlayEnabled = ParcelUtils.readBoolean(parcel);
        mIsNextPlayableEpisode = ParcelUtils.readBoolean(parcel);
        mPostPlayVideoPlayed = ParcelUtils.readInt(parcel);
        mIsPinProtected = ParcelUtils.readBoolean(parcel);
        mIsPinVerified = ParcelUtils.readBoolean(parcel);
    }


    public static Asset create(Playable playable, PlayContext playcontext, boolean flag)
    {
        if (Log.isLoggable("mdxui", 2))
        {
            Log.v("mdxui", (new StringBuilder()).append("ASSET: create asset from playable ").append(playable).toString());
        }
        Asset asset = new Asset();
        if (playable != null)
        {
            asset.mPlayableId = playable.getPlayableId();
            asset.mParentId = playable.getParentId();
            asset.mTitle = playable.getPlayableTitle();
            asset.mParentTitle = playable.getParentTitle();
            asset.mPlaybackBookmark = playable.getPlayableBookmarkPosition();
            asset.mWatchedDate = playable.getPlayableBookmarkUpdateTime();
            asset.mDuration = playable.getRuntime();
            asset.mEndtime = playable.getEndtime();
            asset.mSeasonNumber = playable.getSeasonNumber();
            asset.mEpisodeNumber = playable.getEpisodeNumber();
            asset.mIsEpisode = playable.isPlayableEpisode();
            asset.mSocialDoNotShareVisible = playable.getFbDntShare();
            asset.mIsAutoPlayEnabled = playable.isAutoPlayEnabled();
            asset.mIsNextPlayableEpisode = playable.isNextPlayableEpisode();
            asset.mIsPinProtected = playable.isPinProtected();
        }
        if (playcontext != null)
        {
            asset.mTrackId = playcontext.getTrackId();
            asset.mReqId = playcontext.getRequestId();
            asset.mListPos = playcontext.getListPos();
            asset.mVideoPos = playcontext.getVideoPos();
        }
        if (Log.isLoggable("mdxui", 2))
        {
            Log.v("mdxui", (new StringBuilder()).append("ASSET: created ").append(asset).toString());
        }
        asset.mIsPinVerified = flag;
        return asset;
    }

    public static Asset createForPostPlay(Playable playable, PlayContext playcontext, int i, boolean flag)
    {
        playable = create(playable, playcontext, flag);
        playable.mPostPlayVideoPlayed = i;
        return playable;
    }

    public static Asset fromIntent(Intent intent)
    {
        Asset asset = new Asset();
        asset.mPlayableId = ParcelUtils.readString(intent, "playableid");
        asset.mParentId = ParcelUtils.readString(intent, "parentid");
        asset.mIsEpisode = ParcelUtils.readBoolean(intent, "isEpisode");
        asset.mTrackId = ParcelUtils.readInt(intent, "trkid");
        asset.mTitle = ParcelUtils.readString(intent, "title");
        asset.mParentTitle = ParcelUtils.readString(intent, "parent_title");
        asset.mNflx = ParcelUtils.readString(intent, "nflx");
        asset.mPlaybackBookmark = ParcelUtils.readInt(intent, "playback_bookmark");
        asset.mWatchedDate = ParcelUtils.readLong(intent, "watched_date");
        asset.mSocialDoNotShareVisible = ParcelUtils.readBoolean(intent, "fb_dontsharebtn");
        asset.mSeasonNumber = ParcelUtils.readInt(intent, "seasonNumber");
        asset.mEpisodeNumber = ParcelUtils.readInt(intent, "episodeNumber");
        asset.mDuration = ParcelUtils.readInt(intent, "duration");
        asset.mEndtime = ParcelUtils.readInt(intent, "endtime");
        asset.mIsAutoPlayEnabled = ParcelUtils.readBoolean(intent, "isAutoPlayEnabled");
        asset.mIsNextPlayableEpisode = ParcelUtils.readBoolean(intent, "isNextPlayableEpisode");
        asset.mReqId = ParcelUtils.readString(intent, "reqid");
        asset.mListPos = ParcelUtils.readInt(intent, "listpos");
        asset.mVideoPos = ParcelUtils.readInt(intent, "videopos");
        asset.mPostPlayVideoPlayed = ParcelUtils.readInt(intent, "postPlayCount");
        asset.mIsPinProtected = ParcelUtils.readBoolean(intent, "isPinProtected");
        asset.mIsPinVerified = ParcelUtils.readBoolean(intent, "isPinVerified");
        return asset;
    }

    public int describeContents()
    {
        return 0;
    }

    public int getDuration()
    {
        return mDuration;
    }

    public int getEndtime()
    {
        return mEndtime;
    }

    public int getEpisodeNumber()
    {
        return mEpisodeNumber;
    }

    public int getListPos()
    {
        return mListPos;
    }

    public String getNflx()
    {
        return mNflx;
    }

    public String getParentId()
    {
        return mParentId;
    }

    public String getParentTitle()
    {
        return mParentTitle;
    }

    public String getPlayableId()
    {
        return mPlayableId;
    }

    public int getPlaybackBookmark()
    {
        return mPlaybackBookmark;
    }

    public int getPostPlayVideoPlayed()
    {
        return mPostPlayVideoPlayed;
    }

    public String getRequestId()
    {
        return mReqId;
    }

    public int getSeasonNumber()
    {
        return mSeasonNumber;
    }

    public String getTitle()
    {
        return mTitle;
    }

    public int getTrackId()
    {
        return mTrackId;
    }

    public int getVideoPos()
    {
        return mVideoPos;
    }

    public long getWatchedDate()
    {
        return mWatchedDate;
    }

    public boolean isAutoPlayEnabled()
    {
        return mIsAutoPlayEnabled;
    }

    public boolean isEmpty()
    {
        return StringUtils.isEmpty(mPlayableId);
    }

    public boolean isEpisode()
    {
        return mIsEpisode;
    }

    public boolean isNextPlayableEpisode()
    {
        return mIsNextPlayableEpisode;
    }

    public boolean isPinProtected()
    {
        return mIsPinProtected;
    }

    public boolean isPinVerified()
    {
        return mIsPinVerified;
    }

    public boolean isSocialDoNotShareVisible()
    {
        return mSocialDoNotShareVisible;
    }

    public void setPlaybackBookmark(int i)
    {
        mPlaybackBookmark = i;
    }

    public Intent toIntent(Intent intent)
    {
        if (intent == null)
        {
            throw new IllegalArgumentException("Intent can not be null!");
        } else
        {
            intent.putExtra("playableid", ParcelUtils.validateString(mPlayableId));
            intent.putExtra("parentid", ParcelUtils.validateString(mParentId));
            intent.putExtra("isEpisode", mIsEpisode);
            intent.putExtra("trkid", mTrackId);
            intent.putExtra("title", ParcelUtils.validateString(mTitle));
            intent.putExtra("parent_title", ParcelUtils.validateString(mParentTitle));
            intent.putExtra("watched_date", mWatchedDate);
            intent.putExtra("playback_bookmark", mPlaybackBookmark);
            intent.putExtra("nflx", ParcelUtils.validateString(mNflx));
            intent.putExtra("fb_dontsharebtn", mSocialDoNotShareVisible);
            intent.putExtra("seasonNumber", mSeasonNumber);
            intent.putExtra("episodeNumber", mEpisodeNumber);
            intent.putExtra("duration", mDuration);
            intent.putExtra("endtime", mEndtime);
            intent.putExtra("isAutoPlayEnabled", mIsAutoPlayEnabled);
            intent.putExtra("isNextPlayableEpisode", mIsNextPlayableEpisode);
            intent.putExtra("reqid", ParcelUtils.validateString(mReqId));
            intent.putExtra("listpos", mListPos);
            intent.putExtra("videopos", mVideoPos);
            intent.putExtra("postPlayCount", mPostPlayVideoPlayed);
            intent.putExtra("isPinProtected", mIsPinProtected);
            intent.putExtra("isPinVerified", mIsPinVerified);
            return intent;
        }
    }

    public String toString()
    {
        return (new StringBuilder()).append("Asset [mPlayableId=").append(mPlayableId).append(", mParentId=").append(mParentId).append(", mIsEpisode=").append(mIsEpisode).append(", mIsAutoPlayEnabled=").append(mIsAutoPlayEnabled).append(", mIsNextPlayableEpisode=").append(mIsNextPlayableEpisode).append(", mTrackId=").append(mTrackId).append(", mReqId=").append(mReqId).append(", mListPos=").append(mListPos).append(", mVideoPos=").append(mVideoPos).append(", mTitle=").append(mTitle).append(", mParentTitle=").append(mParentTitle).append(", mWatchedDate=").append(mWatchedDate).append(", mPlaybackBookmark=").append(mPlaybackBookmark).append(", mNflx=").append(mNflx).append(", mDuration=").append(mDuration).append(", mEndtime=").append(mEndtime).append(", mIsPinProtected=").append(mIsPinProtected).append(", mIsPinVerified=").append(mIsPinVerified).append(", mSocialDoNotShareVisible=").append(mSocialDoNotShareVisible).append(", mSeasonNumber=").append(mSeasonNumber).append(", mEpisodeNumber=").append(mEpisodeNumber).append(", mPostPlayVideoPlayed=").append(mPostPlayVideoPlayed).append("]").toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        ParcelUtils.writeString(parcel, mPlayableId);
        ParcelUtils.writeString(parcel, mParentId);
        ParcelUtils.writeInt(parcel, mTrackId);
        ParcelUtils.writeBoolean(parcel, mIsEpisode);
        ParcelUtils.writeString(parcel, mTitle);
        ParcelUtils.writeString(parcel, mParentTitle);
        ParcelUtils.writeLong(parcel, mWatchedDate);
        ParcelUtils.writeInt(parcel, mPlaybackBookmark);
        ParcelUtils.writeString(parcel, mNflx);
        ParcelUtils.writeBoolean(parcel, mSocialDoNotShareVisible);
        ParcelUtils.writeInt(parcel, mSeasonNumber);
        ParcelUtils.writeInt(parcel, mEpisodeNumber);
        ParcelUtils.writeInt(parcel, mDuration);
        ParcelUtils.writeString(parcel, mReqId);
        ParcelUtils.writeInt(parcel, mListPos);
        ParcelUtils.writeInt(parcel, mVideoPos);
        ParcelUtils.writeInt(parcel, mEndtime);
        ParcelUtils.writeBoolean(parcel, mIsAutoPlayEnabled);
        ParcelUtils.writeBoolean(parcel, mIsNextPlayableEpisode);
        ParcelUtils.writeInt(parcel, mPostPlayVideoPlayed);
        ParcelUtils.writeBoolean(parcel, mIsPinProtected);
        ParcelUtils.writeBoolean(parcel, mIsPinVerified);
    }

}
