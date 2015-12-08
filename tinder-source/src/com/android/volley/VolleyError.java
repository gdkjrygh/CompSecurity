// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.android.volley;


// Referenced classes of package com.android.volley:
//            NetworkResponse

public class VolleyError extends Exception
{

    public final NetworkResponse a;
    long b;

    public VolleyError()
    {
        a = null;
    }

    public VolleyError(NetworkResponse networkresponse)
    {
        a = networkresponse;
    }

    public VolleyError(String s)
    {
        super(s);
        a = null;
    }

    public VolleyError(Throwable throwable)
    {
        super(throwable);
        a = null;
    }
}
