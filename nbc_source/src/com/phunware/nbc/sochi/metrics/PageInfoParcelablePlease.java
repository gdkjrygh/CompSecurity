// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.phunware.nbc.sochi.metrics;

import android.os.Parcel;

public class PageInfoParcelablePlease
{

    public PageInfoParcelablePlease()
    {
    }

    public static void readFromParcel(TrackingHelperBase.PageInfo pageinfo, Parcel parcel)
    {
        pageinfo.pageName = parcel.readString();
        pageinfo.contentHub = parcel.readString();
        pageinfo.subfeatureHub = parcel.readString();
        pageinfo.sport = parcel.readString();
    }

    public static void writeToParcel(TrackingHelperBase.PageInfo pageinfo, Parcel parcel, int i)
    {
        parcel.writeString(pageinfo.pageName);
        parcel.writeString(pageinfo.contentHub);
        parcel.writeString(pageinfo.subfeatureHub);
        parcel.writeString(pageinfo.sport);
    }
}
