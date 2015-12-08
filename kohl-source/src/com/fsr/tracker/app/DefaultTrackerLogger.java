// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fsr.tracker.app;

import android.util.Log;
import com.fsr.tracker.ITrackerLogger;
import com.fsr.tracker.LogEvent;
import com.fsr.tracker.domain.MeasureConfiguration;
import com.fsr.tracker.tasks.BatchHttpGetAsyncTask;
import fs.org.slf4j.Logger;
import fs.org.slf4j.LoggerFactory;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

public class DefaultTrackerLogger
    implements ITrackerLogger
{

    private String cid;
    private Logger logger;
    private String loggingUrl;

    public DefaultTrackerLogger(String s, String s1)
    {
        logger = LoggerFactory.getLogger("ForeSee Trigger Code");
        cid = s;
        loggingUrl = s1;
    }

    private void transmit(LogEvent logevent)
    {
        try
        {
            String s = logevent.getMeasureConfiguration().getSurveyId();
            logger.debug("Logging event: {} for measure:'{}'", logevent.getName(), s);
            String s1 = (new StringBuilder()).append(loggingUrl).append("&cid=%s&rid=%s&msg=%s&cat=%s&lang=%s&tms=%d&tmz=%d&site=android").toString();
            String s2 = URLEncoder.encode(cid, "UTF-8");
            Date date = new Date();
            logevent = String.format(s1, new Object[] {
                s2, logevent.getRespondentId(), logevent.getName(), s, Locale.getDefault().getLanguage(), Long.valueOf(date.getTime()), Integer.valueOf(-TimeZone.getDefault().getOffset(date.getTime()))
            });
            logger.debug("Logging event: {}", logevent);
            (new BatchHttpGetAsyncTask()).execute(new String[] {
                logevent
            });
            return;
        }
        // Misplaced declaration of an exception variable
        catch (LogEvent logevent)
        {
            Log.e("ForeSee Trigger Code", logevent.getMessage(), logevent);
        }
    }

    public void transmitLogEvent(LogEvent logevent)
    {
        transmit(logevent);
    }
}
