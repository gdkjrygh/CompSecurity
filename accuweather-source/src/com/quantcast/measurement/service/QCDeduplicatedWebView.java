// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.quantcast.measurement.service;

import android.content.Context;
import android.util.AttributeSet;
import android.webkit.WebSettings;
import android.webkit.WebView;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

// Referenced classes of package com.quantcast.measurement.service:
//            QCNotificationListener, QCNotificationCenter, QCOptOutUtility, QCMeasurement

public class QCDeduplicatedWebView extends WebView
    implements QCNotificationListener
{

    private static final String QCMEASUREMNT_UA_PREFIX = " QuantcastSDK";
    static final Pattern userAgentPattern = Pattern.compile(" QuantcastSDK/(\\d+)_(\\d+)_(\\d+)/[a-zA-Z0-9]{16}-[a-zA-Z0-9]{16}");

    public QCDeduplicatedWebView(Context context)
    {
        super(context);
        QCNotificationCenter.INSTANCE.addListener("QC_OUC", this);
        boolean flag;
        if (!QCOptOutUtility.isOptedOut(context))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        appendUserAgent(flag);
    }

    public QCDeduplicatedWebView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        QCNotificationCenter.INSTANCE.addListener("QC_OUC", this);
        boolean flag;
        if (!QCOptOutUtility.isOptedOut(context))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        appendUserAgent(flag);
    }

    public QCDeduplicatedWebView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        QCNotificationCenter.INSTANCE.addListener("QC_OUC", this);
        boolean flag;
        if (!QCOptOutUtility.isOptedOut(context))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        appendUserAgent(flag);
    }

    void appendUserAgent(boolean flag)
    {
        WebSettings websettings = getSettings();
        String s = websettings.getUserAgentString();
        Matcher matcher = userAgentPattern.matcher(s);
        boolean flag1 = matcher.find();
        if (!flag1 && flag)
        {
            websettings.setUserAgentString((new StringBuilder()).append(s).append(" QuantcastSDK").append("/").append("1_2_1").append("/").append(QCMeasurement.INSTANCE.getApiKey()).toString());
        } else
        if (flag1 && !flag)
        {
            int i = matcher.start();
            int j = matcher.end();
            websettings.setUserAgentString((new StringBuilder()).append(s.substring(0, i)).append(s.substring(j)).toString());
            return;
        }
    }

    public void notificationCallback(String s, Object obj)
    {
        if (s.equals("QC_OUC"))
        {
            boolean flag;
            if (!((Boolean)obj).booleanValue())
            {
                flag = true;
            } else
            {
                flag = false;
            }
            appendUserAgent(flag);
        }
    }

}
