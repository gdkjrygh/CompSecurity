// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.adobe.mobile;

import java.io.BufferedOutputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.SocketTimeoutException;
import java.net.URL;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import javax.net.ssl.HttpsURLConnection;
import org.apache.http.conn.ssl.StrictHostnameVerifier;

// Referenced classes of package com.adobe.mobile:
//            StaticMethods

final class RequestHandler
{

    private static final int BUF_SIZE = 1024;
    private static final int CONNECTION_TIMEOUT = 2000;
    private static final Object _hostnameVerifierMutex = new Object();
    private static StrictHostnameVerifier _strictHostnameVerifier = null;

    RequestHandler()
    {
    }

    private static HttpURLConnection requestConnect(String s)
    {
        obj = new URL(s);
        if (!((URL) (obj)).getProtocol().equals("https"))
        {
            break MISSING_BLOCK_LABEL_86;
        }
        synchronized (_hostnameVerifierMutex)
        {
            if (_strictHostnameVerifier == null)
            {
                _strictHostnameVerifier = new StrictHostnameVerifier();
            }
        }
        s = (HttpsURLConnection)((URL) (obj)).openConnection();
        s.setHostnameVerifier(_strictHostnameVerifier);
        return s;
        obj;
        s;
        JVM INSTR monitorexit ;
        try
        {
            throw obj;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            StaticMethods.logErrorFormat("Adobe Mobile - Exception opening URL(%s)", new Object[] {
                s.getLocalizedMessage()
            });
        }
        return null;
        s = (HttpURLConnection)((URL) (obj)).openConnection();
        return s;
    }

    protected static byte[] retrieveData(String s, Map map, int i, String s1)
    {
        String s2;
        Map map1;
        Map map2;
        Map map3;
        String s3;
        Map map4;
        String s4;
        String s5;
        byte abyte0[];
        ByteArrayOutputStream bytearrayoutputstream;
        Object obj;
        Object obj1;
        s4 = null;
        s5 = null;
        s2 = null;
        s3 = null;
        abyte0 = null;
        obj = null;
        bytearrayoutputstream = null;
        obj1 = null;
        map2 = obj1;
        map3 = abyte0;
        map4 = obj;
        map1 = bytearrayoutputstream;
        s = requestConnect(s);
        s3 = s;
        map2 = obj1;
        s4 = s;
        map3 = abyte0;
        s5 = s;
        map4 = obj;
        s2 = s;
        map1 = bytearrayoutputstream;
        s.setConnectTimeout(2000);
        s3 = s;
        map2 = obj1;
        s4 = s;
        map3 = abyte0;
        s5 = s;
        map4 = obj;
        s2 = s;
        map1 = bytearrayoutputstream;
        s.setReadTimeout(i);
        if (map == null) goto _L2; else goto _L1
_L1:
        s3 = s;
        map2 = obj1;
        s4 = s;
        map3 = abyte0;
        s5 = s;
        map4 = obj;
        s2 = s;
        map1 = bytearrayoutputstream;
        Iterator iterator = map.entrySet().iterator();
_L3:
        s3 = s;
        map2 = obj1;
        s4 = s;
        map3 = abyte0;
        s5 = s;
        map4 = obj;
        s2 = s;
        map1 = bytearrayoutputstream;
        if (!iterator.hasNext())
        {
            break; /* Loop/switch isn't completed */
        }
        s3 = s;
        map2 = obj1;
        s4 = s;
        map3 = abyte0;
        s5 = s;
        map4 = obj;
        s2 = s;
        map1 = bytearrayoutputstream;
        map = (java.util.Map.Entry)iterator.next();
        s3 = s;
        map2 = obj1;
        s4 = s;
        map3 = abyte0;
        s5 = s;
        map4 = obj;
        s2 = s;
        map1 = bytearrayoutputstream;
        s.setRequestProperty((String)map.getKey(), (String)map.getValue());
        if (true) goto _L3; else goto _L2
        s;
        s2 = s3;
        map1 = map2;
        StaticMethods.logWarningFormat("%s - IOException while sending request (%s)", new Object[] {
            s1, s.getLocalizedMessage()
        });
        map = null;
        if (s3 != null)
        {
            s3.disconnect();
        }
        s = map;
        if (map2 != null)
        {
            try
            {
                map2.close();
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                StaticMethods.logWarningFormat("%s - Unable to close stream (%s)", new Object[] {
                    s.getLocalizedMessage()
                });
                return null;
            }
            s = map;
        }
_L8:
        return s;
_L2:
        s3 = s;
        map2 = obj1;
        s4 = s;
        map3 = abyte0;
        s5 = s;
        map4 = obj;
        s2 = s;
        map1 = bytearrayoutputstream;
        if (s.getResponseCode() != 200)
        {
            break; /* Loop/switch isn't completed */
        }
        s3 = s;
        map2 = obj1;
        s4 = s;
        map3 = abyte0;
        s5 = s;
        map4 = obj;
        s2 = s;
        map1 = bytearrayoutputstream;
        map = s.getInputStream();
        s3 = s;
        map2 = map;
        s4 = s;
        map3 = map;
        s5 = s;
        map4 = map;
        s2 = s;
        map1 = map;
        abyte0 = new byte[1024];
        s3 = s;
        map2 = map;
        s4 = s;
        map3 = map;
        s5 = s;
        map4 = map;
        s2 = s;
        map1 = map;
        bytearrayoutputstream = new ByteArrayOutputStream();
_L4:
        s3 = s;
        map2 = map;
        s4 = s;
        map3 = map;
        s5 = s;
        map4 = map;
        s2 = s;
        map1 = map;
        if (map.read(abyte0) == -1)
        {
            break MISSING_BLOCK_LABEL_620;
        }
        s3 = s;
        map2 = map;
        s4 = s;
        map3 = map;
        s5 = s;
        map4 = map;
        s2 = s;
        map1 = map;
        bytearrayoutputstream.write(abyte0);
          goto _L4
        s;
        s2 = s4;
        map1 = map3;
        StaticMethods.logWarningFormat("%s - Exception while sending request (%s)", new Object[] {
            s1, s.getLocalizedMessage()
        });
        s = null;
        if (s4 != null)
        {
            s4.disconnect();
        }
        if (map3 != null)
        {
            try
            {
                map3.close();
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                StaticMethods.logWarningFormat("%s - Unable to close stream (%s)", new Object[] {
                    s.getLocalizedMessage()
                });
                return null;
            }
            return null;
        }
        continue; /* Loop/switch isn't completed */
        s3 = s;
        map2 = map;
        s4 = s;
        map3 = map;
        s5 = s;
        map4 = map;
        s2 = s;
        map1 = map;
        map.close();
        s3 = s;
        map2 = map;
        s4 = s;
        map3 = map;
        s5 = s;
        map4 = map;
        s2 = s;
        map1 = map;
        abyte0 = bytearrayoutputstream.toByteArray();
        s1 = abyte0;
        if (s != null)
        {
            s.disconnect();
        }
        s = s1;
        if (map != null)
        {
            try
            {
                map.close();
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                StaticMethods.logWarningFormat("%s - Unable to close stream (%s)", new Object[] {
                    s.getLocalizedMessage()
                });
                return s1;
            }
            return s1;
        }
        if (true) goto _L6; else goto _L5
_L6:
        break MISSING_BLOCK_LABEL_343;
_L5:
        if (s != null)
        {
            s.disconnect();
        }
        if (false)
        {
            try
            {
                throw new NullPointerException();
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                StaticMethods.logWarningFormat("%s - Unable to close stream (%s)", new Object[] {
                    s.getLocalizedMessage()
                });
            }
        }
        return null;
        s;
        s2 = s5;
        map1 = map4;
        StaticMethods.logWarningFormat("%s - Unexpected error while sending request (%s", new Object[] {
            s.getLocalizedMessage()
        });
        s = null;
        if (s5 != null)
        {
            s5.disconnect();
        }
        if (map4 == null) goto _L8; else goto _L7
_L7:
        try
        {
            map4.close();
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            StaticMethods.logWarningFormat("%s - Unable to close stream (%s)", new Object[] {
                s.getLocalizedMessage()
            });
            return null;
        }
        return null;
        s;
        if (s2 != null)
        {
            s2.disconnect();
        }
        if (map1 != null)
        {
            try
            {
                map1.close();
            }
            // Misplaced declaration of an exception variable
            catch (Map map)
            {
                StaticMethods.logWarningFormat("%s - Unable to close stream (%s)", new Object[] {
                    map.getLocalizedMessage()
                });
            }
        }
        throw s;
    }

    protected static boolean sendAnalyticsRequest(String s, String s1, Map map, int i)
    {
        if (s == null)
        {
            return false;
        }
        s = requestConnect(s);
        if (s == null)
        {
            return false;
        }
        byte abyte0[];
        s.setConnectTimeout(i);
        s.setReadTimeout(i);
        s.setRequestMethod("POST");
        abyte0 = s1.getBytes("UTF-8");
        s.setFixedLengthStreamingMode(abyte0.length);
        s.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
        if (map == null)
        {
            break MISSING_BLOCK_LABEL_135;
        }
        java.util.Map.Entry entry;
        for (map = map.entrySet().iterator(); map.hasNext(); s.setRequestProperty((String)entry.getKey(), (String)entry.getValue()))
        {
            entry = (java.util.Map.Entry)map.next();
        }

        try
        {
            map = new BufferedOutputStream(s.getOutputStream());
            map.write(abyte0);
            map.close();
            s = s.getInputStream();
            for (map = new byte[10]; s.read(map) > 0;) { }
            s.close();
            StaticMethods.logDebugFormat("Analytics - Request Sent(%s)", new Object[] {
                s1
            });
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            StaticMethods.logDebugFormat("Analytics - Timed out sending request(%s)", new Object[] {
                s1
            });
            return false;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            StaticMethods.logDebugFormat("Analytics - IOException while sending request, may retry(%s)", new Object[] {
                s.getLocalizedMessage()
            });
            return false;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            StaticMethods.logErrorFormat("Analytics - Exception while attempting to send hit, will not retry(%s)", new Object[] {
                s.getLocalizedMessage()
            });
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            StaticMethods.logErrorFormat("Analytics - Exception while attempting to send hit, will not retry(%s)", new Object[] {
                s.getLocalizedMessage()
            });
        }
        return true;
    }

    protected static void sendGenericRequest(String s, Map map, int i, String s1)
    {
        if (s != null) goto _L2; else goto _L1
_L1:
        HttpURLConnection httpurlconnection;
        return;
_L2:
        if ((httpurlconnection = requestConnect(s)) == null) goto _L1; else goto _L3
_L3:
        httpurlconnection.setConnectTimeout(i);
        httpurlconnection.setReadTimeout(i);
        if (map == null)
        {
            break MISSING_BLOCK_LABEL_126;
        }
        map = map.entrySet().iterator();
        do
        {
            if (!map.hasNext())
            {
                break;
            }
            java.util.Map.Entry entry = (java.util.Map.Entry)map.next();
            String s2 = (String)entry.getValue();
            if (s2.trim().length() > 0)
            {
                httpurlconnection.setRequestProperty((String)entry.getKey(), s2);
            }
        } while (true);
        try
        {
            StaticMethods.logDebugFormat("%s - Request Sent(%s)", new Object[] {
                s1, s
            });
            httpurlconnection.getResponseCode();
            httpurlconnection.getInputStream().close();
            httpurlconnection.disconnect();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Map map)
        {
            StaticMethods.logWarningFormat("%s - Timed out sending request(%s)", new Object[] {
                s1, s
            });
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            StaticMethods.logWarningFormat("%s - IOException while sending request, may retry(%s)", new Object[] {
                s1, s.getLocalizedMessage()
            });
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            StaticMethods.logWarningFormat("%s - Exception while attempting to send hit, will not retry(%s)", new Object[] {
                s1, s.getLocalizedMessage()
            });
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            StaticMethods.logWarningFormat("%s - Exception while attempting to send hit, will not retry(%s)", new Object[] {
                s1, s.getLocalizedMessage()
            });
        }
        return;
    }

}
