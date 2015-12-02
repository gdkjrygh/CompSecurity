// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.alibaba.akita.net.io;

import android.widget.ProgressBar;
import hz;
import ib;
import ie;
import if;
import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.ConnectException;
import java.net.HttpURLConnection;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import lw;
import org.apache.http.Header;
import org.apache.http.HttpException;
import org.apache.http.HttpRequest;
import org.apache.http.HttpRequestInterceptor;
import org.apache.http.HttpResponse;
import org.apache.http.HttpResponseInterceptor;
import org.apache.http.NameValuePair;
import org.apache.http.ParseException;
import org.apache.http.StatusLine;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.conn.ConnectTimeoutException;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.impl.conn.tsccm.ThreadSafeClientConnManager;
import org.apache.http.protocol.HttpContext;
import org.apache.http.util.EntityUtils;

// Referenced classes of package com.alibaba.akita.net.io:
//            ConnectUrl, HttpItemCache, TrackListener, ConnectResult, 
//            CommonHeaderUtil, OpEventListener, SpdyUtil

public class HttpInvoker
{

    private static String CHARSET = "UTF-8";
    private static final int DEFAULT_BUFFER_SIZE = 0x10000;
    private static final int DEFAULT_RETRY_SLEEP_TIME = 1000;
    private static final int NUM_RETRIES = 2;
    private static String TAG = "HttpInvoker";
    private static DefaultHttpClient client;
    private static ThreadSafeClientConnManager connectionManager;
    private static boolean directIp = true;
    private static boolean isInited = false;
    private static OpEventListener opEventListener = null;
    private static Header sDefaultHeaders[] = null;
    public static com.alibaba.akita.app.BaseApplication.h sOnLowMemory;
    private static TrackListener trackListener = null;

    public HttpInvoker()
    {
    }

    public static ConnectResult get(ConnectUrl connecturl, String s)
        throws if, ie
    {
        throw new Runtime("d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.provideAs(TypeTransformer.java:780)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.enexpr(TypeTransformer.java:659)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:719)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.enexpr(TypeTransformer.java:698)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:719)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.s1stmt(TypeTransformer.java:810)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.sxStmt(TypeTransformer.java:840)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:206)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n");
    }

    public static ConnectResult get(ConnectUrl connecturl, Header aheader[], String s)
        throws if, ie
    {
        String s1;
        Object obj1;
        lw.e(TAG, (new StringBuilder()).append("get:").append(connecturl.url).append(" ip:").append(connecturl.ip).toString(), new Object[0]);
        s1 = connecturl.url;
        obj1 = "0";
        long l1 = System.currentTimeMillis();
        if (!connecturl.aliDomain || connecturl.ip == null || !directIp || hz.a().c().g()) goto _L2; else goto _L1
_L1:
        Object obj = connecturl.url.replace("api.aliexpress.com", connecturl.ip);
        int k;
        k = 1;
        s1 = ((String) (obj));
_L23:
        int i;
        obj = new HttpGet(s1);
        i = connecturl.url.length();
        int j = i;
        if (aheader == null) goto _L4; else goto _L3
_L3:
        int i1 = aheader.length;
        int l = 0;
_L24:
        j = i;
        if (l >= i1) goto _L4; else goto _L5
_L5:
        Header header = aheader[l];
        ((HttpGet) (obj)).addHeader(header);
        lw.e(TAG, (new StringBuilder()).append(header.getName()).append("=").append(header.getValue()).toString(), new Object[0]);
        j = i;
        if (header.getName() == null) goto _L7; else goto _L6
_L6:
        j = i;
        if (header.getValue() != null)
        {
            j = i + header.getName().length() + header.getValue().length();
        }
          goto _L7
_L4:
        if (k == 0)
        {
            break MISSING_BLOCK_LABEL_290;
        }
        ((HttpGet) (obj)).addHeader("Host", "api.aliexpress.com");
        if (connecturl.aliDomain || hz.a().c().b()) goto _L9; else goto _L8
_L8:
        obj = client.execute(((org.apache.http.client.methods.HttpUriRequest) (obj)));
        i = ((HttpResponse) (obj)).getStatusLine().getStatusCode();
        aheader = ((Header []) (obj1));
          goto _L10
_L25:
        obj = ((HttpResponse) (obj)).getEntity();
        if (obj != null) goto _L12; else goto _L11
_L11:
        obj = null;
_L22:
        l1 = System.currentTimeMillis() - l1;
        if (connecturl.aliDomain)
        {
            HttpItemCache.addToCache(aheader, l1, i);
        }
        if (trackListener == null || s == null) goto _L14; else goto _L13
_L13:
        if (!connecturl.aliDomain) goto _L14; else goto _L15
_L15:
        if (obj == null) goto _L17; else goto _L16
_L16:
        if (((String) (obj)).length() <= 0 || ((String) (obj)).getBytes() == null || l1 <= 0L) goto _L17; else goto _L18
_L18:
        double d;
        i = ((String) (obj)).getBytes().length;
        d = (int)(((double)i / (double)l1) * 1000D);
          goto _L19
_L27:
        trackListener.networkProfile(connecturl.getApi("0"), "0", "0", (new StringBuilder()).append(l1).append("").toString(), "true", s, (new StringBuilder()).append(d).append("").toString(), (new StringBuilder()).append(j).append("").toString(), (new StringBuilder()).append(i).append("").toString(), "0", "httpget", ((String) (obj1)), "0", connecturl.ssl, connecturl.ip);
_L14:
        lw.a(TAG, "response:", ((String) (obj)));
        return new ConnectResult(((String) (obj)), connecturl.ip, 0);
_L9:
        aheader = HttpItemCache.setRequestId(((HttpRequest) (obj)));
        CommonHeaderUtil.addCommonHeader(((org.apache.http.client.methods.HttpUriRequest) (obj)));
        obj1 = ((HttpGet) (obj)).getAllHeaders();
        lw.e(TAG, "Headers:========================", new Object[0]);
        k = obj1.length;
        i = 0;
_L21:
        if (i >= k)
        {
            break; /* Loop/switch isn't completed */
        }
        header = obj1[i];
        lw.e(TAG, (new StringBuilder()).append(header.getName()).append(":").append(header.getValue()).toString(), new Object[0]);
        i++;
        if (true) goto _L21; else goto _L20
_L20:
        lw.e(TAG, "Headers end:=====================", new Object[0]);
        obj = client.execute(((org.apache.http.client.methods.HttpUriRequest) (obj)));
        i = ((HttpResponse) (obj)).getStatusLine().getStatusCode();
          goto _L10
_L12:
        obj = EntityUtils.toString(((org.apache.http.HttpEntity) (obj)), CHARSET);
          goto _L22
_L26:
        try
        {
            aheader = ((HttpResponse) (obj)).getEntity();
            if (((HttpResponse) (obj)).getStatusLine().getStatusCode() == 401)
            {
                trackUserTokenIsInvalidEvent(connecturl.url);
            }
            throw new if(((HttpResponse) (obj)).getStatusLine().getStatusCode(), EntityUtils.toString(aheader, CHARSET), connecturl.url);
        }
        // Misplaced declaration of an exception variable
        catch (Header aheader[])
        {
            lw.a(TAG, aheader, new Object[0]);
            if (connecturl.lastIp)
            {
                if (opEventListener != null)
                {
                    opEventListener.onEvent("dnsForceRefreash");
                }
                throw new ie(1000, aheader.toString(), aheader, connecturl.url);
            } else
            {
                return new ConnectResult(null, connecturl.ip, -1);
            }
        }
        // Misplaced declaration of an exception variable
        catch (Header aheader[])
        {
            lw.a(TAG, aheader, new Object[0]);
            if (connecturl.lastIp)
            {
                if (opEventListener != null)
                {
                    opEventListener.onEvent("dnsForceRefreash");
                }
                throw new ie(1000, aheader.toString(), aheader, connecturl.url);
            } else
            {
                return new ConnectResult(null, connecturl.ip, -1);
            }
        }
        // Misplaced declaration of an exception variable
        catch (Header aheader[])
        {
            lw.a(TAG, aheader, new Object[0]);
            if (connecturl.lastIp)
            {
                if (opEventListener != null)
                {
                    opEventListener.onEvent("dnsForceRefreash");
                }
                throw new ie(1000, aheader.toString(), aheader, connecturl.url);
            } else
            {
                return new ConnectResult(null, connecturl.ip, -1);
            }
        }
        // Misplaced declaration of an exception variable
        catch (Header aheader[])
        {
            lw.a(TAG, aheader, new Object[0]);
            if (connecturl.lastIp)
            {
                if (opEventListener != null)
                {
                    opEventListener.onEvent("dnsForceRefreash");
                }
                throw new ie(1000, aheader.toString(), aheader, connecturl.url);
            } else
            {
                return new ConnectResult(null, connecturl.ip, -1);
            }
        }
        // Misplaced declaration of an exception variable
        catch (Header aheader[])
        {
            lw.a(TAG, aheader.toString(), aheader, new Object[0]);
            throw new ie(1001, aheader.toString(), aheader, connecturl.url);
        }
        // Misplaced declaration of an exception variable
        catch (Header aheader[])
        {
            lw.a(TAG, aheader.toString(), aheader, new Object[0]);
            throw new ie(1000, aheader.toString(), aheader, connecturl.url);
        }
        // Misplaced declaration of an exception variable
        catch (ConnectUrl connecturl) { }
        break MISSING_BLOCK_LABEL_1170;
        connecturl;
        lw.a(TAG, connecturl, new Object[0]);
        if (connecturl instanceof if)
        {
            throw (if)connecturl;
        } else
        {
            throw new ie(1000, connecturl.toString(), connecturl, s1);
        }
_L17:
        i = 0;
        d = 0.0D;
          goto _L19
_L2:
        k = 0;
          goto _L23
_L7:
        l++;
        i = j;
          goto _L24
_L10:
        if (i != 200 && i != 201 && i != 202) goto _L26; else goto _L25
_L19:
        obj1 = aheader;
        if (aheader == null)
        {
            obj1 = "0";
        }
          goto _L27
    }

    private static Header[] getHeaders()
    {
        throw new Runtime("d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.provideAs(TypeTransformer.java:780)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.enexpr(TypeTransformer.java:659)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:719)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.enexpr(TypeTransformer.java:698)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:719)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.s1stmt(TypeTransformer.java:810)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.sxStmt(TypeTransformer.java:840)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:206)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n");
    }

    private static String getRetString(HttpResponse httpresponse)
        throws ParseException, IOException
    {
        throw new Runtime("d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.provideAs(TypeTransformer.java:780)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.enexpr(TypeTransformer.java:659)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:719)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.enexpr(TypeTransformer.java:698)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:719)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.s1stmt(TypeTransformer.java:810)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.sxStmt(TypeTransformer.java:840)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:206)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n");
    }

    public static void init(Header aheader[], com.alibaba.akita.app.BaseApplication.h h)
    {
        throw new Runtime("d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.provideAs(TypeTransformer.java:780)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.enexpr(TypeTransformer.java:659)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:719)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.enexpr(TypeTransformer.java:698)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:719)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.s1stmt(TypeTransformer.java:810)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.sxStmt(TypeTransformer.java:840)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:206)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n");
    }

    public static void opEventListener(OpEventListener opeventlistener)
    {
        throw new Runtime("d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.provideAs(TypeTransformer.java:780)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.enexpr(TypeTransformer.java:659)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:719)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.enexpr(TypeTransformer.java:698)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:719)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.s1stmt(TypeTransformer.java:810)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.sxStmt(TypeTransformer.java:840)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:206)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n");
    }

    public static ConnectResult post(ConnectUrl connecturl, ArrayList arraylist, String s)
        throws ie, if
    {
        throw new Runtime("d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.provideAs(TypeTransformer.java:780)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.enexpr(TypeTransformer.java:659)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:719)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.enexpr(TypeTransformer.java:698)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:719)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.s1stmt(TypeTransformer.java:810)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.sxStmt(TypeTransformer.java:840)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:206)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n");
    }

    public static ConnectResult post(ConnectUrl connecturl, ArrayList arraylist, Header aheader[], String s)
        throws ie, if
    {
        Object obj1;
        int k;
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
        int i = 0;
        String s1 = connecturl.url;
        double d;
        Object obj;
        Object obj2;
        Object obj3;
        Header aheader1[];
        Header header;
        int j;
        boolean flag;
        int l;
        long l1;
        long l2;
        long l3;
        if (connecturl.aliDomain && connecturl.ip != null && directIp && !hz.a().c().g())
        {
            s1 = connecturl.url.replace("api.aliexpress.com", connecturl.ip);
            flag = true;
            j = 0;
            obj = null;
        } else
        {
            flag = false;
            j = 0;
            obj = null;
        }
        obj1 = obj;
        if (j >= 3) goto _L2; else goto _L1
_L1:
        l1 = System.currentTimeMillis();
        obj1 = "0";
        obj2 = new HttpPost(s1);
        if (aheader == null) goto _L4; else goto _L3
_L3:
        l = aheader.length;
        k = 0;
_L5:
        if (k >= l)
        {
            break; /* Loop/switch isn't completed */
        }
        obj3 = aheader[k];
        ((HttpPost) (obj2)).addHeader(((Header) (obj3)));
        lw.e(TAG, (new StringBuilder()).append(((Header) (obj3)).getName()).append("=").append(((Header) (obj3)).getValue()).toString(), new Object[0]);
        k++;
        if (true) goto _L5; else goto _L4
_L4:
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_347;
        }
        ((HttpPost) (obj2)).addHeader("Host", "api.aliexpress.com");
        obj3 = new UrlEncodedFormEntity(arraylist, CHARSET);
        ((HttpPost) (obj2)).setEntity(((org.apache.http.HttpEntity) (obj3)));
        if (obj3 == null)
        {
            break MISSING_BLOCK_LABEL_404;
        }
        if (connecturl.url == null)
        {
            break MISSING_BLOCK_LABEL_404;
        }
        l2 = connecturl.url.length();
        l3 = ((UrlEncodedFormEntity) (obj3)).getContentLength();
        i = (int)(l2 + l3);
        if (connecturl.aliDomain || hz.a().c().b()) goto _L7; else goto _L6
_L6:
        obj2 = client.execute(((org.apache.http.client.methods.HttpUriRequest) (obj2)));
        k = ((HttpResponse) (obj2)).getStatusLine().getStatusCode();
          goto _L8
_L19:
        obj2 = getRetString(((HttpResponse) (obj2)));
        obj = obj2;
        l1 = System.currentTimeMillis() - l1;
        if (connecturl.aliDomain)
        {
            HttpItemCache.addToCache(((String) (obj1)), l1, k);
        }
        if (trackListener == null || s == null) goto _L10; else goto _L9
_L9:
        if (!connecturl.aliDomain) goto _L10; else goto _L11
_L11:
        if (obj == null) goto _L13; else goto _L12
_L12:
        if (((String) (obj)).length() <= 0 || ((String) (obj)).getBytes() == null || l1 <= 0L) goto _L13; else goto _L14
_L14:
        k = ((String) (obj)).getBytes().length;
        d = (int)(((double)k / (double)l1) * 1000D);
          goto _L15
_L22:
        trackListener.networkProfile(SpdyUtil.getApi(connecturl.url, "0"), "0", "0", (new StringBuilder()).append(l1).append("").toString(), "true", s, (new StringBuilder()).append(d).append("").toString(), (new StringBuilder()).append(i).append("").toString(), (new StringBuilder()).append(k).append("").toString(), "0", "httppost", ((String) (obj1)), "0", connecturl.ssl, connecturl.ip);
_L10:
        obj1 = obj;
_L2:
        lw.a(TAG, "response:", ((String) (obj1)));
        return new ConnectResult(((String) (obj1)), connecturl.ip, 0);
_L7:
        obj1 = HttpItemCache.setRequestId(((HttpRequest) (obj2)));
        CommonHeaderUtil.addCommonHeader(((org.apache.http.client.methods.HttpUriRequest) (obj2)));
        aheader1 = ((HttpPost) (obj2)).getAllHeaders();
        lw.e(TAG, "Headers:========================", new Object[0]);
        l = aheader1.length;
        k = 0;
_L17:
        if (k >= l)
        {
            break; /* Loop/switch isn't completed */
        }
        header = aheader1[k];
        lw.e(TAG, (new StringBuilder()).append(header.getName()).append(":").append(header.getValue()).toString(), new Object[0]);
        k++;
        if (true) goto _L17; else goto _L16
_L16:
        lw.e(TAG, "Headers end:=====================", new Object[0]);
        obj2 = client.execute(((org.apache.http.client.methods.HttpUriRequest) (obj2)));
        k = ((HttpResponse) (obj2)).getStatusLine().getStatusCode();
          goto _L8
_L20:
        try
        {
            if (connecturl.aliDomain)
            {
                HttpItemCache.addToCache(((String) (obj1)), System.currentTimeMillis() - l1, k);
            }
            if (((HttpResponse) (obj2)).getStatusLine().getStatusCode() == 401)
            {
                trackUserTokenIsInvalidEvent(connecturl.url);
            }
            throw new if(((HttpResponse) (obj2)).getStatusLine().getStatusCode(), getRetString(((HttpResponse) (obj2))), connecturl.url);
        }
        // Misplaced declaration of an exception variable
        catch (ArrayList arraylist)
        {
            lw.a(TAG, arraylist, new Object[0]);
            if (connecturl.lastIp)
            {
                if (opEventListener != null)
                {
                    opEventListener.onEvent("dnsForceRefreash");
                }
                throw new ie(1000, arraylist.toString(), arraylist, connecturl.url);
            } else
            {
                return new ConnectResult(null, connecturl.ip, -1);
            }
        }
        // Misplaced declaration of an exception variable
        catch (ArrayList arraylist)
        {
            lw.a(TAG, arraylist, new Object[0]);
            if (connecturl.lastIp)
            {
                if (opEventListener != null)
                {
                    opEventListener.onEvent("dnsForceRefreash");
                }
                throw new ie(1000, arraylist.toString(), arraylist, connecturl.url);
            } else
            {
                return new ConnectResult(null, connecturl.ip, -1);
            }
        }
        // Misplaced declaration of an exception variable
        catch (ArrayList arraylist)
        {
            lw.a(TAG, arraylist, new Object[0]);
            if (connecturl.lastIp)
            {
                if (opEventListener != null)
                {
                    opEventListener.onEvent("dnsForceRefreash");
                }
                throw new ie(1000, arraylist.toString(), arraylist, connecturl.url);
            } else
            {
                return new ConnectResult(null, connecturl.ip, -1);
            }
        }
        // Misplaced declaration of an exception variable
        catch (ArrayList arraylist)
        {
            lw.a(TAG, arraylist, new Object[0]);
            if (connecturl.lastIp)
            {
                if (opEventListener != null)
                {
                    opEventListener.onEvent("dnsForceRefreash");
                }
                throw new ie(1000, arraylist.toString(), arraylist, connecturl.url);
            } else
            {
                return new ConnectResult(null, connecturl.ip, -1);
            }
        }
        // Misplaced declaration of an exception variable
        catch (ArrayList arraylist)
        {
            lw.a(TAG, arraylist, new Object[0]);
            throw new ie(1001, arraylist.toString(), arraylist, connecturl.url);
        }
        // Misplaced declaration of an exception variable
        catch (ArrayList arraylist)
        {
            lw.a(TAG, arraylist, new Object[0]);
            throw new ie(1001, arraylist.toString(), arraylist, connecturl.url);
        }
        // Misplaced declaration of an exception variable
        catch (ArrayList arraylist)
        {
            lw.a(TAG, arraylist, new Object[0]);
            throw new ie(1000, arraylist.toString(), arraylist, connecturl.url);
        }
        // Misplaced declaration of an exception variable
        catch (ArrayList arraylist)
        {
            lw.a(TAG, arraylist, new Object[0]);
            throw new ie(1003, arraylist.toString(), arraylist, connecturl.url);
        }
        // Misplaced declaration of an exception variable
        catch (Object obj1) { }
        // Misplaced declaration of an exception variable
        catch (ConnectUrl connecturl)
        {
            lw.a(TAG, connecturl, new Object[0]);
            if (connecturl instanceof if)
            {
                throw (if)connecturl;
            } else
            {
                throw new ie(1000, connecturl.toString(), connecturl, s1);
            }
        }
        break MISSING_BLOCK_LABEL_1341;
        obj1;
_L18:
        lw.a(TAG, ((Throwable) (obj1)), new Object[0]);
        if (sOnLowMemory != null)
        {
            sOnLowMemory.onLowMemory();
        }
        try
        {
            Thread.sleep(200L);
        }
        // Misplaced declaration of an exception variable
        catch (Object obj1) { }
        j++;
        break MISSING_BLOCK_LABEL_218;
        obj1;
        if (true) goto _L18; else goto _L13
_L13:
        k = 0;
        d = 0.0D;
          goto _L15
_L8:
        if (k != 200 && k != 201 && k != 202) goto _L20; else goto _L19
_L15:
        if (obj1 != null) goto _L22; else goto _L21
_L21:
        obj1 = "0";
          goto _L22
    }

    public static String postWithFilesUsingURLConnection(String s, ArrayList arraylist, Map map)
        throws ie
    {
        HttpURLConnection httpurlconnection;
        Object obj;
        Object obj1;
        int i;
        i = 0;
        try
        {
            obj = UUID.randomUUID().toString();
            httpurlconnection = (HttpURLConnection)(new URL(s)).openConnection();
            httpurlconnection.setReadTimeout(60000);
            httpurlconnection.setDoInput(true);
            httpurlconnection.setDoOutput(true);
            httpurlconnection.setUseCaches(false);
            httpurlconnection.setRequestMethod("POST");
            httpurlconnection.setRequestProperty("connection", "keep-alive");
            httpurlconnection.setRequestProperty("Charsert", "UTF-8");
            httpurlconnection.setRequestProperty("Content-Type", (new StringBuilder()).append("multipart/form-data").append(";boundary=").append(((String) (obj))).toString());
            obj1 = new StringBuilder();
            for (arraylist = arraylist.iterator(); arraylist.hasNext(); ((StringBuilder) (obj1)).append("\r\n"))
            {
                NameValuePair namevaluepair = (NameValuePair)arraylist.next();
                ((StringBuilder) (obj1)).append("--");
                ((StringBuilder) (obj1)).append(((String) (obj)));
                ((StringBuilder) (obj1)).append("\r\n");
                ((StringBuilder) (obj1)).append((new StringBuilder()).append("Content-Disposition: form-data; name=\"").append(namevaluepair.getName()).append("\"").append("\r\n").toString());
                ((StringBuilder) (obj1)).append((new StringBuilder()).append("Content-Type: text/plain; charset=").append("UTF-8").append("\r\n").toString());
                ((StringBuilder) (obj1)).append((new StringBuilder()).append("Content-Transfer-Encoding: 8bit").append("\r\n").toString());
                ((StringBuilder) (obj1)).append("\r\n");
                ((StringBuilder) (obj1)).append(namevaluepair.getValue());
            }

        }
        // Misplaced declaration of an exception variable
        catch (ArrayList arraylist)
        {
            throw new ie(1005, "IO Exception", arraylist, s);
        }
        arraylist = new DataOutputStream(httpurlconnection.getOutputStream());
        arraylist.write(((StringBuilder) (obj1)).toString().getBytes());
        if (map == null)
        {
            break MISSING_BLOCK_LABEL_662;
        }
        map = map.entrySet().iterator();
_L1:
        if (!map.hasNext())
        {
            break MISSING_BLOCK_LABEL_662;
        }
        obj1 = (java.util.Map.Entry)map.next();
        i++;
        if (((java.util.Map.Entry) (obj1)).getKey() != null && ((java.util.Map.Entry) (obj1)).getValue() != null) goto _L2; else goto _L1
_L2:
        byte abyte0[];
        if (!((File)((java.util.Map.Entry) (obj1)).getValue()).exists())
        {
            throw new ie(1008, "The file to upload is not found.", s);
        }
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append("--");
        stringbuilder.append(((String) (obj)));
        stringbuilder.append("\r\n");
        stringbuilder.append((new StringBuilder()).append("Content-Disposition: form-data; name=\"file").append(i).append("\"; filename=\"").append((String)((java.util.Map.Entry) (obj1)).getKey()).append("\"").append("\r\n").toString());
        stringbuilder.append((new StringBuilder()).append("Content-Type: application/octet-stream; charset=").append("UTF-8").append("\r\n").toString());
        stringbuilder.append("\r\n");
        arraylist.write(stringbuilder.toString().getBytes());
        obj1 = new FileInputStream((File)((java.util.Map.Entry) (obj1)).getValue());
        abyte0 = new byte[1024];
_L3:
        int j = ((InputStream) (obj1)).read(abyte0);
        if (j == -1)
        {
            break MISSING_BLOCK_LABEL_644;
        }
        arraylist.write(abyte0, 0, j);
          goto _L3
        ((InputStream) (obj1)).close();
        arraylist.write("\r\n".getBytes());
          goto _L1
        arraylist.write((new StringBuilder()).append("--").append(((String) (obj))).append("--").append("\r\n").toString().getBytes());
        arraylist.flush();
        i = httpurlconnection.getResponseCode();
        obj = httpurlconnection.getInputStream();
        map = new StringBuilder();
        if (i != 200)
        {
            break MISSING_BLOCK_LABEL_804;
        }
        obj = new BufferedReader(new InputStreamReader(((InputStream) (obj)), "utf-8"), 8192);
_L4:
        obj1 = ((BufferedReader) (obj)).readLine();
        if (obj1 == null)
        {
            break MISSING_BLOCK_LABEL_799;
        }
        map.append((new StringBuilder()).append(((String) (obj1))).append("\n").toString());
          goto _L4
        ((BufferedReader) (obj)).close();
        arraylist.close();
        httpurlconnection.disconnect();
        arraylist = map.toString();
        return arraylist;
    }

    public static String postWithImgFileUsingURLConnection(String s, ArrayList arraylist, Map map)
        throws ie
    {
        throw new Runtime("d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.provideAs(TypeTransformer.java:780)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.enexpr(TypeTransformer.java:659)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:719)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.enexpr(TypeTransformer.java:698)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:719)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.s1stmt(TypeTransformer.java:810)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.sxStmt(TypeTransformer.java:840)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:206)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n");
    }

    private static byte[] retrieveImageData(InputStream inputstream, int i, ProgressBar progressbar)
        throws IOException
    {
        throw new Runtime("d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.provideAs(TypeTransformer.java:780)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.enexpr(TypeTransformer.java:659)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:719)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.enexpr(TypeTransformer.java:698)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:719)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.s1stmt(TypeTransformer.java:810)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.sxStmt(TypeTransformer.java:840)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:206)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n");
    }

    public static void setConfig(boolean flag)
    {
        throw new Runtime("d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.provideAs(TypeTransformer.java:780)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.enexpr(TypeTransformer.java:659)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:719)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.enexpr(TypeTransformer.java:698)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:719)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.s1stmt(TypeTransformer.java:810)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.sxStmt(TypeTransformer.java:840)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:206)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n");
    }

    public static void setTrackListener(TrackListener tracklistener)
    {
        throw new Runtime("d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.provideAs(TypeTransformer.java:780)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.enexpr(TypeTransformer.java:659)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:719)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.enexpr(TypeTransformer.java:698)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:719)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.s1stmt(TypeTransformer.java:810)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.sxStmt(TypeTransformer.java:840)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:206)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n");
    }

    private static void trackUserTokenIsInvalidEvent(String s)
    {
        throw new Runtime("d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.provideAs(TypeTransformer.java:780)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.enexpr(TypeTransformer.java:659)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:719)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.enexpr(TypeTransformer.java:698)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:719)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.s1stmt(TypeTransformer.java:810)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.sxStmt(TypeTransformer.java:840)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:206)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n");
    }


    // Unreferenced inner class com/alibaba/akita/net/io/HttpInvoker$1

/* anonymous class */
    static final class _cls1
        implements HttpRequestInterceptor
    {

        public void process(HttpRequest httprequest, HttpContext httpcontext)
            throws HttpException, IOException
        {
            throw new Runtime("d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.provideAs(TypeTransformer.java:780)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.enexpr(TypeTransformer.java:659)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:719)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.enexpr(TypeTransformer.java:698)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:719)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.s1stmt(TypeTransformer.java:810)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.sxStmt(TypeTransformer.java:840)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:206)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n");
        }

    }


    // Unreferenced inner class com/alibaba/akita/net/io/HttpInvoker$2

/* anonymous class */
    static final class _cls2
        implements HttpResponseInterceptor
    {

        public void process(HttpResponse httpresponse, HttpContext httpcontext)
            throws HttpException, IOException
        {
            throw new Runtime("d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.provideAs(TypeTransformer.java:780)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.enexpr(TypeTransformer.java:659)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:719)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.enexpr(TypeTransformer.java:698)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:719)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.s1stmt(TypeTransformer.java:810)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.sxStmt(TypeTransformer.java:840)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:206)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n");
        }

    }

}
