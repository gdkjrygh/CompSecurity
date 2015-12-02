// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mobvista.sdk.m.core.entity;

import com.mobvista.sdk.m.core.util.NoProGuard;
import java.io.Serializable;

// Referenced classes of package com.mobvista.sdk.m.core.entity:
//            Campaign

public class CampaignEx extends Campaign
    implements NoProGuard, Serializable
{

    private static final long serialVersionUID = 1L;
    private String clickURL;
    private String impressionURL;
    private com.mobvista.sdk.m.core.loader.JumpLoader.JumpLoaderResult jumpResult;
    private String noticeUrl;
    private String onlyImpressionURL;
    private boolean preClick;
    private int tab;

    public CampaignEx()
    {
        tab = 0;
        impressionURL = "";
        noticeUrl = "";
        clickURL = "";
        onlyImpressionURL = "";
        preClick = false;
    }

    public String getClickURL()
    {
        return clickURL;
    }

    public String getImpressionURL()
    {
        return impressionURL;
    }

    public com.mobvista.sdk.m.core.loader.JumpLoader.JumpLoaderResult getJumpResult()
    {
        return jumpResult;
    }

    public String getNoticeUrl()
    {
        return noticeUrl;
    }

    public String getOnlyImpressionURL()
    {
        return onlyImpressionURL;
    }

    public int getTab()
    {
        return tab;
    }

    public boolean isPreClick()
    {
        return preClick;
    }

    public void setClickURL(String s)
    {
        clickURL = s;
    }

    public void setImpressionURL(String s)
    {
        impressionURL = s;
    }

    public void setJumpResult(com.mobvista.sdk.m.core.loader.JumpLoader.JumpLoaderResult jumploaderresult)
    {
        jumpResult = jumploaderresult;
    }

    public void setNoticeUrl(String s)
    {
        noticeUrl = s;
    }

    public void setOnlyImpressionURL(String s)
    {
        onlyImpressionURL = s;
    }

    public void setPreClick(boolean flag)
    {
        preClick = flag;
    }

    public void setTab(int i)
    {
        tab = i;
    }
}
