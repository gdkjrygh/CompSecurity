// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.acra.sender;

import android.net.Uri;
import android.util.Log;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import org.acra.ACRA;
import org.acra.CrashReportData;
import org.acra.ReportField;
import org.acra.reporter.ReportsCrashes;
import org.acra.util.HttpUtils;

// Referenced classes of package org.acra.sender:
//            ReportSender, ReportSenderException

public class HttpPostSender
    implements ReportSender
{

    private Uri mFormUri;

    public HttpPostSender(String s)
    {
        mFormUri = null;
        mFormUri = Uri.parse(s);
    }

    private Map remap(Map map)
    {
        HashMap hashmap = new HashMap(map.size());
        ReportField areportfield[] = ACRA.DEFAULT_REPORT_FIELDS;
        int j = areportfield.length;
        for (int i = 0; i < j; i++)
        {
            ReportField reportfield = areportfield[i];
            hashmap.put(reportfield.toString(), map.get(reportfield));
        }

        return hashmap;
    }

    public void send(CrashReportData crashreportdata)
    {
        try
        {
            crashreportdata = remap(crashreportdata);
            URL url = new URL(mFormUri.toString());
            Log.d(ACRA.LOG_TAG, (new StringBuilder()).append("Connect to ").append(url.toString()).toString());
            HttpUtils.doPost(crashreportdata, url, ACRA.getConfig().formPostFormat());
            return;
        }
        // Misplaced declaration of an exception variable
        catch (CrashReportData crashreportdata)
        {
            throw new ReportSenderException("Error while sending report to Http Post Form.", crashreportdata);
        }
    }
}
