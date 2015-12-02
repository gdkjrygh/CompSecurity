// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.android.volley;


// Referenced classes of package com.android.volley:
//            i

public class VolleyError extends Exception
{

    public final i networkResponse;

    public VolleyError()
    {
        networkResponse = null;
    }

    public VolleyError(i i)
    {
        networkResponse = i;
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
}
