// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.spotlets.ads.model;

import android.text.TextUtils;
import com.spotify.mobile.android.cosmos.JacksonModel;

public class Sponsorship
    implements JacksonModel
{

    public long mEndTimeSeconds;
    public String mSpotifyUriStr;
    public long mStartTimeSeconds;
    public boolean mViewedDuringSession;

    public Sponsorship(long l, long l1, String s)
    {
        mStartTimeSeconds = l;
        mEndTimeSeconds = l1;
        mSpotifyUriStr = s;
        mViewedDuringSession = false;
    }

    public void displayedDuringSession()
    {
        mViewedDuringSession = true;
    }

    public boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (obj == null || getClass() != obj.getClass())
            {
                return false;
            }
            obj = (Sponsorship)obj;
            if (!mSpotifyUriStr.equals(((Sponsorship) (obj)).mSpotifyUriStr))
            {
                return false;
            }
        }
        return true;
    }

    public long getEndTimeSeconds()
    {
        return mEndTimeSeconds;
    }

    public String getSpotifyUriStr()
    {
        return mSpotifyUriStr;
    }

    public long getStartTimeSeconds()
    {
        return mStartTimeSeconds;
    }

    public int hashCode()
    {
        return mSpotifyUriStr.hashCode();
    }

    public boolean isEqual(String s)
    {
        return !TextUtils.isEmpty(mSpotifyUriStr) && !TextUtils.isEmpty(s) && mSpotifyUriStr.equals(s);
    }

    public void setSpotifyUriStr(String s)
    {
        mSpotifyUriStr = s;
    }

    public String toString()
    {
        return (new StringBuilder("Sponsorship{startTimeSeconds='")).append(mStartTimeSeconds).append('\'').append(", endTimeSeconds='").append(mEndTimeSeconds).append('\'').append(", spotifyUri='").append(mSpotifyUriStr).append('\'').append('}').toString();
    }

    public boolean wasDisplayedDuringSession()
    {
        return mViewedDuringSession;
    }
}
