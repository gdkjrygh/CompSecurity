// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.hmobile.model;

import com.hmobile.common.Utils;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;
import org.apache.http.NoHttpResponseException;
import org.apache.http.StatusLine;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.HttpRequestRetryHandler;
import org.apache.http.client.HttpResponseException;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.conn.ConnectionKeepAliveStrategy;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.BasicResponseHandler;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.params.BasicHttpParams;
import org.apache.http.params.HttpParams;
import org.apache.http.protocol.HttpContext;

public class ServiceHelper
{
    public static final class RequestMethod extends Enum
    {

        private static final RequestMethod ENUM$VALUES[];
        public static final RequestMethod GET;
        public static final RequestMethod POST;

        public static RequestMethod valueOf(String s)
        {
            return (RequestMethod)Enum.valueOf(com/hmobile/model/ServiceHelper$RequestMethod, s);
        }

        public static RequestMethod[] values()
        {
            RequestMethod arequestmethod[] = ENUM$VALUES;
            int i = arequestmethod.length;
            RequestMethod arequestmethod1[] = new RequestMethod[i];
            System.arraycopy(arequestmethod, 0, arequestmethod1, 0, i);
            return arequestmethod1;
        }

        static 
        {
            GET = new RequestMethod("GET", 0);
            POST = new RequestMethod("POST", 1);
            ENUM$VALUES = (new RequestMethod[] {
                GET, POST
            });
        }

        private RequestMethod(String s, int i)
        {
            super(s, i);
        }
    }


    private static int REQUEST_TIMEOUT = 10000;
    private static volatile ServiceHelper _instance = null;
    String m_methodName;
    private HashMap m_params;

    public ServiceHelper()
    {
        m_methodName = null;
        m_params = new HashMap();
    }

    public static ServiceHelper Instance()
    {
        if (_instance != null) goto _L2; else goto _L1
_L1:
        com/hmobile/model/ServiceHelper;
        JVM INSTR monitorenter ;
        if (_instance == null)
        {
            _instance = new ServiceHelper();
        }
        com/hmobile/model/ServiceHelper;
        JVM INSTR monitorexit ;
_L2:
        return _instance;
        Exception exception;
        exception;
        com/hmobile/model/ServiceHelper;
        JVM INSTR monitorexit ;
        throw exception;
    }

    private String callService(String s, List list)
    {
        String s1;
        Object obj;
        s1 = "";
        obj = new DefaultHttpClient();
        s = new HttpPost(s);
        Iterator iterator;
        iterator = list.iterator();
        list = new ArrayList();
_L4:
        boolean flag = iterator.hasNext();
        if (flag) goto _L2; else goto _L1
_L1:
        Exception exception;
        NameValuePair namevaluepair;
        try
        {
            list = new StringEntity(Utils.Instance().join(list, "&").toString());
            s.setHeader("Content-Type", "application/x-www-form-urlencoded");
            s.setEntity(list);
            list = ((HttpClient) (obj)).execute(s);
            obj = new BasicResponseHandler();
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            s.printStackTrace();
            return "";
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            s.printStackTrace();
            return "";
        }
        s = s1;
        if (list == null)
        {
            break MISSING_BLOCK_LABEL_115;
        }
        s = ((BasicResponseHandler) (obj)).handleResponse(list);
        return s;
_L2:
        namevaluepair = (NameValuePair)iterator.next();
        list.add(String.format("%s=%s", new Object[] {
            namevaluepair.getName(), namevaluepair.getValue()
        }));
        continue; /* Loop/switch isn't completed */
        exception;
        exception.printStackTrace();
          goto _L1
        s;
        s.printStackTrace();
        return "";
        s;
        s.printStackTrace();
        return "";
        if (true) goto _L4; else goto _L3
_L3:
    }

    private DefaultHttpClient getHttpClient()
    {
        Object obj = new BasicHttpParams();
        ((HttpParams) (obj)).setParameter("http.connection.timeout", Integer.valueOf(REQUEST_TIMEOUT));
        obj = new DefaultHttpClient(((HttpParams) (obj)));
        ((DefaultHttpClient) (obj)).setHttpRequestRetryHandler(new HttpRequestRetryHandler() {

            final ServiceHelper this$0;

            public boolean retryRequest(IOException ioexception, int i, HttpContext httpcontext)
            {
                if (i < 2)
                {
                    if (ioexception instanceof NoHttpResponseException)
                    {
                        return true;
                    }
                    if (ioexception instanceof ClientProtocolException)
                    {
                        return true;
                    }
                }
                return false;
            }

            
            {
                this$0 = ServiceHelper.this;
                super();
            }
        });
        return ((DefaultHttpClient) (obj));
    }

    public void addParam(String s, Object obj)
    {
        m_params.put(s, obj);
    }

    public String call(String s)
    {
        StringBuilder stringbuilder;
        Object obj;
        stringbuilder = new StringBuilder();
        obj = new DefaultHttpClient();
        s = new HttpGet(s);
        ((DefaultHttpClient) (obj)).setKeepAliveStrategy(new ConnectionKeepAliveStrategy() {

            final ServiceHelper this$0;

            public long getKeepAliveDuration(HttpResponse httpresponse, HttpContext httpcontext)
            {
                return 0x30d40L;
            }

            
            {
                this$0 = ServiceHelper.this;
                super();
            }
        });
        s = ((DefaultHttpClient) (obj)).execute(s);
        Utils.LogInfo((new StringBuilder("RESPONSE FROM THE SERVER : ")).append(s.getStatusLine().getStatusCode()).toString());
        if (s.getStatusLine().getStatusCode() != 200) goto _L2; else goto _L1
_L1:
        s = new BufferedReader(new InputStreamReader(s.getEntity().getContent()));
_L4:
        obj = s.readLine();
        if (obj != null) goto _L3; else goto _L2
_L2:
        return stringbuilder.toString();
_L3:
        stringbuilder.append(((String) (obj)));
          goto _L4
        s;
        s.printStackTrace();
          goto _L2
        s;
        s.printStackTrace();
          goto _L2
    }

    public void setParams(HashMap hashmap)
    {
        m_params = hashmap;
    }

}
