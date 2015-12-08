// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.auditude.ads.model.tracking;

import com.auditude.ads.util.AuditudeUtil;
import com.auditude.ads.util.PingUtil;
import com.auditude.ads.util.StringUtil;
import java.util.HashMap;

public class TrackingUrl
{

    private boolean isLogged;
    private int offset;
    private Boolean offsetIsPercent;
    private String type;
    private String url;

    public TrackingUrl(String s, String s1)
    {
        isLogged = false;
        offset = 0;
        offsetIsPercent = Boolean.valueOf(false);
        url = s;
        type = s1;
    }

    public TrackingUrl duplicate()
    {
        return new TrackingUrl(getUrl(), getType());
    }

    public final int getOffset()
    {
        return offset;
    }

    public final Boolean getOffsetIsPercent()
    {
        return offsetIsPercent;
    }

    public final String getType()
    {
        return type;
    }

    public String getUrl()
    {
        return url;
    }

    public final boolean isLogged()
    {
        return isLogged;
    }

    public void log()
    {
        log(false, null, -1);
    }

    public void log(boolean flag)
    {
        log(flag, null, -1);
    }

    public void log(boolean flag, HashMap hashmap)
    {
        log(flag, hashmap, -1);
    }

    public void log(boolean flag, HashMap hashmap, int i)
    {
        if (isLogged && !flag)
        {
            return;
        }
        if (!StringUtil.isNullOrEmpty(url))
        {
            if (i >= 0)
            {
                PingUtil.pingUrl(AuditudeUtil.substituteTags(url.replaceAll("\\[ERRORCODE\\]", String.valueOf(i)).replaceAll("%5BERRORCODE%5D", String.valueOf(i))));
            } else
            {
                PingUtil.pingUrl(AuditudeUtil.substituteTags(url));
            }
        }
        isLogged = true;
    }

    public final void setLogged(boolean flag)
    {
        isLogged = flag;
    }

    public final void setOffset(int i)
    {
        offset = i;
    }

    public final void setOffsetIsPercent(Boolean boolean1)
    {
        offsetIsPercent = boolean1;
    }
}
