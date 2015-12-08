// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.amobee.richmedia.controller;

import android.os.Parcel;

// Referenced classes of package com.amobee.richmedia.controller:
//            OrmmaController

public static class init> extends init>
{

    public static final android.os.ReflectedParcelable CREATOR = new android.os.Parcelable.Creator() {

        public OrmmaController.RecurrenceProperties createFromParcel(Parcel parcel)
        {
            return new OrmmaController.RecurrenceProperties(parcel);
        }

        public volatile Object createFromParcel(Parcel parcel)
        {
            return createFromParcel(parcel);
        }

        public OrmmaController.RecurrenceProperties[] newArray(int i)
        {
            return new OrmmaController.RecurrenceProperties[i];
        }

        public volatile Object[] newArray(int i)
        {
            return newArray(i);
        }

    };
    public short daysInMonth[];
    public short daysInWeek[];
    public short daysInYear[];
    public String exceptionDates[];
    public String expires;
    public String frequency;
    public int interval;
    public short monthsInYear[];
    public short weeksInMonth[];


    public _cls1()
    {
        frequency = "-1";
        interval = -1;
        expires = "";
        exceptionDates = null;
        daysInWeek = null;
        daysInMonth = null;
        daysInYear = null;
        weeksInMonth = null;
        monthsInYear = null;
    }

    protected monthsInYear(Parcel parcel)
    {
        super(parcel);
    }
}
