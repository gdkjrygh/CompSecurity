// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.io.BufferedInputStream;
import java.io.InputStream;
import java.net.HttpURLConnection;

final class aql extends BufferedInputStream
{

    private HttpURLConnection a;

    aql(InputStream inputstream, HttpURLConnection httpurlconnection)
    {
        super(inputstream, 8192);
        a = httpurlconnection;
    }

    public final void close()
    {
        super.close();
        arp.a(a);
    }
}
