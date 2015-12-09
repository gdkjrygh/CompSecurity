// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.comscore.applications.EventType;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.HashMap;

public final class ajs
    implements Thread.UncaughtExceptionHandler
{

    private Thread.UncaughtExceptionHandler a;
    private aif b;

    public ajs(aif aif1)
    {
        a = Thread.getDefaultUncaughtExceptionHandler();
        b = aif1;
    }

    public final void uncaughtException(Thread thread, Throwable throwable)
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
                ajn.b(this, "Error encoding the URL (ns_ap_uxc)");
                ajn.a(unsupportedencodingexception);
            }
        }
        try
        {
            hashmap.put("ns_ap_uxs", URLEncoder.encode(throwable.toString(), "UTF-8"));
        }
        catch (UnsupportedEncodingException unsupportedencodingexception1)
        {
            ajn.b(this, "Error encoding the URL (ns_ap_uxs)");
            ajn.a(unsupportedencodingexception1);
        }
        b.a.a(EventType.e, hashmap);
        a.uncaughtException(thread, throwable);
    }
}
