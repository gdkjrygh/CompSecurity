// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.comscore.utils;

import com.comscore.analytics.Core;
import com.comscore.applications.EventType;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.HashMap;

// Referenced classes of package com.comscore.utils:
//            OfflineMeasurementsCache, CSLog

public class CustomExceptionHandler
    implements Thread.UncaughtExceptionHandler
{

    private Thread.UncaughtExceptionHandler a;
    private Core b;

    public CustomExceptionHandler(Core core)
    {
        a = Thread.getDefaultUncaughtExceptionHandler();
        b = core;
    }

    private void a(Throwable throwable)
    {
        StackTraceElement astacktraceelement[] = throwable.getStackTrace();
        String s = "";
        int i = 0;
        while (i < astacktraceelement.length && i < 5) 
        {
            Object obj = astacktraceelement[i];
            obj = (new StringBuilder()).append(((StackTraceElement) (obj)).getFileName()).append("@").append(((StackTraceElement) (obj)).getLineNumber()).append("|").append(((StackTraceElement) (obj)).getClassName()).append(".").append(((StackTraceElement) (obj)).getMethodName()).toString();
            if (s.equals(""))
            {
                s = ((String) (obj));
            } else
            {
                s = (new StringBuilder()).append(s).append(";").append(((String) (obj))).toString();
            }
            i++;
        }
        HashMap hashmap = new HashMap();
        if (!s.equals(""))
        {
            try
            {
                hashmap.put("ns_ap_uxc", URLEncoder.encode(s, "UTF-8"));
            }
            catch (UnsupportedEncodingException unsupportedencodingexception)
            {
                CSLog.e(this, "Error encoding the URL (ns_ap_uxc)");
                CSLog.printStackTrace(unsupportedencodingexception);
            }
        }
        try
        {
            hashmap.put("ns_ap_uxs", URLEncoder.encode(throwable.toString(), "UTF-8"));
        }
        // Misplaced declaration of an exception variable
        catch (Throwable throwable)
        {
            CSLog.e(this, "Error encoding the URL (ns_ap_uxs)");
            CSLog.printStackTrace(throwable);
        }
        b.getOfflineCache().saveApplicationMeasurement(EventType.HIDDEN, hashmap, true);
    }

    public void uncaughtException(Thread thread, Throwable throwable)
    {
        a(throwable);
        a.uncaughtException(thread, throwable);
    }
}
