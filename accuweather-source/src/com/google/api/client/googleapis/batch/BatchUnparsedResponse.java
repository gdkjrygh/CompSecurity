// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.api.client.googleapis.batch;

import com.google.api.client.http.BackOffPolicy;
import com.google.api.client.http.GenericUrl;
import com.google.api.client.http.HttpContent;
import com.google.api.client.http.HttpRequest;
import com.google.api.client.http.HttpRequestFactory;
import com.google.api.client.http.HttpResponse;
import com.google.api.client.http.HttpStatusCodes;
import com.google.api.client.http.HttpTransport;
import com.google.api.client.http.HttpUnsuccessfulResponseHandler;
import com.google.api.client.http.LowLevelHttpRequest;
import com.google.api.client.http.LowLevelHttpResponse;
import com.google.api.client.util.ByteStreams;
import com.google.api.client.util.ObjectParser;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.google.api.client.googleapis.batch:
//            BatchCallback

final class BatchUnparsedResponse
{
    private static class FakeLowLevelHttpRequest extends LowLevelHttpRequest
    {

        private List headerNames;
        private List headerValues;
        private InputStream partContent;
        private int statusCode;

        public void addHeader(String s, String s1)
        {
        }

        public LowLevelHttpResponse execute()
        {
            return new FakeLowLevelHttpResponse(partContent, statusCode, headerNames, headerValues);
        }

        FakeLowLevelHttpRequest(InputStream inputstream, int i, List list, List list1)
        {
            partContent = inputstream;
            statusCode = i;
            headerNames = list;
            headerValues = list1;
        }
    }

    private static class FakeLowLevelHttpResponse extends LowLevelHttpResponse
    {

        private List headerNames;
        private List headerValues;
        private InputStream partContent;
        private int statusCode;

        public InputStream getContent()
        {
            return partContent;
        }

        public String getContentEncoding()
        {
            return null;
        }

        public long getContentLength()
        {
            return 0L;
        }

        public String getContentType()
        {
            return null;
        }

        public int getHeaderCount()
        {
            return headerNames.size();
        }

        public String getHeaderName(int i)
        {
            return (String)headerNames.get(i);
        }

        public String getHeaderValue(int i)
        {
            return (String)headerValues.get(i);
        }

        public String getReasonPhrase()
        {
            return null;
        }

        public int getStatusCode()
        {
            return statusCode;
        }

        public String getStatusLine()
        {
            return null;
        }

        FakeLowLevelHttpResponse(InputStream inputstream, int i, List list, List list1)
        {
            headerNames = new ArrayList();
            headerValues = new ArrayList();
            partContent = inputstream;
            statusCode = i;
            headerNames = list;
            headerValues = list1;
        }
    }

    private static class FakeResponseHttpTransport extends HttpTransport
    {

        private List headerNames;
        private List headerValues;
        private InputStream partContent;
        private int statusCode;

        protected LowLevelHttpRequest buildRequest(String s, String s1)
        {
            return new FakeLowLevelHttpRequest(partContent, statusCode, headerNames, headerValues);
        }

        FakeResponseHttpTransport(int i, InputStream inputstream, List list, List list1)
        {
            statusCode = i;
            partContent = inputstream;
            headerNames = list;
            headerValues = list1;
        }
    }


    boolean backOffRequired;
    private final String boundary;
    private int contentId;
    boolean hasNext;
    private final InputStream inputStream;
    private final List requestInfos;
    private final boolean retryAllowed;
    List unsuccessfulRequestInfos;

    BatchUnparsedResponse(InputStream inputstream, String s, List list, boolean flag)
        throws IOException
    {
        hasNext = true;
        unsuccessfulRequestInfos = new ArrayList();
        contentId = 0;
        boundary = s;
        requestInfos = list;
        retryAllowed = flag;
        inputStream = inputstream;
        checkForFinalBoundary(readLine());
    }

    private void checkForFinalBoundary(String s)
        throws IOException
    {
        if (s.equals(String.valueOf(boundary).concat("--")))
        {
            hasNext = false;
            inputStream.close();
        }
    }

    private HttpResponse getFakeResponse(int i, InputStream inputstream, List list, List list1)
        throws IOException
    {
        inputstream = (new FakeResponseHttpTransport(i, inputstream, list, list1)).createRequestFactory().buildPostRequest(new GenericUrl("http://google.com/"), null);
        inputstream.setLoggingEnabled(false);
        inputstream.setThrowExceptionOnExecuteError(false);
        return inputstream.execute();
    }

    private Object getParsedDataClass(Class class1, HttpResponse httpresponse, BatchRequest.RequestInfo requestinfo)
        throws IOException
    {
        if (class1 == java/lang/Void)
        {
            return null;
        } else
        {
            return requestinfo.request.getParser().parseAndClose(httpresponse.getContent(), httpresponse.getContentCharset(), class1);
        }
    }

    private void parseAndCallback(BatchRequest.RequestInfo requestinfo, int i, HttpResponse httpresponse)
        throws IOException
    {
        BatchCallback batchcallback;
        com.google.api.client.http.HttpHeaders httpheaders;
        HttpUnsuccessfulResponseHandler httpunsuccessfulresponsehandler;
        BackOffPolicy backoffpolicy;
        batchcallback = requestinfo.callback;
        httpheaders = httpresponse.getHeaders();
        httpunsuccessfulresponsehandler = requestinfo.request.getUnsuccessfulResponseHandler();
        backoffpolicy = requestinfo.request.getBackOffPolicy();
        backOffRequired = false;
        if (!HttpStatusCodes.isSuccess(i)) goto _L2; else goto _L1
_L1:
        if (batchcallback != null) goto _L4; else goto _L3
_L3:
        return;
_L4:
        batchcallback.onSuccess(getParsedDataClass(requestinfo.dataClass, httpresponse, requestinfo), httpheaders);
        return;
_L2:
        boolean flag;
        boolean flag1;
        HttpContent httpcontent = requestinfo.request.getContent();
        boolean flag2;
        if (retryAllowed && (httpcontent == null || httpcontent.retrySupported()))
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        flag2 = false;
        flag = false;
        if (httpunsuccessfulresponsehandler != null)
        {
            flag2 = httpunsuccessfulresponsehandler.handleResponse(requestinfo.request, httpresponse, flag1);
        }
        i = ((flag) ? 1 : 0);
        if (flag2) goto _L6; else goto _L5
_L5:
        if (!requestinfo.request.handleRedirect(httpresponse.getStatusCode(), httpresponse.getHeaders())) goto _L8; else goto _L7
_L7:
        i = 1;
_L6:
        if (flag1 && (flag2 || backOffRequired || i != 0))
        {
            unsuccessfulRequestInfos.add(requestinfo);
            return;
        }
        break; /* Loop/switch isn't completed */
_L8:
        i = ((flag) ? 1 : 0);
        if (flag1)
        {
            i = ((flag) ? 1 : 0);
            if (backoffpolicy != null)
            {
                i = ((flag) ? 1 : 0);
                if (backoffpolicy.isBackOffRequired(httpresponse.getStatusCode()))
                {
                    backOffRequired = true;
                    i = ((flag) ? 1 : 0);
                }
            }
        }
        if (true) goto _L6; else goto _L9
_L9:
        if (batchcallback == null) goto _L3; else goto _L10
_L10:
        batchcallback.onFailure(getParsedDataClass(requestinfo.errorClass, httpresponse, requestinfo), httpheaders);
        return;
    }

    private String readLine()
        throws IOException
    {
        return trimCrlf(readRawLine());
    }

    private String readRawLine()
        throws IOException
    {
        int i = inputStream.read();
        if (i == -1)
        {
            return null;
        }
        StringBuilder stringbuilder = new StringBuilder();
        do
        {
label0:
            {
                if (i != -1)
                {
                    stringbuilder.append((char)i);
                    if (i != 10)
                    {
                        break label0;
                    }
                }
                return stringbuilder.toString();
            }
            i = inputStream.read();
        } while (true);
    }

    private static InputStream trimCrlf(byte abyte0[])
    {
        int j = abyte0.length;
        int i = j;
        if (j > 0)
        {
            i = j;
            if (abyte0[j - 1] == 10)
            {
                i = j - 1;
            }
        }
        j = i;
        if (i > 0)
        {
            j = i;
            if (abyte0[i - 1] == 13)
            {
                j = i - 1;
            }
        }
        return new ByteArrayInputStream(abyte0, 0, j);
    }

    private static String trimCrlf(String s)
    {
        String s1;
        if (s.endsWith("\r\n"))
        {
            s1 = s.substring(0, s.length() - 2);
        } else
        {
            s1 = s;
            if (s.endsWith("\n"))
            {
                return s.substring(0, s.length() - 1);
            }
        }
        return s1;
    }

    void parseNextResponse()
        throws IOException
    {
        contentId = contentId + 1;
        String s;
        do
        {
            s = readLine();
        } while (s != null && !s.equals(""));
        int i = Integer.parseInt(readLine().split(" ")[1]);
        Object obj1 = new ArrayList();
        ArrayList arraylist = new ArrayList();
        long l = -1L;
        do
        {
            s = readLine();
            if (s == null || s.equals(""))
            {
                break;
            }
            String as[] = s.split(": ", 2);
            s = as[0];
            String s1 = as[1];
            ((List) (obj1)).add(s);
            arraylist.add(s1);
            if ("Content-Length".equalsIgnoreCase(s.trim()))
            {
                l = Long.parseLong(s1);
            }
        } while (true);
        Object obj;
        if (l == -1L)
        {
            obj = new ByteArrayOutputStream();
            do
            {
                s = readRawLine();
                if (s == null || s.startsWith(boundary))
                {
                    break;
                }
                ((ByteArrayOutputStream) (obj)).write(s.getBytes("ISO-8859-1"));
            } while (true);
            obj = trimCrlf(((ByteArrayOutputStream) (obj)).toByteArray());
            s = trimCrlf(s);
        } else
        {
            obj = new FilterInputStream(ByteStreams.limit(inputStream, l)) {

                final BatchUnparsedResponse this$0;

                public void close()
                {
                }

            
            {
                this$0 = BatchUnparsedResponse.this;
                super(inputstream);
            }
            };
        }
        obj1 = getFakeResponse(i, ((InputStream) (obj)), ((List) (obj1)), arraylist);
        parseAndCallback((BatchRequest.RequestInfo)requestInfos.get(contentId - 1), i, ((HttpResponse) (obj1)));
        while (((InputStream) (obj)).skip(l) > 0L || ((InputStream) (obj)).read() != -1) ;
        if (l != -1L)
        {
            s = readLine();
        }
        for (; s != null && s.length() == 0; s = readLine()) { }
        checkForFinalBoundary(s);
    }
}
