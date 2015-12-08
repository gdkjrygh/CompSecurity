// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.api.client.googleapis.batch;

import com.google.api.client.http.HttpTransport;
import com.google.api.client.http.LowLevelHttpRequest;
import java.io.InputStream;
import java.util.List;

// Referenced classes of package com.google.api.client.googleapis.batch:
//            BatchUnparsedResponse

private static class headerValues extends HttpTransport
{

    private List headerNames;
    private List headerValues;
    private InputStream partContent;
    private int statusCode;

    protected LowLevelHttpRequest buildRequest(String s, String s1)
    {
        return new nit>(partContent, statusCode, headerNames, headerValues);
    }

    (int i, InputStream inputstream, List list, List list1)
    {
        statusCode = i;
        partContent = inputstream;
        headerNames = list;
        headerValues = list1;
    }
}
