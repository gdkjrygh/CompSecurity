// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.auditude.ads.model;

import com.auditude.ads.core.AuditudeEnv;
import com.auditude.ads.reporting.ReportingHelper;
import com.auditude.ads.util.AuditudeUtil;

// Referenced classes of package com.auditude.ads.model:
//            BaseElement, IClick, IAsset, Asset

public class Click extends BaseElement
    implements IClick
{

    private String altText;
    private Click baseTrackingClick;
    private boolean shouldAppendParState;
    private String target;
    private String title;
    private String url;

    public Click(BaseElement baseelement)
    {
        super(baseelement);
        shouldAppendParState = false;
    }

    public final String getAltText()
    {
        return altText;
    }

    public final IAsset getAsset()
    {
        if (getParent() instanceof IAsset)
        {
            return (IAsset)getParent();
        } else
        {
            return null;
        }
    }

    public final Click getBaseTrackingClick()
    {
        return baseTrackingClick;
    }

    public final boolean getShouldAppendParState()
    {
        return shouldAppendParState;
    }

    public final String getTarget()
    {
        return target;
    }

    public final String getTitle()
    {
        return title;
    }

    public final String getUrl()
    {
        String s;
        if (shouldAppendParState)
        {
            s = AuditudeUtil.getUrlWithState(url, AuditudeEnv.getInstance().getReportingHelper().currentAdState());
        } else
        {
            s = url;
        }
        return AuditudeUtil.substituteTags(s);
    }

    public final boolean isNetworkElement()
    {
        return (getParent() instanceof Asset) && ((Asset)getParent()).isNetworkAd();
    }

    public final void setAltText(String s)
    {
        altText = s;
    }

    public final void setBaseTrackingClick(Click click)
    {
        baseTrackingClick = click;
    }

    public final void setShouldAppendParState(boolean flag)
    {
        shouldAppendParState = flag;
    }

    public final void setTarget(String s)
    {
        target = s;
    }

    public final void setTitle(String s)
    {
        title = s;
    }

    public final void setUrl(String s)
    {
        url = s;
    }
}
