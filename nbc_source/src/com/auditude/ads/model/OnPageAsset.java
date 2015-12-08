// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.auditude.ads.model;

import com.auditude.ads.model.tracking.TrackingEvent;
import com.auditude.ads.model.tracking.TrackingUrl;
import com.auditude.ads.util.AuditudeUtil;
import com.auditude.ads.util.StringUtil;
import com.auditude.ads.util.view.OnPageAssetUtil;
import java.util.ArrayList;
import java.util.Iterator;

// Referenced classes of package com.auditude.ads.model:
//            Asset, IOnPageAsset, Click, IClick, 
//            BaseElement

public class OnPageAsset extends Asset
    implements IOnPageAsset
{

    private String altText;
    private String source;
    private IOnPageAsset staticAsset;

    public OnPageAsset(BaseElement baseelement)
    {
        super(baseelement);
        setFormat("onpage");
    }

    public void CopyTo(Asset asset)
    {
        super.CopyTo(asset);
        if (asset.getClick() != null && getClick() != null)
        {
            IClick iclick = getClick();
            Click click = (Click)asset.getClick();
            if (iclick instanceof Click)
            {
                asset = iclick;
            } else
            {
                asset = null;
            }
            click.setBaseTrackingClick((Click)asset);
        }
    }

    public final String[] ImpressionUrls()
    {
        ArrayList arraylist;
        Object obj;
        arraylist = new ArrayList();
        obj = getTrackingEventByType("creativeview");
        if (obj == null || ((TrackingEvent) (obj)).getTrackingUrls() == null) goto _L2; else goto _L1
_L1:
        obj = ((TrackingEvent) (obj)).getTrackingUrls().iterator();
_L5:
        if (((Iterator) (obj)).hasNext()) goto _L3; else goto _L2
_L2:
        return (String[])arraylist.toArray(new String[0]);
_L3:
        TrackingUrl trackingurl = (TrackingUrl)((Iterator) (obj)).next();
        if (trackingurl != null && !StringUtil.isNullOrEmpty(trackingurl.getUrl()))
        {
            arraylist.add(AuditudeUtil.substituteTags(AuditudeUtil.substituteTags(trackingurl.getUrl())));
        }
        if (true) goto _L5; else goto _L4
_L4:
    }

    public OnPageAsset clone()
    {
        OnPageAsset onpageasset = new OnPageAsset(getParent());
        onpageasset.setState(getState());
        onpageasset.setID(getID());
        onpageasset.setTrackingEvents(getTrackingEvents());
        onpageasset.setTitle(getTitle());
        onpageasset.setDescription(getDescription());
        onpageasset.setFormat(getFormat());
        onpageasset.setResourceType(getResourceType());
        onpageasset.setCreativeType(getCreativeType());
        onpageasset.setApiFramework(getApiFramework());
        onpageasset.setAdParameters(getAdParameters());
        onpageasset.setCustomData(getCustomData());
        onpageasset.setAuditudeParams(getAuditudeParams());
        onpageasset.setDurationInMillis(getDurationInMillis());
        onpageasset.setLeadTimeInMillis(getLeadTimeInMillis());
        onpageasset.setClick(getClick());
        onpageasset.setMediaFiles(getMediaFiles());
        onpageasset.setAltText(getAltText());
        onpageasset.source = source;
        return onpageasset;
    }

    public volatile Object clone()
        throws CloneNotSupportedException
    {
        return clone();
    }

    public final String getAltText()
    {
        return altText;
    }

    public final boolean getIsBanner()
    {
        return getFormat().equals("onpage");
    }

    public String getResourceType()
    {
        return super.getResourceType();
    }

    public String getSource()
    {
        String s = null;
        if (super.getResourceType().equals("iframe"))
        {
            s = OnPageAssetUtil.GetHTMLForIFrameURL(AuditudeUtil.substituteTags(getUrl()), getWidth(), getHeight(), ImpressionUrls());
        } else
        {
            if (super.getResourceType().equals("static"))
            {
                String s2 = "";
                String s1 = s2;
                if (getClick() != null)
                {
                    s1 = s2;
                    if (getClick().getUrl() != null)
                    {
                        s1 = getClick().getUrl();
                    }
                }
                return OnPageAssetUtil.GetHTMLForImageURL(AuditudeUtil.substituteTags(getUrl()), s1, getWidth(), getHeight(), altText, ImpressionUrls());
            }
            if (super.getResourceType().equals("html"))
            {
                return (new StringBuilder(String.valueOf(getUrl()))).append(OnPageAssetUtil.GetTrackingPixels(ImpressionUrls())).toString();
            }
        }
        return s;
    }

    public final IOnPageAsset getStaticAsset()
    {
        return staticAsset;
    }

    public String getType()
    {
        return "companion";
    }

    public final void setAltText(String s)
    {
        altText = s;
    }

    public void setResourceType(String s)
    {
        super.setResourceType(s);
    }

    public final void setStaticAsset(IOnPageAsset ionpageasset)
    {
        staticAsset = ionpageasset;
    }
}
