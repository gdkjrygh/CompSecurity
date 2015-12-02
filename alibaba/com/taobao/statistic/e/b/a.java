// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.taobao.statistic.e.b;

import com.taobao.statistic.f.p;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.zip.GZIPInputStream;

public final class a
{

    public static byte[] b(int i, String s, Map map, boolean flag)
    {
        byte abyte0[] = null;
        if (!p.isEmpty(s)) goto _L2; else goto _L1
_L1:
        HttpURLConnection httpurlconnection;
        return null;
_L2:
        if ((httpurlconnection = (HttpURLConnection)(new URL(s)).openConnection()) == null) goto _L1; else goto _L3
_L3:
label0:
        {
            if (i == 2 || i == 3)
            {
                httpurlconnection.setDoOutput(true);
            }
            httpurlconnection.setDoInput(true);
            if (i == 2 || i == 3)
            {
                Iterator iterator;
                byte abyte1[];
                try
                {
                    httpurlconnection.setRequestMethod("POST");
                }
                // Misplaced declaration of an exception variable
                catch (String s)
                {
                    s.printStackTrace();
                    return null;
                }
                break label0;
            }
        }
        break MISSING_BLOCK_LABEL_296;
        s;
        s.printStackTrace();
        return null;
        s;
        s.printStackTrace();
        return null;
        httpurlconnection.setRequestMethod("GET");
        break label0;
        httpurlconnection.setUseCaches(false);
        httpurlconnection.setConnectTimeout(10000);
        httpurlconnection.setReadTimeout(30000);
        httpurlconnection.setRequestProperty("Connection", "Keep-Alive");
        if (flag)
        {
            httpurlconnection.setRequestProperty("Accept-Encoding", "gzip,deflate");
        }
        httpurlconnection.setInstanceFollowRedirects(true);
        if (i != 2 && i != 3)
        {
            break MISSING_BLOCK_LABEL_774;
        }
        if (i == 2)
        {
            httpurlconnection.setRequestProperty("Content-Type", "multipart/form-data; boundary=android_BOUNDARY");
        } else
        if (i == 3)
        {
            httpurlconnection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
        }
        Object obj;
        int j;
        long l;
        if (map != null && map.size() > 0)
        {
            s = new ByteArrayOutputStream();
            for (iterator = map.keySet().iterator(); iterator.hasNext();)
            {
                Object obj1 = (String)iterator.next();
                if (i == 2)
                {
                    abyte1 = (byte[])(byte[])map.get(obj1);
                    if (abyte1 != null)
                    {
                        try
                        {
                            s.write(String.format("--android_BOUNDARY\r\nContent-Disposition: form-data; name=\"%s\"; filename=\"%s\"\r\nContent-Type: application/octet-stream \r\n\r\n", new Object[] {
                                obj1, obj1
                            }).getBytes());
                            s.write(abyte1);
                            s.write("\r\n--android_BOUNDARY--\r\n".getBytes());
                        }
                        // Misplaced declaration of an exception variable
                        catch (Object obj1)
                        {
                            ((Exception) (obj1)).printStackTrace();
                        }
                    }
                } else
                if (i == 3)
                {
                    String s1 = (String)map.get(obj1);
                    if (s.size() > 0)
                    {
                        try
                        {
                            s.write(String.format("&%s=%s", new Object[] {
                                obj1, s1
                            }).getBytes());
                        }
                        // Misplaced declaration of an exception variable
                        catch (Object obj1)
                        {
                            ((Exception) (obj1)).printStackTrace();
                        }
                    } else
                    {
                        try
                        {
                            s.write(String.format("%s=%s", new Object[] {
                                obj1, s1
                            }).getBytes());
                        }
                        catch (Exception exception)
                        {
                            exception.printStackTrace();
                        }
                    }
                }
            }

            s = s.toByteArray();
        } else
        {
            s = null;
        }
        if (s != null)
        {
            j = s.length;
        } else
        {
            j = 0;
        }
        httpurlconnection.setRequestProperty("Content-Length", String.valueOf(j));
        map = s;
_L15:
        httpurlconnection.connect();
        if (i != 2 && i != 3 || map == null)
        {
            break MISSING_BLOCK_LABEL_758;
        }
        if (map.length <= 0)
        {
            break MISSING_BLOCK_LABEL_758;
        }
        s = new DataOutputStream(httpurlconnection.getOutputStream());
        s.write(map);
        s.flush();
        s.close();
_L14:
        if (s != null)
        {
            try
            {
                s.close();
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                s.printStackTrace();
            }
        }
        if (!flag) goto _L5; else goto _L4
_L4:
        if (!"gzip".equals(httpurlconnection.getContentEncoding())) goto _L5; else goto _L6
_L6:
        s = new GZIPInputStream(httpurlconnection.getInputStream());
_L10:
        map = new ByteArrayOutputStream();
        l = System.currentTimeMillis();
        abyte0 = new byte[2048];
_L8:
        i = s.read(abyte0, 0, 2048);
        if (i == -1)
        {
            break MISSING_BLOCK_LABEL_609;
        }
        map.write(abyte0, 0, i);
        if (System.currentTimeMillis() - l <= 10000L) goto _L8; else goto _L7
_L7:
        map.reset();
_L11:
        if (httpurlconnection != null)
        {
            httpurlconnection.disconnect();
        }
        if (s != null)
        {
            try
            {
                s.close();
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                s.printStackTrace();
            }
        }
        if (map.size() > 0)
        {
            return map.toByteArray();
        }
          goto _L1
        map;
        s = null;
_L13:
        map.printStackTrace();
        if (s == null) goto _L1; else goto _L9
_L9:
        try
        {
            s.close();
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            s.printStackTrace();
            return null;
        }
        return null;
        s;
        map = abyte0;
_L12:
        if (map != null)
        {
            try
            {
                map.close();
            }
            // Misplaced declaration of an exception variable
            catch (Map map)
            {
                map.printStackTrace();
            }
        }
        throw s;
_L5:
        try
        {
            s = new DataInputStream(httpurlconnection.getInputStream());
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            s.printStackTrace();
            return null;
        }
          goto _L10
        obj;
        ((Throwable) (obj)).printStackTrace();
          goto _L11
        obj;
        map = s;
        s = ((String) (obj));
          goto _L12
        obj;
        map = s;
        s = ((String) (obj));
          goto _L12
        map;
          goto _L13
        s = null;
          goto _L14
        map = null;
          goto _L15
    }

    static 
    {
        System.setProperty("http.keepAlive", "true");
    }
}
