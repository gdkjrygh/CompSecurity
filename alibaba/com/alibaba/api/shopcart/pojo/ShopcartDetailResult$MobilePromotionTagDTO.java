// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.alibaba.api.shopcart.pojo;


// Referenced classes of package com.alibaba.api.shopcart.pojo:
//            ShopcartDetailResult

public static class promotionCountdownTime
{

    public boolean bigSaleCountdownSwitch;
    public int bigSaleStatus;
    public boolean promotionCountdownSwitch;
    public long promotionCountdownTime;
    public String promotionTagEndTime;
    public String promotionTagIcon;
    public String promotionTagInfo;
    public boolean promotionTagShowSwitch;
    public String promotionTagStartTime;

    public ()
    {
        promotionTagShowSwitch = false;
        promotionCountdownSwitch = false;
        bigSaleCountdownSwitch = false;
        bigSaleStatus = 0;
        promotionCountdownTime = 0L;
    }
}
