// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.auditude.ads.model.tracking;

import com.auditude.ads.core.AuditudeEnv;
import com.auditude.ads.reporting.ReportingHelper;
import com.auditude.ads.util.AuditudeUtil;
import com.auditude.ads.util.PingUtil;
import com.auditude.ads.util.StringUtil;
import com.auditude.ads.util.URLUtil;
import java.util.HashMap;

// Referenced classes of package com.auditude.ads.model.tracking:
//            Submission

public class ParStateSubmission extends Submission
{

    public ParStateSubmission(String s, String s1)
    {
        super(s, s1);
    }

    public String getUrl()
    {
        String s1 = super.getUrl();
        String s = s1;
        if (!StringUtil.isNullOrEmpty(s1))
        {
            s = AuditudeUtil.getUrlWithState(s1, AuditudeEnv.getInstance().getReportingHelper().currentAdState());
        }
        return s;
    }

    public void log(boolean flag, HashMap hashmap)
    {
        String s;
        if (!isLogged() || flag)
        {
            if (!StringUtil.isNullOrEmpty(s = getUrl()))
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
