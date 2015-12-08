// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pandora.android.data;

import com.pandora.android.util.s;
import java.io.Serializable;
import java.security.InvalidParameterException;
import java.util.HashMap;

public class g
    implements Serializable
{

    private HashMap a;
    private long b;

    public g(HashMap hashmap)
    {
        int i1 = 2;
        super();
        if (hashmap == null)
        {
            throw new InvalidParameterException("data cannot be null");
        }
        a = hashmap;
        if (a.containsKey("hoursUntilExpiration"))
        {
            i1 = Integer.parseInt(a("hoursUntilExpiration", String.valueOf(2)));
        }
        long l1 = System.currentTimeMillis();
        b = (long)i1 * 0x36ee80L + l1;
    }

    private String a(String s1, String s2)
    {
        s1 = (String)a.get(s1);
        if (com.pandora.android.util.s.a(s1))
        {
            return s2;
        } else
        {
            return s1;
        }
    }

    public String A()
    {
        return (String)a.get("baseUrlKey");
    }

    public String B()
    {
        return (String)a.get("remainingUrl");
    }

    public String C()
    {
        return (String)a.get("limitAdTrackingReplacementString");
    }

    public boolean D()
    {
        String s1 = (String)a.get("creativeType");
        boolean flag;
        if (s1 != null && "yume3".equalsIgnoreCase(s1))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        return flag && v() != null && w() != null;
    }

    public boolean E()
    {
        String s1 = (String)a.get("creativeType");
        return s1 != null && "adm".equalsIgnoreCase(s1);
    }

    public String a()
    {
        return (String)a.get("adId");
    }

    public String b()
    {
        return (String)a.get("creativeId");
    }

    public boolean c()
    {
        String s1 = (String)a.get("isVastAd");
        if ("1".equals(s1))
        {
            return true;
        }
        if ("0".equals(s1))
        {
            return false;
        } else
        {
            return Boolean.parseBoolean(s1);
        }
    }

    public String d()
    {
        return (String)a.get("assetPath");
    }

    public String e()
    {
        return (String)a.get("companionHTML_320x50");
    }

    public long f()
    {
        return b;
    }

    public String g()
    {
        return (String)a.get("clickthrough_learnMore");
    }

    public String h()
    {
        return (String)a.get("trackingUrl_videoInitiated");
    }

    public String[] i()
    {
        return (new String[] {
            (String)a.get("trackingUrl_videoInitiated"), (String)a.get("internalUrl_videoInitiated")
        });
    }

    public String[] j()
    {
        return (new String[] {
            (String)a.get("trackingUrl_videoClosedBeforeEnd"), (String)a.get("internalUrl_videoClosedBeforeEnd")
        });
    }

    public String[] k()
    {
        return (new String[] {
            (String)a.get("trackingUrl_videoPlaybackStarted"), (String)a.get("internalUrl_videoPlaybackStarted")
        });
    }

    public String[] l()
    {
        return (new String[] {
            (String)a.get("trackingUrl_videoPlayedTo1stQuartile"), (String)a.get("internalUrl_videoPlayedTo1stQuartile")
        });
    }

    public String[] m()
    {
        return (new String[] {
            (String)a.get("trackingUrl_videoPlayedTo2ndQuartile"), (String)a.get("internalUrl_videoPlayedTo2ndQuartile")
        });
    }

    public String[] n()
    {
        return (new String[] {
            (String)a.get("trackingUrl_videoPlayedTo3rdQuartile"), (String)a.get("internalUrl_videoPlayedTo3rdQuartile")
        });
    }

    public String[] o()
    {
        return (new String[] {
            (String)a.get("trackingUrl_videoPlayedToCompletion"), (String)a.get("internalUrl_videoPlayedToCompletion")
        });
    }

    public String[] p()
    {
        return (new String[] {
            (String)a.get("trackingUrl_pauseClicked"), (String)a.get("internalUrl_pauseClicked")
        });
    }

    public String[] q()
    {
        return (new String[] {
            (String)a.get("trackingUrl_unpauseClicked"), (String)a.get("internalUrl_unpauseClicked")
        });
    }

    public String[] r()
    {
        return (new String[] {
            (String)a.get("trackingUrl_muteClicked"), (String)a.get("internalUrl_muteClicked")
        });
    }

    public String[] s()
    {
        return (new String[] {
            (String)a.get("trackingUrl_unmuteClicked"), (String)a.get("internalUrl_unmuteClicked")
        });
    }

    public String[] t()
    {
        return (new String[] {
            (String)a.get("trackingUrl_learnMoreClicked"), (String)a.get("internalUrl_learnMoreClicked")
        });
    }

    public String[] u()
    {
        return (new String[] {
            (String)a.get("trackingUrl_videoLoadError"), (String)a.get("internalUrl_videoLoadError")
        });
    }

    public String v()
    {
        return (String)a.get("yumeAdServer");
    }

    public String w()
    {
        return (String)a.get("yumeDomain");
    }

    public String x()
    {
        return (String)a.get("yumeAdType");
    }

    public String y()
    {
        return (String)a.get("admPartnerId");
    }

    public String z()
    {
        return (String)a.get("admSiteId");
    }
}
