// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.android.volley;


// Referenced classes of package com.android.volley:
//            VolleyError, NetworkResponse

public class ServerError extends VolleyError
{

    public ServerError()
    {
    }

    public ServerError(NetworkResponse networkresponse)
    {
        super(networkresponse);
    }
}
