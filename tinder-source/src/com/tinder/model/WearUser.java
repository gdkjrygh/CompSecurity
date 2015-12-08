// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.model;

import com.google.android.gms.wearable.Asset;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class WearUser
    implements Serializable
{

    private String mAbout;
    private String mAge;
    private Asset mAsset;
    private List mFriendNames;
    private String mId;
    private List mInterestNames;
    private String mName;
    private String mPhotoUrl;

    public WearUser(String s, String s1, String s2, String s3, List list, List list1)
    {
        mName = "";
        mPhotoUrl = "";
        mAge = "";
        mAbout = "";
        mId = "";
        mInterestNames = new ArrayList(0) {

            final WearUser this$0;

            
            {
                this$0 = WearUser.this;
                super(i);
                add("");
            }
        };
        mFriendNames = new ArrayList(0) {

            final WearUser this$0;

            
            {
                this$0 = WearUser.this;
                super(i);
                add("");
            }
        };
        mId = s;
        mName = s1;
        mAge = s2;
        mAbout = s3;
        mInterestNames = list;
        mFriendNames = list1;
    }

    public String getAbout()
    {
        return mAbout;
    }

    public String getAge()
    {
        return mAge;
    }

    public Asset getAsset()
    {
        return mAsset;
    }

    public int getFriendCount()
    {
        if (mFriendNames == null)
        {
            return 0;
        } else
        {
            return mFriendNames.size();
        }
    }

    public List getFriendNames()
    {
        return mFriendNames;
    }

    public String getId()
    {
        return mId;
    }

    public int getInterestCount()
    {
        if (mInterestNames == null)
        {
            return 0;
        } else
        {
            return mInterestNames.size();
        }
    }

    public List getInterestNames()
    {
        return mInterestNames;
    }

    public String getName()
    {
        return mName;
    }

    public String getPhotoUrl()
    {
        return mPhotoUrl;
    }

    public void setAsset(Asset asset)
    {
        mAsset = asset;
    }

    public String toString()
    {
        return (new StringBuilder("WearUser [id=")).append(mId).append(", age=").append(mAge).append(", name=").append(mName).append(", interestNames=").append(mInterestNames).append(", friendNames=").append(mFriendNames).append("]").toString();
    }
}
