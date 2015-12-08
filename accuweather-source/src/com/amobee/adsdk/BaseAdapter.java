// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.amobee.adsdk;

import android.content.Context;
import java.net.URLEncoder;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

// Referenced classes of package com.amobee.adsdk:
//            IAmobee, AdManager, Log, NetworkHelper, 
//            IAmobeeListener, AmobeeAdPlaceholder, Parameters

abstract class BaseAdapter
    implements IAmobee
{

    protected static final int AD_CLICK_EXPAND = 29;
    protected static final int AD_CLIENT_ADN_REQUEST = 11;
    protected static final int AD_FAILED = 0;
    protected static final int AD_IMPRESSION = 2;
    protected static final int AD_REQUEST = 1;
    protected String adspace;
    protected AdManager am;
    private String correlator;
    Context m_context;
    Parameters m_parameters;
    protected String networkName;

    BaseAdapter(Context context, Parameters parameters)
    {
        correlator = "";
        am = AdManager.getInstance();
        networkName = "";
        adspace = "";
        m_parameters = parameters;
        m_context = context;
    }

    protected static String createNotificationURL(int i, String s)
    {
        String s1;
        Object obj;
        Date date;
        s1 = s;
        if (s == null)
        {
            s1 = "";
        }
        obj = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss.SSS");
        date = new Date();
        s = "";
        obj = URLEncoder.encode(((SimpleDateFormat) (obj)).format(date));
        s = ((String) (obj));
_L2:
        AdManager admanager = AdManager.getInstance();
        if (admanager.getNotificationServerURL() != null && !admanager.getNotificationServerURL().equals(""))
        {
            Log.d("[a\u2022mo\u2022bee]", (new StringBuilder("notification url is :")).append(i).toString());
            return (new StringBuilder(String.valueOf(admanager.getNotificationServerURL()))).append("/upsteed/notification?event=").append(i).append("&correlator=").append(s1).append("&time=").append(s).toString();
        } else
        {
            return "";
        }
        Exception exception;
        exception;
        if (true) goto _L2; else goto _L1
_L1:
    }

    protected void fireAdFailed(String s, boolean flag)
    {
        if (flag && !s.equals("amobee") && !s.equals("Pulse3D"))
        {
            NetworkHelper.sendNotification(createNotificationURL(11, correlator));
        }
        s = AdManager.getInstance();
        AmobeeAdPlaceholder amobeeadplaceholder = getPlaceHolder();
        if (amobeeadplaceholder != null)
        {
            s.getAd(amobeeadplaceholder);
        }
    }

    protected void fireAdRecieved(String s)
    {
        am.setImpression(adspace);
        if (!s.equals("amobee") && !s.equals("Pulse3D"))
        {
            NetworkHelper.sendNotification(createNotificationURL(2, correlator));
        }
        s = AdManager.getInstance();
        AmobeeAdPlaceholder amobeeadplaceholder = getPlaceHolder();
        if (amobeeadplaceholder != null)
        {
            s.getAmobeeListener().amobeeOnAdRecieved(amobeeadplaceholder);
        }
    }

    protected void fireOnOverlay(boolean flag)
    {
        AmobeeAdPlaceholder amobeeadplaceholder = getPlaceHolder();
        if (amobeeadplaceholder != null)
        {
            am.fireOnOverlay(flag, amobeeadplaceholder);
        }
        if (flag)
        {
            NetworkHelper.sendNotification(createNotificationURL(29, correlator));
            return;
        } else
        {
            am.getAd(true, am.getPlaceholders());
            return;
        }
    }

    String getAdspace()
    {
        return adspace;
    }

    protected String getCorrelator()
    {
        return correlator;
    }

    protected Parameters getParameters()
    {
        return m_parameters;
    }

    AmobeeAdPlaceholder getPlaceHolder()
    {
        int i = 0;
        do
        {
            if (i >= am.getPlaceholders().size())
            {
                return null;
            }
            AmobeeAdPlaceholder amobeeadplaceholder = (AmobeeAdPlaceholder)am.getPlaceholders().get(i);
            if (amobeeadplaceholder != null && amobeeadplaceholder.getCurrentAdapter() != null && this == amobeeadplaceholder.getCurrentAdapter())
            {
                return amobeeadplaceholder;
            }
            i++;
        } while (true);
    }

    void setAdspace(String s)
    {
        adspace = s;
    }

    protected void setCorrelator(String s)
    {
        correlator = s;
    }

    protected void setParameters(Parameters parameters)
    {
        m_parameters = parameters;
    }

    protected abstract void updateParameters(Parameters parameters);
}
