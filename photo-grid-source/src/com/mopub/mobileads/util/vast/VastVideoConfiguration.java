// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mopub.mobileads.util.vast;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// Referenced classes of package com.mopub.mobileads.util.vast:
//            VastCompanionAd

public class VastVideoConfiguration
    implements Serializable
{

    private final ArrayList a = new ArrayList();
    private final ArrayList b = new ArrayList();
    private final ArrayList c = new ArrayList();
    private final ArrayList d = new ArrayList();
    private final ArrayList e = new ArrayList();
    private final ArrayList f = new ArrayList();
    private final ArrayList g = new ArrayList();
    private String h;
    private String i;
    private String j;
    private String k;
    private VastCompanionAd l;
    private String m;
    private String n;
    private String o;
    private com.mopub.common.util.DeviceUtils.ForceOrientation p;

    public VastVideoConfiguration()
    {
        p = com.mopub.common.util.DeviceUtils.ForceOrientation.FORCE_LANDSCAPE;
    }

    public void addAbsoluteTrackers(List list)
    {
        c.addAll(list);
        Collections.sort(c);
    }

    public void addClickTrackers(List list)
    {
        g.addAll(list);
    }

    public void addCloseTrackers(List list)
    {
        e.addAll(list);
    }

    public void addCompleteTrackers(List list)
    {
        d.addAll(list);
    }

    public void addFractionalTrackers(List list)
    {
        b.addAll(list);
        Collections.sort(b);
    }

    public void addImpressionTrackers(List list)
    {
        a.addAll(list);
    }

    public void addSkipTrackers(List list)
    {
        f.addAll(list);
    }

    public ArrayList getAbsoluteTrackers()
    {
        return c;
    }

    public String getClickThroughUrl()
    {
        return h;
    }

    public List getClickTrackers()
    {
        return g;
    }

    public List getCloseTrackers()
    {
        return e;
    }

    public List getCompleteTrackers()
    {
        return d;
    }

    public String getCustomCloseIconUrl()
    {
        return o;
    }

    public String getCustomCtaText()
    {
        return m;
    }

    public com.mopub.common.util.DeviceUtils.ForceOrientation getCustomForceOrientation()
    {
        return p;
    }

    public String getCustomSkipText()
    {
        return n;
    }

    public String getDiskMediaFileUrl()
    {
        return j;
    }

    public ArrayList getFractionalTrackers()
    {
        return b;
    }

    public List getImpressionTrackers()
    {
        return a;
    }

    public String getNetworkMediaFileUrl()
    {
        return i;
    }

    public String getSkipOffset()
    {
        return k;
    }

    public List getSkipTrackers()
    {
        return f;
    }

    public VastCompanionAd getVastCompanionAd()
    {
        return l;
    }

    public void setClickThroughUrl(String s)
    {
        h = s;
    }

    public void setCustomCloseIconUrl(String s)
    {
        if (s != null)
        {
            o = s;
        }
    }

    public void setCustomCtaText(String s)
    {
        if (s != null)
        {
            m = s;
        }
    }

    public void setCustomForceOrientation(com.mopub.common.util.DeviceUtils.ForceOrientation forceorientation)
    {
        if (forceorientation != null && forceorientation != com.mopub.common.util.DeviceUtils.ForceOrientation.UNDEFINED)
        {
            p = forceorientation;
        }
    }

    public void setCustomSkipText(String s)
    {
        if (s != null)
        {
            n = s;
        }
    }

    public void setDiskMediaFileUrl(String s)
    {
        j = s;
    }

    public void setNetworkMediaFileUrl(String s)
    {
        i = s;
    }

    public void setSkipOffset(String s)
    {
        if (s != null)
        {
            k = s;
        }
    }

    public void setVastCompanionAd(VastCompanionAd vastcompanionad)
    {
        l = vastcompanionad;
    }
}
