// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.net.HttpURLConnection;
import java.net.URL;

class any
{

    any()
    {
    }

    public HttpURLConnection a(URL url)
    {
        return (HttpURLConnection)url.openConnection();
    }
}
