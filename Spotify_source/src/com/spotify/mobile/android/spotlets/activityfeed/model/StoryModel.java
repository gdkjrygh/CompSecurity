// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.spotlets.activityfeed.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.spotify.mobile.android.cosmos.JacksonModel;

// Referenced classes of package com.spotify.mobile.android.spotlets.activityfeed.model:
//            UserModel, ResourceModel, StreamsModel

public class StoryModel
    implements Parcelable, JacksonModel
{

    public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

        public final Object createFromParcel(Parcel parcel)
        {
            return new StoryModel(parcel);
        }

        public final volatile Object[] newArray(int i)
        {
            return new StoryModel[i];
        }

    };
    private String mAlbumUri;
    private String mArtistUri;
    private UserModel mAuthor;
    private String mDescription;
    private String mId;
    private Boolean mIsPlaying;
    private ResourceModel mResource;
    private StreamsModel mStreams;
    private long mTimestamp;

    private StoryModel(Parcel parcel)
    {
        mIsPlaying = Boolean.valueOf(false);
        mId = parcel.readString();
        mAuthor = (UserModel)parcel.readParcelable(com/spotify/mobile/android/spotlets/activityfeed/model/UserModel.getClassLoader());
        mDescription = parcel.readString();
        mTimestamp = parcel.readLong();
        mResource = (ResourceModel)parcel.readParcelable(com/spotify/mobile/android/spotlets/activityfeed/model/ResourceModel.getClassLoader());
        mStreams = (StreamsModel)parcel.readParcelable(com/spotify/mobile/android/spotlets/activityfeed/model/StreamsModel.getClassLoader());
        mAlbumUri = parcel.readString();
        mArtistUri = parcel.readString();
    }


    public StoryModel(String s, UserModel usermodel, String s1, long l, ResourceModel resourcemodel, StreamsModel streamsmodel, 
            String s2, String s3)
    {
        mIsPlaying = Boolean.valueOf(false);
        mId = s;
        mAuthor = usermodel;
        s = s1;
        if (s1 == null)
        {
            s = "";
        }
        mDescription = s;
        mTimestamp = l;
        mResource = resourcemodel;
        mStreams = streamsmodel;
        mAlbumUri = s2;
        mArtistUri = s3;
    }

    public int describeContents()
    {
        return 0;
    }

    public boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (!(obj instanceof StoryModel))
            {
                return false;
            }
            obj = (StoryModel)obj;
            if (mTimestamp != ((StoryModel) (obj)).mTimestamp)
            {
                return false;
            }
            if (mAuthor == null ? ((StoryModel) (obj)).mAuthor != null : !mAuthor.equals(((StoryModel) (obj)).mAuthor))
            {
                return false;
            }
            if (mDescription == null ? ((StoryModel) (obj)).mDescription != null : !mDescription.equals(((StoryModel) (obj)).mDescription))
            {
                return false;
            }
            if (mId == null ? ((StoryModel) (obj)).mId != null : !mId.equals(((StoryModel) (obj)).mId))
            {
                return false;
            }
            if (mResource == null ? ((StoryModel) (obj)).mResource != null : !mResource.equals(((StoryModel) (obj)).mResource))
            {
                return false;
            }
            if (mStreams == null ? ((StoryModel) (obj)).mStreams != null : !mStreams.equals(((StoryModel) (obj)).mStreams))
            {
                return false;
            }
            if (mAlbumUri == null ? ((StoryModel) (obj)).mAlbumUri != null : !mAlbumUri.equals(((StoryModel) (obj)).mAlbumUri))
            {
                return false;
            }
            if (mArtistUri == null ? ((StoryModel) (obj)).mArtistUri != null : !mArtistUri.equals(((StoryModel) (obj)).mArtistUri))
            {
                return false;
            }
        }
        return true;
    }

    public String getAlbumUri()
    {
        return mAlbumUri;
    }

    public String getArtistUri()
    {
        return mArtistUri;
    }

    public UserModel getAuthor()
    {
        return mAuthor;
    }

    public String getDescription()
    {
        return mDescription.trim();
    }

    public String getId()
    {
        return mId;
    }

    public boolean getIsPlaying()
    {
        return mIsPlaying.booleanValue();
    }

    public ResourceModel getResource()
    {
        return mResource;
    }

    public StreamsModel getStreams()
    {
        return mStreams;
    }

    public long getTimestamp()
    {
        return mTimestamp;
    }

    public boolean hasMatchingContextUri(String s)
    {
        return mResource.hasMatchingContextUri(s);
    }

    public int hashCode()
    {
        int k1 = 0;
        int i;
        int j;
        int k;
        int l;
        int i1;
        int j1;
        int l1;
        if (mId != null)
        {
            i = mId.hashCode();
        } else
        {
            i = 0;
        }
        if (mAuthor != null)
        {
            j = mAuthor.hashCode();
        } else
        {
            j = 0;
        }
        if (mDescription != null)
        {
            k = mDescription.hashCode();
        } else
        {
            k = 0;
        }
        l1 = (int)(mTimestamp ^ mTimestamp >>> 32);
        if (mResource != null)
        {
            l = mResource.hashCode();
        } else
        {
            l = 0;
        }
        if (mStreams != null)
        {
            i1 = mStreams.hashCode();
        } else
        {
            i1 = 0;
        }
        if (mAlbumUri != null)
        {
            j1 = mAlbumUri.hashCode();
        } else
        {
            j1 = 0;
        }
        if (mArtistUri != null)
        {
            k1 = mArtistUri.hashCode();
        }
        return (j1 + (i1 + (l + ((k + (j + i * 31) * 31) * 31 + l1) * 31) * 31) * 31) * 31 + k1;
    }

    public void setIsPlaying(boolean flag)
    {
        mIsPlaying = Boolean.valueOf(flag);
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeString(mId);
        parcel.writeParcelable(mAuthor, 0);
        parcel.writeString(mDescription);
        parcel.writeLong(mTimestamp);
        parcel.writeParcelable(mResource, 0);
        parcel.writeParcelable(mStreams, 0);
        parcel.writeString(mAlbumUri);
        parcel.writeString(mArtistUri);
    }

}
