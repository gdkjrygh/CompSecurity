// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nbcsports.liveextra.library.api.models;

import java.util.List;

// Referenced classes of package com.nbcsports.liveextra.library.api.models:
//            TourSchedule

public class TourInfo
{
    public static class TourInfoBuilder
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

        public TourInfoBuilder code(String s)
        {
            code = s;
            return this;
        }

        public TourInfoBuilder dates(String s)
        {
            dates = s;
            return this;
        }

        public TourInfoBuilder par(String s)
        {
            par = s;
            return this;
        }

        public TourInfoBuilder purse(String s)
        {
            purse = s;
            return this;
        }

        public TourInfoBuilder roundInProgress(String s)
        {
            roundInProgress = s;
            return this;
        }

        public TourInfoBuilder title(String s)
        {
            title = s;
            return this;
        }

        public String toString()
        {
            return (new StringBuilder()).append("TourInfo.TourInfoBuilder(code=").append(code).append(", title=").append(title).append(", roundInProgress=").append(roundInProgress).append(", dates=").append(dates).append(", par=").append(par).append(", yardage=").append(yardage).append(", purse=").append(purse).append(", tourSchedule=").append(tourSchedule).append(")").toString();
        }

        public TourInfoBuilder tourSchedule(List list)
        {
            tourSchedule = list;
            return this;
        }

        public TourInfoBuilder yardage(String s)
        {
            yardage = s;
            return this;
        }

        TourInfoBuilder()
        {
        }
    }


    String code;
    String dates;
    String par;
    String purse;
    String roundInProgress;
    String title;
    List tourSchedule;
    String yardage;

    public TourInfo()
    {
    }

    public TourInfo(String s, String s1, String s2, String s3, String s4, String s5, String s6, 
            List list)
    {
        code = s;
        title = s1;
        roundInProgress = s2;
        dates = s3;
        par = s4;
        yardage = s5;
        purse = s6;
        tourSchedule = list;
    }

    public static TourInfoBuilder builder()
    {
        return new TourInfoBuilder();
    }

    public String getCode()
    {
        return code;
    }

    public String getDates()
    {
        return dates;
    }

    public String getPar()
    {
        return par;
    }

    public String getPurse()
    {
        if (purse != null && purse.startsWith("\uFFFD"))
        {
            purse = purse.replace('\uFFFD', '$');
        }
        return purse;
    }

    public String getRoundInProgress()
    {
        return roundInProgress;
    }

    public String getTitle()
    {
        return title;
    }

    public List getTourSchedule()
    {
        return tourSchedule;
    }

    public String getYardage()
    {
        return yardage;
    }

    public boolean hasData()
    {
        return getTitle() != null;
    }

    public String toString()
    {
        StringBuffer stringbuffer = new StringBuffer();
        stringbuffer.append((new StringBuilder()).append("Title: ").append(getTitle()).toString());
        stringbuffer.append("\r\n");
        stringbuffer.append((new StringBuilder()).append("Round In Progress: ").append(getRoundInProgress()).toString());
        stringbuffer.append("\r\n");
        stringbuffer.append((new StringBuilder()).append("Dates: ").append(getDates()).toString());
        stringbuffer.append("\r\n");
        stringbuffer.append((new StringBuilder()).append("PAR: ").append(getPar()).toString());
        stringbuffer.append("\r\n");
        stringbuffer.append((new StringBuilder()).append("Yardage: ").append(getYardage()).toString());
        stringbuffer.append("\r\n");
        stringbuffer.append((new StringBuilder()).append("Purse: ").append(getPurse()).toString());
        stringbuffer.append("\r\n");
        TourSchedule tourschedule;
        if (getTourSchedule().isEmpty())
        {
            tourschedule = new TourSchedule();
        } else
        {
            tourschedule = (TourSchedule)getTourSchedule().get(0);
        }
        stringbuffer.append((new StringBuilder()).append("Location: ").append(tourschedule.getLocation()).toString());
        stringbuffer.append("\r\n");
        stringbuffer.append((new StringBuilder()).append("Champion: ").append(tourschedule.getChampion()).toString());
        stringbuffer.append("\r\n");
        stringbuffer.append((new StringBuilder()).append("Name: ").append(tourschedule.getName()).toString());
        stringbuffer.append("\r\n");
        return stringbuffer.toString();
    }
}
