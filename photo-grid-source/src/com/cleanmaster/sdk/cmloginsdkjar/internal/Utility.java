// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cleanmaster.sdk.cmloginsdkjar.internal;

import com.cleanmaster.sdk.cmloginsdkjar.CmLoginSdkException;
import com.cleanmaster.sdk.cmloginsdkjar.Request;
import java.io.BufferedInputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URLConnection;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;
import org.json.JSONTokener;

public final class Utility
{

    public static final int DEFAULT_STREAM_BUFFER_SIZE = 8192;
    private static final String HASH_ALGORITHM_MD5 = "MD5";

    public Utility()
    {
    }

    public static void closeQuietly(Closeable closeable)
    {
        if (closeable == null)
        {
            break MISSING_BLOCK_LABEL_10;
        }
        closeable.close();
        return;
        closeable;
    }

    public static void disconnectQuietly(URLConnection urlconnection)
    {
        if (urlconnection instanceof HttpURLConnection)
        {
            ((HttpURLConnection)urlconnection).disconnect();
        }
    }

    public static Object getStringPropertyAsJSON(JSONObject jsonobject, String s, String s1)
    {
        jsonobject = ((JSONObject) (jsonobject.opt(s)));
        if (jsonobject != null && (jsonobject instanceof String))
        {
            jsonobject = ((JSONObject) ((new JSONTokener((String)jsonobject)).nextValue()));
        }
        if (jsonobject != null && !(jsonobject instanceof JSONObject) && !(jsonobject instanceof JSONArray))
        {
            if (s1 != null)
            {
                s = new JSONObject();
                s.putOpt(s1, jsonobject);
                return s;
            } else
            {
                throw new CmLoginSdkException("Got an unexpected non-JSON object.");
            }
        } else
        {
            return jsonobject;
        }
    }

    private static String hashBytes(MessageDigest messagedigest, byte abyte0[])
    {
        messagedigest.update(abyte0);
        messagedigest = messagedigest.digest();
        abyte0 = new StringBuilder();
        int j = messagedigest.length;
        for (int i = 0; i < j; i++)
        {
            byte byte0 = messagedigest[i];
            abyte0.append(Integer.toHexString(byte0 >> 4 & 0xf));
            abyte0.append(Integer.toHexString(byte0 >> 0 & 0xf));
        }

        return abyte0.toString();
    }

    private static String hashWithAlgorithm(String s, String s1)
    {
        return hashWithAlgorithm(s, s1.getBytes());
    }

    private static String hashWithAlgorithm(String s, byte abyte0[])
    {
        try
        {
            s = MessageDigest.getInstance(s);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            return null;
        }
        return hashBytes(s, abyte0);
    }

    public static boolean isNullOrEmpty(String s)
    {
        return s == null || s.length() == 0;
    }

    static String md5hash(String s)
    {
        return hashWithAlgorithm("MD5", s);
    }

    public static void readStreamToFile(HttpURLConnection httpurlconnection, Request request, InputStream inputstream, File file)
    {
        byte abyte0[] = null;
        long l1 = 0L;
        httpurlconnection = (List)httpurlconnection.getHeaderFields().get("X-CM-Content-Length");
        long l = l1;
        if (httpurlconnection != null)
        {
            l = l1;
            if (httpurlconnection.size() > 0)
            {
                l = Long.valueOf((String)httpurlconnection.get(0)).longValue();
            }
        }
        FileOutputStream fileoutputstream;
        int i;
        int j;
        if (request.getCallback() instanceof com.cleanmaster.sdk.cmloginsdkjar.Request.OnSaveProgressCallback)
        {
            httpurlconnection = (com.cleanmaster.sdk.cmloginsdkjar.Request.OnSaveProgressCallback)request.getCallback();
        } else
        {
            httpurlconnection = null;
        }
        fileoutputstream = new FileOutputStream(file.getAbsoluteFile());
        inputstream = new BufferedInputStream(inputstream);
        abyte0 = new byte[2048];
        i = 0;
_L5:
        j = inputstream.read(abyte0, 0, 2048);
        if (j == -1) goto _L2; else goto _L1
_L1:
        if (request.isCanceled()) goto _L2; else goto _L3
_L3:
        fileoutputstream.write(abyte0, 0, j);
        j = i + j;
        i = j;
        if (httpurlconnection == null) goto _L5; else goto _L4
_L4:
        httpurlconnection.onProgress(j, l);
        i = j;
          goto _L5
        httpurlconnection;
        request = inputstream;
_L7:
        closeQuietly(request);
        closeQuietly(fileoutputstream);
        throw httpurlconnection;
_L2:
        if (request.isCanceled())
        {
            file.delete();
        }
        closeQuietly(inputstream);
        closeQuietly(fileoutputstream);
        return;
        httpurlconnection;
        request = abyte0;
        if (true) goto _L7; else goto _L6
_L6:
    }

    public static String readStreamToString(InputStream inputstream)
    {
        Object obj = null;
        inputstream = new BufferedInputStream(inputstream);
        InputStreamReader inputstreamreader = new InputStreamReader(inputstream);
        char ac[];
        obj = new StringBuilder();
        ac = new char[2048];
_L3:
        int i = inputstreamreader.read(ac);
        if (i == -1) goto _L2; else goto _L1
_L1:
        ((StringBuilder) (obj)).append(ac, 0, i);
          goto _L3
        Exception exception;
        exception;
        obj = inputstream;
        inputstream = exception;
_L5:
        closeQuietly(((Closeable) (obj)));
        closeQuietly(inputstreamreader);
        throw inputstream;
_L2:
        obj = ((StringBuilder) (obj)).toString();
        closeQuietly(inputstream);
        closeQuietly(inputstreamreader);
        return ((String) (obj));
        inputstream;
        inputstreamreader = null;
        continue; /* Loop/switch isn't completed */
        exception;
        inputstreamreader = null;
        obj = inputstream;
        inputstream = exception;
        if (true) goto _L5; else goto _L4
_L4:
    }
}
