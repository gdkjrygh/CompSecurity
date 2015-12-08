// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.auditude.ads.model.tracking;

import com.auditude.ads.util.PingUtil;
import com.auditude.ads.util.StringUtil;
import com.auditude.ads.util.URLUtil;
import java.util.HashMap;

// Referenced classes of package com.auditude.ads.model.tracking:
//            TrackingUrl

public class Submission extends TrackingUrl
{

    public static final String AD_PROGRESS = "AD_PROGRESS";
    public static final String PLAYER_DEBUG = "playerdebug";
    public static final String PLAYER_ERROR = "playererror";
    public static final String POD_PROGRESS = "podprogress";
    public String externalUrl;

    public Submission(String s, String s1)
    {
        super(s, s1);
    }

    public static Submission newSubmission(String s, String s1)
    {
        return new Submission(s, s1);
    }

    public TrackingUrl duplicate()
    {
        Submission submission = new Submission(getUrl(), getType());
        submission.externalUrl = externalUrl;
        return submission;
    }

    public void log(boolean flag, HashMap hashmap)
    {
        String s;
        if (!isLogged() || flag)
        {
            if (!StringUtil.isNullOrEmpty(s = URLUtil.appendURLParams(getUrl(), hashmap)))
            {
                hashmap = s;
                if (!StringUtil.isNullOrEmpty(externalUrl))
                {
                    hashmap = new HashMap();
                    hashmap.put("v", "0");
                    hashmap = URLUtil.appendURLParams(s, hashmap);
                }
                PingUtil.pingUrl(hashmap);
                setLogged(true);
                return;
            }
        }
    }
}
