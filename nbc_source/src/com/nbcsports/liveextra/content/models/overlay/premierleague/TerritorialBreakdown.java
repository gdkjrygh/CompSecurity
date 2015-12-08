// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nbcsports.liveextra.content.models.overlay.premierleague;

import java.util.List;

public class TerritorialBreakdown
{
    public class TerritorialInterval
    {

        double awayPercent;
        double homePercent;
        String intervalType;
        final TerritorialBreakdown this$0;

        public double getAwayPercent()
        {
            return awayPercent;
        }

        public double getHomePercent()
        {
            return homePercent;
        }

        public String getIntervalType()
        {
            return intervalType;
        }

        public TerritorialInterval()
        {
            this$0 = TerritorialBreakdown.this;
            super();
        }
    }


    List territorialIntervals;

    public TerritorialBreakdown()
    {
    }

    public List getTerritorialIntervals()
    {
        return territorialIntervals;
    }
}
