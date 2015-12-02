// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ut.mini.d;

import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;
import java.util.Map;
import java.util.Set;
import java.util.zip.GZIPInputStream;

// Referenced classes of package com.ut.mini.d:
//            n, f

public final class d
{

    public static byte[] a(int i, String s, Map map, boolean flag)
    {
        if (!n.a(s)) goto _L2; else goto _L1
_L1:
        return null;
_L2:
        byte abyte0[];
        Object aobj[];
        HttpURLConnection httpurlconnection;
        int j;
        try
        {
            httpurlconnection = (HttpURLConnection)(new URL(s)).openConnection();
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            s.printStackTrace();
            return null;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            s.printStackTrace();
            return null;
        }
        if (httpurlconnection == null) goto _L4; else goto _L3
_L3:
        if (i == 2 || i == 3)
        {
            httpurlconnection.setDoOutput(true);
        }
        httpurlconnection.setDoInput(true);
        if (i != 2 && i != 3) goto _L6; else goto _L5
_L5:
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
        httpurlconnection.setUseCaches(false);
        httpurlconnection.setConnectTimeout(10000);
        httpurlconnection.setReadTimeout(35000);
        httpurlconnection.setRequestProperty("Connection", "Keep-Alive");
        if (flag)
        {
            httpurlconnection.setRequestProperty("Accept-Encoding", "gzip,deflate");
        }
        httpurlconnection.setInstanceFollowRedirects(true);
        abyte0 = null;
        if (i == 2 || i == 3)
        {
            break MISSING_BLOCK_LABEL_131;
        }
          goto _L7
_L6:
        httpurlconnection.setRequestMethod("GET");
        break MISSING_BLOCK_LABEL_69;
        String s1;
        int k;
        if (i == 2)
        {
            httpurlconnection.setRequestProperty("Content-Type", "multipart/form-data; boundary=GJircTeP");
        } else
        if (i == 3)
        {
            httpurlconnection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
        }
        if (map == null || map.size() <= 0)
        {
            break MISSING_BLOCK_LABEL_928;
        }
        s = new ByteArrayOutputStream();
        abyte0 = map.keySet();
        aobj = new String[abyte0.size()];
        abyte0.toArray(aobj);
        abyte0 = f.a().a(((String []) (aobj)), true);
        k = abyte0.length;
        j = 0;
        do
        {
            if (j >= k)
            {
                break;
            }
            Object obj = abyte0[j];
            if (i == 2)
            {
                byte abyte1[] = (byte[])(byte[])map.get(obj);
                if (abyte1 != null)
                {
                    try
                    {
                        s.write(String.format("--GJircTeP\r\nContent-Disposition: form-data; name=\"%s\"; filename=\"%s\"\r\nContent-Type: application/octet-stream \r\n\r\n", new Object[] {
                            obj, obj
                        }).getBytes());
                        s.write(abyte1);
                        s.write("\r\n".getBytes());
                    }
                    // Misplaced declaration of an exception variable
                    catch (Object obj)
                    {
                        ((IOException) (obj)).printStackTrace();
                    }
                }
            } else
            if (i == 3)
            {
                String s2 = (String)map.get(obj);
                if (s.size() > 0)
                {
                    try
                    {
                        s.write((new StringBuilder()).append("&").append(((String) (obj))).append("=").append(s2).toString().getBytes());
                    }
                    // Misplaced declaration of an exception variable
                    catch (Object obj)
                    {
                        ((IOException) (obj)).printStackTrace();
                    }
                } else
                {
                    try
                    {
                        s.write((new StringBuilder()).append(((String) (obj))).append("=").append(s2).toString().getBytes());
                    }
                    catch (IOException ioexception)
                    {
                        ioexception.printStackTrace();
                    }
                }
            }
            j++;
        } while (true);
        ByteArrayOutputStream bytearrayoutputstream;
        long l;
        if (i == 2)
        {
            try
            {
                s.write("--GJircTeP--\r\n".getBytes());
            }
            // Misplaced declaration of an exception variable
            catch (Map map)
            {
                map.printStackTrace();
            }
        }
        s = s.toByteArray();
_L18:
        Exception exception;
        if (s != null)
        {
            j = s.length;
        } else
        {
            j = 0;
        }
        httpurlconnection.setRequestProperty("Content-Length", String.valueOf(j));
        abyte0 = s;
_L7:
        map = null;
        ioexception = null;
        httpurlconnection.connect();
        if (i != 2)
        {
            s = ioexception;
            if (i != 3)
            {
                break MISSING_BLOCK_LABEL_588;
            }
        }
        s = ioexception;
        if (abyte0 == null)
        {
            break MISSING_BLOCK_LABEL_588;
        }
        s = ioexception;
        if (abyte0.length <= 0)
        {
            break MISSING_BLOCK_LABEL_588;
        }
        s = new DataOutputStream(httpurlconnection.getOutputStream());
        s.write(abyte0);
        s.flush();
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
        ioexception = null;
        s = null;
        bytearrayoutputstream = new ByteArrayOutputStream();
        if (!flag) goto _L9; else goto _L8
_L8:
        s1 = s;
        map = ioexception;
        if (!"gzip".equals(httpurlconnection.getContentEncoding())) goto _L9; else goto _L10
_L10:
        s1 = s;
        map = ioexception;
        s = new GZIPInputStream(httpurlconnection.getInputStream());
_L14:
        s1 = s;
        map = s;
        l = System.currentTimeMillis();
        s1 = s;
        map = s;
        ioexception = new byte[2048];
_L12:
        s1 = s;
        map = s;
        i = s.read(ioexception, 0, 2048);
        if (i == -1)
        {
            break MISSING_BLOCK_LABEL_737;
        }
        s1 = s;
        map = s;
        bytearrayoutputstream.write(ioexception, 0, i);
        s1 = s;
        map = s;
        if (System.currentTimeMillis() - l <= 10000L) goto _L12; else goto _L11
_L11:
        s1 = s;
        map = s;
        bytearrayoutputstream.reset();
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
        if (bytearrayoutputstream.size() > 0)
        {
            return bytearrayoutputstream.toByteArray();
        } else
        {
            return null;
        }
        map;
        s = null;
_L17:
        map.printStackTrace();
        if (s == null) goto _L1; else goto _L13
_L13:
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
_L16:
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
_L9:
        s1 = s;
        map = ioexception;
        s = new DataInputStream(httpurlconnection.getInputStream());
          goto _L14
        s;
        map = s1;
        s.printStackTrace();
        if (s1 == null) goto _L1; else goto _L15
_L15:
        try
        {
            s1.close();
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            s.printStackTrace();
            return null;
        }
        return null;
        s;
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
_L4:
        return null;
        exception;
        map = s;
        s = exception;
          goto _L16
        exception;
        map = s;
        s = exception;
          goto _L16
        map;
          goto _L17
        s = null;
          goto _L18
    }

    static 
    {
        System.setProperty("http.keepAlive", "true");
    }
}
