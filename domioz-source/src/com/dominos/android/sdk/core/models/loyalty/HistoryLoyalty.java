// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.android.sdk.core.models.loyalty;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.dominos.android.sdk.core.models.loyalty:
//            History

public class HistoryLoyalty
    implements Parcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new _cls1();
    private String mCustomerId;
    private List mHistory;
    private String mLastActivityDate;
    private int mPendingPointBalance;
    private String mPointExpirationDate;
    private int mVestedPointBalance;

    public HistoryLoyalty()
    {
    }

    private HistoryLoyalty(Parcel parcel)
    {
        setPendingPointBalance(parcel.readInt());
        setVestedPointBalance(parcel.readInt());
        setCustomerId(parcel.readString());
        setLastActivityDate(parcel.readString());
        setPointExpirationDate(parcel.readString());
        parcel = parcel.readBundle();
        parcel.setClassLoader(com/dominos/android/sdk/core/models/loyalty/History.getClassLoader());
        mHistory = parcel.getParcelableArrayList("mHistory");
    }

    HistoryLoyalty(Parcel parcel, _cls1 _pcls1)
    {
        this(parcel);
    }

    public int describeContents()
    {
        return 0;
    }

    public String getCustomerId()
    {
        return mCustomerId;
    }

    public List getHistory()
    {
        return mHistory;
    }

    public String getLastActivityDate()
    {
        return mLastActivityDate;
    }

    public int getPendingPointBalance()
    {
        return mPendingPointBalance;
    }

    public String getPointExpirationDate()
    {
        return mPointExpirationDate;
    }

    public int getVestedPointBalance()
    {
        return mVestedPointBalance;
    }

    public void setCustomerId(String s)
    {
        mCustomerId = s;
    }

    public void setHistory(List list)
    {
        mHistory = list;
    }

    public void setLastActivityDate(String s)
    {
        mLastActivityDate = s;
    }

    public void setPendingPointBalance(int i)
    {
        mPendingPointBalance = i;
    }

    public void setPointExpirationDate(String s)
    {
        mPointExpirationDate = s;
    }

    public void setVestedPointBalance(int i)
    {
        mVestedPointBalance = i;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeInt(mPendingPointBalance);
        parcel.writeInt(mVestedPointBalance);
        parcel.writeString(mCustomerId);
        parcel.writeString(mLastActivityDate);
        parcel.writeString(mPointExpirationDate);
        Bundle bundle = new Bundle();
        ArrayList arraylist;
        if (mHistory != null)
        {
            arraylist = (ArrayList)mHistory;
        } else
        {
            arraylist = new ArrayList();
        }
        bundle.putParcelableArrayList("mHistory", arraylist);
        parcel.writeBundle(bundle);
    }


    private class _cls1
        implements android.os.Parcelable.Creator
    {

        public final HistoryLoyalty createFromParcel(Parcel parcel)
        {
            return new HistoryLoyalty(parcel, null);
        }

        public final volatile Object createFromParcel(Parcel parcel)
        {
            return createFromParcel(parcel);
        }

        public final HistoryLoyalty[] newArray(int i)
        {
            return new HistoryLoyalty[i];
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
