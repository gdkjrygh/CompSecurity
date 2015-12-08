// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mopub.volley;


// Referenced classes of package com.mopub.volley:
//            VolleyError, NetworkResponse

public class NetworkError extends VolleyError
{

    public NetworkError()
    {
    }

    public NetworkError(NetworkResponse networkresponse)
    {
        super(networkresponse);
    }

    public NetworkError(Throwable throwable)
    {
        super(throwable);
    }
}
