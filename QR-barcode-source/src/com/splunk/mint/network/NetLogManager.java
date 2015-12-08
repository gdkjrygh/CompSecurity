// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.splunk.mint.network;

import com.splunk.mint.ActionNetwork;
import com.splunk.mint.ExcludedUrls;
import com.splunk.mint.Logger;
import com.splunk.mint.Properties;
import java.lang.reflect.Constructor;
import java.net.HttpURLConnection;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import javax.net.ssl.HttpsURLConnection;

// Referenced classes of package com.splunk.mint.network:
//            MonitorRegistry, Metric, Counter

public class NetLogManager
{
    class StartConnectionInfo
    {

        public String protocol;
        public Long startTime;
        public int statusCode;
        final NetLogManager this$0;
        public String url;

        StartConnectionInfo()
        {
            this$0 = NetLogManager.this;
            super();
        }
    }


    private static final long CONNECTION_TIMEOUT = 60000L;
    private static volatile HashMap connectionsMap = new HashMap();
    private static NetLogManager mNetLogManager = null;

    public NetLogManager()
    {
    }

    private boolean checkIfURLisExcluded(String s)
    {
label0:
        {
            if (Properties.excludedUrls == null)
            {
                break label0;
            }
            s = cleanUrl(s);
            Iterator iterator = Properties.excludedUrls.iterator();
            do
            {
                if (!iterator.hasNext())
                {
                    break label0;
                }
            } while (!s.contains((String)iterator.next()));
            return true;
        }
        return false;
    }

    private String cleanUrl(String s)
    {
        return s.toLowerCase().replaceAll("https://", "").replaceAll("http://", "").replaceAll("www.", "");
    }

    public static boolean deviceSupporsNetworkMonitoring()
    {
        Object obj = Class.forName("java.net.PlainSocketImpl");
        if (obj == null)
        {
            return false;
        }
        obj = ((Class) (obj)).getDeclaredConstructor(new Class[0]);
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_95;
        }
        ((Constructor) (obj)).newInstance(new Object[0]);
        Logger.logInfo("Device supports Network Monitoring");
        return true;
        Object obj1;
        obj1;
        Logger.logInfo((new StringBuilder()).append("deviceSupporsNetworkMonitoring: ").append(((RuntimeException) (obj1)).getMessage()).toString());
        return false;
        obj1;
        Logger.logInfo((new StringBuilder()).append("deviceSupporsNetworkMonitoring: ").append(((Exception) (obj1)).getMessage()).toString());
        return false;
    }

    public static NetLogManager getInstance()
    {
        if (mNetLogManager == null)
        {
            mNetLogManager = new NetLogManager();
        }
        return mNetLogManager;
    }

    public static final int getStatusCodeFromURLConnection(URLConnection urlconnection)
    {
        boolean flag = false;
        int i = ((flag) ? 1 : 0);
        if (urlconnection != null)
        {
            if (urlconnection instanceof HttpURLConnection)
            {
                try
                {
                    i = ((HttpURLConnection)urlconnection).getResponseCode();
                }
                // Misplaced declaration of an exception variable
                catch (URLConnection urlconnection)
                {
                    return 0;
                }
            } else
            {
                i = ((flag) ? 1 : 0);
                if (urlconnection instanceof HttpsURLConnection)
                {
                    int j;
                    try
                    {
                        j = ((HttpsURLConnection)urlconnection).getResponseCode();
                    }
                    // Misplaced declaration of an exception variable
                    catch (URLConnection urlconnection)
                    {
                        return 0;
                    }
                    return j;
                }
            }
        }
        return i;
    }

    private void removeOldEntries()
    {
        this;
        JVM INSTR monitorenter ;
        Iterator iterator = connectionsMap.entrySet().iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            long l = ((StartConnectionInfo)((java.util.Map.Entry)iterator.next()).getValue()).startTime.longValue();
            if (System.currentTimeMillis() - l > 60000L)
            {
                iterator.remove();
            }
        } while (true);
        break MISSING_BLOCK_LABEL_73;
        Exception exception;
        exception;
        throw exception;
        this;
        JVM INSTR monitorexit ;
    }

    public void cancelNetworkCall(MonitorRegistry monitorregistry, String s, long l, String s1, String s2)
    {
        this;
        JVM INSTR monitorenter ;
        monitorregistry = cleanUrl(s);
        if (connectionsMap == null || !connectionsMap.containsKey(monitorregistry))
        {
            break MISSING_BLOCK_LABEL_71;
        }
        s = (StartConnectionInfo)connectionsMap.get(monitorregistry);
        if (s == null)
        {
            break MISSING_BLOCK_LABEL_71;
        }
        connectionsMap.remove(monitorregistry);
        ActionNetwork.logNetwork(((StartConnectionInfo) (s)).url, ((StartConnectionInfo) (s)).startTime.longValue(), l, s1, null, null, 0, 0L, 0L, s2);
        this;
        JVM INSTR monitorexit ;
        return;
        monitorregistry;
        throw monitorregistry;
    }

    public void endNetworkCall(MonitorRegistry monitorregistry, String s, long l, Map map, int i)
    {
        this;
        JVM INSTR monitorenter ;
        StartConnectionInfo startconnectioninfo;
        Object obj;
        obj = cleanUrl(s);
        if (connectionsMap == null || !connectionsMap.containsKey(obj))
        {
            break MISSING_BLOCK_LABEL_192;
        }
        startconnectioninfo = (StartConnectionInfo)connectionsMap.get(obj);
        if (startconnectioninfo == null)
        {
            break MISSING_BLOCK_LABEL_192;
        }
        connectionsMap.remove(obj);
        s = Long.valueOf(0L);
        long l1 = 0L;
        obj = monitorregistry.getMetricsForName(((String) (obj))).iterator();
        monitorregistry = s;
_L3:
        do
        {
            if (!((Iterator) (obj)).hasNext())
            {
                break MISSING_BLOCK_LABEL_158;
            }
            s = (Metric)((Iterator) (obj)).next();
        } while (!(s instanceof Counter));
        if (!((Counter)s).getName().endsWith("-bytes-out")) goto _L2; else goto _L1
_L1:
        monitorregistry = (Long)s.getValue();
          goto _L3
_L2:
        if (!((Counter)s).getName().endsWith("-bytes-in")) goto _L3; else goto _L4
_L4:
        l1 = ((Long)s.getValue()).longValue();
          goto _L3
        ActionNetwork.logNetwork(startconnectioninfo.url, startconnectioninfo.startTime.longValue(), l, startconnectioninfo.protocol, null, map, i, monitorregistry.longValue(), l1, null);
        this;
        JVM INSTR monitorexit ;
        return;
        monitorregistry;
        throw monitorregistry;
    }

    public void logNetworkRequest(String s, String s1, long l, long l1, Map map, 
            Map map1, int i, long l2, long l3, String s2)
    {
        this;
        JVM INSTR monitorenter ;
        if (!checkIfURLisExcluded(s))
        {
            ActionNetwork.logNetwork(s, l, l1, s1, map, map1, i, l2, l3, s2);
        }
        this;
        JVM INSTR monitorexit ;
        return;
        s;
        throw s;
    }

    public void startNetworkCall(String s, String s1, long l, String s2)
    {
        this;
        JVM INSTR monitorenter ;
        s = cleanUrl(s);
        if (!checkIfURLisExcluded(s1))
        {
            StartConnectionInfo startconnectioninfo = new StartConnectionInfo();
            startconnectioninfo.startTime = Long.valueOf(l);
            startconnectioninfo.url = s1;
            startconnectioninfo.protocol = s2;
            connectionsMap.put(s, startconnectioninfo);
            removeOldEntries();
        }
        this;
        JVM INSTR monitorexit ;
        return;
        s;
        throw s;
    }

}
