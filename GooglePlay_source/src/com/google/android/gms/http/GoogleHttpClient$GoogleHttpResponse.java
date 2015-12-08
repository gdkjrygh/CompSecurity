// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.http;

import java.net.HttpURLConnection;
import org.apache.http.HttpVersion;
import org.apache.http.StatusLine;
import org.apache.http.message.BasicHttpResponse;
import org.apache.http.message.BasicStatusLine;

// Referenced classes of package com.google.android.gms.http:
//            GoogleHttpClient

static final class DEFAULT_STATUS extends BasicHttpResponse
{

    private static final StatusLine DEFAULT_STATUS;
    HttpURLConnection httpURLConnection;

    static 
    {
        DEFAULT_STATUS = new BasicStatusLine(HttpVersion.HTTP_1_1, 500, "Unknown error");
    }

    ()
    {
        super(DEFAULT_STATUS, null, null);
    }
}
