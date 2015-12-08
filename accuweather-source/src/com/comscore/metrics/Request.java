// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.comscore.metrics;

import com.comscore.analytics.Core;
import com.comscore.applications.KeepAliveAlarmReceiver;
import com.comscore.measurement.Measurement;
import com.comscore.utils.CSLog;
import com.comscore.utils.Connectivity;
import com.comscore.utils.Date;
import com.comscore.utils.OfflineMeasurementsCache;
import com.comscore.utils.Permissions;
import com.comscore.utils.Storage;
import com.comscore.utils.TransmissionMode;
import com.comscore.utils.Utils;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.InetSocketAddress;
import java.net.MalformedURLException;
import java.net.Proxy;
import java.net.URL;
import java.net.URLEncoder;

// Referenced classes of package com.comscore.metrics:
//            a

public class Request
{

    public static final boolean REDIRECTION_SUPPORTED;
    protected URL a;
    protected Proxy b;
    private Measurement c;
    private Core d;
    private Storage e;

    public Request(Core core, Measurement measurement)
    {
        d = core;
        e = core.getStorage();
        c = measurement;
        a = process();
    }

    private static Proxy a(String s)
    {
        int i = s.indexOf(':');
        if (i != -1)
        {
            String s1 = s.substring(0, i);
            i = Integer.parseInt(s.substring(i + 1));
            s = s1;
        } else
        {
            i = 80;
        }
        return new Proxy(java.net.Proxy.Type.HTTP, new InetSocketAddress(s, i));
    }

    private boolean c()
    {
        d();
        boolean flag = a();
        if (!flag)
        {
            e();
        }
        return flag;
    }

    private void d()
    {
        TransmissionMode transmissionmode = d.getOfflineTransmissionMode();
        if (transmissionmode == TransmissionMode.DEFAULT || transmissionmode == TransmissionMode.WIFIONLY && Connectivity.isConnectedWiFi(d.getAppContext()) || transmissionmode == TransmissionMode.PIGGYBACK)
        {
            d.getOfflineCache().flush();
        }
    }

    private void e()
    {
        CSLog.e(this, (new StringBuilder()).append("Measurement was not transmitted: ").append(c.retrieveLabelsAsString(d.getMeasurementLabelOrder())).toString());
        d.getOfflineCache().saveEvent(c);
    }

    protected HttpURLConnection a(URL url)
    {
        if (b != null)
        {
            return (HttpURLConnection)url.openConnection(b);
        } else
        {
            return (HttpURLConnection)url.openConnection();
        }
    }

    protected URL a(URL url, int i, String s)
    {
        switch (i)
        {
        case 304: 
        default:
            return null;

        case 300: 
        case 301: 
        case 302: 
        case 303: 
        case 305: 
            break;
        }
        if (s == null)
        {
            return null;
        }
        if (i == 305)
        {
            i = 0;
            if (s.startsWith((new StringBuilder()).append(url.getProtocol()).append(':').toString()))
            {
                i = url.getProtocol().length() + 1;
            }
            int j = i;
            if (s.startsWith("//", i))
            {
                j = i + 2;
            }
            b = a(s.substring(j));
            return url;
        }
        s = new URL(url, s);
        if (!url.getProtocol().equals(s.getProtocol()))
        {
            return null;
        } else
        {
            return s;
        }
    }

    protected boolean a()
    {
        Object obj;
        Object obj1;
        Object obj2;
        boolean flag2;
        boolean flag3;
        flag3 = false;
        flag2 = false;
        obj2 = null;
        obj1 = null;
        System.setProperty("http.keepAlive", "false");
        obj = obj2;
        Object obj4 = a;
        obj = obj2;
        if (!b()) goto _L2; else goto _L1
_L1:
        obj = obj2;
        obj2 = a(((URL) (obj4)));
        boolean flag;
        obj = obj2;
        obj1 = obj2;
        flag = flag3;
        int k = ((HttpURLConnection) (obj2)).getResponseCode();
_L4:
        obj = obj2;
        obj1 = obj2;
        flag = flag3;
        obj4 = ((HttpURLConnection) (obj2)).getHeaderField("Content-Type");
        obj = obj2;
        obj1 = obj2;
        flag = flag3;
        String s = ((HttpURLConnection) (obj2)).getHeaderField("Content-Length");
        if (k != 200)
        {
            break MISSING_BLOCK_LABEL_164;
        }
        obj = obj2;
        obj1 = obj2;
        flag = flag3;
        if (!Utils.isNotEmpty(((String) (obj4))))
        {
            break MISSING_BLOCK_LABEL_164;
        }
        obj = obj2;
        obj1 = obj2;
        flag = flag3;
        if (((String) (obj4)).indexOf("image/") != 0)
        {
            break MISSING_BLOCK_LABEL_164;
        }
        obj = obj2;
        obj1 = obj2;
        flag = flag3;
        if (!Utils.isNotEmpty(s))
        {
            break MISSING_BLOCK_LABEL_164;
        }
        obj = obj2;
        obj1 = obj2;
        flag = flag3;
        if (Integer.parseInt(s) > 0)
        {
            break MISSING_BLOCK_LABEL_216;
        }
        boolean flag1;
        flag1 = flag2;
        if (k != 204)
        {
            break MISSING_BLOCK_LABEL_236;
        }
        flag1 = flag2;
        obj = obj2;
        obj1 = obj2;
        flag = flag3;
        if (!Utils.isNotEmpty(s))
        {
            break MISSING_BLOCK_LABEL_236;
        }
        flag1 = flag2;
        obj = obj2;
        obj1 = obj2;
        flag = flag3;
        if (Integer.parseInt(s) != 0)
        {
            break MISSING_BLOCK_LABEL_236;
        }
        flag = true;
        flag1 = true;
        obj = obj2;
        obj1 = obj2;
        d.getKeepAliveAlarmReceiver().reset();
        flag = flag1;
        flag1 = flag;
        if (obj2 != null)
        {
            ((HttpURLConnection) (obj2)).disconnect();
            flag1 = flag;
        }
_L8:
        return flag1;
_L2:
        int i;
        int j;
        j = 0;
        i = 0;
_L6:
        k = i;
        obj2 = obj1;
        if (obj4 == null) goto _L4; else goto _L3
_L3:
        k = i;
        obj2 = obj1;
        if (j >= 5) goto _L4; else goto _L5
_L5:
        obj = obj1;
        flag = flag3;
        obj2 = a(((URL) (obj4)));
        obj = obj2;
        obj1 = obj2;
        flag = flag3;
        ((HttpURLConnection) (obj2)).setInstanceFollowRedirects(false);
        obj = obj2;
        obj1 = obj2;
        flag = flag3;
        i = ((HttpURLConnection) (obj2)).getResponseCode();
        obj = obj2;
        obj1 = obj2;
        flag = flag3;
        obj4 = a(((URL) (obj4)), i, ((HttpURLConnection) (obj2)).getHeaderField("Location"));
        j++;
        obj1 = obj2;
          goto _L6
        obj1;
        flag = false;
        obj = null;
_L11:
        CSLog.e(this, (new StringBuilder()).append("Exception sending measurement:").append(((Exception) (obj1)).getLocalizedMessage()).toString());
        CSLog.printStackTrace(((Exception) (obj1)));
        flag1 = flag;
        if (obj == null) goto _L8; else goto _L7
_L7:
        ((HttpURLConnection) (obj)).disconnect();
        return flag;
        Object obj3;
        obj3;
        obj1 = obj;
        obj = obj3;
_L10:
        if (obj1 != null)
        {
            ((HttpURLConnection) (obj1)).disconnect();
        }
        throw obj;
        obj3;
        obj1 = obj;
        obj = obj3;
        if (true) goto _L10; else goto _L9
_L9:
        obj3;
        obj = obj1;
        obj1 = obj3;
          goto _L11
    }

    public Boolean availableConnection()
    {
        Object obj;
        boolean flag;
        try
        {
            obj = d.getAppContext();
        }
        catch (NullPointerException nullpointerexception)
        {
            return Boolean.valueOf(false);
        }
        flag = true;
        if (!Connectivity.isEmulator()) goto _L2; else goto _L1
_L1:
        obj = "emu";
_L4:
        c.setLabel("ns_radio", ((String) (obj)));
        return Boolean.valueOf(flag);
_L2:
        if (Connectivity.isConnectedWiFi(((android.content.Context) (obj))))
        {
            obj = "wifi";
            continue; /* Loop/switch isn't completed */
        }
        if (Connectivity.isConnectedMobile(((android.content.Context) (obj))))
        {
            obj = "wwan";
            continue; /* Loop/switch isn't completed */
        }
        if (Connectivity.isConnectBluetooth(((android.content.Context) (obj))))
        {
            obj = "bth";
            continue; /* Loop/switch isn't completed */
        }
        if (Connectivity.isConnectEthernet(((android.content.Context) (obj))))
        {
            obj = "eth";
        } else
        {
            obj = "unknown";
            flag = false;
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    protected boolean b()
    {
        return REDIRECTION_SUPPORTED;
    }

    public URL process()
    {
        return process(c.getPixelURL());
    }

    public URL process(String s)
    {
        availableConnection();
        String s1 = s.concat(c.retrieveLabelsAsString(d.getMeasurementLabelOrder()));
        if (s1.length() > 4096 && s1.indexOf("&") > 0)
        {
            int i = s1.substring(0, 4088).lastIndexOf("&");
            try
            {
                s = URLEncoder.encode(s1.substring(i + 1), "UTF-8").replace("+", "%20");
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                s = "0";
            }
            s = (new StringBuilder()).append(s1.substring(0, i)).append("&ns_cut=").append(s).toString();
        } else
        {
            s = s1;
        }
        if (s.length() > 4096)
        {
            s = s.substring(0, 4096);
        }
        try
        {
            s = new URL(s);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            return null;
        }
        return s;
    }

    public boolean send()
    {
        android.content.Context context = d.getAppContext();
        boolean flag = Permissions.check(context, "android.permission.ACCESS_NETWORK_STATE").booleanValue();
        TransmissionMode transmissionmode = d.getLiveTransmissionMode();
        e.set("lastTransmission", String.valueOf(Date.unixTime()));
        switch (a.a[transmissionmode.ordinal()])
        {
        default:
            return false;

        case 1: // '\001'
            e();
            return false;

        case 2: // '\002'
            e();
            return false;

        case 3: // '\003'
            if (!flag || availableConnection().booleanValue())
            {
                return c();
            } else
            {
                e();
                return false;
            }

        case 4: // '\004'
            if (!flag || Connectivity.isEmulator() || Connectivity.isConnectedWiFi(context) || Connectivity.isConnectEthernet(context))
            {
                return c();
            } else
            {
                e();
                return false;
            }

        case 5: // '\005'
            break;
        }
        if (!flag || Connectivity.isEmulator() || Connectivity.isConnectedWiFi(context) || Connectivity.isDataConnected(context))
        {
            return c();
        } else
        {
            e();
            return false;
        }
    }

    static 
    {
        int i = android.os.Build.VERSION.SDK_INT;
        boolean flag;
        if (i < 11 || i > 13)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        REDIRECTION_SUPPORTED = flag;
    }
}
