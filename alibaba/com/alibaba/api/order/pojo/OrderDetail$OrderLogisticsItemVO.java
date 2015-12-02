// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.alibaba.api.order.pojo;

import java.util.Date;
import java.util.List;

// Referenced classes of package com.alibaba.api.order.pojo:
//            OrderDetail

public static class OrderLogisticsTrackVO
{
    public static class OrderLogisticsTrackVO
    {

        public String addressForDisplay;
        public Date eventDate;
        public String eventDateString;
        public String eventDesc;

        public OrderLogisticsTrackVO()
        {
        }
    }


    public String logisticsNo;
    public String logisticsServiceName;
    public List logisticsTracks;
    public String logisticsTypeCode;
    public String officialWebsite;
    public String sentTime;
    public String sentTimeString;
    public String toAreaWebsite;

    public OrderLogisticsTrackVO()
    {
    }
}
