// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.piccollage.model.gson;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.cardinalblue.android.piccollage.model.gson:
//            PicUser

public class PicUsersData
    implements Parcelable
{
    public static class Creator
        implements android.os.Parcelable.Creator
    {

        public PicUsersData createFromParcel(Parcel parcel)
        {
            return new PicUsersData(parcel);
        }

        public volatile Object createFromParcel(Parcel parcel)
        {
            return createFromParcel(parcel);
        }

        public PicUsersData[] newArray(int i)
        {
            return new PicUsersData[i];
        }

        public volatile Object[] newArray(int i)
        {
            return newArray(i);
        }

        public Creator()
        {
        }
    }


    public static final android.os.Parcelable.Creator CREATOR = new Creator();
    private int mLimit;
    private String mListRevision;
    private int mOffset;
    private final List mPicUsers;
    private int mTotal;

    public PicUsersData()
    {
        mPicUsers = new ArrayList();
        mOffset = 0;
        mTotal = 0;
        mLimit = 0;
        mListRevision = "";
    }

    public PicUsersData(Parcel parcel)
    {
        mPicUsers = new ArrayList();
        readFromParcel(parcel);
    }

    private void readFromParcel(Parcel parcel)
    {
        mOffset = parcel.readInt();
        mTotal = parcel.readInt();
        parcel.readTypedList(mPicUsers, PicUser.CREATOR);
        mListRevision = parcel.readString();
        mLimit = parcel.readInt();
    }

    public int describeContents()
    {
        return 0;
    }

    public boolean equals(Object obj)
    {
        return obj != null && (obj instanceof PicUsersData) && mListRevision.equals(((PicUsersData)obj).mListRevision);
    }

    public int getLimit()
    {
        return mLimit;
    }

    public String getListRevision()
    {
        return mListRevision;
    }

    public int getOffset()
    {
        return mOffset;
    }

    public int getTotal()
    {
        return mTotal;
    }

    public List getUsers()
    {
        return mPicUsers;
    }

    public void updateDataWith(PicUsersData picusersdata)
    {
        if (picusersdata != null)
        {
            mTotal = picusersdata.getTotal();
            mOffset = picusersdata.getOffset();
            mLimit = picusersdata.getLimit();
            picusersdata = picusersdata.getUsers().iterator();
            do
            {
                if (!picusersdata.hasNext())
                {
                    break;
                }
                PicUser picuser = (PicUser)picusersdata.next();
                if (mPicUsers.contains(picuser))
                {
                    int i = mPicUsers.indexOf(picuser);
                    if (i != -1)
                    {
                        mPicUsers.set(i, picuser);
                    }
                } else
                {
                    mPicUsers.add(picuser);
                }
            } while (true);
        }
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeInt(mOffset);
        parcel.writeInt(mTotal);
        parcel.writeTypedList(mPicUsers);
        parcel.writeString(mListRevision);
        parcel.writeInt(mLimit);
    }

}
