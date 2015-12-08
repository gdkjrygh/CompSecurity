// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.auditude.ads.model;

import com.auditude.ads.core.AdSettings;
import com.auditude.ads.core.AuditudeEnv;
import com.auditude.ads.model.media.MediaFile;
import com.auditude.ads.model.media.MediaStreamSet;
import com.auditude.ads.util.StringUtil;

// Referenced classes of package com.auditude.ads.model:
//            Asset, ILinearAsset, BaseElement

public class LinearAsset extends Asset
    implements ILinearAsset
{

    public LinearAsset(BaseElement baseelement)
    {
        super(baseelement);
    }

    public void CopyTo(Asset asset)
    {
        super.CopyTo(asset);
        if (asset != null)
        {
            copyTrackingEventsTo(asset, "start", null);
            copyTrackingEventsTo(asset, "firstquartile", null);
            copyTrackingEventsTo(asset, "midpoint", null);
            copyTrackingEventsTo(asset, "thirdquartile", null);
            copyTrackingEventsTo(asset, "complete", null);
        }
    }

    public String getType()
    {
        return "linear";
    }

    public String getUrl()
    {
        if (!StringUtil.isNullOrEmpty(getApiFramework()) && getApiFramework().toLowerCase().equals("vpaid"))
        {
            return super.getUrl();
        }
        MediaFile mediafile = MediaStreamSet.Search(getMediaFiles(), AuditudeEnv.getInstance().getAdSettings().getBitRate());
        if (mediafile != null && !StringUtil.isNullOrEmpty(mediafile.source))
        {
            return mediafile.source;
        } else
        {
            return super.getUrl();
        }
    }
}
