// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.api.client.testing.http;

import com.google.api.client.http.HttpMediaType;
import com.google.api.client.http.LowLevelHttpRequest;
import com.google.api.client.http.LowLevelHttpResponse;
import com.google.api.client.util.Charsets;
import com.google.api.client.util.IOUtils;
import com.google.api.client.util.StreamingContent;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.zip.GZIPInputStream;

// Referenced classes of package com.google.api.client.testing.http:
//            MockLowLevelHttpResponse

public class MockLowLevelHttpRequest extends LowLevelHttpRequest
{

    private final Map headersMap;
    private MockLowLevelHttpResponse response;
    private String url;

    public MockLowLevelHttpRequest()
    {
        headersMap = new HashMap();
        response = new MockLowLevelHttpResponse();
    }

    public MockLowLevelHttpRequest(String s)
    {
        headersMap = new HashMap();
        response = new MockLowLevelHttpResponse();
        url = s;
    }

    public void addHeader(String s, String s1)
        throws IOException
    {
        String s2 = s.toLowerCase();
        List list = (List)headersMap.get(s2);
        s = list;
        if (list == null)
        {
            s = new ArrayList();
            headersMap.put(s2, s);
        }
        s.add(s1);
    }

    public LowLevelHttpResponse execute()
        throws IOException
    {
        return response;
    }

    public String getContentAsString()
        throws IOException
    {
        if (getStreamingContent() == null)
        {
            return "";
        }
        Object obj = new ByteArrayOutputStream();
        getStreamingContent().writeTo(((java.io.OutputStream) (obj)));
        String s = getContentEncoding();
        ByteArrayOutputStream bytearrayoutputstream = ((ByteArrayOutputStream) (obj));
        if (s != null)
        {
            bytearrayoutputstream = ((ByteArrayOutputStream) (obj));
            if (s.contains("gzip"))
            {
                obj = new GZIPInputStream(new ByteArrayInputStream(((ByteArrayOutputStream) (obj)).toByteArray()));
                bytearrayoutputstream = new ByteArrayOutputStream();
                IOUtils.copy(((java.io.InputStream) (obj)), bytearrayoutputstream);
            }
        }
        obj = getContentType();
        if (obj != null)
        {
            obj = new HttpMediaType(((String) (obj)));
        } else
        {
            obj = null;
        }
        if (obj == null || ((HttpMediaType) (obj)).getCharsetParameter() == null)
        {
            obj = Charsets.ISO_8859_1;
        } else
        {
            obj = ((HttpMediaType) (obj)).getCharsetParameter();
        }
        return bytearrayoutputstream.toString(((Charset) (obj)).name());
    }

    public String getFirstHeaderValue(String s)
    {
        s = (List)headersMap.get(s.toLowerCase());
        if (s == null)
        {
            return null;
        } else
        {
            return (String)s.get(0);
        }
    }

    public List getHeaderValues(String s)
    {
        s = (List)headersMap.get(s.toLowerCase());
        if (s == null)
        {
            return Collections.emptyList();
        } else
        {
            return Collections.unmodifiableList(s);
        }
    }

    public Map getHeaders()
    {
        return Collections.unmodifiableMap(headersMap);
    }

    public MockLowLevelHttpResponse getResponse()
    {
        return response;
    }

    public String getUrl()
    {
        return url;
    }

    public MockLowLevelHttpRequest setResponse(MockLowLevelHttpResponse mocklowlevelhttpresponse)
    {
        response = mocklowlevelhttpresponse;
        return this;
    }

    public MockLowLevelHttpRequest setUrl(String s)
    {
        url = s;
        return this;
    }
}
