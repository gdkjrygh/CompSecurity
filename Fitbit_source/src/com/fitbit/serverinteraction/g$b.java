// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.serverinteraction;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

// Referenced classes of package com.fitbit.serverinteraction:
//            g

static abstract class 
{

    public HttpURLConnection a(String s)
        throws MalformedURLException, IOException
    {
        return a(new URL(s));
    }

    public abstract HttpURLConnection a(URL url)
        throws IOException;

    ()
    {
    }
}
