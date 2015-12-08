// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.api.client.http;

import com.google.api.client.util.Charsets;
import com.google.api.client.util.IOUtils;
import com.google.api.client.util.LoggingInputStream;
import com.google.api.client.util.ObjectParser;
import com.google.api.client.util.Preconditions;
import com.google.api.client.util.StringUtils;
import java.io.ByteArrayOutputStream;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.reflect.Type;
import java.nio.charset.Charset;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.zip.GZIPInputStream;

// Referenced classes of package com.google.api.client.http:
//            HttpRequest, LowLevelHttpResponse, HttpTransport, HttpHeaders, 
//            HttpMediaType, HttpStatusCodes

public final class HttpResponse
{

    private InputStream content;
    private final String contentEncoding;
    private int contentLoggingLimit;
    private boolean contentRead;
    private final String contentType;
    private boolean loggingEnabled;
    private final HttpMediaType mediaType;
    private final HttpRequest request;
    LowLevelHttpResponse response;
    private final int statusCode;
    private final String statusMessage;

    HttpResponse(HttpRequest httprequest, LowLevelHttpResponse lowlevelhttpresponse)
        throws IOException
    {
        StringBuilder stringbuilder;
        Object obj;
        Object obj1 = null;
        super();
        request = httprequest;
        contentLoggingLimit = httprequest.getContentLoggingLimit();
        loggingEnabled = httprequest.isLoggingEnabled();
        response = lowlevelhttpresponse;
        contentEncoding = lowlevelhttpresponse.getContentEncoding();
        int j = lowlevelhttpresponse.getStatusCode();
        int i = j;
        if (j < 0)
        {
            i = 0;
        }
        statusCode = i;
        obj = lowlevelhttpresponse.getReasonPhrase();
        statusMessage = ((String) (obj));
        Logger logger = HttpTransport.LOGGER;
        Object obj2;
        boolean flag;
        if (loggingEnabled && logger.isLoggable(Level.CONFIG))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        stringbuilder = null;
        if (!flag) goto _L2; else goto _L1
_L1:
        stringbuilder = new StringBuilder();
        stringbuilder.append("-------------- RESPONSE --------------").append(StringUtils.LINE_SEPARATOR);
        obj2 = lowlevelhttpresponse.getStatusLine();
        if (obj2 == null) goto _L4; else goto _L3
_L3:
        stringbuilder.append(((String) (obj2)));
_L6:
        stringbuilder.append(StringUtils.LINE_SEPARATOR);
_L2:
        obj2 = httprequest.getResponseHeaders();
        if (flag)
        {
            obj = stringbuilder;
        } else
        {
            obj = null;
        }
        ((HttpHeaders) (obj2)).fromHttpResponse(lowlevelhttpresponse, ((StringBuilder) (obj)));
        obj = lowlevelhttpresponse.getContentType();
        lowlevelhttpresponse = ((LowLevelHttpResponse) (obj));
        if (obj == null)
        {
            lowlevelhttpresponse = httprequest.getResponseHeaders().getContentType();
        }
        contentType = lowlevelhttpresponse;
        if (lowlevelhttpresponse == null)
        {
            httprequest = obj1;
        } else
        {
            httprequest = new HttpMediaType(lowlevelhttpresponse);
        }
        mediaType = httprequest;
        if (flag)
        {
            logger.config(stringbuilder.toString());
        }
        return;
_L4:
        stringbuilder.append(statusCode);
        if (obj != null)
        {
            stringbuilder.append(' ').append(((String) (obj)));
        }
        if (true) goto _L6; else goto _L5
_L5:
    }

    private boolean hasMessageBody()
        throws IOException
    {
        boolean flag = true;
        int i = getStatusCode();
        if (getRequest().getRequestMethod().equals("HEAD") || i / 100 == 1 || i == 204 || i == 304)
        {
            ignore();
            flag = false;
        }
        return flag;
    }

    public void disconnect()
        throws IOException
    {
        ignore();
        response.disconnect();
    }

    public void download(OutputStream outputstream)
        throws IOException
    {
        IOUtils.copy(getContent(), outputstream);
    }

    public InputStream getContent()
        throws IOException
    {
        if (contentRead) goto _L2; else goto _L1
_L1:
        Object obj;
        Object obj1;
        Object obj2;
        obj = response.getContent();
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_118;
        }
        obj2 = obj;
        obj1 = obj;
        String s = contentEncoding;
        if (s == null)
        {
            break MISSING_BLOCK_LABEL_61;
        }
        obj2 = obj;
        obj1 = obj;
        if (!s.contains("gzip"))
        {
            break MISSING_BLOCK_LABEL_61;
        }
        obj2 = obj;
        obj1 = obj;
        obj = new GZIPInputStream(((InputStream) (obj)));
        obj1 = HttpTransport.LOGGER;
        if (!loggingEnabled || !((Logger) (obj1)).isLoggable(Level.CONFIG))
        {
            break MISSING_BLOCK_LABEL_101;
        }
        obj1 = new LoggingInputStream(((InputStream) (obj)), ((Logger) (obj1)), Level.CONFIG, contentLoggingLimit);
        obj = obj1;
        obj2 = obj;
        obj1 = obj;
        content = ((InputStream) (obj));
        if (false)
        {
            ((InputStream) (obj)).close();
        }
_L4:
        contentRead = true;
_L2:
        return content;
        obj;
_L7:
        if (true)
        {
            ((InputStream) (obj2)).close();
        }
        if (true) goto _L4; else goto _L3
_L3:
        obj;
_L6:
        if (true)
        {
            ((InputStream) (obj1)).close();
        }
        throw obj;
        obj2;
        obj1 = obj;
        obj = obj2;
        if (true) goto _L6; else goto _L5
_L5:
        EOFException eofexception;
        eofexception;
        obj2 = obj;
          goto _L7
    }

    public Charset getContentCharset()
    {
        if (mediaType == null || mediaType.getCharsetParameter() == null)
        {
            return Charsets.ISO_8859_1;
        } else
        {
            return mediaType.getCharsetParameter();
        }
    }

    public String getContentEncoding()
    {
        return contentEncoding;
    }

    public int getContentLoggingLimit()
    {
        return contentLoggingLimit;
    }

    public String getContentType()
    {
        return contentType;
    }

    public HttpHeaders getHeaders()
    {
        return request.getResponseHeaders();
    }

    public HttpMediaType getMediaType()
    {
        return mediaType;
    }

    public HttpRequest getRequest()
    {
        return request;
    }

    public int getStatusCode()
    {
        return statusCode;
    }

    public String getStatusMessage()
    {
        return statusMessage;
    }

    public HttpTransport getTransport()
    {
        return request.getTransport();
    }

    public void ignore()
        throws IOException
    {
        InputStream inputstream = getContent();
        if (inputstream != null)
        {
            inputstream.close();
        }
    }

    public boolean isLoggingEnabled()
    {
        return loggingEnabled;
    }

    public boolean isSuccessStatusCode()
    {
        return HttpStatusCodes.isSuccess(statusCode);
    }

    public Object parseAs(Class class1)
        throws IOException
    {
        if (!hasMessageBody())
        {
            return null;
        } else
        {
            return request.getParser().parseAndClose(getContent(), getContentCharset(), class1);
        }
    }

    public Object parseAs(Type type)
        throws IOException
    {
        if (!hasMessageBody())
        {
            return null;
        } else
        {
            return request.getParser().parseAndClose(getContent(), getContentCharset(), type);
        }
    }

    public String parseAsString()
        throws IOException
    {
        InputStream inputstream = getContent();
        if (inputstream == null)
        {
            return "";
        } else
        {
            ByteArrayOutputStream bytearrayoutputstream = new ByteArrayOutputStream();
            IOUtils.copy(inputstream, bytearrayoutputstream);
            return bytearrayoutputstream.toString(getContentCharset().name());
        }
    }

    public HttpResponse setContentLoggingLimit(int i)
    {
        boolean flag;
        if (i >= 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkArgument(flag, "The content logging limit must be non-negative.");
        contentLoggingLimit = i;
        return this;
    }

    public HttpResponse setLoggingEnabled(boolean flag)
    {
        loggingEnabled = flag;
        return this;
    }
}
