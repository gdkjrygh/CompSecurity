// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.uploader.client;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

// Referenced classes of package com.google.uploader.client:
//            HttpUrlConnectionHttpClient

static final class 
{

    public static HttpURLConnection createConnection(String s)
        throws IOException
    {
        return (HttpURLConnection)(new URL(s)).openConnection();
    }

    ()
    {
    }
}
