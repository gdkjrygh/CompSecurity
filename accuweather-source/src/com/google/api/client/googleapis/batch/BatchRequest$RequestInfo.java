// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.api.client.googleapis.batch;

import com.google.api.client.http.HttpRequest;

// Referenced classes of package com.google.api.client.googleapis.batch:
//            BatchRequest, BatchCallback

static class request
{

    final BatchCallback callback;
    final Class dataClass;
    final Class errorClass;
    final HttpRequest request;

    (BatchCallback batchcallback, Class class1, Class class2, HttpRequest httprequest)
    {
        callback = batchcallback;
        dataClass = class1;
        errorClass = class2;
        request = httprequest;
    }
}
