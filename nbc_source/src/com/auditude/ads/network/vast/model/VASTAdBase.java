// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.auditude.ads.network.vast.model;

import com.auditude.ads.util.StringUtil;
import java.util.ArrayList;

// Referenced classes of package com.auditude.ads.network.vast.model:
//            VASTTrackingUrl

public class VASTAdBase
{

    public String adSystem;
    public String errorUrl;
    private ArrayList extensions;
    private ArrayList impressionUrls;
    private String networkAdId;
    private String skipOffset;

    public VASTAdBase()
    {
    }

    public final void addExtension(Object obj)
    {
        if (obj == null)
        {
            return;
        }
        if (extensions == null)
        {
            extensions = new ArrayList();
        }
        extensions.add(obj);
    }

    public final void addImpressionUrl(VASTTrackingUrl vasttrackingurl)
    {
        if (StringUtil.isNullOrEmpty(vasttrackingurl.getUrl()))
        {
            return;
        }
        if (impressionUrls == null)
        {
            impressionUrls = new ArrayList();
        }
        impressionUrls.add(vasttrackingurl);
    }

    public final ArrayList getExtensions()
    {
        return extensions;
    }

    public final ArrayList getImpressionUrls()
    {
        return impressionUrls;
    }

    public final String getNetworkAdId()
    {
        return networkAdId;
    }

    public final String getSkipOffset()
    {
        return skipOffset;
    }

    public final void setNetworkAdId(String s)
    {
        networkAdId = s;
    }

    public final void setSkipOffset(String s)
    {
        skipOffset = s;
    }
}
