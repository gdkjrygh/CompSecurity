// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.api.client.googleapis.batch;

import com.google.api.client.http.LowLevelHttpRequest;
import com.google.api.client.http.LowLevelHttpResponse;
import java.io.InputStream;
import java.util.List;

// Referenced classes of package com.google.api.client.googleapis.batch:
//            BatchUnparsedResponse

private static class headerValues extends LowLevelHttpRequest
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
        return new (partContent, statusCode, headerNames, headerValues);
    }

    (InputStream inputstream, int i, List list, List list1)
    {
        partContent = inputstream;
        statusCode = i;
        headerNames = list;
        headerValues = list1;
    }
}
