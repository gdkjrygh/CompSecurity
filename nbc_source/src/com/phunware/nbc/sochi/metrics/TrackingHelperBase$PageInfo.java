// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.phunware.nbc.sochi.metrics;

import android.os.Parcel;
import android.os.Parcelable;

// Referenced classes of package com.phunware.nbc.sochi.metrics:
//            TrackingHelperBase, PageInfoParcelablePlease

public static class sport
    implements Parcelable
{

    public static final android.os.HelperBase.PageInfo CREATOR = new android.os.Parcelable.Creator() {

        public TrackingHelperBase.PageInfo createFromParcel(Parcel parcel)
        {
            TrackingHelperBase.PageInfo pageinfo = new TrackingHelperBase.PageInfo();
            PageInfoParcelablePlease.readFromParcel(pageinfo, parcel);
            return pageinfo;
        }

        public volatile Object createFromParcel(Parcel parcel)
        {
            return createFromParcel(parcel);
        }

        public TrackingHelperBase.PageInfo[] newArray(int i)
        {
            return new TrackingHelperBase.PageInfo[i];
        }

        public volatile Object[] newArray(int i)
        {
            return newArray(i);
        }

    };
    public String contentHub;
    public String pageName;
    public String sport;
    public String subfeatureHub;

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        PageInfoParcelablePlease.writeToParcel(this, parcel, i);
    }


    protected _cls1()
    {
    }

    public _cls1(Parcel parcel)
    {
    }

    public _cls1(String s, String s1, String s2, String s3)
    {
        pageName = s;
        contentHub = s1;
        subfeatureHub = s2;
        sport = s3;
    }
}
