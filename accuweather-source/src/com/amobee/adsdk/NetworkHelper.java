// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.amobee.adsdk;

import android.graphics.Point;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.apache.http.Header;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;

// Referenced classes of package com.amobee.adsdk:
//            AdManager, Parameters, Log, AmobeeAdPlaceholder, 
//            IAmobeeListener, Parser

class NetworkHelper
{

    static String ADSPACE = "adspace";
    static String AMOBEE_ID = "AmobeeID";
    static String CORRELATOR = "Correlator";
    static String FRAGMENT = "Fragment";
    static String FREQUENCY = "frequency";
    static String FREQUENCY_SESSION = "frequencySession";
    static String MEDIATION = "Mediation";
    static String NOTIFICATION = "NotificationURL";
    static String NW = "Network";
    static String NWID = "NetworkID";
    static String NW_MAP_PARAMS = "NetworkMapParams";
    static String PASSBACK = "PassbackURL";
    static String STATUS = "Status";
    static String STATUS_DESCRIPTION = "StatusDescription";

    public NetworkHelper()
    {
    }

    private static String createRequestInter(String s, int i)
    {
        StringBuffer stringbuffer = new StringBuffer();
        AdManager admanager = AdManager.getInstance();
        if (admanager.getServerURL() == null || admanager.getServerURL().equals("") || s == null || s.equals(""))
        {
            return null;
        }
        stringbuffer.append(admanager.getServerURL());
        stringbuffer.append("?time=");
        stringbuffer.append(System.currentTimeMillis());
        if (s != null)
        {
            try
            {
                stringbuffer.append((new StringBuilder("&as=")).append(URLEncoder.encode(s)).toString());
            }
            // Misplaced declaration of an exception variable
            catch (String s) { }
        }
        stringbuffer.append("&orientation=");
        stringbuffer.append((new StringBuilder()).append(admanager.getOrientation()).toString());
        stringbuffer.append("&tp=3");
        stringbuffer.append((new StringBuilder("&n=")).append(i).toString());
        admanager.parameters().setAdvertisingdId();
        s = admanager.parameters().getParameters().entrySet().iterator();
        do
        {
            java.util.Map.Entry entry;
            do
            {
                if (!s.hasNext())
                {
                    return stringbuffer.toString();
                }
                entry = (java.util.Map.Entry)s.next();
            } while (((String)entry.getKey()).equals("as"));
            try
            {
                stringbuffer.append((new StringBuilder("&")).append((String)entry.getKey()).append("=").append(URLEncoder.encode((String)entry.getValue())).toString());
            }
            catch (Exception exception) { }
        } while (true);
    }

    private static String createRequestString(String s, int i, Point point, Point point1, String s1)
    {
        StringBuffer stringbuffer;
        AdManager admanager;
        stringbuffer = new StringBuffer();
        admanager = AdManager.getInstance();
        if (admanager.getServerURL() != null && !admanager.getServerURL().equals("")) goto _L2; else goto _L1
_L1:
        s = null;
_L4:
        return s;
_L2:
        stringbuffer.append(admanager.getServerURL());
        stringbuffer.append("?time=");
        stringbuffer.append(System.currentTimeMillis());
        stringbuffer.append("&orientation=");
        stringbuffer.append((new StringBuilder()).append(i).toString());
        if (point != null)
        {
            stringbuffer.append("&devw=");
            stringbuffer.append((new StringBuilder()).append(point.x).toString());
            stringbuffer.append("&devh=");
            stringbuffer.append((new StringBuilder()).append(point.y).toString());
        }
        if (point1 != null)
        {
            stringbuffer.append("&adw=");
            stringbuffer.append((new StringBuilder()).append(point1.x).toString());
            stringbuffer.append("&adh=");
            stringbuffer.append((new StringBuilder()).append(point1.y).toString());
        }
        stringbuffer.append((new StringBuilder("&AmobeeIncNw=")).append(s1).toString());
        point = admanager.parameters().getParameters().entrySet().iterator();
_L6:
label0:
        {
            if (point.hasNext())
            {
                break label0;
            }
            if (s != null && !s.equals(""))
            {
                stringbuffer.append((new StringBuilder("&as=")).append(URLEncoder.encode(s)).toString());
            }
            point = stringbuffer.toString();
            s = point;
            if (!point.contains("&as="))
            {
                return null;
            }
        }
        if (true) goto _L4; else goto _L3
_L3:
        point1 = (java.util.Map.Entry)point.next();
        if (((String)point1.getKey()).equals("as")) goto _L6; else goto _L5
_L5:
        stringbuffer.append((new StringBuilder("&")).append((String)point1.getKey()).append("=").append(URLEncoder.encode((String)point1.getValue())).toString());
          goto _L6
        point1;
          goto _L6
    }

    private static transient HashMap doInBackground(String as[])
    {
        Header aheader[];
        int i;
        AdManager admanager = AdManager.getInstance();
        HashMap hashmap = new HashMap();
        Object obj = as[0];
        String s11 = as[1];
        if (obj == null)
        {
            return null;
        }
        String s;
        String s1;
        String s2;
        String s3;
        String s4;
        String s5;
        String s6;
        String s7;
        String s8;
        String s9;
        String s10;
        HttpResponse httpresponse;
        try
        {
            as = new DefaultHttpClient();
            obj = new HttpGet(((String) (obj)));
            Parameters parameters = admanager.parameters();
            if (parameters.getParameters().get("ua") != null && !((String)parameters.getParameters().get("ua")).equals(""))
            {
                ((HttpGet) (obj)).setHeader("User-Agent", (String)parameters.getParameters().get("ua"));
            }
            httpresponse = as.execute(((org.apache.http.client.methods.HttpUriRequest) (obj)));
        }
        // Misplaced declaration of an exception variable
        catch (String as[])
        {
            as.printStackTrace(new PrintWriter(new StringWriter()));
            Log.d("[a\u2022mo\u2022bee]", "doInBackground error");
            return null;
        }
        obj = "";
        s = "";
        s2 = "";
        s3 = "";
        s5 = "";
        s6 = "";
        s1 = "";
        s4 = "";
        s7 = "";
        s8 = "";
        s9 = "";
        s10 = "";
        as = ((String []) (obj));
        if (httpresponse.getHeaders("AMOBEE-CLIENT-NW") == null)
        {
            break MISSING_BLOCK_LABEL_211;
        }
        as = ((String []) (obj));
        if (httpresponse.getHeaders("AMOBEE-CLIENT-NW").length > 0)
        {
            as = httpresponse.getHeaders("AMOBEE-CLIENT-NW")[0].getValue();
        }
        obj = s;
        if (httpresponse.getHeaders("AMOBEE-NW-ID") == null)
        {
            break MISSING_BLOCK_LABEL_260;
        }
        obj = s;
        if (httpresponse.getHeaders("AMOBEE-NW-ID").length > 0)
        {
            obj = httpresponse.getHeaders("AMOBEE-NW-ID")[0].getValue();
        }
        s = s1;
        if (httpresponse.getHeaders("AMOBEE-NW-MAP_PARAMS") == null)
        {
            break MISSING_BLOCK_LABEL_309;
        }
        s = s1;
        if (httpresponse.getHeaders("AMOBEE-NW-MAP_PARAMS").length > 0)
        {
            s = httpresponse.getHeaders("AMOBEE-NW-MAP_PARAMS")[0].getValue();
        }
        s1 = s2;
        if (httpresponse.getHeaders("AMOBEE-CORRELATOR") == null)
        {
            break MISSING_BLOCK_LABEL_360;
        }
        s1 = s2;
        if (httpresponse.getHeaders("AMOBEE-CORRELATOR").length > 0)
        {
            s1 = httpresponse.getHeaders("AMOBEE-CORRELATOR")[0].getValue();
        }
        s2 = s3;
        if (httpresponse.getHeaders("AMOBEE-MEDIATION") == null)
        {
            break MISSING_BLOCK_LABEL_414;
        }
        s2 = s3;
        if (httpresponse.getHeaders("AMOBEE-MEDIATION").length > 0)
        {
            s2 = httpresponse.getHeaders("AMOBEE-MEDIATION")[0].getValue();
        }
        s3 = s4;
        if (httpresponse.getHeaders("X-AMOBEE-AID") == null)
        {
            break MISSING_BLOCK_LABEL_505;
        }
        s3 = s4;
        if (httpresponse.getHeaders("X-AMOBEE-AID").length <= 0)
        {
            break MISSING_BLOCK_LABEL_505;
        }
        s4 = httpresponse.getHeaders("X-AMOBEE-AID")[0].getValue();
        s3 = s4;
        if (s4 == null)
        {
            break MISSING_BLOCK_LABEL_505;
        }
        s3 = s4;
        if (s4.equals(""))
        {
            break MISSING_BLOCK_LABEL_505;
        }
        admanager.parameters().setAmobeeId(s4);
        s3 = s4;
        s4 = s5;
        if (httpresponse.getHeaders("AMOBEE-STATUS") == null)
        {
            break MISSING_BLOCK_LABEL_559;
        }
        s4 = s5;
        if (httpresponse.getHeaders("AMOBEE-STATUS").length > 0)
        {
            s4 = httpresponse.getHeaders("AMOBEE-STATUS")[0].getValue();
        }
        s5 = s6;
        if (httpresponse.getHeaders("Amobee-Status-Description") == null)
        {
            break MISSING_BLOCK_LABEL_613;
        }
        s5 = s6;
        if (httpresponse.getHeaders("Amobee-Status-Description").length > 0)
        {
            s5 = httpresponse.getHeaders("Amobee-Status-Description")[0].getValue();
        }
        if (httpresponse.getHeaders("Content-Type") != null && httpresponse.getHeaders("Content-Type").length > 0)
        {
            httpresponse.getHeaders("Content-Type")[0].getValue();
        }
        s6 = s7;
        if (httpresponse.getHeaders("AMOBEE-NOTIFICATION-SERVER") == null)
        {
            break MISSING_BLOCK_LABEL_712;
        }
        s6 = s7;
        if (httpresponse.getHeaders("AMOBEE-NOTIFICATION-SERVER").length > 0)
        {
            s6 = httpresponse.getHeaders("AMOBEE-NOTIFICATION-SERVER")[0].getValue();
        }
        s7 = s8;
        if (httpresponse.getHeaders("AMOBEE-AS-FREQUENCY") == null)
        {
            break MISSING_BLOCK_LABEL_766;
        }
        s7 = s8;
        if (httpresponse.getHeaders("AMOBEE-AS-FREQUENCY").length > 0)
        {
            s7 = httpresponse.getHeaders("AMOBEE-AS-FREQUENCY")[0].getValue();
        }
        s8 = s9;
        if (httpresponse.getHeaders("AMOBEE-AS-FREQUENCY-SESSION") == null)
        {
            break MISSING_BLOCK_LABEL_820;
        }
        s8 = s9;
        if (httpresponse.getHeaders("AMOBEE-AS-FREQUENCY-SESSION").length > 0)
        {
            s8 = httpresponse.getHeaders("AMOBEE-AS-FREQUENCY-SESSION")[0].getValue();
        }
        if (s11 == null)
        {
            break MISSING_BLOCK_LABEL_846;
        }
        if (!s11.equals(""))
        {
            hashmap.put(ADSPACE, s11);
        }
        s9 = s10;
        if (httpresponse.getHeaders("AMOBEE-PASSBACK-URL") == null)
        {
            break MISSING_BLOCK_LABEL_900;
        }
        s9 = s10;
        if (httpresponse.getHeaders("AMOBEE-PASSBACK-URL").length > 0)
        {
            s9 = httpresponse.getHeaders("AMOBEE-PASSBACK-URL")[0].getValue();
        }
        aheader = httpresponse.getAllHeaders();
        i = 0;
_L2:
        if (i < aheader.length)
        {
            break MISSING_BLOCK_LABEL_1136;
        }
        hashmap.put(NW, as);
        hashmap.put(NW_MAP_PARAMS, s);
        hashmap.put(AMOBEE_ID, s3);
        hashmap.put(NWID, obj);
        hashmap.put(CORRELATOR, s1);
        hashmap.put(MEDIATION, s2);
        hashmap.put(STATUS, s4);
        hashmap.put(STATUS_DESCRIPTION, s5);
        hashmap.put(NOTIFICATION, s6);
        hashmap.put(FREQUENCY, s7);
        hashmap.put(FREQUENCY_SESSION, s8);
        hashmap.put(PASSBACK, s9);
        as = httpresponse.getEntity().getContent();
        obj = readInputStream(as);
        as.close();
        hashmap.put(FRAGMENT, obj);
        Log.d("[a\u2022mo\u2022bee]", (new StringBuilder("fragment is: ")).append(((String) (obj))).toString());
        return hashmap;
        Log.d("[a\u2022mo\u2022bee]", (new StringBuilder(String.valueOf(aheader[i].getName()))).append(": ").append(aheader[i].getValue()).toString());
        i++;
        if (true) goto _L2; else goto _L1
_L1:
    }

    static void doRequest(AmobeeAdPlaceholder amobeeadplaceholder)
    {
        AdManager admanager;
        admanager = AdManager.getInstance();
        admanager.parameters().setAdvertisingdId();
        break MISSING_BLOCK_LABEL_11;
        Object obj;
        Object obj1;
        while (admanager.cappingBlocksRequest(((String) (obj)))) 
        {
            do
            {
                return;
            } while (amobeeadplaceholder == null || amobeeadplaceholder.isResized);
            if (amobeeadplaceholder.getWindowVisibility() == 8 && !amobeeadplaceholder.firstRequest && !amobeeadplaceholder.isShown())
            {
                amobeeadplaceholder.requestAdImmediately = true;
                return;
            }
            if (amobeeadplaceholder.getAdSpace() != null && !amobeeadplaceholder.getAdSpace().equals(""))
            {
                obj = amobeeadplaceholder.getAdSpace();
            } else
            {
                obj = admanager.parameters().getAdSpace();
            }
        }
        amobeeadplaceholder.firstRequest = false;
        new HashMap();
        obj1 = amobeeadplaceholder.getAdSize();
        if (admanager.getPassbackURL() == null || admanager.getPassbackURL().equals(""))
        {
            break MISSING_BLOCK_LABEL_169;
        }
        obj1 = admanager.getPassbackURL();
        admanager.setPassbackURL("");
_L1:
        if (obj1 == null)
        {
            try
            {
                Log.d("[a\u2022mo\u2022bee]", "can't get an ad, mandatory fields are missing.");
                return;
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                admanager.getAmobeeListener().amobeeOnAdFailed(amobeeadplaceholder);
            }
            return;
        }
        break MISSING_BLOCK_LABEL_190;
        obj1 = createRequestString(((String) (obj)), admanager.getOrientation(), admanager.getScreenSize(), ((Point) (obj1)), admanager.amobeeIncNW);
          goto _L1
        Log.d("[a\u2022mo\u2022bee]", (new StringBuilder("request is:")).append(((String) (obj1))).toString());
        obj = doInBackground(new String[] {
            obj1, obj
        });
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_239;
        }
        Parser.parse(((HashMap) (obj)), amobeeadplaceholder);
        return;
        admanager.getAmobeeListener().amobeeOnAdFailed(amobeeadplaceholder);
        return;
    }

    private static String readInputStream(InputStream inputstream)
        throws IOException
    {
        StringBuffer stringbuffer = new StringBuffer();
        byte abyte0[] = new byte[4096];
        do
        {
            int i = inputstream.read(abyte0);
            if (i == -1)
            {
                return stringbuffer.toString();
            }
            stringbuffer.append(new String(abyte0, 0, i));
        } while (true);
    }

    static HashMap requestInterstitial(String s, int i)
    {
        Object obj = null;
        String s1 = createRequestInter(s, i);
        if (s1 != null)
        {
            break MISSING_BLOCK_LABEL_23;
        }
        Log.d("[a\u2022mo\u2022bee]", "can't get an Interstitial ad, mandatory fields are missing.");
        return null;
        try
        {
            Log.d("[a\u2022mo\u2022bee]", (new StringBuilder(" interstitial request is: ")).append(s1).toString());
            s = doInBackground(new String[] {
                s1, s
            });
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            s = obj;
        }
        return s;
    }

    public static void sendNotification(final String myUrl)
    {
        (new Thread(new Runnable() {

            private final String val$myUrl;

            public void run()
            {
                try
                {
                    if (myUrl != null && !myUrl.equals("") && (new DefaultHttpClient()).execute(new HttpGet(myUrl)).getEntity() != null)
                    {
                        Log.d("[a\u2022mo\u2022bee]", (new StringBuilder("Notification sent: ")).append(myUrl).toString());
                    }
                    return;
                }
                catch (Exception exception)
                {
                    Log.d("[a\u2022mo\u2022bee]", "sendNotification error");
                }
            }

            
            {
                myUrl = s;
                super();
            }
        })).start();
    }

}
