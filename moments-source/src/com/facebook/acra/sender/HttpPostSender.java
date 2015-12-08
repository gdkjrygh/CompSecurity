// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.acra.sender;

import android.net.Uri;
import com.facebook.acra.ACRA;
import com.facebook.acra.CrashReportData;
import com.facebook.acra.ReportField;
import com.facebook.acra.reporter.ReportsCrashes;
import com.facebook.acra.util.HttpUtils;
import java.net.Proxy;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

// Referenced classes of package com.facebook.acra.sender:
//            FlexibleReportSender, ReportSenderException

public class HttpPostSender
    implements FlexibleReportSender
{

    private Uri mFormUri;
    private Proxy mProxy;

    public HttpPostSender(String s)
    {
        mFormUri = Uri.parse(s);
    }

    private Map remap(Map map)
    {
        HashMap hashmap = new HashMap(map.size());
        ReportField areportfield[] = ACRA.ALL_CRASH_REPORT_FIELDS;
        int j = areportfield.length;
        for (int i = 0; i < j; i++)
        {
            ReportField reportfield = areportfield[i];
            String s = (String)map.get(reportfield);
            if (s != null && !s.isEmpty())
            {
                hashmap.put(reportfield.toString(), s);
            }
        }

        return hashmap;
    }

    public void send(CrashReportData crashreportdata)
    {
        try
        {
            crashreportdata = remap(crashreportdata);
            URL url = new URL(mFormUri.toString());
            String s = ACRA.LOG_TAG;
            (new StringBuilder("Connect to ")).append(url.toString());
            HttpUtils.doPost(crashreportdata, url, ACRA.getConfig().formPostFormat(), mProxy);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (CrashReportData crashreportdata)
        {
            throw new ReportSenderException("Error while sending report to Http Post Form.", crashreportdata);
        }
    }

    public boolean setHost(String s)
    {
        boolean flag = true;
        if (s == null || s.isEmpty())
        {
            flag = false;
        } else
        if (!s.equals(mFormUri.getHost()))
        {
            mFormUri = mFormUri.buildUpon().authority(s).build();
            return true;
        }
        return flag;
    }

    public void setProxy(Proxy proxy)
    {
        mProxy = proxy;
    }
}
