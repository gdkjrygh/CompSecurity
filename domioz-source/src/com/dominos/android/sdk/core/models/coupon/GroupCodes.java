// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.android.sdk.core.models.coupon;

import android.os.Parcel;
import android.os.Parcelable;

public class GroupCodes
    implements Parcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new _cls1();
    private boolean feeds1To2;
    private boolean feeds3To5;
    private boolean feeds6Plus;
    private boolean feedsAll;

    public GroupCodes()
    {
    }

    protected GroupCodes(Parcel parcel)
    {
        boolean flag1 = true;
        super();
        boolean flag;
        if (parcel.readByte() != 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        feedsAll = flag;
        if (parcel.readByte() != 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        feeds1To2 = flag;
        if (parcel.readByte() != 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        feeds3To5 = flag;
        if (parcel.readByte() != 0)
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        feeds6Plus = flag;
    }

    public int describeContents()
    {
        return 0;
    }

    public boolean isFeeds1To2()
    {
        return feeds1To2;
    }

    public boolean isFeeds3To5()
    {
        return feeds3To5;
    }

    public boolean isFeeds6Plus()
    {
        return feeds6Plus;
    }

    public boolean isFeedsAll()
    {
        return feedsAll;
    }

    public void setFeeds1To2(boolean flag)
    {
        feeds1To2 = flag;
    }

    public void setFeeds3To5(boolean flag)
    {
        feeds3To5 = flag;
    }

    public void setFeeds6Plus(boolean flag)
    {
        feeds6Plus = flag;
    }

    public void setFeedsAll(boolean flag)
    {
        feedsAll = flag;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        boolean flag = true;
        byte byte0;
        if (feedsAll)
        {
            byte0 = 1;
        } else
        {
            byte0 = 0;
        }
        parcel.writeByte(byte0);
        if (feeds1To2)
        {
            byte0 = 1;
        } else
        {
            byte0 = 0;
        }
        parcel.writeByte(byte0);
        if (feeds3To5)
        {
            byte0 = 1;
        } else
        {
            byte0 = 0;
        }
        parcel.writeByte(byte0);
        if (feeds6Plus)
        {
            byte0 = flag;
        } else
        {
            byte0 = 0;
        }
        parcel.writeByte(byte0);
    }


    private class _cls1
        implements android.os.Parcelable.Creator
    {

        public final GroupCodes createFromParcel(Parcel parcel)
        {
            return new GroupCodes(parcel);
        }

        public final volatile Object createFromParcel(Parcel parcel)
        {
            return createFromParcel(parcel);
        }

        public final GroupCodes[] newArray(int i)
        {
            return new GroupCodes[i];
        }

        public final volatile Object[] newArray(int i)
        {
            return newArray(i);
        }

        _cls1()
        {
        }
    }

}
