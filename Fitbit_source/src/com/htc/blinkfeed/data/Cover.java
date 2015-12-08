// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.htc.blinkfeed.data;


// Referenced classes of package com.htc.blinkfeed.data:
//            Storable

public class Cover extends Storable
{

    String url_hq;
    String url_lq;
    String url_mq;

    public Cover()
    {
    }

    public void setHighQualityImage(String s)
    {
        url_hq = s;
    }

    public void setLowQualityImage(String s)
    {
        url_lq = s;
    }

    public void setNormalQualityImage(String s)
    {
        url_mq = s;
    }
}
