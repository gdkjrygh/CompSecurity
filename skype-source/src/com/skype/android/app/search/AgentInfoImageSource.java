// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.search;

import com.skype.android.util.HttpUtil;
import com.skype.android.util.ImageSource;
import java.net.HttpURLConnection;
import java.util.logging.Logger;

// Referenced classes of package com.skype.android.app.search:
//            AgentInfo

public class AgentInfoImageSource
    implements ImageSource
{

    private static final Logger log = Logger.getLogger("AgentInfoImageSource");
    private final AgentInfo agentInfo;
    private final HttpUtil httpUtil;

    public AgentInfoImageSource(AgentInfo agentinfo, HttpUtil httputil)
    {
        httpUtil = httputil;
        agentInfo = agentinfo;
    }

    public String getIdentity()
    {
        return agentInfo.getIdentity();
    }

    public byte[] getImageData()
    {
        Object obj;
        byte abyte0[];
        Object obj1;
        abyte0 = null;
        obj = null;
        obj1 = null;
        HttpURLConnection httpurlconnection = httpUtil.b(agentInfo.getTileUrl());
        obj = httpurlconnection;
        abyte0 = httpurlconnection;
        byte abyte1[] = httpUtil.b(httpurlconnection);
        obj = abyte1;
        abyte0 = ((byte []) (obj));
        if (httpurlconnection != null)
        {
            httpurlconnection.disconnect();
            abyte0 = ((byte []) (obj));
        }
_L2:
        return abyte0;
        Exception exception1;
        exception1;
        abyte0 = ((byte []) (obj));
        log.severe((new StringBuilder("getImageData Exception: ")).append(exception1.getMessage()).toString());
        abyte0 = obj1;
        if (obj == null) goto _L2; else goto _L1
_L1:
        ((HttpURLConnection) (obj)).disconnect();
        return null;
        Exception exception;
        exception;
        if (abyte0 != null)
        {
            abyte0.disconnect();
        }
        throw exception;
    }

    public long getImageTimestamp()
    {
        return 0L;
    }

}
