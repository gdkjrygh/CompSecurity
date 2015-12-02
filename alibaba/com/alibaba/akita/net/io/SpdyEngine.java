// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.alibaba.akita.net.io;

import bdq;
import gt;
import hz;
import ib;
import ie;
import if;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.InetSocketAddress;
import java.net.SocketTimeoutException;
import java.net.URL;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSession;
import lj;
import lw;
import org.apache.http.Header;
import org.apache.http.NameValuePair;

// Referenced classes of package com.alibaba.akita.net.io:
//            ConnectUrl, HttpItemCache, CommonHeaderUtil, ExceptionUtil, 
//            TrackListener, HttpInvoker, ConnectResult

public class SpdyEngine
{

    public static boolean ForceSSL = false;
    public static Set ForceSSLAPI;
    private static Set GETAPI = new HashSet();
    private static long LastRequestTime = 0L;
    private static long LongConnectIdleTime = 0L;
    private static int MAX_SPDY_FAILED_COUNT = 0;
    public static Set NoneSSLAPI = new HashSet();
    private static Set ReportAPI = new HashSet();
    private static int SpdyConnectTimeout = 0;
    private static int SpdyForceFailedCount = 0;
    private static int SpdyReadTimeout = 0;
    private static String TAG = "SpdyEngine";
    public static final String aeDomain = ".aliexpress.com";
    public static final String aliDomain = ".alibaba.com";
    private static boolean closeRetry = false;
    private static boolean enableSpdy = true;
    private static boolean failedRetry = false;
    private static boolean inited = false;
    private static Header sDefaultHeaders[] = null;
    private static bdq spduClient = new bdq();
    private static int spdyFailedCount = 0;
    private static boolean spdySuccessed = false;
    private static TrackListener trackListener = null;

    public SpdyEngine()
    {
    }

    private static void checkSocketIdle()
    {
        com/alibaba/akita/net/io/SpdyEngine;
        JVM INSTR monitorenter ;
        if (LastRequestTime != 0L) goto _L2; else goto _L1
_L1:
        LastRequestTime = System.currentTimeMillis();
_L4:
        com/alibaba/akita/net/io/SpdyEngine;
        JVM INSTR monitorexit ;
        return;
_L2:
        if (System.currentTimeMillis() - LastRequestTime > LongConnectIdleTime && spduClient != null)
        {
            lw.c(TAG, "handle SocketIdle", new Object[0]);
            spduClient.a();
        }
        LastRequestTime = System.currentTimeMillis();
        if (true) goto _L4; else goto _L3
_L3:
        Exception exception;
        exception;
        throw exception;
    }

    public static void close()
    {
        throw new Runtime("d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.provideAs(TypeTransformer.java:780)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.enexpr(TypeTransformer.java:659)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:719)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.enexpr(TypeTransformer.java:698)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:719)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.s1stmt(TypeTransformer.java:810)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.sxStmt(TypeTransformer.java:840)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:206)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n");
    }

    public static boolean directDowngrade()
    {
        throw new Runtime("d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.provideAs(TypeTransformer.java:780)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.enexpr(TypeTransformer.java:659)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:719)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.enexpr(TypeTransformer.java:698)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:719)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.s1stmt(TypeTransformer.java:810)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.sxStmt(TypeTransformer.java:840)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:206)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n");
    }

    public static ConnectResult doGet(ConnectUrl connecturl, Header aheader[])
        throws ie, if
    {
        Object obj1;
        Object obj2;
        lw.e(TAG, (new StringBuilder()).append("get:").append(connecturl.url).append(" ip:").append(connecturl.ip).toString(), new Object[0]);
        obj2 = null;
        obj1 = null;
        int i = connecturl.url.length();
        Object obj = obj2;
        if (connecturl.ip == null)
        {
            break MISSING_BLOCK_LABEL_119;
        }
        obj = obj2;
        if (connecturl.ip.length() <= 0)
        {
            break MISSING_BLOCK_LABEL_119;
        }
        obj = obj2;
        if (!hz.a().c().g())
        {
            obj = new InetSocketAddress(connecturl.ip, connecturl.port);
        }
        obj2 = new URL(connecturl.url);
        obj = spduClient.a(((URL) (obj2)), 2, ((InetSocketAddress) (obj)));
        int j = i;
        if (aheader == null) goto _L2; else goto _L1
_L1:
        int l = aheader.length;
        int k = 0;
_L16:
        j = i;
        if (k >= l) goto _L2; else goto _L3
_L3:
        obj2 = aheader[k];
        ((HttpURLConnection) (obj)).addRequestProperty(((Header) (obj2)).getName(), ((Header) (obj2)).getValue());
        j = i;
        if (((Header) (obj2)).getName() == null) goto _L5; else goto _L4
_L4:
        j = i;
        if (((Header) (obj2)).getValue() != null)
        {
            j = i + ((Header) (obj2)).getName().length() + ((Header) (obj2)).getValue().length();
        }
          goto _L5
_L2:
        if (!connecturl.aliDomain && !hz.a().c().b()) goto _L7; else goto _L6
_L6:
        long l1;
        aheader = HttpItemCache.setRequestId(((HttpURLConnection) (obj)));
        l1 = System.currentTimeMillis();
        CommonHeaderUtil.addCommonHeader(((HttpURLConnection) (obj)));
        obj1 = ((HttpURLConnection) (obj)).getRequestProperties();
        lw.e(TAG, "Headers:========================", new Object[0]);
        lw.e(TAG, obj1.toString(), new Object[0]);
        lw.e(TAG, "Headers end:=====================", new Object[0]);
_L15:
        byte abyte0[];
        long l2;
        ((HttpURLConnection) (obj)).connect();
        l2 = System.currentTimeMillis();
        obj1 = ((HttpURLConnection) (obj)).getInputStream();
        obj2 = new ByteArrayOutputStream();
        abyte0 = new byte[1024];
_L10:
        i = ((InputStream) (obj1)).read(abyte0, 0, 1024);
        if (i == -1) goto _L9; else goto _L8
_L8:
        ((ByteArrayOutputStream) (obj2)).write(abyte0, 0, i);
          goto _L10
_L13:
        double d;
        try
        {
            i = ((String) (obj1)).getBytes().length;
            d = (int)(((double)i / (double)l3) * 1000D);
            break MISSING_BLOCK_LABEL_1376;
        }
        // Misplaced declaration of an exception variable
        catch (Header aheader[])
        {
            if (spdyFailedCount() <= MAX_SPDY_FAILED_COUNT || SpdyForceFailedCount > 0)
            {
                spdyFailedCount++;
                lj.a(gt.a(), "spdy_failed_count", spdyFailedCount);
            }
            if (trackListener != null)
            {
                trackListener.networkProfile(connecturl.getApi("0"), "0", "0", "0", "true", ExceptionUtil.getMessage(aheader), "0", "0", "0", "0", "spdyget", "0", "-3", connecturl.ssl, connecturl.ip);
            }
            connecturl = HttpInvoker.get(connecturl, ExceptionUtil.getMessage(aheader));
        }
        // Misplaced declaration of an exception variable
        catch (Header aheader[])
        {
            if (spdyFailedCount() <= MAX_SPDY_FAILED_COUNT || SpdyForceFailedCount > 0)
            {
                spdyFailedCount++;
                lj.a(gt.a(), "spdy_failed_count", spdyFailedCount);
            }
            if (trackListener != null)
            {
                trackListener.networkProfile(connecturl.getApi("0"), "0", "0", "0", "true", ExceptionUtil.getMessage(aheader), "0", "0", "0", "0", "spdyget", "0", "-3", connecturl.ssl, connecturl.ip);
            }
            return HttpInvoker.get(connecturl, ExceptionUtil.getMessage(aheader));
        }
        // Misplaced declaration of an exception variable
        catch (Header aheader[])
        {
            if (trackListener != null)
            {
                trackListener.networkProfile(connecturl.getApi("0"), "0", "0", "0", "true", ExceptionUtil.getMessage(aheader), "0", "0", "0", "0", "spdyget", "0", "-3", connecturl.ssl, connecturl.ip);
            }
            return HttpInvoker.get(connecturl, ExceptionUtil.getMessage(aheader));
        }
        // Misplaced declaration of an exception variable
        catch (Header aheader[])
        {
            aheader = HttpInvoker.get(connecturl, ExceptionUtil.getMessage(aheader));
            connecturl = aheader;
            if (aheader != null)
            {
                connecturl = aheader;
                if (((ConnectResult) (aheader)).code == 0)
                {
                    connecturl = aheader;
                    if (((ConnectResult) (aheader)).result != null)
                    {
                        if (closeRetry)
                        {
                            try
                            {
                                spduClient.a();
                            }
                            // Misplaced declaration of an exception variable
                            catch (ConnectUrl connecturl) { }
                            failedRetry = true;
                            return aheader;
                        }
                        try
                        {
                            spduClient.a();
                        }
                        // Misplaced declaration of an exception variable
                        catch (ConnectUrl connecturl) { }
                        closeRetry = true;
                        return aheader;
                    }
                }
            }
        }
        // Misplaced declaration of an exception variable
        catch (Header aheader[])
        {
            return new ConnectResult(null, connecturl.ip, 0);
        }
        // Misplaced declaration of an exception variable
        catch (Header aheader[])
        {
            if (spdyFailedCount() <= MAX_SPDY_FAILED_COUNT || SpdyForceFailedCount > 0)
            {
                spdyFailedCount++;
                lj.a(gt.a(), "spdy_failed_count", spdyFailedCount);
            }
            if (trackListener != null)
            {
                trackListener.networkProfile(connecturl.getApi("0"), "0", "0", "0", "true", ExceptionUtil.getMessage(aheader), "0", "0", "0", "0", "spdyget", "0", "-4", connecturl.ssl, connecturl.ip);
            }
            return HttpInvoker.get(connecturl, ExceptionUtil.getMessage(aheader));
        }
        // Misplaced declaration of an exception variable
        catch (Header aheader[])
        {
            if (spdyFailedCount() <= MAX_SPDY_FAILED_COUNT || SpdyForceFailedCount > 0)
            {
                spdyFailedCount++;
                lj.a(gt.a(), "spdy_failed_count", spdyFailedCount);
            }
            return HttpInvoker.get(connecturl, ExceptionUtil.getMessage(aheader));
        }
        // Misplaced declaration of an exception variable
        catch (Header aheader[])
        {
            if (spdyFailedCount() <= MAX_SPDY_FAILED_COUNT || SpdyForceFailedCount > 0)
            {
                spdyFailedCount++;
                lj.a(gt.a(), "spdy_failed_count", spdyFailedCount);
            }
            return HttpInvoker.get(connecturl, "OutOfMemoryError ");
        }
        // Misplaced declaration of an exception variable
        catch (Header aheader[])
        {
            if (spdyFailedCount() <= MAX_SPDY_FAILED_COUNT || SpdyForceFailedCount > 0)
            {
                spdyFailedCount++;
                lj.a(gt.a(), "spdy_failed_count", spdyFailedCount);
            }
            return HttpInvoker.get(connecturl, ExceptionUtil.getMessage(aheader));
        }
        return connecturl;
_L9:
        if (obj1 == null)
        {
            break MISSING_BLOCK_LABEL_526;
        }
        ((InputStream) (obj1)).close();
        l3 = System.currentTimeMillis() - l1;
        if (connecturl.aliDomain)
        {
            HttpItemCache.addToCache(aheader, System.currentTimeMillis() - l1, ((HttpURLConnection) (obj)).getResponseCode());
        }
        if (!spdySuccessed)
        {
            spdySuccessed = true;
            lj.a(gt.a(), "spdy_successed", true);
        }
        obj1 = new String(((ByteArrayOutputStream) (obj2)).toByteArray());
        if (trackListener == null) goto _L12; else goto _L11
_L11:
        if (obj1 == null)
        {
            break; /* Loop/switch isn't completed */
        }
        if (((String) (obj1)).length() <= 0 || ((String) (obj1)).getBytes() == null || l3 <= 0L) goto _L14; else goto _L13
_L17:
        trackListener.networkProfile(connecturl.getApi("0"), (new StringBuilder()).append(l2 - l1).append("").toString(), (new StringBuilder()).append(l3).append("").toString(), "0", "false", "0", (new StringBuilder()).append(d).append("").toString(), (new StringBuilder()).append(j).append("").toString(), (new StringBuilder()).append(i).append("").toString(), "0", "spdyget", ((String) (obj)), "0", connecturl.ssl, connecturl.ip);
_L12:
        lw.a(TAG, "response:", ((String) (obj1)));
        aheader = new ConnectResult(((String) (obj1)), connecturl.ip, 0);
        return aheader;
_L14:
        i = 0;
        d = 0.0D;
        break MISSING_BLOCK_LABEL_1376;
_L7:
        l1 = 0L;
        aheader = ((Header []) (obj1));
          goto _L15
_L5:
        k++;
        i = j;
          goto _L16
        obj = aheader;
        if (aheader == null)
        {
            obj = "0";
        }
          goto _L17
    }

    private static ConnectResult doPost(ConnectUrl connecturl, ArrayList arraylist, Header aheader[])
        throws ie, if
    {
        Object obj1;
        Object obj2;
        lw.e(TAG, (new StringBuilder()).append("post:").append(connecturl.url).append(" ip:").append(connecturl.ip).toString(), new Object[0]);
        if (arraylist != null)
        {
            lw.e(TAG, "params:=====================", new Object[0]);
            NameValuePair namevaluepair;
            for (Iterator iterator = arraylist.iterator(); iterator.hasNext(); lw.e(TAG, (new StringBuilder()).append(namevaluepair.getName()).append("=").append(namevaluepair.getValue()).toString(), new Object[0]))
            {
                namevaluepair = (NameValuePair)iterator.next();
            }

            lw.e(TAG, "params end:=====================", new Object[0]);
        }
        obj2 = null;
        obj1 = null;
        String s;
        int j;
        s = getEncodedParams(arraylist);
        j = connecturl.url.length();
        Object obj = obj2;
        if (connecturl.ip == null)
        {
            break MISSING_BLOCK_LABEL_233;
        }
        obj = obj2;
        if (connecturl.ip.length() <= 0)
        {
            break MISSING_BLOCK_LABEL_233;
        }
        obj = obj2;
        if (!hz.a().c().g())
        {
            obj = new InetSocketAddress(connecturl.ip, connecturl.port);
        }
        long l2;
        l2 = System.currentTimeMillis();
        obj2 = new URL(connecturl.url);
        obj = spduClient.a(((URL) (obj2)), 2, ((InetSocketAddress) (obj)));
        if (aheader == null) goto _L2; else goto _L1
_L1:
        int k = aheader.length;
        int i = 0;
_L3:
        if (i >= k)
        {
            break; /* Loop/switch isn't completed */
        }
        obj2 = aheader[i];
        ((HttpURLConnection) (obj)).addRequestProperty(((Header) (obj2)).getName(), ((Header) (obj2)).getValue());
        i++;
        if (true) goto _L3; else goto _L2
_L2:
        if (connecturl.aliDomain)
        {
            break MISSING_BLOCK_LABEL_340;
        }
        aheader = ((Header []) (obj1));
        if (!hz.a().c().b())
        {
            break MISSING_BLOCK_LABEL_399;
        }
        aheader = HttpItemCache.setRequestId(((HttpURLConnection) (obj)));
        CommonHeaderUtil.addCommonHeader(((HttpURLConnection) (obj)));
        obj1 = ((HttpURLConnection) (obj)).getRequestProperties();
        lw.e(TAG, "Headers:========================", new Object[0]);
        lw.e(TAG, obj1.toString(), new Object[0]);
        lw.e(TAG, "Headers end:=====================", new Object[0]);
        if (s == null) goto _L5; else goto _L4
_L4:
        if (s.length() <= 0) goto _L5; else goto _L6
_L6:
        long l;
        ((HttpURLConnection) (obj)).setRequestMethod("POST");
        ((HttpURLConnection) (obj)).setDoInput(true);
        ((HttpURLConnection) (obj)).setDoOutput(true);
        ((HttpURLConnection) (obj)).setFixedLengthStreamingMode(s.length());
        ((HttpURLConnection) (obj)).connect();
        l = System.currentTimeMillis();
        ((HttpURLConnection) (obj)).getOutputStream().write(s.getBytes("UTF-8"));
        i = s.length();
        l -= l2;
        i = j + i;
_L17:
        byte abyte0[];
        obj1 = ((HttpURLConnection) (obj)).getInputStream();
        obj2 = new ByteArrayOutputStream();
        abyte0 = new byte[1024];
_L9:
        j = ((InputStream) (obj1)).read(abyte0, 0, 1024);
        if (j == -1) goto _L8; else goto _L7
_L7:
        ((ByteArrayOutputStream) (obj2)).write(abyte0, 0, j);
          goto _L9
_L12:
        double d;
        try
        {
            j = ((String) (obj1)).getBytes().length;
            d = (int)(((double)j / (double)l1) * 1000D);
            break MISSING_BLOCK_LABEL_1525;
        }
        // Misplaced declaration of an exception variable
        catch (Header aheader[])
        {
            if (spdyFailedCount() <= MAX_SPDY_FAILED_COUNT || SpdyForceFailedCount > 0)
            {
                spdyFailedCount++;
                lj.a(gt.a(), "spdy_failed_count", spdyFailedCount);
            }
            if (trackListener != null)
            {
                trackListener.networkProfile(connecturl.getApi("0"), "0", "0", "0", "true", ExceptionUtil.getMessage(aheader), "0", "0", "0", "0", "spdypost", "0", "-1", connecturl.ssl, connecturl.ip);
            }
            connecturl = HttpInvoker.post(connecturl, arraylist, ExceptionUtil.getMessage(aheader));
        }
        // Misplaced declaration of an exception variable
        catch (Header aheader[])
        {
            if (spdyFailedCount() <= MAX_SPDY_FAILED_COUNT || SpdyForceFailedCount > 0)
            {
                spdyFailedCount++;
                lj.a(gt.a(), "spdy_failed_count", spdyFailedCount);
            }
            if (trackListener != null)
            {
                trackListener.networkProfile(connecturl.getApi("0"), "0", "0", "0", "true", ExceptionUtil.getMessage(aheader), "0", "0", "0", "0", "spdypost", "0", "-1", connecturl.ssl, connecturl.ip);
            }
            return HttpInvoker.post(connecturl, arraylist, ExceptionUtil.getMessage(aheader));
        }
        // Misplaced declaration of an exception variable
        catch (Header aheader[])
        {
            if (trackListener != null)
            {
                trackListener.networkProfile(connecturl.getApi("0"), "0", "0", "0", "true", ExceptionUtil.getMessage(aheader), "0", "0", "0", "0", "spdypost", "0", "-1", connecturl.ssl, connecturl.ip);
            }
            return HttpInvoker.post(connecturl, arraylist, ExceptionUtil.getMessage(aheader));
        }
        // Misplaced declaration of an exception variable
        catch (Header aheader[])
        {
            arraylist = HttpInvoker.post(connecturl, arraylist, ExceptionUtil.getMessage(aheader));
            connecturl = arraylist;
            if (arraylist != null)
            {
                connecturl = arraylist;
                if (((ConnectResult) (arraylist)).code == 0)
                {
                    connecturl = arraylist;
                    if (((ConnectResult) (arraylist)).result != null)
                    {
                        if (closeRetry)
                        {
                            try
                            {
                                spduClient.a();
                            }
                            // Misplaced declaration of an exception variable
                            catch (ConnectUrl connecturl) { }
                            failedRetry = true;
                            return arraylist;
                        }
                        try
                        {
                            spduClient.a();
                        }
                        // Misplaced declaration of an exception variable
                        catch (ConnectUrl connecturl) { }
                        closeRetry = true;
                        return arraylist;
                    }
                }
            }
        }
        // Misplaced declaration of an exception variable
        catch (ArrayList arraylist)
        {
            return new ConnectResult(null, connecturl.ip, 0);
        }
        // Misplaced declaration of an exception variable
        catch (Header aheader[])
        {
            aheader.printStackTrace();
            if (spdyFailedCount() <= MAX_SPDY_FAILED_COUNT || SpdyForceFailedCount > 0)
            {
                spdyFailedCount++;
                lj.a(gt.a(), "spdy_failed_count", spdyFailedCount);
            }
            if (trackListener != null)
            {
                trackListener.networkProfile(connecturl.getApi("0"), "0", "0", "0", "true", ExceptionUtil.getMessage(aheader), "0", "0", "0", "0", "spdypost", "0", "-2", connecturl.ssl, connecturl.ip);
            }
            return HttpInvoker.post(connecturl, arraylist, ExceptionUtil.getMessage(aheader));
        }
        // Misplaced declaration of an exception variable
        catch (Header aheader[])
        {
            if (spdyFailedCount() <= MAX_SPDY_FAILED_COUNT || SpdyForceFailedCount > 0)
            {
                spdyFailedCount++;
                lj.a(gt.a(), "spdy_failed_count", spdyFailedCount);
            }
            return HttpInvoker.post(connecturl, arraylist, ExceptionUtil.getMessage(aheader));
        }
        // Misplaced declaration of an exception variable
        catch (Header aheader[])
        {
            if (spdyFailedCount() <= MAX_SPDY_FAILED_COUNT || SpdyForceFailedCount > 0)
            {
                spdyFailedCount++;
                lj.a(gt.a(), "spdy_failed_count", spdyFailedCount);
            }
            return HttpInvoker.post(connecturl, arraylist, "OutOfMemoryError");
        }
        // Misplaced declaration of an exception variable
        catch (Header aheader[])
        {
            if (spdyFailedCount() <= MAX_SPDY_FAILED_COUNT || SpdyForceFailedCount > 0)
            {
                spdyFailedCount++;
                lj.a(gt.a(), "spdy_failed_count", spdyFailedCount);
            }
            return HttpInvoker.post(connecturl, arraylist, ExceptionUtil.getMessage(aheader));
        }
        return connecturl;
_L5:
        ((HttpURLConnection) (obj)).connect();
        l = System.currentTimeMillis() - l2;
        i = j;
        continue; /* Loop/switch isn't completed */
_L8:
        if (obj1 == null)
        {
            break MISSING_BLOCK_LABEL_688;
        }
        ((InputStream) (obj1)).close();
        l1 = System.currentTimeMillis() - l2;
        if (connecturl.aliDomain)
        {
            l1 = System.currentTimeMillis() - l2;
            HttpItemCache.addToCache(aheader, l1, ((HttpURLConnection) (obj)).getResponseCode());
        }
        if (!spdySuccessed)
        {
            spdySuccessed = true;
            lj.a(gt.a(), "spdy_successed", true);
        }
        obj1 = new String(((ByteArrayOutputStream) (obj2)).toByteArray());
        if (trackListener == null) goto _L11; else goto _L10
_L10:
        if (obj1 == null)
        {
            break; /* Loop/switch isn't completed */
        }
        if (((String) (obj1)).length() <= 0 || ((String) (obj1)).getBytes() == null || l1 <= 0L) goto _L13; else goto _L12
_L15:
        trackListener.networkProfile(connecturl.getApi("0"), (new StringBuilder()).append(l).append("").toString(), (new StringBuilder()).append(l1).append("").toString(), "0", "false", "0", (new StringBuilder()).append(d).append("").toString(), (new StringBuilder()).append(i).append("").toString(), (new StringBuilder()).append(j).append("").toString(), "0", "spdypost", ((String) (obj)), "0", connecturl.ssl, connecturl.ip);
_L11:
        lw.a(TAG, "response:", ((String) (obj1)));
        aheader = new ConnectResult(((String) (obj1)), connecturl.ip, 0);
        return aheader;
_L13:
        j = 0;
        d = 0.0D;
        obj = aheader;
        if (aheader == null)
        {
            obj = "0";
        }
        if (true) goto _L15; else goto _L14
_L14:
        if (true) goto _L17; else goto _L16
_L16:
    }

    public static boolean enableSpdy()
    {
        throw new Runtime("d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.provideAs(TypeTransformer.java:780)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.enexpr(TypeTransformer.java:659)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:719)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.enexpr(TypeTransformer.java:698)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:719)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.s1stmt(TypeTransformer.java:810)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.sxStmt(TypeTransformer.java:840)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:206)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n");
    }

    public static ConnectResult get(ConnectUrl connecturl)
        throws ie, if
    {
        throw new Runtime("d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.provideAs(TypeTransformer.java:780)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.enexpr(TypeTransformer.java:659)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:719)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.enexpr(TypeTransformer.java:698)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:719)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.s1stmt(TypeTransformer.java:810)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.sxStmt(TypeTransformer.java:840)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:206)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n");
    }

    private static String getEncodedParams(List list)
    {
        throw new Runtime("d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.provideAs(TypeTransformer.java:780)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.enexpr(TypeTransformer.java:659)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:719)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.enexpr(TypeTransformer.java:698)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:719)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.s1stmt(TypeTransformer.java:810)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.sxStmt(TypeTransformer.java:840)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:206)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n");
    }

    private static void initSet(Set set, String s)
    {
        throw new Runtime("d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.provideAs(TypeTransformer.java:780)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.enexpr(TypeTransformer.java:659)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:719)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.enexpr(TypeTransformer.java:698)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:719)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.s1stmt(TypeTransformer.java:810)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.sxStmt(TypeTransformer.java:840)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:206)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n");
    }

    public static void initialize(Header aheader[])
    {
        throw new Runtime("d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.provideAs(TypeTransformer.java:780)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.enexpr(TypeTransformer.java:659)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:719)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.enexpr(TypeTransformer.java:698)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:719)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.s1stmt(TypeTransformer.java:810)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.sxStmt(TypeTransformer.java:840)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:206)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n");
    }

    public static ConnectResult post(ConnectUrl connecturl, ArrayList arraylist)
        throws ie, if
    {
        throw new Runtime("d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.provideAs(TypeTransformer.java:780)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.enexpr(TypeTransformer.java:659)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:719)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.enexpr(TypeTransformer.java:698)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:719)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.s1stmt(TypeTransformer.java:810)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.sxStmt(TypeTransformer.java:840)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:206)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n");
    }

    public static void setConfig(String s, int i, int j, boolean flag, String s1, String s2, String s3, int k, 
            int l, int i1, int j1, boolean flag1)
    {
        enableSpdy = flag;
        SpdyForceFailedCount = i1;
        MAX_SPDY_FAILED_COUNT = j1;
        ForceSSL = flag1;
        initSet(NoneSSLAPI, s1);
        initSet(GETAPI, s2);
        initSet(ReportAPI, s3);
        if (k > 0)
        {
            SpdyReadTimeout = k;
        }
        if (l > 0)
        {
            SpdyConnectTimeout = l;
        }
        if (SpdyConnectTimeout > 0)
        {
            spduClient.a(SpdyConnectTimeout, TimeUnit.SECONDS);
        }
        if (SpdyReadTimeout > 0)
        {
            spduClient.b(SpdyReadTimeout, TimeUnit.SECONDS);
        }
    }

    public static void setTrackListener(TrackListener tracklistener)
    {
        throw new Runtime("d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.provideAs(TypeTransformer.java:780)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.enexpr(TypeTransformer.java:659)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:719)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.enexpr(TypeTransformer.java:698)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:719)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.s1stmt(TypeTransformer.java:810)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.sxStmt(TypeTransformer.java:840)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:206)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n");
    }

    public static int spdyFailedCount()
    {
        throw new Runtime("d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.provideAs(TypeTransformer.java:780)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.enexpr(TypeTransformer.java:659)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:719)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.enexpr(TypeTransformer.java:698)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:719)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.s1stmt(TypeTransformer.java:810)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.sxStmt(TypeTransformer.java:840)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:206)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n");
    }

    public static boolean spdySuccessed()
    {
        throw new Runtime("d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.provideAs(TypeTransformer.java:780)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.enexpr(TypeTransformer.java:659)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:719)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.enexpr(TypeTransformer.java:698)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:719)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.s1stmt(TypeTransformer.java:810)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.sxStmt(TypeTransformer.java:840)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:206)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n");
    }

    static 
    {
        MAX_SPDY_FAILED_COUNT = 5;
        SpdyForceFailedCount = 0;
        ForceSSL = true;
        ForceSSLAPI = new HashSet();
        SpdyReadTimeout = 8;
        SpdyConnectTimeout = 8;
        LongConnectIdleTime = 0x15f90L;
        LastRequestTime = 0L;
        ForceSSLAPI.add("clientSetting.abTestAndroid");
    }


    // Unreferenced inner class com/alibaba/akita/net/io/SpdyEngine$1

/* anonymous class */
    static final class _cls1
        implements HostnameVerifier
    {

        public boolean verify(String s, SSLSession sslsession)
        {
            throw new Runtime("d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.provideAs(TypeTransformer.java:780)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.enexpr(TypeTransformer.java:659)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:719)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.enexpr(TypeTransformer.java:698)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:719)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.s1stmt(TypeTransformer.java:810)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.sxStmt(TypeTransformer.java:840)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:206)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n");
        }

    }

}
