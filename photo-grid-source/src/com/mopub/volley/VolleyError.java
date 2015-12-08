// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mopub.volley;


// Referenced classes of package com.mopub.volley:
//            NetworkResponse

public class VolleyError extends Exception
{

    private long a;
    public final NetworkResponse networkResponse;

    public VolleyError()
    {
        networkResponse = null;
    }

    public VolleyError(NetworkResponse networkresponse)
    {
        networkResponse = networkresponse;
    }

    public VolleyError(String s)
    {
        super(s);
        networkResponse = null;
    }

    public VolleyError(String s, Throwable throwable)
    {
        super(s, throwable);
        networkResponse = null;
    }

    public VolleyError(Throwable throwable)
    {
        super(throwable);
        networkResponse = null;
    }

    final void a(long l)
    {
        a = l;
    }

    public long getNetworkTimeMs()
    {
        return a;
    }
}
