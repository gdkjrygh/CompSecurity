// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.spotlets.share.model;

import com.spotify.mobile.android.cosmos.JacksonModel;

// Referenced classes of package com.spotify.mobile.android.spotlets.share.model:
//            Status

public class mTumblrStatus
    implements JacksonModel
{

    private Status mFacebookStatus;
    private Status mSpotifyStatus;
    private Status mTumblrStatus;
    private Status mTwitterStatus;

    public boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (!(obj instanceof mTumblrStatus))
            {
                return false;
            }
            obj = (mTumblrStatus)obj;
            if (mFacebookStatus == null ? ((mFacebookStatus) (obj)).mFacebookStatus != null : !mFacebookStatus.equals(((mFacebookStatus) (obj)).mFacebookStatus))
            {
                return false;
            }
            if (mSpotifyStatus == null ? ((mSpotifyStatus) (obj)).mSpotifyStatus != null : !mSpotifyStatus.equals(((mSpotifyStatus) (obj)).mSpotifyStatus))
            {
                return false;
            }
            if (mTumblrStatus == null ? ((mTumblrStatus) (obj)).mTumblrStatus != null : !mTumblrStatus.equals(((mTumblrStatus) (obj)).mTumblrStatus))
            {
                return false;
            }
            if (mTwitterStatus == null ? ((mTwitterStatus) (obj)).mTwitterStatus != null : !mTwitterStatus.equals(((mTwitterStatus) (obj)).mTwitterStatus))
            {
                return false;
            }
        }
        return true;
    }

    public Status getFacebookStatus()
    {
        return mFacebookStatus;
    }

    public Status getSpotifyStatus()
    {
        return mSpotifyStatus;
    }

    public Status getTumblrStatus()
    {
        return mTumblrStatus;
    }

    public Status getTwitterStatus()
    {
        return mTwitterStatus;
    }

    public boolean hadError(mTwitterStatus mtwitterstatus)
    {
        if (mtwitterstatus != null) goto _L2; else goto _L1
_L1:
        if (getSpotifyStatus() == null || getSpotifyStatus().isSuccess()) goto _L4; else goto _L3
_L3:
        return true;
_L4:
        return false;
_L2:
        getSpotifyStatus[mtwitterstatus.getSpotifyStatus()];
        JVM INSTR tableswitch 1 3: default 60
    //                   1 62
    //                   2 81
    //                   3 100;
           goto _L5 _L6 _L7 _L8
_L8:
        continue; /* Loop/switch isn't completed */
_L5:
        return false;
_L6:
        if (getFacebookStatus() != null && !getFacebookStatus().isSuccess()) goto _L3; else goto _L9
_L9:
        return false;
_L7:
        if (getTwitterStatus() != null && !getTwitterStatus().isSuccess()) goto _L3; else goto _L10
_L10:
        return false;
        if (getTumblrStatus() != null && !getTumblrStatus().isSuccess()) goto _L3; else goto _L11
_L11:
        return false;
    }

    public int hashCode()
    {
        int l = 0;
        int i;
        int j;
        int k;
        if (mSpotifyStatus != null)
        {
            i = mSpotifyStatus.hashCode();
        } else
        {
            i = 0;
        }
        if (mFacebookStatus != null)
        {
            j = mFacebookStatus.hashCode();
        } else
        {
            j = 0;
        }
        if (mTwitterStatus != null)
        {
            k = mTwitterStatus.hashCode();
        } else
        {
            k = 0;
        }
        if (mTumblrStatus != null)
        {
            l = mTumblrStatus.hashCode();
        }
        return (k + (j + i * 31) * 31) * 31 + l;
    }

    public (Status status, Status status1, Status status2, Status status3)
    {
        mSpotifyStatus = status;
        mFacebookStatus = status1;
        mTwitterStatus = status2;
        mTumblrStatus = status3;
    }
}
