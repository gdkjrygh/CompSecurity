// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.api.client.googleapis.batch;

import com.google.api.client.http.LowLevelHttpResponse;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.google.api.client.googleapis.batch:
//            BatchUnparsedResponse

private static class headerValues extends LowLevelHttpResponse
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

    (InputStream inputstream, int i, List list, List list1)
    {
        headerNames = new ArrayList();
        headerValues = new ArrayList();
        partContent = inputstream;
        statusCode = i;
        headerNames = list;
        headerValues = list1;
    }
}
