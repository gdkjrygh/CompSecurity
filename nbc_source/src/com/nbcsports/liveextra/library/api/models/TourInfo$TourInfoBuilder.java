// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nbcsports.liveextra.library.api.models;

import java.util.List;

// Referenced classes of package com.nbcsports.liveextra.library.api.models:
//            TourInfo

public static class I
{

    private String code;
    private String dates;
    private String par;
    private String purse;
    private String roundInProgress;
    private String title;
    private List tourSchedule;
    private String yardage;

    public TourInfo build()
    {
        return new TourInfo(code, title, roundInProgress, dates, par, yardage, purse, tourSchedule);
    }

    public tourSchedule code(String s)
    {
        code = s;
        return this;
    }

    public code dates(String s)
    {
        dates = s;
        return this;
    }

    public dates par(String s)
    {
        par = s;
        return this;
    }

    public par purse(String s)
    {
        purse = s;
        return this;
    }

    public purse roundInProgress(String s)
    {
        roundInProgress = s;
        return this;
    }

    public roundInProgress title(String s)
    {
        title = s;
        return this;
    }

    public String toString()
    {
        return (new StringBuilder()).append("TourInfo.TourInfoBuilder(code=").append(code).append(", title=").append(title).append(", roundInProgress=").append(roundInProgress).append(", dates=").append(dates).append(", par=").append(par).append(", yardage=").append(yardage).append(", purse=").append(purse).append(", tourSchedule=").append(tourSchedule).append(")").toString();
    }

    public tourSchedule tourSchedule(List list)
    {
        tourSchedule = list;
        return this;
    }

    public tourSchedule yardage(String s)
    {
        yardage = s;
        return this;
    }

    I()
    {
    }
}
