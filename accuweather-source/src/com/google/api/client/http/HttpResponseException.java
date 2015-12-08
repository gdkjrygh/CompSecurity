// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.api.client.http;

import com.google.api.client.util.Preconditions;
import com.google.api.client.util.StringUtils;
import java.io.IOException;

// Referenced classes of package com.google.api.client.http:
//            HttpResponse, HttpStatusCodes, HttpHeaders

public class HttpResponseException extends IOException
{
    public static class Builder
    {

        String content;
        HttpHeaders headers;
        String message;
        int statusCode;
        String statusMessage;

        public HttpResponseException build()
        {
            return new HttpResponseException(this);
        }

        public final String getContent()
        {
            return content;
        }

        public HttpHeaders getHeaders()
        {
            return headers;
        }

        public final String getMessage()
        {
            return message;
        }

        public final int getStatusCode()
        {
            return statusCode;
        }

        public final String getStatusMessage()
        {
            return statusMessage;
        }

        public Builder setContent(String s)
        {
            content = s;
            return this;
        }

        public Builder setHeaders(HttpHeaders httpheaders)
        {
            headers = (HttpHeaders)Preconditions.checkNotNull(httpheaders);
            return this;
        }

        public Builder setMessage(String s)
        {
            message = s;
            return this;
        }

        public Builder setStatusCode(int i)
        {
            boolean flag;
            if (i >= 0)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            Preconditions.checkArgument(flag);
            statusCode = i;
            return this;
        }

        public Builder setStatusMessage(String s)
        {
            statusMessage = s;
            return this;
        }

        public Builder(int i, String s, HttpHeaders httpheaders)
        {
            setStatusCode(i);
            setStatusMessage(s);
            setHeaders(httpheaders);
        }

        public Builder(HttpResponse httpresponse)
        {
            this(httpresponse.getStatusCode(), httpresponse.getStatusMessage(), httpresponse.getHeaders());
            try
            {
                content = httpresponse.parseAsString();
                if (content.length() == 0)
                {
                    content = null;
                }
            }
            catch (IOException ioexception)
            {
                ioexception.printStackTrace();
            }
            httpresponse = HttpResponseException.computeMessageBuffer(httpresponse);
            if (content != null)
            {
                httpresponse.append(StringUtils.LINE_SEPARATOR).append(content);
            }
            message = httpresponse.toString();
        }
    }


    private static final long serialVersionUID = 0xe5f7c02544cd5c85L;
    private final String content;
    private final transient HttpHeaders headers;
    private final int statusCode;
    private final String statusMessage;

    public HttpResponseException(HttpResponse httpresponse)
    {
        this(new Builder(httpresponse));
    }

    protected HttpResponseException(Builder builder)
    {
        super(builder.message);
        statusCode = builder.statusCode;
        statusMessage = builder.statusMessage;
        headers = builder.headers;
        content = builder.content;
    }

    public static StringBuilder computeMessageBuffer(HttpResponse httpresponse)
    {
        StringBuilder stringbuilder = new StringBuilder();
        int i = httpresponse.getStatusCode();
        if (i != 0)
        {
            stringbuilder.append(i);
        }
        httpresponse = httpresponse.getStatusMessage();
        if (httpresponse != null)
        {
            if (i != 0)
            {
                stringbuilder.append(' ');
            }
            stringbuilder.append(httpresponse);
        }
        return stringbuilder;
    }

    public final String getContent()
    {
        return content;
    }

    public HttpHeaders getHeaders()
    {
        return headers;
    }

    public final int getStatusCode()
    {
        return statusCode;
    }

    public final String getStatusMessage()
    {
        return statusMessage;
    }

    public final boolean isSuccessStatusCode()
    {
        return HttpStatusCodes.isSuccess(statusCode);
    }
}
