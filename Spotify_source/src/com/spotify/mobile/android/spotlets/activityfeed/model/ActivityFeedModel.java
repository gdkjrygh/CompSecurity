// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.spotlets.activityfeed.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.spotify.mobile.android.cosmos.JacksonModel;
import java.util.Arrays;

// Referenced classes of package com.spotify.mobile.android.spotlets.activityfeed.model:
//            StoryModel

public class ActivityFeedModel
    implements Parcelable, JacksonModel
{

    public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

        public final Object createFromParcel(Parcel parcel)
        {
            return new ActivityFeedModel(parcel);
        }

        public final volatile Object[] newArray(int i)
        {
            return new ActivityFeedModel[i];
        }

    };
    private String mNextpagePath;
    private StoryModel mStories[];

    private ActivityFeedModel(Parcel parcel)
    {
        mStories = new StoryModel[parcel.readInt()];
        parcel.readTypedArray(mStories, StoryModel.CREATOR);
        mNextpagePath = parcel.readString();
    }


    public ActivityFeedModel(StoryModel astorymodel[], String s)
    {
        StoryModel astorymodel1[] = astorymodel;
        if (astorymodel == null)
        {
            astorymodel1 = new StoryModel[0];
        }
        mStories = astorymodel1;
        mNextpagePath = s;
    }

    public int describeContents()
    {
        return 0;
    }

    public boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (!(obj instanceof ActivityFeedModel))
            {
                return false;
            }
            obj = (ActivityFeedModel)obj;
            if (mNextpagePath == null ? ((ActivityFeedModel) (obj)).mNextpagePath != null : !mNextpagePath.equals(((ActivityFeedModel) (obj)).mNextpagePath))
            {
                return false;
            }
            if (!Arrays.equals(mStories, ((ActivityFeedModel) (obj)).mStories))
            {
                return false;
            }
        }
        return true;
    }

    public String getNextPagePath()
    {
        return mNextpagePath;
    }

    public StoryModel[] getStories()
    {
        return mStories;
    }

    public int hashCode()
    {
        int j = 0;
        int i;
        if (mStories != null)
        {
            i = Arrays.hashCode(mStories);
        } else
        {
            i = 0;
        }
        if (mNextpagePath != null)
        {
            j = mNextpagePath.hashCode();
        }
        return i * 31 + j;
    }

    public boolean isEmpty()
    {
        return getStories().length == 0;
    }

    public void merge(ActivityFeedModel activityfeedmodel)
    {
        StoryModel astorymodel[] = new StoryModel[getStories().length + activityfeedmodel.getStories().length];
        System.arraycopy(getStories(), 0, astorymodel, 0, getStories().length);
        System.arraycopy(activityfeedmodel.getStories(), 0, astorymodel, getStories().length, activityfeedmodel.getStories().length);
        mStories = astorymodel;
    }

    public void replaceStory(StoryModel storymodel, int i)
    {
        if (i < mStories.length)
        {
            mStories[i] = storymodel;
        }
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeInt(mStories.length);
        parcel.writeTypedArray(mStories, 0);
        parcel.writeString(mNextpagePath);
    }

}
