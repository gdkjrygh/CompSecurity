// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.android.agoo.net.async;

import java.util.HashMap;
import java.util.Map;

// Referenced classes of package org.android.agoo.net.async:
//            AsyncHttpResponseHandler

class <init>
{

    String body;
    Map headers;
    int statusCode;
    String statusReasonPhrase;
    final AsyncHttpResponseHandler this$0;

    private ()
    {
        this$0 = AsyncHttpResponseHandler.this;
        super();
        statusCode = -1;
        statusReasonPhrase = "";
        headers = new HashMap();
        body = "";
    }

    body(body body1)
    {
        this();
    }
}
