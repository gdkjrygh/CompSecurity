// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.microsoft.applications.telemetry.http;

import android.util.Log;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import org.apache.http.Header;
import org.apache.http.HttpEntity;
import org.apache.http.HttpHost;
import org.apache.http.HttpRequest;
import org.apache.http.HttpResponse;
import org.apache.http.StatusLine;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.conn.ClientConnectionManager;
import org.apache.http.conn.scheme.Scheme;
import org.apache.http.conn.scheme.SchemeRegistry;
import org.apache.http.entity.BasicHttpEntity;
import org.apache.http.message.BasicHttpEntityEnclosingRequest;
import org.apache.http.protocol.BasicHttpContext;
import org.apache.http.protocol.HttpContext;
import org.apache.http.util.EntityUtils;

// Referenced classes of package com.microsoft.applications.telemetry.http:
//            HttpStack, ConnectionConfig

public class WrappedHttpRequest
{
    private static final class ErrorCode extends Enum
    {

        private static final ErrorCode $VALUES[];
        public static final ErrorCode ABORTED;
        public static final ErrorCode ERROR;
        public static final ErrorCode OK;
        private final int status;

        public static ErrorCode valueOf(String s)
        {
            return (ErrorCode)Enum.valueOf(com/microsoft/applications/telemetry/http/WrappedHttpRequest$ErrorCode, s);
        }

        public static ErrorCode[] values()
        {
            return (ErrorCode[])$VALUES.clone();
        }

        public final int getValue()
        {
            return status;
        }

        static 
        {
            OK = new ErrorCode("OK", 0, 0);
            ERROR = new ErrorCode("ERROR", 1, -1);
            ABORTED = new ErrorCode("ABORTED", 2, -2);
            $VALUES = (new ErrorCode[] {
                OK, ERROR, ABORTED
            });
        }

        private ErrorCode(String s, int i, int j)
        {
            super(s, i);
            status = j;
        }
    }

    private class SendRequestTask
        implements Runnable
    {

        private long contentLength;
        private byte data[];
        private String headerNames[];
        private String headerValues[];
        private Header headers[];
        final BasicHttpEntityEnclosingRequest request;
        private HttpResponse response;
        private int statusCode;
        final WrappedHttpRequest this$0;

        public void run()
        {
            HttpHost httphost;
            WrappedHttpRequest.LOG_TAG;
            response = null;
            httpContext = new BasicHttpContext();
            String s;
            int i;
            int k;
            if (uri.getScheme() == null)
            {
                s = "http";
            } else
            {
                s = uri.getScheme();
            }
            k = uri.getPort();
            i = k;
            if (k < 0)
            {
                i = httpClient.getConnectionManager().getSchemeRegistry().getScheme(s).getDefaultPort();
            }
            httphost = new HttpHost(uri.getHost(), i, uri.getScheme());
            WrappedHttpRequest.LOG_TAG;
            String.format("Send url:%s|port:%d|scheme:%s", new Object[] {
                uri.toASCIIString(), Integer.valueOf(i), s
            });
            if (!Thread.interrupted()) goto _L2; else goto _L1
_L1:
            return;
_L2:
            UnsatisfiedLinkError unsatisfiedlinkerror;
            try
            {
                response = httpClient.execute(httphost, request, httpContext);
            }
            catch (ClientProtocolException clientprotocolexception)
            {
                Log.e(WrappedHttpRequest.LOG_TAG, (new StringBuilder("Exception while sending http request ")).append(clientprotocolexception.getMessage()).toString());
            }
            catch (IOException ioexception)
            {
                Log.e(WrappedHttpRequest.LOG_TAG, (new StringBuilder("Exception while sending http request ")).append(ioexception.getMessage()).toString());
            }
            if (Thread.interrupted())
            {
                continue; /* Loop/switch isn't completed */
            }
            WrappedHttpRequest.LOG_TAG;
            if (response != null)
            {
                break; /* Loop/switch isn't completed */
            }
            Log.e(WrappedHttpRequest.LOG_TAG, String.format("Could not connect to url: %s", new Object[] {
                uri.toASCIIString()
            }));
_L4:
            if (!Thread.interrupted())
            {
                try
                {
                    WrappedHttpRequest.LOG_TAG;
                    String.format("Native response callback with mCallback:0x%x|contentLength:%d|statusCode:%d", new Object[] {
                        Long.valueOf(mCallback), Long.valueOf(contentLength), Integer.valueOf(statusCode)
                    });
                    nativeResponseCallback(mCallback, contentLength, statusCode, data, headerNames, headerValues);
                    return;
                }
                // Misplaced declaration of an exception variable
                catch (UnsatisfiedLinkError unsatisfiedlinkerror)
                {
                    Log.e(WrappedHttpRequest.LOG_TAG, (new StringBuilder("Could not locate native method: ")).append(unsatisfiedlinkerror.getMessage()).toString());
                }
                return;
            }
            if (true) goto _L1; else goto _L3
_L3:
            Object obj;
            obj = response.getStatusLine();
            headers = response.getAllHeaders();
            headerNames = new String[headers.length];
            headerValues = new String[headers.length];
            for (int j = 0; j < headers.length; j++)
            {
                headerNames[j] = headers[j].getName();
                headerValues[j] = headers[j].getValue();
            }

            statusCode = response.getStatusLine().getStatusCode();
            WrappedHttpRequest.LOG_TAG;
            String.format("status:%d|reason:%s", new Object[] {
                Integer.valueOf(statusCode), ((StatusLine) (obj)).getReasonPhrase()
            });
            obj = response.getEntity();
            if (obj == null)
            {
                break MISSING_BLOCK_LABEL_642;
            }
            data = EntityUtils.toByteArray(((HttpEntity) (obj)));
            contentLength = data.length;
            WrappedHttpRequest.LOG_TAG;
            String.format("ResponseEntity|contentLength:%d|data length:%d", new Object[] {
                Long.valueOf(((HttpEntity) (obj)).getContentLength()), Integer.valueOf(data.length)
            });
            if (obj != null)
            {
                try
                {
                    ((HttpEntity) (obj)).consumeContent();
                }
                // Misplaced declaration of an exception variable
                catch (Object obj)
                {
                    Log.w(WrappedHttpRequest.LOG_TAG, "Failed closing response input stream");
                }
            }
              goto _L4
            Object obj1;
            obj1;
            Log.e(WrappedHttpRequest.LOG_TAG, String.format("Error reading content from response|contentLength:%d|statusCode:%d", new Object[] {
                Long.valueOf(((HttpEntity) (obj)).getContentLength()), Integer.valueOf(statusCode)
            }));
            if (obj != null)
            {
                try
                {
                    ((HttpEntity) (obj)).consumeContent();
                }
                // Misplaced declaration of an exception variable
                catch (Object obj)
                {
                    Log.w(WrappedHttpRequest.LOG_TAG, "Failed closing response input stream");
                }
            }
              goto _L4
            obj1;
            if (obj != null)
            {
                try
                {
                    ((HttpEntity) (obj)).consumeContent();
                }
                catch (IOException ioexception1)
                {
                    Log.w(WrappedHttpRequest.LOG_TAG, "Failed closing response input stream");
                }
            }
            throw obj1;
        }

        public SendRequestTask(BasicHttpEntityEnclosingRequest basichttpentityenclosingrequest)
        {
            this$0 = WrappedHttpRequest.this;
            super();
            headers = null;
            headerNames = null;
            headerValues = null;
            data = null;
            contentLength = 0L;
            statusCode = ErrorCode.ERROR.getValue();
            request = basichttpentityenclosingrequest;
        }
    }


    private static final String LOG_TAG = com/microsoft/applications/telemetry/http/WrappedHttpRequest.getSimpleName();
    private HttpClient httpClient;
    private HttpContext httpContext;
    private long mCallback;
    private BasicHttpEntityEnclosingRequest requestObj;
    private Thread sendTask;
    private final HttpStack stack;
    private URI uri;

    protected WrappedHttpRequest(HttpStack httpstack, long l)
    {
        stack = httpstack;
        mCallback = l;
    }

    private boolean hasRequest()
    {
        return requestObj != null;
    }

    private native void nativeResponseCallback(long l, long l1, int i, byte abyte0[], String as[], 
            String as1[]);

    protected final int abortRequest()
    {
        this;
        JVM INSTR monitorenter ;
        if (sendTask == null) goto _L2; else goto _L1
_L1:
        int i;
        sendTask.interrupt();
        i = ErrorCode.OK.getValue();
_L4:
        this;
        JVM INSTR monitorexit ;
        return i;
_L2:
        if (!hasRequest())
        {
            Log.e(LOG_TAG, "Cannot abort a request without opening one first!");
        }
        i = ErrorCode.ERROR.getValue();
        if (true) goto _L4; else goto _L3
_L3:
        Exception exception;
        exception;
        throw exception;
    }

    protected final HttpRequest getRequestObject()
    {
        this;
        JVM INSTR monitorenter ;
        BasicHttpEntityEnclosingRequest basichttpentityenclosingrequest = requestObj;
        this;
        JVM INSTR monitorexit ;
        return basichttpentityenclosingrequest;
        Exception exception;
        exception;
        throw exception;
    }

    protected final int open(String s, String s1, ConnectionConfig connectionconfig)
    {
        this;
        JVM INSTR monitorenter ;
        if (connectionconfig != null) goto _L2; else goto _L1
_L1:
        httpClient = stack.httpClient;
_L5:
        String.format("Calling open with params method:%s|uriString:%s", new Object[] {
            s, s1
        });
        uri = new URI(s1);
        if (uri.getHost() != null) goto _L4; else goto _L3
_L3:
        int i;
        Log.e(LOG_TAG, "Host cannot be null");
        i = ErrorCode.ERROR.getValue();
_L6:
        this;
        JVM INSTR monitorexit ;
        return i;
_L2:
        httpClient = HttpStack.GetHttpClientFromConfig(connectionconfig);
          goto _L5
        s;
        throw s;
_L4:
        requestObj = new BasicHttpEntityEnclosingRequest(s, s1);
        i = ErrorCode.OK.getValue();
          goto _L6
        s;
        Log.e(LOG_TAG, (new StringBuilder("Invalid URI exception: ")).append(s1).toString());
        i = ErrorCode.ERROR.getValue();
          goto _L6
    }

    protected final int sendRequest(byte abyte0[], long l)
    {
        this;
        JVM INSTR monitorenter ;
        if (!hasRequest()) goto _L2; else goto _L1
_L1:
        BasicHttpEntity basichttpentity = new BasicHttpEntity();
        if (abyte0 == null)
        {
            break MISSING_BLOCK_LABEL_50;
        }
        basichttpentity.setContentLength(l);
        basichttpentity.setContent(new ByteArrayInputStream(abyte0));
        requestObj.setEntity(basichttpentity);
        int i;
        (new Thread(new SendRequestTask(requestObj))).start();
        i = ErrorCode.OK.getValue();
_L4:
        this;
        JVM INSTR monitorexit ;
        return i;
_L2:
        Log.e(LOG_TAG, "Cannot send without creating a request first");
        i = ErrorCode.ERROR.getValue();
        if (true) goto _L4; else goto _L3
_L3:
        abyte0;
        throw abyte0;
    }

    protected final int setHeader(String s, String s1, int i)
    {
        this;
        JVM INSTR monitorenter ;
        String.format("Calling addHeader with params name:%s|value:%s|mode:%s", new Object[] {
            s, s1, Integer.valueOf(i)
        });
        if (!hasRequest()) goto _L2; else goto _L1
_L1:
        if (!s.equalsIgnoreCase("Content-Length")) goto _L4; else goto _L3
_L3:
        Log.i(LOG_TAG, String.format("Ignoring header name:%s|value:%s", new Object[] {
            s, s1
        }));
        i = ErrorCode.OK.getValue();
_L11:
        this;
        JVM INSTR monitorexit ;
        return i;
_L4:
        if (i >= 0 && i <= 2)
        {
            break MISSING_BLOCK_LABEL_120;
        }
        Log.e(LOG_TAG, String.format("Invalid header mode %d. Valid modes are 0, 1, and 2", new Object[] {
            Integer.valueOf(i)
        }));
        i = ErrorCode.ERROR.getValue();
        continue; /* Loop/switch isn't completed */
        boolean flag = requestObj.containsHeader(s);
        if (i != 2 && flag) goto _L6; else goto _L5
_L5:
        requestObj.addHeader(s, s1);
_L9:
        i = ErrorCode.OK.getValue();
        continue; /* Loop/switch isn't completed */
_L6:
        if (i != 0 || !flag)
        {
            break; /* Loop/switch isn't completed */
        }
        int j;
        j = requestObj.getHeaders(s).length;
        requestObj.removeHeaders(s);
        i = 0;
_L8:
        if (i >= j)
        {
            break; /* Loop/switch isn't completed */
        }
        requestObj.addHeader(s, s1);
        i++;
        if (true) goto _L8; else goto _L7
_L7:
        if (true) goto _L9; else goto _L2
_L2:
        Log.e(LOG_TAG, "Cannot setHeader without creating a request first");
        i = ErrorCode.ERROR.getValue();
        if (true) goto _L11; else goto _L10
_L10:
        s;
        throw s;
    }





/*
    static HttpContext access$102(WrappedHttpRequest wrappedhttprequest, HttpContext httpcontext)
    {
        wrappedhttprequest.httpContext = httpcontext;
        return httpcontext;
    }

*/




}
