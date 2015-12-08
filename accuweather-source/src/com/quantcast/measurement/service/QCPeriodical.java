// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.quantcast.measurement.service;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

// Referenced classes of package com.quantcast.measurement.service:
//            QCLog, QCMeasurement, QCUtility

public class QCPeriodical
{

    static final String QC_ARTICLE_NAME_KEY = "article";
    static final String QC_AUTHOR_NAME_KEY = "authors";
    static final String QC_EVENT_ARTICLE = "periodical-article-view";
    static final String QC_EVENT_CLOSE = "periodical-issue-close";
    static final String QC_EVENT_DOWNLOAD = "periodical-download";
    static final String QC_EVENT_OPEN = "periodical-issue-open";
    static final String QC_EVENT_VIEW = "periodical-page-view";
    static final String QC_ISSUE_DATE_KEY = "issue-date";
    static final String QC_ISSUE_NAME_KEY = "issue-name";
    static final String QC_PAGE_NUM_KEY = "pagenum";
    static final String QC_PERIODICAL_NAME_KEY = "periodical-name";
    private static final QCLog.Tag TAG = new QCLog.Tag(com/quantcast/measurement/service/QCPeriodical);

    public QCPeriodical()
    {
    }

    static void logAssetDownloadComplete(String s, String s1, Date date, String as[])
    {
        logAssetDownloadComplete(s, s1, date, as, null);
    }

    static void logAssetDownloadComplete(String s, String s1, Date date, String as[], String as1[])
    {
        if (s == null)
        {
            QCLog.e(TAG, "issueName cannot be null.");
            return;
        }
        if (s1 == null)
        {
            QCLog.e(TAG, "issueName cannot be null.");
            return;
        }
        if (date == null)
        {
            QCLog.e(TAG, "issueDate cannot be null.");
            return;
        } else
        {
            HashMap hashmap = new HashMap();
            hashmap.put("event", "periodical-download");
            hashmap.put("periodical-name", s);
            hashmap.put("issue-name", s1);
            hashmap.put("issue-date", Long.toString(date.getTime() / 1000L));
            QCMeasurement.INSTANCE.logOptionalEvent(hashmap, as, as1);
            return;
        }
    }

    static void logCloseIssue(String s, String s1, Date date, String as[])
    {
        logCloseIssue(s, s1, date, as, null);
    }

    static void logCloseIssue(String s, String s1, Date date, String as[], String as1[])
    {
        if (s == null)
        {
            QCLog.e(TAG, "issueName cannot be null.");
            return;
        }
        if (s1 == null)
        {
            QCLog.e(TAG, "issueName cannot be null.");
            return;
        }
        if (date == null)
        {
            QCLog.e(TAG, "issueDate cannot be null.");
            return;
        } else
        {
            HashMap hashmap = new HashMap();
            hashmap.put("event", "periodical-issue-close");
            hashmap.put("periodical-name", s);
            hashmap.put("issue-name", s1);
            hashmap.put("issue-date", Long.toString(date.getTime() / 1000L));
            QCMeasurement.INSTANCE.logOptionalEvent(hashmap, as, as1);
            return;
        }
    }

    static void logOpenIssue(String s, String s1, Date date, String as[])
    {
        logOpenIssue(s, s1, date, as, null);
    }

    static void logOpenIssue(String s, String s1, Date date, String as[], String as1[])
    {
        if (s == null)
        {
            QCLog.e(TAG, "issueName cannot be null.");
            return;
        }
        if (s1 == null)
        {
            QCLog.e(TAG, "issueName cannot be null.");
            return;
        }
        if (date == null)
        {
            QCLog.e(TAG, "issueDate cannot be null.");
            return;
        } else
        {
            HashMap hashmap = new HashMap();
            hashmap.put("event", "periodical-issue-open");
            hashmap.put("periodical-name", s);
            hashmap.put("issue-name", s1);
            hashmap.put("issue-date", Long.toString(date.getTime() / 1000L));
            QCMeasurement.INSTANCE.logOptionalEvent(hashmap, as, as1);
            return;
        }
    }

    static void logPeriodicalArticleView(String s, String s1, Date date, String s2, String as[], String as1[])
    {
        logPeriodicalArticleView(s, s1, date, s2, as, as1, null);
    }

    static void logPeriodicalArticleView(String s, String s1, Date date, String s2, String as[], String as1[], String as2[])
    {
        if (s == null)
        {
            QCLog.e(TAG, "issueName cannot be null.");
            return;
        }
        if (s1 == null)
        {
            QCLog.e(TAG, "issueName cannot be null.");
            return;
        }
        if (date == null)
        {
            QCLog.e(TAG, "issueDate cannot be null.");
            return;
        }
        if (s2 == null)
        {
            QCLog.e(TAG, "articleName cannot be null.");
            return;
        }
        HashMap hashmap = new HashMap();
        hashmap.put("event", "periodical-article-view");
        hashmap.put("periodical-name", s);
        hashmap.put("issue-name", s1);
        hashmap.put("issue-date", Long.toString(date.getTime() / 1000L));
        hashmap.put("article", s2);
        s = QCUtility.encodeStringArray(as);
        if (s != null)
        {
            hashmap.put("authors", s);
        }
        QCMeasurement.INSTANCE.logOptionalEvent(hashmap, as1, as2);
    }

    static void logPeriodicalPageView(String s, String s1, Date date, int i, String as[])
    {
        logPeriodicalPageView(s, s1, date, i, as, null);
    }

    static void logPeriodicalPageView(String s, String s1, Date date, int i, String as[], String as1[])
    {
        if (s == null)
        {
            QCLog.e(TAG, "issueName cannot be null.");
            return;
        }
        if (s1 == null)
        {
            QCLog.e(TAG, "issueName cannot be null.");
            return;
        }
        if (date == null)
        {
            QCLog.e(TAG, "issueDate cannot be null.");
            return;
        } else
        {
            HashMap hashmap = new HashMap();
            hashmap.put("event", "periodical-page-view");
            hashmap.put("periodical-name", s);
            hashmap.put("issue-name", s1);
            hashmap.put("issue-date", Long.toString(date.getTime() / 1000L));
            hashmap.put("pagenum", Integer.toString(i));
            QCMeasurement.INSTANCE.logOptionalEvent(hashmap, as, as1);
            return;
        }
    }

}
